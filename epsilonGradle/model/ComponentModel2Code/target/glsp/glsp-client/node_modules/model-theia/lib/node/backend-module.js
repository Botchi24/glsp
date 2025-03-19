"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
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
const node_1 = require("@eclipse-glsp/theia-integration/lib/node");
const inversify_1 = require("@theia/core/shared/inversify");
const glsp_server_contribution_1 = require("./glsp-server-contribution");
exports.default = new inversify_1.ContainerModule(bind => {
    bind(glsp_server_contribution_1.ModelGLSPServerContribution).toSelf().inSingletonScope();
    bind(node_1.GLSPServerContribution).toService(glsp_server_contribution_1.ModelGLSPServerContribution);
});
//# sourceMappingURL=backend-module.js.map