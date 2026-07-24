/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.param.MCOperationInfo
 *  mcframe.commonCore.param.MCParam
 *  mcframe.serverCore.logic.MCLogic
 *  mcframe.serverCore.logic.MCLogicUtil
 *  mcframe.serverCore.requester.decorator.DecR
 *  mcframe.serverCore.requester.decorator.MCDecorator
 *  mcframe.serverCore.requester.decorator.MCDecorator_FW
 *  mcframe.serverCore.requester.decorator.MCDecorator_FW$Decorate
 */
package mcframe.serverCore.requester.async;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.serverCore.logic.MCLogic;
import mcframe.serverCore.logic.MCLogicUtil;
import mcframe.serverCore.requester.async.Info2R;
import mcframe.serverCore.requester.async.InfoR;
import mcframe.serverCore.requester.async.MCAsyncAgent;
import mcframe.serverCore.requester.async.MCAsyncAgent_FW;
import mcframe.serverCore.requester.async.PDef;
import mcframe.serverCore.requester.decorator.DecR;
import mcframe.serverCore.requester.decorator.MCDecorator;
import mcframe.serverCore.requester.decorator.MCDecorator_FW;

public abstract class MCAsyncAgent_FW_A
extends MCDecorator {
    public static final String MODULE_ID = "FC";
    public static final String SUBMODULE_ID = "FCBG";
    public static final String LOGIC_ID = "FCBGL4000";
    protected MCAsyncAgent_FW.CallAsync aCallAsync;

    public String getModuleID() {
        return MODULE_ID;
    }

    public String getSubmoduleID() {
        return SUBMODULE_ID;
    }

    public String getLogicID() {
        return LOGIC_ID;
    }

    protected void initCallAsync() {
        this.info = PDef.FC_FCBGL4000_CallAsync_INFO;
        this.aCallAsync = (MCAsyncAgent)this.new MCAsyncAgent_FW.CallAsync();
    }

    public static MCAsyncAgent_FW.CallAsync crtCallAsync() {
        MCAsyncAgent lgc = new MCAsyncAgent();
        lgc.initCallAsync();
        return lgc.aCallAsync;
    }

    protected void paramCallAsync(MCParam p) {
        if (this.aCallAsync == null) {
            return;
        }
        p.setDef(this.info.def);
        p.addUpBlock((MCContainer)this.aCallAsync.up0());
        p.addUpBlock((MCContainer)this.aCallAsync.up1());
        p.addUpBlock(this.aCallAsync.up2());
        p.addDownBlock((MCContainer)this.aCallAsync.down0());
        p.addDownBlock((MCContainer)this.aCallAsync.down1());
    }

    protected void doCallAsync() {
        this.aCallAsync.call();
    }

    public DecR createDecR() {
        return DecR.create();
    }

    public InfoR createInfoR() {
        return InfoR.create();
    }

    public Info2R createInfo2R() {
        return Info2R.create();
    }

    public MCList<Info2R> createInfo2L() {
        return MCList.create(Info2R.class);
    }

    public abstract class CallAsync
    extends MCDecorator_FW.Decorate {
        public static final String OPERATION_ID = "CallAsync";
        private final DecR up0;
        private final InfoR up1;
        private final MCList<Info2R> up2;
        private final DecR down0;
        private final InfoR down1;

        public String getOperationID() {
            return OPERATION_ID;
        }

        protected CallAsync() {
            super((MCDecorator_FW)MCAsyncAgent_FW_A.this);
            this.up0 = DecR.create();
            this.up1 = InfoR.create();
            this.up2 = MCList.create(Info2R.class);
            this.down0 = DecR.create();
            this.down1 = InfoR.create();
        }

        public void mapUpContainers(String key) {
            super.mapUpContainers(key);
        }

        public void mapDownContainers(String key) {
            super.mapDownContainers(key);
        }

        public MCContainer up(int i) {
            if (i == 0) {
                return this.up0();
            }
            if (i == 1) {
                return this.up1();
            }
            if (i == 2) {
                return this.up2();
            }
            return null;
        }

        public MCContainer down(int i) {
            if (i == 0) {
                return this.down0();
            }
            if (i == 1) {
                return this.down1();
            }
            return null;
        }

        public void exec() {
            this.clear();
            MCLogicUtil.invoke((MCLogic)((MCAsyncAgent)MCAsyncAgent_FW_A.this));
        }

        protected void clear() {
            this.down0().clear();
            this.down1().clear();
        }

        public DecR createDecR() {
            return DecR.create();
        }

        public InfoR createInfoR() {
            return InfoR.create();
        }

        public Info2R createInfo2R() {
            return Info2R.create();
        }

        public MCList<Info2R> createInfo2L() {
            return MCList.create(Info2R.class);
        }

        public DecR up0() {
            return this.up0;
        }

        public InfoR up1() {
            return this.up1;
        }

        public MCList<Info2R> up2() {
            return this.up2;
        }

        public DecR down0() {
            return this.down0;
        }

        public InfoR down1() {
            return this.down1;
        }

        public MCOperationInfo getOperationInfo() {
            return ((MCAsyncAgent_FW_A)((MCAsyncAgent)MCAsyncAgent_FW_A.this)).info;
        }
    }
}

