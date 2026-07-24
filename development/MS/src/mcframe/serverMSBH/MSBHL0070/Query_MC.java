package mcframe.serverMSBH.MSBHL0070;

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
	 * -- MSBHL0070_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL0070_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R S0_T1 = MST_ADV_PAY_ACT_R.create("T1");
		MST_PAY_NOTE_R S0_T2 = MST_PAY_NOTE_R.create("T2");
		MAVM_RD_DPT_R S0_M1 = MAVM_RD_DPT_R.create("M1");
		MAVM_RD_DPT_R S0_M2 = MAVM_RD_DPT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0070_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.adv_pay_act_no,
						S0_T1.adv_pay_act_seq,
						S0_T1.adv_pay_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.psppl_cd,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.pay_dpt_cd,
						S0_T1.wg_cd,
						S0_T1.pay_usr_cd,
						S0_T1.pay_act_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.com_paid_ap_sttl_cd,
						S0_T1.com_paid_ap_sttl_typ,
						S0_T1.trd_cur_com_paid_tax_cd,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid,
						S0_T1.trd_cur_com_paid_tax_amt,
						S0_T1.trd_cur_exc_com_paid,
						S0_T1.trd_cur_setoff_tgt_amt,
						S0_T1.trd_cur_setoff_schd_amt,
						S0_T1.trd_cur_setoff_act_amt,
						S0_T1.trd_cur_not_proc_bal,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_com_paid,
						S0_T1.base_cur_com_paid_tax_amt,
						S0_T1.base_cur_exc_com_paid,
						S0_T1.base_cur_setoff_tgt_amt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("adv_pay_upd_cntr"),
						S0_T2.note_no,
						S0_T2.note_typ,
						S0_T2.draw_dt,
						S0_T2.note_days,
						S0_T2.due_dt,
						S0_T2.drawer_nm,
						S0_T2.endrsr,
						S0_T2.accptr,
						S0_T2.draw_bank_cd,
						S0_T2.draw_branch_cd,
						S0_T2.note_rsn_cd,
						S0_T1.pay_ntc_adv_pay_flg,
						S0_T2.sub_char1.as("note_sub_char1"),
						S0_T2.sub_char2.as("note_sub_char2"),
						S0_T2.sub_char3.as("note_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.adv_pay_act_no.eq(S0_T1.adv_pay_act_no)
								.and(S0_T2.adv_pay_act_seq.eq(S0_T1.adv_pay_act_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.pay_dpt_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dpt_cd.eq(S0_T1.bsppl_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.adv_pay_act_no.eq(bind("adv_pay_act_no")))
						.and(
							S0_M1.dpt_cd.isNotNull()
							.or(S0_M2.dpt_cd.isNotNull())
						)
						.cutoff$and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.adv_pay_act_rev.eq(bind("adv_pay_act_rev"))
							.and(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			);
	}
	
	static MCJoinerList<Srch01_HdrR> MSBHL0070_Srch01_HdrR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.pay_spot_flg
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
					r.pay_spot_flg(m.pay_spot_flg());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bsppl_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bsppl_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.psppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.psppl_rmrks
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
					r.psppl_rmrks(m.psppl_rmrks());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.pay_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.pay_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.pay_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.pay_dpt_nm(m.dpt_nm());
					r.wg_cd(m.wg_cd());
					r.setStringNE("join_wg_cd_", m.wg_cd());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("join_wg_cd_")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
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
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MAM_BANK_AC_R.class, r -> toCondition(
					r.bank_ac_cd()
				))
				.addSelect(m -> toArray(
					m.bank_ac_nm
				))
				.addMap((r, m) -> {
					r.bank_ac_nm(m.bank_ac_nm());
				}),
			j -> j
				.add(MAM_BANK_AC_R.class, r -> toCondition(
					r.pay_bank_ac_cd()
				))
				.addSelect(m -> toArray(
					m.bank_ac_nm
				))
				.addMap((r, m) -> {
					r.pay_bank_ac_nm(m.bank_ac_nm());
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.com_paid_ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.com_paid_ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.trd_cur_com_paid_tax_cd()
				))
				.addSelect(m -> toArray(
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.trd_cur_com_paid_tax_nm(m.tax_nm());
					r.trd_cur_com_paid_tax_rate(m.tax_rate());
				}),
			j -> j
				.add(MAM_BANK_R.class, r -> toCondition(
					r.draw_bank_cd()
				))
				.addSelect(m -> toArray(
					m.bank_nm
				))
				.addMap((r, m) -> {
					r.draw_bank_nm(m.bank_nm());
				}),
			j -> j
				.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
					r.draw_bank_cd(), r.draw_branch_cd()
				))
				.addSelect(m -> toArray(
					m.branch_nm
				))
				.addMap((r, m) -> {
					r.draw_branch_nm(m.branch_nm());
				}),
			j -> j
				.add(MAM_NOTE_RSN_R.class, r -> toCondition(
					r.note_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.note_rsn_nm
				))
				.addMap((r, m) -> {
					r.note_rsn_nm(m.note_rsn_nm());
				})
		);
	}
}