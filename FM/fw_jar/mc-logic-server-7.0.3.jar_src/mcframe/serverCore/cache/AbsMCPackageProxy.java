/*
 * Decompiled with CFR 0.152.
 */
package mcframe.serverCore.cache;

import java.util.List;
import mcframe.serverCore.cache.MCTableCache;

public abstract class AbsMCPackageProxy {
    protected List<Object[]> tableCacheExpandSysAll() {
        return MCTableCache.expandSysAll();
    }
}

