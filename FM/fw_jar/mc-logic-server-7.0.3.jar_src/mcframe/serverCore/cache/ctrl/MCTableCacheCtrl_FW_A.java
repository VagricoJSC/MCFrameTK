/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.param.MCOperationInfo
 *  mcframe.commonCore.param.MCParam
 *  mcframe.serverCore.logic.MCLogic
 *  mcframe.serverCore.logic.MCLogicBase
 *  mcframe.serverCore.logic.MCLogicUtil
 *  mcframe.serverCore.logic.MCOperation
 */
package mcframe.serverCore.cache.ctrl;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.cache.ctrl.CndR;
import mcframe.serverCore.cache.ctrl.InfoR;
import mcframe.serverCore.cache.ctrl.MCTableCacheCtrl;
import mcframe.serverCore.cache.ctrl.MCTableCacheCtrl_FW;
import mcframe.serverCore.cache.ctrl.PDef;
import mcframe.serverCore.logic.MCLogic;
import mcframe.serverCore.logic.MCLogicBase;
import mcframe.serverCore.logic.MCLogicUtil;
import mcframe.serverCore.logic.MCOperation;

public abstract class MCTableCacheCtrl_FW_A
extends MCLogicBase {
    public static final String MODULE_ID = "FC";
    public static final String SUBMODULE_ID = "FCBG";
    public static final String LOGIC_ID = "FCBGL0170";
    protected MCTableCacheCtrl_FW.CacheInfo aCacheInfo;
    protected MCTableCacheCtrl_FW.UpdateNotify aUpdateNotify;

    public String getModuleID() {
        return MODULE_ID;
    }

    public String getSubmoduleID() {
        return SUBMODULE_ID;
    }

    public String getLogicID() {
        return LOGIC_ID;
    }

    protected void initCacheInfo() {
        this.info = PDef.FC_FCBGL0170_CacheInfo_INFO;
        this.aCacheInfo = (MCTableCacheCtrl)this.new MCTableCacheCtrl_FW.CacheInfo();
    }

    public static MCTableCacheCtrl_FW.CacheInfo crtCacheInfo() {
        MCTableCacheCtrl lgc = new MCTableCacheCtrl();
        lgc.initCacheInfo();
        return lgc.aCacheInfo;
    }

    protected void paramCacheInfo(MCParam p) {
        if (this.aCacheInfo == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aCacheInfo.up0());
        p.addDownBlock(this.aCacheInfo.down0());
    }

    protected void doCacheInfo() {
        this.aCacheInfo.call();
    }

    public CndR createCndR() {
        return CndR.create();
    }

    public InfoR createInfoR() {
        return InfoR.create();
    }

    public MCList<InfoR> createInfoL() {
        return MCList.create(InfoR.class);
    }

    protected void initUpdateNotify() {
        this.info = PDef.FC_FCBGL0170_UpdateNotify_INFO;
        this.aUpdateNotify = (MCTableCacheCtrl)this.new MCTableCacheCtrl_FW.UpdateNotify();
    }

    public static MCTableCacheCtrl_FW.UpdateNotify crtUpdateNotify() {
        MCTableCacheCtrl lgc = new MCTableCacheCtrl();
        lgc.initUpdateNotify();
        return lgc.aUpdateNotify;
    }

    protected void paramUpdateNotify(MCParam p) {
        if (this.aUpdateNotify == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aUpdateNotify.up0());
        p.addUpBlock(this.aUpdateNotify.up1());
    }

    protected void doUpdateNotify() {
        this.aUpdateNotify.call();
    }

    public CndR createEnvR() {
        return CndR.create();
    }

    public InfoR createTableR() {
        return InfoR.create();
    }

    public MCList<InfoR> createTableL() {
        return MCList.create(InfoR.class);
    }

    public abstract class CacheInfo
    extends MCOperation {
        public static final String OPERATION_ID = "CacheInfo";
        private final CndR up0 = CndR.create();
        private final MCList<InfoR> down0 = MCList.create(InfoR.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected CacheInfo() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            return null;
        }

        public MCContainer down(int i) {
            if (i == 0) {
                return this.down0();
            }
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCTableCacheCtrl)MCTableCacheCtrl_FW_A.this));
        }

        protected void clear() {
            this.down0().clear();
        }

        public CndR createCndR() {
            return CndR.create();
        }

        public InfoR createInfoR() {
            return InfoR.create();
        }

        public MCList<InfoR> createInfoL() {
            return MCList.create(InfoR.class);
        }

        public CndR up0() {
            return this.up0;
        }

        public MCList<InfoR> down0() {
            return this.down0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCTableCacheCtrl_FW_A)((MCTableCacheCtrl)MCTableCacheCtrl_FW_A.this)).info;
        }
    }

    public abstract class UpdateNotify
    extends MCOperation {
        public static final String OPERATION_ID = "UpdateNotify";
        private final CndR up0 = CndR.create();
        private final MCList<InfoR> up1 = MCList.create(InfoR.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected UpdateNotify() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            if (i == 1) {
                return this.up1();
            }
            return null;
        }

        public MCContainer down(int i) {
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCTableCacheCtrl)MCTableCacheCtrl_FW_A.this));
        }

        protected void clear() {
        }

        public CndR createEnvR() {
            return CndR.create();
        }

        public InfoR createTableR() {
            return InfoR.create();
        }

        public MCList<InfoR> createTableL() {
            return MCList.create(InfoR.class);
        }

        public CndR up0() {
            return this.up0;
        }

        public MCList<InfoR> up1() {
            return this.up1;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCTableCacheCtrl_FW_A)((MCTableCacheCtrl)MCTableCacheCtrl_FW_A.this)).info;
        }
    }
}

