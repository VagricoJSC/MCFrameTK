package mcframe.serverMSBG.MSBGL0090;

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
	 * -- MSBGL0090_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL0090_MST_MLY_AR_BAL_S01() {
		MCTempView S0_VA2 = createTempView("VA2");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		MCTempView S1_VA1 = createTempView("VA1");
		MAVM_RD_DPT_R S1_M1 = MAVM_RD_DPT_R.create("M1");
		MST_BILL_D_R S2_TA2 = MST_BILL_D_R.create("TA2");
		MST_BILL_R S2_TA3 = MST_BILL_R.create("TA3");
		MST_BILL_ACST_R S2_TA4 = MST_BILL_ACST_R.create("TA4");
		MST_MLY_AR_BAL_R S2_TA1 = MST_MLY_AR_BAL_R.create("TA1");
		MST_WRK_R S2_TA5 = MST_WRK_R.create("TA5");
		MAM_DPT_R S2_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S2_MA2 = MAM_WG_R.create("MA2");
		MAM_BP_R S2_MA3 = MAM_BP_R.create("MA3");
		MAM_CUR_R S2_MA4 = MAM_CUR_R.create("MA4");
		MAM_CUR_R S2_MA5 = MAM_CUR_R.create("MA5");
		MAM_ITM_R S2_MA6 = MAM_ITM_R.create("MA6");
		MST_BILL_D_R S3_TB2 = MST_BILL_D_R.create("TB2");
		MST_BILL_R S3_TB3 = MST_BILL_R.create("TB3");
		MST_BILL_ACST_R S3_TB4 = MST_BILL_ACST_R.create("TB4");
		MST_MLY_AR_BAL_R S3_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		MST_WRK_R S3_TB5 = MST_WRK_R.create("TB5");
		MAM_DPT_R S3_MB1 = MAM_DPT_R.create("MB1");
		MAM_WG_R S3_MB2 = MAM_WG_R.create("MB2");
		MAM_BP_R S3_MB3 = MAM_BP_R.create("MB3");
		MAM_CUR_R S3_MB4 = MAM_CUR_R.create("MB4");
		MAM_CUR_R S3_MB5 = MAM_CUR_R.create("MB5");
		MAM_ITM_R S3_MB6 = MAM_ITM_R.create("MB6");
		MST_MLY_AR_BAL_R S4_TC1 = MST_MLY_AR_BAL_R.create("TC1");
		MST_WRK_R S4_TC2 = MST_WRK_R.create("TC2");
		MAM_DPT_R S4_MC1 = MAM_DPT_R.create("MC1");
		MAM_WG_R S4_MC2 = MAM_WG_R.create("MC2");
		MAM_BP_R S4_MC3 = MAM_BP_R.create("MC3");
		MAM_CUR_R S4_MC4 = MAM_CUR_R.create("MC4");
		MAM_CUR_R S4_MC5 = MAM_CUR_R.create("MC5");
		MST_RCV_ACT_D_R S5_TD1 = MST_RCV_ACT_D_R.create("TD1");
		MST_RCV_ACT_R S5_TD2 = MST_RCV_ACT_R.create("TD2");
		MST_NOTE_R S5_TD3 = MST_NOTE_R.create("TD3");
		MST_MLY_AR_BAL_R S5_TD5 = MST_MLY_AR_BAL_R.create("TD5");
		MST_WRK_R S5_TD4 = MST_WRK_R.create("TD4");
		MAM_DPT_R S5_MD1 = MAM_DPT_R.create("MD1");
		MAM_WG_R S5_MD2 = MAM_WG_R.create("MD2");
		MAM_BP_R S5_MD3 = MAM_BP_R.create("MD3");
		MAM_CUR_R S5_MD4 = MAM_CUR_R.create("MD4");
		MAM_CUR_R S5_MD5 = MAM_CUR_R.create("MD5");
		MST_RCV_ACT_D_R S6_TE1 = MST_RCV_ACT_D_R.create("TE1");
		MST_RCV_ACT_R S6_TE2 = MST_RCV_ACT_R.create("TE2");
		MST_NOTE_R S6_TE3 = MST_NOTE_R.create("TE3");
		MST_MLY_AR_BAL_R S6_TE5 = MST_MLY_AR_BAL_R.create("TE5");
		MST_WRK_R S6_TE4 = MST_WRK_R.create("TE4");
		MAM_DPT_R S6_ME1 = MAM_DPT_R.create("ME1");
		MAM_WG_R S6_ME2 = MAM_WG_R.create("ME2");
		MAM_BP_R S6_ME3 = MAM_BP_R.create("ME3");
		MAM_CUR_R S6_ME4 = MAM_CUR_R.create("ME4");
		MAM_CUR_R S6_ME5 = MAM_CUR_R.create("ME5");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0090_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_VA2.pr(S2_TA1.ac_ym),
						S0_VA2.pr(S2_TA1.ar_dpt_cd),
						S0_VA2.pr("ar_dpt_nm"),
						S0_VA2.pr(S2_MA1.wg_cd),
						S0_VA2.pr(S2_MA2.wg_nm),
						S0_VA2.pr(S2_TA1.acst_cd),
						S0_VA2.pr(S2_TA1.iv_no),
						S0_VA2.pr(S2_TA1.trd_cur_cd),
						S0_VA2.pr("trd_cur_nm"),
						S0_VA2.pr(S2_MA4.amt_dec_place),
						S0_VA2.pr(S2_TA1.wrk_no),
						S0_VA2.pr(S2_TA5.wrk_nm),
						S0_VA2.pr(S2_TA1.ar_typ),
						S0_VA2.pr("init_bal"),
						S0_VA2.pr("amt"),
						S0_VA2.pr("cl_day"),
						S0_VA2.pr("bef_cl_sls_amt"),
						S0_VA2.pr("aft_cl_sls_amt"),
						S0_VA2.pr("end_bal"),
						S0_VA2.pr("not_appl_note"),
						S0_VA2.pr("mly_not_appl_note"),
						S0_VA2.pr("cash_amt"),
						S0_VA2.pr("note_amt"),
						S0_VA2.pr("xfr_amt"),
						S0_VA2.pr("setoff_amt"),
						S0_VA2.pr("sw_amt"),
						S0_VA2.pr(S2_TA1.base_cur_cd),
						S0_VA2.pr("base_cur_nm"),
						S0_VA2.pr("base_amt_dec_place"),
						S0_VA2.pr("base_cur_init_bal"),
						S0_VA2.pr("base_cur_amt"),
						S0_VA2.pr("base_cur_bef_cl_sls_amt"),
						S0_VA2.pr("base_cur_aft_cl_sls_amt"),
						S0_VA2.pr("base_cur_end_bal"),
						S0_VA2.pr("base_cur_not_appl_note"),
						S0_VA2.pr("base_cur_mly_not_appl_note"),
						S0_VA2.pr("base_cur_cash_amt"),
						S0_VA2.pr("base_cur_note_amt"),
						S0_VA2.pr("base_cur_xfr_amt"),
						S0_VA2.pr("base_cur_setoff_amt"),
						S0_VA2.pr("base_cur_sw_amt"),
						S0_VA2.pr("exc_gain_loss"),
						S0_VA2.pr("total_exc_gain_loss"),
						S0_VA2.pr(S2_TA1.ins_usr_id),
						S0_VA2.pr(S2_TA1.ins_usr_nm),
						S0_VA2.pr(S2_TA1.ins_func_id),
						S0_VA2.pr(S2_TA1.ins_ts),
						S0_VA2.pr(S2_TA1.upd_usr_id),
						S0_VA2.pr(S2_TA1.upd_usr_nm),
						S0_VA2.pr(S2_TA1.upd_func_id),
						S0_VA2.pr(S2_TA1.upd_ts),
						S0_VA2.pr(S2_TA1.upd_srv_req_no),
						addDynamicSelect(DS0C_ACST_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_VA1.pr(S2_TA1.ac_ym),
							S1_VA1.pr(S2_TA1.ar_dpt_cd),
							S1_VA1.pr("ar_dpt_nm"),
							S1_VA1.pr(S2_MA1.wg_cd),
							S1_VA1.pr(S2_MA2.wg_nm),
							S1_VA1.pr(S2_TA1.acst_cd),
							S1_VA1.pr(S2_TA1.iv_no),
							S1_VA1.pr(S2_TA1.trd_cur_cd),
							S1_VA1.pr("trd_cur_nm"),
							S1_VA1.pr(S2_MA4.amt_dec_place),
							S1_VA1.pr(S2_TA1.wrk_no),
							S1_VA1.pr(S2_TA5.wrk_nm),
							S1_VA1.pr(S2_TA1.ar_typ),
							sum(
								nvl(
									S1_VA1.pr("init_bal"),
									value(0)
								)
							).as("init_bal"),
							sum(
								nvl(
									S1_VA1.pr("amt"),
									value(0)
								)
							).as("amt"),
							MSPA_AR_UTIL$F_GET_MAX_CL_DAY(S1_VA1.pr(S2_MA3.bcst_cd)).as("cl_day"),
							sum(
								nvl(
									S1_VA1.pr("bef_cl_sls_amt"),
									value(0)
								)
							).as("bef_cl_sls_amt"),
							sum(
								nvl(
									S1_VA1.pr("aft_cl_sls_amt"),
									value(0)
								)
							).as("aft_cl_sls_amt"),
							sum(
								nvl(
									S1_VA1.pr("end_bal"),
									value(0)
								)
							).as("end_bal"),
							sum(
								nvl(
									S1_VA1.pr("not_appl_note"),
									value(0)
								)
							).as("not_appl_note"),
							sum(
								nvl(
									S1_VA1.pr("mly_not_appl_note"),
									value(0)
								)
							).as("mly_not_appl_note"),
							sum(
								nvl(
									S1_VA1.pr("cash_amt"),
									value(0)
								)
							).as("cash_amt"),
							sum(
								nvl(
									S1_VA1.pr("note_amt"),
									value(0)
								)
							).as("note_amt"),
							sum(
								nvl(
									S1_VA1.pr("xfr_amt"),
									value(0)
								)
							).as("xfr_amt"),
							sum(
								nvl(
									S1_VA1.pr("setoff_amt"),
									value(0)
								)
							).as("setoff_amt"),
							sum(
								nvl(
									S1_VA1.pr("sw_amt"),
									value(0)
								)
							).as("sw_amt"),
							S1_VA1.pr(S2_TA1.base_cur_cd),
							S1_VA1.pr("base_cur_nm"),
							S1_VA1.pr("base_amt_dec_place"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_init_bal"),
									value(0)
								)
							).as("base_cur_init_bal"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_amt"),
									value(0)
								)
							).as("base_cur_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_bef_cl_sls_amt"),
									value(0)
								)
							).as("base_cur_bef_cl_sls_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_aft_cl_sls_amt"),
									value(0)
								)
							).as("base_cur_aft_cl_sls_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_end_bal"),
									value(0)
								)
							).as("base_cur_end_bal"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_not_appl_note"),
									value(0)
								)
							).as("base_cur_not_appl_note"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_mly_not_appl_note"),
									value(0)
								)
							).as("base_cur_mly_not_appl_note"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_cash_amt"),
									value(0)
								)
							).as("base_cur_cash_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_note_amt"),
									value(0)
								)
							).as("base_cur_note_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_xfr_amt"),
									value(0)
								)
							).as("base_cur_xfr_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_setoff_amt"),
									value(0)
								)
							).as("base_cur_setoff_amt"),
							sum(
								nvl(
									S1_VA1.pr("base_cur_sw_amt"),
									value(0)
								)
							).as("base_cur_sw_amt"),
							sum(
								nvl(
									S1_VA1.pr("exc_gain_loss"),
									value(0)
								)
							).as("exc_gain_loss"),
							sum(
								nvl(
									S1_VA1.pr("total_exc_gain_loss"),
									value(0)
								)
							).as("total_exc_gain_loss"),
							S1_VA1.pr(S2_TA1.ins_usr_id),
							S1_VA1.pr(S2_TA1.ins_usr_nm),
							S1_VA1.pr(S2_TA1.ins_func_id),
							S1_VA1.pr(S2_TA1.ins_ts),
							S1_VA1.pr(S2_TA1.upd_usr_id),
							S1_VA1.pr(S2_TA1.upd_usr_nm),
							S1_VA1.pr(S2_TA1.upd_func_id),
							S1_VA1.pr(S2_TA1.upd_ts),
							S1_VA1.pr(S2_TA1.upd_srv_req_no)
						)
						.from(
							subQuery()
							.select(
								S2_TA1.ac_ym,
								S2_TA1.ar_dpt_cd,
								S2_MA1.dpt_nm.as("ar_dpt_nm"),
								S2_MA1.wg_cd,
								S2_MA2.wg_nm,
								S2_TA1.acst_cd,
								S2_MA3.bp_nm.as("acst_nm"),
								S2_TA1.iv_no,
								S2_TA1.trd_cur_cd,
								S2_MA4.cur_nm.as("trd_cur_nm"),
								S2_MA4.amt_dec_place,
								S2_TA1.wrk_no,
								S2_TA5.wrk_nm,
								S2_TA1.ar_typ,
								value(0).as("init_bal"),
								value(0).as("amt"),
								S2_MA3.bcst_cd,
								cases()
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(1))
									)
										.then(
											value(0).subtract(
												bracket(
													S2_TA2.trd_cur_amt.add(S2_TA2.trd_cur_tax_amt)
												)
											)
									)
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(-1))
									)
										.then(S2_TA2.trd_cur_amt.add(S2_TA2.trd_cur_tax_amt))
									.otherwise(nullValue()).as("bef_cl_sls_amt"),
								cases()
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(1))
									)
										.then(S2_TA2.trd_cur_amt.add(S2_TA2.trd_cur_tax_amt))
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(-1))
									)
										.then(
											value(0).subtract(
												bracket(
													S2_TA2.trd_cur_amt.add(S2_TA2.trd_cur_tax_amt)
												)
											)
									)
									.otherwise(nullValue()).as("aft_cl_sls_amt"),
								value(0).as("end_bal"),
								value(0).as("mly_not_appl_note"),
								value(0).as("not_appl_note"),
								value(0).as("cash_amt"),
								value(0).as("note_amt"),
								value(0).as("xfr_amt"),
								value(0).as("setoff_amt"),
								value(0).as("sw_amt"),
								S2_TA1.base_cur_cd,
								S2_MA5.cur_nm.as("base_cur_nm"),
								S2_MA5.amt_dec_place.as("base_amt_dec_place"),
								value(0).as("base_cur_init_bal"),
								value(0).as("base_cur_amt"),
								cases()
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(1))
									)
										.then(
											value(0).subtract(
												bracket(
													S2_TA2.base_cur_amt.add(S2_TA2.base_cur_tax_amt)
												)
											)
									)
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(-1))
									)
										.then(S2_TA2.base_cur_amt.add(S2_TA2.base_cur_tax_amt))
									.otherwise(nullValue()).as("base_cur_bef_cl_sls_amt"),
								cases()
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(1))
									)
										.then(S2_TA2.base_cur_amt.add(S2_TA2.base_cur_tax_amt))
									.when(
										MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
											S2_TA2.trd_ptn_typ,
											nvl(
												S2_MA6.dscnt_itm_flg,
												value(false)
											)
										).eq(value(-1))
									)
										.then(
											value(0).subtract(
												bracket(
													S2_TA2.base_cur_amt.add(S2_TA2.base_cur_tax_amt)
												)
											)
									)
									.otherwise(nullValue()).as("base_cur_aft_cl_sls_amt"),
								value(0).as("base_cur_end_bal"),
								value(0).as("base_cur_mly_not_appl_note"),
								value(0).as("base_cur_not_appl_note"),
								value(0).as("base_cur_cash_amt"),
								value(0).as("base_cur_note_amt"),
								value(0).as("base_cur_xfr_amt"),
								value(0).as("base_cur_setoff_amt"),
								value(0).as("base_cur_sw_amt"),
								value(0).as("exc_gain_loss"),
								value(0).as("total_exc_gain_loss"),
								S2_TA1.ins_usr_id,
								S2_TA1.ins_usr_nm,
								S2_TA1.ins_func_id,
								S2_TA1.ins_ts,
								S2_TA1.upd_usr_id,
								S2_TA1.upd_usr_nm,
								S2_TA1.upd_func_id,
								S2_TA1.upd_ts,
								S2_TA1.upd_srv_req_no
							)
							.from(
								S2_TA1
								.innerJoin(S2_TA3).on(
										bracket(
											S2_TA1.trd_cur_cd.eq(S2_TA3.trd_cur_cd)
											.and(
												S2_TA1.wrk_no.eq(S2_TA3.wrk_no)
												.or(S2_TA1.wrk_no.isNull())
												.and(S2_TA3.wrk_no.isNull())
											)
											.and(S2_TA1.ac_ym.lt(MSPA_AR_UTIL$F_GET_AC_YM_NE(S2_TA3.bill_cl_dt)))
										)
									)
								.innerJoin(S2_TA4).on(
										bracket(
											S2_TA3.bill_mng_no.eq(S2_TA4.bill_mng_no)
											.and(S2_TA1.ar_dpt_cd.eq(S2_TA4.ar_dpt_cd))
											.and(S2_TA1.acst_cd.eq(S2_TA4.acst_cd))
										)
									)
								.innerJoin(S2_TA2).on(
									bracket(
										S2_TA2.bill_acst_no.eq(S2_TA4.bill_acst_no)
										.and(S2_TA1.ac_ym.eq(S2_TA2.ac_ym))
										.and(S2_TA1.iv_no.eq(S2_TA2.iv_no))
										.and(S2_TA1.ar_typ.eq(S2_TA2.ar_typ))
										)
								)
								.leftOuterJoin(S2_TA5).on(
									bracket(
										S2_TA1.wrk_no.eq(S2_TA5.wrk_no)
									)
								)
								.leftOuterJoin(S2_MA1).on(
									bracket(
										S2_TA1.ar_dpt_cd.eq(S2_MA1.dpt_cd)
										.and(S2_TA1.ac_ym.between(S2_MA1.st_dt, S2_MA1.end_dt))
									)
								)
								.leftOuterJoin(S2_MA2).on(
									bracket(
										S2_MA1.wg_cd.eq(S2_MA2.wg_cd)
									)
								)
								.leftOuterJoin(S2_MA3).on(
									bracket(
										S2_TA1.acst_cd.eq(S2_MA3.bp_cd)
									)
								)
								.leftOuterJoin(S2_MA4).on(
									bracket(
										S2_TA1.trd_cur_cd.eq(S2_MA4.cur_cd)
									)
								)
								.leftOuterJoin(S2_MA5).on(
									bracket(
										S2_TA1.base_cur_cd.eq(S2_MA5.cur_cd)
									)
								)
								.leftOuterJoin(S2_MA6).on(
									S2_TA2.itm_cd.eq(S2_MA6.itm_cd)
									.and(S2_TA2.itm_sub1.eq(S2_MA6.itm_sub1))
									.and(S2_TA2.itm_sub2.eq(S2_MA6.itm_sub2))
									.and(S2_TA2.itm_sub3.eq(S2_MA6.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_TA2.valid_flg.eq(value(true)))
								.and(
									S2_TA2.ar_trd_grp_typ.in(
										value(MAC_AR_TRD_GRP_TYP.SLS.value()),
										value(MAC_AR_TRD_GRP_TYP.SLS_RTN.value()),
										value(MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value()),
										value(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value())
									)
									.or(S2_TA2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
								)
								.cutoff$and(S2_TA1.ac_ym.gte(bind("ac_ym_fr")))
								.cutoff$and(S2_TA1.ac_ym.lte(bind("ac_ym_to")))
								.cutoff$and(S2_TA1.ar_dpt_cd.like(bind("ar_dpt_cd")))
								.cutoff$and(S2_MA1.dpt_nm.like(bind("ar_dpt_nm")))
								.cutoff$and(S2_MA1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_MA2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_TA1.acst_cd.like(bind("acst_cd")))
								.cutoff$and(S2_MA3.bp_nm.like(bind("acst_nm")))
								.cutoff$and(S2_TA1.iv_no.like(bind("iv_no")))
								.cutoff$and(S2_TA1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TA5.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MA4.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TA1.ar_typ.like(bind("ar_typ")))
							)
							.unionAll(
								subQuery()
								.select(
									S3_TB1.ac_ym,
									S3_TB1.ar_dpt_cd,
									S3_MB1.dpt_nm.as("ar_dpt_nm"),
									S3_MB1.wg_cd,
									S3_MB2.wg_nm,
									S3_TB1.acst_cd,
									S3_MB3.bp_nm,
									S3_TB1.iv_no,
									S3_TB1.trd_cur_cd,
									S3_MB4.cur_nm.as("trd_cur_nm"),
									S3_MB4.amt_dec_place,
									S3_TB1.wrk_no,
									S3_TB5.wrk_nm,
									S3_TB1.ar_typ,
									value(0).as("init_bal"),
									value(0).as("amt"),
									S3_MB3.bcst_cd,
									cases()
										.when(
											MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
												S3_TB2.trd_ptn_typ,
												nvl(
													S3_MB6.dscnt_itm_flg,
													value(false)
												)
											).eq(value(1))
										)
											.then(S3_TB2.trd_cur_amt.add(S3_TB2.trd_cur_tax_amt))
										.when(
											MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
												S3_TB2.trd_ptn_typ,
												nvl(
													S3_MB6.dscnt_itm_flg,
													value(false)
												)
											).eq(value(-1))
										)
											.then(
												value(0).subtract(
													bracket(
														S3_TB2.trd_cur_amt.add(S3_TB2.trd_cur_tax_amt)
													)
												)
										)
										.otherwise(nullValue()).as("bef_cl_sls_amt"),
									value(0).as("aft_cl_sls_amt"),
									value(0).as("end_bal"),
									value(0).as("mly_not_appl_note"),
									value(0).as("not_appl_note"),
									value(0).as("cash_amt"),
									value(0).as("note_amt"),
									value(0).as("xfr_amt"),
									value(0).as("setoff_amt"),
									value(0).as("sw_amt"),
									S3_TB1.base_cur_cd,
									S3_MB5.cur_nm.as("base_cur_nm"),
									S3_MB5.amt_dec_place.as("base_amt_dec_place"),
									value(0).as("base_cur_init_bal"),
									value(0).as("base_cur_amt"),
									cases()
										.when(
											MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
												S3_TB2.trd_ptn_typ,
												nvl(
													S3_MB6.dscnt_itm_flg,
													value(false)
												)
											).eq(value(1))
										)
											.then(S3_TB2.base_cur_amt.add(S3_TB2.base_cur_tax_amt))
										.when(
											MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
												S3_TB2.trd_ptn_typ,
												nvl(
													S3_MB6.dscnt_itm_flg,
													value(false)
												)
											).eq(value(-1))
										)
											.then(
												value(0).subtract(
													bracket(
														S3_TB2.base_cur_amt.add(S3_TB2.base_cur_tax_amt)
													)
												)
										)
										.otherwise(nullValue()).as("base_cur_bef_cl_sls_amt"),
									value(0).as("base_cur_aft_cl_sls_amt"),
									value(0).as("base_cur_end_bal"),
									value(0).as("base_cur_mly_not_appl_note"),
									value(0).as("base_cur_not_appl_note"),
									value(0).as("base_cur_cash_amt"),
									value(0).as("base_cur_note_amt"),
									value(0).as("base_cur_xfr_amt"),
									value(0).as("base_cur_setoff_amt"),
									value(0).as("base_cur_sw_amt"),
									value(0).as("exc_gain_loss"),
									value(0).as("total_exc_gain_loss"),
									S3_TB1.ins_usr_id,
									S3_TB1.ins_usr_nm,
									S3_TB1.ins_func_id,
									S3_TB1.ins_ts,
									S3_TB1.upd_usr_id,
									S3_TB1.upd_usr_nm,
									S3_TB1.upd_func_id,
									S3_TB1.upd_ts,
									S3_TB1.upd_srv_req_no
								)
								.from(
									S3_TB1
									.innerJoin(S3_TB3).on(
											bracket(
												S3_TB1.trd_cur_cd.eq(S3_TB3.trd_cur_cd)
												.and(
													S3_TB1.wrk_no.eq(S3_TB3.wrk_no)
													.or(S3_TB1.wrk_no.isNull())
													.and(S3_TB3.wrk_no.isNull())
												)
											)
										)
									.innerJoin(S3_TB4).on(
											bracket(
												S3_TB3.bill_mng_no.eq(S3_TB4.bill_mng_no)
												.and(S3_TB1.ar_dpt_cd.eq(S3_TB4.ar_dpt_cd))
												.and(S3_TB1.acst_cd.eq(S3_TB4.acst_cd))
											)
										)
									.innerJoin(S3_TB2).on(
										bracket(
											S3_TB2.bill_acst_no.eq(S3_TB4.bill_acst_no)
											.and(S3_TB1.ac_ym.eq(S3_TB2.ac_ym))
											.and(S3_TB1.iv_no.eq(S3_TB2.iv_no))
											.and(S3_TB1.ar_typ.eq(S3_TB2.ar_typ))
											)
									)
									.leftOuterJoin(S3_TB5).on(
										bracket(
											S3_TB1.wrk_no.eq(S3_TB5.wrk_no)
										)
									)
									.leftOuterJoin(S3_MB1).on(
										bracket(
											S3_TB1.ar_dpt_cd.eq(S3_MB1.dpt_cd)
											.and(S3_TB1.ac_ym.between(S3_MB1.st_dt, S3_MB1.end_dt))
										)
									)
									.leftOuterJoin(S3_MB2).on(
										bracket(
											S3_MB1.wg_cd.eq(S3_MB2.wg_cd)
										)
									)
									.leftOuterJoin(S3_MB3).on(
										bracket(
											S3_TB1.acst_cd.eq(S3_MB3.bp_cd)
										)
									)
									.leftOuterJoin(S3_MB4).on(
										bracket(
											S3_TB1.trd_cur_cd.eq(S3_MB4.cur_cd)
										)
									)
									.leftOuterJoin(S3_MB5).on(
										bracket(
											S3_TB1.base_cur_cd.eq(S3_MB5.cur_cd)
										)
									)
									.leftOuterJoin(S3_MB6).on(
										S3_TB2.itm_cd.eq(S3_MB6.itm_cd)
										.and(S3_TB2.itm_sub1.eq(S3_MB6.itm_sub1))
										.and(S3_TB2.itm_sub2.eq(S3_MB6.itm_sub2))
										.and(S3_TB2.itm_sub3.eq(S3_MB6.itm_sub3))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_TB2.valid_flg.eq(value(true)))
									.and(
										S3_TB2.ar_trd_grp_typ.in(
											value(MAC_AR_TRD_GRP_TYP.SLS.value()),
											value(MAC_AR_TRD_GRP_TYP.SLS_RTN.value()),
											value(MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value()),
											value(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value())
										)
										.or(S3_TB2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
									)
									.cutoff$and(S3_TB1.ac_ym.gte(bind("ac_ym_fr")))
									.cutoff$and(S3_TB1.ac_ym.lte(bind("ac_ym_to")))
									.cutoff$and(S3_TB1.ar_dpt_cd.like(bind("ar_dpt_cd")))
									.cutoff$and(S3_MB1.dpt_nm.like(bind("ar_dpt_nm")))
									.cutoff$and(S3_MB1.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S3_MB2.wg_nm.like(bind("wg_nm")))
									.cutoff$and(S3_TB1.acst_cd.like(bind("acst_cd")))
									.cutoff$and(S3_MB3.bp_nm.like(bind("acst_nm")))
									.cutoff$and(S3_TB1.iv_no.like(bind("iv_no")))
									.cutoff$and(S3_TB1.wrk_no.like(bind("wrk_no")))
									.cutoff$and(S3_TB5.wrk_nm.like(bind("wrk_nm")))
									.cutoff$and(S3_TB1.trd_cur_cd.like(bind("trd_cur_cd")))
									.cutoff$and(S3_MB4.cur_nm.like(bind("trd_cur_nm")))
									.cutoff$and(S3_TB1.ar_typ.like(bind("ar_typ")))
								)
								.unionAll(
									subQuery()
									.select(
										S4_TC1.ac_ym,
										S4_TC1.ar_dpt_cd,
										S4_MC1.dpt_nm.as("ar_dpt_nm"),
										S4_MC1.wg_cd,
										S4_MC2.wg_nm,
										S4_TC1.acst_cd,
										S4_MC3.bp_nm.as("acst_nm"),
										S4_TC1.iv_no,
										S4_TC1.trd_cur_cd,
										S4_MC4.cur_nm.as("trd_cur_nm"),
										S4_MC4.amt_dec_place,
										S4_TC1.wrk_no,
										S4_TC2.wrk_nm,
										S4_TC1.ar_typ,
										S4_TC1.init_bal,
										S4_TC1.cash_amt.add(S4_TC1.note_amt).add(S4_TC1.xfr_amt).add(S4_TC1.setoff_amt).add(S4_TC1.sw_amt).as("amt"),
										S4_MC3.bcst_cd,
										value(0).as("bef_cl_sls_amt"),
										value(0).as("aft_cl_sls_amt"),
										S4_TC1.end_bal,
										value(0).as("mly_not_appl_note"),
										value(0).as("not_appl_note"),
										S4_TC1.cash_amt,
										S4_TC1.note_amt,
										S4_TC1.xfr_amt,
										S4_TC1.setoff_amt,
										S4_TC1.sw_amt,
										S4_TC1.base_cur_cd,
										S4_MC5.cur_nm.as("base_cur_nm"),
										S4_MC5.amt_dec_place.as("base_amt_dec_place"),
										S4_TC1.base_cur_init_bal,
										S4_TC1.base_cur_cash_amt.add(S4_TC1.base_cur_note_amt).add(S4_TC1.base_cur_xfr_amt).add(S4_TC1.base_cur_setoff_amt).add(S4_TC1.base_cur_sw_amt).as("amt"),
										value(0).as("base_cur_bef_cl_sls_amt"),
										value(0).as("base_cur_aft_cl_sls_amt"),
										S4_TC1.base_cur_end_bal,
										value(0).as("base_cur_mly_not_appl_note"),
										value(0).as("base_cur_not_appl_note"),
										S4_TC1.base_cur_cash_amt,
										S4_TC1.base_cur_note_amt,
										S4_TC1.base_cur_xfr_amt,
										S4_TC1.base_cur_setoff_amt,
										S4_TC1.base_cur_sw_amt,
										S4_TC1.exc_gain_loss,
										S4_TC1.total_exc_gain_loss,
										S4_TC1.ins_usr_id,
										S4_TC1.ins_usr_nm,
										S4_TC1.ins_func_id,
										S4_TC1.ins_ts,
										S4_TC1.upd_usr_id,
										S4_TC1.upd_usr_nm,
										S4_TC1.upd_func_id,
										S4_TC1.upd_ts,
										S4_TC1.upd_srv_req_no
									)
									.from(
										S4_TC1
										.leftOuterJoin(S4_TC2).on(
											bracket(
												S4_TC1.wrk_no.eq(S4_TC2.wrk_no)
											)
										)
										.leftOuterJoin(S4_MC1).on(
											bracket(
												S4_TC1.ar_dpt_cd.eq(S4_MC1.dpt_cd)
												.and(S4_TC1.ac_ym.between(S4_MC1.st_dt, S4_MC1.end_dt))
											)
										)
										.leftOuterJoin(S4_MC2).on(
											bracket(
												S4_MC1.wg_cd.eq(S4_MC2.wg_cd)
											)
										)
										.leftOuterJoin(S4_MC3).on(
											bracket(
												S4_TC1.acst_cd.eq(S4_MC3.bp_cd)
											)
										)
										.leftOuterJoin(S4_MC4).on(
											bracket(
												S4_TC1.trd_cur_cd.eq(S4_MC4.cur_cd)
											)
										)
										.leftOuterJoin(S4_MC5).on(
											bracket(
												S4_TC1.base_cur_cd.eq(S4_MC5.cur_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.cutoff$and(S4_TC1.ac_ym.gte(bind("ac_ym_fr")))
										.cutoff$and(S4_TC1.ac_ym.lte(bind("ac_ym_to")))
										.cutoff$and(S4_TC1.ar_dpt_cd.like(bind("ar_dpt_cd")))
										.cutoff$and(S4_MC1.dpt_nm.like(bind("ar_dpt_nm")))
										.cutoff$and(S4_MC1.wg_cd.like(bind("wg_cd")))
										.cutoff$and(S4_MC2.wg_nm.like(bind("wg_nm")))
										.cutoff$and(S4_TC1.acst_cd.like(bind("acst_cd")))
										.cutoff$and(S4_MC3.bp_nm.like(bind("acst_nm")))
										.cutoff$and(S4_TC1.iv_no.like(bind("iv_no")))
										.cutoff$and(S4_TC1.wrk_no.like(bind("wrk_no")))
										.cutoff$and(S4_TC2.wrk_nm.like(bind("wrk_nm")))
										.cutoff$and(S4_TC1.trd_cur_cd.like(bind("trd_cur_cd")))
										.cutoff$and(S4_MC4.cur_nm.like(bind("trd_cur_nm")))
										.cutoff$and(S4_TC1.ar_typ.like(bind("ar_typ")))
									)
									.unionAll(
										subQuery()
										.select(
											bind("ac_ym"),
											S5_TD1.ar_dpt_cd,
											S5_MD1.dpt_nm.as("ar_dpt_nm"),
											S5_TD1.wg_cd,
											S5_MD2.wg_nm,
											S5_TD1.acst_cd,
											S5_MD3.bp_nm.as("acst_nm"),
											S5_TD1.iv_no,
											S5_TD2.trd_cur_cd,
											S5_MD4.cur_nm.as("trd_cur_nm"),
											S5_MD4.amt_dec_place,
											S5_TD1.wrk_no,
											S5_TD4.wrk_nm,
											S5_TD1.ar_typ,
											value(0).as("init_bal"),
											value(0).as("amt"),
											S5_MD3.bcst_cd,
											value(0).as("bef_cl_sls_amt"),
											value(0).as("aft_cl_sls_amt"),
											value(0).as("end_bal"),
											value(0).as("mly_not_appl_note"),
											S5_TD1.trd_cur_amt1.as("not_appl_note"),
											value(0).as("cash_amt"),
											value(0).as("note_amt"),
											value(0).as("xfr_amt"),
											value(0).as("setoff_amt"),
											value(0).as("sw_amt"),
											S5_TD2.base_cur_cd,
											S5_MD5.cur_nm.as("base_cur_nm"),
											S5_MD5.amt_dec_place.as("base_amt_dec_place"),
											value(0).as("base_cur_init_bal"),
											value(0).as("base_cur_amt"),
											value(0).as("base_cur_bef_cl_sls_amt"),
											value(0).as("base_cur_aft_cl_sls_amt"),
											value(0).as("base_cur_end_bal"),
											value(0).as("base_cur_mly_not_appl_note"),
											S5_TD1.base_cur_amt1.as("base_cur_not_appl_note"),
											value(0).as("base_cur_cash_amt"),
											value(0).as("base_cur_note_amt"),
											value(0).as("base_cur_xfr_amt"),
											value(0).as("base_cur_setoff_amt"),
											value(0).as("base_cur_sw_amt"),
											value(0).as("exc_gain_loss"),
											value(0).as("total_exc_gain_loss"),
											S5_TD5.ins_usr_id,
											S5_TD5.ins_usr_nm,
											S5_TD5.ins_func_id,
											S5_TD5.ins_ts,
											S5_TD5.upd_usr_id,
											S5_TD5.upd_usr_nm,
											S5_TD5.upd_func_id,
											S5_TD5.upd_ts,
											S5_TD5.upd_srv_req_no
										)
										.from(
											S5_TD1
											.innerJoin(S5_TD2).on(
												bracket(
													S5_TD1.rcv_act_no.eq(S5_TD2.rcv_act_no)
													.and(S5_TD1.rcv_act_seq.eq(S5_TD2.rcv_act_seq))
												)
											)
											.innerJoin(S5_TD3).on(
												bracket(
													S5_TD2.note_mng_no.eq(S5_TD3.note_mng_no)
												)
											)
											.leftOuterJoin(S5_TD5).on(
												bracket(
													S5_TD5.ac_ym.eq(bind("ac_ym"))
													.and(S5_TD5.iv_no.eq(S5_TD1.iv_no))
													.and(S5_TD5.ar_typ.eq(S5_TD1.ar_typ))
													.and(S5_TD5.trd_cur_cd.eq(S5_TD2.trd_cur_cd))
													.and(
														S5_TD5.wrk_no.eq(S5_TD1.wrk_no)
														.or(S5_TD5.wrk_no.isNull())
														.and(S5_TD1.wrk_no.isNull())
													)
													.and(S5_TD5.ar_dpt_cd.eq(S5_TD1.ar_dpt_cd))
													.and(S5_TD5.acst_cd.eq(S5_TD1.acst_cd))
												)
											)
											.leftOuterJoin(S5_TD4).on(
												bracket(
													S5_TD1.wrk_no.eq(S5_TD4.wrk_no)
												)
											)
											.leftOuterJoin(S5_MD1).on(
												bracket(
													S5_TD1.ar_dpt_cd.eq(S5_MD1.dpt_cd)
													.and(bind("ac_ym").between(S5_MD1.st_dt, S5_MD1.end_dt))
												)
											)
											.leftOuterJoin(S5_MD2).on(
												bracket(
													S5_TD1.wg_cd.eq(S5_MD2.wg_cd)
												)
											)
											.leftOuterJoin(S5_MD3).on(
												bracket(
													S5_TD1.acst_cd.eq(S5_MD3.bp_cd)
												)
											)
											.leftOuterJoin(S5_MD4).on(
												bracket(
													S5_TD2.trd_cur_cd.eq(S5_MD4.cur_cd)
												)
											)
											.leftOuterJoin(S5_MD5).on(
												bracket(
													S5_TD2.base_cur_cd.eq(S5_MD5.cur_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(bind("srch_not_appl_note").eq(value(true)))
											.and(S5_TD1.acst_cd.isNotNull())
											.and(S5_TD2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S5_TD3.due_dt.gt(bind("today")))
											.cutoff$and(S5_TD1.ar_dpt_cd.like(bind("ar_dpt_cd")))
											.cutoff$and(S5_MD1.dpt_nm.like(bind("ar_dpt_nm")))
											.cutoff$and(S5_TD1.wg_cd.like(bind("wg_cd")))
											.cutoff$and(S5_MD2.wg_nm.like(bind("wg_nm")))
											.cutoff$and(S5_TD1.acst_cd.like(bind("acst_cd")))
											.cutoff$and(S5_MD3.bp_nm.like(bind("acst_nm")))
											.cutoff$and(S5_TD1.iv_no.like(bind("iv_no")))
											.cutoff$and(S5_TD1.wrk_no.like(bind("wrk_no")))
											.cutoff$and(S5_TD4.wrk_nm.like(bind("wrk_nm")))
											.cutoff$and(S5_TD2.trd_cur_cd.like(bind("trd_cur_cd")))
											.cutoff$and(S5_MD4.cur_nm.like(bind("trd_cur_nm")))
											.cutoff$and(S5_TD1.ar_typ.like(bind("ar_typ")))
										)
										.unionAll(
											subQuery()
											.select(
												S6_TE2.ac_ym,
												S6_TE1.ar_dpt_cd,
												S6_ME1.dpt_nm.as("ar_dpt_nm"),
												S6_TE1.wg_cd,
												S6_ME2.wg_nm,
												S6_TE1.acst_cd,
												S6_ME3.bp_nm.as("acst_nm"),
												S6_TE1.iv_no,
												S6_TE2.trd_cur_cd,
												S6_ME4.cur_nm.as("trd_cur_nm"),
												S6_ME4.amt_dec_place,
												S6_TE1.wrk_no,
												S6_TE4.wrk_nm,
												S6_TE1.ar_typ,
												value(0).as("init_bal"),
												value(0).as("amt"),
												S6_ME3.bcst_cd,
												value(0).as("bef_cl_sls_amt"),
												value(0).as("aft_cl_sls_amt"),
												value(0).as("end_bal"),
												S6_TE1.trd_cur_amt1.as("mly_not_appl_note"),
												value(0).as("not_appl_note"),
												value(0).as("cash_amt"),
												value(0).as("note_amt"),
												value(0).as("xfr_amt"),
												value(0).as("setoff_amt"),
												value(0).as("sw_amt"),
												S6_TE2.base_cur_cd,
												S6_ME5.cur_nm.as("base_cur_nm"),
												S6_ME5.amt_dec_place.as("base_amt_dec_place"),
												value(0).as("base_cur_init_bal"),
												value(0).as("base_cur_amt"),
												value(0).as("base_cur_bef_cl_sls_amt"),
												value(0).as("base_cur_aft_cl_sls_amt"),
												value(0).as("base_cur_end_bal"),
												S6_TE1.base_cur_amt1.as("base_mly_not_appl_note"),
												value(0).as("base_cur_not_appl_note"),
												value(0).as("base_cur_cash_amt"),
												value(0).as("base_cur_note_amt"),
												value(0).as("base_cur_xfr_amt"),
												value(0).as("base_cur_setoff_amt"),
												value(0).as("base_cur_sw_amt"),
												value(0).as("exc_gain_loss"),
												value(0).as("total_exc_gain_loss"),
												S6_TE5.ins_usr_id,
												S6_TE5.ins_usr_nm,
												S6_TE5.ins_func_id,
												S6_TE5.ins_ts,
												S6_TE5.upd_usr_id,
												S6_TE5.upd_usr_nm,
												S6_TE5.upd_func_id,
												S6_TE5.upd_ts,
												S6_TE5.upd_srv_req_no
											)
											.from(
												S6_TE1
												.innerJoin(S6_TE2).on(
													bracket(
														S6_TE1.rcv_act_no.eq(S6_TE2.rcv_act_no)
														.and(S6_TE1.rcv_act_seq.eq(S6_TE2.rcv_act_seq))
													)
												)
												.innerJoin(S6_TE3).on(
													bracket(
														S6_TE2.note_mng_no.eq(S6_TE3.note_mng_no)
													)
												)
												.innerJoin(S6_TE5).on(
													bracket(
														S6_TE5.ac_ym.eq(S6_TE2.ac_ym)
														.and(S6_TE5.iv_no.eq(S6_TE1.iv_no))
														.and(S6_TE5.ar_typ.eq(S6_TE1.ar_typ))
														.and(S6_TE5.trd_cur_cd.eq(S6_TE2.trd_cur_cd))
														.and(
															S6_TE5.wrk_no.eq(S6_TE1.wrk_no)
															.or(S6_TE5.wrk_no.isNull())
															.and(S6_TE1.wrk_no.isNull())
														)
														.and(S6_TE5.ar_dpt_cd.eq(S6_TE1.ar_dpt_cd))
														.and(S6_TE5.acst_cd.eq(S6_TE1.acst_cd))
													)
												)
												.leftOuterJoin(S6_TE4).on(
													bracket(
														S6_TE1.wrk_no.eq(S6_TE4.wrk_no)
													)
												)
												.leftOuterJoin(S6_ME1).on(
													bracket(
														S6_TE1.ar_dpt_cd.eq(S6_ME1.dpt_cd)
														.and(S6_TE2.ac_ym.between(S6_ME1.st_dt, S6_ME1.end_dt))
													)
												)
												.leftOuterJoin(S6_ME2).on(
													bracket(
														S6_TE1.wg_cd.eq(S6_ME2.wg_cd)
													)
												)
												.leftOuterJoin(S6_ME3).on(
													bracket(
														S6_TE1.acst_cd.eq(S6_ME3.bp_cd)
													)
												)
												.leftOuterJoin(S6_ME4).on(
													bracket(
														S6_TE2.trd_cur_cd.eq(S6_ME4.cur_cd)
													)
												)
												.leftOuterJoin(S6_ME5).on(
													bracket(
														S6_TE2.base_cur_cd.eq(S6_ME5.cur_cd)
													)
												)
											)
											.where(
												value(0).eq(value(0))
												.and(S6_TE1.acst_cd.isNotNull())
												.and(S6_TE2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
												.and(S6_TE3.due_dt.gt(bind("today")))
												.cutoff$and(S6_TE2.ac_ym.gte(bind("ac_ym_fr")))
												.cutoff$and(S6_TE2.ac_ym.lte(bind("ac_ym_to")))
												.cutoff$and(S6_TE1.ar_dpt_cd.like(bind("ar_dpt_cd")))
												.cutoff$and(S6_ME1.dpt_nm.like(bind("ar_dpt_nm")))
												.cutoff$and(S6_TE1.wg_cd.like(bind("wg_cd")))
												.cutoff$and(S6_ME2.wg_nm.like(bind("wg_nm")))
												.cutoff$and(S6_TE1.acst_cd.like(bind("acst_cd")))
												.cutoff$and(S6_ME3.bp_nm.like(bind("acst_nm")))
												.cutoff$and(S6_TE1.iv_no.like(bind("iv_no")))
												.cutoff$and(S6_TE1.wrk_no.like(bind("wrk_no")))
												.cutoff$and(S6_TE4.wrk_nm.like(bind("wrk_nm")))
												.cutoff$and(S6_TE2.trd_cur_cd.like(bind("trd_cur_cd")))
												.cutoff$and(S6_ME4.cur_nm.like(bind("trd_cur_nm")))
												.cutoff$and(S6_TE1.ar_typ.like(bind("ar_typ")))
											)
										)
									)
								)
							).view(S1_VA1)
							.innerJoin(S1_M1).on(
								bracket(
									S1_VA1.pr(S2_TA1.ar_dpt_cd).eq(S1_M1.dpt_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
						)
						.groupBy(
							S1_VA1.pr(S2_TA1.ac_ym),
							S1_VA1.pr(S2_TA1.ar_dpt_cd),
							S1_VA1.pr("ar_dpt_nm"),
							S1_VA1.pr(S2_MA1.wg_cd),
							S1_VA1.pr(S2_MA2.wg_nm),
							S1_VA1.pr(S2_TA1.acst_cd),
							S1_VA1.pr("acst_nm"),
							S1_VA1.pr(S2_MA3.bcst_cd),
							S1_VA1.pr(S2_TA1.iv_no),
							S1_VA1.pr(S2_TA1.ar_typ),
							S1_VA1.pr(S2_TA1.trd_cur_cd),
							S1_VA1.pr("trd_cur_nm"),
							S1_VA1.pr(S2_MA4.amt_dec_place),
							S1_VA1.pr(S2_TA1.wrk_no),
							S1_VA1.pr(S2_TA5.wrk_nm),
							S1_VA1.pr(S2_TA1.base_cur_cd),
							S1_VA1.pr("base_cur_nm"),
							S1_VA1.pr("base_amt_dec_place"),
							S1_VA1.pr(S2_TA1.ins_usr_id),
							S1_VA1.pr(S2_TA1.ins_usr_nm),
							S1_VA1.pr(S2_TA1.ins_func_id),
							S1_VA1.pr(S2_TA1.ins_ts),
							S1_VA1.pr(S2_TA1.upd_usr_id),
							S1_VA1.pr(S2_TA1.upd_usr_nm),
							S1_VA1.pr(S2_TA1.upd_func_id),
							S1_VA1.pr(S2_TA1.upd_ts),
							S1_VA1.pr(S2_TA1.upd_srv_req_no)
						)
						.orderBy(
							S1_VA1.pr(S2_TA1.ar_dpt_cd).asc(),
							S1_VA1.pr(S2_TA1.acst_cd).asc(),
							S1_VA1.pr(S2_TA1.trd_cur_cd).asc(),
							S1_VA1.pr(S2_TA1.iv_no).asc(),
							S1_VA1.pr(S2_TA1.wrk_no).asc(),
							S1_VA1.pr(S2_TA1.ar_typ).asc(),
							S1_VA1.pr(S2_TA1.ac_ym).asc(),
							MSPA_AR_UTIL$F_GET_MAX_CL_DAY(S1_VA1.pr(S2_MA3.bcst_cd)).asc()
						).view(S0_VA2)
						.addDynamicView()
						.addDynamicView(DS0C_ACST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_VA2.pr("init_bal").neq(value(0))
							.or(S0_VA2.pr("amt").neq(value(0)))
							.or(S0_VA2.pr("bef_cl_sls_amt").neq(value(0)))
							.or(S0_VA2.pr("aft_cl_sls_amt").neq(value(0)))
							.or(S0_VA2.pr("end_bal").neq(value(0)))
							.or(S0_VA2.pr("not_appl_note").neq(value(0)))
							.or(S0_VA2.pr("mly_not_appl_note").neq(value(0)))
							.or(S0_VA2.pr("cash_amt").neq(value(0)))
							.or(S0_VA2.pr("note_amt").neq(value(0)))
							.or(S0_VA2.pr("xfr_amt").neq(value(0)))
							.or(S0_VA2.pr("setoff_amt").neq(value(0)))
							.or(S0_VA2.pr("sw_amt").neq(value(0)))
							.or(S0_VA2.pr("exc_gain_loss").neq(value(0)))
						)
						.addDynamicPredicate(DS0C_ACST_GRP)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_VA2.pr(S2_TA1.acst_cd).eq(S0_M2.bp_cd)))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd1.as("acst_grp_cd1"), S0_MM1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd2.as("acst_grp_cd2"), S0_MM2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd3.as("acst_grp_cd3"), S0_MM3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd4.as("acst_grp_cd4"), S0_MM4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd5.as("acst_grp_cd5"), S0_MM5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd6.as("acst_grp_cd6"), S0_MM6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd7.as("acst_grp_cd7"), S0_MM7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd8.as("acst_grp_cd8"), S0_MM8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd9.as("acst_grp_cd9"), S0_MM9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd10.as("acst_grp_cd10"), S0_MM10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("acst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					})
				)
			);
	}
}