/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCAggregator
 *  mcframe.commonCore.container.MCGroupByPolicy
 *  mcframe.commonCore.container.MCIndexKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCList$SortType
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.MCRowFilter
 *  mcframe.commonCore.container.MCRowFilterList
 *  mcframe.commonCore.container.MCRowMatcher
 *  mcframe.commonCore.container.MCSortPolicy
 *  mcframe.commonCore.container.io.IfContainerAdjuster
 *  mcframe.commonCore.container.io.MCContainerIOConfig
 *  mcframe.commonCore.container.io.MCContainerIOConfig$Encode
 *  mcframe.commonCore.container.io.MCCsvReader
 *  mcframe.commonCore.expression.MCAggregateFunctions
 *  mcframe.commonCore.expression.MCExpressionBuilder
 *  mcframe.commonCore.expression.MCExpressionFunctions
 *  mcframe.commonCore.lang.MCDataType
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.commonCore.notice.MCMessageList
 *  mcframe.commonCore.param.MCContainerDef
 *  mcframe.commonCore.param.MCDef
 *  mcframe.commonCore.param.MCItemDef
 *  mcframe.commonCore.push.MCPushMessage
 *  mcframe.commonCore.report.MCReportConst
 *  mcframe.commonCore.sys.MCFactory
 *  mcframe.commonCore.util.MCCollectionUtil
 *  mcframe.serverCore.acl.MCACLManager
 *  mcframe.serverCore.acl.MCACPhase
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.logic.MCLogicBase
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.notice.MCMessagePool
 *  mcframe.serverCore.push.MCServerPushManager
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 */
package mcframe.serverCore.mining;

import java.io.File;
import java.io.FilenameFilter;
import java.math.RoundingMode;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mcframe.commonCore.container.MCAggregator;
import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRowFilter;
import mcframe.commonCore.container.MCRowFilterList;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCSortPolicy;
import mcframe.commonCore.container.io.IfContainerAdjuster;
import mcframe.commonCore.container.io.MCContainerIOConfig;
import mcframe.commonCore.container.io.MCCsvReader;
import mcframe.commonCore.expression.MCAggregateFunctions;
import mcframe.commonCore.expression.MCExpressionBuilder;
import mcframe.commonCore.expression.MCExpressionFunctions;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.push.MCPushMessage;
import mcframe.commonCore.report.MCReportConst;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverCore.acl.MCACLManager;
import mcframe.serverCore.acl.MCACPhase;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.logic.MCLogicBase;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mining.IfMCMiningOperation;
import mcframe.serverCore.mining.MCMiningManager;
import mcframe.serverCore.mining.ctrl.CondR;
import mcframe.serverCore.mining.ctrl.InfoCondR;
import mcframe.serverCore.mining.ctrl.TaskCondR;
import mcframe.serverCore.mining.task.MCPushDestPlugin;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.push.MCServerPushManager;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;

public class MCMiningAgent {
    private static MCMiningAgent _agent = null;

    public static MCMiningAgent getAgent() {
        if (_agent == null) {
            _agent = new MCMiningAgent();
        }
        return _agent;
    }

    private MCMiningAgent() {
    }

    public void checkACL(String mid, String lid, String oid, String func) {
        MCACPhase.checkACL((String)mid, (String)lid, (String)oid);
        if (!MCACLManager.createServerManager().authorize(mid, lid, func, null)) {
            throw new MCException(Core_Msg_FW_A.FCBHC0024, new Object[]{mid, lid, oid});
        }
    }

    public MCOperation createMiningOperation(String mid, String lid, String oid) {
        MCOperation ope = (MCOperation)MCLogicBase.createOperation((String)mid, (String)lid, (String)oid, MCOperation.class);
        if (!(ope instanceof IfMCMiningOperation)) {
            throw new MCException(Core_Msg_FW_A.FCBAC0445, new Object[]{mid, lid, oid});
        }
        return ope;
    }

    public String getWorkDir() {
        return MCConfig.server.getString("net.mining.dir");
    }

