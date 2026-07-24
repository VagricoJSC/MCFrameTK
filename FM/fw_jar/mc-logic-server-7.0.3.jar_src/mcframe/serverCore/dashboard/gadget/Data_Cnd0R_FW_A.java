/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.meta.MCMeta
 */
package mcframe.serverCore.dashboard.gadget;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R;
import mcframe.serverCore.mining.ctrl.CondR;

abstract class Data_Cnd0R_FW_A
extends CondR {
    protected static final MCRow.ConstMetaList<Data_Cnd0R> constMetas = new MCRow.ConstMetaList(CondR.constMetas, new MCMeta[0], (String[][])new String[][]{new String[0], new String[0]});
    protected static final MCExtMap EXTMAP = new MCExtMap(CondR.EXTMAP, new MCExtMap.Entry[0]);
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

    protected Data_Cnd0R_FW_A(MCRow.ConstMetaList<? extends Data_Cnd0R> metas) {
        super(metas);
    }

    @Override
    public Data_Cnd0R clone() {
        return (Data_Cnd0R)super.clone();
    }

    @Override
    public Data_Cnd0R createInstance() {
        return (Data_Cnd0R)super.createInstance();
    }

    @Override
    public Data_Cnd0R getValues(String ... names) {
        return (Data_Cnd0R)super.getValues(names);
    }

    @Override
    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    @Override
    public String getString(String name) {
        return super.getString(name);
    }

    @Override
    public MCNumber getNumber(String name) {
        return super.getNumber(name);
    }

    @Override
    public MCDate getDate(String name) {
        return super.getDate(name);
    }

    @Override
    public MCTimestamp getTimestamp(String name) {
        return super.getTimestamp(name);
    }

    @Override
    public boolean getBoolean(String name) {
        return super.getBoolean(name);
    }

    @Override
    public MCBinary getBinary(String name) {
        return super.getBinary(name);
    }

    @Override
    public String getStringNE(String name) {
        return super.getStringNE(name);
    }

    @Override
    public MCNumber getNumberNE(String name) {
        return super.getNumberNE(name);
    }

    @Override
    public MCDate getDateNE(String name) {
        return super.getDateNE(name);
    }

    @Override
    public MCTimestamp getTimestampNE(String name) {
        return super.getTimestampNE(name);
    }

    @Override
    public boolean getBooleanNE(String name) {
        return super.getBooleanNE(name);
    }

    @Override
    public MCBinary getBinaryNE(String name) {
        return super.getBinaryNE(name);
    }

    @Override
    public void setString(String name, String value) {
        super.setString(name, value);
    }

    @Override
    public void setNumber(String name, MCNumber value) {
        super.setNumber(name, value);
    }

    @Override
    public void setNumber(String name, int value) {
        super.setNumber(name, value);
    }

    @Override
    public void setNumber(String name, long value) {
        super.setNumber(name, value);
    }

    @Override
    public void setNumber(String name, float value) {
        super.setNumber(name, value);
    }

    @Override
    public void setNumber(String name, double value) {
        super.setNumber(name, value);
    }

    @Override
    public void setDate(String name, MCDate value) {
        super.setDate(name, value);
    }

    @Override
    public void setTimestamp(String name, MCTimestamp value) {
        super.setTimestamp(name, value);
    }

    @Override
    public void setBoolean(String name, boolean value) {
        super.setBoolean(name, value);
    }

    @Override
    public void setBinary(String name, MCBinary value) {
        super.setBinary(name, value);
    }

    @Override
    public void setStringNE(String name, String value) {
        super.setStringNE(name, value);
    }

    @Override
    public void setNumberNE(String name, MCNumber value) {
        super.setNumberNE(name, value);
    }

    @Override
    public void setNumberNE(String name, int value) {
        super.setNumberNE(name, value);
    }

    @Override
    public void setNumberNE(String name, long value) {
        super.setNumberNE(name, value);
    }

    @Override
    public void setNumberNE(String name, float value) {
        super.setNumberNE(name, value);
    }

    @Override
    public void setNumberNE(String name, double value) {
        super.setNumberNE(name, value);
    }

    @Override
    public void setDateNE(String name, MCDate value) {
        super.setDateNE(name, value);
    }

    @Override
    public void setTimestampNE(String name, MCTimestamp value) {
        super.setTimestampNE(name, value);
    }

    @Override
    public void setBooleanNE(String name, boolean value) {
        super.setBooleanNE(name, value);
    }

    @Override
    public void setBinaryNE(String name, MCBinary value) {
        super.setBinaryNE(name, value);
    }
}

