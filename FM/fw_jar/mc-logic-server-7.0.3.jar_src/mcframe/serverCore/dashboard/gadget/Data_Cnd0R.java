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
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R_FW_A;

@EI
public class Data_Cnd0R
extends Data_Cnd0R_FW_A {
    public static Data_Cnd0R create() {
        Data_Cnd0R row = new Data_Cnd0R((MCRow.ConstMetaList<? extends Data_Cnd0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Data_Cnd0R createByName(T proto) {
        Data_Cnd0R row = Data_Cnd0R.create();
        Data_Cnd0R.copyByName((MCRow)row, proto);
        return row;
    }

    public Data_Cnd0R(MCRow.ConstMetaList<? extends Data_Cnd0R> metas) {
        super(metas);
    }
}

