/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.serverCore.mcjdbc.AbsMCPackageProxy
 */
package mcframe.serverCore.cache.ctrl;

import java.util.Locale;
import mcframe.serverCore.mcjdbc.AbsMCPackageProxy;

final class MCJdbcProxy
extends AbsMCPackageProxy {
    public static final MCJdbcProxy proxy = new MCJdbcProxy();

    MCJdbcProxy() {
    }

    protected void setCoViewInfo(String cocd, Locale locale) {
        super.setCoViewInfo(cocd, locale);
    }
}

