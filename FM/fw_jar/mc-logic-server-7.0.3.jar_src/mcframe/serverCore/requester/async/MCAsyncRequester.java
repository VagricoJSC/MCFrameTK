/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.lang.MCStringUtil
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.commonCore.param.MCDPWriter
 *  mcframe.commonCore.param.MCParamFileUtil
 *  mcframe.commonCore.pio.MCDPReaderFactory
 *  mcframe.commonCore.pio.MCE2TReader
 *  mcframe.commonCore.pio.util.MCDPFormat
 *  mcframe.commonCore.push.MCPushMessage
 *  mcframe.commonCore.util.MCFileUtil
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.notice.MCMessagePool
 *  mcframe.serverCore.push.MCServerPushManager
 *  mcframe.serverCore.requester.MCDispatcherContext
 *  mcframe.serverCore.requester.MCRequestHandler
 *  mcframe.serverCore.requester.MCRequestStatus
 *  mcframe.serverCore.requester.MCRequestStatusImpl
 *  mcframe.serverCore.requester.MCServerRequester$UserInfoLogger
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.requester.async;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.param.MCDPWriter;
import mcframe.commonCore.param.MCParamFileUtil;
import mcframe.commonCore.pio.MCDPReaderFactory;
import mcframe.commonCore.pio.MCE2TReader;
import mcframe.commonCore.pio.util.MCDPFormat;
import mcframe.commonCore.push.MCPushMessage;
import mcframe.commonCore.util.MCFileUtil;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.push.MCServerPushManager;
import mcframe.serverCore.requester.MCDispatcherContext;
import mcframe.serverCore.requester.MCRequestHandler;
import mcframe.serverCore.requester.MCRequestStatus;
import mcframe.serverCore.requester.MCRequestStatusImpl;
import mcframe.serverCore.requester.MCServerRequester;
import mcframe.serverCore.requester.async.Info2R;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

public class MCAsyncRequester
implements Runnable {
    private final String reqid;
    private final MCDispatcherContext ctx;
    private final String up;
    private final String push_msg;
    private MCList<Info2R> scr_container = null;

    MCAsyncRequester(String reqid, MCDispatcherContext ctx, String up, String push_msg, MCList<Info2R> scr_container) {
        this.reqid = reqid;
        this.ctx = ctx;
        this.up = up;
        this.push_msg = push_msg;
        this.scr_container = scr_container;
    }

    @Override
    public void run() {
        try {
            try {
                this.exec();
            }
            catch (Throwable e) {
                MCLog.write((Throwable)e);
                MCTransactionManager.finalClose();
            }
        }
        finally {
            MCTransactionManager.finalClose();
        }
    }

    private void exec() {
        StringWriter sw = new StringWriter(1024);
        MCDPWriter dwdpw = new MCDPWriter((Writer)sw, true);
        dwdpw.setOperationID(this.ctx.param().getModuleId(), this.ctx.param().getLogicId(), this.ctx.param().getOperationId());
        this.ctx.setDwDPW(dwdpw);
        this.ctx.setRequestStatus((MCRequestStatus)new MCRequestStatusImpl(this.ctx.param(), dwdpw));
        MCRequestHandler hndl = this.initialize();
        if (hndl == null) {
            this.ctx.getRequestStatus().initerror();
            return;
        }
        InfoLogger logger = new InfoLogger();
        dwdpw.setDumpId(logger.downId());
        logger.writeStartLog();
        logger.writeAccessUsertLog();
        logger.writeUpLog(this.ctx, this.up);
        this.registFileIfPresent(this.scr_container);
        try {
            hndl.dispatch(this.ctx);
        }
        catch (Throwable t) {
            MCLog.write((Throwable)new MCException(t, Core_Msg_FW_A.FCBGC0394, new Object[]{this.reqid}));
            this.ctx.getDwDPW().closeDump();
            MCFileUtil.writeText((CharSequence)this.parseDwErr(t), (File)MCParamFileUtil.getDownParamFile());
            this.ctx.getRequestStatus().syserror();
        }
        logger.writeEndLog();
        this.finalize(hndl);
    }

    private MCRequestHandler initialize() {
        MCRequestHandler hndl = new MCRequestHandler();
        try {
            hndl.initRequestObject(this.ctx);
        }
        catch (Throwable t) {
            MCLog.write((Throwable)new MCException(t, Core_Msg_FW_A.FCBGC0395, new Object[]{this.reqid}));
            hndl.destroy();
            hndl = null;
        }
        return hndl;
    }

    private void registFileIfPresent(MCList<Info2R> scr_container) {
        if (!scr_container.isEmpty()) {
            ArrayList list = new ArrayList();
            scr_container.forEach(r -> {
                boolean bl = list.add(r.scr_container().toFile());
            });
            MCRequestStatusImpl.registerFile((File[])list.toArray(new File[list.size()]));
        }
    }

    private void finalize(MCRequestHandler hndl) {
        try {
            try {
                this.pushSendMessage();
            }
            catch (Throwable t) {
                MCLog.write((Throwable)new MCException(t, Core_Msg_FW_A.FCBGC0396, new Object[]{this.reqid}));
                hndl.destroy();
            }
        }
        finally {
            hndl.destroy();
        }
    }

    private void pushSendMessage() {
        String type;
        String msg = !MCStringUtil.isNull((String)this.push_msg) ? this.push_msg : MCConst.lgclbl.getLabel(this.ctx.param().getModuleId(), this.ctx.param().getLogicId(), this.ctx.param().getOperationId(), MCSys.user.locale());
        String msgId = MCMessagePool.isEmpty() ? Core_Msg_FW_A.FCBGC0431 : Core_Msg_FW_A.FCBGC0456;
        MCMessage message = new MCMessage(msgId, new Object[]{this.reqid, msg, this.ctx.getRequestStatus().getStatus()});
        MCPushMessage push = new MCPushMessage(message, false);
        push.setScreenPC("FS", "FSBGP0140");
        push.addScreenParamPC("Cnd.srv_req_no", this.reqid);
        push.setScreenActionPC("__search__");
        MCServerPushManager pushMgr = MCServerPushManager.getManager();
        String mid = this.ctx.param().getModuleId();
        String lid = this.ctx.param().getLogicId();
        String oid = this.ctx.param().getOperationId();
        String uid = this.ctx.param().getUserId();
        switch (type = MCConfig.server.getString("async.push.type", "3")) {
            case "0": {
                pushMgr.storeMessage(push, mid, lid, oid, new String[]{uid});
                break;
            }
            case "1": {
                pushMgr.pushMessage(push, mid, lid, oid, new String[]{uid});
                break;
            }
            case "2": {
                pushMgr.mailMessage(push, mid, lid, oid, new String[]{uid});
                break;
            }
            case "3": {
                pushMgr.sendMessage(push, mid, lid, oid, new String[]{uid});
                break;
            }
        }
    }

    private String parseDwErr(Throwable t) {
        MCDPFormat fmt = this.ctx.getUpDPT().getFormat();
        MCE2TReader e2t = MCDPReaderFactory.downExceptionToText((MCDPFormat)fmt);
        return e2t.parse(t);
    }

    static class InfoLogger
    extends MCServerRequester.UserInfoLogger {
        InfoLogger() {
        }

        protected String startId() {
            return Core_Msg_FW_A.FCBGC0389;
        }

        protected String endId() {
            return Core_Msg_FW_A.FCBGC0390;
        }

        protected String upId() {
            return Core_Msg_FW_A.FCBGC0391;
        }

        protected String downId() {
            return Core_Msg_FW_A.FCBGC0392;
        }
    }
}

