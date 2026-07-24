/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.dashboard.gadget;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.dashboard.gadget.List_Rslt0R_FW_A;

@EI
public class List_Rslt0R
extends List_Rslt0R_FW_A {
    public static List_Rslt0R create() {
        List_Rslt0R row = new List_Rslt0R((MCRow.ConstMetaList<? extends List_Rslt0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> List_Rslt0R createByName(T proto) {
        List_Rslt0R row = List_Rslt0R.create();
        List_Rslt0R.copyByName((MCRow)row, proto);
        return row;
    }

    public List_Rslt0R(MCRow.ConstMetaList<? extends List_Rslt0R> metas) {
        super(metas);
    }
}

