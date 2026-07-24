/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.meta.MCMeta
 */
package mcframe.serverCore.requester.async;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.requester.async.Info2R;

abstract class Info2R_FW_A
extends MCConstRow {
    public static final String $scr_container = "scr_container";
    public static final MCMeta scr_container_META = Info2R_FW_A.createBinaryMeta((String)"scr_container");
    protected static final MCRow.ConstMetaList<Info2R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{scr_container_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected Info2R_FW_A(MCRow.ConstMetaList<? extends Info2R> metas) {
        super(metas);
    }

    public Info2R clone() {
        return (Info2R)super.clone();
    }

    public Info2R createInstance() {
        return (Info2R)super.createInstance();
    }

    public Info2R getValues(String ... names) {
        return (Info2R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public MCBinary scr_container() {
        return this.getConstBinary(offset + 0, $scr_container);
    }

    public void scr_container(MCBinary value) {
        this.setConstBinary(offset + 0, $scr_container, value);
    }

    public MCBinary getBinary(String name) {
        if ($scr_container.equalsIgnoreCase(name)) {
            return this.scr_container();
        }
        return super.getBinary(name);
    }

    public MCBinary getBinaryNE(String name) {
        if ($scr_container.equalsIgnoreCase(name)) {
            return this.scr_container();
        }
        return super.getBinaryNE(name);
    }

    public void setBinary(String name, MCBinary value) {
        if ($scr_container.equalsIgnoreCase(name)) {
            this.scr_container(value);
            return;
        }
        super.setBinary(name, value);
    }

    public void setBinaryNE(String name, MCBinary value) {
        if ($scr_container.equalsIgnoreCase(name)) {
            this.scr_container(value);
            return;
        }
        super.setBinaryNE(name, value);
    }
}

