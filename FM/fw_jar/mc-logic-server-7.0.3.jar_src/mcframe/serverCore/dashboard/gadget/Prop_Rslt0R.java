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
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R_FW_A;

@EI
public class Prop_Rslt0R
extends Prop_Rslt0R_FW_A {
    public static Prop_Rslt0R create() {
        Prop_Rslt0R row = new Prop_Rslt0R((MCRow.ConstMetaList<? extends Prop_Rslt0R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Prop_Rslt0R createByName(T proto) {
        Prop_Rslt0R row = Prop_Rslt0R.create();
        Prop_Rslt0R.copyByName((MCRow)row, proto);
        return row;
    }

    public Prop_Rslt0R(MCRow.ConstMetaList<? extends Prop_Rslt0R> metas) {
        super(metas);
    }
}

