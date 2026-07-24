/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCIndexKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCMessageList
 *  mcframe.serverCore.dashboard.MCValueSupply
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.notice.MCMessagePool
 *  mcframe.serverCore.requester.MCClusterManager
 */
package mcframe.serverCore.mining.ctrl;

import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.serverCore.dashboard.MCValueSupply;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.mining.MCMiningAgent;
import mcframe.serverCore.mining.MCMiningManager;
import mcframe.serverCore.mining.ctrl.CondR;
import mcframe.serverCore.mining.ctrl.InfoCondR;
import mcframe.serverCore.mining.ctrl.MCMiningProxy;
import mcframe.serverCore.mining.ctrl.MCMining_FW_A;
import mcframe.serverCore.mining.ctrl.TaskCondR;
import mcframe.serverCore.mining.task.MCMiningTaskPlugin;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.requester.MCClusterManager;

public abstract class MCMining_FW
extends MCMining_FW_A {

    public class Cancel
    extends MCMining_FW_A.Cancel {
        public Cancel() {
            super(MCMining_FW.this);
        }

        protected void call() {
            String[] taskids = this.up0().getString("task_id").toArray(new String[0]);
            MCMiningProxy.PROXY.cancel(taskids);
        }
    }

    public class CngAdmin
    extends MCMining_FW_A.CngAdmin {
        public CngAdmin() {
            super(MCMining_FW.this);
        }

        protected void call() {
            String srvurl = MCClusterManager.getManager().getServerURL();
            String newurl = this.up0().newurl();
            if (MCStringUtil.eq((String)newurl, (String)srvurl)) {
                MCMessagePool.addAll((MCMessageList)MCMiningProxy.PROXY.promote());
            } else {
                MCMiningProxy.PROXY.demote();
            }
        }
    }

    public class Schedule
    extends MCMining_FW_A.Schedule {
        public Schedule() {
            super(MCMining_FW.this);
        }

        protected void call() {
            boolean immediate;
            String taskid = this.up0().task_id();
            boolean bl = immediate = !MCStringUtil.isNull((String)this.up0().user_id());
            if (immediate) {
                MCMiningProxy.PROXY.immediate(taskid);
            } else {
                MCMiningProxy.PROXY.schedule(taskid, true);
            }
        }
    }

    public class TaskExec
    extends MCMining_FW_A.TaskExec {
        public TaskExec() {
            super(MCMining_FW.this);
        }

        protected void call() {
            MCMiningManager mgr = MCMiningManager.getManager();
            MCMiningAgent agent = MCMiningAgent.getAgent();
            FCM_MINING_TASK_R taskR = null;
            MCList taskL = MCList.create(FCM_MINING_TASK_R.class);
            MCList paramL = MCList.create(FCM_MINING_TASK_PARAM_R.class);
            TaskCondR reqR = TaskCondR.create();
            reqR.task_id(this.up0().task_id());
            mgr.getTask(reqR, taskL, null, paramL, null);
            if (taskL.size() != 1) {
                throw new MCException(Core_Msg_FW_A.FCBAC0455, new Object[]{reqR.task_id()});
            }
            taskR = (FCM_MINING_TASK_R)taskL.get(0);
            if (taskR.inv_flg()) {
                throw new MCException(Core_Msg_FW_A.FCBAC0455, new Object[]{reqR.task_id()});
            }
            MCList miningL = MCList.create(FCM_MINING_R.class);
            MCList condL = MCList.create(FCM_MINING_CONDITION_R.class);
            MCList methodL = MCList.create(FCM_MINING_METHOD_R.class);
            MCList sumcondL = MCList.create(FCM_MINING_SUMCOND_R.class);
            MCList<CondR> taskcondL = this.convConditon(taskR.mining_id(), (MCList<FCM_MINING_TASK_PARAM_R>)paramL);
            MCList<MCRow> rsltL = agent.mining(taskR.mining_id(), taskcondL, miningL, condL, methodL, sumcondL);
            this.setEditConditionValue((MCList<FCM_MINING_CONDITION_R>)condL, taskcondL);
            MCMiningTaskPlugin plugin = MCMiningManager.getManager().createTaskPlugin(taskR.task_typ());
            plugin.exec(taskR, paramL, rsltL, this, (FCM_MINING_R)miningL.get(0), condL, methodL, sumcondL);
        }

        protected MCList<CondR> convConditon(String mining_id, MCList<FCM_MINING_TASK_PARAM_R> paramL) {
            MCList condL = MCList.create(CondR.class);
            if (paramL.size() <= 0) {
                return condL;
            }
            MCList miningCondL = MCList.create(FCM_MINING_CONDITION_R.class);
            InfoCondR infoR = InfoCondR.create();
            infoR.mining_id(mining_id);
            MCMiningManager.getManager().getInfo(infoR, null, miningCondL, null, null);
            MCIndexKey idxkey = miningCondL.createIndex(new String[]{"col_id"});
            block14: for (FCM_MINING_TASK_PARAM_R paramR : paramL) {
                String key = paramR.param_key();
                String col = MCMiningUtil.getTaskCondColumn((String)key);
                if (col == null) continue;
                FCM_MINING_CONDITION_R miningCondR = (FCM_MINING_CONDITION_R)miningCondL.getFirst(idxkey, new Comparable[]{col});
                if (miningCondR == null) continue;
                MCValueSupply vs = MCValueSupply.create((String)col, (String)miningCondR.col_nm(), (String)miningCondR.data_typ(), (boolean)false, (boolean)false);
                vs.loadParamValue(paramR.param_val());
                CondR condR = (CondR)condL.createRow();
                condR.item(col);
                switch (vs.type()) {
                    case "1": {
                        condR.strval((String)((Object)vs.value()));
                        break;
                    }
                    case "2": {
                        condR.numval((MCNumber)vs.value());
                        break;
                    }
                    case "5": {
                        condR.booval((Boolean)vs.value());
                        break;
                    }
                    case "3": {
                        condR.dtval((MCDate)vs.value());
                        break;
                    }
                    case "4": {
                        condR.tsval((MCTimestamp)vs.value());
                        break;
                    }
                    default: {
                        continue block14;
                    }
                }
                condL.add((MCRow)condR);
            }
            return condL;
        }

        protected void setEditConditionValue(MCList<FCM_MINING_CONDITION_R> condL, MCList<CondR> taskcondL) {
            MCIndexKey idxkey = taskcondL.createIndex(new String[]{"item"});
            for (FCM_MINING_CONDITION_R condR : condL) {
                if (!condR.editable_flg()) continue;
                String col = condR.col_id();
                String typ = condR.data_typ();
                CondR taskcondR = (CondR)taskcondL.getFirst(idxkey, new Comparable[]{col});
                if (taskcondR == null) continue;
                String val = null;
                switch (typ) {
                    case "1": {
                        val = MCMiningUtil.toConditionInitValue((String)taskcondR.strval());
                        break;
                    }
                    case "2": {
                        val = MCMiningUtil.toConditionInitValue((MCNumber)taskcondR.numval());
                        break;
                    }
                    case "5": {
                        val = MCMiningUtil.toConditionInitValue((boolean)taskcondR.booval());
                        break;
                    }
                    case "3": {
                        val = MCMiningUtil.toConditionInitValue((MCDate)taskcondR.dtval());
                        break;
                    }
                    case "4": {
                        val = MCMiningUtil.toConditionInitValue((MCTimestamp)taskcondR.tsval());
                    }
                }
                condR.init_val(val);
            }
        }
    }
}

