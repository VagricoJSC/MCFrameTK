package mcframe.commonPFBE.PFBER5260;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBER_BpPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBER5260";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBE.PFBER5260.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHM", "", "", true);
	static public final MCReportMeta bp_cd_META_0 = new MCReportMeta("bp_cd", "", "", "", true);
	static public final MCReportMeta del_flg_META_0 = new MCReportMeta("del_flg", "", "", "", true);
	static public final MCReportMeta bp_nm_META_0 = new MCReportMeta("bp_nm", "", "", "", true);
	static public final MCReportMeta bp_alt_nm1_META_0 = new MCReportMeta("bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta bp_alt_nm2_META_0 = new MCReportMeta("bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta bp_alt_nm3_META_0 = new MCReportMeta("bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta bp_alt_nm4_META_0 = new MCReportMeta("bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta tel_META_0 = new MCReportMeta("tel", "", "", "", true);
	static public final MCReportMeta fax_META_0 = new MCReportMeta("fax", "", "", "", true);
	static public final MCReportMeta ein_META_0 = new MCReportMeta("ein", "", "", "", true);
	static public final MCReportMeta std_co_cd_META_0 = new MCReportMeta("std_co_cd", "", "", "", true);
	static public final MCReportMeta cntry_cd_META_0 = new MCReportMeta("cntry_cd", "", "", "", true);
	static public final MCReportMeta area_cd_META_0 = new MCReportMeta("area_cd", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta prnt_lcl_cd_META_0 = new MCReportMeta("prnt_lcl_cd", "", "", "", true);
	static public final MCReportMeta bp_grp_cd1_META_0 = new MCReportMeta("bp_grp_cd1", "", "", "", true);
	static public final MCReportMeta bp_grp_cd2_META_0 = new MCReportMeta("bp_grp_cd2", "", "", "", true);
	static public final MCReportMeta bp_grp_cd3_META_0 = new MCReportMeta("bp_grp_cd3", "", "", "", true);
	static public final MCReportMeta bp_grp_cd4_META_0 = new MCReportMeta("bp_grp_cd4", "", "", "", true);
	static public final MCReportMeta bp_grp_cd5_META_0 = new MCReportMeta("bp_grp_cd5", "", "", "", true);
	static public final MCReportMeta bp_grp_cd6_META_0 = new MCReportMeta("bp_grp_cd6", "", "", "", true);
	static public final MCReportMeta bp_grp_cd7_META_0 = new MCReportMeta("bp_grp_cd7", "", "", "", true);
	static public final MCReportMeta bp_grp_cd8_META_0 = new MCReportMeta("bp_grp_cd8", "", "", "", true);
	static public final MCReportMeta bp_grp_cd9_META_0 = new MCReportMeta("bp_grp_cd9", "", "", "", true);
	static public final MCReportMeta bp_grp_cd10_META_0 = new MCReportMeta("bp_grp_cd10", "", "", "", true);
	static public final MCReportMeta bp_alc_grp_META_0 = new MCReportMeta("bp_alc_grp", "", "", "", true);
	static public final MCReportMeta cst_flg_META_0 = new MCReportMeta("cst_flg", "", "", "", true);
	static public final MCReportMeta acst_flg_META_0 = new MCReportMeta("acst_flg", "", "", "", true);
	static public final MCReportMeta bcst_flg_META_0 = new MCReportMeta("bcst_flg", "", "", "", true);
	static public final MCReportMeta rcst_flg_META_0 = new MCReportMeta("rcst_flg", "", "", "", true);
	static public final MCReportMeta sppl_flg_META_0 = new MCReportMeta("sppl_flg", "", "", "", true);
	static public final MCReportMeta asppl_flg_META_0 = new MCReportMeta("asppl_flg", "", "", "", true);
	static public final MCReportMeta bsppl_flg_META_0 = new MCReportMeta("bsppl_flg", "", "", "", true);
	static public final MCReportMeta psppl_flg_META_0 = new MCReportMeta("psppl_flg", "", "", "", true);
	static public final MCReportMeta cred_flg_META_0 = new MCReportMeta("cred_flg", "", "", "", true);
	static public final MCReportMeta dlv_flg_META_0 = new MCReportMeta("dlv_flg", "", "", "", true);
	static public final MCReportMeta maker_flg_META_0 = new MCReportMeta("maker_flg", "", "", "", true);
	static public final MCReportMeta dest_flg_META_0 = new MCReportMeta("dest_flg", "", "", "", true);
	static public final MCReportMeta all_com_flg_META_0 = new MCReportMeta("all_com_flg", "", "", "", true);
	static public final MCReportMeta acst_cd_META_0 = new MCReportMeta("acst_cd", "", "", "", true);
	static public final MCReportMeta ar_dpt_typ_META_0 = new MCReportMeta("ar_dpt_typ", "", "", "", true);
	static public final MCReportMeta ar_dpt_cd_META_0 = new MCReportMeta("ar_dpt_cd", "", "", "", true);
	static public final MCReportMeta cst_cntct_dpt_META_0 = new MCReportMeta("cst_cntct_dpt", "", "", "", true);
	static public final MCReportMeta cst_cntct_psn_META_0 = new MCReportMeta("cst_cntct_psn", "", "", "", true);
	static public final MCReportMeta cst_cntct_psn_title_META_0 = new MCReportMeta("cst_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta cst_sundry_flg_META_0 = new MCReportMeta("cst_sundry_flg", "", "", "", true);
	static public final MCReportMeta sls_upri_req_typ_META_0 = new MCReportMeta("sls_upri_req_typ", "", "", "", true);
	static public final MCReportMeta sls_upri_cng_flg_META_0 = new MCReportMeta("sls_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta sls_upri_rnd_typ_META_0 = new MCReportMeta("sls_upri_rnd_typ", "", "", "", true);
	static public final MCReportMeta sls_amt_rnd_typ_META_0 = new MCReportMeta("sls_amt_rnd_typ", "", "", "", true);
	static public final MCReportMeta sls_tax_calc_typ_META_0 = new MCReportMeta("sls_tax_calc_typ", "", "", "", true);
	static public final MCReportMeta sls_tax_rnd_typ_META_0 = new MCReportMeta("sls_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta sls_basis_typ_META_0 = new MCReportMeta("sls_basis_typ", "", "", "", true);
	static public final MCReportMeta bill_basis_typ_META_0 = new MCReportMeta("bill_basis_typ", "", "", "", true);
	static public final MCReportMeta ship_schd_split_typ_META_0 = new MCReportMeta("ship_schd_split_typ", "", "", "", true);
	static public final MCReportMeta bill_crryovr_times_META_0 = new MCReportMeta("bill_crryovr_times", "", "", "", true);
	static public final MCReportMeta lot_back_stop_typ_META_0 = new MCReportMeta("lot_back_stop_typ", "", "", "", true);
	static public final MCReportMeta slip_each_lot_typ_META_0 = new MCReportMeta("slip_each_lot_typ", "", "", "", true);
	static public final MCReportMeta cst_ship_form_cd_META_0 = new MCReportMeta("cst_ship_form_cd", "", "", "", true);
	static public final MCReportMeta stk_lst_issue_flg_META_0 = new MCReportMeta("stk_lst_issue_flg", "", "", "", true);
	static public final MCReportMeta stk_lst_form_cd_META_0 = new MCReportMeta("stk_lst_form_cd", "", "", "", true);
	static public final MCReportMeta sls_tax_cd_META_0 = new MCReportMeta("sls_tax_cd", "", "", "", true);
	static public final MCReportMeta sls_tax_cd_prio_flg_META_0 = new MCReportMeta("sls_tax_cd_prio_flg", "", "", "", true);
	static public final MCReportMeta wrk_ar_flg_META_0 = new MCReportMeta("wrk_ar_flg", "", "", "", true);
	static public final MCReportMeta cst_iv_flg_META_0 = new MCReportMeta("cst_iv_flg", "", "", "", true);
	static public final MCReportMeta ship_lt_META_0 = new MCReportMeta("ship_lt", "", "", "", true);
	static public final MCReportMeta cst_tterm_cd1_META_0 = new MCReportMeta("cst_tterm_cd1", "", "", "", true);
	static public final MCReportMeta cst_tterm_cd2_META_0 = new MCReportMeta("cst_tterm_cd2", "", "", "", true);
	static public final MCReportMeta cst_tterm_cd3_META_0 = new MCReportMeta("cst_tterm_cd3", "", "", "", true);
	static public final MCReportMeta sls_anly_cd1_META_0 = new MCReportMeta("sls_anly_cd1", "", "", "", true);
	static public final MCReportMeta sls_anly_cd2_META_0 = new MCReportMeta("sls_anly_cd2", "", "", "", true);
	static public final MCReportMeta sls_anly_cd3_META_0 = new MCReportMeta("sls_anly_cd3", "", "", "", true);
	static public final MCReportMeta bcst_cd_META_0 = new MCReportMeta("bcst_cd", "", "", "", true);
	static public final MCReportMeta rcst_cd_META_0 = new MCReportMeta("rcst_cd", "", "", "", true);
	static public final MCReportMeta ar_cred_cd_META_0 = new MCReportMeta("ar_cred_cd", "", "", "", true);
	static public final MCReportMeta bill_dpt_typ_META_0 = new MCReportMeta("bill_dpt_typ", "", "", "", true);
	static public final MCReportMeta bcst_dpt_cd_META_0 = new MCReportMeta("bcst_dpt_cd", "", "", "", true);
	static public final MCReportMeta bill_cl_typ_META_0 = new MCReportMeta("bill_cl_typ", "", "", "", true);
	static public final MCReportMeta bill_cl_day1_META_0 = new MCReportMeta("bill_cl_day1", "", "", "", true);
	static public final MCReportMeta bill_cl_day2_META_0 = new MCReportMeta("bill_cl_day2", "", "", "", true);
	static public final MCReportMeta bill_cl_day3_META_0 = new MCReportMeta("bill_cl_day3", "", "", "", true);
	static public final MCReportMeta bill_cl_day4_META_0 = new MCReportMeta("bill_cl_day4", "", "", "", true);
	static public final MCReportMeta bill_cl_day5_META_0 = new MCReportMeta("bill_cl_day5", "", "", "", true);
	static public final MCReportMeta tax_on_bill_flg_META_0 = new MCReportMeta("tax_on_bill_flg", "", "", "", true);
	static public final MCReportMeta bill_tax_rnd_typ_META_0 = new MCReportMeta("bill_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta bill_cl_delay_days_META_0 = new MCReportMeta("bill_cl_delay_days", "", "", "", true);
	static public final MCReportMeta bill_cl_ba_typ_META_0 = new MCReportMeta("bill_cl_ba_typ", "", "", "", true);
	static public final MCReportMeta sls_interim_cl_flg_META_0 = new MCReportMeta("sls_interim_cl_flg", "", "", "", true);
	static public final MCReportMeta bill_cal_cd_META_0 = new MCReportMeta("bill_cal_cd", "", "", "", true);
	static public final MCReportMeta rcv_ba_typ_META_0 = new MCReportMeta("rcv_ba_typ", "", "", "", true);
	static public final MCReportMeta bill_zip_cd_META_0 = new MCReportMeta("bill_zip_cd", "", "", "", true);
	static public final MCReportMeta bill_addr1_META_0 = new MCReportMeta("bill_addr1", "", "", "", true);
	static public final MCReportMeta bill_addr2_META_0 = new MCReportMeta("bill_addr2", "", "", "", true);
	static public final MCReportMeta bill_addr3_META_0 = new MCReportMeta("bill_addr3", "", "", "", true);
	static public final MCReportMeta bill_addr4_META_0 = new MCReportMeta("bill_addr4", "", "", "", true);
	static public final MCReportMeta bill_tel_META_0 = new MCReportMeta("bill_tel", "", "", "", true);
	static public final MCReportMeta bill_bcst_nm_META_0 = new MCReportMeta("bill_bcst_nm", "", "", "", true);
	static public final MCReportMeta bill_bcst_dpt_META_0 = new MCReportMeta("bill_bcst_dpt", "", "", "", true);
	static public final MCReportMeta bill_bcst_psn_META_0 = new MCReportMeta("bill_bcst_psn", "", "", "", true);
	static public final MCReportMeta bill_bcst_psn_title_META_0 = new MCReportMeta("bill_bcst_psn_title", "", "", "", true);
	static public final MCReportMeta bfw_bal_disp_flg_META_0 = new MCReportMeta("bfw_bal_disp_flg", "", "", "", true);
	static public final MCReportMeta sls_dtl_outp_typ_META_0 = new MCReportMeta("sls_dtl_outp_typ", "", "", "", true);
	static public final MCReportMeta bill_prnt_typ_META_0 = new MCReportMeta("bill_prnt_typ", "", "", "", true);
	static public final MCReportMeta bill_dtl_outp_flg_META_0 = new MCReportMeta("bill_dtl_outp_flg", "", "", "", true);
	static public final MCReportMeta bill_dtl_rcv_flg_META_0 = new MCReportMeta("bill_dtl_rcv_flg", "", "", "", true);
	static public final MCReportMeta bill_dtl_adv_flg_META_0 = new MCReportMeta("bill_dtl_adv_flg", "", "", "", true);
	static public final MCReportMeta bill_dtl_subttl_typ_META_0 = new MCReportMeta("bill_dtl_subttl_typ", "", "", "", true);
	static public final MCReportMeta bill_dtl_brk_typ_META_0 = new MCReportMeta("bill_dtl_brk_typ", "", "", "", true);
	static public final MCReportMeta bill_dtl_sort_typ_META_0 = new MCReportMeta("bill_dtl_sort_typ", "", "", "", true);
	static public final MCReportMeta bill_can_slip_typ_META_0 = new MCReportMeta("bill_can_slip_typ", "", "", "", true);
	static public final MCReportMeta auto_line_appl_flg_META_0 = new MCReportMeta("auto_line_appl_flg", "", "", "", true);
	static public final MCReportMeta ar_setoff_grp_cd_META_0 = new MCReportMeta("ar_setoff_grp_cd", "", "", "", true);
	static public final MCReportMeta xfr_psn_META_0 = new MCReportMeta("xfr_psn", "", "", "", true);
	static public final MCReportMeta rcv_auto_appl_tgt_flg_META_0 = new MCReportMeta("rcv_auto_appl_tgt_flg", "", "", "", true);
	static public final MCReportMeta rcv_amt_match_flg_META_0 = new MCReportMeta("rcv_amt_match_flg", "", "", "", true);
	static public final MCReportMeta ar_sttl_typ_match_flg_META_0 = new MCReportMeta("ar_sttl_typ_match_flg", "", "", "", true);
	static public final MCReportMeta calc_com_paid_flg_META_0 = new MCReportMeta("calc_com_paid_flg", "", "", "", true);
	static public final MCReportMeta auto_appl_delay_days_META_0 = new MCReportMeta("auto_appl_delay_days", "", "", "", true);
	static public final MCReportMeta asppl_cd_META_0 = new MCReportMeta("asppl_cd", "", "", "", true);
	static public final MCReportMeta vmi_purc_dpt_cd_META_0 = new MCReportMeta("vmi_purc_dpt_cd", "", "", "", true);
	static public final MCReportMeta subcon_flg_META_0 = new MCReportMeta("subcon_flg", "", "", "", true);
	static public final MCReportMeta po_print_cd_META_0 = new MCReportMeta("po_print_cd", "", "", "", true);
	static public final MCReportMeta sppl_ship_form_cd_META_0 = new MCReportMeta("sppl_ship_form_cd", "", "", "", true);
	static public final MCReportMeta po_dlv_slip_flg_META_0 = new MCReportMeta("po_dlv_slip_flg", "", "", "", true);
	static public final MCReportMeta dlv_inst_dlv_slip_flg_META_0 = new MCReportMeta("dlv_inst_dlv_slip_flg", "", "", "", true);
	static public final MCReportMeta prms_rcpt_dlv_slip_flg_META_0 = new MCReportMeta("prms_rcpt_dlv_slip_flg", "", "", "", true);
	static public final MCReportMeta pay_crryovr_times_META_0 = new MCReportMeta("pay_crryovr_times", "", "", "", true);
	static public final MCReportMeta sppl_cntct_dpt_META_0 = new MCReportMeta("sppl_cntct_dpt", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_META_0 = new MCReportMeta("sppl_cntct_psn", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_title_META_0 = new MCReportMeta("sppl_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta purc_upri_req_typ_META_0 = new MCReportMeta("purc_upri_req_typ", "", "", "", true);
	static public final MCReportMeta purc_upri_cng_flg_META_0 = new MCReportMeta("purc_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta purc_amt_rnd_typ_META_0 = new MCReportMeta("purc_amt_rnd_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_rnd_typ_META_0 = new MCReportMeta("purc_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_calc_typ_META_0 = new MCReportMeta("purc_tax_calc_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_cd_META_0 = new MCReportMeta("purc_tax_cd", "", "", "", true);
	static public final MCReportMeta purc_tax_cd_prio_flg_META_0 = new MCReportMeta("purc_tax_cd_prio_flg", "", "", "", true);
	static public final MCReportMeta wrk_po_flg_META_0 = new MCReportMeta("wrk_po_flg", "", "", "", true);
	static public final MCReportMeta wrk_ap_flg_META_0 = new MCReportMeta("wrk_ap_flg", "", "", "", true);
	static public final MCReportMeta purc_slip_each_lot_typ_META_0 = new MCReportMeta("purc_slip_each_lot_typ", "", "", "", true);
	static public final MCReportMeta prov_rcv_typ_META_0 = new MCReportMeta("prov_rcv_typ", "", "", "", true);
	static public final MCReportMeta onr_prsppl_flg_META_0 = new MCReportMeta("onr_prsppl_flg", "", "", "", true);
	static public final MCReportMeta outsrc_upri_typ_META_0 = new MCReportMeta("outsrc_upri_typ", "", "", "", true);
	static public final MCReportMeta prov_basis_typ_META_0 = new MCReportMeta("prov_basis_typ", "", "", "", true);
	static public final MCReportMeta prov_upri_cng_flg_META_0 = new MCReportMeta("prov_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta prov_amt_rnd_typ_META_0 = new MCReportMeta("prov_amt_rnd_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_rnd_typ_META_0 = new MCReportMeta("prov_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_calc_typ_META_0 = new MCReportMeta("prov_tax_calc_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_cd_META_0 = new MCReportMeta("prov_tax_cd", "", "", "", true);
	static public final MCReportMeta prov_tax_cd_prio_flg_META_0 = new MCReportMeta("prov_tax_cd_prio_flg", "", "", "", true);
	static public final MCReportMeta sppl_cal_cd_META_0 = new MCReportMeta("sppl_cal_cd", "", "", "", true);
	static public final MCReportMeta sppl_iv_flg_META_0 = new MCReportMeta("sppl_iv_flg", "", "", "", true);
	static public final MCReportMeta rcpt_iv_dup_flg_META_0 = new MCReportMeta("rcpt_iv_dup_flg", "", "", "", true);
	static public final MCReportMeta prms_recv_flg_META_0 = new MCReportMeta("prms_recv_flg", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd1_META_0 = new MCReportMeta("sppl_tterm_cd1", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd2_META_0 = new MCReportMeta("sppl_tterm_cd2", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd3_META_0 = new MCReportMeta("sppl_tterm_cd3", "", "", "", true);
	static public final MCReportMeta purc_basis_typ_META_0 = new MCReportMeta("purc_basis_typ", "", "", "", true);
	static public final MCReportMeta repurc_obli_flg_META_0 = new MCReportMeta("repurc_obli_flg", "", "", "", true);
	static public final MCReportMeta bsppl_cd_META_0 = new MCReportMeta("bsppl_cd", "", "", "", true);
	static public final MCReportMeta ap_dpt_cd_META_0 = new MCReportMeta("ap_dpt_cd", "", "", "", true);
	static public final MCReportMeta psppl_cd_META_0 = new MCReportMeta("psppl_cd", "", "", "", true);
	static public final MCReportMeta ap_cred_cd_META_0 = new MCReportMeta("ap_cred_cd", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_META_0 = new MCReportMeta("bsppl_dpt_cd", "", "", "", true);
	static public final MCReportMeta pay_spot_flg_META_0 = new MCReportMeta("pay_spot_flg", "", "", "", true);
	static public final MCReportMeta psppl_cl_day1_META_0 = new MCReportMeta("psppl_cl_day1", "", "", "", true);
	static public final MCReportMeta psppl_cl_day2_META_0 = new MCReportMeta("psppl_cl_day2", "", "", "", true);
	static public final MCReportMeta psppl_cl_day3_META_0 = new MCReportMeta("psppl_cl_day3", "", "", "", true);
	static public final MCReportMeta psppl_cl_day4_META_0 = new MCReportMeta("psppl_cl_day4", "", "", "", true);
	static public final MCReportMeta psppl_cl_day5_META_0 = new MCReportMeta("psppl_cl_day5", "", "", "", true);
	static public final MCReportMeta purc_interim_cl_flg_META_0 = new MCReportMeta("purc_interim_cl_flg", "", "", "", true);
	static public final MCReportMeta ap_setoff_grp_cd_META_0 = new MCReportMeta("ap_setoff_grp_cd", "", "", "", true);
	static public final MCReportMeta pay_bank_ac_cd_META_0 = new MCReportMeta("pay_bank_ac_cd", "", "", "", true);
	static public final MCReportMeta pay_schd_ba_typ_META_0 = new MCReportMeta("pay_schd_ba_typ", "", "", "", true);
	static public final MCReportMeta tax_on_pay_flg_META_0 = new MCReportMeta("tax_on_pay_flg", "", "", "", true);
	static public final MCReportMeta pay_tax_rnd_typ_META_0 = new MCReportMeta("pay_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta batch_pay_schd_cl_flg_META_0 = new MCReportMeta("batch_pay_schd_cl_flg", "", "", "", true);
	static public final MCReportMeta pay_schd_cl_delay_days_META_0 = new MCReportMeta("pay_schd_cl_delay_days", "", "", "", true);
	static public final MCReportMeta pay_schd_cl_ba_typ_META_0 = new MCReportMeta("pay_schd_cl_ba_typ", "", "", "", true);
	static public final MCReportMeta biz_co_no_META_0 = new MCReportMeta("biz_co_no", "", "", "", true);
	static public final MCReportMeta pay_ntc_prnt_flg_META_0 = new MCReportMeta("pay_ntc_prnt_flg", "", "", "", true);
	static public final MCReportMeta pay_ntc_zip_cd_META_0 = new MCReportMeta("pay_ntc_zip_cd", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr1_META_0 = new MCReportMeta("pay_ntc_addr1", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr2_META_0 = new MCReportMeta("pay_ntc_addr2", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr3_META_0 = new MCReportMeta("pay_ntc_addr3", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr4_META_0 = new MCReportMeta("pay_ntc_addr4", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_nm_META_0 = new MCReportMeta("pay_ntc_bsppl_nm", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_dpt_META_0 = new MCReportMeta("pay_ntc_bsppl_dpt", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_psn_META_0 = new MCReportMeta("pay_ntc_bsppl_psn", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_psn_title_META_0 = new MCReportMeta("pay_ntc_bsppl_psn_title", "", "", "", true);
	static public final MCReportMeta pay_ntc_tel_META_0 = new MCReportMeta("pay_ntc_tel", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_outp_flg_META_0 = new MCReportMeta("pay_ntc_dtl_outp_flg", "", "", "", true);
	static public final MCReportMeta pay_ntc_bfw_bal_disp_flg_META_0 = new MCReportMeta("pay_ntc_bfw_bal_disp_flg", "", "", "", true);
	static public final MCReportMeta pay_ntc_adv_pay_flg_META_0 = new MCReportMeta("pay_ntc_adv_pay_flg", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_pay_flg_META_0 = new MCReportMeta("pay_ntc_dtl_pay_flg", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_subttl_typ_META_0 = new MCReportMeta("pay_ntc_dtl_subttl_typ", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_brk_typ_META_0 = new MCReportMeta("pay_ntc_dtl_brk_typ", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_sort_typ_META_0 = new MCReportMeta("pay_ntc_dtl_sort_typ", "", "", "", true);
	static public final MCReportMeta pay_ntc_can_slip_typ_META_0 = new MCReportMeta("pay_ntc_can_slip_typ", "", "", "", true);
	static public final MCReportMeta psppl_rmrks_META_0 = new MCReportMeta("psppl_rmrks", "", "", "", true);
	static public final MCReportMeta note_days_META_0 = new MCReportMeta("note_days", "", "", "", true);
	static public final MCReportMeta pay_dpt_cd_META_0 = new MCReportMeta("pay_dpt_cd", "", "", "", true);
	static public final MCReportMeta dlv_sundry_flg_META_0 = new MCReportMeta("dlv_sundry_flg", "", "", "", true);
	static public final MCReportMeta dlv_cntct_dpt_META_0 = new MCReportMeta("dlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_META_0 = new MCReportMeta("dlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_title_META_0 = new MCReportMeta("dlv_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta pri_prnt_flg_META_0 = new MCReportMeta("pri_prnt_flg", "", "", "", true);
	static public final MCReportMeta cnsgn_stktk_flg_META_0 = new MCReportMeta("cnsgn_stktk_flg", "", "", "", true);
	static public final MCReportMeta tdlv_flg_META_0 = new MCReportMeta("tdlv_flg", "", "", "", true);
	static public final MCReportMeta via_dlv_typ_META_0 = new MCReportMeta("via_dlv_typ", "", "", "", true);
	static public final MCReportMeta tdlv_req_flg_META_0 = new MCReportMeta("tdlv_req_flg", "", "", "", true);
	static public final MCReportMeta lg_grp_cd_META_0 = new MCReportMeta("lg_grp_cd", "", "", "", true);
	static public final MCReportMeta dlv_cal_cd_META_0 = new MCReportMeta("dlv_cal_cd", "", "", "", true);
	static public final MCReportMeta dlv_chnnl1_META_0 = new MCReportMeta("dlv_chnnl1", "", "", "", true);
	static public final MCReportMeta dlv_chnnl2_META_0 = new MCReportMeta("dlv_chnnl2", "", "", "", true);
	static public final MCReportMeta dlv_chnnl3_META_0 = new MCReportMeta("dlv_chnnl3", "", "", "", true);
	static public final MCReportMeta cst_prnt_typ_META_0 = new MCReportMeta("cst_prnt_typ", "", "", "", true);
	static public final MCReportMeta acst_prnt_typ_META_0 = new MCReportMeta("acst_prnt_typ", "", "", "", true);
	static public final MCReportMeta bcst_prnt_typ_META_0 = new MCReportMeta("bcst_prnt_typ", "", "", "", true);
	static public final MCReportMeta rcst_prnt_typ_META_0 = new MCReportMeta("rcst_prnt_typ", "", "", "", true);
	static public final MCReportMeta sppl_prnt_typ_META_0 = new MCReportMeta("sppl_prnt_typ", "", "", "", true);
	static public final MCReportMeta asppl_prnt_typ_META_0 = new MCReportMeta("asppl_prnt_typ", "", "", "", true);
	static public final MCReportMeta bsppl_prnt_typ_META_0 = new MCReportMeta("bsppl_prnt_typ", "", "", "", true);
	static public final MCReportMeta psppl_prnt_typ_META_0 = new MCReportMeta("psppl_prnt_typ", "", "", "", true);
	static public final MCReportMeta dlv_prnt_typ_META_0 = new MCReportMeta("dlv_prnt_typ", "", "", "", true);
	static public final MCReportMeta memo1_META_0 = new MCReportMeta("memo1", "", "", "", true);
	static public final MCReportMeta memo2_META_0 = new MCReportMeta("memo2", "", "", "", true);
	static public final MCReportMeta memo3_META_0 = new MCReportMeta("memo3", "", "", "", true);
	static public final MCReportMeta if_sub_char1_META_0 = new MCReportMeta("if_sub_char1", "", "", "", true);
	static public final MCReportMeta if_sub_char2_META_0 = new MCReportMeta("if_sub_char2", "", "", "", true);
	static public final MCReportMeta if_sub_char3_META_0 = new MCReportMeta("if_sub_char3", "", "", "", true);
	static public final MCReportMeta if_sub_char4_META_0 = new MCReportMeta("if_sub_char4", "", "", "", true);
	static public final MCReportMeta if_sub_char5_META_0 = new MCReportMeta("if_sub_char5", "", "", "", true);
	static public final MCReportMeta if_sub_char6_META_0 = new MCReportMeta("if_sub_char6", "", "", "", true);
	static public final MCReportMeta if_sub_char7_META_0 = new MCReportMeta("if_sub_char7", "", "", "", true);
	static public final MCReportMeta if_sub_char8_META_0 = new MCReportMeta("if_sub_char8", "", "", "", true);
	static public final MCReportMeta if_sub_char9_META_0 = new MCReportMeta("if_sub_char9", "", "", "", true);
	static public final MCReportMeta if_sub_char10_META_0 = new MCReportMeta("if_sub_char10", "", "", "", true);
	static public final MCReportMeta if_sub_char11_META_0 = new MCReportMeta("if_sub_char11", "", "", "", true);
	static public final MCReportMeta if_sub_char12_META_0 = new MCReportMeta("if_sub_char12", "", "", "", true);
	static public final MCReportMeta if_sub_char13_META_0 = new MCReportMeta("if_sub_char13", "", "", "", true);
	static public final MCReportMeta if_sub_char14_META_0 = new MCReportMeta("if_sub_char14", "", "", "", true);
	static public final MCReportMeta if_sub_char15_META_0 = new MCReportMeta("if_sub_char15", "", "", "", true);
	static public final MCReportMeta if_sub_char16_META_0 = new MCReportMeta("if_sub_char16", "", "", "", true);
	static public final MCReportMeta if_sub_char17_META_0 = new MCReportMeta("if_sub_char17", "", "", "", true);
	static public final MCReportMeta if_sub_char18_META_0 = new MCReportMeta("if_sub_char18", "", "", "", true);
	static public final MCReportMeta if_sub_char19_META_0 = new MCReportMeta("if_sub_char19", "", "", "", true);
	static public final MCReportMeta if_sub_char20_META_0 = new MCReportMeta("if_sub_char20", "", "", "", true);
	static public final MCReportMeta if_sub_char21_META_0 = new MCReportMeta("if_sub_char21", "", "", "", true);
	static public final MCReportMeta if_sub_char22_META_0 = new MCReportMeta("if_sub_char22", "", "", "", true);
	static public final MCReportMeta if_sub_char23_META_0 = new MCReportMeta("if_sub_char23", "", "", "", true);
	static public final MCReportMeta if_sub_char24_META_0 = new MCReportMeta("if_sub_char24", "", "", "", true);
	static public final MCReportMeta if_sub_char25_META_0 = new MCReportMeta("if_sub_char25", "", "", "", true);
	static public final MCReportMeta if_sub_char26_META_0 = new MCReportMeta("if_sub_char26", "", "", "", true);
	static public final MCReportMeta if_sub_char27_META_0 = new MCReportMeta("if_sub_char27", "", "", "", true);
	static public final MCReportMeta if_sub_char28_META_0 = new MCReportMeta("if_sub_char28", "", "", "", true);
	static public final MCReportMeta if_sub_char29_META_0 = new MCReportMeta("if_sub_char29", "", "", "", true);
	static public final MCReportMeta if_sub_char30_META_0 = new MCReportMeta("if_sub_char30", "", "", "", true);
	static public final MCReportMeta if_sub_num1_META_0 = new MCReportMeta("if_sub_num1", "", "", "", true);
	static public final MCReportMeta if_sub_num2_META_0 = new MCReportMeta("if_sub_num2", "", "", "", true);
	static public final MCReportMeta if_sub_num3_META_0 = new MCReportMeta("if_sub_num3", "", "", "", true);
	static public final MCReportMeta if_sub_num4_META_0 = new MCReportMeta("if_sub_num4", "", "", "", true);
	static public final MCReportMeta if_sub_num5_META_0 = new MCReportMeta("if_sub_num5", "", "", "", true);
	static public final MCReportMeta if_sub_dt1_META_0 = new MCReportMeta("if_sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt2_META_0 = new MCReportMeta("if_sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt3_META_0 = new MCReportMeta("if_sub_dt3", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt4_META_0 = new MCReportMeta("if_sub_dt4", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt5_META_0 = new MCReportMeta("if_sub_dt5", "YMD", "", "", true);
	static public final MCReportMeta memo4_META_0 = new MCReportMeta("memo4", "", "", "", true);
	static public final MCReportMeta memo5_META_0 = new MCReportMeta("memo5", "", "", "", true);
	static public final MCReportMeta memo6_META_0 = new MCReportMeta("memo6", "", "", "", true);
	static public final MCReportMeta memo7_META_0 = new MCReportMeta("memo7", "", "", "", true);
	static public final MCReportMeta memo8_META_0 = new MCReportMeta("memo8", "", "", "", true);
	static public final MCReportMeta memo9_META_0 = new MCReportMeta("memo9", "", "", "", true);
	static public final MCReportMeta memo10_META_0 = new MCReportMeta("memo10", "", "", "", true);
	static public final MCReportMeta memo11_META_0 = new MCReportMeta("memo11", "", "", "", true);
	static public final MCReportMeta memo12_META_0 = new MCReportMeta("memo12", "", "", "", true);
	static public final MCReportMeta memo13_META_0 = new MCReportMeta("memo13", "", "", "", true);
	static public final MCReportMeta memo14_META_0 = new MCReportMeta("memo14", "", "", "", true);
	static public final MCReportMeta memo15_META_0 = new MCReportMeta("memo15", "", "", "", true);
	static public final MCReportMeta memo16_META_0 = new MCReportMeta("memo16", "", "", "", true);
	static public final MCReportMeta memo17_META_0 = new MCReportMeta("memo17", "", "", "", true);
	static public final MCReportMeta memo18_META_0 = new MCReportMeta("memo18", "", "", "", true);
	static public final MCReportMeta memo19_META_0 = new MCReportMeta("memo19", "", "", "", true);
	static public final MCReportMeta memo20_META_0 = new MCReportMeta("memo20", "", "", "", true);
	static public final MCReportMeta not_lg_mix_flg_META_0 = new MCReportMeta("not_lg_mix_flg", "", "", "", true);
	static public final MCReportMeta not_lot_mix_flg_META_0 = new MCReportMeta("not_lot_mix_flg", "", "", "", true);
	static public final MCReportMeta not_sublot_mix_flg_META_0 = new MCReportMeta("not_sublot_mix_flg", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_crud_typ_META_0,
			data_make_dt_META_0,
			bp_cd_META_0,
			del_flg_META_0,
			bp_nm_META_0,
			bp_alt_nm1_META_0,
			bp_alt_nm2_META_0,
			bp_alt_nm3_META_0,
			bp_alt_nm4_META_0,
			zip_cd_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			tel_META_0,
			fax_META_0,
			ein_META_0,
			std_co_cd_META_0,
			cntry_cd_META_0,
			area_cd_META_0,
			cur_cd_META_0,
			prnt_lcl_cd_META_0,
			bp_grp_cd1_META_0,
			bp_grp_cd2_META_0,
			bp_grp_cd3_META_0,
			bp_grp_cd4_META_0,
			bp_grp_cd5_META_0,
			bp_grp_cd6_META_0,
			bp_grp_cd7_META_0,
			bp_grp_cd8_META_0,
			bp_grp_cd9_META_0,
			bp_grp_cd10_META_0,
			bp_alc_grp_META_0,
			cst_flg_META_0,
			acst_flg_META_0,
			bcst_flg_META_0,
			rcst_flg_META_0,
			sppl_flg_META_0,
			asppl_flg_META_0,
			bsppl_flg_META_0,
			psppl_flg_META_0,
			cred_flg_META_0,
			dlv_flg_META_0,
			maker_flg_META_0,
			dest_flg_META_0,
			all_com_flg_META_0,
			acst_cd_META_0,
			ar_dpt_typ_META_0,
			ar_dpt_cd_META_0,
			cst_cntct_dpt_META_0,
			cst_cntct_psn_META_0,
			cst_cntct_psn_title_META_0,
			cst_sundry_flg_META_0,
			sls_upri_req_typ_META_0,
			sls_upri_cng_flg_META_0,
			sls_upri_rnd_typ_META_0,
			sls_amt_rnd_typ_META_0,
			sls_tax_calc_typ_META_0,
			sls_tax_rnd_typ_META_0,
			sls_basis_typ_META_0,
			bill_basis_typ_META_0,
			ship_schd_split_typ_META_0,
			bill_crryovr_times_META_0,
			lot_back_stop_typ_META_0,
			slip_each_lot_typ_META_0,
			cst_ship_form_cd_META_0,
			stk_lst_issue_flg_META_0,
			stk_lst_form_cd_META_0,
			sls_tax_cd_META_0,
			sls_tax_cd_prio_flg_META_0,
			wrk_ar_flg_META_0,
			cst_iv_flg_META_0,
			ship_lt_META_0,
			cst_tterm_cd1_META_0,
			cst_tterm_cd2_META_0,
			cst_tterm_cd3_META_0,
			sls_anly_cd1_META_0,
			sls_anly_cd2_META_0,
			sls_anly_cd3_META_0,
			bcst_cd_META_0,
			rcst_cd_META_0,
			ar_cred_cd_META_0,
			bill_dpt_typ_META_0,
			bcst_dpt_cd_META_0,
			bill_cl_typ_META_0,
			bill_cl_day1_META_0,
			bill_cl_day2_META_0,
			bill_cl_day3_META_0,
			bill_cl_day4_META_0,
			bill_cl_day5_META_0,
			tax_on_bill_flg_META_0,
			bill_tax_rnd_typ_META_0,
			bill_cl_delay_days_META_0,
			bill_cl_ba_typ_META_0,
			sls_interim_cl_flg_META_0,
			bill_cal_cd_META_0,
			rcv_ba_typ_META_0,
			bill_zip_cd_META_0,
			bill_addr1_META_0,
			bill_addr2_META_0,
			bill_addr3_META_0,
			bill_addr4_META_0,
			bill_tel_META_0,
			bill_bcst_nm_META_0,
			bill_bcst_dpt_META_0,
			bill_bcst_psn_META_0,
			bill_bcst_psn_title_META_0,
			bfw_bal_disp_flg_META_0,
			sls_dtl_outp_typ_META_0,
			bill_prnt_typ_META_0,
			bill_dtl_outp_flg_META_0,
			bill_dtl_rcv_flg_META_0,
			bill_dtl_adv_flg_META_0,
			bill_dtl_subttl_typ_META_0,
			bill_dtl_brk_typ_META_0,
			bill_dtl_sort_typ_META_0,
			bill_can_slip_typ_META_0,
			auto_line_appl_flg_META_0,
			ar_setoff_grp_cd_META_0,
			xfr_psn_META_0,
			rcv_auto_appl_tgt_flg_META_0,
			rcv_amt_match_flg_META_0,
			ar_sttl_typ_match_flg_META_0,
			calc_com_paid_flg_META_0,
			auto_appl_delay_days_META_0,
			asppl_cd_META_0,
			vmi_purc_dpt_cd_META_0,
			subcon_flg_META_0,
			po_print_cd_META_0,
			sppl_ship_form_cd_META_0,
			po_dlv_slip_flg_META_0,
			dlv_inst_dlv_slip_flg_META_0,
			prms_rcpt_dlv_slip_flg_META_0,
			pay_crryovr_times_META_0,
			sppl_cntct_dpt_META_0,
			sppl_cntct_psn_META_0,
			sppl_cntct_psn_title_META_0,
			purc_upri_req_typ_META_0,
			purc_upri_cng_flg_META_0,
			purc_amt_rnd_typ_META_0,
			purc_tax_rnd_typ_META_0,
			purc_tax_calc_typ_META_0,
			purc_tax_cd_META_0,
			purc_tax_cd_prio_flg_META_0,
			wrk_po_flg_META_0,
			wrk_ap_flg_META_0,
			purc_slip_each_lot_typ_META_0,
			prov_rcv_typ_META_0,
			onr_prsppl_flg_META_0,
			outsrc_upri_typ_META_0,
			prov_basis_typ_META_0,
			prov_upri_cng_flg_META_0,
			prov_amt_rnd_typ_META_0,
			prov_tax_rnd_typ_META_0,
			prov_tax_calc_typ_META_0,
			prov_tax_cd_META_0,
			prov_tax_cd_prio_flg_META_0,
			sppl_cal_cd_META_0,
			sppl_iv_flg_META_0,
			rcpt_iv_dup_flg_META_0,
			prms_recv_flg_META_0,
			sppl_tterm_cd1_META_0,
			sppl_tterm_cd2_META_0,
			sppl_tterm_cd3_META_0,
			purc_basis_typ_META_0,
			repurc_obli_flg_META_0,
			bsppl_cd_META_0,
			ap_dpt_cd_META_0,
			psppl_cd_META_0,
			ap_cred_cd_META_0,
			bsppl_dpt_cd_META_0,
			pay_spot_flg_META_0,
			psppl_cl_day1_META_0,
			psppl_cl_day2_META_0,
			psppl_cl_day3_META_0,
			psppl_cl_day4_META_0,
			psppl_cl_day5_META_0,
			purc_interim_cl_flg_META_0,
			ap_setoff_grp_cd_META_0,
			pay_bank_ac_cd_META_0,
			pay_schd_ba_typ_META_0,
			tax_on_pay_flg_META_0,
			pay_tax_rnd_typ_META_0,
			batch_pay_schd_cl_flg_META_0,
			pay_schd_cl_delay_days_META_0,
			pay_schd_cl_ba_typ_META_0,
			biz_co_no_META_0,
			pay_ntc_prnt_flg_META_0,
			pay_ntc_zip_cd_META_0,
			pay_ntc_addr1_META_0,
			pay_ntc_addr2_META_0,
			pay_ntc_addr3_META_0,
			pay_ntc_addr4_META_0,
			pay_ntc_bsppl_nm_META_0,
			pay_ntc_bsppl_dpt_META_0,
			pay_ntc_bsppl_psn_META_0,
			pay_ntc_bsppl_psn_title_META_0,
			pay_ntc_tel_META_0,
			pay_ntc_dtl_outp_flg_META_0,
			pay_ntc_bfw_bal_disp_flg_META_0,
			pay_ntc_adv_pay_flg_META_0,
			pay_ntc_dtl_pay_flg_META_0,
			pay_ntc_dtl_subttl_typ_META_0,
			pay_ntc_dtl_brk_typ_META_0,
			pay_ntc_dtl_sort_typ_META_0,
			pay_ntc_can_slip_typ_META_0,
			psppl_rmrks_META_0,
			note_days_META_0,
			pay_dpt_cd_META_0,
			dlv_sundry_flg_META_0,
			dlv_cntct_dpt_META_0,
			dlv_cntct_psn_META_0,
			dlv_cntct_psn_title_META_0,
			pri_prnt_flg_META_0,
			cnsgn_stktk_flg_META_0,
			tdlv_flg_META_0,
			via_dlv_typ_META_0,
			tdlv_req_flg_META_0,
			lg_grp_cd_META_0,
			dlv_cal_cd_META_0,
			dlv_chnnl1_META_0,
			dlv_chnnl2_META_0,
			dlv_chnnl3_META_0,
			cst_prnt_typ_META_0,
			acst_prnt_typ_META_0,
			bcst_prnt_typ_META_0,
			rcst_prnt_typ_META_0,
			sppl_prnt_typ_META_0,
			asppl_prnt_typ_META_0,
			bsppl_prnt_typ_META_0,
			psppl_prnt_typ_META_0,
			dlv_prnt_typ_META_0,
			memo1_META_0,
			memo2_META_0,
			memo3_META_0,
			if_sub_char1_META_0,
			if_sub_char2_META_0,
			if_sub_char3_META_0,
			if_sub_char4_META_0,
			if_sub_char5_META_0,
			if_sub_char6_META_0,
			if_sub_char7_META_0,
			if_sub_char8_META_0,
			if_sub_char9_META_0,
			if_sub_char10_META_0,
			if_sub_char11_META_0,
			if_sub_char12_META_0,
			if_sub_char13_META_0,
			if_sub_char14_META_0,
			if_sub_char15_META_0,
			if_sub_char16_META_0,
			if_sub_char17_META_0,
			if_sub_char18_META_0,
			if_sub_char19_META_0,
			if_sub_char20_META_0,
			if_sub_char21_META_0,
			if_sub_char22_META_0,
			if_sub_char23_META_0,
			if_sub_char24_META_0,
			if_sub_char25_META_0,
			if_sub_char26_META_0,
			if_sub_char27_META_0,
			if_sub_char28_META_0,
			if_sub_char29_META_0,
			if_sub_char30_META_0,
			if_sub_num1_META_0,
			if_sub_num2_META_0,
			if_sub_num3_META_0,
			if_sub_num4_META_0,
			if_sub_num5_META_0,
			if_sub_dt1_META_0,
			if_sub_dt2_META_0,
			if_sub_dt3_META_0,
			if_sub_dt4_META_0,
			if_sub_dt5_META_0,
			memo4_META_0,
			memo5_META_0,
			memo6_META_0,
			memo7_META_0,
			memo8_META_0,
			memo9_META_0,
			memo10_META_0,
			memo11_META_0,
			memo12_META_0,
			memo13_META_0,
			memo14_META_0,
			memo15_META_0,
			memo16_META_0,
			memo17_META_0,
			memo18_META_0,
			memo19_META_0,
			memo20_META_0,
			not_lg_mix_flg_META_0,
			not_lot_mix_flg_META_0,
			not_sublot_mix_flg_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBER_BpPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

