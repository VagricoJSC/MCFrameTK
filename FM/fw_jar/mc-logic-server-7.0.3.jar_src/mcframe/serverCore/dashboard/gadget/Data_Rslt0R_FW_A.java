/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
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
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R;

abstract class Data_Rslt0R_FW_A
extends MCConstRow {
    public static final String $item = "item";
    public static final String $strval = "strval";
    public static final String $numval = "numval";
    public static final String $booval = "booval";
    public static final String $dtval = "dtval";
    public static final String $tsval = "tsval";
    public static final String $binval = "binval";
    public static final MCMeta item_META = Data_Rslt0R_FW_A.createStringMeta((String)"item");
    public static final MCMeta strval_META = Data_Rslt0R_FW_A.createStringMeta((String)"strval");
    public static final MCMeta numval_META = Data_Rslt0R_FW_A.createNumberMeta((String)"numval");
    public static final MCMeta booval_META = Data_Rslt0R_FW_A.createBooleanMeta((String)"booval");
    public static final MCMeta dtval_META = Data_Rslt0R_FW_A.createDateMeta((String)"dtval");
    public static final MCMeta tsval_META = Data_Rslt0R_FW_A.createTimestampMeta((String)"tsval");
    public static final MCMeta binval_META = Data_Rslt0R_FW_A.createBinaryMeta((String)"binval");
    protected static final MCRow.ConstMetaList<Data_Rslt0R> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{item_META, strval_META, numval_META, booval_META, dtval_META, tsval_META, binval_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected Data_Rslt0R_FW_A(MCRow.ConstMetaList<? extends Data_Rslt0R> metas) {
        super(metas);
    }

    public Data_Rslt0R clone() {
        return (Data_Rslt0R)super.clone();
    }

    public Data_Rslt0R createInstance() {
        return (Data_Rslt0R)super.createInstance();
    }

    public Data_Rslt0R getValues(String ... names) {
        return (Data_Rslt0R)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String item() {
        return this.getConstString(offset + 0, $item);
    }

    public void item(String value) {
        this.setConstString(offset + 0, $item, value);
    }

    public String strval() {
        return this.getConstString(offset + 1, $strval);
    }

    public void strval(String value) {
        this.setConstString(offset + 1, $strval, value);
    }

    public MCNumber numval() {
        return this.getConstNumber(offset + 2, $numval);
    }

    public void numval(MCNumber value) {
        this.setConstNumber(offset + 2, $numval, value);
    }

    public void numval(int value) {
        this.setConstNumber(offset + 2, $numval, value);
    }

    public void numval(long value) {
        this.setConstNumber(offset + 2, $numval, value);
    }

    public void numval(float value) {
        this.setConstNumber(offset + 2, $numval, value);
    }

    public void numval(double value) {
        this.setConstNumber(offset + 2, $numval, value);
    }

    public boolean booval() {
        return this.getConstBoolean(offset + 3, $booval);
    }

    public void booval(boolean value) {
        this.setConstBoolean(offset + 3, $booval, value);
    }

    public MCDate dtval() {
        return this.getConstDate(offset + 4, $dtval);
    }

    public void dtval(MCDate value) {
        this.setConstDate(offset + 4, $dtval, value);
    }

    public MCTimestamp tsval() {
        return this.getConstTimestamp(offset + 5, $tsval);
    }

    public void tsval(MCTimestamp value) {
        this.setConstTimestamp(offset + 5, $tsval, value);
    }

    public MCBinary binval() {
        return this.getConstBinary(offset + 6, $binval);
    }

    public void binval(MCBinary value) {
        this.setConstBinary(offset + 6, $binval, value);
    }

    public String getString(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        if ($strval.equalsIgnoreCase(name)) {
            return this.strval();
        }
        return super.getString(name);
    }

    public MCNumber getNumber(String name) {
        if ($numval.equalsIgnoreCase(name)) {
            return this.numval();
        }
        return super.getNumber(name);
    }

    public MCDate getDate(String name) {
        if ($dtval.equalsIgnoreCase(name)) {
            return this.dtval();
        }
        return super.getDate(name);
    }

    public MCTimestamp getTimestamp(String name) {
        if ($tsval.equalsIgnoreCase(name)) {
            return this.tsval();
        }
        return super.getTimestamp(name);
    }

    public boolean getBoolean(String name) {
        if ($booval.equalsIgnoreCase(name)) {
            return this.booval();
        }
        return super.getBoolean(name);
    }

    public MCBinary getBinary(String name) {
        if ($binval.equalsIgnoreCase(name)) {
            return this.binval();
        }
        return super.getBinary(name);
    }

    public String getStringNE(String name) {
        if ($item.equalsIgnoreCase(name)) {
            return this.item();
        }
        if ($strval.equalsIgnoreCase(name)) {
            return this.strval();
        }
        return super.getStringNE(name);
    }

    public MCNumber getNumberNE(String name) {
        if ($numval.equalsIgnoreCase(name)) {
            return this.numval();
        }
        return super.getNumberNE(name);
    }

    public MCDate getDateNE(String name) {
        if ($dtval.equalsIgnoreCase(name)) {
            return this.dtval();
        }
        return super.getDateNE(name);
    }

    public MCTimestamp getTimestampNE(String name) {
        if ($tsval.equalsIgnoreCase(name)) {
            return this.tsval();
        }
        return super.getTimestampNE(name);
    }

    public boolean getBooleanNE(String name) {
        if ($booval.equalsIgnoreCase(name)) {
            return this.booval();
        }
        return super.getBooleanNE(name);
    }

    public MCBinary getBinaryNE(String name) {
        if ($binval.equalsIgnoreCase(name)) {
            return this.binval();
        }
        return super.getBinaryNE(name);
    }

    public void setString(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        if ($strval.equalsIgnoreCase(name)) {
            this.strval(value);
            return;
        }
        super.setString(name, value);
    }

    public void setNumber(String name, MCNumber value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, int value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, long value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, float value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, double value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setDate(String name, MCDate value) {
        if ($dtval.equalsIgnoreCase(name)) {
            this.dtval(value);
            return;
        }
        super.setDate(name, value);
    }

    public void setTimestamp(String name, MCTimestamp value) {
        if ($tsval.equalsIgnoreCase(name)) {
            this.tsval(value);
            return;
        }
        super.setTimestamp(name, value);
    }

    public void setBoolean(String name, boolean value) {
        if ($booval.equalsIgnoreCase(name)) {
            this.booval(value);
            return;
        }
        super.setBoolean(name, value);
    }

    public void setBinary(String name, MCBinary value) {
        if ($binval.equalsIgnoreCase(name)) {
            this.binval(value);
            return;
        }
        super.setBinary(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($item.equalsIgnoreCase(name)) {
            this.item(value);
            return;
        }
        if ($strval.equalsIgnoreCase(name)) {
            this.strval(value);
            return;
        }
        super.setStringNE(name, value);
    }

    public void setNumberNE(String name, MCNumber value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, int value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, long value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, float value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, double value) {
        if ($numval.equalsIgnoreCase(name)) {
            this.numval(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setDateNE(String name, MCDate value) {
        if ($dtval.equalsIgnoreCase(name)) {
            this.dtval(value);
            return;
        }
        super.setDateNE(name, value);
    }

    public void setTimestampNE(String name, MCTimestamp value) {
        if ($tsval.equalsIgnoreCase(name)) {
            this.tsval(value);
            return;
        }
        super.setTimestampNE(name, value);
    }

    public void setBooleanNE(String name, boolean value) {
        if ($booval.equalsIgnoreCase(name)) {
            this.booval(value);
            return;
        }
        super.setBooleanNE(name, value);
    }

    public void setBinaryNE(String name, MCBinary value) {
        if ($binval.equalsIgnoreCase(name)) {
            this.binval(value);
            return;
        }
        super.setBinaryNE(name, value);
    }
}

