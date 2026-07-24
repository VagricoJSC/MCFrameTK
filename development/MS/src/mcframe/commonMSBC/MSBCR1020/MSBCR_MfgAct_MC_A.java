package mcframe.commonMSBC.MSBCR1020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBCR_MfgAct_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBCR1020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass MFGACTHDRR_RC = new MCReportClass("MfgActHdr", mcframe.commonMSBC.MSBCR1020.MfgActHdrR.class);
	static public final MCReportClass HDRMFGACTYLDL_RC = new MCReportClass("HdrMfgActYld", mcframe.commonMSBC.MSBCR1020.HdrMfgActYldR.class, MCList.class);
	static public final MCReportClass MFGACTYLDL_RC = new MCReportClass("MfgActYld", mcframe.commonMSBC.MSBCR1020.MfgActYldR.class, MCList.class);
	static public final MCReportClass HDRMFGACTINPTL_RC = new MCReportClass("HdrMfgActInpt", mcframe.commonMSBC.MSBCR1020.HdrMfgActInptR.class, MCList.class);
	static public final MCReportClass MFGACTINPTL_RC = new MCReportClass("MfgActInpt", mcframe.commonMSBC.MSBCR1020.MfgActInptR.class, MCList.class);
	static public final MCReportClass MFGACTFTRR_RC = new MCReportClass("MfgActFtr", mcframe.commonMSBC.MSBCR1020.MfgActFtrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		MFGACTHDRR_RC,
		HDRMFGACTYLDL_RC,
		MFGACTYLDL_RC,
		HDRMFGACTINPTL_RC,
		MFGACTINPTL_RC,
		MFGACTFTRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta mfg_inst_no_META_0 = new MCReportMeta("mfg_inst_no", "", "", "", true);
	static public final MCReportMeta div_seq_META_0 = new MCReportMeta("div_seq", "", "", "", true);
	static public final MCReportMeta oper_inst_no_META_0 = new MCReportMeta("oper_inst_no", "", "", "", true);
	static public final MCReportMeta mfg_act_no_META_0 = new MCReportMeta("mfg_act_no", "", "", "", true);
	static public final MCReportMeta oper_act_no_META_0 = new MCReportMeta("oper_act_no", "", "", "", true);
	static public final MCReportMeta form_name_META_0 = new MCReportMeta("form_name", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_nm_META_0 = new MCReportMeta("oper_nm", "", "", "", true);
	static public final MCReportMeta disp_seq_META_0 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta oper_loc_nm_META_0 = new MCReportMeta("oper_loc_nm", "", "", "", true);
	static public final MCReportMeta oper_str_ln_nm_META_0 = new MCReportMeta("oper_str_ln_nm", "", "", "", true);
	static public final MCReportMeta oper_st_act_dt_META_0 = new MCReportMeta("oper_st_act_dt", "YMD", "", "", true);
	static public final MCReportMeta oper_st_act_hm_META_0 = new MCReportMeta("oper_st_act_hm", "HM", "", "", true);
	static public final MCReportMeta oper_end_act_dt_META_0 = new MCReportMeta("oper_end_act_dt", "YMD", "", "", true);
	static public final MCReportMeta oper_end_act_hm_META_0 = new MCReportMeta("oper_end_act_hm", "HM", "", "", true);
	static public final MCReportMeta oper_num_META_0 = new MCReportMeta("oper_num", "COMMA", "", "", true);
	static public final MCReportMeta s_oper_num_META_0 = new MCReportMeta("s_oper_num", "", "", "", true);
	static public final MCReportMeta oper_unit_nm_META_0 = new MCReportMeta("oper_unit_nm", "", "", "", true);
	static public final MCReportMeta oper_mfg_num_META_0 = new MCReportMeta("oper_mfg_num", "COMMA", "", "", true);
	static public final MCReportMeta s_oper_mfg_num_META_0 = new MCReportMeta("s_oper_mfg_num", "", "", "", true);
	static public final MCReportMeta oper_unit_qty_META_0 = new MCReportMeta("oper_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_oper_unit_qty_META_0 = new MCReportMeta("s_oper_unit_qty", "", "", "", true);
	static public final MCReportMeta oper_usr_nm_META_0 = new MCReportMeta("oper_usr_nm", "", "", "", true);
	static public final MCReportMeta oper_yield_lbl_META_0 = new MCReportMeta("oper_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_act_yield_lbl_META_0 = new MCReportMeta("oper_act_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_act_yield_META_0 = new MCReportMeta("oper_act_yield", "COMMA", "", "", true);
	static public final MCReportMeta oper_lower_yield_lbl_META_0 = new MCReportMeta("oper_lower_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_lower_yield_META_0 = new MCReportMeta("oper_lower_yield", "COMMA", "", "", true);
	static public final MCReportMeta oper_std_yield_lbl_META_0 = new MCReportMeta("oper_std_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_std_yield_META_0 = new MCReportMeta("oper_std_yield", "COMMA", "", "", true);
	static public final MCReportMeta oper_upper_yield_lbl_META_0 = new MCReportMeta("oper_upper_yield_lbl", "", "", "", true);
	static public final MCReportMeta oper_upper_yield_META_0 = new MCReportMeta("oper_upper_yield", "COMMA", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
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
	static public final MCReportMeta ntfy_nm_META_0 = new MCReportMeta("ntfy_nm", "", "", "", true);
	static public final MCReportMeta itm_yield_lbl_META_0 = new MCReportMeta("itm_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_act_yield_lbl_META_0 = new MCReportMeta("itm_act_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_act_yield_META_0 = new MCReportMeta("itm_act_yield", "COMMA", "", "", true);
	static public final MCReportMeta itm_lower_yield_lbl_META_0 = new MCReportMeta("itm_lower_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_lower_yield_META_0 = new MCReportMeta("itm_lower_yield", "COMMA", "", "", true);
	static public final MCReportMeta itm_std_yield_lbl_META_0 = new MCReportMeta("itm_std_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_std_yield_META_0 = new MCReportMeta("itm_std_yield", "COMMA", "", "", true);
	static public final MCReportMeta itm_upper_yield_lbl_META_0 = new MCReportMeta("itm_upper_yield_lbl", "", "", "", true);
	static public final MCReportMeta itm_upper_yield_META_0 = new MCReportMeta("itm_upper_yield", "COMMA", "", "", true);
	static public final MCReportMeta disp_pd_META_0 = new MCReportMeta("disp_pd", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_inst_qty_META_0 = new MCReportMeta("base_unit_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_inst_qty_META_0 = new MCReportMeta("s_base_unit_inst_qty", "", "", "", true);
	static public final MCReportMeta base_unit_mfg_qty_META_0 = new MCReportMeta("base_unit_mfg_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_mfg_qty_META_0 = new MCReportMeta("s_base_unit_mfg_qty", "", "", "", true);
	static public final MCReportMeta base_unit_yield_qty_META_0 = new MCReportMeta("base_unit_yield_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_yield_qty_META_0 = new MCReportMeta("s_base_unit_yield_qty", "", "", "", true);
	static public final MCReportMeta base_unit_dfct_qty_META_0 = new MCReportMeta("base_unit_dfct_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_dfct_qty_META_0 = new MCReportMeta("s_base_unit_dfct_qty", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta st_act_dt_META_0 = new MCReportMeta("st_act_dt", "YMD", "", "", true);
	static public final MCReportMeta st_act_hm_META_0 = new MCReportMeta("st_act_hm", "HM", "", "", true);
	static public final MCReportMeta end_act_dt_META_0 = new MCReportMeta("end_act_dt", "YMD", "", "", true);
	static public final MCReportMeta end_act_hm_META_0 = new MCReportMeta("end_act_hm", "HM", "", "", true);
	static public final MCReportMeta itm_ord_no_META_0 = new MCReportMeta("itm_ord_no", "", "", "", true);

	static public final MCReportMeta print_yld_META_1 = new MCReportMeta("print_yld", "", "", "", true);

	static public final MCReportMeta act_dt_META_2 = new MCReportMeta("act_dt", "YMD", "", "", true);
	static public final MCReportMeta act_hm_META_2 = new MCReportMeta("act_hm", "HM", "", "", true);
	static public final MCReportMeta yield_schd_no_META_2 = new MCReportMeta("yield_schd_no", "", "", "", true);
	static public final MCReportMeta trd_unit_yield_qty_META_2 = new MCReportMeta("trd_unit_yield_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_yield_qty_META_2 = new MCReportMeta("s_int_trd_unit_yield_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_yield_qty_META_2 = new MCReportMeta("s_dec_trd_unit_yield_qty", "", "", "", true);
	static public final MCReportMeta yield_unit_nm_META_2 = new MCReportMeta("yield_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_yield_act_qty_META_2 = new MCReportMeta("trd_unit_yield_act_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_unit_yield_act_qty_META_2 = new MCReportMeta("s_int_trd_unit_yield_act_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_yield_act_qty_META_2 = new MCReportMeta("s_dec_trd_unit_yield_act_qty", "", "", "", true);
	static public final MCReportMeta yield_act_unit_nm_META_2 = new MCReportMeta("yield_act_unit_nm", "", "", "", true);
	static public final MCReportMeta yield_act_lot_no_view_META_2 = new MCReportMeta("yield_act_lot_no_view", "", "", "", true);
	static public final MCReportMeta yield_act_lot_no_data_META_2 = new MCReportMeta("yield_act_lot_no_data", "", "", "", true);
	static public final MCReportMeta yield_act_sublot_no_view_META_2 = new MCReportMeta("yield_act_sublot_no_view", "", "", "", true);
	static public final MCReportMeta yield_act_sublot_no_data_META_2 = new MCReportMeta("yield_act_sublot_no_data", "", "", "", true);
	static public final MCReportMeta yield_typ_nm_META_2 = new MCReportMeta("yield_typ_nm", "", "", "", true);
	static public final MCReportMeta gd_nm_META_2 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta strg_loc_nm_META_2 = new MCReportMeta("strg_loc_nm", "", "", "", true);
	static public final MCReportMeta strg_str_ln_nm_META_2 = new MCReportMeta("strg_str_ln_nm", "", "", "", true);
	static public final MCReportMeta yield_act_rpt_rmrks_META_2 = new MCReportMeta("yield_act_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char1_META_2 = new MCReportMeta("yield_act_sub_char1", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char2_META_2 = new MCReportMeta("yield_act_sub_char2", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char3_META_2 = new MCReportMeta("yield_act_sub_char3", "", "", "", true);

	static public final MCReportMeta print_inpt_META_3 = new MCReportMeta("print_inpt", "", "", "", true);

	static public final MCReportMeta inpt_act_itm_cd_META_4 = new MCReportMeta("inpt_act_itm_cd", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub1_view_META_4 = new MCReportMeta("inpt_act_itm_sub1_view", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub2_view_META_4 = new MCReportMeta("inpt_act_itm_sub2_view", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub3_view_META_4 = new MCReportMeta("inpt_act_itm_sub3_view", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub1_data_META_4 = new MCReportMeta("inpt_act_itm_sub1_data", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub2_data_META_4 = new MCReportMeta("inpt_act_itm_sub2_data", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_sub3_data_META_4 = new MCReportMeta("inpt_act_itm_sub3_data", "", "", "", true);
	static public final MCReportMeta inpt_act_itm_nm_META_4 = new MCReportMeta("inpt_act_itm_nm", "", "", "", true);
	static public final MCReportMeta inpt_itm_alt_nm1_META_4 = new MCReportMeta("inpt_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta inpt_itm_alt_nm2_META_4 = new MCReportMeta("inpt_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta inpt_itm_alt_nm3_META_4 = new MCReportMeta("inpt_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta inpt_itm_alt_nm4_META_4 = new MCReportMeta("inpt_itm_alt_nm4", "", "", "", true);
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
	static public final MCReportMeta inpt_act_lot_no_view_META_4 = new MCReportMeta("inpt_act_lot_no_view", "", "", "", true);
	static public final MCReportMeta inpt_act_lot_no_data_META_4 = new MCReportMeta("inpt_act_lot_no_data", "", "", "", true);
	static public final MCReportMeta inpt_act_sublot_no_view_META_4 = new MCReportMeta("inpt_act_sublot_no_view", "", "", "", true);
	static public final MCReportMeta inpt_act_sublot_no_data_META_4 = new MCReportMeta("inpt_act_sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_schd_qty_META_4 = new MCReportMeta("base_unit_inpt_schd_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_schd_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_schd_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_schd_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_schd_qty", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_rqmt_qty_META_4 = new MCReportMeta("base_unit_inpt_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("base_unit_inpt_fxd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta base_unit_inpt_act_qty_META_4 = new MCReportMeta("base_unit_inpt_act_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_act_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_act_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_act_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_act_qty", "", "", "", true);
	static public final MCReportMeta base_unit_loss_qty_META_4 = new MCReportMeta("base_unit_loss_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_loss_qty_META_4 = new MCReportMeta("s_int_base_unit_loss_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_loss_qty_META_4 = new MCReportMeta("s_dec_base_unit_loss_qty", "", "", "", true);
	static public final MCReportMeta base_unit_fxd_loss_qty_META_4 = new MCReportMeta("base_unit_fxd_loss_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_fxd_loss_qty_META_4 = new MCReportMeta("s_int_base_unit_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_fxd_loss_qty_META_4 = new MCReportMeta("s_dec_base_unit_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta left_cont_inpt_qty_META_4 = new MCReportMeta("left_cont_inpt_qty", "", "", "", true);
	static public final MCReportMeta cont_inpt_qty_META_4 = new MCReportMeta("cont_inpt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_inpt_qty_META_4 = new MCReportMeta("s_int_cont_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_inpt_qty_META_4 = new MCReportMeta("s_dec_cont_inpt_qty", "", "", "", true);
	static public final MCReportMeta right_cont_inpt_qty_META_4 = new MCReportMeta("right_cont_inpt_qty", "", "", "", true);
	static public final MCReportMeta left_cont_inpt_rqmt_qty_META_4 = new MCReportMeta("left_cont_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta cont_inpt_rqmt_qty_META_4 = new MCReportMeta("cont_inpt_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_inpt_rqmt_qty_META_4 = new MCReportMeta("s_int_cont_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_inpt_rqmt_qty_META_4 = new MCReportMeta("s_dec_cont_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta right_cont_inpt_rqmt_qty_META_4 = new MCReportMeta("right_cont_inpt_rqmt_qty", "", "", "", true);
	static public final MCReportMeta left_cont_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("left_cont_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta cont_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("cont_inpt_fxd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("s_int_cont_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("s_dec_cont_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta right_cont_inpt_fxd_rqmt_qty_META_4 = new MCReportMeta("right_cont_inpt_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta left_cont_qty_META_4 = new MCReportMeta("left_cont_qty", "", "", "", true);
	static public final MCReportMeta cont_qty_META_4 = new MCReportMeta("cont_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_qty_META_4 = new MCReportMeta("s_int_cont_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_qty_META_4 = new MCReportMeta("s_dec_cont_qty", "", "", "", true);
	static public final MCReportMeta right_cont_qty_META_4 = new MCReportMeta("right_cont_qty", "", "", "", true);
	static public final MCReportMeta left_cont_loss_qty_META_4 = new MCReportMeta("left_cont_loss_qty", "", "", "", true);
	static public final MCReportMeta cont_loss_qty_META_4 = new MCReportMeta("cont_loss_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_loss_qty_META_4 = new MCReportMeta("s_int_cont_loss_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_loss_qty_META_4 = new MCReportMeta("s_dec_cont_loss_qty", "", "", "", true);
	static public final MCReportMeta right_cont_loss_qty_META_4 = new MCReportMeta("right_cont_loss_qty", "", "", "", true);
	static public final MCReportMeta left_cont_fxd_loss_qty_META_4 = new MCReportMeta("left_cont_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta cont_fxd_loss_qty_META_4 = new MCReportMeta("cont_fxd_loss_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_cont_fxd_loss_qty_META_4 = new MCReportMeta("s_int_cont_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta s_dec_cont_fxd_loss_qty_META_4 = new MCReportMeta("s_dec_cont_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta right_cont_fxd_loss_qty_META_4 = new MCReportMeta("right_cont_fxd_loss_qty", "", "", "", true);
	static public final MCReportMeta inpt_unit_nm_META_4 = new MCReportMeta("inpt_unit_nm", "", "", "", true);
	static public final MCReportMeta left_unit_META_4 = new MCReportMeta("left_unit", "", "", "", true);
	static public final MCReportMeta cont_fctr_unit_nm_META_4 = new MCReportMeta("cont_fctr_unit_nm", "", "", "", true);
	static public final MCReportMeta right_unit_META_4 = new MCReportMeta("right_unit", "", "", "", true);
	static public final MCReportMeta inpt_act_rpt_rmrks_META_4 = new MCReportMeta("inpt_act_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta inpt_act_dt_META_4 = new MCReportMeta("inpt_act_dt", "YMD", "", "", true);
	static public final MCReportMeta inpt_act_hm_META_4 = new MCReportMeta("inpt_act_hm", "HM", "", "", true);
	static public final MCReportMeta inpt_schd_no_META_4 = new MCReportMeta("inpt_schd_no", "", "", "", true);
	static public final MCReportMeta inpt_act_no_META_4 = new MCReportMeta("inpt_act_no", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_4 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_4 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta inpt_act_sub_char1_META_4 = new MCReportMeta("inpt_act_sub_char1", "", "", "", true);
	static public final MCReportMeta inpt_act_sub_char2_META_4 = new MCReportMeta("inpt_act_sub_char2", "", "", "", true);
	static public final MCReportMeta inpt_act_sub_char3_META_4 = new MCReportMeta("inpt_act_sub_char3", "", "", "", true);

	static public final MCReportMeta oper_act_rpt_rmrks_lbl_META_5 = new MCReportMeta("oper_act_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta oper_act_rpt_rmrks_META_5 = new MCReportMeta("oper_act_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta mfg_act_rpt_rmrks_lbl_META_5 = new MCReportMeta("mfg_act_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta mfg_act_rpt_rmrks_META_5 = new MCReportMeta("mfg_act_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta mfg_act_aprv_dt_lbl_META_5 = new MCReportMeta("mfg_act_aprv_dt_lbl", "", "", "", true);
	static public final MCReportMeta mfg_act_aprv_dt_META_5 = new MCReportMeta("mfg_act_aprv_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_act_dpt_nm_lbl_META_5 = new MCReportMeta("mfg_act_dpt_nm_lbl", "", "", "", true);
	static public final MCReportMeta mfg_act_dpt_nm_META_5 = new MCReportMeta("mfg_act_dpt_nm", "", "", "", true);
	static public final MCReportMeta mfg_act_usr_nm_lbl_META_5 = new MCReportMeta("mfg_act_usr_nm_lbl", "", "", "", true);
	static public final MCReportMeta mfg_act_usr_nm_META_5 = new MCReportMeta("mfg_act_usr_nm", "", "", "", true);
	static public final MCReportMeta mfg_aprv_rsn_lbl_META_5 = new MCReportMeta("mfg_aprv_rsn_lbl", "", "", "", true);
	static public final MCReportMeta mfg_aprv_rsn_META_5 = new MCReportMeta("mfg_aprv_rsn", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("MfgActHdr",
			mfg_inst_no_META_0,
			div_seq_META_0,
			oper_inst_no_META_0,
			mfg_act_no_META_0,
			oper_act_no_META_0,
			form_name_META_0,
			prnt_tm_META_0,
			oper_cd_META_0,
			oper_nm_META_0,
			disp_seq_META_0,
			oper_loc_nm_META_0,
			oper_str_ln_nm_META_0,
			oper_st_act_dt_META_0,
			oper_st_act_hm_META_0,
			oper_end_act_dt_META_0,
			oper_end_act_hm_META_0,
			oper_num_META_0,
			s_oper_num_META_0,
			oper_unit_nm_META_0,
			oper_mfg_num_META_0,
			s_oper_mfg_num_META_0,
			oper_unit_qty_META_0,
			s_oper_unit_qty_META_0,
			oper_usr_nm_META_0,
			oper_yield_lbl_META_0,
			oper_act_yield_lbl_META_0,
			oper_act_yield_META_0,
			oper_lower_yield_lbl_META_0,
			oper_lower_yield_META_0,
			oper_std_yield_lbl_META_0,
			oper_std_yield_META_0,
			oper_upper_yield_lbl_META_0,
			oper_upper_yield_META_0,
			inst_dpt_nm_META_0,
			mfg_loc_nm_META_0,
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
			ntfy_nm_META_0,
			itm_yield_lbl_META_0,
			itm_act_yield_lbl_META_0,
			itm_act_yield_META_0,
			itm_lower_yield_lbl_META_0,
			itm_lower_yield_META_0,
			itm_std_yield_lbl_META_0,
			itm_std_yield_META_0,
			itm_upper_yield_lbl_META_0,
			itm_upper_yield_META_0,
			disp_pd_META_0,
			bom_ptn_META_0,
			lot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_view_META_0,
			sublot_no_data_META_0,
			base_unit_inst_qty_META_0,
			s_base_unit_inst_qty_META_0,
			base_unit_mfg_qty_META_0,
			s_base_unit_mfg_qty_META_0,
			base_unit_yield_qty_META_0,
			s_base_unit_yield_qty_META_0,
			base_unit_dfct_qty_META_0,
			s_base_unit_dfct_qty_META_0,
			base_unit_nm_META_0,
			st_act_dt_META_0,
			st_act_hm_META_0,
			end_act_dt_META_0,
			end_act_hm_META_0,
			itm_ord_no_META_0
		);
		reportMetaMap.add("HdrMfgActYld",
			print_yld_META_1
		);
		reportMetaMap.add("MfgActYld",
			act_dt_META_2,
			act_hm_META_2,
			yield_schd_no_META_2,
			trd_unit_yield_qty_META_2,
			s_int_trd_unit_yield_qty_META_2,
			s_dec_trd_unit_yield_qty_META_2,
			yield_unit_nm_META_2,
			trd_unit_yield_act_qty_META_2,
			s_int_trd_unit_yield_act_qty_META_2,
			s_dec_trd_unit_yield_act_qty_META_2,
			yield_act_unit_nm_META_2,
			yield_act_lot_no_view_META_2,
			yield_act_lot_no_data_META_2,
			yield_act_sublot_no_view_META_2,
			yield_act_sublot_no_data_META_2,
			yield_typ_nm_META_2,
			gd_nm_META_2,
			strg_loc_nm_META_2,
			strg_str_ln_nm_META_2,
			yield_act_rpt_rmrks_META_2,
			yield_act_sub_char1_META_2,
			yield_act_sub_char2_META_2,
			yield_act_sub_char3_META_2
		);
		reportMetaMap.add("HdrMfgActInpt",
			print_inpt_META_3
		);
		reportMetaMap.add("MfgActInpt",
			inpt_act_itm_cd_META_4,
			inpt_act_itm_sub1_view_META_4,
			inpt_act_itm_sub2_view_META_4,
			inpt_act_itm_sub3_view_META_4,
			inpt_act_itm_sub1_data_META_4,
			inpt_act_itm_sub2_data_META_4,
			inpt_act_itm_sub3_data_META_4,
			inpt_act_itm_nm_META_4,
			inpt_itm_alt_nm1_META_4,
			inpt_itm_alt_nm2_META_4,
			inpt_itm_alt_nm3_META_4,
			inpt_itm_alt_nm4_META_4,
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
			inpt_act_lot_no_view_META_4,
			inpt_act_lot_no_data_META_4,
			inpt_act_sublot_no_view_META_4,
			inpt_act_sublot_no_data_META_4,
			base_unit_inpt_schd_qty_META_4,
			s_int_base_unit_inpt_schd_qty_META_4,
			s_dec_base_unit_inpt_schd_qty_META_4,
			base_unit_inpt_rqmt_qty_META_4,
			s_int_base_unit_inpt_rqmt_qty_META_4,
			s_dec_base_unit_inpt_rqmt_qty_META_4,
			base_unit_inpt_fxd_rqmt_qty_META_4,
			s_int_base_unit_inpt_fxd_rqmt_qty_META_4,
			s_dec_base_unit_inpt_fxd_rqmt_qty_META_4,
			base_unit_inpt_act_qty_META_4,
			s_int_base_unit_inpt_act_qty_META_4,
			s_dec_base_unit_inpt_act_qty_META_4,
			base_unit_loss_qty_META_4,
			s_int_base_unit_loss_qty_META_4,
			s_dec_base_unit_loss_qty_META_4,
			base_unit_fxd_loss_qty_META_4,
			s_int_base_unit_fxd_loss_qty_META_4,
			s_dec_base_unit_fxd_loss_qty_META_4,
			left_cont_inpt_qty_META_4,
			cont_inpt_qty_META_4,
			s_int_cont_inpt_qty_META_4,
			s_dec_cont_inpt_qty_META_4,
			right_cont_inpt_qty_META_4,
			left_cont_inpt_rqmt_qty_META_4,
			cont_inpt_rqmt_qty_META_4,
			s_int_cont_inpt_rqmt_qty_META_4,
			s_dec_cont_inpt_rqmt_qty_META_4,
			right_cont_inpt_rqmt_qty_META_4,
			left_cont_inpt_fxd_rqmt_qty_META_4,
			cont_inpt_fxd_rqmt_qty_META_4,
			s_int_cont_inpt_fxd_rqmt_qty_META_4,
			s_dec_cont_inpt_fxd_rqmt_qty_META_4,
			right_cont_inpt_fxd_rqmt_qty_META_4,
			left_cont_qty_META_4,
			cont_qty_META_4,
			s_int_cont_qty_META_4,
			s_dec_cont_qty_META_4,
			right_cont_qty_META_4,
			left_cont_loss_qty_META_4,
			cont_loss_qty_META_4,
			s_int_cont_loss_qty_META_4,
			s_dec_cont_loss_qty_META_4,
			right_cont_loss_qty_META_4,
			left_cont_fxd_loss_qty_META_4,
			cont_fxd_loss_qty_META_4,
			s_int_cont_fxd_loss_qty_META_4,
			s_dec_cont_fxd_loss_qty_META_4,
			right_cont_fxd_loss_qty_META_4,
			inpt_unit_nm_META_4,
			left_unit_META_4,
			cont_fctr_unit_nm_META_4,
			right_unit_META_4,
			inpt_act_rpt_rmrks_META_4,
			inpt_act_dt_META_4,
			inpt_act_hm_META_4,
			inpt_schd_no_META_4,
			inpt_act_no_META_4,
			ver_no_lbl_META_4,
			ver_no_META_4,
			inpt_act_sub_char1_META_4,
			inpt_act_sub_char2_META_4,
			inpt_act_sub_char3_META_4
		);
		reportMetaMap.add("MfgActFtr",
			oper_act_rpt_rmrks_lbl_META_5,
			oper_act_rpt_rmrks_META_5,
			mfg_act_rpt_rmrks_lbl_META_5,
			mfg_act_rpt_rmrks_META_5,
			mfg_act_aprv_dt_lbl_META_5,
			mfg_act_aprv_dt_META_5,
			mfg_act_dpt_nm_lbl_META_5,
			mfg_act_dpt_nm_META_5,
			mfg_act_usr_nm_lbl_META_5,
			mfg_act_usr_nm_META_5,
			mfg_aprv_rsn_lbl_META_5,
			mfg_aprv_rsn_META_5
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBCR_MfgAct_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

