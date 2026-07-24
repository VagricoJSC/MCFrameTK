/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.util.MCUtil
 *  mcframe.serverCore.dbc.FCVM_CO_R
 *  mcframe.serverCore.queryapi.IFMCFMSQL$MCFMEDColumnGroup
 *  mcframe.serverCore.queryapi.IFMCSQL
 *  mcframe.serverCore.queryapi.IFMCSQL$MCDerivedView
 *  mcframe.serverCore.queryapi.IFMCSQL$MCExpr
 *  mcframe.serverCore.queryapi.IFMCSQL$MCMainQuery
 *  mcframe.serverCore.queryapi.IFMCSQL$MCPermColumn
 *  mcframe.serverCore.queryapi.MCQueryApiBuilder
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 */
package mcframe.serverCore.cache.ctrl;

import java.util.List;
import java.util.Locale;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.util.MCUtil;
import mcframe.serverCore.cache.MCTableCache;
import mcframe.serverCore.cache.ctrl.InfoR;
import mcframe.serverCore.cache.ctrl.MCCacheProxy;
import mcframe.serverCore.cache.ctrl.MCJdbcProxy;
import mcframe.serverCore.cache.ctrl.MCTableCacheCtrl_FW_A;
import mcframe.serverCore.dbc.FCVM_CO_R;
import mcframe.serverCore.queryapi.IFMCFMSQL;
import mcframe.serverCore.queryapi.IFMCSQL;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;

public abstract class MCTableCacheCtrl_FW
extends MCTableCacheCtrl_FW_A {

    public class CacheInfo
    extends MCTableCacheCtrl_FW_A.CacheInfo {
        public CacheInfo() {
            super(MCTableCacheCtrl_FW.this);
        }

        protected void call() {
            Class current_dbc = null;
            String current_co_cd = null;
            String table = null;
            String table_nm = null;
            MCNumber table_cnt = null;
            MCTimestamp table_ts = null;
            List<Object[]> infos = MCCacheProxy.proxy.tableCacheExpandSysAll();
            for (Object[] info : infos) {
                Class dbc = (Class)info[0];
                String co_cd = (String)info[1];
                Locale locale = (Locale)info[2];
                MCTableCache cache = (MCTableCache)info[3];
                if (!dbc.equals(current_dbc) || !MCUtil.equals((Object)co_cd, current_co_cd)) {
                    Object t = cache.createRow();
                    table = t.tableName();
                    table_nm = MCConst.dblbl.getLabel(table, null);
                    MCJdbcProxy.proxy.setCoViewInfo(co_cd, locale);
                    t.setAlias("T");
                    MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
                    IFMCSQL.MCPermColumn upd_ts = t.getColumn$("upd_ts");
                    if (upd_ts != null) {
                        builder.addMax((IFMCSQL.MCExpr)upd_ts, "upd_ts");
                    }
                    builder.addCount((IFMCSQL.MCExpr)t.getKeyColumn$()[0], "CNT");
                    builder.buildSelect("FCBGL0170_DBCONTAINER_S01").executeQuery(t);
                    table_cnt = t.getNumber("CNT");
                    table_ts = upd_ts != null ? t.getTimestamp("upd_ts") : null;
                    current_dbc = dbc;
                    current_co_cd = co_cd;
                }
                InfoR infoR = (InfoR)this.down0().add();
                infoR.table(table);
                infoR.table_nm(table_nm);
                infoR.co_cd(co_cd);
                infoR.lcl_cd(locale != null ? locale.toString() : null);
                infoR.cache_cnt(cache.size());
                infoR.cache_ts(cache.getSyncTime());
                infoR.table_cnt(table_cnt);
                infoR.table_ts(table_ts);
            }
            this.setCoNm();
            this.setLclNm();
            this.down0().sort(new String[]{"table", "co_cd", "lcl_cd"});
        }

        protected void setCoNm() {
            MCList coL = MCList.create(FCVM_CO_R.class);
            FCVM_CO_R S0 = FCVM_CO_R.create((String)"S0");
            IFMCSQL.MCMainQuery q = (IFMCSQL.MCMainQuery)IFMCSQL.sql((String)"FCBGL0170_FCVM_CO_S01").mainQuery().select(new IFMCFMSQL.MCFMEDColumnGroup[]{S0.co_cd, S0.co_nm}).from((IFMCSQL.MCDerivedView)S0);
            q.executeQuery(coL);
            this.down0().forEach(downR -> {
                FCVM_CO_R coR = (FCVM_CO_R)coL.getFirst("co_cd", (Comparable)((Object)downR.co_cd()));
                if (coR != null) {
                    downR.co_nm(coR.co_nm());
                }
            });
        }

        protected void setLclNm() {
            MCList tarL = MCConfig.server.getEntryLocaleList("cd", "nm");
            for (InfoR r : this.down0()) {
                MCRow tar = tarL.getFirst("cd", (Comparable)((Object)r.lcl_cd()));
                if (tar == null) continue;
                r.lcl_nm(tar.getStringNE("nm"));
            }
        }
    }

    public class UpdateNotify
    extends MCTableCacheCtrl_FW_A.UpdateNotify {
        public UpdateNotify() {
            super(MCTableCacheCtrl_FW.this);
        }

        protected void call() {
            String[] tables = this.up1().getString("table").toArray(new String[this.up1().size()]);
            MCTableCache.updateSys(tables);
        }
    }
}

