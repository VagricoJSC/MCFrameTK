package mcframe.serverMSUC.MSUCL0080;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSUCL0080_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSUCL0080_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSUCL0080_MST_SHIP_PR_Query_S01")
					.mainQuery()
					.select(S0_T1.ship_pr_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_d_no.eq(S0_T1.slo_d_no))
						.innerJoin(S0_T3).on(S0_T3.slo_no.eq(S0_T2.slo_no))
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.ship_inst_qty.gt(value(0))
							.or(S0_T1.ship_act_qty.gt(value(0)))
							.or(S0_T1.sls_qty.gt(value(0)))
						)
						.and(S0_T3.slo_no.eq(bind("slo_no")))
					)
			);
	}
	
	/**
	 * -- MSUCL0080_MST_SHIP_PR_Query_S02
	 */
	static MCQueryPlan MSUCL0080_MST_SHIP_PR_S02() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSUCL0080_MST_SHIP_PR_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_ptn_typ,
						S0_T1.ship_cmpl_flg,
						S0_T1.sls_cmpl_flg,
						S0_T1.dlv_cmpl_flg,
						S0_T2.sls_cststk_flg,
						S0_T1.dlv_inst_rcpt_qty,
						S0_T1.dlv_inst_prms_qty,
						S0_T1.base_unit_qty,
						S0_T1.re_ship_schd_qty,
						S0_T1.prms_qty,
						S0_T1.iv_schd_qty,
						S0_T1.iv_act_qty,
						S0_T1.via_dlv_typ,
						S0_T1.slo_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_d_no.eq(S0_T1.slo_d_no))
						.innerJoin(S0_W1).on(S0_W1.slo_d_no.eq(S0_T1.slo_d_no))
					)
			);
	}
}