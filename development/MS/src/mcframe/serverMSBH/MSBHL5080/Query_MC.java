package mcframe.serverMSBH.MSBHL5080;

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
	 * -- MSBHL5080_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBHL5080_MST_MLY_AR_BAL_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_MLY_AR_BAL_R S1_T1 = MST_MLY_AR_BAL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5080_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(sum(S0_V1.pr(S1_T1.end_bal)).as("end_bal"))
					.from(
						subQuery()
						.select(
							S1_T1.ac_ym,
							max(S1_T1.ac_ym)
								.over()
								.partitionBy(
									S1_T1.acst_cd,
									S1_T1.ar_dpt_cd,
									S1_T1.trd_cur_cd,
									S1_T1.iv_no,
									S1_T1.wrk_no,
									S1_T1.ar_typ
								).as("max_ym"),
							S1_T1.end_bal
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.acst_cd.eq(bind("setoff_cd")))
							.and(S1_T1.ar_dpt_cd.eq(bind("so_dpt_cd")))
							.and(S1_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
							.cutoff$and(S1_T1.ar_typ.eq(bind("ar_typ")))
						).view(S0_V1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_V1.pr(S1_T1.ac_ym).eq(S0_V1.pr("max_ym")))
					)
			);
	}
	
	/**
	 * -- MSBHL5080_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL5080_MST_PAY_SCHD_S01() {
		MST_PAY_SCHD_R S0_T1 = MST_PAY_SCHD_R.create("T1");
		MST_PAY_CHK_R S0_T2 = MST_PAY_CHK_R.create("T2");
		MAM_STTL_R S0_M1 = MAM_STTL_R.create("M1");
		MAM_AC_RSN_R S0_M2 = MAM_AC_RSN_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5080_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(sum(S0_T1.trd_cur_amt).as("schd_amt"))
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.pay_chk_mng_no.eq(S0_T2.pay_chk_mng_no))
						.leftOuterJoin(S0_M1).on(S0_T1.ap_sttl_cd.eq(S0_M1. sttl_cd ))
						.leftOuterJoin(S0_M2).on(S0_M1.ac_rsn_cd.eq(S0_M2. ac_rsn_cd ))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.setoff_cd.eq(bind("setoff_cd")))
						.and(S0_T1.so_dpt_cd.eq(bind("so_dpt_cd")))
						.and(S0_T1.ap_setoff_typ.eq(value(MAC_AP_SETOFF_TYP.ACST.value())))
						.and(S0_T1.pay_sts_typ.eq(value(MSC_PAY_STS_TYP.NOT_PAY.value())))
						.and(S0_T2.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and((S0_M2.ar_typ.eq(bind("ar_typ")))
							.or(S0_M2.ar_typ.isNull()
								.and(bind("ar_typ").eq(value(MAC_AR_TYP.AR.value()))))
						)
					)
			);
	}
	
	/**
	 * -- MSBHL5080_MST_PROV_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL5080_MST_PROV_ACT_S01() {
		MSW_AP_D_KEY_R S0_W = MSW_AP_D_KEY_R.create("W");
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_MFG_ACT_R S0_T3 = MST_MFG_ACT_R.create("T3");
		MST_INPT_ACT_R S0_T4 = MST_INPT_ACT_R.create("T4");
		MST_PROV_ACT_R S0_T5 = MST_PROV_ACT_R.create("T5");
		MAM_CUR_R S0_M = MAM_CUR_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5080_MST_PROV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_d_no,
						nvl(
							bracket(
								S0_T5.trd_cur_amt.add(S0_T5.trd_cur_tax_amt)
							),
							value(0)
						).as("onr_prov_bal"),
						S0_T5.prov_act_no,
						S0_T2.base_unit_qty,
						S0_M.amt_dec_place
					)
					.from(
						S0_W
						.innerJoin(S0_T1).on(S0_W.ap_d_no.eq(S0_T1.ap_d_no))
						.innerJoin(S0_T2).on(
							S0_T1.purc_act_d_no.eq(S0_T2.purc_act_d_no)
							.and(S0_T1.purc_act_d_seq.eq(S0_T2.purc_act_d_seq))
						)
						.innerJoin(S0_T3).on(S0_T2.mfg_inst_no.eq(S0_T3.mfg_inst_no))
						.innerJoin(S0_T4).on(S0_T3.mfg_act_no.eq(S0_T4.mfg_act_no))
						.innerJoin(S0_T5).on(S0_T4.inpt_act_no.eq(S0_T5.prov_src_act_no))
						.leftOuterJoin(S0_M).on(S0_T5.trd_cur_cd.eq(S0_M.cur_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T5.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.INPT.value())))
						.and(S0_T5.prov_typ.eq(value(MAC_PROV_TYP.ONR_PROV.value())))
						.and(S0_T5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			);
	}
	static MCQueryPlan MSBHL5080_MST_PROV_ACT_S02() {
		MCTempView S0_V3 = createTempView("V3");
		MCTempView S1_V2 = createTempView("V2");
		MAM_BP_R S1_M1 = MAM_BP_R.create("M1");
		MAM_CUR_R S1_M2 = MAM_CUR_R.create("M2");
		MAM_CUR_R S1_M3 = MAM_CUR_R.create("M3");
		MAM_BP_GRP_R S1_MM_BP1 = MAM_BP_GRP_R.create("MM_BP1");
		MAM_BP_GRP_R S1_MM_BP2 = MAM_BP_GRP_R.create("MM_BP2");
		MAM_BP_GRP_R S1_MM_BP3 = MAM_BP_GRP_R.create("MM_BP3");
		MAM_BP_GRP_R S1_MM_BP4 = MAM_BP_GRP_R.create("MM_BP4");
		MAM_BP_GRP_R S1_MM_BP5 = MAM_BP_GRP_R.create("MM_BP5");
		MAM_BP_GRP_R S1_MM_BP6 = MAM_BP_GRP_R.create("MM_BP6");
		MAM_BP_GRP_R S1_MM_BP7 = MAM_BP_GRP_R.create("MM_BP7");
		MAM_BP_GRP_R S1_MM_BP8 = MAM_BP_GRP_R.create("MM_BP8");
		MAM_BP_GRP_R S1_MM_BP9 = MAM_BP_GRP_R.create("MM_BP9");
		MAM_BP_GRP_R S1_MM_BP10 = MAM_BP_GRP_R.create("MM_BP10");
		MCTempView S2_V1 = createTempView("V1");
		MST_PROV_ACT_R S3_T1 = MST_PROV_ACT_R.create("T1");
		MAM_BP_R S3_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S3_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S3_M4 = MAM_CUR_R.create("M4");
		MAVM_RD_DPT_R S4_D1 = MAVM_RD_DPT_R.create("D1");
		MST_PAY_ACT_R S5_T1 = MST_PAY_ACT_R.create("T1");
		MST_PAY_ACT_D_R S5_T2 = MST_PAY_ACT_D_R.create("T2");
		MAM_BP_R S5_BP = MAM_BP_R.create("PAYACTD_BP");
		MAM_CUR_R S5_M2 = MAM_CUR_R.create("M2");
		MAVM_RD_DPT_R S6_D1 = MAVM_RD_DPT_R.create("D1");
		MST_PAY_SCHD_R S7_T1 = MST_PAY_SCHD_R.create("T1");
		MST_PAY_CHK_R S7_T2 = MST_PAY_CHK_R.create("T2");
		MAM_BP_R S7_BP = MAM_BP_R.create("PAYSCHD_BP");
		MAM_CUR_R S7_M2 = MAM_CUR_R.create("M2");
		MAVM_RD_DPT_R S8_D1 = MAVM_RD_DPT_R.create("D1");
		MST_ONR_PROV_BAL_R S9_T1 = MST_ONR_PROV_BAL_R.create("T1");
		MAM_BP_R S9_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S9_M4 = MAM_CUR_R.create("M4");
		MAM_CUR_R S9_M5 = MAM_CUR_R.create("M5");
		MAM_BP_GRP_R S9_MM_BP1 = MAM_BP_GRP_R.create("MM_BP1");
		MAM_BP_GRP_R S9_MM_BP2 = MAM_BP_GRP_R.create("MM_BP2");
		MAM_BP_GRP_R S9_MM_BP3 = MAM_BP_GRP_R.create("MM_BP3");
		MAM_BP_GRP_R S9_MM_BP4 = MAM_BP_GRP_R.create("MM_BP4");
		MAM_BP_GRP_R S9_MM_BP5 = MAM_BP_GRP_R.create("MM_BP5");
		MAM_BP_GRP_R S9_MM_BP6 = MAM_BP_GRP_R.create("MM_BP6");
		MAM_BP_GRP_R S9_MM_BP7 = MAM_BP_GRP_R.create("MM_BP7");
		MAM_BP_GRP_R S9_MM_BP8 = MAM_BP_GRP_R.create("MM_BP8");
		MAM_BP_GRP_R S9_MM_BP9 = MAM_BP_GRP_R.create("MM_BP9");
		MAM_BP_GRP_R S9_MM_BP10 = MAM_BP_GRP_R.create("MM_BP10");
		MAVM_RD_DPT_R S10_D1 = MAVM_RD_DPT_R.create("D1");
		
		MCDynamicSQLID DS1C_ASPPL_GRP = createDynamicSQLID("DS1C_ASPPL_GRP");
		MCDynamicSQLID DS9C_ASPPL_GRP = createDynamicSQLID("DS9C_ASPPL_GRP");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5080_MST_PROV_ACT_Query_S02")
					.mainQuery()
					.select(S0_V3.prAll())
					.from(
						subQuery()
						.select(
							S1_V2.pr(S3_M1.asppl_cd),
							S1_V2.pr("asppl_nm"),
							S1_V2.pr(S3_T1.ap_dpt_cd),
							S1_V2.pr(S3_T1.ac_ym),
							S1_V2.pr(S3_T1.trd_cur_cd),
							S1_V2.pr("trd_cur_nm"),
							S1_M2.amt_dec_place.as("trd_cur_amt_dec_place"),
							S1_V2.pr(S3_T1.base_cur_cd),
							S1_M3.cur_nm.as("base_cur_nm"),
							S1_M3.amt_dec_place.as("base_cur_amt_dec_place"),
							S1_V2.pr("init_bal"),
							S1_V2.pr("onr_prov_amt"),
							S1_V2.pr("onr_prov_ret_amt"),
							S1_V2.pr("setoff_amt"),
							S1_V2.pr("setoff_schd_amt"),
							S1_V2.pr("tax_amt"),
							S1_V2.pr("end_bal"),
							S1_V2.pr("base_cur_init_bal"),
							S1_V2.pr("base_cur_onr_prov_amt"),
							S1_V2.pr("base_cur_onr_prov_ret_amt"),
							S1_V2.pr("base_cur_setoff_amt"),
							S1_V2.pr("base_cur_setoff_schd_amt"),
							S1_V2.pr("base_cur_tax_amt"),
							S1_V2.pr("base_cur_end_bal"),
							nullValue().as("sub_char1"),
							nullValue().as("sub_char2"),
							nullValue().as("sub_char3"),
							nullValue().as("ins_usr_id"),
							nullValue().as("ins_usr_nm"),
							nullValue().as("ins_func_id"),
							nullValue().as("ins_ts"),
							nullValue().as("upd_usr_id"),
							nullValue().as("upd_usr_nm"),
							nullValue().as("upd_func_id"),
							nullValue().as("upd_ts"),
							nullValue().as("upd_srv_req_no"),
							addDynamicSelect(DS1C_ASPPL_GRP)
						)
						.from(
							subQuery()
							.select(
								S2_V1.pr(S3_M1.asppl_cd),
								S2_V1.pr("asppl_nm"),
								S2_V1.pr(S3_T1.ap_dpt_cd),
								S2_V1.pr(S3_T1.ac_ym),
								S2_V1.pr(S3_T1.trd_cur_cd),
								S2_V1.pr("trd_cur_nm"),
								S2_V1.pr(S3_T1.base_cur_cd),
								sum(S2_V1.pr("init_bal")).as("init_bal"),
								sum(S2_V1.pr("onr_prov_amt")).as("onr_prov_amt"),
								sum(S2_V1.pr("onr_prov_ret_amt")).as("onr_prov_ret_amt"),
								sum(S2_V1.pr("setoff_amt")).as("setoff_amt"),
								sum(S2_V1.pr("setoff_schd_amt")).as("setoff_schd_amt"),
								sum(S2_V1.pr("tax_amt")).as("tax_amt"),
								sum(S2_V1.pr("end_bal")).as("end_bal"),
								sum(S2_V1.pr("base_cur_init_bal")).as("base_cur_init_bal"),
								sum(S2_V1.pr("base_cur_onr_prov_amt")).as("base_cur_onr_prov_amt"),
								sum(S2_V1.pr("base_cur_onr_prov_ret_amt")).as("base_cur_onr_prov_ret_amt"),
								sum(S2_V1.pr("base_cur_setoff_amt")).as("base_cur_setoff_amt"),
								sum(S2_V1.pr("base_cur_setoff_schd_amt")).as("base_cur_setoff_schd_amt"),
								sum(S2_V1.pr("base_cur_tax_amt")).as("base_cur_tax_amt"),
								sum(S2_V1.pr("base_cur_end_bal")).as("base_cur_end_bal")
							)
							.from(
								subQuery()
								.select(
									S3_M1.asppl_cd,
									S3_M2.bp_nm.as("asppl_nm"),
									S3_T1.ap_dpt_cd,
									S3_T1.ac_ym,
									S3_T1.trd_cur_cd,
									S3_M4.cur_nm.as("trd_cur_nm"),
									S3_T1.base_cur_cd,
									value(0).as("init_bal"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
											.then(S3_T1.trd_cur_amt)
										.otherwise(value(0)).as("onr_prov_amt"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
											.then(value(0).subtract(S3_T1.trd_cur_amt))
										.otherwise(value(0)).as("onr_prov_ret_amt"),
									value(0).as("setoff_amt"),
									value(0).as("setoff_schd_amt"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
											.then(value(0).subtract(S3_T1.trd_cur_tax_amt))
										.otherwise(S3_T1.trd_cur_tax_amt).as("tax_amt"),
									value(0).as("end_bal"),
									value(0).as("base_cur_init_bal"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
											.then(S3_T1.base_cur_amt)
										.otherwise(value(0)).as("base_cur_onr_prov_amt"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
											.then(value(0).subtract(S3_T1.base_cur_amt))
										.otherwise(value(0)).as("base_cur_onr_prov_ret_amt"),
									value(0).as("base_cur_setoff_amt"),
									value(0).as("base_cur_setoff_schd_amt"),
									cases()
										.when(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
											.then(value(0).subtract(S3_T1.base_cur_tax_amt))
										.otherwise(S3_T1.base_cur_tax_amt).as("base_cur_tax_amt"),
									value(0).as("base_cur_end_bal")
								)
								.from(
									S3_T1
									.leftOuterJoin(S3_M1).on(
										bracket(
											S3_T1.prsppl_cd.eq(S3_M1.bp_cd)
											.and(S3_M1.sppl_flg.eq(value(true)))
										)
									)
									.leftOuterJoin(S3_M2).on(
										bracket(
											S3_M1.asppl_cd.eq(S3_M2.bp_cd)
											.and(S3_M2.asppl_flg.eq(value(true)))
										)
									)
									.leftOuterJoin(S3_M4).on(
										bracket(
											S3_T1.trd_cur_cd.eq(S3_M4.cur_cd)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(
										S3_T1.trd_ptn_typ.in(
											value(MAC_TRD_PTN_TYP.PROV.value()),
											value(MAC_TRD_PTN_TYP.PROV_RTN.value())
										)
									)
									.and(S3_T1.prov_typ.eq(value(MAC_PROV_TYP.ONR_PROV.value())))
									.and(S3_M1.asppl_cd.isNotNull())
									.cutoff$and(S3_T1.ac_ym.gt(bind("tmp_max_ac_ym")))
									.and(S3_T1.ac_ym.lte(bind("ac_ym_to")))
									.cutoff$and(
										value(true).eq(bind("tmp_dac_vld_flg_cutoff"))
										.and(
											exists(
												subQuery()
												.select(value(1))
												.from(S4_D1)
												.where(
													S3_T1.ap_dpt_cd.eq(S4_D1.dpt_cd)
												)
											)
										)
									)
									.cutoff$and(S3_M1.asppl_cd.like(bind("asppl_cd")))
									.cutoff$and(S3_M2.bp_nm.like(bind("asppl_nm")))
									.cutoff$and(S3_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
									.cutoff$and(S3_T1.trd_cur_cd.like(bind("trd_cur_cd")))
									.cutoff$and(S3_M4.cur_nm.like(bind("trd_cur_nm")))
								)
								.unionAll(
									subQuery()
									.select(
										S5_T2.setoff_cd.as("asppl_cd"),
										S5_BP.bp_nm.as("asppl_nm"),
										S5_T2.so_dpt_cd.as("ap_dpt_cd"),
										S5_T1.ac_ym,
										S5_T1.trd_cur_cd,
										S5_M2.cur_nm.as("trd_cur_nm"),
										S5_T1.base_cur_cd,
										value(0).as("init_bal"),
										value(0).as("onr_prov_amt"),
										value(0).as("onr_prov_ret_amt"),
										S5_T2.trd_cur_amt.as("setoff_amt"),
										value(0).as("setoff_schd_amt"),
										value(0).as("tax_amt"),
										value(0).as("end_bal"),
										value(0).as("base_cur_init_bal"),
										value(0).as("base_cur_onr_prov_amt"),
										value(0).as("base_cur_onr_prov_ret_amt"),
										S5_T2.base_cur_amt.as("base_cur_setoff_amt"),
										value(0).as("base_cur_setoff_schd_amt"),
										value(0).as("base_cur_tax_amt"),
										value(0).as("base_cur_end_bal")
									)
									.from(
										S5_T1
										.innerJoin(S5_T2).on(
											bracket(
												S5_T2.pay_act_no.eq(S5_T1.pay_act_no)
												.and(S5_T2.pay_act_seq.eq(S5_T1.pay_act_seq))
											)
										)
										.leftOuterJoin(S5_BP).on(
											bracket(
												S5_T2.setoff_cd.eq(S5_BP.bp_cd)
											)
										)
										.leftOuterJoin(S5_M2).on(
											bracket(
												S5_T1.trd_cur_cd.eq(S5_M2.cur_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S5_T1.ap_setoff_typ.eq(value(MAC_AP_SETOFF_TYP.PRSPPL.value())))
										.cutoff$and(S5_T1.ac_ym.gt(bind("tmp_max_ac_ym")))
										.and(S5_T1.ac_ym.lte(bind("ac_ym_to")))
										.cutoff$and(
											value(true).eq(bind("tmp_dac_vld_flg_cutoff"))
											.and(
												exists(
													subQuery()
													.select(value(1))
													.from(S6_D1)
													.where(
														S5_T2.so_dpt_cd.eq(S6_D1.dpt_cd)
													)
												)
											)
										)
										.cutoff$and(S5_T2.setoff_cd.like(bind("asppl_cd")))
										.cutoff$and(S5_BP.bp_nm.like(bind("asppl_nm")))
										.cutoff$and(S5_T2.so_dpt_cd.like(bind("ap_dpt_cd")))
										.cutoff$and(S5_T1.trd_cur_cd.like(bind("trd_cur_cd")))
										.cutoff$and(S5_M2.cur_nm.like(bind("trd_cur_nm")))
									)
									.unionAll(
										subQuery()
										.select(
											S7_T1.setoff_cd.as("asppl_cd"),
											S7_BP.bp_nm.as("asppl_nm"),
											S7_T1.so_dpt_cd.as("ap_dpt_cd"),
											MAPA_DT$F_GET_AC_YM1(S7_T1.pay_schd_dt).as("ac_ym"),
											S7_T2.trd_cur_cd,
											S7_M2.cur_nm.as("trd_cur_nm"),
											MAPA_XCHNG$F_GET_BASE_CUR_CD().as("base_cur_cd"),
											value(0).as("init_bal"),
											value(0).as("onr_prov_amt"),
											value(0).as("onr_prov_ret_amt"),
											value(0).as("setoff_amt"),
											S7_T1.trd_cur_amt.as("setoff_schd_amt"),
											value(0).as("tax_amt"),
											value(0).as("end_bal"),
											value(0).as("base_cur_init_bal"),
											value(0).as("base_cur_onr_prov_amt"),
											value(0).as("base_cur_onr_prov_ret_amt"),
											value(0).as("base_cur_setoff_amt"),
											MAPA_XCHNG$F_XCHNG(
												S7_T1.trd_cur_amt,
												S7_T1.xrate,
												bind("base_cur_amt_dec_place"),
												bind("xrte_rnd_typ")
											).as("base_cur_setoff_schd_amt"),
											value(0).as("base_cur_tax_amt"),
											value(0).as("base_cur_end_bal")
										)
										.from(
											S7_T1
											.innerJoin(S7_T2).on(
												bracket(
													S7_T2.pay_chk_mng_no.eq(S7_T1.pay_chk_mng_no)
												)
											)
											.leftOuterJoin(S7_BP).on(
												bracket(
													S7_T1.setoff_cd.eq(S7_BP.bp_cd)
												)
											)
											.leftOuterJoin(S7_M2).on(
												bracket(
													S7_T2.trd_cur_cd.eq(S7_M2.cur_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S7_T1.ap_setoff_typ.eq(value(MAC_AP_SETOFF_TYP.PRSPPL.value())))
											.and(S7_T1.pay_sts_typ.eq(value(MSC_PAY_STS_TYP.NOT_PAY.value())))
											.cutoff$and(MAPA_DT$F_GET_AC_YM1(S7_T1.pay_schd_dt).gt(bind("tmp_max_ac_ym")))
											.and(MAPA_DT$F_GET_AC_YM1(S7_T1.pay_schd_dt).lte(bind("ac_ym_to")))
											.cutoff$and(
												value(true).eq(bind("tmp_dac_vld_flg_cutoff"))
												.and(
													exists(
														subQuery()
														.select(value(1))
														.from(S8_D1)
														.where(
															S7_T1.so_dpt_cd.eq(S8_D1.dpt_cd)
														)
													)
												)
											)
											.cutoff$and(S7_T1.setoff_cd.like(bind("asppl_cd")))
											.cutoff$and(S7_BP.bp_nm.like(bind("asppl_nm")))
											.cutoff$and(S7_T1.so_dpt_cd.like(bind("ap_dpt_cd")))
											.cutoff$and(S7_T2.trd_cur_cd.like(bind("trd_cur_cd")))
											.cutoff$and(S7_M2.cur_nm.like(bind("trd_cur_nm")))
										)
									)
								).view(S2_V1)
							)
							.groupBy(
								S2_V1.pr(S3_M1.asppl_cd),
								S2_V1.pr("asppl_nm"),
								S2_V1.pr(S3_T1.ap_dpt_cd),
								S2_V1.pr(S3_T1.ac_ym),
								S2_V1.pr(S3_T1.trd_cur_cd),
								S2_V1.pr("trd_cur_nm"),
								S2_V1.pr(S3_T1.base_cur_cd)
							).view(S1_V2)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_V2.pr(S3_M1.asppl_cd).eq(S1_M1.bp_cd)
									.and(S1_M1.asppl_flg.eq(value(true)))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_V2.pr(S3_T1.trd_cur_cd).eq(S1_M2.cur_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_V2.pr(S3_T1.base_cur_cd).eq(S1_M3.cur_cd)
								)
							)
							.addDynamicView(DS1C_ASPPL_GRP)
						)
						.where(
							value(0).eq(value(0))
							.addDynamicPredicate(DS1C_ASPPL_GRP)
						)
						.unionAll(
							subQuery()
							.select(
								S9_T1.asppl_cd,
								S9_M2.bp_nm.as("asppl_nm"),
								S9_T1.ap_dpt_cd,
								S9_T1.ac_ym,
								S9_T1.trd_cur_cd,
								S9_M4.cur_nm.as("trd_cur_nm"),
								S9_M4.amt_dec_place.as("trd_cur_amt_dec_place"),
								S9_T1.base_cur_cd,
								S9_M5.cur_nm.as("base_cur_nm"),
								S9_M5.amt_dec_place.as("base_cur_amt_dec_place"),
								S9_T1.init_bal,
								S9_T1.onr_prov_amt,
								S9_T1.onr_prov_ret_amt,
								S9_T1.setoff_amt,
								value(0).as("setoff_schd_amt"),
								S9_T1.tax_amt,
								S9_T1.end_bal,
								S9_T1.base_cur_init_bal,
								S9_T1.base_cur_onr_prov_amt,
								S9_T1.base_cur_onr_prov_ret_amt,
								S9_T1.base_cur_setoff_amt,
								value(0).as("base_cur_setoff_schd_amt"),
								S9_T1.base_cur_tax_amt,
								S9_T1.base_cur_end_bal,
								S9_T1.sub_char1,
								S9_T1.sub_char2,
								S9_T1.sub_char3,
								S9_T1.ins_usr_id,
								S9_T1.ins_usr_nm,
								S9_T1.ins_func_id,
								S9_T1.ins_ts,
								S9_T1.upd_usr_id,
								S9_T1.upd_usr_nm,
								S9_T1.upd_func_id,
								S9_T1.upd_ts,
								S9_T1.upd_srv_req_no,
								addDynamicSelect(DS9C_ASPPL_GRP)
							)
							.from(
								S9_T1
								.leftOuterJoin(S9_M2).on(
									bracket(
										S9_T1.asppl_cd.eq(S9_M2.bp_cd)
									)
								)
								.leftOuterJoin(S9_M4).on(
									bracket(
										S9_T1.trd_cur_cd.eq(S9_M4.cur_cd)
									)
								)
								.leftOuterJoin(S9_M5).on(
									bracket(
										S9_T1.base_cur_cd.eq(S9_M5.cur_cd)
									)
								)
								.addDynamicView(DS9C_ASPPL_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(S9_T1.ac_ym.gte(bind("tmp_ac_ym_fr")))
								.and(S9_T1.ac_ym.lte(bind("ac_ym_to")))
								.cutoff$and(
									value(true).eq(bind("tmp_dac_vld_flg_cutoff"))
									.and(
										exists(
											subQuery()
											.select(value(1))
											.from(S10_D1)
											.where(
												S9_T1.ap_dpt_cd.eq(S10_D1.dpt_cd)
											)
										)
									)
								)
								.cutoff$and(S9_T1.asppl_cd.like(bind("asppl_cd")))
								.cutoff$and(S9_M2.bp_nm.like(bind("asppl_nm")))
								.cutoff$and(S9_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
								.cutoff$and(S9_T1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S9_M4.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S9_T1.sub_char1.like(bind("sub_char1")))
								.cutoff$and(S9_T1.sub_char2.like(bind("sub_char2")))
								.cutoff$and(S9_T1.sub_char3.like(bind("sub_char3")))
								.addDynamicPredicate(DS9C_ASPPL_GRP)
							)
						).view(S0_V3)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("asppl_grp_flg1"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd1.as("asppl_grp_cd1"), S1_MM_BP1.bp_grp_nm.as("asppl_grp_nm1"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP1).on(S1_M1.bp_grp_cd1.eq(S1_MM_BP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM_BP1.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd1.like(bind("asppl_grp_cd1"))).cutoff$and(S1_MM_BP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd2.as("asppl_grp_cd2"), S1_MM_BP2.bp_grp_nm.as("asppl_grp_nm2"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP2).on(S1_M1.bp_grp_cd2.eq(S1_MM_BP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM_BP2.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd2.like(bind("asppl_grp_cd2"))).cutoff$and(S1_MM_BP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd3.as("asppl_grp_cd3"), S1_MM_BP3.bp_grp_nm.as("asppl_grp_nm3"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP3).on(S1_M1.bp_grp_cd3.eq(S1_MM_BP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM_BP3.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd3.like(bind("asppl_grp_cd3"))).cutoff$and(S1_MM_BP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd4.as("asppl_grp_cd4"), S1_MM_BP4.bp_grp_nm.as("asppl_grp_nm4"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP4).on(S1_M1.bp_grp_cd4.eq(S1_MM_BP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM_BP4.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd4.like(bind("asppl_grp_cd4"))).cutoff$and(S1_MM_BP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd5.as("asppl_grp_cd5"), S1_MM_BP5.bp_grp_nm.as("asppl_grp_nm5"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP5).on(S1_M1.bp_grp_cd5.eq(S1_MM_BP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM_BP5.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd5.like(bind("asppl_grp_cd5"))).cutoff$and(S1_MM_BP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd6.as("asppl_grp_cd6"), S1_MM_BP6.bp_grp_nm.as("asppl_grp_nm6"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP6).on(S1_M1.bp_grp_cd6.eq(S1_MM_BP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM_BP6.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd6.like(bind("asppl_grp_cd6"))).cutoff$and(S1_MM_BP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd7.as("asppl_grp_cd7"), S1_MM_BP7.bp_grp_nm.as("asppl_grp_nm7"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP7).on(S1_M1.bp_grp_cd7.eq(S1_MM_BP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM_BP7.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd7.like(bind("asppl_grp_cd7"))).cutoff$and(S1_MM_BP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd8.as("asppl_grp_cd8"), S1_MM_BP8.bp_grp_nm.as("asppl_grp_nm8"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP8).on(S1_M1.bp_grp_cd8.eq(S1_MM_BP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM_BP8.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd8.like(bind("asppl_grp_cd8"))).cutoff$and(S1_MM_BP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd9.as("asppl_grp_cd9"), S1_MM_BP9.bp_grp_nm.as("asppl_grp_nm9"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP9).on(S1_M1.bp_grp_cd9.eq(S1_MM_BP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM_BP9.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd9.like(bind("asppl_grp_cd9"))).cutoff$and(S1_MM_BP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS1C_ASPPL_GRP, S1_M1.bp_grp_cd10.as("asppl_grp_cd10"), S1_MM_BP10.bp_grp_nm.as("asppl_grp_nm10"))
					.view(DS1C_ASPPL_GRP, v -> v.leftOuterJoin(S1_MM_BP10).on(S1_M1.bp_grp_cd10.eq(S1_MM_BP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM_BP10.bp_grp_typ))))
					.predicate(DS1C_ASPPL_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd10.like(bind("asppl_grp_cd10"))).cutoff$and(S1_MM_BP10.bp_grp_nm.like(bind("asppl_grp_nm10")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd1.as("asppl_grp_cd1"), S9_MM_BP1.bp_grp_nm.as("asppl_grp_nm1"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP1).on(S9_M2.bp_grp_cd1.eq(S9_MM_BP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S9_MM_BP1.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd1.like(bind("asppl_grp_cd1"))).cutoff$and(S9_MM_BP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd2.as("asppl_grp_cd2"), S9_MM_BP2.bp_grp_nm.as("asppl_grp_nm2"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP2).on(S9_M2.bp_grp_cd2.eq(S9_MM_BP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S9_MM_BP2.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd2.like(bind("asppl_grp_cd2"))).cutoff$and(S9_MM_BP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd3.as("asppl_grp_cd3"), S9_MM_BP3.bp_grp_nm.as("asppl_grp_nm3"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP3).on(S9_M2.bp_grp_cd3.eq(S9_MM_BP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S9_MM_BP3.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd3.like(bind("asppl_grp_cd3"))).cutoff$and(S9_MM_BP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd4.as("asppl_grp_cd4"), S9_MM_BP4.bp_grp_nm.as("asppl_grp_nm4"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP4).on(S9_M2.bp_grp_cd4.eq(S9_MM_BP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S9_MM_BP4.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd4.like(bind("asppl_grp_cd4"))).cutoff$and(S9_MM_BP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd5.as("asppl_grp_cd5"), S9_MM_BP5.bp_grp_nm.as("asppl_grp_nm5"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP5).on(S9_M2.bp_grp_cd5.eq(S9_MM_BP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S9_MM_BP5.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd5.like(bind("asppl_grp_cd5"))).cutoff$and(S9_MM_BP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd6.as("asppl_grp_cd6"), S9_MM_BP6.bp_grp_nm.as("asppl_grp_nm6"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP6).on(S9_M2.bp_grp_cd6.eq(S9_MM_BP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S9_MM_BP6.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd6.like(bind("asppl_grp_cd6"))).cutoff$and(S9_MM_BP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd7.as("asppl_grp_cd7"), S9_MM_BP7.bp_grp_nm.as("asppl_grp_nm7"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP7).on(S9_M2.bp_grp_cd7.eq(S9_MM_BP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S9_MM_BP7.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd7.like(bind("asppl_grp_cd7"))).cutoff$and(S9_MM_BP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd8.as("asppl_grp_cd8"), S9_MM_BP8.bp_grp_nm.as("asppl_grp_nm8"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP8).on(S9_M2.bp_grp_cd8.eq(S9_MM_BP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S9_MM_BP8.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd8.like(bind("asppl_grp_cd8"))).cutoff$and(S9_MM_BP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd9.as("asppl_grp_cd9"), S9_MM_BP9.bp_grp_nm.as("asppl_grp_nm9"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP9).on(S9_M2.bp_grp_cd9.eq(S9_MM_BP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S9_MM_BP9.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd9.like(bind("asppl_grp_cd9"))).cutoff$and(S9_MM_BP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS9C_ASPPL_GRP, S9_M2.bp_grp_cd10.as("asppl_grp_cd10"), S9_MM_BP10.bp_grp_nm.as("asppl_grp_nm10"))
					.view(DS9C_ASPPL_GRP, v -> v.leftOuterJoin(S9_MM_BP10).on(S9_M2.bp_grp_cd10.eq(S9_MM_BP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S9_MM_BP10.bp_grp_typ))))
					.predicate(DS9C_ASPPL_GRP, p -> p.cutoff$and(S9_M2.bp_grp_cd10.like(bind("asppl_grp_cd10"))).cutoff$and(S9_MM_BP10.bp_grp_nm.like(bind("asppl_grp_nm10"))))
			);
	}

	/**
	 * -- MSBHL5080_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBHL5080_MST_RCV_S01() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5080_MST_RCV_Query_S01")
					.mainQuery()
					.select(sum(S0_T1.not_proc_bal).as("not_proc_bal"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_typ.eq(value(MSC_RCV_DAT_TYP.AP.value())))
						.and(S0_T1.acst_cd.eq(bind("setoff_cd")))
						.and(S0_T1.rcv_dpt_cd.eq(bind("so_dpt_cd")))
						.and(S0_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(S0_T1.not_proc_bal.gt(value(0)))
						.cutoff$and(S0_T1.ar_typ.eq(bind("ar_typ")))
					)
			);
	}
}