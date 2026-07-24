package mcframe.commonMSBD.MSBDR0050;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBDR_DlvInst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBDR0050";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DLVINSTHDRR_RC = new MCReportClass("DlvInstHdr", mcframe.commonMSBD.MSBDR0050.DlvInstHdrR.class);
	static public final MCReportClass DLVINSTDTLL_RC = new MCReportClass("DlvInstDtl", mcframe.commonMSBD.MSBDR0050.DlvInstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DLVINSTHDRR_RC,
		DLVINSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rpt_sts_typ_nm_META_0 = new MCReportMeta("rpt_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta rpt_sts_typ_META_0 = new MCReportMeta("rpt_sts_typ", "", "", "", true);
	static public final MCReportMeta dlv_inst_no_META_0 = new MCReportMeta("dlv_inst_no", "", "", "", true);
	static public final MCReportMeta dlv_inst_rev_META_0 = new MCReportMeta("dlv_inst_rev", "", "", "", true);
	static public final MCReportMeta print_hm_META_0 = new MCReportMeta("print_hm", "YMDHM", "", "", true);
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
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_0 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_0 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_0 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_0 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_0 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_0 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_0 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_0 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_0 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta hdr_trd_unit_qty_META_0 = new MCReportMeta("hdr_trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_hdr_trd_unit_qty_META_0 = new MCReportMeta("s_hdr_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta hdr_trd_unit_cd_META_0 = new MCReportMeta("hdr_trd_unit_cd", "", "", "", true);
	static public final MCReportMeta hdr_trd_unit_nm_META_0 = new MCReportMeta("hdr_trd_unit_nm", "", "", "", true);
	static public final MCReportMeta arr_qty_META_0 = new MCReportMeta("arr_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_arr_qty_META_0 = new MCReportMeta("s_arr_qty", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_tm_META_0 = new MCReportMeta("dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta sppl_itm_cd_META_0 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_0 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_0 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta maker_cd_META_0 = new MCReportMeta("maker_cd", "", "", "", true);
	static public final MCReportMeta maker_nm_META_0 = new MCReportMeta("maker_nm", "", "", "", true);
	static public final MCReportMeta maker_alt_nm1_META_0 = new MCReportMeta("maker_alt_nm1", "", "", "", true);
	static public final MCReportMeta maker_alt_nm2_META_0 = new MCReportMeta("maker_alt_nm2", "", "", "", true);
	static public final MCReportMeta maker_alt_nm3_META_0 = new MCReportMeta("maker_alt_nm3", "", "", "", true);
	static public final MCReportMeta maker_alt_nm4_META_0 = new MCReportMeta("maker_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_inst_dt_META_0 = new MCReportMeta("dlv_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta in_to_loc_cd_META_0 = new MCReportMeta("in_to_loc_cd", "", "", "", true);
	static public final MCReportMeta in_to_loc_nm_META_0 = new MCReportMeta("in_to_loc_nm", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm1_META_0 = new MCReportMeta("in_to_loc_alt_nm1", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm2_META_0 = new MCReportMeta("in_to_loc_alt_nm2", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm3_META_0 = new MCReportMeta("in_to_loc_alt_nm3", "", "", "", true);
	static public final MCReportMeta in_to_loc_alt_nm4_META_0 = new MCReportMeta("in_to_loc_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_inst_prnt_rmrks_META_0 = new MCReportMeta("dlv_inst_prnt_rmrks", "", "", "", true);
	static public final MCReportMeta po_sub_char1_META_0 = new MCReportMeta("po_sub_char1", "", "", "", true);
	static public final MCReportMeta po_sub_char2_META_0 = new MCReportMeta("po_sub_char2", "", "", "", true);
	static public final MCReportMeta po_sub_char3_META_0 = new MCReportMeta("po_sub_char3", "", "", "", true);
	static public final MCReportMeta po_d_sub_char1_META_0 = new MCReportMeta("po_d_sub_char1", "", "", "", true);
	static public final MCReportMeta po_d_sub_char2_META_0 = new MCReportMeta("po_d_sub_char2", "", "", "", true);
	static public final MCReportMeta po_d_sub_char3_META_0 = new MCReportMeta("po_d_sub_char3", "", "", "", true);
	static public final MCReportMeta dlv_inst_sub_char1_META_0 = new MCReportMeta("dlv_inst_sub_char1", "", "", "", true);
	static public final MCReportMeta dlv_inst_sub_char2_META_0 = new MCReportMeta("dlv_inst_sub_char2", "", "", "", true);
	static public final MCReportMeta dlv_inst_sub_char3_META_0 = new MCReportMeta("dlv_inst_sub_char3", "", "", "", true);
	static public final MCReportMeta in_to_loc_zip_cd_META_0 = new MCReportMeta("in_to_loc_zip_cd", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr1_META_0 = new MCReportMeta("in_to_loc_addr1", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr2_META_0 = new MCReportMeta("in_to_loc_addr2", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr3_META_0 = new MCReportMeta("in_to_loc_addr3", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr4_META_0 = new MCReportMeta("in_to_loc_addr4", "", "", "", true);
	static public final MCReportMeta in_to_loc_addr_META_0 = new MCReportMeta("in_to_loc_addr", "", "", "", true);
	static public final MCReportMeta in_to_loc_tel_META_0 = new MCReportMeta("in_to_loc_tel", "", "", "", true);
	static public final MCReportMeta in_to_loc_fax_META_0 = new MCReportMeta("in_to_loc_fax", "", "", "", true);
	static public final MCReportMeta in_to_cntry_nm_META_0 = new MCReportMeta("in_to_cntry_nm", "", "", "", true);
	static public final MCReportMeta dlv_zip_cd_META_0 = new MCReportMeta("dlv_zip_cd", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_0 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_tel_META_0 = new MCReportMeta("dlv_tel", "", "", "", true);
	static public final MCReportMeta dlv_fax_META_0 = new MCReportMeta("dlv_fax", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_0 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta tdlv_zip_cd_META_0 = new MCReportMeta("tdlv_zip_cd", "", "", "", true);
	static public final MCReportMeta tdlv_addr1_META_0 = new MCReportMeta("tdlv_addr1", "", "", "", true);
	static public final MCReportMeta tdlv_addr2_META_0 = new MCReportMeta("tdlv_addr2", "", "", "", true);
	static public final MCReportMeta tdlv_addr3_META_0 = new MCReportMeta("tdlv_addr3", "", "", "", true);
	static public final MCReportMeta tdlv_addr4_META_0 = new MCReportMeta("tdlv_addr4", "", "", "", true);
	static public final MCReportMeta tdlv_addr_META_0 = new MCReportMeta("tdlv_addr", "", "", "", true);
	static public final MCReportMeta tdlv_tel_META_0 = new MCReportMeta("tdlv_tel", "", "", "", true);
	static public final MCReportMeta tdlv_fax_META_0 = new MCReportMeta("tdlv_fax", "", "", "", true);
	static public final MCReportMeta tdlv_cntry_nm_META_0 = new MCReportMeta("tdlv_cntry_nm", "", "", "", true);

	static public final MCReportMeta dlv_inst_d_no_META_1 = new MCReportMeta("dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta dtl_dlv_rqst_dt_META_1 = new MCReportMeta("dtl_dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dtl_dlv_rqst_tm_META_1 = new MCReportMeta("dtl_dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta dtl_trd_unit_cd_META_1 = new MCReportMeta("dtl_trd_unit_cd", "", "", "", true);
	static public final MCReportMeta dtl_trd_unit_nm_META_1 = new MCReportMeta("dtl_trd_unit_nm", "", "", "", true);
	static public final MCReportMeta insp_end_dt_lbl_META_1 = new MCReportMeta("insp_end_dt_lbl", "", "", "", true);
	static public final MCReportMeta insp_end_dt_META_1 = new MCReportMeta("insp_end_dt", "YMD", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_cd_META_1 = new MCReportMeta("dtl_in_to_loc_cd", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_nm_META_1 = new MCReportMeta("dtl_in_to_loc_nm", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_alt_nm1_META_1 = new MCReportMeta("dtl_in_to_loc_alt_nm1", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_alt_nm2_META_1 = new MCReportMeta("dtl_in_to_loc_alt_nm2", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_alt_nm3_META_1 = new MCReportMeta("dtl_in_to_loc_alt_nm3", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_alt_nm4_META_1 = new MCReportMeta("dtl_in_to_loc_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_inst_prnt_d_rmrks_META_1 = new MCReportMeta("dlv_inst_prnt_d_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_sub_char1_META_1 = new MCReportMeta("dlv_inst_d_sub_char1", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_sub_char2_META_1 = new MCReportMeta("dlv_inst_d_sub_char2", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_sub_char3_META_1 = new MCReportMeta("dlv_inst_d_sub_char3", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_zip_cd_META_1 = new MCReportMeta("dtl_in_to_loc_zip_cd", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_addr1_META_1 = new MCReportMeta("dtl_in_to_loc_addr1", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_addr2_META_1 = new MCReportMeta("dtl_in_to_loc_addr2", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_addr3_META_1 = new MCReportMeta("dtl_in_to_loc_addr3", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_addr4_META_1 = new MCReportMeta("dtl_in_to_loc_addr4", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_addr_META_1 = new MCReportMeta("dtl_in_to_loc_addr", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_tel_META_1 = new MCReportMeta("dtl_in_to_loc_tel", "", "", "", true);
	static public final MCReportMeta dtl_in_to_loc_fax_META_1 = new MCReportMeta("dtl_in_to_loc_fax", "", "", "", true);
	static public final MCReportMeta dtl_in_to_cntry_nm_META_1 = new MCReportMeta("dtl_in_to_cntry_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("DlvInstHdr",
			rpt_sts_typ_nm_META_0,
			rpt_sts_typ_META_0,
			dlv_inst_no_META_0,
			dlv_inst_rev_META_0,
			print_hm_META_0,
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
			po_no_META_0,
			po_d_no_META_0,
			itm_cd_META_0,
			itm_sub1_view_META_0,
			itm_sub1_data_META_0,
			itm_sub2_view_META_0,
			itm_sub2_data_META_0,
			itm_sub3_view_META_0,
			itm_sub3_data_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			ver_no_lbl_META_0,
			ver_no_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			base_unit_qty_META_0,
			s_base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			hdr_trd_unit_qty_META_0,
			s_hdr_trd_unit_qty_META_0,
			hdr_trd_unit_cd_META_0,
			hdr_trd_unit_nm_META_0,
			arr_qty_META_0,
			s_arr_qty_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_tm_META_0,
			sppl_itm_cd_META_0,
			sppl_itm_nm_META_0,
			bp_lot_no_META_0,
			maker_cd_META_0,
			maker_nm_META_0,
			maker_alt_nm1_META_0,
			maker_alt_nm2_META_0,
			maker_alt_nm3_META_0,
			maker_alt_nm4_META_0,
			dlv_inst_dt_META_0,
			in_to_loc_cd_META_0,
			in_to_loc_nm_META_0,
			in_to_loc_alt_nm1_META_0,
			in_to_loc_alt_nm2_META_0,
			in_to_loc_alt_nm3_META_0,
			in_to_loc_alt_nm4_META_0,
			dlv_inst_prnt_rmrks_META_0,
			po_sub_char1_META_0,
			po_sub_char2_META_0,
			po_sub_char3_META_0,
			po_d_sub_char1_META_0,
			po_d_sub_char2_META_0,
			po_d_sub_char3_META_0,
			dlv_inst_sub_char1_META_0,
			dlv_inst_sub_char2_META_0,
			dlv_inst_sub_char3_META_0,
			in_to_loc_zip_cd_META_0,
			in_to_loc_addr1_META_0,
			in_to_loc_addr2_META_0,
			in_to_loc_addr3_META_0,
			in_to_loc_addr4_META_0,
			in_to_loc_addr_META_0,
			in_to_loc_tel_META_0,
			in_to_loc_fax_META_0,
			in_to_cntry_nm_META_0,
			dlv_zip_cd_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_addr_META_0,
			dlv_tel_META_0,
			dlv_fax_META_0,
			dlv_cntry_nm_META_0,
			tdlv_zip_cd_META_0,
			tdlv_addr1_META_0,
			tdlv_addr2_META_0,
			tdlv_addr3_META_0,
			tdlv_addr4_META_0,
			tdlv_addr_META_0,
			tdlv_tel_META_0,
			tdlv_fax_META_0,
			tdlv_cntry_nm_META_0
		);
		reportMetaMap.add("DlvInstDtl",
			dlv_inst_d_no_META_1,
			dtl_dlv_rqst_dt_META_1,
			dtl_dlv_rqst_tm_META_1,
			trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			dtl_trd_unit_cd_META_1,
			dtl_trd_unit_nm_META_1,
			insp_end_dt_lbl_META_1,
			insp_end_dt_META_1,
			dtl_in_to_loc_cd_META_1,
			dtl_in_to_loc_nm_META_1,
			dtl_in_to_loc_alt_nm1_META_1,
			dtl_in_to_loc_alt_nm2_META_1,
			dtl_in_to_loc_alt_nm3_META_1,
			dtl_in_to_loc_alt_nm4_META_1,
			dlv_inst_prnt_d_rmrks_META_1,
			dlv_inst_d_sub_char1_META_1,
			dlv_inst_d_sub_char2_META_1,
			dlv_inst_d_sub_char3_META_1,
			dtl_in_to_loc_zip_cd_META_1,
			dtl_in_to_loc_addr1_META_1,
			dtl_in_to_loc_addr2_META_1,
			dtl_in_to_loc_addr3_META_1,
			dtl_in_to_loc_addr4_META_1,
			dtl_in_to_loc_addr_META_1,
			dtl_in_to_loc_tel_META_1,
			dtl_in_to_loc_fax_META_1,
			dtl_in_to_cntry_nm_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBDR_DlvInst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

