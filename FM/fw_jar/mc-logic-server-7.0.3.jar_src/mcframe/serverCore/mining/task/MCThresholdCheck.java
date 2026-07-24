/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDataMatcher
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.serverCore.dashboard.MCValueSupply
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.logic.MCOperation
 */
package mcframe.serverCore.mining.task;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDataMatcher;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.dashboard.MCValueSupply;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mining.MCMiningAgent;
import mcframe.serverCore.mining.task.MCMiningTaskPlugin;

public class MCThresholdCheck
implements MCMiningTaskPlugin {
    @Override
    public String getPreferenceEditor() {
        return "FS.FSBAP0870";
    }

    @Override
    public boolean usePush() {
        return true;
    }

    @Override
    public void chkTask(FCM_MINING_TASK_R taskR, FCM_MINING_R miningR) {
    }

    @Override
    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R, T11 extends FCM_MINING_TASK_R, T13 extends FCM_MINING_TASK_PARAM_R> void exec(T11 taskR, MCList<T13> paramL, MCList<MCRow> rsltL, MCOperation ope, T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        FCM_MINING_TASK_PARAM_R colR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst("param_key", (Comparable)((Object)"threshold.col"));
        MCValueSupply col_vs = MCValueSupply.create((String)colR.param_key(), null, (String)"1", (boolean)false, (boolean)false);
        col_vs.loadParamValue(colR.param_val());
        String col = (String)((Object)col_vs.value());
        FCM_MINING_TASK_PARAM_R valR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst("param_key", (Comparable)((Object)"threshold.val"));
        MCValueSupply val_vs = MCValueSupply.create((String)valR.param_key(), null, (String)"2", (boolean)false, (boolean)false);
        val_vs.loadParamValue(valR.param_val());
        MCNumber val = (MCNumber)val_vs.value();
        FCM_MINING_TASK_PARAM_R relR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst("param_key", (Comparable)((Object)"threshold.rel"));
        MCValueSupply rel_vs = MCValueSupply.create((String)relR.param_key(), null, (String)"1", (boolean)false, (boolean)false);
        rel_vs.loadParamValue(relR.param_val());
        String rel = (String)((Object)rel_vs.value());
        boolean over = false;
        MCDataMatcher matcher = MCDataMatcher.create((MCNumber)val, (String)rel);
        for (MCRow rsltR : rsltL) {
            MCNumber a = rsltR.getNumber(col);
            if (!matcher.match((Comparable)a)) continue;
            over = true;
            break;
        }
        if (over) {
            MCMiningAgent.getAgent().pushTaskMessage(taskR, paramL, miningR, condL, ope);
        }
    }
}

