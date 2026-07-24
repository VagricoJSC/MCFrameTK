package mcframe.commonMSBF.MSBFR0040;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBFR_PlntAprv_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBFR0040";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PLNTAPRVHDRR_RC = new MCReportClass("PlntAprvHdr", mcframe.commonMSBF.MSBFR0040.PlntAprvHdrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PLNTAPRVHDRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta plnt_aprv_no_META_0 = new MCReportMeta("plnt_aprv_no", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta ntfy_nm_META_0 = new MCReportMeta("ntfy_nm", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_lbl_META_0 = new MCReportMeta("sublot_no_lbl", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_0 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_dec_place_META_0 = new MCReportMeta("base_dec_place", "", "", "", true);
	static public final MCReportMeta aprv_dt_META_0 = new MCReportMeta("aprv_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_judg_dt_META_0 = new MCReportMeta("insp_judg_dt", "YMD", "", "", true);
	static public final MCReportMeta act_aprv_dt_META_0 = new MCReportMeta("act_aprv_dt", "YMD", "", "", true);
	static public final MCReportMeta plnt_aprv_sts_typ_META_0 = new MCReportMeta("plnt_aprv_sts_typ", "", "", "", true);
	static public final MCReportMeta plnt_aprv_sts_typ_nm_META_0 = new MCReportMeta("plnt_aprv_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta aprv_usr_cd_META_0 = new MCReportMeta("aprv_usr_cd", "", "", "", true);
	static public final MCReportMeta aprv_usr_nm_META_0 = new MCReportMeta("aprv_usr_nm", "", "", "", true);
	static public final MCReportMeta aprv_dpt_cd_META_0 = new MCReportMeta("aprv_dpt_cd", "", "", "", true);
	static public final MCReportMeta aprv_dpt_nm_META_0 = new MCReportMeta("aprv_dpt_nm", "", "", "", true);
	static public final MCReportMeta aprv_rsn_META_0 = new MCReportMeta("aprv_rsn", "", "", "", true);
	static public final MCReportMeta site_cd_META_0 = new MCReportMeta("site_cd", "", "", "", true);
	static public final MCReportMeta site_nm_META_0 = new MCReportMeta("site_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PlntAprvHdr",
			plnt_aprv_no_META_0,
			prnt_tm_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			ntfy_nm_META_0,
			lot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_lbl_META_0,
			sublot_no_view_META_0,
			sublot_no_data_META_0,
			base_unit_qty_META_0,
			s_base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			base_dec_place_META_0,
			aprv_dt_META_0,
			insp_judg_dt_META_0,
			act_aprv_dt_META_0,
			plnt_aprv_sts_typ_META_0,
			plnt_aprv_sts_typ_nm_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			aprv_usr_cd_META_0,
			aprv_usr_nm_META_0,
			aprv_dpt_cd_META_0,
			aprv_dpt_nm_META_0,
			aprv_rsn_META_0,
			site_cd_META_0,
			site_nm_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBFR_PlntAprv_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

