package mcframe.commonMSBF.MSBFR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBFR_InspLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBFR0020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass INSPLSTHDRR_RC = new MCReportClass("InspLstHdr", mcframe.commonMSBF.MSBFR0020.InspLstHdrR.class);
	static public final MCReportClass INSPLSTDTLL_RC = new MCReportClass("InspLstDtl", mcframe.commonMSBF.MSBFR0020.InspLstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		INSPLSTHDRR_RC,
		INSPLSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta insp_lst_no_lbl_META_0 = new MCReportMeta("insp_lst_no_lbl", "", "", "", true);
	static public final MCReportMeta insp_lst_no_hdr_META_0 = new MCReportMeta("insp_lst_no_hdr", "", "", "", true);
	static public final MCReportMeta form_name_META_0 = new MCReportMeta("form_name", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta insp_no_lbl_META_0 = new MCReportMeta("insp_no_lbl", "", "", "", true);
	static public final MCReportMeta insp_typ_nm_lbl_META_0 = new MCReportMeta("insp_typ_nm_lbl", "", "", "", true);
	static public final MCReportMeta insp_ptn_nm_lbl_META_0 = new MCReportMeta("insp_ptn_nm_lbl", "", "", "", true);
	static public final MCReportMeta insp_mtd_typ_nm_lbl_META_0 = new MCReportMeta("insp_mtd_typ_nm_lbl", "", "", "", true);
	static public final MCReportMeta insp_aprv_sts_typ_nm_lbl_META_0 = new MCReportMeta("insp_aprv_sts_typ_nm_lbl", "", "", "", true);

	static public final MCReportMeta insp_lst_no_META_1 = new MCReportMeta("insp_lst_no", "", "", "", true);
	static public final MCReportMeta inst_dt_META_1 = new MCReportMeta("inst_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_no_META_1 = new MCReportMeta("insp_no", "", "", "", true);
	static public final MCReportMeta insp_freq_META_1 = new MCReportMeta("insp_freq", "", "", "", true);
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
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_1 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_1 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_1 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_dec_place_META_1 = new MCReportMeta("base_unit_dec_place", "", "", "", true);
	static public final MCReportMeta insp_typ_META_1 = new MCReportMeta("insp_typ", "", "", "", true);
	static public final MCReportMeta insp_typ_nm_META_1 = new MCReportMeta("insp_typ_nm", "", "", "", true);
	static public final MCReportMeta insp_ptn_nm_META_1 = new MCReportMeta("insp_ptn_nm", "", "", "", true);
	static public final MCReportMeta insp_mtd_typ_META_1 = new MCReportMeta("insp_mtd_typ", "", "", "", true);
	static public final MCReportMeta insp_mtd_typ_nm_META_1 = new MCReportMeta("insp_mtd_typ_nm", "", "", "", true);
	static public final MCReportMeta insp_std_no_META_1 = new MCReportMeta("insp_std_no", "", "", "", true);
	static public final MCReportMeta insp_aprv_sts_typ_META_1 = new MCReportMeta("insp_aprv_sts_typ", "", "", "", true);
	static public final MCReportMeta insp_aprv_sts_typ_nm_META_1 = new MCReportMeta("insp_aprv_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta st_tm_META_1 = new MCReportMeta("st_tm", "YMDHM", "", "", true);
	static public final MCReportMeta end_tm_META_1 = new MCReportMeta("end_tm", "YMDHM", "", "", true);
	static public final MCReportMeta std_req_flg_META_1 = new MCReportMeta("std_req_flg", "", "", "", true);
	static public final MCReportMeta std_cnf_req_flg_META_1 = new MCReportMeta("std_cnf_req_flg", "", "", "", true);
	static public final MCReportMeta s_std_req_flg_META_1 = new MCReportMeta("s_std_req_flg", "", "", "", true);
	static public final MCReportMeta s_std_cnf_req_flg_META_1 = new MCReportMeta("s_std_cnf_req_flg", "", "", "", true);
	static public final MCReportMeta smpl_inst_qty_META_1 = new MCReportMeta("smpl_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta int_smpl_inst_qty_META_1 = new MCReportMeta("int_smpl_inst_qty", "", "", "", true);
	static public final MCReportMeta dec_smpl_inst_qty_META_1 = new MCReportMeta("dec_smpl_inst_qty", "", "", "", true);
	static public final MCReportMeta smpl_inst_base_unit_nm_META_1 = new MCReportMeta("smpl_inst_base_unit_nm", "", "", "", true);
	static public final MCReportMeta sub_char1_META_1 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_1 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_1 = new MCReportMeta("sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("InspLstHdr",
			insp_lst_no_lbl_META_0,
			insp_lst_no_hdr_META_0,
			form_name_META_0,
			prnt_tm_META_0,
			insp_no_lbl_META_0,
			insp_typ_nm_lbl_META_0,
			insp_ptn_nm_lbl_META_0,
			insp_mtd_typ_nm_lbl_META_0,
			insp_aprv_sts_typ_nm_lbl_META_0
		);
		reportMetaMap.add("InspLstDtl",
			insp_lst_no_META_1,
			inst_dt_META_1,
			insp_no_META_1,
			insp_freq_META_1,
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
			lot_no_view_META_1,
			sublot_no_view_META_1,
			lot_no_data_META_1,
			sublot_no_data_META_1,
			bp_lot_no_META_1,
			ver_no_lbl_META_1,
			ver_no_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			base_unit_cd_META_1,
			base_unit_nm_META_1,
			base_unit_dec_place_META_1,
			insp_typ_META_1,
			insp_typ_nm_META_1,
			insp_ptn_nm_META_1,
			insp_mtd_typ_META_1,
			insp_mtd_typ_nm_META_1,
			insp_std_no_META_1,
			insp_aprv_sts_typ_META_1,
			insp_aprv_sts_typ_nm_META_1,
			st_tm_META_1,
			end_tm_META_1,
			std_req_flg_META_1,
			std_cnf_req_flg_META_1,
			s_std_req_flg_META_1,
			s_std_cnf_req_flg_META_1,
			smpl_inst_qty_META_1,
			int_smpl_inst_qty_META_1,
			dec_smpl_inst_qty_META_1,
			smpl_inst_base_unit_nm_META_1,
			sub_char1_META_1,
			sub_char2_META_1,
			sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBFR_InspLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

