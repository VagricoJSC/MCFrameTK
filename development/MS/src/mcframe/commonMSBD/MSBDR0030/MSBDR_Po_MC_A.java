package mcframe.commonMSBD.MSBDR0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBDR_Po_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBDR0030";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass POHDRR_RC = new MCReportClass("PoHdr", mcframe.commonMSBD.MSBDR0030.PoHdrR.class);
	static public final MCReportClass PODTLL_RC = new MCReportClass("PoDtl", mcframe.commonMSBD.MSBDR0030.PoDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		POHDRR_RC,
		PODTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rpt_sts_typ_nm_META_0 = new MCReportMeta("rpt_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta rpt_sts_typ_META_0 = new MCReportMeta("rpt_sts_typ", "", "", "", true);
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_rev_META_0 = new MCReportMeta("po_rev", "", "", "", true);
	static public final MCReportMeta print_hm_META_0 = new MCReportMeta("print_hm", "YMDHM", "", "", true);
	static public final MCReportMeta po_dt_META_0 = new MCReportMeta("po_dt", "YMD", "", "", true);
	static public final MCReportMeta sppl_cd_META_0 = new MCReportMeta("sppl_cd", "", "", "", true);
	static public final MCReportMeta sppl_zip_cd_META_0 = new MCReportMeta("sppl_zip_cd", "", "", "", true);
	static public final MCReportMeta sppl_addr1_META_0 = new MCReportMeta("sppl_addr1", "", "", "", true);
	static public final MCReportMeta sppl_addr2_META_0 = new MCReportMeta("sppl_addr2", "", "", "", true);
	static public final MCReportMeta sppl_addr3_META_0 = new MCReportMeta("sppl_addr3", "", "", "", true);
	static public final MCReportMeta sppl_addr4_META_0 = new MCReportMeta("sppl_addr4", "", "", "", true);
	static public final MCReportMeta sppl_addr_META_0 = new MCReportMeta("sppl_addr", "", "", "", true);
	static public final MCReportMeta sppl_nm_META_0 = new MCReportMeta("sppl_nm", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm1_META_0 = new MCReportMeta("sppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm2_META_0 = new MCReportMeta("sppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm3_META_0 = new MCReportMeta("sppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm4_META_0 = new MCReportMeta("sppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta sppl_cntct_dpt_META_0 = new MCReportMeta("sppl_cntct_dpt", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_META_0 = new MCReportMeta("sppl_cntct_psn", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_title_META_0 = new MCReportMeta("sppl_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta sppl_tel_META_0 = new MCReportMeta("sppl_tel", "", "", "", true);
	static public final MCReportMeta sppl_fax_META_0 = new MCReportMeta("sppl_fax", "", "", "", true);
	static public final MCReportMeta sppl_cntry_nm_META_0 = new MCReportMeta("sppl_cntry_nm", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta dpt_zip_cd_META_0 = new MCReportMeta("dpt_zip_cd", "", "", "", true);
	static public final MCReportMeta dpt_addr1_META_0 = new MCReportMeta("dpt_addr1", "", "", "", true);
	static public final MCReportMeta dpt_addr2_META_0 = new MCReportMeta("dpt_addr2", "", "", "", true);
	static public final MCReportMeta dpt_addr3_META_0 = new MCReportMeta("dpt_addr3", "", "", "", true);
	static public final MCReportMeta dpt_addr4_META_0 = new MCReportMeta("dpt_addr4", "", "", "", true);
	static public final MCReportMeta dpt_addr_META_0 = new MCReportMeta("dpt_addr", "", "", "", true);
	static public final MCReportMeta dpt_tel_META_0 = new MCReportMeta("dpt_tel", "", "", "", true);
	static public final MCReportMeta dpt_fax_META_0 = new MCReportMeta("dpt_fax", "", "", "", true);
	static public final MCReportMeta purc_dpt_cd_META_0 = new MCReportMeta("purc_dpt_cd", "", "", "", true);
	static public final MCReportMeta purc_dpt_nm_META_0 = new MCReportMeta("purc_dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_cntry_nm_META_0 = new MCReportMeta("dpt_cntry_nm", "", "", "", true);
	static public final MCReportMeta purc_usr_cd_META_0 = new MCReportMeta("purc_usr_cd", "", "", "", true);
	static public final MCReportMeta purc_usr_nm_META_0 = new MCReportMeta("purc_usr_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta ttl_amt_META_0 = new MCReportMeta("ttl_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_amt_META_0 = new MCReportMeta("s_ttl_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta ttl_tax_amt_META_0 = new MCReportMeta("ttl_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_tax_amt_META_0 = new MCReportMeta("s_ttl_tax_amt", "", "", "", true);
	static public final MCReportMeta po_print_cd_META_0 = new MCReportMeta("po_print_cd", "", "", "", true);
	static public final MCReportMeta po_print_txt_META_0 = new MCReportMeta("po_print_txt", "", "", "", true);
	static public final MCReportMeta po_print_txt1_META_0 = new MCReportMeta("po_print_txt1", "", "", "", true);
	static public final MCReportMeta po_print_txt2_META_0 = new MCReportMeta("po_print_txt2", "", "", "", true);
	static public final MCReportMeta po_print_txt3_META_0 = new MCReportMeta("po_print_txt3", "", "", "", true);
	static public final MCReportMeta po_print_txt4_META_0 = new MCReportMeta("po_print_txt4", "", "", "", true);
	static public final MCReportMeta po_print_txt5_META_0 = new MCReportMeta("po_print_txt5", "", "", "", true);
	static public final MCReportMeta po_print_txt6_META_0 = new MCReportMeta("po_print_txt6", "", "", "", true);
	static public final MCReportMeta crct_rsn_cd_META_0 = new MCReportMeta("crct_rsn_cd", "", "", "", true);
	static public final MCReportMeta po_crct_rsn_nm_META_0 = new MCReportMeta("po_crct_rsn_nm", "", "", "", true);
	static public final MCReportMeta po_crct_rsn_rmrks_META_0 = new MCReportMeta("po_crct_rsn_rmrks", "", "", "", true);
	static public final MCReportMeta upd_po_print_schd_dt_META_0 = new MCReportMeta("upd_po_print_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta tterm_cd1_META_0 = new MCReportMeta("tterm_cd1", "", "", "", true);
	static public final MCReportMeta tterm_nm1_META_0 = new MCReportMeta("tterm_nm1", "", "", "", true);
	static public final MCReportMeta tterm_rmrks1_META_0 = new MCReportMeta("tterm_rmrks1", "", "", "", true);
	static public final MCReportMeta tterm_cd2_META_0 = new MCReportMeta("tterm_cd2", "", "", "", true);
	static public final MCReportMeta tterm_nm2_META_0 = new MCReportMeta("tterm_nm2", "", "", "", true);
	static public final MCReportMeta tterm_rmrks2_META_0 = new MCReportMeta("tterm_rmrks2", "", "", "", true);
	static public final MCReportMeta tterm_cd3_META_0 = new MCReportMeta("tterm_cd3", "", "", "", true);
	static public final MCReportMeta tterm_nm3_META_0 = new MCReportMeta("tterm_nm3", "", "", "", true);
	static public final MCReportMeta tterm_rmrks3_META_0 = new MCReportMeta("tterm_rmrks3", "", "", "", true);
	static public final MCReportMeta po_print_rmrks_META_0 = new MCReportMeta("po_print_rmrks", "", "", "", true);

	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta iv_itm_nm_META_1 = new MCReportMeta("iv_itm_nm", "", "", "", true);
	static public final MCReportMeta sno1_META_1 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_1 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_1 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_1 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_1 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_1 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta abort_qty_META_1 = new MCReportMeta("abort_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_abort_qty_META_1 = new MCReportMeta("s_int_abort_qty", "", "", "", true);
	static public final MCReportMeta s_dec_abort_qty_META_1 = new MCReportMeta("s_dec_abort_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta t_interim_META_1 = new MCReportMeta("t_interim", "", "2", "", true);
	static public final MCReportMeta interim_flg_META_1 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_upri_META_1 = new MCReportMeta("s_int_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_upri_META_1 = new MCReportMeta("s_dec_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt_META_1 = new MCReportMeta("s_int_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt_META_1 = new MCReportMeta("s_dec_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_1 = new MCReportMeta("trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_int_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_dec_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta t_inc_tax_META_1 = new MCReportMeta("t_inc_tax", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_amt_META_1 = new MCReportMeta("s_int_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_amt_META_1 = new MCReportMeta("s_dec_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_1 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_tm_META_1 = new MCReportMeta("dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta insp_end_dt_lbl_META_1 = new MCReportMeta("insp_end_dt_lbl", "", "", "", true);
	static public final MCReportMeta insp_end_dt_META_1 = new MCReportMeta("insp_end_dt", "YMD", "", "", true);
	static public final MCReportMeta in_to_loc_cd_META_1 = new MCReportMeta("in_to_loc_cd", "", "", "", true);
	static public final MCReportMeta in_to_loc_nm_META_1 = new MCReportMeta("in_to_loc_nm", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm1_META_1 = new MCReportMeta("in_to_loc_alt_nm1", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm2_META_1 = new MCReportMeta("in_to_loc_alt_nm2", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm3_META_1 = new MCReportMeta("in_to_loc_alt_nm3", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm4_META_1 = new MCReportMeta("in_to_loc_alt_nm4", "", "", "", true);
	static public final MCReportMeta sppl_itm_cd_META_1 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_1 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_1 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta maker_cd_META_1 = new MCReportMeta("maker_cd", "", "", "", true);
	static public final MCReportMeta maker_nm_META_1 = new MCReportMeta("maker_nm", "", "", "", true);
	static public final MCReportMeta maker_alt_nm1_META_1 = new MCReportMeta("maker_alt_nm1", "", "", "", true);
	static public final MCReportMeta maker_alt_nm2_META_1 = new MCReportMeta("maker_alt_nm2", "", "", "", true);
	static public final MCReportMeta maker_alt_nm3_META_1 = new MCReportMeta("maker_alt_nm3", "", "", "", true);
	static public final MCReportMeta maker_alt_nm4_META_1 = new MCReportMeta("maker_alt_nm4", "", "", "", true);
	static public final MCReportMeta po_print_d_rmrks_META_1 = new MCReportMeta("po_print_d_rmrks", "", "", "", true);
	static public final MCReportMeta po_d_no_META_1 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta t_abort_META_1 = new MCReportMeta("t_abort", "", "", "", true);
	static public final MCReportMeta abort_flg_META_1 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_proc_upri_META_1 = new MCReportMeta("trd_cur_proc_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_proc_upri_META_1 = new MCReportMeta("s_int_trd_cur_proc_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_proc_upri_META_1 = new MCReportMeta("s_dec_trd_cur_proc_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_proc_amt_META_1 = new MCReportMeta("trd_cur_proc_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_proc_amt_META_1 = new MCReportMeta("s_int_trd_cur_proc_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_proc_amt_META_1 = new MCReportMeta("s_dec_trd_cur_proc_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_onr_prov_upri_META_1 = new MCReportMeta("trd_cur_onr_prov_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_onr_prov_upri_META_1 = new MCReportMeta("s_int_trd_cur_onr_prov_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_onr_prov_upri_META_1 = new MCReportMeta("s_dec_trd_cur_onr_prov_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_onr_prov_amt_META_1 = new MCReportMeta("trd_cur_onr_prov_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_onr_prov_amt_META_1 = new MCReportMeta("s_int_trd_cur_onr_prov_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_onr_prov_amt_META_1 = new MCReportMeta("s_dec_trd_cur_onr_prov_amt", "", "", "", true);
	static public final MCReportMeta repurc_obli_flg_META_1 = new MCReportMeta("repurc_obli_flg", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);
	static public final MCReportMeta in_to_loc_zip_cd_META_1 = new MCReportMeta("in_to_loc_zip_cd", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr1_META_1 = new MCReportMeta("in_to_loc_addr1", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr2_META_1 = new MCReportMeta("in_to_loc_addr2", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr3_META_1 = new MCReportMeta("in_to_loc_addr3", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr4_META_1 = new MCReportMeta("in_to_loc_addr4", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr_META_1 = new MCReportMeta("in_to_loc_addr", "", "", "", true);
	static public final MCReportMeta in_to_loc_tel_META_1 = new MCReportMeta("in_to_loc_tel", "", "", "", true);
	static public final MCReportMeta in_to_loc_fax_META_1 = new MCReportMeta("in_to_loc_fax", "", "", "", true);
	static public final MCReportMeta in_to_loc_cntct_dpt_META_1 = new MCReportMeta("in_to_loc_cntct_dpt", "", "", "", true);
	static public final MCReportMeta in_to_loc_cntct_psn_META_1 = new MCReportMeta("in_to_loc_cntct_psn", "", "", "", true);
	static public final MCReportMeta in_to_cntry_nm_META_1 = new MCReportMeta("in_to_cntry_nm", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_1 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_1 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta dlv_cd_META_1 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dlv_zip_cd_META_1 = new MCReportMeta("dlv_zip_cd", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_1 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_1 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_1 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_1 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_1 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_tel_META_1 = new MCReportMeta("dlv_tel", "", "", "", true);
	static public final MCReportMeta dlv_fax_META_1 = new MCReportMeta("dlv_fax", "", "", "", true);
	static public final MCReportMeta dlv_cntct_dpt_META_1 = new MCReportMeta("dlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_META_1 = new MCReportMeta("dlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_1 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta tdlv_cd_META_1 = new MCReportMeta("tdlv_cd", "", "", "", true);
	static public final MCReportMeta tdlv_zip_cd_META_1 = new MCReportMeta("tdlv_zip_cd", "", "", "", true);
	static public final MCReportMeta tdlv_addr1_META_1 = new MCReportMeta("tdlv_addr1", "", "", "", true);
	static public final MCReportMeta tdlv_addr2_META_1 = new MCReportMeta("tdlv_addr2", "", "", "", true);
	static public final MCReportMeta tdlv_addr3_META_1 = new MCReportMeta("tdlv_addr3", "", "", "", true);
	static public final MCReportMeta tdlv_addr4_META_1 = new MCReportMeta("tdlv_addr4", "", "", "", true);
	static public final MCReportMeta tdlv_addr_META_1 = new MCReportMeta("tdlv_addr", "", "", "", true);
	static public final MCReportMeta tdlv_tel_META_1 = new MCReportMeta("tdlv_tel", "", "", "", true);
	static public final MCReportMeta tdlv_fax_META_1 = new MCReportMeta("tdlv_fax", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_dpt_META_1 = new MCReportMeta("tdlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_psn_META_1 = new MCReportMeta("tdlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta tdlv_cntry_nm_META_1 = new MCReportMeta("tdlv_cntry_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PoHdr",
			rpt_sts_typ_nm_META_0,
			rpt_sts_typ_META_0,
			po_no_META_0,
			po_rev_META_0,
			print_hm_META_0,
			po_dt_META_0,
			sppl_cd_META_0,
			sppl_zip_cd_META_0,
			sppl_addr1_META_0,
			sppl_addr2_META_0,
			sppl_addr3_META_0,
			sppl_addr4_META_0,
			sppl_addr_META_0,
			sppl_nm_META_0,
			sppl_alt_nm1_META_0,
			sppl_alt_nm2_META_0,
			sppl_alt_nm3_META_0,
			sppl_alt_nm4_META_0,
			sppl_cntct_dpt_META_0,
			sppl_cntct_psn_META_0,
			sppl_cntct_psn_title_META_0,
			sppl_tel_META_0,
			sppl_fax_META_0,
			sppl_cntry_nm_META_0,
			co_cd_META_0,
			co_nm_META_0,
			dpt_zip_cd_META_0,
			dpt_addr1_META_0,
			dpt_addr2_META_0,
			dpt_addr3_META_0,
			dpt_addr4_META_0,
			dpt_addr_META_0,
			dpt_tel_META_0,
			dpt_fax_META_0,
			purc_dpt_cd_META_0,
			purc_dpt_nm_META_0,
			dpt_cntry_nm_META_0,
			purc_usr_cd_META_0,
			purc_usr_nm_META_0,
			trd_cd_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			ttl_amt_META_0,
			s_ttl_amt_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			ttl_tax_amt_META_0,
			s_ttl_tax_amt_META_0,
			po_print_cd_META_0,
			po_print_txt_META_0,
			po_print_txt1_META_0,
			po_print_txt2_META_0,
			po_print_txt3_META_0,
			po_print_txt4_META_0,
			po_print_txt5_META_0,
			po_print_txt6_META_0,
			crct_rsn_cd_META_0,
			po_crct_rsn_nm_META_0,
			po_crct_rsn_rmrks_META_0,
			upd_po_print_schd_dt_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			tterm_cd1_META_0,
			tterm_nm1_META_0,
			tterm_rmrks1_META_0,
			tterm_cd2_META_0,
			tterm_nm2_META_0,
			tterm_rmrks2_META_0,
			tterm_cd3_META_0,
			tterm_nm3_META_0,
			tterm_rmrks3_META_0,
			po_print_rmrks_META_0
		);
		reportMetaMap.add("PoDtl",
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_view_META_1,
			itm_sub2_data_META_1,
			itm_sub3_view_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			iv_itm_nm_META_1,
			sno1_META_1,
			sno2_META_1,
			sno3_META_1,
			sno4_META_1,
			ver_no_lbl_META_1,
			ver_no_META_1,
			trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			abort_qty_META_1,
			s_int_abort_qty_META_1,
			s_dec_abort_qty_META_1,
			base_unit_cd_META_1,
			base_unit_nm_META_1,
			t_interim_META_1,
			interim_flg_META_1,
			trd_cur_upri_META_1,
			s_int_trd_cur_upri_META_1,
			s_dec_trd_cur_upri_META_1,
			trd_cur_amt_META_1,
			s_int_trd_cur_amt_META_1,
			s_dec_trd_cur_amt_META_1,
			trd_cur_dscnt_amt_META_1,
			s_int_trd_cur_dscnt_amt_META_1,
			s_dec_trd_cur_dscnt_amt_META_1,
			t_inc_tax_META_1,
			inc_tax_flg_META_1,
			trd_cur_tax_amt_META_1,
			s_int_trd_cur_tax_amt_META_1,
			s_dec_trd_cur_tax_amt_META_1,
			dlv_rqst_dt_META_1,
			dlv_rqst_tm_META_1,
			insp_end_dt_lbl_META_1,
			insp_end_dt_META_1,
			in_to_loc_cd_META_1,
			in_to_loc_nm_META_1,
			in_to_loc_alt_nm1_META_1,
			in_to_loc_alt_nm2_META_1,
			in_to_loc_alt_nm3_META_1,
			in_to_loc_alt_nm4_META_1,
			sppl_itm_cd_META_1,
			sppl_itm_nm_META_1,
			bp_lot_no_META_1,
			maker_cd_META_1,
			maker_nm_META_1,
			maker_alt_nm1_META_1,
			maker_alt_nm2_META_1,
			maker_alt_nm3_META_1,
			maker_alt_nm4_META_1,
			po_print_d_rmrks_META_1,
			po_d_no_META_1,
			t_abort_META_1,
			abort_flg_META_1,
			trd_cur_proc_upri_META_1,
			s_int_trd_cur_proc_upri_META_1,
			s_dec_trd_cur_proc_upri_META_1,
			trd_cur_proc_amt_META_1,
			s_int_trd_cur_proc_amt_META_1,
			s_dec_trd_cur_proc_amt_META_1,
			trd_cur_onr_prov_upri_META_1,
			s_int_trd_cur_onr_prov_upri_META_1,
			s_dec_trd_cur_onr_prov_upri_META_1,
			trd_cur_onr_prov_amt_META_1,
			s_int_trd_cur_onr_prov_amt_META_1,
			s_dec_trd_cur_onr_prov_amt_META_1,
			repurc_obli_flg_META_1,
			disp_seq_META_1,
			d_sub_char1_META_1,
			d_sub_char2_META_1,
			d_sub_char3_META_1,
			in_to_loc_zip_cd_META_1,
			in_to_loc_addr1_META_1,
			in_to_loc_addr2_META_1,
			in_to_loc_addr3_META_1,
			in_to_loc_addr4_META_1,
			in_to_loc_addr_META_1,
			in_to_loc_tel_META_1,
			in_to_loc_fax_META_1,
			in_to_loc_cntct_dpt_META_1,
			in_to_loc_cntct_psn_META_1,
			in_to_cntry_nm_META_1,
			cst_po_no_META_1,
			cst_po_d_no_META_1,
			dlv_cd_META_1,
			dlv_zip_cd_META_1,
			dlv_addr1_META_1,
			dlv_addr2_META_1,
			dlv_addr3_META_1,
			dlv_addr4_META_1,
			dlv_addr_META_1,
			dlv_tel_META_1,
			dlv_fax_META_1,
			dlv_cntct_dpt_META_1,
			dlv_cntct_psn_META_1,
			dlv_cntry_nm_META_1,
			tdlv_cd_META_1,
			tdlv_zip_cd_META_1,
			tdlv_addr1_META_1,
			tdlv_addr2_META_1,
			tdlv_addr3_META_1,
			tdlv_addr4_META_1,
			tdlv_addr_META_1,
			tdlv_tel_META_1,
			tdlv_fax_META_1,
			tdlv_cntct_dpt_META_1,
			tdlv_cntct_psn_META_1,
			tdlv_cntry_nm_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBDR_Po_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

