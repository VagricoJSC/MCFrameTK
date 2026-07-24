package mcframe.commonMSBD.MSBDR0060;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBDR_PurcRet_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBDR0060";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PURCRETHDRR_RC = new MCReportClass("PurcRetHdr", mcframe.commonMSBD.MSBDR0060.PurcRetHdrR.class);
	static public final MCReportClass PURCRETDTLL_RC = new MCReportClass("PurcRetDtl", mcframe.commonMSBD.MSBDR0060.PurcRetDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PURCRETHDRR_RC,
		PURCRETDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rpt_sts_typ_nm_META_0 = new MCReportMeta("rpt_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta rpt_sts_typ_META_0 = new MCReportMeta("rpt_sts_typ", "", "", "", true);
	static public final MCReportMeta purc_ret_act_no_META_0 = new MCReportMeta("purc_ret_act_no", "", "", "", true);
	static public final MCReportMeta purc_ret_act_rev_META_0 = new MCReportMeta("purc_ret_act_rev", "", "", "", true);
	static public final MCReportMeta print_hm_META_0 = new MCReportMeta("print_hm", "YMDHM", "", "", true);
	static public final MCReportMeta sppl_zip_cd_META_0 = new MCReportMeta("sppl_zip_cd", "", "", "", true);
	static public final MCReportMeta sppl_addr1_META_0 = new MCReportMeta("sppl_addr1", "", "", "", true);
	static public final MCReportMeta sppl_addr2_META_0 = new MCReportMeta("sppl_addr2", "", "", "", true);
	static public final MCReportMeta sppl_addr3_META_0 = new MCReportMeta("sppl_addr3", "", "", "", true);
	static public final MCReportMeta sppl_addr4_META_0 = new MCReportMeta("sppl_addr4", "", "", "", true);
	static public final MCReportMeta sppl_addr_META_0 = new MCReportMeta("sppl_addr", "", "", "", true);
	static public final MCReportMeta sppl_cd_META_0 = new MCReportMeta("sppl_cd", "", "", "", true);
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
	static public final MCReportMeta dpt_cntry_nm_META_0 = new MCReportMeta("dpt_cntry_nm", "", "", "", true);
	static public final MCReportMeta purc_dpt_cd_META_0 = new MCReportMeta("purc_dpt_cd", "", "", "", true);
	static public final MCReportMeta purc_dpt_nm_META_0 = new MCReportMeta("purc_dpt_nm", "", "", "", true);
	static public final MCReportMeta purc_usr_cd_META_0 = new MCReportMeta("purc_usr_cd", "", "", "", true);
	static public final MCReportMeta purc_usr_nm_META_0 = new MCReportMeta("purc_usr_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta purc_ret_dt_META_0 = new MCReportMeta("purc_ret_dt", "YMD", "", "", true);
	static public final MCReportMeta purc_ret_act_sub_char1_META_0 = new MCReportMeta("purc_ret_act_sub_char1", "", "", "", true);
	static public final MCReportMeta purc_ret_act_sub_char2_META_0 = new MCReportMeta("purc_ret_act_sub_char2", "", "", "", true);
	static public final MCReportMeta purc_ret_act_sub_char3_META_0 = new MCReportMeta("purc_ret_act_sub_char3", "", "", "", true);
	static public final MCReportMeta purc_act_sub_char1_META_0 = new MCReportMeta("purc_act_sub_char1", "", "", "", true);
	static public final MCReportMeta purc_act_sub_char2_META_0 = new MCReportMeta("purc_act_sub_char2", "", "", "", true);
	static public final MCReportMeta purc_act_sub_char3_META_0 = new MCReportMeta("purc_act_sub_char3", "", "", "", true);
	static public final MCReportMeta ttl_amt_META_0 = new MCReportMeta("ttl_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_amt_META_0 = new MCReportMeta("s_ttl_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta ttl_tax_amt_META_0 = new MCReportMeta("ttl_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_tax_amt_META_0 = new MCReportMeta("s_ttl_tax_amt", "", "", "", true);
	static public final MCReportMeta purc_ret_print_rmrks_META_0 = new MCReportMeta("purc_ret_print_rmrks", "", "", "", true);
	static public final MCReportMeta ret_sppl_zip_cd_META_0 = new MCReportMeta("ret_sppl_zip_cd", "", "", "", true);
	static public final MCReportMeta ret_sppl_addr1_META_0 = new MCReportMeta("ret_sppl_addr1", "", "", "", true);
	static public final MCReportMeta ret_sppl_addr2_META_0 = new MCReportMeta("ret_sppl_addr2", "", "", "", true);
	static public final MCReportMeta ret_sppl_addr3_META_0 = new MCReportMeta("ret_sppl_addr3", "", "", "", true);
	static public final MCReportMeta ret_sppl_addr4_META_0 = new MCReportMeta("ret_sppl_addr4", "", "", "", true);
	static public final MCReportMeta ret_sppl_addr_META_0 = new MCReportMeta("ret_sppl_addr", "", "", "", true);
	static public final MCReportMeta ret_sppl_nm_META_0 = new MCReportMeta("ret_sppl_nm", "", "", "", true);
	static public final MCReportMeta ret_sppl_cntct_dpt_META_0 = new MCReportMeta("ret_sppl_cntct_dpt", "", "", "", true);
	static public final MCReportMeta ret_sppl_cntct_psn_META_0 = new MCReportMeta("ret_sppl_cntct_psn", "", "", "", true);
	static public final MCReportMeta ret_sppl_cntct_psn_title_META_0 = new MCReportMeta("ret_sppl_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta ret_sppl_tel_META_0 = new MCReportMeta("ret_sppl_tel", "", "", "", true);
	static public final MCReportMeta ret_sppl_fax_META_0 = new MCReportMeta("ret_sppl_fax", "", "", "", true);
	static public final MCReportMeta ret_cntry_nm_META_0 = new MCReportMeta("ret_cntry_nm", "", "", "", true);

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
	static public final MCReportMeta sublot_no_META_1 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta lot_no_META_1 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_1 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_1 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta interim_flg_META_1 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta t_interim_META_1 = new MCReportMeta("t_interim", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_upri_META_1 = new MCReportMeta("s_int_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_upri_META_1 = new MCReportMeta("s_dec_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt_META_1 = new MCReportMeta("s_int_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt_META_1 = new MCReportMeta("s_dec_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta t_inc_tax_META_1 = new MCReportMeta("t_inc_tax", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_amt_META_1 = new MCReportMeta("s_int_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_amt_META_1 = new MCReportMeta("s_dec_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_1 = new MCReportMeta("trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_int_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_dec_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta ret_rsn_cd_META_1 = new MCReportMeta("ret_rsn_cd", "", "", "", true);
	static public final MCReportMeta ret_rsn_nm_META_1 = new MCReportMeta("ret_rsn_nm", "", "", "", true);
	static public final MCReportMeta po_no_META_1 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta sppl_itm_cd_META_1 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_1 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_1 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta purc_ret_print_d_rmrks_META_1 = new MCReportMeta("purc_ret_print_d_rmrks", "", "", "", true);
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
	static public final MCReportMeta purc_ret_act_d_sub_char1_META_1 = new MCReportMeta("purc_ret_act_d_sub_char1", "", "", "", true);
	static public final MCReportMeta purc_ret_act_d_sub_char2_META_1 = new MCReportMeta("purc_ret_act_d_sub_char2", "", "", "", true);
	static public final MCReportMeta purc_ret_act_d_sub_char3_META_1 = new MCReportMeta("purc_ret_act_d_sub_char3", "", "", "", true);
	static public final MCReportMeta purc_act_d_sub_char1_META_1 = new MCReportMeta("purc_act_d_sub_char1", "", "", "", true);
	static public final MCReportMeta purc_act_d_sub_char2_META_1 = new MCReportMeta("purc_act_d_sub_char2", "", "", "", true);
	static public final MCReportMeta purc_act_d_sub_char3_META_1 = new MCReportMeta("purc_act_d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PurcRetHdr",
			rpt_sts_typ_nm_META_0,
			rpt_sts_typ_META_0,
			purc_ret_act_no_META_0,
			purc_ret_act_rev_META_0,
			print_hm_META_0,
			sppl_zip_cd_META_0,
			sppl_addr1_META_0,
			sppl_addr2_META_0,
			sppl_addr3_META_0,
			sppl_addr4_META_0,
			sppl_addr_META_0,
			sppl_cd_META_0,
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
			dpt_cntry_nm_META_0,
			purc_dpt_cd_META_0,
			purc_dpt_nm_META_0,
			purc_usr_cd_META_0,
			purc_usr_nm_META_0,
			trd_cd_META_0,
			purc_ret_dt_META_0,
			purc_ret_act_sub_char1_META_0,
			purc_ret_act_sub_char2_META_0,
			purc_ret_act_sub_char3_META_0,
			purc_act_sub_char1_META_0,
			purc_act_sub_char2_META_0,
			purc_act_sub_char3_META_0,
			ttl_amt_META_0,
			s_ttl_amt_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			ttl_tax_amt_META_0,
			s_ttl_tax_amt_META_0,
			purc_ret_print_rmrks_META_0,
			ret_sppl_zip_cd_META_0,
			ret_sppl_addr1_META_0,
			ret_sppl_addr2_META_0,
			ret_sppl_addr3_META_0,
			ret_sppl_addr4_META_0,
			ret_sppl_addr_META_0,
			ret_sppl_nm_META_0,
			ret_sppl_cntct_dpt_META_0,
			ret_sppl_cntct_psn_META_0,
			ret_sppl_cntct_psn_title_META_0,
			ret_sppl_tel_META_0,
			ret_sppl_fax_META_0,
			ret_cntry_nm_META_0
		);
		reportMetaMap.add("PurcRetDtl",
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
			sublot_no_META_1,
			lot_no_META_1,
			ver_no_lbl_META_1,
			ver_no_META_1,
			trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			interim_flg_META_1,
			t_interim_META_1,
			trd_cur_upri_META_1,
			s_int_trd_cur_upri_META_1,
			s_dec_trd_cur_upri_META_1,
			trd_cur_amt_META_1,
			s_int_trd_cur_amt_META_1,
			s_dec_trd_cur_amt_META_1,
			inc_tax_flg_META_1,
			t_inc_tax_META_1,
			trd_cur_tax_amt_META_1,
			s_int_trd_cur_tax_amt_META_1,
			s_dec_trd_cur_tax_amt_META_1,
			trd_cur_dscnt_amt_META_1,
			s_int_trd_cur_dscnt_amt_META_1,
			s_dec_trd_cur_dscnt_amt_META_1,
			ret_rsn_cd_META_1,
			ret_rsn_nm_META_1,
			po_no_META_1,
			sppl_itm_cd_META_1,
			sppl_itm_nm_META_1,
			bp_lot_no_META_1,
			purc_ret_print_d_rmrks_META_1,
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
			purc_ret_act_d_sub_char1_META_1,
			purc_ret_act_d_sub_char2_META_1,
			purc_ret_act_d_sub_char3_META_1,
			purc_act_d_sub_char1_META_1,
			purc_act_d_sub_char2_META_1,
			purc_act_d_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBDR_PurcRet_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

