package mcframe.commonMSBE.MSBER0410;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_StkXfrSlip_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0410";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass STKXFRSLIPHDRR_RC = new MCReportClass("StkXfrSlipHdr", mcframe.commonMSBE.MSBER0410.StkXfrSlipHdrR.class);
	static public final MCReportClass STKXFRSLIPDTLL_RC = new MCReportClass("StkXfrSlipDtl", mcframe.commonMSBE.MSBER0410.StkXfrSlipDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		STKXFRSLIPHDRR_RC,
		STKXFRSLIPDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta formtitle_META_0 = new MCReportMeta("formtitle", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_nm_META_0 = new MCReportMeta("slip_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_0 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_rev_META_0 = new MCReportMeta("dlv_slip_rev", "", "", "", true);
	static public final MCReportMeta dlv_slip_act_no_META_0 = new MCReportMeta("dlv_slip_act_no", "", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta loc_nm_META_0 = new MCReportMeta("loc_nm", "", "", "", true);
	static public final MCReportMeta loc_cd_META_0 = new MCReportMeta("loc_cd", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_cd_META_0 = new MCReportMeta("dpt_cd", "", "", "", true);
	static public final MCReportMeta usr_nm_META_0 = new MCReportMeta("usr_nm", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta io_typ_nm_META_1 = new MCReportMeta("io_typ_nm", "", "", "", true);
	static public final MCReportMeta io_typ_META_1 = new MCReportMeta("io_typ", "", "", "", true);
	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta str_ln_nm_META_1 = new MCReportMeta("str_ln_nm", "", "", "", true);
	static public final MCReportMeta str_ln_cd_META_1 = new MCReportMeta("str_ln_cd", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_nm_META_1 = new MCReportMeta("stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm1_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm2_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm3_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm4_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_cd_META_1 = new MCReportMeta("stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta quality_typ_nm_META_1 = new MCReportMeta("quality_typ_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_META_1 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta gd_nm_META_1 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_1 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta stk_id_typ_nm_META_1 = new MCReportMeta("stk_id_typ_nm", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_1 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_1 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm1_META_1 = new MCReportMeta("stk_bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm2_META_1 = new MCReportMeta("stk_bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm3_META_1 = new MCReportMeta("stk_bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm4_META_1 = new MCReportMeta("stk_bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_1 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta fix_no_META_1 = new MCReportMeta("fix_no", "", "", "", true);
	static public final MCReportMeta fix_no_typ_META_1 = new MCReportMeta("fix_no_typ", "", "", "", true);
	static public final MCReportMeta fix_no_typ_nm_META_1 = new MCReportMeta("fix_no_typ_nm", "", "", "", true);
	static public final MCReportMeta sno1_lbl_META_1 = new MCReportMeta("sno1_lbl", "", "", "", true);
	static public final MCReportMeta sno1_view_META_1 = new MCReportMeta("sno1_view", "", "", "", true);
	static public final MCReportMeta sno1_data_META_1 = new MCReportMeta("sno1_data", "", "", "", true);
	static public final MCReportMeta sno2_lbl_META_1 = new MCReportMeta("sno2_lbl", "", "", "", true);
	static public final MCReportMeta sno2_view_META_1 = new MCReportMeta("sno2_view", "", "", "", true);
	static public final MCReportMeta sno2_data_META_1 = new MCReportMeta("sno2_data", "", "", "", true);
	static public final MCReportMeta sno3_lbl_META_1 = new MCReportMeta("sno3_lbl", "", "", "", true);
	static public final MCReportMeta sno3_view_META_1 = new MCReportMeta("sno3_view", "", "", "", true);
	static public final MCReportMeta sno3_data_META_1 = new MCReportMeta("sno3_data", "", "", "", true);
	static public final MCReportMeta sno4_lbl_META_1 = new MCReportMeta("sno4_lbl", "", "", "", true);
	static public final MCReportMeta sno4_view_META_1 = new MCReportMeta("sno4_view", "", "", "", true);
	static public final MCReportMeta sno4_data_META_1 = new MCReportMeta("sno4_data", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_1 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("StkXfrSlipHdr",
			prnt_tm_META_0,
			formtitle_META_0,
			trd_nm_META_0,
			trd_cd_META_0,
			trd_ptn_typ_META_0,
			slip_sts_typ_nm_META_0,
			slip_sts_typ_META_0,
			dlv_slip_no_META_0,
			dlv_slip_rev_META_0,
			dlv_slip_act_no_META_0,
			ac_dt_META_0,
			loc_nm_META_0,
			loc_cd_META_0,
			dpt_nm_META_0,
			dpt_cd_META_0,
			usr_nm_META_0,
			usr_cd_META_0,
			trd_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("StkXfrSlipDtl",
			io_typ_nm_META_1,
			io_typ_META_1,
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_view_META_1,
			itm_sub2_data_META_1,
			itm_sub3_view_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_nm_META_1,
			trd_unit_cd_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			base_unit_nm_META_1,
			base_unit_cd_META_1,
			str_ln_nm_META_1,
			str_ln_cd_META_1,
			stk_arrv_bp_nm_META_1,
			stk_arrv_bp_alt_nm1_META_1,
			stk_arrv_bp_alt_nm2_META_1,
			stk_arrv_bp_alt_nm3_META_1,
			stk_arrv_bp_alt_nm4_META_1,
			stk_arrv_bp_cd_META_1,
			quality_typ_nm_META_1,
			quality_typ_META_1,
			gd_nm_META_1,
			gd_cd_META_1,
			stk_id_typ_nm_META_1,
			stk_id_typ_META_1,
			stk_bp_nm_META_1,
			stk_bp_alt_nm1_META_1,
			stk_bp_alt_nm2_META_1,
			stk_bp_alt_nm3_META_1,
			stk_bp_alt_nm4_META_1,
			stk_bp_cd_META_1,
			fix_no_META_1,
			fix_no_typ_META_1,
			fix_no_typ_nm_META_1,
			sno1_lbl_META_1,
			sno1_view_META_1,
			sno1_data_META_1,
			sno2_lbl_META_1,
			sno2_view_META_1,
			sno2_data_META_1,
			sno3_lbl_META_1,
			sno3_view_META_1,
			sno3_data_META_1,
			sno4_lbl_META_1,
			sno4_view_META_1,
			sno4_data_META_1,
			trd_d_rmrks_META_1,
			disp_seq_META_1,
			d_sub_char1_META_1,
			d_sub_char2_META_1,
			d_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_StkXfrSlip_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

