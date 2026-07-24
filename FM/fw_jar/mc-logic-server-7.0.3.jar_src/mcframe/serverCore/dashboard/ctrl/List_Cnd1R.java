/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.dashboard.ctrl;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.dashboard.ctrl.List_Cnd1R_FW_A;

@EI
public class List_Cnd1R
extends List_Cnd1R_FW_A {
    public static List_Cnd1R create() {
        List_Cnd1R row = new List_Cnd1R((MCRow.ConstMetaList<? extends List_Cnd1R>)constMetas);
        return row;
    }

    public static <T extends MCRow> List_Cnd1R createByName(T proto) {
        List_Cnd1R row = List_Cnd1R.create();
        List_Cnd1R.copyByName((MCRow)row, proto);
        return row;
    }

    public List_Cnd1R(MCRow.ConstMetaList<? extends List_Cnd1R> metas) {
        super(metas);
    }
}

