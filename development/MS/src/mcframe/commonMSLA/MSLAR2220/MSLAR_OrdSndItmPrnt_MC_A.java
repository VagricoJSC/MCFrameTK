package mcframe.commonMSLA.MSLAR2220;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_OrdSndItmPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2220";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR2220.DtlR.class, MCList.class);

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
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHMS", "", "", true);
	static public final MCReportMeta wg_cd_META_0 = new MCReportMeta("wg_cd", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta base_itm_nm_META_0 = new MCReportMeta("base_itm_nm", "", "", "", true);
	static public final MCReportMeta base_itm_alt_nm1_META_0 = new MCReportMeta("base_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta base_itm_alt_nm2_META_0 = new MCReportMeta("base_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta base_itm_alt_nm3_META_0 = new MCReportMeta("base_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta base_itm_alt_nm4_META_0 = new MCReportMeta("base_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta unit_cd_META_0 = new MCReportMeta("unit_cd", "", "", "", true);
	static public final MCReportMeta dec_place_META_0 = new MCReportMeta("dec_place", "", "", "", true);
	static public final MCReportMeta lot_mng_typ_META_0 = new MCReportMeta("lot_mng_typ", "", "", "", true);
	static public final MCReportMeta sublot_mng_typ_META_0 = new MCReportMeta("sublot_mng_typ", "", "", "", true);
	static public final MCReportMeta sno1_mng_typ_META_0 = new MCReportMeta("sno1_mng_typ", "", "", "", true);
	static public final MCReportMeta sno2_mng_typ_META_0 = new MCReportMeta("sno2_mng_typ", "", "", "", true);
	static public final MCReportMeta sno3_mng_typ_META_0 = new MCReportMeta("sno3_mng_typ", "", "", "", true);
	static public final MCReportMeta sno4_mng_typ_META_0 = new MCReportMeta("sno4_mng_typ", "", "", "", true);
	static public final MCReportMeta stk_mng_typ_META_0 = new MCReportMeta("stk_mng_typ", "", "", "", true);
	static public final MCReportMeta asset_mng_typ_META_0 = new MCReportMeta("asset_mng_typ", "", "", "", true);
	static public final MCReportMeta itm_typ_META_0 = new MCReportMeta("itm_typ", "", "", "", true);
	static public final MCReportMeta itm_typ_d_cd_META_0 = new MCReportMeta("itm_typ_d_cd", "", "", "", true);
	static public final MCReportMeta itm_grp_cd1_META_0 = new MCReportMeta("itm_grp_cd1", "", "", "", true);
	static public final MCReportMeta itm_grp_cd2_META_0 = new MCReportMeta("itm_grp_cd2", "", "", "", true);
	static public final MCReportMeta itm_grp_cd3_META_0 = new MCReportMeta("itm_grp_cd3", "", "", "", true);
	static public final MCReportMeta itm_grp_cd4_META_0 = new MCReportMeta("itm_grp_cd4", "", "", "", true);
	static public final MCReportMeta itm_grp_cd5_META_0 = new MCReportMeta("itm_grp_cd5", "", "", "", true);
	static public final MCReportMeta itm_grp_cd6_META_0 = new MCReportMeta("itm_grp_cd6", "", "", "", true);
	static public final MCReportMeta itm_grp_cd7_META_0 = new MCReportMeta("itm_grp_cd7", "", "", "", true);
	static public final MCReportMeta itm_grp_cd8_META_0 = new MCReportMeta("itm_grp_cd8", "", "", "", true);
	static public final MCReportMeta itm_grp_cd9_META_0 = new MCReportMeta("itm_grp_cd9", "", "", "", true);
	static public final MCReportMeta itm_grp_cd10_META_0 = new MCReportMeta("itm_grp_cd10", "", "", "", true);
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
			data_make_dt_META_0,
			wg_cd_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			base_itm_nm_META_0,
			base_itm_alt_nm1_META_0,
			base_itm_alt_nm2_META_0,
			base_itm_alt_nm3_META_0,
			base_itm_alt_nm4_META_0,
			unit_cd_META_0,
			dec_place_META_0,
			lot_mng_typ_META_0,
			sublot_mng_typ_META_0,
			sno1_mng_typ_META_0,
			sno2_mng_typ_META_0,
			sno3_mng_typ_META_0,
			sno4_mng_typ_META_0,
			stk_mng_typ_META_0,
			asset_mng_typ_META_0,
			itm_typ_META_0,
			itm_typ_d_cd_META_0,
			itm_grp_cd1_META_0,
			itm_grp_cd2_META_0,
			itm_grp_cd3_META_0,
			itm_grp_cd4_META_0,
			itm_grp_cd5_META_0,
			itm_grp_cd6_META_0,
			itm_grp_cd7_META_0,
			itm_grp_cd8_META_0,
			itm_grp_cd9_META_0,
			itm_grp_cd10_META_0,
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
	protected MSLAR_OrdSndItmPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

