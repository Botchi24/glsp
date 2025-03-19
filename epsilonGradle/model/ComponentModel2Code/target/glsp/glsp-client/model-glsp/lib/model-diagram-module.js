"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.initializeModelDiagramContainer = initializeModelDiagramContainer;
/********************************************************************************
 * Copyright (c) 2022 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
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
const client_1 = require("@eclipse-glsp/client");
const inversify_1 = require("inversify");
require("../css/diagram.css");
const modelDiagramModule = new inversify_1.ContainerModule((bind, unbind, isBound, rebind) => {
    rebind(client_1.TYPES.ILogger).to(client_1.ConsoleLogger).inSingletonScope();
    rebind(client_1.TYPES.LogLevel).toConstantValue(client_1.LogLevel.warn);
    const context = { bind, unbind, isBound, rebind };
    (0, client_1.configureDefaultModelElements)(context);
    //configureModelElement(context, DefaultTypes.EDGE, GEdge, GEdgeView);
    (0, client_1.configureModelElement)(context, 'task', client_1.GNode, client_1.RectangularNodeView);
    (0, client_1.configureModelElement)(context, 'transition', client_1.GEdge, client_1.GEdgeView);
    (0, client_1.configureModelElement)(context, 'label', client_1.GLabel, client_1.GLabelView, { enable: [client_1.editLabelFeature] });
});
function initializeModelDiagramContainer(container, ...containerConfiguration) {
    return (0, client_1.initializeDiagramContainer)(container, modelDiagramModule, ...containerConfiguration);
}
//# sourceMappingURL=model-diagram-module.js.map