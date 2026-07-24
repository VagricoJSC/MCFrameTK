/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.param.MCBlockDef
 *  mcframe.commonCore.param.MCContainerDef
 *  mcframe.commonCore.param.MCDef
 *  mcframe.commonCore.param.MCGeneralContainerDef
 *  mcframe.commonCore.param.MCItemDef
 *  mcframe.commonCore.param.MCOperationInfo
 */
package mcframe.serverCore.mining.ctrl;

import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.mining.ctrl.PDef;

public abstract class PDef_FW_A
extends MCDef {
    static final MCOperationInfo FC_FCBAL0050_TaskExec_INFO = new MCOperationInfo("FC", "FCBAL0050", "TaskExec", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBAL0050_Schedule_INFO = new MCOperationInfo("FC", "FCBAL0050", "Schedule", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBAL0050_Cancel_INFO = new MCOperationInfo("FC", "FCBAL0050", "Cancel", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBAL0050_CngAdmin_INFO = new MCOperationInfo("FC", "FCBAL0050", "CngAdmin", "000000", (MCDef)new PDef());

    public MCContainerDef getCustomDef(String id) {
        if (id == null) {
            return null;
        }
        if (id.equals("FC.FCBAL0050.TaskExec.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0050_TaskExec_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0050.Schedule.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0050_Schedule_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0050.Cancel.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0050_Cancel_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0050.CngAdmin.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0050_CngAdmin_UP_BLOCK0();
        }
        return null;
    }

    public static MCContainerDef FC_FCBAL0050_TaskExec_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0050", "TaskExec", new MCItemDef[]{MCItemDef.create((String)"task_id", (String)"task_id"), MCItemDef.create((String)"user_id", (String)"user_id")}, MCBlockDef.create((String)"Req"));
    }

    public static MCContainerDef FC_FCBAL0050_Schedule_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0050", "Schedule", new MCItemDef[]{MCItemDef.create((String)"task_id", (String)"task_id"), MCItemDef.create((String)"user_id", (String)"user_id")}, MCBlockDef.create((String)"Req"));
    }

    public static MCContainerDef FC_FCBAL0050_Cancel_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0050", "Cancel", new MCItemDef[]{MCItemDef.create((String)"task_id", (String)"task_id")}, MCBlockDef.create((String)"Req"));
    }

    public static MCContainerDef FC_FCBAL0050_CngAdmin_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0050", "CngAdmin", new MCItemDef[]{MCItemDef.create((String)"newurl", (String)"newurl")}, MCBlockDef.create((String)"Cng"));
    }
}

