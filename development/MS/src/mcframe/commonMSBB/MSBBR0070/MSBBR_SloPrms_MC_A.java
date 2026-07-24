package mcframe.commonMSBB.MSBBR0070;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBBR_SloPrms_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBBR0070";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass SLOPRMSHDRR_RC = new MCReportClass("SloPrmsHdr", mcframe.commonMSBB.MSBBR0070.SloPrmsHdrR.class);
	static public final MCReportClass SLOPRMSDTLL_RC = new MCReportClass("SloPrmsDtl", mcframe.commonMSBB.MSBBR0070.SloPrmsDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		SLOPRMSHDRR_RC,
		SLOPRMSDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rpt_sts_typ_nm_META_0 = new MCReportMeta("rpt_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta rpt_sts_typ_META_0 = new MCReportMeta("rpt_sts_typ", "", "", "", true);
	static public final MCReportMeta prms_prnt_tm_META_0 = new MCReportMeta("prms_prnt_tm", "YMDHM", "", "", true);
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
	static public final MCReportMeta dlv_cd_META_0 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dlv_zip_cd_META_0 = new MCReportMeta("dlv_zip_cd", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_0 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_nm_META_0 = new MCReportMeta("dlv_nm", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm1_META_0 = new MCReportMeta("dlv_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm2_META_0 = new MCReportMeta("dlv_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm3_META_0 = new MCReportMeta("dlv_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm4_META_0 = new MCReportMeta("dlv_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_cntct_dpt_META_0 = new MCReportMeta("dlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_META_0 = new MCReportMeta("dlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_title_META_0 = new MCReportMeta("dlv_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta dlv_tel_META_0 = new MCReportMeta("dlv_tel", "", "", "", true);
	static public final MCReportMeta dlv_fax_META_0 = new MCReportMeta("dlv_fax", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_0 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta co_cntry_nm_META_0 = new MCReportMeta("co_cntry_nm", "", "", "", true);
	static public final MCReportMeta sls_dpt_cd_META_0 = new MCReportMeta("sls_dpt_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_zip_cd_META_0 = new MCReportMeta("sls_dpt_zip_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr1_META_0 = new MCReportMeta("sls_dpt_addr1", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr2_META_0 = new MCReportMeta("sls_dpt_addr2", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr3_META_0 = new MCReportMeta("sls_dpt_addr3", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr4_META_0 = new MCReportMeta("sls_dpt_addr4", "", "", "", true);
	static public final MCReportMeta sls_dpt_addr_META_0 = new MCReportMeta("sls_dpt_addr", "", "", "", true);
	static public final MCReportMeta sls_dpt_nm_META_0 = new MCReportMeta("sls_dpt_nm", "", "", "", true);
	static public final MCReportMeta sls_usr_cd_META_0 = new MCReportMeta("sls_usr_cd", "", "", "", true);
	static public final MCReportMeta sls_usr_nm_META_0 = new MCReportMeta("sls_usr_nm", "", "", "", true);
	static public final MCReportMeta sls_dpt_tel_META_0 = new MCReportMeta("sls_dpt_tel", "", "", "", true);
	static public final MCReportMeta sls_dpt_fax_META_0 = new MCReportMeta("sls_dpt_fax", "", "", "", true);
	static public final MCReportMeta tdlv_cd_META_0 = new MCReportMeta("tdlv_cd", "", "", "", true);
	static public final MCReportMeta tdlv_zip_cd_META_0 = new MCReportMeta("tdlv_zip_cd", "", "", "", true);
	static public final MCReportMeta tdlv_addr1_META_0 = new MCReportMeta("tdlv_addr1", "", "", "", true);
	static public final MCReportMeta tdlv_addr2_META_0 = new MCReportMeta("tdlv_addr2", "", "", "", true);
	static public final MCReportMeta tdlv_addr3_META_0 = new MCReportMeta("tdlv_addr3", "", "", "", true);
	static public final MCReportMeta tdlv_addr4_META_0 = new MCReportMeta("tdlv_addr4", "", "", "", true);
	static public final MCReportMeta tdlv_addr_META_0 = new MCReportMeta("tdlv_addr", "", "", "", true);
	static public final MCReportMeta tdlv_nm_META_0 = new MCReportMeta("tdlv_nm", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_dpt_META_0 = new MCReportMeta("tdlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta tdlv_cntct_psn_META_0 = new MCReportMeta("tdlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta tdlv_tel_META_0 = new MCReportMeta("tdlv_tel", "", "", "", true);
	static public final MCReportMeta tdlv_fax_META_0 = new MCReportMeta("tdlv_fax", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_0 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_0 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_0 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_0 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_0 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_0 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta ship_act_qty_META_0 = new MCReportMeta("ship_act_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_ship_act_qty_META_0 = new MCReportMeta("s_ship_act_qty", "", "", "", true);
	static public final MCReportMeta ship_act_unit_nm_META_0 = new MCReportMeta("ship_act_unit_nm", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_tm_META_0 = new MCReportMeta("dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta slo_dt_META_0 = new MCReportMeta("slo_dt", "YMD", "", "", true);
	static public final MCReportMeta slo_no_META_0 = new MCReportMeta("slo_no", "", "", "", true);
	static public final MCReportMeta slo_d_no_META_0 = new MCReportMeta("slo_d_no", "", "", "", true);
	static public final MCReportMeta slo_prms_h_no_META_0 = new MCReportMeta("slo_prms_h_no", "", "", "", true);
	static public final MCReportMeta last_prms_rev_META_0 = new MCReportMeta("last_prms_rev", "", "", "", true);
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
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta slo_sub_char1_META_0 = new MCReportMeta("slo_sub_char1", "", "", "", true);
	static public final MCReportMeta slo_sub_char2_META_0 = new MCReportMeta("slo_sub_char2", "", "", "", true);
	static public final MCReportMeta slo_sub_char3_META_0 = new MCReportMeta("slo_sub_char3", "", "", "", true);
	static public final MCReportMeta slo_d_sub_char1_META_0 = new MCReportMeta("slo_d_sub_char1", "", "", "", true);
	static public final MCReportMeta slo_d_sub_char2_META_0 = new MCReportMeta("slo_d_sub_char2", "", "", "", true);
	static public final MCReportMeta slo_d_sub_char3_META_0 = new MCReportMeta("slo_d_sub_char3", "", "", "", true);

	static public final MCReportMeta slo_prms_no_META_1 = new MCReportMeta("slo_prms_no", "", "", "", true);
	static public final MCReportMeta trd_unit_prms_qty_META_1 = new MCReportMeta("trd_unit_prms_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_prms_qty_META_1 = new MCReportMeta("s_int_trd_unit_prms_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_prms_qty_META_1 = new MCReportMeta("s_dec_trd_unit_prms_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_prms_unit_cd_META_1 = new MCReportMeta("trd_unit_prms_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_prms_unit_nm_META_1 = new MCReportMeta("trd_unit_prms_unit_nm", "", "", "", true);
	static public final MCReportMeta prms_dlv_dt_META_1 = new MCReportMeta("prms_dlv_dt", "YMD", "", "", true);
	static public final MCReportMeta prms_dlv_tm_META_1 = new MCReportMeta("prms_dlv_tm", "HM", "", "", true);
	static public final MCReportMeta prms_rmrks_META_1 = new MCReportMeta("prms_rmrks", "", "", "", true);
	static public final MCReportMeta slo_prms_sub_char1_META_1 = new MCReportMeta("slo_prms_sub_char1", "", "", "", true);
	static public final MCReportMeta slo_prms_sub_char2_META_1 = new MCReportMeta("slo_prms_sub_char2", "", "", "", true);
	static public final MCReportMeta slo_prms_sub_char3_META_1 = new MCReportMeta("slo_prms_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("SloPrmsHdr",
			rpt_sts_typ_nm_META_0,
			rpt_sts_typ_META_0,
			prms_prnt_tm_META_0,
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
			dlv_cd_META_0,
			dlv_zip_cd_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_addr_META_0,
			dlv_nm_META_0,
			dlv_alt_nm1_META_0,
			dlv_alt_nm2_META_0,
			dlv_alt_nm3_META_0,
			dlv_alt_nm4_META_0,
			dlv_cntct_dpt_META_0,
			dlv_cntct_psn_META_0,
			dlv_cntct_psn_title_META_0,
			dlv_tel_META_0,
			dlv_fax_META_0,
			dlv_cntry_nm_META_0,
			co_nm_META_0,
			co_cntry_nm_META_0,
			sls_dpt_cd_META_0,
			sls_dpt_zip_cd_META_0,
			sls_dpt_addr1_META_0,
			sls_dpt_addr2_META_0,
			sls_dpt_addr3_META_0,
			sls_dpt_addr4_META_0,
			sls_dpt_addr_META_0,
			sls_dpt_nm_META_0,
			sls_usr_cd_META_0,
			sls_usr_nm_META_0,
			sls_dpt_tel_META_0,
			sls_dpt_fax_META_0,
			tdlv_cd_META_0,
			tdlv_zip_cd_META_0,
			tdlv_addr1_META_0,
			tdlv_addr2_META_0,
			tdlv_addr3_META_0,
			tdlv_addr4_META_0,
			tdlv_addr_META_0,
			tdlv_nm_META_0,
			tdlv_cntct_dpt_META_0,
			tdlv_cntct_psn_META_0,
			tdlv_tel_META_0,
			tdlv_fax_META_0,
			cst_po_no_META_0,
			cst_po_d_no_META_0,
			cst_itm_cd_META_0,
			cst_itm_nm_META_0,
			base_unit_qty_META_0,
			s_base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			trd_unit_qty_META_0,
			s_trd_unit_qty_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			ship_act_qty_META_0,
			s_ship_act_qty_META_0,
			ship_act_unit_nm_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_tm_META_0,
			slo_dt_META_0,
			slo_no_META_0,
			slo_d_no_META_0,
			slo_prms_h_no_META_0,
			last_prms_rev_META_0,
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
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			slo_sub_char1_META_0,
			slo_sub_char2_META_0,
			slo_sub_char3_META_0,
			slo_d_sub_char1_META_0,
			slo_d_sub_char2_META_0,
			slo_d_sub_char3_META_0
		);
		reportMetaMap.add("SloPrmsDtl",
			slo_prms_no_META_1,
			trd_unit_prms_qty_META_1,
			s_int_trd_unit_prms_qty_META_1,
			s_dec_trd_unit_prms_qty_META_1,
			trd_unit_prms_unit_cd_META_1,
			trd_unit_prms_unit_nm_META_1,
			prms_dlv_dt_META_1,
			prms_dlv_tm_META_1,
			prms_rmrks_META_1,
			slo_prms_sub_char1_META_1,
			slo_prms_sub_char2_META_1,
			slo_prms_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBBR_SloPrms_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

