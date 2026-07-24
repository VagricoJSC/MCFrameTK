/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.meta.M_META
 */
package mcframe.serverCore.mining.ctrl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.meta.M_META;
import mcframe.serverCore.mining.ctrl.TaskCondR;

abstract class TaskCondR_FW_A
extends MCConstRow {
    public static final String $task_id = "task_id";
    public static final String $mining_id = "mining_id";
    public static final String $user_id = "user_id";
    public static final String $co_cd = "co_cd";
    public static final MCMeta task_id_META = TaskCondR_FW_A.createCommonMeta((String)"task_id", (MCMeta)M_META.MINING_TASK_ID);
    public static final MCMeta mining_id_META = TaskCondR_FW_A.createCommonMeta((String)"mining_id", (MCMeta)M_META.MINING_ID);
    public static final MCMeta user_id_META = TaskCondR_FW_A.createCommonMeta((String)"user_id", (MCMeta)M_META.USR_ID);
    public static final MCMeta co_cd_META = TaskCondR_FW_A.createCommonMeta((String)"co_cd", (MCMeta)M_META.CO_CD);
    protected static final MCRow.ConstMetaList<TaskCondR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{task_id_META, mining_id_META, user_id_META, co_cd_META}, (String[][])new String[][]{new String[0], new String[0]});
    protected static final MCExtMap EXTMAP = new MCExtMap(null, new MCExtMap.Entry[0]);
    private static final int offset = constMetas.offset();

    public static String[] colnames() {
        return constMetas.toNameArray();
    }

    public static MCMeta[] colmetas() {
        return constMetas.toMetaArray();
    }

    public Map<String, String> getExtMap(String aGroup) {
        if (aGroup == null) {
            return null;
        }
        return (Map)EXTMAP.get((Object)aGroup);
    }

    public List<String> getKeys(String aGroup) {
        if (aGroup == null) {
            return null;
        }
        return EXTMAP.getKeyList(aGroup);
    }

    public Set<String> getExtGroups() {
        Set ret = EXTMAP.keySet();
        return ret;
    }

    protected TaskCondR_FW_A(MCRow.ConstMetaList<? extends TaskCondR> metas) {
        super(metas);
    }

    public TaskCondR clone() {
        return (TaskCondR)super.clone();
    }

    public TaskCondR createInstance() {
        return (TaskCondR)super.createInstance();
    }

    public TaskCondR getValues(String ... names) {
        return (TaskCondR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String task_id() {
        return this.getConstString(offset + 0, $task_id);
    }

    public void task_id(String value) {
        this.setConstString(offset + 0, $task_id, value);
    }

    public String mining_id() {
        return this.getConstString(offset + 1, $mining_id);
    }

    public void mining_id(String value) {
        this.setConstString(offset + 1, $mining_id, value);
    }

    public String user_id() {
        return this.getConstString(offset + 2, $user_id);
    }

    public void user_id(String value) {
        this.setConstString(offset + 2, $user_id, value);
    }

    public String co_cd() {
        return this.getConstString(offset + 3, $co_cd);
    }

    public void co_cd(String value) {
        this.setConstString(offset + 3, $co_cd, value);
    }

    public String getString(String name) {
        if ($task_id.equalsIgnoreCase(name)) {
            return this.task_id();
        }
        if ($mining_id.equalsIgnoreCase(name)) {
            return this.mining_id();
        }
        if ($user_id.equalsIgnoreCase(name)) {
            return this.user_id();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($task_id.equalsIgnoreCase(name)) {
            return this.task_id();
        }
        if ($mining_id.equalsIgnoreCase(name)) {
            return this.mining_id();
        }
        if ($user_id.equalsIgnoreCase(name)) {
            return this.user_id();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($task_id.equalsIgnoreCase(name)) {
            this.task_id(value);
            return;
        }
        if ($mining_id.equalsIgnoreCase(name)) {
            this.mining_id(value);
            return;
        }
        if ($user_id.equalsIgnoreCase(name)) {
            this.user_id(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($task_id.equalsIgnoreCase(name)) {
            this.task_id(value);
            return;
        }
        if ($mining_id.equalsIgnoreCase(name)) {
            this.mining_id(value);
            return;
        }
        if ($user_id.equalsIgnoreCase(name)) {
            this.user_id(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

