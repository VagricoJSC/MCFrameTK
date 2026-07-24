/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
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
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.meta.M_META;
import mcframe.serverCore.cache.ctrl.InfoR;

abstract class InfoR_FW_A
extends MCConstRow {
    public static final String $table = "table";
    public static final String $table_nm = "table_nm";
    public static final String $co_cd = "co_cd";
    public static final String $co_nm = "co_nm";
    public static final String $lcl_cd = "lcl_cd";
    public static final String $lcl_nm = "lcl_nm";
    public static final String $cache_cnt = "cache_cnt";
    public static final String $cache_ts = "cache_ts";
    public static final String $table_cnt = "table_cnt";
    public static final String $table_ts = "table_ts";
    public static final MCMeta table_META = InfoR_FW_A.createCommonMeta((String)"table", (MCMeta)M_META.TABLE_NAME);
    public static final MCMeta table_nm_META = InfoR_FW_A.createCommonMeta((String)"table_nm", (MCMeta)M_META.TABLE_LABEL);
    public static final MCMeta co_cd_META = InfoR_FW_A.createCommonMeta((String)"co_cd", (MCMeta)M_META.CO_CD);
    public static final MCMeta co_nm_META = InfoR_FW_A.createCommonMeta((String)"co_nm", (MCMeta)M_META.CO_NM);
    public static final MCMeta lcl_cd_META = InfoR_FW_A.createCommonMeta((String)"lcl_cd", (MCMeta)M_META.LOCALE_CD);
    public static final MCMeta lcl_nm_META = InfoR_FW_A.createCommonMeta((String)"lcl_nm", (MCMeta)M_META.LOCALE_NM);
    public static final MCMeta cache_cnt_META = InfoR_FW_A.createCommonMeta((String)"cache_cnt", (MCMeta)M_META.INT);
    public static final MCMeta cache_ts_META = InfoR_FW_A.createCommonMeta((String)"cache_ts", (MCMeta)M_META.SYS_TS);
    public static final MCMeta table_cnt_META = InfoR_FW_A.createCommonMeta((String)"table_cnt", (MCMeta)M_META.INT);
    public static final MCMeta table_ts_META = InfoR_FW_A.createCommonMeta((String)"table_ts", (MCMeta)M_META.SYS_TS);
    protected static final MCRow.ConstMetaList<InfoR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{table_META, table_nm_META, co_cd_META, co_nm_META, lcl_cd_META, lcl_nm_META, cache_cnt_META, cache_ts_META, table_cnt_META, table_ts_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected InfoR_FW_A(MCRow.ConstMetaList<? extends InfoR> metas) {
        super(metas);
    }

    public InfoR clone() {
        return (InfoR)super.clone();
    }

    public InfoR createInstance() {
        return (InfoR)super.createInstance();
    }

    public InfoR getValues(String ... names) {
        return (InfoR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String table() {
        return this.getConstString(offset + 0, $table);
    }

    public void table(String value) {
        this.setConstString(offset + 0, $table, value);
    }

    public String table_nm() {
        return this.getConstString(offset + 1, $table_nm);
    }

    public void table_nm(String value) {
        this.setConstString(offset + 1, $table_nm, value);
    }

    public String co_cd() {
        return this.getConstString(offset + 2, $co_cd);
    }

    public void co_cd(String value) {
        this.setConstString(offset + 2, $co_cd, value);
    }

    public String co_nm() {
        return this.getConstString(offset + 3, $co_nm);
    }

    public void co_nm(String value) {
        this.setConstString(offset + 3, $co_nm, value);
    }

    public String lcl_cd() {
        return this.getConstString(offset + 4, $lcl_cd);
    }

    public void lcl_cd(String value) {
        this.setConstString(offset + 4, $lcl_cd, value);
    }

    public String lcl_nm() {
        return this.getConstString(offset + 5, $lcl_nm);
    }

    public void lcl_nm(String value) {
        this.setConstString(offset + 5, $lcl_nm, value);
    }

    public MCNumber cache_cnt() {
        return this.getConstNumber(offset + 6, $cache_cnt);
    }

    public void cache_cnt(MCNumber value) {
        this.setConstNumber(offset + 6, $cache_cnt, value);
    }

    public void cache_cnt(int value) {
        this.setConstNumber(offset + 6, $cache_cnt, value);
    }

    public void cache_cnt(long value) {
        this.setConstNumber(offset + 6, $cache_cnt, value);
    }

    public void cache_cnt(float value) {
        this.setConstNumber(offset + 6, $cache_cnt, value);
    }

    public void cache_cnt(double value) {
        this.setConstNumber(offset + 6, $cache_cnt, value);
    }

    public MCTimestamp cache_ts() {
        return this.getConstTimestamp(offset + 7, $cache_ts);
    }

    public void cache_ts(MCTimestamp value) {
        this.setConstTimestamp(offset + 7, $cache_ts, value);
    }

    public MCNumber table_cnt() {
        return this.getConstNumber(offset + 8, $table_cnt);
    }

    public void table_cnt(MCNumber value) {
        this.setConstNumber(offset + 8, $table_cnt, value);
    }

    public void table_cnt(int value) {
        this.setConstNumber(offset + 8, $table_cnt, value);
    }

    public void table_cnt(long value) {
        this.setConstNumber(offset + 8, $table_cnt, value);
    }

    public void table_cnt(float value) {
        this.setConstNumber(offset + 8, $table_cnt, value);
    }

    public void table_cnt(double value) {
        this.setConstNumber(offset + 8, $table_cnt, value);
    }

    public MCTimestamp table_ts() {
        return this.getConstTimestamp(offset + 9, $table_ts);
    }

    public void table_ts(MCTimestamp value) {
        this.setConstTimestamp(offset + 9, $table_ts, value);
    }

    public String getString(String name) {
        if ($table.equalsIgnoreCase(name)) {
            return this.table();
        }
        if ($table_nm.equalsIgnoreCase(name)) {
            return this.table_nm();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            return this.co_nm();
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            return this.lcl_cd();
        }
        if ($lcl_nm.equalsIgnoreCase(name)) {
            return this.lcl_nm();
        }
        return super.getString(name);
    }

    public MCNumber getNumber(String name) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            return this.cache_cnt();
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            return this.table_cnt();
        }
        return super.getNumber(name);
    }

    public MCTimestamp getTimestamp(String name) {
        if ($cache_ts.equalsIgnoreCase(name)) {
            return this.cache_ts();
        }
        if ($table_ts.equalsIgnoreCase(name)) {
            return this.table_ts();
        }
        return super.getTimestamp(name);
    }

    public String getStringNE(String name) {
        if ($table.equalsIgnoreCase(name)) {
            return this.table();
        }
        if ($table_nm.equalsIgnoreCase(name)) {
            return this.table_nm();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            return this.co_nm();
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            return this.lcl_cd();
        }
        if ($lcl_nm.equalsIgnoreCase(name)) {
            return this.lcl_nm();
        }
        return super.getStringNE(name);
    }

    public MCNumber getNumberNE(String name) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            return this.cache_cnt();
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            return this.table_cnt();
        }
        return super.getNumberNE(name);
    }

    public MCTimestamp getTimestampNE(String name) {
        if ($cache_ts.equalsIgnoreCase(name)) {
            return this.cache_ts();
        }
        if ($table_ts.equalsIgnoreCase(name)) {
            return this.table_ts();
        }
        return super.getTimestampNE(name);
    }

    public void setString(String name, String value) {
        if ($table.equalsIgnoreCase(name)) {
            this.table(value);
            return;
        }
        if ($table_nm.equalsIgnoreCase(name)) {
            this.table_nm(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            this.co_nm(value);
            return;
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            this.lcl_cd(value);
            return;
        }
        if ($lcl_nm.equalsIgnoreCase(name)) {
            this.lcl_nm(value);
            return;
        }
        super.setString(name, value);
    }

    public void setNumber(String name, MCNumber value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, int value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, long value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, float value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, double value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setTimestamp(String name, MCTimestamp value) {
        if ($cache_ts.equalsIgnoreCase(name)) {
            this.cache_ts(value);
            return;
        }
        if ($table_ts.equalsIgnoreCase(name)) {
            this.table_ts(value);
            return;
        }
        super.setTimestamp(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($table.equalsIgnoreCase(name)) {
            this.table(value);
            return;
        }
        if ($table_nm.equalsIgnoreCase(name)) {
            this.table_nm(value);
            return;
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            this.co_cd(value);
            return;
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            this.co_nm(value);
            return;
        }
        if ($lcl_cd.equalsIgnoreCase(name)) {
            this.lcl_cd(value);
            return;
        }
        if ($lcl_nm.equalsIgnoreCase(name)) {
            this.lcl_nm(value);
            return;
        }
        super.setStringNE(name, value);
    }

    public void setNumberNE(String name, MCNumber value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, int value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, long value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, float value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, double value) {
        if ($cache_cnt.equalsIgnoreCase(name)) {
            this.cache_cnt(value);
            return;
        }
        if ($table_cnt.equalsIgnoreCase(name)) {
            this.table_cnt(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setTimestampNE(String name, MCTimestamp value) {
        if ($cache_ts.equalsIgnoreCase(name)) {
            this.cache_ts(value);
            return;
        }
        if ($table_ts.equalsIgnoreCase(name)) {
            this.table_ts(value);
            return;
        }
        super.setTimestampNE(name, value);
    }
}

