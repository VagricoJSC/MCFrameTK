/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDMLListener
 *  mcframe.serverCore.queryapi.MCDBContainer
 */
package mcframe.serverCore.cache;

import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.requester.MCCacheUpdateNotifier;

public class MCTableModifyListener
implements IFMCSQL.MCDMLListener {
    public void inserted(MCDBContainer dbc) {
        MCCacheUpdateNotifier.addToRequest(dbc, MCCacheUpdateNotifier.ModifyType.INSERT);
    }

    public void updated(MCDBContainer dbc) {
        MCCacheUpdateNotifier.addToRequest(dbc, MCCacheUpdateNotifier.ModifyType.UPDATE);
    }

    public void deleted(MCDBContainer dbc) {
        MCCacheUpdateNotifier.addToRequest(dbc, MCCacheUpdateNotifier.ModifyType.DELETE);
    }
}

