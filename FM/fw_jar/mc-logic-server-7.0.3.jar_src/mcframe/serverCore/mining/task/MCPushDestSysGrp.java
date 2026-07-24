/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.serverCore.login.MCUserR
 */
package mcframe.serverCore.mining.task;

import java.util.HashSet;
import mcframe.commonCore.container.MCList;
import mcframe.serverCore.group.MCUserGroupManager;
import mcframe.serverCore.login.MCUserR;
import mcframe.serverCore.mining.task.MCPushDestPlugin;

public class MCPushDestSysGrp
implements MCPushDestPlugin {
    @Override
    public String[] getUsers(String ... ids) {
        HashSet<String> set = new HashSet<String>();
        MCUserGroupManager mgr = MCUserGroupManager.getManager();
        String[] stringArray = ids;
        int n = ids.length;
        int n2 = 0;
        while (n2 < n) {
            String id = stringArray[n2];
            MCList<MCUserR> list = mgr.getGrantUserList(id);
            if (list != null) {
                for (MCUserR user : list) {
                    set.add(user.user_id());
                }
            }
            ++n2;
        }
        return set.toArray(new String[set.size()]);
    }
}

