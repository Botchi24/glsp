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
import org.eclipse.glsp.example.javaemf.ModelModelTypes;
import org.eclipse.glsp.example.tasklist.model.ModelFactory;
import org.eclipse.glsp.example.tasklist.model.ModelPackage;
import org.eclipse.glsp.example.tasklist.model.Transition;
import org.eclipse.glsp.example.tasklist.model.TaskList;
import org.eclipse.glsp.example.tasklist.model.Task;
import org.eclipse.glsp.graph.GraphPackage;
import org.eclipse.glsp.server.emf.EMFCreateOperationHandler;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationModelState;
import org.eclipse.glsp.server.operations.CreateEdgeOperation;

import com.google.inject.Inject;


public class CreateTransitionEdgeHandler extends EMFCreateOperationHandler<CreateEdgeOperation> {

	@Inject
	protected EMFNotationModelState modelState;
	
    @Inject
    protected EMFIdGenerator idGenerator;

    public CreateTransitionEdgeHandler() {
        super(ModelModelTypes.TRANSITION);
    }

    @Override
    public String getLabel() { return "Transition"; }

    @Override
    public Optional<Command> createCommand(CreateEdgeOperation operation) {
        if (!constraintSatisfied()) return Optional.of(new CompoundCommand());
    
        Transition newTransition = ModelFactory.eINSTANCE.createTransition();
        //newArc.setId(UUID.randomUUID().toString());
        setInitialName(newTransition);

        String sourceId = operation.getSourceElementId();
        String targetId = operation.getTargetElementId();

        Task source = modelState.getIndex().getEObject(sourceId, Task.class).orElseThrow();
        Task target = modelState.getIndex().getEObject(targetId, Task.class).orElseThrow();

        return Optional.of(createTransition(newTransition, source, target));
    }

    protected void setInitialName(final Transition transition) {
        Function<Integer, String> nameProvider = i -> "New" + transition.eClass().getName() + i;
        int edgeCounter = modelState.getIndex().getCounter(ModelPackage.Literals.TRANSITION, nameProvider);
        transition.setId(nameProvider.apply(edgeCounter));
    }

    protected Command createTransition(Transition newTransition, Task source, Task target) {
    	TaskList taskList = modelState.getSemanticModel(TaskList.class).orElseThrow();
        EditingDomain editingDomain = modelState.getEditingDomain();

        //explicitly set the arcs to the nodes (source / target) so the operation is added to the command stack
        // and can be undone. Otherwise, the reference would not be removed from the nodes.

        Command transitionCommand = AddCommand.create(editingDomain, taskList,
            ModelPackage.Literals.TASK_LIST__TRANSITIONS, newTransition);

        Command setSource = SetCommand.create(editingDomain, newTransition,
        	ModelPackage.Literals.TRANSITION__SOURCE, source);

        Command setTarget = SetCommand.create(editingDomain, newTransition,
        	ModelPackage.Literals.TRANSITION__TARGET, target);

        CompoundCommand compoundCommand = new CompoundCommand();

        compoundCommand.append(transitionCommand);
        compoundCommand.append(setSource);
        compoundCommand.append(setTarget);

        return compoundCommand;
    }
    
    protected boolean constraintSatisfied() {
 	   // USER INSERTS CONSTRAINT FOR EDGE CREATION HERE
 	   
 	   return true;
    }

}
