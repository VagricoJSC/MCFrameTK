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
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R_FW_A;

@EI
public class Data_Rslt0R
extends Data_Rslt0R_FW_A {
    public static Data_Rslt0R create() {
        Data_Rslt0R row = new Data_Rslt0R((MCRow.ConstMetaList<? extends Data_Rslt0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Data_Rslt0R createByName(T proto) {
        Data_Rslt0R row = Data_Rslt0R.create();
        Data_Rslt0R.copyByName((MCRow)row, proto);
        return row;
    }

    public Data_Rslt0R(MCRow.ConstMetaList<? extends Data_Rslt0R> metas) {
        super(metas);
    }
}

