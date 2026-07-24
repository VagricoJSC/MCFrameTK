/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.util.MCFunctionIFUtil
 *  mcframe.commonCore.util.MCFunctionIFUtil$ExBiConsumer
 *  mcframe.commonCore.util.MCFunctionIFUtil$ExBiFunction
 *  mcframe.commonCore.util.MCFunctionIFUtil$ExFunction
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermColumn
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.requester.MCRequestObject
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Consumer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.util.MCFunctionIFUtil;
import mcframe.serverCore.cache.MCTableCache;
import mcframe.serverCore.cache.MCTableCacheUtil;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.requester.MCRequestObject;

public class MCJoiner<R extends MCRow, M extends MCDBContainer> {
    private final Class<M> _tbl;
    private final MCFunctionIFUtil.ExFunction<R, Comparable<?>[]> _cond;
    private MCFunctionIFUtil.ExFunction<M, IFMCSQL.MCPermColumn[]> _cols = null;
    private MCFunctionIFUtil.ExBiConsumer<R, M> _map = null;
    private Nest<R, M, ? extends MCDBContainer> _nest = null;

    public static Comparable<?>[] toCondition(Comparable<?> ... vals) {
        return vals;
    }

    public MCJoiner(Class<M> tbl, MCFunctionIFUtil.ExFunction<R, Comparable<?>[]> cond, MCFunctionIFUtil.ExFunction<M, IFMCSQL.MCPermColumn[]> cols, MCFunctionIFUtil.ExBiConsumer<R, M> map) {
        this._tbl = tbl;
        this._cond = cond;
        this._cols = cols;
        this.addMap(map);
    }

    private MCTableCache<M> getSelectCache() {
        if (!this.useSelectCache()) {
            return null;
        }
        SelectCacheMap map = (SelectCacheMap)MCRequestObject.object(SelectCacheMap.class);
        MCTableCache<M> cache = (MCTableCache<M>)map.get(this);
        if (cache == null) {
            cache = MCTableCache.createLocalCache(this._tbl);
            map.put(this, cache);
        }
        return cache;
    }

    MCTableCache<M> getSysCache() {
        return MCTableCache.getSys(this._tbl);
    }

    MCTableCache<M> getTempCache() {
        return !this.useSelectCache() ? MCTableCache.getTemp(this._tbl) : this.getSelectCache();
    }

    boolean useSelectCache() {
        return this._cols != null;
    }

    IFMCSQL.MCPermColumn[] getSelect() {
        MCTableCache<M> cache = this.getSelectCache();
        if (cache == null) {
            return null;
        }
        M dbc = cache.createRow();
        dbc.setAlias("T");
        return !this.useSelectCache() ? null : (IFMCSQL.MCPermColumn[])MCFunctionIFUtil.exFunction(this._cols).apply(dbc);
    }

    public MCJoiner<R, M> addSelect(MCFunctionIFUtil.ExFunction<M, IFMCSQL.MCPermColumn[]> cols) {
        this._cols = cols;
        return this;
    }

    public MCJoiner<R, M> addMap(MCFunctionIFUtil.ExBiConsumer<R, M> map) {
        if (map != null) {
            this._map = map;
        }
        return this;
    }

    <N extends MCDBContainer> Nest<R, M, N> addNest(Class<N> tbl, MCFunctionIFUtil.ExBiFunction<R, M, Comparable<?>[]> cond) {
        Nest conf = new Nest(tbl, cond, null, null);
        this._nest = conf;
        return conf;
    }

    <N extends MCDBContainer> Nest<R, M, N> addNest(Class<N> tbl, MCFunctionIFUtil.ExBiFunction<R, M, Comparable<?>[]> cond, NestConsumer<R, M, N> map) {
        Nest conf = new Nest(tbl, cond, null, map);
        this._nest = conf;
        return conf;
    }

    Nest<R, M, ? extends MCDBContainer> nest() {
        return this._nest;
    }

    public Class<M> table() {
        return this._tbl;
    }

    public Comparable<?>[] condition(R row) {
        return (Comparable[])MCFunctionIFUtil.exFunction(this._cond).apply(row);
    }

    public void join(R row) {
        MCList list = MCList.create(row);
        list.add(row);
        this.join(list);
    }

