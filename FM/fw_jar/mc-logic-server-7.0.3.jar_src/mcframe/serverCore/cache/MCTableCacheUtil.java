/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.serverCore.resource.MCConfig
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.resource.MCConfig;

public class MCTableCacheUtil {
    private static List<String> _target = null;

    private static List<String> getTargetList() {
        if (_target == null) {
            String[] tables;
            ArrayList<String> list = new ArrayList<String>();
            String[] stringArray = tables = MCConfig.server.getStringArray("tablecache.system.table", new String[0]);
            int n = tables.length;
            int n2 = 0;
            while (n2 < n) {
                String table = stringArray[n2];
                if (table.length() > 0) {
                    list.add(table);
                }
                ++n2;
            }
            _target = list;
        }
        return _target;
    }

    public static String[] cacheList() {
        return MCTableCacheUtil.getTargetList().toArray(new String[MCTableCacheUtil.getTargetList().size()]);
    }

    public static boolean checkTarget(String table) {
        return MCTableCacheUtil.getTargetList().contains(table);
    }

    static boolean validKeyValue(Comparable<?> ... vals) {
        Comparable<?>[] comparableArray = vals;
        int n = vals.length;
        int n2 = 0;
        while (n2 < n) {
            Comparable<?> val = comparableArray[n2];
            if (val == null) {
                return false;
            }
            ++n2;
        }
        return true;
    }
}

