package mcframe.serverMSBH.MSBHL0030;

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
	 * -- MSBHL0030_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL0030_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_AP_APPL_SCHD_R S0_T2 = MST_AP_APPL_SCHD_R.create("T2");
		MST_PAY_SCHD_R S0_T3 = MST_PAY_SCHD_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0030_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.pay_mtd_typ,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_cd,
						S0_T1.tax_cd,
						S0_T1.interim_flg,
						S0_T1.xrate,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_upri,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.bsppl_cl_day,
						S0_T1.bsppl_cl_dt,
						S0_T1.pay_crryovr_times,
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.sppl_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.act_dt,
						S0_T1.ac_dt,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.crryovr_flg,
						S0_T1.ap_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slip_sts_typ,
						S0_T1.ap_d_no,
						S0_T1.pay_chk_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.org_ap_d_no,
						S0_T1.crryovr_ap_d_no,
						S0_T1.crryovr_src_ap_d_no,
						S0_T1.sw_src_pay_schd_no,
						S0_T3.rcv_bill_no.as("sw_src_rcv_bill_no"),
						S0_T1.base_purc_ac_dt,
						S0_T1.pay_schd_d_print_rmrks,
						S0_T1.pay_ntc_d_print_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.base_cur_proc_upri,
						S0_T1.base_cur_proc_amt,
						S0_T1.base_cur_onr_prov_upri,
						S0_T1.base_cur_onr_prov_amt,
						S0_T1.repurc_obli_flg,
						S0_T1.outsrc_flg,
						S0_T1.upd_cntr.as("ap_d_upd_cntr"),
						bind("reg_dt").as("reg_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.sw_src_ap_appl_schd_no.eq(S0_T2.ap_appl_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.pay_schd_no.eq(S0_T3.pay_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pay_chk_no.eq(bind("pay_chk_no")))
						.and(S0_T1.valid_flg.eq(value(true)))
					)
					.orderBy(
						S0_T1.trd_ptn_typ.asc(),
						S0_T1.trd_cd.asc(),
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_d_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBHL0030_MST_PAY_CHK_Query_S01
	 */
	static MCQueryPlan MSBHL0030_MST_PAY_CHK_S01() {
		MST_PAY_CHK_R S0_T1 = MST_PAY_CHK_R.create("T1");
		MBT_APRV_R S0_T2 = MBT_APRV_R.create("T2");
		MAVM_RD_DPT_R S0_M1 = MAVM_RD_DPT_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0030_MST_PAY_CHK_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_chk_no,
						S0_T1.pay_chk_mng_no,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.aprv_upd_flg,
						S0_T2.aprv_can_flg,
						S0_T1.reg_dt,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_usr_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.wrk_no,
						S0_T1.bsppl_cl_day,
						S0_T1.bsppl_cl_dt,
						S0_T1.pay_spot_flg,
						S0_T1.trd_cur_cd,
						S0_T1.pay_sts_typ,
						S0_T1.pay_ntc_rev,
						S0_T1.prnt_flg,
						S0_T1.pay_xrate,
						S0_T1.pay_schd_d_print_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						nvl(S0_T1.last_pay_schd_amt, value(0)).as("last_pay_schd_amt"),
						nvl(S0_T1.account_amt, value(0)).add(nvl(S0_T1.cash_amt, value(0))).add(nvl(S0_T1.note_amt, value(0))).as("pay_amt"),
						nvl(S0_T1.setoff_amt, value(0)).as("setoff_amt"),
						nvl(S0_T1.bfw_amt, value(0)).as("bfw_amt"),
						nvl(S0_T1.purc_amt, value(0)).as("purc_amt"),
						nvl(S0_T1.purc_ret_amt, value(0)).as("purc_ret_amt"),
						nvl(S0_T1.purc_dscnt_amt, value(0)).as("purc_dscnt_amt"),
						nvl(S0_T1.tax_amt, value(0)).subtract(nvl(S0_T1.setoff_tax_amt, value(0))).as("tax_amt"),
						nvl(S0_T1.sw_amt, value(0)).as("sw_amt"),
						nvl(S0_T1.sw_to_amt, value(0)).as("sw_to_amt"),
						nvl(S0_T1.schd_pay_amt, value(0)).as("schd_pay_amt"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("pay_chk_upd_cntr"),
						decode(
							S0_T1.pay_spot_flg,
							value(true),
							S0_T1.reg_dt,
							S0_T1.bsppl_cl_dt
						).as("base_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.aprv_no.eq(S0_T1.aprv_no)
								.and(S0_T2.can_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.bsppl_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pay_chk_no.eq(bind("pay_chk_no")))
					)
			);
	}
	
	/**
	 * -- MSBHL0030_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL0030_MST_PAY_SCHD_S01() {
		MST_PAY_SCHD_R S0_T1 = MST_PAY_SCHD_R.create("T1");
		MST_ADV_PAY_ACT_R S0_T2 = MST_ADV_PAY_ACT_R.create("T2");
		MST_PAY_NOTE_R S0_T3 = MST_PAY_NOTE_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0030_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.pay_schd_dt,
						S0_T1.pay_bank_ac_cd,
						S0_T1.bank_ac_cd,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid_tax_cd,
						S0_T1.trd_cur_com_paid_tax_amt,
						S0_T1.xrate,
						S0_T1.ap_setoff_typ,
						S0_T1.setoff_cd,
						S0_T1.setoff_nm,
						S0_T1.so_dpt_cd,
						S0_T1.adv_pay_act_no,
						S0_T2.trd_cur_amt.as("adv_amt"),
						S0_T2.trd_cur_setoff_schd_amt.as("setoff_schd_amt"),
						S0_T2.trd_cur_setoff_act_amt.as("setoff_act_amt"),
						S0_T2.trd_cur_not_proc_bal.as("not_proc_bal"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.note_no,
							S0_T3.note_no
						).as("note_no"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.note_typ,
							S0_T3.note_typ
						).as("note_typ"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.note_rsn_cd,
							S0_T3.note_rsn_cd
						).as("note_rsn_cd"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.draw_dt,
							S0_T3.draw_dt
						).as("draw_dt"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.due_dt,
							S0_T3.due_dt
						).as("due_dt"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.note_days,
							S0_T3.note_days
						).as("note_days"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.drawer_nm,
							S0_T3.drawer_nm
						).as("drawer_nm"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.draw_bank_cd,
							S0_T3.draw_bank_cd
						).as("draw_bank_cd"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.draw_branch_cd,
							S0_T3.draw_branch_cd
						).as("draw_branch_cd"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.endrsr,
							S0_T3.endrsr
						).as("endrsr"),
						decode(
							S0_T2.adv_pay_act_no,
							nullValue(),
							S0_T1.accptr,
							S0_T3.accptr
						).as("accptr"),
						S0_T1.rcv_bill_no,
						S0_T1.pay_schd_no,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.pay_dpt_cd,
						S0_T1.ap_typ,
						S0_T1.pay_sts_typ,
						S0_T1.sw_flg,
						S0_T1.trd_cur_appl_amt,
						S0_T1.pay_schd_print_rmrks,
						S0_T1.pay_ntc_d_print_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						bind("reg_dt").as("reg_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.adv_pay_act_no.eq(S0_T1.adv_pay_act_no)
								.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.adv_pay_act_no.eq(S0_T2.adv_pay_act_no)
								.and(S0_T3.adv_pay_act_seq.eq(S0_T2.adv_pay_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pay_chk_mng_no.eq(bind("pay_chk_mng_no")))
					)
					.orderBy(S0_T1.pay_schd_no.asc())
			);
	}
	
	static MCJoinerList<Srch01_RsltApdR> MSBHL0030_Srch01_RsltApdR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					r.itm_nm_mst(m.itm_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.inc_tax_flg(m.inc_tax_flg());
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
					r.trd_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MST_AP_D_R.class, r -> toCondition(
					r.crryovr_ap_d_no()
				))
				.addSelect(m -> toArray(
					m.pay_crryovr_times
				))
				.addMap((r, m) -> {
					r.crryovr_times(m.pay_crryovr_times());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.purc_tax_rnd_typ
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
					r.purc_tax_rnd_typ(m.purc_tax_rnd_typ());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.trd_unit_dec_place(m.dec_place());
					r.trd_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.base_unit_dec_place(m.dec_place());
					r.base_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ap_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
				}),
			j -> j
				.add(MST_AP_D_R.class, r -> toCondition(
					r.crryovr_src_ap_d_no()
				))
				.addSelect(m -> toArray(
					m.trd_cur_proc_amt,
					m.trd_cur_onr_prov_amt,
					m.trd_cur_amt,
					m.trd_cur_tax_amt
				))
				.addMap((r, m) -> {
					r.co_src_trd_cur_proc_amt(m.trd_cur_proc_amt());
					r.co_src_trd_cur_onr_prov_amt(m.trd_cur_onr_prov_amt());
					r.co_src_trd_cur_amt(m.trd_cur_amt());
					r.co_src_trd_cur_tax_amt(m.trd_cur_tax_amt());
				})
		);
	}
	
	static MCJoinerList<Srch01_RsltChkR> MSBHL0030_Srch01_RsltChkR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.pay_bank_ac_cd,
					m.psppl_cd
				))
				.addMap((r, m) -> {
					r.psppl_cd(m.psppl_cd());
					r.bsppl_nm(m.bp_nm());
					r.pay_bank_ac_cd(m.pay_bank_ac_cd());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.psppl_cd
				))
				.addMap((r, m) -> {
					r.setStringNE("join_psppl_cd_", m.psppl_cd());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.getStringNE("join_psppl_cd_")
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.note_days,
					m.psppl_rmrks
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
					r.psppl_rmrks(m.psppl_rmrks());
					r.note_days(m.note_days());
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
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bsppl_dpt_cd(), r.base_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.pay_bank_ac_cd,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.bsppl_dpt_nm(m.dpt_nm());
					r.wg_cd(m.wg_cd());
					r.bank_ac_cd(m.pay_bank_ac_cd());
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
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
					r.trd_cur_upri_dec_place(m.upri_dec_place());
				})
		);
	}
	
	static MCJoinerList<Srch01_RsltSchdR> MSBHL0030_Srch01_RsltSchdR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.ap_setoff_act_flg,
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.ap_sttl_nm(m.sttl_nm());
					r.ap_setoff_act_flg(m.ap_setoff_act_flg());
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
				.add(MAM_DPT_R.class, r -> toCondition(
					r.so_dpt_cd(), r.pay_schd_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.so_dpt_nm(m.dpt_nm());
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
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ap_dpt_cd(), r.reg_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.pay_dpt_cd(), r.pay_schd_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.pay_dpt_nm(m.dpt_nm());
				})
		);
	}
}