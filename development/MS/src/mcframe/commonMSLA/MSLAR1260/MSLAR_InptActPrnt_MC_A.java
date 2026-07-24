package mcframe.commonMSLA.MSLAR1260;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_InptActPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR1260";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR1260.DtlR.class, MCList.class);

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
	static public final MCReportMeta inpt_schd_no_META_0 = new MCReportMeta("inpt_schd_no", "", "", "", true);
	static public final MCReportMeta oper_inst_no_META_0 = new MCReportMeta("oper_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_no_META_0 = new MCReportMeta("mfg_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_rev_META_0 = new MCReportMeta("mfg_inst_rev", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta mfg_itm_cd_META_0 = new MCReportMeta("mfg_itm_cd", "", "", "", true);
	static public final MCReportMeta mfg_itm_sub1_META_0 = new MCReportMeta("mfg_itm_sub1", "", "", "", true);
	static public final MCReportMeta mfg_itm_sub2_META_0 = new MCReportMeta("mfg_itm_sub2", "", "", "", true);
	static public final MCReportMeta mfg_itm_sub3_META_0 = new MCReportMeta("mfg_itm_sub3", "", "", "", true);
	static public final MCReportMeta mfg_itm_nm_META_0 = new MCReportMeta("mfg_itm_nm", "", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_nm_META_0 = new MCReportMeta("oper_nm", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta inpt_loc_cd_META_0 = new MCReportMeta("inpt_loc_cd", "", "", "", true);
	static public final MCReportMeta inpt_loc_nm_META_0 = new MCReportMeta("inpt_loc_nm", "", "", "", true);
	static public final MCReportMeta inpt_str_ln_cd_META_0 = new MCReportMeta("inpt_str_ln_cd", "", "", "", true);
	static public final MCReportMeta inpt_str_ln_nm_META_0 = new MCReportMeta("inpt_str_ln_nm", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_0 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_0 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_0 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_cd_META_0 = new MCReportMeta("stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_nm_META_0 = new MCReportMeta("stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_0 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_0 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_qty_META_0 = new MCReportMeta("base_unit_inpt_qty", "", "", "", true);
	static public final MCReportMeta cont_qty_META_0 = new MCReportMeta("cont_qty", "", "", "", true);
	static public final MCReportMeta act_dt_META_0 = new MCReportMeta("act_dt", "YMD", "", "", true);
	static public final MCReportMeta act_hm_META_0 = new MCReportMeta("act_hm", "HM", "", "", true);
	static public final MCReportMeta acxfr_qty_META_0 = new MCReportMeta("acxfr_qty", "", "", "", true);
	static public final MCReportMeta acxfr_rsn_cd_META_0 = new MCReportMeta("acxfr_rsn_cd", "", "", "", true);
	static public final MCReportMeta acxfr_rsn_nm_META_0 = new MCReportMeta("acxfr_rsn_nm", "", "", "", true);
	static public final MCReportMeta acxfr_bd_dpt_cd_META_0 = new MCReportMeta("acxfr_bd_dpt_cd", "", "", "", true);
	static public final MCReportMeta acxfr_bd_dpt_nm_META_0 = new MCReportMeta("acxfr_bd_dpt_nm", "", "", "", true);
	static public final MCReportMeta abort_flg_META_0 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta act_intr_rmrks_META_0 = new MCReportMeta("act_intr_rmrks", "", "", "", true);
	static public final MCReportMeta inpt_act_rpt_rmrks_META_0 = new MCReportMeta("inpt_act_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta act_trd_rmrks_META_0 = new MCReportMeta("act_trd_rmrks", "", "", "", true);
	static public final MCReportMeta not_pd_chk_flg_META_0 = new MCReportMeta("not_pd_chk_flg", "", "", "", true);
	static public final MCReportMeta if_inpt_typ_META_0 = new MCReportMeta("if_inpt_typ", "", "", "", true);
	static public final MCReportMeta inpt_rsn_cd_META_0 = new MCReportMeta("inpt_rsn_cd", "", "", "", true);
	static public final MCReportMeta inpt_rsn_nm_META_0 = new MCReportMeta("inpt_rsn_nm", "", "", "", true);
	static public final MCReportMeta loss_rsn_cd_META_0 = new MCReportMeta("loss_rsn_cd", "", "", "", true);
	static public final MCReportMeta loss_rsn_nm_META_0 = new MCReportMeta("loss_rsn_nm", "", "", "", true);
	static public final MCReportMeta old_loss_rsn_cd_META_0 = new MCReportMeta("old_loss_rsn_cd", "", "", "", true);
	static public final MCReportMeta ext_oper_act_no_META_0 = new MCReportMeta("ext_oper_act_no", "", "", "", true);
	static public final MCReportMeta ext_inpt_act_no_META_0 = new MCReportMeta("ext_inpt_act_no", "", "", "", true);
	static public final MCReportMeta ext_yield_act_no_META_0 = new MCReportMeta("ext_yield_act_no", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
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
			inpt_schd_no_META_0,
			oper_inst_no_META_0,
			mfg_inst_no_META_0,
			mfg_inst_rev_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			mfg_itm_cd_META_0,
			mfg_itm_sub1_META_0,
			mfg_itm_sub2_META_0,
			mfg_itm_sub3_META_0,
			mfg_itm_nm_META_0,
			oper_cd_META_0,
			oper_nm_META_0,
			oper_seq_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			inpt_loc_cd_META_0,
			inpt_loc_nm_META_0,
			inpt_str_ln_cd_META_0,
			inpt_str_ln_nm_META_0,
			stk_id_typ_META_0,
			stk_bp_cd_META_0,
			stk_bp_nm_META_0,
			stk_arrv_bp_cd_META_0,
			stk_arrv_bp_nm_META_0,
			gd_cd_META_0,
			gd_nm_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			base_unit_inpt_qty_META_0,
			cont_qty_META_0,
			act_dt_META_0,
			act_hm_META_0,
			acxfr_qty_META_0,
			acxfr_rsn_cd_META_0,
			acxfr_rsn_nm_META_0,
			acxfr_bd_dpt_cd_META_0,
			acxfr_bd_dpt_nm_META_0,
			abort_flg_META_0,
			act_intr_rmrks_META_0,
			inpt_act_rpt_rmrks_META_0,
			act_trd_rmrks_META_0,
			not_pd_chk_flg_META_0,
			if_inpt_typ_META_0,
			inpt_rsn_cd_META_0,
			inpt_rsn_nm_META_0,
			loss_rsn_cd_META_0,
			loss_rsn_nm_META_0,
			old_loss_rsn_cd_META_0,
			ext_oper_act_no_META_0,
			ext_inpt_act_no_META_0,
			ext_yield_act_no_META_0,
			co_cd_META_0,
			co_nm_META_0,
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
	protected MSLAR_InptActPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

