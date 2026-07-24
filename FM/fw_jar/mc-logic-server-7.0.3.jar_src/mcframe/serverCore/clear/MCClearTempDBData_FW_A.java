/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.param.MCOperationInfo
 *  mcframe.commonCore.param.MCParam
 *  mcframe.serverCore.logic.MCLogic
 *  mcframe.serverCore.logic.MCLogicBase
 *  mcframe.serverCore.logic.MCLogicUtil
 *  mcframe.serverCore.logic.MCOperation
 */
package mcframe.serverCore.clear;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.clear.CndR;
import mcframe.serverCore.clear.MCClearTempDBData;
import mcframe.serverCore.clear.MCClearTempDBData_FW;
import mcframe.serverCore.clear.PDef;
import mcframe.serverCore.logic.MCLogic;
import mcframe.serverCore.logic.MCLogicBase;
import mcframe.serverCore.logic.MCLogicUtil;
import mcframe.serverCore.logic.MCOperation;

public abstract class MCClearTempDBData_FW_A
extends MCLogicBase {
    public static final String MODULE_ID = "FC";
    public static final String SUBMODULE_ID = "FCBC";
    public static final String LOGIC_ID = "FCBCL0100";
    protected MCClearTempDBData_FW.ClearBinary aClearBinary;
    protected MCClearTempDBData_FW.ClearPrintData aClearPrintData;
    protected MCClearTempDBData_FW.ClearSrvRequest aClearSrvRequest;

    public String getModuleID() {
        return MODULE_ID;
    }

    public String getSubmoduleID() {
        return SUBMODULE_ID;
    }

    public String getLogicID() {
        return LOGIC_ID;
    }

    protected void initClearBinary() {
        this.info = PDef.FC_FCBCL0100_ClearBinary_INFO;
        this.aClearBinary = (MCClearTempDBData)this.new MCClearTempDBData_FW.ClearBinary();
    }

    public static MCClearTempDBData_FW.ClearBinary crtClearBinary() {
        MCClearTempDBData lgc = new MCClearTempDBData();
        lgc.initClearBinary();
        return lgc.aClearBinary;
    }

    protected void paramClearBinary(MCParam p) {
        if (this.aClearBinary == null) {
            return;
        }
        p.setDef(this.info.def);
    }

    protected void doClearBinary() {
        this.aClearBinary.call();
    }

    protected void initClearPrintData() {
        this.info = PDef.FC_FCBCL0100_ClearPrintData_INFO;
        this.aClearPrintData = (MCClearTempDBData)this.new MCClearTempDBData_FW.ClearPrintData();
    }

    public static MCClearTempDBData_FW.ClearPrintData crtClearPrintData() {
        MCClearTempDBData lgc = new MCClearTempDBData();
        lgc.initClearPrintData();
        return lgc.aClearPrintData;
    }

    protected void paramClearPrintData(MCParam p) {
        if (this.aClearPrintData == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aClearPrintData.up0());
    }

    protected void doClearPrintData() {
        this.aClearPrintData.call();
    }

    public CndR createCndR() {
        return CndR.create();
    }

    protected void initClearSrvRequest() {
        this.info = PDef.FC_FCBCL0100_ClearSrvRequest_INFO;
        this.aClearSrvRequest = (MCClearTempDBData)this.new MCClearTempDBData_FW.ClearSrvRequest();
    }

    public static MCClearTempDBData_FW.ClearSrvRequest crtClearSrvRequest() {
        MCClearTempDBData lgc = new MCClearTempDBData();
        lgc.initClearSrvRequest();
        return lgc.aClearSrvRequest;
    }

    protected void paramClearSrvRequest(MCParam p) {
        if (this.aClearSrvRequest == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aClearSrvRequest.up0());
    }

    protected void doClearSrvRequest() {
        this.aClearSrvRequest.call();
    }

    public abstract class ClearBinary
    extends MCOperation {
        public static final String OPERATION_ID = "ClearBinary";

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected ClearBinary() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        public MCContainer up(int i) {
            return null;
        }

        public MCContainer down(int i) {
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCClearTempDBData)MCClearTempDBData_FW_A.this));
        }

        protected void clear() {
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCClearTempDBData_FW_A)((MCClearTempDBData)MCClearTempDBData_FW_A.this)).info;
        }
    }

    public abstract class ClearPrintData
    extends MCOperation {
        public static final String OPERATION_ID = "ClearPrintData";
        private final CndR up0 = CndR.create();

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected ClearPrintData() {
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
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCClearTempDBData)MCClearTempDBData_FW_A.this));
        }

        protected void clear() {
        }

        public CndR createCndR() {
            return CndR.create();
        }

        public CndR up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCClearTempDBData_FW_A)((MCClearTempDBData)MCClearTempDBData_FW_A.this)).info;
        }
    }

    public abstract class ClearSrvRequest
    extends MCOperation {
        public static final String OPERATION_ID = "ClearSrvRequest";
        private final CndR up0 = CndR.create();

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected ClearSrvRequest() {
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
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCClearTempDBData)MCClearTempDBData_FW_A.this));
        }

        protected void clear() {
        }

        public CndR createCndR() {
            return CndR.create();
        }

        public CndR up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCClearTempDBData_FW_A)((MCClearTempDBData)MCClearTempDBData_FW_A.this)).info;
        }
    }
}

