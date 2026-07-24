/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.param.MCOperationInfo
 *  mcframe.serverCore.push.AbsMCPackageProxy
 */
package mcframe.serverCore.mining.task;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.push.AbsMCPackageProxy;

final class MCPushProxy
extends AbsMCPackageProxy {
    static MCPushProxy PROXY = new MCPushProxy();

    MCPushProxy() {
    }

    protected void updateGadgetData(MCOperationInfo ope, String ... ids) {
        super.updateGadgetData(ope, ids);
    }
}

