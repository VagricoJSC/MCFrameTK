/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCCalendarDate
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCDateFieldType
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.commonCore.param.MCParam
 *  mcframe.commonCore.pio.util.MCDPFormat
 *  mcframe.commonCore.requester.MCControlRequester
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_SCHE_R
 *  mcframe.serverCore.dbc.FCM_SERVER_R
 *  mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R
 *  mcframe.serverCore.mcjdbc.MCDBTransaction
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPredicate
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.requester.MCClusterManager
 *  mcframe.serverCore.sys.MCSys
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.mining;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCCalendarDate;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCDateFieldType;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.pio.util.MCDPFormat;
import mcframe.commonCore.requester.MCControlRequester;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_SCHE_R;
import mcframe.serverCore.dbc.FCM_SERVER_R;
import mcframe.serverCore.dbc.FCT_MINING_TASK_LOG_R;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mining.MCMiningManager;
import mcframe.serverCore.mining.ctrl.MCMining;
import mcframe.serverCore.mining.ctrl.MCMining_FW;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.requester.MCClusterManager;
import mcframe.serverCore.stateless.MCStatelessContext;
import mcframe.serverCore.stateless.MCStatelessLogic;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.util.MCDBUtil;

class MCMiningTask {
    private final ScheduledExecutorService _service;
    private final String _taskid;
    private volatile MCNumber _schid = null;
    private volatile MCDate _schdt = null;
    private volatile MCDate _strdt = null;
    private volatile MCDate _enddt = null;
    private final MCList<FCM_MINING_TASK_SCHE_R> _scheL = MCList.create(FCM_MINING_TASK_SCHE_R.class);
    private ScheduledFuture<?> _future = null;

    MCMiningTask(String task, ScheduledExecutorService service) {
        this._service = service;
        this._taskid = task;
    }

    synchronized boolean schedule(MCList<FCM_MINING_TASK_SCHE_R> scheL) {
        this._scheL.clear();
        this._scheL.addAll(scheL);
        return this._schedule(null, false);
    }

    synchronized boolean immediate() {
        return this._schedule(null, true);
    }

    private synchronized boolean next(MCDate prev) {
        return this._schedule(prev, false);
    }

    private boolean _schedule(MCDate base, boolean immediate) {
        MCDate sch;
        FCM_MINING_TASK_R t;
        if (this._service == null || this._taskid == null) {
            return false;
        }
        if (this._schdt != null) {
            if (this._strdt != null) {
                if (this._enddt == null) {
                    return false;
                }
            } else {
                this.cancel();
                MCTransactionManager.dbTran().commit();
            }
        }
        if (!MCSys.env.is3Tier() && !immediate) {
            return false;
        }
        FCM_MINING_TASK_R taskR = FCM_MINING_TASK_R.create();
        if (MCDBUtil.dbSelectKey((String)"MCMiningTask_FCM_MINING_TASK_S01", (MCRow)taskR, (MCDBContainer)(t = FCM_MINING_TASK_R.create((String)"T")), (Comparable[])new Comparable[]{this._taskid}) <= 0) {
            throw new MCException(Core_Msg_FW_A.FCBAC0455, new Object[]{this._taskid});
        }
        if (taskR.inv_flg()) {
            if (immediate) {
                throw new MCException(Core_Msg_FW_A.FCBAC0455, new Object[]{this._taskid});
            }
            return false;
        }
        MCDate dt = this.getMCSysDT(taskR.co_cd());
        dt = (MCDate)dt.trunc(MCDateFieldType.MINUTE);
        base = base != null ? base : dt;
        MCDate mCDate = sch = immediate ? dt : this.nextDate(taskR.task_id(), base);
        if (sch != null) {
            long delay = sch.diffMinute((MCCalendarDate)dt);
            MCNumber id = MCMiningManager.getManager().getSequence("FCS_MINING_TASK_SCHE");
            FCT_MINING_TASK_LOG_R logR = this.scheduleLog(id, sch);
            if (delay == 0L) {
                MCTransactionManager.dbTran().commit();
            }
            this._schid = id;
            this._schdt = sch;
            this._strdt = null;
            this._enddt = null;
            this._future = this._service.schedule(this.createTask(taskR, logR, immediate), delay, TimeUnit.MINUTES);
        }
        return true;
    }

