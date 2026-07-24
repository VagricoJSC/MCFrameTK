package mcframe.serverMSBH.MSBHL5090;

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
	 * -- MSBHL5090_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL5090_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub3.as("itm_sub3_data"),
						decode(
							S0_T1.sundry_itm_flg,
							value(true),
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_M1.dscnt_itm_flg,
						S0_T1.trd_unit_qty,
						S0_T1.pay_mtd_typ,
						S0_T1.crryovr_flg,
						S0_T1.sppl_cd,
						S0_T1.trd_cur_upri,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.trd_cur_amt,
						S0_T1.bp_dlv_slip_no,
						S0_T1.act_dt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.tax_cd,
						S0_T1.trd_cd,
						S0_T1.pay_schd_d_print_rmrks,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.repurc_obli_flg,
						// this field is appended by sql coverter.
						S0_T1.trd_unit_cd.as("join_trd_unit_cd_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							S0_M1.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pay_chk_no.eq(bind("pay_chk_no")))
					)
					.orderBy(
						S0_T1.trd_cd.asc(),
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_seq.asc(),
						S0_T1.purc_act_d_no.asc(),
						S0_T1.purc_act_d_seq.asc(),
						S0_T1.ap_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_trd_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("sppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("sppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("sppl_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_PAY_CHK_Query_S01
	 */
	static MCQueryPlan MSBHL5090_MST_PAY_CHK_S01() {
		MST_PAY_CHK_R S0_T1 = MST_PAY_CHK_R.create("T1");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_PAY_CHK_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_chk_no,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_M3.dpt_nm.as("bsppl_dpt_nm"),
						S0_T1.bsppl_usr_cd,
						S0_T1.pay_schd_d_print_rmrks.as("pay_schd_d_print_hdr_rmrks"),
						S0_T1.amt.as("total_amt"),
						S0_T1.com_paid.as("total_com_paid"),
						S0_T1.trd_cur_cd
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							S0_M3.dpt_cd.eq(S0_T1.bsppl_dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.pay_chk_no.like(bind("pay_chk_no")))
					)
					.orderBy(S0_T1.pay_chk_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm,
							m.psppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("psppl_cd", m.psppl_cd());
							r.setStringNE("bsppl_nm", m.bp_nm());
							r.setStringNE("bsppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bsppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bsppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bsppl_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("psppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm,
							m.psppl_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("psppl_nm", m.bp_nm());
							r.setStringNE("psppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("psppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("psppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("psppl_alt_nm4", m.bp_alt_nm4());
							r.setStringNE("psppl_rmrks", m.psppl_rmrks());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("bsppl_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL5090_MST_PAY_SCHD_S01() {
		MST_PAY_CHK_R S0_T2 = MST_PAY_CHK_R.create("T2");
		MST_PAY_SCHD_R S0_T1 = MST_PAY_SCHD_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_dpt_cd,
						S0_M1.dpt_nm.as("pay_dpt_nm"),
						S0_T2.bsppl_dpt_cd,
						S0_M2.dpt_nm.as("bsppl_dpt_nm"),
						S0_T2.pay_chk_no,
						S0_T1.pay_schd_no,
						S0_T2.bsppl_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.pay_schd_dt,
						S0_T1.ap_sttl_cd,
						S0_T1.trd_cur_amt,
						S0_T2.trd_cur_cd,
						S0_T1.pay_schd_print_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(
						S0_T2
						.leftOuterJoin(S0_T1).on(S0_T1.pay_chk_mng_no.eq(S0_T2.pay_chk_mng_no))
						.leftOuterJoin(S0_M1).on(
							S0_M1.dpt_cd.eq(S0_T1.pay_dpt_cd)
							.and(S0_T1.pay_schd_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.leftOuterJoin(S0_M2).on(
							S0_M2.dpt_cd.eq(S0_T2.bsppl_dpt_cd)
							.and(S0_T2.reg_dt.between(S0_M2.st_dt, S0_M2.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.pay_schd_no.like(bind("pay_schd_no")))
					)
					.orderBy(
						S0_T1.pay_dpt_cd.asc(),
						S0_M1.dpt_nm.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm,
							m.psppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("psppl_cd", m.psppl_cd());
							r.setStringNE("bsppl_nm", m.bp_nm());
							r.setStringNE("bsppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bsppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bsppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bsppl_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("pay_bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_no,
							m.bank_cd,
							m.branch_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_cd", m.bank_cd());
							r.setStringNE("branch_cd", m.branch_cd());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("bank_cd"),
							r.getStringNE("branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("branch_nm", m.branch_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ap_sttl_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ap_sttl_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("psppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("psppl_nm", m.bp_nm());
							r.setStringNE("psppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("psppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("psppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("psppl_alt_nm4", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_PAY_CHK_Query_S02
	 */
	static MCQueryPlan MSBHL5090_MST_PAY_CHK_S02() {
		MST_PAY_CHK_R payChk1 = MST_PAY_CHK_R.create("payChk1");
		MST_WRK_R wrk1 = MST_WRK_R.create("wrk1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("dpt1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("cur1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_PAY_CHK_Query_S02")
					.mainQuery()
					.select(
						payChk1.pay_chk_mng_no,
						payChk1.pay_chk_no,
						payChk1.bsppl_cd,
						payChk1.bsppl_dpt_cd,
						payChk1.purc_act_no,
						payChk1.rcpt_iv_mng_no,
						payChk1.rcpt_iv_no,
						payChk1.wrk_no,
						payChk1.pay_spot_flg,
						payChk1.bsppl_cl_dt,
						payChk1.trd_cur_cd,
						payChk1.pay_ntc_rev,
						payChk1.reg_dt,
						nvl(payChk1.last_pay_schd_amt, value(0)).as("last_pay_schd_amt"),
						nvl(payChk1.bfw_amt, value(0)).as("bfw_amt"),
						nvl(payChk1.purc_amt, value(0)).as("purc_amt"),
						nvl(payChk1.purc_ret_amt, value(0)).as("purc_ret_amt"),
						nvl(payChk1.purc_dscnt_amt, value(0)).as("purc_dscnt_amt"),
						nvl(payChk1.sw_to_amt, value(0)).as("sw_to_amt"),
						nvl(payChk1.tax_amt, value(0)).as("tax_amt"),
						nvl(payChk1.account_amt, value(0)).as("account_amt"),
						nvl(payChk1.cash_amt, value(0)).as("cash_amt"),
						nvl(payChk1.note_amt, value(0)).as("note_amt"),
						nvl(payChk1.setoff_amt, value(0)).as("setoff_amt"),
						nvl(payChk1.setoff_tax_amt, value(0)).as("setoff_tax_amt"),
						nvl(payChk1.sw_amt, value(0)).as("sw_amt"),
						nvl(payChk1.schd_pay_amt, value(0)).as("schd_pay_amt"),
						payChk1.pay_sts_typ,
						payChk1.prnt_flg,
						payChk1.pay_xrate,
						nvl(payChk1.adv_pay_amt, value(0)).as("adv_pay_amt"),
						nvl(payChk1.adv_pay_setoff_amt, value(0)).as("adv_pay_setoff_amt"),
						nvl(payChk1.adv_pay_setoff_tax_amt, value(0)).as("adv_pay_setoff_tax_amt"),
						nvl(payChk1.adv_pay_bal, value(0)).as("adv_pay_bal"),
						payChk1.sub_char1,
						payChk1.sub_char2,
						payChk1.sub_char3,
						wrk1.wrk_nm,
						bp1.bp_nm,
						bp1.biz_co_no,
						bp1.pay_ntc_zip_cd,
						bp1.pay_ntc_addr1,
						bp1.pay_ntc_addr2,
						bp1.pay_ntc_addr3,
						bp1.pay_ntc_addr4,
						bp1.pay_ntc_bsppl_nm,
						bp1.pay_ntc_bsppl_dpt,
						bp1.pay_ntc_bsppl_psn,
						bp1.pay_ntc_bsppl_psn_title,
						bp1.pay_ntc_tel,
						bp1.pay_ntc_dtl_outp_flg,
						bp1.pay_ntc_bfw_bal_disp_flg,
						bp1.pay_ntc_dtl_pay_flg,
						bp1.pay_ntc_dtl_subttl_typ,
						bp1.pay_ntc_dtl_brk_typ,
						bp1.pay_ntc_dtl_sort_typ,
						bp1.pay_ntc_can_slip_typ,
						dpt1.dpt_nm,
						dpt1.tel,
						cur1.cur_nm,
						cur1.amt_dec_place,
						cur1.upri_dec_place
					)
					.from(
						payChk1
						.leftOuterJoin(wrk1).on(
							wrk1.wrk_no.eq(payChk1.wrk_no)
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(payChk1.bsppl_cd)
						)
						.leftOuterJoin(dpt1).on(
							dpt1.dpt_cd.eq(payChk1.bsppl_dpt_cd)
							.and(payChk1.reg_dt.between(dpt1.st_dt, dpt1.end_dt))
						)
						.leftOuterJoin(cur1).on(
							cur1.cur_cd.eq(payChk1.trd_cur_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(payChk1.pay_chk_no.eq(bind("pay_chk_no")))
					)
					.orderBy(
						payChk1.pay_chk_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_AP_D_Query_S02
	 */
	static MCQueryPlan MSBHL5090_MST_AP_D_S02() {
		MST_AP_D_R apD1 = MST_AP_D_R.create("apD1");
		MST_AP_D_R apD2 = MST_AP_D_R.create("apD2");
		MST_AP_D_R apD3 = MST_AP_D_R.create("apD3");
		MST_WRK_R wrk1 = MST_WRK_R.create("wrk1");
		MAM_ITM_R itm1 = MAM_ITM_R.create("itm1");
		MAM_TAX_R tax1 = MAM_TAX_R.create("tax1");
		MAM_TRD_R trd1 = MAM_TRD_R.create("trd1");
		MAM_UNIT_R unit1 = MAM_UNIT_R.create("unit1");
		MAVM_ITM_UNIT_R itmUnit1 = MAVM_ITM_UNIT_R.create("itmUnit1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_BP_R bp2 = MAM_BP_R.create("bp2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_AP_D_Query_S02")
					.mainQuery()
					.select(
						apD1.ap_d_no,
						apD1.po_no,
						apD1.po_d_no,
						apD1.purc_act_d_no,
						apD1.purc_act_d_seq,
						apD1.purc_act_no,
						apD1.purc_act_rev,
						apD1.bp_dlv_slip_no,
						apD1.bp_dlv_slip_d_no,
						apD1.trd_cd,
						apD1.trd_ptn_typ,
						apD1.slip_sts_typ,
						apD1.sppl_cd,
						apD1.asppl_cd,
						apD1.po_wrk_no,
						apD1.act_dt,
						apD1.ac_dt,
						apD1.pay_basis_dt,
						apD1.itm_cd,
						apD1.itm_sub1,
						apD1.itm_sub2,
						apD1.itm_sub3,
						decode(
							apD1.sundry_itm_flg,
							value(true),
							apD1.itm_nm,
							itm1.itm_nm
						).as("itm_nm"),
						apD1.sppl_itm_cd,
						apD1.sppl_itm_nm,
						apD1.trd_unit_cd,
						apD1.trd_unit_qty,
						apD1.tax_cd,
						apD1.interim_flg,
						apD1.trd_cur_cd,
						apD1.trd_cur_upri,
						apD1.trd_cur_amt,
						apD1.trd_cur_tax_amt,
						apD1.trd_cur_dscnt_amt,
						apD1.base_cur_tax_amt,
						apD1.pay_mtd_typ,
						apD1.base_purc_ac_dt,
						apD1.pay_ntc_d_print_rmrks,
						apD1.pay_chk_no,
						apD1.pay_chk_mng_no,
						apD1.sub_char1,
						apD1.sub_char2,
						apD1.sub_char3,
						apD2.trd_cur_amt.add(apD2.trd_cur_tax_amt).as("part_pay_ntc_ttl_amt"),
						apD3.trd_cur_amt.add(apD3.trd_cur_tax_amt).as("part_pay_ntc_crryovr_amt"),
						wrk1.wrk_nm,
						itm1.itm_alt_nm1,
						itm1.itm_alt_nm2,
						itm1.itm_alt_nm3,
						itm1.itm_alt_nm4,
						itm1.dscnt_itm_flg,
						tax1.tax_nm,
						tax1.inc_tax_flg,
						tax1.tax_rate,
						trd1.trd_nm,
						unit1.unit_nm,
						itmUnit1.dec_place,
						bp1.bp_nm.as("sppl_nm"),
						bp2.bp_nm.as("asppl_nm")
					)
					.from(
						apD1
						.leftOuterJoin(apD2).on(
							apD2.ap_d_no.eq(apD1.org_ap_d_no)
						)
						.leftOuterJoin(apD3).on(
							apD3.ap_d_no.eq(apD1.crryovr_ap_d_no)
						)
						.leftOuterJoin(wrk1).on(
							wrk1.wrk_no.eq(apD1.po_wrk_no)
						)
						.leftOuterJoin(itm1).on(
							itm1.itm_cd.eq(apD1.itm_cd)
							.and(itm1.itm_sub1.eq(apD1.itm_sub1))
							.and(itm1.itm_sub2.eq(apD1.itm_sub2))
							.and(itm1.itm_sub3.eq(apD1.itm_sub3))
						)
						.leftOuterJoin(tax1).on(
							tax1.tax_cd.eq(apD1.tax_cd)
						)
						.leftOuterJoin(trd1).on(
							trd1.trd_cd.eq(apD1.trd_cd)
						)
						.leftOuterJoin(unit1).on(
							unit1.unit_cd.eq(apD1.trd_unit_cd)
						)
						.leftOuterJoin(itmUnit1).on(
							itmUnit1.itm_cd.eq(apD1.itm_cd)
							.and(itmUnit1.itm_sub1.eq(apD1.itm_sub1))
							.and(itmUnit1.itm_sub2.eq(apD1.itm_sub2))
							.and(itmUnit1.itm_sub3.eq(apD1.itm_sub3))
							.and(itmUnit1.unit_cd.eq(apD1.trd_unit_cd))
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(apD1.sppl_cd)
						)
						.leftOuterJoin(bp2).on(
							bp2.bp_cd.eq(apD1.asppl_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(apD1.pay_chk_no.eq(bind("pay_chk_no")))
					)
					.orderBy(
						apD1.pay_chk_no.asc(),
						apD1.ap_d_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_PAY_SCHD_Query_S02
	 */
	static MCQueryPlan MSBHL5090_MST_PAY_SCHD_S02() {
		MST_PAY_SCHD_R paySchd1 = MST_PAY_SCHD_R.create("paySchd1");
		MAM_STTL_R sttl1 = MAM_STTL_R.create("sttl1");
		MAM_BANK_AC_R bankAc1 = MAM_BANK_AC_R.create("bankAc1");
		MAM_BANK_R bank1 = MAM_BANK_R.create("bank1");
		MAM_BANK_BRANCH_R bankBranch1 = MAM_BANK_BRANCH_R.create("bankBranch1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_PAY_SCHD_Query_S02")
					.mainQuery()
					.select(
						paySchd1.pay_chk_mng_no,
						paySchd1.ap_sttl_cd,
						paySchd1.ap_sttl_typ,
						paySchd1.pay_schd_dt,
						paySchd1.pay_bank_ac_cd,
						sum(paySchd1.trd_cur_amt).as("trd_cur_amt"),
						sttl1.sttl_nm,
						bankAc1.bank_cd,
						bankAc1.branch_cd,
						bankAc1.bank_ac_no,
						bank1.bank_nm,
						bankBranch1.branch_nm
					)
					.from(
						paySchd1
						.leftOuterJoin(sttl1).on(
							sttl1.sttl_cd.eq(paySchd1.ap_sttl_cd)
						)
						.leftOuterJoin(bankAc1).on(
							bankAc1.bank_ac_cd.eq(paySchd1.pay_bank_ac_cd)
						)
						.leftOuterJoin(bank1).on(
							bank1.bank_cd.eq(bankAc1.bank_cd)
						)
						.leftOuterJoin(bankBranch1).on(
							bankBranch1.bank_cd.eq(bankAc1.bank_cd)
							.and(bankBranch1.branch_cd.eq(bankAc1.branch_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(paySchd1.pay_chk_mng_no.eq(bind("pay_chk_mng_no")))
						.and(paySchd1.ap_sttl_typ.in(
								value(MAC_AP_STTL_TYP.ACNT.value()),
								value(MAC_AP_STTL_TYP.CASH.value()),
								value(MAC_AP_STTL_TYP.NOTE.value())))
					)
					.groupBy(
						paySchd1.pay_chk_mng_no,
						paySchd1.ap_sttl_cd,
						paySchd1.ap_sttl_typ,
						paySchd1.pay_schd_dt,
						paySchd1.pay_bank_ac_cd,
						sttl1.sttl_nm,
						bankAc1.bank_cd,
						bankAc1.branch_cd,
						bankAc1.bank_ac_no,
						bank1.bank_nm,
						bankBranch1.branch_nm
					)
					.orderBy(
						paySchd1.pay_chk_mng_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL5090_MST_PAY_ACT_D_S01() {
		MST_PAY_ACT_D_R payActD1 = MST_PAY_ACT_D_R.create("payActD1");
		MST_PAY_ACT_R payAct1 = MST_PAY_ACT_R.create("payAct1");
		MAM_STTL_R sttl1 = MAM_STTL_R.create("sttl1");
		MAM_TAX_R tax1 = MAM_TAX_R.create("tax1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("cur1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_PAY_ACT_D_Query_S01")
					.mainQuery()
					.select(
						payActD1.pay_act_d_no,
						payActD1.pay_act_d_seq,
						payActD1.calc_tgt_pay_chk_mng_no,
						payActD1.ap_sttl_cd,
						payActD1.ap_sttl_typ,
						payActD1.trd_cur_com_paid_tax_cd,
						payActD1.trd_cur_amt,
						payActD1.trd_cur_com_paid_tax_amt,
						payActD1.trd_cur_exc_com_paid,
						payActD1.base_cur_com_paid_tax_amt,
						payActD1.pay_ntc_d_print_rmrks,
						payAct1.pay_act_no,
						payAct1.pay_act_rev,
						payAct1.slip_sts_typ,
						payAct1.pay_act_dt,
						payAct1.ac_dt,
						payAct1.trd_cur_cd,
						sttl1.sttl_nm,
						sttl1.bill_tax_disp_flg,
						tax1.tax_nm,
						tax1.inc_tax_flg,
						tax1.tax_rate,
						cur1.cur_nm
					)
					.from(
						payActD1
						.innerJoin(payAct1).on(
							payAct1.pay_act_no.eq(payActD1.pay_act_no)
							.and(payAct1.pay_act_seq.eq(payActD1.pay_act_seq))
						)
						.leftOuterJoin(sttl1).on(
							sttl1.sttl_cd.eq(payActD1.ap_sttl_cd)
						)
						.leftOuterJoin(tax1).on(
								tax1.tax_cd.eq(payActD1.trd_cur_com_paid_tax_cd)
							)
						.leftOuterJoin(cur1).on(
							cur1.cur_cd.eq(payAct1.trd_cur_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(payActD1.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")))
						.and(payActD1.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.ACNT_COM_PAID.value())))
						.and(payActD1.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.CASH_COM_PAID.value())))
					)
					.orderBy(
						payActD1.calc_tgt_pay_chk_mng_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBHL5090_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL5090_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R advPayAct1 = MST_ADV_PAY_ACT_R.create("advPayAct1");
		MAM_STTL_R sttl1 = MAM_STTL_R.create("sttl1");
		MAM_STTL_R sttl2 = MAM_STTL_R.create("sttl2");
		MAM_TAX_R tax1 = MAM_TAX_R.create("tax1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("cur1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5090_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						advPayAct1.adv_pay_act_no,
						advPayAct1.adv_pay_act_seq,
						advPayAct1.adv_pay_act_rev,
						advPayAct1.pay_chk_mng_no,
						advPayAct1.slip_sts_typ,
						advPayAct1.pay_act_dt,
						advPayAct1.ac_dt,
						advPayAct1.trd_cur_cd,
						advPayAct1.ap_sttl_cd,
						advPayAct1.com_paid_ap_sttl_cd,
						advPayAct1.com_paid_ap_sttl_typ,
						advPayAct1.trd_cur_com_paid_tax_cd,
						advPayAct1.trd_cur_amt,
						advPayAct1.trd_cur_com_paid,
						advPayAct1.trd_cur_com_paid_tax_amt,
						advPayAct1.trd_cur_exc_com_paid,
						advPayAct1.base_cur_com_paid_tax_amt,
						sttl1.sttl_nm,
						sttl2.sttl_nm.as("com_paid_sttl_nm"),
						sttl2.bill_tax_disp_flg,
						tax1.tax_nm,
						tax1.inc_tax_flg,
						tax1.tax_rate,
						cur1.cur_nm
					)
					.from(
						advPayAct1
						.leftOuterJoin(sttl1).on(
							sttl1.sttl_cd.eq(advPayAct1.ap_sttl_cd)
						)
						.leftOuterJoin(sttl2).on(
							sttl2.sttl_cd.eq(advPayAct1.com_paid_ap_sttl_cd)
						)
						.leftOuterJoin(tax1).on(
							tax1.tax_cd.eq(advPayAct1.trd_cur_com_paid_tax_cd)
						)
						.leftOuterJoin(cur1).on(
							cur1.cur_cd.eq(advPayAct1.trd_cur_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(advPayAct1.pay_chk_mng_no.eq(bind("pay_chk_mng_no")))
						.and(advPayAct1.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.ACNT_COM_PAID.value())))
						.and(advPayAct1.ap_sttl_typ.neq(value(MAC_AP_STTL_TYP.CASH_COM_PAID.value())))
					)
					.orderBy(
						advPayAct1.pay_chk_mng_no.asc()
					)
			);
	}
}