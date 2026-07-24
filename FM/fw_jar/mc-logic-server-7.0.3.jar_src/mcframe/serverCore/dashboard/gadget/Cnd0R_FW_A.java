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
import mcframe.serverCore.dashboard.gadget.Cnd0R;

abstract class Cnd0R_FW_A
extends MCConstRow {
    public static final String $devtype = "devtype";
    public static final String $gadget = "gadget";
    public static final MCMeta devtype_META = Cnd0R_FW_A.createStringMeta((String)"devtype");
    public static final MCMeta gadget_META = Cnd0R_FW_A.createStringMeta((String)"gadget");
    protected static final MCRow.ConstMetaList<Cnd0R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{devtype_META, gadget_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected Cnd0R_FW_A(MCRow.ConstMetaList<? extends Cnd0R> metas) {
        super(metas);
    }

    public Cnd0R clone() {
        return (Cnd0R)super.clone();
    }

    public Cnd0R createInstance() {
        return (Cnd0R)super.createInstance();
    }

    public Cnd0R getValues(String ... names) {
        return (Cnd0R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String devtype() {
        return this.getConstString(offset + 0, $devtype);
    }

    public void devtype(String value) {
        this.setConstString(offset + 0, $devtype, value);
    }

    public String gadget() {
        return this.getConstString(offset + 1, $gadget);
    }

    public void gadget(String value) {
        this.setConstString(offset + 1, $gadget, value);
    }

    public String getString(String name) {
        if ($devtype.equalsIgnoreCase(name)) {
            return this.devtype();
        }
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($devtype.equalsIgnoreCase(name)) {
            return this.devtype();
        }
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($devtype.equalsIgnoreCase(name)) {
            this.devtype(value);
            return;
        }
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($devtype.equalsIgnoreCase(name)) {
            this.devtype(value);
            return;
        }
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

