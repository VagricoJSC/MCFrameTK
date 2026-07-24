package mcframe.commonMSBE.MSBER0500;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_DlvSlip_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0500";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DLVSLIPHDRR_RC = new MCReportClass("DlvSlipHdr", mcframe.commonMSBE.MSBER0500.DlvSlipHdrR.class);
	static public final MCReportClass DLVSLIPDTLL_RC = new MCReportClass("DlvSlipDtl", mcframe.commonMSBE.MSBER0500.DlvSlipDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DLVSLIPHDRR_RC,
		DLVSLIPDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta print_hm_META_0 = new MCReportMeta("print_hm", "YMDHM", "", "", true);
	static public final MCReportMeta formtitle_META_0 = new MCReportMeta("formtitle", "", "", "", true);
	static public final MCReportMeta formtitle2_META_0 = new MCReportMeta("formtitle2", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_nm_META_0 = new MCReportMeta("slip_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_0 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta adjst_slip_flg_META_0 = new MCReportMeta("adjst_slip_flg", "", "", "", true);
	static public final MCReportMeta s_schd_META_0 = new MCReportMeta("s_schd", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_rev_META_0 = new MCReportMeta("dlv_slip_rev", "", "", "", true);
	static public final MCReportMeta dlv_slip_seq_META_0 = new MCReportMeta("dlv_slip_seq", "", "", "", true);
	static public final MCReportMeta dlv_slip_seq_view_META_0 = new MCReportMeta("dlv_slip_seq_view", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_no_META_0 = new MCReportMeta("ship_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta lg_grp_nm_META_0 = new MCReportMeta("lg_grp_nm", "", "", "", true);
	static public final MCReportMeta ship_dt_META_0 = new MCReportMeta("ship_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_tm_META_0 = new MCReportMeta("ship_tm", "HM", "", "", true);
	static public final MCReportMeta cst_nm_META_0 = new MCReportMeta("cst_nm", "", "", "", true);
	static public final MCReportMeta dlv_dt_META_0 = new MCReportMeta("dlv_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_tm_META_0 = new MCReportMeta("dlv_tm", "HM", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_tm_META_0 = new MCReportMeta("dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta slo_co_cd_META_0 = new MCReportMeta("slo_co_cd", "", "", "", true);
	static public final MCReportMeta slo_std_co_cd_META_0 = new MCReportMeta("slo_std_co_cd", "", "", "", true);
	static public final MCReportMeta slo_co_nm_META_0 = new MCReportMeta("slo_co_nm", "", "", "", true);
	static public final MCReportMeta biz_co_no_META_0 = new MCReportMeta("biz_co_no", "", "", "", true);
	static public final MCReportMeta slo_co_alt_nm1_META_0 = new MCReportMeta("slo_co_alt_nm1", "", "", "", true);
	static public final MCReportMeta slo_co_alt_nm2_META_0 = new MCReportMeta("slo_co_alt_nm2", "", "", "", true);
	static public final MCReportMeta slo_co_alt_nm3_META_0 = new MCReportMeta("slo_co_alt_nm3", "", "", "", true);
	static public final MCReportMeta slo_co_alt_nm4_META_0 = new MCReportMeta("slo_co_alt_nm4", "", "", "", true);
	static public final MCReportMeta slo_co_zip_cd_META_0 = new MCReportMeta("slo_co_zip_cd", "", "", "", true);
	static public final MCReportMeta slo_co_addr1_META_0 = new MCReportMeta("slo_co_addr1", "", "", "", true);
	static public final MCReportMeta slo_co_addr2_META_0 = new MCReportMeta("slo_co_addr2", "", "", "", true);
	static public final MCReportMeta slo_co_addr3_META_0 = new MCReportMeta("slo_co_addr3", "", "", "", true);
	static public final MCReportMeta slo_co_addr4_META_0 = new MCReportMeta("slo_co_addr4", "", "", "", true);
	static public final MCReportMeta slo_co_addr_META_0 = new MCReportMeta("slo_co_addr", "", "", "", true);
	static public final MCReportMeta slo_co_tel_META_0 = new MCReportMeta("slo_co_tel", "", "", "", true);
	static public final MCReportMeta slo_co_fax_META_0 = new MCReportMeta("slo_co_fax", "", "", "", true);
	static public final MCReportMeta slo_co_cntry_nm_META_0 = new MCReportMeta("slo_co_cntry_nm", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_cd_META_0 = new MCReportMeta("dpt_cd", "", "", "", true);
	static public final MCReportMeta usr_nm_META_0 = new MCReportMeta("usr_nm", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta po_co_cd_META_0 = new MCReportMeta("po_co_cd", "", "", "", true);
	static public final MCReportMeta po_co_nm_META_0 = new MCReportMeta("po_co_nm", "", "", "", true);
	static public final MCReportMeta po_co_alt_nm1_META_0 = new MCReportMeta("po_co_alt_nm1", "", "", "", true);
	static public final MCReportMeta po_co_alt_nm2_META_0 = new MCReportMeta("po_co_alt_nm2", "", "", "", true);
	static public final MCReportMeta po_co_alt_nm3_META_0 = new MCReportMeta("po_co_alt_nm3", "", "", "", true);
	static public final MCReportMeta po_co_alt_nm4_META_0 = new MCReportMeta("po_co_alt_nm4", "", "", "", true);
	static public final MCReportMeta po_co_zip_cd_META_0 = new MCReportMeta("po_co_zip_cd", "", "", "", true);
	static public final MCReportMeta po_co_addr1_META_0 = new MCReportMeta("po_co_addr1", "", "", "", true);
	static public final MCReportMeta po_co_addr2_META_0 = new MCReportMeta("po_co_addr2", "", "", "", true);
	static public final MCReportMeta po_co_addr3_META_0 = new MCReportMeta("po_co_addr3", "", "", "", true);
	static public final MCReportMeta po_co_addr4_META_0 = new MCReportMeta("po_co_addr4", "", "", "", true);
	static public final MCReportMeta po_co_addr_META_0 = new MCReportMeta("po_co_addr", "", "", "", true);
	static public final MCReportMeta po_co_tel_META_0 = new MCReportMeta("po_co_tel", "", "", "", true);
	static public final MCReportMeta po_co_fax_META_0 = new MCReportMeta("po_co_fax", "", "", "", true);
	static public final MCReportMeta po_co_cntct_dpt_META_0 = new MCReportMeta("po_co_cntct_dpt", "", "", "", true);
	static public final MCReportMeta po_co_cntct_psn_META_0 = new MCReportMeta("po_co_cntct_psn", "", "", "", true);
	static public final MCReportMeta po_co_cntct_psn_title_META_0 = new MCReportMeta("po_co_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta po_co_cntry_nm_META_0 = new MCReportMeta("po_co_cntry_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_typ_META_0 = new MCReportMeta("dlv_id_typ", "", "", "", true);
	static public final MCReportMeta dlv_id_nm_META_0 = new MCReportMeta("dlv_id_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm1_META_0 = new MCReportMeta("dlv_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm2_META_0 = new MCReportMeta("dlv_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm3_META_0 = new MCReportMeta("dlv_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm4_META_0 = new MCReportMeta("dlv_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_id_cd_META_0 = new MCReportMeta("dlv_id_cd", "", "", "", true);
	static public final MCReportMeta dlv_zip_cd_META_0 = new MCReportMeta("dlv_zip_cd", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_0 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_tel_META_0 = new MCReportMeta("dlv_tel", "", "", "", true);
	static public final MCReportMeta dlv_fax_META_0 = new MCReportMeta("dlv_fax", "", "", "", true);
	static public final MCReportMeta dlv_cntct_dpt_META_0 = new MCReportMeta("dlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_META_0 = new MCReportMeta("dlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_title_META_0 = new MCReportMeta("dlv_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_0 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta dlv_slip_po_no_lbl_META_0 = new MCReportMeta("dlv_slip_po_no_lbl", "", "", "", true);
	static public final MCReportMeta dlv_slip_po_no_META_0 = new MCReportMeta("dlv_slip_po_no", "", "", "", true);
	static public final MCReportMeta eiaj_dlv_slip_po_no_META_0 = new MCReportMeta("eiaj_dlv_slip_po_no", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_tax_amt_META_0 = new MCReportMeta("ttl_trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_tax_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_amt_META_0 = new MCReportMeta("ttl_trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_tax_in_amt_META_0 = new MCReportMeta("ttl_trd_cur_tax_in_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_tax_in_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_tax_in_amt", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_dscnt_amt_META_0 = new MCReportMeta("ttl_trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_dscnt_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta dlv_slip_act_no_META_0 = new MCReportMeta("dlv_slip_act_no", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta po_trd_rmrks_META_0 = new MCReportMeta("po_trd_rmrks", "", "", "", true);
	static public final MCReportMeta po_sub_char1_META_0 = new MCReportMeta("po_sub_char1", "", "", "", true);
	static public final MCReportMeta po_sub_char2_META_0 = new MCReportMeta("po_sub_char2", "", "", "", true);
	static public final MCReportMeta po_sub_char3_META_0 = new MCReportMeta("po_sub_char3", "", "", "", true);
	static public final MCReportMeta dlv_slip_sub_char1_META_0 = new MCReportMeta("dlv_slip_sub_char1", "", "", "", true);
	static public final MCReportMeta dlv_slip_sub_char2_META_0 = new MCReportMeta("dlv_slip_sub_char2", "", "", "", true);
	static public final MCReportMeta dlv_slip_sub_char3_META_0 = new MCReportMeta("dlv_slip_sub_char3", "", "", "", true);
	static public final MCReportMeta b_eiaj1_META_0 = new MCReportMeta("b_eiaj1", "", "", "", true);
	static public final MCReportMeta b_eiaj2_META_0 = new MCReportMeta("b_eiaj2", "", "", "", true);
	static public final MCReportMeta b_eiaj3_META_0 = new MCReportMeta("b_eiaj3", "", "", "", true);
	static public final MCReportMeta b_eiaj4_META_0 = new MCReportMeta("b_eiaj4", "", "", "", true);
	static public final MCReportMeta eiaj_b_slo_po_qty_META_0 = new MCReportMeta("eiaj_b_slo_po_qty", "", "", "", true);
	static public final MCReportMeta s_eiaj_b_slo_po_qty_META_0 = new MCReportMeta("s_eiaj_b_slo_po_qty", "", "", "", true);
	static public final MCReportMeta dlv_lbl_META_0 = new MCReportMeta("dlv_lbl", "", "", "", true);
	static public final MCReportMeta ship_dt_lbl_META_0 = new MCReportMeta("ship_dt_lbl", "", "", "", true);
	static public final MCReportMeta dlv_dt_lbl_META_0 = new MCReportMeta("dlv_dt_lbl", "", "", "", true);
	static public final MCReportMeta lg_grp_lbl_META_0 = new MCReportMeta("lg_grp_lbl", "", "", "", true);
	static public final MCReportMeta cst_lbl_META_0 = new MCReportMeta("cst_lbl", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_no_lbl_META_0 = new MCReportMeta("ship_dlv_slip_no_lbl", "", "", "", true);
	static public final MCReportMeta prov_flg_META_0 = new MCReportMeta("prov_flg", "", "", "", true);
	static public final MCReportMeta sls_flg_META_0 = new MCReportMeta("sls_flg", "", "", "", true);
	static public final MCReportMeta xrate_lbl_META_0 = new MCReportMeta("xrate_lbl", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta tax_rate_lbl_META_0 = new MCReportMeta("tax_rate_lbl", "", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_dscnt_amt2_META_0 = new MCReportMeta("s_ttl_trd_cur_dscnt_amt2", "", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_amt2_META_0 = new MCReportMeta("s_ttl_trd_cur_amt2", "", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_tax_amt2_META_0 = new MCReportMeta("s_ttl_trd_cur_tax_amt2", "", "", "", true);
	static public final MCReportMeta ttl_ex_trd_cur_tax_amt_META_0 = new MCReportMeta("ttl_ex_trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_ex_trd_cur_tax_amt_META_0 = new MCReportMeta("s_ttl_ex_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_nm2_META_0 = new MCReportMeta("trd_cur_nm2", "", "", "", true);
	static public final MCReportMeta base_cur_nm_META_0 = new MCReportMeta("base_cur_nm", "", "", "", true);

	static public final MCReportMeta dlv_slip_d_no_META_1 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_seq_META_1 = new MCReportMeta("dlv_slip_d_seq", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_d_no_META_1 = new MCReportMeta("ship_dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_cd_META_1 = new MCReportMeta("dlv_slip_itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_nm_META_1 = new MCReportMeta("dlv_slip_itm_nm", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_alt_nm1_META_1 = new MCReportMeta("dlv_slip_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_alt_nm2_META_1 = new MCReportMeta("dlv_slip_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_alt_nm3_META_1 = new MCReportMeta("dlv_slip_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_alt_nm4_META_1 = new MCReportMeta("dlv_slip_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta sno1_META_1 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_1 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_1 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_1 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta lot_plural_flg_META_1 = new MCReportMeta("lot_plural_flg", "", "", "", true);
	static public final MCReportMeta s_lot_plural_flg_META_1 = new MCReportMeta("s_lot_plural_flg", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_plural_flg_META_1 = new MCReportMeta("sublot_plural_flg", "", "", "", true);
	static public final MCReportMeta s_sublot_plural_flg_META_1 = new MCReportMeta("s_sublot_plural_flg", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_po_qty_META_1 = new MCReportMeta("trd_unit_po_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_po_qty_META_1 = new MCReportMeta("s_trd_unit_po_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_po_qty_META_1 = new MCReportMeta("s_int_trd_unit_po_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_po_qty_META_1 = new MCReportMeta("s_dec_trd_unit_po_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta dlv_inst_qty_META_1 = new MCReportMeta("dlv_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_dlv_inst_qty_META_1 = new MCReportMeta("s_dlv_inst_qty", "", "", "", true);
	static public final MCReportMeta s_int_dlv_inst_qty_META_1 = new MCReportMeta("s_int_dlv_inst_qty", "", "", "", true);
	static public final MCReportMeta s_dec_dlv_inst_qty_META_1 = new MCReportMeta("s_dec_dlv_inst_qty", "", "", "", true);
	static public final MCReportMeta dlv_inst_unit_nm_META_1 = new MCReportMeta("dlv_inst_unit_nm", "", "", "", true);
	static public final MCReportMeta dlv_inst_unit_cd_META_1 = new MCReportMeta("dlv_inst_unit_cd", "", "", "", true);
	static public final MCReportMeta slo_po_qty_META_1 = new MCReportMeta("slo_po_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_slo_po_qty_META_1 = new MCReportMeta("s_slo_po_qty", "", "", "", true);
	static public final MCReportMeta s_int_slo_po_qty_META_1 = new MCReportMeta("s_int_slo_po_qty", "", "", "", true);
	static public final MCReportMeta s_dec_slo_po_qty_META_1 = new MCReportMeta("s_dec_slo_po_qty", "", "", "", true);
	static public final MCReportMeta slo_po_unit_nm_META_1 = new MCReportMeta("slo_po_unit_nm", "", "", "", true);
	static public final MCReportMeta slo_po_unit_cd_META_1 = new MCReportMeta("slo_po_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_upri_META_1 = new MCReportMeta("s_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_upri_META_1 = new MCReportMeta("s_int_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_upri_META_1 = new MCReportMeta("s_dec_trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_amt_META_1 = new MCReportMeta("s_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt_META_1 = new MCReportMeta("s_int_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt_META_1 = new MCReportMeta("s_dec_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta tax_cd_META_1 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_1 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_1 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta s_tax_rate_META_1 = new MCReportMeta("s_tax_rate", "", "", "", true);
	static public final MCReportMeta tax_typ_META_1 = new MCReportMeta("tax_typ", "", "", "", true);
	static public final MCReportMeta t_inc_tax_META_1 = new MCReportMeta("t_inc_tax", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta s_inc_tax_flg_META_1 = new MCReportMeta("s_inc_tax_flg", "", "", "", true);
	static public final MCReportMeta interim_flg_META_1 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta s_interim_flg_META_1 = new MCReportMeta("s_interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_in_amt_META_1 = new MCReportMeta("trd_cur_tax_in_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_tax_in_amt_META_1 = new MCReportMeta("s_trd_cur_tax_in_amt", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_in_amt_META_1 = new MCReportMeta("s_int_trd_cur_tax_in_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_in_amt_META_1 = new MCReportMeta("s_dec_trd_cur_tax_in_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_tax_amt_META_1 = new MCReportMeta("s_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_amt_META_1 = new MCReportMeta("s_int_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_amt_META_1 = new MCReportMeta("s_dec_trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_1 = new MCReportMeta("trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta s_int_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_int_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_dscnt_amt_META_1 = new MCReportMeta("s_dec_trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta dlv_inst_no_META_1 = new MCReportMeta("dlv_inst_no", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_no_META_1 = new MCReportMeta("dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_po_d_no_META_1 = new MCReportMeta("dlv_slip_po_d_no", "", "", "", true);
	static public final MCReportMeta ship_wt_META_1 = new MCReportMeta("ship_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_ship_wt_META_1 = new MCReportMeta("s_ship_wt", "", "", "", true);
	static public final MCReportMeta ship_dim_META_1 = new MCReportMeta("ship_dim", "COMMA", "", "", true);
	static public final MCReportMeta s_ship_dim_META_1 = new MCReportMeta("s_ship_dim", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_1 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta po_trd_d_rmrks_META_1 = new MCReportMeta("po_trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta pack_qty_META_1 = new MCReportMeta("pack_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_pack_qty_META_1 = new MCReportMeta("s_pack_qty", "", "", "", true);
	static public final MCReportMeta ttl_pack_qty_META_1 = new MCReportMeta("ttl_pack_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_pack_qty_META_1 = new MCReportMeta("s_ttl_pack_qty", "", "", "", true);
	static public final MCReportMeta po_d_sub_char1_META_1 = new MCReportMeta("po_d_sub_char1", "", "", "", true);
	static public final MCReportMeta po_d_sub_char2_META_1 = new MCReportMeta("po_d_sub_char2", "", "", "", true);
	static public final MCReportMeta po_d_sub_char3_META_1 = new MCReportMeta("po_d_sub_char3", "", "", "", true);
	static public final MCReportMeta arr_schd_sub_char1_META_1 = new MCReportMeta("arr_schd_sub_char1", "", "", "", true);
	static public final MCReportMeta arr_schd_sub_char2_META_1 = new MCReportMeta("arr_schd_sub_char2", "", "", "", true);
	static public final MCReportMeta arr_schd_sub_char3_META_1 = new MCReportMeta("arr_schd_sub_char3", "", "", "", true);
	static public final MCReportMeta dlt_slip_d_sub_char1_META_1 = new MCReportMeta("dlt_slip_d_sub_char1", "", "", "", true);
	static public final MCReportMeta dlt_slip_d_sub_char2_META_1 = new MCReportMeta("dlt_slip_d_sub_char2", "", "", "", true);
	static public final MCReportMeta dlt_slip_d_sub_char3_META_1 = new MCReportMeta("dlt_slip_d_sub_char3", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta dscnt_itm_flg_META_1 = new MCReportMeta("dscnt_itm_flg", "", "", "", true);
	static public final MCReportMeta prov_basis_typ_META_1 = new MCReportMeta("prov_basis_typ", "", "", "", true);
	static public final MCReportMeta base_ac_dt_lbl_META_1 = new MCReportMeta("base_ac_dt_lbl", "", "", "", true);
	static public final MCReportMeta base_ac_dt_META_1 = new MCReportMeta("base_ac_dt", "YMD", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("DlvSlipHdr",
			print_hm_META_0,
			formtitle_META_0,
			formtitle2_META_0,
			trd_nm_META_0,
			trd_cd_META_0,
			trd_ptn_typ_META_0,
			slip_sts_typ_nm_META_0,
			slip_sts_typ_META_0,
			adjst_slip_flg_META_0,
			s_schd_META_0,
			dlv_slip_no_META_0,
			dlv_slip_rev_META_0,
			dlv_slip_seq_META_0,
			dlv_slip_seq_view_META_0,
			ship_dlv_slip_no_META_0,
			lg_grp_nm_META_0,
			ship_dt_META_0,
			ship_tm_META_0,
			cst_nm_META_0,
			dlv_dt_META_0,
			dlv_tm_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_tm_META_0,
			ac_dt_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			slo_co_cd_META_0,
			slo_std_co_cd_META_0,
			slo_co_nm_META_0,
			biz_co_no_META_0,
			slo_co_alt_nm1_META_0,
			slo_co_alt_nm2_META_0,
			slo_co_alt_nm3_META_0,
			slo_co_alt_nm4_META_0,
			slo_co_zip_cd_META_0,
			slo_co_addr1_META_0,
			slo_co_addr2_META_0,
			slo_co_addr3_META_0,
			slo_co_addr4_META_0,
			slo_co_addr_META_0,
			slo_co_tel_META_0,
			slo_co_fax_META_0,
			slo_co_cntry_nm_META_0,
			dpt_nm_META_0,
			dpt_cd_META_0,
			usr_nm_META_0,
			usr_cd_META_0,
			po_co_cd_META_0,
			po_co_nm_META_0,
			po_co_alt_nm1_META_0,
			po_co_alt_nm2_META_0,
			po_co_alt_nm3_META_0,
			po_co_alt_nm4_META_0,
			po_co_zip_cd_META_0,
			po_co_addr1_META_0,
			po_co_addr2_META_0,
			po_co_addr3_META_0,
			po_co_addr4_META_0,
			po_co_addr_META_0,
			po_co_tel_META_0,
			po_co_fax_META_0,
			po_co_cntct_dpt_META_0,
			po_co_cntct_psn_META_0,
			po_co_cntct_psn_title_META_0,
			po_co_cntry_nm_META_0,
			dlv_id_typ_META_0,
			dlv_id_nm_META_0,
			dlv_id_alt_nm1_META_0,
			dlv_id_alt_nm2_META_0,
			dlv_id_alt_nm3_META_0,
			dlv_id_alt_nm4_META_0,
			dlv_id_cd_META_0,
			dlv_zip_cd_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_addr_META_0,
			dlv_tel_META_0,
			dlv_fax_META_0,
			dlv_cntct_dpt_META_0,
			dlv_cntct_psn_META_0,
			dlv_cntct_psn_title_META_0,
			dlv_cntry_nm_META_0,
			dlv_slip_po_no_lbl_META_0,
			dlv_slip_po_no_META_0,
			eiaj_dlv_slip_po_no_META_0,
			ttl_trd_cur_tax_amt_META_0,
			s_ttl_trd_cur_tax_amt_META_0,
			ttl_trd_cur_amt_META_0,
			s_ttl_trd_cur_amt_META_0,
			ttl_trd_cur_tax_in_amt_META_0,
			s_ttl_trd_cur_tax_in_amt_META_0,
			ttl_trd_cur_dscnt_amt_META_0,
			s_ttl_trd_cur_dscnt_amt_META_0,
			dlv_slip_act_no_META_0,
			trd_rmrks_META_0,
			po_trd_rmrks_META_0,
			po_sub_char1_META_0,
			po_sub_char2_META_0,
			po_sub_char3_META_0,
			dlv_slip_sub_char1_META_0,
			dlv_slip_sub_char2_META_0,
			dlv_slip_sub_char3_META_0,
			b_eiaj1_META_0,
			b_eiaj2_META_0,
			b_eiaj3_META_0,
			b_eiaj4_META_0,
			eiaj_b_slo_po_qty_META_0,
			s_eiaj_b_slo_po_qty_META_0,
			dlv_lbl_META_0,
			ship_dt_lbl_META_0,
			dlv_dt_lbl_META_0,
			lg_grp_lbl_META_0,
			cst_lbl_META_0,
			ship_dlv_slip_no_lbl_META_0,
			prov_flg_META_0,
			sls_flg_META_0,
			xrate_lbl_META_0,
			xrate_META_0,
			tax_rate_lbl_META_0,
			s_ttl_trd_cur_dscnt_amt2_META_0,
			s_ttl_trd_cur_amt2_META_0,
			s_ttl_trd_cur_tax_amt2_META_0,
			ttl_ex_trd_cur_tax_amt_META_0,
			s_ttl_ex_trd_cur_tax_amt_META_0,
			trd_cur_nm2_META_0,
			base_cur_nm_META_0
		);
		reportMetaMap.add("DlvSlipDtl",
			dlv_slip_d_no_META_1,
			dlv_slip_d_seq_META_1,
			ship_dlv_slip_d_no_META_1,
			dlv_slip_itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_view_META_1,
			itm_sub2_data_META_1,
			itm_sub3_view_META_1,
			itm_sub3_data_META_1,
			dlv_slip_itm_nm_META_1,
			dlv_slip_itm_alt_nm1_META_1,
			dlv_slip_itm_alt_nm2_META_1,
			dlv_slip_itm_alt_nm3_META_1,
			dlv_slip_itm_alt_nm4_META_1,
			sno1_META_1,
			sno2_META_1,
			sno3_META_1,
			sno4_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			lot_plural_flg_META_1,
			s_lot_plural_flg_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
			sublot_plural_flg_META_1,
			s_sublot_plural_flg_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_po_qty_META_1,
			s_trd_unit_po_qty_META_1,
			s_int_trd_unit_po_qty_META_1,
			s_dec_trd_unit_po_qty_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			base_unit_cd_META_1,
			base_unit_nm_META_1,
			dlv_inst_qty_META_1,
			s_dlv_inst_qty_META_1,
			s_int_dlv_inst_qty_META_1,
			s_dec_dlv_inst_qty_META_1,
			dlv_inst_unit_nm_META_1,
			dlv_inst_unit_cd_META_1,
			slo_po_qty_META_1,
			s_slo_po_qty_META_1,
			s_int_slo_po_qty_META_1,
			s_dec_slo_po_qty_META_1,
			slo_po_unit_nm_META_1,
			slo_po_unit_cd_META_1,
			trd_cur_upri_META_1,
			s_trd_cur_upri_META_1,
			s_int_trd_cur_upri_META_1,
			s_dec_trd_cur_upri_META_1,
			trd_cur_amt_META_1,
			s_trd_cur_amt_META_1,
			s_int_trd_cur_amt_META_1,
			s_dec_trd_cur_amt_META_1,
			tax_cd_META_1,
			tax_nm_META_1,
			tax_rate_META_1,
			s_tax_rate_META_1,
			tax_typ_META_1,
			t_inc_tax_META_1,
			inc_tax_flg_META_1,
			s_inc_tax_flg_META_1,
			interim_flg_META_1,
			s_interim_flg_META_1,
			trd_cur_tax_in_amt_META_1,
			s_trd_cur_tax_in_amt_META_1,
			s_int_trd_cur_tax_in_amt_META_1,
			s_dec_trd_cur_tax_in_amt_META_1,
			trd_cur_tax_amt_META_1,
			s_trd_cur_tax_amt_META_1,
			s_int_trd_cur_tax_amt_META_1,
			s_dec_trd_cur_tax_amt_META_1,
			trd_cur_dscnt_amt_META_1,
			s_trd_cur_dscnt_amt_META_1,
			s_int_trd_cur_dscnt_amt_META_1,
			s_dec_trd_cur_dscnt_amt_META_1,
			dlv_inst_no_META_1,
			dlv_inst_d_no_META_1,
			dlv_slip_po_d_no_META_1,
			ship_wt_META_1,
			s_ship_wt_META_1,
			ship_dim_META_1,
			s_ship_dim_META_1,
			trd_d_rmrks_META_1,
			po_trd_d_rmrks_META_1,
			pack_qty_META_1,
			s_pack_qty_META_1,
			ttl_pack_qty_META_1,
			s_ttl_pack_qty_META_1,
			po_d_sub_char1_META_1,
			po_d_sub_char2_META_1,
			po_d_sub_char3_META_1,
			arr_schd_sub_char1_META_1,
			arr_schd_sub_char2_META_1,
			arr_schd_sub_char3_META_1,
			dlt_slip_d_sub_char1_META_1,
			dlt_slip_d_sub_char2_META_1,
			dlt_slip_d_sub_char3_META_1,
			cst_itm_cd_META_1,
			cst_itm_nm_META_1,
			dscnt_itm_flg_META_1,
			prov_basis_typ_META_1,
			base_ac_dt_lbl_META_1,
			base_ac_dt_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_DlvSlip_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