    private MCDate nextDate(String taskid, MCDate now) {
        MCDate next = null;
        for (FCM_MINING_TASK_SCHE_R scheR : this._scheL) {
            if (scheR.inv_flg()) continue;
            long month = scheR.sche_month().longValue();
            long day = scheR.sche_day().longValue();
            long week = scheR.sche_week_no().longValue();
            long weekday = scheR.sche_week_day().longValue();
            if (month == 0L || day != 0L && (week != 0L || weekday != 0L) || day == 0L && (week == 0L || weekday == 0L)) {
                throw new MCException(Core_Msg_FW_A.FCBAC0474, new Object[]{scheR.description(), month, day, week, weekday});
            }
            MCDate sche = (MCDate)((MCDate)((MCDate)now.modHour((Number)scheR.sche_hour())).modMinute((Number)scheR.sche_minute())).modSecond(0);
            if (now.gte((MCCalendarDate)sche, new MCDateFieldType[0])) {
                sche = (MCDate)sche.addDay(1);
            }
            int sche_m = sche.getMonth();
            int sche_d = sche.getDay();
            sche = (MCDate)sche.modDay(1);
            int shift1 = sche_m - 1;
            int cnt1 = 0;
            while (cnt1 <= 12) {
                if ((month >>> shift1 & 1L) == 1L) {
                    MCDate last = (MCDate)((MCDate)sche.addMonth(1)).addDay(-1);
                    int last_d = last.getDay();
                    if (week == 0L || weekday == 0L) {
                        int shift2 = sche_d - 1;
                        while (shift2 < last_d) {
                            if ((day >>> shift2 & 1L) == 1L) {
                                sche = (MCDate)sche.modDay(shift2 + 1);
                                last_d = 0;
                                break;
                            }
                            ++shift2;
                        }
                        if (last_d > 0 && (day >>> 31 & 1L) == 1L) {
                            sche = last;
                            last_d = 0;
                        }
                    } else if (day == 0L) {
                        int sche_w = sche.getDayOfWeek();
                        int shift3 = (sche_d - 1) / 7;
                        while (shift3 <= 4 && last_d > 0) {
                            if ((week >>> shift3 & 1L) == 1L) {
                                int offset = shift3 * 7;
                                if (shift3 == 4) {
                                    offset = last_d - 7 + 1 - 1;
                                    sche_w = last.getDayOfWeek();
                                    sche_w = sche_w == 7 ? 1 : sche_w + 1;
                                }
                                int pos = 0;
                                while (pos < 7 && last_d > 0) {
                                    int d;
                                    int shift4 = pos + sche_w - 1;
                                    int n = shift4 = shift4 < 7 ? shift4 : shift4 - 7;
                                    if ((weekday >>> shift4 & 1L) == 1L && sche_d - 1 <= (d = offset + pos) && d < last_d) {
                                        sche = (MCDate)sche.modDay(d + 1);
                                        last_d = 0;
                                    }
                                    ++pos;
                                }
                            }
                            ++shift3;
                        }
                    }
                    if (last_d <= 0) break;
                }
                if (shift1 + 1 >= 12) {
                    sche = (MCDate)sche.addYear(1);
                    shift1 = 0;
                } else {
                    ++shift1;
                }
                sche_d = 1;
                sche = (MCDate)sche.modMonth(shift1 + 1);
                ++cnt1;
            }
            if (next != null && !next.gt((MCCalendarDate)sche, new MCDateFieldType[0])) continue;
            next = sche;
        }
        return next;
    }

    private MCDate getMCSysDT(String cocd) {
        return MCDate.sysnow();
    }

    private FCT_MINING_TASK_LOG_R scheduleLog(MCNumber id, MCDate dt) {
        FCT_MINING_TASK_LOG_R logR = FCT_MINING_TASK_LOG_R.create();
        logR.task_id(this._taskid);
        logR.sche_id(id);
        logR.sche_dt(dt);
        FCT_MINING_TASK_LOG_R t = FCT_MINING_TASK_LOG_R.create((String)"T");
        MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        MCDBUtil.dbInsert((String)"MCMiningTask_FCT_MINING_TASK_LOG_I01", (MCRow)logR, (MCQueryApiBuilder)bldr);
        return logR;
    }

    private synchronized void scheduleFinished() {
        this._future = null;
        this._schdt = null;
        this._schid = null;
    }

