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
package mcframe.serverCore.requester.async;

import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.requester.async.PDef;

public abstract class PDef_FW_A
extends MCDef {
    static final MCOperationInfo FC_FCBGL4000_CallAsync_INFO = new MCOperationInfo("FC", "FCBGL4000", "CallAsync", "000000", (MCDef)new PDef());

    public MCContainerDef getCustomDef(String id) {
        if (id == null) {
            return null;
        }
        if (id.equals("FC.FCBGL4000.CallAsync.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBGL4000_CallAsync_UP_BLOCK0();
        }
        if (id.equals("FC.FCBGL4000.CallAsync.UP.BLOCK1")) {
            return PDef_FW_A.FC_FCBGL4000_CallAsync_UP_BLOCK1();
        }
        if (id.equals("FC.FCBGL4000.CallAsync.UP.BLOCK2")) {
            return PDef_FW_A.FC_FCBGL4000_CallAsync_UP_BLOCK2();
        }
        if (id.equals("FC.FCBGL4000.CallAsync.DOWN.BLOCK0")) {
            return PDef_FW_A.FC_FCBGL4000_CallAsync_DOWN_BLOCK0();
        }
        if (id.equals("FC.FCBGL4000.CallAsync.DOWN.BLOCK1")) {
            return PDef_FW_A.FC_FCBGL4000_CallAsync_DOWN_BLOCK1();
        }
        return null;
    }

    public static MCContainerDef FC_FCBGL4000_CallAsync_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBGL4000", "CallAsync", new MCItemDef[]{MCItemDef.create((String)"denbun", (boolean)true, (String)"denbun")}, MCBlockDef.create((String)"Dec"));
    }

    public static MCContainerDef FC_FCBGL4000_CallAsync_UP_BLOCK1() {
        return new MCGeneralContainerDef("FC", "FCBGL4000", "CallAsync", new MCItemDef[]{MCItemDef.create((String)"push_msg", (String)"push_msg")}, MCBlockDef.create((String)"Info"));
    }

    public static MCContainerDef FC_FCBGL4000_CallAsync_UP_BLOCK2() {
        return new MCGeneralContainerDef("FC", "FCBGL4000", "CallAsync", new MCItemDef[]{MCItemDef.create((String)"scr_container", (String)"scr_container")}, MCBlockDef.create((String)"Info2"));
    }

    public static MCContainerDef FC_FCBGL4000_CallAsync_DOWN_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBGL4000", "CallAsync", new MCItemDef[]{MCItemDef.create((String)"denbun", (boolean)true, (String)"denbun")}, MCBlockDef.create((String)"Dec"));
    }

    public static MCContainerDef FC_FCBGL4000_CallAsync_DOWN_BLOCK1() {
        return new MCGeneralContainerDef("FC", "FCBGL4000", "CallAsync", new MCItemDef[]{MCItemDef.create((String)"reqid", (String)"reqid")}, MCBlockDef.create((String)"Info"));
    }
}

