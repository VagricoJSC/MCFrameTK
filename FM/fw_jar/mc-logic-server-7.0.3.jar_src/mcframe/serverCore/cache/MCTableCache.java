/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.commonCore.notice.MCException
 *  mcframe.commonCore.notice.MCLog
 *  mcframe.commonCore.notice.MCMessageList
 *  mcframe.serverCore.dbc.FCM_CO_ALL_R
 *  mcframe.serverCore.mcjdbc.MCDBTransaction
 *  mcframe.serverCore.mcjdbc.MCTransactionManager
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCExpr
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermColumn
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.requester.MCRequestObject
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.sys.MCSys
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.serverCore.cache.MCJdbcProxy;
import mcframe.serverCore.cache.MCTableCacheUtil;
import mcframe.serverCore.dbc.FCM_CO_ALL_R;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.requester.MCRequestObject;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.util.MCDBUtil;

public abstract class MCTableCache<M extends MCDBContainer> {
    private static boolean _initSys = MCConfig.server.getStringArray("tablecache.system.table") == null;
    private static String[] _coAll = null;
    private static Locale[] _lclAll = null;
    private static final DbcCacheMap _sysMap = new DbcCacheMap();
    static final String TABLE_ALIAS = "T";
    static final String col_st_dt = "st_dt";
    static final String col_end_dt = "end_dt";
    private final Class<M> _dbc;
    private final boolean _tmp;
    private final FilterType _type;
    private final int _st_idx;
    private boolean _valid = false;
    private MCTimestamp _syncTime = null;

    public static void init() {
        new Thread(() -> {
            MCLog.write((String)Core_Msg_FW_A.FCBGC0472, (Object[])new Object[0]);
            try {
                try {
                    MCTransactionManager.createDBTran();
                    MCTableCache.updateLocaleAll();
                    MCTableCache.updateCoAll();
                    MCTableCache.setSys(MCTableCacheUtil.cacheList());
                }
                catch (Exception e) {
                    MCException mce = e instanceof MCException ? (MCException)((Object)((Object)e)) : new MCException((Throwable)e);
                    MCLog.write((Throwable)mce);
                    throw mce;
                }
            }
            finally {
                MCTransactionManager.finalClose();
            }
            _initSys = true;
            MCLog.write((String)Core_Msg_FW_A.FCBGC0473, (Object[])new Object[0]);
        }, "TableCacheInit").start();
    }

    public static boolean isReadySys() {
        return _initSys;
    }

    private static void updateCoAll() {
        MCList result = MCList.create(FCM_CO_ALL_R.class);
        FCM_CO_ALL_R co_all = FCM_CO_ALL_R.create((String)TABLE_ALIAS);
        IFMCSQL.MCMainQuery q = (IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"MCTableCache_CO_ALL_S01").mainQuery().selectDistinct(new IFMCFMSQL.MCFMEDColumnGroup[]{co_all.co_cd}).from((IFMCSQL.MCDerivedView)co_all);
        int cnt = q.executeQuery(result);
        Object[] coNew = result.getString("co_cd").toArray(new String[cnt]);
        Arrays.sort(coNew);
        if (MCTableCache.isReadySys()) {
            ArrayList<String> coDel = new ArrayList<String>();
            String[] stringArray = _coAll;
            int n = _coAll.length;
            int n2 = 0;
            while (n2 < n) {
                String co = stringArray[n2];
                if (Arrays.binarySearch(coNew, co) < 0) {
                    coDel.add(co);
                }
                ++n2;
            }
            if (coDel.size() > 0) {
                MCTableCache.removeCoSys(_sysMap, coDel);
            }
        }
        _coAll = coNew;
    }

    private static void removeCoSys(CacheMap map, List<String> coDel) {
        if (map instanceof CoCacheMap) {
            for (String co : coDel) {
                ((CoCacheMap)map).remove(co);
            }
        } else if (map instanceof HashCacheMap) {
            ((HashCacheMap)map).values().forEach(c -> MCTableCache.removeCoSys(c, coDel));
        }
    }

