package mcframe.commonMSLA.MSLAR1310;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_InspInstSendPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR1310";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR1310.DtlR.class, MCList.class);

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
	static public final MCReportMeta insp_no_META_0 = new MCReportMeta("insp_no", "", "", "", true);
	static public final MCReportMeta insp_freq_META_0 = new MCReportMeta("insp_freq", "", "", "", true);
	static public final MCReportMeta insp_typ_META_0 = new MCReportMeta("insp_typ", "", "", "", true);
	static public final MCReportMeta insp_mtd_typ_META_0 = new MCReportMeta("insp_mtd_typ", "", "", "", true);
	static public final MCReportMeta insp_sts_typ_META_0 = new MCReportMeta("insp_sts_typ", "", "", "", true);
	static public final MCReportMeta insp_bind_typ_META_0 = new MCReportMeta("insp_bind_typ", "", "", "", true);
	static public final MCReportMeta col_schd_flg_META_0 = new MCReportMeta("col_schd_flg", "", "", "", true);
	static public final MCReportMeta insp_lst_prnt_flg_META_0 = new MCReportMeta("insp_lst_prnt_flg", "", "", "", true);
	static public final MCReportMeta insp_lst_prnt_dt_META_0 = new MCReportMeta("insp_lst_prnt_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_lst_prnt_hm_META_0 = new MCReportMeta("insp_lst_prnt_hm", "HM", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta arr_dt_META_0 = new MCReportMeta("arr_dt", "YMD", "", "", true);
	static public final MCReportMeta arr_hm_META_0 = new MCReportMeta("arr_hm", "HM", "", "", true);
	static public final MCReportMeta first_gr_dt_META_0 = new MCReportMeta("first_gr_dt", "YMD", "", "", true);
	static public final MCReportMeta vld_dt_META_0 = new MCReportMeta("vld_dt", "YMD", "", "", true);
	static public final MCReportMeta lmt_dt_META_0 = new MCReportMeta("lmt_dt", "YMD", "", "", true);
	static public final MCReportMeta lmt_dt_frm_META_0 = new MCReportMeta("lmt_dt_frm", "YMD", "", "", true);
	static public final MCReportMeta po_no_META_0 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta sppl_cd_META_0 = new MCReportMeta("sppl_cd", "", "", "", true);
	static public final MCReportMeta sppl_nm_META_0 = new MCReportMeta("sppl_nm", "", "", "", true);
	static public final MCReportMeta maker_cd_META_0 = new MCReportMeta("maker_cd", "", "", "", true);
	static public final MCReportMeta maker_nm_META_0 = new MCReportMeta("maker_nm", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta to_site_cd_META_0 = new MCReportMeta("to_site_cd", "", "", "", true);
	static public final MCReportMeta to_site_nm_META_0 = new MCReportMeta("to_site_nm", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_0 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta pack_unit_qty_META_0 = new MCReportMeta("pack_unit_qty", "", "", "", true);
	static public final MCReportMeta pack_unit_cd_META_0 = new MCReportMeta("pack_unit_cd", "", "", "", true);
	static public final MCReportMeta pack_unit_nm_META_0 = new MCReportMeta("pack_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta insp_lst_no_META_0 = new MCReportMeta("insp_lst_no", "", "", "", true);
	static public final MCReportMeta inst_dt_META_0 = new MCReportMeta("inst_dt", "YMD", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);
	static public final MCReportMeta src_dpt_cd_META_0 = new MCReportMeta("src_dpt_cd", "", "", "", true);
	static public final MCReportMeta src_dpt_nm_META_0 = new MCReportMeta("src_dpt_nm", "", "", "", true);
	static public final MCReportMeta src_usr_cd_META_0 = new MCReportMeta("src_usr_cd", "", "", "", true);
	static public final MCReportMeta src_usr_nm_META_0 = new MCReportMeta("src_usr_nm", "", "", "", true);
	static public final MCReportMeta master_dt_META_0 = new MCReportMeta("master_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_st_schd_dt_META_0 = new MCReportMeta("mfg_st_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_st_schd_hm_META_0 = new MCReportMeta("mfg_st_schd_hm", "HM", "", "", true);
	static public final MCReportMeta mfg_end_schd_dt_META_0 = new MCReportMeta("mfg_end_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_end_schd_hm_META_0 = new MCReportMeta("mfg_end_schd_hm", "HM", "", "", true);
	static public final MCReportMeta insp_st_dt_META_0 = new MCReportMeta("insp_st_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_st_hm_META_0 = new MCReportMeta("insp_st_hm", "HM", "", "", true);
	static public final MCReportMeta insp_end_dt_META_0 = new MCReportMeta("insp_end_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_end_hm_META_0 = new MCReportMeta("insp_end_hm", "HM", "", "", true);
	static public final MCReportMeta insp_ptn_cd_META_0 = new MCReportMeta("insp_ptn_cd", "", "", "", true);
	static public final MCReportMeta insp_ptn_nm_META_0 = new MCReportMeta("insp_ptn_nm", "", "", "", true);
	static public final MCReportMeta std_req_flg_META_0 = new MCReportMeta("std_req_flg", "", "", "", true);
	static public final MCReportMeta std_cnf_req_flg_META_0 = new MCReportMeta("std_cnf_req_flg", "", "", "", true);
	static public final MCReportMeta insp_std_no_META_0 = new MCReportMeta("insp_std_no", "", "", "", true);
	static public final MCReportMeta plnt_aprv_flg_META_0 = new MCReportMeta("plnt_aprv_flg", "", "", "", true);
	static public final MCReportMeta insp_rslt_prnt_flg_META_0 = new MCReportMeta("insp_rslt_prnt_flg", "", "", "", true);
	static public final MCReportMeta insp_rslt_prnt_dt_META_0 = new MCReportMeta("insp_rslt_prnt_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_rslt_prnt_hm_META_0 = new MCReportMeta("insp_rslt_prnt_hm", "HM", "", "", true);
	static public final MCReportMeta seq_META_0 = new MCReportMeta("seq", "", "", "", true);
	static public final MCReportMeta lmt_up_flg_META_0 = new MCReportMeta("lmt_up_flg", "", "", "", true);
	static public final MCReportMeta insp_aprv_flg_META_0 = new MCReportMeta("insp_aprv_flg", "", "", "", true);
	static public final MCReportMeta insp_aprv_sts_typ_META_0 = new MCReportMeta("insp_aprv_sts_typ", "", "", "", true);
	static public final MCReportMeta aprv_dt_META_0 = new MCReportMeta("aprv_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_aprv_role_cd_META_0 = new MCReportMeta("insp_aprv_role_cd", "", "", "", true);
	static public final MCReportMeta insp_aprv_role_nm_META_0 = new MCReportMeta("insp_aprv_role_nm", "", "", "", true);
	static public final MCReportMeta aprv_dpt_cd_META_0 = new MCReportMeta("aprv_dpt_cd", "", "", "", true);
	static public final MCReportMeta aprv_dpt_nm_META_0 = new MCReportMeta("aprv_dpt_nm", "", "", "", true);
	static public final MCReportMeta aprv_usr_cd_META_0 = new MCReportMeta("aprv_usr_cd", "", "", "", true);
	static public final MCReportMeta aprv_usr_nm_META_0 = new MCReportMeta("aprv_usr_nm", "", "", "", true);
	static public final MCReportMeta aprv_rsn_META_0 = new MCReportMeta("aprv_rsn", "", "", "", true);
	static public final MCReportMeta act_cont_fctr_META_0 = new MCReportMeta("act_cont_fctr", "", "", "", true);
	static public final MCReportMeta intr_rmrks_META_0 = new MCReportMeta("intr_rmrks", "", "", "", true);
	static public final MCReportMeta insp_schd_no_META_0 = new MCReportMeta("insp_schd_no", "", "", "", true);
	static public final MCReportMeta src_no1_META_0 = new MCReportMeta("src_no1", "", "", "", true);
	static public final MCReportMeta src_no2_META_0 = new MCReportMeta("src_no2", "", "", "", true);
	static public final MCReportMeta src_no3_META_0 = new MCReportMeta("src_no3", "", "", "", true);
	static public final MCReportMeta src_no4_META_0 = new MCReportMeta("src_no4", "", "", "", true);
	static public final MCReportMeta schd_loc_cd_META_0 = new MCReportMeta("schd_loc_cd", "", "", "", true);
	static public final MCReportMeta schd_loc_nm_META_0 = new MCReportMeta("schd_loc_nm", "", "", "", true);
	static public final MCReportMeta schd_str_ln_cd_META_0 = new MCReportMeta("schd_str_ln_cd", "", "", "", true);
	static public final MCReportMeta schd_str_ln_nm_META_0 = new MCReportMeta("schd_str_ln_nm", "", "", "", true);
	static public final MCReportMeta schd_stk_arrv_bp_cd_META_0 = new MCReportMeta("schd_stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta schd_stk_arrv_bp_nm_META_0 = new MCReportMeta("schd_stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta schd_sno1_META_0 = new MCReportMeta("schd_sno1", "", "", "", true);
	static public final MCReportMeta schd_sno2_META_0 = new MCReportMeta("schd_sno2", "", "", "", true);
	static public final MCReportMeta schd_sno3_META_0 = new MCReportMeta("schd_sno3", "", "", "", true);
	static public final MCReportMeta schd_sno4_META_0 = new MCReportMeta("schd_sno4", "", "", "", true);
	static public final MCReportMeta schd_gd_cd_META_0 = new MCReportMeta("schd_gd_cd", "", "", "", true);
	static public final MCReportMeta schd_gd_nm_META_0 = new MCReportMeta("schd_gd_nm", "", "", "", true);
	static public final MCReportMeta schd_quality_typ_META_0 = new MCReportMeta("schd_quality_typ", "", "", "", true);
	static public final MCReportMeta schd_stk_insp_typ_META_0 = new MCReportMeta("schd_stk_insp_typ", "", "", "", true);
	static public final MCReportMeta schd_stk_id_typ_META_0 = new MCReportMeta("schd_stk_id_typ", "", "", "", true);
	static public final MCReportMeta schd_stk_bp_cd_META_0 = new MCReportMeta("schd_stk_bp_cd", "", "", "", true);
	static public final MCReportMeta schd_stk_bp_nm_META_0 = new MCReportMeta("schd_stk_bp_nm", "", "", "", true);
	static public final MCReportMeta schd_pack_unit_qty_META_0 = new MCReportMeta("schd_pack_unit_qty", "", "", "", true);
	static public final MCReportMeta schd_pack_unit_cd_META_0 = new MCReportMeta("schd_pack_unit_cd", "", "", "", true);
	static public final MCReportMeta schd_pack_unit_nm_META_0 = new MCReportMeta("schd_pack_unit_nm", "", "", "", true);
	static public final MCReportMeta schd_base_unit_qty_META_0 = new MCReportMeta("schd_base_unit_qty", "", "", "", true);
	static public final MCReportMeta schd_base_unit_cd_META_0 = new MCReportMeta("schd_base_unit_cd", "", "", "", true);
	static public final MCReportMeta schd_base_unit_nm_META_0 = new MCReportMeta("schd_base_unit_nm", "", "", "", true);
	static public final MCReportMeta stk_loc_cd_META_0 = new MCReportMeta("stk_loc_cd", "", "", "", true);
	static public final MCReportMeta stk_loc_nm_META_0 = new MCReportMeta("stk_loc_nm", "", "", "", true);
	static public final MCReportMeta stk_str_ln_cd_META_0 = new MCReportMeta("stk_str_ln_cd", "", "", "", true);
	static public final MCReportMeta stk_str_ln_nm_META_0 = new MCReportMeta("stk_str_ln_nm", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_cd_META_0 = new MCReportMeta("stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_nm_META_0 = new MCReportMeta("stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_sno1_META_0 = new MCReportMeta("stk_sno1", "", "", "", true);
	static public final MCReportMeta stk_sno2_META_0 = new MCReportMeta("stk_sno2", "", "", "", true);
	static public final MCReportMeta stk_sno3_META_0 = new MCReportMeta("stk_sno3", "", "", "", true);
	static public final MCReportMeta stk_sno4_META_0 = new MCReportMeta("stk_sno4", "", "", "", true);
	static public final MCReportMeta stk_fix_no_typ_META_0 = new MCReportMeta("stk_fix_no_typ", "", "", "", true);
	static public final MCReportMeta stk_fix_no_META_0 = new MCReportMeta("stk_fix_no", "", "", "", true);
	static public final MCReportMeta stk_pack_unit_cd_META_0 = new MCReportMeta("stk_pack_unit_cd", "", "", "", true);
	static public final MCReportMeta stk_pack_unit_nm_META_0 = new MCReportMeta("stk_pack_unit_nm", "", "", "", true);
	static public final MCReportMeta stk_gd_cd_META_0 = new MCReportMeta("stk_gd_cd", "", "", "", true);
	static public final MCReportMeta stk_gd_nm_META_0 = new MCReportMeta("stk_gd_nm", "", "", "", true);
	static public final MCReportMeta stk_quality_typ_META_0 = new MCReportMeta("stk_quality_typ", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_META_0 = new MCReportMeta("stk_insp_typ", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_0 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_0 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_0 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta stk_pack_unit_qty_META_0 = new MCReportMeta("stk_pack_unit_qty", "", "", "", true);
	static public final MCReportMeta stk_base_unit_qty_META_0 = new MCReportMeta("stk_base_unit_qty", "", "", "", true);
	static public final MCReportMeta smpl_schd_qty_META_0 = new MCReportMeta("smpl_schd_qty", "", "", "", true);
	static public final MCReportMeta smpl_inst_qty_META_0 = new MCReportMeta("smpl_inst_qty", "", "", "", true);
	static public final MCReportMeta own_insp_no_META_0 = new MCReportMeta("own_insp_no", "", "", "", true);
	static public final MCReportMeta own_insp_schd_no_META_0 = new MCReportMeta("own_insp_schd_no", "", "", "", true);
	static public final MCReportMeta org_insp_schd_no_META_0 = new MCReportMeta("org_insp_schd_no", "", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta itm_ord_no_META_0 = new MCReportMeta("itm_ord_no", "", "", "", true);
	static public final MCReportMeta in_prmt_insp_flg_META_0 = new MCReportMeta("in_prmt_insp_flg", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta insp_lt_META_0 = new MCReportMeta("insp_lt", "", "", "", true);
	static public final MCReportMeta insp_offst_META_0 = new MCReportMeta("insp_offst", "", "", "", true);
	static public final MCReportMeta insp_cnt_rmrks_META_0 = new MCReportMeta("insp_cnt_rmrks", "", "", "", true);
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
			insp_no_META_0,
			insp_freq_META_0,
			insp_typ_META_0,
			insp_mtd_typ_META_0,
			insp_sts_typ_META_0,
			insp_bind_typ_META_0,
			col_schd_flg_META_0,
			insp_lst_prnt_flg_META_0,
			insp_lst_prnt_dt_META_0,
			insp_lst_prnt_hm_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			arr_dt_META_0,
			arr_hm_META_0,
			first_gr_dt_META_0,
			vld_dt_META_0,
			lmt_dt_META_0,
			lmt_dt_frm_META_0,
			po_no_META_0,
			sppl_cd_META_0,
			sppl_nm_META_0,
			maker_cd_META_0,
			maker_nm_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			to_site_cd_META_0,
			to_site_nm_META_0,
			bp_lot_no_META_0,
			pack_unit_qty_META_0,
			pack_unit_cd_META_0,
			pack_unit_nm_META_0,
			base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			insp_lst_no_META_0,
			inst_dt_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0,
			src_dpt_cd_META_0,
			src_dpt_nm_META_0,
			src_usr_cd_META_0,
			src_usr_nm_META_0,
			master_dt_META_0,
			mfg_st_schd_dt_META_0,
			mfg_st_schd_hm_META_0,
			mfg_end_schd_dt_META_0,
			mfg_end_schd_hm_META_0,
			insp_st_dt_META_0,
			insp_st_hm_META_0,
			insp_end_dt_META_0,
			insp_end_hm_META_0,
			insp_ptn_cd_META_0,
			insp_ptn_nm_META_0,
			std_req_flg_META_0,
			std_cnf_req_flg_META_0,
			insp_std_no_META_0,
			plnt_aprv_flg_META_0,
			insp_rslt_prnt_flg_META_0,
			insp_rslt_prnt_dt_META_0,
			insp_rslt_prnt_hm_META_0,
			seq_META_0,
			lmt_up_flg_META_0,
			insp_aprv_flg_META_0,
			insp_aprv_sts_typ_META_0,
			aprv_dt_META_0,
			insp_aprv_role_cd_META_0,
			insp_aprv_role_nm_META_0,
			aprv_dpt_cd_META_0,
			aprv_dpt_nm_META_0,
			aprv_usr_cd_META_0,
			aprv_usr_nm_META_0,
			aprv_rsn_META_0,
			act_cont_fctr_META_0,
			intr_rmrks_META_0,
			insp_schd_no_META_0,
			src_no1_META_0,
			src_no2_META_0,
			src_no3_META_0,
			src_no4_META_0,
			schd_loc_cd_META_0,
			schd_loc_nm_META_0,
			schd_str_ln_cd_META_0,
			schd_str_ln_nm_META_0,
			schd_stk_arrv_bp_cd_META_0,
			schd_stk_arrv_bp_nm_META_0,
			schd_sno1_META_0,
			schd_sno2_META_0,
			schd_sno3_META_0,
			schd_sno4_META_0,
			schd_gd_cd_META_0,
			schd_gd_nm_META_0,
			schd_quality_typ_META_0,
			schd_stk_insp_typ_META_0,
			schd_stk_id_typ_META_0,
			schd_stk_bp_cd_META_0,
			schd_stk_bp_nm_META_0,
			schd_pack_unit_qty_META_0,
			schd_pack_unit_cd_META_0,
			schd_pack_unit_nm_META_0,
			schd_base_unit_qty_META_0,
			schd_base_unit_cd_META_0,
			schd_base_unit_nm_META_0,
			stk_loc_cd_META_0,
			stk_loc_nm_META_0,
			stk_str_ln_cd_META_0,
			stk_str_ln_nm_META_0,
			stk_arrv_bp_cd_META_0,
			stk_arrv_bp_nm_META_0,
			stk_sno1_META_0,
			stk_sno2_META_0,
			stk_sno3_META_0,
			stk_sno4_META_0,
			stk_fix_no_typ_META_0,
			stk_fix_no_META_0,
			stk_pack_unit_cd_META_0,
			stk_pack_unit_nm_META_0,
			stk_gd_cd_META_0,
			stk_gd_nm_META_0,
			stk_quality_typ_META_0,
			stk_insp_typ_META_0,
			stk_id_typ_META_0,
			stk_bp_cd_META_0,
			stk_bp_nm_META_0,
			stk_pack_unit_qty_META_0,
			stk_base_unit_qty_META_0,
			smpl_schd_qty_META_0,
			smpl_inst_qty_META_0,
			own_insp_no_META_0,
			own_insp_schd_no_META_0,
			org_insp_schd_no_META_0,
			ac_dt_META_0,
			itm_ord_no_META_0,
			in_prmt_insp_flg_META_0,
			trd_cd_META_0,
			trd_nm_META_0,
			insp_lt_META_0,
			insp_offst_META_0,
			insp_cnt_rmrks_META_0,
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
	protected MSLAR_InspInstSendPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

