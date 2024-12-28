/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.glsp.example.javaemf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import java.util.stream.Collectors;
import com.google.inject.Inject;

import swt.most.statemachine.NormalState;
import swt.most.statemachine.FinalState;
import swt.most.statemachine.Transition;


public class StatemachineIdGenerator implements EMFIdGenerator {
	
	@Inject
	protected EMFNotationModelState modelState;
	
	@Override
	public String getOrCreateId(final EObject element) {
	
		if (element instanceof NormalState) {
			return ((NormalState)element).getName();
		}
		if (element instanceof FinalState) {
			return ((FinalState)element).getName();
		}
		if (element instanceof Transition) {
			return ((Transition)element).getFrom().getName() + "_" + ((Transition)element).getTo().getName() + "_" + modelState.getSemanticModel().eContents().stream().filter(obj -> obj instanceof Transition).collect(Collectors.toList()).indexOf(element);
		}
		return "";
	}
	
//	private String buildID(NormalState element){
//		return ((NormalState)element).getName();
//	}
//	
//	private String buildID(FinalState element){
//		return ((FinalState)element).getName();
//	}
//	
//	private String buildID(Transition element){
//		int order = modelState.getSemanticModel().eContents().stream()
//				.filter(obj -> obj instanceof Transition)
//				.collect(Collectors.toList())
//				.indexOf(element);
//		return ((Transition)element).getFrom().getName() + "_" + ((Transition)element).getTo().getName() + "_" + order;
//	}
}