    public synchronized boolean cancel() {
        FCT_MINING_TASK_LOG_R t;
        FCT_MINING_TASK_LOG_R logR;
        boolean ret = false;
        if (this._future != null) {
            ret = this._future.cancel(false);
        }
        if (this._schid != null && this._schdt != null && this._strdt == null && MCDBUtil.dbSelectKeyForUpdate((String)"MCMiningTask_FCT_MINING_TASK_LOG_S01", (MCRow)(logR = FCT_MINING_TASK_LOG_R.create()), (MCDBContainer)(t = FCT_MINING_TASK_LOG_R.create((String)"T")), (Comparable[])new Comparable[]{this._taskid, this._schid}) > 0) {
            MCDBUtil.dbDeleteKey((String)"MCMiningTask_FCT_MINING_TASK_LOG_D01", (MCRow)logR, (MCDBContainer)t);
        }
        this.scheduleFinished();
        return ret;
    }

    private Runnable createTask(FCM_MINING_TASK_R task, FCT_MINING_TASK_LOG_R log, boolean immediate) {
        return new TaskLogic(task, log, immediate ? MCSys.user.ID() : null);
    }

    class Context
    extends MCStatelessContext {
        Context(String task_id, MCNumber sche_id, String user_id, String co_cd) {
            super("MiningTask@" + sche_id.toSimpleString(), true, MCClusterManager.getManager().getServerName(), null, user_id, null, null, null, "MiningTask#" + task_id, co_cd, null, null, null);
        }
    }

