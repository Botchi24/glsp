"use strict";
(self["webpackChunkmodel_browser_app"] = self["webpackChunkmodel_browser_app"] || []).push([["model-theia_lib_browser_frontend-module_js"],{

/***/ "../node_modules/css-loader/dist/cjs.js!../model-glsp/css/diagram.css":
/*!****************************************************************************!*\
  !*** ../node_modules/css-loader/dist/cjs.js!../model-glsp/css/diagram.css ***!
  \****************************************************************************/
/***/ ((module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "default": () => (__WEBPACK_DEFAULT_EXPORT__)
/* harmony export */ });
/* harmony import */ var _node_modules_css_loader_dist_runtime_sourceMaps_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ../../node_modules/css-loader/dist/runtime/sourceMaps.js */ "../node_modules/css-loader/dist/runtime/sourceMaps.js");
/* harmony import */ var _node_modules_css_loader_dist_runtime_sourceMaps_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(_node_modules_css_loader_dist_runtime_sourceMaps_js__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _node_modules_css_loader_dist_runtime_api_js__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../node_modules/css-loader/dist/runtime/api.js */ "../node_modules/css-loader/dist/runtime/api.js");
/* harmony import */ var _node_modules_css_loader_dist_runtime_api_js__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(_node_modules_css_loader_dist_runtime_api_js__WEBPACK_IMPORTED_MODULE_1__);
// Imports


var ___CSS_LOADER_EXPORT___ = _node_modules_css_loader_dist_runtime_api_js__WEBPACK_IMPORTED_MODULE_1___default()((_node_modules_css_loader_dist_runtime_sourceMaps_js__WEBPACK_IMPORTED_MODULE_0___default()));
// Module
___CSS_LOADER_EXPORT___.push([module.id, `/********************************************************************************
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

svg {
    border-style: solid;
    border-width: 1px;
    border-color: #bbb;
}

.sprotty-node {
    fill: inherit;
}

.model-Task-node {
    fill: #f1bd6c;
}

.model-Transition-edge {
    
}
`, "",{"version":3,"sources":["webpack://./../model-glsp/css/diagram.css"],"names":[],"mappings":"AAAA;;;;;;;;;;;;;;;iFAeiF;;AAEjF;IACI,mBAAmB;IACnB,iBAAiB;IACjB,kBAAkB;AACtB;;AAEA;IACI,aAAa;AACjB;;AAEA;IACI,aAAa;AACjB;;AAEA;;AAEA","sourcesContent":["/********************************************************************************\r\n * Copyright (c) 2022 EclipseSource and others.\r\n *\r\n * This program and the accompanying materials are made available under the\r\n * terms of the Eclipse Public License v. 2.0 which is available at\r\n * http://www.eclipse.org/legal/epl-2.0.\r\n *\r\n * This Source Code may also be made available under the following Secondary\r\n * Licenses when the conditions for such availability set forth in the Eclipse\r\n * Public License v. 2.0 are satisfied: \r\n * -- GNU General Public License, version 2 with the GNU Classpath Exception\r\n * which is available at https://www.gnu.org/software/classpath/license.html\r\n * -- MIT License which is available at https://opensource.org/license/mit.\r\n *\r\n * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR MIT\r\n ********************************************************************************/\r\n\r\nsvg {\r\n    border-style: solid;\r\n    border-width: 1px;\r\n    border-color: #bbb;\r\n}\r\n\r\n.sprotty-node {\r\n    fill: inherit;\r\n}\r\n\r\n.model-Task-node {\r\n    fill: #f1bd6c;\r\n}\r\n\r\n.model-Transition-edge {\r\n    \r\n}\r\n"],"sourceRoot":""}]);
// Exports
/* harmony default export */ const __WEBPACK_DEFAULT_EXPORT__ = (___CSS_LOADER_EXPORT___);


/***/ }),

/***/ "../model-glsp/lib/index.js":
/*!**********************************!*\
  !*** ../model-glsp/lib/index.js ***!
  \**********************************/
/***/ (function(__unused_webpack_module, exports, __webpack_require__) {


var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __exportStar = (this && this.__exportStar) || function(m, exports) {
    for (var p in m) if (p !== "default" && !Object.prototype.hasOwnProperty.call(exports, p)) __createBinding(exports, m, p);
};
Object.defineProperty(exports, "__esModule", ({ value: true }));
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
__exportStar(__webpack_require__(/*! ./model-diagram-module */ "../model-glsp/lib/model-diagram-module.js"), exports);


/***/ }),

/***/ "../model-glsp/lib/model-diagram-module.js":
/*!*************************************************!*\
  !*** ../model-glsp/lib/model-diagram-module.js ***!
  \*************************************************/
/***/ ((__unused_webpack_module, exports, __webpack_require__) => {


Object.defineProperty(exports, "__esModule", ({ value: true }));
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
const client_1 = __webpack_require__(/*! @eclipse-glsp/client */ "../node_modules/@eclipse-glsp/client/lib/index.js");
const inversify_1 = __webpack_require__(/*! inversify */ "../node_modules/inversify/es/inversify.js");
__webpack_require__(/*! ../css/diagram.css */ "../model-glsp/css/diagram.css");
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


/***/ }),

