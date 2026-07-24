package mcframe.serverMSBH.MSBHL5070;

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
	 * -- MSBHL5070_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL5070_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R S0_T1 = MST_ADV_PAY_ACT_R.create("T1");
		MST_PAY_NOTE_R S0_T2 = MST_PAY_NOTE_R.create("T2");
		MSW_ADV_PAY_ACT_KEY_R S0_W1 = MSW_ADV_PAY_ACT_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5070_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wg_cd,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.adv_pay_act_no.as("pay_act_no"),
						S0_T1.adv_pay_act_seq.as("pay_act_seq"),
						S0_T1.adv_pay_act_rev.as("pay_act_rev"),
						nullValue().as("pay_act_d_no"),
						nullValue().as("pay_act_d_seq"),
						S0_T1.ac_rsn_cd,
						S0_T1.bd_dpt_cd.as("ap_dpt_cd"),
						S0_T1.pay_dpt_cd,
						S0_T1.bsppl_dpt_cd,
						nullValue().as("so_dpt_cd"),
						S0_T1.psppl_cd,
						S0_T1.bsppl_cd,
						nullValue().as("asppl_cd"),
						nullValue().as("setoff_cd"),
						nullValue().as("setoff_nm"),
						S0_T1.base_cur_cd,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_com_paid_tax_amt.as("base_cur_tax_amt"),
						S0_T1.base_cur_exc_com_paid,
						S0_T1.base_cur_com_paid,
						S0_T1.trd_cur_cd,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid_tax_amt.as("trd_cur_tax_amt"),
						S0_T1.trd_cur_exc_com_paid,
						S0_T1.trd_cur_com_paid,
						S0_T1.trd_cur_com_paid_tax_cd.as("tax_cd"),
						S0_T1.xrate_cd,
						S0_T1.xrate,
						nullValue().as("rcv_bill_no"),
						nullValue().as("pay_chk_no"),
						S0_T1.pay_usr_cd.as("usr_cd"),
						nullValue().as("iv_no"),
						nullValue().as("wrk_no"),
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T2.note_no,
						S0_T1.trd_rmrks,
						nullValue().as("trd_d_rmrks"),
						value(0).as("exc_gain_loss"),
						S0_T1.slip_sts_typ,
						nullValue().as("ap_typ"),
						nullValue().as("exc_gain_loss_ap_typ"),
						S0_T1.ap_sttl_typ,
						S0_T1.ap_sttl_cd,
						S0_T1.com_paid_ap_sttl_typ,
						S0_T1.com_paid_ap_sttl_cd,
						S0_T1.com_paid_ac_rsn_cd
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.adv_pay_act_no.eq(S0_T2.adv_pay_act_no)
								.and(S0_T1.adv_pay_act_seq.eq(S0_T2.adv_pay_act_seq))
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.adv_pay_act_no.eq(S0_T1.adv_pay_act_no)
								.and(S0_W1.adv_pay_act_seq.eq(S0_T1.adv_pay_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBHL5070_MST_AP_XRATE_REV_HIS_Query_S01
	 */
	static MCQueryPlan MSBHL5070_MST_AP_XRATE_REV_HIS_S01() {
		MSW_AP_XRATE_REV_HIS_KEY_R S0_W1 = MSW_AP_XRATE_REV_HIS_KEY_R.create("W1");
		MST_AP_XRATE_REV_HIS_R S0_T1 = MST_AP_XRATE_REV_HIS_R.create("T1");
		MST_AP_EXC_GAIN_LOSS_R S0_T2 = MST_AP_EXC_GAIN_LOSS_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5070_MST_AP_XRATE_REV_HIS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_xrate_rev_his_no,
						S0_M1.wg_cd,
						S0_T1.ac_ym,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.trd_cur_cd,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.wrk_no,
						S0_T1.ap_typ,
						S0_T1.xrate_cd,
						S0_T1.new_xrate.as("xrate"),
						S0_T1.base_cur_cd,
						S0_T1.ac_dt,
						S0_T2.exc_gain_loss
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.ap_xrate_rev_his_no.eq(S0_W1.ap_xrate_rev_his_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ap_xrate_rev_his_no.eq(S0_T2.ap_xrate_rev_his_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.ap_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBHL5070_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL5070_MST_PAY_ACT_D_S01() {
		MST_PAY_ACT_D_R S0_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_PAY_ACT_R S0_T2 = MST_PAY_ACT_R.create("T2");
		MST_PAY_SCHD_R S0_T3 = MST_PAY_SCHD_R.create("T3");
		MST_PAY_NOTE_R S0_T4 = MST_PAY_NOTE_R.create("T4");
		MST_AP_EXC_GAIN_LOSS_R S0_T5 = MST_AP_EXC_GAIN_LOSS_R.create("T5");
		MSW_PAY_ACT_D_KEY_R S0_W1 = MSW_PAY_ACT_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5070_MST_PAY_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.wg_cd,
						S0_T2.ac_ym,
						S0_T2.ac_dt,
						S0_T2.pay_act_no,
						S0_T2.pay_act_seq,
						S0_T2.pay_act_rev,
						S0_T1.pay_act_d_no,
						S0_T1.pay_act_d_seq,
						S0_T1.ac_rsn_cd,
						S0_T1.ap_dpt_cd,
						S0_T2.pay_dpt_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T2.so_dpt_cd,
						S0_T2.psppl_cd,
						S0_T1.bsppl_cd,
						S0_T1.asppl_cd,
						S0_T1.setoff_cd,
						S0_T1.setoff_nm,
						S0_T2.base_cur_cd,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_com_paid_tax_amt.as("base_cur_tax_amt"),
						S0_T1.trd_cur_exc_com_paid,
						S0_T2.trd_cur_cd,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid_tax_amt.as("trd_cur_tax_amt"),
						S0_T1.base_cur_exc_com_paid,
						S0_T1.trd_cur_com_paid_tax_cd.as("tax_cd"),
						S0_T2.xrate_cd,
						S0_T2.xrate,
						S0_T3.rcv_bill_no,
						S0_T1.pay_chk_no,
						S0_T2.pay_usr_cd.as("usr_cd"),
						S0_T1.rcpt_iv_no.as("iv_no"),
						S0_T1.wrk_no,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T4.note_no,
						S0_T2.trd_rmrks,
						S0_T1.trd_d_rmrks,
						nvl(
							S0_T5.exc_gain_loss,
							value(0)
						).as("exc_gain_loss"),
						S0_T5.ref_ap_xrate_rev_his_no,
						S0_T2.slip_sts_typ,
						S0_T1.ap_typ,
						S0_T1.ap_sttl_typ,
						S0_T1.ap_sttl_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.pay_act_no.eq(S0_T2.pay_act_no)
								.and(S0_T1.pay_act_seq.eq(S0_T2.pay_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.pay_schd_no.eq(S0_T3.pay_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.pay_act_no.eq(S0_T4.pay_act_no)
								.and(S0_T1.pay_act_seq.eq(S0_T4.pay_act_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.pay_act_d_no.eq(S0_T5.pay_act_d_no)
								.and(S0_T1.pay_act_d_seq.eq(S0_T5.pay_act_d_seq))
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.pay_act_d_no.eq(S0_T1.pay_act_d_no)
								.and(S0_W1.pay_act_d_seq.eq(S0_T1.pay_act_d_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
							S0_T2.pay_act_no.asc(),
							S0_T2.pay_act_seq.asc(),
							S0_T2.pay_act_rev.asc(),
							S0_T1.pay_act_d_no.asc(),
							S0_T1.pay_act_d_seq.asc(),
							S0_T5.ap_xrate_rev_his_no.asc(),
							S0_T5.ref_ap_xrate_rev_his_no.asc()
						)
			);
	}
	
	/**
	 * -- MSBHL5070_MST_PAY_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBHL5070_MST_PAY_ACT_D_S02() {
		MSW_PAY_ACT_D_KEY_R S0_W1 = MSW_PAY_ACT_D_KEY_R.create("W1");
		MST_PAY_ACT_D_R S0_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_PAY_ACT_D_R S0_T2 = MST_PAY_ACT_D_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5070_MST_PAY_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pay_act_d_no,
						S0_T1.pay_act_d_seq,
						S0_T2.ap_dpt_cd.as("so_dpt_cd"),
						S0_T2.asppl_cd.as("setoff_cd"),
						S0_M1.bp_nm.as("setoff_nm")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.pay_act_d_no.eq(S0_W1.pay_act_d_no)
								.and(S0_T1.pay_act_d_seq.eq(S0_W1.pay_act_d_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.par_pay_act_d_no.eq(S0_T1.pay_act_d_no)
								.and(S0_T2.par_pay_act_d_seq.eq(S0_T1.pay_act_d_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T2.asppl_cd)
							)
						)
					)
					.where(
						S0_T1.ap_sttl_typ.in(
							value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value())
						)
					)
			);
	}
}