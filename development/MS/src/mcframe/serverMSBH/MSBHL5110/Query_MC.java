package mcframe.serverMSBH.MSBHL5110;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

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
	 * -- MSBHL5110_MST_AP_EXC_GAIN_LOSS_Query_S01
	 */
	static MCQueryPlan MSBHL5110_MST_AP_EXC_GAIN_LOSS_S01() {
		MST_PAY_ACT_D_R S0_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_AP_EXC_GAIN_LOSS_R S0_T3 = MST_AP_EXC_GAIN_LOSS_R.create("T3");
		MST_PAY_ACT_R S0_T2 = MST_PAY_ACT_R.create("T2");
		MST_AP_D_R S0_T10 = MST_AP_D_R.create("T10");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAVM_RD_DPT_R S0_D1 = MAVM_RD_DPT_R.create("D1");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5110_MST_AP_EXC_GAIN_LOSS_Query_S01")
					.mainQuery()
					.select(
						S0_T2.ac_ym,
						S0_T1.ap_dpt_cd,
						S0_T1.asppl_cd,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T2.trd_cur_cd,
						S0_T1.wrk_no,
						S0_T1.ap_typ,
						nvl(
							S0_M7.ap_cred_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("ap_cred_cd"),
						sum(
							nvl(
								S0_T3.exc_gain_loss,
								value(0)
							)
						).as("exc_gain_loss"),
						sum(
							cases()
								.when(S0_T1.ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value())))
									.then(
										cases()
											.when(S0_T1.base_cur_amt.gt(value(0)))
												.then(
													S0_T1.base_cur_amt.subtract(
														bracket(
															nvl(
																S0_T10.base_cur_amt,
																value(0)
															).add(
																nvl(
																	S0_T10.base_cur_tax_amt,
																	value(0)
																)
															)
														)
													)
											)
											.when(S0_T1.base_cur_amt.lt(value(0)))
												.then(
													S0_T1.base_cur_amt.add(
														bracket(
															nvl(
																S0_T10.base_cur_amt,
																value(0)
															).add(
																nvl(
																	S0_T10.base_cur_tax_amt,
																	value(0)
																)
															)
														)
													)
											)
											.when(S0_T1.base_cur_amt.eq(value(0)))
												.then(value(0))
											.otherwise(nullValue())
								)
								.otherwise(value(0))
						).as("base_cur_sw_amt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(
							S0_T3.pay_act_d_no.eq(S0_T1.pay_act_d_no)
							.and(S0_T3.pay_act_d_seq.eq(S0_T1.pay_act_d_seq))
						)
						.innerJoin(S0_T2).on(
							S0_T1.pay_act_no.eq(S0_T2.pay_act_no)
							.and(S0_T1.pay_act_seq.eq(S0_T2.pay_act_seq))
						)
						.leftOuterJoin(S0_T10).on(S0_T1.ap_d_no.eq(S0_T10.ap_d_no))
						.leftOuterJoin(S0_M4).on(S0_T1.asppl_cd.eq(S0_M4.bp_cd))
						.leftOuterJoin(S0_M7).on(S0_M4.bsppl_cd.eq(S0_M7.bp_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T3.pay_act_d_no.isNotNull()
							.or(S0_T1.ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value())))
						)
						.cutoff$and(S0_T2.ac_ym.gt(bind("ac_ym")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0_M4.bp_nm.like(bind("asppl_nm")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.ap_typ.like(bind("ap_typ")))
						.cutoff$and(
							bind("tmp_ap_cred_crrct_flg").eq(value(true))
							.and(S0_M7.ap_cred_cd.isNotNull())
						)
						.cutoff$and(S0_M7.ap_cred_cd.eq(bind("ap_cred_cd")))
						.addDynamicPredicate(DS0D)
					)
					.groupBy(
						S0_T2.ac_ym,
						S0_T1.ap_dpt_cd,
						S0_T1.asppl_cd,
						S0_M4.bp_nm,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T2.trd_cur_cd,
						S0_T1.wrk_no,
						S0_T1.ap_typ,
						S0_M7.ap_cred_cd
					)
					)
					.setDynamicSQLInfo(
						when(boundOr("asppl_grp_flg1", "asppl_grp_cd1"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("asppl_grp_cd1")))),
						when(boundOr("asppl_grp_flg1", "asppl_grp_nm1"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_M4.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
						when(boundOr("asppl_grp_flg2", "asppl_grp_cd2"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("asppl_grp_cd2")))),
						when(boundOr("asppl_grp_flg2", "asppl_grp_nm2"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_M4.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
						when(boundOr("asppl_grp_flg3", "asppl_grp_cd3"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("asppl_grp_cd3")))),
						when(boundOr("asppl_grp_flg3", "asppl_grp_nm3"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_M4.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
						when(boundOr("asppl_grp_flg4", "asppl_grp_cd4"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("asppl_grp_cd4")))),
						when(boundOr("asppl_grp_flg4", "asppl_grp_nm4"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_M4.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
						when(boundOr("asppl_grp_flg5", "asppl_grp_cd5"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("asppl_grp_cd5")))),
						when(boundOr("asppl_grp_flg5", "asppl_grp_nm5"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_M4.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
						when(boundOr("asppl_grp_flg6", "asppl_grp_cd6"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("asppl_grp_cd6")))),
						when(boundOr("asppl_grp_flg6", "asppl_grp_nm6"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_M4.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
						when(boundOr("asppl_grp_flg7", "asppl_grp_cd7"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("asppl_grp_cd7")))),
						when(boundOr("asppl_grp_flg7", "asppl_grp_nm7"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_M4.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
						when(boundOr("asppl_grp_flg8", "asppl_grp_cd8"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("asppl_grp_cd8")))),
						when(boundOr("asppl_grp_flg8", "asppl_grp_nm8"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_M4.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
						when(boundOr("asppl_grp_flg9", "asppl_grp_cd9"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("asppl_grp_cd9")))),
						when(boundOr("asppl_grp_flg9", "asppl_grp_nm9"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_M4.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
						when(boundOr("asppl_grp_flg10", "asppl_grp_cd10"))
							.predicate(DS0D, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("asppl_grp_cd10")))),
						when(boundOr("asppl_grp_flg10", "asppl_grp_nm10"))
							.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_M4.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10")))),
						when(boundOr("chk_dac_flg"))
							.view(DS0D, v -> v.innerJoin(S0_D1).on(S0_T1.ap_dpt_cd.eq(S0_D1.dpt_cd))),
						when(boundOr("trd_cur_nm"))
							.view(DS0D, v -> v.leftOuterJoin(S0_M5).on(S0_T2.trd_cur_cd.eq(S0_M5.cur_cd)))
							.predicate(DS0D, p -> p.cutoff$and(S0_M5.cur_nm.like(bind("trd_cur_nm")))),
						when(boundOr("wrk_nm"))
							.view(DS0D, v -> v.leftOuterJoin(S0_T4).on(S0_T1.wrk_no.eq(S0_T4.wrk_no)))
							.predicate(DS0D, p -> p.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm"))))
			)
			;
	}
	
	/**
	 * -- MSBHL5110_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL5110_MST_AP_D_S01(boolean dac_flg) {
		MCTempView S0_SUB1 = createTempView("SUB1");
		MCTempView S1_SUB2 = createTempView("SUB2");
		MST_AP_D_R S2_T1 = MST_AP_D_R.create("T1");
		MST_WRK_R S2_T4 = MST_WRK_R.create("T4");
		MAVM_RD_DPT_R S2_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_R S2_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S2_M4 = MAM_BP_R.create("M4");
		MAM_CUR_R S2_M5 = MAM_CUR_R.create("M5");
		MAM_ITM_R S2_M6 = MAM_ITM_R.create("M6");
		MAM_BP_R S2_M7 = MAM_BP_R.create("M7");
		MST_AP_D_R S3_ST1 = MST_AP_D_R.create("ST1");
		MST_AP_D_R S4_ST1 = MST_AP_D_R.create("ST1");

		MAM_BP_GRP_R S2_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S2_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S2_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S2_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S2_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S2_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S2_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S2_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S2_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S2_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");

		MCDynamicSQLID DS0D = createDynamicSQLID("MSBHL5110_MST_AP_D_S01_DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("MSBHL5110_MST_AP_D_S01_DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("MSBHL5110_MST_AP_D_S01_DS2D");

		return createQueryPlan()
			.setQuery(
			sql("MSBHL5110_MST_AP_D_Query_S01")
			.mainQuery()
			.select(
				S0_SUB1.pr(S2_T1.ac_ym),
				S0_SUB1.pr(S2_T1.ap_dpt_cd),
				S0_SUB1.pr(S2_T1.asppl_cd),
				S0_SUB1.pr("asppl_nm"),
				S0_SUB1.pr("purc_act_no"),
				S0_SUB1.pr("rcpt_iv_no"),
				S0_SUB1.pr("rcpt_iv_mng_no"),
				S0_SUB1.pr(S2_T1.trd_cur_cd),
				S0_SUB1.pr(S2_T1.wrk_no),
				S0_SUB1.pr(S2_T1.ap_typ),
				S0_SUB1.pr("ap_cred_cd"),
				value(0).as("init_bal"),
				sum(
					nvl(
						S0_SUB1.pr("purc_amt"),
						value(0)
					)
				).as("purc_amt"),
				sum(
					nvl(
						S0_SUB1.pr("ret_amt"),
						value(0)
					)
				).as("ret_amt"),
				sum(
					nvl(
						S0_SUB1.pr("dscnt_amt_xtra"),
						value(0)
					).add(
						nvl(
							S0_SUB1.pr("dscnt_amt_dscnt"),
							value(0)
						)
					)
				).as("dscnt_amt"),
				sum(
					nvl(
						S0_SUB1.pr("sw_to_amt"),
						value(0)
					)
				).as("sw_to_amt"),
				sum(
					nvl(
						S0_SUB1.pr("tax_amt_add"),
						value(0)
					).add(
						nvl(
							S0_SUB1.pr("tax_amt_sub"),
							value(0)
						)
					)
				).as("tax_amt"),
				value(0).as("cash_amt"),
				value(0).as("note_amt"),
				value(0).as("account_amt"),
				value(0).as("setoff_amt"),
				value(0).as("end_bal"),
				bind("tmp_base_cur_cd").as("base_cur_cd"),
				value(0).as("base_cur_init_bal"),
				sum(S0_SUB1.pr("base_cur_purc_amt")).as("base_cur_purc_amt"),
				sum(S0_SUB1.pr("base_cur_ret_amt")).as("base_cur_ret_amt"),
				sum(
					nvl(
						S0_SUB1.pr("base_cur_dscnt_amt_xtra"),
						value(0)
					).add(
						nvl(
							S0_SUB1.pr("base_cur_dscnt_amt_dscnt"),
							value(0)
						)
					)
				).as("base_cur_dscnt_amt"),
				sum(S0_SUB1.pr("base_cur_sw_to_amt")).as("base_cur_sw_to_amt"),
				sum(
					nvl(
						S0_SUB1.pr("base_cur_tax_amt_add"),
						value(0)
					).add(
						nvl(
							S0_SUB1.pr("base_cur_tax_amt_sub"),
							value(0)
						)
					)
				).as("base_cur_tax_amt"),
				value(0).as("base_cur_cash_amt"),
				value(0).as("base_cur_note_amt"),
				value(0).as("base_cur_account_amt"),
				value(0).as("base_cur_setoff_amt"),
				value(0).as("base_cur_end_bal"),
				value(0).as("exc_gain_loss"),
				value(0).as("total_exc_gain_loss"),
				addDynamicSelect(DS0D)
			)
			.from(
				subQuery()
				.select(
					S1_SUB2.pr(S2_T1.ac_ym),
					S1_SUB2.pr(S2_T1.ap_dpt_cd),
					S1_SUB2.pr(S2_T1.asppl_cd),
					S1_SUB2.pr("asppl_nm"),
					S1_SUB2.pr("purc_act_no"),
					S1_SUB2.pr("rcpt_iv_no"),
					S1_SUB2.pr("rcpt_iv_mng_no"),
					S1_SUB2.pr(S2_T1.trd_cur_cd),
					S1_SUB2.pr(S2_T1.wrk_no),
					S1_SUB2.pr(S2_T1.ap_typ),
					S1_SUB2.pr("ap_cred_cd"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(true),
						value(0).subtract(S1_SUB2.pr("purc_amt")),
						S1_SUB2.pr("purc_amt")
					).as("purc_amt"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(false),
						value(0).subtract(S1_SUB2.pr("ret_amt")),
						S1_SUB2.pr("ret_amt")
					).as("ret_amt"),
					S1_SUB2.pr("dscnt_amt_dscnt").as("dscnt_amt_dscnt"),
					S1_SUB2.pr("dscnt_amt_xtra").as("dscnt_amt_xtra"),
					S1_SUB2.pr("sw_to_amt"),
					S1_SUB2.pr("tax_amt_add_dscnt").add(
						decode(
							S1_SUB2.pr(S2_M6.dscnt_itm_flg),
							value(true),
							value(0).subtract(S1_SUB2.pr("tax_amt_add")),
							S1_SUB2.pr("tax_amt_add")
						)
					).as("tax_amt_add"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(false),
						value(0).subtract(S1_SUB2.pr("tax_amt_sub_rtn")),
						S1_SUB2.pr("tax_amt_sub_rtn")
					).add(S1_SUB2.pr("tax_amt_sub")).as("tax_amt_sub"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(true),
						value(0).subtract(S1_SUB2.pr("base_cur_purc_amt")),
						S1_SUB2.pr("base_cur_purc_amt")
					).as("base_cur_purc_amt"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(false),
						value(0).subtract(S1_SUB2.pr("base_cur_ret_amt")),
						S1_SUB2.pr("base_cur_ret_amt")
					).as("base_cur_ret_amt"),
					S1_SUB2.pr("base_cur_dscnt_amt_dscnt").as("base_cur_dscnt_amt_dscnt"),
					S1_SUB2.pr("base_cur_dscnt_amt_xtra").as("base_cur_dscnt_amt_xtra"),
					S1_SUB2.pr("base_cur_sw_to_amt"),
					S1_SUB2.pr("base_cur_tax_amt_add_dscnt").add(
						decode(
							S1_SUB2.pr(S2_M6.dscnt_itm_flg),
							value(true),
							value(0).subtract(S1_SUB2.pr("base_cur_tax_amt_add")),
							S1_SUB2.pr("base_cur_tax_amt_add")
						)
					).as("base_cur_tax_amt_add"),
					decode(
						S1_SUB2.pr(S2_M6.dscnt_itm_flg),
						value(false),
						value(0).subtract(S1_SUB2.pr("base_cur_tax_amt_sub_rtn")),
						S1_SUB2.pr("base_cur_tax_amt_sub_rtn")
					).add(S1_SUB2.pr("base_cur_tax_amt_sub")).as("base_cur_tax_amt_sub"),
					addDynamicSelect(DS1D)
				)
				.from(
					subQuery()
					.select(
						S2_T1.ac_ym,
						S2_T1.ap_dpt_cd,
						S2_T1.asppl_cd,
						nvl(
							S2_M4.bp_nm,
							value(MAC_STR.NULL_VAL.value())
						).as("asppl_nm"),
						bracket(
							cases()
								.when(
									bind("tmp_base_cur_cd").neq(S2_T1.trd_cur_cd)
									.and(
										S2_M3.sppl_iv_flg.eq(value(false))
										.or(
											S2_M3.sppl_iv_flg.eq(value(true))
											.and(S2_T1.rcpt_iv_no.eq(value(MAC_STR.NULL_VAL.value())))
										)
									)
								)
									.then(S2_T1.purc_act_no)
								.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S2_T1.purc_act_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("purc_act_no"),
						bracket(
							cases()
								.when(S2_M3.sppl_iv_flg.eq(value(true)))
									.then(S2_T1.rcpt_iv_no)
								.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S2_T1.rcpt_iv_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("rcpt_iv_no"),
						bracket(
							cases()
								.when(S2_M3.sppl_iv_flg.eq(value(true)))
									.then(S2_T1.rcpt_iv_mng_no)
								.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S2_T1.rcpt_iv_mng_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("rcpt_iv_mng_no"),
						S2_T1.trd_cur_cd,
						S2_T1.wrk_no,
						S2_T1.ap_typ,
						nvl(
							S2_M7.ap_cred_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("ap_cred_cd"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC.value()),
							S2_T1.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_XPNS.value()),
							S2_T1.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_VMI.value()),
							S2_T1.trd_cur_amt,
							value(0)
						).as("purc_amt"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
							S2_T1.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
							S2_T1.trd_cur_amt,
							value(0)
						).as("ret_amt"),
						value(0).subtract(
							decode(
								S2_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								S2_T1.trd_cur_amt,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								S2_T1.trd_cur_amt,
								value(0)
							)
						).as("dscnt_amt_dscnt"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
							S2_T1.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
							S2_T1.trd_cur_amt,
							value(0)
						).as("dscnt_amt_xtra"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC.value()),
							S2_T1.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_XPNS.value()),
							S2_T1.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_VMI.value()),
							S2_T1.trd_cur_tax_amt,
							value(0)
						).as("tax_amt_add"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
							S2_T1.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
							S2_T1.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value()),
							S2_T1.trd_cur_tax_amt,
							value(0)
						).as("tax_amt_add_dscnt"),
						value(0).subtract(
							decode(
								S2_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								S2_T1.trd_cur_tax_amt,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								S2_T1.trd_cur_tax_amt,
								value(0)
							)
						).as("tax_amt_sub"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
							S2_T1.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
							S2_T1.trd_cur_tax_amt,
							value(0)
						).as("tax_amt_sub_rtn"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.APSW_IN_CHK.value()),
							S2_T1.trd_cur_amt.add(S2_T1.trd_cur_tax_amt),
							value(0)
						).as("sw_to_amt"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC.value()),
							S2_T1.base_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_XPNS.value()),
							S2_T1.base_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_VMI.value()),
							S2_T1.base_cur_amt,
							value(0)
						).as("base_cur_purc_amt"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
							S2_T1.base_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
							S2_T1.base_cur_amt,
							value(0)
						).as("base_cur_ret_amt"),
						value(0).subtract(
							decode(
								S2_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								S2_T1.base_cur_amt,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								S2_T1.base_cur_amt,
								value(0)
							)
						).as("base_cur_dscnt_amt_dscnt"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
							S2_T1.base_cur_amt,
							value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
							S2_T1.base_cur_amt,
							value(0)
						).as("base_cur_dscnt_amt_xtra"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC.value()),
							S2_T1.base_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_XPNS.value()),
							S2_T1.base_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_VMI.value()),
							S2_T1.base_cur_tax_amt,
							value(0)
						).as("base_cur_tax_amt_add"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
							S2_T1.base_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
							S2_T1.base_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value()),
							S2_T1.base_cur_tax_amt,
							value(0)
						).as("base_cur_tax_amt_add_dscnt"),
						value(0).subtract(
							decode(
								S2_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								S2_T1.base_cur_tax_amt,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								S2_T1.base_cur_tax_amt,
								value(0)
							)
						).as("base_cur_tax_amt_sub"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
							S2_T1.base_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
							S2_T1.base_cur_tax_amt,
							value(0)
						).as("base_cur_tax_amt_sub_rtn"),
						decode(
							S2_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.APSW_IN_CHK.value()),
							S2_T1.base_cur_amt.add(S2_T1.base_cur_tax_amt),
							value(0)
						).as("base_cur_sw_to_amt"),
						S2_M6.dscnt_itm_flg,
						addDynamicSelect(DS2D)
					)
					.from(
						S2_T1
						.leftOuterJoin(S2_M3).on(S2_T1.sppl_cd.eq(S2_M3.bp_cd))
						.leftOuterJoin(S2_M4).on(S2_T1.asppl_cd.eq(S2_M4.bp_cd))
						.leftOuterJoin(S2_M6).on(
							S2_T1.itm_cd.eq(S2_M6.itm_cd)
							.and(S2_T1.itm_sub1.eq(S2_M6.itm_sub1))
							.and(S2_T1.itm_sub2.eq(S2_M6.itm_sub2))
							.and(S2_T1.itm_sub3.eq(S2_M6.itm_sub3))
						)
						.leftOuterJoin(S2_M7).on(S2_M4.bsppl_cd.eq(S2_M7.bp_cd))
						.addDynamicView(DS2D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S3_ST1)
								.where(
									S3_ST1.ap_d_no.neq(S3_ST1.org_ap_d_no)
									.and(S3_ST1.org_ap_d_no.eq(S2_T1.ap_d_no))
								)
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S4_ST1)
								.where(
									S4_ST1.crryovr_src_ap_d_no.eq(S2_T1.ap_d_no)
								)
							)
						)
						.and(S2_T1.sw_flg.eq(value(false)))
						.addDynamicPredicate(DS2D)
						.and(S2_T1.ac_ym.gt(bind("ac_ym")))
						.and(S2_T1.ac_ym.between(bind("tmp_ac_ym_fr"), bind("ac_ym_to")))
						.cutoff$and(S2_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S2_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S2_M4.bp_nm.like(bind("asppl_nm")))
						.cutoff$and(S2_M4.bp_grp_cd1.like(bind("asppl_grp_cd1")))
						.cutoff$and(S2_M4.bp_grp_cd2.like(bind("asppl_grp_cd2")))
						.cutoff$and(S2_M4.bp_grp_cd3.like(bind("asppl_grp_cd3")))
						.cutoff$and(S2_M4.bp_grp_cd4.like(bind("asppl_grp_cd4")))
						.cutoff$and(S2_M4.bp_grp_cd5.like(bind("asppl_grp_cd5")))
						.cutoff$and(S2_M4.bp_grp_cd6.like(bind("asppl_grp_cd6")))
						.cutoff$and(S2_M4.bp_grp_cd7.like(bind("asppl_grp_cd7")))
						.cutoff$and(S2_M4.bp_grp_cd8.like(bind("asppl_grp_cd8")))
						.cutoff$and(S2_M4.bp_grp_cd9.like(bind("asppl_grp_cd9")))
						.cutoff$and(S2_M4.bp_grp_cd10.like(bind("asppl_grp_cd10")))
						.cutoff$and(
							bracket(
								cases()
									.when(
										bind("tmp_base_cur_cd").neq(S2_T1.trd_cur_cd)
										.and(
											S2_M3.sppl_iv_flg.eq(value(false))
											.or(
												S2_M3.sppl_iv_flg.eq(value(true))
												.and(S2_T1.rcpt_iv_no.eq(value(MAC_STR.NULL_VAL.value())))
											)
										)
									)
										.then(S2_T1.purc_act_no)
									.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S2_T1.purc_act_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("purc_act_no"))
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S2_M3.sppl_iv_flg.eq(value(true)))
										.then(S2_T1.rcpt_iv_no)
									.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S2_T1.rcpt_iv_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("rcpt_iv_no"))
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S2_M3.sppl_iv_flg.eq(value(true)))
										.then(S2_T1.rcpt_iv_mng_no)
									.when(S2_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S2_T1.rcpt_iv_mng_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("rcpt_iv_mng_no"))
						)
						.cutoff$and(S2_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S2_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S2_T1.ap_typ.like(bind("ap_typ")))
						.cutoff$and(
							bind("tmp_ap_cred_crrct_flg").eq(value(true))
							.and(S2_M7.ap_cred_cd.isNotNull())
						)
						.cutoff$and(S2_M7.ap_cred_cd.eq(bind("ap_cred_cd")))
					).view(S1_SUB2)
				).view(S0_SUB1)
			)
			.groupBy(
				S0_SUB1.pr(S2_T1.ac_ym),
				S0_SUB1.pr(S2_T1.ap_dpt_cd),
				S0_SUB1.pr(S2_T1.asppl_cd),
				S0_SUB1.pr("asppl_nm"),
				S0_SUB1.pr("purc_act_no"),
				S0_SUB1.pr("rcpt_iv_no"),
				S0_SUB1.pr("rcpt_iv_mng_no"),
				S0_SUB1.pr(S2_T1.trd_cur_cd),
				S0_SUB1.pr(S2_T1.wrk_no),
				S0_SUB1.pr(S2_T1.ap_typ),
				S0_SUB1.pr("ap_cred_cd"),
				addDynamicGroupBy(DS0D)
			))
			.setDynamicSQLInfo(
				when(boundOr("trd_cur_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_M5).on(S2_T1.trd_cur_cd.eq(S2_M5.cur_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_M5.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_T4).on(S2_T1.wrk_no.eq(S2_T4.wrk_no)))
					.predicate(DS2D, p -> p.cutoff$and(S2_T4.wrk_nm.like(bind("wrk_nm")))),
				
				when(r -> dac_flg)
					.view(DS2D, v -> v.innerJoin(S2_DAC).on(S2_DAC.dpt_cd.eq(S2_T1.ap_dpt_cd))),
				
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(1, S2_ASPPL_GRP1, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(2, S2_ASPPL_GRP2, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(3, S2_ASPPL_GRP3, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(4, S2_ASPPL_GRP4, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(5, S2_ASPPL_GRP5, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(6, S2_ASPPL_GRP6, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(7, S2_ASPPL_GRP7, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(8, S2_ASPPL_GRP8, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(9, S2_ASPPL_GRP9, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(10, S2_ASPPL_GRP10, S2_M4, DS0D, DS1D, DS2D, S0_SUB1, S1_SUB2),
				createBpGrpTableAndWhereDynamicInfo(1, S2_ASPPL_GRP1, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(2, S2_ASPPL_GRP2, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(3, S2_ASPPL_GRP3, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(4, S2_ASPPL_GRP4, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(5, S2_ASPPL_GRP5, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(6, S2_ASPPL_GRP6, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(7, S2_ASPPL_GRP7, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(8, S2_ASPPL_GRP8, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(9, S2_ASPPL_GRP9, S2_M4, DS2D),
				createBpGrpTableAndWhereDynamicInfo(10, S2_ASPPL_GRP10, S2_M4, DS2D)
			);
	}
	
	static MCDynamicSQLInfo createMSBHL5110_MST_AP_D_S01_BpGrpSelectAndGroup(
			int no, MAM_BP_GRP_R grpR, MAM_BP_R bpR, MCDynamicSQLID DS0D, MCDynamicSQLID DS1D, MCDynamicSQLID DS2D,
			MCTempView S0_SUB1, MCTempView S1_SUB2) {
		String flgCol = "asppl_grp_flg" + no;
		String cdCol = "asppl_grp_cd" + no;
		String nmCol = "asppl_grp_nm" + no;
		MCStringPermColumn grpCdCol = (MCStringPermColumn)bpR.getColumn$("bp_grp_cd" + no);
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol))
				.select(DS0D, S0_SUB1.pr(cdCol), S0_SUB1.pr(nmCol))
				.select(DS1D, S1_SUB2.pr(cdCol), S1_SUB2.pr(nmCol))
				.select(DS2D,grpCdCol.as(cdCol),grpR.bp_grp_nm.as(nmCol))
				.groupBy(DS0D, S0_SUB1.pr(cdCol), S0_SUB1.pr(nmCol))
				;
	}
	
	/**
	 * -- MSBHL5110_MST_AP_D_Query_S02
	 */
	static MCQueryPlan MSBHL5110_MST_AP_D_S02(boolean chk_dac_flg) {
		MCQueryPlan APD = MSBHL5110_MST_AP_D_S01(chk_dac_flg);
		MCQueryPlan PAY = MSBHL5110_MST_PAY_ACT_D_S01(chk_dac_flg);

		MCTempView S0_APD = createTempView("APD");
		MCTempView S0_PAY = createTempView("PAY");

		MCDynamicSQLID DS0D = createDynamicSQLID("MSBHL5110_MST_AP_D_S02_DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("MSBHL5110_MST_AP_D_S02_DS1D");

		MCQueryPlan query = createQueryPlan()
			.setQuery(
				sql("MSBHL5110_MST_AP_D_Query_S02")
				.mainQuery()
				.select(
					nvl(
						S0_APD.pr("ac_ym"),
						S0_PAY.pr("ac_ym")
					).as("ac_ym"),
					nvl(
						S0_APD.pr("ap_dpt_cd"),
						S0_PAY.pr("ap_dpt_cd")
					).as("ap_dpt_cd"),
					nvl(
						S0_APD.pr("asppl_cd"),
						S0_PAY.pr("asppl_cd")
					).as("asppl_cd"),
					nvl(
						S0_APD.pr("asppl_nm"),
						S0_PAY.pr("asppl_nm")
					).as("asppl_nm"),
					nvl(
						S0_APD.pr("purc_act_no"),
						S0_PAY.pr("purc_act_no")
					).as("purc_act_no"),
					nvl(
						S0_APD.pr("rcpt_iv_no"),
						S0_PAY.pr("rcpt_iv_no")
					).as("rcpt_iv_no"),
					nvl(
						S0_APD.pr("rcpt_iv_mng_no"),
						S0_PAY.pr("rcpt_iv_mng_no")
					).as("rcpt_iv_mng_no"),
					nvl(
						S0_APD.pr("trd_cur_cd"),
						S0_PAY.pr("trd_cur_cd")
					).as("trd_cur_cd"),
					nvl(
						S0_APD.pr("wrk_no"),
						S0_PAY.pr("wrk_no")
					).as("wrk_no"),
					nvl(
						S0_APD.pr("ap_typ"),
						S0_PAY.pr("ap_typ")
					).as("ap_typ"),
					nvl(
						S0_APD.pr("ap_cred_cd"),
						S0_PAY.pr("ap_cred_cd")
					).as("ap_cred_cd"),
					S0_APD.pr("init_bal"),
					S0_APD.pr("purc_amt"),
					S0_APD.pr("ret_amt"),
					S0_APD.pr("dscnt_amt"),
					S0_APD.pr("sw_to_amt"),
					S0_APD.pr("tax_amt"),
					nvl(
						S0_PAY.pr("cash_amt"),
						value(0)
					).as("cash_amt"),
					nvl(
						S0_PAY.pr("note_amt"),
						value(0)
					).as("note_amt"),
					nvl(
						S0_PAY.pr("account_amt"),
						value(0)
					).as("account_amt"),
					nvl(
						S0_PAY.pr("setoff_amt"),
						value(0)
					).as("setoff_amt"),
					nvl(
						S0_PAY.pr("sw_amt"),
						value(0)
					).as("sw_amt"),
					S0_APD.pr("end_bal"),
					S0_APD.pr("base_cur_cd"),
					S0_APD.pr("base_cur_init_bal"),
					S0_APD.pr("base_cur_purc_amt"),
					S0_APD.pr("base_cur_ret_amt"),
					S0_APD.pr("base_cur_dscnt_amt"),
					S0_APD.pr("base_cur_sw_to_amt"),
					S0_APD.pr("base_cur_tax_amt"),
					nvl(
						S0_PAY.pr("base_cur_cash_amt"),
						value(0)
					).as("base_cur_cash_amt"),
					nvl(
						S0_PAY.pr("base_cur_note_amt"),
						value(0)
					).as("base_cur_note_amt"),
					nvl(
						S0_PAY.pr("base_cur_account_amt"),
						value(0)
					).as("base_cur_account_amt"),
					nvl(
						S0_PAY.pr("base_cur_setoff_amt"),
						value(0)
					).as("base_cur_setoff_amt"),
					nvl(
						S0_PAY.pr("base_cur_sw_amt"),
						value(0)
					).as("base_cur_sw_amt"),
					S0_APD.pr("base_cur_end_bal"),
					S0_APD.pr("exc_gain_loss"),
					S0_APD.pr("total_exc_gain_loss"),
					nullValue().as("ins_usr_id"),
					nullValue().as("ins_usr_nm"),
					value((MCTimestamp)null).as("ins_ts"),
					nullValue().as("ins_func_id"),
					value((MCNumber)null).as("upd_cntr"),
					nullValue().as("upd_usr_id"),
					nullValue().as("upd_usr_nm"),
					value((MCTimestamp)null).as("upd_ts"),
					nullValue().as("upd_func_id"),
					nullValue().as("upd_srv_req_no"),
					addDynamicSelect(DS0D)
				)
				.from(
					APD.toSubQuery().view(S0_APD)
					.leftOuterJoin(PAY.toSubQuery().view(S0_PAY))
						.on(
							S0_APD.pr("ac_ym").eq(S0_PAY.pr("ac_ym"))
							.and(S0_APD.pr("ap_cred_cd").eq(S0_PAY.pr("ap_cred_cd")))
							.and(S0_APD.pr("ap_dpt_cd").eq(S0_PAY.pr("ap_dpt_cd")))
							.and(S0_APD.pr("ap_typ").eq(S0_PAY.pr("ap_typ")))
							.and(S0_APD.pr("asppl_cd").eq(S0_PAY.pr("asppl_cd")))
							.and(S0_APD.pr("asppl_nm").eq(S0_PAY.pr("asppl_nm")))
							.and(S0_APD.pr("purc_act_no").eq(S0_PAY.pr("purc_act_no")))
							.and(S0_APD.pr("rcpt_iv_mng_no").eq(S0_PAY.pr("rcpt_iv_mng_no")))
							.and(S0_APD.pr("rcpt_iv_no").eq(S0_PAY.pr("rcpt_iv_no")))
							.and(S0_APD.pr("trd_cur_cd").eq(S0_PAY.pr("trd_cur_cd")))
							.and(S0_APD.pr("wrk_no").eq(S0_PAY.pr("wrk_no")))
						)
				)
				.where(
					value(0).eq(value(0))
				)
				.union(
					subQuery()
					.select(
						S0_PAY.pr("ac_ym"),
						S0_PAY.pr("ap_dpt_cd"),
						S0_PAY.pr("asppl_cd"),
						S0_PAY.pr("asppl_nm"),
						S0_PAY.pr("purc_act_no"),
						S0_PAY.pr("rcpt_iv_no"),
						S0_PAY.pr("rcpt_iv_mng_no"),
						S0_PAY.pr("trd_cur_cd"),
						S0_PAY.pr("wrk_no"),
						S0_PAY.pr("ap_typ"),
						S0_PAY.pr("ap_cred_cd"),
						value(0).as("init_bal"),
						value(0).as("purc_amt"),
						value(0).as("ret_amt"),
						value(0).as("dscnt_amt"),
						value(0).as("sw_to_amt"),
						value(0).as("tax_amt"),
						S0_PAY.pr("cash_amt"),
						S0_PAY.pr("note_amt"),
						S0_PAY.pr("account_amt"),
						S0_PAY.pr("setoff_amt"),
						S0_PAY.pr("sw_amt"),
						value(0).as("end_bal"),
						bind("tmp_base_cur_cd").as("base_cur_cd"),
						value(0).as("base_cur_init_bal"),
						value(0).as("base_cur_purc_amt"),
						value(0).as("base_cur_ret_amt"),
						value(0).as("base_cur_dscnt_amt"),
						value(0).as("base_cur_sw_to_amt"),
						value(0).as("base_cur_tax_amt"),
						S0_PAY.pr("base_cur_cash_amt"),
						S0_PAY.pr("base_cur_note_amt"),
						S0_PAY.pr("base_cur_account_amt"),
						S0_PAY.pr("base_cur_setoff_amt"),
						S0_PAY.pr("base_cur_sw_amt"),
						value(0).as("base_cur_end_bal"),
						value(0).as("exc_gain_loss"),
						value(0).as("total_exc_gain_loss"),
						nullValue().as("ins_usr_id"),
						nullValue().as("ins_usr_nm"),
						value((MCTimestamp)null).as("ins_ts"),
						nullValue().as("ins_func_id"),
						value((MCNumber)null).as("upd_cntr"),
						nullValue().as("upd_usr_id"),
						nullValue().as("upd_usr_nm"),
						value((MCTimestamp)null).as("upd_ts"),
						nullValue().as("upd_func_id"),
						nullValue().as("upd_srv_req_no"),
						addDynamicSelect(DS1D)
					)
					.from(
						PAY.toSubQuery().view(S0_PAY)
						.leftOuterJoin(APD.toSubQuery().view(S0_APD))
							.on(
								S0_PAY.pr("ac_ym").eq(S0_APD.pr("ac_ym"))
								.and(S0_PAY.pr("ap_cred_cd").eq(S0_APD.pr("ap_cred_cd")))
								.and(S0_PAY.pr("ap_dpt_cd").eq(S0_APD.pr("ap_dpt_cd")))
								.and(S0_PAY.pr("ap_typ").eq(S0_APD.pr("ap_typ")))
								.and(S0_PAY.pr("asppl_cd").eq(S0_APD.pr("asppl_cd")))
								.and(S0_PAY.pr("asppl_nm").eq(S0_APD.pr("asppl_nm")))
								.and(S0_PAY.pr("purc_act_no").eq(S0_APD.pr("purc_act_no")))
								.and(S0_PAY.pr("rcpt_iv_mng_no").eq(S0_APD.pr("rcpt_iv_mng_no")))
								.and(S0_PAY.pr("rcpt_iv_no").eq(S0_APD.pr("rcpt_iv_no")))
								.and(S0_PAY.pr("trd_cur_cd").eq(S0_APD.pr("trd_cur_cd")))
								.and(S0_PAY.pr("wrk_no").eq(S0_APD.pr("wrk_no")))
							)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_APD.pr("ac_ym").isNull())
					)
				)
			);
		query.setDynamicSQLInfo(
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(1, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(2, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(3, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(4, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(5, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(6, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(7, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(8, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(9, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(10, S0_APD, DS0D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(1, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(2, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(3, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(4, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(5, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(6, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(7, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(8, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(9, S0_PAY, DS1D),
			createMSBHL5110_MST_AP_D_S02_BpGrpSelect(10, S0_PAY, DS1D)
		);
		query.addDynamicSQLInfo(APD.getDynamicSQLInfo());
		query.addDynamicSQLInfo(PAY.getDynamicSQLInfo());
		return query;
	}
	
	static MCDynamicSQLInfo createMSBHL5110_MST_AP_D_S02_BpGrpSelect(int no, MCTempView S0_VIEW, MCDynamicSQLID id) {
		String flgCol = "asppl_grp_flg" + no;
		String cdCol = "asppl_grp_cd" + no;
		String nmCol = "asppl_grp_nm" + no;
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol))
				.select(id, S0_VIEW.pr(cdCol), S0_VIEW.pr(nmCol))
				;
	}
	
	/**
	 * -- MSBHL5110_MST_MLY_AP_BAL_Query_S01
	 */
	static MCQueryPlan MSBHL5110_MST_MLY_AP_BAL_S01(boolean chk_dac_flg) {
		MST_MLY_AP_BAL_R S0_T1 = MST_MLY_AP_BAL_R.create("T1");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");

		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("MSBHL5110_MST_MLY_AP_BAL_S01_DS0D");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5110_MST_MLY_AP_BAL_Query_S01")
				.mainQuery()
				.select(
					S0_T1.ac_ym,
					S0_T1.ap_dpt_cd,
					S0_T1.asppl_cd,
					S0_M4.bp_nm.as("asppl_nm"),
					S0_T1.purc_act_no,
					nvl(
						S0_T1.rcpt_iv_no,
						value(MAC_STR.NULL_VAL.value())
					).as("rcpt_iv_no"),
					S0_T1.rcpt_iv_mng_no,
					S0_T1.trd_cur_cd,
					S0_T1.wrk_no,
					S0_T1.ap_typ,
					S0_M7.ap_cred_cd,
					S0_T1.init_bal,
					S0_T1.purc_amt,
					S0_T1.ret_amt,
					S0_T1.dscnt_amt,
					S0_T1.sw_to_amt,
					S0_T1.tax_amt,
					S0_T1.cash_amt,
					S0_T1.note_amt,
					S0_T1.account_amt,
					S0_T1.setoff_amt,
					S0_T1.sw_amt,
					S0_T1.end_bal,
					S0_T1.base_cur_cd,
					S0_T1.base_cur_init_bal,
					S0_T1.base_cur_purc_amt,
					S0_T1.base_cur_ret_amt,
					S0_T1.base_cur_dscnt_amt,
					S0_T1.base_cur_sw_to_amt,
					S0_T1.base_cur_tax_amt,
					S0_T1.base_cur_cash_amt,
					S0_T1.base_cur_note_amt,
					S0_T1.base_cur_account_amt,
					S0_T1.base_cur_setoff_amt,
					S0_T1.base_cur_sw_amt,
					S0_T1.base_cur_end_bal,
					S0_T1.exc_gain_loss,
					S0_T1.total_exc_gain_loss,
					S0_T1.ins_usr_id,
					S0_T1.ins_usr_nm,
					S0_T1.ins_ts,
					S0_T1.ins_func_id,
					S0_T1.upd_cntr,
					S0_T1.upd_usr_id,
					S0_T1.upd_usr_nm,
					S0_T1.upd_ts,
					S0_T1.upd_func_id,
					S0_T1.upd_srv_req_no,
					addDynamicSelect(DS0D)
				)
				.from(
					S0_T1
					.leftOuterJoin(S0_M4).on(S0_T1.asppl_cd.eq(S0_M4.bp_cd))
					.leftOuterJoin(S0_M7).on(S0_M4.bsppl_cd.eq(S0_M7.bp_cd))
					.addDynamicView(DS0D)
				)
				.where(
					value(0).eq(value(0))
					.addDynamicPredicate(DS0D)
					.and(S0_T1.ac_ym.lte(bind("ac_ym")))
					.and(S0_T1.ac_ym.between(bind("tmp_ac_ym_fr"), bind("ac_ym_to")))
					.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
					.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
					.cutoff$and(S0_M4.bp_nm.like(bind("asppl_nm")))
					.cutoff$and(S0_M4.bp_grp_cd1.like(bind("asppl_grp_cd1")))
					.cutoff$and(S0_M4.bp_grp_cd2.like(bind("asppl_grp_cd2")))
					.cutoff$and(S0_M4.bp_grp_cd3.like(bind("asppl_grp_cd3")))
					.cutoff$and(S0_M4.bp_grp_cd4.like(bind("asppl_grp_cd4")))
					.cutoff$and(S0_M4.bp_grp_cd5.like(bind("asppl_grp_cd5")))
					.cutoff$and(S0_M4.bp_grp_cd6.like(bind("asppl_grp_cd6")))
					.cutoff$and(S0_M4.bp_grp_cd7.like(bind("asppl_grp_cd7")))
					.cutoff$and(S0_M4.bp_grp_cd8.like(bind("asppl_grp_cd8")))
					.cutoff$and(S0_M4.bp_grp_cd9.like(bind("asppl_grp_cd9")))
					.cutoff$and(S0_M4.bp_grp_cd10.like(bind("asppl_grp_cd10")))
					.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
					.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
					.cutoff$and(S0_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
					.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
					.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
					.cutoff$and(S0_T1.ap_typ.like(bind("ap_typ")))
					.cutoff$and(
						bind("tmp_ap_cred_crrct_flg").eq(value(true))
						.and(S0_M7.ap_cred_cd.isNotNull())
					)
					.cutoff$and(S0_M7.ap_cred_cd.eq(bind("ap_cred_cd")))
				)
		)
		.setDynamicSQLInfo(
			when(boundOr("trd_cur_nm"))
				.view(DS0D, v -> v.leftOuterJoin(S0_M5).on(S0_T1.trd_cur_cd.eq(S0_M5.cur_cd)))
				.predicate(DS0D, p -> p.cutoff$and(S0_M5.cur_nm.like(bind("trd_cur_nm")))),
			when(boundOr("wrk_nm"))
				.view(DS0D, v -> v.leftOuterJoin(S0_T4).on(S0_T1.wrk_no.eq(S0_T4.wrk_no)))
				.predicate(DS0D, p -> p.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
			
			when(r -> chk_dac_flg)
				.view(DS0D, v -> v.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.ap_dpt_cd))),
			
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(1, S0_ASPPL_GRP1, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(2, S0_ASPPL_GRP2, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(3, S0_ASPPL_GRP3, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(4, S0_ASPPL_GRP4, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(5, S0_ASPPL_GRP5, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(6, S0_ASPPL_GRP6, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(7, S0_ASPPL_GRP7, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(8, S0_ASPPL_GRP8, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(9, S0_ASPPL_GRP9, S0_M4, DS0D),
			createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(10, S0_ASPPL_GRP10, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(1, S0_ASPPL_GRP1, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(2, S0_ASPPL_GRP2, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(3, S0_ASPPL_GRP3, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(4, S0_ASPPL_GRP4, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(5, S0_ASPPL_GRP5, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(6, S0_ASPPL_GRP6, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(7, S0_ASPPL_GRP7, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(8, S0_ASPPL_GRP8, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(9, S0_ASPPL_GRP9, S0_M4, DS0D),
			createBpGrpTableAndWhereDynamicInfo(10, S0_ASPPL_GRP10, S0_M4, DS0D)
		);
	}
	
	static MCDynamicSQLInfo createMSBHL5110_MST_MLY_AP_BAL_S01_BpGrpSelectAndGroup(int no, MAM_BP_GRP_R grpR, MAM_BP_R bpR, MCDynamicSQLID DS0D) {
		String flgCol = "asppl_grp_flg" + no;
		String cdCol = "asppl_grp_cd" + no;
		String nmCol = "asppl_grp_nm" + no;
		MCStringPermColumn grpCdCol = (MCStringPermColumn)bpR.getColumn$("bp_grp_cd" + no);
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol))
				.select(DS0D, grpCdCol.as(cdCol), grpR.bp_grp_nm.as(nmCol))
				;
	}
	
	
	/**
	 * -- MSBHL5110_MST_MLY_AP_BAL_Query_S02
	 */
	static MCQueryPlan MSBHL5110_MST_MLY_AP_BAL_S02(ApBal_Srch01_CtrlR up0) {
		MCQueryPlan BAL = MSBHL5110_MST_MLY_AP_BAL_S01(up0.chk_dac_flg());
		MCQueryPlan DTL = MSBHL5110_MST_AP_D_S02(up0.chk_dac_flg());
		
		MCDynamicSQLID DS0D = createDynamicSQLID("MSBHL5110_MST_MLY_AP_BAL_S02_DS0D");

		MCQueryPlan query = createQueryPlan();
		MCMainQuery main = BAL.getQuery();
		query.setQuery(
				main.unionAll(DTL.toSubQuery())
				.orderBy(
					addDynamicOrderBy(DS0D),
					pr("base_cur_cd").asc(),
					pr("ac_ym").asc()
				)
			);
		query.setDynamicSQLInfo(
				when(r -> up0.group_ap_dpt_flg()).orderBy(DS0D, pr("ap_dpt_cd").asc()),
				when(r -> up0.group_ap_cred_flg() || !isNull(up0.ap_cred_cd())).orderBy(DS0D, pr("ap_cred_cd").asc()),
				when(r -> up0.group_asppl_flg()).orderBy(DS0D, pr("asppl_cd").asc()),
				when(r -> up0.group_trd_cur_flg()).orderBy(DS0D, pr("trd_cur_cd").asc()),
				when(r -> up0.group_rcpt_iv_no_flg()).orderBy(DS0D, pr("rcpt_iv_no").asc()),
				when(r -> up0.group_rcpt_iv_mng_no_flg()).orderBy(DS0D, pr("rcpt_iv_mng_no").asc()),
				when(r -> up0.group_purc_act_no_flg()).orderBy(DS0D, pr("purc_act_no").asc()),
				when(r -> up0.group_wrk_no_flg()).orderBy(DS0D, pr("wrk_no").asc()),
				when(r -> up0.group_ap_typ_flg()).orderBy(DS0D, pr("ap_typ").asc())
			);
		query.addDynamicSQLInfo(BAL.getDynamicSQLInfo());
		query.addDynamicSQLInfo(DTL.getDynamicSQLInfo());
		
		query.setSQLID("MSBHL5110_MST_MLY_AP_BAL_Query_S02");
		
		return query;
	}
	
	/**
	 * -- MSBHL5110_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL5110_MST_PAY_ACT_D_S01(boolean chk_dac_flg) {
		MCTempView S0_SUB1 = createTempView("SUB1");
		MST_PAY_ACT_D_R S1_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_PAY_ACT_R S1_T2 = MST_PAY_ACT_R.create("T2");
		MST_WRK_R S1_T4 = MST_WRK_R.create("T4");
		MAVM_RD_DPT_R S1_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_CUR_R S1_M5 = MAM_CUR_R.create("M5");
		MAM_BP_R S1_M7 = MAM_BP_R.create("M7");

		MAM_BP_GRP_R S1_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S1_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S1_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S1_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S1_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S1_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S1_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S1_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S1_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S1_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");

		MCDynamicSQLID DS0D = createDynamicSQLID("MSBHL5110_MST_PAY_ACT_D_S01_DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("MSBHL5110_MST_PAY_ACT_D_S01_DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5110_MST_PAY_ACT_D_Query_S01")
				.mainQuery()
				.select(
					S0_SUB1.pr(S1_T2.ac_ym),
					S0_SUB1.pr(S1_T1.ap_dpt_cd),
					S0_SUB1.pr(S1_T1.asppl_cd),
					S0_SUB1.pr("asppl_nm"),
					S0_SUB1.pr(S1_T1.purc_act_no),
					S0_SUB1.pr(S1_T1.rcpt_iv_no),
					S0_SUB1.pr(S1_T1.rcpt_iv_mng_no),
					S0_SUB1.pr(S1_T2.trd_cur_cd),
					S0_SUB1.pr(S1_T1.wrk_no),
					S0_SUB1.pr(S1_T1.ap_typ),
					S0_SUB1.pr("ap_cred_cd"),
					sum(S0_SUB1.pr("cash_amt")).as("cash_amt"),
					sum(S0_SUB1.pr("note_amt")).as("note_amt"),
					sum(S0_SUB1.pr("account_amt")).as("account_amt"),
					sum(S0_SUB1.pr("setoff_amt")).as("setoff_amt"),
					sum(S0_SUB1.pr("sw_amt")).as("sw_amt"),
					sum(S0_SUB1.pr("base_cur_cash_amt")).as("base_cur_cash_amt"),
					sum(S0_SUB1.pr("base_cur_note_amt")).as("base_cur_note_amt"),
					sum(S0_SUB1.pr("base_cur_account_amt")).as("base_cur_account_amt"),
					sum(S0_SUB1.pr("base_cur_setoff_amt")).as("base_cur_setoff_amt"),
					sum(S0_SUB1.pr("base_cur_sw_amt")).as("base_cur_sw_amt"),
					addDynamicSelect(DS0D)
				)
				.from(
					subQuery()
					.select(
						S1_T2.ac_ym,
						S1_T1.ap_dpt_cd,
						S1_T1.asppl_cd,
						nvl(
							S1_M4.bp_nm,
							value(MAC_STR.NULL_VAL.value())
						).as("asppl_nm"),
						S1_T1.purc_act_no,
						S1_T1.rcpt_iv_no,
						S1_T1.rcpt_iv_mng_no,
						S1_T2.trd_cur_cd,
						S1_T1.wrk_no,
						S1_T1.ap_typ,
						nvl(
							S1_M7.ap_cred_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("ap_cred_cd"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.CASH.value()),
							S1_T1.trd_cur_amt,
							value(0)
						).as("cash_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.NOTE.value()),
							S1_T1.trd_cur_amt,
							value(0)
						).as("note_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.ACNT.value()),
							S1_T1.trd_cur_amt,
							value(0)
						).as("account_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.SETOFF.value()),
							S1_T1.trd_cur_amt,
							value(MAC_AP_STTL_TYP.WTAX.value()),
							S1_T1.trd_cur_amt,
							value(0)
						).as("setoff_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value()),
							S1_T1.trd_cur_amt,
							value(0)
						).as("sw_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.CASH.value()),
							S1_T1.base_cur_amt,
							value(0)
						).as("base_cur_cash_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.NOTE.value()),
							S1_T1.base_cur_amt,
							value(0)
						).as("base_cur_note_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.ACNT.value()),
							S1_T1.base_cur_amt,
							value(0)
						).as("base_cur_account_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.SETOFF.value()),
							S1_T1.base_cur_amt,
							value(MAC_AP_STTL_TYP.WTAX.value()),
							S1_T1.base_cur_amt,
							value(0)
						).as("base_cur_setoff_amt"),
						decode(
							S1_T1.ap_sttl_typ,
							value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value()),
							S1_T1.base_cur_amt,
							value(0)
						).as("base_cur_sw_amt"),
						addDynamicSelect(DS1D)
					)
					.from(
						S1_T1
						.innerJoin(S1_T2).on(
							S1_T1.pay_act_no.eq(S1_T2.pay_act_no)
							.and(S1_T1.pay_act_seq.eq(S1_T2.pay_act_seq))
							.and(S1_T2.ac_ym.gt(bind("ac_ym")))
							.and(S1_T2.ac_ym.between(bind("tmp_ac_ym_fr"), bind("ac_ym_to")))
						)
						.leftOuterJoin(S1_M4).on(S1_T1.asppl_cd.eq(S1_M4.bp_cd))
						.leftOuterJoin(S1_M7).on(S1_M4.bsppl_cd.eq(S1_M7.bp_cd))
						.addDynamicView(DS1D)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S1_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S1_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S1_M4.bp_nm.like(bind("asppl_nm")))
						.cutoff$and(S1_M4.bp_grp_cd1.like(bind("asppl_grp_cd1")))
						.cutoff$and(S1_M4.bp_grp_cd2.like(bind("asppl_grp_cd2")))
						.cutoff$and(S1_M4.bp_grp_cd3.like(bind("asppl_grp_cd3")))
						.cutoff$and(S1_M4.bp_grp_cd4.like(bind("asppl_grp_cd4")))
						.cutoff$and(S1_M4.bp_grp_cd5.like(bind("asppl_grp_cd5")))
						.cutoff$and(S1_M4.bp_grp_cd6.like(bind("asppl_grp_cd6")))
						.cutoff$and(S1_M4.bp_grp_cd7.like(bind("asppl_grp_cd7")))
						.cutoff$and(S1_M4.bp_grp_cd8.like(bind("asppl_grp_cd8")))
						.cutoff$and(S1_M4.bp_grp_cd9.like(bind("asppl_grp_cd9")))
						.cutoff$and(S1_M4.bp_grp_cd10.like(bind("asppl_grp_cd10")))
						.cutoff$and(S1_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S1_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
						.cutoff$and(S1_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S1_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S1_T1.ap_typ.like(bind("ap_typ")))
						.cutoff$and(
							bind("tmp_ap_cred_crrct_flg").eq(value(true))
							.and(S1_M7.ap_cred_cd.isNotNull())
						)
						.cutoff$and(S1_M7.ap_cred_cd.eq(bind("ap_cred_cd")))
						.addDynamicPredicate(DS1D)
					).view(S0_SUB1)
				)
				.groupBy(
					S0_SUB1.pr(S1_T2.ac_ym),
					S0_SUB1.pr(S1_T1.ap_dpt_cd),
					S0_SUB1.pr(S1_T1.asppl_cd),
					S0_SUB1.pr("asppl_nm"),
					S0_SUB1.pr(S1_T1.purc_act_no),
					S0_SUB1.pr(S1_T1.rcpt_iv_no),
					S0_SUB1.pr(S1_T1.rcpt_iv_mng_no),
					S0_SUB1.pr(S1_T2.trd_cur_cd),
					S0_SUB1.pr(S1_T1.wrk_no),
					S0_SUB1.pr(S1_T1.ap_typ),
					S0_SUB1.pr("ap_cred_cd"),
					addDynamicGroupBy(DS0D)
				)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_cur_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_M5).on(S1_T2.trd_cur_cd.eq(S1_M5.cur_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_M5.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_T4).on(S1_T1.wrk_no.eq(S1_T4.wrk_no)))
					.predicate(DS1D, p -> p.cutoff$and(S1_T4.wrk_nm.like(bind("wrk_nm")))),
				
				when(r -> chk_dac_flg)
					.view(DS1D, v -> v.innerJoin(S1_DAC).on(S1_DAC.dpt_cd.eq(S1_T1.ap_dpt_cd))),
				
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(1, S1_ASPPL_GRP1, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(2, S1_ASPPL_GRP2, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(3, S1_ASPPL_GRP3, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(4, S1_ASPPL_GRP4, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(5, S1_ASPPL_GRP5, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(6, S1_ASPPL_GRP6, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(7, S1_ASPPL_GRP7, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(8, S1_ASPPL_GRP8, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(9, S1_ASPPL_GRP9, S1_M4, DS0D, DS1D, S0_SUB1),
				createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(10, S1_ASPPL_GRP10, S1_M4, DS0D, DS1D, S0_SUB1),
				createBpGrpTableAndWhereDynamicInfo(1, S1_ASPPL_GRP1, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(2, S1_ASPPL_GRP2, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(3, S1_ASPPL_GRP3, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(4, S1_ASPPL_GRP4, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(5, S1_ASPPL_GRP5, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(6, S1_ASPPL_GRP6, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(7, S1_ASPPL_GRP7, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(8, S1_ASPPL_GRP8, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(9, S1_ASPPL_GRP9, S1_M4, DS1D),
				createBpGrpTableAndWhereDynamicInfo(10, S1_ASPPL_GRP10, S1_M4, DS1D)
		);
	}
	
	static MCDynamicSQLInfo createMSBHL5110_MST_PAY_ACT_D_S01_BpGrpSelectAndGroup(int no, MAM_BP_GRP_R grpR, MAM_BP_R bpR, MCDynamicSQLID DS0D, MCDynamicSQLID DS1D, MCTempView S0_SUB1) {
		String flgCol = "asppl_grp_flg" + no;
		String cdCol = "asppl_grp_cd" + no;
		String nmCol = "asppl_grp_nm" + no;
		MCStringPermColumn grpCdCol = (MCStringPermColumn)bpR.getColumn$("bp_grp_cd" + no);
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol))
				.select(DS0D, S0_SUB1.pr(cdCol), S0_SUB1.pr(nmCol))
				.select(DS1D, grpCdCol.as(cdCol), grpR.bp_grp_nm.as(nmCol))
				.groupBy(DS0D, S0_SUB1.pr(cdCol), S0_SUB1.pr(nmCol))
				;
	}
	
	
	static MCDynamicSQLInfo createBpGrpTableAndWhereDynamicInfo(int no, MAM_BP_GRP_R grpR, MAM_BP_R bpR, MCDynamicSQLID id) {
		String flgCol = "asppl_grp_flg" + no;
		String nmCol = "asppl_grp_nm" + no;
		MCStringPermColumn grpCdCol = (MCStringPermColumn)bpR.getColumn$("bp_grp_cd" + no);
		MAC_BP_GRP_TYP typ = getBpGrpTyp(no);
		
		return createDynamicSQLInfo()
			.when(boundOr(flgCol, nmCol))
				.view(id, v -> v.leftOuterJoin(grpR).on(bracket(grpR.bp_grp_cd.eq(grpCdCol).and(grpR.bp_grp_typ.eq(value(typ.value()))))))
				.predicate(id, p -> p.cutoff$and(grpR.bp_grp_nm.like(bind(nmCol))));
	}
	
	static MAC_BP_GRP_TYP getBpGrpTyp(int no) {
		if (no == 1) {
			return MAC_BP_GRP_TYP.GRP1;
		}
		if (no == 2) {
			return MAC_BP_GRP_TYP.GRP2;
		}
		if (no == 3) {
			return MAC_BP_GRP_TYP.GRP3;
		}
		if (no == 4) {
			return MAC_BP_GRP_TYP.GRP4;
		}
		if (no == 5) {
			return MAC_BP_GRP_TYP.GRP5;
		}
		if (no == 6) {
			return MAC_BP_GRP_TYP.GRP6;
		}
		if (no == 7) {
			return MAC_BP_GRP_TYP.GRP7;
		}
		if (no == 8) {
			return MAC_BP_GRP_TYP.GRP8;
		}
		if (no == 9) {
			return MAC_BP_GRP_TYP.GRP9;
		}
		if (no == 10) {
			return MAC_BP_GRP_TYP.GRP10;
		}
		return null;
	}
	
}