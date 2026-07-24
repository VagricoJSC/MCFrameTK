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
import mcframe.serverCore.dashboard.ctrl.Data_Cnd1R_FW_A;

@EI
public class Data_Cnd1R
extends Data_Cnd1R_FW_A {
    public static Data_Cnd1R create() {
        Data_Cnd1R row = new Data_Cnd1R((MCRow.ConstMetaList<? extends Data_Cnd1R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Data_Cnd1R createByName(T proto) {
        Data_Cnd1R row = Data_Cnd1R.create();
        Data_Cnd1R.copyByName((MCRow)row, proto);
        return row;
    }

    public Data_Cnd1R(MCRow.ConstMetaList<? extends Data_Cnd1R> metas) {
        super(metas);
    }
}

