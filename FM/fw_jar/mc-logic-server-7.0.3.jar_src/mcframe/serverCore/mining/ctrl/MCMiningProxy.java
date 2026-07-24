/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.notice.MCMessageList
 */
package mcframe.serverCore.mining.ctrl;

import mcframe.commonCore.notice.MCMessageList;
import mcframe.serverCore.mining.AbsMCPackageProxy;

final class MCMiningProxy
extends AbsMCPackageProxy {
    static final MCMiningProxy PROXY = new MCMiningProxy();

    private MCMiningProxy() {
    }

    @Override
    protected void schedule(String taskid, boolean forced) {
        super.schedule(taskid, forced);
    }

    @Override
    protected void immediate(String taskid) {
        super.immediate(taskid);
    }

    @Override
    protected void cancel(String ... taskids) {
        super.cancel(taskids);
    }

    @Override
    protected MCMessageList promote() {
        return super.promote();
    }

    @Override
    protected void demote() {
        super.demote();
    }
}

