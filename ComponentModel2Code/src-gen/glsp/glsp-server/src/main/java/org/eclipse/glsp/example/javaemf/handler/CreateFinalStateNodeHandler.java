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

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.StatemachineModelTypes;
import swt.most.statemachine.StatemachineFactory;
import swt.most.statemachine.StatemachinePackage;
import swt.most.statemachine.FinalState;
import swt.most.statemachine.StateMachine;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.graph.util.GraphUtil;
import org.eclipse.glsp.server.emf.EMFCreateOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.model.notation.NotationFactory;
import org.eclipse.glsp.server.emf.model.notation.NotationPackage;
import org.eclipse.glsp.server.emf.model.notation.SemanticElementReference;
import org.eclipse.glsp.server.emf.model.notation.Shape;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateNodeOperation;
import org.eclipse.glsp.server.utils.LayoutUtil;

import com.google.inject.Inject;

public class CreateFinalStateNodeHandler extends EMFCreateOperationHandler<CreateNodeOperation> {

   @Inject
   protected EMFNotationModelState modelState;

   @Inject
   protected EMFIdGenerator idGenerator;

   public CreateFinalStateNodeHandler() {
      super(StatemachineModelTypes.FINALSTATE);
   }

   @Override
   public Optional<Command> createCommand(final CreateNodeOperation operation) {
      GModelElement container = modelState.getIndex().get(operation.getContainerId()).orElseGet(modelState::getRoot);
      Optional<GPoint> absoluteLocation = operation.getLocation();
      Optional<GPoint> relativeLocation = absoluteLocation.map(location->LayoutUtil.getRelativeLocation(location, container));

      return Optional.of(createFinalStateAndShape(relativeLocation));
   }

   @Override
   public String getLabel() { return "FinalState"; }

   protected Command createFinalStateAndShape(final Optional<GPoint> relativeLocation) {
      StateMachine stateMachine = modelState.getSemanticModel(StateMachine.class).orElseThrow();
      Diagram diagram = modelState.getNotationModel();
      EditingDomain editingDomain = modelState.getEditingDomain();

      FinalState newFinalState = createFinalState();
      Command finalStateCommand = AddCommand.create(editingDomain, stateMachine,
         StatemachinePackage.Literals.STATE_MACHINE__FINALSTATES, newFinalState);

      Shape shape = createShape(idGenerator.getOrCreateId(newFinalState), relativeLocation);
      Command shapeCommand = AddCommand.create(editingDomain, diagram,
         NotationPackage.Literals.DIAGRAM__ELEMENTS, shape);

      CompoundCommand compoundCommand = new CompoundCommand();
      compoundCommand.append(finalStateCommand);
      compoundCommand.append(shapeCommand);
      return compoundCommand;
   }

   protected FinalState createFinalState() {
      FinalState newFinalState = StatemachineFactory.eINSTANCE.createFinalState();
      //newFinalState.setId(UUID.randomUUID().toString());
      setInitialName(newFinalState);
      return newFinalState;
   }

   protected void setInitialName(final FinalState finalState) {
      Function<Integer, String> nameProvider = i -> "New" + finalState.eClass().getName() + i;
      int nodeCounter = modelState.getIndex().getCounter(StatemachinePackage.Literals.FINAL_STATE, nameProvider);
      finalState.setName(nameProvider.apply(nodeCounter));
   }

   protected Shape createShape(final String elementId, final Optional<GPoint> relativeLocation) {
      Shape newFinalState = NotationFactory.eINSTANCE.createShape();
      newFinalState.setPosition(relativeLocation.orElse(GraphUtil.point(0, 0)));
      newFinalState.setSize(GraphUtil.dimension(100, 60));
      SemanticElementReference reference = NotationFactory.eINSTANCE.createSemanticElementReference();
      reference.setElementId(elementId);
      newFinalState.setSemanticElement(reference);
      return newFinalState;
   }
}