    public void join(MCList<R> list) {
        boolean hasNest = this._nest != null;
        ArrayList<NestCond<R, M>> nestList = new ArrayList<NestCond<R, M>>();
        MCList joinList = list;
        MCTableCache<M> sys = this.getSysCache();
        if (sys == null) {
            MCTableCache<M> tmp = this.getTempCache();
            MCList bakList = joinList.createInstance();
            ArrayList srchList = new ArrayList();
            list.forEach(MCFunctionIFUtil.exConsumer(row -> {
                Object dbc;
                Comparable<?>[] vals = this.condition(row);
                Object m = dbc = MCTableCacheUtil.validKeyValue(vals) ? tmp.getFirstLocal(vals) : tmp.createRow();
                if (dbc != null) {
                    this.joinRow(row, dbc);
                    if (hasNest) {
                        nestList.add(new NestCond((MCRow)row, dbc));
                    }
                } else {
                    srchList.add(vals);
                    bakList.add(row);
                }
            }));
            if (bakList.isEmpty()) {
                if (!nestList.isEmpty()) {
                    this.nest(this._nest, nestList);
                }
                return;
            }
            sys = tmp;
            joinList = bakList;
            String[] keys = tmp.getKeys();
            MCList condList = MCList.create(this._tbl);
            srchList.forEach(MCFunctionIFUtil.exConsumer(vals -> {
                if (keys.length != ((Comparable[])vals).length) {
                    throw new MCException(Core_Msg_FW_A.FCBGC0481, new Object[]{this.getTempCache().getTableName(), keys.length, ((Comparable[])vals).length});
                }
                MCDBContainer condRow = (MCDBContainer)condList.add();
                int i = 0;
                while (i < keys.length) {
                    condRow.setValue(keys[i], vals[i]);
                    ++i;
                }
            }));
            MCList binds = condList.groupBy(keys);
            MCTableCache.selectForTmp(tmp, binds, this.getSelect());
        }
        MCTableCache<M> cache = sys;
        joinList.forEach(MCFunctionIFUtil.exConsumer(row -> {
            M join = this.joinCacheNE(row, cache);
            if (hasNest) {
                nestList.add(new NestCond<MCRow, M>((MCRow)row, join));
            }
        }));
        if (!nestList.isEmpty()) {
            this.nest(this._nest, nestList);
        }
    }

    private <N extends MCDBContainer> void nest(Nest<R, M, N> nest, List<NestCond<R, M>> list) {
        List<NestCond<R, M>> nestList = list;
        MCTableCache<N> sys = nest.getSysCache();
        if (sys == null) {
            MCTableCache tmp = nest.getTempCache();
            ArrayList bakList = new ArrayList();
            ArrayList srchList = new ArrayList();
            list.forEach(MCFunctionIFUtil.exConsumer(nestCond -> {
                Object dbc;
                Comparable<?>[] vals = nest.condition((MCRow)nestCond.row, nestCond.join);
                Object m = dbc = MCTableCacheUtil.validKeyValue(vals) ? tmp.getFirstLocal(vals) : tmp.createRow();
                if (dbc != null) {
                    nest.joinRow((MCRow)nestCond.row, nestCond.join, dbc);
                } else {
                    srchList.add(vals);
                    bakList.add((NestCond)nestCond);
                }
            }));
            if (bakList.isEmpty()) {
                return;
            }
            sys = tmp;
            nestList = bakList;
            String[] keys = tmp.getKeys();
            MCList condList = MCList.create(nest.table());
            srchList.forEach(MCFunctionIFUtil.exConsumer(vals -> {
                if (keys.length != ((Comparable[])vals).length) {
                    throw new MCException(Core_Msg_FW_A.FCBGC0481, new Object[]{nest.getTempCache().getTableName(), keys.length, ((Comparable[])vals).length});
                }
                MCDBContainer condRow = (MCDBContainer)condList.add();
                int i = 0;
                while (i < keys.length) {
                    condRow.setValue(keys[i], vals[i]);
                    ++i;
                }
            }));
            MCList binds = condList.groupBy(keys);
            MCTableCache.selectForTmp(tmp, binds, nest.getSelect());
        }
        nestList.forEach(MCFunctionIFUtil.exConsumer(nestCond -> nest.joinCacheNE((MCRow)nestCond.row, nestCond.join)));
    }

    public M joinCache(R row) {
        M mst = this.joinSys(row);
        if (mst == null) {
            mst = this.joinTemp(row);
        }
        return mst;
    }

    public M joinSys(R row) {
        MCTableCache<M> sys = this.getSysCache();
        return this.joinCache(row, sys);
    }

    public M joinTemp(R row) {
        MCTableCache<M> tmp = this.getTempCache();
        return this.joinCache(row, tmp);
    }

    public M joinCache(R row, MCTableCache<M> cache) {
        if (cache == null || !cache.isValid()) {
            return null;
        }
        M mst = cache.getFirstLocal(this.condition(row));
        if (mst != null) {
            this.joinRow(row, mst);
        }
        return mst;
    }

    public M joinCacheNE(R row) {
        M mst = this.joinSysNE(row);
        if (mst == null) {
            mst = this.joinTempNE(row);
        }
        return mst;
    }

    public M joinSysNE(R row) {
        MCTableCache<M> sys = this.getSysCache();
        return this.joinCacheNE(row, sys);
    }

    public M joinTempNE(R row) {
        MCTableCache<M> tmp = this.getTempCache();
        return this.joinCacheNE(row, tmp);
    }

    public M joinCacheNE(R row, MCTableCache<M> cache) {
        if (cache == null || !cache.isValid()) {
            return null;
        }
        M mst = cache.getFirstLocalNE(this.condition(row));
        this.joinRow(row, mst);
        return mst;
    }

    public void joinRow(R row, M dbc) {
        if (this._map != null) {
            MCFunctionIFUtil.exConsumer(this._map).accept(row, dbc);
        }
    }

