/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.notice.MCMessageList
 */
package mcframe.serverCore.mining;

import mcframe.commonCore.notice.MCMessageList;
import mcframe.serverCore.mining.MCMiningManager;

public abstract class AbsMCPackageProxy {
    protected void schedule(String taskid, boolean forced) {
        MCMiningManager.getManager().schedule(taskid, forced);
    }

    protected void immediate(String taskid) {
        MCMiningManager.getManager().immediate(taskid);
    }

    protected void cancel(String ... taskids) {
        MCMiningManager.getManager().cancel(taskids);
    }

    protected MCMessageList promote() {
        return MCMiningManager.getManager().promote();
    }

    protected void demote() {
        MCMiningManager.getManager().demote();
    }
}

