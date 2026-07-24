package mcframe.commonMGBF.MGBFR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MGBFR_EndStkAmtLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MG";
	static final String _defaultReportId = "MGBFR0020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass ENDSTKAMTLSTDTLR_RC = new MCReportClass("EndStkAmtLstDtl", mcframe.commonMGBF.MGBFR0020.EndStkAmtLstDtlR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		ENDSTKAMTLSTDTLR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta calc_grp_cd_META_0 = new MCReportMeta("calc_grp_cd", "", "", "", true);
	static public final MCReportMeta calc_grp_nm_META_0 = new MCReportMeta("calc_grp_nm", "", "", "", true);
	static public final MCReportMeta calc_no_META_0 = new MCReportMeta("calc_no", "", "", "", true);
	static public final MCReportMeta wg_cd_META_0 = new MCReportMeta("wg_cd", "", "", "", true);
	static public final MCReportMeta wg_nm_META_0 = new MCReportMeta("wg_nm", "", "", "", true);
	static public final MCReportMeta ym_META_0 = new MCReportMeta("ym", "YM", "", "", true);
	static public final MCReportMeta mng_dpt_cd_META_0 = new MCReportMeta("mng_dpt_cd", "", "", "", true);
	static public final MCReportMeta mng_dpt_nm_META_0 = new MCReportMeta("mng_dpt_nm", "", "", "", true);
	static public final MCReportMeta itm_jnl_cd_META_0 = new MCReportMeta("itm_jnl_cd", "", "", "", true);
	static public final MCReportMeta itm_jnl_nm_META_0 = new MCReportMeta("itm_jnl_nm", "", "", "", true);
	static public final MCReportMeta asst_typ_META_0 = new MCReportMeta("asst_typ", "", "", "", true);
	static public final MCReportMeta asst_typ_nm_META_0 = new MCReportMeta("asst_typ_nm", "", "", "", true);
	static public final MCReportMeta bp_cd_META_0 = new MCReportMeta("bp_cd", "", "", "", true);
	static public final MCReportMeta bp_nm_META_0 = new MCReportMeta("bp_nm", "", "", "", true);
	static public final MCReportMeta bp_alt_nm1_META_0 = new MCReportMeta("bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta bp_alt_nm2_META_0 = new MCReportMeta("bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta bp_alt_nm3_META_0 = new MCReportMeta("bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta bp_alt_nm4_META_0 = new MCReportMeta("bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta sum_amt_META_0 = new MCReportMeta("sum_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_amt_META_0 = new MCReportMeta("s_sum_amt", "", "", "", true);
	static public final MCReportMeta prnt_dt_META_0 = new MCReportMeta("prnt_dt", "YMDHM", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta cur_nm_META_0 = new MCReportMeta("cur_nm", "", "", "", true);
	static public final MCReportMeta upri_dec_place_META_0 = new MCReportMeta("upri_dec_place", "", "", "", true);
	static public final MCReportMeta amt_dec_place_META_0 = new MCReportMeta("amt_dec_place", "", "", "", true);
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
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta sno1_lbl_META_0 = new MCReportMeta("sno1_lbl", "", "", "", true);
	static public final MCReportMeta sno2_lbl_META_0 = new MCReportMeta("sno2_lbl", "", "", "", true);
	static public final MCReportMeta sno3_lbl_META_0 = new MCReportMeta("sno3_lbl", "", "", "", true);
	static public final MCReportMeta sno4_lbl_META_0 = new MCReportMeta("sno4_lbl", "", "", "", true);
	static public final MCReportMeta sno1_view_META_0 = new MCReportMeta("sno1_view", "", "", "", true);
	static public final MCReportMeta sno1_data_META_0 = new MCReportMeta("sno1_data", "", "", "", true);
	static public final MCReportMeta sno2_view_META_0 = new MCReportMeta("sno2_view", "", "", "", true);
	static public final MCReportMeta sno2_data_META_0 = new MCReportMeta("sno2_data", "", "", "", true);
	static public final MCReportMeta sno3_view_META_0 = new MCReportMeta("sno3_view", "", "", "", true);
	static public final MCReportMeta sno3_data_META_0 = new MCReportMeta("sno3_data", "", "", "", true);
	static public final MCReportMeta sno4_view_META_0 = new MCReportMeta("sno4_view", "", "", "", true);
	static public final MCReportMeta sno4_data_META_0 = new MCReportMeta("sno4_data", "", "", "", true);
	static public final MCReportMeta qty_META_0 = new MCReportMeta("qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_qty_META_0 = new MCReportMeta("s_int_qty", "", "", "", true);
	static public final MCReportMeta s_dec_qty_META_0 = new MCReportMeta("s_dec_qty", "", "", "", true);
	static public final MCReportMeta unit_cd_META_0 = new MCReportMeta("unit_cd", "", "", "", true);
	static public final MCReportMeta unit_nm_META_0 = new MCReportMeta("unit_nm", "", "", "", true);
	static public final MCReportMeta unit_dec_place_META_0 = new MCReportMeta("unit_dec_place", "", "", "", true);
	static public final MCReportMeta amt_META_0 = new MCReportMeta("amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_amt_META_0 = new MCReportMeta("s_int_amt", "", "", "", true);
	static public final MCReportMeta s_dec_amt_META_0 = new MCReportMeta("s_dec_amt", "", "", "", true);
	static public final MCReportMeta ave_amt_META_0 = new MCReportMeta("ave_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_ave_amt_META_0 = new MCReportMeta("s_int_ave_amt", "", "", "", true);
	static public final MCReportMeta s_dec_ave_amt_META_0 = new MCReportMeta("s_dec_ave_amt", "", "", "", true);
	static public final MCReportMeta std_amt_META_0 = new MCReportMeta("std_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_std_amt_META_0 = new MCReportMeta("s_int_std_amt", "", "", "", true);
	static public final MCReportMeta s_dec_std_amt_META_0 = new MCReportMeta("s_dec_std_amt", "", "", "", true);
	static public final MCReportMeta dim_qty_META_0 = new MCReportMeta("dim_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_dim_qty_META_0 = new MCReportMeta("s_int_dim_qty", "", "", "", true);
	static public final MCReportMeta s_dec_dim_qty_META_0 = new MCReportMeta("s_dec_dim_qty", "", "", "", true);
	static public final MCReportMeta wt_qty_META_0 = new MCReportMeta("wt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_wt_qty_META_0 = new MCReportMeta("s_int_wt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_wt_qty_META_0 = new MCReportMeta("s_dec_wt_qty", "", "", "", true);
	static public final MCReportMeta conts_qty_META_0 = new MCReportMeta("conts_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_conts_qty_META_0 = new MCReportMeta("s_int_conts_qty", "", "", "", true);
	static public final MCReportMeta s_dec_conts_qty_META_0 = new MCReportMeta("s_dec_conts_qty", "", "", "", true);
	static public final MCReportMeta dim_unit_cd_META_0 = new MCReportMeta("dim_unit_cd", "", "", "", true);
	static public final MCReportMeta dim_unit_nm_META_0 = new MCReportMeta("dim_unit_nm", "", "", "", true);
	static public final MCReportMeta dim_unit_dec_place_META_0 = new MCReportMeta("dim_unit_dec_place", "", "", "", true);
	static public final MCReportMeta wt_unit_cd_META_0 = new MCReportMeta("wt_unit_cd", "", "", "", true);
	static public final MCReportMeta wt_unit_nm_META_0 = new MCReportMeta("wt_unit_nm", "", "", "", true);
	static public final MCReportMeta wt_unit_dec_place_META_0 = new MCReportMeta("wt_unit_dec_place", "", "", "", true);
	static public final MCReportMeta conts_unit_cd_META_0 = new MCReportMeta("conts_unit_cd", "", "", "", true);
	static public final MCReportMeta conts_unit_nm_META_0 = new MCReportMeta("conts_unit_nm", "", "", "", true);
	static public final MCReportMeta conts_unit_dec_place_META_0 = new MCReportMeta("conts_unit_dec_place", "", "", "", true);
	static public final MCReportMeta dim_amt_META_0 = new MCReportMeta("dim_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_dim_amt_META_0 = new MCReportMeta("s_int_dim_amt", "", "", "", true);
	static public final MCReportMeta s_dec_dim_amt_META_0 = new MCReportMeta("s_dec_dim_amt", "", "", "", true);
	static public final MCReportMeta wt_amt_META_0 = new MCReportMeta("wt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_wt_amt_META_0 = new MCReportMeta("s_int_wt_amt", "", "", "", true);
	static public final MCReportMeta s_dec_wt_amt_META_0 = new MCReportMeta("s_dec_wt_amt", "", "", "", true);
	static public final MCReportMeta conts_amt_META_0 = new MCReportMeta("conts_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_conts_amt_META_0 = new MCReportMeta("s_int_conts_amt", "", "", "", true);
	static public final MCReportMeta s_dec_conts_amt_META_0 = new MCReportMeta("s_dec_conts_amt", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("EndStkAmtLstDtl",
			calc_grp_cd_META_0,
			calc_grp_nm_META_0,
			calc_no_META_0,
			wg_cd_META_0,
			wg_nm_META_0,
			ym_META_0,
			mng_dpt_cd_META_0,
			mng_dpt_nm_META_0,
			itm_jnl_cd_META_0,
			itm_jnl_nm_META_0,
			asst_typ_META_0,
			asst_typ_nm_META_0,
			bp_cd_META_0,
			bp_nm_META_0,
			bp_alt_nm1_META_0,
			bp_alt_nm2_META_0,
			bp_alt_nm3_META_0,
			bp_alt_nm4_META_0,
			sum_amt_META_0,
			s_sum_amt_META_0,
			prnt_dt_META_0,
			cur_cd_META_0,
			cur_nm_META_0,
			upri_dec_place_META_0,
			amt_dec_place_META_0,
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
			lot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_view_META_0,
			sublot_no_data_META_0,
			sno1_lbl_META_0,
			sno2_lbl_META_0,
			sno3_lbl_META_0,
			sno4_lbl_META_0,
			sno1_view_META_0,
			sno1_data_META_0,
			sno2_view_META_0,
			sno2_data_META_0,
			sno3_view_META_0,
			sno3_data_META_0,
			sno4_view_META_0,
			sno4_data_META_0,
			qty_META_0,
			s_int_qty_META_0,
			s_dec_qty_META_0,
			unit_cd_META_0,
			unit_nm_META_0,
			unit_dec_place_META_0,
			amt_META_0,
			s_int_amt_META_0,
			s_dec_amt_META_0,
			ave_amt_META_0,
			s_int_ave_amt_META_0,
			s_dec_ave_amt_META_0,
			std_amt_META_0,
			s_int_std_amt_META_0,
			s_dec_std_amt_META_0,
			dim_qty_META_0,
			s_int_dim_qty_META_0,
			s_dec_dim_qty_META_0,
			wt_qty_META_0,
			s_int_wt_qty_META_0,
			s_dec_wt_qty_META_0,
			conts_qty_META_0,
			s_int_conts_qty_META_0,
			s_dec_conts_qty_META_0,
			dim_unit_cd_META_0,
			dim_unit_nm_META_0,
			dim_unit_dec_place_META_0,
			wt_unit_cd_META_0,
			wt_unit_nm_META_0,
			wt_unit_dec_place_META_0,
			conts_unit_cd_META_0,
			conts_unit_nm_META_0,
			conts_unit_dec_place_META_0,
			dim_amt_META_0,
			s_int_dim_amt_META_0,
			s_dec_dim_amt_META_0,
			wt_amt_META_0,
			s_int_wt_amt_META_0,
			s_dec_wt_amt_META_0,
			conts_amt_META_0,
			s_int_conts_amt_META_0,
			s_dec_conts_amt_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MGBFR_EndStkAmtLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

