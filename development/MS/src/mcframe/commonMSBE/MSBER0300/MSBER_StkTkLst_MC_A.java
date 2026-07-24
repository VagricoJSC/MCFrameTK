package mcframe.commonMSBE.MSBER0300;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_StkTkLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0300";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass STKTKLSTHDRR_RC = new MCReportClass("StkTkLstHdr", mcframe.commonMSBE.MSBER0300.StkTkLstHdrR.class);
	static public final MCReportClass STKTKLSTDTLL_RC = new MCReportClass("StkTkLstDtl", mcframe.commonMSBE.MSBER0300.StkTkLstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		STKTKLSTHDRR_RC,
		STKTKLSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta stktk_base_dt_META_0 = new MCReportMeta("stktk_base_dt", "YMD", "", "", true);
	static public final MCReportMeta loc_cd_META_0 = new MCReportMeta("loc_cd", "", "", "", true);
	static public final MCReportMeta loc_nm_META_0 = new MCReportMeta("loc_nm", "", "", "", true);
	static public final MCReportMeta act_dpt_cd_META_0 = new MCReportMeta("act_dpt_cd", "", "", "", true);
	static public final MCReportMeta act_dpt_nm_META_0 = new MCReportMeta("act_dpt_nm", "", "", "", true);
	static public final MCReportMeta stktk_rpt_rmrks_META_0 = new MCReportMeta("stktk_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);

	static public final MCReportMeta str_ln_nm_META_1 = new MCReportMeta("str_ln_nm", "", "", "", true);
	static public final MCReportMeta str_ln_cd_META_1 = new MCReportMeta("str_ln_cd", "", "", "", true);
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
	static public final MCReportMeta in_xfr_typ_META_1 = new MCReportMeta("in_xfr_typ", "", "", "", true);
	static public final MCReportMeta in_xfr_typ_nm_META_1 = new MCReportMeta("in_xfr_typ_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_nm_META_1 = new MCReportMeta("quality_typ_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_META_1 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta gd_nm_META_1 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_1 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_lbl_META_1 = new MCReportMeta("stk_insp_typ_lbl", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_nm_META_1 = new MCReportMeta("stk_insp_typ_nm", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_META_1 = new MCReportMeta("stk_insp_typ", "", "", "", true);
	static public final MCReportMeta stk_id_typ_nm_META_1 = new MCReportMeta("stk_id_typ_nm", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_1 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_1 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm1_META_1 = new MCReportMeta("stk_bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm2_META_1 = new MCReportMeta("stk_bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm3_META_1 = new MCReportMeta("stk_bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm4_META_1 = new MCReportMeta("stk_bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_1 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_nm_META_1 = new MCReportMeta("stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm1_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm2_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm3_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_alt_nm4_META_1 = new MCReportMeta("stk_arrv_bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_cd_META_1 = new MCReportMeta("stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
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
	static public final MCReportMeta tor_qty_META_1 = new MCReportMeta("tor_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_tor_qty_META_1 = new MCReportMeta("s_tor_qty", "", "", "", true);
	static public final MCReportMeta s_int_tor_qty_META_1 = new MCReportMeta("s_int_tor_qty", "", "", "", true);
	static public final MCReportMeta s_dec_tor_qty_META_1 = new MCReportMeta("s_dec_tor_qty", "", "", "", true);
	static public final MCReportMeta pack_unit_nm_META_1 = new MCReportMeta("pack_unit_nm", "", "", "", true);
	static public final MCReportMeta act_qty_META_1 = new MCReportMeta("act_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_act_qty_META_1 = new MCReportMeta("s_act_qty", "", "", "", true);
	static public final MCReportMeta s_int_act_qty_META_1 = new MCReportMeta("s_int_act_qty", "", "", "", true);
	static public final MCReportMeta s_dec_act_qty_META_1 = new MCReportMeta("s_dec_act_qty", "", "", "", true);
	static public final MCReportMeta std_upri_META_1 = new MCReportMeta("std_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_std_upri_META_1 = new MCReportMeta("s_std_upri", "", "", "", true);
	static public final MCReportMeta s_int_std_upri_META_1 = new MCReportMeta("s_int_std_upri", "", "", "", true);
	static public final MCReportMeta s_dec_std_upri_META_1 = new MCReportMeta("s_dec_std_upri", "", "", "", true);
	static public final MCReportMeta sub_char1_META_1 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_1 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_1 = new MCReportMeta("sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("StkTkLstHdr",
			stktk_base_dt_META_0,
			loc_cd_META_0,
			loc_nm_META_0,
			act_dpt_cd_META_0,
			act_dpt_nm_META_0,
			stktk_rpt_rmrks_META_0,
			prnt_tm_META_0
		);
		reportMetaMap.add("StkTkLstDtl",
			str_ln_nm_META_1,
			str_ln_cd_META_1,
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
			in_xfr_typ_META_1,
			in_xfr_typ_nm_META_1,
			quality_typ_nm_META_1,
			quality_typ_META_1,
			gd_nm_META_1,
			gd_cd_META_1,
			stk_insp_typ_lbl_META_1,
			stk_insp_typ_nm_META_1,
			stk_insp_typ_META_1,
			stk_id_typ_nm_META_1,
			stk_id_typ_META_1,
			stk_bp_nm_META_1,
			stk_bp_alt_nm1_META_1,
			stk_bp_alt_nm2_META_1,
			stk_bp_alt_nm3_META_1,
			stk_bp_alt_nm4_META_1,
			stk_bp_cd_META_1,
			stk_arrv_bp_nm_META_1,
			stk_arrv_bp_alt_nm1_META_1,
			stk_arrv_bp_alt_nm2_META_1,
			stk_arrv_bp_alt_nm3_META_1,
			stk_arrv_bp_alt_nm4_META_1,
			stk_arrv_bp_cd_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
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
			tor_qty_META_1,
			s_tor_qty_META_1,
			s_int_tor_qty_META_1,
			s_dec_tor_qty_META_1,
			pack_unit_nm_META_1,
			act_qty_META_1,
			s_act_qty_META_1,
			s_int_act_qty_META_1,
			s_dec_act_qty_META_1,
			std_upri_META_1,
			s_std_upri_META_1,
			s_int_std_upri_META_1,
			s_dec_std_upri_META_1,
			sub_char1_META_1,
			sub_char2_META_1,
			sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_StkTkLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

