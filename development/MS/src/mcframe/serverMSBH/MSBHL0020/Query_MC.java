package mcframe.serverMSBH.MSBHL0020;

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
	 * -- MSBHL0020_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL0020_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_BP_GRP_R S0_BSPPL_GRP1 = MAM_BP_GRP_R.create("BSPPL_GRP1");
		MAM_BP_GRP_R S0_BSPPL_GRP2 = MAM_BP_GRP_R.create("BSPPL_GRP2");
		MAM_BP_GRP_R S0_BSPPL_GRP3 = MAM_BP_GRP_R.create("BSPPL_GRP3");
		MAM_BP_GRP_R S0_BSPPL_GRP4 = MAM_BP_GRP_R.create("BSPPL_GRP4");
		MAM_BP_GRP_R S0_BSPPL_GRP5 = MAM_BP_GRP_R.create("BSPPL_GRP5");
		MAM_BP_GRP_R S0_BSPPL_GRP6 = MAM_BP_GRP_R.create("BSPPL_GRP6");
		MAM_BP_GRP_R S0_BSPPL_GRP7 = MAM_BP_GRP_R.create("BSPPL_GRP7");
		MAM_BP_GRP_R S0_BSPPL_GRP8 = MAM_BP_GRP_R.create("BSPPL_GRP8");
		MAM_BP_GRP_R S0_BSPPL_GRP9 = MAM_BP_GRP_R.create("BSPPL_GRP9");
		MAM_BP_GRP_R S0_BSPPL_GRP10 = MAM_BP_GRP_R.create("BSPPL_GRP10");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_GRP_R S0_PSPPL_GRP1 = MAM_BP_GRP_R.create("PSPPL_GRP1");
		MAM_BP_GRP_R S0_PSPPL_GRP2 = MAM_BP_GRP_R.create("PSPPL_GRP2");
		MAM_BP_GRP_R S0_PSPPL_GRP3 = MAM_BP_GRP_R.create("PSPPL_GRP3");
		MAM_BP_GRP_R S0_PSPPL_GRP4 = MAM_BP_GRP_R.create("PSPPL_GRP4");
		MAM_BP_GRP_R S0_PSPPL_GRP5 = MAM_BP_GRP_R.create("PSPPL_GRP5");
		MAM_BP_GRP_R S0_PSPPL_GRP6 = MAM_BP_GRP_R.create("PSPPL_GRP6");
		MAM_BP_GRP_R S0_PSPPL_GRP7 = MAM_BP_GRP_R.create("PSPPL_GRP7");
		MAM_BP_GRP_R S0_PSPPL_GRP8 = MAM_BP_GRP_R.create("PSPPL_GRP8");
		MAM_BP_GRP_R S0_PSPPL_GRP9 = MAM_BP_GRP_R.create("PSPPL_GRP9");
		MAM_BP_GRP_R S0_PSPPL_GRP10 = MAM_BP_GRP_R.create("PSPPL_GRP10");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MST_PAY_CHK_R S1_T1 = MST_PAY_CHK_R.create("T1");
		MAVM_RD_DPT_R S1_DAC = MAVM_RD_DPT_R.create("DAC");
		MBT_APRV_R S1_APRV = MBT_APRV_R.create("APRV");
		MAM_BP_R S1_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S1_M3 = MAM_DPT_R.create("M3");
		MAM_BP_GRP_R S1_BSPPL_GRP1 = MAM_BP_GRP_R.create("BSPPL_GRP1");
		MAM_BP_GRP_R S1_BSPPL_GRP2 = MAM_BP_GRP_R.create("BSPPL_GRP2");
		MAM_BP_GRP_R S1_BSPPL_GRP3 = MAM_BP_GRP_R.create("BSPPL_GRP3");
		MAM_BP_GRP_R S1_BSPPL_GRP4 = MAM_BP_GRP_R.create("BSPPL_GRP4");
		MAM_BP_GRP_R S1_BSPPL_GRP5 = MAM_BP_GRP_R.create("BSPPL_GRP5");
		MAM_BP_GRP_R S1_BSPPL_GRP6 = MAM_BP_GRP_R.create("BSPPL_GRP6");
		MAM_BP_GRP_R S1_BSPPL_GRP7 = MAM_BP_GRP_R.create("BSPPL_GRP7");
		MAM_BP_GRP_R S1_BSPPL_GRP8 = MAM_BP_GRP_R.create("BSPPL_GRP8");
		MAM_BP_GRP_R S1_BSPPL_GRP9 = MAM_BP_GRP_R.create("BSPPL_GRP9");
		MAM_BP_GRP_R S1_BSPPL_GRP10 = MAM_BP_GRP_R.create("BSPPL_GRP10");
		MAM_BP_R S1_M2 = MAM_BP_R.create("M2");
		MAM_BP_GRP_R S1_PSPPL_GRP1 = MAM_BP_GRP_R.create("PSPPL_GRP1");
		MAM_BP_GRP_R S1_PSPPL_GRP2 = MAM_BP_GRP_R.create("PSPPL_GRP2");
		MAM_BP_GRP_R S1_PSPPL_GRP3 = MAM_BP_GRP_R.create("PSPPL_GRP3");
		MAM_BP_GRP_R S1_PSPPL_GRP4 = MAM_BP_GRP_R.create("PSPPL_GRP4");
		MAM_BP_GRP_R S1_PSPPL_GRP5 = MAM_BP_GRP_R.create("PSPPL_GRP5");
		MAM_BP_GRP_R S1_PSPPL_GRP6 = MAM_BP_GRP_R.create("PSPPL_GRP6");
		MAM_BP_GRP_R S1_PSPPL_GRP7 = MAM_BP_GRP_R.create("PSPPL_GRP7");
		MAM_BP_GRP_R S1_PSPPL_GRP8 = MAM_BP_GRP_R.create("PSPPL_GRP8");
		MAM_BP_GRP_R S1_PSPPL_GRP9 = MAM_BP_GRP_R.create("PSPPL_GRP9");
		MAM_BP_GRP_R S1_PSPPL_GRP10 = MAM_BP_GRP_R.create("PSPPL_GRP10");
		MAM_WG_R S1_M4 = MAM_WG_R.create("M4");
		MST_WRK_R S1_T2 = MST_WRK_R.create("T2");
		MAM_CUR_R S1_M5 = MAM_CUR_R.create("M5");
		MST_PAY_CHK_R S2_W2 = MST_PAY_CHK_R.create("W2");
		MST_AP_D_R S3_W1 = MST_AP_D_R.create("W1");
		MST_PAY_CHK_R S4_W2 = MST_PAY_CHK_R.create("W2");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0020_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_d_no,
						nullValue().as("pay_chk_mng_no"),
						nullValue().as("pay_chk_no"),
						nullValue().as("pay_ntc_rev"),
						nullValue().as("reg_dt"),
						S0_T1.sppl_cd,
						S0_T1.bsppl_cd,
						S0_M1.bp_nm.as("bsppl_nm"),
						S0_M1.psppl_cd,
						nullValue().as("bsppl_usr_cd"),
						S0_T1.bsppl_dpt_cd,
						S0_M3.dpt_nm.as("bsppl_dpt_nm"),
						S0_M3.wg_cd,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.wrk_no,
						S0_T1.trd_cur_cd,
						nullValue().as("pay_xrate"),
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.bsppl_cl_dt,
						S0_T1.bsppl_cl_day,
						S0_T1.trd_ptn_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.interim_flg,
						S0_T1.ac_dt,
						S0_M1.purc_interim_cl_flg,
						S0_M1.tax_on_pay_flg,
						S0_M1.pay_spot_flg,
						S0_M1.batch_pay_schd_cl_flg,
						nullValue().as("amt"),
						nullValue().as("com_paid"),
						nullValue().as("com_paid_tax_amt"),
						nullValue().as("last_pay_schd_amt"),
						nullValue().as("bfw_amt"),
						nullValue().as("purc_amt"),
						nullValue().as("purc_ret_amt"),
						nullValue().as("purc_dscnt_amt"),
						nullValue().as("sw_to_amt"),
						nullValue().as("tax_amt"),
						nullValue().as("account_amt"),
						nullValue().as("cash_amt"),
						nullValue().as("note_amt"),
						nullValue().as("setoff_amt"),
						nullValue().as("setoff_tax_amt"),
						nullValue().as("sw_amt"),
						nullValue().as("schd_pay_amt"),
						nullValue().as("adv_pay_bal"),
						nullValue().as("pay_sts_typ"),
						value(false).as("prnt_flg"),
						nullValue().as("man_reg_flg"),
						nullValue().as("aprv_no"),
						nullValue().as("aprv_sts_typ"),
						nullValue().as("aprv_flg"),
						nullValue().as("aprv_upd_flg"),
						nullValue().as("aprv_can_flg"),
						nullValue().as("pay_schd_d_print_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						nullValue().as("ins_usr_id"),
						nullValue().as("ins_usr_nm"),
						nullValue().as("ins_ts"),
						nullValue().as("ins_func_id"),
						S0_T1.upd_cntr,
						nullValue().as("upd_usr_id"),
						nullValue().as("upd_usr_nm"),
						nullValue().as("upd_ts"),
						nullValue().as("upd_func_id"),
						nullValue().as("upd_srv_req_no"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(S0_T1.bsppl_dpt_cd.eq(S0_DAC.dpt_cd))
						.leftOuterJoin(S0_M1).on(S0_T1.bsppl_cd.eq(S0_M1.bp_cd))
						.leftOuterJoin(S0_M3).on(
							S0_T1.bsppl_dpt_cd.eq(S0_M3.dpt_cd)
							.and(
								nvl(
									S0_T1.bsppl_cl_dt,
									S0_T1.ac_dt
								).gte(S0_M3.st_dt)
							)
							.and(
								nvl(
									S0_T1.bsppl_cl_dt,
									S0_T1.ac_dt
								).lte(S0_M3.end_dt)
							)
						)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(value(true).eq(bind("unchk_flg")))
						.and(S0_T1.chk_flg.eq(value(false)))
						.and(S0_T1.valid_flg.eq(value(true)))
						.addDynamicPredicate(DS0D)
						.cutoff$and(S0_T1.bsppl_cl_dt.gte(bind("bsppl_cl_dt_fr")))
						.cutoff$and(S0_T1.bsppl_cl_dt.lte(bind("bsppl_cl_dt_to")))
						.cutoff$and(S0_T1.bsppl_cd.like(bind("bsppl_cd")))
						.cutoff$and(S0_M1.bp_nm.like(bind("bsppl_nm")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("bsppl_dpt_nm")))
						.cutoff$and(S0_M3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.and(
							S0_M1.bp_cd.isNull()
							.cutoff$or(S0_M1.pay_spot_flg.eq(bind("pay_spot_flg_str")))
							.cutoff$or(S0_M1.batch_pay_schd_cl_flg.eq(bind("batch_pay_schd_cl_flg_str")))
							.cutoff$or(
								bracket(
									S0_M1.pay_spot_flg.eq(bind("manual_flg_str"))
									.and(S0_M1.batch_pay_schd_cl_flg.eq(bind("manual_flg_str")))
								)
							)
						)
						.and(value(true).eq(bind("not_prnt_flg")))
					)
					.unionAll(
						subQuery()
						.select(
							nullValue(),
							S1_T1.pay_chk_mng_no,
							S1_T1.pay_chk_no,
							S1_T1.pay_ntc_rev,
							S1_T1.reg_dt,
							nullValue(),
							S1_T1.bsppl_cd,
							S1_M1.bp_nm.as("bsppl_nm"),
							S1_M1.psppl_cd,
							S1_T1.bsppl_usr_cd,
							S1_T1.bsppl_dpt_cd,
							S1_M3.dpt_nm.as("bsppl_dpt_nm"),
							S1_M3.wg_cd,
							S1_T1.purc_act_no,
							S1_T1.rcpt_iv_no,
							S1_T1.rcpt_iv_mng_no,
							S1_T1.wrk_no,
							S1_T1.trd_cur_cd,
							S1_T1.pay_xrate,
							nullValue(),
							nullValue(),
							S1_T1.bsppl_cl_dt,
							S1_T1.bsppl_cl_day,
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							value(false).as("interim_flg"),
							nullValue(),
							S1_M1.purc_interim_cl_flg,
							S1_M1.tax_on_pay_flg,
							S1_T1.pay_spot_flg,
							S1_T1.batch_pay_schd_cl_flg,
							S1_T1.amt,
							S1_T1.com_paid,
							S1_T1.com_paid_tax_amt,
							S1_T1.last_pay_schd_amt,
							S1_T1.bfw_amt,
							S1_T1.purc_amt,
							S1_T1.purc_ret_amt,
							S1_T1.purc_dscnt_amt,
							S1_T1.sw_to_amt,
							S1_T1.tax_amt,
							S1_T1.account_amt,
							S1_T1.cash_amt,
							S1_T1.note_amt,
							S1_T1.setoff_amt,
							S1_T1.setoff_tax_amt,
							S1_T1.sw_amt,
							S1_T1.schd_pay_amt,
							S1_T1.adv_pay_bal,
							S1_T1.pay_sts_typ,
							S1_T1.prnt_flg,
							S1_T1.man_reg_flg,
							S1_T1.aprv_no,
							S1_T1.aprv_sts_typ,
							S1_T1.aprv_flg,
							S1_APRV.aprv_upd_flg,
							S1_APRV.aprv_can_flg,
							S1_T1.pay_schd_d_print_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							S1_T1.upd_cntr,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T1
							.innerJoin(S1_DAC).on(S1_T1.bsppl_dpt_cd.eq(S1_DAC.dpt_cd))
							.leftOuterJoin(S1_APRV).on(
								S1_T1.aprv_no.eq(S1_APRV.aprv_no)
								.and(value(false).eq(S1_APRV.can_flg))
							)
							.leftOuterJoin(S1_M1).on(S1_T1.bsppl_cd.eq(S1_M1.bp_cd))
							.leftOuterJoin(S1_M3).on(
								S1_T1.bsppl_dpt_cd.eq(S1_M3.dpt_cd)
								.and(
									nvl(
										S1_T1.bsppl_cl_dt,
										S1_T1.reg_dt
									).gte(S1_M3.st_dt)
								)
								.and(
									nvl(
										S1_T1.bsppl_cl_dt,
										S1_T1.reg_dt
									).lte(S1_M3.end_dt)
								)
							)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(value(false).eq(bind("no_chked_flg_str")))
							.addDynamicPredicate(DS1D)
							.cutoff$and(S1_T1.reg_dt.gte(bind("reg_dt_fr")))
							.cutoff$and(S1_T1.reg_dt.lte(bind("reg_dt_to")))
							.cutoff$and(
								value(true).eq(bind("not_ins_flg_str"))
								.and(S1_T1.bsppl_cl_dt.gte(bind("bsppl_cl_dt_fr")))
							)
							.cutoff$and(
								value(true).eq(bind("not_ins_flg_str"))
								.and(S1_T1.bsppl_cl_dt.lte(bind("bsppl_cl_dt_to")))
							)
							.cutoff$and(
								notExists(
									subQuery()
									.select(bind("ins_flg_str"))
									.from(S2_W2)
									.where(
										S2_W2.bsppl_cd.eq(S1_T1.bsppl_cd)
										.and(S2_W2.bsppl_dpt_cd.eq(S1_T1.bsppl_dpt_cd))
										.and(S2_W2.purc_act_no.eq(S1_T1.purc_act_no))
										.and(S2_W2.rcpt_iv_no.eq(S1_T1.rcpt_iv_no))
										.and(S2_W2.rcpt_iv_mng_no.eq(S1_T1.rcpt_iv_mng_no))
										.and(S2_W2.trd_cur_cd.eq(S1_T1.trd_cur_cd))
										.and(S2_W2.wrk_no.eq(S1_T1.wrk_no))
										.and(S2_W2.pay_chk_mng_no.gt(S1_T1.pay_chk_mng_no))
									)
								)
							)
							.cutoff$and(S1_T1.bsppl_cd.like(bind("bsppl_cd")))
							.cutoff$and(S1_M1.bp_nm.like(bind("bsppl_nm")))
							.cutoff$and(S1_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
							.cutoff$and(S1_M3.dpt_nm.like(bind("bsppl_dpt_nm")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T1.purc_act_no.like(bind("purc_act_no")))
							.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.cutoff$and(S1_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
							.cutoff$and(S1_T1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T1.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T1.pay_chk_no.like(bind("pay_chk_no")))
							.cutoff$and(S1_T1.pay_schd_d_print_rmrks.like(bind("pay_schd_d_print_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1_T1.pay_spot_flg.eq(bind("pay_spot_flg_str")))
								.cutoff$or(S1_T1.batch_pay_schd_cl_flg.eq(bind("batch_pay_schd_cl_flg_str")))
								.cutoff$or(
									bracket(
										S1_T1.pay_spot_flg.eq(bind("manual_flg_str"))
										.and(S1_T1.batch_pay_schd_cl_flg.eq(bind("manual_flg_str")))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(bind("inc_no_pay_flg_str"))
									.from(S3_W1)
									.where(
										bracket(
											S3_W1.pay_chk_mng_no.eq(S1_T1.pay_chk_mng_no)
										)
									)
								)
							)
							.cutoff$and(
								notExists(
									subQuery()
									.select(bind("new_flg_str"))
									.from(S4_W2)
									.where(
										bracket(
											S4_W2.bsppl_cd.eq(S1_T1.bsppl_cd)
											.and(S4_W2.bsppl_dpt_cd.eq(S1_T1.bsppl_dpt_cd))
											.and(S4_W2.purc_act_no.eq(S1_T1.purc_act_no))
											.and(S4_W2.rcpt_iv_mng_no.eq(S1_T1.rcpt_iv_mng_no))
											.and(S4_W2.rcpt_iv_no.eq(S1_T1.rcpt_iv_no))
											.and(S4_W2.wrk_no.eq(S1_T1.wrk_no))
											.and(S4_W2.trd_cur_cd.eq(S1_T1.trd_cur_cd))
											.and(S4_W2.pay_chk_mng_no.gt(S1_T1.pay_chk_mng_no))
										)
									)
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1_T1.prnt_flg.eq(bind("not_prnt_flg_str")))
								.cutoff$or(S1_T1.prnt_flg.eq(bind("prnt_flg_str")))
							)
						)
					)
					.orderBy(
						pr("psppl_cd").asc(),
						pr("bsppl_cd").asc(),
						pr("bsppl_dpt_cd").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bsppl_grp_flg1"))
					.select(DS0D, S0_M1.bp_grp_cd1.as("bsppl_grp_cd1"))
					.groupBy(DS0D, S0_M1.bp_grp_cd1),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("bsppl_grp_cd1")))),
				when(boundOr("bsppl_grp_flg1"))
					.select(DS0D, S0_BSPPL_GRP1.bp_grp_nm.as("bsppl_grp_nm1"))
					.groupBy(DS0D, S0_BSPPL_GRP1.bp_grp_nm),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP1).on(S0_M1.bp_grp_cd1.eq(S0_BSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP1.bp_grp_nm.like(bind("bsppl_grp_nm1")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS0D, S0_M1.bp_grp_cd2.as("bsppl_grp_cd2"))
					.groupBy(DS0D, S0_M1.bp_grp_cd2),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("bsppl_grp_cd2")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS0D, S0_BSPPL_GRP2.bp_grp_nm.as("bsppl_grp_nm2"))
					.groupBy(DS0D, S0_BSPPL_GRP2.bp_grp_nm),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP2).on(S0_M1.bp_grp_cd2.eq(S0_BSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP2.bp_grp_nm.like(bind("bsppl_grp_nm2")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS0D, S0_M1.bp_grp_cd3.as("bsppl_grp_cd3"))
					.groupBy(DS0D, S0_M1.bp_grp_cd3),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("bsppl_grp_cd3")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS0D, S0_BSPPL_GRP3.bp_grp_nm.as("bsppl_grp_nm3"))
					.groupBy(DS0D, S0_BSPPL_GRP3.bp_grp_nm),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP3).on(S0_M1.bp_grp_cd3.eq(S0_BSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP3.bp_grp_nm.like(bind("bsppl_grp_nm3")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS0D, S0_M1.bp_grp_cd4.as("bsppl_grp_cd4"))
					.groupBy(DS0D, S0_M1.bp_grp_cd4),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("bsppl_grp_cd4")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS0D, S0_BSPPL_GRP4.bp_grp_nm.as("bsppl_grp_nm4"))
					.groupBy(DS0D, S0_BSPPL_GRP4.bp_grp_nm),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP4).on(S0_M1.bp_grp_cd4.eq(S0_BSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP4.bp_grp_nm.like(bind("bsppl_grp_nm4")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS0D, S0_M1.bp_grp_cd5.as("bsppl_grp_cd5"))
					.groupBy(DS0D, S0_M1.bp_grp_cd5),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("bsppl_grp_cd5")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS0D, S0_BSPPL_GRP5.bp_grp_nm.as("bsppl_grp_nm5"))
					.groupBy(DS0D, S0_BSPPL_GRP5.bp_grp_nm),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP5).on(S0_M1.bp_grp_cd5.eq(S0_BSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP5.bp_grp_nm.like(bind("bsppl_grp_nm5")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS0D, S0_M1.bp_grp_cd6.as("bsppl_grp_cd6"))
					.groupBy(DS0D, S0_M1.bp_grp_cd6),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("bsppl_grp_cd6")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS0D, S0_BSPPL_GRP6.bp_grp_nm.as("bsppl_grp_nm6"))
					.groupBy(DS0D, S0_BSPPL_GRP6.bp_grp_nm),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP6).on(S0_M1.bp_grp_cd6.eq(S0_BSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP6.bp_grp_nm.like(bind("bsppl_grp_nm6")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS0D, S0_M1.bp_grp_cd7.as("bsppl_grp_cd7"))
					.groupBy(DS0D, S0_M1.bp_grp_cd7),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("bsppl_grp_cd7")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS0D, S0_BSPPL_GRP7.bp_grp_nm.as("bsppl_grp_nm7"))
					.groupBy(DS0D, S0_BSPPL_GRP7.bp_grp_nm),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP7).on(S0_M1.bp_grp_cd7.eq(S0_BSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP7.bp_grp_nm.like(bind("bsppl_grp_nm7")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS0D, S0_M1.bp_grp_cd8.as("bsppl_grp_cd8"))
					.groupBy(DS0D, S0_M1.bp_grp_cd8),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("bsppl_grp_cd8")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS0D, S0_BSPPL_GRP8.bp_grp_nm.as("bsppl_grp_nm8"))
					.groupBy(DS0D, S0_BSPPL_GRP8.bp_grp_nm),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP8).on(S0_M1.bp_grp_cd8.eq(S0_BSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP8.bp_grp_nm.like(bind("bsppl_grp_nm8")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS0D, S0_M1.bp_grp_cd9.as("bsppl_grp_cd9"))
					.groupBy(DS0D, S0_M1.bp_grp_cd9),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("bsppl_grp_cd9")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS0D, S0_BSPPL_GRP9.bp_grp_nm.as("bsppl_grp_nm9"))
					.groupBy(DS0D, S0_BSPPL_GRP9.bp_grp_nm),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP9).on(S0_M1.bp_grp_cd9.eq(S0_BSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP9.bp_grp_nm.like(bind("bsppl_grp_nm9")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS0D, S0_M1.bp_grp_cd10.as("bsppl_grp_cd10"))
					.groupBy(DS0D, S0_M1.bp_grp_cd10),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("bsppl_grp_cd10")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS0D, S0_BSPPL_GRP10.bp_grp_nm.as("bsppl_grp_nm10"))
					.groupBy(DS0D, S0_BSPPL_GRP10.bp_grp_nm),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP10).on(S0_M1.bp_grp_cd10.eq(S0_BSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP10.bp_grp_nm.like(bind("bsppl_grp_nm10")))),
				when(boundOr("psppl_cd", "psppl_nm", "psppl_grp_flg1", "psppl_grp_flg2", "psppl_grp_flg3", "psppl_grp_flg4", "psppl_grp_flg5", "psppl_grp_flg6", "psppl_grp_flg7", "psppl_grp_flg8", "psppl_grp_flg9", "psppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M2).on(S0_M1.psppl_cd.eq(S0_M2.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M1.psppl_cd.like(bind("psppl_cd"))).cutoff$and(S0_M2.bp_nm.like(bind("psppl_nm")))),
				when(boundOr("psppl_grp_flg1"))
					.select(DS0D, S0_M2.bp_grp_cd1.as("psppl_grp_cd1"))
					.groupBy(DS0D, S0_M2.bp_grp_cd1),
				when(boundOr("psppl_grp_flg1", "psppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("psppl_grp_cd1")))),
				when(boundOr("psppl_grp_flg1"))
					.select(DS0D, S0_PSPPL_GRP1.bp_grp_nm.as("psppl_grp_nm1"))
					.groupBy(DS0D, S0_PSPPL_GRP1.bp_grp_nm),
				when(boundOr("psppl_grp_flg1", "psppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_PSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP1.bp_grp_nm.like(bind("psppl_grp_nm1")))),
				when(boundOr("psppl_grp_flg2"))
					.select(DS0D, S0_M2.bp_grp_cd2.as("psppl_grp_cd2"))
					.groupBy(DS0D, S0_M2.bp_grp_cd2),
				when(boundOr("psppl_grp_flg2", "psppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("psppl_grp_cd2")))),
				when(boundOr("psppl_grp_flg2"))
					.select(DS0D, S0_PSPPL_GRP2.bp_grp_nm.as("psppl_grp_nm2"))
					.groupBy(DS0D, S0_PSPPL_GRP2.bp_grp_nm),
				when(boundOr("psppl_grp_flg2", "psppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_PSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP2.bp_grp_nm.like(bind("psppl_grp_nm2")))),
				when(boundOr("psppl_grp_flg3"))
					.select(DS0D, S0_M2.bp_grp_cd3.as("psppl_grp_cd3"))
					.groupBy(DS0D, S0_M2.bp_grp_cd3),
				when(boundOr("psppl_grp_flg3", "psppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("psppl_grp_cd3")))),
				when(boundOr("psppl_grp_flg3"))
					.select(DS0D, S0_PSPPL_GRP3.bp_grp_nm.as("psppl_grp_nm3"))
					.groupBy(DS0D, S0_PSPPL_GRP3.bp_grp_nm),
				when(boundOr("psppl_grp_flg3", "psppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_PSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP3.bp_grp_nm.like(bind("psppl_grp_nm3")))),
				when(boundOr("psppl_grp_flg4"))
					.select(DS0D, S0_M2.bp_grp_cd4.as("psppl_grp_cd4"))
					.groupBy(DS0D, S0_M2.bp_grp_cd4),
				when(boundOr("psppl_grp_flg4", "psppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("psppl_grp_cd4")))),
				when(boundOr("psppl_grp_flg4"))
					.select(DS0D, S0_PSPPL_GRP4.bp_grp_nm.as("psppl_grp_nm4"))
					.groupBy(DS0D, S0_PSPPL_GRP4.bp_grp_nm),
				when(boundOr("psppl_grp_flg4", "psppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_PSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP4.bp_grp_nm.like(bind("psppl_grp_nm4")))),
				when(boundOr("psppl_grp_flg5"))
					.select(DS0D, S0_M2.bp_grp_cd5.as("psppl_grp_cd5"))
					.groupBy(DS0D, S0_M2.bp_grp_cd5),
				when(boundOr("psppl_grp_flg5", "psppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("psppl_grp_cd5")))),
				when(boundOr("psppl_grp_flg5"))
					.select(DS0D, S0_PSPPL_GRP5.bp_grp_nm.as("psppl_grp_nm5"))
					.groupBy(DS0D, S0_PSPPL_GRP5.bp_grp_nm),
				when(boundOr("psppl_grp_flg5", "psppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_PSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP5.bp_grp_nm.like(bind("psppl_grp_nm5")))),
				when(boundOr("psppl_grp_flg6"))
					.select(DS0D, S0_M2.bp_grp_cd6.as("psppl_grp_cd6"))
					.groupBy(DS0D, S0_M2.bp_grp_cd6),
				when(boundOr("psppl_grp_flg6", "psppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("psppl_grp_cd6")))),
				when(boundOr("psppl_grp_flg6"))
					.select(DS0D, S0_PSPPL_GRP6.bp_grp_nm.as("psppl_grp_nm6"))
					.groupBy(DS0D, S0_PSPPL_GRP6.bp_grp_nm),
				when(boundOr("psppl_grp_flg6", "psppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_PSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP6.bp_grp_nm.like(bind("psppl_grp_nm6")))),
				when(boundOr("psppl_grp_flg7"))
					.select(DS0D, S0_M2.bp_grp_cd7.as("psppl_grp_cd7"))
					.groupBy(DS0D, S0_M2.bp_grp_cd7),
				when(boundOr("psppl_grp_flg7", "psppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("psppl_grp_cd7")))),
				when(boundOr("psppl_grp_flg7"))
					.select(DS0D, S0_PSPPL_GRP7.bp_grp_nm.as("psppl_grp_nm7"))
					.groupBy(DS0D, S0_PSPPL_GRP7.bp_grp_nm),
				when(boundOr("psppl_grp_flg7", "psppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_PSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP7.bp_grp_nm.like(bind("psppl_grp_nm7")))),
				when(boundOr("psppl_grp_flg8"))
					.select(DS0D, S0_M2.bp_grp_cd8.as("psppl_grp_cd8"))
					.groupBy(DS0D, S0_M2.bp_grp_cd8),
				when(boundOr("psppl_grp_flg8", "psppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("psppl_grp_cd8")))),
				when(boundOr("psppl_grp_flg8"))
					.select(DS0D, S0_PSPPL_GRP8.bp_grp_nm.as("psppl_grp_nm8"))
					.groupBy(DS0D, S0_PSPPL_GRP8.bp_grp_nm),
				when(boundOr("psppl_grp_flg8", "psppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_PSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP8.bp_grp_nm.like(bind("psppl_grp_nm8")))),
				when(boundOr("psppl_grp_flg9"))
					.select(DS0D, S0_M2.bp_grp_cd9.as("psppl_grp_cd9"))
					.groupBy(DS0D, S0_M2.bp_grp_cd9),
				when(boundOr("psppl_grp_flg9", "psppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("psppl_grp_cd9")))),
				when(boundOr("psppl_grp_flg9"))
					.select(DS0D, S0_PSPPL_GRP9.bp_grp_nm.as("psppl_grp_nm9"))
					.groupBy(DS0D, S0_PSPPL_GRP9.bp_grp_nm),
				when(boundOr("psppl_grp_flg9", "psppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_PSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP9.bp_grp_nm.like(bind("psppl_grp_nm9")))),
				when(boundOr("psppl_grp_flg10"))
					.select(DS0D, S0_M2.bp_grp_cd10.as("psppl_grp_cd10"))
					.groupBy(DS0D, S0_M2.bp_grp_cd10),
				when(boundOr("psppl_grp_flg10", "psppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("psppl_grp_cd10")))),
				when(boundOr("psppl_grp_flg10"))
					.select(DS0D, S0_PSPPL_GRP10.bp_grp_nm.as("psppl_grp_nm10"))
					.groupBy(DS0D, S0_PSPPL_GRP10.bp_grp_nm),
				when(boundOr("psppl_grp_flg10", "psppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_PSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP10.bp_grp_nm.like(bind("psppl_grp_nm10")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M4).on(S0_M3.wg_cd.eq(S0_M4.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_T2).on(S0_T1.wrk_no.eq(S0_T2.wrk_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M5).on(S0_T1.trd_cur_cd.eq(S0_M5.cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M5.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("bsppl_grp_flg1"))
					.select(DS1D, S1_M1.bp_grp_cd1.as("bsppl_grp_cd1"))
					.groupBy(DS1D, S1_M1.bp_grp_cd1),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_cd1"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd1.like(bind("bsppl_grp_cd1")))),
				when(boundOr("bsppl_grp_flg1"))
					.select(DS1D, S1_BSPPL_GRP1.bp_grp_nm.as("bsppl_grp_nm1"))
					.groupBy(DS1D, S1_BSPPL_GRP1.bp_grp_nm),
				when(boundOr("bsppl_grp_flg1", "bsppl_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP1).on(S1_M1.bp_grp_cd1.eq(S1_BSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BSPPL_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP1.bp_grp_nm.like(bind("bsppl_grp_nm1")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS1D, S1_M1.bp_grp_cd2.as("bsppl_grp_cd2"))
					.groupBy(DS1D, S1_M1.bp_grp_cd2),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_cd2"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd2.like(bind("bsppl_grp_cd2")))),
				when(boundOr("bsppl_grp_flg2"))
					.select(DS1D, S1_BSPPL_GRP2.bp_grp_nm.as("bsppl_grp_nm2"))
					.groupBy(DS1D, S1_BSPPL_GRP2.bp_grp_nm),
				when(boundOr("bsppl_grp_flg2", "bsppl_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP2).on(S1_M1.bp_grp_cd2.eq(S1_BSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BSPPL_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP2.bp_grp_nm.like(bind("bsppl_grp_nm2")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS1D, S1_M1.bp_grp_cd3.as("bsppl_grp_cd3"))
					.groupBy(DS1D, S1_M1.bp_grp_cd3),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_cd3"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd3.like(bind("bsppl_grp_cd3")))),
				when(boundOr("bsppl_grp_flg3"))
					.select(DS1D, S1_BSPPL_GRP3.bp_grp_nm.as("bsppl_grp_nm3"))
					.groupBy(DS1D, S1_BSPPL_GRP3.bp_grp_nm),
				when(boundOr("bsppl_grp_flg3", "bsppl_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP3).on(S1_M1.bp_grp_cd3.eq(S1_BSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BSPPL_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP3.bp_grp_nm.like(bind("bsppl_grp_nm3")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS1D, S1_M1.bp_grp_cd4.as("bsppl_grp_cd4"))
					.groupBy(DS1D, S1_M1.bp_grp_cd4),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_cd4"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd4.like(bind("bsppl_grp_cd4")))),
				when(boundOr("bsppl_grp_flg4"))
					.select(DS1D, S1_BSPPL_GRP4.bp_grp_nm.as("bsppl_grp_nm4"))
					.groupBy(DS1D, S1_BSPPL_GRP4.bp_grp_nm),
				when(boundOr("bsppl_grp_flg4", "bsppl_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP4).on(S1_M1.bp_grp_cd4.eq(S1_BSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BSPPL_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP4.bp_grp_nm.like(bind("bsppl_grp_nm4")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS1D, S1_M1.bp_grp_cd5.as("bsppl_grp_cd5"))
					.groupBy(DS1D, S1_M1.bp_grp_cd5),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_cd5"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd5.like(bind("bsppl_grp_cd5")))),
				when(boundOr("bsppl_grp_flg5"))
					.select(DS1D, S1_BSPPL_GRP5.bp_grp_nm.as("bsppl_grp_nm5"))
					.groupBy(DS1D, S1_BSPPL_GRP5.bp_grp_nm),
				when(boundOr("bsppl_grp_flg5", "bsppl_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP5).on(S1_M1.bp_grp_cd5.eq(S1_BSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BSPPL_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP5.bp_grp_nm.like(bind("bsppl_grp_nm5")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS1D, S1_M1.bp_grp_cd6.as("bsppl_grp_cd6"))
					.groupBy(DS1D, S1_M1.bp_grp_cd6),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_cd6"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd6.like(bind("bsppl_grp_cd6")))),
				when(boundOr("bsppl_grp_flg6"))
					.select(DS1D, S1_BSPPL_GRP6.bp_grp_nm.as("bsppl_grp_nm6"))
					.groupBy(DS1D, S1_BSPPL_GRP6.bp_grp_nm),
				when(boundOr("bsppl_grp_flg6", "bsppl_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP6).on(S1_M1.bp_grp_cd6.eq(S1_BSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BSPPL_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP6.bp_grp_nm.like(bind("bsppl_grp_nm6")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS1D, S1_M1.bp_grp_cd7.as("bsppl_grp_cd7"))
					.groupBy(DS1D, S1_M1.bp_grp_cd7),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_cd7"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd7.like(bind("bsppl_grp_cd7")))),
				when(boundOr("bsppl_grp_flg7"))
					.select(DS1D, S1_BSPPL_GRP7.bp_grp_nm.as("bsppl_grp_nm7"))
					.groupBy(DS1D, S1_BSPPL_GRP7.bp_grp_nm),
				when(boundOr("bsppl_grp_flg7", "bsppl_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP7).on(S1_M1.bp_grp_cd7.eq(S1_BSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BSPPL_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP7.bp_grp_nm.like(bind("bsppl_grp_nm7")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS1D, S1_M1.bp_grp_cd8.as("bsppl_grp_cd8"))
					.groupBy(DS1D, S1_M1.bp_grp_cd8),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_cd8"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd8.like(bind("bsppl_grp_cd8")))),
				when(boundOr("bsppl_grp_flg8"))
					.select(DS1D, S1_BSPPL_GRP8.bp_grp_nm.as("bsppl_grp_nm8"))
					.groupBy(DS1D, S1_BSPPL_GRP8.bp_grp_nm),
				when(boundOr("bsppl_grp_flg8", "bsppl_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP8).on(S1_M1.bp_grp_cd8.eq(S1_BSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BSPPL_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP8.bp_grp_nm.like(bind("bsppl_grp_nm8")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS1D, S1_M1.bp_grp_cd9.as("bsppl_grp_cd9"))
					.groupBy(DS1D, S1_M1.bp_grp_cd9),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_cd9"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd9.like(bind("bsppl_grp_cd9")))),
				when(boundOr("bsppl_grp_flg9"))
					.select(DS1D, S1_BSPPL_GRP9.bp_grp_nm.as("bsppl_grp_nm9"))
					.groupBy(DS1D, S1_BSPPL_GRP9.bp_grp_nm),
				when(boundOr("bsppl_grp_flg9", "bsppl_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP9).on(S1_M1.bp_grp_cd9.eq(S1_BSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BSPPL_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP9.bp_grp_nm.like(bind("bsppl_grp_nm9")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS1D, S1_M1.bp_grp_cd10.as("bsppl_grp_cd10"))
					.groupBy(DS1D, S1_M1.bp_grp_cd10),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_cd10"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.bp_grp_cd10.like(bind("bsppl_grp_cd10")))),
				when(boundOr("bsppl_grp_flg10"))
					.select(DS1D, S1_BSPPL_GRP10.bp_grp_nm.as("bsppl_grp_nm10"))
					.groupBy(DS1D, S1_BSPPL_GRP10.bp_grp_nm),
				when(boundOr("bsppl_grp_flg10", "bsppl_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BSPPL_GRP10).on(S1_M1.bp_grp_cd10.eq(S1_BSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BSPPL_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BSPPL_GRP10.bp_grp_nm.like(bind("bsppl_grp_nm10")))),
				when(boundOr("psppl_cd", "psppl_nm", "psppl_grp_flg1", "psppl_grp_flg2", "psppl_grp_flg3", "psppl_grp_flg4", "psppl_grp_flg5", "psppl_grp_flg6", "psppl_grp_flg7", "psppl_grp_flg8", "psppl_grp_flg9", "psppl_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_M2).on(S1_M1.psppl_cd.eq(S1_M2.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_M1.psppl_cd.like(bind("psppl_cd"))).cutoff$and(S1_M2.bp_nm.like(bind("psppl_nm")))),
				when(boundOr("psppl_grp_flg1"))
					.select(DS1D, S1_M2.bp_grp_cd1.as("psppl_grp_cd1"))
					.groupBy(DS1D, S1_M2.bp_grp_cd1),
				when(boundOr("psppl_grp_flg1", "psppl_grp_cd1"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd1.like(bind("psppl_grp_cd1")))),
				when(boundOr("psppl_grp_flg1"))
					.select(DS1D, S1_PSPPL_GRP1.bp_grp_nm.as("psppl_grp_nm1"))
					.groupBy(DS1D, S1_PSPPL_GRP1.bp_grp_nm),
				when(boundOr("psppl_grp_flg1", "psppl_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP1).on(S1_M2.bp_grp_cd1.eq(S1_PSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_PSPPL_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP1.bp_grp_nm.like(bind("psppl_grp_nm1")))),
				when(boundOr("psppl_grp_flg2"))
					.select(DS1D, S1_M2.bp_grp_cd2.as("psppl_grp_cd2"))
					.groupBy(DS1D, S1_M2.bp_grp_cd2),
				when(boundOr("psppl_grp_flg2", "psppl_grp_cd2"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd2.like(bind("psppl_grp_cd2")))),
				when(boundOr("psppl_grp_flg2"))
					.select(DS1D, S1_PSPPL_GRP2.bp_grp_nm.as("psppl_grp_nm2"))
					.groupBy(DS1D, S1_PSPPL_GRP2.bp_grp_nm),
				when(boundOr("psppl_grp_flg2", "psppl_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP2).on(S1_M2.bp_grp_cd2.eq(S1_PSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_PSPPL_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP2.bp_grp_nm.like(bind("psppl_grp_nm2")))),
				when(boundOr("psppl_grp_flg3"))
					.select(DS1D, S1_M2.bp_grp_cd3.as("psppl_grp_cd3"))
					.groupBy(DS1D, S1_M2.bp_grp_cd3),
				when(boundOr("psppl_grp_flg3", "psppl_grp_cd3"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd3.like(bind("psppl_grp_cd3")))),
				when(boundOr("psppl_grp_flg3"))
					.select(DS1D, S1_PSPPL_GRP3.bp_grp_nm.as("psppl_grp_nm3"))
					.groupBy(DS1D, S1_PSPPL_GRP3.bp_grp_nm),
				when(boundOr("psppl_grp_flg3", "psppl_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP3).on(S1_M2.bp_grp_cd3.eq(S1_PSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_PSPPL_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP3.bp_grp_nm.like(bind("psppl_grp_nm3")))),
				when(boundOr("psppl_grp_flg4"))
					.select(DS1D, S1_M2.bp_grp_cd4.as("psppl_grp_cd4"))
					.groupBy(DS1D, S1_M2.bp_grp_cd4),
				when(boundOr("psppl_grp_flg4", "psppl_grp_cd4"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd4.like(bind("psppl_grp_cd4")))),
				when(boundOr("psppl_grp_flg4"))
					.select(DS1D, S1_PSPPL_GRP4.bp_grp_nm.as("psppl_grp_nm4"))
					.groupBy(DS1D, S1_PSPPL_GRP4.bp_grp_nm),
				when(boundOr("psppl_grp_flg4", "psppl_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP4).on(S1_M2.bp_grp_cd4.eq(S1_PSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_PSPPL_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP4.bp_grp_nm.like(bind("psppl_grp_nm4")))),
				when(boundOr("psppl_grp_flg5"))
					.select(DS1D, S1_M2.bp_grp_cd5.as("psppl_grp_cd5"))
					.groupBy(DS1D, S1_M2.bp_grp_cd5),
				when(boundOr("psppl_grp_flg5", "psppl_grp_cd5"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd5.like(bind("psppl_grp_cd5")))),
				when(boundOr("psppl_grp_flg5"))
					.select(DS1D, S1_PSPPL_GRP5.bp_grp_nm.as("psppl_grp_nm5"))
					.groupBy(DS1D, S1_PSPPL_GRP5.bp_grp_nm),
				when(boundOr("psppl_grp_flg5", "psppl_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP5).on(S1_M2.bp_grp_cd5.eq(S1_PSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_PSPPL_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP5.bp_grp_nm.like(bind("psppl_grp_nm5")))),
				when(boundOr("psppl_grp_flg6"))
					.select(DS1D, S1_M2.bp_grp_cd6.as("psppl_grp_cd6"))
					.groupBy(DS1D, S1_M2.bp_grp_cd6),
				when(boundOr("psppl_grp_flg6", "psppl_grp_cd6"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd6.like(bind("psppl_grp_cd6")))),
				when(boundOr("psppl_grp_flg6"))
					.select(DS1D, S1_PSPPL_GRP6.bp_grp_nm.as("psppl_grp_nm6"))
					.groupBy(DS1D, S1_PSPPL_GRP6.bp_grp_nm),
				when(boundOr("psppl_grp_flg6", "psppl_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP6).on(S1_M2.bp_grp_cd6.eq(S1_PSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_PSPPL_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP6.bp_grp_nm.like(bind("psppl_grp_nm6")))),
				when(boundOr("psppl_grp_flg7"))
					.select(DS1D, S1_M2.bp_grp_cd7.as("psppl_grp_cd7"))
					.groupBy(DS1D, S1_M2.bp_grp_cd7),
				when(boundOr("psppl_grp_flg7", "psppl_grp_cd7"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd7.like(bind("psppl_grp_cd7")))),
				when(boundOr("psppl_grp_flg7"))
					.select(DS1D, S1_PSPPL_GRP7.bp_grp_nm.as("psppl_grp_nm7"))
					.groupBy(DS1D, S1_PSPPL_GRP7.bp_grp_nm),
				when(boundOr("psppl_grp_flg7", "psppl_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP7).on(S1_M2.bp_grp_cd7.eq(S1_PSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_PSPPL_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP7.bp_grp_nm.like(bind("psppl_grp_nm7")))),
				when(boundOr("psppl_grp_flg8"))
					.select(DS1D, S1_M2.bp_grp_cd8.as("psppl_grp_cd8"))
					.groupBy(DS1D, S1_M2.bp_grp_cd8),
				when(boundOr("psppl_grp_flg8", "psppl_grp_cd8"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd8.like(bind("psppl_grp_cd8")))),
				when(boundOr("psppl_grp_flg8"))
					.select(DS1D, S1_PSPPL_GRP8.bp_grp_nm.as("psppl_grp_nm8"))
					.groupBy(DS1D, S1_PSPPL_GRP8.bp_grp_nm),
				when(boundOr("psppl_grp_flg8", "psppl_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP8).on(S1_M2.bp_grp_cd8.eq(S1_PSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_PSPPL_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP8.bp_grp_nm.like(bind("psppl_grp_nm8")))),
				when(boundOr("psppl_grp_flg9"))
					.select(DS1D, S1_M2.bp_grp_cd9.as("psppl_grp_cd9"))
					.groupBy(DS1D, S1_M2.bp_grp_cd9),
				when(boundOr("psppl_grp_flg9", "psppl_grp_cd9"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd9.like(bind("psppl_grp_cd9")))),
				when(boundOr("psppl_grp_flg9"))
					.select(DS1D, S1_PSPPL_GRP9.bp_grp_nm.as("psppl_grp_nm9"))
					.groupBy(DS1D, S1_PSPPL_GRP9.bp_grp_nm),
				when(boundOr("psppl_grp_flg9", "psppl_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP9).on(S1_M2.bp_grp_cd9.eq(S1_PSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_PSPPL_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP9.bp_grp_nm.like(bind("psppl_grp_nm9")))),
				when(boundOr("psppl_grp_flg10"))
					.select(DS1D, S1_M2.bp_grp_cd10.as("psppl_grp_cd10"))
					.groupBy(DS1D, S1_M2.bp_grp_cd10),
				when(boundOr("psppl_grp_flg10", "psppl_grp_cd10"))
					.predicate(DS1D, p -> p.cutoff$and(S1_M2.bp_grp_cd10.like(bind("psppl_grp_cd10")))),
				when(boundOr("psppl_grp_flg10"))
					.select(DS1D, S1_PSPPL_GRP10.bp_grp_nm.as("psppl_grp_nm10"))
					.groupBy(DS1D, S1_PSPPL_GRP10.bp_grp_nm),
				when(boundOr("psppl_grp_flg10", "psppl_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PSPPL_GRP10).on(S1_M2.bp_grp_cd10.eq(S1_PSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_PSPPL_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PSPPL_GRP10.bp_grp_nm.like(bind("psppl_grp_nm10")))),
				when(boundOr("wg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_M4).on(S1_M3.wg_cd.eq(S1_M4.wg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("wrk_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_T2).on(S1_T1.wrk_no.eq(S1_T2.wrk_no)))
					.predicate(DS1D, p -> p.cutoff$and(S1_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_M5).on(S1_T1.trd_cur_cd.eq(S1_M5.cur_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_M5.cur_nm.like(bind("trd_cur_nm"))))
			);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBHL0020_Srch01_RsltR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.psppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.bsppl_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.bsppl_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MST_WRK_R.class, r -> toCondition(
					r.wrk_no()
				))
				.addSelect(m -> toArray(
					m.wrk_nm
				))
				.addMap((r, m) -> {
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
				})
		);
	}
}