/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCDataType
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.notice.Core_Msg_FW_A
 *  mcframe.serverCore.mcjdbc.MCCursor
 *  mcframe.serverCore.mcjdbc.MCDBTransaction
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCColumnSubQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDML
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDynamicSQLInfo
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPredicate
 *  mcframe.serverCore.queryapi.MCDynamicSQLFactory$MCDynamicSQLEditor
 *  mcframe.serverCore.queryapi.MCDynamicSQLFactory$MCDynamicSQLInfoImpl
 *  mcframe.serverCore.queryapi.MCFMSQLUtil
 *  mcframe.serverCore.queryapi.MCFMSQLUtil$MCDMLCallback
 *  mcframe.serverCore.queryapi.MCFMSQLUtil$MCEditDMLCast
 *  mcframe.serverCore.queryapi.MCFMSQLUtil$MCRef
 *  mcframe.serverCore.queryapi.MCFMSQLUtil$MCRefDMLCast
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.queryapi.MCSQLComponent$MCDMLImpl
 *  mcframe.serverCore.queryapi.MCSQLComponent$MCMainQueryImpl
 *  mcframe.serverCore.queryapi.MCSQLComponent$MCPredicateImpl
 */
package mcframe.serverCore.queryapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.Core_Msg_FW_A;
import mcframe.serverCore.cache.MCJoinerList;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDynamicSQLFactory;
import mcframe.serverCore.queryapi.MCFMSQLUtil;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.queryapi.MCSQLComponent;

public class MCQueryExecution {
    public static MCQueryPlan createQueryPlan() {
        return MCQueryPlanImpl.create();
    }

    public static IFMCSQL.MCDynamicSQLInfo when(Predicate<MCRow> bind) {
        return IFMCSQL.createDynamicSQLInfo().when(bind);
    }

    public static MCBindCond boundAnd(Object ... objs) {
        return MCQueryExecution._bound((Stream<Object> s, Predicate<Object> p) -> s.allMatch(p), MCFMSQLUtil.nonNull((Object[])objs));
    }

    public static MCBindCond boundOr(Object ... objs) {
        return MCQueryExecution._bound((Stream<Object> s, Predicate<Object> p) -> s.anyMatch(p), MCFMSQLUtil.nonNull((Object[])objs));
    }

    private static boolean _bound(MCRow r, String column) {
        return r.getDataType(column) == MCDataType.BOOLEAN ? r.getBooleanNE(column) : !MCQueryExecution._isNull(r.getValueNE(column));
    }

    private static boolean _isNull(Comparable<?> val) {
        return val instanceof String ? val == null || val.equals("") : val == null;
    }

    private static MCBindCond _bound(BiFunction<Stream<Object>, Predicate<Object>, Boolean> function, Object ... objs) {
        return r -> (Boolean)function.apply(Stream.of(objs).filter(o -> o instanceof String || o instanceof MCBindCond), o -> o instanceof String ? MCQueryExecution._bound(r, (String)o) : (o instanceof MCBindCond ? Boolean.valueOf(((MCBindCond)o).test(r)) : null));
    }

    @SafeVarargs
    public static <R extends MCRow> MCJoinerList<R> joinInfo(Consumer<MCJoinerList<R>> ... functions) {
        MCJoinerList jList = new MCJoinerList();
        Stream.of((Consumer[])MCFMSQLUtil.nonNull((Object[])functions)).forEach(f -> f.accept(jList));
        return jList;
    }

    @FunctionalInterface
    public static interface MCBindCond
    extends Predicate<MCRow> {
    }

    public static class MCQueryExecutor {
        private static final String INDEX_COL_NM = "$MCF_FC_INDEX";

        protected static int executeQuery(MCQueryPlan plan, MCDBTransaction tran, MCRow bind, MCList<? extends MCRow> mergeBinds, MCRow result) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCMainQueryImpl dml = (MCSQLComponent.MCMainQueryImpl)MCQueryExecutor._nonNull(p.getRefDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            int ret = IFMCSQL.executeQuery$((MCSQLComponent.MCDMLImpl)dml, (MCDBTransaction)t, (String)p.getSQLID(), (String)MCQueryExecutor._sql((MCSQLComponent.MCDMLImpl)dml, p, bind, null), (MCRow)bind, mergeBinds, (MCRow)result);
            MCQueryExecutor._join(p, result);
            return ret;
        }

