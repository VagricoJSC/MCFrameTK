/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.param.MCOperationInfo
 *  mcframe.commonCore.param.MCParam
 *  mcframe.serverCore.logic.MCLogic
 *  mcframe.serverCore.logic.MCLogicBase
 *  mcframe.serverCore.logic.MCLogicUtil
 *  mcframe.serverCore.logic.MCOperation
 */
package mcframe.serverCore.mining.gadget;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.dashboard.gadget.Cnd0R;
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R;
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch01;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch02;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch03;
import mcframe.serverCore.dashboard.gadget.List_Cnd0R;
import mcframe.serverCore.dashboard.gadget.List_Rslt0R;
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R;
import mcframe.serverCore.logic.MCLogic;
import mcframe.serverCore.logic.MCLogicBase;
import mcframe.serverCore.logic.MCLogicUtil;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mining.gadget.MCMiningGadget;
import mcframe.serverCore.mining.gadget.MCMiningGadget_FW;
import mcframe.serverCore.mining.gadget.PDef;

public abstract class MCMiningGadget_FW_A
extends MCLogicBase {
    public static final String MODULE_ID = "FC";
    public static final String SUBMODULE_ID = "FCBA";
    public static final String LOGIC_ID = "FCBAL0040";
    protected MCMiningGadget_FW.Srch01 aSrch01;
    protected MCMiningGadget_FW.Srch02 aSrch02;
    protected MCMiningGadget_FW.Srch03 aSrch03;

    public String getModuleID() {
        return MODULE_ID;
    }

    public String getSubmoduleID() {
        return SUBMODULE_ID;
    }

    public String getLogicID() {
        return LOGIC_ID;
    }

    protected void initSrch01() {
        this.info = PDef.FC_FCBAL0040_Srch01_INFO;
        this.aSrch01 = (MCMiningGadget)this.new MCMiningGadget_FW.Srch01();
    }

    public static MCMiningGadget_FW.Srch01 crtSrch01() {
        MCMiningGadget lgc = new MCMiningGadget();
        lgc.initSrch01();
        return lgc.aSrch01;
    }

    protected void paramSrch01(MCParam p) {
        if (this.aSrch01 == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aSrch01.up0());
        p.addDownBlock(this.aSrch01.down0());
    }

    protected void doSrch01() {
        this.aSrch01.call();
    }

    public Cnd0R createProp_Cnd0R() {
        return Cnd0R.create();
    }

    public Prop_Rslt0R createProp_Rslt0R() {
        return Prop_Rslt0R.create();
    }

    public MCList<Prop_Rslt0R> createProp_Rslt0L() {
        return MCList.create(Prop_Rslt0R.class);
    }

    protected void initSrch02() {
        this.info = PDef.FC_FCBAL0040_Srch02_INFO;
        this.aSrch02 = (MCMiningGadget)this.new MCMiningGadget_FW.Srch02();
    }

    public static MCMiningGadget_FW.Srch02 crtSrch02() {
        MCMiningGadget lgc = new MCMiningGadget();
        lgc.initSrch02();
        return lgc.aSrch02;
    }

    protected void paramSrch02(MCParam p) {
        if (this.aSrch02 == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aSrch02.up0());
        p.addUpBlock(this.aSrch02.up1());
        p.addDownBlock(this.aSrch02.down0());
    }

    protected void doSrch02() {
        this.aSrch02.call();
    }

    public Cnd0R createData_Cnd0R() {
        return Cnd0R.create();
    }

    public Data_Cnd0R createData_Cnd1R() {
        return Data_Cnd0R.create();
    }

    public MCList<Data_Cnd0R> createData_Cnd1L() {
        return MCList.create(Data_Cnd0R.class);
    }

    public Data_Rslt0R createData_Rslt0R() {
        return Data_Rslt0R.create();
    }

    public MCList<Data_Rslt0R> createData_Rslt0L() {
        return MCList.create(Data_Rslt0R.class);
    }

    protected void initSrch03() {
        this.info = PDef.FC_FCBAL0040_Srch03_INFO;
        this.aSrch03 = (MCMiningGadget)this.new MCMiningGadget_FW.Srch03();
    }

    public static MCMiningGadget_FW.Srch03 crtSrch03() {
        MCMiningGadget lgc = new MCMiningGadget();
        lgc.initSrch03();
        return lgc.aSrch03;
    }

    protected void paramSrch03(MCParam p) {
        if (this.aSrch03 == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aSrch03.up0());
        p.addUpBlock(this.aSrch03.up1());
        p.addDownBlock(this.aSrch03.down0());
    }

    protected void doSrch03() {
        this.aSrch03.call();
    }

    public Cnd0R createList_Cnd0R() {
        return Cnd0R.create();
    }

    public List_Cnd0R createList_Cnd1R() {
        return List_Cnd0R.create();
    }

    public MCList<List_Cnd0R> createList_Cnd1L() {
        return MCList.create(List_Cnd0R.class);
    }

    public List_Rslt0R createList_Rslt0R() {
        return List_Rslt0R.create();
    }

    public MCList<List_Rslt0R> createList_Rslt0L() {
        return MCList.create(List_Rslt0R.class);
    }

    public abstract class Srch01
    extends MCOperation
    implements IfMCDashboard_ISrch01 {
        public static final String OPERATION_ID = "Srch01";
        private final Cnd0R up0 = Cnd0R.create();
        private final MCList<Prop_Rslt0R> down0 = MCList.create(Prop_Rslt0R.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected Srch01() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        @Override
        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            return null;
        }

        @Override
        public MCContainer down(int i) {
            if (i == 0) {
                return this.down0();
            }
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCMiningGadget)MCMiningGadget_FW_A.this));
        }

        protected void clear() {
            this.down0().clear();
        }

        public Cnd0R createProp_Cnd0R() {
            return Cnd0R.create();
        }

        public Prop_Rslt0R createProp_Rslt0R() {
            return Prop_Rslt0R.create();
        }

        public MCList<Prop_Rslt0R> createProp_Rslt0L() {
            return MCList.create(Prop_Rslt0R.class);
        }

        @Override
        public Cnd0R up0() {
            return this.up0;
        }

        @Override
        public MCList<Prop_Rslt0R> down0() {
            return this.down0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMiningGadget_FW_A)((MCMiningGadget)MCMiningGadget_FW_A.this)).info;
        }
    }

    public abstract class Srch02
    extends MCOperation
    implements IfMCDashboard_ISrch02 {
        public static final String OPERATION_ID = "Srch02";
        private final Cnd0R up0 = Cnd0R.create();
        private final MCList<Data_Cnd0R> up1 = MCList.create(Data_Cnd0R.class);
        private final MCList<Data_Rslt0R> down0 = MCList.create(Data_Rslt0R.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected Srch02() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        @Override
        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            if (i == 1) {
                return this.up1();
            }
            return null;
        }

        @Override
        public MCContainer down(int i) {
            if (i == 0) {
                return this.down0();
            }
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCMiningGadget)MCMiningGadget_FW_A.this));
        }

        protected void clear() {
            this.down0().clear();
        }

        public Cnd0R createData_Cnd0R() {
            return Cnd0R.create();
        }

        public Data_Cnd0R createData_Cnd1R() {
            return Data_Cnd0R.create();
        }

        public MCList<Data_Cnd0R> createData_Cnd1L() {
            return MCList.create(Data_Cnd0R.class);
        }

        public Data_Rslt0R createData_Rslt0R() {
            return Data_Rslt0R.create();
        }

        public MCList<Data_Rslt0R> createData_Rslt0L() {
            return MCList.create(Data_Rslt0R.class);
        }

        @Override
        public Cnd0R up0() {
            return this.up0;
        }

        @Override
        public MCList<Data_Cnd0R> up1() {
            return this.up1;
        }

        @Override
        public MCList<Data_Rslt0R> down0() {
            return this.down0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMiningGadget_FW_A)((MCMiningGadget)MCMiningGadget_FW_A.this)).info;
        }
    }

    public abstract class Srch03
    extends MCOperation
    implements IfMCDashboard_ISrch03 {
        public static final String OPERATION_ID = "Srch03";
        private final Cnd0R up0 = Cnd0R.create();
        private final MCList<List_Cnd0R> up1 = MCList.create(List_Cnd0R.class);
        private final MCList<List_Rslt0R> down0 = MCList.create(List_Rslt0R.class);

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected Srch03() {
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        @Override
        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            if (i == 1) {
                return this.up1();
            }
            return null;
        }

        @Override
        public MCContainer down(int i) {
            if (i == 0) {
                return this.down0();
            }
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCMiningGadget)MCMiningGadget_FW_A.this));
        }

        protected void clear() {
            this.down0().clear();
        }

        public Cnd0R createList_Cnd0R() {
            return Cnd0R.create();
        }

        public List_Cnd0R createList_Cnd1R() {
            return List_Cnd0R.create();
        }

        public MCList<List_Cnd0R> createList_Cnd1L() {
            return MCList.create(List_Cnd0R.class);
        }

        public List_Rslt0R createList_Rslt0R() {
            return List_Rslt0R.create();
        }

        public MCList<List_Rslt0R> createList_Rslt0L() {
            return MCList.create(List_Rslt0R.class);
        }

        @Override
        public Cnd0R up0() {
            return this.up0;
        }

        @Override
        public MCList<List_Cnd0R> up1() {
            return this.up1;
        }

        @Override
        public MCList<List_Rslt0R> down0() {
            return this.down0;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCMiningGadget_FW_A)((MCMiningGadget)MCMiningGadget_FW_A.this)).info;
        }
    }
}

