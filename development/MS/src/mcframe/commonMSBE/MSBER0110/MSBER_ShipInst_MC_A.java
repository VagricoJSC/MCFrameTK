package mcframe.commonMSBE.MSBER0110;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_ShipInst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0110";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass SHIPINSTHDRR_RC = new MCReportClass("ShipInstHdr", mcframe.commonMSBE.MSBER0110.ShipInstHdrR.class);
	static public final MCReportClass SHIPINSTDTLL_RC = new MCReportClass("ShipInstDtl", mcframe.commonMSBE.MSBER0110.ShipInstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		SHIPINSTHDRR_RC,
		SHIPINSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta ship_wk_nm_META_0 = new MCReportMeta("ship_wk_nm", "", "", "", true);
	static public final MCReportMeta ship_wk_cd_META_0 = new MCReportMeta("ship_wk_cd", "", "", "", true);
	static public final MCReportMeta ship_schd_tm_META_0 = new MCReportMeta("ship_schd_tm", "YMDHM", "", "", true);
	static public final MCReportMeta dlv_schd_tm_META_0 = new MCReportMeta("dlv_schd_tm", "YMDHM", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);
	static public final MCReportMeta ship_term_nm_META_0 = new MCReportMeta("ship_term_nm", "", "", "", true);
	static public final MCReportMeta ship_term_cd_META_0 = new MCReportMeta("ship_term_cd", "", "", "", true);
	static public final MCReportMeta ship_inst_dt_META_0 = new MCReportMeta("ship_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_inst_no_META_0 = new MCReportMeta("ship_inst_no", "", "", "", true);
	static public final MCReportMeta iv_no_lbl_META_0 = new MCReportMeta("iv_no_lbl", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta ship_to_id_nm_META_0 = new MCReportMeta("ship_to_id_nm", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm1_META_0 = new MCReportMeta("ship_to_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm2_META_0 = new MCReportMeta("ship_to_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm3_META_0 = new MCReportMeta("ship_to_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta ship_to_id_alt_nm4_META_0 = new MCReportMeta("ship_to_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta ship_to_id_cd_META_0 = new MCReportMeta("ship_to_id_cd", "", "", "", true);
	static public final MCReportMeta ship_to_zip_cd_META_0 = new MCReportMeta("ship_to_zip_cd", "", "", "", true);
	static public final MCReportMeta ship_to_addr1_META_0 = new MCReportMeta("ship_to_addr1", "", "", "", true);
	static public final MCReportMeta ship_to_addr2_META_0 = new MCReportMeta("ship_to_addr2", "", "", "", true);
	static public final MCReportMeta ship_to_addr3_META_0 = new MCReportMeta("ship_to_addr3", "", "", "", true);
	static public final MCReportMeta ship_to_addr4_META_0 = new MCReportMeta("ship_to_addr4", "", "", "", true);
	static public final MCReportMeta ship_to_addr_META_0 = new MCReportMeta("ship_to_addr", "", "", "", true);
	static public final MCReportMeta ship_to_tel_META_0 = new MCReportMeta("ship_to_tel", "", "", "", true);
	static public final MCReportMeta ship_to_fax_META_0 = new MCReportMeta("ship_to_fax", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta inst_rmrks_META_0 = new MCReportMeta("inst_rmrks", "", "", "", true);
	static public final MCReportMeta sum_ship_wt_META_0 = new MCReportMeta("sum_ship_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_ship_wt_META_0 = new MCReportMeta("s_sum_ship_wt", "", "", "", true);
	static public final MCReportMeta sum_ship_dim_META_0 = new MCReportMeta("sum_ship_dim", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_ship_dim_META_0 = new MCReportMeta("s_sum_ship_dim", "", "", "", true);
	static public final MCReportMeta dlv_slip_num_META_0 = new MCReportMeta("dlv_slip_num", "COMMA", "", "", true);
	static public final MCReportMeta s_dlv_slip_num_META_0 = new MCReportMeta("s_dlv_slip_num", "", "", "", true);

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
	static public final MCReportMeta quality_typ_META_1 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta quality_typ_nm_META_1 = new MCReportMeta("quality_typ_nm", "", "", "", true);
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
	static public final MCReportMeta inst_d_rmrks_META_1 = new MCReportMeta("inst_d_rmrks", "", "", "", true);
	static public final MCReportMeta ship_loc_nm_META_1 = new MCReportMeta("ship_loc_nm", "", "", "", true);
	static public final MCReportMeta ship_loc_cd_META_1 = new MCReportMeta("ship_loc_cd", "", "", "", true);
	static public final MCReportMeta ship_str_ln_nm_META_1 = new MCReportMeta("ship_str_ln_nm", "", "", "", true);
	static public final MCReportMeta ship_str_ln_cd_META_1 = new MCReportMeta("ship_str_ln_cd", "", "", "", true);
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
	static public final MCReportMeta ent_unit_qty_META_1 = new MCReportMeta("ent_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_ent_unit_qty_META_1 = new MCReportMeta("s_ent_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_ent_qty_META_1 = new MCReportMeta("s_int_ent_qty", "", "", "", true);
	static public final MCReportMeta s_dec_ent_qty_META_1 = new MCReportMeta("s_dec_ent_qty", "", "", "", true);
	static public final MCReportMeta ent_unit_nm_META_1 = new MCReportMeta("ent_unit_nm", "", "", "", true);
	static public final MCReportMeta ent_unit_cd_META_1 = new MCReportMeta("ent_unit_cd", "", "", "", true);
	static public final MCReportMeta inst_base_unit_qty_META_1 = new MCReportMeta("inst_base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_inst_base_unit_qty_META_1 = new MCReportMeta("s_inst_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_inst_base_unit_qty_META_1 = new MCReportMeta("s_int_inst_base_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_inst_base_unit_qty_META_1 = new MCReportMeta("s_dec_inst_base_unit_qty", "", "", "", true);
	static public final MCReportMeta inst_base_unit_nm_META_1 = new MCReportMeta("inst_base_unit_nm", "", "", "", true);
	static public final MCReportMeta inst_base_unit_cd_META_1 = new MCReportMeta("inst_base_unit_cd", "", "", "", true);
	static public final MCReportMeta ship_wt_META_1 = new MCReportMeta("ship_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_ship_wt_META_1 = new MCReportMeta("s_ship_wt", "", "", "", true);
	static public final MCReportMeta s_int_ship_wt_META_1 = new MCReportMeta("s_int_ship_wt", "", "", "", true);
	static public final MCReportMeta s_dec_ship_wt_META_1 = new MCReportMeta("s_dec_ship_wt", "", "", "", true);
	static public final MCReportMeta ship_dim_META_1 = new MCReportMeta("ship_dim", "COMMA", "", "", true);
	static public final MCReportMeta s_ship_dim_META_1 = new MCReportMeta("s_ship_dim", "", "", "", true);
	static public final MCReportMeta s_int_ship_dim_META_1 = new MCReportMeta("s_int_ship_dim", "", "", "", true);
	static public final MCReportMeta s_dec_ship_dim_META_1 = new MCReportMeta("s_dec_ship_dim", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("ShipInstHdr",
			prnt_tm_META_0,
			ship_wk_nm_META_0,
			ship_wk_cd_META_0,
			ship_schd_tm_META_0,
			dlv_schd_tm_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0,
			ship_term_nm_META_0,
			ship_term_cd_META_0,
			ship_inst_dt_META_0,
			ship_inst_no_META_0,
			iv_no_lbl_META_0,
			iv_no_META_0,
			ship_to_id_nm_META_0,
			ship_to_id_alt_nm1_META_0,
			ship_to_id_alt_nm2_META_0,
			ship_to_id_alt_nm3_META_0,
			ship_to_id_alt_nm4_META_0,
			ship_to_id_cd_META_0,
			ship_to_zip_cd_META_0,
			ship_to_addr1_META_0,
			ship_to_addr2_META_0,
			ship_to_addr3_META_0,
			ship_to_addr4_META_0,
			ship_to_addr_META_0,
			ship_to_tel_META_0,
			ship_to_fax_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			inst_rmrks_META_0,
			sum_ship_wt_META_0,
			s_sum_ship_wt_META_0,
			sum_ship_dim_META_0,
			s_sum_ship_dim_META_0,
			dlv_slip_num_META_0,
			s_dlv_slip_num_META_0
		);
		reportMetaMap.add("ShipInstDtl",
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
			quality_typ_META_1,
			quality_typ_nm_META_1,
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
			inst_d_rmrks_META_1,
			ship_loc_nm_META_1,
			ship_loc_cd_META_1,
			ship_str_ln_nm_META_1,
			ship_str_ln_cd_META_1,
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
			ent_unit_qty_META_1,
			s_ent_unit_qty_META_1,
			s_int_ent_qty_META_1,
			s_dec_ent_qty_META_1,
			ent_unit_nm_META_1,
			ent_unit_cd_META_1,
			inst_base_unit_qty_META_1,
			s_inst_base_unit_qty_META_1,
			s_int_inst_base_unit_qty_META_1,
			s_dec_inst_base_unit_qty_META_1,
			inst_base_unit_nm_META_1,
			inst_base_unit_cd_META_1,
			ship_wt_META_1,
			s_ship_wt_META_1,
			s_int_ship_wt_META_1,
			s_dec_ship_wt_META_1,
			ship_dim_META_1,
			s_ship_dim_META_1,
			s_int_ship_dim_META_1,
			s_dec_ship_dim_META_1,
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
	protected MSBER_ShipInst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

