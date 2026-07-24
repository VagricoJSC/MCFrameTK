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
import mcframe.serverCore.dashboard.gadget.List_Cnd0R_FW_A;

@EI
public class List_Cnd0R
extends List_Cnd0R_FW_A {
    public static List_Cnd0R create() {
        List_Cnd0R row = new List_Cnd0R((MCRow.ConstMetaList<? extends List_Cnd0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> List_Cnd0R createByName(T proto) {
        List_Cnd0R row = List_Cnd0R.create();
        List_Cnd0R.copyByName((MCRow)row, proto);
        return row;
    }

    public List_Cnd0R(MCRow.ConstMetaList<? extends List_Cnd0R> metas) {
        super(metas);
    }
}

