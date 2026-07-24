/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCIndexKey
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.jwt.MCJWT
 *  mcframe.commonCore.jwt.MCJwtException
 *  mcframe.commonCore.login.MCAuth
 *  mcframe.serverCore.dbc.FCM_CO_ALL_R
 *  mcframe.serverCore.dbc.FCM_CO_LCL_ALL_R
 *  mcframe.serverCore.dbc.FCM_GRANT_CO_R
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDOrder
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMExpr
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCExprColumn
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPredicate
 *  mcframe.serverCore.queryapi.IFMCSQL$MCSingleView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCStringValue
 *  mcframe.serverCore.queryapi.MCDBContainer
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.util.MCDBUtil
 */
package mcframe.serverCore.atwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.jwt.MCJWT;
import mcframe.commonCore.jwt.MCJwtException;
import mcframe.commonCore.login.MCAuth;
import mcframe.serverCore.atwork.MCAWCo;
import mcframe.serverCore.dbc.FCM_CO_ALL_R;
import mcframe.serverCore.dbc.FCM_CO_LCL_ALL_R;
import mcframe.serverCore.dbc.FCM_GRANT_CO_R;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.util.MCDBUtil;

public class MCAWCocdResolver {
    public static final String ALL_CO = "*";
    private Map<String, CoUsers> _coUsers = new HashMap<String, CoUsers>();
    private static final ThreadLocal<MCAWCocdResolver> _threadLocal = new ThreadLocal();

    public static void init() {
        _threadLocal.remove();
        _threadLocal.set(new MCAWCocdResolver());
    }

    public static String resolveCoCd(String awid, String userId, String tokenStr) throws MCJwtException {
        String result = "";
        result = MCAWCocdResolver.resolveCoCdFromToken(tokenStr);
        if (result != null && !result.isEmpty()) {
            return result;
        }
        if (MCAuth.isAdminUser((String)userId)) {
            return ALL_CO;
        }
        result = MCAWCocdResolver.resolveCoCdFromDB(userId, null);
        return result;
    }

    private static String resolveCoCdFromToken(String tokenStr) throws MCJwtException {
        if (tokenStr == null) {
            return null;
        }
        return MCJWT.decode((String)tokenStr, null).getCoCd();
    }

