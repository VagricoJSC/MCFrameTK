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
import mcframe.serverCore.dashboard.ctrl.Prop_Cnd1R_FW_A;

@EI
public class Prop_Cnd1R
extends Prop_Cnd1R_FW_A {
    public static Prop_Cnd1R create() {
        Prop_Cnd1R row = new Prop_Cnd1R((MCRow.ConstMetaList<? extends Prop_Cnd1R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Prop_Cnd1R createByName(T proto) {
        Prop_Cnd1R row = Prop_Cnd1R.create();
        Prop_Cnd1R.copyByName((MCRow)row, proto);
        return row;
    }

    public Prop_Cnd1R(MCRow.ConstMetaList<? extends Prop_Cnd1R> metas) {
        super(metas);
    }
}

