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
package mcframe.serverCore.cache.ctrl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.meta.M_META;
import mcframe.serverCore.cache.ctrl.CndR;

abstract class CndR_FW_A
extends MCConstRow {
    public static final String $table = "table";
    public static final String $co_cd = "co_cd";
    public static final String $lcl_cd = "lcl_cd";
    public static final MCMeta table_META = CndR_FW_A.createCommonMeta((String)"table", (MCMeta)M_META.TABLE_NAME);
    public static final MCMeta co_cd_META = CndR_FW_A.createCommonMeta((String)"co_cd", (MCMeta)M_META.CO_CD);
    public static final MCMeta lcl_cd_META = CndR_FW_A.createCommonMeta((String)"lcl_cd", (MCMeta)M_META.LOCALE_CD);
    protected static final MCRow.ConstMetaList<CndR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{table_META, co_cd_META, lcl_cd_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected CndR_FW_A(MCRow.ConstMetaList<? extends CndR> metas) {
        super(metas);
    }

    public CndR clone() {
        return (CndR)super.clone();
    }

    public CndR createInstance() {
        return (CndR)super.createInstance();
    }

    public CndR getValues(String ... names) {
        return (CndR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String table() {
        return this.getConstString(offset + 0, $table);
    }

    public void table(String value) {
        this.setConstString(offset + 0, $table, value);
    }

    public String co_cd() {
        return this.getConstString(offset + 1, $co_cd);
    }

    public void co_cd(String value) {
        this.setConstString(offset + 1, $co_cd, value);
    }

    public String lcl_cd() {
        return this.getConstString(offset + 2, $lcl_cd);
    }

    public void lcl_cd(String value) {
        this.setConstString(offset + 2, $lcl_cd, value);
    }

    public String getString(String name) {
        if ($table.equalsIgnoreCase(name)) {
            return this.table();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            return this.lcl_cd();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($table.equalsIgnoreCase(name)) {
            return this.table();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            return this.lcl_cd();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($table.equalsIgnoreCase(name)) {
            this.table(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            this.lcl_cd(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($table.equalsIgnoreCase(name)) {
            this.table(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            this.lcl_cd(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

