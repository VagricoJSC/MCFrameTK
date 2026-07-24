package mcframe.commonMSLA.MSLAR1040;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_ArrActPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR1040";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR1040.DtlR.class, MCList.class);

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
	static public final MCReportMeta dpstr_cd_META_0 = new MCReportMeta("dpstr_cd", "", "", "", true);
	static public final MCReportMeta dpstr_nm_META_0 = new MCReportMeta("dpstr_nm", "", "", "", true);
	static public final MCReportMeta site_co_cd_META_0 = new MCReportMeta("site_co_cd", "", "", "", true);
	static public final MCReportMeta site_co_nm_META_0 = new MCReportMeta("site_co_nm", "", "", "", true);
	static public final MCReportMeta arr_lg_grp_cd_META_0 = new MCReportMeta("arr_lg_grp_cd", "", "", "", true);
	static public final MCReportMeta arr_lg_grp_nm_META_0 = new MCReportMeta("arr_lg_grp_nm", "", "", "", true);
	static public final MCReportMeta arr_schd_no_META_0 = new MCReportMeta("arr_schd_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_0 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta prms_rcpt_d_no_META_0 = new MCReportMeta("prms_rcpt_d_no", "", "", "", true);
	static public final MCReportMeta dlv_inst_d_no_META_0 = new MCReportMeta("dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta rcpt_iv_d_no_META_0 = new MCReportMeta("rcpt_iv_d_no", "", "", "", true);
	static public final MCReportMeta sls_ret_schd_d_no_META_0 = new MCReportMeta("sls_ret_schd_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta iv_d_no_META_0 = new MCReportMeta("iv_d_no", "", "", "", true);
	static public final MCReportMeta ext_arr_act_no_META_0 = new MCReportMeta("ext_arr_act_no", "", "", "", true);
	static public final MCReportMeta arr_dt_META_0 = new MCReportMeta("arr_dt", "YMD", "", "", true);
	static public final MCReportMeta arr_hm_META_0 = new MCReportMeta("arr_hm", "HM", "", "", true);
	static public final MCReportMeta arr_dpt_cd_META_0 = new MCReportMeta("arr_dpt_cd", "", "", "", true);
	static public final MCReportMeta arr_dpt_nm_META_0 = new MCReportMeta("arr_dpt_nm", "", "", "", true);
	static public final MCReportMeta arr_usr_cd_META_0 = new MCReportMeta("arr_usr_cd", "", "", "", true);
	static public final MCReportMeta arr_usr_nm_META_0 = new MCReportMeta("arr_usr_nm", "", "", "", true);
	static public final MCReportMeta arr_loc_cd_META_0 = new MCReportMeta("arr_loc_cd", "", "", "", true);
	static public final MCReportMeta arr_loc_nm_META_0 = new MCReportMeta("arr_loc_nm", "", "", "", true);
	static public final MCReportMeta arr_str_ln_cd_META_0 = new MCReportMeta("arr_str_ln_cd", "", "", "", true);
	static public final MCReportMeta arr_str_ln_nm_META_0 = new MCReportMeta("arr_str_ln_nm", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta gd_cd_META_0 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_0 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta abort_flg_META_0 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_0 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta bp_dlv_slip_no_META_0 = new MCReportMeta("bp_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta bp_dlv_slip_d_no_META_0 = new MCReportMeta("bp_dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta ship_fr_valid_dt_META_0 = new MCReportMeta("ship_fr_valid_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_cnt_rmrks_META_0 = new MCReportMeta("insp_cnt_rmrks", "", "", "", true);
	static public final MCReportMeta intr_rmrks_META_0 = new MCReportMeta("intr_rmrks", "", "", "", true);
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
			dpstr_cd_META_0,
			dpstr_nm_META_0,
			site_co_cd_META_0,
			site_co_nm_META_0,
			arr_lg_grp_cd_META_0,
			arr_lg_grp_nm_META_0,
			arr_schd_no_META_0,
			po_d_no_META_0,
			prms_rcpt_d_no_META_0,
			dlv_inst_d_no_META_0,
			rcpt_iv_d_no_META_0,
			sls_ret_schd_d_no_META_0,
			dlv_slip_d_no_META_0,
			iv_d_no_META_0,
			ext_arr_act_no_META_0,
			arr_dt_META_0,
			arr_hm_META_0,
			arr_dpt_cd_META_0,
			arr_dpt_nm_META_0,
			arr_usr_cd_META_0,
			arr_usr_nm_META_0,
			arr_loc_cd_META_0,
			arr_loc_nm_META_0,
			arr_str_ln_cd_META_0,
			arr_str_ln_nm_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			ver_no_META_0,
			gd_cd_META_0,
			gd_nm_META_0,
			trd_unit_qty_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			abort_flg_META_0,
			bp_lot_no_META_0,
			bp_dlv_slip_no_META_0,
			bp_dlv_slip_d_no_META_0,
			ship_fr_valid_dt_META_0,
			insp_cnt_rmrks_META_0,
			intr_rmrks_META_0,
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
	protected MSLAR_ArrActPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

