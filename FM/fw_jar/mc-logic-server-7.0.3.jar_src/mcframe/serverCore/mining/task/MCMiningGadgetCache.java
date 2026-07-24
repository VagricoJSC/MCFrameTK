/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.container.io.MCCsvReader
 *  mcframe.commonCore.container.io.MCCsvWriter
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.lang.MCDataType
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCMessageList
 *  mcframe.commonCore.param.MCDownloadStream
 *  mcframe.commonCore.requester.MCDownloadUtil
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R
 *  mcframe.serverCore.dbc.FCM_MINING_TASK_R
 *  mcframe.serverCore.dbc.FCT_MINING_GADGET_CACHE_R
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.sys.MCSys
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.mining.task;

import java.io.File;
import java.util.ArrayList;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.io.MCCsvReader;
import mcframe.commonCore.container.io.MCCsvWriter;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.param.MCDownloadStream;
import mcframe.commonCore.requester.MCDownloadUtil;
import mcframe.serverCore.dashboard.MCDashboardUtil;
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R;
import mcframe.serverCore.dashboard.gadget.MCGadgetUtil;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_PARAM_R;
import mcframe.serverCore.dbc.FCM_MINING_TASK_R;
import mcframe.serverCore.dbc.FCT_MINING_GADGET_CACHE_R;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.mining.MCMiningAgent;
import mcframe.serverCore.mining.MCMiningManager;
import mcframe.serverCore.mining.ctrl.InfoCondR;
import mcframe.serverCore.mining.task.MCMiningTaskPlugin;
import mcframe.serverCore.mining.task.MCPushProxy;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.util.MCDBUtil;

