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
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R;

abstract class Prop_Rslt0R_FW_A
extends MCConstRow {
    public static final String $gadget = "gadget";
    public static final String $key = "key";
    public static final String $value = "value";
    public static final MCMeta gadget_META = Prop_Rslt0R_FW_A.createStringMeta((String)"gadget");
    public static final MCMeta key_META = Prop_Rslt0R_FW_A.createStringMeta((String)"key");
    public static final MCMeta value_META = Prop_Rslt0R_FW_A.createStringMeta((String)"value");
    protected static final MCRow.ConstMetaList<Prop_Rslt0R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{gadget_META, key_META, value_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected Prop_Rslt0R_FW_A(MCRow.ConstMetaList<? extends Prop_Rslt0R> metas) {
        super(metas);
    }

    public Prop_Rslt0R clone() {
        return (Prop_Rslt0R)super.clone();
    }

    public Prop_Rslt0R createInstance() {
        return (Prop_Rslt0R)super.createInstance();
    }

    public Prop_Rslt0R getValues(String ... names) {
        return (Prop_Rslt0R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String gadget() {
        return this.getConstString(offset + 0, $gadget);
    }

    public void gadget(String value) {
        this.setConstString(offset + 0, $gadget, value);
    }

    public String key() {
        return this.getConstString(offset + 1, $key);
    }

    public void key(String value) {
        this.setConstString(offset + 1, $key, value);
    }

    public String value() {
        return this.getConstString(offset + 2, $value);
    }

    public void value(String value) {
        this.setConstString(offset + 2, $value, value);
    }

    public String getString(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        if ($key.equalsIgnoreCase(name)) {
            return this.key();
        }
        if ($value.equalsIgnoreCase(name)) {
            return this.value();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        if ($key.equalsIgnoreCase(name)) {
            return this.key();
        }
        if ($value.equalsIgnoreCase(name)) {
            return this.value();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        if ($key.equalsIgnoreCase(name)) {
            this.key(value);
            return;
        }
        if ($value.equalsIgnoreCase(name)) {
            this.value(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        if ($key.equalsIgnoreCase(name)) {
            this.key(value);
            return;
        }
        if ($value.equalsIgnoreCase(name)) {
            this.value(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

