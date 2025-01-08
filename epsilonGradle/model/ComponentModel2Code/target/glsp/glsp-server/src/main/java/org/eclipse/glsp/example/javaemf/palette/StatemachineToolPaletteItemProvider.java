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
package org.eclipse.glsp.example.javaemf.palette;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;

import org.eclipse.glsp.example.javaemf.StatemachineModelTypes;
import org.eclipse.glsp.server.actions.TriggerNodeCreationAction;
import org.eclipse.glsp.server.actions.TriggerEdgeCreationAction;
import org.eclipse.glsp.server.features.toolpalette.PaletteItem;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;

public class StatemachineToolPaletteItemProvider implements ToolPaletteItemProvider {

    @Override
    public List<PaletteItem> getItems(Map<String, String> args) {
        return Lists.newArrayList(nodes(), edges());
    }

    private PaletteItem nodes() {
    	List<PaletteItem> nodes = Lists.newArrayList();
        PaletteItem createInitialState = node(StatemachineModelTypes.INITIALSTATE, "InitialState");
        nodes.add(createInitialState);
        PaletteItem createNormalState = node(StatemachineModelTypes.NORMALSTATE, "NormalState");
        nodes.add(createNormalState);
        PaletteItem createFinalState = node(StatemachineModelTypes.FINALSTATE, "FinalState");
        nodes.add(createFinalState);
        
        return PaletteItem.createPaletteGroup("nodes", "Nodes", nodes, "symbol-property");
    }
    
    private PaletteItem edges() {
        List<PaletteItem> edges = Lists.newArrayList();
        PaletteItem createTransition = edge(StatemachineModelTypes.TRANSITION, "Transition");
        edges.add(createTransition);
        return PaletteItem.createPaletteGroup("edges", "Edges", edges, "symbol-property");
    }

    private PaletteItem node(String elementTypeId, String label) {
        return new PaletteItem(elementTypeId, label, new TriggerNodeCreationAction(elementTypeId));
    }
    
    private PaletteItem edge(String elementTypeId, String label) {
        return new PaletteItem(elementTypeId, label, new TriggerEdgeCreationAction(elementTypeId));
    }

}