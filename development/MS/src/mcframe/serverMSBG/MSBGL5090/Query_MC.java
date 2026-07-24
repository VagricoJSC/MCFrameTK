package mcframe.serverMSBG.MSBGL5090;

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
	 * -- MSBGL5090_MST_AR_XRATE_REV_HIS_Query_S01
	 */
	static MCQueryPlan MSBGL5090_MST_AR_XRATE_REV_HIS_S01() {
		MST_AR_XRATE_REV_HIS_R S0_T1 = MST_AR_XRATE_REV_HIS_R.create("T1");
		MST_AR_EXC_GAIN_LOSS_R S0_T2 = MST_AR_EXC_GAIN_LOSS_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5090_MST_AR_XRATE_REV_HIS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ar_xrate_rev_his_no,
						S0_T1.ac_ym,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_T1.trd_cur_cd,
						S0_T1.iv_no,
						S0_T1.wrk_no,
						S0_T1.ar_typ,
						S0_T1.xrate_cd,
						S0_T1.new_xrate.as("xrate"),
						S0_T1.base_cur_cd,
						S0_T1.ac_dt,
						S0_T2.exc_gain_loss
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ar_xrate_rev_his_no.eq(S0_T2.ar_xrate_rev_his_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ar_xrate_rev_his_no.eq(bind("ar_xrate_rev_his_no")))
					)
			);
	}
	
	/**
	 * -- MSBGL5090_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL5090_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		MST_AR_EXC_GAIN_LOSS_R S0_T3 = MST_AR_EXC_GAIN_LOSS_R.create("T3");
		MST_RCV_R S0_T4 = MST_RCV_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_STTL_R S0_M2 = MAM_STTL_R.create("M2");
		MAM_STTL_R S0_M3 = MAM_STTL_R.create("M3");
		MAM_STTL_R S0_M4 = MAM_STTL_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5090_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T2.rcv_act_no,
						S0_T2.rcv_act_seq,
						S0_T2.rcv_act_rev,
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T2.trd_ptn_typ,
						S0_T2.trd_ac_rsn_cd,
						nvl(
							S0_T4.div_src_rcv_no,
							S0_T2.rcv_no
						).as("rcv_no"),
						S0_T2.dpt_cd,
						S0_T2.usr_cd,
						S0_T2.rcst_cd,
						S0_T2.bcst_cd,
						S0_T2.ac_dt,
						S0_T2.ac_ym,
						S0_T2.trd_cur_cd,
						S0_T2.base_cur_cd,
						S0_T2.xrate_cd,
						S0_T2.xrate,
						S0_T2.ar_sttl_ac_rsn_cd1,
						S0_T2.tax_cd1,
						S0_T2.bank_ac_cd,
						S0_T2.xfr_psn,
						S0_T2.note_no,
						S0_T2.bd_dpt_cd,
						S0_T2.debt_cred_id_typ,
						S0_T2.debt_cred_id_cd,
						S0_T2.debt_cred_nm,
						S0_T2.ar_sttl_cd2,
						S0_T2.ar_sttl_ac_rsn_cd2,
						S0_T2.ar_sttl_ac_rsn_cd3,
						S0_T2.tax_cd2,
						S0_T2.trd_rmrks,
						S0_T2.slip_sts_typ,
						S0_T2.par_rcv_act_no,
						S0_T2.par_rcv_act_seq,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_T1.iv_no,
						S0_T1.wrk_no,
						S0_T1.ar_typ,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_tax_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.trd_cur_tax_amt2,
						S0_T1.trd_cur_amt3,
						S0_T1.trd_cur_tax_amt3,
						S0_T1.base_cur_amt1,
						S0_T1.base_cur_tax_amt1,
						S0_T1.base_cur_amt2,
						S0_T1.base_cur_tax_amt2,
						S0_T1.base_cur_amt3,
						S0_T1.base_cur_tax_amt3,
						S0_T3.ref_ar_xrate_rev_his_no,
						nvl(
							S0_T3.exc_gain_loss,
							value(0)
						).as("dtl_exc_gain_loss")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.rcv_act_d_no.eq(S0_T3.rcv_act_d_no)
								.and(S0_T1.rcv_act_d_seq.eq(S0_T3.rcv_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.rcv_no.eq(S0_T4.rcv_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.trd_cd.eq(S0_M1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								nvl(
									S0_T1.ar_sttl_cd1,
									S0_T2.ar_sttl_cd1
								).eq(S0_M2.sttl_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.ar_sttl_cd2.eq(S0_M3.sttl_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.ar_sttl_cd3.eq(S0_M4.sttl_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						.and(S0_T1.rcv_act_d_seq.eq(bind("rcv_act_d_seq")))
					)
			);
	}
	
	/**
	 * -- MSBGL5090_MST_RCV_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBGL5090_MST_RCV_ACT_D_S02() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5090_MST_RCV_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_T1.bcst_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.rcv_act_no.eq(bind("par_rcv_act_no")))
						.and(S0_T2.rcv_act_seq.eq(bind("par_rcv_act_seq")))
					)
			);
	}
	
	/**
	 * -- MSBGL5090_MST_RCV_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL5090_MST_RCV_ACT_S01() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R S0_T2 = MST_RCV_ACT_D_R.create("T2");
		MST_RCV_R S0_T3 = MST_RCV_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5090_MST_RCV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.rcv_no,
						S0_T1.trd_ptn_typ,
						nvl(
							S0_T3.div_src_rcv_no,
							S0_T1.rcv_no
						).as("rcv_no")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.rcv_no.eq(S0_T3.rcv_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.gen_rcv_no.eq(bind("rcv_no")))
					)
			);
	}
	
}