    public <T5 extends CondR> MCList<MCRow> mining(String miningid, MCList<T5> paramL) {
        return this.mining(miningid, paramL, null, null, null, null);
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R, T5 extends CondR> MCList<MCRow> mining(String miningid, MCList<T5> paramL, MCList<T1> miningL, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        MCMessageList errList;
        MCMiningManager mgr = MCMiningManager.getManager();
        miningL = miningL != null ? miningL : MCList.create(FCM_MINING_R.class);
        condL = condL != null ? condL : MCList.create(FCM_MINING_CONDITION_R.class);
        methodL = methodL != null ? methodL : MCList.create(FCM_MINING_METHOD_R.class);
        sumcondL = sumcondL != null ? sumcondL : MCList.create(FCM_MINING_SUMCOND_R.class);
        InfoCondR infoCond = InfoCondR.create();
        infoCond.mining_id(miningid);
        infoCond.acl_co(true);
        infoCond.acl_sys(true);
        if (!mgr.getInfo(infoCond, miningL, condL, methodL, sumcondL)) {
            throw new MCException(Core_Msg_FW_A.FCBAC0452, new Object[]{miningid});
        }
        mgr.checkMethodRelation(miningid, methodL);
        methodL = methodL.subList("inv_flg", (Comparable)Boolean.FALSE);
        MCList grpL = methodL.subList("sum_info_typ", (Comparable)((Object)"1"));
        List grpids = grpL.getString("col_id");
        List sumids = methodL.subList("sum_info_typ", (Comparable)((Object)"2")).getString("col_id");
        List maxids = methodL.subList("sum_info_typ", (Comparable)((Object)"4")).getString("col_id");
        List minids = methodL.subList("sum_info_typ", (Comparable)((Object)"5")).getString("col_id");
        List avgids = methodL.subList("sum_info_typ", (Comparable)((Object)"3")).getString("col_id");
        final MCList formulaL = methodL.subList(new MCRowMatcher<T3>(){

            public boolean match(T3 row) {
                return row.formula() != null;
            }
        });
        FCM_MINING_R miningR = (FCM_MINING_R)miningL.get(0);
        String mid = miningR.module_id();
        String lid = miningR.logic_id();
        String oid = miningR.operation_id();
        this.checkACL(mid, lid, oid, miningR.func_typ());
        MCOperation ope = this.createMiningOperation(mid, lid, oid);
        IfMCMiningOperation mope = (IfMCMiningOperation)ope;
        mope.setMiningDirForDL(new File(this.getWorkDir()));
        String[] allids = this.getMiningColumnForDL(ope, grpids, sumids, maxids, minids, avgids, formulaL, sumcondL);
        mope.setMiningColumnForDL(allids);
        MCRow condR = (MCRow)ope.up(0);
        if (condR != null) {
            this.setCondition(condR, condL, paramL);
        }
        ope.exec();
        File dlf = mope.getMiningFileForDL();
        if (dlf == null || !dlf.isFile()) {
            throw new MCException(Core_Msg_FW_A.FCBAC0445, new Object[]{mid, lid, oid});
        }
        dlf = this.renameMiningFile(dlf);
        MCGroupByPolicy policy = this.createAggregatePolicy(grpids, methodL, sumcondL);
        ArrayList n2z_cols = new ArrayList();
        methodL.forEach(methodR -> {
            if (methodR.null_zero()) {
                String colto = MCMiningUtil.createSumColumnId((String)methodR.col_id(), (String)methodR.sumcond(), (String)methodR.sum_info_typ());
                n2z_cols.add(colto);
            }
        });
        final ArrayList convDT = new ArrayList();
        final ArrayList convTS = new ArrayList();
        grpL.forEach(grpR -> {
            String col_id = grpR.col_id();
            String fmt = grpR.date_fmt();
            MCMeta meta = ope.down(0).getMeta(col_id);
            if (meta == null) {
                return;
            }
            if (fmt == null) {
                return;
            }
            String[] conv = new String[]{col_id, MCConst.format.getDateOutputPattern(fmt)};
            switch (meta.type()) {
                case DATE: {
                    convDT.add(conv);
                    break;
                }
                case TIMESTAMP: {
                    convTS.add(conv);
                    break;
                }
            }
        });
        MCList retL = ((MCList)ope.down(0)).createInstance();
        String[] stringArray = policy.resultArray();
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String result = stringArray[n2];
            retL.addNumberColumn(result);
            ++n2;
        }
        for (FCM_MINING_METHOD_R formulaR : formulaL) {
            String result = MCMiningUtil.createSumColumnId((String)formulaR.col_id(), (String)formulaR.sumcond(), (String)formulaR.sum_info_typ());
            retL.addNumberColumn(result);
        }
        final MCAggregator aggregator = new MCAggregator(policy);
        MCCsvReader reader = new MCCsvReader(retL, dlf);
        reader.setContainerAdjuster((IfContainerAdjuster)new IfContainerAdjuster<MCRow>(){

            public MCRow adjustBeforeList(MCRow rsltR) {
                MCMiningAgent.this.calculate(rsltR, formulaL, true, new MCExpressionFunctions[0]);
                convDT.forEach(conv -> {
                    MCDate dt = rsltR.getDate(conv[0]);
                    if (dt != null) {
                        dt = MCDate.valueOf((String)dt.toString(conv[1]), (String)conv[1]);
                        rsltR.setDate(conv[0], dt);
                    }
                });
                convTS.forEach(conv -> {
                    MCTimestamp ts = rsltR.getTimestamp(conv[0]);
                    if (ts != null) {
                        ts = MCTimestamp.valueOf((String)ts.toString(conv[1]), (String)conv[1]);
                        rsltR.setTimestamp(conv[0], ts);
                    }
                });
                aggregator.sumUp(rsltR);
                return null;
            }
        });
        MCContainerIOConfig csvconf = new MCContainerIOConfig();
        csvconf.setReaderEncode(MCContainerIOConfig.Encode.getEncode((String)MCReportConst.getDefaultCharset(), (MCContainerIOConfig.Encode)MCContainerIOConfig.Encode.UTF8));
        csvconf.setReaderTitleOut(false);
        MCMessageList mCMessageList = errList = allids == null ? reader.read(csvconf) : reader.read(csvconf, allids);
        if (errList.size() > 0) {
            MCException ex = new MCException(Core_Msg_FW_A.FCBAC0449, new Object[]{dlf.getAbsolutePath()});
            ex.addCauseMessageList(errList);
            throw ex;
        }
        aggregator.setResult(retL);
        retL.forEach(retR -> {
            for (String col : n2z_cols) {
                if (retR.getNumber(col) != null) continue;
                retR.setNumber(col, 0);
            }
        });
        MCExpressionFunctions[] expfuncs = new MCExpressionFunctions[]{new MCAggregateFunctions(retL)};
        retL.forEach(retR -> this.calculate((MCRow)retR, (MCList)formulaL, false, expfuncs));
        for (FCM_MINING_METHOD_R methodR2 : methodL) {
            if (!methodR2.rank_flg()) continue;
            String rank_col = MCMiningUtil.createSumColumnId((String)methodR2.col_id(), (String)methodR2.sumcond(), (String)methodR2.sum_info_typ());
            retL = MCMiningUtil.rankList((MCList)retL, (String)rank_col, (String)methodR2.rank_typ(), (MCNumber)methodR2.rank_size());
            break;
        }
        for (FCM_MINING_METHOD_R methodR2 : methodL) {
            if (!methodR2.fill_dt_flg()) continue;
            retL = MCMiningUtil.fillDateRow((MCList)retL, (String)methodR2.col_id(), (String)methodR2.date_fmt(), (MCTimestamp)methodR2.fill_dt_fm(), (MCTimestamp)methodR2.fill_dt_to());
            break;
        }
        retL.sort(grpids.toArray(new String[grpids.size()]));
        MCSortPolicy sort = new MCSortPolicy();
        methodL.sort(new String[]{"sort_order"});
        methodL.forEach(methodR -> {
            String type = methodR.sort_typ();
            if (type != null) {
                String col = MCMiningUtil.createSumColumnId((String)methodR.col_id(), (String)methodR.sumcond(), (String)methodR.sum_info_typ());
                sort.add(MCList.SortType.valueOf((String)type), col);
            }
        });
        if (sort.size() > 0) {
            retL.sort(sort);
        }
        return retL;
    }

