/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.meta.MCMeta
 */
package mcframe.serverCore.dashboard.gadget;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.dashboard.gadget.List_Cnd0R;

abstract class List_Cnd0R_FW_A
extends MCConstRow {
    public static final String $item = "item";
    public static final MCMeta item_META = List_Cnd0R_FW_A.createStringMeta((String)"item");
    protected static final MCRow.ConstMetaList<List_Cnd0R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{item_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected List_Cnd0R_FW_A(MCRow.ConstMetaList<? extends List_Cnd0R> metas) {
        super(metas);
    }

    public List_Cnd0R clone() {
        return (List_Cnd0R)super.clone();
    }

    public List_Cnd0R createInstance() {
        return (List_Cnd0R)super.createInstance();
    }

    public List_Cnd0R getValues(String ... names) {
        return (List_Cnd0R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String item() {
        return this.getConstString(offset + 0, $item);
    }

    public void item(String value) {
        this.setConstString(offset + 0, $item, value);
    }

    public String getString(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

