package mcframe.commonMSBC.MSBCR1030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBCR_OperBom_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBCR1030";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass OPERBOMHDRR_RC = new MCReportClass("OperBomHdr", mcframe.commonMSBC.MSBCR1030.OperBomHdrR.class);
	static public final MCReportClass HDROPERBOMYLDL_RC = new MCReportClass("HdrOperBomYld", mcframe.commonMSBC.MSBCR1030.HdrOperBomYldR.class, MCList.class);
	static public final MCReportClass OPERBOMYLDL_RC = new MCReportClass("OperBomYld", mcframe.commonMSBC.MSBCR1030.OperBomYldR.class, MCList.class);
	static public final MCReportClass HDROPERBOMINPTL_RC = new MCReportClass("HdrOperBomInpt", mcframe.commonMSBC.MSBCR1030.HdrOperBomInptR.class, MCList.class);
	static public final MCReportClass OPERBOMINPTL_RC = new MCReportClass("OperBomInpt", mcframe.commonMSBC.MSBCR1030.OperBomInptR.class, MCList.class);
	static public final MCReportClass OPERBOMFTRR_RC = new MCReportClass("OperBomFtr", mcframe.commonMSBC.MSBCR1030.OperBomFtrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		OPERBOMHDRR_RC,
		HDROPERBOMYLDL_RC,
		OPERBOMYLDL_RC,
		HDROPERBOMINPTL_RC,
		OPERBOMINPTL_RC,
		OPERBOMFTRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta mfg_inst_no_META_0 = new MCReportMeta("mfg_inst_no", "", "", "", true);
	static public final MCReportMeta oper_inst_no_META_0 = new MCReportMeta("oper_inst_no", "", "", "", true);
	static public final MCReportMeta form_name_META_0 = new MCReportMeta("form_name", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta prod_itm_cd_META_0 = new MCReportMeta("prod_itm_cd", "", "", "", true);
	static public final MCReportMeta prod_itm_sub1_view_META_0 = new MCReportMeta("prod_itm_sub1_view", "", "", "", true);
	static public final MCReportMeta prod_itm_sub2_view_META_0 = new MCReportMeta("prod_itm_sub2_view", "", "", "", true);
	static public final MCReportMeta prod_itm_sub3_view_META_0 = new MCReportMeta("prod_itm_sub3_view", "", "", "", true);
	static public final MCReportMeta prod_itm_sub1_data_META_0 = new MCReportMeta("prod_itm_sub1_data", "", "", "", true);
	static public final MCReportMeta prod_itm_sub2_data_META_0 = new MCReportMeta("prod_itm_sub2_data", "", "", "", true);
	static public final MCReportMeta prod_itm_sub3_data_META_0 = new MCReportMeta("prod_itm_sub3_data", "", "", "", true);
	static public final MCReportMeta prod_itm_nm_META_0 = new MCReportMeta("prod_itm_nm", "", "", "", true);
	static public final MCReportMeta prod_itm_alt_nm1_META_0 = new MCReportMeta("prod_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta prod_itm_alt_nm2_META_0 = new MCReportMeta("prod_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta prod_itm_alt_nm3_META_0 = new MCReportMeta("prod_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta prod_itm_alt_nm4_META_0 = new MCReportMeta("prod_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta mfg_str_ln_cd_META_0 = new MCReportMeta("mfg_str_ln_cd", "", "", "", true);
	static public final MCReportMeta mfg_str_ln_nm_META_0 = new MCReportMeta("mfg_str_ln_nm", "", "", "", true);
	static public final MCReportMeta oper_inst_typ_META_0 = new MCReportMeta("oper_inst_typ", "", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_nm_META_0 = new MCReportMeta("oper_nm", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta disp_seq_META_0 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta old_mfg_inst_rev_no_META_0 = new MCReportMeta("old_mfg_inst_rev_no", "", "", "", true);
	static public final MCReportMeta new_mfg_inst_rev_no_META_0 = new MCReportMeta("new_mfg_inst_rev_no", "", "", "", true);
	static public final MCReportMeta old_inst_prnt_tm_META_0 = new MCReportMeta("old_inst_prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta new_inst_prnt_tm_META_0 = new MCReportMeta("new_inst_prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta chng_no_META_0 = new MCReportMeta("chng_no", "", "", "", true);
	static public final MCReportMeta oper_inst_usr_cd_META_0 = new MCReportMeta("oper_inst_usr_cd", "", "", "", true);
	static public final MCReportMeta oper_inst_usr_nm_META_0 = new MCReportMeta("oper_inst_usr_nm", "", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);

	static public final MCReportMeta print_oper_META_1 = new MCReportMeta("print_oper", "", "", "", true);

	static public final MCReportMeta mfg_inst_rev_no_META_2 = new MCReportMeta("mfg_inst_rev_no", "", "", "", true);
	static public final MCReportMeta st_schd_dt_META_2 = new MCReportMeta("st_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta st_schd_hm_META_2 = new MCReportMeta("st_schd_hm", "HM", "", "", true);
	static public final MCReportMeta end_schd_dt_META_2 = new MCReportMeta("end_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta end_schd_hm_META_2 = new MCReportMeta("end_schd_hm", "HM", "", "", true);
	static public final MCReportMeta oper_unit_inst_qty_META_2 = new MCReportMeta("oper_unit_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_oper_unit_inst_qty_META_2 = new MCReportMeta("s_int_oper_unit_inst_qty", "", "", "", true);
	static public final MCReportMeta s_dec_oper_unit_inst_qty_META_2 = new MCReportMeta("s_dec_oper_unit_inst_qty", "", "", "", true);
	static public final MCReportMeta oper_unit_cd_META_2 = new MCReportMeta("oper_unit_cd", "", "", "", true);
	static public final MCReportMeta oper_unit_nm_META_2 = new MCReportMeta("oper_unit_nm", "", "", "", true);
	static public final MCReportMeta oper_disp_seq_META_2 = new MCReportMeta("oper_disp_seq", "", "", "", true);
	static public final MCReportMeta oper_lt_META_2 = new MCReportMeta("oper_lt", "", "", "", true);
	static public final MCReportMeta oper_lt_add_qty_META_2 = new MCReportMeta("oper_lt_add_qty", "", "", "", true);
	static public final MCReportMeta s_int_oper_lt_add_qty_META_2 = new MCReportMeta("s_int_oper_lt_add_qty", "", "", "", true);
	static public final MCReportMeta s_dec_oper_lt_add_qty_META_2 = new MCReportMeta("s_dec_oper_lt_add_qty", "", "", "", true);
	static public final MCReportMeta oper_offst_typ_META_2 = new MCReportMeta("oper_offst_typ", "", "", "", true);
	static public final MCReportMeta oper_offst_typ_nm_META_2 = new MCReportMeta("oper_offst_typ_nm", "", "", "", true);
	static public final MCReportMeta oper_offst_META_2 = new MCReportMeta("oper_offst", "", "", "", true);
	static public final MCReportMeta oper_offst_add_qty_META_2 = new MCReportMeta("oper_offst_add_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_oper_offst_add_qty_META_2 = new MCReportMeta("s_int_oper_offst_add_qty", "", "", "", true);
	static public final MCReportMeta s_dec_oper_offst_add_qty_META_2 = new MCReportMeta("s_dec_oper_offst_add_qty", "", "", "", true);
	static public final MCReportMeta oper_std_qty_META_2 = new MCReportMeta("oper_std_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_oper_std_qty_META_2 = new MCReportMeta("s_int_oper_std_qty", "", "", "", true);
	static public final MCReportMeta s_dec_oper_std_qty_META_2 = new MCReportMeta("s_dec_oper_std_qty", "", "", "", true);
	static public final MCReportMeta oper_conv_qty_META_2 = new MCReportMeta("oper_conv_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_oper_conv_qty_META_2 = new MCReportMeta("s_int_oper_conv_qty", "", "", "", true);
	static public final MCReportMeta s_dec_oper_conv_qty_META_2 = new MCReportMeta("s_dec_oper_conv_qty", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char1_META_2 = new MCReportMeta("oper_inst_sub_char1", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char2_META_2 = new MCReportMeta("oper_inst_sub_char2", "", "", "", true);
	static public final MCReportMeta oper_inst_sub_char3_META_2 = new MCReportMeta("oper_inst_sub_char3", "", "", "", true);

	static public final MCReportMeta print_inpt_META_3 = new MCReportMeta("print_inpt", "", "", "", true);

	static public final MCReportMeta d_oper_inst_typ_META_4 = new MCReportMeta("d_oper_inst_typ", "", "", "", true);
	static public final MCReportMeta d_itm_cd_META_4 = new MCReportMeta("d_itm_cd", "", "", "", true);
	static public final MCReportMeta d_itm_sub1_view_META_4 = new MCReportMeta("d_itm_sub1_view", "", "", "", true);
	static public final MCReportMeta d_itm_sub2_view_META_4 = new MCReportMeta("d_itm_sub2_view", "", "", "", true);
	static public final MCReportMeta d_itm_sub3_view_META_4 = new MCReportMeta("d_itm_sub3_view", "", "", "", true);
	static public final MCReportMeta d_itm_sub1_data_META_4 = new MCReportMeta("d_itm_sub1_data", "", "", "", true);
	static public final MCReportMeta d_itm_sub2_data_META_4 = new MCReportMeta("d_itm_sub2_data", "", "", "", true);
	static public final MCReportMeta d_itm_sub3_data_META_4 = new MCReportMeta("d_itm_sub3_data", "", "", "", true);
	static public final MCReportMeta d_itm_nm_META_4 = new MCReportMeta("d_itm_nm", "", "", "", true);
	static public final MCReportMeta d_itm_alt_nm1_META_4 = new MCReportMeta("d_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta d_itm_alt_nm2_META_4 = new MCReportMeta("d_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta d_itm_alt_nm3_META_4 = new MCReportMeta("d_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta d_itm_alt_nm4_META_4 = new MCReportMeta("d_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta alt_grp_cd_META_4 = new MCReportMeta("alt_grp_cd", "", "", "", true);
	static public final MCReportMeta alt_grp_nm_META_4 = new MCReportMeta("alt_grp_nm", "", "", "", true);
	static public final MCReportMeta d_mfg_inst_rev_no_META_4 = new MCReportMeta("d_mfg_inst_rev_no", "", "", "", true);
	static public final MCReportMeta schd_dt_META_4 = new MCReportMeta("schd_dt", "YMD", "", "", true);
	static public final MCReportMeta schd_hm_META_4 = new MCReportMeta("schd_hm", "HM", "", "", true);
	static public final MCReportMeta base_unit_inpt_qty_META_4 = new MCReportMeta("base_unit_inpt_qty", "COMMA", "", "", true);
	static public final MCReportMeta base_unit_rqmt_qty_META_4 = new MCReportMeta("base_unit_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("base_unit_fxd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_unit_inpt_qty_META_4 = new MCReportMeta("s_int_base_unit_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_inpt_qty_META_4 = new MCReportMeta("s_dec_base_unit_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_int_base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("s_int_base_unit_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_base_unit_fxd_rqmt_qty_META_4 = new MCReportMeta("s_dec_base_unit_fxd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_4 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_4 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta bom_id_no_META_4 = new MCReportMeta("bom_id_no", "", "", "", true);
	static public final MCReportMeta par_inst_qty_META_4 = new MCReportMeta("par_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_par_inst_qty_META_4 = new MCReportMeta("s_int_par_inst_qty", "", "", "", true);
	static public final MCReportMeta s_dec_par_inst_qty_META_4 = new MCReportMeta("s_dec_par_inst_qty", "", "", "", true);
	static public final MCReportMeta chd_inpt_qty_META_4 = new MCReportMeta("chd_inpt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_chd_inpt_qty_META_4 = new MCReportMeta("s_int_chd_inpt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_chd_inpt_qty_META_4 = new MCReportMeta("s_dec_chd_inpt_qty", "", "", "", true);
	static public final MCReportMeta chd_rqmt_qty_META_4 = new MCReportMeta("chd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_chd_rqmt_qty_META_4 = new MCReportMeta("s_int_chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_chd_rqmt_qty_META_4 = new MCReportMeta("s_dec_chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta fxd_chd_rqmt_qty_META_4 = new MCReportMeta("fxd_chd_rqmt_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_fxd_chd_rqmt_qty_META_4 = new MCReportMeta("s_int_fxd_chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta s_dec_fxd_chd_rqmt_qty_META_4 = new MCReportMeta("s_dec_fxd_chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta in_offst_typ_META_4 = new MCReportMeta("in_offst_typ", "", "", "", true);
	static public final MCReportMeta in_offst_typ_nm_META_4 = new MCReportMeta("in_offst_typ_nm", "", "", "", true);
	static public final MCReportMeta in_offst_META_4 = new MCReportMeta("in_offst", "", "", "", true);
	static public final MCReportMeta d_disp_seq_META_4 = new MCReportMeta("d_disp_seq", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char1_META_4 = new MCReportMeta("inpt_schd_sub_char1", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char2_META_4 = new MCReportMeta("inpt_schd_sub_char2", "", "", "", true);
	static public final MCReportMeta inpt_schd_sub_char3_META_4 = new MCReportMeta("inpt_schd_sub_char3", "", "", "", true);

	static public final MCReportMeta oper_inst_rpt_rmrks_lbl_META_5 = new MCReportMeta("oper_inst_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta oper_inst_rpt_rmrks_META_5 = new MCReportMeta("oper_inst_rpt_rmrks", "", "", "", true);
	static public final MCReportMeta mfg_inst_rpt_rmrks_lbl_META_5 = new MCReportMeta("mfg_inst_rpt_rmrks_lbl", "", "", "", true);
	static public final MCReportMeta mfg_inst_rpt_rmrks_META_5 = new MCReportMeta("mfg_inst_rpt_rmrks", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("OperBomHdr",
			mfg_inst_no_META_0,
			oper_inst_no_META_0,
			form_name_META_0,
			prnt_tm_META_0,
			prod_itm_cd_META_0,
			prod_itm_sub1_view_META_0,
			prod_itm_sub2_view_META_0,
			prod_itm_sub3_view_META_0,
			prod_itm_sub1_data_META_0,
			prod_itm_sub2_data_META_0,
			prod_itm_sub3_data_META_0,
			prod_itm_nm_META_0,
			prod_itm_alt_nm1_META_0,
			prod_itm_alt_nm2_META_0,
			prod_itm_alt_nm3_META_0,
			prod_itm_alt_nm4_META_0,
			bom_ptn_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			mfg_str_ln_cd_META_0,
			mfg_str_ln_nm_META_0,
			oper_inst_typ_META_0,
			oper_cd_META_0,
			oper_nm_META_0,
			oper_seq_META_0,
			disp_seq_META_0,
			old_mfg_inst_rev_no_META_0,
			new_mfg_inst_rev_no_META_0,
			old_inst_prnt_tm_META_0,
			new_inst_prnt_tm_META_0,
			chng_no_META_0,
			oper_inst_usr_cd_META_0,
			oper_inst_usr_nm_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0
		);
		reportMetaMap.add("HdrOperBomYld",
			print_oper_META_1
		);
		reportMetaMap.add("OperBomYld",
			mfg_inst_rev_no_META_2,
			st_schd_dt_META_2,
			st_schd_hm_META_2,
			end_schd_dt_META_2,
			end_schd_hm_META_2,
			oper_unit_inst_qty_META_2,
			s_int_oper_unit_inst_qty_META_2,
			s_dec_oper_unit_inst_qty_META_2,
			oper_unit_cd_META_2,
			oper_unit_nm_META_2,
			oper_disp_seq_META_2,
			oper_lt_META_2,
			oper_lt_add_qty_META_2,
			s_int_oper_lt_add_qty_META_2,
			s_dec_oper_lt_add_qty_META_2,
			oper_offst_typ_META_2,
			oper_offst_typ_nm_META_2,
			oper_offst_META_2,
			oper_offst_add_qty_META_2,
			s_int_oper_offst_add_qty_META_2,
			s_dec_oper_offst_add_qty_META_2,
			oper_std_qty_META_2,
			s_int_oper_std_qty_META_2,
			s_dec_oper_std_qty_META_2,
			oper_conv_qty_META_2,
			s_int_oper_conv_qty_META_2,
			s_dec_oper_conv_qty_META_2,
			oper_inst_sub_char1_META_2,
			oper_inst_sub_char2_META_2,
			oper_inst_sub_char3_META_2
		);
		reportMetaMap.add("HdrOperBomInpt",
			print_inpt_META_3
		);
		reportMetaMap.add("OperBomInpt",
			d_oper_inst_typ_META_4,
			d_itm_cd_META_4,
			d_itm_sub1_view_META_4,
			d_itm_sub2_view_META_4,
			d_itm_sub3_view_META_4,
			d_itm_sub1_data_META_4,
			d_itm_sub2_data_META_4,
			d_itm_sub3_data_META_4,
			d_itm_nm_META_4,
			d_itm_alt_nm1_META_4,
			d_itm_alt_nm2_META_4,
			d_itm_alt_nm3_META_4,
			d_itm_alt_nm4_META_4,
			alt_grp_cd_META_4,
			alt_grp_nm_META_4,
			d_mfg_inst_rev_no_META_4,
			schd_dt_META_4,
			schd_hm_META_4,
			base_unit_inpt_qty_META_4,
			base_unit_rqmt_qty_META_4,
			base_unit_fxd_rqmt_qty_META_4,
			s_int_base_unit_inpt_qty_META_4,
			s_dec_base_unit_inpt_qty_META_4,
			s_int_base_unit_rqmt_qty_META_4,
			s_dec_base_unit_rqmt_qty_META_4,
			s_int_base_unit_fxd_rqmt_qty_META_4,
			s_dec_base_unit_fxd_rqmt_qty_META_4,
			base_unit_cd_META_4,
			base_unit_nm_META_4,
			bom_id_no_META_4,
			par_inst_qty_META_4,
			s_int_par_inst_qty_META_4,
			s_dec_par_inst_qty_META_4,
			chd_inpt_qty_META_4,
			s_int_chd_inpt_qty_META_4,
			s_dec_chd_inpt_qty_META_4,
			chd_rqmt_qty_META_4,
			s_int_chd_rqmt_qty_META_4,
			s_dec_chd_rqmt_qty_META_4,
			fxd_chd_rqmt_qty_META_4,
			s_int_fxd_chd_rqmt_qty_META_4,
			s_dec_fxd_chd_rqmt_qty_META_4,
			in_offst_typ_META_4,
			in_offst_typ_nm_META_4,
			in_offst_META_4,
			d_disp_seq_META_4,
			inpt_schd_sub_char1_META_4,
			inpt_schd_sub_char2_META_4,
			inpt_schd_sub_char3_META_4
		);
		reportMetaMap.add("OperBomFtr",
			oper_inst_rpt_rmrks_lbl_META_5,
			oper_inst_rpt_rmrks_META_5,
			mfg_inst_rpt_rmrks_lbl_META_5,
			mfg_inst_rpt_rmrks_META_5
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBCR_OperBom_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

