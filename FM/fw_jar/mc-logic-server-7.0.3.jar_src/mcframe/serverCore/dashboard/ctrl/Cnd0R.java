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
import mcframe.serverCore.dashboard.ctrl.Cnd0R_FW_A;

@EI
public class Cnd0R
extends Cnd0R_FW_A {
    public static Cnd0R create() {
        Cnd0R row = new Cnd0R((MCRow.ConstMetaList<? extends Cnd0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Cnd0R createByName(T proto) {
        Cnd0R row = Cnd0R.create();
        Cnd0R.copyByName((MCRow)row, proto);
        return row;
    }

    public Cnd0R(MCRow.ConstMetaList<? extends Cnd0R> metas) {
        super(metas);
    }
}

