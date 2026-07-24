package mcframe.serverMSBC.MSBCB0060;

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
	 * -- MSBCB0060_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCB0060_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T = MST_ITM_ORDER_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB0060_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(S0_T.itm_ord_no)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
						.and(
							S0_T.itm_ord_sts_typ.in(
								bind("wk_opn"),
								bind("wk_sav")
							)
						)
						.and(S0_T.not_fix_flg.eq(value(false)))
						.and(S0_T.ord_fix_pd.isNotNull())
						.and(
							bracket(
								bind("mfg_flg").eq(value(true))
								.and(S0_T.itm_ord_typ.eq(bind("wk_mfg")))
								.and(
									S0_T.mfg_st_schd_dt.lte(
										cases()
											.when(bind("consider_holiday_flg").eq(value(true)))
												.then(MAPA_DT$F_CAL_DATE_LOC(trunc(
														bind("dt"),
														MCDateFmt.DD),
													S0_T.ord_fix_pd,
													value(true),
													S0_T.mfg_loc_cd,
													value(false)
													)
												)
											.otherwise(trunc(
											bind("dt"),
											MCDateFmt.DD
										).addDays(S0_T.ord_fix_pd)
									)
								)
							)
							)
							.or(
								bind("purc_flg").eq(value(true))
								.and(S0_T.itm_ord_typ.eq(bind("wk_purc")))
								.and(
									S0_T.po_schd_dt.lte(
										cases()
											.when(bind("consider_holiday_flg").eq(value(true)))
												.then(MAPA_DT$F_CAL_DATE_LOC(trunc(
														bind("dt"),
														MCDateFmt.DD),
													S0_T.ord_fix_pd,
													value(true),
													S0_T.strg_loc_cd,
													value(false)
													)
												)
											.otherwise(trunc(
											bind("dt"),
											MCDateFmt.DD
										).addDays(S0_T.ord_fix_pd)
									)
								)
							)
							)
							.or(
								bind("outsrc_flg").eq(value(true))
								.and(S0_T.itm_ord_typ.eq(bind("wk_outsrc")))
								.and(
									S0_T.po_schd_dt.lte(
										cases()
											.when(bind("consider_holiday_flg").eq(value(true)))
												.then(MAPA_DT$F_CAL_DATE_LOC(trunc(
														bind("dt"),
														MCDateFmt.DD),
													S0_T.ord_fix_pd,
													value(true),
													S0_T.strg_loc_cd,
													value(false)
													)
												)
											.otherwise(trunc(
											bind("dt"),
											MCDateFmt.DD
										).addDays(S0_T.ord_fix_pd)
									)
								)
							)
							)
							.or(
								bind("xfr_flg").eq(value(true))
								.and(S0_T.itm_ord_typ.eq(bind("wk_xfr")))
								.and(
									S0_T.gi_schd_dt.lte(
										cases()
											.when(bind("consider_holiday_flg").eq(value(true)))
												.then(MAPA_DT$F_CAL_DATE_LOC(trunc(
														bind("dt"),
														MCDateFmt.DD),
													S0_T.ord_fix_pd,
													value(true),
													S0_T.rqst_loc_cd,
													value(false)
													)
												)
											.otherwise(trunc(
											bind("dt"),
											MCDateFmt.DD
										).addDays(S0_T.ord_fix_pd)
									)
								)
							)
							)
							.or(
								bind("wg_xfr_flg").eq(value(true))
								.and(S0_T.itm_ord_typ.eq(bind("wk_wg_xfr")))
								.and(
									S0_T.gi_schd_dt.lte(
										cases()
											.when(bind("consider_holiday_flg").eq(value(true)))
												.then(MAPA_DT$F_CAL_DATE_LOC(trunc(
														bind("dt"),
														MCDateFmt.DD),
													S0_T.ord_fix_pd,
													value(true),
													S0_T.rqst_loc_cd,
													value(false)
													)
												)
											.otherwise(trunc(
											bind("dt"),
											MCDateFmt.DD
										).addDays(S0_T.ord_fix_pd)
											)
									)
								)
							)
						)
					)
					.orderBy(S0_T.itm_ord_no.asc())
			);
	}
	
	/**
	 * -- MSBCB0060_MST_ITM_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCB0060_MST_ITM_ORDER_S02() {
		MST_ITM_ORDER_R S0_T = MST_ITM_ORDER_R.create("T");
		MSW_ITM_ORDER_R S1_W = MSW_ITM_ORDER_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB0060_MST_ITM_ORDER_Query_S02")
					.mainQuery()
					.select(
						S0_T.itm_ord_no,
						S0_T.itm_ord_typ,
						S0_T.ord_gnrt_typ
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W)
								.where(
									S0_T.itm_ord_no.eq(S1_W.itm_ord_no)
								)
							)
						)
					)
					.orderBy(S0_T.itm_ord_no.asc())
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBCB0060_MSW_ITM_ORDER_Query_I01
	 */
	static MCQueryPlan MSBCB0060_MSW_ITM_ORDER_I01() {
		MSW_ITM_ORDER_R S0 = MSW_ITM_ORDER_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB0060_MSW_ITM_ORDER_Query_I01")
					.insert(S0)
					.columns(S0.itm_ord_no)
					.values(
						bind("itm_ord_no")
					)
			);
	}
}