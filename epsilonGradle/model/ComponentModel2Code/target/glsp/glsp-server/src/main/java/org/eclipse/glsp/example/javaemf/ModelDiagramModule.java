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

import org.eclipse.glsp.example.javaemf.handler.CreateTaskNodeHandler;
import org.eclipse.glsp.example.javaemf.handler.CreateTransitionEdgeHandler;
import org.eclipse.glsp.example.javaemf.handler.DeleteHandler;
import org.eclipse.glsp.example.javaemf.handler.ChangeRoutingPointsOperationHandler;
import org.eclipse.glsp.example.javaemf.labeledit.LabelEditOperationHandler;
import org.eclipse.glsp.example.javaemf.model.ModelGModelFactory;
import org.eclipse.glsp.example.javaemf.model.ModelSourceModelStorage;
import org.eclipse.glsp.example.javaemf.palette.ModelToolPaletteItemProvider;
import org.eclipse.glsp.server.di.MultiBinding;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.EMFSourceModelStorage;
import org.eclipse.glsp.server.emf.notation.EMFNotationDiagramModule;
import org.eclipse.glsp.server.features.core.model.GModelFactory;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.operations.OperationHandler;

public class ModelDiagramModule extends EMFNotationDiagramModule {

   @Override
   protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
      // define what operations are allowed with our elements
      return ModelDiagramConfiguration.class;
   }

   @Override
   protected Class<? extends EMFSourceModelStorage> bindSourceModelStorage() {
      // ensure our custom package is registered when loading our models
      return ModelSourceModelStorage.class;
   }

   @Override
   public Class<? extends GModelFactory> bindGModelFactory() {
      // custom factory to convert tasks into nodes
      return ModelGModelFactory.class;
   }

   @Override
   protected Class<? extends EMFIdGenerator> bindEMFIdGenerator() {
      // all our elements inherit from Identifiable and have an ID attribute set
      return ModelIdGenerator.class; //FragmentIdGenerator.class;
   }

   @Override
   protected Class<? extends ToolPaletteItemProvider> bindToolPaletteItemProvider() {
      return ModelToolPaletteItemProvider.class;
   }

   //@Override
   //protected Class<? extends LabelEditValidator> bindLabelEditValidator() {
   //   return StatemachineLabelEditValidator.class;
   //}

   @Override
   protected void configureOperationHandlers(final MultiBinding<OperationHandler<?>> binding) {
      super.configureOperationHandlers(binding);
      binding.add(ChangeRoutingPointsOperationHandler.class);
      binding.add(CreateTaskNodeHandler.class);
      binding.add(CreateTransitionEdgeHandler.class);
      binding.add(DeleteHandler.class);
      binding.add(LabelEditOperationHandler.class);
   }

   @Override
   public String getDiagramType() { return "model-diagram"; }

}