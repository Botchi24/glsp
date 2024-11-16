package org.eclipse.glsp.example.javaemf.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.glsp.server.emf.EMFOperationHandler;
import org.eclipse.glsp.server.operations.ChangeBoundsOperation;
import org.eclipse.glsp.server.operations.ChangeRoutingPointsOperation;

import java.util.Optional;

public class ChangeRoutingPointsOperationHandler extends EMFOperationHandler<ChangeRoutingPointsOperation> {

    @Override
    public Optional<Command> createCommand(ChangeRoutingPointsOperation changeRoutingPointsOperation) {
        return Optional.empty();
    }
}