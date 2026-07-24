package mcframe.serverMSBG.MSBGB0050;

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
	 * -- MSBGB0050_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R S0_T1 = MST_ADV_PAY_ACT_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_M1.ap_cred_cd.as("cred_cd"),
						S0_T1.trd_cur_cd,
						value(0).as("ar_cred_amt"),
						sum(S0_T1.trd_cur_setoff_tgt_amt.subtract(S0_T1.trd_cur_setoff_act_amt)).as("cred_amt"),
						sum(S0_T1.trd_cur_setoff_tgt_amt.subtract(S0_T1.trd_cur_setoff_act_amt)).as("ap_cred_amt")
					)
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
						.and(S0_M1.ap_cred_cd.isNotNull())
					)
					.groupBy(
						S0_M1.ap_cred_cd,
						S0_T1.trd_cur_cd
					)
			);
	}
	
	/**
	 * -- MSBGB0050_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_MLY_AR_BAL_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MST_MLY_AR_BAL_R S1_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		MST_MLY_AR_BAL_R S2_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(
						MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB1.acst_cd)).as("cred_cd"),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						nvl(
							sum(S0_VA1.pr(S1_TB1.init_bal)).add(sum(S0_VA1.pr(S1_TB1.sls_amt))).add(sum(S0_VA1.pr(S1_TB1.ret_amt))).add(sum(S0_VA1.pr(S1_TB1.dscnt_amt))).add(sum(S0_VA1.pr(S1_TB1.tax_amt))).add(sum(S0_VA1.pr(S1_TB1.sw_to_amt))).subtract(sum(S0_VA1.pr(S1_TB1.cash_amt))).subtract(sum(S0_VA1.pr(S1_TB1.xfr_amt))).subtract(sum(S0_VA1.pr(S1_TB1.setoff_amt))).subtract(sum(S0_VA1.pr(S1_TB1.sw_amt))).subtract(sum(S0_VA1.pr(S1_TB1.note_amt))),
							value(0)
						).as("cred_amt"),
						nvl(
							sum(S0_VA1.pr(S1_TB1.init_bal)).add(sum(S0_VA1.pr(S1_TB1.sls_amt))).add(sum(S0_VA1.pr(S1_TB1.ret_amt))).add(sum(S0_VA1.pr(S1_TB1.dscnt_amt))).add(sum(S0_VA1.pr(S1_TB1.tax_amt))).add(sum(S0_VA1.pr(S1_TB1.sw_to_amt))).subtract(sum(S0_VA1.pr(S1_TB1.cash_amt))).subtract(sum(S0_VA1.pr(S1_TB1.xfr_amt))).subtract(sum(S0_VA1.pr(S1_TB1.setoff_amt))).subtract(sum(S0_VA1.pr(S1_TB1.sw_amt))).subtract(sum(S0_VA1.pr(S1_TB1.note_amt))),
							value(0)
						).as("ar_cred_amt"),
						value(0).as("ap_cred_amt")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.acst_cd,
							S1_TB1.trd_cur_cd,
							S1_TB1.init_bal,
							S1_TB1.sls_amt,
							S1_TB1.ret_amt,
							S1_TB1.dscnt_amt,
							S1_TB1.tax_amt,
							S1_TB1.sw_to_amt,
							S1_TB1.cash_amt,
							S1_TB1.xfr_amt,
							S1_TB1.setoff_amt,
							S1_TB1.sw_amt,
							S1_TB1.note_amt
						)
						.from(S1_TB1)
						.where(
							value(0).eq(value(0))
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
								S2_TB1.acst_cd,
								S2_TB1.trd_cur_cd,
								value(0),
								S2_TB1.sls_amt,
								S2_TB1.ret_amt,
								S2_TB1.dscnt_amt,
								S2_TB1.tax_amt,
								S2_TB1.sw_to_amt,
								S2_TB1.cash_amt,
								S2_TB1.xfr_amt,
								S2_TB1.setoff_amt,
								S2_TB1.sw_amt,
								S2_TB1.note_amt
							)
							.from(S2_TB1)
							.where(
								value(0).eq(value(0))
								.and(
									S2_TB1.ac_ym.gte(addMonths(
											bind("ar_cl_ym"),
											value(2)
										)
									)
								)
							)
						).view(S0_VA1)
					)
					.where(
						value(0).eq(value(0))
						.and(MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB1.acst_cd)).isNotNull())
					)
					.groupBy(
						MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB1.acst_cd)),
						S0_VA1.pr(S1_TB1.trd_cur_cd)
					)
			);
	}
	
	/**
	 * -- MSBGB0050_MST_NOTE_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_NOTE_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MST_NOTE_R S1_TB1 = MST_NOTE_R.create("TB1");
		MST_RCV_ACT_R S1_TB2 = MST_RCV_ACT_R.create("TB2");
		MST_RCV_ACT_D_R S1_TB3 = MST_RCV_ACT_D_R.create("TB3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_NOTE_Query_S01")
					.mainQuery()
					.select(
						MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB3.acst_cd)).as("cred_cd"),
						S0_VA1.pr(S1_TB2.trd_cur_cd),
						sum(S0_VA1.pr("not_mat_amt")).as("cred_amt"),
						sum(S0_VA1.pr("not_mat_amt")).as("ar_cred_amt"),
						value(0).as("ap_cred_amt")
					)
					.from(
						subQuery()
						.select(
							S1_TB3.acst_cd,
							S1_TB2.trd_cur_cd,
							S1_TB3.trd_cur_amt1.as("not_mat_amt")
						)
						.from(
							S1_TB1
							.innerJoin(S1_TB2).on(
								bracket(
									S1_TB1.note_mng_no.eq(S1_TB2.note_mng_no)
								)
							)
							.innerJoin(S1_TB3).on(
								bracket(
									S1_TB2.rcv_act_no.eq(S1_TB3.rcv_act_no)
									.and(S1_TB2.rcv_act_seq.eq(S1_TB3.rcv_act_seq))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_TB1.mat_flg.eq(value(false)))
							.and(
								value(0).eq(value(1))
								.or(S1_TB2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_AR.value())))
								.or(S1_TB2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value())))
								.or(S1_TB2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value())))
							)
							.and(S1_TB2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						).view(S0_VA1)
					)
					.where(
						value(0).eq(value(0))
						.and(MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB3.acst_cd)).isNotNull())
					)
					.groupBy(
						MAPA_BP$F_GET_CRED_OF_ACST(S0_VA1.pr(S1_TB3.acst_cd)),
						S0_VA1.pr(S1_TB2.trd_cur_cd)
					)
			);
	}
	
	/**
	 * -- MSBGB0050_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_PURC_SCHD_S01() {
		MCTempView S0_SUB = createTempView("SUB");
		MCTempView S1_V1 = createTempView("V1");
		MST_PURC_SCHD_R S2_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S2_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S2_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S2_T4 = MST_PO_R.create("T4");
		MAVM_ITM_UNIT_R S2_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S2_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S2_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S2_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S2_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S2_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S2_M8 = MAM_TAX_R.create("M8");
		MST_RCPT_IV_D_R S3_W = MST_RCPT_IV_D_R.create("W");
		MST_PURC_SCHD_R S4_T1 = MST_PURC_SCHD_R.create("T1");
		MST_RCPT_IV_D_R S4_T3 = MST_RCPT_IV_D_R.create("T3");
		MST_RCPT_IV_R S4_T4 = MST_RCPT_IV_R.create("T4");
		MST_PO_D_R S4_T5 = MST_PO_D_R.create("T5");
		MAVM_ITM_UNIT_R S4_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S4_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S4_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S4_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S4_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S4_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S4_M8 = MAM_TAX_R.create("M8");
		MST_PURC_SCHD_R S5_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S5_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S5_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S5_T4 = MST_PO_R.create("T4");
		MST_RCPT_IV_R S5_W1 = MST_RCPT_IV_R.create("W1");
		MST_RCPT_IV_D_R S5_W2 = MST_RCPT_IV_D_R.create("W2");
		MCTempView S5_V1 = createTempView("V1");
		MAVM_ITM_UNIT_R S5_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S5_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S5_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S5_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S5_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S5_M7 = MAM_CUR_R.create("M7");
		MAM_TAX_R S5_M8 = MAM_TAX_R.create("M8");
		MAM_DPT_R S5_M9 = MAM_DPT_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_SUB.pr("cred_cd"),
						S0_SUB.pr(S2_T4.trd_cur_cd),
						value(0).as("ar_cred_amt"),
						nvl(
							S0_SUB.pr("backord_amt"),
							value(0)
						).multiply(
							bracket(
								value(-1)
							)
						).as("cred_amt"),
						nvl(
							S0_SUB.pr("backord_amt"),
							value(0)
						).multiply(
							bracket(
								value(-1)
							)
						).as("ap_cred_amt")
					)
					.from(
						subQuery()
						.select(
							S1_V1.pr("cred_cd"),
							S1_V1.pr(S2_T4.trd_cur_cd),
							sum(
								MAPA_AMT$F_GET_PURC_INC_TAX_AMT(
									S1_V1.pr("trd_cur_upri"),
									S1_V1.pr("trd_cur_proc_upri"),
									S1_V1.pr("trd_unit_rem_qty"),
									S1_V1.pr(S2_M3.purc_amt_rnd_typ),
									S1_V1.pr(S2_M3.purc_tax_rnd_typ),
									S1_V1.pr(S2_M7.amt_dec_place),
									S1_V1.pr(S2_M8.inc_tax_flg),
									S1_V1.pr(S2_M8.tax_rate),
									MAPA_CALC$F_RND_NE(
										S1_V1.pr(S2_T3.trd_cur_dscnt_amt).multiply(S1_V1.pr("base_unit_rem_qty")).divide(S1_V1.pr("dscnt_base_qty")),
										S1_V1.pr(S2_M7.amt_dec_place),
										value(MAC_RND_TYP.RNDOFF.value())
									),
									S1_V1.pr("outsrc_flg"),
									S1_V1.pr(S2_M3.repurc_obli_flg)
								)
							).as("backord_amt")
						)
						.from(
							subQuery()
							.select(
								S2_M5.ap_cred_cd.as("cred_cd"),
								S2_T4.trd_cur_cd,
								cases()
									.when(S2_M2.dscnt_itm_flg.eq(value(true)))
										.then(S2_T3.trd_cur_upri.multiply(value(-1)))
									.otherwise(S2_T3.trd_cur_upri).as("trd_cur_upri"),
								cases()
									.when(S2_M2.dscnt_itm_flg.eq(value(true)))
										.then(S2_T3.trd_cur_proc_upri.multiply(value(-1)))
									.otherwise(S2_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
								S2_T3.trd_cur_dscnt_amt,
								cases()
									.when(S2_T3.trd_unit_cd.eq(S2_T1.base_unit_cd))
										.then(S2_T1.base_unit_schd_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_purc_qty).subtract(S2_T1.base_unit_accpt_dfct_qty))
									.otherwise(
										bracket(
											S2_T1.base_unit_schd_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_purc_qty).subtract(S2_T1.base_unit_accpt_dfct_qty)
										).multiply(S2_M1.conv_base_qty).divide(S2_M1.conv_qty)).as("trd_unit_rem_qty"),
								S2_T1.base_unit_schd_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_purc_qty).subtract(S2_T1.base_unit_accpt_dfct_qty).as("base_unit_rem_qty"),
								S2_T3.base_unit_qty.as("dscnt_base_qty"),
								S2_M3.purc_amt_rnd_typ,
								S2_M3.purc_tax_rnd_typ,
								S2_M7.amt_dec_place,
								S2_M8.tax_rate,
								S2_M8.inc_tax_flg,
								S2_T3.outsrc_flg,
								S2_M3.repurc_obli_flg
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.arr_pr_no.eq(S2_T2.arr_pr_no)
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T2.po_d_no.eq(S2_T3.po_d_no)
									)
								)
								.innerJoin(S2_T4).on(
									bracket(
										S2_T3.po_no.eq(S2_T4.po_no)
									)
								)
								.leftOuterJoin(S2_M1).on(
									bracket(
										S2_T3.itm_cd.eq(S2_M1.itm_cd)
										.and(S2_T3.itm_sub1.eq(S2_M1.itm_sub1))
										.and(S2_T3.itm_sub2.eq(S2_M1.itm_sub2))
										.and(S2_T3.itm_sub3.eq(S2_M1.itm_sub3))
										.and(S2_T3.trd_unit_cd.eq(S2_M1.unit_cd))
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_T3.itm_cd.eq(S2_M2.itm_cd)
										.and(S2_T3.itm_sub1.eq(S2_M2.itm_sub1))
										.and(S2_T3.itm_sub2.eq(S2_M2.itm_sub2))
										.and(S2_T3.itm_sub3.eq(S2_M2.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_T4.sppl_cd.eq(S2_M3.bp_cd)
										.and(S2_M3.sppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S2_M4).on(
									bracket(
										S2_M3.asppl_cd.eq(S2_M4.bp_cd)
										.and(S2_M4.asppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S2_M5).on(
									bracket(
										S2_M4.bsppl_cd.eq(S2_M5.bp_cd)
										.and(S2_M5.bsppl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S2_M7).on(
									bracket(
										S2_T4.trd_cur_cd.eq(S2_M7.cur_cd)
									)
								)
								.leftOuterJoin(S2_M8).on(
									bracket(
										S2_T3.tax_cd.eq(S2_M8.tax_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_M5.ap_cred_cd.isNotNull())
								.and(S2_T1.cmpl_flg.eq(value(false)))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3_W)
										.where(
											S3_W.purc_schd_no.eq(S2_T1.purc_schd_no)
										)
									)
								)
							)
							.unionAll(
								subQuery()
								.select(
									S4_M5.ap_cred_cd.as("cred_cd"),
									S4_T4.trd_cur_cd,
									cases()
										.when(S4_M2.dscnt_itm_flg.eq(value(true)))
											.then(S4_T3.trd_cur_upri.multiply(value(-1)))
										.otherwise(S4_T3.trd_cur_upri).as("trd_cur_upri"),
									cases()
										.when(S4_M2.dscnt_itm_flg.eq(value(true)))
											.then(S4_T3.trd_cur_proc_upri.multiply(value(-1)))
										.otherwise(S4_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
									S4_T3.trd_cur_dscnt_amt,
									S4_T3.trd_unit_qty.as("trd_unit_rem_qty"),
									S4_T3.base_unit_qty.as("base_unit_rem_qty"),
									S4_T3.base_unit_qty.as("dscnt_base_qty"),
									S4_M3.purc_amt_rnd_typ,
									S4_M3.purc_tax_rnd_typ,
									S4_M7.amt_dec_place,
									S4_M8.tax_rate,
									S4_M8.inc_tax_flg,
									S4_T5.outsrc_flg,
									S4_M3.repurc_obli_flg
								)
								.from(
									S4_T1
									.innerJoin(S4_T3).on(
										bracket(
											S4_T1.purc_schd_no.eq(S4_T3.purc_schd_no)
										)
									)
									.innerJoin(S4_T4).on(
										bracket(
											S4_T3.rcpt_iv_mng_no.eq(S4_T4.rcpt_iv_mng_no)
										)
									)
									.leftOuterJoin(S4_T5).on(
										bracket(
											S4_T3.po_d_no.eq(S4_T5.po_d_no)
										)
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
								)
								.where(
									value(0).eq(value(0))
									.and(S4_M5.ap_cred_cd.isNotNull())
									.and(S4_T4.purc_cmpl_flg.eq(value(false)))
								)
								.unionAll(
									subQuery()
									.select(
										S5_M5.ap_cred_cd.as("cred_cd"),
										S5_T4.trd_cur_cd,
										cases()
											.when(S5_M2.dscnt_itm_flg.eq(value(true)))
												.then(S5_T3.trd_cur_upri.multiply(value(-1)))
											.otherwise(S5_T3.trd_cur_upri).as("trd_cur_upri"),
										cases()
											.when(S5_M2.dscnt_itm_flg.eq(value(true)))
												.then(S5_T3.trd_cur_proc_upri.multiply(value(-1)))
											.otherwise(S5_T3.trd_cur_proc_upri).as("trd_cur_proc_upri"),
										S5_T3.trd_cur_dscnt_amt,
										cases()
											.when(S5_T3.trd_unit_cd.eq(S5_T1.base_unit_cd))
												.then(S5_T1.base_unit_schd_qty.subtract(S5_T1.base_unit_abort_qty).subtract(S5_V1.pr("rcpt_iv_qty")))
											.otherwise(
												bracket(
													S5_T1.base_unit_schd_qty.subtract(S5_T1.base_unit_abort_qty).subtract(S5_V1.pr("rcpt_iv_qty"))
												).multiply(S5_M1.conv_base_qty).divide(S5_M1.conv_qty)).as("trd_unit_rem_qty"),
										S5_T1.base_unit_schd_qty.subtract(S5_T1.base_unit_abort_qty).subtract(S5_V1.pr("rcpt_iv_qty")).as("base_unit_rem_qty"),
										S5_T3.base_unit_qty.as("dscnt_base_qty"),
										S5_M3.purc_amt_rnd_typ,
										S5_M3.purc_tax_rnd_typ,
										S5_M7.amt_dec_place,
										S5_M8.tax_rate,
										S5_M8.inc_tax_flg,
										S5_T3.outsrc_flg,
										S5_M3.repurc_obli_flg
									)
									.from(
										S5_T1
										.innerJoin(S5_T2).on(
											bracket(
												S5_T1.arr_pr_no.eq(S5_T2.arr_pr_no)
											)
										)
										.innerJoin(S5_T3).on(
											bracket(
												S5_T2.po_d_no.eq(S5_T3.po_d_no)
											)
										)
										.innerJoin(S5_T4).on(
											bracket(
												S5_T3.po_no.eq(S5_T4.po_no)
											)
										)
										.leftOuterJoin(
											subQuery()
											.select(
												S5_W2.purc_schd_no,
												sum(S5_W2.base_unit_qty).as("rcpt_iv_qty")
											)
											.from(S5_W1
												.innerJoin(S5_W2).on(
													S5_W2.rcpt_iv_mng_no.eq(S5_W1.rcpt_iv_mng_no)
												)
											)
											.where(
												MAPA_BP$F_GET_CRED_OF_SPPL(S5_W1.sppl_cd).isNotNull()
											)
											.groupBy(
												S5_W2.purc_schd_no
											)
											.view(S5_V1)
										).on(
											S5_V1.pr(S5_W2.purc_schd_no).eq(S5_T1.purc_schd_no)
										)
										.leftOuterJoin(S5_M1).on(
											bracket(
												S5_T3.itm_cd.eq(S5_M1.itm_cd)
												.and(S5_T3.itm_sub1.eq(S5_M1.itm_sub1))
												.and(S5_T3.itm_sub2.eq(S5_M1.itm_sub2))
												.and(S5_T3.itm_sub3.eq(S5_M1.itm_sub3))
												.and(S5_T3.trd_unit_cd.eq(S5_M1.unit_cd))
											)
										)
										.leftOuterJoin(S5_M2).on(
											bracket(
												S5_T3.itm_cd.eq(S5_M2.itm_cd)
												.and(S5_T3.itm_sub1.eq(S5_M2.itm_sub1))
												.and(S5_T3.itm_sub2.eq(S5_M2.itm_sub2))
												.and(S5_T3.itm_sub3.eq(S5_M2.itm_sub3))
											)
										)
										.leftOuterJoin(S5_M3).on(
											bracket(
												S5_T4.sppl_cd.eq(S5_M3.bp_cd)
												.and(S5_M3.sppl_flg.eq(value(true)))
											)
										)
										.leftOuterJoin(S5_M4).on(
											bracket(
												S5_M3.asppl_cd.eq(S5_M4.bp_cd)
												.and(S5_M4.asppl_flg.eq(value(true)))
											)
										)
										.leftOuterJoin(S5_M5).on(
											bracket(
												S5_M4.bsppl_cd.eq(S5_M5.bp_cd)
												.and(S5_M5.bsppl_flg.eq(value(true)))
											)
										)
										.leftOuterJoin(S5_M7).on(
											bracket(
												S5_T4.trd_cur_cd.eq(S5_M7.cur_cd)
											)
										)
										.leftOuterJoin(S5_M8).on(
											bracket(
												S5_T3.tax_cd.eq(S5_M8.tax_cd)
											)
										)
										.leftOuterJoin(S5_M9).on(
											bracket(
												S5_T3.ap_dpt_cd.eq(S5_M9.dpt_cd)
												.and(
													addMonths(
														bind("ap_cl_ym"),
														value(1)
													).between(S5_M9.st_dt, S5_M9.end_dt)
												)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S5_T1.cmpl_flg.eq(value(false)))
										.and(S5_M5.ap_cred_cd.isNotNull())
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(S3_W)
												.where(
													S3_W.purc_schd_no.eq(S5_T1.purc_schd_no)
												)
											)
										)
									)
								)
							).view(S1_V1)
						)
						.groupBy(
							S1_V1.pr("cred_cd"),
							S1_V1.pr(S2_T4.trd_cur_cd)
						).view(S0_SUB)
					)
			);
	}
	
	/**
	 * -- MSBGB0050_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_RCV_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MST_RCV_R S1_TB1 = MST_RCV_R.create("TB1");
		MST_NOTE_R S1_TB2 = MST_NOTE_R.create("TB2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_VA1.pr("cred_cd"),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						value(0).subtract(
							nvl(
								sum(S0_VA1.pr("adv_amt")),
								value(0)
							)
						).as("cred_amt"),
						value(0).subtract(
							nvl(
								sum(S0_VA1.pr("adv_amt")),
								value(0)
							)
						).as("ar_cred_amt"),
						value(0).as("ap_cred_amt")
					)
					.from(
						subQuery()
						.select(
							MAPA_BP$F_GET_CRED_OF_BCST(S1_TB1.bcst_cd).as("cred_cd"),
							S1_TB1.trd_cur_cd,
							decode(
								S1_TB2.mat_flg,
								value(false),
								value(0),
								S1_TB1.not_proc_bal
							).as("adv_amt")
						)
						.from(
							S1_TB1
							.leftOuterJoin(S1_TB2).on(
								bracket(
									S1_TB1.note_mng_no.eq(S1_TB2.note_mng_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_TB1.dat_typ.eq(value(MSC_RCV_DAT_TYP.ADV.value())))
							.and(S1_TB1.not_proc_bal.gt(value(0)))
						).view(S0_VA1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_VA1.pr("cred_cd").isNotNull())
					)
					.groupBy(
						S0_VA1.pr("cred_cd"),
						S0_VA1.pr(S1_TB1.trd_cur_cd)
					)
			);
	}
	
	/**
	 * -- MSBGB0050_MST_SLS_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGB0050_MST_SLS_SCHD_S01() {
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S1_V1 = createTempView("V1");
		MAM_TAX_R S1_M1 = MAM_TAX_R.create("M1");
		MAM_BP_R S1_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S1_M3 = MAM_CUR_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_BP_R S1_M6 = MAM_BP_R.create("M6");
		MST_SLS_SCHD_R S2_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SLO_D_R S2_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S2_T3 = MST_SLO_R.create("T3");
		MST_SHIP_PR_R S2_T4 = MST_SHIP_PR_R.create("T4");
		MAVM_ITM_UNIT_R S2_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S2_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S2_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S3_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S3_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S3_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S3_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S3_T5 = MST_DLV_SLIP_R.create("T5");
		MAVM_ITM_UNIT_R S3_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S3_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S3_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S4_T1 = MST_SLS_SCHD_R.create("T1");
		MST_DLV_SLIP_D_R S4_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R S4_T3 = MST_DLV_SLIP_R.create("T3");
		MST_DLV_SLIP_R S4_T4 = MST_DLV_SLIP_R.create("T4");
		MAVM_ITM_UNIT_R S4_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S4_M2 = MAM_ITM_R.create("M2");
		MST_SLS_SCHD_R S5_T1 = MST_SLS_SCHD_R.create("T1");
		MST_IV_D_R S5_T2 = MST_IV_D_R.create("T2");
		MST_IV_R S5_T3 = MST_IV_R.create("T3");
		MAM_ITM_R S5_M1 = MAM_ITM_R.create("M1");
		MST_SLS_SCHD_R S6_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S6_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S6_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S6_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S6_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SHIP_PR_R S6_T6 = MST_SHIP_PR_R.create("T6");
		MCTempView S6_V1 = createTempView("V1");
		MST_IV_SHIP_INST_MAP_R S6_ST1 = MST_IV_SHIP_INST_MAP_R.create("ST1");
		MAVM_ITM_UNIT_R S6_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S6_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S6_M3 = MAM_BP_R.create("M3");
		MST_SLS_SCHD_R S7_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SHIP_SCHD_R S7_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S7_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_D_R S7_T4 = MST_DLV_SLIP_D_R.create("T4");
		MST_DLV_SLIP_R S7_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SHIP_PR_R S7_T6 = MST_SHIP_PR_R.create("T6");
		MST_SHIP_ACT_D_R S7_T7 = MST_SHIP_ACT_D_R.create("T7");
		MCTempView S7_V1 = createTempView("V1");
		MST_IV_SHIP_ACT_MAP_R S7_ST1 = MST_IV_SHIP_ACT_MAP_R.create("ST1");
		MAVM_ITM_UNIT_R S7_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S7_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S7_M3 = MAM_BP_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0050_MST_SLS_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V2.pr("cred_cd"),
						S0_V2.pr(S2_T3.trd_cur_cd),
						sum(S0_V2.pr("cred_amt")).as("cred_amt"),
						sum(S0_V2.pr("cred_amt")).as("ar_cred_amt"),
						value(0).as("ap_cred_amt")
					)
					.from(
						subQuery()
						.select(
							S1_M6.ar_cred_cd.as("cred_cd"),
							S1_V1.pr(S2_T3.trd_cur_cd),
							MAPA_AMT$F_GET_INC_TAX_AMT(
								S1_V1.pr("trd_cur_upri"),
								S1_V1.pr("trd_unit_rem_qty"),
								S1_M2.sls_amt_rnd_typ,
								S1_M2.sls_tax_rnd_typ,
								S1_M3.amt_dec_place,
								S1_M1.inc_tax_flg,
								S1_M1.tax_rate,
								MAPA_CALC$F_RND_NE(
									S1_V1.pr(S2_T2.trd_cur_dscnt_amt).multiply(S1_V1.pr("base_unit_rem_qty")).divide(S1_V1.pr("dscnt_base_qty")),
									S1_M3.amt_dec_place,
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("cred_amt")
						)
						.from(
							subQuery()
							.select(
								S2_T3.cst_cd,
								S2_T3.trd_cur_cd,
								cases()
									.when(S2_M2.dscnt_itm_flg.eq(value(true)))
										.then(S2_T2.trd_cur_upri.multiply(value(-1)))
									.otherwise(S2_T2.trd_cur_upri).as("trd_cur_upri"),
								S2_T2.tax_cd,
								S2_T2.trd_cur_dscnt_amt,
								cases()
								.when(S2_M3.cst_iv_flg.eq(value(true)))
									.then(
										cases()
											.when(S2_T2.trd_unit_cd.eq(S2_T1.base_unit_cd))
												.then(S2_T4.base_unit_qty.subtract(S2_T4.ship_schd_abort_qty).subtract(S2_T4.ship_ret_qty).subtract(greatest(S2_T4.iv_schd_qty, S2_T4.ship_inst_qty, S2_T4.ship_act_qty)))
											.otherwise(
												bracket(
													S2_T4.base_unit_qty.subtract(S2_T4.ship_schd_abort_qty).subtract(S2_T4.ship_ret_qty).subtract(greatest(S2_T4.iv_schd_qty, S2_T4.ship_inst_qty, S2_T4.ship_act_qty))
												).multiply(S2_M1.conv_base_qty).divide(S2_M1.conv_qty)
											 )
									)
								.otherwise(
									cases()
										.when(S2_T2.trd_unit_cd.eq(S2_T1.base_unit_cd))
											.then(S2_T1.base_unit_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_sls_qty))
										.otherwise(
											bracket(
												S2_T1.base_unit_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_sls_qty)
											).multiply(S2_M1.conv_base_qty).divide(S2_M1.conv_qty)
										)
								).as("trd_unit_rem_qty"),
								cases()
									.when(S2_M3.cst_iv_flg.eq(value(true)))
										.then(S2_T4.base_unit_qty.subtract(S2_T4.ship_schd_abort_qty).subtract(S2_T4.ship_ret_qty).subtract(greatest(S2_T4.iv_schd_qty, S2_T4.ship_inst_qty, S2_T4.ship_act_qty)))
									.otherwise(
										S2_T1.base_unit_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_sls_qty)
									).as("base_unit_rem_qty"),
								S2_T2.base_unit_qty.as("dscnt_base_qty")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.slo_d_no.eq(S2_T2.slo_d_no)
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T2.slo_no.eq(S2_T3.slo_no)
									)
								)
								.leftOuterJoin(S2_M1).on(
									bracket(
										S2_T2.itm_cd.eq(S2_M1.itm_cd)
										.and(S2_T2.itm_sub1.eq(S2_M1.itm_sub1))
										.and(S2_T2.itm_sub2.eq(S2_M1.itm_sub2))
										.and(S2_T2.itm_sub3.eq(S2_M1.itm_sub3))
										.and(S2_T2.trd_unit_cd.eq(S2_M1.unit_cd))
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_T2.itm_cd.eq(S2_M2.itm_cd)
										.and(S2_T2.itm_sub1.eq(S2_M2.itm_sub1))
										.and(S2_T2.itm_sub2.eq(S2_M2.itm_sub2))
										.and(S2_T2.itm_sub3.eq(S2_M2.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_T3.cst_cd.eq(S2_M3.bp_cd).and(S2_M3.cst_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S2_T4).on(
									bracket(
										S2_T2.slo_d_no.eq(S2_T4.slo_d_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.cmpl_flg.eq(value(false)))
								.and(S2_T1.slo_d_no.isNotNull())
								.and(S2_T1.ship_inst_d_no.isNull())
								.and(S2_T1.dlv_slip_d_no.isNull())
								.and(S2_T1.iv_d_no.isNull())
								.and(
									cases()
										.when(S2_M3.cst_iv_flg.eq(value(true)))
											.then(S2_T4.base_unit_qty.subtract(S2_T4.ship_schd_abort_qty).subtract(S2_T4.ship_ret_qty).subtract(greatest(S2_T4.iv_schd_qty, S2_T4.ship_inst_qty, S2_T4.ship_act_qty)))
										.otherwise(
											S2_T1.base_unit_qty.subtract(S2_T1.base_unit_abort_qty).subtract(S2_T1.base_unit_sls_qty)
										).gt(value(0)))
							)
							.unionAll(
								subQuery()
								.select(
									S3_T5.bp_cd.as("cst_cd"),
									S3_T5.trd_cur_cd,
									cases()
										.when(S3_M2.dscnt_itm_flg.eq(value(true)))
											.then(S3_T4.trd_cur_upri.multiply(value(-1)))
										.otherwise(S3_T4.trd_cur_upri).as("trd_cur_upri"),
									S3_T4.tax_cd,
									S3_T4.trd_cur_dscnt_amt,
									bracket(
										S3_T3.base_unit_qty.subtract(S3_T3.ship_act_qty)
									).multiply(S3_M1.conv_base_qty).divide(S3_M1.conv_qty).as("trd_unit_rem_qty"),
									S3_T3.base_unit_qty.subtract(S3_T3.ship_act_qty).as("base_unit_rem_qty"),
									S3_T4.base_unit_qty.as("dscnt_base_qty")
								)
								.from(
									S3_T1
									.innerJoin(S3_T2).on(
										bracket(
											S3_T1.ship_schd_no.eq(S3_T2.ship_schd_no)
										)
									)
									.innerJoin(S3_T3).on(
										bracket(
											S3_T2.ship_schd_no.eq(S3_T3.ship_schd_no)
										)
									)
									.innerJoin(S3_T4).on(
										bracket(
											S3_T3.dlv_slip_d_no.eq(S3_T4.dlv_slip_d_no)
											.and(S3_T3.dlv_slip_no.eq(S3_T4.dlv_slip_no))
											.and(S3_T3.dlv_slip_seq.eq(S3_T4.dlv_slip_seq))
										)
									)
									.innerJoin(S3_T5).on(
										bracket(
											S3_T4.dlv_slip_no.eq(S3_T5.dlv_slip_no)
											.and(S3_T4.dlv_slip_seq.eq(S3_T5.dlv_slip_seq))
										)
									)
									.leftOuterJoin(S3_M1).on(
										bracket(
											S3_T2.itm_cd.eq(S3_M1.itm_cd)
											.and(S3_T2.itm_sub1.eq(S3_M1.itm_sub1))
											.and(S3_T2.itm_sub2.eq(S3_M1.itm_sub2))
											.and(S3_T2.itm_sub3.eq(S3_M1.itm_sub3))
											.and(S3_T1.trd_unit_cd.eq(S3_M1.unit_cd))
										)
									)
									.leftOuterJoin(S3_M2).on(
										bracket(
											S3_T2.itm_cd.eq(S3_M2.itm_cd)
											.and(S3_T2.itm_sub1.eq(S3_M2.itm_sub1))
											.and(S3_T2.itm_sub2.eq(S3_M2.itm_sub2))
											.and(S3_T2.itm_sub3.eq(S3_M2.itm_sub3))
										)
									)
									.leftOuterJoin(S3_M3).on(
										bracket(
											S3_M3.bp_cd.eq(S3_T5.bp_cd)
											.and(S3_M3.cst_flg.eq(value(true)))
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_T1.cmpl_flg.eq(value(false)))
									.and(S3_T1.dlv_slip_d_no.isNull())
									.and(S3_T3.ship_inst_d_no.isNotNull())
									.and(S3_T3.ship_act_qty.lt(S3_T3.base_unit_qty))
									.and(
										S3_T5.slip_sts_typ.in(
											value(MAC_SLIP_STS_TYP.CRT.value()),
											value(MAC_SLIP_STS_TYP.DIS.value())
										)
									)
								)
								.unionAll(
									subQuery()
									.select(
										S4_T3.bp_cd.as("cst_cd"),
										S4_T3.trd_cur_cd,
										cases()
											.when(S4_M2.dscnt_itm_flg.eq(value(true)))
												.then(S4_T2.trd_cur_upri.multiply(value(-1)))
											.otherwise(S4_T2.trd_cur_upri).as("trd_cur_upri"),
										S4_T2.tax_cd,
										S4_T2.trd_cur_dscnt_amt,
										cases()
											.when(S4_T1.trd_unit_cd.eq(S4_T1.base_unit_cd))
												.then(S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty))
											.otherwise(
												bracket(
													S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty)
												).multiply(S4_M1.conv_base_qty).divide(S4_M1.conv_qty)).as("trd_unit_rem_qty"),
										S4_T1.base_unit_qty.subtract(S4_T1.base_unit_abort_qty).subtract(S4_T1.base_unit_sls_qty).as("base_unit_rem_qty"),
										S4_T2.base_unit_qty.as("dscnt_base_qty")
									)
									.from(
										S4_T1
										.innerJoin(S4_T2).on(
											bracket(
												S4_T1.dlv_slip_d_no.eq(S4_T2.dlv_slip_d_no)
											)
										)
										.innerJoin(S4_T3).on(
											bracket(
												S4_T2.dlv_slip_no.eq(S4_T3.dlv_slip_no)
												.and(S4_T2.dlv_slip_seq.eq(S4_T3.dlv_slip_seq))
											)
										)
										.leftOuterJoin(S4_M1).on(
											bracket(
												S4_T2.itm_cd.eq(S4_M1.itm_cd)
												.and(S4_T2.itm_sub1.eq(S4_M1.itm_sub1))
												.and(S4_T2.itm_sub2.eq(S4_M1.itm_sub2))
												.and(S4_T2.itm_sub3.eq(S4_M1.itm_sub3))
												.and(S4_T1.trd_unit_cd.eq(S4_M1.unit_cd))
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
									)
									.where(
										value(0).eq(value(0))
										.and(S4_T1.cmpl_flg.eq(value(false)))
										.and(S4_T1.dlv_slip_d_no.isNotNull())
										.and(S4_T1.iv_d_no.isNull())
										.and(S4_T3.dlv_slip_seq.eq(subQuery()
											.select(max(S4_T4.dlv_slip_seq))
											.from(S4_T4)
											.where(
												S4_T4.dlv_slip_no.eq(S4_T3.dlv_slip_no)
												.and(S4_T4.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
												.and(S4_T4.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
											)
										))
									)
									.unionAll(
										subQuery()
										.select(
											S5_T3.ship_rqst_id_cd.as("cst_cd"),
											S5_T3.trd_cur_cd,
											cases()
												.when(S5_M1.dscnt_itm_flg.eq(value(true)))
													.then(S5_T2.trd_cur_upri.multiply(value(-1)))
												.otherwise(S5_T2.trd_cur_upri).as("trd_cur_upri"),
											S5_T2.tax_cd,
											S5_T2.trd_cur_dscnt_amt,
											S5_T1.trd_unit_qty.as("trd_unit_rem_qty"),
											S5_T1.base_unit_qty.as("base_unit_rem_qty"),
											S5_T2.base_unit_qty.as("dscnt_base_qty")
										)
										.from(
											S5_T1
											.innerJoin(S5_T2).on(
												bracket(
													S5_T1.iv_d_no.eq(S5_T2.iv_d_no)
												)
											)
											.innerJoin(S5_T3).on(
												bracket(
													S5_T2.iv_mng_no.eq(S5_T3.iv_mng_no)
												)
											)
											.leftOuterJoin(S5_M1).on(
												bracket(
													S5_T2.itm_cd.eq(S5_M1.itm_cd)
													.and(S5_T2.itm_sub1.eq(S5_M1.itm_sub1))
													.and(S5_T2.itm_sub2.eq(S5_M1.itm_sub2))
													.and(S5_T2.itm_sub3.eq(S5_M1.itm_sub3))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S5_T1.cmpl_flg.eq(value(false)))
										)
									)
									.unionAll(
										subQuery()
										.select(
											S6_T5.bp_cd.as("cst_cd"),
											S6_T5.trd_cur_cd,
											cases()
												.when(S6_M2.dscnt_itm_flg.eq(value(true)))
													.then(S6_T4.trd_cur_upri.multiply(value(-1)))
												.otherwise(S6_T4.trd_cur_upri).as("trd_cur_upri"),
											S6_T4.tax_cd,
											S6_T4.trd_cur_dscnt_amt,
											bracket(
												S6_T3.base_unit_qty.subtract(greatest(nvl(S6_V1.pr("iv_qty"), value(0)), S6_T3.ship_act_qty))
											).multiply(S6_M1.conv_base_qty).divide(S6_M1.conv_qty).as("trd_unit_rem_qty"),
											S6_T3.base_unit_qty.subtract(greatest(nvl(S6_V1.pr("iv_qty"), value(0)), S6_T3.ship_act_qty)).as("base_unit_rem_qty"),
											S6_T4.base_unit_qty.as("dscnt_base_qty")
										)
										.from(
											S6_T1
											.innerJoin(S6_T6).on(
												bracket(
													S6_T1.slo_d_no.eq(S6_T6.slo_d_no)
												)
											)
											.innerJoin(S6_T2).on(
												bracket(
													S6_T6.ship_pr_no.eq(S6_T2.ship_pr_no)
												)
											)
											.innerJoin(S6_T3).on(
												bracket(
													S6_T2.ship_schd_no.eq(S6_T3.ship_schd_no)
												)
											)
											.innerJoin(S6_T4).on(
												bracket(
													S6_T3.dlv_slip_d_no.eq(S6_T4.dlv_slip_d_no)
													.and(S6_T3.dlv_slip_no.eq(S6_T4.dlv_slip_no))
													.and(S6_T3.dlv_slip_seq.eq(S6_T4.dlv_slip_seq))
												)
											)
											.innerJoin(S6_T5).on(
												bracket(
													S6_T4.dlv_slip_no.eq(S6_T5.dlv_slip_no)
													.and(S6_T4.dlv_slip_seq.eq(S6_T5.dlv_slip_seq))
												)
											)
											.leftOuterJoin(
												subQuery()
													.select(
															S6_ST1.ship_alloc_sts_no,
														sum(S6_ST1.base_unit_qty).as("iv_qty")
													).from(S6_ST1)
													.groupBy(S6_ST1.ship_alloc_sts_no)
													.view(S6_V1)).on(S6_T3.ship_alloc_sts_no.eq(S6_V1.pr(S6_ST1.ship_alloc_sts_no)))
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
													S6_M3.bp_cd.eq(S6_T5.bp_cd)
													.and(S6_M3.cst_flg.eq(value(true)))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S6_T1.cmpl_flg.eq(value(false)))
											.and(S6_T1.iv_d_no.isNull())
											.and(S6_T3.ship_inst_d_no.isNotNull())
											.and(S6_M3.cst_iv_flg.eq(value(true)))
											.and(S6_T3.ship_act_qty.lt(S6_T3.base_unit_qty))
											.and(S6_T3.base_unit_qty.subtract(greatest(nvl(S6_V1.pr("iv_qty"), value(0)), S6_T3.ship_act_qty)).gt(value(0)))
											.and(
												S6_T5.slip_sts_typ.in(
													value(MAC_SLIP_STS_TYP.CRT.value()),
													value(MAC_SLIP_STS_TYP.DIS.value())
												)
											)
											.and(S6_T5.dlv_slip_act_no.isNull())
										)
									)
									.unionAll(
										subQuery()
										.select(
											S7_T5.bp_cd.as("cst_cd"),
											S7_T5.trd_cur_cd,
											cases()
												.when(S7_M2.dscnt_itm_flg.eq(value(true)))
													.then(S7_T4.trd_cur_upri.multiply(value(-1)))
												.otherwise(S7_T4.trd_cur_upri).as("trd_cur_upri"),
											S7_T4.tax_cd,
											S7_T4.trd_cur_dscnt_amt,
											bracket(
												S7_T7.base_unit_qty.subtract(S7_T7.ship_ret_qty).subtract(nvl(S7_V1.pr("iv_qty"), value(0)))
											).multiply(S7_M1.conv_base_qty).divide(S7_M1.conv_qty).as("trd_unit_rem_qty"),
											S7_T7.base_unit_qty.subtract(S7_T7.ship_ret_qty).subtract(nvl(S7_V1.pr("iv_qty"), value(0))).as("base_unit_rem_qty"),
											S7_T7.base_unit_qty.as("dscnt_base_qty")
										)
										.from(
											S7_T1
											.innerJoin(S7_T6).on(
													bracket(
														S7_T1.slo_d_no.eq(S7_T6.slo_d_no)
													)
												)
											.innerJoin(S7_T2).on(
												bracket(
													S7_T6.ship_pr_no.eq(S7_T2.ship_pr_no)
												)
											)
											.innerJoin(S7_T3).on(
												bracket(
													S7_T2.ship_schd_no.eq(S7_T3.ship_schd_no)
												)
											)
											.innerJoin(S7_T7).on(
													bracket(
															S7_T3.ship_alloc_sts_no.eq(S7_T7.ship_alloc_sts_no)
													)
												)
											.innerJoin(S7_T4).on(
												bracket(
														S7_T7.dlv_slip_d_no.eq(S7_T4.dlv_slip_d_no)
													.and(S7_T7.dlv_slip_no.eq(S7_T4.dlv_slip_no))
													.and(S7_T7.dlv_slip_seq.eq(S7_T4.dlv_slip_seq))
												)
											)
											.innerJoin(S7_T5).on(
												bracket(
													S7_T4.dlv_slip_no.eq(S7_T5.dlv_slip_no)
													.and(S7_T4.dlv_slip_seq.eq(S7_T5.dlv_slip_seq))
												)
											)
											.leftOuterJoin(subQuery()
												.select(
														S7_ST1.ship_alloc_sts_no,
													sum(S7_ST1.base_unit_qty).as("iv_qty")
												).from(S7_ST1)
												.groupBy(S7_ST1.ship_alloc_sts_no)
												.view(S7_V1)).on(S7_T3.ship_alloc_sts_no.eq(S7_V1.pr(S7_ST1.ship_alloc_sts_no)))
											.leftOuterJoin(S7_M1).on(
												bracket(
													S7_T2.itm_cd.eq(S7_M1.itm_cd)
													.and(S7_T2.itm_sub1.eq(S7_M1.itm_sub1))
													.and(S7_T2.itm_sub2.eq(S7_M1.itm_sub2))
													.and(S7_T2.itm_sub3.eq(S7_M1.itm_sub3))
													.and(S7_T1.trd_unit_cd.eq(S7_M1.unit_cd))
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
											.leftOuterJoin(S7_M3).on(
												bracket(
													S7_M3.bp_cd.eq(S7_T5.bp_cd)
													.and(S7_M3.cst_flg.eq(value(true)))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S7_T1.cmpl_flg.eq(value(false)))
											.and(S7_T1.iv_d_no.isNull())
											.and(S7_M3.cst_iv_flg.eq(value(true)))
											.and(S7_T7.base_unit_qty.subtract(S7_T7.ship_ret_qty).subtract(nvl(S7_V1.pr("iv_qty"), value(0))).gt(value(0)))
											.and(
												S7_T5.slip_sts_typ.in(
													value(MAC_SLIP_STS_TYP.CRT.value()),
													value(MAC_SLIP_STS_TYP.DIS.value())
												)
											)
											.and(S7_T7.can_flg.eq(value(false)))
										)
									)
								)
							).view(S1_V1)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_V1.pr(S2_T2.tax_cd).eq(S1_M1.tax_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_V1.pr(S2_T3.cst_cd).eq(S1_M2.bp_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_V1.pr(S2_T3.trd_cur_cd).eq(S1_M3.cur_cd)
								)
							)
							.innerJoin(S1_M4).on(
								bracket(
									S1_V1.pr(S2_T3.cst_cd).eq(S1_M4.bp_cd)
								)
							)
							.innerJoin(S1_M5).on(
								bracket(
									S1_M4.acst_cd.eq(S1_M5.bp_cd)
								)
							)
							.innerJoin(S1_M6).on(
								bracket(
									S1_M5.bcst_cd.eq(S1_M6.bp_cd)
								)
							)
						).view(S0_V2)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_V2.pr("cred_cd").isNotNull())
					)
					.groupBy(
						S0_V2.pr("cred_cd"),
						S0_V2.pr(S2_T3.trd_cur_cd)
					)
			);
	}
	
}