        protected static int executeQuery(MCQueryPlan plan, MCDBTransaction tran, MCRow bind, MCList<? extends MCRow> mergeBinds, MCList<? extends MCRow> result, int fetchSize) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCMainQueryImpl dml = (MCSQLComponent.MCMainQueryImpl)MCQueryExecutor._nonNull(p.getRefDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            int ret = IFMCSQL.executeQuery$((MCSQLComponent.MCDMLImpl)dml, (MCDBTransaction)t, (String)p.getSQLID(), (String)MCQueryExecutor._sql((MCSQLComponent.MCDMLImpl)dml, p, bind, null), (MCRow)bind, mergeBinds, result, (int)fetchSize);
            MCQueryExecutor._join(p, result);
            return ret;
        }

        protected static <T extends MCRow> MCCursor<T> openCursor(MCQueryPlan plan, MCDBTransaction tran, MCRow bind, MCList<? extends MCRow> mergeBinds, Class<T> rc, int fetchSize) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCMainQueryImpl dml = (MCSQLComponent.MCMainQueryImpl)MCQueryExecutor._nonNull(p.getRefDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            return IFMCSQL.openCursor$((MCSQLComponent.MCDMLImpl)dml, (MCDBTransaction)t, (String)p.getSQLID(), (String)MCQueryExecutor._sql((MCSQLComponent.MCDMLImpl)dml, p, bind, null), (MCRow)bind, mergeBinds, rc, l -> MCQueryExecutor._join(p, (MCList<? extends MCRow>)l), (int)fetchSize);
        }

        protected static void executeUpdate(MCQueryPlan plan, MCDBTransaction tran, MCRow bind, MCRow exBind, MCList<? extends MCRow> mergeBinds) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCDMLImpl dml = (MCSQLComponent.MCDMLImpl)MCQueryExecutor._nonNull(p.getEditDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            IFMCSQL.executeUpdate$((MCSQLComponent.MCDMLImpl)dml, (MCDBTransaction)t, (String)p.getSQLID(), (String)MCQueryExecutor._sql(dml, p, bind, exBind), (MCRow)bind, (MCRow)exBind, mergeBinds);
        }

        protected static void executeBatchUpdate(MCQueryPlan plan, MCDBTransaction tran, MCRow bind, MCList<? extends MCRow> binds, MCList<? extends MCRow> exBinds, MCList<? extends MCRow> mergeBinds) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCDMLImpl dml = (MCSQLComponent.MCDMLImpl)MCQueryExecutor._nonNull(p.getEditDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            IFMCSQL.executeBatchUpdate$((MCSQLComponent.MCDMLImpl)dml, (MCDBTransaction)t, (String)p.getSQLID(), (String)MCQueryExecutor._sql(dml, p, bind, null), binds, exBinds, mergeBinds);
        }

        protected static int executeQuery(MCQueryPlan plan, MCDBTransaction tran, MCList<? extends MCRow> bindList, MCRow bind, MCList<? extends MCRow> result, int fetchSize, int selectAgainSize) {
            MCQueryPlanImpl p = (MCQueryPlanImpl)MCQueryExecutor._nonNull(plan);
            MCSQLComponent.MCMainQueryImpl dml = (MCSQLComponent.MCMainQueryImpl)MCQueryExecutor._nonNull(p.getRefDML());
            MCDBTransaction t = (MCDBTransaction)MCFMSQLUtil.nonNull((Object)tran);
            return bindList == null || bindList.size() <= 0 ? 0 : MCQueryExecutor._executeQuery(dml, p, t, bindList, bind, result, fetchSize, selectAgainSize);
        }