    MCDBContainer nestJoin(R row, M dbc) {
        if (this._nest == null) {
            return null;
        }
        return this._nest.joinCache(row, dbc);
    }

    static class Nest<R, M, N extends MCDBContainer> {
        private final Class<N> _tbl;
        private MCFunctionIFUtil.ExBiFunction<R, M, Comparable<?>[]> _cond;
        private MCFunctionIFUtil.ExFunction<N, IFMCSQL.MCPermColumn[]> _cols = null;
        private NestConsumer<R, M, N> _map = null;

        private Nest(Class<N> tbl, MCFunctionIFUtil.ExBiFunction<R, M, Comparable<?>[]> cond, MCFunctionIFUtil.ExFunction<N, IFMCSQL.MCPermColumn[]> cols, NestConsumer<R, M, N> map) {
            this._tbl = tbl;
            this._cond = cond;
            this._cols = cols;
            this.addNestMap(map);
        }

        private MCTableCache<N> getSelectCache() {
            if (!this.useSelectCache()) {
                return null;
            }
            SelectCacheMap map = (SelectCacheMap)MCRequestObject.object(SelectCacheMap.class);
            MCTableCache<N> cache = (MCTableCache<N>)map.get(this);
            if (cache == null) {
                cache = MCTableCache.createLocalCache(this._tbl);
                map.put(this, cache);
            }
            return cache;
        }

        MCTableCache<N> getSysCache() {
            return MCTableCache.getSys(this._tbl);
        }

        MCTableCache<N> getTempCache() {
            return !this.useSelectCache() ? MCTableCache.getTemp(this._tbl) : this.getSelectCache();
        }

        boolean useSelectCache() {
            return this._cols != null;
        }

        IFMCSQL.MCPermColumn[] getSelect() {
            MCTableCache<N> cache = this.getSelectCache();
            if (cache == null) {
                return null;
            }
            N dbc = cache.createRow();
            dbc.setAlias("T");
            return !this.useSelectCache() ? null : (IFMCSQL.MCPermColumn[])MCFunctionIFUtil.exFunction(this._cols).apply(dbc);
        }

        public Nest<R, M, N> addNestSelect(MCFunctionIFUtil.ExFunction<N, IFMCSQL.MCPermColumn[]> cols) {
            this._cols = cols;
            return this;
        }

        public Nest<R, M, N> addNestMap(NestConsumer<R, M, N> map) {
            if (map != null) {
                this._map = map;
            }
            return this;
        }

        public Class<N> table() {
            return this._tbl;
        }

        public Comparable<?>[] condition(R r, M m) {
            return (Comparable[])MCFunctionIFUtil.exFunction(this._cond).apply(r, m);
        }

        public N joinCache(R row, M dbc) {
            N nst = this.joinSys(row, dbc);
            if (nst == null) {
                nst = this.joinTemp(row, dbc);
            }
            return nst;
        }

        public N joinSys(R row, M dbc) {
            MCTableCache<N> sys = this.getSysCache();
            return this.joinCache(row, dbc, sys);
        }

        public N joinTemp(R row, M dbc) {
            MCTableCache<N> tmp = this.getTempCache();
            return this.joinCache(row, dbc, tmp);
        }

        public N joinCache(R row, M dbc, MCTableCache<N> cache) {
            if (cache == null || !cache.isValid()) {
                return null;
            }
            N nst = cache.getFirstLocalNE(this.condition(row, dbc));
            if (nst != null) {
                this.joinRow(row, dbc, nst);
            }
            return nst;
        }

        public N joinCacheNE(R row, M dbc) {
            N nst = this.joinSysNE(row, dbc);
            if (nst == null) {
                nst = this.joinTempNE(row, dbc);
            }
            return nst;
        }

        public N joinSysNE(R row, M dbc) {
            MCTableCache<N> sys = this.getSysCache();
            return this.joinCacheNE(row, dbc, sys);
        }

        public N joinTempNE(R row, M dbc) {
            MCTableCache<N> tmp = this.getTempCache();
            return this.joinCacheNE(row, dbc, tmp);
        }

        public N joinCacheNE(R row, M dbc, MCTableCache<N> cache) {
            if (cache == null || !cache.isValid()) {
                return null;
            }
            N nst = cache.getFirstLocalNE(this.condition(row, dbc));
            this.joinRow(row, dbc, nst);
            return nst;
        }

        public void joinRow(R row, M dbc, N nst) {
            if (this._map != null) {
                Consumer c = MCFunctionIFUtil.exConsumer(map -> map.accept(row, dbc, nst));
                c.accept(this._map);
            }
        }
    }

    private static class NestCond<R, J extends MCDBContainer> {
        final R row;
        final J join;

        NestCond(R row, J join) {
            this.row = row;
            this.join = join;
        }
    }

    @FunctionalInterface
    static interface NestConsumer<T, U, R> {
        public void accept(T var1, U var2, R var3) throws Exception;
    }

    public static class SelectCacheMap
    extends IdentityHashMap<Object, MCTableCache<?>> {
    }
}

