/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.annotation.EI
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 */
package mcframe.serverCore.group;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.group.MCUserGroupR_FW_A;

@EI
public class MCUserGroupR
extends MCUserGroupR_FW_A {
    public static MCUserGroupR create() {
        MCUserGroupR row = new MCUserGroupR((MCRow.ConstMetaList<? extends MCUserGroupR>)constMetas);
        return row;
    }

    public static <T extends MCRow> MCUserGroupR createByName(T proto) {
        MCUserGroupR row = MCUserGroupR.create();
        MCUserGroupR.copyByName((MCRow)row, proto);
        return row;
    }

    public MCUserGroupR(MCRow.ConstMetaList<? extends MCUserGroupR> metas) {
        super(metas);
    }
}