public class MCMiningGadgetCache
implements MCMiningTaskPlugin {
    static final String LABEL_SEP = " / ";

    @Override
    public void chkTask(FCM_MINING_TASK_R taskR, FCM_MINING_R miningR) {
        if (!miningR.gadget_cache_flg()) {
            throw new MCException(Core_Msg_FW_A.FCBAC0458, new Object[]{miningR.mining_id(), miningR.mining_nm()});
        }
    }

    @Override
    public <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R, T11 extends FCM_MINING_TASK_R, T13 extends FCM_MINING_TASK_PARAM_R> void exec(T11 taskR, MCList<T13> paramL, MCList<MCRow> rsltL, MCOperation ope, T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        MCList dataL = MCList.create(Data_Rslt0R.class);
        MCGadgetUtil.Chart.Data data = MCGadgetUtil.chartData((MCList<Data_Rslt0R>)dataL);
        MCMiningGadgetCache.convGadgetData(data, taskR.mining_id(), rsltL);
        File file = new File(MCMiningAgent.getAgent().getWorkDir(), MCMiningGadgetCache.getSaveName(taskR.mining_id(), false));
        file.delete();
        MCCsvWriter writer = new MCCsvWriter(dataL, file);
        MCMessageList errList = writer.write();
        if (errList.size() > 0) {
            MCException ex = new MCException(Core_Msg_FW_A.FCBAC0453, new Object[]{taskR.task_id(), file.getAbsolutePath()});
            ex.addCauseMessageList(errList);
            throw ex;
        }
        MCBinary bin = MCBinary.valueOf((File)file);
        FCT_MINING_GADGET_CACHE_R cacheR = FCT_MINING_GADGET_CACHE_R.create();
        cacheR.mining_id(taskR.mining_id());
        cacheR.co_cd(taskR.co_cd());
        FCT_MINING_GADGET_CACHE_R t = FCT_MINING_GADGET_CACHE_R.create((String)"T");
        int cnt = MCDBUtil.dbSelectKeyForUpdateNoWait((String)"MCMiningGadgetCache_FCT_MINING_GADGET_CACHE_S01", (MCRow)cacheR, (MCDBContainer)t, (MCRow)cacheR);
        cacheR.data(bin);
        cacheR.upd_co_dt(MCDate.now());
        MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)t);
        switch (cnt) {
            case 0: {
                cacheR.mining_id(taskR.mining_id());
                cacheR.co_cd(taskR.co_cd());
                MCDBUtil.dbInsert((String)"MCMiningGadgetCache_FCT_MINING_GADGET_CACHE_I01", (MCRow)cacheR, (MCQueryApiBuilder)bldr);
                break;
            }
            case 1: {
                MCDBUtil.dbUpdateKey((String)"MCMiningGadgetCache_FCT_MINING_GADGET_CACHE_U01", (MCRow)cacheR, (MCQueryApiBuilder)bldr);
                break;
            }
        }
        MCTransactionManager.dbTran().commit();
        MCPushProxy.PROXY.updateGadgetData(ope.getOperationInfo(), taskR.mining_id());
    }

    public static void convGadgetData(MCGadgetUtil.Chart.Data data, String gadget, MCList<MCRow> retL) {
        MCList miningL = MCList.create(FCM_MINING_R.class);
        MCList methodL = MCList.create(FCM_MINING_METHOD_R.class);
        InfoCondR infoCond = InfoCondR.create();
        infoCond.mining_id(gadget);
        infoCond.user_id(MCSys.user.ID());
        infoCond.co_cd(MCSys.user.coCD());
        if (!MCMiningManager.getManager().getInfo(infoCond, miningL, null, methodL, null)) {
            throw new MCException(Core_Msg_FW_A.FCBAC0452, new Object[]{gadget});
        }
        MCMiningGadgetCache.convGadgetData(data, retL, (FCM_MINING_R)miningL.get(0), null, methodL, null);
    }

    public static <T1 extends FCM_MINING_R, T2 extends FCM_MINING_CONDITION_R, T3 extends FCM_MINING_METHOD_R, T4 extends FCM_MINING_SUMCOND_R> void convGadgetData(MCGadgetUtil.Chart.Data data, MCList<MCRow> retL, T1 miningR, MCList<T2> condL, MCList<T3> methodL, MCList<T4> sumcondL) {
        if ((methodL = methodL.subList("inv_flg", (Comparable)Boolean.FALSE)).size() <= 0) {
            throw new MCException(Core_Msg_FW_A.FCBAC0452, new Object[]{miningR.mining_id()});
        }
        MCList grpL = methodL.subList("sum_info_typ", (Comparable)((Object)"1"));
        ArrayList colList = new ArrayList();
        methodL.forEach(methodR -> {
            if (!"1".equals(methodR.sum_info_typ()) && methodR.graph_typ() != null) {
                String col = MCMiningUtil.createSumColumnId((String)methodR.col_id(), (String)methodR.sumcond(), (String)methodR.sum_info_typ());
                colList.add(col);
            }
        });
        if (colList.size() <= 0) {
            throw new MCException(Core_Msg_FW_A.FCBAC0480, new Object[]{miningR.mining_id()});
        }
        String[] titles = methodL.subList("graph_label_flg", (Comparable)Boolean.valueOf(true)).getString("col_nm").toArray(new String[0]);
        data.setRowTitle(MCStringUtil.join((String)LABEL_SEP, (String[])titles));
        ArrayList rowLabelList = new ArrayList();
        retL.forEach(retR -> {
            int r = rowLabelList.size();
            int i = 0;
            while (i < colList.size()) {
                String col = (String)colList.get(i);
                data.setValue(r, i, retR.getNumber(col));
                ++i;
            }
            ArrayList lbls = new ArrayList();
            grpL.forEach(grpR -> {
                String id = grpR.col_id();
                MCMeta meta = retR.getMeta(id);
                lbls.add(MCDashboardUtil.graphLabel((MCRow)retR, (String)id, (MCDataType)meta.type(), (String)grpR.date_fmt()));
            });
            String lbl = MCStringUtil.join((String)LABEL_SEP, (String[])lbls.toArray(new String[lbls.size()]));
            rowLabelList.add(lbl);
        });
        String[] rowLabels = rowLabelList.toArray(new String[rowLabelList.size()]);
        data.setRowLabel(rowLabels);
    }

    public static MCList<Data_Rslt0R> get(String miningid) {
        MCBinary bin;
        MCList miningL = MCList.create(FCM_MINING_R.class);
        InfoCondR infoCond = InfoCondR.create();
        infoCond.mining_id(miningid);
        infoCond.user_id(MCSys.user.ID());
        infoCond.co_cd(MCSys.user.coCD());
        infoCond.acl_co(true);
        infoCond.acl_sys(true);
        if (!MCMiningManager.getManager().getInfo(infoCond, miningL, null, null, null)) {
            throw new MCException(Core_Msg_FW_A.FCBAC0452, new Object[]{miningid});
        }
        FCM_MINING_R miningR = (FCM_MINING_R)miningL.get(0);
        if (!miningR.gadget_cache_flg()) {
            return null;
        }
        MCList dataL = MCList.create(Data_Rslt0R.class);
        Data_Rslt0R updR = (Data_Rslt0R)dataL.createRow();
        updR.item("date.update");
        FCT_MINING_GADGET_CACHE_R cacheR = FCT_MINING_GADGET_CACHE_R.create();
        cacheR.mining_id(miningid);
        cacheR.co_cd(MCSys.user.coCD());
        FCT_MINING_GADGET_CACHE_R t = FCT_MINING_GADGET_CACHE_R.create((String)"T");
        if (MCDBUtil.dbSelectKey((String)"MCMiningGadgetCache_FCT_MINING_GADGET_CACHE_S02", (MCRow)cacheR, (MCDBContainer)t, (MCRow)cacheR) == 1 && (bin = cacheR.data()) != null) {
            MCDownloadStream dls = MCTransactionManager.dbTran().statement().selectBinary(bin.toDBPointer());
            File file = MCDownloadUtil.saveFile((MCDownloadStream)dls, (File)new File(MCMiningAgent.getAgent().getWorkDir()), (String)MCMiningGadgetCache.getSaveName(miningR.mining_id(), true));
            MCCsvReader reader = new MCCsvReader(dataL, file);
            MCMessageList errList = reader.read();
            if (errList.size() > 0) {
                MCException ex = new MCException(Core_Msg_FW_A.FCBAC0454, new Object[]{miningid, file.getAbsolutePath()});
                ex.addCauseMessageList(errList);
                throw ex;
            }
            updR.dtval(cacheR.upd_co_dt());
        }
        dataL.add((MCRow)updR);
        return dataL;
    }

    private static String getSaveName(String miningid, boolean forGet) {
        return String.valueOf(forGet ? "g_" : "p_") + miningid + ".cache";
    }
}

