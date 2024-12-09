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
package org.eclipse.glsp.example.javaemf.model;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.example.javaemf.StatemachineModelTypes;
import swt.most.statemachine.NormalState;
import swt.most.statemachine.FinalState;
import swt.most.statemachine.Transition;
import swt.most.statemachine.StateMachine;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.builder.impl.GEdgeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

public class StatemachineGModelFactory extends EMFNotationGModelFactory {

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
      StateMachine stateMachine = StateMachine.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);
      //if (notationModel.getSemanticElement() != null
         //&& notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
         stateMachine.getStates().stream()
            .map(this::createNormalStateNode)
            .forEachOrdered(graph.getChildren()::add);
         stateMachine.getFinalstates().stream()
            .map(this::createFinalStateNode)
            .forEachOrdered(graph.getChildren()::add);
         stateMachine.getTransitions().stream()
            .map(this::createTransitionEdge)
            .forEachOrdered(graph.getChildren()::add);
      //}
   }

   protected GNode createNormalStateNode(final NormalState normalState) {
      GNodeBuilder normalStateNodeBuilder = new GNodeBuilder(StatemachineModelTypes.NORMALSTATE)
         .id(idGenerator.getOrCreateId(normalState))
         .addCssClass("statemachine-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(idGenerator.getOrCreateId(normalState)).id(idGenerator.getOrCreateId(normalState) + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(normalState, normalStateNodeBuilder);
      return normalStateNodeBuilder.build();
   }
   
   protected GNode createFinalStateNode(final FinalState finalState) {
      GNodeBuilder finalStateNodeBuilder = new GNodeBuilder(StatemachineModelTypes.FINALSTATE)
         .id(idGenerator.getOrCreateId(finalState))
         .addCssClass("statemachine-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(idGenerator.getOrCreateId(finalState)).id(idGenerator.getOrCreateId(finalState) + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(finalState, finalStateNodeBuilder);
      return finalStateNodeBuilder.build();
   }
   
   
   protected GEdge createTransitionEdge(final Transition transition) {
      GEdgeBuilder transitionEdgeBuilder = new GEdgeBuilder(StatemachineModelTypes.TRANSITION)
          .id(idGenerator.getOrCreateId(transition))
          .addCssClass("statemachine-edge")
          .sourceId(idGenerator.getOrCreateId(transition.getFrom()))
          .targetId(idGenerator.getOrCreateId(transition.getTo()));
          
      applyEdgeData(transition, transitionEdgeBuilder);
      return transitionEdgeBuilder.build();
   }
   

}