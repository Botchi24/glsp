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
package org.eclipse.glsp.example.javaemf;

import org.eclipse.glsp.example.javaemf.handler.CreateNormalStateNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateFinalStateNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateTransitionEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteNodeHandler;
import org.eclipse.glsp.example.javaemf.model.StatemachineGModelFactory;
import org.eclipse.glsp.example.javaemf.model.StatemachineSourceModelStorage;
import org.eclipse.glsp.example.javaemf.palette.StatemachineToolPaletteItemProvider;
import org.eclipse.glsp.server.di.MultiBinding;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.EMFSourceModelStorage;
import org.eclipse.glsp.server.emf.idgen.FragmentIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationDiagramModule;
import org.eclipse.glsp.server.features.core.model.GModelFactory;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.operations.OperationHandler;

public class StatemachineDiagramModule extends EMFNotationDiagramModule {

   @Override
   protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
      // define what operations are allowed with our elements
      return StatemachineDiagramConfiguration.class;
   }

   @Override
   protected Class<? extends EMFSourceModelStorage> bindSourceModelStorage() {
      // ensure our custom package is registered when loading our models
      return StatemachineSourceModelStorage.class;
   }

   @Override
   public Class<? extends GModelFactory> bindGModelFactory() {
      // custom factory to convert tasks into nodes
      return StatemachineGModelFactory.class;
   }

   @Override
   protected Class<? extends EMFIdGenerator> bindEMFIdGenerator() {
      // all our elements inherit from Identifiable and have an ID attribute set
      return FragmentIdGenerator.class;
   }

   @Override
   protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
      return StatemachineToolPaletteItemProvider.class;
   }

   @Override
   protected void configureOperationHandlers(final MultiBinding<OperationHandler<?>> binding) {
      super.configureOperationHandlers(binding);
      binding.add(CreateNormalStateNodeHandler.class);
      binding.add(CreateFinalStateNodeHandler.class);
      binding.add(CreateTransitionEdgeHandler.class);
      binding.add(DeleteNodeHandler.class);
   }

   @Override
   public String getDiagramType() { return "statemachine-diagram"; }

}