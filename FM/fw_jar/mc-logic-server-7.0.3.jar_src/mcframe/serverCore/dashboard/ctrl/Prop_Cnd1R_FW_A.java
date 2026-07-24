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
package mcframe.serverCore.dashboard.ctrl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.dashboard.ctrl.Prop_Cnd1R;

abstract class Prop_Cnd1R_FW_A
extends MCConstRow {
    public static final String $gadget = "gadget";
    public static final MCMeta gadget_META = Prop_Cnd1R_FW_A.createStringMeta((String)"gadget");
    protected static final MCRow.ConstMetaList<Prop_Cnd1R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{gadget_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected Prop_Cnd1R_FW_A(MCRow.ConstMetaList<? extends Prop_Cnd1R> metas) {
        super(metas);
    }

    public Prop_Cnd1R clone() {
        return (Prop_Cnd1R)super.clone();
    }

    public Prop_Cnd1R createInstance() {
        return (Prop_Cnd1R)super.createInstance();
    }

    public Prop_Cnd1R getValues(String ... names) {
        return (Prop_Cnd1R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String gadget() {
        return this.getConstString(offset + 0, $gadget);
    }

    public void gadget(String value) {
        this.setConstString(offset + 0, $gadget, value);
    }

    public String getString(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

