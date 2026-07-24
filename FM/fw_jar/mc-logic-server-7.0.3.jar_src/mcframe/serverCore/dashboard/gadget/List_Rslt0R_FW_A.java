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
import mcframe.serverCore.dashboard.gadget.List_Rslt0R;

abstract class List_Rslt0R_FW_A
extends MCConstRow {
    public static final String $item = "item";
    public static final String $value = "value";
    public static final String $name = "name";
    public static final String $parent = "parent";
    public static final String $key = "key";
    public static final MCMeta item_META = List_Rslt0R_FW_A.createStringMeta((String)"item");
    public static final MCMeta value_META = List_Rslt0R_FW_A.createStringMeta((String)"value");
    public static final MCMeta name_META = List_Rslt0R_FW_A.createStringMeta((String)"name");
    public static final MCMeta parent_META = List_Rslt0R_FW_A.createStringMeta((String)"parent");
    public static final MCMeta key_META = List_Rslt0R_FW_A.createStringMeta((String)"key");
    protected static final MCRow.ConstMetaList<List_Rslt0R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{item_META, value_META, name_META, parent_META, key_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected List_Rslt0R_FW_A(MCRow.ConstMetaList<? extends List_Rslt0R> metas) {
        super(metas);
    }

    public List_Rslt0R clone() {
        return (List_Rslt0R)super.clone();
    }

    public List_Rslt0R createInstance() {
        return (List_Rslt0R)super.createInstance();
    }

    public List_Rslt0R getValues(String ... names) {
        return (List_Rslt0R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String item() {
        return this.getConstString(offset + 0, $item);
    }

    public void item(String value) {
        this.setConstString(offset + 0, $item, value);
    }

    public String value() {
        return this.getConstString(offset + 1, $value);
    }

    public void value(String value) {
        this.setConstString(offset + 1, $value, value);
    }

    public String name() {
        return this.getConstString(offset + 2, $name);
    }

    public void name(String value) {
        this.setConstString(offset + 2, $name, value);
    }

    public String parent() {
        return this.getConstString(offset + 3, $parent);
    }

    public void parent(String value) {
        this.setConstString(offset + 3, $parent, value);
    }

    public String key() {
        return this.getConstString(offset + 4, $key);
    }

    public void key(String value) {
        this.setConstString(offset + 4, $key, value);
    }

    public String getString(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        if ($value.equalsIgnoreCase(name)) {
            return this.value();
        }
        if ($name.equalsIgnoreCase(name)) {
            return this.name();
        }
        if ($parent.equalsIgnoreCase(name)) {
            return this.parent();
        }
        if ($key.equalsIgnoreCase(name)) {
            return this.key();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        if ($value.equalsIgnoreCase(name)) {
            return this.value();
        }
        if ($name.equalsIgnoreCase(name)) {
            return this.name();
        }
        if ($parent.equalsIgnoreCase(name)) {
            return this.parent();
        }
        if ($key.equalsIgnoreCase(name)) {
            return this.key();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        if ($value.equalsIgnoreCase(name)) {
            this.value(value);
            return;
        }
        if ($name.equalsIgnoreCase(name)) {
            this.name(value);
            return;
        }
        if ($parent.equalsIgnoreCase(name)) {
            this.parent(value);
            return;
        }
        if ($key.equalsIgnoreCase(name)) {
            this.key(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        if ($value.equalsIgnoreCase(name)) {
            this.value(value);
            return;
        }
        if ($name.equalsIgnoreCase(name)) {
            this.name(value);
            return;
        }
        if ($parent.equalsIgnoreCase(name)) {
            this.parent(value);
            return;
        }
        if ($key.equalsIgnoreCase(name)) {
            this.key(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

