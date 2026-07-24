/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.cache.ctrl;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.cache.ctrl.CndR_FW_A;

@EI
public class CndR
extends CndR_FW_A {
    public static CndR create() {
        CndR row = new CndR((MCRow.ConstMetaList<? extends CndR>)constMetas);
        return row;
    }

    public static <T extends MCRow> CndR createByName(T proto) {
        CndR row = CndR.create();
        CndR.copyByName((MCRow)row, proto);
        return row;
    }

    public CndR(MCRow.ConstMetaList<? extends CndR> metas) {
        super(metas);
    }
}

