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
package mcframe.serverCore.clear;

import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.clear.PDef;

public abstract class PDef_FW_A
extends MCDef {
    static final MCOperationInfo FC_FCBCL0100_ClearBinary_INFO = new MCOperationInfo("FC", "FCBCL0100", "ClearBinary", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBCL0100_ClearPrintData_INFO = new MCOperationInfo("FC", "FCBCL0100", "ClearPrintData", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBCL0100_ClearSrvRequest_INFO = new MCOperationInfo("FC", "FCBCL0100", "ClearSrvRequest", "000000", (MCDef)new PDef());

    public MCContainerDef getCustomDef(String id) {
        if (id == null) {
            return null;
        }
        if (id.equals("FC.FCBCL0100.ClearPrintData.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBCL0100_ClearPrintData_UP_BLOCK0();
        }
        if (id.equals("FC.FCBCL0100.ClearSrvRequest.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBCL0100_ClearSrvRequest_UP_BLOCK0();
        }
        return null;
    }

    public static MCContainerDef FC_FCBCL0100_ClearPrintData_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBCL0100", "ClearPrintData", new MCItemDef[]{MCItemDef.create((String)"saveDuration", (String)"saveDuration")}, MCBlockDef.create((String)"Cnd"));
    }

    public static MCContainerDef FC_FCBCL0100_ClearSrvRequest_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBCL0100", "ClearSrvRequest", new MCItemDef[]{MCItemDef.create((String)"saveDuration", (String)"saveDuration"), MCItemDef.create((String)"targetStatus", (String)"targetStatus")}, MCBlockDef.create((String)"Cnd"));
    }
}

