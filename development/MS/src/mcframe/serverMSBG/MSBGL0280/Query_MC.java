package mcframe.serverMSBG.MSBGL0280;

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
	 * -- MSBGL0280_MAM_CRED_CTRL_Query_S01
	 */
	static MCQueryPlan MSBGL0280_MAM_CRED_CTRL_S01() {
		MAM_CRED_CTRL_R S0_M1 = MAM_CRED_CTRL_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
		MST_CRED_R S0_T1 = MST_CRED_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0280_MAM_CRED_CTRL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.cred_cd,
						S0_M2.bp_nm.as("cred_nm"),
						S0_M1.cur_cd,
						S0_M3.cur_nm,
						S0_M3.amt_dec_place,
						S0_M1.cred_limit,
						nvl(
							S0_T1.cred_amt,
							value(0)
						).as("ttl_cred_amt"),
						bracket(
							S0_M1.cred_limit.subtract(
								nvl(
									S0_T1.cred_amt,
									value(0)
								)
							)
						).as("cred_bal")
					)
					.from(
						S0_M1
						.innerJoin(S0_M2).on(S0_M2.bp_cd.eq(S0_M1.cred_cd))
						.innerJoin(S0_M3).on(S0_M3.cur_cd.eq(S0_M1.cur_cd))
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_T1.cred_cd.eq(S0_M1.cred_cd)
								.and(S0_T1.trd_cur_cd.eq(S0_M1.cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M2.cred_flg.eq(value(true)))
						.and(S0_M1.cred_cd.eq(bind("cred_cd")))
						.and(S0_M1.cur_cd.eq(bind("cur_cd")))
					)
			);
	}
	
	/**
	 * -- MSBGL0280_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL0280_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R S0_T1 = MST_ADV_PAY_ACT_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0280_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(sum(S0_T1.trd_cur_setoff_tgt_amt.subtract(S0_T1.trd_cur_setoff_act_amt)).as("ttl_adv_pay"))
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.bsppl_cd.eq(S0_M1.bp_cd)
								.and(S0_M1.bsppl_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(S0_M1.ap_cred_cd.eq(bind("cred_cd")))
						.and(S0_T1.trd_cur_cd.eq(bind("cur_cd")))
					)
			);
	}
	
	/**
	 * -- MSBGL0280_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL0280_MST_MLY_AR_BAL_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MST_MLY_AR_BAL_R S1_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		MAM_BP_R S1_MB1 = MAM_BP_R.create("MB1");
		MAM_DPT_R S1_MB2 = MAM_DPT_R.create("MB2");
		MST_MLY_AR_BAL_R S2_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		MAM_BP_R S2_MB1 = MAM_BP_R.create("MB1");
		MAM_DPT_R S2_MB2 = MAM_DPT_R.create("MB2");
		MCTempView S3_V1 = createTempView("V1");
		MAM_TAX_R S3_MB1 = MAM_TAX_R.create("MB1");
		MAM_BP_R S3_MB2 = MAM_BP_R.create("MB2");
		MAM_CUR_R S3_MB3 = MAM_CUR_R.create("MB3");
		MAM_DPT_R S3_MB4 = MAM_DPT_R.create("MB4");
		MAM_BP_R S3_MB5 = MAM_BP_R.create("MB5");
		MST_SLS_SCHD_R S4_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SLO_D_R S4_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S4_T3 = MST_SLO_R.create("T3");
		MST_SHIP_PR_R S4_T4 = MST_SHIP_PR_R.create("T4");
		MAVM_ITM_UNIT_R S4_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S4_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S4_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S5_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S5_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S5_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S5_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S5_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SLO_D_R S5_T6 = MST_SLO_D_R.create("T6");
		MST_SLO_R S5_T7 = MST_SLO_R.create("T7");
		MAVM_ITM_UNIT_R S5_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S5_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S5_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S6_T1 = MST_SLS_SCHD_R.create("T1");
		MST_DLV_SLIP_D_R S6_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R S6_T3 = MST_DLV_SLIP_R.create("T3");
		MST_SLO_D_R S6_T4 = MST_SLO_D_R.create("T4");
		MST_SLO_R S6_T5 = MST_SLO_R.create("T5");
		MST_DLV_SLIP_R S6_T6 = MST_DLV_SLIP_R.create("T6");
		MAVM_ITM_UNIT_R S6_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S6_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S6_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S7_T1 = MST_SLS_SCHD_R.create("T1");
		MST_IV_D_R S7_T2 = MST_IV_D_R.create("T2");
		MST_IV_R S7_T3 = MST_IV_R.create("T3");
		MAM_BP_R S7_M1 = MAM_BP_R.create("M1");
		MAM_ITM_R S7_M2 = MAM_ITM_R.create("M2");
		MST_NOTE_R S8_TB1 = MST_NOTE_R.create("TB1");
		MST_RCV_ACT_R S8_TB2 = MST_RCV_ACT_R.create("TB2");
		MST_RCV_ACT_D_R S8_TB3 = MST_RCV_ACT_D_R.create("TB3");
		MAM_BP_R S8_MB1 = MAM_BP_R.create("MB1");
		MAM_DPT_R S8_MB2 = MAM_DPT_R.create("MB2");
		MST_QTN_D_R S9_TB1 = MST_QTN_D_R.create("TB1");
		MST_QTN_R S9_TB2 = MST_QTN_R.create("TB2");
		MAM_TAX_R S9_MB1 = MAM_TAX_R.create("MB1");
		MAM_BP_R S9_MB2 = MAM_BP_R.create("MB2");
		MAM_CUR_R S9_MB3 = MAM_CUR_R.create("MB3");
		MAM_DPT_R S9_MB4 = MAM_DPT_R.create("MB4");
		MAM_DPT_R S9_MB5 = MAM_DPT_R.create("MB5");
		MST_SLS_SCHD_R S10_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S10_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S10_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S10_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S10_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SLO_D_R S10_T6 = MST_SLO_D_R.create("T6");
		MST_SLO_R S10_T7 = MST_SLO_R.create("T7");
		MCTempView S10_V1 = createTempView("V1");
		MST_IV_SHIP_INST_MAP_R S10_ST1 = MST_IV_SHIP_INST_MAP_R.create("ST1");
		MST_SHIP_PR_R S10_T8 = MST_SHIP_PR_R.create("T8");
		MAVM_ITM_UNIT_R S10_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S10_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S10_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S11_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S11_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S11_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S11_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S11_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SLO_D_R S11_T6 = MST_SLO_D_R.create("T6");
		MST_SLO_R S11_T7 = MST_SLO_R.create("T7");
		MST_SHIP_PR_R S11_T8 = MST_SHIP_PR_R.create("T8");
		MST_SHIP_ACT_D_R S11_T9 = MST_SHIP_ACT_D_R.create("T9");
		MCTempView S11_V1 = createTempView("V1");
		MST_IV_SHIP_ACT_MAP_R S11_ST1 = MST_IV_SHIP_ACT_MAP_R.create("ST1");
		MAVM_ITM_UNIT_R S11_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S11_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S11_M3 = MAM_BP_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0280_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_TB1.ar_dpt_cd),
						S0_VA1.pr("ar_dpt_nm"),
						S0_VA1.pr(S1_TB1.acst_cd),
						S0_VA1.pr("acst_nm"),
						sum(S0_VA1.pr(S1_TB1.init_bal)).as("init_bal"),
						sum(S0_VA1.pr("sls_amt")).as("sls_amt"),
						sum(S0_VA1.pr(S1_TB1.cash_amt)).as("cash_amt"),
						sum(S0_VA1.pr(S1_TB1.note_amt)).as("note_amt"),
						sum(S0_VA1.pr(S1_TB1.xfr_amt)).as("xfr_amt"),
						sum(S0_VA1.pr(S1_TB1.setoff_amt)).as("setoff_amt"),
						sum(S0_VA1.pr(S1_TB1.sw_amt)).as("sw_amt"),
						sum(S0_VA1.pr(S1_TB1.end_bal)).as("end_bal"),
						sum(S0_VA1.pr("not_appl_note")).as("not_appl_note"),
						sum(S0_VA1.pr("backord_amt")).as("backord_amt"),
						sum(S0_VA1.pr("qtn_amt")).as("qtn_amt"),
						nvl(
							sum(S0_VA1.pr(S1_TB1.init_bal)).add(sum(S0_VA1.pr("sls_amt"))).subtract(sum(S0_VA1.pr(S1_TB1.cash_amt))).subtract(sum(S0_VA1.pr(S1_TB1.note_amt))).subtract(sum(S0_VA1.pr(S1_TB1.xfr_amt))).subtract(sum(S0_VA1.pr(S1_TB1.setoff_amt))).subtract(sum(S0_VA1.pr(S1_TB1.sw_amt))).add(sum(S0_VA1.pr("not_appl_note"))).add(sum(S0_VA1.pr("backord_amt"))),
							value(0)
						).as("cred_amt")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.ar_dpt_cd,
							S1_MB2.dpt_nm.as("ar_dpt_nm"),
							S1_TB1.acst_cd,
							S1_MB1.bp_nm.as("acst_nm"),
							S1_TB1.init_bal,
							S1_TB1.sls_amt.add(S1_TB1.ret_amt).add(S1_TB1.dscnt_amt).add(S1_TB1.tax_amt).add(S1_TB1.sw_to_amt).as("sls_amt"),
							S1_TB1.cash_amt,
							S1_TB1.note_amt,
							S1_TB1.xfr_amt,
							S1_TB1.setoff_amt,
							S1_TB1.sw_amt,
							S1_TB1.end_bal,
							value(0).as("not_appl_note"),
							value(0).as("backord_amt"),
							value(0).as("cred_amt"),
							value(0).as("qtn_amt")
						)
						.from(
							S1_TB1
							.leftOuterJoin(S1_MB1).on(
								bracket(
									S1_MB1.bp_cd.eq(S1_TB1.acst_cd)
									.and(S1_MB1.acst_flg.eq(value(true)))
								)
							)
							.leftOuterJoin(S1_MB2).on(
								bracket(
									S1_MB2.dpt_cd.eq(S1_TB1.ar_dpt_cd)
									.and(S1_TB1.ac_ym.between(S1_MB2.st_dt, S1_MB2.end_dt))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(MAPA_BP$F_GET_CRED_OF_ACST(S1_TB1.acst_cd).eq(bind("cred_cd")))
							.and(S1_TB1.trd_cur_cd.eq(bind("cur_cd")))
							.and(
								S1_TB1.ac_ym.eq(addMonths(
										bind("ar_cl_ym"),
										value(1)
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S2_TB1.ar_dpt_cd,
								S2_MB2.dpt_nm.as("ar_dpt_nm"),
								S2_TB1.acst_cd,
								S2_MB1.bp_nm.as("acst_nm"),
								value(0).as("init_bal"),
								S2_TB1.sls_amt.add(S2_TB1.ret_amt).add(S2_TB1.dscnt_amt).add(S2_TB1.tax_amt).add(S2_TB1.sw_to_amt).as("sls_amt"),
								S2_TB1.cash_amt,
								S2_TB1.note_amt,
								S2_TB1.xfr_amt,
								S2_TB1.setoff_amt,
								S2_TB1.sw_amt,
								bracket(
									S2_TB1.sls_amt.add(S2_TB1.ret_amt).add(S2_TB1.dscnt_amt).add(S2_TB1.tax_amt).add(S2_TB1.sw_to_amt).subtract(S2_TB1.cash_amt).subtract(S2_TB1.xfr_amt).subtract(S2_TB1.setoff_amt).subtract(S2_TB1.sw_amt).subtract(S2_TB1.note_amt)
								).as("end_bal"),
								value(0).as("not_appl_note"),
								value(0).as("backord_amt"),
								value(0).as("cred_amt"),
								value(0).as("qtn_amt")
							)
							.from(
								S2_TB1
								.leftOuterJoin(S2_MB1).on(
									bracket(
										S2_MB1.bp_cd.eq(S2_TB1.acst_cd)
										.and(S2_MB1.acst_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S2_MB2).on(
									bracket(
										S2_MB2.dpt_cd.eq(S2_TB1.ar_dpt_cd)
										.and(S2_TB1.ac_ym.between(S2_MB2.st_dt, S2_MB2.end_dt))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(MAPA_BP$F_GET_CRED_OF_ACST(S2_TB1.acst_cd).eq(bind("cred_cd")))
								.and(S2_TB1.trd_cur_cd.eq(bind("cur_cd")))
								.and(
									S2_TB1.ac_ym.gte(addMonths(
											bind("ar_cl_ym"),
											value(2)
										)
									)
								)
							)
							.unionAll(
								subQuery()
								.select(
									S3_V1.pr(S4_T3.ar_dpt_cd),
									S3_MB4.dpt_nm.as("ar_dpt_nm"),
									S3_V1.pr(S4_M3.acst_cd),
									S3_MB2.bp_nm.as("acst_nm"),
									value(0).as("init_bal"),
									value(0).as("sls_amt"),
									value(0).as("cash_amt"),
									value(0).as("note_amt"),
									value(0).as("xfr_amt"),
									value(0).as("setoff_amt"),
									value(0).as("sw_amt"),
									value(0).as("end_bal"),
									value(0).as("not_appl_note"),
									MAPA_AMT$F_GET_INC_TAX_AMT(
										S3_V1.pr("trd_cur_upri"),
										S3_V1.pr("trd_unit_rem_qty"),
										S3_MB5.sls_amt_rnd_typ,
										S3_MB5.sls_tax_rnd_typ,
										S3_MB3.amt_dec_place,
										S3_MB1.inc_tax_flg,
										S3_MB1.tax_rate,
										MAPA_CALC$F_RND_NE(
											S3_V1.pr(S4_T2.trd_cur_dscnt_amt).multiply(S3_V1.pr("base_unit_rem_qty")).divide(S3_V1.pr("dscnt_base_qty")),
											S3_MB3.amt_dec_place,
											value(MAC_RND_TYP.RNDOFF.value())
										)
									).as("backord_amt"),
									value(0).as("cred_amt"),
									value(0).as("qtn_amt")
								)
								.from(
									subQuery()
									.select(
										S4_T3.ar_dpt_cd,
										S4_M3.acst_cd,
										S4_T3.cst_cd,
										S4_T3.trd_cur_cd,
										cases()
											.when(S4_M2.dscnt_itm_flg.eq(value(true)))
												.then(S4_T2.trd_cur_upri.multiply(value(-1)))
											.otherwise(S4_T2.trd_cur_upri).as("trd_cur_upri"),
										S4_T2.tax_cd,
										S4_T2.trd_cur_dscnt_amt,
										cases()
											.when(S4_M3.cst_iv_flg.eq(value(true)))
												.then(
													cases()
														.when(S4_T2.trd_unit_cd.eq(S4_T1.base_unit_cd))
															.then(S4_T4.base_unit_qty.subtract(S4_T4.ship_schd_abort_qty).subtract(S4_T4.ship_ret_qty).subtract(greatest(S4_T4.iv_schd_qty, S4_T4.ship_inst_qty, S4_T4.ship_act_qty)))
														.otherwise(
															bracket(
																S4_T4.base_unit_qty.subtract(S4_T4.ship_schd_abort_qty).subtract(S4_T4.ship_ret_qty).subtract(greatest(S4_T4.iv_schd_qty, S4_T4.ship_inst_qty, S4_T4.ship_act_qty))
															).multiply(S4_M1.conv_base_qty).divide(S4_M1.conv_qty)
														 )
												)
												.otherwise(
													cases()
														.when(S4_T2.trd_unit_cd.eq(S4_T1.base_unit_cd))
															.then(S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty))
														.otherwise(
															bracket(
																S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty)
															).multiply(S4_M1.conv_base_qty).divide(S4_M1.conv_qty))
												).as("trd_unit_rem_qty"),
										cases()
											.when(S4_M3.cst_iv_flg.eq(value(true)))
												.then(S4_T4.base_unit_qty.subtract(S4_T4.ship_schd_abort_qty).subtract(S4_T4.ship_ret_qty).subtract(greatest(S4_T4.iv_schd_qty, S4_T4.ship_inst_qty, S4_T4.ship_act_qty)))
											.otherwise(
												S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty)
											).as("base_unit_rem_qty"),
										S4_T2.base_unit_qty.as("dscnt_base_qty")
									)
									.from(
										S4_T1
										.innerJoin(S4_T2).on(
											bracket(
												S4_T1.slo_d_no.eq(S4_T2.slo_d_no)
											)
										)
										.innerJoin(S4_T3).on(
											bracket(
												S4_T2.slo_no.eq(S4_T3.slo_no)
											)
										)
										.leftOuterJoin(S4_M1).on(
											bracket(
												S4_T2.itm_cd.eq(S4_M1.itm_cd)
												.and(S4_T2.itm_sub1.eq(S4_M1.itm_sub1))
												.and(S4_T2.itm_sub2.eq(S4_M1.itm_sub2))
												.and(S4_T2.itm_sub3.eq(S4_M1.itm_sub3))
												.and(S4_T2.trd_unit_cd.eq(S4_M1.unit_cd))
											)
										)
										.leftOuterJoin(S4_M2).on(
											bracket(
												S4_T2.itm_cd.eq(S4_M2.itm_cd)
												.and(S4_T2.itm_sub1.eq(S4_M2.itm_sub1))
												.and(S4_T2.itm_sub2.eq(S4_M2.itm_sub2))
												.and(S4_T2.itm_sub3.eq(S4_M2.itm_sub3))
											)
										)
										.leftOuterJoin(S4_M3).on(
											bracket(
												S4_M3.bp_cd.eq(S4_T3.cst_cd)
												.and(S4_M3.cst_flg.eq(value(true)))
											)
										)
										.leftOuterJoin(S4_T4).on(
											bracket(
												S4_T2.slo_d_no.eq(S4_T4.slo_d_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S4_T1.cmpl_flg.eq(value(false)))
										.and(S4_T1.slo_d_no.isNotNull())
										.and(S4_T1.ship_inst_d_no.isNull())
										.and(S4_T1.dlv_slip_d_no.isNull())
										.and(S4_T1.iv_d_no.isNull())
										.and(
											cases()
												.when(S4_M3.cst_iv_flg.eq(value(true)))
													.then(S4_T4.base_unit_qty.subtract(S4_T4.ship_schd_abort_qty).subtract(S4_T4.ship_ret_qty).subtract(greatest(S4_T4.iv_schd_qty, S4_T4.ship_inst_qty, S4_T4.ship_act_qty)))
												.otherwise(
													S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty)
												).gt(value(0)))
									)
									.unionAll(
										subQuery()
										.select(
											S5_T7.ar_dpt_cd,
											S5_M3.acst_cd,
											S5_T5.bp_cd.as("cst_cd"),
											S5_T5.trd_cur_cd,
											cases()
												.when(S5_M2.dscnt_itm_flg.eq(value(true)))
													.then(S5_T4.trd_cur_upri.multiply(value(-1)))
												.otherwise(S5_T4.trd_cur_upri).as("trd_cur_upri"),
											S5_T4.tax_cd,
											S5_T4.trd_cur_dscnt_amt,
											bracket(
												S5_T3.base_unit_qty.subtract(S5_T3.ship_act_qty)
											).multiply(S5_M1.conv_base_qty).divide(S5_M1.conv_qty).as("trd_unit_rem_qty"),
											S5_T3.base_unit_qty.subtract(S5_T3.ship_act_qty).as("base_unit_rem_qty"),
											S5_T4.base_unit_qty.as("dscnt_base_qty")
										)
										.from(
											S5_T1
											.innerJoin(S5_T2).on(
												bracket(
													S5_T1.ship_schd_no.eq(S5_T2.ship_schd_no)
												)
											)
											.innerJoin(S5_T3).on(
												bracket(
													S5_T2.ship_schd_no.eq(S5_T3.ship_schd_no)
												)
											)
											.innerJoin(S5_T4).on(
												bracket(
													S5_T3.dlv_slip_d_no.eq(S5_T4.dlv_slip_d_no)
													.and(S5_T3.dlv_slip_no.eq(S5_T4.dlv_slip_no))
													.and(S5_T3.dlv_slip_seq.eq(S5_T4.dlv_slip_seq))
											)
											)
											.innerJoin(S5_T5).on(
												bracket(
													S5_T4.dlv_slip_no.eq(S5_T5.dlv_slip_no)
													.and(S5_T4.dlv_slip_seq.eq(S5_T5.dlv_slip_seq))
												)
											)
											.innerJoin(S5_T6).on(
												bracket(
													S5_T1.slo_d_no.eq(S5_T6.slo_d_no)
												)
											)
											.innerJoin(S5_T7).on(
												bracket(
													S5_T6.slo_no.eq(S5_T7.slo_no)
												)
											)
											.leftOuterJoin(S5_M1).on(
												bracket(
													S5_T2.itm_cd.eq(S5_M1.itm_cd)
													.and(S5_T2.itm_sub1.eq(S5_M1.itm_sub1))
													.and(S5_T2.itm_sub2.eq(S5_M1.itm_sub2))
													.and(S5_T2.itm_sub3.eq(S5_M1.itm_sub3))
													.and(S5_T1.trd_unit_cd.eq(S5_M1.unit_cd))
												)
											)
											.leftOuterJoin(S5_M2).on(
												bracket(
													S5_T2.itm_cd.eq(S5_M2.itm_cd)
													.and(S5_T2.itm_sub1.eq(S5_M2.itm_sub1))
													.and(S5_T2.itm_sub2.eq(S5_M2.itm_sub2))
													.and(S5_T2.itm_sub3.eq(S5_M2.itm_sub3))
												)
											)
											.leftOuterJoin(S5_M3).on(
												bracket(
													S5_M3.bp_cd.eq(S5_T5.bp_cd)
													.and(S5_M3.cst_flg.eq(value(true)))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S5_T1.cmpl_flg.eq(value(false)))
											.and(S5_T1.dlv_slip_d_no.isNull())
											.and(S5_T3.ship_inst_d_no.isNotNull())
											.and(S5_T3.ship_act_qty.lt(S5_T3.base_unit_qty))
											.and(
												S5_T5.slip_sts_typ.in(
													value(MAC_SLIP_STS_TYP.CRT.value()),
													value(MAC_SLIP_STS_TYP.DIS.value())
												)
											)
										)
										.unionAll(
											subQuery()
											.select(
												cases()
													.when(S6_T5.ar_dpt_cd.isNotNull())
														.then(S6_T5.ar_dpt_cd)
													.when(S6_M3.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
														.then(S6_T3.dpt_cd)
													.when(S6_M3.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
														.then(
															MAPA_BP$F_GET_AR_DPT_CD_NE(
																S6_M3.bp_cd,
																addMonths(
																	bind("ar_cl_ym"),
																	value(1)
																),
																value(false)
															)
													)
													.otherwise(nullValue()).as("ar_dpt_cd"),
												S6_M3.acst_cd,
												S6_T3.bp_cd.as("cst_cd"),
												S6_T3.trd_cur_cd,
												cases()
													.when(S6_M2.dscnt_itm_flg.eq(value(true)))
														.then(S6_T2.trd_cur_upri.multiply(value(-1)))
													.otherwise(S6_T2.trd_cur_upri).as("trd_cur_upri"),
												S6_T2.tax_cd,
												S6_T2.trd_cur_dscnt_amt,
												cases()
													.when(S6_T1.trd_unit_cd.eq(S6_T1.base_unit_cd))
														.then(S6_T1.base_unit_qty.subtract(S6_T1.base_unit_abort_qty).subtract(S6_T1.base_unit_sls_qty))
													.otherwise(
														bracket(
															S6_T1.base_unit_qty.subtract(S6_T1.base_unit_abort_qty).subtract(S6_T1.base_unit_sls_qty)
														).multiply(S6_M1.conv_base_qty).divide(S6_M1.conv_qty)).as("trd_unit_rem_qty"),
												S6_T1.base_unit_qty.subtract(S6_T1.base_unit_abort_qty).subtract(S6_T1.base_unit_sls_qty).as("base_unit_rem_qty"),
												S6_T2.base_unit_qty.as("dscnt_base_qty")
											)
											.from(
												S6_T1
												.innerJoin(S6_T2).on(S6_T1.dlv_slip_d_no.eq(S6_T2.dlv_slip_d_no))
												.innerJoin(S6_T3).on(
													bracket(
														S6_T2.dlv_slip_no.eq(S6_T3.dlv_slip_no)
														.and(S6_T2.dlv_slip_seq.eq(S6_T3.dlv_slip_seq))
													)
												)
												.leftOuterJoin(S6_T4).on(
													bracket(
														S6_T1.slo_d_no.eq(S6_T4.slo_d_no)
													)
												)
												.leftOuterJoin(S6_T5).on(
													bracket(
														S6_T4.slo_no.eq(S6_T5.slo_no)
													)
												)
												.leftOuterJoin(S6_M1).on(
													bracket(
														S6_T2.itm_cd.eq(S6_M1.itm_cd)
														.and(S6_T2.itm_sub1.eq(S6_M1.itm_sub1))
														.and(S6_T2.itm_sub2.eq(S6_M1.itm_sub2))
														.and(S6_T2.itm_sub3.eq(S6_M1.itm_sub3))
														.and(S6_T1.trd_unit_cd.eq(S6_M1.unit_cd))
													)
												)
												.leftOuterJoin(S6_M2).on(
													bracket(
														S6_T2.itm_cd.eq(S6_M2.itm_cd)
														.and(S6_T2.itm_sub1.eq(S6_M2.itm_sub1))
														.and(S6_T2.itm_sub2.eq(S6_M2.itm_sub2))
														.and(S6_T2.itm_sub3.eq(S6_M2.itm_sub3))
													)
												)
												.leftOuterJoin(S6_M3).on(
													bracket(
														S6_M3.bp_cd.eq(S6_T3.bp_cd)
														.and(S6_M3.cst_flg.eq(value(true)))
													)
												)
											)
											.where(
												value(0).eq(value(0))
												.and(S6_T1.cmpl_flg.eq(value(false)))
												.and(S6_T1.dlv_slip_d_no.isNotNull())
												.and(S6_T1.iv_d_no.isNull())
												.and(S6_T3.dlv_slip_seq.eq(subQuery()
													.select(max(S6_T6.dlv_slip_seq))
													.from(S6_T6)
													.where(
														S6_T6.dlv_slip_no.eq(S6_T3.dlv_slip_no)
														.and(S6_T6.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
														.and(S6_T6.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
													)
												))
											)
											.unionAll(
												subQuery()
												.select(
													S7_T2.ar_dpt_cd,
													S7_M1.acst_cd,
													S7_T3.ship_rqst_id_cd.as("cst_cd"),
													S7_T3.trd_cur_cd,
													cases()
														.when(S7_M2.dscnt_itm_flg.eq(value(true)))
															.then(S7_T2.trd_cur_upri.multiply(value(-1)))
														.otherwise(S7_T2.trd_cur_upri).as("trd_cur_upri"),
													S7_T2.tax_cd,
													S7_T2.trd_cur_dscnt_amt,
													S7_T1.trd_unit_qty.as("trd_unit_rem_qty"),
													S7_T1.base_unit_qty.as("base_unit_rem_qty"),
													S7_T2.base_unit_qty.as("dscnt_base_qty")
												)
												.from(
													S7_T1
													.innerJoin(S7_T2).on(
														bracket(
															S7_T1.iv_d_no.eq(S7_T2.iv_d_no)
														)
													)
													.innerJoin(S7_T3).on(
														bracket(
															S7_T2.iv_mng_no.eq(S7_T3.iv_mng_no)
														)
													)
													.leftOuterJoin(S7_M1).on(
														bracket(
															S7_M1.bp_cd.eq(S7_T3.ship_rqst_id_cd)
															.and(S7_M1.cst_flg.eq(value(true)))
														)
													)
													.leftOuterJoin(S7_M2).on(
														bracket(
															S7_T2.itm_cd.eq(S7_M2.itm_cd)
															.and(S7_T2.itm_sub1.eq(S7_M2.itm_sub1))
															.and(S7_T2.itm_sub2.eq(S7_M2.itm_sub2))
															.and(S7_T2.itm_sub3.eq(S7_M2.itm_sub3))
														)
													)
												)
												.where(
													value(0).eq(value(0))
													.and(S7_T1.cmpl_flg.eq(value(false)))
												)
											)
											.unionAll(
												subQuery()
												.select(
													S10_T7.ar_dpt_cd,
													S10_M3.acst_cd,
													S10_T5.bp_cd.as("cst_cd"),
													S10_T5.trd_cur_cd,
													cases()
														.when(S10_M2.dscnt_itm_flg.eq(value(true)))
															.then(S10_T4.trd_cur_upri.multiply(value(-1)))
														.otherwise(S10_T4.trd_cur_upri).as("trd_cur_upri"),
													S10_T4.tax_cd,
													S10_T4.trd_cur_dscnt_amt,
													bracket(
														S10_T3.base_unit_qty.subtract(greatest(nvl(S10_V1.pr("iv_qty"), value(0)), S10_T3.ship_act_qty))
													).multiply(S10_M1.conv_base_qty).divide(S10_M1.conv_qty).as("trd_unit_rem_qty"),
													S10_T3.base_unit_qty.subtract(greatest(nvl(S10_V1.pr("iv_qty"), value(0)), S10_T3.ship_act_qty)).as("base_unit_rem_qty"),
													S10_T4.base_unit_qty.as("dscnt_base_qty")
												)
												.from(
													S10_T1
													.innerJoin(S10_T8).on(
														bracket(
															S10_T1.slo_d_no.eq(S10_T8.slo_d_no)
														)
													)
													.innerJoin(S10_T2).on(
														bracket(
															S10_T8.ship_pr_no.eq(S10_T2.ship_pr_no)
														)
													)
													.innerJoin(S10_T3).on(
														bracket(
															S10_T2.ship_schd_no.eq(S10_T3.ship_schd_no)
														)
													)
													.innerJoin(S10_T4).on(
														bracket(
															S10_T3.dlv_slip_d_no.eq(S10_T4.dlv_slip_d_no)
															.and(S10_T3.dlv_slip_no.eq(S10_T4.dlv_slip_no))
															.and(S10_T3.dlv_slip_seq.eq(S10_T4.dlv_slip_seq))
													)
													)
													.innerJoin(S10_T5).on(
														bracket(
															S10_T4.dlv_slip_no.eq(S10_T5.dlv_slip_no)
															.and(S10_T4.dlv_slip_seq.eq(S10_T5.dlv_slip_seq))
														)
													)
													.innerJoin(S10_T6).on(
														bracket(
															S10_T1.slo_d_no.eq(S10_T6.slo_d_no)
														)
													)
													.innerJoin(S10_T7).on(
														bracket(
															S10_T6.slo_no.eq(S10_T7.slo_no)
														)
													)
													.leftOuterJoin(
														subQuery()
															.select(
																S10_ST1.ship_alloc_sts_no,
																sum(S10_ST1.base_unit_qty).as("iv_qty")
															).from(S10_ST1)
															.groupBy(S10_ST1.ship_alloc_sts_no)
														.view(S10_V1)).on(S10_T3.ship_alloc_sts_no.eq(S10_V1.pr(S10_ST1.ship_alloc_sts_no)))
													.leftOuterJoin(S10_M1).on(
														bracket(
															S10_T2.itm_cd.eq(S10_M1.itm_cd)
															.and(S10_T2.itm_sub1.eq(S10_M1.itm_sub1))
															.and(S10_T2.itm_sub2.eq(S10_M1.itm_sub2))
															.and(S10_T2.itm_sub3.eq(S10_M1.itm_sub3))
															.and(S10_T1.trd_unit_cd.eq(S10_M1.unit_cd))
														)
													)
													.leftOuterJoin(S10_M2).on(
														bracket(
															S10_T2.itm_cd.eq(S10_M2.itm_cd)
															.and(S10_T2.itm_sub1.eq(S10_M2.itm_sub1))
															.and(S10_T2.itm_sub2.eq(S10_M2.itm_sub2))
															.and(S10_T2.itm_sub3.eq(S10_M2.itm_sub3))
														)
													)
													.leftOuterJoin(S10_M3).on(
														bracket(
															S10_M3.bp_cd.eq(S10_T5.bp_cd)
															.and(S10_M3.cst_flg.eq(value(true)))
														)
													)
												)
												.where(
													value(0).eq(value(0))
													.and(S10_T1.cmpl_flg.eq(value(false)))
													.and(S10_T1.iv_d_no.isNull())
													.and(S10_T3.ship_inst_d_no.isNotNull())
													.and(S10_M3.cst_iv_flg.eq(value(true)))
													.and(S10_T3.ship_act_qty.lt(S10_T3.base_unit_qty))
													.and(S10_T3.base_unit_qty.subtract(greatest(nvl(S10_V1.pr("iv_qty"), value(0)), S10_T3.ship_act_qty)).gt(value(0)))
													.and(
														S10_T5.slip_sts_typ.in(
															value(MAC_SLIP_STS_TYP.CRT.value()),
															value(MAC_SLIP_STS_TYP.DIS.value())
														)
													)
													.and(S10_T5.dlv_slip_act_no.isNull())
												)
											)
											.unionAll(
												subQuery()
												.select(
													S11_T7.ar_dpt_cd,
													S11_M3.acst_cd,
													S11_T5.bp_cd.as("cst_cd"),
													S11_T5.trd_cur_cd,
													cases()
														.when(S11_M2.dscnt_itm_flg.eq(value(true)))
															.then(S11_T4.trd_cur_upri.multiply(value(-1)))
														.otherwise(S11_T4.trd_cur_upri).as("trd_cur_upri"),
													S11_T4.tax_cd,
													S11_T4.trd_cur_dscnt_amt,
													bracket(
														S11_T9.base_unit_qty.subtract(S11_T9.ship_ret_qty).subtract(nvl(S11_V1.pr("iv_qty"), value(0)))
													).multiply(S11_M1.conv_base_qty).divide(S11_M1.conv_qty).as("trd_unit_rem_qty"),
													S11_T9.base_unit_qty.subtract(S11_T9.ship_ret_qty).subtract(nvl(S11_V1.pr("iv_qty"), value(0))).as("base_unit_rem_qty"),
													S11_T9.base_unit_qty.as("dscnt_base_qty")
												)
												.from(
													S11_T1
													.innerJoin(S11_T8).on(
														bracket(
															S11_T1.slo_d_no.eq(S11_T8.slo_d_no)
														)
													)
													.innerJoin(S11_T2).on(
														bracket(
															S11_T8.ship_pr_no.eq(S11_T2.ship_pr_no)
														)
													)
													.innerJoin(S11_T3).on(
														bracket(
															S11_T2.ship_schd_no.eq(S11_T3.ship_schd_no)
														)
													)
													.innerJoin(S11_T9).on(
														bracket(
															S11_T3.ship_alloc_sts_no.eq(S11_T9.ship_alloc_sts_no)
														)
													)
													.innerJoin(S11_T4).on(
														bracket(
															S11_T9.dlv_slip_d_no.eq(S11_T4.dlv_slip_d_no)
															.and(S11_T9.dlv_slip_no.eq(S11_T4.dlv_slip_no))
															.and(S11_T9.dlv_slip_seq.eq(S11_T4.dlv_slip_seq))
														)
													)
													.innerJoin(S11_T5).on(
														bracket(
															S11_T4.dlv_slip_no.eq(S11_T5.dlv_slip_no)
															.and(S11_T4.dlv_slip_seq.eq(S11_T5.dlv_slip_seq))
														)
													)
													.innerJoin(S11_T6).on(
														bracket(
															S11_T1.slo_d_no.eq(S11_T6.slo_d_no)
														)
													)
													.innerJoin(S11_T7).on(
														bracket(
															S11_T6.slo_no.eq(S11_T7.slo_no)
														)
													)
													.leftOuterJoin(subQuery()
														.select(
																S11_ST1.ship_alloc_sts_no,
															sum(S11_ST1.base_unit_qty).as("iv_qty")
														).from(S11_ST1)
														.groupBy(S11_ST1.ship_alloc_sts_no)
														.view(S11_V1)).on(S11_T3.ship_alloc_sts_no.eq(S11_V1.pr(S11_ST1.ship_alloc_sts_no)))
													.leftOuterJoin(S11_M1).on(
														bracket(
															S11_T2.itm_cd.eq(S11_M1.itm_cd)
															.and(S11_T2.itm_sub1.eq(S11_M1.itm_sub1))
															.and(S11_T2.itm_sub2.eq(S11_M1.itm_sub2))
															.and(S11_T2.itm_sub3.eq(S11_M1.itm_sub3))
															.and(S11_T1.trd_unit_cd.eq(S11_M1.unit_cd))
														)
													)
													.leftOuterJoin(S11_M2).on(
														bracket(
															S11_T2.itm_cd.eq(S11_M2.itm_cd)
															.and(S11_T2.itm_sub1.eq(S11_M2.itm_sub1))
															.and(S11_T2.itm_sub2.eq(S11_M2.itm_sub2))
															.and(S11_T2.itm_sub3.eq(S11_M2.itm_sub3))
														)
													)
													.leftOuterJoin(S11_M3).on(
														bracket(
															S11_M3.bp_cd.eq(S11_T5.bp_cd)
															.and(S11_M3.cst_flg.eq(value(true)))
														)
													)
												)
												.where(
													value(0).eq(value(0))
													.and(S11_T1.cmpl_flg.eq(value(false)))
													.and(S11_T1.iv_d_no.isNull())
													.and(S11_M3.cst_iv_flg.eq(value(true)))
													.and(S11_T9.base_unit_qty.subtract(S11_T9.ship_ret_qty).subtract(nvl(S11_V1.pr("iv_qty"), value(0))).gt(value(0)))
													.and(
														S11_T5.slip_sts_typ.in(
															value(MAC_SLIP_STS_TYP.CRT.value()),
															value(MAC_SLIP_STS_TYP.DIS.value())
														)
													)
													.and(S11_T9.can_flg.eq(value(false)))
												)
											)
										)
									).view(S3_V1)
									.leftOuterJoin(S3_MB1).on(S3_MB1.tax_cd.eq(S3_V1.pr(S4_T2.tax_cd)))
									.leftOuterJoin(S3_MB2).on(S3_MB2.bp_cd.eq(S3_V1.pr(S4_M3.acst_cd)))
									.leftOuterJoin(S3_MB3).on(S3_MB3.cur_cd.eq(S3_V1.pr(S4_T3.trd_cur_cd)))
									.leftOuterJoin(S3_MB4).on(
										bracket(
											S3_MB4.dpt_cd.eq(S3_V1.pr(S4_T3.ar_dpt_cd))
											.and(
												addMonths(
													bind("ar_cl_ym"),
													value(1)
												).between(S3_MB4.st_dt, S3_MB4.end_dt)
											)
										)
									)
									.leftOuterJoin(S3_MB5).on(
										bracket(
											S3_MB5.bp_cd.eq(S3_V1.pr(S4_T3.cst_cd))
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_MB2.acst_flg.eq(value(true)))
									.and(MAPA_BP$F_GET_CRED_OF_ACST(S3_V1.pr(S4_M3.acst_cd)).eq(bind("cred_cd")))
									.and(S3_V1.pr(S4_T3.trd_cur_cd).eq(bind("cur_cd")))
								)
								.unionAll(
									subQuery()
									.select(
										S8_TB3.ar_dpt_cd.as("ar_dpt_cd"),
										S8_MB2.dpt_nm.as("ar_dpt_nm"),
										S8_TB3.acst_cd,
										S8_MB1.bp_nm.as("acst_nm"),
										value(0).as("init_bal"),
										value(0).as("sls_amt"),
										value(0).as("cash_amt"),
										value(0).as("note_amt"),
										value(0).as("xfr_amt"),
										value(0).as("setoff_amt"),
										value(0).as("sw_amt"),
										value(0).as("end_bal"),
										S8_TB3.trd_cur_amt1.as("not_appl_note"),
										value(0).as("backord_amt"),
										value(0).as("cred_amt"),
										value(0).as("qtn_amt")
									)
									.from(
										S8_TB1
										.innerJoin(S8_TB2).on(
											bracket(
												S8_TB1.note_mng_no.eq(S8_TB2.note_mng_no)
											)
										)
										.innerJoin(S8_TB3).on(
											bracket(
												S8_TB2.rcv_act_no.eq(S8_TB3.rcv_act_no)
												.and(S8_TB2.rcv_act_seq.eq(S8_TB3.rcv_act_seq))
											)
										)
										.leftOuterJoin(S8_MB1).on(S8_MB1.bp_cd.eq(S8_TB3.acst_cd))
										.leftOuterJoin(S8_MB2).on(
											bracket(
												S8_MB2.dpt_cd.eq(S8_TB3.ar_dpt_cd)
												.and(
													addMonths(
														bind("ar_cl_ym"),
														value(1)
													).between(S8_MB2.st_dt, S8_MB2.end_dt)
												)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S8_TB1.mat_flg.eq(value(false)))
										.and(
											S8_TB2.trd_ptn_typ.in(
												value(MAC_TRD_PTN_TYP.RCV_AR.value()),
												value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value()),
												value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value())
											)
										)
										.and(S8_TB2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										.and(MAPA_BP$F_GET_CRED_OF_ACST(S8_TB3.acst_cd).eq(bind("cred_cd")))
										.and(S8_TB2.trd_cur_cd.eq(bind("cur_cd")))
									)
									.unionAll(
										subQuery()
										.select(
											cases()
												.when(S9_MB2.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
													.then(S9_TB2.sls_dpt_cd)
												.when(S9_MB2.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
													.then(
														MAPA_BP$F_GET_AR_DPT_CD_NE(
															S9_MB2.bp_cd,
															addMonths(
																bind("ar_cl_ym"),
																value(1)
															),
															value(false)
														)
												)
												.otherwise(nullValue()).as("ar_dpt_cd"),
											cases()
												.when(S9_MB2.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
													.then(S9_MB4.dpt_nm)
												.when(S9_MB2.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
													.then(S9_MB5.dpt_nm)
												.otherwise(nullValue()).as("ar_dpt_nm"),
											S9_MB2.bp_cd.as("acst_cd"),
											S9_MB2.bp_nm.as("acst_nm"),
											value(0).as("init_bal"),
											value(0).as("sls_amt"),
											value(0).as("cash_amt"),
											value(0).as("note_amt"),
											value(0).as("xfr_amt"),
											value(0).as("setoff_amt"),
											value(0).as("sw_amt"),
											value(0).as("end_bal"),
											value(0).as("not_appl_note"),
											value(0).as("backord_amt"),
											value(0).as("cred_amt"),
											MAPA_AMT$F_GET_INC_TAX_AMT(
												S9_TB1.trd_cur_upri,
												S9_TB1.trd_unit_qty.subtract(S9_TB1.slo_trnst_qty).subtract(S9_TB1.sls_trnst_qty),
												S9_MB2.sls_amt_rnd_typ,
												S9_MB2.sls_tax_rnd_typ,
												S9_MB3.amt_dec_place,
												S9_MB1.inc_tax_flg,
												S9_MB1.tax_rate,
												MAPA_CALC$F_RND_NE(
													S9_TB1.trd_cur_dscnt_amt.multiply(bracket(
															S9_TB1.trd_unit_qty.subtract(S9_TB1.slo_trnst_qty).subtract(S9_TB1.sls_trnst_qty)
														)).divide(S9_TB1.trd_unit_qty),
													S9_MB3.amt_dec_place,
													value(MAC_RND_TYP.RNDOFF.value())
												)
											).as("qtn_amt")
										)
										.from(
											S9_TB1
											.innerJoin(S9_TB2).on(S9_TB2.qtn_no.eq(S9_TB1.qtn_no))
											.leftOuterJoin(S9_MB1).on(S9_MB1.tax_cd.eq(S9_TB1.tax_cd))
											.leftOuterJoin(S9_MB2).on(S9_MB2.bp_cd.eq(S9_TB2.cst_cd))
											.leftOuterJoin(S9_MB3).on(S9_MB3.cur_cd.eq(S9_TB2.trd_cur_cd))
											.leftOuterJoin(S9_MB4).on(
												bracket(
													S9_MB4.dpt_cd.eq(S9_TB2.sls_dpt_cd)
													.and(
														addMonths(
															bind("ar_cl_ym"),
															value(1)
														).between(S9_MB4.st_dt, S9_MB4.end_dt)
													)
												)
											)
											.leftOuterJoin(S9_MB5).on(
												bracket(
													S9_MB5.dpt_cd.eq(MAPA_BP$F_GET_AR_DPT_CD_NE(
															S9_MB2.bp_cd,
															addMonths(
																bind("ar_cl_ym"),
																value(1)
															),
															value(false)
														)
													)
													.and(
														addMonths(
															bind("ar_cl_ym"),
															value(1)
														).between(S9_MB5.st_dt, S9_MB5.end_dt)
													)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S9_TB1.trd_unit_qty.subtract(S9_TB1.slo_trnst_qty).subtract(S9_TB1.sls_trnst_qty).gt(value(0)))
											.and(S9_TB2.qtn_typ.eq(value(MSC_QTN_TYP.QTN.value())))
											.and(S9_TB2.can_flg.eq(value(false)))
											.and(MAPA_BP$F_GET_CRED_OF_CST(S9_TB2.cst_cd).eq(bind("cred_cd")))
											.and(S9_TB2.trd_cur_cd.eq(bind("cur_cd")))
										)
									)
								)
							)
						).view(S0_VA1)
					)
					.groupBy(
						S0_VA1.pr(S1_TB1.ar_dpt_cd),
						S0_VA1.pr("ar_dpt_nm"),
						S0_VA1.pr(S1_TB1.acst_cd),
						S0_VA1.pr("acst_nm")
					)
					.orderBy(
						S0_VA1.pr(S1_TB1.ar_dpt_cd).asc(),
						S0_VA1.pr(S1_TB1.acst_cd).asc()
					)
			);
	}
	
	/**
	 * -- MSBGL0280_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGL0280_MST_PURC_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_PURC_SCHD_R S1_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S1_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S1_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S1_T4 = MST_PO_R.create("T4");
		MAVM_ITM_UNIT_R S1_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S1_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S1_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S1_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S1_M8 = MAM_TAX_R.create("M8");
		MAM_DPT_R S1_M9 = MAM_DPT_R.create("M9");
		MST_RCPT_IV_D_R S2_W = MST_RCPT_IV_D_R.create("W");
		MST_PURC_SCHD_R S3_T1 = MST_PURC_SCHD_R.create("T1");
		MST_RCPT_IV_D_R S3_T3 = MST_RCPT_IV_D_R.create("T3");
		MST_RCPT_IV_R S3_T4 = MST_RCPT_IV_R.create("T4");
		MST_PO_D_R S3_T5 = MST_PO_D_R.create("T5");
		MAVM_ITM_UNIT_R S3_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S3_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S3_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S3_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S3_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S3_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S3_M8 = MAM_TAX_R.create("M8");
		MAM_DPT_R S3_M9 = MAM_DPT_R.create("M9");
		MST_PURC_SCHD_R S4_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S4_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S4_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S4_T4 = MST_PO_R.create("T4");
		MST_RCPT_IV_R S4_W1 = MST_RCPT_IV_R.create("W1");
		MST_RCPT_IV_D_R S4_W2 = MST_RCPT_IV_D_R.create("W2");
		MCTempView S4_V1 = createTempView("V1");
		MAVM_ITM_UNIT_R S4_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S4_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S4_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S4_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S4_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S4_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S4_M8 = MAM_TAX_R.create("M8");
		MAM_DPT_R S4_M9 = MAM_DPT_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0280_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T3.ap_dpt_cd),
						S0_V1.pr("ap_dpt_nm"),
						S0_V1.pr(S1_M3.asppl_cd),
						S0_V1.pr("asppl_nm"),
						sum(
							MAPA_AMT$F_GET_PURC_INC_TAX_AMT(
								S0_V1.pr("trd_cur_upri"),
								S0_V1.pr("trd_cur_proc_upri"),
								S0_V1.pr("trd_unit_rem_qty"),
								S0_V1.pr(S1_M3.purc_amt_rnd_typ),
								S0_V1.pr(S1_M3.purc_tax_rnd_typ),
								S0_V1.pr(S1_M7.amt_dec_place),
								S0_V1.pr(S1_M8.inc_tax_flg),
								S0_V1.pr(S1_M8.tax_rate),
								MAPA_CALC$F_RND_NE(
									S0_V1.pr(S1_T3.trd_cur_dscnt_amt).multiply(S0_V1.pr("base_unit_rem_qty")).divide(S0_V1.pr("dscnt_base_qty")),
									S0_V1.pr(S1_M7.amt_dec_place),
									value(MAC_RND_TYP.RNDOFF.value())
								),
								S0_V1.pr("outsrc_flg"),
								S0_V1.pr(S1_M3.repurc_obli_flg)
							)
						).as("backord_amt")
					)
					.from(
						subQuery()
						.select(
							S1_T3.ap_dpt_cd,
							S1_M9.dpt_nm.as("ap_dpt_nm"),
							S1_M3.asppl_cd,
							S1_M4.bp_nm.as("asppl_nm"),
							cases()
								.when(S1_M2.dscnt_itm_flg.eq(value(true)))
									.then(S1_T3.trd_cur_upri.multiply(value(-1)))
								.otherwise(S1_T3.trd_cur_upri).as("trd_cur_upri"),
							cases()
								.when(S1_M2.dscnt_itm_flg.eq(value(true)))
									.then(S1_T3.trd_cur_proc_upri.multiply(value(-1)))
								.otherwise(S1_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
							S1_T3.trd_cur_dscnt_amt,
							cases()
								.when(S1_T3.trd_unit_cd.eq(S1_T1.base_unit_cd))
									.then(S1_T1.base_unit_schd_qty.subtract(S1_T1.base_unit_abort_qty).subtract(S1_T1.base_unit_purc_qty).subtract(S1_T1.base_unit_accpt_dfct_qty))
								.otherwise(
									bracket(
										S1_T1.base_unit_schd_qty.subtract(S1_T1.base_unit_abort_qty).subtract(S1_T1.base_unit_purc_qty).subtract(S1_T1.base_unit_accpt_dfct_qty)
									).multiply(S1_M1.conv_base_qty).divide(S1_M1.conv_qty)).as("trd_unit_rem_qty"),
							S1_T1.base_unit_schd_qty.subtract(S1_T1.base_unit_abort_qty).subtract(S1_T1.base_unit_purc_qty).subtract(S1_T1.base_unit_accpt_dfct_qty).as("base_unit_rem_qty"),
							S1_T3.base_unit_qty.as("dscnt_base_qty"),
							S1_M3.purc_amt_rnd_typ,
							S1_M3.purc_tax_rnd_typ,
							S1_M7.amt_dec_place,
							S1_M8.tax_rate,
							S1_M8.inc_tax_flg,
							S1_T3.outsrc_flg,
							S1_M3.repurc_obli_flg
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.arr_pr_no.eq(S1_T2.arr_pr_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T2.po_d_no.eq(S1_T3.po_d_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T3.po_no.eq(S1_T4.po_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T3.itm_cd.eq(S1_M1.itm_cd)
									.and(S1_T3.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T3.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T3.itm_sub3.eq(S1_M1.itm_sub3))
									.and(S1_T3.trd_unit_cd.eq(S1_M1.unit_cd))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T3.itm_cd.eq(S1_M2.itm_cd)
									.and(S1_T3.itm_sub1.eq(S1_M2.itm_sub1))
									.and(S1_T3.itm_sub2.eq(S1_M2.itm_sub2))
									.and(S1_T3.itm_sub3.eq(S1_M2.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T4.sppl_cd.eq(S1_M3.bp_cd)
									.and(S1_M3.sppl_flg.eq(value(true)))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M3.asppl_cd.eq(S1_M4.bp_cd)
									.and(S1_M4.asppl_flg.eq(value(true)))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M4.bsppl_cd.eq(S1_M5.bp_cd)
									.and(S1_M5.bsppl_flg.eq(value(true)))
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T4.trd_cur_cd.eq(S1_M7.cur_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T3.tax_cd.eq(S1_M8.tax_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T3.ap_dpt_cd.eq(S1_M9.dpt_cd)
									.and(
										addMonths(
											bind("ap_cl_ym"),
											value(1)
										).between(S1_M9.st_dt, S1_M9.end_dt)
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.cmpl_flg.eq(value(false)))
							.and(S1_M5.ap_cred_cd.eq(bind("cred_cd")))
							.and(S1_T4.trd_cur_cd.eq(bind("cur_cd")))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_W)
									.where(
										S2_W.purc_schd_no.eq(S1_T1.purc_schd_no)
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S3_T3.ap_dpt_cd,
								S3_M9.dpt_nm.as("ap_dpt_nm"),
								S3_M3.asppl_cd,
								S3_M4.bp_nm.as("asppl_nm"),
								cases()
									.when(S3_M2.dscnt_itm_flg.eq(value(true)))
										.then(S3_T3.trd_cur_upri.multiply(value(-1)))
									.otherwise(S3_T3.trd_cur_upri).as("trd_cur_upri"),
								cases()
									.when(S3_M2.dscnt_itm_flg.eq(value(true)))
										.then(S3_T3.trd_cur_proc_upri.multiply(value(-1)))
									.otherwise(S3_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
								S3_T3.trd_cur_dscnt_amt,
								S3_T3.trd_unit_qty.as("trd_unit_rem_qty"),
								S3_T3.base_unit_qty.as("base_unit_rem_qty"),
								S3_T3.base_unit_qty.as("dscnt_base_qty"),
								S3_M3.purc_amt_rnd_typ,
								S3_M3.purc_tax_rnd_typ,
								S3_M7.amt_dec_place,
								S3_M8.tax_rate,
								S3_M8.inc_tax_flg,
								S3_T5.outsrc_flg,
								S3_M3.repurc_obli_flg
							)
							.from(
								S3_T1
								.innerJoin(S3_T3).on(
									bracket(
										S3_T1.purc_schd_no.eq(S3_T3.purc_schd_no)
									)
								)
								.innerJoin(S3_T4).on(
									bracket(
										S3_T3.rcpt_iv_mng_no.eq(S3_T4.rcpt_iv_mng_no)
									)
								)
								.leftOuterJoin(S3_T5).on(
									bracket(
										S3_T3.po_d_no.eq(S3_T5.po_d_no)
									)
								)
								.leftOuterJoin(S3_M1).on(
									bracket(
										S3_T3.itm_cd.eq(S3_M1.itm_cd)
										.and(S3_T3.itm_sub1.eq(S3_M1.itm_sub1))
										.and(S3_T3.itm_sub2.eq(S3_M1.itm_sub2))
										.and(S3_T3.itm_sub3.eq(S3_M1.itm_sub3))
										.and(S3_T3.trd_unit_cd.eq(S3_M1.unit_cd))
									)
								)
								.leftOuterJoin(S3_M2).on(
									bracket(
										S3_T3.itm_cd.eq(S3_M2.itm_cd)
										.and(S3_T3.itm_sub1.eq(S3_M2.itm_sub1))
										.and(S3_T3.itm_sub2.eq(S3_M2.itm_sub2))
										.and(S3_T3.itm_sub3.eq(S3_M2.itm_sub3))
									)
								)
								.leftOuterJoin(S3_M3).on(
									bracket(
										S3_T4.sppl_cd.eq(S3_M3.bp_cd)
										.and(S3_M3.sppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S3_M4).on(
									bracket(
										S3_M3.asppl_cd.eq(S3_M4.bp_cd)
										.and(S3_M4.asppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S3_M5).on(
									bracket(
										S3_M4.bsppl_cd.eq(S3_M5.bp_cd)
										.and(S3_M5.bsppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S3_M7).on(
									bracket(
										S3_T4.trd_cur_cd.eq(S3_M7.cur_cd)
									)
								)
								.leftOuterJoin(S3_M8).on(
									bracket(
										S3_T3.tax_cd.eq(S3_M8.tax_cd)
									)
								)
								.leftOuterJoin(S3_M9).on(
									bracket(
										S3_T3.ap_dpt_cd.eq(S3_M9.dpt_cd)
										.and(
											addMonths(
												bind("ap_cl_ym"),
												value(1)
											).between(S3_M9.st_dt, S3_M9.end_dt)
										)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_T4.purc_cmpl_flg.eq(value(false)))
								.and(S3_M5.ap_cred_cd.eq(bind("cred_cd")))
								.and(S3_T4.trd_cur_cd.eq(bind("cur_cd")))
							)
							.unionAll(
								subQuery()
								.select(
									S4_T3.ap_dpt_cd,
									S4_M9.dpt_nm.as("ap_dpt_nm"),
									S4_M3.asppl_cd,
									S4_M4.bp_nm.as("asppl_nm"),
									cases()
										.when(S4_M2.dscnt_itm_flg.eq(value(true)))
											.then(S4_T3.trd_cur_upri.multiply(value(-1)))
										.otherwise(S4_T3.trd_cur_upri).as("trd_cur_upri"),
									cases()
										.when(S4_M2.dscnt_itm_flg.eq(value(true)))
											.then(S4_T3.trd_cur_proc_upri.multiply(value(-1)))
										.otherwise(S4_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
									S4_T3.trd_cur_dscnt_amt,
									cases()
										.when(S4_T3.trd_unit_cd.eq(S4_T1.base_unit_cd))
											.then(S4_T1.base_unit_schd_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_V1.pr("rcpt_iv_qty")))
										.otherwise(
											bracket(
												S4_T1.base_unit_schd_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_V1.pr("rcpt_iv_qty"))
											).multiply(S4_M1.conv_base_qty).divide(S4_M1.conv_qty)).as("trd_unit_rem_qty"),
									S4_T1.base_unit_schd_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_V1.pr("rcpt_iv_qty")).as("base_unit_rem_qty"),
									S4_T3.base_unit_qty.as("dscnt_base_qty"),
									S4_M3.purc_amt_rnd_typ,
									S4_M3.purc_tax_rnd_typ,
									S4_M7.amt_dec_place,
									S4_M8.tax_rate,
									S4_M8.inc_tax_flg,
									S4_T3.outsrc_flg,
									S4_M3.repurc_obli_flg
								)
								.from(
									S4_T1
									.innerJoin(S4_T2).on(
										bracket(
											S4_T1.arr_pr_no.eq(S4_T2.arr_pr_no)
										)
									)
									.innerJoin(S4_T3).on(
										bracket(
											S4_T2.po_d_no.eq(S4_T3.po_d_no)
										)
									)
									.innerJoin(S4_T4).on(
										bracket(
											S4_T3.po_no.eq(S4_T4.po_no)
										)
									)
									.leftOuterJoin(
										subQuery()
										.select(
											S4_W2.purc_schd_no,
											sum(S4_W2.base_unit_qty).as("rcpt_iv_qty")
										)
										.from(S4_W1
											.innerJoin(S4_W2).on(
												S4_W2.rcpt_iv_mng_no.eq(S4_W1.rcpt_iv_mng_no)
											)
										)
										.where(
											MAPA_BP$F_GET_CRED_OF_SPPL(S4_W1.sppl_cd).eq(bind("cred_cd"))
											.and(S4_W1.trd_cur_cd.eq(bind("cur_cd")))
										)
										.groupBy(
											S4_W2.purc_schd_no
										)
										.view(S4_V1)
									).on(
										S4_V1.pr(S4_W2.purc_schd_no).eq(S4_T1.purc_schd_no)
									)
									.leftOuterJoin(S4_M1).on(
										bracket(
											S4_T3.itm_cd.eq(S4_M1.itm_cd)
											.and(S4_T3.itm_sub1.eq(S4_M1.itm_sub1))
											.and(S4_T3.itm_sub2.eq(S4_M1.itm_sub2))
											.and(S4_T3.itm_sub3.eq(S4_M1.itm_sub3))
											.and(S4_T3.trd_unit_cd.eq(S4_M1.unit_cd))
										)
									)
									.leftOuterJoin(S4_M2).on(
										bracket(
											S4_T3.itm_cd.eq(S4_M2.itm_cd)
											.and(S4_T3.itm_sub1.eq(S4_M2.itm_sub1))
											.and(S4_T3.itm_sub2.eq(S4_M2.itm_sub2))
											.and(S4_T3.itm_sub3.eq(S4_M2.itm_sub3))
										)
									)
									.leftOuterJoin(S4_M3).on(
										bracket(
											S4_T4.sppl_cd.eq(S4_M3.bp_cd)
											.and(S4_M3.sppl_flg.eq(value(true)))
										)
									)
									.leftOuterJoin(S4_M4).on(
										bracket(
											S4_M3.asppl_cd.eq(S4_M4.bp_cd)
											.and(S4_M4.asppl_flg.eq(value(true)))
										)
									)
									.leftOuterJoin(S4_M5).on(
										bracket(
											S4_M4.bsppl_cd.eq(S4_M5.bp_cd)
											.and(S4_M5.bsppl_flg.eq(value(true)))
										)
									)
									.leftOuterJoin(S4_M7).on(
										bracket(
											S4_T4.trd_cur_cd.eq(S4_M7.cur_cd)
										)
									)
									.leftOuterJoin(S4_M8).on(
										bracket(
											S4_T3.tax_cd.eq(S4_M8.tax_cd)
										)
									)
									.leftOuterJoin(S4_M9).on(
										bracket(
											S4_T3.ap_dpt_cd.eq(S4_M9.dpt_cd)
											.and(
												addMonths(
													bind("ap_cl_ym"),
													value(1)
												).between(S4_M9.st_dt, S4_M9.end_dt)
											)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S4_T1.cmpl_flg.eq(value(false)))
									.and(S4_M5.ap_cred_cd.eq(bind("cred_cd")))
									.and(S4_T4.trd_cur_cd.eq(bind("cur_cd")))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S2_W)
											.where(
												S2_W.purc_schd_no.eq(S4_T1.purc_schd_no)
											)
										)
									)
								)
							)
						).view(S0_V1)
					)
					.groupBy(
						S0_V1.pr(S1_T3.ap_dpt_cd),
						S0_V1.pr("ap_dpt_nm"),
						S0_V1.pr(S1_M3.asppl_cd),
						S0_V1.pr("asppl_nm")
					)
			);
	}
	
	/**
	 * -- MSBGL0280_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL0280_MST_RCV_S01() {
		MST_RCV_R S0_TB1 = MST_RCV_R.create("TB1");
		MST_NOTE_R S0_TB2 = MST_NOTE_R.create("TB2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0280_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						nvl(
							sum(S0_TB1.not_proc_bal),
							value(0)
						).as("ttl_adv"),
						nvl(
							sum(
								decode(
									S0_TB2.mat_flg,
									value(false),
									S0_TB1.not_proc_bal,
									value(0)
								)
							),
							value(0)
						).as("not_appl_adv_note")
					)
					.from(
						S0_TB1
						.leftOuterJoin(S0_TB2).on(
							bracket(
								S0_TB1.note_mng_no.eq(S0_TB2.note_mng_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TB1.dat_typ.eq(value(MSC_RCV_DAT_TYP.ADV.value())))
						.and(S0_TB1.not_proc_bal.gt(value(0)))
						.and(MAPA_BP$F_GET_CRED_OF_BCST(S0_TB1.bcst_cd).eq(bind("cred_cd")))
						.and(S0_TB1.trd_cur_cd.eq(bind("cur_cd")))
					)
			);
	}
}