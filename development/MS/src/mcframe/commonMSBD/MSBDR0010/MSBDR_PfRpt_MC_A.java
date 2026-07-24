package mcframe.commonMSBD.MSBDR0010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBDR_PfRpt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBDR0010";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PFRPTHDRR_RC = new MCReportClass("PfRptHdr", mcframe.commonMSBD.MSBDR0010.PfRptHdrR.class);
	static public final MCReportClass PFRPTDTLL_RC = new MCReportClass("PfRptDtl", mcframe.commonMSBD.MSBDR0010.PfRptDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PFRPTHDRR_RC,
		PFRPTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rpt_sts_typ_nm_META_0 = new MCReportMeta("rpt_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta rpt_sts_typ_META_0 = new MCReportMeta("rpt_sts_typ", "", "", "", true);
	static public final MCReportMeta pf_dt_META_0 = new MCReportMeta("pf_dt", "YMD", "", "", true);
	static public final MCReportMeta pre_pf_dt_META_0 = new MCReportMeta("pre_pf_dt", "YMD", "", "", true);
	static public final MCReportMeta pf_rpt_no_META_0 = new MCReportMeta("pf_rpt_no", "", "", "", true);
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
	static public final MCReportMeta pf_dpt_cd_META_0 = new MCReportMeta("pf_dpt_cd", "", "", "", true);
	static public final MCReportMeta pf_dpt_nm_META_0 = new MCReportMeta("pf_dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_cntry_nm_META_0 = new MCReportMeta("dpt_cntry_nm", "", "", "", true);
	static public final MCReportMeta pf_usr_cd_META_0 = new MCReportMeta("pf_usr_cd", "", "", "", true);
	static public final MCReportMeta pf_usr_nm_META_0 = new MCReportMeta("pf_usr_nm", "", "", "", true);
	static public final MCReportMeta wg_cd_META_0 = new MCReportMeta("wg_cd", "", "", "", true);
	static public final MCReportMeta wg_nm_META_0 = new MCReportMeta("wg_nm", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta pf_rpt_rmrks_META_0 = new MCReportMeta("pf_rpt_rmrks", "", "", "", true);

	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta sppl_itm_cd_META_1 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_1 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta unit_cd_META_1 = new MCReportMeta("unit_cd", "", "", "", true);
	static public final MCReportMeta unit_nm_META_1 = new MCReportMeta("unit_nm", "", "", "", true);
	static public final MCReportMeta pf_rpt_d_rmrks_META_1 = new MCReportMeta("pf_rpt_d_rmrks", "", "", "", true);
	static public final MCReportMeta pf_period_typ_META_1 = new MCReportMeta("pf_period_typ", "", "", "", true);
	static public final MCReportMeta pf_period_typ_nm_META_1 = new MCReportMeta("pf_period_typ_nm", "", "", "", true);
	static public final MCReportMeta pf_period_st_dt_META_1 = new MCReportMeta("pf_period_st_dt", "YMD", "", "", true);
	static public final MCReportMeta pf_period_end_dt_META_1 = new MCReportMeta("pf_period_end_dt", "YMD", "", "", true);
	static public final MCReportMeta pre_ym_flg_META_1 = new MCReportMeta("pre_ym_flg", "", "", "", true);
	static public final MCReportMeta pre_qty_META_1 = new MCReportMeta("pre_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_pre_qty_META_1 = new MCReportMeta("s_pre_qty", "", "", "", true);
	static public final MCReportMeta s_int_pre_qty_META_1 = new MCReportMeta("s_int_pre_qty", "", "", "", true);
	static public final MCReportMeta s_dec_pre_qty_META_1 = new MCReportMeta("s_dec_pre_qty", "", "", "", true);
	static public final MCReportMeta ym_flg_META_1 = new MCReportMeta("ym_flg", "", "", "", true);
	static public final MCReportMeta qty_META_1 = new MCReportMeta("qty", "COMMA", "", "", true);
	static public final MCReportMeta s_qty_META_1 = new MCReportMeta("s_qty", "", "", "", true);
	static public final MCReportMeta s_int_qty_META_1 = new MCReportMeta("s_int_qty", "", "", "", true);
	static public final MCReportMeta s_dec_qty_META_1 = new MCReportMeta("s_dec_qty", "", "", "", true);
	static public final MCReportMeta po_qty_META_1 = new MCReportMeta("po_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_po_qty_META_1 = new MCReportMeta("s_po_qty", "", "", "", true);
	static public final MCReportMeta s_int_po_qty_META_1 = new MCReportMeta("s_int_po_qty", "", "", "", true);
	static public final MCReportMeta s_dec_po_qty_META_1 = new MCReportMeta("s_dec_po_qty", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PfRptHdr",
			rpt_sts_typ_nm_META_0,
			rpt_sts_typ_META_0,
			pf_dt_META_0,
			pre_pf_dt_META_0,
			pf_rpt_no_META_0,
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
			pf_dpt_cd_META_0,
			pf_dpt_nm_META_0,
			dpt_cntry_nm_META_0,
			pf_usr_cd_META_0,
			pf_usr_nm_META_0,
			wg_cd_META_0,
			wg_nm_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			pf_rpt_rmrks_META_0
		);
		reportMetaMap.add("PfRptDtl",
			itm_cd_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			itm_sub1_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_view_META_1,
			itm_sub2_data_META_1,
			itm_sub3_view_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			sppl_itm_cd_META_1,
			sppl_itm_nm_META_1,
			unit_cd_META_1,
			unit_nm_META_1,
			pf_rpt_d_rmrks_META_1,
			pf_period_typ_META_1,
			pf_period_typ_nm_META_1,
			pf_period_st_dt_META_1,
			pf_period_end_dt_META_1,
			pre_ym_flg_META_1,
			pre_qty_META_1,
			s_pre_qty_META_1,
			s_int_pre_qty_META_1,
			s_dec_pre_qty_META_1,
			ym_flg_META_1,
			qty_META_1,
			s_qty_META_1,
			s_int_qty_META_1,
			s_dec_qty_META_1,
			po_qty_META_1,
			s_po_qty_META_1,
			s_int_po_qty_META_1,
			s_dec_po_qty_META_1,
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
	protected MSBDR_PfRpt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

