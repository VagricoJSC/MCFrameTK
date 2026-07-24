/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.util.MCFunctionIFUtil$ExFunction
 *  mcframe.serverCore.queryapi.MCDBContainer
 */
package mcframe.serverCore.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.util.MCFunctionIFUtil;
import mcframe.serverCore.cache.MCJoiner;
import mcframe.serverCore.queryapi.MCDBContainer;

public class MCJoinerList<R extends MCRow> {
    private List<MCJoiner<R, ? extends MCDBContainer>> _joiners = new ArrayList<MCJoiner<R, ? extends MCDBContainer>>();

    public static Comparable<?>[] toCondition(Comparable<?> ... vals) {
        return MCJoiner.toCondition(vals);
    }

    public <M extends MCDBContainer> MCJoiner<R, M> add(Class<M> tbl, MCFunctionIFUtil.ExFunction<R, Comparable<?>[]> cond) {
        MCJoiner<R, M> joiner = new MCJoiner<R, M>(tbl, cond, null, null);
        this._joiners.add(joiner);
        return joiner;
    }

    public List<MCJoiner<R, ? extends MCDBContainer>> toList() {
        return new ArrayList<MCJoiner<R, ? extends MCDBContainer>>(this._joiners);
    }

    public Stream<MCJoiner<R, ? extends MCDBContainer>> stream() {
        return this._joiners.stream();
    }

    public void join(R row) {
        MCList list = MCList.create(row);
        list.add(row);
        this.join(list);
    }

    public void join(MCList<R> list) {
        this._joiners.stream().forEach(joiner -> joiner.join(list));
    }
}

