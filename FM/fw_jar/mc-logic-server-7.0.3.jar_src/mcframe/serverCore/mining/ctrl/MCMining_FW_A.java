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
package mcframe.serverCore.mining.ctrl;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.logic.MCLogic;
import mcframe.serverCore.logic.MCLogicBase;
import mcframe.serverCore.logic.MCLogicUtil;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mining.ctrl.CngR;
import mcframe.serverCore.mining.ctrl.MCMining;
import mcframe.serverCore.mining.ctrl.MCMining_FW;
import mcframe.serverCore.mining.ctrl.PDef;
import mcframe.serverCore.mining.ctrl.TaskReqR;

public abstract class MCMining_FW_A
extends MCLogicBase {
    public static final String MODULE_ID = "FC";
    public static final String SUBMODULE_ID = "FCBA";
    public static final String LOGIC_ID = "FCBAL0050";
    protected MCMining_FW.TaskExec aTaskExec;
    protected MCMining_FW.Schedule aSchedule;
    protected MCMining_FW.Cancel aCancel;
    protected MCMining_FW.CngAdmin aCngAdmin;

    public String getModuleID() {
        return MODULE_ID;
    }

    public String getSubmoduleID() {
        return SUBMODULE_ID;
    }

    public String getLogicID() {
        return LOGIC_ID;
    }

    protected void initTaskExec() {
        this.info = PDef.FC_FCBAL0050_TaskExec_INFO;
        this.aTaskExec = (MCMining)this.new MCMining_FW.TaskExec();
    }

    public static MCMining_FW.TaskExec crtTaskExec() {
        MCMining lgc = new MCMining();
        lgc.initTaskExec();
        return lgc.aTaskExec;
    }

    protected void paramTaskExec(MCParam p) {
        if (this.aTaskExec == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aTaskExec.up0());
    }

    protected void doTaskExec() {
        this.aTaskExec.call();
    }

    public TaskReqR createReqR() {
        return TaskReqR.create();
    }

    protected void initSchedule() {
        this.info = PDef.FC_FCBAL0050_Schedule_INFO;
        this.aSchedule = (MCMining)this.new MCMining_FW.Schedule();
    }

    public static MCMining_FW.Schedule crtSchedule() {
        MCMining lgc = new MCMining();
        lgc.initSchedule();
        return lgc.aSchedule;
    }

    protected void paramSchedule(MCParam p) {
        if (this.aSchedule == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aSchedule.up0());
    }

    protected void doSchedule() {
        this.aSchedule.call();
    }

    protected void initCancel() {
        this.info = PDef.FC_FCBAL0050_Cancel_INFO;
        this.aCancel = (MCMining)this.new MCMining_FW.Cancel();
    }

    public static MCMining_FW.Cancel crtCancel() {
        MCMining lgc = new MCMining();
        lgc.initCancel();
        return lgc.aCancel;
    }

    protected void paramCancel(MCParam p) {
        if (this.aCancel == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock(this.aCancel.up0());
    }

    protected void doCancel() {
        this.aCancel.call();
    }

    public MCList<TaskReqR> createReqL() {
        return MCList.create(TaskReqR.class);
    }

    protected void initCngAdmin() {
        this.info = PDef.FC_FCBAL0050_CngAdmin_INFO;
        this.aCngAdmin = (MCMining)this.new MCMining_FW.CngAdmin();
    }

    public static MCMining_FW.CngAdmin crtCngAdmin() {
        MCMining lgc = new MCMining();
        lgc.initCngAdmin();
        return lgc.aCngAdmin;
    }

    protected void paramCngAdmin(MCParam p) {
        if (this.aCngAdmin == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aCngAdmin.up0());
    }

    protected void doCngAdmin() {
        this.aCngAdmin.call();
    }

    public CngR createCngR() {
        return CngR.create();
    }

    public abstract class Cancel
    extends MCOperation {
        public static final String OPERATION_ID = "Cancel";
        private final MCList<TaskReqR> up0 = MCList.create(TaskReqR.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected Cancel() {
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
            MCLogicUtil.invoke((MCLogic)((MCMining)MCMining_FW_A.this));
        }

        protected void clear() {
        }

        public TaskReqR createReqR() {
            return TaskReqR.create();
        }

        public MCList<TaskReqR> createReqL() {
            return MCList.create(TaskReqR.class);
        }

        public MCList<TaskReqR> up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMining_FW_A)((MCMining)MCMining_FW_A.this)).info;
        }
    }

    public abstract class CngAdmin
    extends MCOperation {
        public static final String OPERATION_ID = "CngAdmin";
        private final CngR up0 = CngR.create();

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected CngAdmin() {
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
            MCLogicUtil.invoke((MCLogic)((MCMining)MCMining_FW_A.this));
        }

        protected void clear() {
        }

        public CngR createCngR() {
            return CngR.create();
        }

        public CngR up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMining_FW_A)((MCMining)MCMining_FW_A.this)).info;
        }
    }

    public abstract class Schedule
    extends MCOperation {
        public static final String OPERATION_ID = "Schedule";
        private final TaskReqR up0 = TaskReqR.create();

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected Schedule() {
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
            MCLogicUtil.invoke((MCLogic)((MCMining)MCMining_FW_A.this));
        }

        protected void clear() {
        }

        public TaskReqR createReqR() {
            return TaskReqR.create();
        }

        public TaskReqR up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMining_FW_A)((MCMining)MCMining_FW_A.this)).info;
        }
    }

    public abstract class TaskExec
    extends MCOperation {
        public static final String OPERATION_ID = "TaskExec";
        private final TaskReqR up0 = TaskReqR.create();

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected TaskExec() {
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
            MCLogicUtil.invoke((MCLogic)((MCMining)MCMining_FW_A.this));
        }

        protected void clear() {
        }

        public TaskReqR createReqR() {
            return TaskReqR.create();
        }

        public TaskReqR up0() {
            return this.up0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMining_FW_A)((MCMining)MCMining_FW_A.this)).info;
        }
    }
}

