package mcframe.commonMGBB.MGBBR6020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MGBBR_IoActPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MG";
	static final String _defaultReportId = "MGBBR6020";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMGBB.MGBBR6020.DtlR.class, MCList.class);

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
	static public final MCReportMeta calc_ctg_cd_META_0 = new MCReportMeta("calc_ctg_cd", "", "", "", true);
	static public final MCReportMeta wg_cd_META_0 = new MCReportMeta("wg_cd", "", "", "", true);
	static public final MCReportMeta ym_META_0 = new MCReportMeta("ym", "YM", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta mng_dpt_cd_META_0 = new MCReportMeta("mng_dpt_cd", "", "", "", true);
	static public final MCReportMeta sls_dpt_cd_META_0 = new MCReportMeta("sls_dpt_cd", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta cost_io_act_typ_META_0 = new MCReportMeta("cost_io_act_typ", "", "", "", true);
	static public final MCReportMeta itm_mfg_inst_no_META_0 = new MCReportMeta("itm_mfg_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_act_no_META_0 = new MCReportMeta("mfg_act_no", "", "", "", true);
	static public final MCReportMeta oper_act_no_META_0 = new MCReportMeta("oper_act_no", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta loc_cd_META_0 = new MCReportMeta("loc_cd", "", "", "", true);
	static public final MCReportMeta str_ln_cd_META_0 = new MCReportMeta("str_ln_cd", "", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta disp_seq_META_0 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta slo_no_META_0 = new MCReportMeta("slo_no", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta asst_typ_META_0 = new MCReportMeta("asst_typ", "", "", "", true);
	static public final MCReportMeta ac_slip_typ_META_0 = new MCReportMeta("ac_slip_typ", "", "", "", true);
	static public final MCReportMeta ac_rsn_cd_META_0 = new MCReportMeta("ac_rsn_cd", "", "", "", true);
	static public final MCReportMeta qty_META_0 = new MCReportMeta("qty", "", "", "", true);
	static public final MCReportMeta amt_META_0 = new MCReportMeta("amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_0 = new MCReportMeta("trd_cur_amt", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta sppl_cd_META_0 = new MCReportMeta("sppl_cd", "", "", "", true);
	static public final MCReportMeta cst_cd_META_0 = new MCReportMeta("cst_cd", "", "", "", true);
	static public final MCReportMeta dlv_cd_META_0 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dest_cd1_META_0 = new MCReportMeta("dest_cd1", "", "", "", true);
	static public final MCReportMeta dest_cd2_META_0 = new MCReportMeta("dest_cd2", "", "", "", true);
	static public final MCReportMeta dest_cd3_META_0 = new MCReportMeta("dest_cd3", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_0 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta mfg_per_META_0 = new MCReportMeta("mfg_per", "", "", "", true);
	static public final MCReportMeta mfg_cost_ratio_META_0 = new MCReportMeta("mfg_cost_ratio", "", "", "", true);
	static public final MCReportMeta trd_grp_META_0 = new MCReportMeta("trd_grp", "", "", "", true);
	static public final MCReportMeta trd_ratio_META_0 = new MCReportMeta("trd_ratio", "", "", "", true);
	static public final MCReportMeta alc_ac_cd_META_0 = new MCReportMeta("alc_ac_cd", "", "", "", true);
	static public final MCReportMeta alc_amt_flg_META_0 = new MCReportMeta("alc_amt_flg", "", "", "", true);
	static public final MCReportMeta bd_wg_cd_META_0 = new MCReportMeta("bd_wg_cd", "", "", "", true);
	static public final MCReportMeta bd_dpt_cd_META_0 = new MCReportMeta("bd_dpt_cd", "", "", "", true);
	static public final MCReportMeta bd_loc_cd_META_0 = new MCReportMeta("bd_loc_cd", "", "", "", true);
	static public final MCReportMeta bd_oper_cd_META_0 = new MCReportMeta("bd_oper_cd", "", "", "", true);
	static public final MCReportMeta bd_bp_cd_META_0 = new MCReportMeta("bd_bp_cd", "", "", "", true);
	static public final MCReportMeta bd_ctg_cd_META_0 = new MCReportMeta("bd_ctg_cd", "", "", "", true);
	static public final MCReportMeta bd_lot_no_META_0 = new MCReportMeta("bd_lot_no", "", "", "", true);
	static public final MCReportMeta bd_sublot_no_META_0 = new MCReportMeta("bd_sublot_no", "", "", "", true);
	static public final MCReportMeta bd_sno1_META_0 = new MCReportMeta("bd_sno1", "", "", "", true);
	static public final MCReportMeta bd_sno2_META_0 = new MCReportMeta("bd_sno2", "", "", "", true);
	static public final MCReportMeta bd_sno3_META_0 = new MCReportMeta("bd_sno3", "", "", "", true);
	static public final MCReportMeta bd_sno4_META_0 = new MCReportMeta("bd_sno4", "", "", "", true);
	static public final MCReportMeta bd_itm_cd_META_0 = new MCReportMeta("bd_itm_cd", "", "", "", true);
	static public final MCReportMeta bd_itm_sub1_META_0 = new MCReportMeta("bd_itm_sub1", "", "", "", true);
	static public final MCReportMeta bd_itm_sub2_META_0 = new MCReportMeta("bd_itm_sub2", "", "", "", true);
	static public final MCReportMeta bd_itm_sub3_META_0 = new MCReportMeta("bd_itm_sub3", "", "", "", true);
	static public final MCReportMeta cost_sls_cd1_META_0 = new MCReportMeta("cost_sls_cd1", "", "", "", true);
	static public final MCReportMeta cost_sls_cd2_META_0 = new MCReportMeta("cost_sls_cd2", "", "", "", true);
	static public final MCReportMeta cost_sls_cd3_META_0 = new MCReportMeta("cost_sls_cd3", "", "", "", true);
	static public final MCReportMeta cost_sls_cd4_META_0 = new MCReportMeta("cost_sls_cd4", "", "", "", true);
	static public final MCReportMeta cost_sls_cd5_META_0 = new MCReportMeta("cost_sls_cd5", "", "", "", true);
	static public final MCReportMeta alc_val1_META_0 = new MCReportMeta("alc_val1", "", "", "", true);
	static public final MCReportMeta alc_val2_META_0 = new MCReportMeta("alc_val2", "", "", "", true);
	static public final MCReportMeta alc_val3_META_0 = new MCReportMeta("alc_val3", "", "", "", true);
	static public final MCReportMeta alc_val4_META_0 = new MCReportMeta("alc_val4", "", "", "", true);
	static public final MCReportMeta alc_val5_META_0 = new MCReportMeta("alc_val5", "", "", "", true);
	static public final MCReportMeta rec_eval_typ_META_0 = new MCReportMeta("rec_eval_typ", "", "", "", true);
	static public final MCReportMeta expns_cd_META_0 = new MCReportMeta("expns_cd", "", "", "", true);
	static public final MCReportMeta mfg_act_grp_META_0 = new MCReportMeta("mfg_act_grp", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta oper_ptn_META_0 = new MCReportMeta("oper_ptn", "", "", "", true);
	static public final MCReportMeta no_pln_flg_META_0 = new MCReportMeta("no_pln_flg", "", "", "", true);
	static public final MCReportMeta no_itm_info_flg_META_0 = new MCReportMeta("no_itm_info_flg", "", "", "", true);
	static public final MCReportMeta no_eval_flg_META_0 = new MCReportMeta("no_eval_flg", "", "", "", true);
	static public final MCReportMeta zero_effect_flg_META_0 = new MCReportMeta("zero_effect_flg", "", "", "", true);
	static public final MCReportMeta slip_no_META_0 = new MCReportMeta("slip_no", "", "", "", true);
	static public final MCReportMeta slip_seq_no_META_0 = new MCReportMeta("slip_seq_no", "", "", "", true);
	static public final MCReportMeta rmrks_META_0 = new MCReportMeta("rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
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
			calc_ctg_cd_META_0,
			wg_cd_META_0,
			ym_META_0,
			ac_dt_META_0,
			mng_dpt_cd_META_0,
			sls_dpt_cd_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			cost_io_act_typ_META_0,
			itm_mfg_inst_no_META_0,
			mfg_act_no_META_0,
			oper_act_no_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			loc_cd_META_0,
			str_ln_cd_META_0,
			oper_cd_META_0,
			oper_seq_META_0,
			disp_seq_META_0,
			po_no_META_0,
			slo_no_META_0,
			iv_no_META_0,
			asst_typ_META_0,
			ac_slip_typ_META_0,
			ac_rsn_cd_META_0,
			qty_META_0,
			amt_META_0,
			trd_cur_cd_META_0,
			trd_cur_amt_META_0,
			xrate_META_0,
			sppl_cd_META_0,
			cst_cd_META_0,
			dlv_cd_META_0,
			dest_cd1_META_0,
			dest_cd2_META_0,
			dest_cd3_META_0,
			stk_bp_cd_META_0,
			usr_cd_META_0,
			mfg_per_META_0,
			mfg_cost_ratio_META_0,
			trd_grp_META_0,
			trd_ratio_META_0,
			alc_ac_cd_META_0,
			alc_amt_flg_META_0,
			bd_wg_cd_META_0,
			bd_dpt_cd_META_0,
			bd_loc_cd_META_0,
			bd_oper_cd_META_0,
			bd_bp_cd_META_0,
			bd_ctg_cd_META_0,
			bd_lot_no_META_0,
			bd_sublot_no_META_0,
			bd_sno1_META_0,
			bd_sno2_META_0,
			bd_sno3_META_0,
			bd_sno4_META_0,
			bd_itm_cd_META_0,
			bd_itm_sub1_META_0,
			bd_itm_sub2_META_0,
			bd_itm_sub3_META_0,
			cost_sls_cd1_META_0,
			cost_sls_cd2_META_0,
			cost_sls_cd3_META_0,
			cost_sls_cd4_META_0,
			cost_sls_cd5_META_0,
			alc_val1_META_0,
			alc_val2_META_0,
			alc_val3_META_0,
			alc_val4_META_0,
			alc_val5_META_0,
			rec_eval_typ_META_0,
			expns_cd_META_0,
			mfg_act_grp_META_0,
			bom_ptn_META_0,
			oper_ptn_META_0,
			no_pln_flg_META_0,
			no_itm_info_flg_META_0,
			no_eval_flg_META_0,
			zero_effect_flg_META_0,
			slip_no_META_0,
			slip_seq_no_META_0,
			rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
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
	protected MGBBR_IoActPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

