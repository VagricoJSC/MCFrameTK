/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.notice.Core_Msg
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.serverCore.dbc.FCM_DELETE_BINARY_R
 *  mcframe.serverCore.dbc.FCT_SRV_REQUEST_FILE_R
 *  mcframe.serverCore.dbc.FCT_SRV_REQUEST_R
 *  mcframe.serverCore.dbc.FCW_DELETE_BINARY_R
 *  mcframe.serverCore.mcjdbc.CoreSql
 *  mcframe.serverCore.mcjdbc.FWDBUtil
 *  mcframe.serverCore.mcjdbc.MCLockTableMode
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPredicate
 *  mcframe.serverCore.queryapi.IFMCSQL$MCSubQuery
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.clear;

import java.time.LocalDate;
import java.util.Arrays;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.Core_Msg;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.serverCore.clear.MCClearTempDBData_FW_A;
import mcframe.serverCore.clear.Query;
import mcframe.serverCore.dbc.FCM_DELETE_BINARY_R;
import mcframe.serverCore.dbc.FCT_SRV_REQUEST_FILE_R;
import mcframe.serverCore.dbc.FCT_SRV_REQUEST_R;
import mcframe.serverCore.dbc.FCW_DELETE_BINARY_R;
import mcframe.serverCore.mcjdbc.CoreSql;
import mcframe.serverCore.mcjdbc.FWDBUtil;
import mcframe.serverCore.mcjdbc.MCLockTableMode;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.util.MCDBUtil;