    private static void updateLocaleAll() {
        String[] strs = MCConfig.server.getEntryLocaleArray();
        Locale[] lcls = new Locale[strs.length];
        int i = 0;
        while (i < strs.length) {
            lcls[i] = MCConfig.convLocale((String)strs[i]);
            ++i;
        }
        _lclAll = lcls;
    }

    static List<Object[]> expandSysAll() {
        ArrayList<Object[]> list = new ArrayList<Object[]>();
        _sysMap.forEach((dbc, dmap) -> {
            switch (FilterType.get(dbc)) {
                case ALL: {
                    Object[] all = new Object[]{dbc, null, null, dmap.get(dbc, (String)null, (Locale)null)};
                    list.add(all);
                    break;
                }
                case LOCALE: {
                    ((LocaleCacheMap)dmap).forEach((l, lmap) -> {
                        Object[] locale = new Object[]{dbc, null, l, lmap.get(dbc, (String)null, (Locale)l)};
                        list.add(locale);
                    });
                    break;
                }
                case CO: {
                    ((CoCacheMap)dmap).forEach((c, cmap) -> {
                        Object[] co = new Object[]{dbc, c, null, cmap.get(dbc, (String)c, (Locale)null)};
                        list.add(co);
                    });
                    break;
                }
                case CO_LOCALE: {
                    ((CoCacheMap)dmap).forEach((c, cmap) -> ((LocaleCacheMap)cmap).forEach((l, lmap) -> {
                        Object[] locale = new Object[]{dbc, c, l, lmap.get(dbc, (String)c, (Locale)l)};
                        list.add(locale);
                    }));
                }
            }
        });
        return list;
    }

    public static <T extends MCDBContainer> MCTableCache<T> getSys(Class<T> dbc) {
        Locale lcl;
        FilterType type = FilterType.get(dbc);
        String co = type.getCurrentCoCd();
        MCTableCache<T> cache = _sysMap.get(dbc, co, lcl = type.getCurrentLocale());
        return cache == null ? null : (!cache.isValid() ? null : cache);
    }

    private static void setSys(String[] tables) {
        _sysMap.clear();
        String[] stringArray = tables;
        int n = tables.length;
        int n2 = 0;
        while (n2 < n) {
            String table = stringArray[n2];
            Class dbc = MCDBUtil.getDBContainerClass((String)table);
            _sysMap.put(dbc, null);
            ++n2;
        }
        MCTableCache.updateSys(_sysMap.keySet().toArray(new Class[_sysMap.size()]));
    }

    private static <T extends MCDBContainer> List<Updater> createUpdater(TranPool pool, Class<T> dbc, String[] cos, Locale[] lcls) {
        FilterType type = FilterType.get(dbc);
        return type.createUpdater(pool, _sysMap, dbc, cos, lcls);
    }

    public static void updateSys(String[] tables) {
        ArrayList<Class> dbcs = new ArrayList<Class>();
        String[] stringArray = tables;
        int n = tables.length;
        int n2 = 0;
        while (n2 < n) {
            String table = stringArray[n2];
            Class dbc = MCDBUtil.getDBContainerClass((String)table);
            dbcs.add(dbc);
            ++n2;
        }
        MCTableCache.updateSys(dbcs.toArray(new Class[dbcs.size()]));
    }

