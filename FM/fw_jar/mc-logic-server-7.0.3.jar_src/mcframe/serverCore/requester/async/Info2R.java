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
import mcframe.serverCore.requester.async.Info2R_FW_A;

@EI
public class Info2R
extends Info2R_FW_A {
    public static Info2R create() {
        Info2R row = new Info2R((MCRow.ConstMetaList<? extends Info2R>)constMetas);
        return row;
    }

    public static <T extends MCRow> Info2R createByName(T proto) {
        Info2R row = Info2R.create();
        Info2R.copyByName((MCRow)row, proto);
        return row;
    }

    public Info2R(MCRow.ConstMetaList<? extends Info2R> metas) {
        super(metas);
    }
}