    private static String resolveCoCdFromDB(String userId, String locale) throws MCJwtException {
        MCList<MCRow> list = MCAWCocdResolver.userCoCd(userId, locale);
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0).getStringNE("CO_CD");
        }
        return MCAWCocdResolver.mainCocd(list);
    }

    private static MCList<MCRow> userCoCd(String userId, String locale) {
        MCList list = MCList.create(MCRow.class);
        list.addBooleanColumn("MAIN_FLG");
        MCRow bindMap = MCRow.create();
        bindMap.setStringNE("user_id", userId);
        bindMap.setStringNE("locale", locale);
        FCM_GRANT_CO_R S0GC = FCM_GRANT_CO_R.create((String)"GC");
        FCM_CO_ALL_R S0C = FCM_CO_ALL_R.create((String)"C");
        FCM_CO_LCL_ALL_R S0L = FCM_CO_LCL_ALL_R.create((String)"L");
        IFMCSQL.MCMainQuery q = (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_AW_GET_USERS_COCD_FROM_GRANT").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S0GC.co_cd, ((IFMCSQL.MCStringValue)IFMCSQL.nvl((IFMCFMSQL.MCFMExpr)S0L.co_nm, (Object)S0C.co_nm)).as("co_nm"), S0GC.main_flg}).from((IFMCSQL.MCDerivedView)S0GC.leftOuterJoin((IFMCSQL.MCSingleView)S0C).on(S0GC.co_cd.eq((Object)S0C.co_cd)).leftOuterJoin((IFMCSQL.MCSingleView)S0L).on(S0C.co_cd.eq((Object)S0L.co_cd).and(S0L.lcl_cd.eq((Object)IFMCSQL.bind((String)"locale")))))).where(S0GC.user_id.eq((Object)IFMCSQL.bind((String)"user_id")))).orderBy(new IFMCFMSQL.MCFMEDOrder[]{S0GC.co_cd.asc()});
        q.executeQuery(bindMap, list);
        return list;
    }

    static List<MCAWCo> getUserCoCd(String userId, String locale) {
        ArrayList<MCAWCo> ret = new ArrayList<MCAWCo>();
        MCList<MCRow> cocds = null;
        cocds = MCAuth.isAdminUser((String)userId) ? MCAWCocdResolver.allcocd(locale) : MCAWCocdResolver.userCoCd(userId, locale);
        cocds.forEach(r -> ret.add(new MCAWCo(r.getStringNE("CO_CD"), r.getStringNE("CO_NM"))));
        return ret;
    }

    private static void cacheCompanyUsers(String[] cocds) {
        _threadLocal.get()._cacheCompanyUsers(cocds);
    }

    private void _cacheCompanyUsers(String[] cocds) {
        MCList list = MCList.create(MCRow.class);
        MCRow bindMap = MCRow.create();
        String[] stringArray = cocds;
        int n = cocds.length;
        int n2 = 0;
        while (n2 < n) {
            String co = stringArray[n2];
            CoUsers cache = this._coUsers.get(co);
            if (cache == null) {
                MCList list2 = MCList.create(MCRow.class);
                bindMap.setStringNE("co_cd", co);
                FCM_GRANT_CO_R S0GC = FCM_GRANT_CO_R.create((String)"GC");
                IFMCSQL.MCMainQuery q = (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_AW_COCD_USER_FROM_GRANT").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S0GC.co_cd, S0GC.user_id}).from((IFMCSQL.MCDerivedView)S0GC)).where(IFMCSQL.value((int)0).eq((Object)IFMCSQL.value((int)0)).and(S0GC.co_cd.eq((Object)IFMCSQL.bind((String)"co_cd"))));
                q.executeQuery(bindMap, list2);
                this._coUsers.put(co, new CoUsers((MCList<MCRow>)list2));
            }
            list.addAll(this._coUsers.get((Object)co).coUsers);
            ++n2;
        }
    }

    public static boolean isUserCompany(String userId, String[] cocds) {
        return _threadLocal.get()._isUserCompany(userId, cocds);
    }

    private boolean _isUserCompany(String userId, String[] cocds) {
        MCAWCocdResolver.cacheCompanyUsers(cocds);
        String[] stringArray = cocds;
        int n = cocds.length;
        int n2 = 0;
        while (n2 < n) {
            String co = stringArray[n2];
            CoUsers cs = this._coUsers.get(co);
            if (cs.contains(userId)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static String mainCocd(MCList<MCRow> list) {
        for (MCRow row : list) {
            if (!row.getBooleanNE("MAIN_FLG")) continue;
            return row.getStringNE("CO_CD");
        }
        return list.get(0).getStringNE("CO_CD");
    }

    private static MCList<MCRow> cocd(String[] cocds, String locale) {
        MCList list = MCList.create(MCRow.class);
        MCList bindMap = MCList.create(MCRow.class);
        String[] stringArray = cocds;
        int n = cocds.length;
        int n2 = 0;
        while (n2 < n) {
            String c = stringArray[n2];
            MCRow b = MCRow.create();
            b.setStringNE("co_cd", c);
            bindMap.add(b);
            ++n2;
        }
        MCRow otherBind = MCRow.create();
        otherBind.setStringNE("locale", locale);
        FCM_CO_ALL_R c = FCM_CO_ALL_R.create((String)"C");
        FCM_CO_LCL_ALL_R l = FCM_CO_LCL_ALL_R.create((String)"L");
        MCQueryApiBuilder bldr = MCQueryApiBuilder.create((MCDBContainer)c);
        bldr.setSelect(new IFMCSQL.MCColumn[]{c.co_cd, ((IFMCSQL.MCStringValue)IFMCSQL.nvl((IFMCFMSQL.MCFMExpr)l.co_nm, (Object)c.co_nm)).as("CO_NM")});
        bldr.addLeftOuterJoin((IFMCSQL.MCSingleView)l, c.co_cd.eq((Object)l.co_cd).and(l.lcl_cd.eq((Object)IFMCSQL.bind((String)"locale"))));
        bldr.setWhere(c.co_cd.eq((Object)IFMCSQL.bind((String)"co_cd")), new Comparable[0]);
        bldr.setOrderByAsc(new IFMCSQL.MCExprColumn[]{c.co_cd});
        MCDBUtil.dbSelect((String)"FC_AW_GET_COCDS_FCM_CO_ALL_S01", (MCList)list, (MCQueryApiBuilder)bldr, (MCList)bindMap, (MCRow)otherBind);
        return list;
    }

    private static MCList<MCRow> allcocd(String locale) {
        MCList list = MCList.create(MCRow.class);
        MCRow bind = MCRow.create();
        bind.setStringNE("locale", locale);
        FCM_CO_ALL_R S0C = FCM_CO_ALL_R.create((String)"C");
        FCM_CO_LCL_ALL_R S0L = FCM_CO_LCL_ALL_R.create((String)"L");
        IFMCSQL.MCMainQuery q = (IFMCSQL.MCMainQuery)((IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FC_AW_GET_COCDS_FCM_CO_ALL_S02").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S0C.co_cd, ((IFMCSQL.MCStringValue)IFMCSQL.nvl((IFMCFMSQL.MCFMExpr)S0L.co_nm, (Object)S0C.co_nm)).as("co_nm")}).from((IFMCSQL.MCDerivedView)S0C.leftOuterJoin((IFMCSQL.MCSingleView)S0L).on(IFMCSQL.bracket((IFMCSQL.MCPredicate)S0C.co_cd.eq((Object)S0L.co_cd).and(S0L.lcl_cd.eq((Object)IFMCSQL.bind((String)"locale"))))))).orderBy(new IFMCFMSQL.MCFMEDOrder[]{S0C.co_cd.asc()});
        q.executeQuery(bind, list);
        return list;
    }

    static List<MCAWCo> getCoCd(String[] cocds, String locale) {
        ArrayList<MCAWCo> ret = new ArrayList<MCAWCo>();
        MCList<MCRow> cs = MCAWCocdResolver.cocd(cocds, locale);
        cs.forEach(r -> ret.add(new MCAWCo(r.getStringNE("CO_CD"), r.getStringNE("CO_NM"))));
        return ret;
    }

    class CoUsers {
        static final String usercol = "user_id";
        final MCIndexKey k;
        final MCList<MCRow> coUsers;

        public CoUsers(MCList<MCRow> coUsers) {
            this.coUsers = coUsers;
            this.k = coUsers.createIndex(new String[]{usercol});
        }

        boolean contains(String userid) {
            return this.coUsers.contains(this.k, new Comparable[]{userid});
        }
    }
}

