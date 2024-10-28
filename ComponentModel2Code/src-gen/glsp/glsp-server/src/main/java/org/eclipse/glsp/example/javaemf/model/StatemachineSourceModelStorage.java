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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.EObject;
import swt.most.statemachine.StatemachinePackage;
import org.eclipse.glsp.server.emf.notation.EMFNotationSourceModelStorage;
import org.eclipse.glsp.server.emf.model.notation.Diagram;
import org.eclipse.glsp.server.features.core.model.RequestModelAction;

public class StatemachineSourceModelStorage extends EMFNotationSourceModelStorage {
   @Override
   protected ResourceSet setupResourceSet(final ResourceSet resourceSet) {
      resourceSet.getPackageRegistry().put(StatemachinePackage.eINSTANCE.getNsURI(), StatemachinePackage.eINSTANCE);
      return super.setupResourceSet(resourceSet);
   }
   
   //@Override
   //protected void doLoadSourceModel(final ResourceSet resourceSet, final URI sourceURI,
                                    //final RequestModelAction action) {
      //loadSemanticModel(resourceSet, sourceURI, action);
      //modelState.setNotationModel(new Diagram()); //Diagram.cast(new EObject()));
   //}
}