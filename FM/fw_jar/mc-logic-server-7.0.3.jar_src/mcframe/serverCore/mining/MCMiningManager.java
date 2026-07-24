/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRowMatcher
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCNumberUtil
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.commonCore.notice.MCMessageList
 *  mcframe.commonCore.param.MCParam
 *  mcframe.commonCore.requester.MCClusterServerRole
 *  mcframe.commonCore.requester.MCControlRequester
 *  mcframe.commonCore.requester.MCParamHeaderUtil
 *  mcframe.commonCore.sys.MCFactory
 *  mcframe.commonCore.sys.MCThreadFactory
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_SCHE_R
 *  mcframe.serverCore.dbc.FCM_SERVER_R
 *  mcframe.serverCore.dbc.FCT_MINING_GADGET_CACHE_R
 *  mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.mcjdbc.CoreSql
 *  mcframe.serverCore.mcjdbc.MCLockTableMode
 *  mcframe.serverCore.mcjdbc.MCSavepoint
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.notice.MCMessagePool
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCExprColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPredicate
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.requester.MCClusterManager
 *  mcframe.serverCore.requester.MCClusterRequester
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.mining;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCNumberUtil;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.requester.MCClusterServerRole;
import mcframe.commonCore.requester.MCControlRequester;
import mcframe.commonCore.requester.MCParamHeaderUtil;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.sys.MCThreadFactory;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_SCHE_R;
import mcframe.serverCore.dbc.FCM_SERVER_R;
import mcframe.serverCore.dbc.FCT_MINING_GADGET_CACHE_R;
import mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mcjdbc.CoreSql;
import mcframe.serverCore.mcjdbc.MCLockTableMode;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mining.MCMiningAgent;
import mcframe.serverCore.mining.MCMiningTask;
import mcframe.serverCore.mining.ctrl.InfoCondR;
import mcframe.serverCore.mining.ctrl.MCMining;
import mcframe.serverCore.mining.ctrl.MCMining_FW;
import mcframe.serverCore.mining.ctrl.TaskCondR;
import mcframe.serverCore.mining.ctrl.TaskReqR;
import mcframe.serverCore.mining.task.MCMiningTaskPlugin;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.requester.MCClusterManager;
import mcframe.serverCore.requester.MCClusterRequester;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.util.MCDBUtil;

public class MCMiningManager {
    private static MCMiningManager _mgr = null;
    private static Map<String, MCMiningTask> _taskMap = new HashMap<String, MCMiningTask>();
    private ScheduledThreadPoolExecutor _scheduler = null;
    private AtomicInteger _next = new AtomicInteger(0);

    public static MCMiningManager getManager() {
        if (_mgr == null) {
            _mgr = new MCMiningManager();
        }
        return _mgr;
    }

    private MCMiningManager() {
    }

    private <D extends MCDBContainer, M extends D> void chkUpdCntr(D dbR, M modR) {
        if (modR == null) {
            throw new MCException(Core_Msg_FW_A.FCBCC0035, new Object[]{"miming:chkupdcntr", "0"});
        }
        if (dbR == null) {
            throw new MCException(Core_Msg_FW_A.FCBCC0035, new Object[]{"miming:chkupdcntr", "1"});
        }
        if (!MCNumberUtil.eq((MCNumber)dbR.getNumber("upd_cntr"), (MCNumber)modR.getNumber("upd_cntr"))) {
            throw new MCException(Core_Msg_FW_A.FCBCC0035, new Object[]{"miming:chkupdcntr", "2"});
        }
    }

    private MCNumber getUpdCntr(Class<? extends MCDBContainer> dbRow, MCRow bind) {
        MCDBContainer row = (MCDBContainer)MCFactory.invokeStatic(dbRow, (String)"create", null, null);
        int cnt = MCDBUtil.dbSelectKey((String)"MCMiningManager_UpdCntr_S01", (MCRow)row, (MCDBContainer)row, (MCRow)bind);
        return cnt == 1 ? row.getNumber("upd_cntr") : null;
    }

    MCNumber getSequence(String seqname) {
        MCRow r = MCRow.create();
        r.addNumberColumn("VAL");
        String sql = CoreSql.get().getSequenceSql(seqname);
        MCTransactionManager.dbTran().statement().executeQuery("MCMiningManager_Sequence_S01", sql, null, null, null, r);
        return r.getNumber("VAL");
    }

