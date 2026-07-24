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
import mcframe.serverCore.dashboard.ctrl.GadgetR;

abstract class GadgetR_FW_A
extends MCConstRow {
    public static final String $gadget = "gadget";
    public static final String $mid = "mid";
    public static final String $lid = "lid";
    public static final String $name = "name";
    public static final String $open = "open";
    public static final String $enable = "enable";
    public static final String $user = "user";
    public static final MCMeta gadget_META = GadgetR_FW_A.createStringMeta((String)"gadget");
    public static final MCMeta mid_META = GadgetR_FW_A.createStringMeta((String)"mid");
    public static final MCMeta lid_META = GadgetR_FW_A.createStringMeta((String)"lid");
    public static final MCMeta name_META = GadgetR_FW_A.createStringMeta((String)"name");
    public static final MCMeta open_META = GadgetR_FW_A.createStringMeta((String)"open");
    public static final MCMeta enable_META = GadgetR_FW_A.createBooleanMeta((String)"enable");
    public static final MCMeta user_META = GadgetR_FW_A.createBooleanMeta((String)"user");
    protected static final MCRow.ConstMetaList<GadgetR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{gadget_META, mid_META, lid_META, name_META, open_META, enable_META, user_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected GadgetR_FW_A(MCRow.ConstMetaList<? extends GadgetR> metas) {
        super(metas);
    }

    public GadgetR clone() {
        return (GadgetR)super.clone();
    }

    public GadgetR createInstance() {
        return (GadgetR)super.createInstance();
    }

    public GadgetR getValues(String ... names) {
        return (GadgetR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String gadget() {
        return this.getConstString(offset + 0, $gadget);
    }

    public void gadget(String value) {
        this.setConstString(offset + 0, $gadget, value);
    }

    public String mid() {
        return this.getConstString(offset + 1, $mid);
    }

    public void mid(String value) {
        this.setConstString(offset + 1, $mid, value);
    }

    public String lid() {
        return this.getConstString(offset + 2, $lid);
    }

    public void lid(String value) {
        this.setConstString(offset + 2, $lid, value);
    }

    public String name() {
        return this.getConstString(offset + 3, $name);
    }

    public void name(String value) {
        this.setConstString(offset + 3, $name, value);
    }

    public String open() {
        return this.getConstString(offset + 4, $open);
    }

    public void open(String value) {
        this.setConstString(offset + 4, $open, value);
    }

    public boolean enable() {
        return this.getConstBoolean(offset + 5, $enable);
    }

    public void enable(boolean value) {
        this.setConstBoolean(offset + 5, $enable, value);
    }

    public boolean user() {
        return this.getConstBoolean(offset + 6, $user);
    }

    public void user(boolean value) {
        this.setConstBoolean(offset + 6, $user, value);
    }

    public String getString(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        if ($mid.equalsIgnoreCase(name)) {
            return this.mid();
        }
        if ($lid.equalsIgnoreCase(name)) {
            return this.lid();
        }
        if ($name.equalsIgnoreCase(name)) {
            return this.name();
        }
        if ($open.equalsIgnoreCase(name)) {
            return this.open();
        }
        return super.getString(name);
    }

    public boolean getBoolean(String name) {
        if ($enable.equalsIgnoreCase(name)) {
            return this.enable();
        }
        if ($user.equalsIgnoreCase(name)) {
            return this.user();
        }
        return super.getBoolean(name);
    }

    public String getStringNE(String name) {
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        if ($mid.equalsIgnoreCase(name)) {
            return this.mid();
        }
        if ($lid.equalsIgnoreCase(name)) {
            return this.lid();
        }
        if ($name.equalsIgnoreCase(name)) {
            return this.name();
        }
        if ($open.equalsIgnoreCase(name)) {
            return this.open();
        }
        return super.getStringNE(name);
    }

    public boolean getBooleanNE(String name) {
        if ($enable.equalsIgnoreCase(name)) {
            return this.enable();
        }
        if ($user.equalsIgnoreCase(name)) {
            return this.user();
        }
        return super.getBooleanNE(name);
    }

    public void setString(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        if ($mid.equalsIgnoreCase(name)) {
            this.mid(value);
            return;
        }
        if ($lid.equalsIgnoreCase(name)) {
            this.lid(value);
            return;
        }
        if ($name.equalsIgnoreCase(name)) {
            this.name(value);
            return;
        }
        if ($open.equalsIgnoreCase(name)) {
            this.open(value);
            return;
        }
        super.setString(name, value);
    }

    public void setBoolean(String name, boolean value) {
        if ($enable.equalsIgnoreCase(name)) {
            this.enable(value);
            return;
        }
        if ($user.equalsIgnoreCase(name)) {
            this.user(value);
            return;
        }
        super.setBoolean(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        if ($mid.equalsIgnoreCase(name)) {
            this.mid(value);
            return;
        }
        if ($lid.equalsIgnoreCase(name)) {
            this.lid(value);
            return;
        }
        if ($name.equalsIgnoreCase(name)) {
            this.name(value);
            return;
        }
        if ($open.equalsIgnoreCase(name)) {
            this.open(value);
            return;
        }
        super.setStringNE(name, value);
    }

    public void setBooleanNE(String name, boolean value) {
        if ($enable.equalsIgnoreCase(name)) {
            this.enable(value);
            return;
        }
        if ($user.equalsIgnoreCase(name)) {
            this.user(value);
            return;
        }
        super.setBooleanNE(name, value);
    }
}