    public static void updateSys(Class<? extends MCDBContainer>[] dbcs) {
        ArrayList<Class<? extends MCDBContainer>> dbcList = new ArrayList<Class<? extends MCDBContainer>>(dbcs.length);
        Class<? extends MCDBContainer>[] classArray = dbcs;
        int n = dbcs.length;
        int n2 = 0;
        while (n2 < n) {
            Class<? extends MCDBContainer> dbc = classArray[n2];
            if (_sysMap.containsKey(dbc)) {
                dbcList.add(dbc);
            }
            ++n2;
        }
        if (dbcList.size() <= 0) {
            return;
        }
        if (dbcList.contains(FCM_CO_ALL_R.class)) {
            MCTableCache.updateCoAll();
        }
        int multi = MCConfig.server.getInteger("tablecache.system.update.thread", 1);
        multi = Math.min(dbcList.size(), multi);
        TranPool tranPool = new TranPool(multi);
        ArrayList<Updater> updaters = new ArrayList<Updater>();
        ArrayList<String> tables = new ArrayList<String>();
        for (Class clazz : dbcList) {
            updaters.addAll(MCTableCache.createUpdater(tranPool, clazz, _coAll, _lclAll));
            tables.add(MCDBUtil.createDBContainer((Class)clazz).tableName());
        }
        MCLog.write((String)Core_Msg_FW_A.FCBGC0476, (Object[])new Object[]{String.join((CharSequence)", ", tables), multi, tranPool.size()});
        MCMessageList mCMessageList = new MCMessageList();
        ExecutorService es = Executors.newFixedThreadPool(tranPool.size());
        List futures = null;
        try {
            futures = es.invokeAll(updaters);
        }
        catch (InterruptedException interruptedException) {}
        int i = 0;
        while (i < futures.size()) {
            Future future = futures.get(i);
            try {
                future.get();
            }
            catch (InterruptedException | ExecutionException e) {
                Throwable t = e.getCause();
                MCException mce = t instanceof MCException ? (MCException)t : new MCException(t);
                MCLog.write((Throwable)mce);
                mCMessageList.add(mce.getMCMessage());
            }
            ++i;
        }
        es.shutdown();
        tranPool.release();
        if (mCMessageList.size() > 0) {
            MCException e = new MCException(Core_Msg_FW_A.FCBGC0482, new Object[0]);
            e.addCauseMessageList(mCMessageList);
            throw e;
        }
    }

    private static TempCacheMap getTempCacheMap() {
        return (TempCacheMap)MCRequestObject.object(TempCacheMap.class);
    }

    public static <T extends MCDBContainer> MCTableCache<T> getTemp(Class<T> tbl) {
        TempCacheMap tmpCache = MCTableCache.getTempCacheMap();
        MCTableCache<T> tmp = tmpCache.get((Class)tbl, MCSys.user.coCD(), MCSys.user.locale());
        if (tmp == null) {
            tmp = MCTableCache.createTempCache(tbl, FilterType.get(tbl));
            tmpCache.put((Class)tbl, MCSys.user.coCD(), MCSys.user.locale(), (MCTableCache)tmp);
        }
        return tmp;
    }

    public static void removeTemp() {
        MCTableCache.getTempCacheMap().clear();
    }

    public static <T extends MCDBContainer> MCTableCache<T> getCache(Class<T> tbl) {
        MCTableCache<T> cache = MCTableCache.getSys(tbl);
        if (cache == null) {
            cache = MCTableCache.getTemp(tbl);
        }
        return cache;
    }

    static <T extends MCDBContainer> MCTableCache<T> createLocalCache(Class<T> tbl) {
        return MCTableCache.createTempCache(tbl, FilterType.get(tbl));
    }

