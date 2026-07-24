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
import mcframe.serverCore.dashboard.ctrl.GadgetR_FW_A;

@EI
public class GadgetR
extends GadgetR_FW_A {
    public static GadgetR create() {
        GadgetR row = new GadgetR((MCRow.ConstMetaList<? extends GadgetR>)constMetas);
        return row;
    }

    public static <T extends MCRow> GadgetR createByName(T proto) {
        GadgetR row = GadgetR.create();
        GadgetR.copyByName((MCRow)row, proto);
        return row;
    }

    public GadgetR(MCRow.ConstMetaList<? extends GadgetR> metas) {
        super(metas);
    }
}

