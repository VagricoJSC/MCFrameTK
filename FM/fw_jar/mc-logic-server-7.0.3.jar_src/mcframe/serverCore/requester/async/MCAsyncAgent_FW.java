/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.param.MCParam
 *  mcframe.commonCore.pio.MCDPReaderFactory
 *  mcframe.commonCore.pio.MCP2TBodyReader
 *  mcframe.commonCore.pio.MCP2THeaderReader
 *  mcframe.commonCore.pio.util.MCDPFormat
 *  mcframe.commonCore.pio.util.MCDPParseType
 *  mcframe.commonCore.pio.util.MCParseTypeUtil
 *  mcframe.serverCore.requester.MCDispatcherContext
 */
package mcframe.serverCore.requester.async;

import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.pio.MCDPReaderFactory;
import mcframe.commonCore.pio.MCP2TBodyReader;
import mcframe.commonCore.pio.MCP2THeaderReader;
import mcframe.commonCore.pio.util.MCDPFormat;
import mcframe.commonCore.pio.util.MCDPParseType;
import mcframe.commonCore.pio.util.MCParseTypeUtil;
import mcframe.serverCore.requester.MCDispatcherContext;
import mcframe.serverCore.requester.async.MCAsyncAgent_FW_A;
import mcframe.serverCore.requester.async.MCAsyncRequester;

public abstract class MCAsyncAgent_FW
extends MCAsyncAgent_FW_A {

    public class CallAsync
    extends MCAsyncAgent_FW_A.CallAsync {
        public CallAsync() {
            super(MCAsyncAgent_FW.this);
        }

        protected void call() {
            super.call();
            String down = this.callDecorate(this.up0().denbun());
            this.down0().denbun(down);
        }

        protected void decorate(MCDispatcherContext ctx) {
            try {
                this.requestAsync(ctx);
                MCDPFormat fmt = ctx.getUpDPT().getFormat();
                MCP2THeaderReader hr = MCDPReaderFactory.downHeaderToText((MCDPFormat)fmt);
                hr.read(ctx.param(), ctx.getDwDPW());
                ctx.param().getContainerParam().down().clear();
                ctx.param().getExceptionParam().clear();
                ctx.param().getMessageParam().clear();
                MCP2TBodyReader br = MCDPReaderFactory.downBodyToText((MCDPFormat)fmt, (MCDPParseType)MCParseTypeUtil.getParseType((MCParam)ctx.param()));
                br.read(ctx.param(), ctx.getDwDPW());
                ctx.getRequestStatus().success();
            }
            catch (Throwable t) {
                ctx.getRequestStatus().error();
                throw t;
            }
        }

        private void requestAsync(MCDispatcherContext ctx) {
            MCDispatcherContext asyncCtx = this.parseUpHdr(this.decoratedUp);
            asyncCtx.param().setOperationAsync(true);
            String reqid = asyncCtx.param().getServerRequestNo();
            asyncCtx.param().getUploadFileParam().addAll(MCAsyncAgent_FW.this._upfiles);
            MCAsyncRequester async = new MCAsyncRequester(reqid, asyncCtx, this.decoratedUp, this.up1().push_msg(), this.up2());
            new Thread(async).start();
            this.requestResult(reqid, ctx);
            this.down1().reqid(reqid);
        }

        private void requestResult(String reqid, MCDispatcherContext ctx) {
        }
    }
}