    class TaskLogic
    extends MCStatelessLogic<Context>
    implements Runnable {
        private final FCM_MINING_TASK_R taskR;
        private final FCT_MINING_TASK_LOG_R logR;
        private String req_user;
        private String url = null;
        private Throwable err = null;
        private boolean _auth = false;

        TaskLogic(FCM_MINING_TASK_R task, FCT_MINING_TASK_LOG_R log, String reqUser) {
            this.taskR = FCM_MINING_TASK_R.createByName((MCRow)task);
            this.logR = FCT_MINING_TASK_LOG_R.createByName((MCRow)log);
            this.req_user = reqUser;
        }

        @Override
        public void run() {
            block13: {
                try {
                    try {
                        MCLog.write((String)Core_Msg_FW_A.FCBGC0452, (Object[])new Object[]{this.taskR.task_nm(), this.taskR.task_id()});
                        this.initializeTask();
                        Context context = new Context(this.taskR.task_id(), this.logR.sche_id(), this.taskR.user_id(), this.taskR.co_cd());
                        MCMining_FW.TaskExec ope = MCMining.crtTaskExec();
                        ope.up0().task_id(this.taskR.task_id());
                        ope.up0().user_id(this.req_user);
                        MCParam param = new MCParam(ope.getOperationInfo());
                        param.addUpBlock((MCContainer)ope.up0());
                        try {
                            this.call(context, param);
                        }
                        catch (Throwable e) {
                            this.err = e;
                            MCLog.write((Throwable)e);
                        }
                        MCMessage msg = null;
                        msg = this.err != null ? (this.err instanceof MCException ? ((MCException)this.err).getMCMessage() : new MCException(this.err).getMCMessage()) : (!param.getExceptionParam().isEmpty() ? param.getExceptionParam().getException().getMCMessage() : (param.getMessageParam().isEmpty() ? new MCMessage(Core_Msg_FW_A.FCBAC0475, new Object[0]) : (MCMessage)param.getMessageParam().getMessage().get(0)));
                        this.logR.msg_id(msg.getID());
                        this.logR.msg_bind(MCMiningUtil.createMessageBindForDB((MCMessage)msg));
                    }
                    catch (Throwable e) {
                        MCLog.write((Throwable)e);
                        MCException mce = e instanceof MCException ? (MCException)e : new MCException(e);
                        MCMessage msg = mce.getMCMessage();
                        this.logR.msg_id(msg.getID());
                        this.logR.msg_bind(MCMiningUtil.createMessageBindForDB((MCMessage)msg));
                        try {
                            this.finalizeTask();
                        }
                        catch (Throwable e2) {
                            MCLog.write((Throwable)e2);
                        }
                        MCLog.write((String)Core_Msg_FW_A.FCBGC0453, (Object[])new Object[]{this.taskR.task_nm(), this.taskR.task_id()});
                        break block13;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        this.finalizeTask();
                    }
                    catch (Throwable e) {
                        MCLog.write((Throwable)e);
                    }
                    MCLog.write((String)Core_Msg_FW_A.FCBGC0453, (Object[])new Object[]{this.taskR.task_nm(), this.taskR.task_id()});
                    throw throwable;
                }
                try {
                    this.finalizeTask();
                }
                catch (Throwable e) {
                    MCLog.write((Throwable)e);
                }
                MCLog.write((String)Core_Msg_FW_A.FCBGC0453, (Object[])new Object[]{this.taskR.task_nm(), this.taskR.task_id()});
            }
        }

        private void initializeTask() {
            try {
                MCDBTransaction tran = MCTransactionManager.createDBTran();
                this.err = null;
                FCM_SERVER_R srvR = MCMiningManager.getManager().nextTaskServer();
                if (srvR == null) {
                    this.startLog(this.taskR.co_cd(), this.logR);
                    throw new MCException(Core_Msg_FW_A.FCBGC0461, new Object[]{this.taskR.task_nm(), this.taskR.task_id()});
                }
                this.url = srvR.url();
                this.logR.srv_id(srvR.srv_id());
                MCLog.write((String)Core_Msg_FW_A.FCBGC0454, (Object[])new Object[]{this.taskR.task_nm(), this.taskR.task_id(), this.logR.srv_id(), this.url});
                this.startLog(this.taskR.co_cd(), this.logR);
                tran.commit();
            }
            finally {
                MCTransactionManager.finalClose();
            }
        }

        private void finalizeTask() {
            try {
                MCDBTransaction tran = MCTransactionManager.createDBTran();
                this.finishLog(this.taskR.co_cd(), this.logR);
                MCMiningTask.this.scheduleFinished();
                MCMiningManager mgr = MCMiningManager.getManager();
                if (mgr.isAdmin()) {
                    MCMiningTask.this.next(this.logR.sche_dt());
                } else {
                    tran.commit();
                    mgr.scheduleTask(this.taskR.task_id());
                }
                tran.commit();
            }
            finally {
                MCTransactionManager.finalClose();
            }
        }

        private MCDate startLog(String cocd, FCT_MINING_TASK_LOG_R logR) {
            MCMiningTask.this._strdt = MCMiningTask.this.getMCSysDT(cocd);
            logR.start_dt(MCMiningTask.this._strdt);
            FCT_MINING_TASK_LOG_R t = FCT_MINING_TASK_LOG_R.create((String)"T");
            MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)t);
            MCDBUtil.dbUpdateKey((String)"MCMiningTask_FCT_MINING_TASK_LOG_U01", (MCRow)logR, (MCQueryApiBuilder)bldr);
            return MCMiningTask.this._strdt;
        }

        private MCDate finishLog(String cocd, FCT_MINING_TASK_LOG_R logR) {
            MCMiningTask.this._enddt = MCMiningTask.this.getMCSysDT(cocd);
            logR.end_dt(MCMiningTask.this._enddt);
            FCT_MINING_TASK_LOG_R t = FCT_MINING_TASK_LOG_R.create((String)"T");
            MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)t);
            MCDBUtil.dbUpdateKey((String)"MCMiningTask_FCT_MINING_TASK_LOG_U02", (MCRow)logR, (MCQueryApiBuilder)bldr);
            MCDBUtil.execDbDelete((String)"MCMiningTask_FCT_MINING_TASK_LOG_D02", (MCDBContainer)t, (IFMCSQL.MCPredicate)t.task_id.eq((Object)IFMCSQL.value((String)logR.task_id())).and(t.sche_id.neq((Object)IFMCSQL.value((MCNumber)logR.sche_id()))).and(t.end_dt.isNotNull()), (Comparable[])new Comparable[0]);
            return MCMiningTask.this._enddt;
        }

        @Override
        protected void login(Context context) {
            this._auth = true;
            super.login(context);
        }

        @Override
        protected void request(Context context, MCParam param) {
            this._auth = false;
            super.request(context, param);
        }

        @Override
        protected void logout(Context context) {
            this._auth = true;
            super.logout(context);
        }

        @Override
        protected MCControlRequester createRequester() {
            if (this._auth) {
                return super.createRequester();
            }
            return new MCMiningManager.MCMiningRequester(this.url);
        }

        @Override
        protected MCDPFormat getDPFormat() {
            return MCDPFormat.forTask();
        }

        @Override
        protected String createIdentifyID(String id) {
            if (MCStringUtil.isNull((String)id)) {
                throw new MCException(Core_Msg_FW_A.FCBGC0393, new Object[0]);
            }
            return String.valueOf(id) + "#@@@#" + id + "@MCTS";
        }
    }
}

