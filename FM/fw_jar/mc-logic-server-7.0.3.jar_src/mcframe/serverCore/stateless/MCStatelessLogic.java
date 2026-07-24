/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.param.MCDef
 *  mcframe.commonCore.param.MCExceptionParam
 *  mcframe.commonCore.param.MCParam
 *  mcframe.commonCore.pio.util.MCDPFormat
 *  mcframe.commonCore.requester.MCControlRequester
 *  mcframe.commonCore.requester.MCParamHeaderUtil
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.login.MCAuth
 *  mcframe.serverCore.login.MCAuth_FW$GeneralLoginEx
 *  mcframe.serverCore.login.MCAuth_FW$GeneralLogout
 *  mcframe.serverCore.requester.MCServerRequester
 */
package mcframe.serverCore.stateless;

import java.util.List;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCExceptionParam;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.pio.util.MCDPFormat;
import mcframe.commonCore.requester.MCControlRequester;
import mcframe.commonCore.requester.MCParamHeaderUtil;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.login.MCAuth;
import mcframe.serverCore.login.MCAuth_FW;
import mcframe.serverCore.requester.MCServerRequester;
import mcframe.serverCore.stateless.MCStatelessContext;

public abstract class MCStatelessLogic<C extends MCStatelessContext> {
    protected MCStatelessLogic() {
    }

    protected void call(C context, MCParam param) {
        try {
            this.login(context);
            this.request(context, param);
        }
        finally {
            this.logout(context);
        }
    }

    protected void login(C context) {
        MCAuth_FW.GeneralLoginEx ope = MCAuth.crtGeneralLoginEx();
        MCParam param = this.createParam((MCOperation)ope);
        ope.up0().UserID(this.createIdentifyID(((MCStatelessContext)context).userID()));
        ope.up0().Password(((MCStatelessContext)context).userPassword());
        ope.up0().CltID(((MCStatelessContext)context).clientID());
        ope.up0().ArcCD("7");
        ope.up0().CoCD(((MCStatelessContext)context).coCD());
        ope.up0().ExtAttr1(((MCStatelessContext)context).extAttr1());
        ope.up0().ExtAttr2(((MCStatelessContext)context).extAttr2());
        ope.up0().ExtAttr3(((MCStatelessContext)context).extAttr3());
        param.addUpBlock((MCContainer)ope.up0());
        param.addUpBlock((MCContainer)ope.up1());
        param.addUpBlock((MCContainer)ope.up2());
        param.addDownBlock((MCContainer)ope.down0());
        param.addDownBlock((MCContainer)ope.down1());
        param.addDownBlock((MCContainer)ope.down2());
        param.addDownBlock((MCContainer)ope.down3());
        ((MCStatelessContext)context).createdTime(MCTimestamp.now());
        this.initLoginParam(context, param);
        this.requestImpl(param);
        ((MCStatelessContext)context).coCD(ope.down0().CoCD());
        ((MCStatelessContext)context).loginSequence(ope.down0().LoginSeq());
    }

    private void initLoginParam(C context, MCParam param) {
        param.setReqSrcId(((MCStatelessContext)context).reqSrcID());
        MCParamHeaderUtil.toUpHeader((MCParam)param, (String)((MCStatelessContext)context).clientID(), (String)((MCStatelessContext)context).requestNo(), (MCNumber)((MCStatelessContext)context).limitDlSize());
    }

    protected void request(C context, MCParam param) {
        ((MCStatelessContext)context).createdTime(MCTimestamp.now());
        this.initParam(context, param);
        this.requestImpl(param);
    }

    protected void logout(C context) {
        if (context != null && ((MCStatelessContext)context).isLogin()) {
            try {
                MCAuth_FW.GeneralLogout ope = MCAuth.crtGeneralLogout();
                MCParam param = this.createParam((MCOperation)ope);
                ((MCStatelessContext)context).createdTime(MCTimestamp.now());
                this.initParam(context, param);
                this.requestImpl(param);
            }
            catch (Throwable t) {
                MCLog.write((Throwable)t);
            }
        }
    }

    protected void initParam(C context, MCParam param) {
        param.setReqSrcId(((MCStatelessContext)context).reqSrcID());
        param.setClientRequestNo(((MCStatelessContext)context).requestNo());
        param.setClientId(((MCStatelessContext)context).clientID());
        param.setCreatedTime(((MCStatelessContext)context).createdTime());
        param.setServerRequestNo(null);
        param.setLimitDLSize(((MCStatelessContext)context).limitDlSize());
        param.setUserId(((MCStatelessContext)context).userID());
        param.setLoginSequence(((MCStatelessContext)context).loginSequence());
        param.setClientLocale(((MCStatelessContext)context).locale());
        param.setClientTimeZone(((MCStatelessContext)context).timezone());
        List blks = param.getContainerParam().up();
        int blkNo = 0;
        while (blkNo < blks.size()) {
            MCRow cont;
            MCContainer aBlk = (MCContainer)blks.get(blkNo);
            if (aBlk instanceof MCRow) {
                cont = (MCRow)aBlk;
                cont.setParamIndex(blkNo);
                cont.setParamRowIndex(0);
            } else {
                cont = (MCList)aBlk;
                cont.setParamIndex(blkNo);
                int size = cont.size();
                int i = 0;
                while (i < size) {
                    MCRow r = cont.get(i);
                    r.setParamRowIndex(i);
                    ++i;
                }
            }
            ++blkNo;
        }
    }

    protected MCParam createParam(String module, String logic, String operation, String version, MCDef def) {
        MCParam param = new MCParam(module, logic, operation, version);
        param.setDef(def);
        return param;
    }

    protected MCParam createParam(MCOperation ope) {
        return new MCParam(ope.getOperationInfo());
    }

    private void requestImpl(MCParam param) {
        try {
            this.createRequester().request(param);
        }
        catch (Throwable t) {
            if (t instanceof MCException) {
                MCException mce = (MCException)t;
                if (Core_Msg_FW_A.FCBGC0032.equals(((MCException)t).getID())) {
                    t = mce.getCause();
                }
            }
            MCLog.write((Throwable)t);
            String bind = t instanceof MCException ? ((MCException)t).getID() : t.getMessage();
            throw new MCException(t, Core_Msg_FW_A.FCBGC0033, new Object[]{bind});
        }
        this.paramToException(param);
    }

    protected MCControlRequester createRequester() {
        return new MCServerRequester(){

            protected MCDPFormat getDPFormat() {
                return MCStatelessLogic.this.getDPFormat();
            }
        };
    }

    private void paramToException(MCParam param) {
        MCExceptionParam exparam = param.getExceptionParam();
        if (!exparam.isEmpty()) {
            throw exparam.getException();
        }
    }

    protected abstract MCDPFormat getDPFormat();

    protected abstract String createIdentifyID(String var1);
}