    String getSequence(String seqname, String format) {
        return this.getSequence(seqname).toString(format);
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> boolean getInfo(InfoCondR cond, MCList<T1> miningL, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        boolean acl_sys;
        MCList baseL = miningL != null ? miningL.createInstance() : MCList.create(FCM_MINING_R.class);
        FCM_MINING_R t1 = FCM_MINING_R.create((String)"T");
        MCQueryApiBuilder baseL_bldr = MCQueryApiBuilder.create((MCDBContainer)t1);
        if (cond != null) {
            String user;
            if (cond.mining_id() != null) {
                baseL_bldr.addWhereWithAnd(t1.mining_id.eq((Object)IFMCSQL.value((String)cond.mining_id())), new Comparable[0]);
            }
            if ((user = cond.user_id()) != null) {
                IFMCSQL.MCPredicate p = null;
                p = t1.public_lv.eq((Object)IFMCSQL.value((String)"?ALL"));
                if (!"?ALL".equals(user)) {
                    IFMCSQL.MCPredicate cp = t1.public_lv.eq((Object)IFMCSQL.value((String)"?EXT"));
                    if (cond.co_cd() != null) {
                        cp = cp.and(t1.co_cd.eq((Object)IFMCSQL.value((String)cond.co_cd())));
                    }
                    p = p.or(IFMCSQL.bracket((IFMCSQL.MCPredicate)cp));
                    if (!"?EXT".equals(user)) {
                        p = p.or(t1.public_lv.eq((Object)IFMCSQL.value((String)user)));
                    }
                }
                baseL_bldr.addWhereWithAnd(IFMCSQL.bracket((IFMCSQL.MCPredicate)p), new Comparable[0]);
            }
        }
        baseL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t1.mining_id});
        baseL_bldr.setSelectAll();
        MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_S01", (MCList)baseL, (MCQueryApiBuilder)baseL_bldr);
        boolean acl_co = cond != null ? cond.acl_co() : false;
        boolean bl = acl_sys = cond != null ? cond.acl_sys() : false;
        if (acl_co || acl_sys) {
            MCRowMatcher<T1> matcher = this.getACLMatcher(acl_co, acl_sys);
            baseL = baseL.subList(matcher);
        }
        if (baseL.size() <= 0) {
            return false;
        }
        if (miningL != null) {
            miningL.clear();
            miningL.addAll((Collection)baseL);
        }
        if (condL != null) {
            condL.clear();
            FCM_MINING_CONDITION_R t2 = FCM_MINING_CONDITION_R.create((String)"T");
            MCQueryApiBuilder condL_bldr = MCQueryApiBuilder.create((MCDBContainer)t2);
            condL_bldr.setWhere(t2.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), new Comparable[0]);
            condL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t2.mining_id, t2.list_order});
            MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_CONDITION_S01", condL, (MCQueryApiBuilder)condL_bldr, (MCList)baseL);
        }
        if (methodL != null) {
            methodL.clear();
            FCM_MINING_METHOD_R t3 = FCM_MINING_METHOD_R.create((String)"T");
            MCQueryApiBuilder methodL_bldr = MCQueryApiBuilder.create((MCDBContainer)t3);
            methodL_bldr.setWhere(t3.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), new Comparable[0]);
            methodL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t3.mining_id, t3.list_order});
            MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_METHOD_S01", methodL, (MCQueryApiBuilder)methodL_bldr, (MCList)baseL);
        }
        if (sumcondL != null) {
            sumcondL.clear();
            FCM_MINING_SUMCOND_R t4 = FCM_MINING_SUMCOND_R.create((String)"T");
            MCQueryApiBuilder sumcondL_bldr = MCQueryApiBuilder.create((MCDBContainer)t4);
            sumcondL_bldr.setWhere(t4.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), new Comparable[0]);
            sumcondL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t4.mining_id, t4.list_order});
            MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_SUMCOND_S01", sumcondL, (MCQueryApiBuilder)sumcondL_bldr, (MCList)baseL);
        }
        return true;
    }

    private <T1 extends FCM_MINING_R> MCRowMatcher<T1> getACLMatcher(boolean co, boolean sys) {
        return new MCRowMatcher<T1>(co, sys){
            private MCRowMatcher<T1> forCheck;
            {
                this.forCheck = bl && bl2 ? new MCRowMatcher<T1>(){

                    public boolean match(T1 row) {
                        String lv = row.public_lv();
                        return MCStringUtil.eq((String)lv, (String)"?EXT") || MCStringUtil.eq((String)lv, (String)"?ALL");
                    }
                } : (bl ? new MCRowMatcher<T1>(){

                    public boolean match(T1 row) {
                        String lv = row.public_lv();
                        return MCStringUtil.eq((String)lv, (String)"?EXT");
                    }
                } : (bl2 ? new MCRowMatcher<T1>(){

                    public boolean match(T1 row) {
                        String lv = row.public_lv();
                        return MCStringUtil.eq((String)lv, (String)"?ALL");
                    }
                } : new MCRowMatcher<T1>(){

                    public boolean match(T1 row) {
                        return false;
                    }
                }));
            }

            public boolean match(T1 row) {
                if (this.forCheck.match(row)) {
                    try {
                        MCMiningAgent.getAgent().checkACL(row.module_id(), row.logic_id(), row.operation_id(), row.func_typ());
                    }
                    catch (MCException mCException) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public MCList<FCM_MINING_R> delInfo(String ... ids) {
        if (ids == null || ids.length <= 0) {
            return null;
        }
        MCList miningL = MCList.create(FCM_MINING_R.class);
        FCM_MINING_R t = FCM_MINING_R.create((String)"T");
        MCQueryApiBuilder miningL_bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        int i = 0;
        while (i < ids.length) {
            String id = ids[i];
            if (id != null) {
                if (i == 0) {
                    miningL_bldr.setWhere(t.mining_id.eq((Object)IFMCSQL.value((String)id)), new Comparable[0]);
                } else {
                    miningL_bldr.addWhereWithOr(t.mining_id.eq((Object)IFMCSQL.value((String)id)), new Comparable[0]);
                }
            }
            ++i;
        }
        if (MCDBUtil.dbSelectForUpdate((String)"MCMiningManager_FCM_MINING_S02", (MCList)miningL, (MCQueryApiBuilder)miningL_bldr) > 0) {
            MCDBUtil.dbDeleteKey((String)"MCMiningManager_FCM_MINING_D01", (MCList)miningL, (MCDBContainer)t);
            FCM_MINING_CONDITION_R tc = FCM_MINING_CONDITION_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_CONDITION_D01", (MCDBContainer)tc, (IFMCSQL.MCPredicate)tc.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            FCM_MINING_METHOD_R tm = FCM_MINING_METHOD_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_METHOD_D01", (MCDBContainer)tm, (IFMCSQL.MCPredicate)tm.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            FCM_MINING_SUMCOND_R ts = FCM_MINING_SUMCOND_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_SUMCOND_D01", (MCDBContainer)ts, (IFMCSQL.MCPredicate)ts.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            String[] dels = miningL.getString("mining_id").toArray(new String[miningL.size()]);
            this.delTaskWithData(null, dels);
        }
        return miningL;
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> MCNumber addInfo(T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        this.chkInfo(miningR, condL, methodL, sumcondL);
        String id = this.createMiningID(miningR.public_lv());
        miningR.mining_id(id);
        int cond = 0;
        for (FCM_MINING_CONDITION_R condR : condL) {
            condR.mining_id(id);
            condR.list_order(cond++);
        }
        int meth = 0;
        for (FCM_MINING_METHOD_R methodR : methodL) {
            methodR.mining_id(id);
            methodR.list_order(meth++);
        }
        sumcondL.setString("mining_id", id);
        try {
            FCM_MINING_R t1 = FCM_MINING_R.create((String)"T");
            MCQueryApiBuilder miningR_bldr = MCQueryApiBuilder.create((MCDBContainer)t1);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_I01", miningR, (MCQueryApiBuilder)miningR_bldr);
        }
        catch (MCException e) {
            if (e.getID().equals(Core_Msg_FW_A.FCBCC0136)) {
                throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0447, new Object[0]);
            }
            throw e;
        }
        FCM_MINING_CONDITION_R t2 = FCM_MINING_CONDITION_R.create((String)"T");
        MCQueryApiBuilder condL_bldr = MCQueryApiBuilder.create((MCDBContainer)t2);
        MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_CONDITION_I01", condL, (MCQueryApiBuilder)condL_bldr);
        FCM_MINING_METHOD_R t3 = FCM_MINING_METHOD_R.create((String)"T");
        MCQueryApiBuilder methodL_bldr = MCQueryApiBuilder.create((MCDBContainer)t3);
        MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_METHOD_I01", methodL, (MCQueryApiBuilder)methodL_bldr);
        FCM_MINING_SUMCOND_R t4 = FCM_MINING_SUMCOND_R.create((String)"T");
        MCQueryApiBuilder sumcondL_bldr = MCQueryApiBuilder.create((MCDBContainer)t4);
        MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_SUMCOND_I01", sumcondL, (MCQueryApiBuilder)sumcondL_bldr);
        return this.getUpdCntr((Class<? extends MCDBContainer>)FCM_MINING_R.class, (MCRow)miningR);
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> MCNumber putInfo(T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        this.chkInfo(miningR, condL, methodL, sumcondL);
        FCM_MINING_R r = FCM_MINING_R.create();
        FCM_MINING_R t1 = FCM_MINING_R.create((String)"T1");
        int cnt = MCDBUtil.dbSelectKeyForUpdateNoWait((String)"MCMiningManager_FCM_MINING_S03", (MCRow)r, (MCDBContainer)t1, miningR);
        if (cnt == 0) {
            r = null;
        }
        this.chkUpdCntr(r, miningR);
        int cond = 0;
        for (FCM_MINING_CONDITION_R condR : condL) {
            condR.list_order(cond++);
        }
        int meth = 0;
        for (FCM_MINING_METHOD_R methodR : methodL) {
            methodR.list_order(meth++);
        }
        try {
            MCList miningL = MCList.create(FCM_MINING_R.class);
            miningL.add(miningR);
            FCM_MINING_CONDITION_R t2 = FCM_MINING_CONDITION_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_CONDITION_D02", (MCDBContainer)t2, (IFMCSQL.MCPredicate)t2.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            FCM_MINING_METHOD_R t3 = FCM_MINING_METHOD_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_METHOD_D02", (MCDBContainer)t3, (IFMCSQL.MCPredicate)t3.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            FCM_MINING_SUMCOND_R t4 = FCM_MINING_SUMCOND_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_SUMCOND_D02", (MCDBContainer)t4, (IFMCSQL.MCPredicate)t4.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)miningL);
            MCQueryApiBuilder miningR_bldr = MCQueryApiBuilder.create((MCDBContainer)t1);
            MCDBUtil.dbUpdateKey((String)"MCMiningManager_FCM_MINING_U01", miningR, (MCQueryApiBuilder)miningR_bldr);
            MCQueryApiBuilder condL_bldr = MCQueryApiBuilder.create((MCDBContainer)t2);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_CONDITION_I02", condL, (MCQueryApiBuilder)condL_bldr);
            MCQueryApiBuilder methodL_bldr = MCQueryApiBuilder.create((MCDBContainer)t3);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_METHOD_I02", methodL, (MCQueryApiBuilder)methodL_bldr);
            MCQueryApiBuilder sumcondL_bldr = MCQueryApiBuilder.create((MCDBContainer)t4);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_SUMCOND_I02", sumcondL, (MCQueryApiBuilder)sumcondL_bldr);
        }
        catch (MCException e) {
            if (e.getID().equals(Core_Msg_FW_A.FCBCC0136)) {
                throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0447, new Object[0]);
            }
            throw e;
        }
        if (!miningR.gadget_cache_flg()) {
            this.delTaskWithData("0", miningR.mining_id());
        }
        return this.getUpdCntr((Class<? extends MCDBContainer>)FCM_MINING_R.class, (MCRow)miningR);
    }

    public <T3 extends FCM_MINING_METHOD_R> void checkMethodRelation(MCList<T3> methodL) {
        MCMessageList list = new MCMessageList();
        LinkedHashSet<String> idSet = new LinkedHashSet<String>();
        for (FCM_MINING_METHOD_R methodR : methodL) {
            idSet.add(methodR.mining_id());
        }
        for (String id : idSet) {
            try {
                this.checkMethodRelation(id, methodL);
            }
            catch (MCException e) {
                if (!Core_Msg_FW_A.FCBAC0477.equals(e.getID())) {
                    throw e;
                }
                list.addAll((Collection)e.getCauseMessageList());
            }
        }
        if (!list.isEmpty()) {
            MCException e = new MCException(Core_Msg_FW_A.FCBAC0477, new Object[0]);
            e.addCauseMessageList(list);
            throw e;
        }
    }

    public <T3 extends FCM_MINING_METHOD_R> void checkMethodRelation(String mining_id, MCList<T3> methodL) {
        MCMessageList list = new MCMessageList();
        methodL = methodL.subList(new String[]{"mining_id", "inv_flg"}, new Comparable[]{mining_id, Boolean.FALSE});
        int group_size = methodL.subList("sum_info_typ", (Comparable)((Object)"1")).size();
        int aftercalc_size = methodL.subList("sum_info_typ", (Comparable)((Object)"7")).size();
        if (aftercalc_size > 0 && group_size + aftercalc_size == methodL.size()) {
            list.add(new MCMessage(Core_Msg_FW_A.FCBAC0478, new Object[]{mining_id}));
        }
        if (!list.isEmpty()) {
            MCException e = new MCException(Core_Msg_FW_A.FCBAC0477, new Object[0]);
            e.addCauseMessageList(list);
            throw e;
        }
    }

    private String createMiningID(String public_lv) {
        String prefix;
        block10: {
            prefix = "$";
            if (public_lv == null) break block10;
            switch (public_lv) {
                case "?EXT": {
                    prefix = "@";
                    break;
                }
                case "?ALL": {
                    prefix = "#";
                }
            }
        }
        return String.valueOf(prefix) + this.getSequence("FCS_MINING", "0000000000000000000000000000");
    }

    private <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> void chkInfo(T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        String mid = miningR.module_id();
        String lid = miningR.logic_id();
        String oid = miningR.operation_id();
        MCMiningAgent.getAgent().createMiningOperation(mid, lid, oid);
        this.checkMethodRelation(miningR.mining_id(), methodL);
        if (miningR.gadget_cache_flg()) {
            String pub = miningR.public_lv();
            if (!"?EXT".equals(pub) && !"?ALL".equals(pub)) {
                throw new MCException(Core_Msg_FW_A.FCBAC0456, new Object[]{miningR.mining_id(), miningR.mining_nm()});
            }
            if (!MCStringUtil.isNull((String)miningR.mining_id())) {
                for (FCM_MINING_CONDITION_R condR : condL) {
                    if (!condR.editable_flg()) continue;
                    throw new MCException(Core_Msg_FW_A.FCBAC0457, new Object[]{miningR.mining_id(), miningR.mining_nm()});
                }
            }
        }
    }

    private MCList<FCM_MINING_TASK_R> delTaskWithData(String type, String ... ids) {
        MCList<FCM_MINING_TASK_R> delL = this.delTaskForInfo(type, ids);
        if (("0".equals(type) || type == null) && ids != null && ids.length > 0) {
            MCList gadL = MCList.create(FCT_MINING_GADGET_CACHE_R.class);
            String[] stringArray = ids;
            int n = ids.length;
            int n2 = 0;
            while (n2 < n) {
                String id = stringArray[n2];
                FCT_MINING_GADGET_CACHE_R gadR = (FCT_MINING_GADGET_CACHE_R)gadL.add();
                gadR.mining_id(id);
                ++n2;
            }
            FCT_MINING_GADGET_CACHE_R t = FCT_MINING_GADGET_CACHE_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCT_MINING_GADGET_CACHE_D01", (MCDBContainer)t, (IFMCSQL.MCPredicate)t.mining_id.eq((Object)IFMCSQL.bind((String)"mining_id")), (MCList)gadL);
        }
        return delL;
    }

    public <T11 extends FCM_MINING_TASK_R, T12 extends FCM_MINING_TASK_SCHE_R, T13 extends FCM_MINING_TASK_PARAM_R> boolean getTask(TaskCondR cond, MCList<T11> taskL, MCList<T12> scheL, MCList<T13> paramL, MCList<T13> propL) {
        MCList baseL = taskL != null ? taskL.createInstance() : MCList.create(FCM_MINING_TASK_R.class);
        FCM_MINING_TASK_R t11 = FCM_MINING_TASK_R.create((String)"T");
        FCM_MINING_R t11m01 = FCM_MINING_R.create((String)"M01");
        MCQueryApiBuilder baseL_bldr = MCQueryApiBuilder.create((MCDBContainer)t11);
        if (cond != null) {
            String cocd;
            String user;
            String mining;
            String task = cond.task_id();
            if (task != null) {
                baseL_bldr.addWhereWithAnd(t11.task_id.eq((Object)IFMCSQL.value((String)task)), new Comparable[0]);
            }
            if ((mining = cond.mining_id()) != null) {
                baseL_bldr.addWhereWithAnd(t11.mining_id.eq((Object)IFMCSQL.value((String)mining)), new Comparable[0]);
            }
            if ((user = cond.user_id()) != null) {
                baseL_bldr.addWhereWithAnd(t11.user_id.eq((Object)IFMCSQL.value((String)user)), new Comparable[0]);
            }
            if ((cocd = cond.co_cd()) != null) {
                baseL_bldr.addWhereWithAnd(t11.co_cd.eq((Object)IFMCSQL.value((String)cocd)), new Comparable[0]);
            }
        }
        baseL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t11.co_cd, t11m01.mining_nm, t11.mining_id});
        baseL_bldr.setSelectAll();
        MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_TASK_S01", (MCList)baseL, (MCQueryApiBuilder)baseL_bldr);
        if (baseL.size() <= 0) {
            return false;
        }
        if (taskL != null) {
            taskL.clear();
            taskL.addAll((Collection)baseL);
        }
        if (scheL != null) {
            scheL.clear();
            FCM_MINING_TASK_SCHE_R t12 = FCM_MINING_TASK_SCHE_R.create((String)"T");
            MCQueryApiBuilder scheL_bldr = MCQueryApiBuilder.create((MCDBContainer)t12);
            scheL_bldr.setWhere(t12.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), new Comparable[0]);
            scheL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t12.task_id, t12.description});
            MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_TASK_SCHE_S01", scheL, (MCQueryApiBuilder)scheL_bldr, (MCList)baseL);
        }
        if (paramL != null) {
            paramL.clear();
            FCM_MINING_TASK_PARAM_R t13 = FCM_MINING_TASK_PARAM_R.create((String)"T");
            MCQueryApiBuilder paramL_bldr = MCQueryApiBuilder.create((MCDBContainer)t13);
            paramL_bldr.setWhere(t13.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), new Comparable[0]);
            paramL_bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{t13.task_id, t13.param_key});
            MCDBUtil.dbSelect((String)"MCMiningManager_FCM_MINING_TASK_PARAM_S01", paramL, (MCQueryApiBuilder)paramL_bldr, (MCList)baseL);
        }
        if (propL != null) {
            for (FCM_MINING_TASK_R baseR : baseL) {
                FCM_MINING_TASK_PARAM_R propR;
                MCMiningTaskPlugin plugin = this.createTaskPlugin(baseR.task_typ());
                String pref_id = plugin.getPreferenceEditor();
                if (pref_id != null) {
                    propR = (FCM_MINING_TASK_PARAM_R)propL.add();
                    propR.task_id(baseR.task_id());
                    propR.param_key("preference");
                    propR.param_val(pref_id);
                }
                propR = (FCM_MINING_TASK_PARAM_R)propL.add();
                propR.param_key("push");
                propR.param_val(Boolean.toString(plugin.usePush()));
            }
        }
        return true;
    }

    public MCList<FCM_MINING_TASK_R> delTask(String ... ids) {
        return this.delTaskImpl(null, "task_id", (Comparable<?>[])ids);
    }

    public MCList<FCM_MINING_TASK_R> delTaskForInfo(String type, String ... ids) {
        return this.delTaskImpl(type, "mining_id", (Comparable<?>[])ids);
    }

    private MCList<FCM_MINING_TASK_R> delTaskImpl(String type, String col, Comparable<?> ... vals) {
        MCList taskL = MCList.create(FCM_MINING_TASK_R.class);
        FCM_MINING_TASK_R t11 = FCM_MINING_TASK_R.create((String)"T");
        MCQueryApiBuilder taskL_bldr = MCQueryApiBuilder.create((MCDBContainer)t11);
        if (type != null) {
            taskL_bldr.addWhereWithAnd(t11.task_typ.eq((Object)IFMCSQL.value((String)type)), new Comparable[0]);
        }
        if (col != null) {
            ArrayList bind = new ArrayList();
            if (vals != null) {
                int i = 0;
                while (i < vals.length) {
                    Comparable<?> val = vals[i];
                    if (val != null) {
                        bind.add(val);
                    }
                    ++i;
                }
            }
            if (bind.size() <= 0) {
                return MCList.create(FCM_MINING_TASK_R.class);
            }
            taskL_bldr.addWhereInWithAnd(t11.getColumn$(col), bind);
        }
        if (MCDBUtil.dbSelectForUpdate((String)"MCMiningManager_FCM_MINING_TASK_S02", (MCList)taskL, (MCQueryApiBuilder)taskL_bldr) > 0) {
            MCDBUtil.dbDeleteKey((String)"MCMiningManager_FCM_MINING_TASK_D01", (MCList)taskL, (MCDBContainer)t11);
            FCT_MINING_TASK_LOG_R tl = FCT_MINING_TASK_LOG_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCT_MINING_TASK_LOG_D01", (MCDBContainer)tl, (IFMCSQL.MCPredicate)tl.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), (MCList)taskL);
            FCM_MINING_TASK_SCHE_R ts = FCM_MINING_TASK_SCHE_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_TASK_SCHE_D01", (MCDBContainer)ts, (IFMCSQL.MCPredicate)ts.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), (MCList)taskL);
            FCM_MINING_TASK_PARAM_R tp = FCM_MINING_TASK_PARAM_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_TASK_PARAM_D01", (MCDBContainer)tp, (IFMCSQL.MCPredicate)tp.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), (MCList)taskL);
            this.requestAfterTaskModify(() -> {
                String[] ids = taskL.getString("task_id").toArray(new String[taskL.size()]);
                this.cancelTask(ids);
            });
        }
        return taskL;
    }

    public <T11 extends FCM_MINING_TASK_R, T12 extends FCM_MINING_TASK_SCHE_R, T13 extends FCM_MINING_TASK_PARAM_R> MCNumber addTask(T11 taskR, MCList<T12> scheL, MCList<T13> paramL) {
        this.chkTask(taskR);
        String id = this.createTaskID();
        taskR.task_id(id);
        for (FCM_MINING_TASK_SCHE_R scheR : scheL) {
            scheR.task_id(id);
        }
        for (FCM_MINING_TASK_PARAM_R paramR : paramL) {
            paramR.task_id(id);
        }
        try {
            FCM_MINING_TASK_R t11 = FCM_MINING_TASK_R.create((String)"T");
            MCQueryApiBuilder taskR_bldr = MCQueryApiBuilder.create((MCDBContainer)t11);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_TASK_I01", taskR, (MCQueryApiBuilder)taskR_bldr);
        }
        catch (MCException e) {
            if (e.getID().equals(Core_Msg_FW_A.FCBCC0136)) {
                throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0447, new Object[0]);
            }
            throw e;
        }
        FCM_MINING_TASK_SCHE_R t12 = FCM_MINING_TASK_SCHE_R.create((String)"T");
        MCQueryApiBuilder scheL_bldr = MCQueryApiBuilder.create((MCDBContainer)t12);
        MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_TASK_SCHE_I01", scheL, (MCQueryApiBuilder)scheL_bldr);
        FCM_MINING_TASK_PARAM_R t13 = FCM_MINING_TASK_PARAM_R.create((String)"T");
        MCQueryApiBuilder paramL_bldr = MCQueryApiBuilder.create((MCDBContainer)t13);
        MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_TASK_PARAM_I01", paramL, (MCQueryApiBuilder)paramL_bldr);
        this.requestAfterTaskModify(() -> this.scheduleTask(taskR.task_id()));
        return this.getUpdCntr((Class<? extends MCDBContainer>)FCM_MINING_TASK_R.class, (MCRow)taskR);
    }

    public <T11 extends FCM_MINING_TASK_R, T12 extends FCM_MINING_TASK_SCHE_R, T13 extends FCM_MINING_TASK_PARAM_R> MCNumber putTask(T11 taskR, MCList<T12> scheL, MCList<T13> paramL) {
        this.chkTask(taskR);
        FCM_MINING_TASK_R r = FCM_MINING_TASK_R.create();
        FCM_MINING_TASK_R t11 = FCM_MINING_TASK_R.create((String)"T1");
        int cnt = MCDBUtil.dbSelectKeyForUpdateNoWait((String)"MCMiningManager_FCM_MINING_TASK_S03", (MCRow)r, (MCDBContainer)t11, taskR);
        if (cnt == 0) {
            r = null;
        }
        this.chkUpdCntr(r, taskR);
        try {
            MCList taskL = MCList.create(FCM_MINING_TASK_R.class);
            taskL.add(taskR);
            FCM_MINING_TASK_SCHE_R t12 = FCM_MINING_TASK_SCHE_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_TASK_SCHE_D02", (MCDBContainer)t12, (IFMCSQL.MCPredicate)t12.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), (MCList)taskL);
            FCM_MINING_TASK_PARAM_R t13 = FCM_MINING_TASK_PARAM_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCM_MINING_TASK_PARAM_D02", (MCDBContainer)t13, (IFMCSQL.MCPredicate)t13.task_id.eq((Object)IFMCSQL.bind((String)"task_id")), (MCList)taskL);
            MCQueryApiBuilder taskR_bldr = MCQueryApiBuilder.create((MCDBContainer)t11);
            MCDBUtil.dbUpdateKey((String)"MCMiningManager_FCM_MINING_TASK_U01", taskR, (MCQueryApiBuilder)taskR_bldr);
            MCQueryApiBuilder scheL_bldr = MCQueryApiBuilder.create((MCDBContainer)t12);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_TASK_SCHE_I02", scheL, (MCQueryApiBuilder)scheL_bldr);
            MCQueryApiBuilder paramL_bldr = MCQueryApiBuilder.create((MCDBContainer)t13);
            MCDBUtil.dbInsert((String)"MCMiningManager_FCM_MINING_TASK_PARAM_I02", paramL, (MCQueryApiBuilder)paramL_bldr);
        }
        catch (MCException e) {
            if (e.getID().equals(Core_Msg_FW_A.FCBCC0136)) {
                throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0447, new Object[0]);
            }
            throw e;
        }
        this.requestAfterTaskModify(() -> this.scheduleTask(taskR.task_id()));
        return this.getUpdCntr((Class<? extends MCDBContainer>)FCM_MINING_TASK_R.class, (MCRow)taskR);
    }

    private void requestAfterTaskModify(Runnable r) {
        MCTransactionManager.dbTran().commit();
        try {
            r.run();
        }
        catch (Exception e) {
            MCException cause = e instanceof MCException ? (MCException)((Object)e) : new MCException((Throwable)e);
            MCMessagePool.add((MCMessage)cause.getMCMessage());
            MCException ex = new MCException((Throwable)cause, Core_Msg_FW_A.FCBAC0463, new Object[0]);
            MCMessagePool.add((MCMessage)ex.getMCMessage());
            MCLog.write((Throwable)ex);
        }
    }

    private String createTaskID() {
        return this.getSequence("FCS_MINING_TASK", "0000000000000000000000000000");
    }

    private <T11 extends FCM_MINING_TASK_R> void chkTask(T11 taskR) {
        FCM_MINING_R r;
        FCM_MINING_R miningR = FCM_MINING_R.create();
        int cnt = MCDBUtil.dbSelectKey((String)"MCMiningManager_FCM_MINING_S04", (MCRow)miningR, (MCDBContainer)(r = FCM_MINING_R.create((String)"T")), taskR);
        if (cnt <= 0) {
            throw new MCException(Core_Msg_FW_A.FCBAC0452, new Object[]{taskR.mining_id()});
        }
        this.createTaskPlugin(taskR.task_typ()).chkTask(taskR, miningR);
    }

    public MCMiningTaskPlugin createTaskPlugin(String type) {
        String key = "mining.task.type" + type;
        return (MCMiningTaskPlugin)MCConst.plugin.create(MCMiningTaskPlugin.class, key);
    }

    public void execTask(String taskid) {
        MCMining_FW.Schedule ope = MCMining.crtSchedule();
        ope.up0().task_id(taskid);
        ope.up0().user_id(MCSys.user.ID());
        this.callAdmin(ope);
    }

    public void scheduleTask(String taskid) {
        MCMining_FW.Schedule ope = MCMining.crtSchedule();
        ope.up0().task_id(taskid);
        this.callAdmin(ope);
    }

    public void cancelTask(String ... taskids) {
        MCMining_FW.Cancel ope = MCMining.crtCancel();
        if (taskids != null) {
            String[] stringArray = taskids;
            int n = taskids.length;
            int n2 = 0;
            while (n2 < n) {
                String taskid = stringArray[n2];
                ((TaskReqR)ope.up0().add()).task_id(taskid);
                ++n2;
            }
        }
        this.callAdmin(ope);
    }

    public MCMessageList changeAdmin(String newurl) {
        String oldurl;
        MCMessageList msgList = new MCMessageList();
        if (!MCSys.env.is3Tier()) {
            msgList.add(new MCMessage(Core_Msg_FW_A.FCBAC0459, new Object[0]));
            return msgList;
        }
        if (newurl != null && !MCClusterManager.getManager().checkLiveURL(newurl)) {
            throw new MCException(Core_Msg_FW_A.FCBAC0464, new Object[]{newurl});
        }
        MCLog.write((String)Core_Msg_FW_A.FCBAC0465, (Object[])new Object[]{newurl});
        MCTransactionManager.dbTran().statement().lockTable("FCM_SERVER", MCLockTableMode.X, true);
        FCM_SERVER_R srvR = this.getAdminInfo(false);
        String string = oldurl = srvR != null ? srvR.url() : null;
        if (MCStringUtil.eq((String)oldurl, (String)newurl)) {
            MCLog.write((String)Core_Msg_FW_A.FCBAC0467, (Object[])new Object[]{newurl});
            return msgList;
        }
        if (oldurl != null && !MCClusterManager.getManager().checkLiveURL(oldurl)) {
            msgList.add(new MCMessage(Core_Msg_FW_A.FCBAC0471, new Object[]{oldurl}));
            oldurl = null;
        }
        MCMining_FW.CngAdmin ope = MCMining.crtCngAdmin();
        ope.up0().newurl(newurl);
        if (oldurl != null) {
            this.callForChange(oldurl, ope);
        }
        if (newurl != null) {
            try {
                MCParam param = this.callForChange(newurl, ope);
                msgList.addAll((Collection)param.getMessageParam().getMessage());
            }
            catch (MCException e) {
                if (oldurl != null) {
                    ope.up0().newurl(oldurl);
                    try {
                        this.callForChange(oldurl, ope);
                    }
                    catch (MCException ee) {
                        MCLog.write((Throwable)new MCException((Throwable)ee, Core_Msg_FW_A.FCBAC0469, new Object[]{oldurl}));
                    }
                }
                throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0468, new Object[]{newurl, oldurl});
            }
        }
        MCLog.write((String)Core_Msg_FW_A.FCBAC0466, (Object[])new Object[]{newurl});
        return msgList;
    }

    private MCParam callForChange(String url, MCOperation ope) {
        MCParam param = this.getAdminParam(ope);
        MCMiningRequester req = new MCMiningRequester(url);
        req.request(param);
        if (!param.getExceptionParam().isEmpty()) {
            throw param.getExceptionParam().getException();
        }
        return param;
    }

    private void callAdmin(MCOperation ope) {
        if (!MCSys.env.is3Tier()) {
            ope.exec();
        } else {
            MCParam param = this.getAdminParam(ope);
            MCControlRequester req = this.getAdminRequester();
            req.request(param);
            if (!param.getExceptionParam().isEmpty()) {
                throw param.getExceptionParam().getException();
            }
        }
    }

    private MCParam getAdminParam(MCOperation ope) {
        MCParam param = new MCParam(ope.getOperationInfo());
        MCParamHeaderUtil.toUpHeader((MCParam)param, (String)MCSys.user.clientID(), (String)(String.valueOf(MCSys.request.serverRequestNo()) + "_MINING"), (MCNumber)MCNumber.valueOf((int)-1));
        int i = 0;
        while (ope.up(i) != null) {
            param.addUpBlock(ope.up(i));
            ++i;
        }
        i = 0;
        while (ope.down(i) != null) {
            param.addUpBlock(ope.down(i));
            ++i;
        }
        return param;
    }

    private MCControlRequester getAdminRequester() {
        if (!MCSys.env.is3Tier()) {
            throw new MCException(Core_Msg_FW_A.FCBAC0459, new Object[0]);
        }
        String url = null;
        try {
            MCSavepoint sp = MCTransactionManager.dbTran().setSavepoint();
            FCM_SERVER_R srvR = this.getAdminInfo(true);
            MCTransactionManager.dbTran().rollback(sp);
            url = srvR != null ? srvR.url() : null;
        }
        catch (MCException e) {
            throw new MCException((Throwable)e, Core_Msg_FW_A.FCBAC0470, new Object[0]);
        }
        if (url == null) {
            throw new MCException(Core_Msg_FW_A.FCBAC0460, new Object[]{MCNumber.ZERO});
        }
        return new MCMiningRequester(url);
    }

    public boolean isAdmin() {
        return this._scheduler != null;
    }

    public FCM_SERVER_R getAdminInfo(boolean lock) {
        FCM_SERVER_R srvR = FCM_SERVER_R.create();
        FCM_SERVER_R t = FCM_SERVER_R.create((String)"T");
        MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        bldr.addWhereWithAnd(t.task_sche_mgr.eq((Object)IFMCSQL.value((Boolean)true)), new Comparable[0]);
        int cnt = lock ? MCDBUtil.dbSelectForUpdate((String)"MCMiningManager_FCM_SERVER_S01", (MCRow)srvR, (MCQueryApiBuilder)bldr) : MCDBUtil.dbSelect((String)"MCMiningManager_FCM_SERVER_S02", (MCRow)srvR, (MCQueryApiBuilder)bldr);
        return cnt != 0 ? srvR : null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void schedule(String taskid, boolean forced) {
        if (MCStringUtil.isNull((String)taskid)) {
            return;
        }
        Map<String, MCMiningTask> map = _taskMap;
        synchronized (map) {
            if (!this.isAdmin()) {
                return;
            }
            MCList scheL = MCList.create(FCM_MINING_TASK_SCHE_R.class);
            TaskCondR reqR = TaskCondR.create();
            reqR.task_id(taskid);
            this.getTask(reqR, null, scheL, null, null);
            MCMiningTask task = _taskMap.get(taskid);
            if (task == null) {
                if (!forced) {
                    return;
                }
                task = new MCMiningTask(taskid, this._scheduler);
                _taskMap.put(taskid, task);
            }
            task.schedule((MCList<FCM_MINING_TASK_SCHE_R>)scheL);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void immediate(String taskid) {
        if (MCStringUtil.isNull((String)taskid)) {
            return;
        }
        Map<String, MCMiningTask> map = _taskMap;
        synchronized (map) {
            if (!this.isAdmin()) {
                return;
            }
            MCMiningTask task = _taskMap.get(taskid);
            if (task == null) {
                task = new MCMiningTask(taskid, this._scheduler);
                _taskMap.put(taskid, task);
            }
            task.immediate();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void cancel(String ... taskids) {
        if (taskids == null) {
            return;
        }
        Map<String, MCMiningTask> map = _taskMap;
        synchronized (map) {
            if (!this.isAdmin()) {
                return;
            }
            String[] stringArray = taskids;
            int n = taskids.length;
            int n2 = 0;
            while (n2 < n) {
                String taskid = stringArray[n2];
                MCMiningTask task = _taskMap.get(taskid);
                if (task != null) {
                    task.cancel();
                    _taskMap.remove(taskid);
                }
                ++n2;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    MCMessageList promote() {
        MCMessageList msgList = new MCMessageList();
        Map<String, MCMiningTask> map = _taskMap;
        synchronized (map) {
            if (this.isAdmin()) {
                return msgList;
            }
            MCLog.write((String)Core_Msg_FW_A.FCBAC0461, (Object[])new Object[0]);
            FCT_MINING_TASK_LOG_R t = FCT_MINING_TASK_LOG_R.create((String)"T");
            MCDBUtil.execDbDelete((String)"MCMiningManager_FCT_MINING_TASK_LOG_D02", (MCDBContainer)t, (IFMCSQL.MCPredicate)t.start_dt.isNull(), (Comparable[])new Comparable[0]);
            MCMessage msg = new MCMessage(Core_Msg_FW_A.FCBAC0476, new Object[0]);
            FCT_MINING_TASK_LOG_R logR = FCT_MINING_TASK_LOG_R.create();
            logR.end_dt(MCDate.sysnow());
            logR.msg_id(msg.getID());
            logR.msg_bind(MCMiningUtil.createMessageBindForDB((MCMessage)msg));
            MCDBUtil.execDbUpdate((String)"MCMiningManager_FCT_MINING_TASK_LOG_U01", (MCDBContainer)t, (MCRow)logR, (IFMCSQL.MCPredicate)t.end_dt.isNull(), (IFMCSQL.MCPermColumn[])new IFMCSQL.MCPermColumn[]{t.end_dt, t.msg_id, t.msg_bind});
            this._scheduler = this.createScheduler();
            TaskCondR condR = TaskCondR.create();
            MCList taskL = MCList.create(FCM_MINING_TASK_R.class);
            this.getTask(condR, taskL, null, null, null);
            for (FCM_MINING_TASK_R taskR : taskL) {
                if (taskR.inv_flg()) continue;
                try {
                    String taskid = taskR.task_id();
                    this.schedule(taskid, true);
                }
                catch (Exception e) {
                    MCLog.write((Throwable)e);
                    MCException mce = e instanceof MCException ? (MCException)((Object)e) : new MCException((Throwable)e);
                    msgList.add(mce.getMCMessage());
                }
            }
            MCLog.write((String)Core_Msg_FW_A.FCBAC0462, (Object[])new Object[0]);
        }
        return msgList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void demote() {
        Map<String, MCMiningTask> map = _taskMap;
        synchronized (map) {
            MCLog.write((String)Core_Msg_FW_A.FCBAC0472, (Object[])new Object[0]);
            _taskMap.values().forEach(task -> task.cancel());
            _taskMap.clear();
            if (this._scheduler != null) {
                this._scheduler.shutdown();
                this._scheduler = null;
            }
            MCLog.write((String)Core_Msg_FW_A.FCBAC0473, (Object[])new Object[0]);
        }
    }

    private ScheduledThreadPoolExecutor createScheduler() {
        ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(MCConfig.server.getInteger("mining.task.thread", 1), (ThreadFactory)new MCThreadFactory("MiningScheduler"));
        stpe.allowCoreThreadTimeOut(false);
        stpe.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        return stpe;
    }

    FCM_SERVER_R nextTaskServer() {
        MCList srvL = MCClusterManager.getManager().getLiveServer(new MCClusterServerRole[]{MCClusterServerRole.TASK});
        if (srvL.isEmpty()) {
            return null;
        }
        int next = this._next.getAndIncrement();
        if (next >= srvL.size()) {
            next = 0;
            this._next.set(1);
        }
        return (FCM_SERVER_R)srvL.get(next);
    }

    static class MCMiningRequester
    extends MCClusterRequester {
        MCMiningRequester(String url) {
            super(url);
        }
    }
}

