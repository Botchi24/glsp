"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.ModelGLSPServerContribution = exports.LOG_DIR = exports.PORT_ARG_KEY = exports.DEFAULT_PORT = void 0;
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
const path_1 = require("path");
const model_language_1 = require("../common/model-language");
exports.DEFAULT_PORT = 0;
exports.PORT_ARG_KEY = 'MODEL_GLSP';
exports.LOG_DIR = (0, path_1.join)(__dirname, '..', '..', 'logs');
const JAR_FILE = (0, path_1.resolve)((0, path_1.join)(__dirname, '..', '..', '..', '..', 'glsp-server', 'target', 'org.eclipse.glsp.example.javaemf-2.2.1-glsp.jar'));
let ModelGLSPServerContribution = class ModelGLSPServerContribution extends node_1.GLSPSocketServerContribution {
    constructor() {
        super(...arguments);
        this.id = model_language_1.ModelLanguage.contributionId;
    }
    createContributionOptions() {
        return {
            executable: JAR_FILE,
            additionalArgs: ['--consoleLog', 'false', '--fileLog', 'true', '--logDir', exports.LOG_DIR],
            socketConnectionOptions: {
                port: (0, node_1.getPort)(exports.PORT_ARG_KEY, exports.DEFAULT_PORT)
            }
        };
    }
};
exports.ModelGLSPServerContribution = ModelGLSPServerContribution;
exports.ModelGLSPServerContribution = ModelGLSPServerContribution = __decorate([
    (0, inversify_1.injectable)()
], ModelGLSPServerContribution);
//# sourceMappingURL=glsp-server-contribution.js.map