    private File renameMiningFile(File dlf) {
        final String dlfname = dlf.getName();
        File[] dlfs = dlf.getParentFile().listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(dlfname);
            }
        });
        try {
            Path dlfpath = dlf.toPath();
            Path newdlf = Files.move(dlfpath, dlfpath.resolveSibling(String.valueOf(dlfname) + "." + dlfs.length), new CopyOption[0]);
            return newdlf.toFile();
        }
        catch (Exception e) {
            throw new MCException((Throwable)e);
        }
    }

    private <T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> MCGroupByPolicy createAggregatePolicy(List<String> grpids, MCList<T3> methodL, MCList<T4> sumcondL) {
        MCGroupByPolicy gp = new MCGroupByPolicy(grpids.toArray(new String[grpids.size()]));
        methodL.forEach(methodR -> {
            String type = methodR.sum_info_typ();
            String sumcond = methodR.sumcond();
            String colfrom = methodR.col_id();
            String colto = MCMiningUtil.createSumColumnId((String)colfrom, (String)sumcond, (String)type);
            MCRowFilterList<MCRowFilter> matcher = this.createSumCondFilters(sumcond, sumcondL);
            switch (type) {
                case "3": {
                    MCNumber dec = methodR.dec_place();
                    int scale = dec != null ? dec.intValue() : 0;
                    RoundingMode rm = this.toRoundingMode(methodR.round_mode_typ());
                    gp.avg(colfrom, colto, matcher, scale, rm);
                    break;
                }
                case "2": {
                    gp.sum(colfrom, colto, matcher);
                    break;
                }
                case "4": {
                    gp.max(colfrom, colto, matcher);
                    break;
                }
                case "5": {
                    gp.min(colfrom, colto, matcher);
                    break;
                }
                case "6": {
                    gp.count(colto, matcher);
                }
            }
        });
        return gp;
    }

    private <T4 extends FCM_MINING_SUMCOND_R> MCRowFilterList<MCRowFilter> createSumCondFilters(String sumcond, MCList<T4> sumcondL) {
        if (sumcond == null || sumcondL == null) {
            return null;
        }
        MCList condL = sumcondL.subList("sumcond", (Comparable)((Object)sumcond));
        if (condL.isEmpty()) {
            return null;
        }
        MCRowFilterList list = new MCRowFilterList();
        condL.forEach(condR -> {
            MCRowFilter filter = new MCRowFilter();
            MCMiningUtil.setSumCondFilter((MCRowFilter)filter, (String)condR.col_id(), (String)condR.cond_val(), (MCDataType)MCMiningUtil.toDataType((String)condR.data_typ()), (String)condR.relative_ope(), (String)condR.logic_ope(), (boolean)condR.inv_flg());
            list.add((Object)filter);
        });
        return list;
    }

    private <T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> String[] getMiningColumnForDL(MCOperation ope, List<String> grpids, List<String> sumids, List<String> maxids, List<String> minids, List<String> avgids, MCList<T3> formulaL, MCList<T4> sumcondL) {
        MCDef def = ope.getOperationInfo().def;
        MCContainerDef mdef = MCMiningUtil.getMethodDef((MCDef)def, (String)ope.getOperationInfo().moduleId, (String)ope.getOperationInfo().logicId, (String)ope.getOperationInfo().operationId);
        MCItemDef[] mdefItems = mdef.transItems();
        HashSet<String> downidSet = new HashSet<String>();
        int i = 0;
        while (i < mdefItems.length) {
            downidSet.add(mdefItems[i].id);
            ++i;
        }
        HashSet<String> allidSet = new HashSet<String>();
        allidSet.addAll(grpids);
        allidSet.addAll(sumids);
        allidSet.addAll(maxids);
        allidSet.addAll(minids);
        allidSet.addAll(avgids);
        MCExpressionBuilder eb = new MCExpressionBuilder(new MCExpressionFunctions[0]);
        formulaL.forEach(formulaR -> {
            if (!"7".equals(formulaR.sum_info_typ())) {
                List colList = eb.getVariableList(formulaR.formula(), downidSet);
                allidSet.addAll(colList);
            }
        });
        sumcondL.forEach(sumcondR -> {
            String col_id = sumcondR.col_id();
            allidSet.add(col_id);
            switch (sumcondR.data_typ()) {
                case "3": 
                case "4": {
                    MCRow row = MCRow.create();
                    String val = sumcondR.cond_val();
                    MCRowFilter.setDateSaveValue((String)val, (MCRow)row, (String)"diff_col", null, null, null);
                    String col = row.getString("diff_col");
                    if (col == null) break;
                    allidSet.add(col);
                }
            }
        });
        allidSet.removeIf(id -> !downidSet.contains(id));
        int size = allidSet.size();
        return size > 0 ? allidSet.toArray(new String[size]) : null;
    }

    private <T2 extends FCM_MINING_CONDITION_R, T5 extends CondR> void setCondition(MCRow condR, MCList<T2> propL, MCList<T5> paramL) {
        propL.forEach(propR -> {
            block44: {
                String col;
                block42: {
                    col = propR.col_id();
                    if (propR.editable_flg()) break block42;
                    String val = propR.init_val();
                    switch (propR.data_typ()) {
                        case "1": {
                            condR.setString(col, MCMiningUtil.toConditionString((String)val));
                            break;
                        }
                        case "2": {
                            condR.setNumber(col, MCMiningUtil.toConditionNumber((String)val));
                            break;
                        }
                        case "5": {
                            condR.setBoolean(col, MCMiningUtil.toConditionBoolean((String)val));
                            break;
                        }
                        case "3": {
                            condR.setDate(col, MCMiningUtil.toConditionDate((String)val));
                            break;
                        }
                        case "4": {
                            condR.setTimestamp(col, MCMiningUtil.toConditionTimestamp((String)val));
                        }
                    }
                    break block44;
                }
                CondR paramR = (CondR)paramL.getFirst("item", (Comparable)((Object)col));
                if (paramR == null) {
                    return;
                }
                switch (propR.data_typ()) {
                    case "1": {
                        condR.setString(col, paramR.strval());
                        break;
                    }
                    case "2": {
                        condR.setNumber(col, paramR.numval());
                        break;
                    }
                    case "5": {
                        condR.setBoolean(col, paramR.booval());
                        break;
                    }
                    case "3": {
                        condR.setDate(col, paramR.dtval());
                        break;
                    }
                    case "4": {
                        condR.setTimestamp(col, paramR.tsval());
                        break;
                    }
                    case "6": {
                        condR.setBinary(col, paramR.binval());
                        break;
                    }
                }
            }
        });
    }

    private <T3 extends FCM_MINING_METHOD_R> void calculate(MCRow rsltR, MCList<T3> methodL, boolean before, MCExpressionFunctions ... efs) {
        methodL.forEach(methodR -> {
            String formula = methodR.formula();
            if (formula == null) {
                return;
            }
            if (before == "7".equals(methodR.sum_info_typ())) {
                return;
            }
            MCExpressionBuilder eb = new MCExpressionBuilder(efs);
            if (methodR.dec_place() != null) {
                eb.setDivideScale(methodR.dec_place().intValue());
            }
            if (methodR.round_mode_typ() != null) {
                RoundingMode rm = this.toRoundingMode(methodR.round_mode_typ());
                eb.setDivideRoundMode(rm);
            }
            MCNumber ans = eb.evaluate(formula, rsltR);
            rsltR.setNumberNE(methodR.col_id(), ans);
        });
    }

    private RoundingMode toRoundingMode(String type) {
        if (type == null) {
            return RoundingMode.DOWN;
        }
        switch (type) {
            case "1": {
                return RoundingMode.UP;
            }
            case "2": {
                return RoundingMode.DOWN;
            }
            case "3": {
                return RoundingMode.HALF_UP;
            }
        }
        return RoundingMode.DOWN;
    }

    public void pushTaskMessage(String taskid, MCOperation ope) {
        MCMiningManager mgr = MCMiningManager.getManager();
        TaskCondR tcond = TaskCondR.create();
        tcond.task_id(taskid);
        MCList taskL = MCList.create(FCM_MINING_TASK_R.class);
        MCList paramL = MCList.create(FCM_MINING_TASK_PARAM_R.class);
        mgr.getTask(tcond, taskL, null, paramL, null);
        if (taskL.size() <= 0) {
            return;
        }
        FCM_MINING_TASK_R taskR = (FCM_MINING_TASK_R)taskL.get(0);
        InfoCondR icond = InfoCondR.create();
        icond.mining_id(taskR.mining_id());
        MCList miningL = MCList.create(FCM_MINING_R.class);
        MCList condL = MCList.create(FCM_MINING_CONDITION_R.class);
        mgr.getInfo(icond, miningL, condL, null, null);
        if (miningL.size() <= 0) {
            return;
        }
        FCM_MINING_R miningR = (FCM_MINING_R)miningL.get(0);
        this.pushTaskMessage(taskR, paramL, miningR, condL, ope);
    }

    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T11 extends FCM_MINING_TASK_R, T13 extends FCM_MINING_TASK_PARAM_R> void pushTaskMessage(T11 taskR, MCList<T13> paramL, T1 miningR, MCList<T2> condL, MCOperation ope) {
        String[] dests;
        MCIndexKey idx = paramL.createIndex(new String[]{"param_key"});
        MCMessage msg = null;
        FCM_MINING_TASK_PARAM_R msgR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst(idx, new Comparable[]{"push.msgid"});
        if (msgR == null || msgR.param_val() == null) {
            msgR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst(idx, new Comparable[]{"push.msgedit"});
            if (msgR != null) {
                msg = new MCMessage(Core_Msg_FW_A.FCBAC0435, new Object[]{msgR.param_val()});
            }
        } else {
            msg = new MCMessage(msgR.param_val(), new Object[0]);
        }
        if (msg == null) {
            return;
        }
        MCMessagePool.add((MCMessage)msg);
        msgR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst(idx, new Comparable[]{"push.imp"});
        boolean imp = msgR == null || msgR.param_val() == null ? false : Boolean.parseBoolean(msgR.param_val());
        MCMessage title = new MCMessage(Core_Msg_FW_A.FCBAC0444, new Object[]{taskR.task_nm()});
        MCPushMessage push = new MCPushMessage(msg, title, imp);
        String pc_mid = miningR.scr_module_id();
        String pc_sid = miningR.screen_id();
        if (pc_mid != null && pc_sid != null) {
            push.setScreenPC(pc_mid, pc_sid);
            for (FCM_MINING_CONDITION_R condR : condL) {
                push.addScreenParamPC(condR.scr_itm_id(), condR.init_val());
            }
            push.setScreenActionPC("__search__");
        }
        String md_mid = miningR.md_module_id();
        String md_sid = miningR.md_screen_id();
        if (md_mid != null && md_sid != null) {
            push.setScreenMD(pc_mid, pc_sid);
            for (FCM_MINING_CONDITION_R condR : condL) {
                push.addScreenParamMD(condR.scr_itm_id(), condR.init_val());
            }
            push.setScreenActionMD("__search__");
        }
        if ((msgR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst(idx, new Comparable[]{"push.type"})) == null || msgR.param_val() == null) {
            return;
        }
        String[] to = new String[]{};
        String[] stringArray = dests = MCMiningUtil.getValidDestIDs();
        int n = dests.length;
        int n2 = 0;
        while (n2 < n) {
            String dest = stringArray[n2];
            to = (String[])MCCollectionUtil.concat((Object[][])new String[][]{to, this.getPushDestArray(dest, paramL, idx)});
            ++n2;
        }
        HashSet<String> toSet = new HashSet<String>();
        String[] stringArray2 = to;
        int n3 = to.length;
        n = 0;
        while (n < n3) {
            String user = stringArray2[n];
            toSet.add(user);
            ++n;
        }
        to = toSet.toArray(new String[toSet.size()]);
        MCServerPushManager mgr = MCServerPushManager.getManager();
        switch (msgR.param_val()) {
            case "3": {
                mgr.sendMessage(push, ope, to);
                break;
            }
            case "1": {
                mgr.pushMessage(push, ope, to);
                break;
            }
            case "2": {
                mgr.mailMessage(push, ope, to);
                break;
            }
            case "0": {
                mgr.storeMessage(push, ope, to);
                break;
            }
        }
    }

    private <T13 extends FCM_MINING_TASK_PARAM_R> String[] getPushDestArray(String type, MCList<T13> paramL, MCIndexKey idx) {
        String classname = MCConst.plugin.getName(MCConst.createKey((String[])new String[]{"mining.push.dest", type, "getter"}));
        if (classname == null) {
            return new String[0];
        }
        MCPushDestPlugin getter = (MCPushDestPlugin)MCFactory.create(MCPushDestPlugin.class, (String)classname);
        HashSet<String> idSet = new HashSet<String>();
        String base = MCConst.createKey((String[])new String[]{"push.dest", type});
        int cnt = 0;
        FCM_MINING_TASK_PARAM_R paramR = null;
        while ((paramR = (FCM_MINING_TASK_PARAM_R)paramL.getFirst(idx, new Comparable[]{MCConst.createKey((String[])new String[]{base, String.valueOf(cnt)})})) != null) {
            idSet.add(paramR.param_val());
            ++cnt;
        }
        return getter.getUsers(idSet.toArray(new String[cnt]));
    }
}

