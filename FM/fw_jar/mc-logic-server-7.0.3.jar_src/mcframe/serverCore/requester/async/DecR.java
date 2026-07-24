/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.requester.async;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.requester.async.DecR_FW_A;

@EI
public class DecR
extends DecR_FW_A {
    public static DecR create() {
        DecR row = new DecR((MCRow.ConstMetaList<? extends DecR>)constMetas);
        return row;
    }

    public static <T extends MCRow> DecR createByName(T proto) {
        DecR row = DecR.create();
        DecR.copyByName((MCRow)row, proto);
        return row;
    }

    public DecR(MCRow.ConstMetaList<? extends DecR> metas) {
        super(metas);
    }
}

