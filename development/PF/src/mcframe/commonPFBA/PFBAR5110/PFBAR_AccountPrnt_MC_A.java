package mcframe.commonPFBA.PFBAR5110;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBAR_AccountPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBAR5110";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBA.PFBAR5110.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta ext_data_no_META_0 = new MCReportMeta("ext_data_no", "", "", "", true);
	static public final MCReportMeta ext_data_lno_META_0 = new MCReportMeta("ext_data_lno", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHM", "", "", true);
	static public final MCReportMeta ac_cd_META_0 = new MCReportMeta("ac_cd", "", "", "", true);
	static public final MCReportMeta ac_nm_META_0 = new MCReportMeta("ac_nm", "", "", "", true);
	static public final MCReportMeta ac_nm_lcl1_META_0 = new MCReportMeta("ac_nm_lcl1", "", "", "", true);
	static public final MCReportMeta ac_nm_lcl2_META_0 = new MCReportMeta("ac_nm_lcl2", "", "", "", true);
	static public final MCReportMeta ac_nm_lcl3_META_0 = new MCReportMeta("ac_nm_lcl3", "", "", "", true);
	static public final MCReportMeta ac_nm2_META_0 = new MCReportMeta("ac_nm2", "", "", "", true);
	static public final MCReportMeta ac_nm2_lcl1_META_0 = new MCReportMeta("ac_nm2_lcl1", "", "", "", true);
	static public final MCReportMeta ac_nm2_lcl2_META_0 = new MCReportMeta("ac_nm2_lcl2", "", "", "", true);
	static public final MCReportMeta ac_nm2_lcl3_META_0 = new MCReportMeta("ac_nm2_lcl3", "", "", "", true);
	static public final MCReportMeta dc_typ_META_0 = new MCReportMeta("dc_typ", "", "", "", true);
	static public final MCReportMeta sub_flg_META_0 = new MCReportMeta("sub_flg", "", "", "", true);
	static public final MCReportMeta ac_typ_META_0 = new MCReportMeta("ac_typ", "", "", "", true);
	static public final MCReportMeta ac_tax_cd_META_0 = new MCReportMeta("ac_tax_cd", "", "", "", true);
	static public final MCReportMeta ac_tax_typ_META_0 = new MCReportMeta("ac_tax_typ", "", "", "", true);
	static public final MCReportMeta foreign_flg_META_0 = new MCReportMeta("foreign_flg", "", "", "", true);
	static public final MCReportMeta sum0_flg_META_0 = new MCReportMeta("sum0_flg", "", "", "", true);
	static public final MCReportMeta sum1_flg_META_0 = new MCReportMeta("sum1_flg", "", "", "", true);
	static public final MCReportMeta sum2_flg_META_0 = new MCReportMeta("sum2_flg", "", "", "", true);
	static public final MCReportMeta sum3_flg_META_0 = new MCReportMeta("sum3_flg", "", "", "", true);
	static public final MCReportMeta sum4_flg_META_0 = new MCReportMeta("sum4_flg", "", "", "", true);
	static public final MCReportMeta sum5_flg_META_0 = new MCReportMeta("sum5_flg", "", "", "", true);
	static public final MCReportMeta project_flg_META_0 = new MCReportMeta("project_flg", "", "", "", true);
	static public final MCReportMeta bp_flg_META_0 = new MCReportMeta("bp_flg", "", "", "", true);
	static public final MCReportMeta usr_flg_META_0 = new MCReportMeta("usr_flg", "", "", "", true);
	static public final MCReportMeta bank_ac_flg_META_0 = new MCReportMeta("bank_ac_flg", "", "", "", true);
	static public final MCReportMeta ap_typ_META_0 = new MCReportMeta("ap_typ", "", "", "", true);
	static public final MCReportMeta ar_typ_META_0 = new MCReportMeta("ar_typ", "", "", "", true);
	static public final MCReportMeta ac_typ1_META_0 = new MCReportMeta("ac_typ1", "", "", "", true);
	static public final MCReportMeta ac_typ2_META_0 = new MCReportMeta("ac_typ2", "", "", "", true);
	static public final MCReportMeta ac_typ3_META_0 = new MCReportMeta("ac_typ3", "", "", "", true);
	static public final MCReportMeta ac_typ4_META_0 = new MCReportMeta("ac_typ4", "", "", "", true);
	static public final MCReportMeta ac_typ5_META_0 = new MCReportMeta("ac_typ5", "", "", "", true);
	static public final MCReportMeta memo1_META_0 = new MCReportMeta("memo1", "", "", "", true);
	static public final MCReportMeta memo2_META_0 = new MCReportMeta("memo2", "", "", "", true);
	static public final MCReportMeta memo3_META_0 = new MCReportMeta("memo3", "", "", "", true);
	static public final MCReportMeta if_sub_char1_META_0 = new MCReportMeta("if_sub_char1", "", "", "", true);
	static public final MCReportMeta if_sub_char2_META_0 = new MCReportMeta("if_sub_char2", "", "", "", true);
	static public final MCReportMeta if_sub_char3_META_0 = new MCReportMeta("if_sub_char3", "", "", "", true);
	static public final MCReportMeta if_sub_char4_META_0 = new MCReportMeta("if_sub_char4", "", "", "", true);
	static public final MCReportMeta if_sub_char5_META_0 = new MCReportMeta("if_sub_char5", "", "", "", true);
	static public final MCReportMeta if_sub_char6_META_0 = new MCReportMeta("if_sub_char6", "", "", "", true);
	static public final MCReportMeta if_sub_char7_META_0 = new MCReportMeta("if_sub_char7", "", "", "", true);
	static public final MCReportMeta if_sub_char8_META_0 = new MCReportMeta("if_sub_char8", "", "", "", true);
	static public final MCReportMeta if_sub_char9_META_0 = new MCReportMeta("if_sub_char9", "", "", "", true);
	static public final MCReportMeta if_sub_char10_META_0 = new MCReportMeta("if_sub_char10", "", "", "", true);
	static public final MCReportMeta if_sub_char11_META_0 = new MCReportMeta("if_sub_char11", "", "", "", true);
	static public final MCReportMeta if_sub_char12_META_0 = new MCReportMeta("if_sub_char12", "", "", "", true);
	static public final MCReportMeta if_sub_char13_META_0 = new MCReportMeta("if_sub_char13", "", "", "", true);
	static public final MCReportMeta if_sub_char14_META_0 = new MCReportMeta("if_sub_char14", "", "", "", true);
	static public final MCReportMeta if_sub_char15_META_0 = new MCReportMeta("if_sub_char15", "", "", "", true);
	static public final MCReportMeta if_sub_char16_META_0 = new MCReportMeta("if_sub_char16", "", "", "", true);
	static public final MCReportMeta if_sub_char17_META_0 = new MCReportMeta("if_sub_char17", "", "", "", true);
	static public final MCReportMeta if_sub_char18_META_0 = new MCReportMeta("if_sub_char18", "", "", "", true);
	static public final MCReportMeta if_sub_char19_META_0 = new MCReportMeta("if_sub_char19", "", "", "", true);
	static public final MCReportMeta if_sub_char20_META_0 = new MCReportMeta("if_sub_char20", "", "", "", true);
	static public final MCReportMeta if_sub_char21_META_0 = new MCReportMeta("if_sub_char21", "", "", "", true);
	static public final MCReportMeta if_sub_char22_META_0 = new MCReportMeta("if_sub_char22", "", "", "", true);
	static public final MCReportMeta if_sub_char23_META_0 = new MCReportMeta("if_sub_char23", "", "", "", true);
	static public final MCReportMeta if_sub_char24_META_0 = new MCReportMeta("if_sub_char24", "", "", "", true);
	static public final MCReportMeta if_sub_char25_META_0 = new MCReportMeta("if_sub_char25", "", "", "", true);
	static public final MCReportMeta if_sub_char26_META_0 = new MCReportMeta("if_sub_char26", "", "", "", true);
	static public final MCReportMeta if_sub_char27_META_0 = new MCReportMeta("if_sub_char27", "", "", "", true);
	static public final MCReportMeta if_sub_char28_META_0 = new MCReportMeta("if_sub_char28", "", "", "", true);
	static public final MCReportMeta if_sub_char29_META_0 = new MCReportMeta("if_sub_char29", "", "", "", true);
	static public final MCReportMeta if_sub_char30_META_0 = new MCReportMeta("if_sub_char30", "", "", "", true);
	static public final MCReportMeta if_sub_num1_META_0 = new MCReportMeta("if_sub_num1", "", "", "", true);
	static public final MCReportMeta if_sub_num2_META_0 = new MCReportMeta("if_sub_num2", "", "", "", true);
	static public final MCReportMeta if_sub_num3_META_0 = new MCReportMeta("if_sub_num3", "", "", "", true);
	static public final MCReportMeta if_sub_num4_META_0 = new MCReportMeta("if_sub_num4", "", "", "", true);
	static public final MCReportMeta if_sub_num5_META_0 = new MCReportMeta("if_sub_num5", "", "", "", true);
	static public final MCReportMeta if_sub_dt1_META_0 = new MCReportMeta("if_sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt2_META_0 = new MCReportMeta("if_sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt3_META_0 = new MCReportMeta("if_sub_dt3", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt4_META_0 = new MCReportMeta("if_sub_dt4", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt5_META_0 = new MCReportMeta("if_sub_dt5", "YMD", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			ext_data_no_META_0,
			ext_data_lno_META_0,
			data_make_dt_META_0,
			ac_cd_META_0,
			ac_nm_META_0,
			ac_nm_lcl1_META_0,
			ac_nm_lcl2_META_0,
			ac_nm_lcl3_META_0,
			ac_nm2_META_0,
			ac_nm2_lcl1_META_0,
			ac_nm2_lcl2_META_0,
			ac_nm2_lcl3_META_0,
			dc_typ_META_0,
			sub_flg_META_0,
			ac_typ_META_0,
			ac_tax_cd_META_0,
			ac_tax_typ_META_0,
			foreign_flg_META_0,
			sum0_flg_META_0,
			sum1_flg_META_0,
			sum2_flg_META_0,
			sum3_flg_META_0,
			sum4_flg_META_0,
			sum5_flg_META_0,
			project_flg_META_0,
			bp_flg_META_0,
			usr_flg_META_0,
			bank_ac_flg_META_0,
			ap_typ_META_0,
			ar_typ_META_0,
			ac_typ1_META_0,
			ac_typ2_META_0,
			ac_typ3_META_0,
			ac_typ4_META_0,
			ac_typ5_META_0,
			memo1_META_0,
			memo2_META_0,
			memo3_META_0,
			if_sub_char1_META_0,
			if_sub_char2_META_0,
			if_sub_char3_META_0,
			if_sub_char4_META_0,
			if_sub_char5_META_0,
			if_sub_char6_META_0,
			if_sub_char7_META_0,
			if_sub_char8_META_0,
			if_sub_char9_META_0,
			if_sub_char10_META_0,
			if_sub_char11_META_0,
			if_sub_char12_META_0,
			if_sub_char13_META_0,
			if_sub_char14_META_0,
			if_sub_char15_META_0,
			if_sub_char16_META_0,
			if_sub_char17_META_0,
			if_sub_char18_META_0,
			if_sub_char19_META_0,
			if_sub_char20_META_0,
			if_sub_char21_META_0,
			if_sub_char22_META_0,
			if_sub_char23_META_0,
			if_sub_char24_META_0,
			if_sub_char25_META_0,
			if_sub_char26_META_0,
			if_sub_char27_META_0,
			if_sub_char28_META_0,
			if_sub_char29_META_0,
			if_sub_char30_META_0,
			if_sub_num1_META_0,
			if_sub_num2_META_0,
			if_sub_num3_META_0,
			if_sub_num4_META_0,
			if_sub_num5_META_0,
			if_sub_dt1_META_0,
			if_sub_dt2_META_0,
			if_sub_dt3_META_0,
			if_sub_dt4_META_0,
			if_sub_dt5_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBAR_AccountPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

