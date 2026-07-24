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
import mcframe.serverCore.dashboard.ctrl.Cnd0R;

abstract class Cnd0R_FW_A
extends mcframe.serverCore.dashboard.gadget.Cnd0R {
    protected static final MCRow.ConstMetaList<Cnd0R> constMetas = new MCRow.ConstMetaList(mcframe.serverCore.dashboard.gadget.Cnd0R.constMetas, new MCMeta[0], (String[][])new String[][]{new String[0], new String[0]});
    protected static final MCExtMap EXTMAP = new MCExtMap(mcframe.serverCore.dashboard.gadget.Cnd0R.EXTMAP, new MCExtMap.Entry[0]);
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

    protected Cnd0R_FW_A(MCRow.ConstMetaList<? extends Cnd0R> metas) {
        super(metas);
    }

    @Override
    public Cnd0R clone() {
        return (Cnd0R)super.clone();
    }

    @Override
    public Cnd0R createInstance() {
        return (Cnd0R)super.createInstance();
    }

    @Override
    public Cnd0R getValues(String ... names) {
        return (Cnd0R)super.getValues(names);
    }

    @Override
    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    @Override
    public String getString(String name) {
        return super.getString(name);
    }

    @Override
    public String getStringNE(String name) {
        return super.getStringNE(name);
    }

    @Override
    public void setString(String name, String value) {
        super.setString(name, value);
    }

    @Override
    public void setStringNE(String name, String value) {
        super.setStringNE(name, value);
    }
}

