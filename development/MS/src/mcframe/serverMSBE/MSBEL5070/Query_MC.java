package mcframe.serverMSBE.MSBEL5070;

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
	 * -- MSBEL5070_MAM_ALLOC_CTL_Query_S01
	 */
	static MCQueryPlan MSBEL5070_MAM_ALLOC_CTL_S01() {
		MAM_ALLOC_CTL_R S0_M1 = MAM_ALLOC_CTL_R.create("M1");
		MAW_STK_RPL_KEY_R S1_WK = MAW_STK_RPL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5070_MAM_ALLOC_CTL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.to_loc_cd,
						S0_M1.fr_loc_cd,
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.prio
					)
					.from(S0_M1)
					.where(
						S0_M1.del_flg.eq(value(false))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_WK)
								.where(
									S1_WK.loc_cd.eq(S0_M1.to_loc_cd)
									.and(
										S1_WK.itm_cd.eq(S0_M1.itm_cd)
										.and(S1_WK.itm_sub1.eq(S0_M1.itm_sub1))
										.and(S1_WK.itm_sub2.eq(S0_M1.itm_sub2))
										.and(S1_WK.itm_sub3.eq(S0_M1.itm_sub3))
										.or(S0_M1.itm_cd.isNull())
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5070_MAM_ITM_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL5070_MAM_ITM_DTL_S01() {
		MAM_ITM_DTL_R S0_M1 = MAM_ITM_DTL_R.create("M1");
		MAW_STK_RPL_KEY_R S0_WK = MAW_STK_RPL_KEY_R.create("WK");
		MAM_LOC_R S0_WM = MAM_LOC_R.create("WM");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5070_MAM_ITM_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_WK.loc_cd.as("strg_loc_cd"),
						S0_WM.loc_grp_cd.as("strg_loc_grp_cd"),
						S0_M1.mfg_loc_cd,
						S0_M2.loc_nm.as("mfg_loc_nm"),
						S0_M2.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_M2.sppl_cd.as("mfg_loc_sppl_cd"),
						S0_M1.sppl_cd,
						S0_M4.bp_nm.as("sppl_nm"),
						S0_M1.maker_cd,
						S0_M5.bp_nm.as("maker_nm"),
						S0_M1.rqst_loc_cd,
						S0_M3.loc_nm.as("rqst_loc_nm"),
						S0_M3.str_ln_tgt_flg.as("rqst_str_ln_tgt_flg"),
						nvl(
							S0_M3.wg_cd,
							S0_M1.rqst_wg_cd
						).as("rqst_wg_cd"),
						nvl(
							S0_M6.wg_nm,
							S0_M7.wg_nm
						).as("rqst_wg_nm"),
						S0_M1.bom_ptn,
						S0_M1.prio,
						S0_M1.order_ratio,
						S0_M1.min_lot_qty,
						S0_M1.batch_lot_qty,
						S0_M1.max_lot_qty,
						S0_M1.yield_schd_qty,
						S0_M1.mfg_inst_qty,
						S0_M1.fxd_rqmt_qty
						,S0_WM.sppl_cd.as("strg_sppl_cd")
					)
					.from(
						S0_M1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_WK.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_WM).on(
							bracket(
								S0_WM.loc_cd.eq(S0_WK.loc_cd)
								.and(S0_WM.wg_cd.eq(S0_M1.wg_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_M1.mfg_loc_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_M1.rqst_loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.bp_cd.eq(S0_M1.sppl_cd)
								.and(S0_M4.sppl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.bp_cd.eq(S0_M1.maker_cd)
								.and(S0_M5.maker_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.wg_cd.eq(S0_M3.wg_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.wg_cd.eq(S0_M1.rqst_wg_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.st_dt.lte(bind("master_dt")))
						.and(S0_M1.end_dt.gte(bind("master_dt")))
						.and(S0_M1.order_ratio.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBEL5070_MSVT_AVL_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5070_MSVT_AVL_IO_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MSVT_AVL_IO_SCHD_R S1_T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MAW_STK_RPL_KEY_R S1_WK = MAW_STK_RPL_KEY_R.create("WK");
		MSVT_LOT_LIST_R S1_T3 = MSVT_LOT_LIST_R.create("T3");
		MST_ORD_IO_SCHD_R S2_T1 = MST_ORD_IO_SCHD_R.create("T1");
		MAW_STK_RPL_KEY_R S2_WK = MAW_STK_RPL_KEY_R.create("WK");
		MST_ITM_ORDER_R S2_T2 = MST_ITM_ORDER_R.create("T2");
		MSVT_LOT_LIST_R S2_T3 = MSVT_LOT_LIST_R.create("T3");
		MAM_LOC_R S2_M1 = MAM_LOC_R.create("M1");
		MAM_BP_R S2_M2 = MAM_BP_R.create("M2");
		MAM_PROV_UPRI_R S2_M3 = MAM_PROV_UPRI_R.create("M3");
		MST_SAVORD_IO_SCHD_R S3_T1 = MST_SAVORD_IO_SCHD_R.create("T1");
		MAW_STK_RPL_KEY_R S3_WK = MAW_STK_RPL_KEY_R.create("WK");
		MST_ITM_ORDER_R S3_T2 = MST_ITM_ORDER_R.create("T2");
		MSVT_LOT_LIST_R S3_T3 = MSVT_LOT_LIST_R.create("T3");
		MAM_LOC_R S3_M1 = MAM_LOC_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5070_MSVT_AVL_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.loc_cd).as("strg_loc_cd"),
						sum(S0_V1.pr("gr_schd_qty")).as("gr_schd_qty"),
						sum(S0_V1.pr("gi_schd_qty")).as("gi_schd_qty"),
						sum(
							MAPA_CALC$F_RND_NE(
								nvl(
									S0_V1.pr(S1_T3.act_cont_fctr),
									S0_M1.std_cont_fctr
								).multiply(S0_V1.pr("gr_schd_qty")),
								S0_M1.cont_fctr_dec_place,
								S0_M1.cont_fctr_rnd_typ
							)
						).as("gr_schd_cont_qty"),
						sum(
							MAPA_CALC$F_RND_NE(
								nvl(
									S0_V1.pr(S1_T3.act_cont_fctr),
									S0_M1.std_cont_fctr
								).multiply(S0_V1.pr("gi_schd_qty")),
								S0_M1.cont_fctr_dec_place,
								S0_M1.cont_fctr_rnd_typ
							)
						).as("gi_schd_cont_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							bracket(
								cases()
									.when(S1_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
										.then(
											cases()
												.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.otherwise(value(0))
									)
									.otherwise(value(0))
							).as("gr_schd_qty"),
							bracket(
								cases()
									.when(S1_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
										.then(
											cases()
												.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S1_T1.io_schd_sts_typ).eq(value(true)))
													.then(S1_T1.base_unit_qty)
												.otherwise(value(0))
									)
									.otherwise(value(0))
							).as("gi_schd_qty"),
							S1_T3.act_cont_fctr
						)
						.from(
							S1_T1
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_WK.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_WK.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_WK.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_WK.loc_cd.eq(S1_T1.loc_cd))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_T3.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_T3.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_T3.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_T3.lot_no.eq(S1_T1.lot_no))
									.and(S1_T3.sublot_no.eq(S1_T1.sublot_no))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.io_typ.eq(value(MSC_IO_TYP.GR.value()))
								.cutoff$and(S1_T1.schd_dt.lte(bind("gr_schd_dt_to")))
								.or(S1_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.cutoff$and(S1_T1.schd_dt.lte(bind("gi_schd_dt_to")))
							)
							.and(S1_T1.gd_cd.eq(MAPA_UTIL$F_GET_DEF_GD_CD()))
							.and(S1_T1.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())))
						)
						.unionAll(
							subQuery()
							.select(
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd,
								bracket(
									cases()
										.when(S2_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
											.then(
												cases()
													.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
														.then(S2_T1.base_unit_qty)
													.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
														.then(S2_T1.base_unit_qty)
													.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
														.then(S2_T1.base_unit_qty)
													.otherwise(value(0))
										)
										.otherwise(value(0))
								).as("gr_schd_qty"),
								bracket(
									cases()
										.when(
											nvl(
												S2_M3.prov_typ,
												value(MAC_PROV_TYP.FFR_PROV.value())
											).eq(value(MAC_PROV_TYP.SS.value()))
											.and(S2_T1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.INPT.value())))
										)
											.then(value(0))
										.otherwise(
											cases()
												.when(S2_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
													.then(
														cases()
															.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
																.then(S2_T1.base_unit_qty)
															.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
																.then(S2_T1.base_unit_qty)
															.when(MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
																.then(S2_T1.base_unit_qty)
															.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S2_T1.io_schd_sts_typ).eq(value(true)))
																.then(S2_T1.base_unit_qty)
															.otherwise(value(0))
												)
												.otherwise(value(0))
										)
								).as("gi_schd_qty"),
								S2_T3.act_cont_fctr
							)
							.from(
								S2_T1
								.innerJoin(S2_WK).on(
									bracket(
										S2_WK.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_WK.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_WK.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_WK.itm_sub3.eq(S2_T1.itm_sub3))
										.and(S2_WK.loc_cd.eq(S2_T1.loc_cd))
									)
								)
								.innerJoin(S2_T2).on(
									bracket(
										S2_T2.itm_ord_no.eq(S2_T1.io_schd_no)
									)
								)
								.leftOuterJoin(S2_T3).on(
									bracket(
										S2_T3.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_T3.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_T3.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_T3.itm_sub3.eq(S2_T1.itm_sub3))
										.and(S2_T3.lot_no.eq(S2_T1.lot_no))
										.and(S2_T3.sublot_no.eq(S2_T1.sublot_no))
									)
								)
								.leftOuterJoin(S2_M1).on(
									bracket(
										S2_M1.loc_cd.eq(S2_T2.mfg_loc_cd)
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.bp_cd.eq(decode(
												S2_T2.sppl_cd,
												value(MAC_STR.NULL_VAL.value()),
												S2_M1.sppl_cd,
												S2_T2.sppl_cd
											)
										)
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_M3.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_M3.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_M3.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_M3.itm_sub3.eq(S2_T1.itm_sub3))
										.and(S2_M3.wg_cd.eq(S2_T1.wg_cd))
										.and(S2_M3.prsppl_cd.eq(S2_M2.bp_cd))
										.and(S2_M3.cur_cd.eq(S2_M2.cur_cd))
										.and(S2_M3.st_dt.lte(S2_T2.mfg_st_schd_dt))
										.and(S2_M3.end_dt.gte(S2_T2.mfg_st_schd_dt))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S2_T1.io_typ.eq(value(MSC_IO_TYP.GR.value()))
									.cutoff$and(
										nvl(
											S2_T1.avl_schd_dt,
											S2_T1.schd_dt
										).lte(bind("gr_schd_dt_to"))
									)
									.or(S2_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
									.cutoff$and(
										nvl(
											S2_T1.avl_schd_dt,
											S2_T1.schd_dt
										).lte(bind("gi_schd_dt_to"))
									)
								)
								.and(S2_T1.gd_cd.eq(MAPA_UTIL$F_GET_DEF_GD_CD()))
								.and(S2_T1.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())))
							)
							.unionAll(
								subQuery()
								.select(
									S3_T1.itm_cd,
									S3_T1.itm_sub1,
									S3_T1.itm_sub2,
									S3_T1.itm_sub3,
									S3_T1.loc_cd,
									bracket(
										cases()
											.when(S3_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
												.then(
													cases()
														.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.otherwise(value(0))
											)
											.otherwise(value(0))
									).as("gr_schd_qty"),
									bracket(
										cases()
											.when(S3_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
												.then(
													cases()
														.when(MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.when(MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(S3_T1.io_schd_sts_typ).eq(value(true)))
															.then(S3_T1.base_unit_qty)
														.otherwise(value(0))
											)
											.otherwise(value(0))
									).as("gi_schd_qty"),
									S3_T3.act_cont_fctr
								)
								.from(
									S3_T1
									.innerJoin(S3_WK).on(
										bracket(
											S3_WK.itm_cd.eq(S3_T1.itm_cd)
											.and(S3_WK.itm_sub1.eq(S3_T1.itm_sub1))
											.and(S3_WK.itm_sub2.eq(S3_T1.itm_sub2))
											.and(S3_WK.itm_sub3.eq(S3_T1.itm_sub3))
											.and(S3_WK.loc_cd.eq(S3_T1.loc_cd))
										)
									)
									.innerJoin(S3_T2).on(
										bracket(
											S3_T2.itm_ord_no.eq(S3_T1.io_schd_no)
										)
									)
									.leftOuterJoin(S3_T3).on(
										bracket(
											S3_T3.itm_cd.eq(S3_T1.itm_cd)
											.and(S3_T3.itm_sub1.eq(S3_T1.itm_sub1))
											.and(S3_T3.itm_sub2.eq(S3_T1.itm_sub2))
											.and(S3_T3.itm_sub3.eq(S3_T1.itm_sub3))
											.and(S3_T3.lot_no.eq(S3_T1.lot_no))
											.and(S3_T3.sublot_no.eq(S3_T1.sublot_no))
										)
									)
									.leftOuterJoin(S3_M1).on(
										bracket(
											S3_M1.loc_cd.eq(S3_T2.mfg_loc_cd)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.cutoff$and(
										nvl(
											S3_T1.avl_schd_dt,
											S3_T1.schd_dt
										).lte(bind("gr_schd_dt_to"))
									)
									.and(S3_T1.gd_cd.eq(MAPA_UTIL$F_GET_DEF_GD_CD()))
									.and(S3_T1.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())))
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd))
								.and(S0_M1.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1)))
								.and(S0_M1.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2)))
								.and(S0_M1.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))
							)
						)
					)
					.groupBy(
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.loc_cd)
					)
			);
	}
	
	/**
	 * -- MSBEL5070_MSVT_AVL_STK_Query_S01
	 */
	static MCQueryPlan MSBEL5070_MSVT_AVL_STK_S01() {
		MSVT_AVL_STK_R S0_T1 = MSVT_AVL_STK_R.create("T1");
		MAW_STK_RPL_KEY_R S0_WK = MAW_STK_RPL_KEY_R.create("WK");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5070_MSVT_AVL_STK_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.loc_cd.as("strg_loc_cd"),
						sum(S0_T1.base_unit_qty).as("stk_qty"),
						sum(
							MAPA_CALC$F_RND_NE(
								nvl(
									S0_T2.act_cont_fctr,
									S0_M1.std_cont_fctr
								).multiply(S0_T1.base_unit_qty),
								S0_M1.cont_fctr_dec_place,
								S0_M1.cont_fctr_rnd_typ
							)
						).as("stk_cont_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_WK.loc_cd.eq(S0_T1.loc_cd))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_T1.lot_no))
								.and(S0_T2.sublot_no.eq(S0_T1.sublot_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.gd_cd.eq(MAPA_UTIL$F_GET_DEF_GD_CD()))
						.and(S0_T1.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())))
						.and(S0_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.ACCPT_DFCT.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.loc_cd
					)
			);
	}
	
}