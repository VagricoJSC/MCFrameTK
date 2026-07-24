/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMAGStringExpr
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDExpr
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMExpr
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMPermColumn
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDateAgg
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCTempView
 */
package mcframe.serverCore.mining;

import mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;

public class Query {
    static IFMCSQL.MCMainQuery FCBAL0030_FCT_MINING_TASK_LOG_S01() {
        FCT_MINING_TASK_LOG_R S0T1 = FCT_MINING_TASK_LOG_R.create((String)"T1");
        IFMCSQL.MCTempView S0T2 = IFMCSQL.createTempView((String)"T2");
        FCT_MINING_TASK_LOG_R S1 = FCT_MINING_TASK_LOG_R.create();
        return (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FCBAL0030_FCT_MINING_TASK_LOG_S01").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S0T1.task_id, S0T1.sche_id, S0T1.sche_dt, S0T1.srv_id, S0T1.start_dt, S0T1.end_dt, S0T1.msg_id, S0T1.msg_bind}).from((IFMCSQL.MCDerivedView)S0T1.innerJoin(IFMCSQL.subQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S1.task_id, ((IFMCSQL.MCDateAgg)IFMCSQL.max((IFMCFMSQL.MCFMExpr)S1.start_dt)).as("last_dt")}).from((IFMCSQL.MCDerivedView)S1).groupBy(new IFMCFMSQL.MCFMEDExpr[]{S1.task_id}).view(S0T2)).on(S0T1.task_id.eq((Object)((IFMCFMSQL.MCFMAGStringExpr)S0T2.pr((IFMCFMSQL.MCFMPermColumn)S1.task_id))).and(S0T1.start_dt.eq((Object)S0T2.pr("last_dt"))).and(S0T1.end_dt.isNull())))).where(IFMCSQL.value((int)0).eq((Object)IFMCSQL.value((int)0)));
    }
}

