package mcframe.serverMGBD.MGBDL0410;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBDL0410_MGW_IMP_ITM_DTL_Query_S01
	 */
	static MCQueryPlan MGBDL0410_MGW_IMP_ITM_DTL_S01() {
		MGW_IMP_ITM_DTL_R S0_T = MGW_IMP_ITM_DTL_R.create("T");
		MCTempView S0_T1 = createTempView("T1");
		MCTempView S0_T2 = createTempView("T2");
		MCTempView S0_T3 = createTempView("T3");
		MCTempView S0_T4 = createTempView("T4");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_LOC_SPPL = MAM_BP_R.create("LOC_SPPL");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_RD_WG_R S0_RQST_WG = MAVM_RD_WG_R.create("RQST_WG");
		MAM_COST_DPT_R S0_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_COST_DPT_R S0_EXP_DPT = MAM_COST_DPT_R.create("EXP_DPT");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MGT_ITM_DTL_R S1_T = MGT_ITM_DTL_R.create("T");
		MAVM_RD_WG_R S2_W = MAVM_RD_WG_R.create("W");
		MGW_IMP_ITM_DTL_R S3_T = MGW_IMP_ITM_DTL_R.create("T");
		MAVM_RD_WG_R S4_W = MAVM_RD_WG_R.create("W");
		MGT_ITM_DTL_R S5_W = MGT_ITM_DTL_R.create("W");
		MGT_ITM_DTL_R S6_T = MGT_ITM_DTL_R.create("T");
		MAVM_RD_WG_R S7_W = MAVM_RD_WG_R.create("W");
		MGW_IMP_ITM_DTL_R S8_W = MGW_IMP_ITM_DTL_R.create("W");
		MGW_IMP_ITM_DTL_R S9_W = MGW_IMP_ITM_DTL_R.create("W");
		MGW_IMP_ITM_DTL_R S10_T = MGW_IMP_ITM_DTL_R.create("T");
		MAVM_RD_WG_R S11_W = MAVM_RD_WG_R.create("W");
		MGT_ITM_DTL_R S12_W = MGT_ITM_DTL_R.create("W");
		MGT_ITM_DTL_R S13_W = MGT_ITM_DTL_R.create("W");
		MAVM_RD_WG_R S14_W = MAVM_RD_WG_R.create("W");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS10D = createDynamicSQLID("DS10D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS3D = createDynamicSQLID("DS3D");
		MCDynamicSQLID DS6D = createDynamicSQLID("DS6D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0410_MGW_IMP_ITM_DTL_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_T1.pr(S1_T.itm_cd),
							nullValue(),
							value(true),
							value(false)
						).as("no_exist_flg"),
						decode(
							S0_T.itm_cd,
							S0_T4.pr(S10_T.itm_cd),
							value(true),
							decode(
								S0_T.itm_cd,
								S0_T3.pr(S6_T.itm_cd),
								value(true),
								decode(
									S0_T.itm_cd,
									S0_T2.pr(S3_T.itm_cd),
									value(true),
									value(false)
								)
							)
						).as("change_flg"),
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_T.loc_cd,
						S0_LOC.loc_nm,
						S0_T.sppl_cd,
						S0_T.rqst_wg_cd,
						S0_T.cost_ratio,
						S0_T.oper_ptn,
						S0_T.bom_ptn,
						S0_T.min_lot_qty,
						S0_T.batch_lot_qty,
						S0_T.fxd_lot_qty,
						S0_T.fxd_yield_qty,
						S0_T.nmr_qty,
						S0_T.dnm_qty,
						S0_T.alc_dpt_cd,
						S0_T.exp_dpt_cd,
						S0_T.exp_prio,
						S0_T.max_qty,
						S0_T.alc_val1,
						S0_T.alc_val2,
						S0_T.alc_val3,
						S0_T.alc_val4,
						S0_T.alc_val5,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.imp_err_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T.term,
								S1_T.calc_ctg_cd,
								S1_T.wg_cd
							)
							.from(S1_T)
							.where(
								value(0).eq(value(0))
								.and(S1_T.term.eq(bind("term")))
								.and(S1_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
								.cutoff$and(S1_T.wg_cd.eq(bind("wg_cd")))
								.addDynamicPredicate(DS1D)
							).view(S0_T1)
						).on(
							S0_T.itm_cd.eq(S0_T1.pr(S1_T.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_T1.pr(S1_T.itm_sub1)))
							.and(S0_T.itm_sub2.eq(S0_T1.pr(S1_T.itm_sub2)))
							.and(S0_T.itm_sub3.eq(S0_T1.pr(S1_T.itm_sub3)))
							.and(S0_T.term.eq(S0_T1.pr(S1_T.term)))
							.and(S0_T.calc_ctg_cd.eq(S0_T1.pr(S1_T.calc_ctg_cd)))
							.and(S0_T.wg_cd.eq(S0_T1.pr(S1_T.wg_cd)))
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S3_T.itm_cd,
								S3_T.itm_sub1,
								S3_T.itm_sub2,
								S3_T.itm_sub3,
								S3_T.term,
								S3_T.calc_ctg_cd,
								S3_T.wg_cd
							)
							.from(S3_T)
							.where(
								value(0).eq(value(0))
								.and(S3_T.term.eq(bind("term")))
								.and(S3_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
								.cutoff$and(S3_T.wg_cd.eq(bind("wg_cd")))
								.addDynamicPredicate(DS3D)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S5_W)
										.where(
											value(0).eq(value(0))
											.and(S3_T.itm_cd.eq(S5_W.itm_cd))
											.and(S3_T.itm_sub1.eq(S5_W.itm_sub1))
											.and(S3_T.itm_sub2.eq(S5_W.itm_sub2))
											.and(S3_T.itm_sub3.eq(S5_W.itm_sub3))
											.and(S3_T.loc_cd.eq(S5_W.loc_cd))
											.and(S3_T.sppl_cd.eq(S5_W.sppl_cd))
											.and(S3_T.rqst_wg_cd.eq(S5_W.rqst_wg_cd))
											.and(S3_T.term.eq(S5_W.term))
											.and(S3_T.calc_ctg_cd.eq(S5_W.calc_ctg_cd))
											.and(S3_T.wg_cd.eq(S5_W.wg_cd))
											.and(
												S3_T.cost_ratio.neq(S5_W.cost_ratio)
												.or(
													decode(
														S3_T.oper_ptn,
														S5_W.oper_ptn,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.bom_ptn,
														S5_W.bom_ptn,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(S3_T.min_lot_qty.neq(S5_W.min_lot_qty))
												.or(S3_T.batch_lot_qty.neq(S5_W.batch_lot_qty))
												.or(S3_T.fxd_lot_qty.neq(S5_W.fxd_lot_qty))
												.or(S3_T.fxd_yield_qty.neq(S5_W.fxd_yield_qty))
												.or(S3_T.nmr_qty.neq(S5_W.nmr_qty))
												.or(S3_T.dnm_qty.neq(S5_W.dnm_qty))
												.or(
													decode(
														S3_T.alc_dpt_cd,
														S5_W.alc_dpt_cd,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.exp_dpt_cd,
														S5_W.exp_dpt_cd,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.exp_prio,
														S5_W.exp_prio,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.max_qty,
														S5_W.max_qty,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.alc_val1,
														S5_W.alc_val1,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.alc_val2,
														S5_W.alc_val2,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.alc_val3,
														S5_W.alc_val3,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.alc_val4,
														S5_W.alc_val4,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(
													decode(
														S3_T.alc_val5,
														S5_W.alc_val5,
														value(true),
														value(false)
													).eq(value(false))
												)
												.or(S3_T.non_calc_flg.neq(S5_W.non_calc_flg))
											)
										)
									)
								)
							).view(S0_T2)
						).on(
							S0_T.itm_cd.eq(S0_T2.pr(S3_T.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_T2.pr(S3_T.itm_sub1)))
							.and(S0_T.itm_sub2.eq(S0_T2.pr(S3_T.itm_sub2)))
							.and(S0_T.itm_sub3.eq(S0_T2.pr(S3_T.itm_sub3)))
							.and(S0_T.term.eq(S0_T2.pr(S3_T.term)))
							.and(S0_T.calc_ctg_cd.eq(S0_T2.pr(S3_T.calc_ctg_cd)))
							.and(S0_T.wg_cd.eq(S0_T2.pr(S3_T.wg_cd)))
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S6_T.itm_cd,
								S6_T.itm_sub1,
								S6_T.itm_sub2,
								S6_T.itm_sub3,
								S6_T.term,
								S6_T.calc_ctg_cd,
								S6_T.wg_cd
							)
							.from(S6_T)
							.where(
								value(0).eq(value(0))
								.and(S6_T.term.eq(bind("term")))
								.and(S6_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
								.cutoff$and(S6_T.wg_cd.eq(bind("wg_cd")))
								.addDynamicPredicate(DS6D)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S8_W)
										.where(
											value(0).eq(value(0))
											.and(S6_T.itm_cd.eq(S8_W.itm_cd))
											.and(S6_T.itm_sub1.eq(S8_W.itm_sub1))
											.and(S6_T.itm_sub2.eq(S8_W.itm_sub2))
											.and(S6_T.itm_sub3.eq(S8_W.itm_sub3))
											.and(S6_T.term.eq(S8_W.term))
											.and(S6_T.calc_ctg_cd.eq(S8_W.calc_ctg_cd))
											.and(S6_T.wg_cd.eq(S8_W.wg_cd))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S9_W)
										.where(
											value(0).eq(value(0))
											.and(S6_T.itm_cd.eq(S9_W.itm_cd))
											.and(S6_T.itm_sub1.eq(S9_W.itm_sub1))
											.and(S6_T.itm_sub2.eq(S9_W.itm_sub2))
											.and(S6_T.itm_sub3.eq(S9_W.itm_sub3))
											.and(S6_T.loc_cd.eq(S9_W.loc_cd))
											.and(S6_T.sppl_cd.eq(S9_W.sppl_cd))
											.and(S6_T.rqst_wg_cd.eq(S9_W.rqst_wg_cd))
											.and(S6_T.term.eq(S9_W.term))
											.and(S6_T.calc_ctg_cd.eq(S9_W.calc_ctg_cd))
											.and(S6_T.wg_cd.eq(S9_W.wg_cd))
										)
									)
								)
							).view(S0_T3)
						).on(
							S0_T.itm_cd.eq(S0_T3.pr(S6_T.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_T3.pr(S6_T.itm_sub1)))
							.and(S0_T.itm_sub2.eq(S0_T3.pr(S6_T.itm_sub2)))
							.and(S0_T.itm_sub3.eq(S0_T3.pr(S6_T.itm_sub3)))
							.and(S0_T.term.eq(S0_T3.pr(S6_T.term)))
							.and(S0_T.calc_ctg_cd.eq(S0_T3.pr(S6_T.calc_ctg_cd)))
							.and(S0_T.wg_cd.eq(S0_T3.pr(S6_T.wg_cd)))
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S10_T.itm_cd,
								S10_T.itm_sub1,
								S10_T.itm_sub2,
								S10_T.itm_sub3,
								S10_T.term,
								S10_T.calc_ctg_cd,
								S10_T.wg_cd
							)
							.from(S10_T)
							.where(
								value(0).eq(value(0))
								.and(S10_T.term.eq(bind("term")))
								.and(S10_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
								.cutoff$and(S10_T.wg_cd.eq(bind("wg_cd")))
								.addDynamicPredicate(DS10D)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S12_W)
										.where(
											value(0).eq(value(0))
											.and(S10_T.itm_cd.eq(S12_W.itm_cd))
											.and(S10_T.itm_sub1.eq(S12_W.itm_sub1))
											.and(S10_T.itm_sub2.eq(S12_W.itm_sub2))
											.and(S10_T.itm_sub3.eq(S12_W.itm_sub3))
											.and(S10_T.term.eq(S12_W.term))
											.and(S10_T.calc_ctg_cd.eq(S12_W.calc_ctg_cd))
											.and(S10_T.wg_cd.eq(S12_W.wg_cd))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S13_W)
										.where(
											value(0).eq(value(0))
											.and(S10_T.itm_cd.eq(S13_W.itm_cd))
											.and(S10_T.itm_sub1.eq(S13_W.itm_sub1))
											.and(S10_T.itm_sub2.eq(S13_W.itm_sub2))
											.and(S10_T.itm_sub3.eq(S13_W.itm_sub3))
											.and(S10_T.loc_cd.eq(S13_W.loc_cd))
											.and(S10_T.sppl_cd.eq(S13_W.sppl_cd))
											.and(S10_T.rqst_wg_cd.eq(S13_W.rqst_wg_cd))
											.and(S10_T.term.eq(S13_W.term))
											.and(S10_T.calc_ctg_cd.eq(S13_W.calc_ctg_cd))
											.and(S10_T.wg_cd.eq(S13_W.wg_cd))
										)
									)
								)
							).view(S0_T4)
						).on(
							S0_T.itm_cd.eq(S0_T4.pr(S10_T.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_T4.pr(S10_T.itm_sub1)))
							.and(S0_T.itm_sub2.eq(S0_T4.pr(S10_T.itm_sub2)))
							.and(S0_T.itm_sub3.eq(S0_T4.pr(S10_T.itm_sub3)))
							.and(S0_T.term.eq(S0_T4.pr(S10_T.term)))
							.and(S0_T.calc_ctg_cd.eq(S0_T4.pr(S10_T.calc_ctg_cd)))
							.and(S0_T.wg_cd.eq(S0_T4.pr(S10_T.wg_cd)))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd))
						.leftOuterJoin(S0_LOC_SPPL).on(S0_LOC.sppl_cd.eq(S0_LOC_SPPL.bp_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.term.eq(bind("term")))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.cutoff$and(S0_T.wg_cd.eq(bind("wg_cd")))
						.addDynamicPredicate(DS0D)
						.and(
							value(0).eq(value(1))
							.cutoff$or(
								bracket(
									decode(
										S0_T1.pr(S1_T.itm_cd),
										nullValue(),
										value(true),
										value(false)
									).eq(bind("no_exist_flg_str"))
								)
							)
							.cutoff$or(
								bracket(
									decode(
										S0_T.itm_cd,
										S0_T4.pr(S10_T.itm_cd),
										value(true),
										decode(
											S0_T.itm_cd,
											S0_T3.pr(S6_T.itm_cd),
											value(true),
											decode(
												S0_T.itm_cd,
												S0_T2.pr(S3_T.itm_cd),
												value(true),
												value(false)
											)
										)
									).eq(bind("change_flg_str"))
								)
							)
							.cutoff$or(
								bracket(
									bracket(
										decode(
											S0_T1.pr(S1_T.itm_cd),
											nullValue(),
											value(true),
											value(false)
										).eq(bind("exist_flg_str"))
									)
									.and(
										decode(
											S0_T.itm_cd,
											S0_T4.pr(S10_T.itm_cd),
											value(true),
											decode(
												S0_T.itm_cd,
												S0_T3.pr(S6_T.itm_cd),
												value(true),
												decode(
													S0_T.itm_cd,
													S0_T2.pr(S3_T.itm_cd),
													value(true),
													value(false)
												)
											)
										).eq(bind("exist_flg_str"))
									)
								)
							)
						)
						.cutoff$and(S0_T.imp_err_flg.eq(bind("imp_err_flg_str")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T.term.asc(),
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.sppl_cd.asc(),
						S0_T.rqst_wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cmn_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(value("X")).from(S14_W).where(S14_W.wg_cd.eq(S0_T.wg_cd))))),
				when(boundOr("def_wg_cd"))
					.predicate(DS0D, p -> p.cutoff$and(bracket(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(S0_T.wg_cd.eq(bind("def_wg_cd")))))),
				when(boundOr("cmn_flg"))
					.predicate(DS1D, p -> p.and(S1_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_flg"))
					.predicate(DS1D, p -> p.and(exists(subQuery().select(value("X")).from(S2_W).where(S2_W.wg_cd.eq(S1_T.wg_cd))))),
				when(boundOr("def_wg_cd"))
					.predicate(DS1D, p -> p.cutoff$and(bracket(S1_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(S1_T.wg_cd.eq(bind("def_wg_cd")))))),
				when(boundOr("cmn_flg"))
					.predicate(DS3D, p -> p.and(S3_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_flg"))
					.predicate(DS3D, p -> p.and(exists(subQuery().select(value("X")).from(S4_W).where(S4_W.wg_cd.eq(S3_T.wg_cd))))),
				when(boundOr("def_wg_cd"))
					.predicate(DS3D, p -> p.cutoff$and(bracket(S3_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(S3_T.wg_cd.eq(bind("def_wg_cd")))))),
				when(boundOr("cmn_flg"))
					.predicate(DS6D, p -> p.and(S6_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_flg"))
					.predicate(DS6D, p -> p.and(exists(subQuery().select(value("X")).from(S7_W).where(S7_W.wg_cd.eq(S6_T.wg_cd))))),
				when(boundOr("def_wg_cd"))
					.predicate(DS6D, p -> p.cutoff$and(bracket(S6_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(S6_T.wg_cd.eq(bind("def_wg_cd")))))),
				when(boundOr("cmn_flg"))
					.predicate(DS10D, p -> p.and(S10_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_flg"))
					.predicate(DS10D, p -> p.and(exists(subQuery().select(value("X")).from(S11_W).where(S11_W.wg_cd.eq(S10_T.wg_cd))))),
				when(boundOr("def_wg_cd"))
					.predicate(DS10D, p -> p.cutoff$and(bracket(S10_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(S10_T.wg_cd.eq(bind("def_wg_cd"))))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_RD_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("alc_dpt_cd"),
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("exp_dpt_cd"),
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("exp_dpt_nm", m.dpt_nm());
					})
				)
			);
	}
}