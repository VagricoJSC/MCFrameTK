package mcframe.commonMSBE.MSBER0130;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_XfrInst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0130";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass XFRINSTHDRR_RC = new MCReportClass("XfrInstHdr", mcframe.commonMSBE.MSBER0130.XfrInstHdrR.class);
	static public final MCReportClass XFRINSTDTLL_RC = new MCReportClass("XfrInstDtl", mcframe.commonMSBE.MSBER0130.XfrInstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		XFRINSTHDRR_RC,
		XFRINSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta xfr_inst_no_META_0 = new MCReportMeta("xfr_inst_no", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta xfr_inst_dt_META_0 = new MCReportMeta("xfr_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta gr_loc_cd_META_0 = new MCReportMeta("gr_loc_cd", "", "", "", true);
	static public final MCReportMeta gr_loc_nm_META_0 = new MCReportMeta("gr_loc_nm", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta tel_META_0 = new MCReportMeta("tel", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta addr_META_0 = new MCReportMeta("addr", "", "", "", true);
	static public final MCReportMeta cntry_nm_META_0 = new MCReportMeta("cntry_nm", "", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);
	static public final MCReportMeta inst_tel_META_0 = new MCReportMeta("inst_tel", "", "", "", true);
	static public final MCReportMeta xfr_schd_dt_META_0 = new MCReportMeta("xfr_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta inst_rmrks_META_0 = new MCReportMeta("inst_rmrks", "", "", "", true);

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
	static public final MCReportMeta gi_loc_nm_META_1 = new MCReportMeta("gi_loc_nm", "", "", "", true);
	static public final MCReportMeta gi_str_ln_nm_META_1 = new MCReportMeta("gi_str_ln_nm", "", "", "", true);
	static public final MCReportMeta gr_str_ln_nm_META_1 = new MCReportMeta("gr_str_ln_nm", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_1 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_1 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_1 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_1 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_1 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta sno1_lbl_META_1 = new MCReportMeta("sno1_lbl", "", "", "", true);
	static public final MCReportMeta sno2_lbl_META_1 = new MCReportMeta("sno2_lbl", "", "", "", true);
	static public final MCReportMeta sno3_lbl_META_1 = new MCReportMeta("sno3_lbl", "", "", "", true);
	static public final MCReportMeta sno4_lbl_META_1 = new MCReportMeta("sno4_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_1 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta sno1_view_META_1 = new MCReportMeta("sno1_view", "", "", "", true);
	static public final MCReportMeta sno1_data_META_1 = new MCReportMeta("sno1_data", "", "", "", true);
	static public final MCReportMeta sno2_view_META_1 = new MCReportMeta("sno2_view", "", "", "", true);
	static public final MCReportMeta sno2_data_META_1 = new MCReportMeta("sno2_data", "", "", "", true);
	static public final MCReportMeta sno3_view_META_1 = new MCReportMeta("sno3_view", "", "", "", true);
	static public final MCReportMeta sno3_data_META_1 = new MCReportMeta("sno3_data", "", "", "", true);
	static public final MCReportMeta sno4_view_META_1 = new MCReportMeta("sno4_view", "", "", "", true);
	static public final MCReportMeta sno4_data_META_1 = new MCReportMeta("sno4_data", "", "", "", true);
	static public final MCReportMeta quality_typ_META_1 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta quality_typ_nm_META_1 = new MCReportMeta("quality_typ_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_1 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_1 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_lbl_META_1 = new MCReportMeta("stk_insp_typ_lbl", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_META_1 = new MCReportMeta("stk_insp_typ", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_nm_META_1 = new MCReportMeta("stk_insp_typ_nm", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_1 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_id_typ_nm_META_1 = new MCReportMeta("stk_id_typ_nm", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_1 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_1 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm1_META_1 = new MCReportMeta("stk_bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm2_META_1 = new MCReportMeta("stk_bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm3_META_1 = new MCReportMeta("stk_bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta stk_bp_alt_nm4_META_1 = new MCReportMeta("stk_bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta inst_d_rmrks_META_1 = new MCReportMeta("inst_d_rmrks", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta sub_char1_META_1 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_1 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_1 = new MCReportMeta("sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("XfrInstHdr",
			xfr_inst_no_META_0,
			trd_nm_META_0,
			trd_cd_META_0,
			xfr_inst_dt_META_0,
			prnt_tm_META_0,
			gr_loc_cd_META_0,
			gr_loc_nm_META_0,
			zip_cd_META_0,
			tel_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			addr_META_0,
			cntry_nm_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0,
			inst_tel_META_0,
			xfr_schd_dt_META_0,
			inst_rmrks_META_0
		);
		reportMetaMap.add("XfrInstDtl",
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
			gi_loc_nm_META_1,
			gi_str_ln_nm_META_1,
			gr_str_ln_nm_META_1,
			lot_no_view_META_1,
			lot_no_data_META_1,
			sublot_no_view_META_1,
			sublot_no_data_META_1,
			ver_no_lbl_META_1,
			sno1_lbl_META_1,
			sno2_lbl_META_1,
			sno3_lbl_META_1,
			sno4_lbl_META_1,
			ver_no_META_1,
			sno1_view_META_1,
			sno1_data_META_1,
			sno2_view_META_1,
			sno2_data_META_1,
			sno3_view_META_1,
			sno3_data_META_1,
			sno4_view_META_1,
			sno4_data_META_1,
			quality_typ_META_1,
			quality_typ_nm_META_1,
			gd_cd_META_1,
			gd_nm_META_1,
			stk_insp_typ_lbl_META_1,
			stk_insp_typ_META_1,
			stk_insp_typ_nm_META_1,
			stk_id_typ_META_1,
			stk_id_typ_nm_META_1,
			stk_bp_cd_META_1,
			stk_bp_nm_META_1,
			stk_bp_alt_nm1_META_1,
			stk_bp_alt_nm2_META_1,
			stk_bp_alt_nm3_META_1,
			stk_bp_alt_nm4_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			inst_d_rmrks_META_1,
			disp_seq_META_1,
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
	protected MSBER_XfrInst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

