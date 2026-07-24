package mcframe.commonMSBF.MSBFR0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBFR_InspRslt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBFR0030";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass INSPRSLTHDRR_RC = new MCReportClass("InspRsltHdr", mcframe.commonMSBF.MSBFR0030.InspRsltHdrR.class);
	static public final MCReportClass INSPRSLTDTLL_RC = new MCReportClass("InspRsltDtl", mcframe.commonMSBF.MSBFR0030.InspRsltDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		INSPRSLTHDRR_RC,
		INSPRSLTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta insp_typ_META_0 = new MCReportMeta("insp_typ", "", "", "", true);
	static public final MCReportMeta insp_no_lbl_META_0 = new MCReportMeta("insp_no_lbl", "", "", "", true);
	static public final MCReportMeta insp_no_META_0 = new MCReportMeta("insp_no", "", "", "", true);
	static public final MCReportMeta form_name_META_0 = new MCReportMeta("form_name", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
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
	static public final MCReportMeta ntfy_nm_META_0 = new MCReportMeta("ntfy_nm", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_0 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta insp_std_no_META_0 = new MCReportMeta("insp_std_no", "", "", "", true);
	static public final MCReportMeta insp_ptn_nm_lbl_META_0 = new MCReportMeta("insp_ptn_nm_lbl", "", "", "", true);
	static public final MCReportMeta insp_ptn_cd_META_0 = new MCReportMeta("insp_ptn_cd", "", "", "", true);
	static public final MCReportMeta insp_ptn_nm_META_0 = new MCReportMeta("insp_ptn_nm", "", "", "", true);
	static public final MCReportMeta lmt_ctl_categ_nm_META_0 = new MCReportMeta("lmt_ctl_categ_nm", "", "", "", true);
	static public final MCReportMeta vld_dt_META_0 = new MCReportMeta("vld_dt", "YMD", "", "", true);
	static public final MCReportMeta lmt_dt_META_0 = new MCReportMeta("lmt_dt", "YMD", "", "", true);
	static public final MCReportMeta judg_dt_META_0 = new MCReportMeta("judg_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_judg_rslt_typ_META_0 = new MCReportMeta("insp_judg_rslt_typ", "", "", "", true);
	static public final MCReportMeta insp_judg_rslt_typ_nm_META_0 = new MCReportMeta("insp_judg_rslt_typ_nm", "", "", "", true);
	static public final MCReportMeta judg_usr_cd_META_0 = new MCReportMeta("judg_usr_cd", "", "", "", true);
	static public final MCReportMeta judg_usr_nm_META_0 = new MCReportMeta("judg_usr_nm", "", "", "", true);
	static public final MCReportMeta judg_dpt_cd_META_0 = new MCReportMeta("judg_dpt_cd", "", "", "", true);
	static public final MCReportMeta judg_dpt_nm_META_0 = new MCReportMeta("judg_dpt_nm", "", "", "", true);
	static public final MCReportMeta judg_rsn_META_0 = new MCReportMeta("judg_rsn", "", "", "", true);
	static public final MCReportMeta insp_point_nm_lbl_META_0 = new MCReportMeta("insp_point_nm_lbl", "", "", "", true);
	static public final MCReportMeta ql_insp_val_lbl_META_0 = new MCReportMeta("ql_insp_val_lbl", "", "", "", true);
	static public final MCReportMeta qn_insp_val_lbl_META_0 = new MCReportMeta("qn_insp_val_lbl", "", "", "", true);
	static public final MCReportMeta insp_end_tm_lbl_META_0 = new MCReportMeta("insp_end_tm_lbl", "", "", "", true);
	static public final MCReportMeta insp_usr_nm_lbl_META_0 = new MCReportMeta("insp_usr_nm_lbl", "", "", "", true);
	static public final MCReportMeta site_cd_META_0 = new MCReportMeta("site_cd", "", "", "", true);
	static public final MCReportMeta site_nm_META_0 = new MCReportMeta("site_nm", "", "", "", true);

	static public final MCReportMeta insp_seq_META_1 = new MCReportMeta("insp_seq", "", "", "", true);
	static public final MCReportMeta insp_qlqn_typ_META_1 = new MCReportMeta("insp_qlqn_typ", "", "", "", true);
	static public final MCReportMeta insp_qlqn_typ_nm_META_1 = new MCReportMeta("insp_qlqn_typ_nm", "", "", "", true);
	static public final MCReportMeta insp_point_cd_META_1 = new MCReportMeta("insp_point_cd", "", "", "", true);
	static public final MCReportMeta insp_point_nm_META_1 = new MCReportMeta("insp_point_nm", "", "", "", true);
	static public final MCReportMeta ql_std_val_META_1 = new MCReportMeta("ql_std_val", "", "", "", true);
	static public final MCReportMeta ql_insp_val_META_1 = new MCReportMeta("ql_insp_val", "", "", "", true);
	static public final MCReportMeta qn_out_min_META_1 = new MCReportMeta("qn_out_min", "COMMA", "", "", true);
	static public final MCReportMeta s_qn_out_min_META_1 = new MCReportMeta("s_qn_out_min", "", "", "", true);
	static public final MCReportMeta s_int_qn_out_min_META_1 = new MCReportMeta("s_int_qn_out_min", "", "", "", true);
	static public final MCReportMeta s_dec_qn_out_min_META_1 = new MCReportMeta("s_dec_qn_out_min", "", "", "", true);
	static public final MCReportMeta sign_out_min_typ_META_1 = new MCReportMeta("sign_out_min_typ", "", "", "", true);
	static public final MCReportMeta sign_out_min_typ_nm_META_1 = new MCReportMeta("sign_out_min_typ_nm", "", "", "", true);
	static public final MCReportMeta qn_in_min_META_1 = new MCReportMeta("qn_in_min", "COMMA", "", "", true);
	static public final MCReportMeta s_qn_in_min_META_1 = new MCReportMeta("s_qn_in_min", "", "", "", true);
	static public final MCReportMeta s_int_qn_in_min_META_1 = new MCReportMeta("s_int_qn_in_min", "", "", "", true);
	static public final MCReportMeta s_dec_qn_in_min_META_1 = new MCReportMeta("s_dec_qn_in_min", "", "", "", true);
	static public final MCReportMeta sign_in_min_typ_META_1 = new MCReportMeta("sign_in_min_typ", "", "", "", true);
	static public final MCReportMeta sign_in_min_typ_nm_META_1 = new MCReportMeta("sign_in_min_typ_nm", "", "", "", true);
	static public final MCReportMeta qn_insp_val_META_1 = new MCReportMeta("qn_insp_val", "COMMA", "", "", true);
	static public final MCReportMeta s_qn_insp_val_META_1 = new MCReportMeta("s_qn_insp_val", "", "", "", true);
	static public final MCReportMeta s_int_qn_insp_val_META_1 = new MCReportMeta("s_int_qn_insp_val", "", "", "", true);
	static public final MCReportMeta s_dec_qn_insp_val_META_1 = new MCReportMeta("s_dec_qn_insp_val", "", "", "", true);
	static public final MCReportMeta sign_out_max_typ_META_1 = new MCReportMeta("sign_out_max_typ", "", "", "", true);
	static public final MCReportMeta sign_out_max_typ_nm_META_1 = new MCReportMeta("sign_out_max_typ_nm", "", "", "", true);
	static public final MCReportMeta qn_out_max_META_1 = new MCReportMeta("qn_out_max", "COMMA", "", "", true);
	static public final MCReportMeta s_qn_out_max_META_1 = new MCReportMeta("s_qn_out_max", "", "", "", true);
	static public final MCReportMeta s_int_qn_out_max_META_1 = new MCReportMeta("s_int_qn_out_max", "", "", "", true);
	static public final MCReportMeta s_dec_qn_out_max_META_1 = new MCReportMeta("s_dec_qn_out_max", "", "", "", true);
	static public final MCReportMeta sign_in_max_typ_META_1 = new MCReportMeta("sign_in_max_typ", "", "", "", true);
	static public final MCReportMeta sign_in_max_typ_nm_META_1 = new MCReportMeta("sign_in_max_typ_nm", "", "", "", true);
	static public final MCReportMeta qn_in_max_META_1 = new MCReportMeta("qn_in_max", "COMMA", "", "", true);
	static public final MCReportMeta s_qn_in_max_META_1 = new MCReportMeta("s_qn_in_max", "", "", "", true);
	static public final MCReportMeta s_int_qn_in_max_META_1 = new MCReportMeta("s_int_qn_in_max", "", "", "", true);
	static public final MCReportMeta s_dec_qn_in_max_META_1 = new MCReportMeta("s_dec_qn_in_max", "", "", "", true);
	static public final MCReportMeta qn_int_frac_META_1 = new MCReportMeta("qn_int_frac", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta std_insp_rslt_typ_META_1 = new MCReportMeta("std_insp_rslt_typ", "", "", "", true);
	static public final MCReportMeta std_insp_rslt_typ_nm_META_1 = new MCReportMeta("std_insp_rslt_typ_nm", "", "", "", true);
	static public final MCReportMeta insp_end_tm_META_1 = new MCReportMeta("insp_end_tm", "YMDHM", "", "", true);
	static public final MCReportMeta insp_usr_cd_META_1 = new MCReportMeta("insp_usr_cd", "", "", "", true);
	static public final MCReportMeta insp_usr_nm_META_1 = new MCReportMeta("insp_usr_nm", "", "", "", true);
	static public final MCReportMeta cnf_usr_cd_META_1 = new MCReportMeta("cnf_usr_cd", "", "", "", true);
	static public final MCReportMeta cnf_usr_nm_META_1 = new MCReportMeta("cnf_usr_nm", "", "", "", true);
	static public final MCReportMeta inst_sub_char1_META_1 = new MCReportMeta("inst_sub_char1", "", "", "", true);
	static public final MCReportMeta inst_sub_char2_META_1 = new MCReportMeta("inst_sub_char2", "", "", "", true);
	static public final MCReportMeta inst_sub_char3_META_1 = new MCReportMeta("inst_sub_char3", "", "", "", true);
	static public final MCReportMeta act_sub_char1_META_1 = new MCReportMeta("act_sub_char1", "", "", "", true);
	static public final MCReportMeta act_sub_char2_META_1 = new MCReportMeta("act_sub_char2", "", "", "", true);
	static public final MCReportMeta act_sub_char3_META_1 = new MCReportMeta("act_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("InspRsltHdr",
			insp_typ_META_0,
			insp_no_lbl_META_0,
			insp_no_META_0,
			form_name_META_0,
			prnt_tm_META_0,
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
			ntfy_nm_META_0,
			lot_no_view_META_0,
			sublot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_data_META_0,
			ver_no_lbl_META_0,
			ver_no_META_0,
			insp_std_no_META_0,
			insp_ptn_nm_lbl_META_0,
			insp_ptn_cd_META_0,
			insp_ptn_nm_META_0,
			lmt_ctl_categ_nm_META_0,
			vld_dt_META_0,
			lmt_dt_META_0,
			judg_dt_META_0,
			insp_judg_rslt_typ_META_0,
			insp_judg_rslt_typ_nm_META_0,
			judg_usr_cd_META_0,
			judg_usr_nm_META_0,
			judg_dpt_cd_META_0,
			judg_dpt_nm_META_0,
			judg_rsn_META_0,
			insp_point_nm_lbl_META_0,
			ql_insp_val_lbl_META_0,
			qn_insp_val_lbl_META_0,
			insp_end_tm_lbl_META_0,
			insp_usr_nm_lbl_META_0,
			site_cd_META_0,
			site_nm_META_0
		);
		reportMetaMap.add("InspRsltDtl",
			insp_seq_META_1,
			insp_qlqn_typ_META_1,
			insp_qlqn_typ_nm_META_1,
			insp_point_cd_META_1,
			insp_point_nm_META_1,
			ql_std_val_META_1,
			ql_insp_val_META_1,
			qn_out_min_META_1,
			s_qn_out_min_META_1,
			s_int_qn_out_min_META_1,
			s_dec_qn_out_min_META_1,
			sign_out_min_typ_META_1,
			sign_out_min_typ_nm_META_1,
			qn_in_min_META_1,
			s_qn_in_min_META_1,
			s_int_qn_in_min_META_1,
			s_dec_qn_in_min_META_1,
			sign_in_min_typ_META_1,
			sign_in_min_typ_nm_META_1,
			qn_insp_val_META_1,
			s_qn_insp_val_META_1,
			s_int_qn_insp_val_META_1,
			s_dec_qn_insp_val_META_1,
			sign_out_max_typ_META_1,
			sign_out_max_typ_nm_META_1,
			qn_out_max_META_1,
			s_qn_out_max_META_1,
			s_int_qn_out_max_META_1,
			s_dec_qn_out_max_META_1,
			sign_in_max_typ_META_1,
			sign_in_max_typ_nm_META_1,
			qn_in_max_META_1,
			s_qn_in_max_META_1,
			s_int_qn_in_max_META_1,
			s_dec_qn_in_max_META_1,
			qn_int_frac_META_1,
			trd_unit_cd_META_1,
			trd_unit_nm_META_1,
			std_insp_rslt_typ_META_1,
			std_insp_rslt_typ_nm_META_1,
			insp_end_tm_META_1,
			insp_usr_cd_META_1,
			insp_usr_nm_META_1,
			cnf_usr_cd_META_1,
			cnf_usr_nm_META_1,
			inst_sub_char1_META_1,
			inst_sub_char2_META_1,
			inst_sub_char3_META_1,
			act_sub_char1_META_1,
			act_sub_char2_META_1,
			act_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBFR_InspRslt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

