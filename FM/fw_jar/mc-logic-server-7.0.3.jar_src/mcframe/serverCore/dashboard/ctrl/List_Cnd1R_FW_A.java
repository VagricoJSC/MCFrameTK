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
import mcframe.serverCore.dashboard.ctrl.List_Cnd1R;
import mcframe.serverCore.dashboard.gadget.List_Cnd0R;

abstract class List_Cnd1R_FW_A
extends List_Cnd0R {
    public static final String $gkey = "gkey";
    public static final String $gadget = "gadget";
    public static final MCMeta gkey_META = List_Cnd1R_FW_A.createStringMeta((String)"gkey");
    public static final MCMeta gadget_META = List_Cnd1R_FW_A.createStringMeta((String)"gadget");
    protected static final MCRow.ConstMetaList<List_Cnd1R> constMetas = new MCRow.ConstMetaList(List_Cnd0R.constMetas, new MCMeta[]{gkey_META, gadget_META}, (String[][])new String[][]{new String[0], new String[0]});
    protected static final MCExtMap EXTMAP = new MCExtMap(List_Cnd0R.EXTMAP, new MCExtMap.Entry[0]);
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

    protected List_Cnd1R_FW_A(MCRow.ConstMetaList<? extends List_Cnd1R> metas) {
        super(metas);
    }

    @Override
    public List_Cnd1R clone() {
        return (List_Cnd1R)super.clone();
    }

    @Override
    public List_Cnd1R createInstance() {
        return (List_Cnd1R)super.createInstance();
    }

    @Override
    public List_Cnd1R getValues(String ... names) {
        return (List_Cnd1R)super.getValues(names);
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

    public String gadget() {
        return this.getConstString(offset + 1, $gadget);
    }

    public void gadget(String value) {
        this.setConstString(offset + 1, $gadget, value);
    }

    @Override
    public String getString(String name) {
        if ($gkey.equalsIgnoreCase(name)) {
            return this.gkey();
        }
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getString(name);
    }

    @Override
    public String getStringNE(String name) {
        if ($gkey.equalsIgnoreCase(name)) {
            return this.gkey();
        }
        if ($gadget.equalsIgnoreCase(name)) {
            return this.gadget();
        }
        return super.getStringNE(name);
    }

    @Override
    public void setString(String name, String value) {
        if ($gkey.equalsIgnoreCase(name)) {
            this.gkey(value);
            return;
        }
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
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
        if ($gadget.equalsIgnoreCase(name)) {
            this.gadget(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

