/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCJoinKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.mining.MCMiningUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.serverCore.dbc.FCM_MINING_CONDITION_R
 *  mcframe.serverCore.dbc.FCM_MINING_METHOD_R
 *  mcframe.serverCore.dbc.FCM_MINING_R
 *  mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R
 *  mcframe.serverCore.login.MCUserAuthAgent
 *  mcframe.serverCore.login.PicR
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.mining.gadget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mcframe.commonCore.container.MCJoinKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.mining.MCMiningUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.serverCore.dashboard.gadget.Cnd0R;
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R;
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R;
import mcframe.serverCore.dashboard.gadget.MCGadgetUtil;
import mcframe.serverCore.dbc.FCM_MINING_CONDITION_R;
import mcframe.serverCore.dbc.FCM_MINING_METHOD_R;
import mcframe.serverCore.dbc.FCM_MINING_R;
import mcframe.serverCore.dbc.FCM_MINING_SUMCOND_R;
import mcframe.serverCore.login.MCUserAuthAgent;
import mcframe.serverCore.login.PicR;
import mcframe.serverCore.mining.MCMiningAgent;
import mcframe.serverCore.mining.MCMiningManager;
import mcframe.serverCore.mining.ctrl.InfoCondR;
import mcframe.serverCore.mining.gadget.MCMiningGadget_FW_A;
import mcframe.serverCore.mining.task.MCMiningGadgetCache;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

