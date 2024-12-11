/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied:
 * -- GNU General Public License, version 2 with the GNU Classpath Exception
 * which is available at https://www.gnu.org/software/classpath/license.html
 * -- MIT License which is available at https://opensource.org/license/mit.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.glsp.example.javaemf.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.server.emf.EMFOperationHandler;
import org.eclipse.glsp.server.emf.model.notation.NotationElement;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelIndex;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.NotationElement;
import org.eclipse.glsp.server.operations.DeleteOperation;
import swt.most.statemachine.StatemachinePackage;
import swt.most.statemachine.Transition;
import swt.most.statemachine.StateMachine;
import swt.most.statemachine.State;

import com.google.inject.Inject;

public class DeleteHandler extends EMFOperationHandler<DeleteOperation> {

   @Inject
   protected EMFNotationModelState modelState;
   
   @Inject
   protected EMFIdGenerator idGenerator;
   
   protected Set<String> alreadyDeletedEdges;

   @Override
   public Optional<Command> createCommand(final DeleteOperation operation) {
      List<String> elementIds = operation.getElementIds();
      if (elementIds == null || elementIds.size() == 0) {
         System.err.println("[DeleteNodeHandler] Elements to delete are not specified: elementIds = " + elementIds);
         return Optional.empty();
      }

      System.err.println("[DeleteNodeHandler] Starting deletion for elements: " + elementIds);
      
      List<Command> commands = createDeleteCommands(elementIds);
      if (commands.isEmpty()) {
          System.err.println("[DeleteNodeHandler] No commands created for the specified elements.");
      }
      
      return commands.isEmpty() ? Optional.empty() : Optional.of(new CompoundCommand(commands));
   }

   private List<Command> createDeleteCommands(final List<String> elementIds) {
      EMFNotationModelIndex index = modelState.getIndex();
      alreadyDeletedEdges = new HashSet<>();
      
      List<Command> commands = new ArrayList<>();
      for (String elementId : elementIds) {
         Optional<EObject> semanticElement = index.get(elementId).flatMap(e -> index.getEObject(e));
         Optional<NotationElement> notationElement = semanticElement.flatMap(e -> index.getNotation(e));
         if (semanticElement.isEmpty()) {
             System.err.println("[DeleteNodeHandler] Could not find semantic element for ID: " + elementId);
             System.err.println("[DeleteNodeHandler] Could not find semantic element for ID in index: " + index.get(elementId));
             semanticElement = modelState.getSemanticModel().eContents().stream()
                     //.filter(obj -> obj instanceof Transition)
                     .map(obj -> (EObject) obj)
                     .filter(obj -> idGenerator.getOrCreateId(obj).equals(elementId))
                     .findFirst();
         }
         semanticElement.map(this::createDependentRemoveCommand).ifPresent(commands::addAll);
         notationElement.map(this::createDependentRemoveCommand).ifPresent(commands::addAll);
      }
      return commands;
   }

   private List<Command> createDependentRemoveCommand(final EObject element) {
	  EObject semanticModel = modelState.getSemanticModel();
	  StateMachine stateMachine = StateMachine.class.cast(semanticModel);
	  EMFNotationModelIndex index = modelState.getIndex();
      EditingDomain editingDomain = modelState.getEditingDomain();
      List<Command> commands = new ArrayList<>();
      
      
      String elementClassName = element.eClass().getName();
      System.err.println("createDependentRemoveCommand: Processing element of class - " + elementClassName);
      
      if (element instanceof State state) {
    	  
    	  String stateId = idGenerator.getOrCreateId(state);
          System.err.println("Processing State with ID: " + stateId);
    	  
                   
          stateMachine.getTransitions().stream()
          .filter(edge -> edge.getFrom() == state || edge.getTo() == state)
          .collect(Collectors.toList())
    	  .forEach(
          edge -> {
              System.err.println("Removing Transition with ID(" + idGenerator.getOrCreateId(edge) + ") connected to State ID: " + stateId);
              commands.addAll(createRemoveEdgeCommand(edge));
          });
          
    	  //state.getOutArcs().forEach(arc -> commands.addAll(createRemoveEdgeCommand(arc)));
          //state.getInArcs().forEach(arc -> commands.addAll(createRemoveEdgeCommand(arc)));
      } else if (element instanceof Transition transition) {
    	  String transitionId = idGenerator.getOrCreateId(transition);
          System.err.println("Processing Transition with ID: " + transitionId);
    	  
          // remove out and in arcs
          commands.addAll(createRemoveEdgeCommand(transition));
          return commands;
      }
      
      String elementId = idGenerator.getOrCreateId(element);
      System.err.println("Removing element with ID: " + elementId);
      
      commands.add(
              RemoveCommand.create(editingDomain, element.eContainer(), element.eContainingFeature(), element)
      );

      return commands;
      
      //return RemoveCommand.create(editingDomain, element.eContainer(), element.eContainingFeature(), element);
   
   }
   
   protected List<Command> createRemoveEdgeCommand(Transition transition){
	      EditingDomain editingDomain = modelState.getEditingDomain();
	      List<Command> commands = new ArrayList<>();

	      String transitionId = idGenerator.getOrCreateId(transition);
	      System.err.println("createRemoveEdgeCommand - Transition ID to delete: " + transitionId);
	      //System.err.println("createRemoveEdgeCommand - EditingDomain: " + editingDomain.getCommandStack().toString());
	      
	      // prevents duplicate remove commands for arcs since they can also be removed as a consequence
	      // of removing their source/target node
	      if (alreadyDeletedEdges.contains(transitionId)) {
	    	 System.err.println("createRemoveEdgeCommand - Transition already deleted: " + transitionId);
	         return commands;
	      }

	      alreadyDeletedEdges.add(idGenerator.getOrCreateId(transition));

	      
//	      commands.add(
//	          RemoveCommand.create(editingDomain, transition,
//	        		  StatemachinePackage.Literals.TRANSITION__FROM, transition.getFrom())
//	      );
//	      commands.add(
//	          RemoveCommand.create(editingDomain, transition,
//	        		  StatemachinePackage.Literals.TRANSITION__TO, transition.getTo())
//	      );
	      commands.add(
	          RemoveCommand.create(editingDomain, transition.eContainer(), transition.eContainingFeature(), transition)
	      );

	      return commands;
	   }

}