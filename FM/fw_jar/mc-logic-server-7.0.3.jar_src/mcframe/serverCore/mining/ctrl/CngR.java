/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.mining.ctrl;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.mining.ctrl.CngR_FW_A;

@EI
public class CngR
extends CngR_FW_A {
    public static CngR create() {
        CngR row = new CngR((MCRow.ConstMetaList<? extends CngR>)constMetas);
        return row;
    }

    public static <T extends MCRow> CngR createByName(T proto) {
        CngR row = CngR.create();
        CngR.copyByName((MCRow)row, proto);
        return row;
    }

    public CngR(MCRow.ConstMetaList<? extends CngR> metas) {
        super(metas);
    }
}

