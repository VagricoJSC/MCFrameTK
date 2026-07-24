/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCIndexKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRowComparator
 *  mcframe.commonCore.container.MCRowComparator$ASC
 *  mcframe.commonCore.lang.MCDataType
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.serverCore.queryapi.MCDBContainer
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.Arrays;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRowComparator;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.serverCore.cache.MCTableCache;
import mcframe.serverCore.cache.MCTableCacheUtil;
import mcframe.serverCore.queryapi.MCDBContainer;

class MCIndexTableCache<M extends MCDBContainer>
extends MCTableCache<M> {
    private MCList<M> _tbl = null;
    private MCIndexKey _idx = null;
    private int _keylen = -1;

    MCIndexTableCache(Class<M> dbc, MCTableCache.FilterType type, boolean temp) {
        super(dbc, type, temp);
        MCList dummy = MCList.create(dbc);
        this.update(dummy);
    }

    private void update(MCList<M> tmp_tbl) {
        MCIndexKey tmp_idx = tmp_tbl.createIndex(this.getIndexComparator(tmp_tbl));
        this._tbl = tmp_tbl;
        this._idx = tmp_idx;
        String[] keys = this._idx.getKeys();
        this._keylen = this.hasValidPeriod() ? keys.length - 1 : keys.length;
    }

    private MCRowComparator<M> getIndexComparator(MCList<M> list) {
        String[] keys = ((MCDBContainer)list.createRow()).getKeyColumn();
        ArrayList<String> keyList = new ArrayList<String>(Arrays.asList(keys));
        MCBetweenComparator c = null;
        if (this.hasValidPeriod()) {
            keyList.add("end_dt");
            keys = keyList.toArray(new String[keyList.size()]);
            c = new MCBetweenComparator(keys);
        } else {
            c = new MCBetweenComparator(keys);
        }
        return c;
    }

    @Override
    void syncImpl(MCList<M> tmp_tbl) {
        this.update(tmp_tbl);
    }

    @Override
    void addImpl(M row) {
        MCList tmp_tbl = this._tbl.clone();
        tmp_tbl.add(row);
        this.update(tmp_tbl);
    }

    @Override
    void addImpl(MCList<M> list) {
        MCList tmp_tbl = this._tbl.clone();
        tmp_tbl.addAll(list);
        this.update(tmp_tbl);
    }

    @Override
    public int size() {
        return this._tbl.size();
    }

    @Override
    public String[] getKeys() {
        String[] keys = this._idx.getKeys();
        return Arrays.copyOf(keys, this._keylen);
    }

    @Override
    M getFirst(boolean db, Comparable<?> ... vals) {
        MCDBContainer row;
        if (this._keylen != vals.length) {
            throw new MCException(Core_Msg_FW_A.FCBGC0481, new Object[]{this.getTableName(), this._keylen, vals.length});
        }
        if (!MCTableCacheUtil.validKeyValue(vals)) {
            return null;
        }
        if (this.hasValidPeriod()) {
            vals = Arrays.copyOf(vals, vals.length + 1);
            vals[vals.length - 1] = vals[this.getStDtIndex()];
        }
        if ((row = (MCDBContainer)this._tbl.getFirst(this._idx, (Comparable[])vals)) == null && this.isTemp() && db) {
            String[] keys = this.getKeys();
            MCList condL = this.createList();
            MCDBContainer condR = (MCDBContainer)condL.add();
            int i = 0;
            while (i < keys.length) {
                condR.setValue(keys[i], vals[i]);
                ++i;
            }
            MCIndexTableCache.selectForTmp(this, condL, null);
            row = (MCDBContainer)this._tbl.getFirst(this._idx, (Comparable[])vals);
        }
        return (M)row;
    }

    private static class MCBetweenComparator<T extends MCDBContainer>
    extends MCRowComparator.ASC<T> {
        MCBetweenComparator(String ... keys) {
            super(keys);
        }

        public int compareCol(String name, Comparable col1, Comparable col2) {
            int comp = this.compareColNull(name, col1, col2);
            if (comp == Integer.MAX_VALUE) {
                try {
                    comp = col1.compareTo(col2);
                    if (comp == -1 && name.equals("st_dt")) {
                        comp = 0;
                    }
                    if (comp == 1 && name.equals("end_dt")) {
                        comp = 0;
                    }
                }
                catch (ClassCastException classCastException) {
                    String nonSupportType = "Non-Support Type";
                    MCDataType type1 = MCDataType.analyze((Comparable)col1);
                    String tname1 = type1 != null ? type1.toString() : nonSupportType;
                    MCDataType type2 = MCDataType.analyze((Comparable)col2);
                    String tname2 = type2 != null ? type2.toString() : nonSupportType;
                    throw new MCException(Core_Msg_FW_A.FCBBC0045, new Object[]{name, tname1, tname2});
                }
            }
            return comp;
        }
    }
}

