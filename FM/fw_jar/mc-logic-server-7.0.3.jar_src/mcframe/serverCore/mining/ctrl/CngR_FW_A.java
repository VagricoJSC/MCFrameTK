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
import mcframe.serverCore.mining.ctrl.CngR;

abstract class CngR_FW_A
extends MCConstRow {
    public static final String $newurl = "newurl";
    public static final MCMeta newurl_META = CngR_FW_A.createCommonMeta((String)"newurl", (MCMeta)M_META.URL);
    protected static final MCRow.ConstMetaList<CngR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{newurl_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected CngR_FW_A(MCRow.ConstMetaList<? extends CngR> metas) {
        super(metas);
    }

    public CngR clone() {
        return (CngR)super.clone();
    }

    public CngR createInstance() {
        return (CngR)super.createInstance();
    }

    public CngR getValues(String ... names) {
        return (CngR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String newurl() {
        return this.getConstString(offset + 0, $newurl);
    }

    public void newurl(String value) {
        this.setConstString(offset + 0, $newurl, value);
    }

    public String getString(String name) {
        if ($newurl.equalsIgnoreCase(name)) {
            return this.newurl();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($newurl.equalsIgnoreCase(name)) {
            return this.newurl();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($newurl.equalsIgnoreCase(name)) {
            this.newurl(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($newurl.equalsIgnoreCase(name)) {
            this.newurl(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

