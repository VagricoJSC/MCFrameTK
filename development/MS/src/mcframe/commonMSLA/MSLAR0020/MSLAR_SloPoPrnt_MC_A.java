package mcframe.commonMSLA.MSLAR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_SloPoPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR0020";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR0020.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta data_lno_META_0 = new MCReportMeta("data_lno", "", "", "", true);
	static public final MCReportMeta data_no_META_0 = new MCReportMeta("data_no", "", "", "", true);
	static public final MCReportMeta trd_typ_cd_META_0 = new MCReportMeta("trd_typ_cd", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHMS", "", "", true);
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta po_crud_typ_META_0 = new MCReportMeta("po_crud_typ", "", "", "", true);
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_rev_META_0 = new MCReportMeta("po_rev", "", "", "", true);
	static public final MCReportMeta po_d_no_META_0 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta po_co_cd_META_0 = new MCReportMeta("po_co_cd", "", "", "", true);
	static public final MCReportMeta po_co_nm_META_0 = new MCReportMeta("po_co_nm", "", "", "", true);
	static public final MCReportMeta po_co_cntry_cd_META_0 = new MCReportMeta("po_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta slo_co_cd_META_0 = new MCReportMeta("slo_co_cd", "", "", "", true);
	static public final MCReportMeta slo_co_nm_META_0 = new MCReportMeta("slo_co_nm", "", "", "", true);
	static public final MCReportMeta slo_co_cntry_cd_META_0 = new MCReportMeta("slo_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta po_dt_META_0 = new MCReportMeta("po_dt", "YMD", "", "", true);
	static public final MCReportMeta upd_po_print_schd_dt_META_0 = new MCReportMeta("upd_po_print_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta crct_rsn_nm_META_0 = new MCReportMeta("crct_rsn_nm", "", "", "", true);
	static public final MCReportMeta crct_rsn_rmrks_META_0 = new MCReportMeta("crct_rsn_rmrks", "", "", "", true);
	static public final MCReportMeta po_print_txt_META_0 = new MCReportMeta("po_print_txt", "", "", "", true);
	static public final MCReportMeta po_print_rmrks_META_0 = new MCReportMeta("po_print_rmrks", "", "", "", true);
	static public final MCReportMeta po_print_d_rmrks_META_0 = new MCReportMeta("po_print_d_rmrks", "", "", "", true);
	static public final MCReportMeta purc_dpt_cd_META_0 = new MCReportMeta("purc_dpt_cd", "", "", "", true);
	static public final MCReportMeta purc_dpt_nm_META_0 = new MCReportMeta("purc_dpt_nm", "", "", "", true);
	static public final MCReportMeta purc_usr_cd_META_0 = new MCReportMeta("purc_usr_cd", "", "", "", true);
	static public final MCReportMeta purc_usr_nm_META_0 = new MCReportMeta("purc_usr_nm", "", "", "", true);
	static public final MCReportMeta po_co_itm_cd_META_0 = new MCReportMeta("po_co_itm_cd", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub1_META_0 = new MCReportMeta("po_co_itm_sub1", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub2_META_0 = new MCReportMeta("po_co_itm_sub2", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub3_META_0 = new MCReportMeta("po_co_itm_sub3", "", "", "", true);
	static public final MCReportMeta po_co_itm_nm_META_0 = new MCReportMeta("po_co_itm_nm", "", "", "", true);
	static public final MCReportMeta po_co_iv_itm_nm_META_0 = new MCReportMeta("po_co_iv_itm_nm", "", "", "", true);
	static public final MCReportMeta po_co_sundry_itm_flg_META_0 = new MCReportMeta("po_co_sundry_itm_flg", "", "", "", true);
	static public final MCReportMeta dest_cd1_META_0 = new MCReportMeta("dest_cd1", "", "", "", true);
	static public final MCReportMeta dest_nm1_META_0 = new MCReportMeta("dest_nm1", "", "", "", true);
	static public final MCReportMeta dest_cd2_META_0 = new MCReportMeta("dest_cd2", "", "", "", true);
	static public final MCReportMeta dest_nm2_META_0 = new MCReportMeta("dest_nm2", "", "", "", true);
	static public final MCReportMeta dest_cd3_META_0 = new MCReportMeta("dest_cd3", "", "", "", true);
	static public final MCReportMeta dest_nm3_META_0 = new MCReportMeta("dest_nm3", "", "", "", true);
	static public final MCReportMeta outsrc_flg_META_0 = new MCReportMeta("outsrc_flg", "", "", "", true);
	static public final MCReportMeta drct_dlv_flg_META_0 = new MCReportMeta("drct_dlv_flg", "", "", "", true);
	static public final MCReportMeta purc_id_typ_META_0 = new MCReportMeta("purc_id_typ", "", "", "", true);
	static public final MCReportMeta sls_cststk_flg_META_0 = new MCReportMeta("sls_cststk_flg", "", "", "", true);
	static public final MCReportMeta slo_typ_META_0 = new MCReportMeta("slo_typ", "", "", "", true);
	static public final MCReportMeta sls_dpt_cd_META_0 = new MCReportMeta("sls_dpt_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_nm_META_0 = new MCReportMeta("sls_dpt_nm", "", "", "", true);
	static public final MCReportMeta sls_usr_cd_META_0 = new MCReportMeta("sls_usr_cd", "", "", "", true);
	static public final MCReportMeta sls_usr_nm_META_0 = new MCReportMeta("sls_usr_nm", "", "", "", true);
	static public final MCReportMeta in_to_id_typ_META_0 = new MCReportMeta("in_to_id_typ", "", "", "", true);
	static public final MCReportMeta in_to_id_cd_META_0 = new MCReportMeta("in_to_id_cd", "", "", "", true);
	static public final MCReportMeta in_to_nm_META_0 = new MCReportMeta("in_to_nm", "", "", "", true);
	static public final MCReportMeta in_to_zip_cd_META_0 = new MCReportMeta("in_to_zip_cd", "", "", "", true);
	static public final MCReportMeta in_to_addr1_META_0 = new MCReportMeta("in_to_addr1", "", "", "", true);
	static public final MCReportMeta in_to_addr2_META_0 = new MCReportMeta("in_to_addr2", "", "", "", true);
	static public final MCReportMeta in_to_addr3_META_0 = new MCReportMeta("in_to_addr3", "", "", "", true);
	static public final MCReportMeta in_to_addr4_META_0 = new MCReportMeta("in_to_addr4", "", "", "", true);
	static public final MCReportMeta in_to_cntct_dpt_META_0 = new MCReportMeta("in_to_cntct_dpt", "", "", "", true);
	static public final MCReportMeta in_to_cntct_psn_META_0 = new MCReportMeta("in_to_cntct_psn", "", "", "", true);
	static public final MCReportMeta in_to_tel_META_0 = new MCReportMeta("in_to_tel", "", "", "", true);
	static public final MCReportMeta in_to_fax_META_0 = new MCReportMeta("in_to_fax", "", "", "", true);
	static public final MCReportMeta in_to_sundry_flg_META_0 = new MCReportMeta("in_to_sundry_flg", "", "", "", true);
	static public final MCReportMeta in_to_cntry_cd_META_0 = new MCReportMeta("in_to_cntry_cd", "", "", "", true);
	static public final MCReportMeta site_cd_META_0 = new MCReportMeta("site_cd", "", "", "", true);
	static public final MCReportMeta site_nm_META_0 = new MCReportMeta("site_nm", "", "", "", true);
	static public final MCReportMeta drct_dlv_bp_cd_META_0 = new MCReportMeta("drct_dlv_bp_cd", "", "", "", true);
	static public final MCReportMeta drct_dlv_bp_nm_META_0 = new MCReportMeta("drct_dlv_bp_nm", "", "", "", true);
	static public final MCReportMeta drct_dlv_cntry_cd_META_0 = new MCReportMeta("drct_dlv_cntry_cd", "", "", "", true);
	static public final MCReportMeta tdlv_cd_META_0 = new MCReportMeta("tdlv_cd", "", "", "", true);
	static public final MCReportMeta tdlv_nm_META_0 = new MCReportMeta("tdlv_nm", "", "", "", true);
	static public final MCReportMeta tdlv_zip_cd_META_0 = new MCReportMeta("tdlv_zip_cd", "", "", "", true);
	static public final MCReportMeta tdlv_addr1_META_0 = new MCReportMeta("tdlv_addr1", "", "", "", true);
	static public final MCReportMeta tdlv_addr2_META_0 = new MCReportMeta("tdlv_addr2", "", "", "", true);
	static public final MCReportMeta tdlv_addr3_META_0 = new MCReportMeta("tdlv_addr3", "", "", "", true);
	static public final MCReportMeta tdlv_addr4_META_0 = new MCReportMeta("tdlv_addr4", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_dpt_META_0 = new MCReportMeta("tdlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_psn_META_0 = new MCReportMeta("tdlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta tdlv_tel_META_0 = new MCReportMeta("tdlv_tel", "", "", "", true);
	static public final MCReportMeta tdlv_fax_META_0 = new MCReportMeta("tdlv_fax", "", "", "", true);
	static public final MCReportMeta tdlv_sundry_flg_META_0 = new MCReportMeta("tdlv_sundry_flg", "", "", "", true);
	static public final MCReportMeta tdlv_cntry_cd_META_0 = new MCReportMeta("tdlv_cntry_cd", "", "", "", true);
	static public final MCReportMeta dlv_slip_rmrks_META_0 = new MCReportMeta("dlv_slip_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_rmrks_META_0 = new MCReportMeta("dlv_slip_d_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_day_week_typ_META_0 = new MCReportMeta("dlv_day_week_typ", "", "", "", true);
	static public final MCReportMeta pri_prnt_typ_META_0 = new MCReportMeta("pri_prnt_typ", "", "", "", true);
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
	static public final MCReportMeta trnspt_cd_META_0 = new MCReportMeta("trnspt_cd", "", "", "", true);
	static public final MCReportMeta trnspt_nm_META_0 = new MCReportMeta("trnspt_nm", "", "", "", true);
	static public final MCReportMeta load_port_cd_META_0 = new MCReportMeta("load_port_cd", "", "", "", true);
	static public final MCReportMeta load_port_nm_META_0 = new MCReportMeta("load_port_nm", "", "", "", true);
	static public final MCReportMeta dschrg_port_cd_META_0 = new MCReportMeta("dschrg_port_cd", "", "", "", true);
	static public final MCReportMeta dschrg_port_nm_META_0 = new MCReportMeta("dschrg_port_nm", "", "", "", true);
	static public final MCReportMeta via_port_cd_META_0 = new MCReportMeta("via_port_cd", "", "", "", true);
	static public final MCReportMeta via_port_nm_META_0 = new MCReportMeta("via_port_nm", "", "", "", true);
	static public final MCReportMeta slo_co_itm_cd_META_0 = new MCReportMeta("slo_co_itm_cd", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub1_META_0 = new MCReportMeta("slo_co_itm_sub1", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub2_META_0 = new MCReportMeta("slo_co_itm_sub2", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub3_META_0 = new MCReportMeta("slo_co_itm_sub3", "", "", "", true);
	static public final MCReportMeta slo_co_itm_nm_META_0 = new MCReportMeta("slo_co_itm_nm", "", "", "", true);
	static public final MCReportMeta cntry_org_cd_META_0 = new MCReportMeta("cntry_org_cd", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta gd_cd_META_0 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_0 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_0 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta interim_flg_META_0 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_0 = new MCReportMeta("trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_0 = new MCReportMeta("trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_0 = new MCReportMeta("trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta dscnt_rsn_cd_META_0 = new MCReportMeta("dscnt_rsn_cd", "", "", "", true);
	static public final MCReportMeta dscnt_rsn_nm_META_0 = new MCReportMeta("dscnt_rsn_nm", "", "", "", true);
	static public final MCReportMeta tax_fix_flg_META_0 = new MCReportMeta("tax_fix_flg", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_0 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_0 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta tax_typ_META_0 = new MCReportMeta("tax_typ", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_0 = new MCReportMeta("trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta ship_wh_cd_META_0 = new MCReportMeta("ship_wh_cd", "", "", "", true);
	static public final MCReportMeta ship_wh_nm_META_0 = new MCReportMeta("ship_wh_nm", "", "", "", true);
	static public final MCReportMeta ship_block_flg_META_0 = new MCReportMeta("ship_block_flg", "", "", "", true);
	static public final MCReportMeta abort_flg_META_0 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta set_itm_grp_no_META_0 = new MCReportMeta("set_itm_grp_no", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_hm_META_0 = new MCReportMeta("dlv_rqst_hm", "HM", "", "", true);
	static public final MCReportMeta purc_schd_dt_META_0 = new MCReportMeta("purc_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta maker_cd_META_0 = new MCReportMeta("maker_cd", "", "", "", true);
	static public final MCReportMeta maker_nm_META_0 = new MCReportMeta("maker_nm", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta sub_char4_META_0 = new MCReportMeta("sub_char4", "", "", "", true);
	static public final MCReportMeta sub_char5_META_0 = new MCReportMeta("sub_char5", "", "", "", true);
	static public final MCReportMeta sub_char6_META_0 = new MCReportMeta("sub_char6", "", "", "", true);
	static public final MCReportMeta sub_char7_META_0 = new MCReportMeta("sub_char7", "", "", "", true);
	static public final MCReportMeta sub_char8_META_0 = new MCReportMeta("sub_char8", "", "", "", true);
	static public final MCReportMeta sub_char9_META_0 = new MCReportMeta("sub_char9", "", "", "", true);
	static public final MCReportMeta sub_char10_META_0 = new MCReportMeta("sub_char10", "", "", "", true);
	static public final MCReportMeta sub_char11_META_0 = new MCReportMeta("sub_char11", "", "", "", true);
	static public final MCReportMeta sub_char12_META_0 = new MCReportMeta("sub_char12", "", "", "", true);
	static public final MCReportMeta sub_char13_META_0 = new MCReportMeta("sub_char13", "", "", "", true);
	static public final MCReportMeta sub_char14_META_0 = new MCReportMeta("sub_char14", "", "", "", true);
	static public final MCReportMeta sub_char15_META_0 = new MCReportMeta("sub_char15", "", "", "", true);
	static public final MCReportMeta sub_char16_META_0 = new MCReportMeta("sub_char16", "", "", "", true);
	static public final MCReportMeta sub_char17_META_0 = new MCReportMeta("sub_char17", "", "", "", true);
	static public final MCReportMeta sub_char18_META_0 = new MCReportMeta("sub_char18", "", "", "", true);
	static public final MCReportMeta sub_char19_META_0 = new MCReportMeta("sub_char19", "", "", "", true);
	static public final MCReportMeta sub_char20_META_0 = new MCReportMeta("sub_char20", "", "", "", true);
	static public final MCReportMeta sub_char21_META_0 = new MCReportMeta("sub_char21", "", "", "", true);
	static public final MCReportMeta sub_char22_META_0 = new MCReportMeta("sub_char22", "", "", "", true);
	static public final MCReportMeta sub_char23_META_0 = new MCReportMeta("sub_char23", "", "", "", true);
	static public final MCReportMeta sub_char24_META_0 = new MCReportMeta("sub_char24", "", "", "", true);
	static public final MCReportMeta sub_char25_META_0 = new MCReportMeta("sub_char25", "", "", "", true);
	static public final MCReportMeta sub_char26_META_0 = new MCReportMeta("sub_char26", "", "", "", true);
	static public final MCReportMeta sub_char27_META_0 = new MCReportMeta("sub_char27", "", "", "", true);
	static public final MCReportMeta sub_char28_META_0 = new MCReportMeta("sub_char28", "", "", "", true);
	static public final MCReportMeta sub_char29_META_0 = new MCReportMeta("sub_char29", "", "", "", true);
	static public final MCReportMeta sub_char30_META_0 = new MCReportMeta("sub_char30", "", "", "", true);
	static public final MCReportMeta sub_num1_META_0 = new MCReportMeta("sub_num1", "", "", "", true);
	static public final MCReportMeta sub_num2_META_0 = new MCReportMeta("sub_num2", "", "", "", true);
	static public final MCReportMeta sub_num3_META_0 = new MCReportMeta("sub_num3", "", "", "", true);
	static public final MCReportMeta sub_num4_META_0 = new MCReportMeta("sub_num4", "", "", "", true);
	static public final MCReportMeta sub_num5_META_0 = new MCReportMeta("sub_num5", "", "", "", true);
	static public final MCReportMeta sub_dt1_META_0 = new MCReportMeta("sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta sub_dt2_META_0 = new MCReportMeta("sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta sub_dt3_META_0 = new MCReportMeta("sub_dt3", "YMD", "", "", true);
	static public final MCReportMeta sub_dt4_META_0 = new MCReportMeta("sub_dt4", "YMD", "", "", true);
	static public final MCReportMeta sub_dt5_META_0 = new MCReportMeta("sub_dt5", "YMD", "", "", true);
	static public final MCReportMeta edi_sub_char1_META_0 = new MCReportMeta("edi_sub_char1", "", "", "", true);
	static public final MCReportMeta edi_sub_char2_META_0 = new MCReportMeta("edi_sub_char2", "", "", "", true);
	static public final MCReportMeta edi_sub_char3_META_0 = new MCReportMeta("edi_sub_char3", "", "", "", true);
	static public final MCReportMeta edi_sub_char4_META_0 = new MCReportMeta("edi_sub_char4", "", "", "", true);
	static public final MCReportMeta edi_sub_char5_META_0 = new MCReportMeta("edi_sub_char5", "", "", "", true);
	static public final MCReportMeta edi_sub_num1_META_0 = new MCReportMeta("edi_sub_num1", "", "", "", true);
	static public final MCReportMeta edi_sub_dt1_META_0 = new MCReportMeta("edi_sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta edi_sub_d_char1_META_0 = new MCReportMeta("edi_sub_d_char1", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char2_META_0 = new MCReportMeta("edi_sub_d_char2", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char3_META_0 = new MCReportMeta("edi_sub_d_char3", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char4_META_0 = new MCReportMeta("edi_sub_d_char4", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char5_META_0 = new MCReportMeta("edi_sub_d_char5", "", "", "", true);
	static public final MCReportMeta edi_sub_d_num1_META_0 = new MCReportMeta("edi_sub_d_num1", "", "", "", true);
	static public final MCReportMeta edi_sub_d_dt1_META_0 = new MCReportMeta("edi_sub_d_dt1", "YMD", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_lno_META_0,
			data_no_META_0,
			trd_typ_cd_META_0,
			data_make_dt_META_0,
			data_crud_typ_META_0,
			po_crud_typ_META_0,
			po_no_META_0,
			po_rev_META_0,
			po_d_no_META_0,
			po_co_cd_META_0,
			po_co_nm_META_0,
			po_co_cntry_cd_META_0,
			slo_co_cd_META_0,
			slo_co_nm_META_0,
			slo_co_cntry_cd_META_0,
			po_dt_META_0,
			upd_po_print_schd_dt_META_0,
			crct_rsn_nm_META_0,
			crct_rsn_rmrks_META_0,
			po_print_txt_META_0,
			po_print_rmrks_META_0,
			po_print_d_rmrks_META_0,
			purc_dpt_cd_META_0,
			purc_dpt_nm_META_0,
			purc_usr_cd_META_0,
			purc_usr_nm_META_0,
			po_co_itm_cd_META_0,
			po_co_itm_sub1_META_0,
			po_co_itm_sub2_META_0,
			po_co_itm_sub3_META_0,
			po_co_itm_nm_META_0,
			po_co_iv_itm_nm_META_0,
			po_co_sundry_itm_flg_META_0,
			dest_cd1_META_0,
			dest_nm1_META_0,
			dest_cd2_META_0,
			dest_nm2_META_0,
			dest_cd3_META_0,
			dest_nm3_META_0,
			outsrc_flg_META_0,
			drct_dlv_flg_META_0,
			purc_id_typ_META_0,
			sls_cststk_flg_META_0,
			slo_typ_META_0,
			sls_dpt_cd_META_0,
			sls_dpt_nm_META_0,
			sls_usr_cd_META_0,
			sls_usr_nm_META_0,
			in_to_id_typ_META_0,
			in_to_id_cd_META_0,
			in_to_nm_META_0,
			in_to_zip_cd_META_0,
			in_to_addr1_META_0,
			in_to_addr2_META_0,
			in_to_addr3_META_0,
			in_to_addr4_META_0,
			in_to_cntct_dpt_META_0,
			in_to_cntct_psn_META_0,
			in_to_tel_META_0,
			in_to_fax_META_0,
			in_to_sundry_flg_META_0,
			in_to_cntry_cd_META_0,
			site_cd_META_0,
			site_nm_META_0,
			drct_dlv_bp_cd_META_0,
			drct_dlv_bp_nm_META_0,
			drct_dlv_cntry_cd_META_0,
			tdlv_cd_META_0,
			tdlv_nm_META_0,
			tdlv_zip_cd_META_0,
			tdlv_addr1_META_0,
			tdlv_addr2_META_0,
			tdlv_addr3_META_0,
			tdlv_addr4_META_0,
			tdlv_cntct_dpt_META_0,
			tdlv_cntct_psn_META_0,
			tdlv_tel_META_0,
			tdlv_fax_META_0,
			tdlv_sundry_flg_META_0,
			tdlv_cntry_cd_META_0,
			dlv_slip_rmrks_META_0,
			dlv_slip_d_rmrks_META_0,
			dlv_day_week_typ_META_0,
			pri_prnt_typ_META_0,
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
			trnspt_cd_META_0,
			trnspt_nm_META_0,
			load_port_cd_META_0,
			load_port_nm_META_0,
			dschrg_port_cd_META_0,
			dschrg_port_nm_META_0,
			via_port_cd_META_0,
			via_port_nm_META_0,
			slo_co_itm_cd_META_0,
			slo_co_itm_sub1_META_0,
			slo_co_itm_sub2_META_0,
			slo_co_itm_sub3_META_0,
			slo_co_itm_nm_META_0,
			cntry_org_cd_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			gd_cd_META_0,
			gd_nm_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			trd_unit_qty_META_0,
			trd_cur_cd_META_0,
			inc_tax_flg_META_0,
			interim_flg_META_0,
			trd_cur_upri_META_0,
			trd_cur_amt_META_0,
			trd_cur_dscnt_amt_META_0,
			dscnt_rsn_cd_META_0,
			dscnt_rsn_nm_META_0,
			tax_fix_flg_META_0,
			tax_cd_META_0,
			tax_nm_META_0,
			tax_rate_META_0,
			tax_typ_META_0,
			trd_cur_tax_amt_META_0,
			ship_wh_cd_META_0,
			ship_wh_nm_META_0,
			ship_block_flg_META_0,
			abort_flg_META_0,
			set_itm_grp_no_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_hm_META_0,
			purc_schd_dt_META_0,
			maker_cd_META_0,
			maker_nm_META_0,
			ver_no_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			sub_char4_META_0,
			sub_char5_META_0,
			sub_char6_META_0,
			sub_char7_META_0,
			sub_char8_META_0,
			sub_char9_META_0,
			sub_char10_META_0,
			sub_char11_META_0,
			sub_char12_META_0,
			sub_char13_META_0,
			sub_char14_META_0,
			sub_char15_META_0,
			sub_char16_META_0,
			sub_char17_META_0,
			sub_char18_META_0,
			sub_char19_META_0,
			sub_char20_META_0,
			sub_char21_META_0,
			sub_char22_META_0,
			sub_char23_META_0,
			sub_char24_META_0,
			sub_char25_META_0,
			sub_char26_META_0,
			sub_char27_META_0,
			sub_char28_META_0,
			sub_char29_META_0,
			sub_char30_META_0,
			sub_num1_META_0,
			sub_num2_META_0,
			sub_num3_META_0,
			sub_num4_META_0,
			sub_num5_META_0,
			sub_dt1_META_0,
			sub_dt2_META_0,
			sub_dt3_META_0,
			sub_dt4_META_0,
			sub_dt5_META_0,
			edi_sub_char1_META_0,
			edi_sub_char2_META_0,
			edi_sub_char3_META_0,
			edi_sub_char4_META_0,
			edi_sub_char5_META_0,
			edi_sub_num1_META_0,
			edi_sub_dt1_META_0,
			edi_sub_d_char1_META_0,
			edi_sub_d_char2_META_0,
			edi_sub_d_char3_META_0,
			edi_sub_d_char4_META_0,
			edi_sub_d_char5_META_0,
			edi_sub_d_num1_META_0,
			edi_sub_d_dt1_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSLAR_SloPoPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

