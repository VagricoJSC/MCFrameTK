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
package mcframe.serverCore.requester.async;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.requester.async.InfoR;

abstract class InfoR_FW_A
extends MCConstRow {
    public static final String $reqid = "reqid";
    public static final String $push_msg = "push_msg";
    public static final MCMeta reqid_META = InfoR_FW_A.createStringMeta((String)"reqid");
    public static final MCMeta push_msg_META = InfoR_FW_A.createStringMeta((String)"push_msg");
    protected static final MCRow.ConstMetaList<InfoR> constMetas = new MCRow.ConstMetaList(MCConstRow.constMetas, new MCMeta[]{reqid_META, push_msg_META}, (String[][])new String[][]{new String[0], new String[0]});
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

    protected InfoR_FW_A(MCRow.ConstMetaList<? extends InfoR> metas) {
        super(metas);
    }

    public InfoR clone() {
        return (InfoR)super.clone();
    }

    public InfoR createInstance() {
        return (InfoR)super.createInstance();
    }

    public InfoR getValues(String ... names) {
        return (InfoR)super.getValues(names);
    }

    protected void fireValueChanged(String column, Comparable<?> newvalue, Comparable<?> oldvalue) {
    }

    public String reqid() {
        return this.getConstString(offset + 0, $reqid);
    }

    public void reqid(String value) {
        this.setConstString(offset + 0, $reqid, value);
    }

    public String push_msg() {
        return this.getConstString(offset + 1, $push_msg);
    }

    public void push_msg(String value) {
        this.setConstString(offset + 1, $push_msg, value);
    }

    public String getString(String name) {
        if ($reqid.equalsIgnoreCase(name)) {
            return this.reqid();
        }
        if ($push_msg.equalsIgnoreCase(name)) {
            return this.push_msg();
        }
        return super.getString(name);
    }

    public String getStringNE(String name) {
        if ($reqid.equalsIgnoreCase(name)) {
            return this.reqid();
        }
        if ($push_msg.equalsIgnoreCase(name)) {
            return this.push_msg();
        }
        return super.getStringNE(name);
    }

    public void setString(String name, String value) {
        if ($reqid.equalsIgnoreCase(name)) {
            this.reqid(value);
            return;
        }
        if ($push_msg.equalsIgnoreCase(name)) {
            this.push_msg(value);
            return;
        }
        super.setString(name, value);
    }

    public void setStringNE(String name, String value) {
        if ($reqid.equalsIgnoreCase(name)) {
            this.reqid(value);
            return;
        }
        if ($push_msg.equalsIgnoreCase(name)) {
            this.push_msg(value);
            return;
        }
        super.setStringNE(name, value);
    }
}

