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
import mcframe.serverCore.mining.ctrl.TaskReqR_FW_A;

@EI
public class TaskReqR
extends TaskReqR_FW_A {
    public static TaskReqR create() {
        TaskReqR row = new TaskReqR((MCRow.ConstMetaList<? extends TaskReqR>)constMetas);
        return row;
    }

    public static <T extends MCRow> TaskReqR createByName(T proto) {
        TaskReqR row = TaskReqR.create();
        TaskReqR.copyByName((MCRow)row, proto);
        return row;
    }

    public TaskReqR(MCRow.ConstMetaList<? extends TaskReqR> metas) {
        super(metas);
    }
}

