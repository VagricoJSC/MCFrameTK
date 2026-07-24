/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCConstRow
 *  mcframe.commonCore.container.MCExtMap
 *  mcframe.commonCore.container.MCExtMap$Entry
 *  mcframe.commonCore.container.MCRow$ConstMetaList
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.meta.M_META
 */
package mcframe.serverCore.clear;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.meta.M_META;
import mcframe.serverCore.clear.CndR;

abstract class CndR_FW_A
extends MCConstRow {
    public static final String $saveDuration = "saveDuration";
    public static final String $targetStatus = "targetStatus";
    public static final MCMeta saveDuration_META = CndR_FW_A.createCommonMeta((String)"saveDuration", (MCMeta)M_META.DAYS);
    public static final MCMeta targetStatus_META = CndR_FW_A.createCommonMeta((String)"targetStatus", (MCMeta)M_META.GP_BATCH_ARG);
    protected static final MCRow.ConstMetaList<CndR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{saveDuration_META, targetStatus_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected CndR_FW_A(MCRow.ConstMetaList<? extends CndR> metas) {
        super(metas);
    }

    public CndR clone() {
        return (CndR)super.clone();
    }

    public CndR createInstance() {
        return (CndR)super.createInstance();
    }

    public CndR getValues(String ... names) {
        return (CndR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public MCNumber saveDuration() {
        return this.getConstNumber(offset + 0, $saveDuration);
    }

    public void saveDuration(MCNumber value) {
        this.setConstNumber(offset + 0, $saveDuration, value);
    }

    public void saveDuration(int value) {
        this.setConstNumber(offset + 0, $saveDuration, value);
    }

    public void saveDuration(long value) {
        this.setConstNumber(offset + 0, $saveDuration, value);
    }

    public void saveDuration(float value) {
        this.setConstNumber(offset + 0, $saveDuration, value);
    }

    public void saveDuration(double value) {
        this.setConstNumber(offset + 0, $saveDuration, value);
    }

    public String targetStatus() {
        return this.getConstString(offset + 1, $targetStatus);
    }

    public void targetStatus(String value) {
        this.setConstString(offset + 1, $targetStatus, value);
    }

    public String getString(String name) {
        if ($targetStatus.equalsIgnoreCase(name)) {
            return this.targetStatus();
        }
        return super.getString(name);
    }

    public MCNumber getNumber(String name) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            return this.saveDuration();
        }
        return super.getNumber(name);
    }

    public String getStringNE(String name) {
        if ($targetStatus.equalsIgnoreCase(name)) {
            return this.targetStatus();
        }
        return super.getStringNE(name);
    }

    public MCNumber getNumberNE(String name) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            return this.saveDuration();
        }
        return super.getNumberNE(name);
    }

    public void setString(String name, String value) {
        if ($targetStatus.equalsIgnoreCase(name)) {
            this.targetStatus(value);
            return;
        }
        super.setString(name, value);
    }

    public void setNumber(String name, MCNumber value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, int value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, long value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, float value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setNumber(String name, double value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumber(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($targetStatus.equalsIgnoreCase(name)) {
            this.targetStatus(value);
            return;
        }
        super.setStringNE(name, value);
    }

    public void setNumberNE(String name, MCNumber value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, int value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, long value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, float value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumberNE(name, value);
    }

    public void setNumberNE(String name, double value) {
        if ($saveDuration.equalsIgnoreCase(name)) {
            this.saveDuration(value);
            return;
        }
        super.setNumberNE(name, value);
    }
}