public abstract class MCMiningGadget_FW
extends MCMiningGadget_FW_A {

    public class Srch01
    extends MCMiningGadget_FW_A.Srch01 {
        private Map<String, PicR> _picMap;

        public Srch01() {
            super(MCMiningGadget_FW.this);
            this._picMap = new HashMap<String, PicR>();
        }

        protected void call() {
            MCGadgetUtil.Chart.Property property = MCGadgetUtil.chartProperty(this);
            this.down0().clear();
            MCMiningManager mgr = MCMiningManager.getManager();
            MCList miningL = MCList.create(FCM_MINING_R.class);
            MCList condL = MCList.create(FCM_MINING_CONDITION_R.class);
            MCList methodL = MCList.create(FCM_MINING_METHOD_R.class);
            InfoCondR infoCond = InfoCondR.create();
            infoCond.mining_id(this.up0().gadget());
            infoCond.user_id(MCSys.user.ID());
            infoCond.co_cd(MCSys.user.coCD());
            infoCond.acl_co(true);
            infoCond.acl_sys(true);
            if (!mgr.getInfo(infoCond, miningL, condL, methodL, null)) {
                return;
            }
            methodL = methodL.subList("inv_flg", (Comparable)Boolean.FALSE);
            MCJoinKey condKey = miningL.join("mining_id", condL, "mining_id");
            MCJoinKey methodKey = miningL.join("mining_id", methodL, "mining_id");
            miningL.forEach(miningR -> {
                boolean pc;
                MCBinary icon;
                MCList cL = miningR.getJoined(condKey);
                MCList mL = miningR.getJoined(methodKey);
                try {
                    mgr.checkMethodRelation(miningR.mining_id(), mL);
                }
                catch (MCException e) {
                    if (!Core_Msg_FW_A.FCBAC0477.equals(e.getID())) {
                        throw e;
                    }
                    return;
                }
                ArrayList columnList = new ArrayList();
                ArrayList chartList = new ArrayList();
                ArrayList colorList = new ArrayList();
                mL.forEach(mR -> {
                    if (!"1".equals(mR.sum_info_typ()) && mR.graph_typ() != null) {
                        columnList.add(this.createColumnLabel((FCM_MINING_METHOD_R)mR));
                        String g = MCGadgetUtil.convChartType((int[])new int[]{mR.graph_typ().intValue()});
                        chartList.add(g);
                        String color = mR.graph_color();
                        if (color != null) {
                            colorList.add(color);
                        }
                    }
                });
                if (columnList.size() <= 0) {
                    return;
                }
                property.change(miningR.mining_id());
                property.setResourceProperty(this.getOperationInfo().logicId);
                property.setName(this.createGadgetName((FCM_MINING_R)miningR));
                property.setDescription(this.createDescription((FCM_MINING_R)miningR));
                property.setSearchOnce(miningR.gadget_cache_flg());
                property.setColumnLabel(columnList.toArray(new String[columnList.size()]));
                property.setChartType(chartList.toArray(new String[chartList.size()]));
                if (chartList.size() == colorList.size()) {
                    property.setChartColor(colorList.toArray(new String[colorList.size()]));
                }
                if ((icon = miningR.gadget_icon()) != null && icon.isDBFile()) {
                    property.setIcon(icon);
                }
                String size = (pc = "0".equals(this.up0().devtype())) ? miningR.gadget_size() : miningR.md_gadget_size();
                int[] sizes = MCMiningUtil.getGadgetSize((String)size);
                property.setSize(sizes[0], sizes[1]);
                if (pc) {
                    property.setOpenScreen(miningR.scr_module_id(), miningR.screen_id());
                } else {
                    property.setOpenScreen(miningR.md_module_id(), miningR.md_screen_id());
                }
                cL.forEach(cR -> {
                    if (cR.editable_flg()) {
                        this.setCondition(property, (FCM_MINING_CONDITION_R)cR);
                        if (pc) {
                            property.addOpenCondition(cR.scr_itm_id(), cR.col_id());
                        }
                    } else if (pc) {
                        this.setOpenParam(property, (FCM_MINING_CONDITION_R)cR);
                    }
                });
                property.addOpenAction("__search__");
            });
        }

        protected String createGadgetName(FCM_MINING_R miningR) {
            String name = miningR.mining_nm();
            if (name == null) {
                name = MCConst.lgclbl.getLabel(miningR.module_id(), miningR.logic_id(), null, MCSys.user.locale());
            }
            return name;
        }

        protected String createDescription(FCM_MINING_R miningR) {
            String desc = miningR.description_text();
            String user = miningR.user_id();
            PicR picR = this._picMap.get(user);
            if (picR == null) {
                picR = MCUserAuthAgent.getAgent().getPicRow(user);
                this._picMap.put(user, picR);
            }
            MCMessage msg = new MCMessage(Core_Msg_FW_A.FCBAC0479, new Object[]{desc != null ? desc : "", picR != null ? picR.usr_nm_lcl() : user});
            return msg.toString();
        }

        protected void setCondition(MCGadgetUtil.Chart.Property property, FCM_MINING_CONDITION_R cR) {
            switch (cR.data_typ()) {
                case "1": {
                    property.addConditionString(cR.col_id(), cR.col_nm(), cR.require_flg(), cR.editable_flg());
                    break;
                }
                case "2": {
                    property.addConditionNumber(cR.col_id(), cR.col_nm(), cR.require_flg(), cR.editable_flg());
                    break;
                }
                case "3": {
                    property.addConditionDate(cR.col_id(), cR.col_nm(), cR.require_flg(), cR.editable_flg());
                    break;
                }
                case "4": {
                    property.addConditionTimestamp(cR.col_id(), cR.col_nm(), cR.require_flg(), cR.editable_flg());
                    break;
                }
                case "5": {
                    property.addConditionBoolean(cR.col_id(), cR.col_nm(), cR.editable_flg());
                    break;
                }
            }
        }

        protected void setOpenParam(MCGadgetUtil.Chart.Property property, FCM_MINING_CONDITION_R cR) {
            String col = cR.scr_itm_id();
            String val = cR.init_val();
            switch (cR.data_typ()) {
                case "1": {
                    property.addOpenParam(col, MCMiningUtil.toConditionString((String)val));
                    break;
                }
                case "2": {
                    property.addOpenParam(col, MCMiningUtil.toConditionNumber((String)val));
                    break;
                }
                case "3": {
                    property.addOpenParam(col, MCMiningUtil.toConditionDate((String)val));
                    break;
                }
                case "4": {
                    property.addOpenParam(col, MCMiningUtil.toConditionTimestamp((String)val));
                    break;
                }
                case "5": {
                    property.addOpenParam(col, MCMiningUtil.toConditionBoolean((String)val));
                    break;
                }
            }
        }

        protected String createColumnLabel(FCM_MINING_METHOD_R mR) {
            String label = mR.col_nm();
            String sumcond = mR.sumcond();
            label = sumcond != null ? String.valueOf(label) + ":" + sumcond : label;
            return label;
        }
    }

    public class Srch02
    extends MCMiningGadget_FW_A.Srch02 {
        public Srch02() {
            super(MCMiningGadget_FW.this);
        }

        protected void call() {
            MCGadgetUtil.Chart.Data data = MCGadgetUtil.chartData(this);
            Cnd0R cndR = this.up0();
            MCList<Data_Cnd0R> cnd0L = this.up1();
            String gadget = cndR.gadget();
            MCList<Data_Rslt0R> cacheL = MCMiningGadgetCache.get(gadget);
            if (cacheL != null) {
                this.down0().addAll(cacheL);
                return;
            }
            MCList miningL = MCList.create(FCM_MINING_R.class);
            MCList condL = MCList.create(FCM_MINING_CONDITION_R.class);
            MCList methodL = MCList.create(FCM_MINING_METHOD_R.class);
            MCList sumcondL = MCList.create(FCM_MINING_SUMCOND_R.class);
            MCList<MCRow> retL = MCMiningAgent.getAgent().mining(gadget, cnd0L, miningL, condL, methodL, sumcondL);
            MCMiningGadgetCache.convGadgetData(data, retL, (FCM_MINING_R)miningL.get(0), condL, methodL, sumcondL);
        }
    }

    public class Srch03
    extends MCMiningGadget_FW_A.Srch03 {
        public Srch03() {
            super(MCMiningGadget_FW.this);
        }

        protected void call() {
        }
    }
}