        private static <T extends MCRow> int _executeQuery(MCSQLComponent.MCMainQueryImpl dml, MCQueryPlanImpl plan, MCDBTransaction tran, MCList<? extends MCRow> bindList, MCRow bind, MCList<T> result, int fetchSize, int selectAgainSize) {
            MCFMSQLUtil.MCRef cutoff = MCFMSQLUtil.MCRef.create(null);
            MCList binds = MCList.create(MCRow.class);
            MCSQLComponent.MCMainQueryImpl[] dmls = dml.replicate(x -> Optional.of(x == null ? (MCSQLComponent.MCPredicateImpl)MCFMSQLUtil.ex((String)Core_Msg_FW_A.FCBCC0018, (Object[])new Object[0]) : x).map(MCFMSQLUtil.tap(p -> {
                Object object = cutoff.set(IFMCSQL.hasCutoff((IFMCSQL.MCPredicate)p) ? result : null);
            })).map(p -> (MCSQLComponent.MCPredicateImpl[])((ArrayList)Optional.of(new ArrayList()).map(MCFMSQLUtil.tap(l -> MCQueryApiBuilder.makeLines((String)plan.getSQLID(), (IFMCSQL.MCPredicate)p, (MCList)bindList, (List)l, (MCList)binds, (int)selectAgainSize))).get()).stream().toArray(MCSQLComponent.MCPredicateImpl[]::new)).get());
            Optional.ofNullable(result).ifPresent(MCList::clear);
            Optional<MCList> tmp = Optional.ofNullable(result == null ? null : result.clone());
            IntStream.range(0, dmls.length).forEach(i -> {
                IFMCSQL.executeQuery$((MCSQLComponent.MCDMLImpl)dmls[i], (MCDBTransaction)tran, (String)plan.getSQLID(), (String)MCQueryExecutor._sql((MCSQLComponent.MCDMLImpl)dmls[i], plan, bind, null), (MCRow)bind, (MCList)((MCList)Optional.of(MCList.create(MCRow.class)).map(MCFMSQLUtil.tap(l -> {
                    boolean bl = l.add(binds.get(i));
                })).get()), (MCList)tmp.orElse(null), (int)fetchSize);
                tmp.ifPresent(l -> {
                    result.addAll((Collection)l);
                    l.clear();
                });
            });
            Optional.ofNullable((MCList)cutoff.get()).ifPresent(l -> {
                MCList dl = l.distinctNE(((MCList)tmp.get()).getColumnPathArray());
                if (dml.hasOrderBy()) {
                    IntStream.range(0, l.size()).forEach(i -> l.get(i).addNumberColumn(INDEX_COL_NM, MCNumber.valueOf((int)i)));
                    dl.sort(new String[]{INDEX_COL_NM});
                }
                l.clear();
                l.addAll((Collection)dl);
            });
            MCQueryExecutor._join(plan, result);
            return result == null ? 0 : result.size();
        }

        private static <T> T _nonNull(Object obj) {
            return (T)(obj == null ? MCFMSQLUtil.ex((String)Core_Msg_FW_A.FCBCC0018, (Object[])new Object[0]) : obj);
        }

        private static String _sql(MCSQLComponent.MCDMLImpl dml, MCQueryPlanImpl plan, MCRow bind, MCRow exBind) {
            return dml.createSQL(plan.getDynamicSQLInfo() == null ? null : (MCDynamicSQLFactory.MCDynamicSQLEditor)MCFMSQLUtil.at((Function[])((Function[])Stream.of(plan.getDynamicSQLInfo()).map(i -> e -> ((MCDynamicSQLFactory.MCDynamicSQLInfoImpl)i).apply(e, bind)).toArray(Function[]::new))).apply(MCDynamicSQLFactory.MCDynamicSQLEditor.create()), bind, exBind);
        }

        private static <R extends MCRow> void _join(MCQueryPlanImpl plan, R row) {
            Optional.ofNullable(row == null ? null : plan.getJoinInfo()).ifPresent(j -> j.join(row));
        }

        private static <R extends MCRow> void _join(MCQueryPlanImpl plan, MCList<? extends MCRow> list) {
            Optional.ofNullable(list == null ? null : plan.getJoinInfo()).ifPresent(j -> j.join(list));
        }
    }

