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
import mcframe.serverCore.group.MCGrantUserGroupR_FW_A;

@EI
public class MCGrantUserGroupR
extends MCGrantUserGroupR_FW_A {
    public static MCGrantUserGroupR create() {
        MCGrantUserGroupR row = new MCGrantUserGroupR((MCRow.ConstMetaList<? extends MCGrantUserGroupR>)constMetas);
        return row;
    }

    public static <T extends MCRow> MCGrantUserGroupR createByName(T proto) {
        MCGrantUserGroupR row = MCGrantUserGroupR.create();
        MCGrantUserGroupR.copyByName((MCRow)row, proto);
        return row;
    }

    public MCGrantUserGroupR(MCRow.ConstMetaList<? extends MCGrantUserGroupR> metas) {
        super(metas);
    }
}

