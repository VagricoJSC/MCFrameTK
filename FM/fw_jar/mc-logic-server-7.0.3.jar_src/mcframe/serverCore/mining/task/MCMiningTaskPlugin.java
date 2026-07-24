/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
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
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.logic.MCOperation;

public interface MCMiningTaskPlugin {
    public void chkTask(FCM_MINING_TASK_R var1, FCM_MINING_R var2);

    default public String getPreferenceEditor() {
        return null;
    }

    default public boolean usePush() {
        return false;
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R, T11 extends FCM_MINING_TASK_R, T13 extends FCM_MINING_TASK_PARAM_R> void exec(T11 var1, MCList<T13> var2, MCList<MCRow> var3, MCOperation var4, T1 var5, MCList<T2> var6, MCList<T3> var7, MCList<T4> var8);
}

