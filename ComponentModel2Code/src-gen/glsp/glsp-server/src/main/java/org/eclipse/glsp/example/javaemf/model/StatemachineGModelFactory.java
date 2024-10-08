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
import swt.most.statemachine.InitialState;
import swt.most.statemachine.NormalState;
import swt.most.statemachine.FinalState;
import swt.most.statemachine.StateMachine;
import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GGraph;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GNodeBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.emf.notation.EMFNotationGModelFactory;

public class StatemachineGModelFactory extends EMFNotationGModelFactory {

   @Override
   protected void fillRootElement(final EObject semanticModel, final Diagram notationModel, final GModelRoot newRoot) {
      StateMachine stateMachine = StateMachine.class.cast(semanticModel);
      GGraph graph = GGraph.class.cast(newRoot);
      if (notationModel.getSemanticElement() != null
         && notationModel.getSemanticElement().getResolvedSemanticElement() != null) {
         stateMachine.getInitialstate().stream()
            .map(this::createInitialStateNode)
            .forEachOrdered(graph.getChildren()::add);
         stateMachine.getStates().stream()
            .map(this::createNormalStateNode)
            .forEachOrdered(graph.getChildren()::add);
         stateMachine.getFinalstates().stream()
            .map(this::createFinalStateNode)
            .forEachOrdered(graph.getChildren()::add);
      }
   }

   protected GNode createInitialStateNode(final InitialState initialState) {
      GNodeBuilder initialStateNodeBuilder = new GNodeBuilder(StatemachineModelTypes.INITIALSTATE)
         .id(idGenerator.getOrCreateId(initialState))
         .addCssClass("stateMachine-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(initialState.getName()).id(initialState.getId() + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(initialState, initialStateNodeBuilder);
      return initialStateNodeBuilder.build();
   }
   
   protected GNode createNormalStateNode(final NormalState normalState) {
      GNodeBuilder normalStateNodeBuilder = new GNodeBuilder(StatemachineModelTypes.NORMALSTATE)
         .id(idGenerator.getOrCreateId(normalState))
         .addCssClass("stateMachine-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(normalState.getName()).id(normalState.getId() + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(normalState, normalStateNodeBuilder);
      return normalStateNodeBuilder.build();
   }
   
   protected GNode createFinalStateNode(final FinalState finalState) {
      GNodeBuilder finalStateNodeBuilder = new GNodeBuilder(StatemachineModelTypes.FINALSTATE)
         .id(idGenerator.getOrCreateId(finalState))
         .addCssClass("stateMachine-node")
         .add(new GLabelBuilder(DefaultTypes.LABEL).text(finalState.getName()).id(finalState.getId() + "_label").build())
         .layout(GConstants.Layout.HBOX, Map.of(GLayoutOptions.KEY_PADDING_LEFT, 5));

      applyShapeData(finalState, finalStateNodeBuilder);
      return finalStateNodeBuilder.build();
   }
   

}