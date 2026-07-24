package mcframe.commonMSBC.MSBCR1010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBCR_MfgInst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBCR1010";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass MFGINSTHDRR_RC = new MCReportClass("MfgInstHdr", mcframe.commonMSBC.MSBCR1010.MfgInstHdrR.class);
	static public final MCReportClass HDRMFGINSTYLDL_RC = new MCReportClass("HdrMfgInstYld", mcframe.commonMSBC.MSBCR1010.HdrMfgInstYldR.class, MCList.class);
	static public final MCReportClass MFGINSTYLDL_RC = new MCReportClass("MfgInstYld", mcframe.commonMSBC.MSBCR1010.MfgInstYldR.class, MCList.class);
	static public final MCReportClass HDRMFGINSTINPTL_RC = new MCReportClass("HdrMfgInstInpt", mcframe.commonMSBC.MSBCR1010.HdrMfgInstInptR.class, MCList.class);
	static public final MCReportClass MFGINSTINPTL_RC = new MCReportClass("MfgInstInpt", mcframe.commonMSBC.MSBCR1010.MfgInstInptR.class, MCList.class);
	static public final MCReportClass MFGINSTFTRR_RC = new MCReportClass("MfgInstFtr", mcframe.commonMSBC.MSBCR1010.MfgInstFtrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		MFGINSTHDRR_RC,
		HDRMFGINSTYLDL_RC,
		MFGINSTYLDL_RC,
		HDRMFGINSTINPTL_RC,
		MFGINSTINPTL_RC,
		MFGINSTFTRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta form_name_META_0 = new MCReportMeta("form_name", "", "", "", true);
	static public final MCReportMeta mfg_inst_no_META_0 = new MCReportMeta("mfg_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_rev_META_0 = new MCReportMeta("mfg_inst_rev", "", "", "", true);
	static public final MCReportMeta oper_inst_no_META_0 = new MCReportMeta("oper_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_no_bd_META_0 = new MCReportMeta("mfg_inst_no_bd", "", "", "", true);
	static public final MCReportMeta oper_inst_no_bd_META_0 = new MCReportMeta("oper_inst_no_bd", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_nm_META_0 = new MCReportMeta("oper_nm", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta disp_seq_META_0 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta oper_loc_cd_META_0 = new MCReportMeta("oper_loc_cd", "", "", "", true);
	static public final MCReportMeta oper_loc_nm_META_0 = new MCReportMeta("oper_loc_nm", "", "", "", true);
	static public final MCReportMeta oper_str_ln_cd_META_0 = new MCReportMeta("oper_str_ln_cd", "", "", "", true);
	static public final MCReportMeta oper_str_ln_nm_META_0 = new MCReportMeta("oper_str_ln_nm", "", "", "", true);
	static public final MCReportMeta st_schd_dt_META_0 = new MCReportMeta("st_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta st_schd_hm_META_0 = new MCReportMeta("st_schd_hm", "HM", "", "", true);
	static public final MCReportMeta end_schd_dt_META_0 = new MCReportMeta("end_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta end_schd_hm_META_0 = new MCReportMeta("end_schd_hm", "HM", "", "", true);
	static public final MCReportMeta oper_num_META_0 = new MCReportMeta("oper_num", "COMMA", "", "", true);
	static public final MCReportMeta s_oper_num_META_0 = new MCReportMeta("s_oper_num", "", "", "", true);
	static public final MCReportMeta oper_unit_cd_META_0 = new MCReportMeta("oper_unit_cd", "", "", "", true);
	static public final MCReportMeta oper_unit_nm_META_0 = new MCReportMeta("oper_unit_nm", "", "", "", true);
	static public final MCReportMeta oper_inst_usr_cd_META_0 = new MCReportMeta("oper_inst_usr_cd", "", "", "", true);
	static public final MCReportMeta oper_inst_usr_nm_META_0 = new MCReportMeta("oper_inst_usr_nm", "", "", "", true);
	static public final MCReportMeta oper_yield_lbl_META_0 = new MCReportMeta("oper_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_lower_yield_lbl_META_0 = new MCReportMeta("oper_lower_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_lower_yield_META_0 = new MCReportMeta("oper_lower_yield", "COMMA", "", "", true);
	static public final MCReportMeta oper_std_yield_lbl_META_0 = new MCReportMeta("oper_std_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_std_yield_META_0 = new MCReportMeta("oper_std_yield", "COMMA", "", "", true);
	static public final MCReportMeta oper_upper_yield_lbl_META_0 = new MCReportMeta("oper_upper_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_upper_yield_META_0 = new MCReportMeta("oper_upper_yield", "COMMA", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta mfg_str_ln_cd_META_0 = new MCReportMeta("mfg_str_ln_cd", "", "", "", true);
	static public final MCReportMeta mfg_str_ln_nm_META_0 = new MCReportMeta("mfg_str_ln_nm", "", "", "", true);
	static public final MCReportMeta inst_dt_META_0 = new MCReportMeta("inst_dt", "YMD", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_0 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_0 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_0 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_0 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_0 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_0 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta sno1_view_META_0 = new MCReportMeta("sno1_view", "", "", "", true);
	static public final MCReportMeta sno2_view_META_0 = new MCReportMeta("sno2_view", "", "", "", true);
	static public final MCReportMeta sno3_view_META_0 = new MCReportMeta("sno3_view", "", "", "", true);
	static public final MCReportMeta sno4_view_META_0 = new MCReportMeta("sno4_view", "", "", "", true);
	static public final MCReportMeta sno1_data_META_0 = new MCReportMeta("sno1_data", "", "", "", true);
	static public final MCReportMeta sno2_data_META_0 = new MCReportMeta("sno2_data", "", "", "", true);
	static public final MCReportMeta sno3_data_META_0 = new MCReportMeta("sno3_data", "", "", "", true);
	static public final MCReportMeta sno4_data_META_0 = new MCReportMeta("sno4_data", "", "", "", true);
	static public final MCReportMeta itm_yield_lbl_META_0 = new MCReportMeta("itm_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_lower_yield_lbl_META_0 = new MCReportMeta("itm_lower_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_lower_yield_META_0 = new MCReportMeta("itm_lower_yield", "COMMA", "", "", true);
	static public final MCReportMeta itm_std_yield_lbl_META_0 = new MCReportMeta("itm_std_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_std_yield_META_0 = new MCReportMeta("itm_std_yield", "COMMA", "", "", true);
	static public final MCReportMeta itm_upper_yield_lbl_META_0 = new MCReportMeta("itm_upper_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_upper_yield_META_0 = new MCReportMeta("itm_upper_yield", "COMMA", "", "", true);
	static public final MCReportMeta disp_pd_META_0 = new MCReportMeta("disp_pd", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta oper_ptn_META_0 = new MCReportMeta("oper_ptn", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_inst_qty_META_0 = new MCReportMeta("base_unit_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_inst_qty_META_0 = new MCReportMeta("s_base_unit_inst_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta prod_st_dt_META_0 = new MCReportMeta("prod_st_dt", "YMD", "", "", true);
	static public final MCReportMeta prod_st_hm_META_0 = new MCReportMeta("prod_st_hm", "HM", "", "", true);
	static public final MCReportMeta prod_end_dt_META_0 = new MCReportMeta("prod_end_dt", "YMD", "", "", true);
	static public final MCReportMeta prod_end_hm_META_0 = new MCReportMeta("prod_end_hm", "HM", "", "", true);
	static public final MCReportMeta itm_ord_no_META_0 = new MCReportMeta("itm_ord_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_sub_char1_META_0 = new MCReportMeta("mfg_inst_sub_char1", "", "", "", true);
	static public final MCReportMeta mfg_inst_sub_char2_META_0 = new MCReportMeta("mfg_inst_sub_char2", "", "", "", true);
	static public final MCReportMeta mfg_inst_sub_char3_META_0 = new MCReportMeta("mfg_inst_sub_char3", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char1_META_0 = new MCReportMeta("oper_inst_sub_char1", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char2_META_0 = new MCReportMeta("oper_inst_sub_char2", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char3_META_0 = new MCReportMeta("oper_inst_sub_char3", "", "", "", true);

	static public final MCReportMeta print_yld_META_1 = new MCReportMeta("print_yld", "", "", "", true);

	static public final MCReportMeta schd_yield_dt_META_2 = new MCReportMeta("schd_yield_dt", "YMD", "", "", true);
	static public final MCReportMeta schd_yield_hm_META_2 = new MCReportMeta("schd_yield_hm", "HM", "", "", true);
	static public final MCReportMeta trd_unit_yield_qty_META_2 = new MCReportMeta("trd_unit_yield_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_yield_qty_META_2 = new MCReportMeta("s_int_trd_unit_yield_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_yield_qty_META_2 = new MCReportMeta("s_dec_trd_unit_yield_qty", "", "", "", true);
	static public final MCReportMeta yield_unit_cd_META_2 = new MCReportMeta("yield_unit_cd", "", "", "", true);
	static public final MCReportMeta yield_unit_nm_META_2 = new MCReportMeta("yield_unit_nm", "", "", "", true);
	static public final MCReportMeta strg_loc_cd_META_2 = new MCReportMeta("strg_loc_cd", "", "", "", true);
	static public final MCReportMeta strg_loc_nm_META_2 = new MCReportMeta("strg_loc_nm", "", "", "", true);
	static public final MCReportMeta strg_str_ln_cd_META_2 = new MCReportMeta("strg_str_ln_cd", "", "", "", true);
	static public final MCReportMeta strg_str_ln_nm_META_2 = new MCReportMeta("strg_str_ln_nm", "", "", "", true);
	static public final MCReportMeta yield_schd_rpt_rmrks_META_2 = new MCReportMeta("yield_schd_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta yield_schd_disp_seq_META_2 = new MCReportMeta("yield_schd_disp_seq", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char1_META_2 = new MCReportMeta("yield_schd_sub_char1", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char2_META_2 = new MCReportMeta("yield_schd_sub_char2", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char3_META_2 = new MCReportMeta("yield_schd_sub_char3", "", "", "", true);

	static public final MCReportMeta print_inpt_META_3 = new MCReportMeta("print_inpt", "", "", "", true);

	static public final MCReportMeta s_inpt_itm_cd_META_4 = new MCReportMeta("s_inpt_itm_cd", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub1_view_META_4 = new MCReportMeta("s_inpt_itm_sub1_view", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub2_view_META_4 = new MCReportMeta("s_inpt_itm_sub2_view", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub3_view_META_4 = new MCReportMeta("s_inpt_itm_sub3_view", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub1_data_META_4 = new MCReportMeta("s_inpt_itm_sub1_data", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub2_data_META_4 = new MCReportMeta("s_inpt_itm_sub2_data", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_sub3_data_META_4 = new MCReportMeta("s_inpt_itm_sub3_data", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_nm_META_4 = new MCReportMeta("s_inpt_itm_nm", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_alt_nm1_META_4 = new MCReportMeta("s_inpt_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_alt_nm2_META_4 = new MCReportMeta("s_inpt_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_alt_nm3_META_4 = new MCReportMeta("s_inpt_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta s_inpt_itm_alt_nm4_META_4 = new MCReportMeta("s_inpt_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta alt_grp_cd_META_4 = new MCReportMeta("alt_grp_cd", "", "", "", true);
	static public final MCReportMeta alt_grp_nm_META_4 = new MCReportMeta("alt_grp_nm", "", "", "", true);
	static public final MCReportMeta inpt_sno1_view_META_4 = new MCReportMeta("inpt_sno1_view", "", "", "", true);
	static public final MCReportMeta inpt_sno2_view_META_4 = new MCReportMeta("inpt_sno2_view", "", "", "", true);
	static public final MCReportMeta inpt_sno3_view_META_4 = new MCReportMeta("inpt_sno3_view", "", "", "", true);
	static public final MCReportMeta inpt_sno4_view_META_4 = new MCReportMeta("inpt_sno4_view", "", "", "", true);
	static public final MCReportMeta inpt_sno1_data_META_4 = new MCReportMeta("inpt_sno1_data", "", "", "", true);
	static public final MCReportMeta inpt_sno2_data_META_4 = new MCReportMeta("inpt_sno2_data", "", "", "", true);
	static public final MCReportMeta inpt_sno3_data_META_4 = new MCReportMeta("inpt_sno3_data", "", "", "", true);
	static public final MCReportMeta inpt_sno4_data_META_4 = new MCReportMeta("inpt_sno4_data", "", "", "", true);
	static public final MCReportMeta inpt_lot_no_view_META_4 = new MCReportMeta("inpt_lot_no_view", "", "", "", true);
	static public final MCReportMeta inpt_sublot_no_view_META_4 = new MCReportMeta("inpt_sublot_no_view", "", "", "", true);
	static public final MCReportMeta inpt_lot_no_data_META_4 = new MCReportMeta("inpt_lot_no_data", "", "", "", true);
	static public final MCReportMeta inpt_sublot_no_data_META_4 = new MCReportMeta("inpt_sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_qty_META_4 = new MCReportMeta("base_unit_inpt_qty", "COMMA", "", "", true);
	static public final MCReportMeta base_unit_rqmt_qty_META_4 = new MCReportMeta("base_unit_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("base_unit_fxd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta left_qty_inpt_META_4 = new MCReportMeta("left_qty_inpt", "", "", "", true);
	static public final MCReportMeta cont_inpt_qty_META_4 = new MCReportMeta("cont_inpt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_qty_inpt_META_4 = new MCReportMeta("s_int_cont_qty_inpt", "", "", "", true);
	static public final MCReportMeta s_dec_cont_qty_inpt_META_4 = new MCReportMeta("s_dec_cont_qty_inpt", "", "", "", true);
	static public final MCReportMeta right_qty_inpt_META_4 = new MCReportMeta("right_qty_inpt", "", "", "", true);
	static public final MCReportMeta left_qty_rqmt_META_4 = new MCReportMeta("left_qty_rqmt", "", "", "", true);
	static public final MCReportMeta cont_rqmt_qty_META_4 = new MCReportMeta("cont_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_qty_rqmt_META_4 = new MCReportMeta("s_int_cont_qty_rqmt", "", "", "", true);
	static public final MCReportMeta s_dec_cont_qty_rqmt_META_4 = new MCReportMeta("s_dec_cont_qty_rqmt", "", "", "", true);
	static public final MCReportMeta right_qty_rqmt_META_4 = new MCReportMeta("right_qty_rqmt", "", "", "", true);
	static public final MCReportMeta left_qty_fxd_rqmt_META_4 = new MCReportMeta("left_qty_fxd_rqmt", "", "", "", true);
	static public final MCReportMeta cont_fxd_rqmt_qty_META_4 = new MCReportMeta("cont_fxd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_qty_fxd_rqmt_META_4 = new MCReportMeta("s_int_cont_qty_fxd_rqmt", "", "", "", true);
	static public final MCReportMeta s_dec_cont_qty_fxd_rqmt_META_4 = new MCReportMeta("s_dec_cont_qty_fxd_rqmt", "", "", "", true);
	static public final MCReportMeta right_qty_fxd_rqmt_META_4 = new MCReportMeta("right_qty_fxd_rqmt", "", "", "", true);
	static public final MCReportMeta d_base_unit_cd_META_4 = new MCReportMeta("d_base_unit_cd", "", "", "", true);
	static public final MCReportMeta d_base_unit_nm_META_4 = new MCReportMeta("d_base_unit_nm", "", "", "", true);
	static public final MCReportMeta cont_fctr_unit_cd_META_4 = new MCReportMeta("cont_fctr_unit_cd", "", "", "", true);
	static public final MCReportMeta left_nm_META_4 = new MCReportMeta("left_nm", "", "", "", true);
	static public final MCReportMeta cont_fctr_unit_nm_META_4 = new MCReportMeta("cont_fctr_unit_nm", "", "", "", true);
	static public final MCReportMeta right_nm_META_4 = new MCReportMeta("right_nm", "", "", "", true);
	static public final MCReportMeta inpt_inst_rmrks_META_4 = new MCReportMeta("inpt_inst_rmrks", "", "", "", true);
	static public final MCReportMeta inpt_inst_dt_META_4 = new MCReportMeta("inpt_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta inpt_inst_hm_META_4 = new MCReportMeta("inpt_inst_hm", "HM", "", "", true);
	static public final MCReportMeta inpt_ver_no_lbl_META_4 = new MCReportMeta("inpt_ver_no_lbl", "", "", "", true);
	static public final MCReportMeta inpt_ver_no_META_4 = new MCReportMeta("inpt_ver_no", "", "", "", true);
	static public final MCReportMeta alloc_flg_META_4 = new MCReportMeta("alloc_flg", "", "", "", true);
	static public final MCReportMeta s_alloc_META_4 = new MCReportMeta("s_alloc", "", "", "", true);
	static public final MCReportMeta inpt_schd_disp_seq_META_4 = new MCReportMeta("inpt_schd_disp_seq", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char1_META_4 = new MCReportMeta("inpt_schd_sub_char1", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char2_META_4 = new MCReportMeta("inpt_schd_sub_char2", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char3_META_4 = new MCReportMeta("inpt_schd_sub_char3", "", "", "", true);

	static public final MCReportMeta oper_inst_rpt_rmrks_lbl_META_5 = new MCReportMeta("oper_inst_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta oper_inst_rpt_rmrks_META_5 = new MCReportMeta("oper_inst_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta mfg_inst_rpt_rmrks_lbl_META_5 = new MCReportMeta("mfg_inst_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta mfg_inst_rpt_rmrks_META_5 = new MCReportMeta("mfg_inst_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta aprv_dt_lbl_META_5 = new MCReportMeta("aprv_dt_lbl", "", "", "", true);
	static public final MCReportMeta aprv_dt_META_5 = new MCReportMeta("aprv_dt", "YMD", "", "", true);
	static public final MCReportMeta aprv_dpt_cd_META_5 = new MCReportMeta("aprv_dpt_cd", "", "", "", true);
	static public final MCReportMeta aprv_dpt_nm_lbl_META_5 = new MCReportMeta("aprv_dpt_nm_lbl", "", "", "", true);
	static public final MCReportMeta aprv_dpt_nm_META_5 = new MCReportMeta("aprv_dpt_nm", "", "", "", true);
	static public final MCReportMeta aprv_usr_cd_META_5 = new MCReportMeta("aprv_usr_cd", "", "", "", true);
	static public final MCReportMeta aprv_usr_nm_lbl_META_5 = new MCReportMeta("aprv_usr_nm_lbl", "", "", "", true);
	static public final MCReportMeta aprv_usr_nm_META_5 = new MCReportMeta("aprv_usr_nm", "", "", "", true);
	static public final MCReportMeta aprv_rsn_lbl_META_5 = new MCReportMeta("aprv_rsn_lbl", "", "", "", true);
	static public final MCReportMeta aprv_rsn_META_5 = new MCReportMeta("aprv_rsn", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("MfgInstHdr",
			form_name_META_0,
			mfg_inst_no_META_0,
			mfg_inst_rev_META_0,
			oper_inst_no_META_0,
			mfg_inst_no_bd_META_0,
			oper_inst_no_bd_META_0,
			prnt_tm_META_0,
			oper_cd_META_0,
			oper_nm_META_0,
			oper_seq_META_0,
			disp_seq_META_0,
			oper_loc_cd_META_0,
			oper_loc_nm_META_0,
			oper_str_ln_cd_META_0,
			oper_str_ln_nm_META_0,
			st_schd_dt_META_0,
			st_schd_hm_META_0,
			end_schd_dt_META_0,
			end_schd_hm_META_0,
			oper_num_META_0,
			s_oper_num_META_0,
			oper_unit_cd_META_0,
			oper_unit_nm_META_0,
			oper_inst_usr_cd_META_0,
			oper_inst_usr_nm_META_0,
			oper_yield_lbl_META_0,
			oper_lower_yield_lbl_META_0,
			oper_lower_yield_META_0,
			oper_std_yield_lbl_META_0,
			oper_std_yield_META_0,
			oper_upper_yield_lbl_META_0,
			oper_upper_yield_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			mfg_str_ln_cd_META_0,
			mfg_str_ln_nm_META_0,
			inst_dt_META_0,
			itm_cd_META_0,
			itm_sub1_view_META_0,
			itm_sub2_view_META_0,
			itm_sub3_view_META_0,
			itm_sub1_data_META_0,
			itm_sub2_data_META_0,
			itm_sub3_data_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			sno1_view_META_0,
			sno2_view_META_0,
			sno3_view_META_0,
			sno4_view_META_0,
			sno1_data_META_0,
			sno2_data_META_0,
			sno3_data_META_0,
			sno4_data_META_0,
			itm_yield_lbl_META_0,
			itm_lower_yield_lbl_META_0,
			itm_lower_yield_META_0,
			itm_std_yield_lbl_META_0,
			itm_std_yield_META_0,
			itm_upper_yield_lbl_META_0,
			itm_upper_yield_META_0,
			disp_pd_META_0,
			bom_ptn_META_0,
			oper_ptn_META_0,
			lot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_view_META_0,
			sublot_no_data_META_0,
			base_unit_inst_qty_META_0,
			s_base_unit_inst_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			prod_st_dt_META_0,
			prod_st_hm_META_0,
			prod_end_dt_META_0,
			prod_end_hm_META_0,
			itm_ord_no_META_0,
			mfg_inst_sub_char1_META_0,
			mfg_inst_sub_char2_META_0,
			mfg_inst_sub_char3_META_0,
			oper_inst_sub_char1_META_0,
			oper_inst_sub_char2_META_0,
			oper_inst_sub_char3_META_0
		);
		reportMetaMap.add("HdrMfgInstYld",
			print_yld_META_1
		);
		reportMetaMap.add("MfgInstYld",
			schd_yield_dt_META_2,
			schd_yield_hm_META_2,
			trd_unit_yield_qty_META_2,
			s_int_trd_unit_yield_qty_META_2,
			s_dec_trd_unit_yield_qty_META_2,
			yield_unit_cd_META_2,
			yield_unit_nm_META_2,
			strg_loc_cd_META_2,
			strg_loc_nm_META_2,
			strg_str_ln_cd_META_2,
			strg_str_ln_nm_META_2,
			yield_schd_rpt_rmrks_META_2,
			yield_schd_disp_seq_META_2,
			yield_schd_sub_char1_META_2,
			yield_schd_sub_char2_META_2,
			yield_schd_sub_char3_META_2
		);
		reportMetaMap.add("HdrMfgInstInpt",
			print_inpt_META_3
		);
		reportMetaMap.add("MfgInstInpt",
			s_inpt_itm_cd_META_4,
			s_inpt_itm_sub1_view_META_4,
			s_inpt_itm_sub2_view_META_4,
			s_inpt_itm_sub3_view_META_4,
			s_inpt_itm_sub1_data_META_4,
			s_inpt_itm_sub2_data_META_4,
			s_inpt_itm_sub3_data_META_4,
			s_inpt_itm_nm_META_4,
			s_inpt_itm_alt_nm1_META_4,
			s_inpt_itm_alt_nm2_META_4,
			s_inpt_itm_alt_nm3_META_4,
			s_inpt_itm_alt_nm4_META_4,
			alt_grp_cd_META_4,
			alt_grp_nm_META_4,
			inpt_sno1_view_META_4,
			inpt_sno2_view_META_4,
			inpt_sno3_view_META_4,
			inpt_sno4_view_META_4,
			inpt_sno1_data_META_4,
			inpt_sno2_data_META_4,
			inpt_sno3_data_META_4,
			inpt_sno4_data_META_4,
			inpt_lot_no_view_META_4,
			inpt_sublot_no_view_META_4,
			inpt_lot_no_data_META_4,
			inpt_sublot_no_data_META_4,
			base_unit_inpt_qty_META_4,
			base_unit_rqmt_qty_META_4,
			base_unit_fxd_rqmt_qty_META_4,
			s_int_base_unit_inpt_qty_META_4,
			s_dec_base_unit_inpt_qty_META_4,
			s_int_base_unit_rqmt_qty_META_4,
			s_dec_base_unit_rqmt_qty_META_4,
			s_int_base_unit_fxd_rqmt_qty_META_4,
			s_dec_base_unit_fxd_rqmt_qty_META_4,
			left_qty_inpt_META_4,
			cont_inpt_qty_META_4,
			s_int_cont_qty_inpt_META_4,
			s_dec_cont_qty_inpt_META_4,
			right_qty_inpt_META_4,
			left_qty_rqmt_META_4,
			cont_rqmt_qty_META_4,
			s_int_cont_qty_rqmt_META_4,
			s_dec_cont_qty_rqmt_META_4,
			right_qty_rqmt_META_4,
			left_qty_fxd_rqmt_META_4,
			cont_fxd_rqmt_qty_META_4,
			s_int_cont_qty_fxd_rqmt_META_4,
			s_dec_cont_qty_fxd_rqmt_META_4,
			right_qty_fxd_rqmt_META_4,
			d_base_unit_cd_META_4,
			d_base_unit_nm_META_4,
			cont_fctr_unit_cd_META_4,
			left_nm_META_4,
			cont_fctr_unit_nm_META_4,
			right_nm_META_4,
			inpt_inst_rmrks_META_4,
			inpt_inst_dt_META_4,
			inpt_inst_hm_META_4,
			inpt_ver_no_lbl_META_4,
			inpt_ver_no_META_4,
			alloc_flg_META_4,
			s_alloc_META_4,
			inpt_schd_disp_seq_META_4,
			inpt_schd_sub_char1_META_4,
			inpt_schd_sub_char2_META_4,
			inpt_schd_sub_char3_META_4
		);
		reportMetaMap.add("MfgInstFtr",
			oper_inst_rpt_rmrks_lbl_META_5,
			oper_inst_rpt_rmrks_META_5,
			mfg_inst_rpt_rmrks_lbl_META_5,
			mfg_inst_rpt_rmrks_META_5,
			aprv_dt_lbl_META_5,
			aprv_dt_META_5,
			aprv_dpt_cd_META_5,
			aprv_dpt_nm_lbl_META_5,
			aprv_dpt_nm_META_5,
			aprv_usr_cd_META_5,
			aprv_usr_nm_lbl_META_5,
			aprv_usr_nm_META_5,
			aprv_rsn_lbl_META_5,
			aprv_rsn_META_5
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBCR_MfgInst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

