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
package mcframe.serverCore.cache.ctrl;

import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.cache.ctrl.PDef;

public abstract class PDef_FW_A
extends MCDef {
    static final MCOperationInfo FC_FCBGL0170_CacheInfo_INFO = new MCOperationInfo("FC", "FCBGL0170", "CacheInfo", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBGL0170_UpdateNotify_INFO = new MCOperationInfo("FC", "FCBGL0170", "UpdateNotify", "000000", (MCDef)new PDef());

    public MCContainerDef getCustomDef(String id) {
        if (id == null) {
            return null;
        }
        if (id.equals("FC.FCBGL0170.CacheInfo.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBGL0170_CacheInfo_UP_BLOCK0();
        }
        if (id.equals("FC.FCBGL0170.CacheInfo.DOWN.BLOCK0")) {
            return PDef_FW_A.FC_FCBGL0170_CacheInfo_DOWN_BLOCK0();
        }
        if (id.equals("FC.FCBGL0170.UpdateNotify.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBGL0170_UpdateNotify_UP_BLOCK0();
        }
        if (id.equals("FC.FCBGL0170.UpdateNotify.UP.BLOCK1")) {
            return PDef_FW_A.FC_FCBGL0170_UpdateNotify_UP_BLOCK1();
        }
        return null;
    }

    public static MCContainerDef FC_FCBGL0170_CacheInfo_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBGL0170", "CacheInfo", new MCItemDef[]{MCItemDef.create((String)"table", (String)"table"), MCItemDef.create((String)"co_cd", (String)"co_cd"), MCItemDef.create((String)"lcl_cd", (String)"lcl_cd")}, MCBlockDef.create((String)"Cnd"));
    }

    public static MCContainerDef FC_FCBGL0170_CacheInfo_DOWN_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBGL0170", "CacheInfo", new MCItemDef[]{MCItemDef.create((String)"table", (boolean)true, (String)"table"), MCItemDef.create((String)"table_nm", (String)"table_nm"), MCItemDef.create((String)"co_cd", (String)"co_cd"), MCItemDef.create((String)"co_nm", (String)"co_nm"), MCItemDef.create((String)"lcl_cd", (String)"lcl_cd"), MCItemDef.create((String)"lcl_nm", (String)"lcl_nm"), MCItemDef.create((String)"cache_cnt", (boolean)true, (String)"cache_cnt"), MCItemDef.create((String)"cache_ts", (boolean)true, (String)"cache_ts"), MCItemDef.create((String)"table_cnt", (String)"table_cnt"), MCItemDef.create((String)"table_ts", (String)"table_ts")}, MCBlockDef.create((String)"Info"));
    }

    public static MCContainerDef FC_FCBGL0170_UpdateNotify_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBGL0170", "UpdateNotify", new MCItemDef[]{MCItemDef.create((String)"co_cd", (String)"co_cd"), MCItemDef.create((String)"lcl_cd", (String)"lcl_cd")}, MCBlockDef.create((String)"Env"));
    }

    public static MCContainerDef FC_FCBGL0170_UpdateNotify_UP_BLOCK1() {
        return new MCGeneralContainerDef("FC", "FCBGL0170", "UpdateNotify", new MCItemDef[]{MCItemDef.create((String)"table", (boolean)true, (String)"table")}, MCBlockDef.create((String)"Table"));
    }
}

