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
import mcframe.serverCore.mining.ctrl.InfoCondR;

abstract class InfoCondR_FW_A
extends MCConstRow {
    public static final String $mining_id = "mining_id";
    public static final String $user_id = "user_id";
    public static final String $co_cd = "co_cd";
    public static final String $acl_co = "acl_co";
    public static final String $acl_sys = "acl_sys";
    public static final MCMeta mining_id_META = InfoCondR_FW_A.createCommonMeta((String)"mining_id", (MCMeta)M_META.MINING_ID);
    public static final MCMeta user_id_META = InfoCondR_FW_A.createCommonMeta((String)"user_id", (MCMeta)M_META.USR_ID);
    public static final MCMeta co_cd_META = InfoCondR_FW_A.createCommonMeta((String)"co_cd", (MCMeta)M_META.CO_CD);
    public static final MCMeta acl_co_META = InfoCondR_FW_A.createCommonMeta((String)"acl_co", (MCMeta)M_META.FLG);
    public static final MCMeta acl_sys_META = InfoCondR_FW_A.createCommonMeta((String)"acl_sys", (MCMeta)M_META.FLG);
    protected static final MCRow.ConstMetaList<InfoCondR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{mining_id_META, user_id_META, co_cd_META, acl_co_META, acl_sys_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected InfoCondR_FW_A(MCRow.ConstMetaList<? extends InfoCondR> metas) {
        super(metas);
    }

    public InfoCondR clone() {
        return (InfoCondR)super.clone();
    }

    public InfoCondR createInstance() {
        return (InfoCondR)super.createInstance();
    }

    public InfoCondR getValues(String ... names) {
        return (InfoCondR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String mining_id() {
        return this.getConstString(offset + 0, $mining_id);
    }

    public void mining_id(String value) {
        this.setConstString(offset + 0, $mining_id, value);
    }

    public String user_id() {
        return this.getConstString(offset + 1, $user_id);
    }

    public void user_id(String value) {
        this.setConstString(offset + 1, $user_id, value);
    }

    public String co_cd() {
        return this.getConstString(offset + 2, $co_cd);
    }

    public void co_cd(String value) {
        this.setConstString(offset + 2, $co_cd, value);
    }

    public boolean acl_co() {
        return this.getConstBoolean(offset + 3, $acl_co);
    }

    public void acl_co(boolean value) {
        this.setConstBoolean(offset + 3, $acl_co, value);
    }

    public boolean acl_sys() {
        return this.getConstBoolean(offset + 4, $acl_sys);
    }

    public void acl_sys(boolean value) {
        this.setConstBoolean(offset + 4, $acl_sys, value);
    }

    public String getString(String name) {
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

    public boolean getBoolean(String name) {
        if ($acl_co.equalsIgnoreCase(name)) {
            return this.acl_co();
        }
        if ($acl_sys.equalsIgnoreCase(name)) {
            return this.acl_sys();
        }
        return super.getBoolean(name);
    }

    public String getStringNE(String name) {
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

    public boolean getBooleanNE(String name) {
        if ($acl_co.equalsIgnoreCase(name)) {
            return this.acl_co();
        }
        if ($acl_sys.equalsIgnoreCase(name)) {
            return this.acl_sys();
        }
        return super.getBooleanNE(name);
    }

    public void setString(String name, String value) {
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

    public void setBoolean(String name, boolean value) {
        if ($acl_co.equalsIgnoreCase(name)) {
            this.acl_co(value);
            return;
        }
        if ($acl_sys.equalsIgnoreCase(name)) {
            this.acl_sys(value);
            return;
        }
        super.setBoolean(name, value);
    }

    public void setStringNE(String name, String value) {
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

    public void setBooleanNE(String name, boolean value) {
        if ($acl_co.equalsIgnoreCase(name)) {
            this.acl_co(value);
            return;
        }
        if ($acl_sys.equalsIgnoreCase(name)) {
            this.acl_sys(value);
            return;
        }
        super.setBooleanNE(name, value);
    }
}

