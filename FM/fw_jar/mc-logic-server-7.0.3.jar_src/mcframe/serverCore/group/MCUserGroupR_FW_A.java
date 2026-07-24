/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.meta.M_META
 */
package mcframe.serverCore.group;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.meta.M_META;
import mcframe.serverCore.group.MCUserGroupR;

abstract class MCUserGroupR_FW_A
extends MCConstRow {
    public static final String $ugid = "ugid";
    public static final String $group_id = "group_id";
    public static final String $group_nm = "group_nm";
    public static final String $co_cd = "co_cd";
    public static final String $co_nm = "co_nm";
    public static final String $ext_attr1 = "ext_attr1";
    public static final String $ext_attr2 = "ext_attr2";
    public static final String $ext_attr3 = "ext_attr3";
    public static final String $upd_cntr = "upd_cntr";
    public static final MCMeta ugid_META = MCUserGroupR_FW_A.createCommonMeta((String)"ugid", (MCMeta)M_META.ROW_ID);
    public static final MCMeta group_id_META = MCUserGroupR_FW_A.createCommonMeta((String)"group_id", (MCMeta)M_META.USR_GROUP_ID);
    public static final MCMeta group_nm_META = MCUserGroupR_FW_A.createCommonMeta((String)"group_nm", (MCMeta)M_META.USR_GROUP_NM);
    public static final MCMeta co_cd_META = MCUserGroupR_FW_A.createCommonMeta((String)"co_cd", (MCMeta)M_META.CO_CD);
    public static final MCMeta co_nm_META = MCUserGroupR_FW_A.createCommonMeta((String)"co_nm", (MCMeta)M_META.CO_NM);
    public static final MCMeta ext_attr1_META = MCUserGroupR_FW_A.createCommonMeta((String)"ext_attr1", (MCMeta)M_META.USR_EXT_ATTR);
    public static final MCMeta ext_attr2_META = MCUserGroupR_FW_A.createCommonMeta((String)"ext_attr2", (MCMeta)M_META.USR_EXT_ATTR);
    public static final MCMeta ext_attr3_META = MCUserGroupR_FW_A.createCommonMeta((String)"ext_attr3", (MCMeta)M_META.USR_EXT_ATTR);
    public static final MCMeta upd_cntr_META = MCUserGroupR_FW_A.createCommonMeta((String)"upd_cntr", (MCMeta)M_META.UPD_CNT);
    protected static final MCRow.ConstMetaList<MCUserGroupR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{ugid_META, group_id_META, group_nm_META, co_cd_META, co_nm_META, ext_attr1_META, ext_attr2_META, ext_attr3_META, upd_cntr_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected MCUserGroupR_FW_A(MCRow.ConstMetaList<? extends MCUserGroupR> metas) {
        super(metas);
    }

    public MCUserGroupR clone() {
        return (MCUserGroupR)super.clone();
    }

    public MCUserGroupR createInstance() {
        return (MCUserGroupR)super.createInstance();
    }

    public MCUserGroupR getValues(String ... names) {
        return (MCUserGroupR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public MCNumber ugid() {
        return this.getConstNumber(offset + 0, $ugid);
    }

    public void ugid(MCNumber value) {
        this.setConstNumber(offset + 0, $ugid, value);
    }

    public void ugid(int value) {
        this.setConstNumber(offset + 0, $ugid, value);
    }

    public void ugid(long value) {
        this.setConstNumber(offset + 0, $ugid, value);
    }

    public void ugid(float value) {
        this.setConstNumber(offset + 0, $ugid, value);
    }

    public void ugid(double value) {
        this.setConstNumber(offset + 0, $ugid, value);
    }

    public String group_id() {
        return this.getConstString(offset + 1, $group_id);
    }

    public void group_id(String value) {
        this.setConstString(offset + 1, $group_id, value);
    }

    public String group_nm() {
        return this.getConstString(offset + 2, $group_nm);
    }

    public void group_nm(String value) {
        this.setConstString(offset + 2, $group_nm, value);
    }

    public String co_cd() {
        return this.getConstString(offset + 3, $co_cd);
    }

    public void co_cd(String value) {
        this.setConstString(offset + 3, $co_cd, value);
    }

    public String co_nm() {
        return this.getConstString(offset + 4, $co_nm);
    }

    public void co_nm(String value) {
        this.setConstString(offset + 4, $co_nm, value);
    }

    public String ext_attr1() {
        return this.getConstString(offset + 5, $ext_attr1);
    }

    public void ext_attr1(String value) {
        this.setConstString(offset + 5, $ext_attr1, value);
    }

    public String ext_attr2() {
        return this.getConstString(offset + 6, $ext_attr2);
    }

    public void ext_attr2(String value) {
        this.setConstString(offset + 6, $ext_attr2, value);
    }

    public String ext_attr3() {
        return this.getConstString(offset + 7, $ext_attr3);
    }

    public void ext_attr3(String value) {
        this.setConstString(offset + 7, $ext_attr3, value);
    }

    public MCNumber upd_cntr() {
        return this.getConstNumber(offset + 8, $upd_cntr);
    }

    public void upd_cntr(MCNumber value) {
        this.setConstNumber(offset + 8, $upd_cntr, value);
    }

    public void upd_cntr(int value) {
        this.setConstNumber(offset + 8, $upd_cntr, value);
    }

    public void upd_cntr(long value) {
        this.setConstNumber(offset + 8, $upd_cntr, value);
    }

    public void upd_cntr(float value) {
        this.setConstNumber(offset + 8, $upd_cntr, value);
    }

    public void upd_cntr(double value) {
        this.setConstNumber(offset + 8, $upd_cntr, value);
    }

    public String getString(String name) {
        if ($group_id.equalsIgnoreCase(name)) {
            return this.group_id();
        }
        if ($group_nm.equalsIgnoreCase(name)) {
            return this.group_nm();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            return this.co_nm();
        }
        if ($ext_attr1.equalsIgnoreCase(name)) {
            return this.ext_attr1();
        }
        if ($ext_attr2.equalsIgnoreCase(name)) {
            return this.ext_attr2();
        }
        if ($ext_attr3.equalsIgnoreCase(name)) {
            return this.ext_attr3();
        }
        return super.getString(name);
    }

    public MCNumber getNumber(String name) {
        if ($ugid.equalsIgnoreCase(name)) {
            return this.ugid();
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            return this.upd_cntr();
        }
        return super.getNumber(name);
    }

    public String getStringNE(String name) {
        if ($group_id.equalsIgnoreCase(name)) {
            return this.group_id();
        }
        if ($group_nm.equalsIgnoreCase(name)) {
            return this.group_nm();
        }
        if ($co_cd.equalsIgnoreCase(name)) {
            return this.co_cd();
        }
        if ($co_nm.equalsIgnoreCase(name)) {
            return this.co_nm();
        }
        if ($ext_attr1.equalsIgnoreCase(name)) {
            return this.ext_attr1();
        }
        if ($ext_attr2.equalsIgnoreCase(name)) {
            return this.ext_attr2();
        }
        if ($ext_attr3.equalsIgnoreCase(name)) {
            return this.ext_attr3();
        }
        return super.getStringNE(name);
    }

    public MCNumber getNumberNE(String name) {
        if ($ugid.equalsIgnoreCase(name)) {
            return this.ugid();
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            return this.upd_cntr();
        }
        return super.getNumberNE(name);
    }

    public void setString(String name, String value) {
        if ($group_id.equalsIgnoreCase(name)) {
            this.group_id(value);
            return;
        }
        if ($group_nm.equalsIgnoreCase(name)) {
            this.group_nm(value);
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
        if ($ext_attr1.equalsIgnoreCase(name)) {
            this.ext_attr1(value);
            return;
        }
        if ($ext_attr2.equalsIgnoreCase(name)) {
            this.ext_attr2(value);
            return;
        }
        if ($ext_attr3.equalsIgnoreCase(name)) {
            this.ext_attr3(value);
            return;
        }
        super.setString(name, value);
    }

    public void setNumber(String name, MCNumber value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, int value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, long value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, float value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, double value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($group_id.equalsIgnoreCase(name)) {
            this.group_id(value);
            return;
        }
        if ($group_nm.equalsIgnoreCase(name)) {
            this.group_nm(value);
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
        if ($ext_attr1.equalsIgnoreCase(name)) {
            this.ext_attr1(value);
            return;
        }
        if ($ext_attr2.equalsIgnoreCase(name)) {
            this.ext_attr2(value);
            return;
        }
        if ($ext_attr3.equalsIgnoreCase(name)) {
            this.ext_attr3(value);
            return;
        }
        super.setStringNE(name, value);
    }

    public void setNumberNE(String name, MCNumber value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, int value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, long value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, float value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, double value) {
        if ($ugid.equalsIgnoreCase(name)) {
            this.ugid(value);
            return;
        }
        if ($upd_cntr.equalsIgnoreCase(name)) {
            this.upd_cntr(value);
            return;
        }
        super.setNumberNE(name, value);
    }
}