    static <T extends MCDBContainer> int selectForTmp(MCTableCache<T> tmp, MCList<T> binds, IFMCSQL.MCPermColumn[] selcol) {
        MCList dbList;
        block16: {
            MCQueryApiBuilder builder;
            block14: {
                dbList = binds.createInstance();
                MCDBContainer t = (MCDBContainer)dbList.createRow();
                t.setAlias(TABLE_ALIAS);
                builder = MCQueryApiBuilder.create((MCDBContainer)t);
                MCDBContainer dbc = builder.getBaseDbc();
                String[] keys = tmp.getKeys();
                if (tmp.hasValidPeriod()) {
                    keys = Arrays.copyOf(keys, keys.length + 1);
                    keys[keys.length - 1] = col_end_dt;
                }
                IFMCSQL.MCPermColumn[] keycol = new IFMCSQL.MCPermColumn[keys.length];
                int i = 0;
                while (i < keys.length) {
                    keycol[i] = dbc.getColumn$(keys[i]);
                    ++i;
                }
                if (selcol != null) {
                    builder.setSelect((IFMCSQL.MCColumn[])keycol);
                    builder.addSelect((IFMCSQL.MCColumn[])selcol);
                }
                if (!tmp.hasValidPeriod()) break block14;
                i = 0;
                while (i < keys.length) {
                    String key = keys[i];
                    IFMCSQL.MCPermColumn col = keycol[i];
                    switch (key) {
                        case "st_dt": {
                            builder.addWhereWithAnd(MCQueryApiBuilder.makeLte((IFMCSQL.MCPermColumn)col, (IFMCSQL.MCExpr)IFMCSQL.bind((String)key)), new Comparable[0]);
                            break;
                        }
                        case "end_dt": {
                            builder.addWhereWithAnd(MCQueryApiBuilder.makeGte((IFMCSQL.MCPermColumn)col, (IFMCSQL.MCExpr)IFMCSQL.bind((String)col_st_dt)), new Comparable[0]);
                            break;
                        }
                        default: {
                            builder.addWhereWithAnd(MCQueryApiBuilder.makeEq((IFMCSQL.MCPermColumn)col, (IFMCSQL.MCExpr)IFMCSQL.bind((String)key)), new Comparable[0]);
                        }
                    }
                    ++i;
                }
                MCDBUtil.dbSelect((String)"MCTableCache_DBCONTAINER_S01", (MCList)dbList, (MCQueryApiBuilder)builder, binds);
                break block16;
            }
            MCDBUtil.dbSelectKey((String)"MCTableCache_DBCONTAINER_S02", (MCList)dbList, (MCQueryApiBuilder)builder, binds);
        }
        tmp.add(dbList);
        return dbList.size();
    }

