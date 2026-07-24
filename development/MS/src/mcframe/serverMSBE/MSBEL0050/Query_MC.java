package mcframe.serverMSBE.MSBEL0050;

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
	 * -- MSBEL0050_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL0050_MST_MLY_STK_DTL_S01() {
		MST_MLY_STK_DTL_R S0_T = MST_MLY_STK_DTL_R.create("T");
		MSW_MLY_STK_DTL_KEY_R S1_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S2_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						sum(S0_T.pack_unit_qty).as("pack_unit_qty"),
						sum(S0_T.base_unit_qty).as("stk_qty")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W1)
								.where(
									value(0).eq(value(0))
									.and(S0_T.ac_ym.eq(S1_W1.ac_ym))
									.and(S0_T.io_act_typ.eq(S1_W1.io_act_typ))
									.and(S0_T.itm_cd.eq(S1_W1.itm_cd))
									.and(S0_T.itm_sub1.eq(S1_W1.itm_sub1))
									.and(S0_T.itm_sub2.eq(S1_W1.itm_sub2))
									.and(S0_T.itm_sub3.eq(S1_W1.itm_sub3))
									.and(S0_T.loc_cd.eq(S1_W1.loc_cd))
									.and(S0_T.str_ln_cd.eq(S1_W1.str_ln_cd))
									.and(S0_T.stk_arrv_bp_cd.eq(S1_W1.stk_arrv_bp_cd))
									.and(S0_T.lot_no.eq(S1_W1.lot_no))
									.and(S0_T.sublot_no.eq(S1_W1.sublot_no))
									.and(S0_T.sno1.eq(S1_W1.sno1))
									.and(S0_T.sno2.eq(S1_W1.sno2))
									.and(S0_T.sno3.eq(S1_W1.sno3))
									.and(S0_T.sno4.eq(S1_W1.sno4))
									.and(S0_T.pack_unit_cd.eq(S1_W1.pack_unit_cd))
									.and(S0_T.gd_cd.eq(S1_W1.gd_cd))
									.and(S0_T.in_xfr_typ.eq(S1_W1.in_xfr_typ))
									.and(S0_T.quality_typ.eq(S1_W1.quality_typ))
									.and(S0_T.asst_typ.eq(S1_W1.asst_typ))
									.and(S0_T.stk_insp_typ.eq(S1_W1.stk_insp_typ))
									.and(S0_T.stk_id_typ.eq(S1_W1.stk_id_typ))
									.and(S0_T.stk_bp_cd.eq(S1_W1.stk_bp_cd))
								)
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W2)
								.where(
									value(0).eq(value(0))
									.and(S0_T.itm_cd.eq(S2_W2.itm_cd))
									.and(S0_T.itm_sub1.eq(S2_W2.itm_sub1))
									.and(S0_T.itm_sub2.eq(S2_W2.itm_sub2))
									.and(S0_T.itm_sub3.eq(S2_W2.itm_sub3))
								)
							)
						)
					)
					.groupBy(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd
					)
			);
	}
	
	/**
	 * -- MSBEL0050_MST_MLY_STK_DTL_Query_S02
	 */
	static MCQueryPlan MSBEL0050_MST_MLY_STK_DTL_S02() {
		MCTempView S0_V = createTempView("V");
		MST_MLY_STK_DTL_R S1_T = MST_MLY_STK_DTL_R.create("T");
		MSC_STK_ANLY_CTL_R S1_CTL = MSC_STK_ANLY_CTL_R.create("CTL");
		MSW_MLY_STK_DTL_KEY_R S2_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S3_W2 = MAW_ITM_KEY_R.create("W2");
		MST_MLY_STK_DTL_R S4_T = MST_MLY_STK_DTL_R.create("T");
		MSC_STK_ANLY_CTL_R S4_CTL = MSC_STK_ANLY_CTL_R.create("CTL");
		MST_MLY_STK_DTL_R S5_T1 = MST_MLY_STK_DTL_R.create("T1");
		MSW_MLY_STK_DTL_KEY_R S6_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S7_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_MLY_STK_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_V.pr(S1_T.itm_cd),
						S0_V.pr(S1_T.itm_sub1),
						S0_V.pr(S1_T.itm_sub2),
						S0_V.pr(S1_T.itm_sub3),
						S0_V.pr(S1_T.loc_cd),
						S0_V.pr(S1_T.str_ln_cd),
						S0_V.pr(S1_T.stk_arrv_bp_cd),
						S0_V.pr(S1_T.lot_no),
						S0_V.pr(S1_T.sublot_no),
						S0_V.pr(S1_T.sno1),
						S0_V.pr(S1_T.sno2),
						S0_V.pr(S1_T.sno3),
						S0_V.pr(S1_T.sno4),
						S0_V.pr(S1_T.pack_unit_cd),
						S0_V.pr(S1_T.gd_cd),
						S0_V.pr(S1_T.in_xfr_typ),
						S0_V.pr(S1_T.quality_typ),
						S0_V.pr(S1_T.asst_typ),
						S0_V.pr(S1_T.stk_insp_typ),
						S0_V.pr(S1_T.stk_id_typ),
						S0_V.pr(S1_T.stk_bp_cd),
						max(S0_V.pr("ac_ym")).as("non_mov_base_ym")
					)
					.from(
						subQuery()
						.select(
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.stk_arrv_bp_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.pack_unit_cd,
							S1_T.gd_cd,
							S1_T.in_xfr_typ,
							S1_T.quality_typ,
							S1_T.asst_typ,
							S1_T.stk_insp_typ,
							S1_T.stk_id_typ,
							S1_T.stk_bp_cd,
							max(S1_T.ac_ym).as("ac_ym")
						)
						.from(
							S1_T
							.innerJoin(S1_CTL).on(S1_CTL.io_act_typ.eq(S1_T.io_act_typ))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_CTL.ctl_tgt_typ.eq(value(MSC_CTL_TGT_TYP.NON_MOV.value())))
							.and(MSC_IO_ACT_TYP$IO_TYP(S1_T.io_act_typ).eq(value(MSC_IO_TYP.GI.value())))
							.and(
								S1_T.ac_ym.gte(addMonths(
										bind("non_mov_cmp_ym"),
										value(0).subtract(bind("non_mov_calc_mons"))
									)
								)
							)
							.and(S1_T.ac_ym.lte(bind("non_mov_cmp_ym")))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										value(0).eq(value(0))
										.and(S2_W1.itm_cd.eq(S1_T.itm_cd))
										.and(S2_W1.itm_sub1.eq(S1_T.itm_sub1))
										.and(S2_W1.itm_sub2.eq(S1_T.itm_sub2))
										.and(S2_W1.itm_sub3.eq(S1_T.itm_sub3))
										.and(S2_W1.loc_cd.eq(S1_T.loc_cd))
										.and(S2_W1.str_ln_cd.eq(S1_T.str_ln_cd))
										.and(S2_W1.stk_arrv_bp_cd.eq(S1_T.stk_arrv_bp_cd))
										.and(S2_W1.lot_no.eq(S1_T.lot_no))
										.and(S2_W1.sublot_no.eq(S1_T.sublot_no))
										.and(S2_W1.sno1.eq(S1_T.sno1))
										.and(S2_W1.sno2.eq(S1_T.sno2))
										.and(S2_W1.sno3.eq(S1_T.sno3))
										.and(S2_W1.sno4.eq(S1_T.sno4))
										.and(S2_W1.pack_unit_cd.eq(S1_T.pack_unit_cd))
										.and(S2_W1.gd_cd.eq(S1_T.gd_cd))
										.and(S2_W1.in_xfr_typ.eq(S1_T.in_xfr_typ))
										.and(S2_W1.quality_typ.eq(S1_T.quality_typ))
										.and(S2_W1.asst_typ.eq(S1_T.asst_typ))
										.and(S2_W1.stk_insp_typ.eq(S1_T.stk_insp_typ))
										.and(S2_W1.stk_id_typ.eq(S1_T.stk_id_typ))
										.and(S2_W1.stk_bp_cd.eq(S1_T.stk_bp_cd))
									)
								)
							)
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_W2)
									.where(
										value(0).eq(value(0))
										.and(S3_W2.itm_cd.eq(S1_T.itm_cd))
										.and(S3_W2.itm_sub1.eq(S1_T.itm_sub1))
										.and(S3_W2.itm_sub2.eq(S1_T.itm_sub2))
										.and(S3_W2.itm_sub3.eq(S1_T.itm_sub3))
									)
								)
							)
						)
						.groupBy(
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.stk_arrv_bp_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.pack_unit_cd,
							S1_T.gd_cd,
							S1_T.in_xfr_typ,
							S1_T.quality_typ,
							S1_T.asst_typ,
							S1_T.stk_insp_typ,
							S1_T.stk_id_typ,
							S1_T.stk_bp_cd
						)
						.unionAll(
							subQuery()
							.select(
								S4_T.itm_cd,
								S4_T.itm_sub1,
								S4_T.itm_sub2,
								S4_T.itm_sub3,
								S4_T.loc_cd,
								S4_T.str_ln_cd,
								S4_T.stk_arrv_bp_cd,
								S4_T.lot_no,
								S4_T.sublot_no,
								S4_T.sno1,
								S4_T.sno2,
								S4_T.sno3,
								S4_T.sno4,
								S4_T.pack_unit_cd,
								S4_T.gd_cd,
								S4_T.in_xfr_typ,
								S4_T.quality_typ,
								S4_T.asst_typ,
								S4_T.stk_insp_typ,
								S4_T.stk_id_typ,
								S4_T.stk_bp_cd,
								max(S4_T.ac_ym).as("ac_ym")
							)
							.from(
								S4_T
								.innerJoin(S4_CTL).on(S4_CTL.io_act_typ.eq(S4_T.io_act_typ))
							)
							.where(
								value(0).eq(value(0))
								.and(S4_CTL.ctl_tgt_typ.eq(value(MSC_CTL_TGT_TYP.NON_MOV.value())))
								.and(MSC_IO_ACT_TYP$IO_TYP(S4_T.io_act_typ).eq(value(MSC_IO_TYP.GR.value())))
								.and(
									S4_T.ac_ym.gte(addMonths(
											bind("non_mov_cmp_ym"),
											value(0).subtract(bind("non_mov_calc_mons"))
										)
									)
								)
								.and(S4_T.ac_ym.lte(bind("non_mov_cmp_ym")))
								.and(
									subQuery()
									.select(
										nvl(
											sum(S5_T1.base_unit_qty),
											value(0)
										)
									)
									.from(S5_T1)
									.where(
										value(0).eq(value(0))
										.and(
											S5_T1.ac_ym.eq(addMonths(
													S4_T.ac_ym,
													value(-1)
												)
											)
										)
										.and(S5_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
										.and(S5_T1.itm_cd.eq(S4_T.itm_cd))
										.and(S5_T1.itm_sub1.eq(S4_T.itm_sub1))
										.and(S5_T1.itm_sub2.eq(S4_T.itm_sub2))
										.and(S5_T1.itm_sub3.eq(S4_T.itm_sub3))
										.and(S5_T1.loc_cd.eq(S4_T.loc_cd))
										.and(S5_T1.str_ln_cd.eq(S4_T.str_ln_cd))
										.and(S5_T1.stk_arrv_bp_cd.eq(S4_T.stk_arrv_bp_cd))
										.and(S5_T1.lot_no.eq(S4_T.lot_no))
										.and(S5_T1.sublot_no.eq(S4_T.sublot_no))
										.and(S5_T1.sno1.eq(S4_T.sno1))
										.and(S5_T1.sno2.eq(S4_T.sno2))
										.and(S5_T1.sno3.eq(S4_T.sno3))
										.and(S5_T1.sno4.eq(S4_T.sno4))
										.and(S5_T1.pack_unit_cd.eq(S4_T.pack_unit_cd))
										.and(S5_T1.gd_cd.eq(S4_T.gd_cd))
										.and(S5_T1.in_xfr_typ.eq(S4_T.in_xfr_typ))
										.and(S5_T1.quality_typ.eq(S4_T.quality_typ))
										.and(S5_T1.asst_typ.eq(S4_T.asst_typ))
										.and(S5_T1.stk_insp_typ.eq(S4_T.stk_insp_typ))
										.and(S5_T1.stk_id_typ.eq(S4_T.stk_id_typ))
										.and(S5_T1.stk_bp_cd.eq(S4_T.stk_bp_cd))
									).eq(value(0))
								)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_W1)
										.where(
											value(0).eq(value(0))
											.and(S6_W1.itm_cd.eq(S4_T.itm_cd))
											.and(S6_W1.itm_sub1.eq(S4_T.itm_sub1))
											.and(S6_W1.itm_sub2.eq(S4_T.itm_sub2))
											.and(S6_W1.itm_sub3.eq(S4_T.itm_sub3))
											.and(S6_W1.loc_cd.eq(S4_T.loc_cd))
											.and(S6_W1.str_ln_cd.eq(S4_T.str_ln_cd))
											.and(S6_W1.stk_arrv_bp_cd.eq(S4_T.stk_arrv_bp_cd))
											.and(S6_W1.lot_no.eq(S4_T.lot_no))
											.and(S6_W1.sublot_no.eq(S4_T.sublot_no))
											.and(S6_W1.sno1.eq(S4_T.sno1))
											.and(S6_W1.sno2.eq(S4_T.sno2))
											.and(S6_W1.sno3.eq(S4_T.sno3))
											.and(S6_W1.sno4.eq(S4_T.sno4))
											.and(S6_W1.pack_unit_cd.eq(S4_T.pack_unit_cd))
											.and(S6_W1.gd_cd.eq(S4_T.gd_cd))
											.and(S6_W1.in_xfr_typ.eq(S4_T.in_xfr_typ))
											.and(S6_W1.quality_typ.eq(S4_T.quality_typ))
											.and(S6_W1.asst_typ.eq(S4_T.asst_typ))
											.and(S6_W1.stk_insp_typ.eq(S4_T.stk_insp_typ))
											.and(S6_W1.stk_id_typ.eq(S4_T.stk_id_typ))
											.and(S6_W1.stk_bp_cd.eq(S4_T.stk_bp_cd))
										)
									)
								)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_W2)
										.where(
											value(0).eq(value(0))
											.and(S7_W2.itm_cd.eq(S4_T.itm_cd))
											.and(S7_W2.itm_sub1.eq(S4_T.itm_sub1))
											.and(S7_W2.itm_sub2.eq(S4_T.itm_sub2))
											.and(S7_W2.itm_sub3.eq(S4_T.itm_sub3))
										)
									)
								)
							)
							.groupBy(
								S4_T.itm_cd,
								S4_T.itm_sub1,
								S4_T.itm_sub2,
								S4_T.itm_sub3,
								S4_T.loc_cd,
								S4_T.str_ln_cd,
								S4_T.stk_arrv_bp_cd,
								S4_T.lot_no,
								S4_T.sublot_no,
								S4_T.sno1,
								S4_T.sno2,
								S4_T.sno3,
								S4_T.sno4,
								S4_T.pack_unit_cd,
								S4_T.gd_cd,
								S4_T.in_xfr_typ,
								S4_T.quality_typ,
								S4_T.asst_typ,
								S4_T.stk_insp_typ,
								S4_T.stk_id_typ,
								S4_T.stk_bp_cd
							)
						).view(S0_V)
					)
					.groupBy(
						S0_V.pr(S1_T.itm_cd),
						S0_V.pr(S1_T.itm_sub1),
						S0_V.pr(S1_T.itm_sub2),
						S0_V.pr(S1_T.itm_sub3),
						S0_V.pr(S1_T.loc_cd),
						S0_V.pr(S1_T.str_ln_cd),
						S0_V.pr(S1_T.stk_arrv_bp_cd),
						S0_V.pr(S1_T.lot_no),
						S0_V.pr(S1_T.sublot_no),
						S0_V.pr(S1_T.sno1),
						S0_V.pr(S1_T.sno2),
						S0_V.pr(S1_T.sno3),
						S0_V.pr(S1_T.sno4),
						S0_V.pr(S1_T.pack_unit_cd),
						S0_V.pr(S1_T.gd_cd),
						S0_V.pr(S1_T.in_xfr_typ),
						S0_V.pr(S1_T.quality_typ),
						S0_V.pr(S1_T.asst_typ),
						S0_V.pr(S1_T.stk_insp_typ),
						S0_V.pr(S1_T.stk_id_typ),
						S0_V.pr(S1_T.stk_bp_cd)
					)
			);
	}
	
	/**
	 * -- MSBEL0050_MST_MLY_STK_DTL_Query_S03
	 */
	static MCQueryPlan MSBEL0050_MST_MLY_STK_DTL_S03() {
		MST_IO_SCHD_R S0_T = MST_IO_SCHD_R.create("T");
		MSC_NON_MOV_SCHD_CTL_R S0_CTL = MSC_NON_MOV_SCHD_CTL_R.create("CTL");
		MSW_MLY_STK_DTL_KEY_R S1_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S2_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_MLY_STK_DTL_Query_S03")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						min(S0_T.schd_dt).as("rcnt_gi_schd_dt")
					)
					.from(
						S0_T
						.innerJoin(S0_CTL).on(S0_CTL.io_schd_typ.eq(S0_T.io_schd_typ))
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W1)
								.where(
									value(0).eq(value(0))
									.and(S1_W1.itm_cd.eq(S0_T.itm_cd))
									.and(S1_W1.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_W1.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_W1.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_W1.loc_cd.eq(S0_T.loc_cd))
									.and(S1_W1.str_ln_cd.eq(S0_T.str_ln_cd))
									.and(S1_W1.stk_arrv_bp_cd.eq(S0_T.stk_arrv_bp_cd))
									.and(S1_W1.lot_no.eq(S0_T.lot_no))
									.and(S1_W1.sublot_no.eq(S0_T.sublot_no))
									.and(S1_W1.sno1.eq(S0_T.sno1))
									.and(S1_W1.sno2.eq(S0_T.sno2))
									.and(S1_W1.sno3.eq(S0_T.sno3))
									.and(S1_W1.sno4.eq(S0_T.sno4))
									.and(S1_W1.pack_unit_cd.eq(S0_T.pack_unit_cd))
									.and(S1_W1.gd_cd.eq(S0_T.gd_cd))
									.and(S1_W1.in_xfr_typ.eq(S0_T.in_xfr_typ))
									.and(S1_W1.quality_typ.eq(S0_T.quality_typ))
									.and(S1_W1.asst_typ.eq(S0_T.asst_typ))
									.and(S1_W1.stk_insp_typ.eq(S0_T.stk_insp_typ))
									.and(S1_W1.stk_id_typ.eq(S0_T.stk_id_typ))
									.and(S1_W1.stk_bp_cd.eq(S0_T.stk_bp_cd))
								)
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W2)
								.where(
									value(0).eq(value(0))
									.and(S2_W2.itm_cd.eq(S0_T.itm_cd))
									.and(S2_W2.itm_sub1.eq(S0_T.itm_sub1))
									.and(S2_W2.itm_sub2.eq(S0_T.itm_sub2))
									.and(S2_W2.itm_sub3.eq(S0_T.itm_sub3))
								)
							)
						)
					)
					.groupBy(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd
					)
			);
	}
	
	/**
	 * -- MSBEL0050_MST_MLY_STK_DTL_Query_S04
	 */
	static MCQueryPlan MSBEL0050_MST_MLY_STK_DTL_S04() {
		MCTempView S0_V1 = createTempView("V1");
		MST_MLY_STK_DTL_R S1_T1 = MST_MLY_STK_DTL_R.create("T1");
		MSC_STK_ANLY_CTL_R S1_T2 = MSC_STK_ANLY_CTL_R.create("T2");
		MSW_MLY_STK_DTL_KEY_R S2_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S3_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_MLY_STK_DTL_Query_S04")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.pack_unit_cd),
						S0_V1.pr(S1_T1.gd_cd),
						S0_V1.pr(S1_T1.loc_cd),
						S0_V1.pr(S1_T1.str_ln_cd),
						S0_V1.pr(S1_T1.stk_arrv_bp_cd),
						S0_V1.pr(S1_T1.lot_no),
						S0_V1.pr(S1_T1.sublot_no),
						S0_V1.pr(S1_T1.sno1),
						S0_V1.pr(S1_T1.sno2),
						S0_V1.pr(S1_T1.sno3),
						S0_V1.pr(S1_T1.sno4),
						S0_V1.pr(S1_T1.in_xfr_typ),
						S0_V1.pr(S1_T1.quality_typ),
						S0_V1.pr(S1_T1.asst_typ),
						S0_V1.pr(S1_T1.stk_insp_typ),
						S0_V1.pr(S1_T1.stk_id_typ),
						S0_V1.pr(S1_T1.stk_bp_cd),
						S0_V1.pr(S1_T1.ac_ym),
						sum(S0_V1.pr("mly_gi_qty")).subtract(sum(S0_V1.pr("mly_gr_qty"))).as("ttl_gi_qty"),
						sum(S0_V1.pr("base_unit_mly_gi_qty")).subtract(sum(S0_V1.pr("base_unit_mly_gr_qty"))).as("base_unit_ttl_gi_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.pack_unit_cd,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.asst_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							S1_T1.ac_ym,
							cases()
								.when(MSC_IO_ACT_TYP$IO_TYP(S1_T1.io_act_typ).eq(value(MSC_IO_TYP.GI.value())))
									.then(S1_T1.pack_unit_qty)
								.otherwise(value(0)).as("mly_gi_qty"),
							cases()
								.when(MSC_IO_ACT_TYP$IO_TYP(S1_T1.io_act_typ).eq(value(MSC_IO_TYP.GI.value())))
									.then(S1_T1.base_unit_qty)
								.otherwise(value(0)).as("base_unit_mly_gi_qty"),
							cases()
								.when(MSC_IO_ACT_TYP$IO_TYP(S1_T1.io_act_typ).eq(value(MSC_IO_TYP.GR.value())))
									.then(S1_T1.pack_unit_qty)
								.otherwise(value(0)).as("mly_gr_qty"),
							cases()
								.when(MSC_IO_ACT_TYP$IO_TYP(S1_T1.io_act_typ).eq(value(MSC_IO_TYP.GR.value())))
									.then(S1_T1.base_unit_qty)
								.otherwise(value(0)).as("base_unit_mly_gr_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(S1_T2.io_act_typ.eq(S1_T1.io_act_typ))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.ctl_tgt_typ.eq(value(MSC_CTL_TGT_TYP.STK_TRN.value())))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										value(0).eq(value(0))
										.and(S2_W1.ac_ym.eq(S1_T1.ac_ym))
										.and(S2_W1.itm_cd.eq(S1_T1.itm_cd))
										.and(S2_W1.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S2_W1.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S2_W1.itm_sub3.eq(S1_T1.itm_sub3))
										.and(S2_W1.loc_cd.eq(S1_T1.loc_cd))
										.and(S2_W1.str_ln_cd.eq(S1_T1.str_ln_cd))
										.and(S2_W1.stk_arrv_bp_cd.eq(S1_T1.stk_arrv_bp_cd))
										.and(S2_W1.lot_no.eq(S1_T1.lot_no))
										.and(S2_W1.sublot_no.eq(S1_T1.sublot_no))
										.and(S2_W1.sno1.eq(S1_T1.sno1))
										.and(S2_W1.sno2.eq(S1_T1.sno2))
										.and(S2_W1.sno3.eq(S1_T1.sno3))
										.and(S2_W1.sno4.eq(S1_T1.sno4))
										.and(S2_W1.pack_unit_cd.eq(S1_T1.pack_unit_cd))
										.and(S2_W1.gd_cd.eq(S1_T1.gd_cd))
										.and(S2_W1.in_xfr_typ.eq(S1_T1.in_xfr_typ))
										.and(S2_W1.quality_typ.eq(S1_T1.quality_typ))
										.and(S2_W1.asst_typ.eq(S1_T1.asst_typ))
										.and(S2_W1.stk_insp_typ.eq(S1_T1.stk_insp_typ))
										.and(S2_W1.stk_id_typ.eq(S1_T1.stk_id_typ))
										.and(S2_W1.stk_bp_cd.eq(S1_T1.stk_bp_cd))
									)
								)
							)
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_W2)
									.where(
										value(0).eq(value(0))
										.and(S3_W2.itm_cd.eq(S1_T1.itm_cd))
										.and(S3_W2.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S3_W2.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S3_W2.itm_sub3.eq(S1_T1.itm_sub3))
									)
								)
							)
						).view(S0_V1)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_V1.pr(S1_T1.ac_ym),
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.loc_cd),
						S0_V1.pr(S1_T1.str_ln_cd),
						S0_V1.pr(S1_T1.stk_arrv_bp_cd),
						S0_V1.pr(S1_T1.lot_no),
						S0_V1.pr(S1_T1.sublot_no),
						S0_V1.pr(S1_T1.sno1),
						S0_V1.pr(S1_T1.sno2),
						S0_V1.pr(S1_T1.sno3),
						S0_V1.pr(S1_T1.sno4),
						S0_V1.pr(S1_T1.pack_unit_cd),
						S0_V1.pr(S1_T1.gd_cd),
						S0_V1.pr(S1_T1.in_xfr_typ),
						S0_V1.pr(S1_T1.quality_typ),
						S0_V1.pr(S1_T1.asst_typ),
						S0_V1.pr(S1_T1.stk_insp_typ),
						S0_V1.pr(S1_T1.stk_id_typ),
						S0_V1.pr(S1_T1.stk_bp_cd)
					)
			);
	}
	
	/**
	 * -- MSBEL0050_MST_MLY_STK_DTL_Query_S05
	 */
	static MCQueryPlan MSBEL0050_MST_MLY_STK_DTL_S05() {
		MCTempView S0_V1 = createTempView("V1");
		MCTempView S1_T = createTempView("T");
		MST_MLY_STK_DTL_R S2_T = MST_MLY_STK_DTL_R.create("T");
		MSW_MLY_STK_DTL_KEY_R S3_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S4_W2 = MAW_ITM_KEY_R.create("W2");
		MCTempView S5_T = createTempView("T");
		MST_MLY_STK_DTL_R S6_T = MST_MLY_STK_DTL_R.create("T");
		MSW_MLY_STK_DTL_KEY_R S7_W1 = MSW_MLY_STK_DTL_KEY_R.create("W1");
		MAW_ITM_KEY_R S8_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_MLY_STK_DTL_Query_S05")
					.mainQuery()
					.select(
						S0_V1.pr("ac_ym"),
						S0_V1.pr(S2_T.itm_cd),
						S0_V1.pr(S2_T.itm_sub1),
						S0_V1.pr(S2_T.itm_sub2),
						S0_V1.pr(S2_T.itm_sub3),
						S0_V1.pr(S2_T.pack_unit_cd),
						S0_V1.pr(S2_T.gd_cd),
						S0_V1.pr(S2_T.loc_cd),
						S0_V1.pr(S2_T.str_ln_cd),
						S0_V1.pr(S2_T.stk_arrv_bp_cd),
						S0_V1.pr(S2_T.lot_no),
						S0_V1.pr(S2_T.sublot_no),
						S0_V1.pr(S2_T.sno1),
						S0_V1.pr(S2_T.sno2),
						S0_V1.pr(S2_T.sno3),
						S0_V1.pr(S2_T.sno4),
						S0_V1.pr(S2_T.in_xfr_typ),
						S0_V1.pr(S2_T.quality_typ),
						S0_V1.pr(S2_T.asst_typ),
						S0_V1.pr(S2_T.stk_insp_typ),
						S0_V1.pr(S2_T.stk_id_typ),
						S0_V1.pr(S2_T.stk_bp_cd),
						bracket(
							sum(S0_V1.pr("ini_pack_unit_qty")).add(sum(S0_V1.pr("end_pack_unit_qty")))
						).divide(value(2)).as("avg_stk_qty"),
						bracket(
							sum(S0_V1.pr("ini_base_unit_qty")).add(sum(S0_V1.pr("end_base_unit_qty")))
						).divide(value(2)).as("base_unit_avg_stk_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T.pr("ac_ym"),
							S1_T.pr(S2_T.io_act_typ),
							S1_T.pr(S2_T.itm_cd),
							S1_T.pr(S2_T.itm_sub1),
							S1_T.pr(S2_T.itm_sub2),
							S1_T.pr(S2_T.itm_sub3),
							S1_T.pr(S2_T.loc_cd),
							S1_T.pr(S2_T.str_ln_cd),
							S1_T.pr(S2_T.stk_arrv_bp_cd),
							S1_T.pr(S2_T.lot_no),
							S1_T.pr(S2_T.sublot_no),
							S1_T.pr(S2_T.sno1),
							S1_T.pr(S2_T.sno2),
							S1_T.pr(S2_T.sno3),
							S1_T.pr(S2_T.sno4),
							S1_T.pr(S2_T.pack_unit_cd),
							S1_T.pr(S2_T.gd_cd),
							S1_T.pr(S2_T.in_xfr_typ),
							S1_T.pr(S2_T.quality_typ),
							S1_T.pr(S2_T.asst_typ),
							S1_T.pr(S2_T.stk_insp_typ),
							S1_T.pr(S2_T.stk_id_typ),
							S1_T.pr(S2_T.stk_bp_cd),
							S1_T.pr(S2_T.pack_unit_qty).as("ini_pack_unit_qty"),
							S1_T.pr(S2_T.base_unit_qty).as("ini_base_unit_qty"),
							value(0).as("end_pack_unit_qty"),
							value(0).as("end_base_unit_qty")
						)
						.from(
							subQuery()
							.select(
								addMonths(
									S2_T.ac_ym,
									value(1)
								).as("ac_ym"),
								S2_T.io_act_typ,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.loc_cd,
								S2_T.str_ln_cd,
								S2_T.stk_arrv_bp_cd,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								S2_T.pack_unit_cd,
								S2_T.gd_cd,
								S2_T.in_xfr_typ,
								S2_T.quality_typ,
								S2_T.asst_typ,
								S2_T.stk_insp_typ,
								S2_T.stk_id_typ,
								S2_T.stk_bp_cd,
								S2_T.pack_unit_qty,
								S2_T.base_unit_qty
							)
							.from(S2_T)
							.where(
								value(0).eq(value(0))
								.and(S2_T.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3_W1)
										.where(
											value(0).eq(value(0))
											.and(
												S2_T.ac_ym.eq(addMonths(
														S3_W1.ac_ym,
														value(-1)
													)
												)
											)
											.and(S2_T.io_act_typ.eq(S3_W1.io_act_typ))
											.and(S2_T.itm_cd.eq(S3_W1.itm_cd))
											.and(S2_T.itm_sub1.eq(S3_W1.itm_sub1))
											.and(S2_T.itm_sub2.eq(S3_W1.itm_sub2))
											.and(S2_T.itm_sub3.eq(S3_W1.itm_sub3))
											.and(S2_T.loc_cd.eq(S3_W1.loc_cd))
											.and(S2_T.str_ln_cd.eq(S3_W1.str_ln_cd))
											.and(S2_T.stk_arrv_bp_cd.eq(S3_W1.stk_arrv_bp_cd))
											.and(S2_T.lot_no.eq(S3_W1.lot_no))
											.and(S2_T.sublot_no.eq(S3_W1.sublot_no))
											.and(S2_T.sno1.eq(S3_W1.sno1))
											.and(S2_T.sno2.eq(S3_W1.sno2))
											.and(S2_T.sno3.eq(S3_W1.sno3))
											.and(S2_T.sno4.eq(S3_W1.sno4))
											.and(S2_T.pack_unit_cd.eq(S3_W1.pack_unit_cd))
											.and(S2_T.gd_cd.eq(S3_W1.gd_cd))
											.and(S2_T.in_xfr_typ.eq(S3_W1.in_xfr_typ))
											.and(S2_T.quality_typ.eq(S3_W1.quality_typ))
											.and(S2_T.asst_typ.eq(S3_W1.asst_typ))
											.and(S2_T.stk_insp_typ.eq(S3_W1.stk_insp_typ))
											.and(S2_T.stk_id_typ.eq(S3_W1.stk_id_typ))
											.and(S2_T.stk_bp_cd.eq(S3_W1.stk_bp_cd))
										)
									)
								)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S4_W2)
										.where(
											value(0).eq(value(0))
											.and(S4_W2.itm_cd.eq(S2_T.itm_cd))
											.and(S4_W2.itm_sub1.eq(S2_T.itm_sub1))
											.and(S4_W2.itm_sub2.eq(S2_T.itm_sub2))
											.and(S4_W2.itm_sub3.eq(S2_T.itm_sub3))
										)
									)
								)
							).view(S1_T)
						)
						.unionAll(
							subQuery()
							.select(
								S5_T.pr(S6_T.ac_ym),
								S5_T.pr(S6_T.io_act_typ),
								S5_T.pr(S6_T.itm_cd),
								S5_T.pr(S6_T.itm_sub1),
								S5_T.pr(S6_T.itm_sub2),
								S5_T.pr(S6_T.itm_sub3),
								S5_T.pr(S6_T.loc_cd),
								S5_T.pr(S6_T.str_ln_cd),
								S5_T.pr(S6_T.stk_arrv_bp_cd),
								S5_T.pr(S6_T.lot_no),
								S5_T.pr(S6_T.sublot_no),
								S5_T.pr(S6_T.sno1),
								S5_T.pr(S6_T.sno2),
								S5_T.pr(S6_T.sno3),
								S5_T.pr(S6_T.sno4),
								S5_T.pr(S6_T.pack_unit_cd),
								S5_T.pr(S6_T.gd_cd),
								S5_T.pr(S6_T.in_xfr_typ),
								S5_T.pr(S6_T.quality_typ),
								S5_T.pr(S6_T.asst_typ),
								S5_T.pr(S6_T.stk_insp_typ),
								S5_T.pr(S6_T.stk_id_typ),
								S5_T.pr(S6_T.stk_bp_cd),
								value(0).as("ini_pack_unit_qty"),
								value(0).as("ini_base_unit_qty"),
								S5_T.pr(S6_T.pack_unit_qty).as("end_pack_unit_qty"),
								S5_T.pr(S6_T.base_unit_qty).as("end_base_unit_qty")
							)
							.from(
								subQuery()
								.select(
									S6_T.ac_ym,
									S6_T.io_act_typ,
									S6_T.itm_cd,
									S6_T.itm_sub1,
									S6_T.itm_sub2,
									S6_T.itm_sub3,
									S6_T.loc_cd,
									S6_T.str_ln_cd,
									S6_T.stk_arrv_bp_cd,
									S6_T.lot_no,
									S6_T.sublot_no,
									S6_T.sno1,
									S6_T.sno2,
									S6_T.sno3,
									S6_T.sno4,
									S6_T.pack_unit_cd,
									S6_T.gd_cd,
									S6_T.in_xfr_typ,
									S6_T.quality_typ,
									S6_T.asst_typ,
									S6_T.stk_insp_typ,
									S6_T.stk_id_typ,
									S6_T.stk_bp_cd,
									S6_T.pack_unit_qty,
									S6_T.base_unit_qty
								)
								.from(S6_T)
								.where(
									value(0).eq(value(0))
									.and(S6_T.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S7_W1)
											.where(
												value(0).eq(value(0))
												.and(S6_T.ac_ym.eq(S7_W1.ac_ym))
												.and(S6_T.io_act_typ.eq(S7_W1.io_act_typ))
												.and(S6_T.itm_cd.eq(S7_W1.itm_cd))
												.and(S6_T.itm_sub1.eq(S7_W1.itm_sub1))
												.and(S6_T.itm_sub2.eq(S7_W1.itm_sub2))
												.and(S6_T.itm_sub3.eq(S7_W1.itm_sub3))
												.and(S6_T.loc_cd.eq(S7_W1.loc_cd))
												.and(S6_T.str_ln_cd.eq(S7_W1.str_ln_cd))
												.and(S6_T.stk_arrv_bp_cd.eq(S7_W1.stk_arrv_bp_cd))
												.and(S6_T.lot_no.eq(S7_W1.lot_no))
												.and(S6_T.sublot_no.eq(S7_W1.sublot_no))
												.and(S6_T.sno1.eq(S7_W1.sno1))
												.and(S6_T.sno2.eq(S7_W1.sno2))
												.and(S6_T.sno3.eq(S7_W1.sno3))
												.and(S6_T.sno4.eq(S7_W1.sno4))
												.and(S6_T.pack_unit_cd.eq(S7_W1.pack_unit_cd))
												.and(S6_T.gd_cd.eq(S7_W1.gd_cd))
												.and(S6_T.in_xfr_typ.eq(S7_W1.in_xfr_typ))
												.and(S6_T.quality_typ.eq(S7_W1.quality_typ))
												.and(S6_T.asst_typ.eq(S7_W1.asst_typ))
												.and(S6_T.stk_insp_typ.eq(S7_W1.stk_insp_typ))
												.and(S6_T.stk_id_typ.eq(S7_W1.stk_id_typ))
												.and(S6_T.stk_bp_cd.eq(S7_W1.stk_bp_cd))
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S8_W2)
											.where(
												value(0).eq(value(0))
												.and(S8_W2.itm_cd.eq(S6_T.itm_cd))
												.and(S8_W2.itm_sub1.eq(S6_T.itm_sub1))
												.and(S8_W2.itm_sub2.eq(S6_T.itm_sub2))
												.and(S8_W2.itm_sub3.eq(S6_T.itm_sub3))
											)
										)
									)
								).view(S5_T)
							)
						).view(S0_V1)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_V1.pr("ac_ym"),
						S0_V1.pr(S2_T.itm_cd),
						S0_V1.pr(S2_T.itm_sub1),
						S0_V1.pr(S2_T.itm_sub2),
						S0_V1.pr(S2_T.itm_sub3),
						S0_V1.pr(S2_T.loc_cd),
						S0_V1.pr(S2_T.str_ln_cd),
						S0_V1.pr(S2_T.stk_arrv_bp_cd),
						S0_V1.pr(S2_T.lot_no),
						S0_V1.pr(S2_T.sublot_no),
						S0_V1.pr(S2_T.sno1),
						S0_V1.pr(S2_T.sno2),
						S0_V1.pr(S2_T.sno3),
						S0_V1.pr(S2_T.sno4),
						S0_V1.pr(S2_T.pack_unit_cd),
						S0_V1.pr(S2_T.gd_cd),
						S0_V1.pr(S2_T.in_xfr_typ),
						S0_V1.pr(S2_T.quality_typ),
						S0_V1.pr(S2_T.asst_typ),
						S0_V1.pr(S2_T.stk_insp_typ),
						S0_V1.pr(S2_T.stk_id_typ),
						S0_V1.pr(S2_T.stk_bp_cd)
					)
			);
	}
	
	/**
	 * -- MSBEL0050_MST_NON_MOV_STK_Query_S01
	 */
	static MCQueryPlan MSBEL0050_MST_NON_MOV_STK_S01() {
		MST_NON_MOV_STK_R S0_T = MST_NON_MOV_STK_R.create("T");
		MSW_NON_MOV_STK_KEY_R S1_W1 = MSW_NON_MOV_STK_KEY_R.create("W1");
		MAW_ITM_KEY_R S2_W2 = MAW_ITM_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MST_NON_MOV_STK_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						value(0).as("pack_unit_qty"),
						value(0).as("stk_qty"),
						S0_T.non_mov_base_ym
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.non_mov_base_ym.isNotNull())
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W1)
								.where(
									value(0).eq(value(0))
									.and(S0_T.itm_cd.eq(S1_W1.itm_cd))
									.and(S0_T.itm_sub1.eq(S1_W1.itm_sub1))
									.and(S0_T.itm_sub2.eq(S1_W1.itm_sub2))
									.and(S0_T.itm_sub3.eq(S1_W1.itm_sub3))
									.and(S0_T.loc_cd.eq(S1_W1.loc_cd))
									.and(S0_T.str_ln_cd.eq(S1_W1.str_ln_cd))
									.and(S0_T.stk_arrv_bp_cd.eq(S1_W1.stk_arrv_bp_cd))
									.and(S0_T.lot_no.eq(S1_W1.lot_no))
									.and(S0_T.sublot_no.eq(S1_W1.sublot_no))
									.and(S0_T.sno1.eq(S1_W1.sno1))
									.and(S0_T.sno2.eq(S1_W1.sno2))
									.and(S0_T.sno3.eq(S1_W1.sno3))
									.and(S0_T.sno4.eq(S1_W1.sno4))
									.and(S0_T.pack_unit_cd.eq(S1_W1.pack_unit_cd))
									.and(S0_T.gd_cd.eq(S1_W1.gd_cd))
									.and(S0_T.in_xfr_typ.eq(S1_W1.in_xfr_typ))
									.and(S0_T.quality_typ.eq(S1_W1.quality_typ))
									.and(S0_T.asst_typ.eq(S1_W1.asst_typ))
									.and(S0_T.stk_insp_typ.eq(S1_W1.stk_insp_typ))
									.and(S0_T.stk_id_typ.eq(S1_W1.stk_id_typ))
									.and(S0_T.stk_bp_cd.eq(S1_W1.stk_bp_cd))
								)
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W2)
								.where(
									value(0).eq(value(0))
									.and(S0_T.itm_cd.eq(S2_W2.itm_cd))
									.and(S0_T.itm_sub1.eq(S2_W2.itm_sub1))
									.and(S0_T.itm_sub2.eq(S2_W2.itm_sub2))
									.and(S0_T.itm_sub3.eq(S2_W2.itm_sub3))
								)
							)
						)
					)
			);
	}
	/**
	 * -- MSBEL0050_MSW_MLY_STK_DTL_KEY_Query_I01
	 */
	static MCQueryPlan MSBEL0050_MSW_MLY_STK_DTL_KEY_I01() {
		MSW_MLY_STK_DTL_KEY_R S0 = MSW_MLY_STK_DTL_KEY_R.create();
		MCTempView S1_T = createTempView("T");
		MST_MLY_STK_DTL_R S2_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAM_ITM_R S2_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S2_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S2_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S2_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S2_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S2_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S2_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STR_LN_R S2_M9 = MAM_STR_LN_R.create("M9");
		MAM_BP_R S2_M10 = MAM_BP_R.create("M10");
		MAM_STK_GD_R S2_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S2_M12 = MAM_BP_R.create("M12");
		MAM_UNIT_R S2_M13 = MAM_UNIT_R.create("M13");
		MAM_UNIT_R S2_M14 = MAM_UNIT_R.create("M14");
		MAVM_ITM_UNIT_R S2_M15 = MAVM_ITM_UNIT_R.create("M15");
		MAM_ITM_SITE_R S2_M17 = MAM_ITM_SITE_R.create("M17");
		MAM_DPT_R S2_M18 = MAM_DPT_R.create("M18");
		MSVT_WRK_SNO_R S2_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_SUNDRY_ITM_R S2_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_CO_R S2_M20 = MAM_CO_R.create("M20");
		MAM_CUR_R S2_M21 = MAM_CUR_R.create("M21");
		MAM_LOC_SUB_R S2_M22 = MAM_LOC_SUB_R.create("M22");
		MAVM_RD_LOC_R S2_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S2MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S2MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S2MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S2MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S2MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S2MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S2MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S2MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S2MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S2MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MSW_MLY_STK_DTL_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.ac_ym,
						S0.io_act_typ,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.stk_arrv_bp_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.pack_unit_cd,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.asst_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd
					)
					.query(
						subQuery()
						.select(
							S1_T.pr(S2_T1.ac_ym),
							S1_T.pr(S2_T1.io_act_typ),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr(S2_T1.stk_arrv_bp_cd),
							S1_T.pr(S2_T1.lot_no),
							S1_T.pr(S2_T1.sublot_no),
							S1_T.pr(S2_T1.sno1),
							S1_T.pr(S2_T1.sno2),
							S1_T.pr(S2_T1.sno3),
							S1_T.pr(S2_T1.sno4),
							S1_T.pr(S2_T1.pack_unit_cd),
							S1_T.pr(S2_T1.gd_cd),
							S1_T.pr(S2_T1.in_xfr_typ),
							S1_T.pr(S2_T1.quality_typ),
							S1_T.pr(S2_T1.asst_typ),
							S1_T.pr(S2_T1.stk_insp_typ),
							S1_T.pr(S2_T1.stk_id_typ),
							S1_T.pr(S2_T1.stk_bp_cd)
						)
						.from(
							subQuery()
							.select(
								S2_T1.ac_ym,
								S2_T1.io_act_typ,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd,
								S2_T1.str_ln_cd,
								S2_T1.stk_arrv_bp_cd,
								S2_T1.lot_no,
								S2_T1.sublot_no,
								S2_T1.sno1,
								S2_T1.sno2,
								S2_T1.sno3,
								S2_T1.sno4,
								S2_T1.pack_unit_cd,
								S2_T1.gd_cd,
								S2_T1.in_xfr_typ,
								S2_T1.quality_typ,
								S2_T1.asst_typ,
								S2_T1.stk_insp_typ,
								S2_T1.stk_id_typ,
								S2_T1.stk_bp_cd,
								rowNumber()
									.over()
									.partitionBy(
										S2_T1.io_act_typ,
										S2_T1.itm_cd,
										S2_T1.itm_sub1,
										S2_T1.itm_sub2,
										S2_T1.itm_sub3,
										S2_T1.loc_cd,
										S2_T1.str_ln_cd,
										S2_T1.stk_arrv_bp_cd,
										S2_T1.lot_no,
										S2_T1.sublot_no,
										S2_T1.sno1,
										S2_T1.sno2,
										S2_T1.sno3,
										S2_T1.sno4,
										S2_T1.pack_unit_cd,
										S2_T1.gd_cd,
										S2_T1.in_xfr_typ,
										S2_T1.quality_typ,
										S2_T1.asst_typ,
										S2_T1.stk_insp_typ,
										S2_T1.stk_id_typ,
										S2_T1.stk_bp_cd
									)
									.orderBy(S2_T1.ac_ym.desc()).as("rnum")
							)
							.from(
								S2_T1
								.leftOuterJoin(S2_M1).on(
									S2_T1.itm_cd.eq(S2_M1.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M1.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M1.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M1.itm_sub3))
								)
								.leftOuterJoin(S2_M2).on(
									S2_M1.itm_typ.eq(S2_M2.itm_typ)
									.and(S2_M1.itm_typ_d_cd.eq(S2_M2.itm_typ_d_cd))
								)
								.leftOuterJoin(S2_M3).on(S2_T1.loc_cd.eq(S2_M3.loc_cd))
								.leftOuterJoin(S2_M4).on(S2_M3.site_cd.eq(S2_M4.site_cd))
								.leftOuterJoin(S2_M5).on(S2_M3.wg_cd.eq(S2_M5.wg_cd))
								.leftOuterJoin(S2_M6).on(S2_M3.lg_grp_cd.eq(S2_M6.lg_grp_cd))
								.leftOuterJoin(S2_M7).on(S2_M3.alloc_grp_cd.eq(S2_M7.alloc_grp_cd))
								.leftOuterJoin(S2_M8).on(S2_M3.loc_grp_cd.eq(S2_M8.loc_grp_cd))
								.leftOuterJoin(S2_M9).on(
									S2_T1.loc_cd.eq(S2_M9.loc_cd)
									.and(S2_T1.str_ln_cd.eq(S2_M9.str_ln_cd))
								)
								.leftOuterJoin(S2_M10).on(S2_T1.stk_arrv_bp_cd.eq(S2_M10.bp_cd))
								.leftOuterJoin(S2_M11).on(S2_T1.gd_cd.eq(S2_M11.gd_cd))
								.leftOuterJoin(S2_M12).on(S2_T1.stk_bp_cd.eq(S2_M12.bp_cd))
								.leftOuterJoin(S2_M13).on(S2_T1.pack_unit_cd.eq(S2_M13.unit_cd))
								.leftOuterJoin(S2_M14).on(S2_M1.unit_cd.eq(S2_M14.unit_cd))
								.leftOuterJoin(S2_M15).on(
									S2_T1.itm_cd.eq(S2_M15.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M15.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M15.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M15.itm_sub3))
									.and(S2_T1.pack_unit_cd.eq(S2_M15.unit_cd))
								)
								.leftOuterJoin(S2_M17).on(
									S2_T1.itm_cd.eq(S2_M17.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M17.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M17.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M17.itm_sub3))
									.and(S2_M3.site_cd.eq(S2_M17.site_cd))
								)
								.leftOuterJoin(S2_T5).on(S2_T1.sno1.eq(S2_T5.sno1))
								.leftOuterJoin(S2_M19).on(
									S2_T1.itm_cd.eq(S2_M19.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M19.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M19.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M19.itm_sub3))
									.and(S2_T1.sno1.eq(S2_M19.sno1))
									.and(S2_T1.sno2.eq(S2_M19.sno2))
									.and(S2_T1.sno3.eq(S2_M19.sno3))
									.and(S2_T1.sno4.eq(S2_M19.sno4))
								)
								.crossJoin(S2_M20)
								.leftOuterJoin(S2_M21).on(S2_M20.base_cur_cd.eq(S2_M21.cur_cd))
								.leftOuterJoin(S2_M22).on(
									S2_T1.loc_cd.eq(S2_M22.loc_cd)
									.and(bind("base_dt").gte(S2_M22.st_dt))
									.and(bind("base_dt").lte(S2_M22.end_dt))
								)
								.leftOuterJoin(S2_M18).on(
									coalesce(
										S2_M22.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).eq(S2_M18.dpt_cd)
									.and(bind("base_dt").between(S2_M18.st_dt, S2_M18.end_dt))
								)
								.innerJoin(S2_M99).on(S2_T1.loc_cd.eq(S2_M99.loc_cd))
								.addDynamicView(DS1C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.ac_ym.lte(bind("non_mov_cmp_ym")))
								.and(S2_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
								.cutoff$and(S2_T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_M3.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_T1.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_M9.str_ln_nm.like(bind("str_ln_nm")))
								.cutoff$and(S2_M3.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_M4.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_M3.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_M5.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_M3.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M6.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2_M3.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M8.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(
									coalesce(
										S2_M22.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).like(bind("dpt_cd"))
								)
								.cutoff$and(S2_M18.dpt_nm.like(bind("dpt_nm")))
								.cutoff$and(S2_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										S2_M19.itm_nm,
										S2_M1.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T1.sno1.like(bind("sno1")))
								.cutoff$and(S2_T1.sno2.like(bind("sno2")))
								.cutoff$and(S2_T1.sno3.like(bind("sno3")))
								.cutoff$and(S2_T1.sno4.like(bind("sno4")))
								.cutoff$and(S2_T5.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_T5.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2_T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S2_T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2_M12.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2_T1.in_xfr_typ.like(bind("in_xfr_typ")))
								.cutoff$and(S2_T1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2_T1.stk_insp_typ.like(bind("stk_insp_typ")))
								.cutoff$and(S2_T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2_M11.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
								.cutoff$and(S2_M10.bp_nm.like(bind("stk_arrv_bp_nm")))
								.cutoff$and(
									not(
										S2_M3.sppl_cd.isNull()
										.and(S2_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
									)
									.and(bind("only_int_true").isNotNull())
								)
								.cutoff$and(S2_T1.pack_unit_cd.like(bind("pack_unit_cd")))
								.cutoff$and(S2_M13.unit_nm.like(bind("pack_unit_nm")))
								.addDynamicPredicate(DS1C_ITM_GRP)
							).view(S1_T)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.pr("rnum").eq(value(1)))
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd1.as("itm_grp_cd1"), S2MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM1).on(S2_M1.itm_grp_cd1.eq(S2MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2MM1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S2MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd2.as("itm_grp_cd2"), S2MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM2).on(S2_M1.itm_grp_cd2.eq(S2MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2MM2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S2MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd3.as("itm_grp_cd3"), S2MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM3).on(S2_M1.itm_grp_cd3.eq(S2MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2MM3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S2MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd4.as("itm_grp_cd4"), S2MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM4).on(S2_M1.itm_grp_cd4.eq(S2MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2MM4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S2MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd5.as("itm_grp_cd5"), S2MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM5).on(S2_M1.itm_grp_cd5.eq(S2MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2MM5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S2MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd6.as("itm_grp_cd6"), S2MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM6).on(S2_M1.itm_grp_cd6.eq(S2MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2MM6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S2MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd7.as("itm_grp_cd7"), S2MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM7).on(S2_M1.itm_grp_cd7.eq(S2MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2MM7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S2MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd8.as("itm_grp_cd8"), S2MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM8).on(S2_M1.itm_grp_cd8.eq(S2MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2MM8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S2MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd9.as("itm_grp_cd9"), S2MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM9).on(S2_M1.itm_grp_cd9.eq(S2MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2MM9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S2MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd10.as("itm_grp_cd10"), S2MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM10).on(S2_M1.itm_grp_cd10.eq(S2MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2MM10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S2MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL0050_MSW_MLY_STK_DTL_KEY_Query_I02
	 */
	static MCQueryPlan MSBEL0050_MSW_MLY_STK_DTL_KEY_I02() {
		MSW_MLY_STK_DTL_KEY_R S0 = MSW_MLY_STK_DTL_KEY_R.create();
		MST_MLY_STK_DTL_R S1_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S1_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S1_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S1_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STR_LN_R S1_M9 = MAM_STR_LN_R.create("M9");
		MAM_BP_R S1_M10 = MAM_BP_R.create("M10");
		MAM_STK_GD_R S1_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_UNIT_R S1_M13 = MAM_UNIT_R.create("M13");
		MAM_UNIT_R S1_M14 = MAM_UNIT_R.create("M14");
		MAVM_ITM_UNIT_R S1_M15 = MAVM_ITM_UNIT_R.create("M15");
		MAM_ITM_SITE_R S1_M17 = MAM_ITM_SITE_R.create("M17");
		MAM_DPT_R S1_M18 = MAM_DPT_R.create("M18");
		MSVT_WRK_SNO_R S1_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_SUNDRY_ITM_R S1_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_CO_R S1_M20 = MAM_CO_R.create("M20");
		MAM_CUR_R S1_M21 = MAM_CUR_R.create("M21");
		MAM_LOC_SUB_R S1_M22 = MAM_LOC_SUB_R.create("M22");
		MAVM_RD_LOC_R S1_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S1MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MSW_MLY_STK_DTL_KEY_Query_I02")
					.insert(S0)
					.columns(
						S0.ac_ym,
						S0.io_act_typ,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.stk_arrv_bp_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.pack_unit_cd,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.asst_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd
					)
					.query(
						subQuery()
						.selectDistinct(
							S1_T1.ac_ym,
							S1_T1.io_act_typ,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.pack_unit_cd,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.asst_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_M1).on(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
							)
							.leftOuterJoin(S1_M2).on(
								S1_M1.itm_typ.eq(S1_M2.itm_typ)
								.and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M3).on(S1_T1.loc_cd.eq(S1_M3.loc_cd))
							.leftOuterJoin(S1_M4).on(S1_M3.site_cd.eq(S1_M4.site_cd))
							.leftOuterJoin(S1_M5).on(S1_M3.wg_cd.eq(S1_M5.wg_cd))
							.leftOuterJoin(S1_M6).on(S1_M3.lg_grp_cd.eq(S1_M6.lg_grp_cd))
							.leftOuterJoin(S1_M7).on(S1_M3.alloc_grp_cd.eq(S1_M7.alloc_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_M3.loc_grp_cd.eq(S1_M8.loc_grp_cd))
							.leftOuterJoin(S1_M9).on(
								S1_T1.loc_cd.eq(S1_M9.loc_cd)
								.and(S1_T1.str_ln_cd.eq(S1_M9.str_ln_cd))
							)
							.leftOuterJoin(S1_M10).on(S1_T1.stk_arrv_bp_cd.eq(S1_M10.bp_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.gd_cd.eq(S1_M11.gd_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.stk_bp_cd.eq(S1_M12.bp_cd))
							.leftOuterJoin(S1_M13).on(S1_T1.pack_unit_cd.eq(S1_M13.unit_cd))
							.leftOuterJoin(S1_M14).on(S1_M1.unit_cd.eq(S1_M14.unit_cd))
							.leftOuterJoin(S1_M15).on(
								S1_T1.itm_cd.eq(S1_M15.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M15.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M15.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M15.itm_sub3))
								.and(S1_T1.pack_unit_cd.eq(S1_M15.unit_cd))
							)
							.leftOuterJoin(S1_M17).on(
								S1_T1.itm_cd.eq(S1_M17.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M17.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M17.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M17.itm_sub3))
								.and(S1_M3.site_cd.eq(S1_M17.site_cd))
							)
							.leftOuterJoin(S1_T5).on(S1_T1.sno1.eq(S1_T5.sno1))
							.leftOuterJoin(S1_M19).on(
								S1_T1.itm_cd.eq(S1_M19.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M19.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M19.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M19.itm_sub3))
								.and(S1_T1.sno1.eq(S1_M19.sno1))
								.and(S1_T1.sno2.eq(S1_M19.sno2))
								.and(S1_T1.sno3.eq(S1_M19.sno3))
								.and(S1_T1.sno4.eq(S1_M19.sno4))
							)
							.crossJoin(S1_M20)
							.leftOuterJoin(S1_M21).on(S1_M20.base_cur_cd.eq(S1_M21.cur_cd))
							.leftOuterJoin(S1_M22).on(
								S1_T1.loc_cd.eq(S1_M22.loc_cd)
								.and(bind("base_dt").gte(S1_M22.st_dt))
								.and(bind("base_dt").lte(S1_M22.end_dt))
							)
							.leftOuterJoin(S1_M18).on(
								coalesce(
									S1_M22.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).eq(S1_M18.dpt_cd)
								.and(bind("base_dt").between(S1_M18.st_dt, S1_M18.end_dt))
							)
							.innerJoin(S1_M99).on(S1_T1.loc_cd.eq(S1_M99.loc_cd))
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
							.and(S1_T1.ac_ym.gte(bind("ym_fr")))
							.and(S1_T1.ac_ym.lte(bind("ym_to")))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_M9.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M4.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M8.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(
								coalesce(
									S1_M22.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).like(bind("dpt_cd"))
							)
							.cutoff$and(S1_M18.dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M19.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T5.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_M12.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1_T1.in_xfr_typ.like(bind("in_xfr_typ")))
							.cutoff$and(S1_T1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T1.stk_insp_typ.like(bind("stk_insp_typ")))
							.cutoff$and(S1_T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M11.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
							.cutoff$and(S1_M10.bp_nm.like(bind("stk_arrv_bp_nm")))
							.cutoff$and(
								not(
									S1_M3.sppl_cd.isNull()
									.and(S1_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
								)
								.and(bind("only_int_true").isNotNull())
							)
							.cutoff$and(S1_T1.pack_unit_cd.like(bind("pack_unit_cd")))
							.cutoff$and(S1_M13.unit_nm.like(bind("pack_unit_nm")))
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1_M1.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1_M1.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1_M1.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1_M1.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1_M1.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1_M1.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1_M1.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1_M1.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1_M1.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1_M1.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL0050_MSW_NON_MOV_STK_KEY_Query_I01
	 */
	static MCQueryPlan MSBEL0050_MSW_NON_MOV_STK_KEY_I01() {
		MSW_NON_MOV_STK_KEY_R S0 = MSW_NON_MOV_STK_KEY_R.create();
		MST_NON_MOV_STK_R S1_T1 = MST_NON_MOV_STK_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S1_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S1_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S1_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STR_LN_R S1_M9 = MAM_STR_LN_R.create("M9");
		MAM_BP_R S1_M10 = MAM_BP_R.create("M10");
		MAM_STK_GD_R S1_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_UNIT_R S1_M13 = MAM_UNIT_R.create("M13");
		MAM_UNIT_R S1_M14 = MAM_UNIT_R.create("M14");
		MAVM_ITM_UNIT_R S1_M15 = MAVM_ITM_UNIT_R.create("M15");
		MAM_ITM_SITE_R S1_M17 = MAM_ITM_SITE_R.create("M17");
		MAM_DPT_R S1_M18 = MAM_DPT_R.create("M18");
		MSVT_WRK_SNO_R S1_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_SUNDRY_ITM_R S1_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_CO_R S1_M20 = MAM_CO_R.create("M20");
		MAM_CUR_R S1_M21 = MAM_CUR_R.create("M21");
		MAM_LOC_SUB_R S1_M22 = MAM_LOC_SUB_R.create("M22");
		MAVM_RD_LOC_R S1_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S1MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0050_MSW_NON_MOV_STK_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.stk_arrv_bp_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.pack_unit_cd,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.asst_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd
					)
					.query(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.pack_unit_cd,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.asst_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_M1).on(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
							)
							.leftOuterJoin(S1_M2).on(
								S1_M1.itm_typ.eq(S1_M2.itm_typ)
								.and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M3).on(S1_T1.loc_cd.eq(S1_M3.loc_cd))
							.leftOuterJoin(S1_M4).on(S1_M3.site_cd.eq(S1_M4.site_cd))
							.leftOuterJoin(S1_M5).on(S1_M3.wg_cd.eq(S1_M5.wg_cd))
							.leftOuterJoin(S1_M6).on(S1_M3.lg_grp_cd.eq(S1_M6.lg_grp_cd))
							.leftOuterJoin(S1_M7).on(S1_M3.alloc_grp_cd.eq(S1_M7.alloc_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_M3.loc_grp_cd.eq(S1_M8.loc_grp_cd))
							.leftOuterJoin(S1_M9).on(
								S1_T1.loc_cd.eq(S1_M9.loc_cd)
								.and(S1_T1.str_ln_cd.eq(S1_M9.str_ln_cd))
							)
							.leftOuterJoin(S1_M10).on(S1_T1.stk_arrv_bp_cd.eq(S1_M10.bp_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.gd_cd.eq(S1_M11.gd_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.stk_bp_cd.eq(S1_M12.bp_cd))
							.leftOuterJoin(S1_M13).on(S1_T1.pack_unit_cd.eq(S1_M13.unit_cd))
							.leftOuterJoin(S1_M14).on(S1_M1.unit_cd.eq(S1_M14.unit_cd))
							.leftOuterJoin(S1_M15).on(
								S1_T1.itm_cd.eq(S1_M15.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M15.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M15.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M15.itm_sub3))
								.and(S1_T1.pack_unit_cd.eq(S1_M15.unit_cd))
							)
							.leftOuterJoin(S1_M17).on(
								S1_T1.itm_cd.eq(S1_M17.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M17.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M17.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M17.itm_sub3))
								.and(S1_M3.site_cd.eq(S1_M17.site_cd))
							)
							.leftOuterJoin(S1_T5).on(S1_T1.sno1.eq(S1_T5.sno1))
							.leftOuterJoin(S1_M19).on(
								S1_T1.itm_cd.eq(S1_M19.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M19.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M19.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M19.itm_sub3))
								.and(S1_T1.sno1.eq(S1_M19.sno1))
								.and(S1_T1.sno2.eq(S1_M19.sno2))
								.and(S1_T1.sno3.eq(S1_M19.sno3))
								.and(S1_T1.sno4.eq(S1_M19.sno4))
							)
							.crossJoin(S1_M20)
							.leftOuterJoin(S1_M21).on(S1_M20.base_cur_cd.eq(S1_M21.cur_cd))
							.leftOuterJoin(S1_M22).on(
								S1_T1.loc_cd.eq(S1_M22.loc_cd)
								.and(bind("base_dt").gte(S1_M22.st_dt))
								.and(bind("base_dt").lte(S1_M22.end_dt))
							)
							.leftOuterJoin(S1_M18).on(
								coalesce(
									S1_M22.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).eq(S1_M18.dpt_cd)
								.and(bind("base_dt").between(S1_M18.st_dt, S1_M18.end_dt))
							)
							.innerJoin(S1_M99).on(S1_T1.loc_cd.eq(S1_M99.loc_cd))
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.non_mov_base_ym.gte(addMonths(
										bind("non_mov_cmp_ym"),
										value(0).subtract(bind("non_mov_calc_mons"))
									)
								)
							)
							.and(S1_T1.non_mov_base_ym.lte(bind("non_mov_cmp_ym")))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_M9.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M4.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M8.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(
								coalesce(
									S1_M22.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).like(bind("dpt_cd"))
							)
							.cutoff$and(S1_M18.dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M19.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T5.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_M12.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1_T1.in_xfr_typ.like(bind("in_xfr_typ")))
							.cutoff$and(S1_T1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T1.stk_insp_typ.like(bind("stk_insp_typ")))
							.cutoff$and(S1_T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M11.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
							.cutoff$and(S1_M10.bp_nm.like(bind("stk_arrv_bp_nm")))
							.cutoff$and(
								not(
									S1_M3.sppl_cd.isNull()
									.and(S1_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
								)
								.and(bind("only_int_true").isNotNull())
							)
							.cutoff$and(S1_T1.pack_unit_cd.like(bind("pack_unit_cd")))
							.cutoff$and(S1_M13.unit_nm.like(bind("pack_unit_nm")))
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1_M1.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1_M1.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1_M1.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1_M1.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1_M1.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1_M1.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1_M1.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1_M1.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1_M1.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1_M1.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}