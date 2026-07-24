package mcframe.commonMSBE.MSBER0200;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_IvLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0200";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass IVHDRR_RC = new MCReportClass("IvHdr", mcframe.commonMSBE.MSBER0200.IvHdrR.class);
	static public final MCReportClass IVDTLL_RC = new MCReportClass("IvDtl", mcframe.commonMSBE.MSBER0200.IvDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		IVHDRR_RC,
		IVDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta iv_rev_META_0 = new MCReportMeta("iv_rev", "", "", "", true);
	static public final MCReportMeta iv_mng_no_META_0 = new MCReportMeta("iv_mng_no", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta co_str_META_0 = new MCReportMeta("co_str", "", "", "", true);
	static public final MCReportMeta co_tel_META_0 = new MCReportMeta("co_tel", "", "", "", true);
	static public final MCReportMeta co_fax_META_0 = new MCReportMeta("co_fax", "", "", "", true);
	static public final MCReportMeta prnt_dt_META_0 = new MCReportMeta("prnt_dt", "YMD", "", "", true);
	static public final MCReportMeta iv_dt_META_0 = new MCReportMeta("iv_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_rqst_id_cd_META_0 = new MCReportMeta("ship_rqst_id_cd", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_nm_META_0 = new MCReportMeta("ship_rqst_id_nm", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm1_META_0 = new MCReportMeta("ship_rqst_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm2_META_0 = new MCReportMeta("ship_rqst_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm3_META_0 = new MCReportMeta("ship_rqst_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm4_META_0 = new MCReportMeta("ship_rqst_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr1_META_0 = new MCReportMeta("ship_rqst_addr1", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr2_META_0 = new MCReportMeta("ship_rqst_addr2", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr3_META_0 = new MCReportMeta("ship_rqst_addr3", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr4_META_0 = new MCReportMeta("ship_rqst_addr4", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr_META_0 = new MCReportMeta("ship_rqst_addr", "", "", "", true);
	static public final MCReportMeta ship_rqst_cntry_nm_META_0 = new MCReportMeta("ship_rqst_cntry_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_typ_META_0 = new MCReportMeta("dlv_id_typ", "", "", "", true);
	static public final MCReportMeta dlv_id_cd_META_0 = new MCReportMeta("dlv_id_cd", "", "", "", true);
	static public final MCReportMeta dlv_id_nm_META_0 = new MCReportMeta("dlv_id_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm1_META_0 = new MCReportMeta("dlv_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm2_META_0 = new MCReportMeta("dlv_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm3_META_0 = new MCReportMeta("dlv_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm4_META_0 = new MCReportMeta("dlv_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_0 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_cntry_cd_META_0 = new MCReportMeta("dlv_cntry_cd", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_0 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta trnspt_nm_META_0 = new MCReportMeta("trnspt_nm", "", "", "", true);
	static public final MCReportMeta trnspt_cd_META_0 = new MCReportMeta("trnspt_cd", "", "", "", true);
	static public final MCReportMeta vssl_flght_META_0 = new MCReportMeta("vssl_flght", "", "", "", true);
	static public final MCReportMeta etd_dt_META_0 = new MCReportMeta("etd_dt", "YMD", "", "", true);
	static public final MCReportMeta load_port_nm_META_0 = new MCReportMeta("load_port_nm", "", "", "", true);
	static public final MCReportMeta load_port_cd_META_0 = new MCReportMeta("load_port_cd", "", "", "", true);
	static public final MCReportMeta dschrg_port_nm_META_0 = new MCReportMeta("dschrg_port_nm", "", "", "", true);
	static public final MCReportMeta dschrg_port_cd_META_0 = new MCReportMeta("dschrg_port_cd", "", "", "", true);
	static public final MCReportMeta via_port_nm_META_0 = new MCReportMeta("via_port_nm", "", "", "", true);
	static public final MCReportMeta via_port_cd_META_0 = new MCReportMeta("via_port_cd", "", "", "", true);
	static public final MCReportMeta tterm_nm3_META_0 = new MCReportMeta("tterm_nm3", "", "", "", true);
	static public final MCReportMeta tterm_cd3_META_0 = new MCReportMeta("tterm_cd3", "", "", "", true);
	static public final MCReportMeta tterm_rmrks3_META_0 = new MCReportMeta("tterm_rmrks3", "", "", "", true);
	static public final MCReportMeta lc_no_META_0 = new MCReportMeta("lc_no", "", "", "", true);
	static public final MCReportMeta lc_dt_META_0 = new MCReportMeta("lc_dt", "YMD", "", "", true);
	static public final MCReportMeta lc_rmrks_META_0 = new MCReportMeta("lc_rmrks", "", "", "", true);
	static public final MCReportMeta bl_no_META_0 = new MCReportMeta("bl_no", "", "", "", true);
	static public final MCReportMeta bl_dt_META_0 = new MCReportMeta("bl_dt", "YMD", "", "", true);
	static public final MCReportMeta bl_rmrks_META_0 = new MCReportMeta("bl_rmrks", "", "", "", true);
	static public final MCReportMeta case_mrk1_META_0 = new MCReportMeta("case_mrk1", "", "", "", true);
	static public final MCReportMeta case_mrk2_META_0 = new MCReportMeta("case_mrk2", "", "", "", true);
	static public final MCReportMeta case_mrk3_META_0 = new MCReportMeta("case_mrk3", "", "", "", true);
	static public final MCReportMeta case_mrk4_META_0 = new MCReportMeta("case_mrk4", "", "", "", true);
	static public final MCReportMeta case_mrk5_META_0 = new MCReportMeta("case_mrk5", "", "", "", true);
	static public final MCReportMeta case_mrk6_META_0 = new MCReportMeta("case_mrk6", "", "", "", true);
	static public final MCReportMeta iv_rmrks_META_0 = new MCReportMeta("iv_rmrks", "", "", "", true);
	static public final MCReportMeta co_addr1_META_0 = new MCReportMeta("co_addr1", "", "", "", true);
	static public final MCReportMeta co_addr2_META_0 = new MCReportMeta("co_addr2", "", "", "", true);
	static public final MCReportMeta co_addr3_META_0 = new MCReportMeta("co_addr3", "", "", "", true);
	static public final MCReportMeta co_addr4_META_0 = new MCReportMeta("co_addr4", "", "", "", true);
	static public final MCReportMeta co_addr_META_0 = new MCReportMeta("co_addr", "", "", "", true);
	static public final MCReportMeta co_cntry_nm_META_0 = new MCReportMeta("co_cntry_nm", "", "", "", true);
	static public final MCReportMeta iv_sub_char1_META_0 = new MCReportMeta("iv_sub_char1", "", "", "", true);
	static public final MCReportMeta iv_sub_char2_META_0 = new MCReportMeta("iv_sub_char2", "", "", "", true);
	static public final MCReportMeta iv_sub_char3_META_0 = new MCReportMeta("iv_sub_char3", "", "", "", true);
	static public final MCReportMeta cur_nm_META_0 = new MCReportMeta("cur_nm", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta amt_META_0 = new MCReportMeta("amt", "COMMA", "", "", true);
	static public final MCReportMeta subttl2_META_0 = new MCReportMeta("subttl2", "COMMA", "", "", true);
	static public final MCReportMeta subttl3_META_0 = new MCReportMeta("subttl3", "COMMA", "", "", true);
	static public final MCReportMeta tax_amt_META_0 = new MCReportMeta("tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta tax_subttl2_META_0 = new MCReportMeta("tax_subttl2", "COMMA", "", "", true);
	static public final MCReportMeta tax_subttl3_META_0 = new MCReportMeta("tax_subttl3", "COMMA", "", "", true);
	static public final MCReportMeta tterm_nm1_META_0 = new MCReportMeta("tterm_nm1", "", "", "", true);
	static public final MCReportMeta tterm_cd1_META_0 = new MCReportMeta("tterm_cd1", "", "", "", true);
	static public final MCReportMeta tterm_nm2_META_0 = new MCReportMeta("tterm_nm2", "", "", "", true);
	static public final MCReportMeta tterm_cd2_META_0 = new MCReportMeta("tterm_cd2", "", "", "", true);
	static public final MCReportMeta ncv_amt_META_0 = new MCReportMeta("ncv_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ncv_amt_META_0 = new MCReportMeta("s_ncv_amt", "", "", "", true);
	static public final MCReportMeta base_unit_disp_flg_META_0 = new MCReportMeta("base_unit_disp_flg", "", "", "", true);

	static public final MCReportMeta t_cust_META_1 = new MCReportMeta("t_cust", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_1 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_no2_META_1 = new MCReportMeta("cst_po_no2", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_1 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no2_META_1 = new MCReportMeta("cst_po_d_no2", "", "", "", true);
	static public final MCReportMeta t_itm_code_META_1 = new MCReportMeta("t_itm_code", "", "", "", true);
	static public final MCReportMeta t_po_no_META_1 = new MCReportMeta("t_po_no", "", "", "", true);
	static public final MCReportMeta t_qty_META_1 = new MCReportMeta("t_qty", "", "", "", true);
	static public final MCReportMeta t_upri_META_1 = new MCReportMeta("t_upri", "", "", "", true);
	static public final MCReportMeta t_amt_META_1 = new MCReportMeta("t_amt", "", "", "", true);
	static public final MCReportMeta t_tax_rate_META_1 = new MCReportMeta("t_tax_rate", "", "", "", true);
	static public final MCReportMeta t_tax_amt_META_1 = new MCReportMeta("t_tax_amt", "", "", "", true);
	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta cntry_org_cd_META_1 = new MCReportMeta("cntry_org_cd", "", "", "", true);
	static public final MCReportMeta cntry_org_nm_META_1 = new MCReportMeta("cntry_org_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta unit_dec_place_META_1 = new MCReportMeta("unit_dec_place", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_upri_META_1 = new MCReportMeta("s_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_upri_META_1 = new MCReportMeta("s_int_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_upri_META_1 = new MCReportMeta("s_dec_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta base_unit_dec_place_META_1 = new MCReportMeta("base_unit_dec_place", "", "", "", true);
	static public final MCReportMeta d_amt_META_1 = new MCReportMeta("d_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_d_amt_META_1 = new MCReportMeta("s_d_amt", "", "", "", true);
	static public final MCReportMeta s_int_d_amt_META_1 = new MCReportMeta("s_int_d_amt", "", "", "", true);
	static public final MCReportMeta s_dec_d_amt_META_1 = new MCReportMeta("s_dec_d_amt", "", "", "", true);
	static public final MCReportMeta tax_rate_META_1 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta s_tax_rate_META_1 = new MCReportMeta("s_tax_rate", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta t_tax_inclusive_META_1 = new MCReportMeta("t_tax_inclusive", "", "", "", true);
	static public final MCReportMeta d_tax_amt_META_1 = new MCReportMeta("d_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_d_tax_amt_META_1 = new MCReportMeta("s_d_tax_amt", "", "", "", true);
	static public final MCReportMeta s_int_d_tax_amt_META_1 = new MCReportMeta("s_int_d_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_d_tax_amt_META_1 = new MCReportMeta("s_dec_d_tax_amt", "", "", "", true);
	static public final MCReportMeta upri_base_unit_nm_META_1 = new MCReportMeta("upri_base_unit_nm", "", "", "", true);
	static public final MCReportMeta upri_base_unit_cd_META_1 = new MCReportMeta("upri_base_unit_cd", "", "", "", true);
	static public final MCReportMeta upri_dec_place_META_1 = new MCReportMeta("upri_dec_place", "", "", "", true);
	static public final MCReportMeta amt_dec_place_META_1 = new MCReportMeta("amt_dec_place", "", "", "", true);
	static public final MCReportMeta ptax_cur_cd_META_1 = new MCReportMeta("ptax_cur_cd", "", "", "", true);
	static public final MCReportMeta ptax_cur_amt_META_1 = new MCReportMeta("ptax_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ptax_cur_amt_META_1 = new MCReportMeta("s_ptax_cur_amt", "", "", "", true);
	static public final MCReportMeta s_int_ptax_cur_amt_META_1 = new MCReportMeta("s_int_ptax_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_ptax_cur_amt_META_1 = new MCReportMeta("s_dec_ptax_cur_amt", "", "", "", true);
	static public final MCReportMeta wtax_rate_META_1 = new MCReportMeta("wtax_rate", "", "", "", true);
	static public final MCReportMeta wtax_amt_META_1 = new MCReportMeta("wtax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_wtax_amt_META_1 = new MCReportMeta("s_wtax_amt", "", "", "", true);
	static public final MCReportMeta iv_itm_nm_META_1 = new MCReportMeta("iv_itm_nm", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm1_META_1 = new MCReportMeta("iv_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm2_META_1 = new MCReportMeta("iv_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm3_META_1 = new MCReportMeta("iv_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm4_META_1 = new MCReportMeta("iv_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta itm_cd2_META_1 = new MCReportMeta("itm_cd2", "", "", "", true);
	static public final MCReportMeta itm_sub1_view2_META_1 = new MCReportMeta("itm_sub1_view2", "", "", "", true);
	static public final MCReportMeta itm_sub2_view2_META_1 = new MCReportMeta("itm_sub2_view2", "", "", "", true);
	static public final MCReportMeta itm_sub3_view2_META_1 = new MCReportMeta("itm_sub3_view2", "", "", "", true);
	static public final MCReportMeta itm_sub1_data2_META_1 = new MCReportMeta("itm_sub1_data2", "", "", "", true);
	static public final MCReportMeta itm_sub2_data2_META_1 = new MCReportMeta("itm_sub2_data2", "", "", "", true);
	static public final MCReportMeta itm_sub3_data2_META_1 = new MCReportMeta("itm_sub3_data2", "", "", "", true);
	static public final MCReportMeta cntry_org_nm2_META_1 = new MCReportMeta("cntry_org_nm2", "", "", "", true);
	static public final MCReportMeta cntry_org_cd2_META_1 = new MCReportMeta("cntry_org_cd2", "", "", "", true);
	static public final MCReportMeta trd_unit_qty2_META_1 = new MCReportMeta("trd_unit_qty2", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty2_META_1 = new MCReportMeta("s_trd_unit_qty2", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty2_META_1 = new MCReportMeta("s_int_trd_unit_qty2", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty2_META_1 = new MCReportMeta("s_dec_trd_unit_qty2", "", "", "", true);
	static public final MCReportMeta trd_unit_nm2_META_1 = new MCReportMeta("trd_unit_nm2", "", "", "", true);
	static public final MCReportMeta trd_unit_cd2_META_1 = new MCReportMeta("trd_unit_cd2", "", "", "", true);
	static public final MCReportMeta base_unit_qty2_META_1 = new MCReportMeta("base_unit_qty2", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty2_META_1 = new MCReportMeta("s_base_unit_qty2", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty2_META_1 = new MCReportMeta("s_int_base_unit_qty2", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty2_META_1 = new MCReportMeta("s_dec_base_unit_qty2", "", "", "", true);
	static public final MCReportMeta base_unit_nm2_META_1 = new MCReportMeta("base_unit_nm2", "", "", "", true);
	static public final MCReportMeta base_unit_cd2_META_1 = new MCReportMeta("base_unit_cd2", "", "", "", true);
	static public final MCReportMeta iv_upri_META_1 = new MCReportMeta("iv_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_iv_upri_META_1 = new MCReportMeta("s_iv_upri", "", "", "", true);
	static public final MCReportMeta s_int_iv_upri_META_1 = new MCReportMeta("s_int_iv_upri", "", "", "", true);
	static public final MCReportMeta s_dec_iv_upri_META_1 = new MCReportMeta("s_dec_iv_upri", "", "", "", true);
	static public final MCReportMeta iv_amt_META_1 = new MCReportMeta("iv_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_iv_amt_META_1 = new MCReportMeta("s_iv_amt", "", "", "", true);
	static public final MCReportMeta s_int_d_iv_amt_META_1 = new MCReportMeta("s_int_d_iv_amt", "", "", "", true);
	static public final MCReportMeta s_dec_d_iv_amt_META_1 = new MCReportMeta("s_dec_d_iv_amt", "", "", "", true);
	static public final MCReportMeta iv_upri_base_unit_nm_META_1 = new MCReportMeta("iv_upri_base_unit_nm", "", "", "", true);
	static public final MCReportMeta iv_upri_base_unit_cd_META_1 = new MCReportMeta("iv_upri_base_unit_cd", "", "", "", true);
	static public final MCReportMeta iv_itm_nm2_META_1 = new MCReportMeta("iv_itm_nm2", "", "", "", true);
	static public final MCReportMeta iv_itm2_alt_nm1_META_1 = new MCReportMeta("iv_itm2_alt_nm1", "", "", "", true);
	static public final MCReportMeta iv_itm2_alt_nm2_META_1 = new MCReportMeta("iv_itm2_alt_nm2", "", "", "", true);
	static public final MCReportMeta iv_itm2_alt_nm3_META_1 = new MCReportMeta("iv_itm2_alt_nm3", "", "", "", true);
	static public final MCReportMeta iv_itm2_alt_nm4_META_1 = new MCReportMeta("iv_itm2_alt_nm4", "", "", "", true);
	static public final MCReportMeta cst_itm_cd2_META_1 = new MCReportMeta("cst_itm_cd2", "", "", "", true);
	static public final MCReportMeta cst_itm_nm2_META_1 = new MCReportMeta("cst_itm_nm2", "", "", "", true);
	static public final MCReportMeta t_total_META_1 = new MCReportMeta("t_total", "", "", "", true);
	static public final MCReportMeta t_total2_META_1 = new MCReportMeta("t_total2", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_qty_META_1 = new MCReportMeta("sum_trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_trd_unit_qty_META_1 = new MCReportMeta("s_sum_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_nm_META_1 = new MCReportMeta("sum_trd_unit_nm", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_cd_META_1 = new MCReportMeta("sum_trd_unit_cd", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_qty2_META_1 = new MCReportMeta("sum_trd_unit_qty2", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_trd_unit_qty2_META_1 = new MCReportMeta("s_sum_trd_unit_qty2", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_nm2_META_1 = new MCReportMeta("sum_trd_unit_nm2", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_cd2_META_1 = new MCReportMeta("sum_trd_unit_cd2", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta iv_d_sub_char1_META_1 = new MCReportMeta("iv_d_sub_char1", "", "", "", true);
	static public final MCReportMeta iv_d_sub_char2_META_1 = new MCReportMeta("iv_d_sub_char2", "", "", "", true);
	static public final MCReportMeta iv_d_sub_char3_META_1 = new MCReportMeta("iv_d_sub_char3", "", "", "", true);
	static public final MCReportMeta t_sum_amt_META_1 = new MCReportMeta("t_sum_amt", "", "", "", true);
	static public final MCReportMeta t_sum_tax_amt_META_1 = new MCReportMeta("t_sum_tax_amt", "", "", "", true);
	static public final MCReportMeta f_fob_META_1 = new MCReportMeta("f_fob", "", "", "", true);
	static public final MCReportMeta fob_cur_nm_META_1 = new MCReportMeta("fob_cur_nm", "", "", "", true);
	static public final MCReportMeta d_fob_amt_META_1 = new MCReportMeta("d_fob_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_d_fob_amt_META_1 = new MCReportMeta("s_d_fob_amt", "", "", "", true);
	static public final MCReportMeta d_fob_tax_amt_META_1 = new MCReportMeta("d_fob_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_d_fob_tax_amt_META_1 = new MCReportMeta("s_d_fob_tax_amt", "", "", "", true);
	static public final MCReportMeta d_tterm_nm1_META_1 = new MCReportMeta("d_tterm_nm1", "", "", "", true);
	static public final MCReportMeta d_tterm_cd1_META_1 = new MCReportMeta("d_tterm_cd1", "", "", "", true);
	static public final MCReportMeta d_tterm_nm2_META_1 = new MCReportMeta("d_tterm_nm2", "", "", "", true);
	static public final MCReportMeta d_tterm_cd2_META_1 = new MCReportMeta("d_tterm_cd2", "", "", "", true);
	static public final MCReportMeta f_cur_nm_META_1 = new MCReportMeta("f_cur_nm", "", "", "", true);
	static public final MCReportMeta f_cur_cd_META_1 = new MCReportMeta("f_cur_cd", "", "", "", true);
	static public final MCReportMeta f_amt_META_1 = new MCReportMeta("f_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_f_amt_META_1 = new MCReportMeta("s_f_amt", "", "", "", true);
	static public final MCReportMeta f_tax_amt_META_1 = new MCReportMeta("f_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_f_tax_amt_META_1 = new MCReportMeta("s_f_tax_amt", "", "", "", true);
	static public final MCReportMeta t_no_com_META_1 = new MCReportMeta("t_no_com", "", "", "", true);
	static public final MCReportMeta f_cur_nm2_META_1 = new MCReportMeta("f_cur_nm2", "", "", "", true);
	static public final MCReportMeta d_ncv_amt_META_1 = new MCReportMeta("d_ncv_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_d_ncv_amt_META_1 = new MCReportMeta("s_d_ncv_amt", "", "", "", true);
	static public final MCReportMeta f_cur_cd2_META_1 = new MCReportMeta("f_cur_cd2", "", "", "", true);
	static public final MCReportMeta f_cntry_org_cd_META_1 = new MCReportMeta("f_cntry_org_cd", "", "", "", true);
	static public final MCReportMeta t_made_in_META_1 = new MCReportMeta("t_made_in", "", "", "", true);
	static public final MCReportMeta f_cntry_org_nm_META_1 = new MCReportMeta("f_cntry_org_nm", "", "", "", true);
	static public final MCReportMeta free_META_1 = new MCReportMeta("free", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("IvHdr",
			iv_no_META_0,
			iv_rev_META_0,
			iv_mng_no_META_0,
			co_nm_META_0,
			co_str_META_0,
			co_tel_META_0,
			co_fax_META_0,
			prnt_dt_META_0,
			iv_dt_META_0,
			ship_rqst_id_cd_META_0,
			ship_rqst_id_nm_META_0,
			ship_rqst_id_alt_nm1_META_0,
			ship_rqst_id_alt_nm2_META_0,
			ship_rqst_id_alt_nm3_META_0,
			ship_rqst_id_alt_nm4_META_0,
			ship_rqst_addr1_META_0,
			ship_rqst_addr2_META_0,
			ship_rqst_addr3_META_0,
			ship_rqst_addr4_META_0,
			ship_rqst_addr_META_0,
			ship_rqst_cntry_nm_META_0,
			dlv_id_typ_META_0,
			dlv_id_cd_META_0,
			dlv_id_nm_META_0,
			dlv_id_alt_nm1_META_0,
			dlv_id_alt_nm2_META_0,
			dlv_id_alt_nm3_META_0,
			dlv_id_alt_nm4_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_addr_META_0,
			dlv_cntry_cd_META_0,
			dlv_cntry_nm_META_0,
			trnspt_nm_META_0,
			trnspt_cd_META_0,
			vssl_flght_META_0,
			etd_dt_META_0,
			load_port_nm_META_0,
			load_port_cd_META_0,
			dschrg_port_nm_META_0,
			dschrg_port_cd_META_0,
			via_port_nm_META_0,
			via_port_cd_META_0,
			tterm_nm3_META_0,
			tterm_cd3_META_0,
			tterm_rmrks3_META_0,
			lc_no_META_0,
			lc_dt_META_0,
			lc_rmrks_META_0,
			bl_no_META_0,
			bl_dt_META_0,
			bl_rmrks_META_0,
			case_mrk1_META_0,
			case_mrk2_META_0,
			case_mrk3_META_0,
			case_mrk4_META_0,
			case_mrk5_META_0,
			case_mrk6_META_0,
			iv_rmrks_META_0,
			co_addr1_META_0,
			co_addr2_META_0,
			co_addr3_META_0,
			co_addr4_META_0,
			co_addr_META_0,
			co_cntry_nm_META_0,
			iv_sub_char1_META_0,
			iv_sub_char2_META_0,
			iv_sub_char3_META_0,
			cur_nm_META_0,
			cur_cd_META_0,
			amt_META_0,
			subttl2_META_0,
			subttl3_META_0,
			tax_amt_META_0,
			tax_subttl2_META_0,
			tax_subttl3_META_0,
			tterm_nm1_META_0,
			tterm_cd1_META_0,
			tterm_nm2_META_0,
			tterm_cd2_META_0,
			ncv_amt_META_0,
			s_ncv_amt_META_0,
			base_unit_disp_flg_META_0
		);
		reportMetaMap.add("IvDtl",
			t_cust_META_1,
			cst_po_no_META_1,
			cst_po_no2_META_1,
			cst_po_d_no_META_1,
			cst_po_d_no2_META_1,
			t_itm_code_META_1,
			t_po_no_META_1,
			t_qty_META_1,
			t_upri_META_1,
			t_amt_META_1,
			t_tax_rate_META_1,
			t_tax_amt_META_1,
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub2_view_META_1,
			itm_sub3_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_data_META_1,
			itm_sub3_data_META_1,
			cntry_org_cd_META_1,
			cntry_org_nm_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			unit_dec_place_META_1,
			trd_unit_nm_META_1,
			trd_unit_cd_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			base_unit_nm_META_1,
			base_unit_cd_META_1,
			trd_cur_upri_META_1,
			s_trd_cur_upri_META_1,
			s_int_trd_cur_upri_META_1,
			s_dec_trd_cur_upri_META_1,
			base_unit_dec_place_META_1,
			d_amt_META_1,
			s_d_amt_META_1,
			s_int_d_amt_META_1,
			s_dec_d_amt_META_1,
			tax_rate_META_1,
			s_tax_rate_META_1,
			inc_tax_flg_META_1,
			t_tax_inclusive_META_1,
			d_tax_amt_META_1,
			s_d_tax_amt_META_1,
			s_int_d_tax_amt_META_1,
			s_dec_d_tax_amt_META_1,
			upri_base_unit_nm_META_1,
			upri_base_unit_cd_META_1,
			upri_dec_place_META_1,
			amt_dec_place_META_1,
			ptax_cur_cd_META_1,
			ptax_cur_amt_META_1,
			s_ptax_cur_amt_META_1,
			s_int_ptax_cur_amt_META_1,
			s_dec_ptax_cur_amt_META_1,
			wtax_rate_META_1,
			wtax_amt_META_1,
			s_wtax_amt_META_1,
			iv_itm_nm_META_1,
			iv_itm_alt_nm1_META_1,
			iv_itm_alt_nm2_META_1,
			iv_itm_alt_nm3_META_1,
			iv_itm_alt_nm4_META_1,
			cst_itm_cd_META_1,
			cst_itm_nm_META_1,
			itm_cd2_META_1,
			itm_sub1_view2_META_1,
			itm_sub2_view2_META_1,
			itm_sub3_view2_META_1,
			itm_sub1_data2_META_1,
			itm_sub2_data2_META_1,
			itm_sub3_data2_META_1,
			cntry_org_nm2_META_1,
			cntry_org_cd2_META_1,
			trd_unit_qty2_META_1,
			s_trd_unit_qty2_META_1,
			s_int_trd_unit_qty2_META_1,
			s_dec_trd_unit_qty2_META_1,
			trd_unit_nm2_META_1,
			trd_unit_cd2_META_1,
			base_unit_qty2_META_1,
			s_base_unit_qty2_META_1,
			s_int_base_unit_qty2_META_1,
			s_dec_base_unit_qty2_META_1,
			base_unit_nm2_META_1,
			base_unit_cd2_META_1,
			iv_upri_META_1,
			s_iv_upri_META_1,
			s_int_iv_upri_META_1,
			s_dec_iv_upri_META_1,
			iv_amt_META_1,
			s_iv_amt_META_1,
			s_int_d_iv_amt_META_1,
			s_dec_d_iv_amt_META_1,
			iv_upri_base_unit_nm_META_1,
			iv_upri_base_unit_cd_META_1,
			iv_itm_nm2_META_1,
			iv_itm2_alt_nm1_META_1,
			iv_itm2_alt_nm2_META_1,
			iv_itm2_alt_nm3_META_1,
			iv_itm2_alt_nm4_META_1,
			cst_itm_cd2_META_1,
			cst_itm_nm2_META_1,
			t_total_META_1,
			t_total2_META_1,
			sum_trd_unit_qty_META_1,
			s_sum_trd_unit_qty_META_1,
			sum_trd_unit_nm_META_1,
			sum_trd_unit_cd_META_1,
			sum_trd_unit_qty2_META_1,
			s_sum_trd_unit_qty2_META_1,
			sum_trd_unit_nm2_META_1,
			sum_trd_unit_cd2_META_1,
			disp_seq_META_1,
			iv_d_sub_char1_META_1,
			iv_d_sub_char2_META_1,
			iv_d_sub_char3_META_1,
			t_sum_amt_META_1,
			t_sum_tax_amt_META_1,
			f_fob_META_1,
			fob_cur_nm_META_1,
			d_fob_amt_META_1,
			s_d_fob_amt_META_1,
			d_fob_tax_amt_META_1,
			s_d_fob_tax_amt_META_1,
			d_tterm_nm1_META_1,
			d_tterm_cd1_META_1,
			d_tterm_nm2_META_1,
			d_tterm_cd2_META_1,
			f_cur_nm_META_1,
			f_cur_cd_META_1,
			f_amt_META_1,
			s_f_amt_META_1,
			f_tax_amt_META_1,
			s_f_tax_amt_META_1,
			t_no_com_META_1,
			f_cur_nm2_META_1,
			d_ncv_amt_META_1,
			s_d_ncv_amt_META_1,
			f_cur_cd2_META_1,
			f_cntry_org_cd_META_1,
			t_made_in_META_1,
			f_cntry_org_nm_META_1,
			free_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_IvLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

