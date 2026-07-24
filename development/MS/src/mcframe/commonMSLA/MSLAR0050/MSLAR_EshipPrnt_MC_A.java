package mcframe.commonMSLA.MSLAR0050;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_EshipPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR0050";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR0050.DtlR.class, MCList.class);

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
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_0 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta po_co_cd_META_0 = new MCReportMeta("po_co_cd", "", "", "", true);
	static public final MCReportMeta po_co_nm_META_0 = new MCReportMeta("po_co_nm", "", "", "", true);
	static public final MCReportMeta po_co_cntry_cd_META_0 = new MCReportMeta("po_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta slo_co_cd_META_0 = new MCReportMeta("slo_co_cd", "", "", "", true);
	static public final MCReportMeta slo_co_nm_META_0 = new MCReportMeta("slo_co_nm", "", "", "", true);
	static public final MCReportMeta slo_co_cntry_cd_META_0 = new MCReportMeta("slo_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta po_co_itm_cd_META_0 = new MCReportMeta("po_co_itm_cd", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub1_META_0 = new MCReportMeta("po_co_itm_sub1", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub2_META_0 = new MCReportMeta("po_co_itm_sub2", "", "", "", true);
	static public final MCReportMeta po_co_itm_sub3_META_0 = new MCReportMeta("po_co_itm_sub3", "", "", "", true);
	static public final MCReportMeta po_co_itm_nm_META_0 = new MCReportMeta("po_co_itm_nm", "", "", "", true);
	static public final MCReportMeta sls_dpt_cd_META_0 = new MCReportMeta("sls_dpt_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_nm_META_0 = new MCReportMeta("sls_dpt_nm", "", "", "", true);
	static public final MCReportMeta sls_usr_cd_META_0 = new MCReportMeta("sls_usr_cd", "", "", "", true);
	static public final MCReportMeta sls_usr_nm_META_0 = new MCReportMeta("sls_usr_nm", "", "", "", true);
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
	static public final MCReportMeta slo_co_itm_cd_META_0 = new MCReportMeta("slo_co_itm_cd", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub1_META_0 = new MCReportMeta("slo_co_itm_sub1", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub2_META_0 = new MCReportMeta("slo_co_itm_sub2", "", "", "", true);
	static public final MCReportMeta slo_co_itm_sub3_META_0 = new MCReportMeta("slo_co_itm_sub3", "", "", "", true);
	static public final MCReportMeta slo_co_itm_nm_META_0 = new MCReportMeta("slo_co_itm_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_0 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta interim_flg_META_0 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_0 = new MCReportMeta("trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_0 = new MCReportMeta("trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_0 = new MCReportMeta("trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_0 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_typ_META_0 = new MCReportMeta("tax_typ", "", "", "", true);
	static public final MCReportMeta tax_rate_META_0 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_0 = new MCReportMeta("trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta iv_flg_META_0 = new MCReportMeta("iv_flg", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_rev_META_0 = new MCReportMeta("dlv_slip_rev", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta dlv_inst_no_META_0 = new MCReportMeta("dlv_inst_no", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_no_META_0 = new MCReportMeta("dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta ship_dt_META_0 = new MCReportMeta("ship_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_hm_META_0 = new MCReportMeta("ship_hm", "HM", "", "", true);
	static public final MCReportMeta dlv_schd_dt_META_0 = new MCReportMeta("dlv_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_schd_hm_META_0 = new MCReportMeta("dlv_schd_hm", "HM", "", "", true);
	static public final MCReportMeta ship_fr_valid_dt_META_0 = new MCReportMeta("ship_fr_valid_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_slip_rmrks_META_0 = new MCReportMeta("dlv_slip_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_rmrks_META_0 = new MCReportMeta("dlv_slip_d_rmrks", "", "", "", true);
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

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_lno_META_0,
			data_no_META_0,
			trd_typ_cd_META_0,
			data_make_dt_META_0,
			data_crud_typ_META_0,
			po_no_META_0,
			po_d_no_META_0,
			po_co_cd_META_0,
			po_co_nm_META_0,
			po_co_cntry_cd_META_0,
			slo_co_cd_META_0,
			slo_co_nm_META_0,
			slo_co_cntry_cd_META_0,
			po_co_itm_cd_META_0,
			po_co_itm_sub1_META_0,
			po_co_itm_sub2_META_0,
			po_co_itm_sub3_META_0,
			po_co_itm_nm_META_0,
			sls_dpt_cd_META_0,
			sls_dpt_nm_META_0,
			sls_usr_cd_META_0,
			sls_usr_nm_META_0,
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
			slo_co_itm_cd_META_0,
			slo_co_itm_sub1_META_0,
			slo_co_itm_sub2_META_0,
			slo_co_itm_sub3_META_0,
			slo_co_itm_nm_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			trd_unit_qty_META_0,
			trd_cur_cd_META_0,
			inc_tax_flg_META_0,
			interim_flg_META_0,
			trd_cur_upri_META_0,
			trd_cur_amt_META_0,
			trd_cur_dscnt_amt_META_0,
			tax_cd_META_0,
			tax_nm_META_0,
			tax_typ_META_0,
			tax_rate_META_0,
			trd_cur_tax_amt_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			iv_flg_META_0,
			dlv_slip_no_META_0,
			dlv_slip_rev_META_0,
			dlv_slip_d_no_META_0,
			dlv_inst_no_META_0,
			dlv_inst_d_no_META_0,
			ship_dt_META_0,
			ship_hm_META_0,
			dlv_schd_dt_META_0,
			dlv_schd_hm_META_0,
			ship_fr_valid_dt_META_0,
			dlv_slip_rmrks_META_0,
			dlv_slip_d_rmrks_META_0,
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
			sub_dt5_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSLAR_EshipPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

