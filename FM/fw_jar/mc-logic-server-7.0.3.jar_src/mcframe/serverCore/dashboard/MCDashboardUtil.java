/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.dashboard.MCDashboardUtil
 *  mcframe.serverCore.acl.MCACPhase
 */
package mcframe.serverCore.dashboard;

import mcframe.serverCore.acl.MCACPhase;

public class MCDashboardUtil
extends mcframe.commonCore.dashboard.MCDashboardUtil {
    public static void checkACL(String mid, String lid, String oid) {
        MCACPhase.checkACL((String)mid, (String)lid, (String)oid);
    }

    protected MCDashboardUtil() {
    }
}

