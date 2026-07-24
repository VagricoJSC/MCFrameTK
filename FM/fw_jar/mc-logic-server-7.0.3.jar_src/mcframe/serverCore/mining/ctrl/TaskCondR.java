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
import mcframe.serverCore.mining.ctrl.TaskCondR_FW_A;

@EI
public class TaskCondR
extends TaskCondR_FW_A {
    public static TaskCondR create() {
        TaskCondR row = new TaskCondR((MCRow.ConstMetaList<? extends TaskCondR>)constMetas);
        return row;
    }

    public static <T extends MCRow> TaskCondR createByName(T proto) {
        TaskCondR row = TaskCondR.create();
        TaskCondR.copyByName((MCRow)row, proto);
        return row;
    }

    public TaskCondR(MCRow.ConstMetaList<? extends TaskCondR> metas) {
        super(metas);
    }
}