public abstract class MCClearTempDBData_FW
extends MCClearTempDBData_FW_A {
    MCDate calcMinusDate(long daysToSubtract) {
        MCDate today = FWDBUtil.sysdate();
        LocalDate d = LocalDate.of(today.getYear(), today.getMonth(), today.getDay()).minusDays(daysToSubtract);
        return MCDate.valueOf((int[])new int[]{d.getYear(), d.getMonthValue(), d.getDayOfMonth()});
    }

    public class ClearBinary
    extends MCClearTempDBData_FW_A.ClearBinary {
        public ClearBinary() {
            super(MCClearTempDBData_FW.this);
        }

        protected void call() {
            try {
                MCLog.write((String)Core_Msg.FCBCC5006, (Object[])new Object[0]);
                this.dbWkDelete();
                MCList<FCM_DELETE_BINARY_R> binaryColsList = this.extractBinaryCols();
                if (binaryColsList.isEmpty()) {
                    MCLog.write((String)Core_Msg.FCBCC5004, (Object[])new Object[0]);
                    return;
                }
                try {
                    this.dbWkInsert(binaryColsList);
                    MCRow bind = MCRow.create();
                    MCTimestamp oldest = MCTimestamp.valueOf((MCDate)MCClearTempDBData_FW.this.calcMinusDate(1L));
                    bind.addTimestampColumn("timestamp", oldest);
                    Query.clearBinary_D01().executeUpdate(bind);
                }
                catch (MCException e) {
                    MCLog.write((Throwable)e.getCause());
                    throw new MCException(Core_Msg.FCBCC5005, new Object[]{e});
                }
            }
            finally {
                MCLog.write((String)Core_Msg.FCBCC5007, (Object[])new Object[0]);
            }
        }

        void dbWkDelete() {
            MCTransactionManager.dbTran().statement().lockTable("FCT_BINARY", MCLockTableMode.X, false);
            FCW_DELETE_BINARY_R wk = FCW_DELETE_BINARY_R.create();
            MCDBUtil.execDbDelete((String)"FC_MCClearTempDBData_FW_dbWkDelete", (MCDBContainer)wk, null, (Comparable[])new Comparable[]{""});
        }

        MCList<FCM_DELETE_BINARY_R> extractBinaryCols() {
            MCList binaryColsList = MCList.create(FCM_DELETE_BINARY_R.class);
            FCM_DELETE_BINARY_R M = FCM_DELETE_BINARY_R.create((String)"M");
            ((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_MCClearTempDBData_FW_extractBinaryCols").mainQuery().select((IFMCFMSQL.MCFMEDColumnGroup[])M.getBaseColumns$()).from((IFMCSQL.MCDerivedView)M)).executeQuery(binaryColsList);
            return binaryColsList;
        }

        void dbWkInsert(MCList<FCM_DELETE_BINARY_R> binaryColsList) {
            binaryColsList.forEach(r -> {
                String inswkSql = CoreSql.get().getInsertrFcwDeleteBinarySql(r.table_name(), r.column_name());
                MCTransactionManager.dbTran().statement().executeUpdate("FC_MCClearTempDBData_FW_dbWkInsert", inswkSql, null, null);
            });
        }
    }

    public class ClearPrintData
    extends MCClearTempDBData_FW_A.ClearPrintData {
        static final int DEFAULT_PRINT_DATA_SAVE_DULATION = 90;

        public ClearPrintData() {
            super(MCClearTempDBData_FW.this);
        }

        protected void call() {
            MCLog.write((String)Core_Msg.FCBCC5008, (Object[])new Object[0]);
            long saveDuration = this.up0().saveDuration() != null ? Long.parseLong(this.up0().saveDuration().toString()) : 90L;
            MCDate oldest = MCClearTempDBData_FW.this.calcMinusDate(saveDuration);
            try {
                try {
                    MCRow bind = MCRow.create();
                    bind.setDateNE("date", oldest);
                    bind.setBooleanNE("persistent", false);
                    Query.clearPrintData_D02().executeUpdate(bind);
                    Query.clearPrintData_D01().executeUpdate(bind);
                }
                catch (MCException e) {
                    MCLog.write((Throwable)e.getCause());
                    throw new MCException(Core_Msg.FCBCC5010, new Object[]{e});
                }
            }
            finally {
                MCLog.write((String)Core_Msg.FCBCC5009, (Object[])new Object[0]);
            }
        }
    }

    public class ClearSrvRequest
    extends MCClearTempDBData_FW_A.ClearSrvRequest {
        static final int DEFAULT_SRVREQ_SAVE_DULATION = 30;
        static final String NONE = "$";

        public ClearSrvRequest() {
            super(MCClearTempDBData_FW.this);
        }

        protected void call() {
            MCLog.write((String)Core_Msg.FCBCC5012, (Object[])new Object[0]);
            long saveDuration = this.up0().saveDuration() != null ? Long.parseLong(this.up0().saveDuration().toString()) : 30L;
            MCDate oldest = MCClearTempDBData_FW.this.calcMinusDate(saveDuration);
            String target = this.up0().targetStatus() != null ? this.up0().targetStatus() : NONE;
            try {
                try {
                    this._clearSrvReqRslt(oldest, target);
                }
                catch (MCException e) {
                    MCLog.write((Throwable)e.getCause());
                    throw new MCException(Core_Msg.FCBCC5014, new Object[]{e});
                }
            }
            finally {
                MCLog.write((String)Core_Msg.FCBCC5013, (Object[])new Object[0]);
            }
        }

        void _clearSrvReqRslt(MCDate oldest, String target) {
            MCRow bind = MCRow.create();
            bind.setDateNE("date", oldest);
            if (target.equals(NONE)) {
                bind.setStringNE("status", "0");
                Query.clearSrvRequestFile_D01().executeUpdate(bind);
                Query.clearSrvRequest_D01().executeUpdate(bind);
            } else {
                String[] status = target.split(",");
                FCT_SRV_REQUEST_FILE_R fileR = FCT_SRV_REQUEST_FILE_R.create((String)"T");
                MCQueryApiBuilder fileBuilder = MCQueryApiBuilder.create((MCDBContainer)fileR);
                IFMCSQL.MCPredicate sub = MCQueryApiBuilder.makeIn((IFMCSQL.MCPermColumn)fileR.srv_req_no, (IFMCSQL.MCSubQuery)Query.multiStatus(status));
                fileBuilder.addWhereWithAnd(sub, bind);
                fileBuilder.buildDelete("FC_MCClearTempDBData_FW__clearSrvReqRslt_1").executeUpdate();
                FCT_SRV_REQUEST_R reqR = FCT_SRV_REQUEST_R.create((String)"T");
                MCQueryApiBuilder reqBuilder = MCQueryApiBuilder.create((MCDBContainer)reqR);
                reqBuilder.addWhereWithAnd(reqR.end_dt.lt((Object)IFMCSQL.bind((String)"1")), new Comparable[]{oldest});
                reqBuilder.addWhereInWithAnd((IFMCSQL.MCPermColumn)reqR.status, Arrays.asList(status)).buildDelete("FC_MCClearTempDBData_FW__clearSrvReqRslt_2").executeUpdate(reqBuilder.getMergeBind());
            }
        }
    }
}

