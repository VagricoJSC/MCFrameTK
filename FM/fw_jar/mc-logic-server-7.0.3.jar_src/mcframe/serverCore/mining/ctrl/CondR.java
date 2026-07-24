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
import mcframe.serverCore.mining.ctrl.CondR_FW_A;

@EI
public class CondR
extends CondR_FW_A {
    public static CondR create() {
        CondR row = new CondR((MCRow.ConstMetaList<? extends CondR>)constMetas);
        return row;
    }

    public static <T extends MCRow> CondR createByName(T proto) {
        CondR row = CondR.create();
        CondR.copyByName((MCRow)row, proto);
        return row;
    }

    public CondR(MCRow.ConstMetaList<? extends CondR> metas) {
        super(metas);
    }
}

