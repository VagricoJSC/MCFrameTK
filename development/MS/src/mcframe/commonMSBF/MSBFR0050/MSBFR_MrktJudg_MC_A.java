package mcframe.commonMSBF.MSBFR0050;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBFR_MrktJudg_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBFR0050";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass MRKTJUDGHDRR_RC = new MCReportClass("MrktJudgHdr", mcframe.commonMSBF.MSBFR0050.MrktJudgHdrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		MRKTJUDGHDRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta mrkt_judg_no_META_0 = new MCReportMeta("mrkt_judg_no", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta ntfy_nm_META_0 = new MCReportMeta("ntfy_nm", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_unit_qty_META_0 = new MCReportMeta("s_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_dec_place_META_0 = new MCReportMeta("base_dec_place", "", "", "", true);
	static public final MCReportMeta mrkt_judg_sts_typ_META_0 = new MCReportMeta("mrkt_judg_sts_typ", "", "", "", true);
	static public final MCReportMeta mrkt_judg_sts_typ_nm_META_0 = new MCReportMeta("mrkt_judg_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta judg_dt_META_0 = new MCReportMeta("judg_dt", "YMD", "", "", true);
	static public final MCReportMeta judg_usr_cd_META_0 = new MCReportMeta("judg_usr_cd", "", "", "", true);
	static public final MCReportMeta judg_usr_nm_META_0 = new MCReportMeta("judg_usr_nm", "", "", "", true);
	static public final MCReportMeta judg_dpt_cd_META_0 = new MCReportMeta("judg_dpt_cd", "", "", "", true);
	static public final MCReportMeta judg_dpt_nm_META_0 = new MCReportMeta("judg_dpt_nm", "", "", "", true);
	static public final MCReportMeta mfg_so_aprv_typ_META_0 = new MCReportMeta("mfg_so_aprv_typ", "", "", "", true);
	static public final MCReportMeta mfg_so_aprv_typ_nm_META_0 = new MCReportMeta("mfg_so_aprv_typ_nm", "", "", "", true);
	static public final MCReportMeta quality_mng_typ_META_0 = new MCReportMeta("quality_mng_typ", "", "", "", true);
	static public final MCReportMeta quality_mng_typ_nm_META_0 = new MCReportMeta("quality_mng_typ_nm", "", "", "", true);
	static public final MCReportMeta mfg_mng_typ_META_0 = new MCReportMeta("mfg_mng_typ", "", "", "", true);
	static public final MCReportMeta mfg_mng_typ_nm_META_0 = new MCReportMeta("mfg_mng_typ_nm", "", "", "", true);
	static public final MCReportMeta deviant_typ_META_0 = new MCReportMeta("deviant_typ", "", "", "", true);
	static public final MCReportMeta deviant_typ_nm_META_0 = new MCReportMeta("deviant_typ_nm", "", "", "", true);
	static public final MCReportMeta deviant_msr_typ_META_0 = new MCReportMeta("deviant_msr_typ", "", "", "", true);
	static public final MCReportMeta deviant_msr_typ_nm_META_0 = new MCReportMeta("deviant_msr_typ_nm", "", "", "", true);
	static public final MCReportMeta prod_itm_info_typ_META_0 = new MCReportMeta("prod_itm_info_typ", "", "", "", true);
	static public final MCReportMeta prod_itm_info_typ_nm_META_0 = new MCReportMeta("prod_itm_info_typ_nm", "", "", "", true);
	static public final MCReportMeta chd_itm_info_typ_META_0 = new MCReportMeta("chd_itm_info_typ", "", "", "", true);
	static public final MCReportMeta chd_itm_info_typ_nm_META_0 = new MCReportMeta("chd_itm_info_typ_nm", "", "", "", true);
	static public final MCReportMeta judg_rsn_META_0 = new MCReportMeta("judg_rsn", "", "", "", true);
	static public final MCReportMeta intr_rmrks_META_0 = new MCReportMeta("intr_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta site_cd_META_0 = new MCReportMeta("site_cd", "", "", "", true);
	static public final MCReportMeta site_nm_META_0 = new MCReportMeta("site_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("MrktJudgHdr",
			prnt_tm_META_0,
			mrkt_judg_no_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			ntfy_nm_META_0,
			lot_no_view_META_0,
			lot_no_data_META_0,
			base_unit_qty_META_0,
			s_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			base_dec_place_META_0,
			mrkt_judg_sts_typ_META_0,
			mrkt_judg_sts_typ_nm_META_0,
			judg_dt_META_0,
			judg_usr_cd_META_0,
			judg_usr_nm_META_0,
			judg_dpt_cd_META_0,
			judg_dpt_nm_META_0,
			mfg_so_aprv_typ_META_0,
			mfg_so_aprv_typ_nm_META_0,
			quality_mng_typ_META_0,
			quality_mng_typ_nm_META_0,
			mfg_mng_typ_META_0,
			mfg_mng_typ_nm_META_0,
			deviant_typ_META_0,
			deviant_typ_nm_META_0,
			deviant_msr_typ_META_0,
			deviant_msr_typ_nm_META_0,
			prod_itm_info_typ_META_0,
			prod_itm_info_typ_nm_META_0,
			chd_itm_info_typ_META_0,
			chd_itm_info_typ_nm_META_0,
			judg_rsn_META_0,
			intr_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
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
	protected MSBFR_MrktJudg_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

