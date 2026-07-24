package mcframe.serverMSBD.MSBDB0010;

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
	 * -- MSBDB0010_MAM_BP_ITM_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MAM_BP_ITM_S01() {
		MAM_BP_ITM_R S0_M1 = MAM_BP_ITM_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MAM_BP_ITM_Query_S01")
					.mainQuery()
					.selectDistinct(S0_M1.bp_cd.as("sppl_cd"))
					.from(
						S0_M1
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_M1.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.bp_cd.eq(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0_M1.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0_M1.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0_M1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_M1.st_dt.lte(bind("pf_dt")))
						.and(S0_M1.end_dt.gte(bind("pf_dt")))
						.and(S0_M1.pf_grp_cd.isNotNull())
						.and(S0_M2.sppl_flg.eq(value(true)))
					)
					.orderBy(pr("sppl_cd").asc())
			);
	}
	
	/**
	 * -- MSBDB0010_MAM_BP_ITM_Query_S02
	 */
	static MCQueryPlan MSBDB0010_MAM_BP_ITM_S02() {
		MAM_BP_ITM_R S0_M1 = MAM_BP_ITM_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MAM_BP_ITM_Query_S02")
					.mainQuery()
					.select(
						S0_M1.bp_cd,
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.st_dt,
						S0_M1.end_dt,
						S0_M1.pf_grp_cd,
						S0_M1.pf_fix_flg
					)
					.from(
						S0_M1
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.bp_cd.eq(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0_M1.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0_M1.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0_M1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_M1.st_dt.lte(bind("pf_dt")))
						.and(S0_M1.end_dt.gte(bind("pf_dt")))
						.and(S0_M1.pf_grp_cd.isNotNull())
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MST_ITM_ORDER_S01() {
		MCTempView S0_V = createTempView("V");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_BP_STOP_R S1_M3 = MAM_BP_STOP_R.create("M3");
		MAM_ITM_STOP_R S1_M4 = MAM_ITM_STOP_R.create("M4");
		MAW_BP_ITM_KEY_R S1_WK = MAW_BP_ITM_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_V.pr("wg_cd"),
						S0_V.pr("sppl_cd"),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr("base_unit_cd"),
						sum(S0_V.pr("base_unit_qty")).as("base_unit_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.rqst_wg_cd.as("wg_cd"),
							bracket(
								cases()
									.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
										.then(S1_T1.sppl_cd)
									.otherwise(S1_M2.sppl_cd)
							).as("sppl_cd"),
							S1_T1.po_schd_dt,
							S1_T1.strg_schd_dt.as("avl_schd_dt"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.inst_qty.as("base_unit_qty"),
							S1_M1.unit_cd.as("base_unit_cd"),
							least(
								coalesce(
									S1_M3.po_stop_dt,
									S1_M4.po_stop_dt
								),
								coalesce(
									S1_M4.po_stop_dt,
									S1_M3.po_stop_dt
								)
							).as("po_stop_dt")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.loc_cd.eq(S1_T1.mfg_loc_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.bp_cd.eq(cases()
											.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
												.then(S1_T1.sppl_cd)
											.otherwise(S1_M2.sppl_cd)
									)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M4.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M4.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M4.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.bp_cd.eq(cases()
											.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
												.then(S1_T1.sppl_cd)
											.otherwise(S1_M2.sppl_cd)
									)
									.and(S1_WK.itm_cd.eq(S1_T1.itm_cd))
									.and(S1_WK.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_WK.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_WK.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.itm_ord_typ.in(
									value(MSC_ITM_ORD_TYP.PURC.value()),
									value(MSC_ITM_ORD_TYP.OUTSRC.value())
								)
							)
							.and(
								S1_T1.itm_ord_sts_typ.in(
									bind("itm_ord_sts_typ_opn"),
									bind("itm_ord_sts_typ_sav")
								)
							)
							.and(S1_T1.rqst_wg_cd.eq(bind("wg_cd")))
							.and(S1_T1.strg_schd_dt.gte(bind("pf_st_dt")))
							.and(S1_T1.strg_schd_dt.lte(bind("pf_end_dt")))
						).view(S0_V)
					)
					.where(
						S0_V.pr("po_stop_dt").isNull()
						.or(S0_V.pr(S1_T1.po_schd_dt).lt(S0_V.pr("po_stop_dt")))
					)
					.groupBy(
						S0_V.pr("wg_cd"),
						S0_V.pr("sppl_cd"),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr("base_unit_cd")
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MST_PO_SCHD_S01() {
		MCTempView S0_V = createTempView("V");
		MAM_BP_STOP_R S0_M1 = MAM_BP_STOP_R.create("M1");
		MAM_ITM_STOP_R S0_M2 = MAM_ITM_STOP_R.create("M2");
		MST_WG_RQST_R S1_T1 = MST_WG_RQST_R.create("T1");
		MAW_BP_ITM_KEY_R S1_WK = MAW_BP_ITM_KEY_R.create("WK");
		MST_PO_SCHD_R S2_T1 = MST_PO_SCHD_R.create("T1");
		MAW_BP_ITM_KEY_R S2_WK = MAW_BP_ITM_KEY_R.create("WK");
		MAM_BP_STOP_R S2_M1 = MAM_BP_STOP_R.create("M1");
		MAM_ITM_STOP_R S2_M2 = MAM_ITM_STOP_R.create("M2");
		MST_PO_D_R S3_T1 = MST_PO_D_R.create("T1");
		MST_PO_R S3_T2 = MST_PO_R.create("T2");
		MAW_BP_ITM_KEY_R S3_WK = MAW_BP_ITM_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V.pr("wg_cd"),
						S0_V.pr(S1_T1.sppl_cd),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr(S1_T1.base_unit_cd),
						sum(S0_V.pr("base_unit_qty")).as("base_unit_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.rqst_to_wg_cd.as("wg_cd"),
							S1_T1.sppl_cd,
							trunc(
								S1_T1.gr_rqst_tm,
								MCDateFmt.DD
							).as("avl_schd_dt"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.base_unit_cd,
							S1_T1.not_cmpl_qty.as("base_unit_qty"),
							nullValue().as("po_schd_dt")
						)
						.from(
							S1_T1
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.bp_cd.eq(S1_T1.sppl_cd)
									.and(S1_WK.itm_cd.eq(S1_T1.itm_cd))
									.and(S1_WK.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_WK.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_WK.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.PURC.value())))
							.and(
								S1_T1.wg_rqst_sts_typ.in(
									value(MSC_WG_RQST_STS_TYP.RQST.value()),
									value(MSC_WG_RQST_STS_TYP.PRMS.value()),
									value(MSC_WG_RQST_STS_TYP.PART_INST.value())
								)
							)
							.and(S1_T1.gr_rqst_tm.gte(bind("pf_st_dt")))
							.and(S1_T1.gr_rqst_tm.lte(bind("pf_end_dt")))
							.and(S1_T1.rqst_to_wg_cd.eq(bind("wg_cd")))
							.and(S1_T1.can_flg.eq(value(false)))
						)
						.unionAll(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T1.sppl_cd,
								trunc(
									S2_T1.dlv_rqst_tm,
									MCDateFmt.DD
								).as("avl_schd_dt"),
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.base_unit_cd,
								S2_T1.base_unit_qty,
								S2_T1.po_schd_dt
							)
							.from(
								S2_T1
								.innerJoin(S2_WK).on(
									bracket(
										S2_WK.bp_cd.eq(S2_T1.sppl_cd)
										.and(S2_WK.itm_cd.eq(S2_T1.itm_cd))
										.and(S2_WK.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_WK.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_WK.itm_sub3.eq(S2_T1.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M1).on(
									bracket(
										S2_M1.bp_cd.eq(S2_T1.sppl_cd)
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_M2.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_M2.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_M2.itm_sub3.eq(S2_T1.itm_sub3))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.dlv_rqst_tm.gte(bind("pf_st_dt")))
								.and(S2_T1.dlv_rqst_tm.lte(bind("pf_end_dt")))
								.and(S2_T1.wg_cd.eq(bind("wg_cd")))
								.and(S2_T1.po_flg.eq(value(false)))
								.and(S2_T1.can_flg.eq(value(false)))
								.and(S2_T1.abort_flg.eq(value(false)))
							)
							.unionAll(
								subQuery()
								.select(
									S3_T2.wg_cd,
									S3_T2.sppl_cd,
									trunc(
										S3_T1.dlv_rqst_tm,
										MCDateFmt.DD
									).as("avl_schd_dt"),
									S3_T1.itm_cd,
									S3_T1.itm_sub1,
									S3_T1.itm_sub2,
									S3_T1.itm_sub3,
									S3_T1.base_unit_cd,
									S3_T1.base_unit_qty,
									S3_T2.po_dt.as("po_schd_dt")
								)
								.from(
									S3_T1
									.innerJoin(S3_T2).on(
										bracket(
											S3_T2.po_no.eq(S3_T1.po_no)
										)
									)
									.innerJoin(S3_WK).on(
										bracket(
											S3_WK.bp_cd.eq(S3_T2.sppl_cd)
											.and(S3_WK.itm_cd.eq(S3_T1.itm_cd))
											.and(S3_WK.itm_sub1.eq(S3_T1.itm_sub1))
											.and(S3_WK.itm_sub2.eq(S3_T1.itm_sub2))
											.and(S3_WK.itm_sub3.eq(S3_T1.itm_sub3))
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_T1.dlv_rqst_tm.gte(bind("pf_st_dt")))
									.and(S3_T1.dlv_rqst_tm.lte(bind("pf_end_dt")))
									.and(S3_T1.can_flg.eq(value(false)))
									.and(S3_T2.aprv_flg.eq(value(true)))
									.and(S3_T2.aprv_sts_typ.neq(value(MAC_APRV_STS_TYP.ACPT.value())))
									.and(S3_T2.wg_cd.eq(bind("wg_cd")))
									.and(S3_T2.can_flg.eq(value(false)))
								)
							)
						).view(S0_V)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_V.pr(S1_T1.sppl_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_V.pr(S1_T1.itm_cd))
								.and(S0_M2.itm_sub1.eq(S0_V.pr(S1_T1.itm_sub1)))
								.and(S0_M2.itm_sub2.eq(S0_V.pr(S1_T1.itm_sub2)))
								.and(S0_M2.itm_sub3.eq(S0_V.pr(S1_T1.itm_sub3)))
							)
						)
					)
					.where(
						S0_V.pr("po_schd_dt").isNull()
						.or(
							S0_M1.po_stop_dt.isNull()
							.and(S0_M2.po_stop_dt.isNull())
						)
						.or(
							S0_V.pr("po_schd_dt").lt(least(
									nvl(
										S0_M1.po_stop_dt,
										S0_M2.po_stop_dt
									),
									nvl(
										S0_M2.po_stop_dt,
										S0_M1.po_stop_dt
									)
								)
							)
						)
					)
					.groupBy(
						S0_V.pr("wg_cd"),
						S0_V.pr(S1_T1.sppl_cd),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr(S1_T1.base_unit_cd)
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PRCD_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MST_PRCD_ITM_ORDER_S01() {
		MCTempView S0_V = createTempView("V");
		MST_PRCD_ITM_ORDER_R S1_T1 = MST_PRCD_ITM_ORDER_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_ITM_DTL_R S1_M3 = MAM_ITM_DTL_R.create("M3");
		MAM_BP_STOP_R S1_M4 = MAM_BP_STOP_R.create("M4");
		MAM_ITM_STOP_R S1_M5 = MAM_ITM_STOP_R.create("M5");
		MAW_BP_ITM_KEY_R S1_WK = MAW_BP_ITM_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PRCD_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_V.pr("wg_cd"),
						S0_V.pr("sppl_cd"),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr("base_unit_cd"),
						sum(S0_V.pr("base_unit_qty")).as("base_unit_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.rqst_wg_cd.as("wg_cd"),
							bracket(
								cases()
									.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
										.then(S1_T1.sppl_cd)
									.otherwise(S1_M2.sppl_cd)
							).as("sppl_cd"),
							S1_T1.po_schd_dt,
							S1_T1.strg_schd_dt.as("avl_schd_dt"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.inst_qty.as("base_unit_qty"),
							S1_M1.unit_cd.as("base_unit_cd"),
							least(
								coalesce(
									S1_M4.po_stop_dt,
									S1_M5.po_stop_dt
								),
								coalesce(
									S1_M5.po_stop_dt,
									S1_M4.po_stop_dt
								)
							).as("po_stop_dt")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.loc_cd.eq(S1_T1.mfg_loc_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M3.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M3.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M3.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_M3.mfg_loc_cd.eq(S1_T1.mfg_loc_cd))
									.and(S1_M3.sppl_cd.eq(S1_T1.sppl_cd))
									.and(S1_M3.maker_cd.eq(S1_T1.maker_cd))
									.and(S1_M3.rqst_loc_cd.eq(S1_T1.rqst_loc_cd))
									.and(S1_M3.wg_cd.eq(S1_T1.wg_cd))
									.and(S1_M3.bom_ptn.eq(S1_T1.bom_ptn))
									.and(S1_T1.master_dt.between(S1_M3.st_dt, S1_M3.end_dt))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.bp_cd.eq(cases()
											.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
												.then(S1_T1.sppl_cd)
											.otherwise(S1_M2.sppl_cd)
									)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M5.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M5.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M5.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.bp_cd.eq(cases()
											.when(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.PURC.value())))
												.then(S1_T1.sppl_cd)
											.otherwise(S1_M2.sppl_cd)
									)
									.and(S1_WK.itm_cd.eq(S1_T1.itm_cd))
									.and(S1_WK.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_WK.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_WK.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.itm_ord_typ.in(
									value(MSC_ITM_ORD_TYP.PURC.value()),
									value(MSC_ITM_ORD_TYP.OUTSRC.value())
								)
							)
							.and(S1_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value())))
							.and(S1_T1.rqst_wg_cd.eq(bind("wg_cd")))
							.and(S1_T1.strg_schd_dt.gte(bind("pf_st_dt")))
							.and(S1_T1.strg_schd_dt.lte(bind("pf_end_dt")))
							.and(S1_M3.pre_po_tgt_flg.eq(value(true)))
						).view(S0_V)
					)
					.where(
						S0_V.pr("po_stop_dt").isNull()
						.or(S0_V.pr(S1_T1.po_schd_dt).lt(S0_V.pr("po_stop_dt")))
					)
					.groupBy(
						S0_V.pr("wg_cd"),
						S0_V.pr("sppl_cd"),
						S0_V.pr("avl_schd_dt"),
						S0_V.pr(S1_T1.itm_cd),
						S0_V.pr(S1_T1.itm_sub1),
						S0_V.pr(S1_T1.itm_sub2),
						S0_V.pr(S1_T1.itm_sub3),
						S0_V.pr("base_unit_cd")
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_D_Query_D01
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_D_D01() {
		MST_PURC_FRCST_D_R S0_FRCSTD = MST_PURC_FRCST_D_R.create("FRCSTD");
		MST_PURC_FRCST_FIX_R S1_FIX = MST_PURC_FRCST_FIX_R.create("FIX");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_D_Query_D01")
					.delete(S0_FRCSTD)
					.where(
						notExists(
							subQuery()
							.select(value("X"))
							.from(S1_FIX)
							.where(
								S0_FRCSTD.purc_frcst_fix_no.eq(S1_FIX.purc_frcst_fix_no)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_D_Query_D02
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_D_D02() {
		MST_PURC_FRCST_D_R S0 = MST_PURC_FRCST_D_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_D_Query_D02")
					.delete(S0)
					.where(
						S0.purc_frcst_no.eq(bind("purc_frcst_no"))
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_D_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_D_S01() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MCTempView S0_V1 = createTempView("V1");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_FIX_R S1_TF = MST_PURC_FRCST_FIX_R.create("TF");
		MST_PURC_FRCST_D_R S1_TD = MST_PURC_FRCST_D_R.create("TD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.trd_unit_pf_qty,
						S0_T3.base_unit_pf_qty,
						S0_T3.trd_unit_schd_qty,
						S0_T3.base_unit_schd_qty,
						S0_T3.trd_unit_prms_qty,
						S0_T3.base_unit_prms_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								max(S1_TH.pf_dt).as("pf_dt"),
								S1_TH.wg_cd,
								S1_TH.sppl_cd,
								S1_TF.itm_cd,
								S1_TF.itm_sub1,
								S1_TF.itm_sub2,
								S1_TF.itm_sub3,
								S1_TD.pf_period_typ,
								S1_TD.pf_period_st_dt
							)
							.from(
								S1_TH
								.innerJoin(S1_TF).on(
									bracket(
										S1_TF.purc_frcst_no.eq(S1_TH.purc_frcst_no)
									)
								)
								.innerJoin(S1_TD).on(
									bracket(
										S1_TD.purc_frcst_fix_no.eq(S1_TF.purc_frcst_fix_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_TH.pf_dt.lt(bind("pf_dt")))
								.and(S1_TH.wg_cd.eq(bind("wg_cd")))
								.and(S1_TH.sppl_cd.eq(bind("sppl_cd")))
								.and(S1_TH.del_flg.eq(value(false)))
								.cutoff$and(S1_TF.itm_cd.eq(bind("itm_cd")))
								.cutoff$and(S1_TF.itm_sub1.eq(bind("itm_sub1")))
								.cutoff$and(S1_TF.itm_sub2.eq(bind("itm_sub2")))
								.cutoff$and(S1_TF.itm_sub3.eq(bind("itm_sub3")))
							)
							.groupBy(
								S1_TH.wg_cd,
								S1_TH.sppl_cd,
								S1_TF.itm_cd,
								S1_TF.itm_sub1,
								S1_TF.itm_sub2,
								S1_TF.itm_sub3,
								S1_TD.pf_period_typ,
								S1_TD.pf_period_st_dt
							).view(S0_V1)
						).on(
							bracket(
								S0_V1.pr("pf_dt").eq(S0_T1.pf_dt)
								.and(S0_V1.pr(S1_TH.wg_cd).eq(S0_T1.wg_cd))
								.and(S0_V1.pr(S1_TH.sppl_cd).eq(S0_T1.sppl_cd))
								.and(S0_V1.pr(S1_TF.itm_cd).eq(S0_T2.itm_cd))
								.and(S0_V1.pr(S1_TF.itm_sub1).eq(S0_T2.itm_sub1))
								.and(S0_V1.pr(S1_TF.itm_sub2).eq(S0_T2.itm_sub2))
								.and(S0_V1.pr(S1_TF.itm_sub3).eq(S0_T2.itm_sub3))
								.and(S0_V1.pr(S1_TD.pf_period_typ).eq(S0_T3.pf_period_typ))
								.and(S0_V1.pr(S1_TD.pf_period_st_dt).eq(S0_T3.pf_period_st_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pf_dt.lt(bind("pf_dt")))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(S0_T1.sppl_cd.eq(bind("sppl_cd")))
						.cutoff$and(S0_T2.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T3.fix_period_flg.eq(value(true)))
						.and(S0_T2.fix_flg.eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_FIX_Query_D01
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_FIX_D01() {
		MST_PURC_FRCST_FIX_R S0_FIX = MST_PURC_FRCST_FIX_R.create("FIX");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_FIX_Query_D01")
					.delete(S0_FIX)
					.where(
						S0_FIX.purc_frcst_no.eq(bind("purc_frcst_no"))
						.cutoff$and(S0_FIX.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0_FIX.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0_FIX.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0_FIX.itm_sub3.eq(bind("itm_sub3")))
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_FIX_Query_D02
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_FIX_D02() {
		MST_PURC_FRCST_FIX_R S0 = MST_PURC_FRCST_FIX_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_FIX_Query_D02")
					.delete(S0)
					.where(
						S0.purc_frcst_no.eq(bind("purc_frcst_no"))
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_H_Query_D01
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_H_D01() {
		MST_PURC_FRCST_H_R S0_FRCSTH = MST_PURC_FRCST_H_R.create("FRCSTH");
		MST_PURC_FRCST_D_R S1_FRCSTD = MST_PURC_FRCST_D_R.create("FRCSTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_H_Query_D01")
					.delete(S0_FRCSTH)
					.where(
						notExists(
							subQuery()
							.select(value("X"))
							.from(S1_FRCSTD)
							.where(
								S1_FRCSTD.purc_frcst_no.eq(S0_FRCSTH.purc_frcst_no)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_H_Query_D02
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_H_D02() {
		MST_PURC_FRCST_H_R S0 = MST_PURC_FRCST_H_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_H_Query_D02")
					.delete(S0)
					.where(
						S0.purc_frcst_no.eq(bind("purc_frcst_no"))
					)
			);
	}
	
	/**
	 * -- MSBDB0010_MST_PURC_FRCST_H_Query_S01
	 */
	static MCQueryPlan MSBDB0010_MST_PURC_FRCST_H_S01() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDB0010_MST_PURC_FRCST_H_Query_S01")
					.mainQuery()
					.selectDistinct(S0_T1.sppl_cd)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pf_dt.eq(bind("pf_dt")))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_T1.sppl_cd.eq(bind("sppl_cd")))
						.cutoff$and(S0_T2.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.eq(bind("itm_sub3")))
					)
					.orderBy(pr("sppl_cd").asc())
			);
	}
}