/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.lang.MCCalendarDate
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCDateFieldType
 *  mcframe.commonCore.meta.MCMeta
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCCalendarDate;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCDateFieldType;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.serverCore.cache.MCTableCache;
import mcframe.serverCore.cache.MCTableCacheUtil;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.util.MCDBUtil;

class MCHashTableCache<M extends MCDBContainer>
extends MCTableCache<M> {
    private HashCache<M> _cache;

    MCHashTableCache(Class<M> dbc, MCTableCache.FilterType type, boolean temp) {
        super(dbc, type, temp);
        this._cache = this.hasValidPeriod() ? new PeriodHashCache<M>(dbc, this.getStDtIndex()) : new BasicHashCache<M>(dbc);
    }

    @Override
    void syncImpl(MCList<M> tmp_tbl) {
        HashCache<M> work = this._cache.createInstance();
        work.put(tmp_tbl);
        this._cache = work;
    }

    @Override
    void addImpl(M row) {
        this._cache.put(row);
    }

    @Override
    void addImpl(MCList<M> list) {
        this._cache.put(list);
    }

    @Override
    public int size() {
        return this._cache.size();
    }

    @Override
    public String[] getKeys() {
        String[] keys = this._cache.getKeyCols();
        return Arrays.copyOf(keys, keys.length);
    }

    @Override
    M getFirst(boolean db, Comparable<?> ... vals) {
        MCMeta[] keys = this._cache.getKeyMetas();
        if (keys.length != vals.length) {
            throw new MCException(Core_Msg_FW_A.FCBGC0481, new Object[]{this.getTableName(), keys.length, vals.length});
        }
        if (!MCTableCacheUtil.validKeyValue(vals)) {
            return null;
        }
        int i = 0;
        while (i < keys.length) {
            keys[i].type().cast(vals[i]);
            ++i;
        }
        M row = this._cache.get(vals);
        if (row == null && this.isTemp() && db) {
            MCList condL = this.createList();
            MCDBContainer condR = (MCDBContainer)condL.add();
            int i2 = 0;
            while (i2 < keys.length) {
                condR.setValue(keys[i2].name(), vals[i2]);
                ++i2;
            }
            MCHashTableCache.selectForTmp(this, condL, null);
            row = this._cache.get(vals);
        }
        return row;
    }

    static class BasicHashCache<T extends MCDBContainer>
    extends HashCache<T> {
        private final Map<String, T> _cache = new HashMap<String, T>();

        BasicHashCache(Class<T> dbc) {
            this(BasicHashCache.getKeyMetas(dbc));
        }

        private BasicHashCache(MCMeta ... keymetas) {
            super(keymetas);
        }

        @Override
        HashCache<T> createInstance() {
            return new BasicHashCache<T>(this.getKeyMetas());
        }

        @Override
        T get(Comparable<?> ... vals) {
            String key = BasicHashCache.toCacheKey(vals);
            return (T)((MCDBContainer)this._cache.get(key));
        }

        @Override
        void put(T row) {
            String[] keycols = this.getKeyCols();
            Comparable[] vals = new Comparable[keycols.length];
            int i = 0;
            while (i < keycols.length) {
                vals[i] = row.getValueNE(keycols[i]);
                ++i;
            }
            String key = BasicHashCache.toCacheKey(vals);
            this._cache.put(key, row);
            ++this._size;
        }
    }

    static abstract class HashCache<T extends MCDBContainer> {
        private final MCMeta[] _keymetas;
        private final String[] _keycols;
        int _size = 0;

        static <R extends MCDBContainer> MCMeta[] getKeyMetas(Class<R> rowclass) {
            MCDBContainer row = MCDBUtil.createDBContainer(rowclass);
            String[] keycols = row.getKeyColumn();
            MCMeta[] keymetas = new MCMeta[keycols.length];
            int i = 0;
            while (i < keycols.length) {
                keymetas[i] = row.getMeta(keycols[i]);
                ++i;
            }
            return keymetas;
        }

        static String toCacheKey(Comparable<?> ... vals) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < vals.length) {
                sb.append(vals[i]);
                sb.append('\uffff');
                ++i;
            }
            return sb.toString();
        }

        HashCache(MCMeta ... keymetas) {
            this._keymetas = keymetas;
            this._keycols = new String[this._keymetas.length];
            int i = 0;
            while (i < this._keymetas.length) {
                MCMeta keymeta = this._keymetas[i];
                this._keycols[i] = keymeta.name();
                ++i;
            }
        }

        abstract HashCache<T> createInstance();

        abstract T get(Comparable<?> ... var1);

        abstract void put(T var1);

        void put(MCList<T> list) {
            for (MCDBContainer row : list) {
                this.put(row);
            }
        }

        MCMeta[] getKeyMetas() {
            return this._keymetas;
        }

        String[] getKeyCols() {
            return this._keycols;
        }

        int size() {
            return this._size;
        }
    }

    static class PeriodHashCache<T extends MCDBContainer>
    extends HashCache<T> {
        private final Map<String, List<T>> _cache = new HashMap<String, List<T>>();
        private final int _st_idx;
        private final String[] _mapcols;

        PeriodHashCache(Class<T> dbc, int st_idx) {
            this(PeriodHashCache.getKeyMetas(dbc), st_idx);
        }

        private PeriodHashCache(MCMeta[] keymetas, int st_idx) {
            super(keymetas);
            this._st_idx = st_idx;
            ArrayList<String> keyList = new ArrayList<String>(Arrays.asList(this.getKeyCols()));
            if (this._st_idx >= 0) {
                keyList.remove(this._st_idx);
            }
            this._mapcols = keyList.toArray(new String[keyList.size()]);
        }

        @Override
        HashCache<T> createInstance() {
            return new PeriodHashCache<T>(this.getKeyMetas(), this._st_idx);
        }

        @Override
        T get(Comparable<?> ... vals) {
            String key;
            List<T> list;
            MCDate dt = (MCDate)vals[this._st_idx];
            Comparable<?>[] mapvals = Arrays.copyOf(vals, this._mapcols.length);
            if (this._st_idx < this._mapcols.length) {
                System.arraycopy(vals, this._st_idx + 1, mapvals, this._st_idx, mapvals.length - this._st_idx);
            }
            if ((list = this._cache.get(key = PeriodHashCache.toCacheKey(mapvals))) != null) {
                for (MCDBContainer row : list) {
                    MCDate st_dt = row.getDateNE("st_dt");
                    MCDate end_dt = row.getDateNE("end_dt");
                    if (!dt.gte((MCCalendarDate)st_dt, new MCDateFieldType[0]) || !dt.lte((MCCalendarDate)end_dt, new MCDateFieldType[0])) continue;
                    return (T)row;
                }
            }
            return null;
        }

        @Override
        void put(T row) {
            Comparable[] vals = new Comparable[this._mapcols.length];
            int i = 0;
            while (i < this._mapcols.length) {
                vals[i] = row.getValueNE(this._mapcols[i]);
                ++i;
            }
            String key = PeriodHashCache.toCacheKey(vals);
            List<T> list = this._cache.get(key);
            if (list == null) {
                list = new ArrayList<T>();
                this._cache.put(key, list);
            }
            list.add(row);
            ++this._size;
        }
    }
}

