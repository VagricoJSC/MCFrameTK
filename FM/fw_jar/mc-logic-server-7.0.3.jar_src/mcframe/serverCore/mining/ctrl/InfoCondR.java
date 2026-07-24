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
import mcframe.serverCore.mining.ctrl.InfoCondR_FW_A;

@EI
public class InfoCondR
extends InfoCondR_FW_A {
    public static InfoCondR create() {
        InfoCondR row = new InfoCondR((MCRow.ConstMetaList<? extends InfoCondR>)constMetas);
        return row;
    }

    public static <T extends MCRow> InfoCondR createByName(T proto) {
        InfoCondR row = InfoCondR.create();
        InfoCondR.copyByName((MCRow)row, proto);
        return row;
    }

    public InfoCondR(MCRow.ConstMetaList<? extends InfoCondR> metas) {
        super(metas);
    }
}

