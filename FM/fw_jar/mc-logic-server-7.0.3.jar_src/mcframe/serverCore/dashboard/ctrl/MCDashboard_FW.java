/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCIndexKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.serverCore.logic.IfMCOperation
 *  mcframe.serverCore.notice.MCMessagePool
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.dashboard.ctrl;

import java.util.Collection;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.serverCore.dashboard.MCDashboardUtil;
import mcframe.serverCore.dashboard.ctrl.Cnd0R;
import mcframe.serverCore.dashboard.ctrl.Data_Cnd1R;
import mcframe.serverCore.dashboard.ctrl.Data_Rslt0R;
import mcframe.serverCore.dashboard.ctrl.GadgetR;
import mcframe.serverCore.dashboard.ctrl.List_Cnd1R;
import mcframe.serverCore.dashboard.ctrl.List_Rslt0R;
import mcframe.serverCore.dashboard.ctrl.MCDashboard_FW_A;
import mcframe.serverCore.dashboard.ctrl.Prop_Cnd1R;
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch01;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch02;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch03;
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R;
import mcframe.serverCore.logic.IfMCOperation;
import mcframe.serverCore.mining.gadget.MCMiningGadget;
import mcframe.serverCore.mining.gadget.MCMiningGadget_FW;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

public abstract class MCDashboard_FW
extends MCDashboard_FW_A {
    private static MCList<GadgetR> _gadgetL = null;
    private static MCIndexKey _gadgetIdx = null;
    private static final Object _lock = new Object();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected MCList<GadgetR> getGadgetList() {
        Object object = _lock;
        synchronized (object) {
            if (_gadgetL == null) {
                String[] entries;
                MCList gadgetL = MCList.create(GadgetR.class);
                String[] stringArray = entries = MCConst.app.findPattern("gadget.class.*");
                int n = entries.length;
                int n2 = 0;
                while (n2 < n) {
                    String entry = stringArray[n2];
                    GadgetR gadgetR = (GadgetR)gadgetL.createRow();
                    if (MCConst.app.getBoolean(MCConst.createKey((String[])new String[]{entry, "visible"}), true)) {
                        String mid = MCConst.app.getString(MCConst.createKey((String[])new String[]{entry, "module"}));
                        String lid = MCConst.app.getString(MCConst.createKey((String[])new String[]{entry, "key"}));
                        if (mid == null || lid == null) {
                            MCLog.write((String)Core_Msg_FW_A.FCBAC0481, (Object[])new Object[]{entry});
                        } else {
                            String open = MCConst.app.getString(MCConst.createKey((String[])new String[]{entry, "property", "PC", "open"}));
                            boolean enable = MCConst.app.getBoolean(MCConst.createKey((String[])new String[]{entry, "enable"}), true);
                            gadgetR.gadget(lid);
                            gadgetR.mid(mid);
                            gadgetR.lid(lid);
                            gadgetR.open(open);
                            gadgetR.enable(enable);
                            gadgetR.user(false);
                            gadgetL.add((MCRow)gadgetR);
                        }
                    }
                    ++n2;
                }
                _gadgetIdx = gadgetL.createIndex(new String[]{"gadget"});
                _gadgetL = gadgetL;
            }
        }
        return _gadgetL;
    }

    protected GadgetR getGadgetRow(String gadget) {
        MCList<GadgetR> gadgetL = this.getGadgetList();
        GadgetR gadgetR = (GadgetR)gadgetL.getFirst(_gadgetIdx, new Comparable[]{gadget});
        String name = MCConst.lgclbl.getLabel(gadgetR.mid(), gadgetR.lid(), null, MCSys.user.locale());
        gadgetR.name(name);
        return gadgetR;
    }

    protected <T extends IfMCOperation> T createGadgetOperation(String gadget, String oid, Class<T> clazz) {
        if (MCDashboardUtil.miningGadget((String)gadget)) {
            return this.createGadgetOperation("FC", "FCBAL0040", oid, clazz);
        }
        GadgetR gadgetR = this.getGadgetRow(gadget);
        return this.createGadgetOperation(gadgetR, oid, clazz);
    }

    protected <T extends IfMCOperation> T createGadgetOperation(GadgetR gadgetR, String oid, Class<T> clazz) {
        String mid = null;
        String lid = null;
        if (gadgetR != null) {
            mid = gadgetR.mid();
            lid = gadgetR.lid();
        }
        return this.createGadgetOperation(mid, lid, oid, clazz);
    }

    protected <T extends IfMCOperation> T createGadgetOperation(String mid, String lid, String oid, Class<T> clazz) {
        MCDashboardUtil.checkACL(mid, lid, oid);
        return (T)MCDashboard_FW.createOperation((String)mid, (String)lid, (String)oid, clazz);
    }

    protected void logError(Exception e, MCRow srcR) {
        MCException ex = e instanceof MCException ? (MCException)((Object)e) : new MCException((Throwable)e);
        MCLog.write((Throwable)ex);
        ex.setCauseRow(srcR, null);
        MCMessagePool.add((MCMessage)ex.getMCMessage());
    }

    public class Srch01
    extends MCDashboard_FW_A.Srch01 {
        public Srch01() {
            super(MCDashboard_FW.this);
        }

        protected void call() {
            MCList<Prop_Cnd1R> cnd1L = this.up1();
            if (cnd1L.size() == 0) {
                MCList<GadgetR> gadgetL = MCDashboard_FW.this.getGadgetList();
                for (GadgetR gadgetR : gadgetL) {
                    String name = MCConst.lgclbl.getLabel(gadgetR.mid(), gadgetR.lid(), null, MCSys.user.locale());
                    gadgetR.name(name);
                    this.addPropertyForOperation(gadgetR, null);
                }
                this.addPropertyForMiningOperation(null);
            } else {
                for (Prop_Cnd1R cnd1R : cnd1L) {
                    String gadget = cnd1R.gadget();
                    if (MCDashboardUtil.miningGadget((String)gadget)) {
                        this.addPropertyForMiningOperation(gadget);
                        continue;
                    }
                    GadgetR gadgetR = MCDashboard_FW.this.getGadgetRow(gadget);
                    this.addPropertyForOperation(gadgetR, (MCRow)cnd1R);
                }
            }
        }

        protected void addPropertyForOperation(GadgetR gadgetR, MCRow srcR) {
            Cnd0R cnd0R = this.up0();
            MCList<Prop_Rslt0R> rslt0L = this.down0();
            try {
                IfMCDashboard_ISrch01 subope = MCDashboard_FW.this.createGadgetOperation(gadgetR, "Srch01", IfMCDashboard_ISrch01.class);
                String gadget = gadgetR.gadget();
                mcframe.serverCore.dashboard.gadget.Cnd0R sub_cnd0R = subope.up0();
                sub_cnd0R.devtype(cnd0R.devtype());
                sub_cnd0R.gadget(gadget);
                subope.exec();
                if (subope.down0().getFirst(new String[]{"gadget", "key"}, new Comparable[]{gadget, "name"}) == null) {
                    this.addPropertyRow(rslt0L, gadget, "name", gadgetR.name());
                }
                rslt0L.addAll(subope.down0());
            }
            catch (Exception e) {
                MCException mce;
                if (e instanceof MCException && (mce = (MCException)((Object)e)).getID().equals(Core_Msg_FW_A.FCBHC0024)) {
                    return;
                }
                MCDashboard_FW.this.logError(e, srcR);
            }
        }

        protected void addPropertyForMiningOperation(String gadget) {
            Cnd0R cnd0R = this.up0();
            MCList<Prop_Rslt0R> rslt0L = this.down0();
            MCMiningGadget_FW.Srch01 srch01 = MCMiningGadget.crtSrch01();
            srch01.up0().devtype(cnd0R.devtype());
            srch01.up0().gadget(gadget);
            srch01.exec();
            MCList<Prop_Rslt0R> propL = srch01.down0();
            propL.sort(new String[]{"gadget"});
            propL.forEach(propR -> {
                String g = propR.gadget();
                this.addPropertyRow(rslt0L, g, propR.key(), propR.value());
            });
        }

        protected void addPropertyRow(MCList<Prop_Rslt0R> rsltL, String gadget, String key, String value) {
            Prop_Rslt0R rsltR = (Prop_Rslt0R)rsltL.createRow();
            rsltR.gadget(gadget);
            rsltR.key(key);
            rsltR.value(value);
            rsltL.add((MCRow)rsltR);
        }
    }

    public class Srch02
    extends MCDashboard_FW_A.Srch02 {
        public Srch02() {
            super(MCDashboard_FW.this);
        }

        protected void call() {
            MCList[] conds;
            Cnd0R cnd0R = this.up0();
            MCList<Data_Cnd1R> cnd1L = this.up1();
            MCList<Data_Rslt0R> rslt0L = this.down0();
            MCList[] mCListArray = conds = cnd1L.groupList(new String[]{"gkey"});
            int n = conds.length;
            int n2 = 0;
            while (n2 < n) {
                Data_Cnd1R cnd1R;
                String gkey;
                MCList cond = mCListArray[n2];
                if (cond.size() != 0 && (gkey = (cnd1R = (Data_Cnd1R)cond.get(0)).gkey()) != null) {
                    String gadget = cnd1R.gadget();
                    try {
                        IfMCDashboard_ISrch02 subope = MCDashboard_FW.this.createGadgetOperation(gadget, "Srch02", IfMCDashboard_ISrch02.class);
                        mcframe.serverCore.dashboard.gadget.Cnd0R sub_cnd0R = subope.up0();
                        sub_cnd0R.devtype(cnd0R.devtype());
                        sub_cnd0R.gadget(gadget);
                        MCList<Data_Cnd0R> sub_cnd1L = subope.up1();
                        sub_cnd1L.addAll((Collection)cnd1L.subList("gkey", (Comparable)((Object)gkey)));
                        sub_cnd1L.removeAll((Collection)sub_cnd1L.subList("item", (Comparable)((Object)"__no_cond__")));
                        subope.exec();
                        for (mcframe.serverCore.dashboard.gadget.Data_Rslt0R sub_rslt0R : subope.down0()) {
                            Data_Rslt0R rslt0R = (Data_Rslt0R)rslt0L.createRow();
                            rslt0R.gkey(gkey);
                            rslt0R.item(sub_rslt0R.item());
                            rslt0R.strval(sub_rslt0R.strval());
                            rslt0R.numval(sub_rslt0R.numval());
                            rslt0R.booval(sub_rslt0R.booval());
                            rslt0R.dtval(sub_rslt0R.dtval());
                            rslt0R.tsval(sub_rslt0R.tsval());
                            rslt0R.binval(sub_rslt0R.binval());
                            rslt0L.add((MCRow)rslt0R);
                        }
                        Data_Rslt0R rslt0R = (Data_Rslt0R)rslt0L.getFirst(new String[]{"gkey", "item"}, new Comparable[]{gkey, "date.update"});
                        if (rslt0R == null) {
                            rslt0R = (Data_Rslt0R)rslt0L.createRow();
                            rslt0R.gkey(gkey);
                            rslt0R.item("date.update");
                            rslt0R.dtval(MCDate.now());
                            rslt0L.add((MCRow)rslt0R);
                        }
                    }
                    catch (Exception e) {
                        MCDashboard_FW.this.logError(e, (MCRow)cnd1R);
                    }
                }
                ++n2;
            }
        }
    }

    public class Srch03
    extends MCDashboard_FW_A.Srch03 {
        public Srch03() {
            super(MCDashboard_FW.this);
        }

        protected void call() {
            MCList[] cnd1Ls;
            Cnd0R cnd0R = this.up0();
            MCList<List_Cnd1R> cnd1L = this.up1();
            MCList<List_Rslt0R> rslt0L = this.down0();
            MCList[] mCListArray = cnd1Ls = cnd1L.groupList(new String[]{"gkey"});
            int n = cnd1Ls.length;
            int n2 = 0;
            while (n2 < n) {
                MCList list = mCListArray[n2];
                List_Cnd1R cnd1R = (List_Cnd1R)list.get(0);
                String gkey = cnd1R.gkey();
                if (gkey != null) {
                    String gadget = cnd1R.gadget();
                    try {
                        IfMCDashboard_ISrch03 subope = MCDashboard_FW.this.createGadgetOperation(gadget, "Srch03", IfMCDashboard_ISrch03.class);
                        mcframe.serverCore.dashboard.gadget.Cnd0R sub_cnd0R = subope.up0();
                        sub_cnd0R.devtype(cnd0R.devtype());
                        sub_cnd0R.gadget(gadget);
                        subope.up1().addAll((Collection)list);
                        subope.exec();
                        for (mcframe.serverCore.dashboard.gadget.List_Rslt0R sub_rslt0R : subope.down0()) {
                            List_Rslt0R rslt0R = (List_Rslt0R)rslt0L.createRow();
                            rslt0R.gkey(gkey);
                            rslt0R.item(sub_rslt0R.item());
                            rslt0R.value(sub_rslt0R.value());
                            rslt0R.name(sub_rslt0R.name());
                            rslt0R.parent(sub_rslt0R.parent());
                            rslt0R.key(sub_rslt0R.key());
                            rslt0L.add((MCRow)rslt0R);
                        }
                    }
                    catch (Exception e) {
                        MCDashboard_FW.this.logError(e, (MCRow)cnd1R);
                    }
                }
                ++n2;
            }
        }
    }
}

