package mcframe.serverMSBC.MSBCL5080;

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
	 * -- MSBCL5080_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5080_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T = MST_ITM_ORDER_R.create("T");
		MST_RQMT_R S1_T1 = MST_RQMT_R.create("T1");
		MAM_MPS_GRP_R S1_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_MPS_ITM_R S1_M2 = MAM_MPS_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_ord_no,
						S0_T.upd_cntr.as("itm_ord_upd_cntr")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.wg_cd.eq(bind("wg_cd")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_T1
									.innerJoin(S1_M1).on(
										S1_T1.due_dt.lte(MAPA_DT$F_GET_YM_END_DT_NE1(
												addMonths(
													bind("ym"),
													S1_M1.rqmt_mons.subtract(value(1))
												),
												value(MAC_PERIOD_TYP.MONTHLY.value()),
												bind("ac_cl_day"),
												bind("ac_cl_mon_base")
											)
										)
									)
									.innerJoin(S1_M2).on(
										S1_T1.wg_cd.eq(S1_M2.wg_cd)
										.and(S1_M1.mps_grp_cd.eq(S1_M2.mps_grp_cd))
										.and(S1_T1.strg_loc_cd.eq(S1_M2.strg_loc_cd))
										.and(S1_T1.mfg_loc_cd.eq(S1_M2.mfg_loc_cd))
										.and(S1_T1.sppl_cd.eq(S1_M2.sppl_cd))
										.and(S1_T1.rqst_loc_cd.eq(S1_M2.rqst_loc_cd))
										.and(S1_T1.itm_cd.eq(S1_M2.itm_cd))
										.and(S1_T1.itm_sub1.eq(S1_M2.itm_sub1))
										.and(S1_T1.itm_sub2.eq(S1_M2.itm_sub2))
										.and(S1_T1.itm_sub3.eq(S1_M2.itm_sub3))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_T1.fix_flg.eq(value(false)))
									.cutoff$and(S1_T1.wg_cd.eq(bind("wg_cd")))
									.and(S1_T1.rqmt_no.eq(S0_T.rqmt_no))
									.cutoff$and(S1_M2.mps_grp_cd.eq(bind("mps_grp_cd")))
									.and(
										S1_T1.due_dt.gte(MAPA_DT$F_GET_YM_ST_DT_NE1(
												bind("ym"),
												value(MAC_PERIOD_TYP.MONTHLY.value()),
												bind("ac_cl_day"),
												bind("ac_cl_mon_base")
											)
										)
									)
								)
							)
						)
					)
					.orderBy(S0_T.itm_ord_no.asc())
					.forUpdate(S0_T.itm_ord_no)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_MLY_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL5080_MST_MLY_RQMT_S01() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MAM_MPS_GRP_R S0_T3 = MAM_MPS_GRP_R.create("T3");
		MAM_MPS_ITM_R S0_T4 = MAM_MPS_ITM_R.create("T4");
		MCTempView S0_T5 = createTempView("T5");
		MAM_LOC_R S0_T6 = MAM_LOC_R.create("T6");
		MAVM_ITM_WG_R S0_T7 = MAVM_ITM_WG_R.create("T7");
		MAM_LOC_R S0_T8 = MAM_LOC_R.create("T8");
		MCTempView S0_T9 = createTempView("T9");
		MST_MLY_RQMT_R S1_T = MST_MLY_RQMT_R.create("T");
		MAM_MPS_GRP_R S1_M = MAM_MPS_GRP_R.create("M");
		MST_MLY_RQMT_R S2_T = MST_MLY_RQMT_R.create("T");
		MAM_ITM_R S2_M = MAM_ITM_R.create("M");
		MAM_CO_R S3 = MAM_CO_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_MLY_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.pr("pln_ym"),
						S0_T1.prod_ym,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						nvl(
							S0_T6.cal_cd,
							S0_T9.pr(S3.std_cal_cd)
						).as("strg_loc_cal_cd"),
						S0_T1.mps_grp_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.qty,
						S0_T5.pr("dec_place"),
						cases()
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(1))
							)
								.then(
									trunc(
										S0_T3.mon01_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(2))
							)
								.then(
									trunc(
										S0_T3.mon02_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(3))
							)
								.then(
									trunc(
										S0_T3.mon03_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(4))
							)
								.then(
									trunc(
										S0_T3.mon04_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(5))
							)
								.then(
									trunc(
										S0_T3.mon05_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(6))
							)
								.then(
									trunc(
										S0_T3.mon06_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(7))
							)
								.then(
									trunc(
										S0_T3.mon07_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(8))
							)
								.then(
									trunc(
										S0_T3.mon08_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(9))
							)
								.then(
									trunc(
										S0_T3.mon09_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(10))
							)
								.then(
									trunc(
										S0_T3.mon10_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(11))
							)
								.then(
									trunc(
										S0_T3.mon11_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.when(
								extract(
									MCDateTimeFld.MONTH,
									S0_T1.prod_ym
								).eq(value(12))
							)
								.then(
									trunc(
										S0_T3.mon12_prod_qty,
										S0_T5.pr("dec_place")
									)
							)
							.otherwise(nullValue()).as("prod_qty_by_day"),
						nullValue().as("mon01_prod_qty"),
						nullValue().as("mon02_prod_qty"),
						nullValue().as("mon03_prod_qty"),
						nullValue().as("mon04_prod_qty"),
						nullValue().as("mon05_prod_qty"),
						nullValue().as("mon06_prod_qty"),
						nullValue().as("mon07_prod_qty"),
						nullValue().as("mon08_prod_qty"),
						nullValue().as("mon09_prod_qty"),
						nullValue().as("mon10_prod_qty"),
						nullValue().as("mon11_prod_qty"),
						nullValue().as("mon12_prod_qty"),
						S0_T4.prod_rate,
						nullValue().as("prio"),
						S0_T4.prod_begin_day,
						bind("ym").as("ym"),
						S0_T3.date_div_mons,
						S0_T3.week_div_mons,
						S0_T3.period_div_mons,
						S0_T3.rqmt_mons,
						S0_T3.prcd_mons,
						S0_T7.rqmt_typ,
						S0_T7.prod_pln_typ,
						S0_T8.sppl_cd.as("mfg_loc_sppl_cd"),
						S0_T3.date_div_typ
					)
					.from(
						S0_T1
						.innerJoin(
							subQuery()
							.select(
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								max(S1_T.ym).as("pln_ym")
							)
							.from(
								S1_T
								.innerJoin(S1_M).on(
									S1_T.prod_ym.lt(addMonths(
											addMonths(
												bind("ym"),
												S1_M.rqmt_mons
											),
											S1_M.prcd_mons
										)
									)
									.and(S1_T.mps_grp_cd.eq(S1_M.mps_grp_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T.prod_ym.gte(bind("ym")))
								.cutoff$and(S1_T.wg_cd.eq(bind("wg_cd")))
								.cutoff$and(S1_T.mps_grp_cd.eq(bind("mps_grp_cd")))
							)
							.groupBy(
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3
							).view(S0_T2)
						).on(
							S0_T1.prod_ym.eq(S0_T2.pr(S1_T.prod_ym))
							.and(S0_T1.mps_grp_cd.eq(S0_T2.pr(S1_T.mps_grp_cd)))
							.and(S0_T1.itm_cd.eq(S0_T2.pr(S1_T.itm_cd)))
							.and(S0_T1.itm_sub1.eq(S0_T2.pr(S1_T.itm_sub1)))
							.and(S0_T1.itm_sub2.eq(S0_T2.pr(S1_T.itm_sub2)))
							.and(S0_T1.itm_sub3.eq(S0_T2.pr(S1_T.itm_sub3)))
							.and(S0_T1.ym.eq(S0_T2.pr("pln_ym")))
						)
						.innerJoin(S0_T3).on(S0_T1.mps_grp_cd.eq(S0_T3.mps_grp_cd))
						.innerJoin(S0_T4).on(
							S0_T1.itm_cd.eq(S0_T4.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_T4.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T4.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T4.itm_sub3))
							.and(S0_T1.mps_grp_cd.eq(S0_T4.mps_grp_cd))
							.and(S0_T1.wg_cd.eq(S0_T4.wg_cd))
						)
						.innerJoin(
							subQuery()
							.select(
								S2_T.mps_grp_cd,
								min(S2_M.dec_place).as("dec_place")
							)
							.from(
								S2_T
								.innerJoin(S2_M).on(
									S2_T.itm_cd.eq(S2_M.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_M.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_M.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_M.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
							)
							.groupBy(S2_T.mps_grp_cd).view(S0_T5)
						).on(S0_T1.mps_grp_cd.eq(S0_T5.pr(S2_T.mps_grp_cd)))
						.innerJoin(S0_T6).on(S0_T1.strg_loc_cd.eq(S0_T6.loc_cd))
						.innerJoin(S0_T7).on(
							S0_T1.wg_cd.eq(S0_T7.wg_cd)
							.and(S0_T1.itm_cd.eq(S0_T7.itm_cd))
							.and(S0_T1.itm_sub1.eq(S0_T7.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T7.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T7.itm_sub3))
						)
						.leftOuterJoin(S0_T8).on(S0_T1.mfg_loc_cd.eq(S0_T8.loc_cd))
						.crossJoin(
							subQuery()
							.select(S3.std_cal_cd)
							.from(S3).view(S0_T9)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T3.date_div_typ.eq(value(MAC_DATE_DIV_TYP.PLN.value())))
					)
					.orderBy(
						S0_T2.pr("pln_ym").asc(),
						S0_T1.prod_ym.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.mps_grp_cd.asc()
					)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_MLY_RQMT_Query_S02
	 */
	static MCQueryPlan MSBCL5080_MST_MLY_RQMT_S02() {
		MAM_MPS_GRP_R S0_T1 = MAM_MPS_GRP_R.create("T1");
		MAM_MPS_ITM_R S0_T2 = MAM_MPS_ITM_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAVM_ITM_WG_R S0_T5 = MAVM_ITM_WG_R.create("T5");
		MAM_LOC_R S0_T6 = MAM_LOC_R.create("T6");
		MCTempView S0_T7 = createTempView("T7");
		MAM_MPS_ITM_R S1_T = MAM_MPS_ITM_R.create("T");
		MAM_ITM_R S1_M = MAM_ITM_R.create("M");
		MAM_CO_R S2 = MAM_CO_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_MLY_RQMT_Query_S02")
					.mainQuery()
					.select(
						bind("ym").as("pln_ym"),
						nullValue().as("prod_ym"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.strg_loc_cd,
						S0_T2.wg_cd,
						nvl(
							S0_T4.cal_cd,
							S0_T7.pr(S2.std_cal_cd)
						).as("strg_loc_cal_cd"),
						S0_T2.mps_grp_cd,
						S0_T2.mfg_loc_cd,
						S0_T2.sppl_cd,
						S0_T2.rqst_loc_cd,
						nullValue().as("qty"),
						S0_T3.pr("dec_place"),
						nullValue().as("prod_qty_by_day"),
						S0_T1.mon01_prod_qty,
						S0_T1.mon02_prod_qty,
						S0_T1.mon03_prod_qty,
						S0_T1.mon04_prod_qty,
						S0_T1.mon05_prod_qty,
						S0_T1.mon06_prod_qty,
						S0_T1.mon07_prod_qty,
						S0_T1.mon08_prod_qty,
						S0_T1.mon09_prod_qty,
						S0_T1.mon10_prod_qty,
						S0_T1.mon11_prod_qty,
						S0_T1.mon12_prod_qty,
						S0_T2.prod_rate,
						nullValue().as("prio"),
						S0_T2.prod_begin_day,
						bind("ym").as("ym"),
						S0_T1.date_div_mons,
						S0_T1.week_div_mons,
						S0_T1.period_div_mons,
						S0_T1.rqmt_mons,
						S0_T1.prcd_mons,
						S0_T5.rqmt_typ,
						S0_T5.prod_pln_typ,
						S0_T6.sppl_cd.as("mfg_loc_sppl_cd"),
						S0_T1.date_div_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.mps_grp_cd.eq(S0_T2.mps_grp_cd))
						.innerJoin(
							subQuery()
							.select(
								S1_T.mps_grp_cd,
								min(S1_M.dec_place).as("dec_place")
							)
							.from(
								S1_T
								.innerJoin(S1_M).on(
									S1_T.itm_cd.eq(S1_M.itm_cd)
									.and(S1_T.itm_sub1.eq(S1_M.itm_sub1))
									.and(S1_T.itm_sub2.eq(S1_M.itm_sub2))
									.and(S1_T.itm_sub3.eq(S1_M.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
							)
							.groupBy(S1_T.mps_grp_cd).view(S0_T3)
						).on(S0_T1.mps_grp_cd.eq(S0_T3.pr(S1_T.mps_grp_cd)))
						.innerJoin(S0_T4).on(S0_T2.strg_loc_cd.eq(S0_T4.loc_cd))
						.innerJoin(S0_T5).on(
							S0_T2.wg_cd.eq(S0_T5.wg_cd)
							.and(S0_T2.itm_cd.eq(S0_T5.itm_cd))
							.and(S0_T2.itm_sub1.eq(S0_T5.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_T5.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_T5.itm_sub3))
						)
						.leftOuterJoin(S0_T6).on(S0_T2.mfg_loc_cd.eq(S0_T6.loc_cd))
						.crossJoin(
							subQuery()
							.select(S2.std_cal_cd)
							.from(S2).view(S0_T7)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.date_div_typ.eq(value(MAC_DATE_DIV_TYP.PROD_QTY.value())))
						.cutoff$and(S0_T2.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_T2.mps_grp_cd.eq(bind("mps_grp_cd")))
					)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_MLY_RQMT_Query_S03
	 */
	static MCQueryPlan MSBCL5080_MST_MLY_RQMT_S03() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MAM_MPS_GRP_R S0_T3 = MAM_MPS_GRP_R.create("T3");
		MAM_MPS_ITM_R S0_T4 = MAM_MPS_ITM_R.create("T4");
		MCTempView S0_T5 = createTempView("T5");
		MAM_LOC_R S0_T6 = MAM_LOC_R.create("T6");
		MAVM_ITM_WG_R S0_T7 = MAVM_ITM_WG_R.create("T7");
		MAM_LOC_R S0_T8 = MAM_LOC_R.create("T8");
		MCTempView S0_T9 = createTempView("T9");
		MST_MLY_RQMT_R S1_T = MST_MLY_RQMT_R.create("T");
		MAM_MPS_GRP_R S1_M = MAM_MPS_GRP_R.create("M");
		MST_MLY_RQMT_R S2_T = MST_MLY_RQMT_R.create("T");
		MAM_ITM_R S2_M = MAM_ITM_R.create("M");
		MAM_CO_R S3 = MAM_CO_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_MLY_RQMT_Query_S03")
					.mainQuery()
					.select(
						S0_T2.pr("pln_ym"),
						S0_T1.prod_ym,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						nvl(
							S0_T6.cal_cd,
							S0_T9.pr(S3.std_cal_cd)
						).as("strg_loc_cal_cd"),
						S0_T1.mps_grp_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.qty,
						S0_T5.pr("dec_place"),
						nullValue().as("prod_qty_by_day"),
						S0_T3.mon01_prod_qty,
						S0_T3.mon02_prod_qty,
						S0_T3.mon03_prod_qty,
						S0_T3.mon04_prod_qty,
						S0_T3.mon05_prod_qty,
						S0_T3.mon06_prod_qty,
						S0_T3.mon07_prod_qty,
						S0_T3.mon08_prod_qty,
						S0_T3.mon09_prod_qty,
						S0_T3.mon10_prod_qty,
						S0_T3.mon11_prod_qty,
						S0_T3.mon12_prod_qty,
						S0_T4.prod_rate,
						nullValue().as("prio"),
						S0_T4.prod_begin_day,
						bind("ym").as("ym"),
						S0_T3.date_div_mons,
						S0_T3.week_div_mons,
						S0_T3.period_div_mons,
						S0_T3.rqmt_mons,
						S0_T3.prcd_mons,
						S0_T7.rqmt_typ,
						S0_T7.prod_pln_typ,
						S0_T8.sppl_cd.as("mfg_loc_sppl_cd"),
						S0_T3.date_div_typ
					)
					.from(
						S0_T1
						.innerJoin(
							subQuery()
							.select(
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								max(S1_T.ym).as("pln_ym")
							)
							.from(
								S1_T
								.innerJoin(S1_M).on(
									S1_T.prod_ym.lt(addMonths(
											addMonths(
												bind("ym"),
												S1_M.rqmt_mons
											),
											S1_M.prcd_mons
										)
									)
									.and(S1_T.mps_grp_cd.eq(S1_M.mps_grp_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T.prod_ym.gte(bind("ym")))
								.cutoff$and(S1_T.mps_grp_cd.eq(bind("mps_grp_cd")))
								.cutoff$and(S1_T.wg_cd.eq(bind("wg_cd")))
							)
							.groupBy(
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3
							).view(S0_T2)
						).on(
							S0_T1.prod_ym.eq(S0_T2.pr(S1_T.prod_ym))
							.and(S0_T1.mps_grp_cd.eq(S0_T2.pr(S1_T.mps_grp_cd)))
							.and(S0_T1.itm_cd.eq(S0_T2.pr(S1_T.itm_cd)))
							.and(S0_T1.itm_sub1.eq(S0_T2.pr(S1_T.itm_sub1)))
							.and(S0_T1.itm_sub2.eq(S0_T2.pr(S1_T.itm_sub2)))
							.and(S0_T1.itm_sub3.eq(S0_T2.pr(S1_T.itm_sub3)))
							.and(S0_T1.ym.eq(S0_T2.pr("pln_ym")))
						)
						.innerJoin(S0_T3).on(S0_T1.mps_grp_cd.eq(S0_T3.mps_grp_cd))
						.innerJoin(S0_T4).on(
							S0_T1.itm_cd.eq(S0_T4.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_T4.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T4.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T4.itm_sub3))
							.and(S0_T1.mps_grp_cd.eq(S0_T4.mps_grp_cd))
							.and(S0_T1.wg_cd.eq(S0_T4.wg_cd))
						)
						.innerJoin(
							subQuery()
							.select(
								S2_T.mps_grp_cd,
								min(S2_M.dec_place).as("dec_place")
							)
							.from(
								S2_T
								.innerJoin(S2_M).on(
									S2_T.itm_cd.eq(S2_M.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_M.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_M.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_M.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
							)
							.groupBy(S2_T.mps_grp_cd).view(S0_T5)
						).on(S0_T1.mps_grp_cd.eq(S0_T5.pr(S2_T.mps_grp_cd)))
						.innerJoin(S0_T6).on(S0_T1.strg_loc_cd.eq(S0_T6.loc_cd))
						.innerJoin(S0_T7).on(
							S0_T1.wg_cd.eq(S0_T7.wg_cd)
							.and(S0_T1.itm_cd.eq(S0_T7.itm_cd))
							.and(S0_T1.itm_sub1.eq(S0_T7.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T7.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T7.itm_sub3))
						)
						.leftOuterJoin(S0_T8).on(S0_T1.mfg_loc_cd.eq(S0_T8.loc_cd))
						.crossJoin(
							subQuery()
							.select(S3.std_cal_cd)
							.from(S3).view(S0_T9)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T3.date_div_typ.eq(value(MAC_DATE_DIV_TYP.WK_DAY.value())))
					)
					.orderBy(
						S0_T2.pr("pln_ym").asc(),
						S0_T1.prod_ym.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.mps_grp_cd.asc()
					)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_PRCD_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL5080_MST_PRCD_RQMT_S01() {
		MST_PRCD_RQMT_R S0_T1 = MST_PRCD_RQMT_R.create("T1");
		MAM_MPS_GRP_R S0_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_MPS_ITM_R S0_M2 = MAM_MPS_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_PRCD_RQMT_Query_S01")
					.mainQuery()
					.select(S0_T1.rqmt_no)
					.from(
						S0_T1
						.crossJoin(S0_M1)
						.innerJoin(S0_M2).on(
							S0_T1.wg_cd.eq(S0_M2.wg_cd)
							.and(S0_M1.mps_grp_cd.eq(S0_M2.mps_grp_cd))
							.and(S0_T1.strg_loc_cd.eq(S0_M2.strg_loc_cd))
							.and(S0_T1.mfg_loc_cd.eq(S0_M2.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M2.sppl_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M2.rqst_loc_cd))
							.and(S0_T1.itm_cd.eq(S0_M2.itm_cd))
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M2.mps_grp_cd.eq(bind("mps_grp_cd")))
						.cutoff$and(S0_T1.wg_cd.eq(bind("wg_cd")))
					)
					.orderBy(S0_T1.rqmt_no.asc())
					.forUpdate(S0_T1.rqmt_no)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_RQMT_Query_D01
	 */
	static MCQueryPlan MSBCL5080_MST_RQMT_D01() {
		MST_RQMT_R S0_T = MST_RQMT_R.create("T");
		MST_RQMT_R S1_T1 = MST_RQMT_R.create("T1");
		MAM_MPS_GRP_R S1_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_MPS_ITM_R S1_M2 = MAM_MPS_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_RQMT_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_T1
									.innerJoin(S1_M1).on(
										S1_T1.due_dt.lte(MAPA_DT$F_GET_YM_END_DT_NE1(
												addMonths(
													bind("ym"),
													S1_M1.rqmt_mons.subtract(value(1))
												),
												value(MAC_PERIOD_TYP.MONTHLY.value()),
												bind("ac_cl_day"),
												bind("ac_cl_mon_base")
											)
										)
									)
									.innerJoin(S1_M2).on(
										S1_T1.wg_cd.eq(S1_M2.wg_cd)
										.and(S1_M1.mps_grp_cd.eq(S1_M2.mps_grp_cd))
										.and(S1_T1.strg_loc_cd.eq(S1_M2.strg_loc_cd))
										.and(S1_T1.mfg_loc_cd.eq(S1_M2.mfg_loc_cd))
										.and(S1_T1.sppl_cd.eq(S1_M2.sppl_cd))
										.and(S1_T1.rqst_loc_cd.eq(S1_M2.rqst_loc_cd))
										.and(S1_T1.itm_cd.eq(S1_M2.itm_cd))
										.and(S1_T1.itm_sub1.eq(S1_M2.itm_sub1))
										.and(S1_T1.itm_sub2.eq(S1_M2.itm_sub2))
										.and(S1_T1.itm_sub3.eq(S1_M2.itm_sub3))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_T1.rqmt_no.eq(S0_T.rqmt_no))
									.cutoff$and(S1_M2.mps_grp_cd.eq(bind("mps_grp_cd")))
									.and(
										S1_T1.due_dt.gte(MAPA_DT$F_GET_YM_ST_DT_NE1(
												bind("ym"),
												value(MAC_PERIOD_TYP.MONTHLY.value()),
												bind("ac_cl_day"),
												bind("ac_cl_mon_base")
											)
										)
									)
								)
							)
						)
						.and(S0_T.fix_flg.eq(value(false)))
						.cutoff$and(S0_T.wg_cd.eq(bind("wg_cd")))
						.and(
							S0_T.due_dt.gte(MAPA_DT$F_GET_YM_ST_DT_NE1(
									bind("ym"),
									value(MAC_PERIOD_TYP.MONTHLY.value()),
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL5080_MST_RQMT_S01() {
		MST_RQMT_R S0_T = MST_RQMT_R.create("T");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_MPS_ITM_R S0_M2 = MAM_MPS_ITM_R.create("M2");
		MAM_MPS_GRP_R S0_M3 = MAM_MPS_GRP_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_M2.mps_grp_cd,
						S0_T.due_dt,
						sum(S0_T.rqmt_qty).as("rqmt_qty")
					)
					.from(
						S0_T
						.innerJoin(S0_M1).on(S0_T.strg_loc_cd.eq(S0_M1.loc_cd))
						.innerJoin(S0_M2).on(
							S0_T.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_M2.itm_sub3))
							.and(S0_T.strg_loc_cd.eq(S0_M2.strg_loc_cd))
						)
						.innerJoin(S0_M3).on(S0_M2.mps_grp_cd.eq(S0_M3.mps_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.fix_flg.eq(value(true)))
						.and(
							S0_T.due_dt.gte(MAPA_DT$F_GET_YM_ST_DT_NE1(
									bind("ym"),
									value(MAC_PERIOD_TYP.MONTHLY.value()),
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								)
							)
						)
						.and(
							S0_T.due_dt.lte(MAPA_DT$F_GET_YM_END_DT_NE1(
									addMonths(
										bind("ym"),
										S0_M3.rqmt_mons.subtract(value(1))
									),
									value(MAC_PERIOD_TYP.MONTHLY.value()),
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								)
							)
						)
						.cutoff$and(S0_M1.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M2.mps_grp_cd.eq(bind("mps_grp_cd")))
					)
					.groupBy(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_M2.mps_grp_cd,
						S0_T.due_dt
					)
			);
	}
	
	/**
	 * -- MSBCL5080_MST_RQMT_Query_S03
	 */
	static MCQueryPlan MSBCL5080_MST_RQMT_S03() {
		MST_RQMT_R S0_T1 = MST_RQMT_R.create("T1");
		MAM_MPS_GRP_R S0_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_MPS_ITM_R S0_M2 = MAM_MPS_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5080_MST_RQMT_Query_S03")
					.mainQuery()
					.select(S0_T1.rqmt_no)
					.from(
						S0_T1
						.innerJoin(S0_M1).on(
							S0_T1.due_dt.lte(MAPA_DT$F_GET_YM_END_DT_NE1(
									addMonths(
										bind("ym"),
										S0_M1.rqmt_mons.subtract(value(1))
									),
									value(MAC_PERIOD_TYP.MONTHLY.value()),
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								)
							)
						)
						.innerJoin(S0_M2).on(
							S0_T1.wg_cd.eq(S0_M2.wg_cd)
							.and(S0_M1.mps_grp_cd.eq(S0_M2.mps_grp_cd))
							.and(S0_T1.strg_loc_cd.eq(S0_M2.strg_loc_cd))
							.and(S0_T1.mfg_loc_cd.eq(S0_M2.mfg_loc_cd))
							.and(S0_T1.sppl_cd.eq(S0_M2.sppl_cd))
							.and(S0_T1.rqst_loc_cd.eq(S0_M2.rqst_loc_cd))
							.and(S0_T1.itm_cd.eq(S0_M2.itm_cd))
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M2.mps_grp_cd.eq(bind("mps_grp_cd")))
						.and(
							S0_T1.due_dt.gte(MAPA_DT$F_GET_YM_ST_DT_NE1(
									bind("ym"),
									value(MAC_PERIOD_TYP.MONTHLY.value()),
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								)
							)
						)
						.and(S0_T1.fix_flg.eq(value(false)))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
					)
					.orderBy(S0_T1.rqmt_no.asc())
					.forUpdate(S0_T1.rqmt_no)
			);
	}
}