    public static interface MCQueryPlan {
        public MCQueryPlan setSQLID(String var1);

        public String getSQLID();

        public MCQueryPlan setQuery(IFMCSQL.MCDML var1);

        public <T extends IFMCSQL.MCDML> T getQuery();

        public IFMCSQL.MCColumnSubQuery toSubQuery();

        public MCQueryPlan setDynamicSQLInfo(IFMCSQL.MCDynamicSQLInfo ... var1);

        public IFMCSQL.MCDynamicSQLInfo[] getDynamicSQLInfo();

        public MCQueryPlan addDynamicSQLInfo(IFMCSQL.MCDynamicSQLInfo ... var1);

        public MCQueryPlan setJoinInfo(MCJoinerList<?> var1);

        public MCJoinerList<?> getJoinInfo();
    }

    static abstract class MCQueryPlanImpl
    implements MCQueryPlan {
        private Optional<String> _id;
        private MCSQLComponent.MCDMLImpl _query;
        private IFMCSQL.MCDynamicSQLInfo[] _dInfo;
        private MCJoinerList<?> _jList;

        MCQueryPlanImpl() {
        }

        @Override
        public MCQueryPlan setSQLID(String id) {
            this._id = Optional.ofNullable(id);
            return this;
        }

        @Override
        public String getSQLID() {
            return this._id != null ? (String)this._id.orElse(null) : (this._query != null ? this._query.id() : null);
        }

        @Override
        public MCQueryPlan setQuery(IFMCSQL.MCDML query) {
            this._query = (MCSQLComponent.MCDMLImpl)query;
            return this;
        }

        @Override
        public <T extends IFMCSQL.MCDML> T getQuery() {
            return (T)this._query;
        }

        @Override
        public IFMCSQL.MCColumnSubQuery toSubQuery() {
            return Optional.ofNullable(this.getRefDML()).map(MCSQLComponent.MCMainQueryImpl::toSubQuery).orElse(null);
        }

        @Override
        public MCQueryPlan setDynamicSQLInfo(IFMCSQL.MCDynamicSQLInfo ... info) {
            this._dInfo = info;
            return this;
        }

        @Override
        public IFMCSQL.MCDynamicSQLInfo[] getDynamicSQLInfo() {
            return this._dInfo;
        }

        @Override
        public MCQueryPlan addDynamicSQLInfo(IFMCSQL.MCDynamicSQLInfo ... info) {
            this._dInfo = (IFMCSQL.MCDynamicSQLInfo[])Stream.concat(this._dInfo == null ? Stream.empty() : Stream.of(this._dInfo), info == null ? Stream.empty() : Stream.of(info)).toArray(IFMCSQL.MCDynamicSQLInfo[]::new);
            return this;
        }

        @Override
        public MCQueryPlan setJoinInfo(MCJoinerList<?> list) {
            this._jList = list;
            return this;
        }

        @Override
        public MCJoinerList<?> getJoinInfo() {
            return this._jList;
        }

        MCSQLComponent.MCMainQueryImpl getRefDML() {
            return (MCSQLComponent.MCMainQueryImpl)this._dml((MCFMSQLUtil.MCDMLCallback)MCFMSQLUtil.MCRefDMLCast.create());
        }

        MCSQLComponent.MCDMLImpl getEditDML() {
            return (MCSQLComponent.MCDMLImpl)this._dml((MCFMSQLUtil.MCDMLCallback)MCFMSQLUtil.MCEditDMLCast.create());
        }

        private <T> T _dml(MCFMSQLUtil.MCDMLCallback<T> callback) {
            return (T)(this._query == null ? null : Optional.of(Objects.equals(this.getSQLID(), this._query.id()) ? this._query : this._query.replicate(this.getSQLID())).map(q -> q.call(callback)).orElseThrow(() -> (RuntimeException)MCFMSQLUtil.ex((String)Core_Msg_FW_A.FCBCC0410, (Object[])new Object[0])));
        }

        static MCQueryPlanImpl create() {
            return new MCQueryPlanImpl(){};
        }
    }
}

