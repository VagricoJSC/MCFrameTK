/*
 * Decompiled with CFR 0.152.
 */
package mcframe.serverCore.mining.task;

import java.util.Arrays;
import mcframe.serverCore.mining.task.MCPushDestPlugin;

public class MCPushDestSys
implements MCPushDestPlugin {
    @Override
    public String[] getUsers(String ... ids) {
        return ids != null ? Arrays.copyOf(ids, ids.length) : new String[]{};
    }
}

