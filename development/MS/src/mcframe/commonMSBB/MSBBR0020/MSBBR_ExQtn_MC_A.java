package mcframe.commonMSBB.MSBBR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBBR_ExQtn_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBBR0020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass QTNHDRR_RC = new MCReportClass("QtnHdr", mcframe.commonMSBB.MSBBR0010.QtnHdrR.class);
	static public final MCReportClass QTNDTLL_RC = new MCReportClass("QtnDtl", mcframe.commonMSBB.MSBBR0010.QtnDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		QTNHDRR_RC,
		QTNDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta cst_cd_META_0 = new MCReportMeta("cst_cd", "", "", "", true);
	static public final MCReportMeta cst_zip_cd_META_0 = new MCReportMeta("cst_zip_cd", "", "", "", true);
	static public final MCReportMeta cst_addr1_META_0 = new MCReportMeta("cst_addr1", "", "", "", true);
	static public final MCReportMeta cst_addr2_META_0 = new MCReportMeta("cst_addr2", "", "", "", true);
	static public final MCReportMeta cst_addr3_META_0 = new MCReportMeta("cst_addr3", "", "", "", true);
	static public final MCReportMeta cst_addr4_META_0 = new MCReportMeta("cst_addr4", "", "", "", true);
	static public final MCReportMeta cst_addr_META_0 = new MCReportMeta("cst_addr", "", "", "", true);
	static public final MCReportMeta cst_nm_META_0 = new MCReportMeta("cst_nm", "", "", "", true);
	static public final MCReportMeta cst_alt_nm1_META_0 = new MCReportMeta("cst_alt_nm1", "", "", "", true);
	static public final MCReportMeta cst_alt_nm2_META_0 = new MCReportMeta("cst_alt_nm2", "", "", "", true);
	static public final MCReportMeta cst_alt_nm3_META_0 = new MCReportMeta("cst_alt_nm3", "", "", "", true);
	static public final MCReportMeta cst_alt_nm4_META_0 = new MCReportMeta("cst_alt_nm4", "", "", "", true);
	static public final MCReportMeta cst_cntct_dpt_META_0 = new MCReportMeta("cst_cntct_dpt", "", "", "", true);
	static public final MCReportMeta cst_cntct_psn_META_0 = new MCReportMeta("cst_cntct_psn", "", "", "", true);
	static public final MCReportMeta cst_cntct_psn_title_META_0 = new MCReportMeta("cst_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta cst_tel_META_0 = new MCReportMeta("cst_tel", "", "", "", true);
	static public final MCReportMeta cst_fax_META_0 = new MCReportMeta("cst_fax", "", "", "", true);
	static public final MCReportMeta cst_cntry_nm_META_0 = new MCReportMeta("cst_cntry_nm", "", "", "", true);
	static public final MCReportMeta qtn_prnt_dt_META_0 = new MCReportMeta("qtn_prnt_dt", "YMD", "", "", true);
	static public final MCReportMeta sls_dpt_cd_META_0 = new MCReportMeta("sls_dpt_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_zip_cd_META_0 = new MCReportMeta("sls_dpt_zip_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr1_META_0 = new MCReportMeta("sls_dpt_addr1", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr2_META_0 = new MCReportMeta("sls_dpt_addr2", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr3_META_0 = new MCReportMeta("sls_dpt_addr3", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr4_META_0 = new MCReportMeta("sls_dpt_addr4", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr_META_0 = new MCReportMeta("sls_dpt_addr", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta sls_dpt_nm_META_0 = new MCReportMeta("sls_dpt_nm", "", "", "", true);
	static public final MCReportMeta sls_usr_cd_META_0 = new MCReportMeta("sls_usr_cd", "", "", "", true);
	static public final MCReportMeta sls_usr_nm_META_0 = new MCReportMeta("sls_usr_nm", "", "", "", true);
	static public final MCReportMeta sls_dpt_tel_META_0 = new MCReportMeta("sls_dpt_tel", "", "", "", true);
	static public final MCReportMeta sls_dpt_fax_META_0 = new MCReportMeta("sls_dpt_fax", "", "", "", true);
	static public final MCReportMeta sls_cntry_nm_META_0 = new MCReportMeta("sls_cntry_nm", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_amt_META_0 = new MCReportMeta("ttl_trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_tax_amt_META_0 = new MCReportMeta("ttl_trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_tax_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta qtn_no_META_0 = new MCReportMeta("qtn_no", "", "", "", true);
	static public final MCReportMeta qtn_rev_META_0 = new MCReportMeta("qtn_rev", "", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta qtn_dt_META_0 = new MCReportMeta("qtn_dt", "YMD", "", "", true);
	static public final MCReportMeta valid_dt_META_0 = new MCReportMeta("valid_dt", "YMD", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta trnspt_cd_META_0 = new MCReportMeta("trnspt_cd", "", "", "", true);
	static public final MCReportMeta trnspt_nm_META_0 = new MCReportMeta("trnspt_nm", "", "", "", true);
	static public final MCReportMeta tterm_cd1_META_0 = new MCReportMeta("tterm_cd1", "", "", "", true);
	static public final MCReportMeta tterm_cd2_META_0 = new MCReportMeta("tterm_cd2", "", "", "", true);
	static public final MCReportMeta tterm_cd3_META_0 = new MCReportMeta("tterm_cd3", "", "", "", true);
	static public final MCReportMeta tterm_nm1_META_0 = new MCReportMeta("tterm_nm1", "", "", "", true);
	static public final MCReportMeta tterm_rmrks1_META_0 = new MCReportMeta("tterm_rmrks1", "", "", "", true);
	static public final MCReportMeta tterm_nm2_META_0 = new MCReportMeta("tterm_nm2", "", "", "", true);
	static public final MCReportMeta tterm_rmrks2_META_0 = new MCReportMeta("tterm_rmrks2", "", "", "", true);
	static public final MCReportMeta tterm_nm3_META_0 = new MCReportMeta("tterm_nm3", "", "", "", true);
	static public final MCReportMeta tterm_rmrks3_META_0 = new MCReportMeta("tterm_rmrks3", "", "", "", true);
	static public final MCReportMeta qtn_term_cd_META_0 = new MCReportMeta("qtn_term_cd", "", "", "", true);
	static public final MCReportMeta qtn_term_nm_META_0 = new MCReportMeta("qtn_term_nm", "", "", "", true);
	static public final MCReportMeta qtn_rmrks_META_0 = new MCReportMeta("qtn_rmrks", "", "", "", true);

	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta iv_itm_nm_META_1 = new MCReportMeta("iv_itm_nm", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta cntry_org_cd_META_1 = new MCReportMeta("cntry_org_cd", "", "", "", true);
	static public final MCReportMeta interim_flg_META_1 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta t_interim_META_1 = new MCReportMeta("t_interim", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta t_inc_tax_META_1 = new MCReportMeta("t_inc_tax", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_upri_META_1 = new MCReportMeta("s_int_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_upri_META_1 = new MCReportMeta("s_dec_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_std_sls_upri_META_1 = new MCReportMeta("trd_cur_std_sls_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_std_sls_upri_META_1 = new MCReportMeta("s_int_trd_cur_std_sls_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_std_sls_upri_META_1 = new MCReportMeta("s_dec_trd_cur_std_sls_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt_META_1 = new MCReportMeta("s_int_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt_META_1 = new MCReportMeta("s_dec_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_std_sls_amt_META_1 = new MCReportMeta("trd_cur_std_sls_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_std_sls_amt_META_1 = new MCReportMeta("s_int_trd_cur_std_sls_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_std_sls_amt_META_1 = new MCReportMeta("s_dec_trd_cur_std_sls_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_1 = new MCReportMeta("trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_int_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_dec_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_amt_META_1 = new MCReportMeta("s_int_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_amt_META_1 = new MCReportMeta("s_dec_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta tax_rate_META_1 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta s_tax_rate_META_1 = new MCReportMeta("s_tax_rate", "", "", "", true);
	static public final MCReportMeta dlv_cd_META_1 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dlv_nm_META_1 = new MCReportMeta("dlv_nm", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm1_META_1 = new MCReportMeta("dlv_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm2_META_1 = new MCReportMeta("dlv_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm3_META_1 = new MCReportMeta("dlv_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm4_META_1 = new MCReportMeta("dlv_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_1 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_1 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_1 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_1 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_1 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_1 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta qtn_d_rmrks_META_1 = new MCReportMeta("qtn_d_rmrks", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("QtnHdr",
			trd_cd_META_0,
			cst_cd_META_0,
			cst_zip_cd_META_0,
			cst_addr1_META_0,
			cst_addr2_META_0,
			cst_addr3_META_0,
			cst_addr4_META_0,
			cst_addr_META_0,
			cst_nm_META_0,
			cst_alt_nm1_META_0,
			cst_alt_nm2_META_0,
			cst_alt_nm3_META_0,
			cst_alt_nm4_META_0,
			cst_cntct_dpt_META_0,
			cst_cntct_psn_META_0,
			cst_cntct_psn_title_META_0,
			cst_tel_META_0,
			cst_fax_META_0,
			cst_cntry_nm_META_0,
			qtn_prnt_dt_META_0,
			sls_dpt_cd_META_0,
			sls_dpt_zip_cd_META_0,
			sls_dpt_addr1_META_0,
			sls_dpt_addr2_META_0,
			sls_dpt_addr3_META_0,
			sls_dpt_addr4_META_0,
			sls_dpt_addr_META_0,
			co_nm_META_0,
			sls_dpt_nm_META_0,
			sls_usr_cd_META_0,
			sls_usr_nm_META_0,
			sls_dpt_tel_META_0,
			sls_dpt_fax_META_0,
			sls_cntry_nm_META_0,
			ttl_trd_cur_amt_META_0,
			s_ttl_trd_cur_amt_META_0,
			ttl_trd_cur_tax_amt_META_0,
			s_ttl_trd_cur_tax_amt_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			qtn_no_META_0,
			qtn_rev_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			qtn_dt_META_0,
			valid_dt_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			trnspt_cd_META_0,
			trnspt_nm_META_0,
			tterm_cd1_META_0,
			tterm_cd2_META_0,
			tterm_cd3_META_0,
			tterm_nm1_META_0,
			tterm_rmrks1_META_0,
			tterm_nm2_META_0,
			tterm_rmrks2_META_0,
			tterm_nm3_META_0,
			tterm_rmrks3_META_0,
			qtn_term_cd_META_0,
			qtn_term_nm_META_0,
			qtn_rmrks_META_0
		);
		reportMetaMap.add("QtnDtl",
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub2_view_META_1,
			itm_sub3_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_data_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			iv_itm_nm_META_1,
			cst_itm_cd_META_1,
			cst_itm_nm_META_1,
			trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			cntry_org_cd_META_1,
			interim_flg_META_1,
			t_interim_META_1,
			inc_tax_flg_META_1,
			t_inc_tax_META_1,
			trd_cur_upri_META_1,
			s_int_trd_cur_upri_META_1,
			s_dec_trd_cur_upri_META_1,
			trd_cur_std_sls_upri_META_1,
			s_int_trd_cur_std_sls_upri_META_1,
			s_dec_trd_cur_std_sls_upri_META_1,
			trd_cur_amt_META_1,
			s_int_trd_cur_amt_META_1,
			s_dec_trd_cur_amt_META_1,
			trd_cur_std_sls_amt_META_1,
			s_int_trd_cur_std_sls_amt_META_1,
			s_dec_trd_cur_std_sls_amt_META_1,
			trd_cur_dscnt_amt_META_1,
			s_int_trd_cur_dscnt_amt_META_1,
			s_dec_trd_cur_dscnt_amt_META_1,
			trd_cur_tax_amt_META_1,
			s_int_trd_cur_tax_amt_META_1,
			s_dec_trd_cur_tax_amt_META_1,
			tax_rate_META_1,
			s_tax_rate_META_1,
			dlv_cd_META_1,
			dlv_nm_META_1,
			dlv_alt_nm1_META_1,
			dlv_alt_nm2_META_1,
			dlv_alt_nm3_META_1,
			dlv_alt_nm4_META_1,
			dlv_addr1_META_1,
			dlv_addr2_META_1,
			dlv_addr3_META_1,
			dlv_addr4_META_1,
			dlv_addr_META_1,
			dlv_cntry_nm_META_1,
			qtn_d_rmrks_META_1,
			disp_seq_META_1,
			d_sub_char1_META_1,
			d_sub_char2_META_1,
			d_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBBR_ExQtn_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

