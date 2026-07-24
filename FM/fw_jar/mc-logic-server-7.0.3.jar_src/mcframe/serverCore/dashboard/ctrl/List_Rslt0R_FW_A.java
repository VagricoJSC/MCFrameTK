/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.meta.MCMeta
 */
package mcframe.serverCore.dashboard.ctrl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.dashboard.ctrl.List_Rslt0R;

abstract class List_Rslt0R_FW_A
extends mcframe.serverCore.dashboard.gadget.List_Rslt0R {
    public static final String $gkey = "gkey";
    public static final String $filter = "filter";
    public static final MCMeta gkey_META = List_Rslt0R_FW_A.createStringMeta((String)"gkey");
    public static final MCMeta filter_META = List_Rslt0R_FW_A.createStringMeta((String)"filter");
    protected static final MCRow.ConstMetaList<List_Rslt0R> constMetas = new MCRow.ConstMetaList(mcframe.serverCore.dashboard.gadget.List_Rslt0R.constMetas, new MCMeta[]{gkey_META, filter_META}, (String[][])new String[][]{new String[0], new String[0]});
    protected static final MCExtMap EXTMAP = new MCExtMap(mcframe.serverCore.dashboard.gadget.List_Rslt0R.EXTMAP, new MCExtMap.Entry[0]);
    private static final int offset = constMetas.offset();

    public static String[] colnames() {
        return constMetas.toNameArray();
    }

    public static MCMeta[] colmetas() {
        return constMetas.toMetaArray();
    }

    @Override
    public Map<String, String> getExtMap(String aGroup) {
        if (aGroup == null) {
            return null;
        }
        return (Map)EXTMAP.get((Object)aGroup);
    }

    @Override
    public List<String> getKeys(String aGroup) {
        if (aGroup == null) {
            return null;
        }
        return EXTMAP.getKeyList(aGroup);
    }

    @Override
    public Set<String> getExtGroups() {
        Set ret = EXTMAP.keySet();
        return ret;
    }

    protected List_Rslt0R_FW_A(MCRow.ConstMetaList<? extends List_Rslt0R> metas) {
        super(metas);
    }

    @Override
    public List_Rslt0R clone() {
        return (List_Rslt0R)super.clone();
    }

    @Override
    public List_Rslt0R createInstance() {
        return (List_Rslt0R)super.createInstance();
    }

    @Override
    public List_Rslt0R getValues(String ... names) {
        return (List_Rslt0R)super.getValues(names);
    }

    @Override
    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String gkey() {
        return this.getConstString(offset + 0, $gkey);
    }

    public void gkey(String value) {
        this.setConstString(offset + 0, $gkey, value);
    }

    public String filter() {
        return this.getConstString(offset + 1, $filter);
    }

    public void filter(String value) {
        this.setConstString(offset + 1, $filter, value);
    }

    @Override
    public String getString(String name) {
        if ($gkey.equalsIgnoreCase(name)) {
            return this.gkey();
        }
        if ($filter.equalsIgnoreCase(name)) {
            return this.filter();
        }
        return super.getString(name);
    }

    @Override
    public String getStringNE(String name) {
        if ($gkey.equalsIgnoreCase(name)) {
            return this.gkey();
        }
        if ($filter.equalsIgnoreCase(name)) {
            return this.filter();
        }
        return super.getStringNE(name);
    }

    @Override
    public void setString(String name, String value) {
        if ($gkey.equalsIgnoreCase(name)) {
            this.gkey(value);
            return;
        }
        if ($filter.equalsIgnoreCase(name)) {
            this.filter(value);
            return;
        }
        super.setString(name, value);
    }

    @Override
    public void setStringNE(String name, String value) {
        if ($gkey.equalsIgnoreCase(name)) {
            this.gkey(value);
            return;
        }
        if ($filter.equalsIgnoreCase(name)) {
            this.filter(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

