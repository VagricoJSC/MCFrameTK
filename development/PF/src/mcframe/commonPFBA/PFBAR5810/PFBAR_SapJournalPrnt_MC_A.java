package mcframe.commonPFBA.PFBAR5810;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBAR_SapJournalPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBAR5810";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBA.PFBAR5810.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta jnl_grp_no_META_0 = new MCReportMeta("jnl_grp_no", "", "", "", true);
	static public final MCReportMeta ac_ym_META_0 = new MCReportMeta("ac_ym", "YM", "", "", true);
	static public final MCReportMeta ac_if_typ_META_0 = new MCReportMeta("ac_if_typ", "", "", "", true);
	static public final MCReportMeta slip_cnt_id_META_0 = new MCReportMeta("slip_cnt_id", "", "", "", true);
	static public final MCReportMeta jnl_no_META_0 = new MCReportMeta("jnl_no", "", "", "", true);
	static public final MCReportMeta jnl_no_seq_META_0 = new MCReportMeta("jnl_no_seq", "", "", "", true);
	static public final MCReportMeta dc_typ_META_0 = new MCReportMeta("dc_typ", "", "", "", true);
	static public final MCReportMeta ac_slip_dt_META_0 = new MCReportMeta("ac_slip_dt", "YMD", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta slip_no_META_0 = new MCReportMeta("slip_no", "", "", "", true);
	static public final MCReportMeta slip_seq_no_META_0 = new MCReportMeta("slip_seq_no", "", "", "", true);
	static public final MCReportMeta dpt_cd_META_0 = new MCReportMeta("dpt_cd", "", "", "", true);
	static public final MCReportMeta ac_cd_META_0 = new MCReportMeta("ac_cd", "", "", "", true);
	static public final MCReportMeta sub_ac_cd_META_0 = new MCReportMeta("sub_ac_cd", "", "", "", true);
	static public final MCReportMeta project_cd_META_0 = new MCReportMeta("project_cd", "", "", "", true);
	static public final MCReportMeta summary_cd0_META_0 = new MCReportMeta("summary_cd0", "", "", "", true);
	static public final MCReportMeta summary_cd1_META_0 = new MCReportMeta("summary_cd1", "", "", "", true);
	static public final MCReportMeta summary_cd2_META_0 = new MCReportMeta("summary_cd2", "", "", "", true);
	static public final MCReportMeta summary_cd3_META_0 = new MCReportMeta("summary_cd3", "", "", "", true);
	static public final MCReportMeta summary_cd4_META_0 = new MCReportMeta("summary_cd4", "", "", "", true);
	static public final MCReportMeta summary_cd5_META_0 = new MCReportMeta("summary_cd5", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta bp_typ_META_0 = new MCReportMeta("bp_typ", "", "", "", true);
	static public final MCReportMeta bp_cd_META_0 = new MCReportMeta("bp_cd", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_cur_upri_META_0 = new MCReportMeta("base_cur_upri", "", "", "", true);
	static public final MCReportMeta base_cur_sum_amt_META_0 = new MCReportMeta("base_cur_sum_amt", "", "", "", true);
	static public final MCReportMeta base_cur_amt_META_0 = new MCReportMeta("base_cur_amt", "", "", "", true);
	static public final MCReportMeta base_cur_tax_amt_META_0 = new MCReportMeta("base_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta base_cur_tax_base_amt_META_0 = new MCReportMeta("base_cur_tax_base_amt", "", "", "", true);
	static public final MCReportMeta base_cur_cd_META_0 = new MCReportMeta("base_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_0 = new MCReportMeta("trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_sum_amt_META_0 = new MCReportMeta("trd_cur_sum_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_0 = new MCReportMeta("trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_0 = new MCReportMeta("trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_base_amt_META_0 = new MCReportMeta("trd_cur_tax_base_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta ptax_cur_upri_META_0 = new MCReportMeta("ptax_cur_upri", "", "", "", true);
	static public final MCReportMeta ptax_cur_sum_amt_META_0 = new MCReportMeta("ptax_cur_sum_amt", "", "", "", true);
	static public final MCReportMeta ptax_cur_amt_META_0 = new MCReportMeta("ptax_cur_amt", "", "", "", true);
	static public final MCReportMeta ptax_cur_tax_amt_META_0 = new MCReportMeta("ptax_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta ptax_cur_tax_base_amt_META_0 = new MCReportMeta("ptax_cur_tax_base_amt", "", "", "", true);
	static public final MCReportMeta ptax_cur_cd_META_0 = new MCReportMeta("ptax_cur_cd", "", "", "", true);
	static public final MCReportMeta tax_typ_META_0 = new MCReportMeta("tax_typ", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta foreign_flg_META_0 = new MCReportMeta("foreign_flg", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta xrate_cd_META_0 = new MCReportMeta("xrate_cd", "", "", "", true);
	static public final MCReportMeta ptax_xrate_META_0 = new MCReportMeta("ptax_xrate", "", "", "", true);
	static public final MCReportMeta ptax_xrate_cd_META_0 = new MCReportMeta("ptax_xrate_cd", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta bill_no_META_0 = new MCReportMeta("bill_no", "", "", "", true);
	static public final MCReportMeta slo_no_META_0 = new MCReportMeta("slo_no", "", "", "", true);
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta cls_jnl_typ_META_0 = new MCReportMeta("cls_jnl_typ", "", "", "", true);
	static public final MCReportMeta alloc_jnl_flg_META_0 = new MCReportMeta("alloc_jnl_flg", "", "", "", true);
	static public final MCReportMeta spot_flg_META_0 = new MCReportMeta("spot_flg", "", "", "", true);
	static public final MCReportMeta sttl_schd_dt_META_0 = new MCReportMeta("sttl_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd_META_0 = new MCReportMeta("sttl_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta other_ac_cd_META_0 = new MCReportMeta("other_ac_cd", "", "", "", true);
	static public final MCReportMeta other_sub_ac_cd_META_0 = new MCReportMeta("other_sub_ac_cd", "", "", "", true);
	static public final MCReportMeta other_dpt_cd_META_0 = new MCReportMeta("other_dpt_cd", "", "", "", true);
	static public final MCReportMeta abstract1_META_0 = new MCReportMeta("abstract1", "", "", "", true);
	static public final MCReportMeta abstract2_META_0 = new MCReportMeta("abstract2", "", "", "", true);
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
	static public final MCReportMeta sub_num1_META_0 = new MCReportMeta("sub_num1", "", "", "", true);
	static public final MCReportMeta sub_num2_META_0 = new MCReportMeta("sub_num2", "", "", "", true);
	static public final MCReportMeta sub_num3_META_0 = new MCReportMeta("sub_num3", "", "", "", true);
	static public final MCReportMeta sub_dt1_META_0 = new MCReportMeta("sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta sub_dt2_META_0 = new MCReportMeta("sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta sub_dt3_META_0 = new MCReportMeta("sub_dt3", "YMD", "", "", true);
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
			co_cd_META_0,
			jnl_grp_no_META_0,
			ac_ym_META_0,
			ac_if_typ_META_0,
			slip_cnt_id_META_0,
			jnl_no_META_0,
			jnl_no_seq_META_0,
			dc_typ_META_0,
			ac_slip_dt_META_0,
			ac_dt_META_0,
			slip_no_META_0,
			slip_seq_no_META_0,
			dpt_cd_META_0,
			ac_cd_META_0,
			sub_ac_cd_META_0,
			project_cd_META_0,
			summary_cd0_META_0,
			summary_cd1_META_0,
			summary_cd2_META_0,
			summary_cd3_META_0,
			summary_cd4_META_0,
			summary_cd5_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			bp_typ_META_0,
			bp_cd_META_0,
			base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_cur_upri_META_0,
			base_cur_sum_amt_META_0,
			base_cur_amt_META_0,
			base_cur_tax_amt_META_0,
			base_cur_tax_base_amt_META_0,
			base_cur_cd_META_0,
			trd_cur_upri_META_0,
			trd_cur_sum_amt_META_0,
			trd_cur_amt_META_0,
			trd_cur_tax_amt_META_0,
			trd_cur_tax_base_amt_META_0,
			trd_cur_cd_META_0,
			ptax_cur_upri_META_0,
			ptax_cur_sum_amt_META_0,
			ptax_cur_amt_META_0,
			ptax_cur_tax_amt_META_0,
			ptax_cur_tax_base_amt_META_0,
			ptax_cur_cd_META_0,
			tax_typ_META_0,
			tax_cd_META_0,
			foreign_flg_META_0,
			xrate_META_0,
			xrate_cd_META_0,
			ptax_xrate_META_0,
			ptax_xrate_cd_META_0,
			iv_no_META_0,
			bill_no_META_0,
			slo_no_META_0,
			po_no_META_0,
			usr_cd_META_0,
			cls_jnl_typ_META_0,
			alloc_jnl_flg_META_0,
			spot_flg_META_0,
			sttl_schd_dt_META_0,
			sttl_cd_META_0,
			bank_ac_cd_META_0,
			bank_cd_META_0,
			other_ac_cd_META_0,
			other_sub_ac_cd_META_0,
			other_dpt_cd_META_0,
			abstract1_META_0,
			abstract2_META_0,
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
			sub_num1_META_0,
			sub_num2_META_0,
			sub_num3_META_0,
			sub_dt1_META_0,
			sub_dt2_META_0,
			sub_dt3_META_0,
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
	protected PFBAR_SapJournalPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