    /*
     * Exception decompiling
     */
    private static <T extends MCDBContainer> MCTableCache<T> createSysCache(Class<T> dbc, FilterType type) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Can't sort instructions [@NONE, blocks:[4] lbl23 : CaseStatement: default:\u000a, @NONE, blocks:[4] lbl23 : CaseStatement: default:\u000a]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.CompareByIndex.compare(CompareByIndex.java:25)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.CompareByIndex.compare(CompareByIndex.java:8)
         *     at java.base/java.util.TimSort.countRunAndMakeAscending(TimSort.java:360)
         *     at java.base/java.util.TimSort.sort(TimSort.java:220)
         *     at java.base/java.util.Arrays.sort(Arrays.java:1308)
         *     at java.base/java.util.ArrayList.sort(ArrayList.java:1804)
         *     at java.base/java.util.Collections.sort(Collections.java:178)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.buildSwitchCases(SwitchReplacer.java:271)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitch(SwitchReplacer.java:258)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:66)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private static <T extends MCDBContainer> MCTableCache<T> createTempCache(Class<T> dbc, FilterType type) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Can't sort instructions [@NONE, blocks:[4] lbl23 : CaseStatement: default:\u000a, @NONE, blocks:[4] lbl23 : CaseStatement: default:\u000a]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.CompareByIndex.compare(CompareByIndex.java:25)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.CompareByIndex.compare(CompareByIndex.java:8)
         *     at java.base/java.util.TimSort.countRunAndMakeAscending(TimSort.java:360)
         *     at java.base/java.util.TimSort.sort(TimSort.java:220)
         *     at java.base/java.util.Arrays.sort(Arrays.java:1308)
         *     at java.base/java.util.ArrayList.sort(ArrayList.java:1804)
         *     at java.base/java.util.Collections.sort(Collections.java:178)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.buildSwitchCases(SwitchReplacer.java:271)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitch(SwitchReplacer.java:258)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:66)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    MCTableCache(Class<M> dbc, FilterType type, boolean temp) {
        this._dbc = dbc;
        this._tmp = temp;
        this._type = type;
        MCDBContainer row = MCDBUtil.createDBContainer(dbc);
        String[] keys = row.getKeyColumn();
        ArrayList<String> keyList = new ArrayList<String>(Arrays.asList(keys));
        this._st_idx = keyList.indexOf(col_st_dt);
        this._valid = temp;
    }

    public Class<M> getDBContainer() {
        return this._dbc;
    }

    public M createRow() {
        return (M)MCDBUtil.createDBContainer(this._dbc);
    }

    public MCList<M> createList() {
        return MCList.create(this._dbc);
    }

    public String getTableName() {
        return this.createRow().tableName();
    }

    public boolean isTemp() {
        return this._tmp;
    }

    public FilterType getFilterType() {
        return this._type;
    }

    int getStDtIndex() {
        return this._st_idx;
    }

    public boolean hasValidPeriod() {
        return this._st_idx >= 0;
    }

    public boolean isValid() {
        return this._valid;
    }

    void setValid(boolean valid) {
        this._valid = valid;
    }

    public MCTimestamp getSyncTime() {
        return this._syncTime;
    }

    void setSyncTime(MCTimestamp ts) {
        if (!this._tmp) {
            this._syncTime = ts;
        }
    }

    void sync(MCDBTransaction tran, String co_cd, Locale locale) {
        if (this.isTemp()) {
            throw new MCException(Core_Msg_FW_A.FCBGC0477, new Object[]{this.getTableName()});
        }
        MCJdbcProxy.proxy.setCoViewInfo(co_cd, locale);
        MCList<M> tmp_tbl = this.createList();
        MCDBContainer t = (MCDBContainer)tmp_tbl.createRow();
        t.setAlias(TABLE_ALIAS);
        MCQueryApiBuilder builder = MCQueryApiBuilder.create((MCDBContainer)t);
        builder.buildSelect("MCTableCache_DBCONTAINER_S01").executeQuery(tran, null, null, tmp_tbl, -1);
        this.syncImpl(tmp_tbl);
        this.setSyncTime(MCTimestamp.sysnow());
        this.setValid(true);
        MCLog.write((String)Core_Msg_FW_A.FCBGC0478, (Object[])new Object[]{t.tableName(), co_cd, locale, tmp_tbl.size()});
    }

    abstract void syncImpl(MCList<M> var1);

    public int addBySelect(MCList<M> condL) {
        if (!this.isTemp()) {
            return 0;
        }
        return MCTableCache.selectForTmp(this, condL, null);
    }

    public void add(M row) {
        if (!this.isTemp()) {
            throw new MCException(Core_Msg_FW_A.FCBGC0479, new Object[]{this.getTableName()});
        }
        if (row == null) {
            return;
        }
        this.addImpl(row);
        MCLog.write((String)Core_Msg_FW_A.FCBGC0480, (Object[])new Object[]{row.tableName(), this.getFilterType().getCurrentCoCd(), this.getFilterType().getCurrentLocale(), this.size()});
    }

    abstract void addImpl(M var1);

    public void add(MCList<M> list) {
        if (!this.isTemp()) {
            throw new MCException(Core_Msg_FW_A.FCBGC0479, new Object[]{this.getTableName()});
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        this.addImpl(list);
        MCLog.write((String)Core_Msg_FW_A.FCBGC0480, (Object[])new Object[]{((MCDBContainer)list.get(0)).tableName(), this.getFilterType().getCurrentCoCd(), this.getFilterType().getCurrentLocale(), this.size()});
    }

    abstract void addImpl(MCList<M> var1);

    public abstract int size();

    public abstract String[] getKeys();

    abstract M getFirst(boolean var1, Comparable<?> ... var2);

    M getFirstNE(boolean db, Comparable<?> ... vals) {
        M row = this.getFirst(db, vals);
        return row != null ? row : this.createRow();
    }

    public M getFirstLocal(Comparable<?> ... vals) {
        return this.getFirst(false, vals);
    }

    public M getFirstLocalNE(Comparable<?> ... vals) {
        return this.getFirstNE(false, vals);
    }

    public M getFirst(Comparable<?> ... vals) {
        return this.getFirst(true, vals);
    }

    public M getFirstNE(Comparable<?> ... vals) {
        return this.getFirstNE(true, vals);
    }

    private static class BaseCacheMap
    implements CacheMap {
        private MCTableCache<? extends MCDBContainer> _cache = null;

        private BaseCacheMap() {
        }

        @Override
        public <T extends MCDBContainer> MCTableCache<T> get(Class<T> dbc, String co_cd, Locale lcl) {
            return this._cache;
        }

        @Override
        public <T extends MCDBContainer> void put(Class<T> dbc, String co_cd, Locale lcl, MCTableCache<T> cache) {
            this._cache = cache;
        }
    }

    private static interface CacheMap {
        public <T extends MCDBContainer> MCTableCache<T> get(Class<T> var1, String var2, Locale var3);

        public <T extends MCDBContainer> void put(Class<T> var1, String var2, Locale var3, MCTableCache<T> var4);
    }

    private static class CoCacheMap
    extends HashCacheMap<String> {
        private CoCacheMap() {
        }

        @Override
        <T extends MCDBContainer> CacheMap getCacheMap(Class<T> dbc, String co_cd, Locale lcl) {
            return (CacheMap)this.get(co_cd);
        }

        @Override
        <T extends MCDBContainer> void putCacheMap(Class<T> dbc, String co_cd, Locale lcl, CacheMap map) {
            this.put(co_cd, map);
        }

        @Override
        <T extends MCDBContainer> CacheMap createValue(Class<T> dbc) {
            FilterType type = FilterType.get(dbc);
            CacheMap map = null;
            switch (type) {
                case CO_LOCALE: {
                    map = new LocaleCacheMap();
                    break;
                }
                case CO: {
                    map = new BaseCacheMap();
                    break;
                }
                case LOCALE: {
                    map = new LocaleCacheMap();
                    break;
                }
                case ALL: {
                    map = new BaseCacheMap();
                }
            }
            return map;
        }
    }

    private static class DbcCacheMap
    extends HashCacheMap<Class<? extends MCDBContainer>> {
        private DbcCacheMap() {
        }

        @Override
        <T extends MCDBContainer> CacheMap getCacheMap(Class<T> dbc, String co_cd, Locale lcl) {
            return (CacheMap)this.get(dbc);
        }

        @Override
        <T extends MCDBContainer> void putCacheMap(Class<T> dbc, String co_cd, Locale lcl, CacheMap map) {
            this.put(dbc, map);
        }

        @Override
        <T extends MCDBContainer> CacheMap createValue(Class<T> dbc) {
            FilterType type = FilterType.get(dbc);
            CacheMap map = null;
            switch (type) {
                case CO_LOCALE: {
                    map = new CoCacheMap();
                    break;
                }
                case CO: {
                    map = new CoCacheMap();
                    break;
                }
                case LOCALE: {
                    map = new LocaleCacheMap();
                    break;
                }
                case ALL: {
                    map = new BaseCacheMap();
                }
            }
            return map;
        }

        /* synthetic */ DbcCacheMap(DbcCacheMap dbcCacheMap, DbcCacheMap dbcCacheMap2) {
            this();
        }
    }

    static enum FilterType {
        CO_LOCALE{

            @Override
            <T extends MCDBContainer> List<Updater> createUpdater(TranPool pool, CacheMap map, Class<T> dbc, String[] cos, Locale[] lcls) {
                ArrayList<Updater> updaters = new ArrayList<Updater>();
                String[] stringArray = cos;
                int n = cos.length;
                int n2 = 0;
                while (n2 < n) {
                    String co = stringArray[n2];
                    Locale[] localeArray = lcls;
                    int n3 = lcls.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        Locale lcl = localeArray[n4];
                        updaters.add(FilterType.createUpdater((FilterType)this, pool, map, dbc, co, lcl));
                        ++n4;
                    }
                    ++n2;
                }
                return updaters;
            }

            @Override
            String getCurrentCoCd() {
                return MCSys.user.coCD();
            }

            @Override
            Locale getCurrentLocale() {
                return MCSys.user.locale();
            }
        }
        ,
        CO{

            @Override
            <T extends MCDBContainer> List<Updater> createUpdater(TranPool pool, CacheMap map, Class<T> dbc, String[] cos, Locale[] lcls) {
                ArrayList<Updater> updaters = new ArrayList<Updater>();
                String[] stringArray = cos;
                int n = cos.length;
                int n2 = 0;
                while (n2 < n) {
                    String co = stringArray[n2];
                    updaters.add(FilterType.createUpdater((FilterType)this, pool, map, dbc, co, null));
                    ++n2;
                }
                return updaters;
            }

            @Override
            String getCurrentCoCd() {
                return MCSys.user.coCD();
            }
        }
        ,
        LOCALE{

            @Override
            <T extends MCDBContainer> List<Updater> createUpdater(TranPool pool, CacheMap map, Class<T> dbc, String[] cos, Locale[] lcls) {
                ArrayList<Updater> updaters = new ArrayList<Updater>();
                Locale[] localeArray = lcls;
                int n = lcls.length;
                int n2 = 0;
                while (n2 < n) {
                    Locale lcl = localeArray[n2];
                    updaters.add(FilterType.createUpdater((FilterType)this, pool, map, dbc, null, lcl));
                    ++n2;
                }
                return updaters;
            }

            @Override
            Locale getCurrentLocale() {
                return MCSys.user.locale();
            }
        }
        ,
        ALL{

            @Override
            <T extends MCDBContainer> List<Updater> createUpdater(TranPool pool, CacheMap map, Class<T> dbc, String[] cos, Locale[] lcls) {
                ArrayList<Updater> updaters = new ArrayList<Updater>();
                updaters.add(FilterType.createUpdater((FilterType)this, pool, map, dbc, null, null));
                return updaters;
            }
        };


        String getCurrentCoCd() {
            return null;
        }

        Locale getCurrentLocale() {
            return null;
        }

        abstract <T extends MCDBContainer> List<Updater> createUpdater(TranPool var1, CacheMap var2, Class<T> var3, String[] var4, Locale[] var5);

        private static <T extends MCDBContainer> Updater createUpdater(FilterType type, TranPool pool, CacheMap map, Class<T> dbc, String co, Locale lcl) {
            MCTableCache cache = map.get(dbc, co, lcl);
            if (cache == null) {
                cache = MCTableCache.createSysCache(dbc, type);
                map.put(dbc, co, lcl, cache);
            }
            return new Updater(pool, cache, co, lcl);
        }

        static FilterType get(Class<? extends MCDBContainer> dbc) {
            MCDBContainer c = dbc.cast(MCDBUtil.createDBContainer(dbc));
            boolean co = c.hasCocdFilter();
            boolean lcl = c.hasLclFilter();
            return co ? (lcl ? CO_LOCALE : CO) : (lcl ? LOCALE : ALL);
        }
    }

    private static abstract class HashCacheMap<K>
    extends HashMap<K, CacheMap>
    implements CacheMap {
        private HashCacheMap() {
        }

        abstract <T extends MCDBContainer> CacheMap getCacheMap(Class<T> var1, String var2, Locale var3);

        abstract <T extends MCDBContainer> void putCacheMap(Class<T> var1, String var2, Locale var3, CacheMap var4);

        abstract <T extends MCDBContainer> CacheMap createValue(Class<T> var1);

        @Override
        public <T extends MCDBContainer> MCTableCache<T> get(Class<T> dbc, String co_cd, Locale lcl) {
            CacheMap map = this.getCacheMap(dbc, co_cd, lcl);
            return map == null ? null : map.get(dbc, co_cd, lcl);
        }

        @Override
        public <T extends MCDBContainer> void put(Class<T> dbc, String co_cd, Locale lcl, MCTableCache<T> cache) {
            CacheMap map = this.getCacheMap(dbc, co_cd, lcl);
            if (map == null) {
                map = this.createValue(dbc);
                this.putCacheMap(dbc, co_cd, lcl, map);
            }
            map.put(dbc, co_cd, lcl, cache);
        }
    }

    private static class LocaleCacheMap
    extends HashCacheMap<Locale> {
        private LocaleCacheMap() {
        }

        @Override
        <T extends MCDBContainer> CacheMap getCacheMap(Class<T> dbc, String co_cd, Locale lcl) {
            return (CacheMap)this.get(lcl);
        }

        @Override
        <T extends MCDBContainer> void putCacheMap(Class<T> dbc, String co_cd, Locale lcl, CacheMap map) {
            this.put(lcl, map);
        }

        @Override
        <T extends MCDBContainer> CacheMap createValue(Class<T> dbc) {
            FilterType type = FilterType.get(dbc);
            CacheMap map = null;
            switch (type) {
                case CO_LOCALE: {
                    map = new BaseCacheMap();
                    break;
                }
                case CO: {
                    map = new CoCacheMap();
                    break;
                }
                case LOCALE: {
                    map = new BaseCacheMap();
                    break;
                }
                case ALL: {
                    map = new BaseCacheMap();
                }
            }
            return map;
        }
    }

    public static class TempCacheMap
    extends DbcCacheMap {
        public TempCacheMap() {
            super(null, null);
        }
    }

    private static class TranPool {
        private LinkedList<MCDBTransaction> _pool = new LinkedList();

        TranPool(int size) {
            this._pool.offer(MCTransactionManager.dbTran());
            while (this._pool.size() < size) {
                try {
                    MCDBTransaction tran = MCTransactionManager.createDBTran((boolean)false);
                    this._pool.offer(tran);
                }
                catch (Throwable t) {
                    MCException e = new MCException(t, Core_Msg_FW_A.FCBGC0474, new Object[0]);
                    MCLog.write((Throwable)e);
                }
            }
        }

        int size() {
            return this._pool.size();
        }

        synchronized void release() {
            for (MCDBTransaction tran : this._pool) {
                if (tran == MCTransactionManager.dbTran()) continue;
                MCTransactionManager.releaseDBTran((MCDBTransaction)tran);
            }
            this._pool.clear();
        }

        synchronized MCDBTransaction pop() {
            return this._pool.pop();
        }

        synchronized void push(MCDBTransaction tran) {
            this._pool.offer(tran);
        }
    }

    private static class Updater
    implements Callable<Object> {
        private TranPool _tranPool;
        private MCTableCache<? extends MCDBContainer> _cache;
        private String _co;
        private Locale _lcl;

        Updater(TranPool tranPool, MCTableCache<? extends MCDBContainer> cache, String co, Locale lcl) {
            this._tranPool = tranPool;
            this._cache = cache;
            this._co = co;
            this._lcl = lcl;
        }

        @Override
        public Object call() throws Exception {
            try {
                MCDBTransaction tran = this._tranPool.pop();
                MCTransactionManager.setCurrentDBTran((MCDBTransaction)tran);
                this._cache.sync(tran, this._co, this._lcl);
                this._tranPool.push(tran);
                return null;
            }
            catch (Throwable t) {
                throw new MCException(t, Core_Msg_FW_A.FCBGC0475, new Object[]{this._cache.getTableName(), this._co, this._lcl});
            }
        }
    }
}