/***/ "../model-theia/lib/browser/diagram/model-diagram-configuration.js":
/*!*************************************************************************!*\
  !*** ../model-theia/lib/browser/diagram/model-diagram-configuration.js ***!
  \*************************************************************************/
/***/ (function(__unused_webpack_module, exports, __webpack_require__) {


var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", ({ value: true }));
exports.ModelDiagramConfiguration = void 0;
const browser_1 = __webpack_require__(/*! @eclipse-glsp/theia-integration/lib/browser */ "../node_modules/@eclipse-glsp/theia-integration/lib/browser/index.js");
const inversify_1 = __webpack_require__(/*! @theia/core/shared/inversify */ "../node_modules/@theia/core/shared/inversify/index.js");
const model_glsp_1 = __webpack_require__(/*! model-glsp */ "../model-glsp/lib/index.js");
const model_language_1 = __webpack_require__(/*! ../../common/model-language */ "../model-theia/lib/common/model-language.js");
let ModelDiagramConfiguration = class ModelDiagramConfiguration extends browser_1.GLSPDiagramConfiguration {
    constructor() {
        super(...arguments);
        this.diagramType = model_language_1.ModelLanguage.diagramType;
    }
    configureContainer(container, ...containerConfiguration) {
        (0, model_glsp_1.initializeModelDiagramContainer)(container, ...containerConfiguration);
    }
};
exports.ModelDiagramConfiguration = ModelDiagramConfiguration;
exports.ModelDiagramConfiguration = ModelDiagramConfiguration = __decorate([
    (0, inversify_1.injectable)()
], ModelDiagramConfiguration);


/***/ }),

/***/ "../model-theia/lib/browser/frontend-module.js":
/*!*****************************************************!*\
  !*** ../model-theia/lib/browser/frontend-module.js ***!
  \*****************************************************/
/***/ ((__unused_webpack_module, exports, __webpack_require__) => {


Object.defineProperty(exports, "__esModule", ({ value: true }));
exports.ModelTheiaFrontendModule = void 0;
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
const theia_integration_1 = __webpack_require__(/*! @eclipse-glsp/theia-integration */ "../node_modules/@eclipse-glsp/theia-integration/lib/browser/index.js");
const model_language_1 = __webpack_require__(/*! ../common/model-language */ "../model-theia/lib/common/model-language.js");
const model_diagram_configuration_1 = __webpack_require__(/*! ./diagram/model-diagram-configuration */ "../model-theia/lib/browser/diagram/model-diagram-configuration.js");
class ModelTheiaFrontendModule extends theia_integration_1.GLSPTheiaFrontendModule {
    constructor() {
        super(...arguments);
        this.diagramLanguage = model_language_1.ModelLanguage;
    }
    bindDiagramConfiguration(context) {
        context.bind(theia_integration_1.DiagramConfiguration).to(model_diagram_configuration_1.ModelDiagramConfiguration);
    }
}
exports.ModelTheiaFrontendModule = ModelTheiaFrontendModule;
exports["default"] = new ModelTheiaFrontendModule();


/***/ }),

/***/ "../model-theia/lib/common/model-language.js":
/*!***************************************************!*\
  !*** ../model-theia/lib/common/model-language.js ***!
  \***************************************************/
/***/ ((__unused_webpack_module, exports) => {


Object.defineProperty(exports, "__esModule", ({ value: true }));
exports.ModelLanguage = void 0;
exports.ModelLanguage = {
    contributionId: 'Model',
    label: 'Model Diagram',
    diagramType: 'model-diagram',
    iconClass: 'codicon codicon-model',
    fileExtensions: ['.model']
};


/***/ }),

/***/ "../model-glsp/css/diagram.css":
/*!*************************************!*\
  !*** ../model-glsp/css/diagram.css ***!
  \*************************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "default": () => (__WEBPACK_DEFAULT_EXPORT__)
/* harmony export */ });
/* harmony import */ var _node_modules_style_loader_dist_runtime_injectStylesIntoStyleTag_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! !../../node_modules/style-loader/dist/runtime/injectStylesIntoStyleTag.js */ "../node_modules/style-loader/dist/runtime/injectStylesIntoStyleTag.js");
/* harmony import */ var _node_modules_style_loader_dist_runtime_injectStylesIntoStyleTag_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(_node_modules_style_loader_dist_runtime_injectStylesIntoStyleTag_js__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _node_modules_css_loader_dist_cjs_js_diagram_css__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! !!../../node_modules/css-loader/dist/cjs.js!./diagram.css */ "../node_modules/css-loader/dist/cjs.js!../model-glsp/css/diagram.css");

            

var options = {};

options.insert = "head";
options.singleton = false;

var update = _node_modules_style_loader_dist_runtime_injectStylesIntoStyleTag_js__WEBPACK_IMPORTED_MODULE_0___default()(_node_modules_css_loader_dist_cjs_js_diagram_css__WEBPACK_IMPORTED_MODULE_1__["default"], options);



/* harmony default export */ const __WEBPACK_DEFAULT_EXPORT__ = (_node_modules_css_loader_dist_cjs_js_diagram_css__WEBPACK_IMPORTED_MODULE_1__["default"].locals || {});

/***/ })

}]);
//# sourceMappingURL=model-theia_lib_browser_frontend-module_js.js.map