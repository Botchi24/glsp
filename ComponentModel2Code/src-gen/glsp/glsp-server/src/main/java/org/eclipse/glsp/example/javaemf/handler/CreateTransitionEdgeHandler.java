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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.example.javaemf.StatemachineModelTypes;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.emf.EMFCreateOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;
//import org.pnml.emf.ptnet.*;
import swt.most.statemachine.Transition;
import swt.most.statemachine.State;
import swt.most.statemachine.StatemachineFactory;
import swt.most.statemachine.StatemachinePackage;
import swt.most.statemachine.StateMachine;

import com.google.inject.Inject;


public class CreateTransitionEdgeHandler extends EMFCreateOperationHandler<CreateEdgeOperation> {

	@Inject
	protected EMFNotationModelState modelState;
	
    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateTransitionEdgeHandler() {
        super(StatemachineModelTypes.TRANSITION);
    }

    public CreateTransitionEdgeHandler(String type) {
        super(type);
    }


    @Override
    public String getLabel() { return "Transition"; }

    @Override
    public Optional<Command> createCommand(CreateEdgeOperation operation) {
        Transition newTransition = StatemachineFactory.eINSTANCE.createTransition();
        //newArc.setId(UUID.randomUUID().toString());
        //setInitialName(newTransition);

        //setType(newArc);

        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        State source = modelState.getIndex().getEObject(sourceId, State.class).orElseThrow();
        State target = modelState.getIndex().getEObject(targetId, State.class).orElseThrow();

        //Page page = (Page) (source.eContainer());

        return Optional.of(createTransition(newTransition, source, target));
    }

//    protected void setInitialName(final Transition transition) {
//        Function<Integer, String> nameProvider = i -> "New" + transition.eClass().getName() + i;
//        int edgeCounter = modelState.getIndex().getCounter(GraphPackage.Literals.GEDGE, nameProvider);
//        Name newName = PtnetFactory.eINSTANCE.createName();
//        newName.setText(nameProvider.apply(ArcCounter));
//        arc.setName(newName);
//    }

    protected Command createTransition(Transition newTransition, State source, State target) {
    	StateMachine stateMachine = modelState.getSemanticModel(StateMachine.class).orElseThrow();
        EditingDomain editingDomain = modelState.getEditingDomain();

        //explicitly set the arcs to the nodes (source / target) so the operation is added to the command stack
        // and can be undone. Otherwise, the reference would not be removed from the nodes.

        Command transitionCommand = AddCommand.create(editingDomain, stateMachine,
                StatemachinePackage.Literals.STATE_MACHINE__TRANSITIONS, newTransition);

        Command setSource = SetCommand.create(editingDomain, newTransition,
        	StatemachinePackage.Literals.TRANSITION__FROM, source);

        Command setTarget = SetCommand.create(editingDomain, newTransition,
        	StatemachinePackage.Literals.TRANSITION__TO, target);

        CompoundCommand compoundCommand = new CompoundCommand();

        compoundCommand.append(transitionCommand);
        compoundCommand.append(setSource);
        compoundCommand.append(setTarget);

        return compoundCommand;
    }

    //protected void setType(Arc arc){
        //empty because normal arcs do not have a type attribute in DiNeROS
        //used as template method for subclasses (inhibitor, read)
    //}

}
