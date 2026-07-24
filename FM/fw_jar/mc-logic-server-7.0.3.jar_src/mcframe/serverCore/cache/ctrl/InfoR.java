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
import mcframe.serverCore.cache.ctrl.InfoR_FW_A;

@EI
public class InfoR
extends InfoR_FW_A {
    public static InfoR create() {
        InfoR row = new InfoR((MCRow.ConstMetaList<? extends InfoR>)constMetas);
        return row;
    }

    public static <T extends MCRow> InfoR createByName(T proto) {
        InfoR row = InfoR.create();
        InfoR.copyByName((MCRow)row, proto);
        return row;
    }

    public InfoR(MCRow.ConstMetaList<? extends InfoR> metas) {
        super(metas);
    }
}

