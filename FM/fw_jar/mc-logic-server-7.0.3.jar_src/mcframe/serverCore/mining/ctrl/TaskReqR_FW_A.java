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
import mcframe.serverCore.mining.ctrl.TaskReqR;

abstract class TaskReqR_FW_A
extends MCConstRow {
    public static final String $task_id = "task_id";
    public static final String $user_id = "user_id";
    public static final MCMeta task_id_META = TaskReqR_FW_A.createCommonMeta((String)"task_id", (MCMeta)M_META.MINING_TASK_ID);
    public static final MCMeta user_id_META = TaskReqR_FW_A.createCommonMeta((String)"user_id", (MCMeta)M_META.USR_ID);
    protected static final MCRow.ConstMetaList<TaskReqR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{task_id_META, user_id_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected TaskReqR_FW_A(MCRow.ConstMetaList<? extends TaskReqR> metas) {
        super(metas);
    }

    public TaskReqR clone() {
        return (TaskReqR)super.clone();
    }

    public TaskReqR createInstance() {
        return (TaskReqR)super.createInstance();
    }

    public TaskReqR getValues(String ... names) {
        return (TaskReqR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String task_id() {
        return this.getConstString(offset + 0, $task_id);
    }

    public void task_id(String value) {
        this.setConstString(offset + 0, $task_id, value);
    }

    public String user_id() {
        return this.getConstString(offset + 1, $user_id);
    }

    public void user_id(String value) {
        this.setConstString(offset + 1, $user_id, value);
    }

    public String getString(String name) {
        if ($task_id.equalsIgnoreCase(name)) {
            return this.task_id();
        }
        if ($user_id.equalsIgnoreCase(name)) {
            return this.user_id();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($task_id.equalsIgnoreCase(name)) {
            return this.task_id();
        }
        if ($user_id.equalsIgnoreCase(name)) {
            return this.user_id();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($task_id.equalsIgnoreCase(name)) {
            this.task_id(value);
            return;
        }
        if ($user_id.equalsIgnoreCase(name)) {
            this.user_id(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($task_id.equalsIgnoreCase(name)) {
            this.task_id(value);
            return;
        }
        if ($user_id.equalsIgnoreCase(name)) {
            this.user_id(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

