package mcframe.commonMSBE.MSBER0100;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_PickLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0100";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PICKLSTHDRR_RC = new MCReportClass("PickLstHdr", mcframe.commonMSBE.MSBER0100.PickLstHdrR.class);
	static public final MCReportClass PICKLSTDTLL_RC = new MCReportClass("PickLstDtl", mcframe.commonMSBE.MSBER0100.PickLstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PICKLSTHDRR_RC,
		PICKLSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta lg_grp_nm_META_0 = new MCReportMeta("lg_grp_nm", "", "", "", true);
	static public final MCReportMeta lg_grp_cd_META_0 = new MCReportMeta("lg_grp_cd", "", "", "", true);
	static public final MCReportMeta ship_loc_nm_META_0 = new MCReportMeta("ship_loc_nm", "", "", "", true);
	static public final MCReportMeta ship_loc_cd_META_0 = new MCReportMeta("ship_loc_cd", "", "", "", true);
	static public final MCReportMeta ship_inst_dt_META_0 = new MCReportMeta("ship_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_schd_tm_META_0 = new MCReportMeta("ship_schd_tm", "YMDHM", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);

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
	static public final MCReportMeta str_ln_nm_META_1 = new MCReportMeta("str_ln_nm", "", "", "", true);
	static public final MCReportMeta str_ln_cd_META_1 = new MCReportMeta("str_ln_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_1 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_1 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_1 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_1 = new MCReportMeta("ver_no", "", "", "", true);
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
	static public final MCReportMeta quality_typ_nm_META_1 = new MCReportMeta("quality_typ_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_META_1 = new MCReportMeta("quality_typ", "", "", "", true);
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
	static public final MCReportMeta pack_unit_qty_META_1 = new MCReportMeta("pack_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_pack_unit_qty_META_1 = new MCReportMeta("s_pack_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_pack_unit_qty_META_1 = new MCReportMeta("s_int_pack_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_pack_unit_qty_META_1 = new MCReportMeta("s_dec_pack_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_1 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_1 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_qty_META_1 = new MCReportMeta("s_int_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_qty_META_1 = new MCReportMeta("s_dec_base_unit_qty", "", "", "", true);
	static public final MCReportMeta pack_unit_nm_META_1 = new MCReportMeta("pack_unit_nm", "", "", "", true);
	static public final MCReportMeta pack_unit_cd_META_1 = new MCReportMeta("pack_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_1 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_1 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta alloc_flg_META_1 = new MCReportMeta("alloc_flg", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PickLstHdr",
			prnt_tm_META_0,
			lg_grp_nm_META_0,
			lg_grp_cd_META_0,
			ship_loc_nm_META_0,
			ship_loc_cd_META_0,
			ship_inst_dt_META_0,
			ship_schd_tm_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0
		);
		reportMetaMap.add("PickLstDtl",
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
			str_ln_nm_META_1,
			str_ln_cd_META_1,
			gd_nm_META_1,
			gd_cd_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
			ver_no_lbl_META_1,
			ver_no_META_1,
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
			quality_typ_nm_META_1,
			quality_typ_META_1,
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
			pack_unit_qty_META_1,
			s_pack_unit_qty_META_1,
			s_int_pack_unit_qty_META_1,
			s_dec_pack_unit_qty_META_1,
			base_unit_qty_META_1,
			s_base_unit_qty_META_1,
			s_int_base_unit_qty_META_1,
			s_dec_base_unit_qty_META_1,
			pack_unit_nm_META_1,
			pack_unit_cd_META_1,
			base_unit_nm_META_1,
			base_unit_cd_META_1,
			alloc_flg_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_PickLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

