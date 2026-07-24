package mcframe.commonMSLA.MSLAR1010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_ShipInstPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR1010";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR1010.DtlR.class, MCList.class);

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
	static public final MCReportMeta dpstr_cd_META_0 = new MCReportMeta("dpstr_cd", "", "", "", true);
	static public final MCReportMeta dpstr_nm_META_0 = new MCReportMeta("dpstr_nm", "", "", "", true);
	static public final MCReportMeta site_co_cd_META_0 = new MCReportMeta("site_co_cd", "", "", "", true);
	static public final MCReportMeta site_co_nm_META_0 = new MCReportMeta("site_co_nm", "", "", "", true);
	static public final MCReportMeta ship_inst_no_META_0 = new MCReportMeta("ship_inst_no", "", "", "", true);
	static public final MCReportMeta ship_inst_rev_META_0 = new MCReportMeta("ship_inst_rev", "", "", "", true);
	static public final MCReportMeta ship_fr_lg_grp_cd_META_0 = new MCReportMeta("ship_fr_lg_grp_cd", "", "", "", true);
	static public final MCReportMeta ship_fr_lg_grp_nm_META_0 = new MCReportMeta("ship_fr_lg_grp_nm", "", "", "", true);
	static public final MCReportMeta ship_inst_dt_META_0 = new MCReportMeta("ship_inst_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_inst_hm_META_0 = new MCReportMeta("ship_inst_hm", "HM", "", "", true);
	static public final MCReportMeta ship_schd_dt_META_0 = new MCReportMeta("ship_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_schd_hm_META_0 = new MCReportMeta("ship_schd_hm", "HM", "", "", true);
	static public final MCReportMeta dlv_schd_dt_META_0 = new MCReportMeta("dlv_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_schd_hm_META_0 = new MCReportMeta("dlv_schd_hm", "HM", "", "", true);
	static public final MCReportMeta ship_wk_cd_META_0 = new MCReportMeta("ship_wk_cd", "", "", "", true);
	static public final MCReportMeta ship_wk_nm_META_0 = new MCReportMeta("ship_wk_nm", "", "", "", true);
	static public final MCReportMeta ship_term_cd_META_0 = new MCReportMeta("ship_term_cd", "", "", "", true);
	static public final MCReportMeta ship_term_nm_META_0 = new MCReportMeta("ship_term_nm", "", "", "", true);
	static public final MCReportMeta ship_to_lg_grp_cd_META_0 = new MCReportMeta("ship_to_lg_grp_cd", "", "", "", true);
	static public final MCReportMeta ship_to_lg_grp_nm_META_0 = new MCReportMeta("ship_to_lg_grp_nm", "", "", "", true);
	static public final MCReportMeta ship_to_id_typ_META_0 = new MCReportMeta("ship_to_id_typ", "", "", "", true);
	static public final MCReportMeta ship_to_id_cd_META_0 = new MCReportMeta("ship_to_id_cd", "", "", "", true);
	static public final MCReportMeta ship_to_id_nm_META_0 = new MCReportMeta("ship_to_id_nm", "", "", "", true);
	static public final MCReportMeta ship_to_zip_cd_META_0 = new MCReportMeta("ship_to_zip_cd", "", "", "", true);
	static public final MCReportMeta ship_to_addr1_META_0 = new MCReportMeta("ship_to_addr1", "", "", "", true);
	static public final MCReportMeta ship_to_addr2_META_0 = new MCReportMeta("ship_to_addr2", "", "", "", true);
	static public final MCReportMeta ship_to_addr3_META_0 = new MCReportMeta("ship_to_addr3", "", "", "", true);
	static public final MCReportMeta ship_to_addr4_META_0 = new MCReportMeta("ship_to_addr4", "", "", "", true);
	static public final MCReportMeta ship_to_cntct_dpt_META_0 = new MCReportMeta("ship_to_cntct_dpt", "", "", "", true);
	static public final MCReportMeta ship_to_cntct_psn_META_0 = new MCReportMeta("ship_to_cntct_psn", "", "", "", true);
	static public final MCReportMeta ship_to_tel_META_0 = new MCReportMeta("ship_to_tel", "", "", "", true);
	static public final MCReportMeta ship_to_fax_META_0 = new MCReportMeta("ship_to_fax", "", "", "", true);
	static public final MCReportMeta ship_to_sundry_flg_META_0 = new MCReportMeta("ship_to_sundry_flg", "", "", "", true);
	static public final MCReportMeta dlv_id_typ_META_0 = new MCReportMeta("dlv_id_typ", "", "", "", true);
	static public final MCReportMeta dlv_id_cd_META_0 = new MCReportMeta("dlv_id_cd", "", "", "", true);
	static public final MCReportMeta dlv_id_nm_META_0 = new MCReportMeta("dlv_id_nm", "", "", "", true);
	static public final MCReportMeta cst_cd_META_0 = new MCReportMeta("cst_cd", "", "", "", true);
	static public final MCReportMeta cst_nm_META_0 = new MCReportMeta("cst_nm", "", "", "", true);
	static public final MCReportMeta dest_cd1_META_0 = new MCReportMeta("dest_cd1", "", "", "", true);
	static public final MCReportMeta dest_nm1_META_0 = new MCReportMeta("dest_nm1", "", "", "", true);
	static public final MCReportMeta dest_cd2_META_0 = new MCReportMeta("dest_cd2", "", "", "", true);
	static public final MCReportMeta dest_nm2_META_0 = new MCReportMeta("dest_nm2", "", "", "", true);
	static public final MCReportMeta dest_cd3_META_0 = new MCReportMeta("dest_cd3", "", "", "", true);
	static public final MCReportMeta dest_nm3_META_0 = new MCReportMeta("dest_nm3", "", "", "", true);
	static public final MCReportMeta inst_dpt_cd_META_0 = new MCReportMeta("inst_dpt_cd", "", "", "", true);
	static public final MCReportMeta inst_dpt_nm_META_0 = new MCReportMeta("inst_dpt_nm", "", "", "", true);
	static public final MCReportMeta inst_usr_cd_META_0 = new MCReportMeta("inst_usr_cd", "", "", "", true);
	static public final MCReportMeta inst_usr_nm_META_0 = new MCReportMeta("inst_usr_nm", "", "", "", true);
	static public final MCReportMeta ship_inst_d_no_META_0 = new MCReportMeta("ship_inst_d_no", "", "", "", true);
	static public final MCReportMeta ship_alloc_sts_no_META_0 = new MCReportMeta("ship_alloc_sts_no", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta iv_d_no_META_0 = new MCReportMeta("iv_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta ship_loc_cd_META_0 = new MCReportMeta("ship_loc_cd", "", "", "", true);
	static public final MCReportMeta ship_loc_nm_META_0 = new MCReportMeta("ship_loc_nm", "", "", "", true);
	static public final MCReportMeta ship_str_ln_cd_META_0 = new MCReportMeta("ship_str_ln_cd", "", "", "", true);
	static public final MCReportMeta ship_str_ln_nm_META_0 = new MCReportMeta("ship_str_ln_nm", "", "", "", true);
	static public final MCReportMeta ship_loc_tel_META_0 = new MCReportMeta("ship_loc_tel", "", "", "", true);
	static public final MCReportMeta ship_loc_fax_META_0 = new MCReportMeta("ship_loc_fax", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_hm_META_0 = new MCReportMeta("dlv_rqst_hm", "HM", "", "", true);
	static public final MCReportMeta pd_inst_dlv_dt_META_0 = new MCReportMeta("pd_inst_dlv_dt", "YMD", "", "", true);
	static public final MCReportMeta pd_inst_dlv_hm_META_0 = new MCReportMeta("pd_inst_dlv_hm", "HM", "", "", true);
	static public final MCReportMeta ship_rqst_dt_META_0 = new MCReportMeta("ship_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_rqst_hm_META_0 = new MCReportMeta("ship_rqst_hm", "HM", "", "", true);
	static public final MCReportMeta assort_flg_META_0 = new MCReportMeta("assort_flg", "", "", "", true);
	static public final MCReportMeta set_itm_grp_no_META_0 = new MCReportMeta("set_itm_grp_no", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno1_null_flg_META_0 = new MCReportMeta("sno1_null_flg", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno2_null_flg_META_0 = new MCReportMeta("sno2_null_flg", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno3_null_flg_META_0 = new MCReportMeta("sno3_null_flg", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta sno4_null_flg_META_0 = new MCReportMeta("sno4_null_flg", "", "", "", true);
	static public final MCReportMeta gd_cd_META_0 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_0 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_META_0 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta stk_insp_typ_META_0 = new MCReportMeta("stk_insp_typ", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_0 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_0 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_0 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta ent_unit_qty_META_0 = new MCReportMeta("ent_unit_qty", "", "", "", true);
	static public final MCReportMeta ent_unit_cd_META_0 = new MCReportMeta("ent_unit_cd", "", "", "", true);
	static public final MCReportMeta ent_unit_nm_META_0 = new MCReportMeta("ent_unit_nm", "", "", "", true);
	static public final MCReportMeta ent_unit_bnum_META_0 = new MCReportMeta("ent_unit_bnum", "", "", "", true);
	static public final MCReportMeta ent_unit_wt_META_0 = new MCReportMeta("ent_unit_wt", "", "", "", true);
	static public final MCReportMeta ent_unit_dim_META_0 = new MCReportMeta("ent_unit_dim", "", "", "", true);
	static public final MCReportMeta wt_unit_cd_META_0 = new MCReportMeta("wt_unit_cd", "", "", "", true);
	static public final MCReportMeta wt_unit_nm_META_0 = new MCReportMeta("wt_unit_nm", "", "", "", true);
	static public final MCReportMeta dim_unit_cd_META_0 = new MCReportMeta("dim_unit_cd", "", "", "", true);
	static public final MCReportMeta dim_unit_nm_META_0 = new MCReportMeta("dim_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta pack_unit_qty_META_0 = new MCReportMeta("pack_unit_qty", "", "", "", true);
	static public final MCReportMeta pack_unit_cd_META_0 = new MCReportMeta("pack_unit_cd", "", "", "", true);
	static public final MCReportMeta pack_unit_nm_META_0 = new MCReportMeta("pack_unit_nm", "", "", "", true);
	static public final MCReportMeta alloc_flg_META_0 = new MCReportMeta("alloc_flg", "", "", "", true);
	static public final MCReportMeta abort_flg_META_0 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta sls_acxfr_flg_META_0 = new MCReportMeta("sls_acxfr_flg", "", "", "", true);
	static public final MCReportMeta sls_cststk_flg_META_0 = new MCReportMeta("sls_cststk_flg", "", "", "", true);
	static public final MCReportMeta vmi_flg_META_0 = new MCReportMeta("vmi_flg", "", "", "", true);
	static public final MCReportMeta vld_dt_META_0 = new MCReportMeta("vld_dt", "YMD", "", "", true);
	static public final MCReportMeta lmt_dt_META_0 = new MCReportMeta("lmt_dt", "YMD", "", "", true);
	static public final MCReportMeta first_gr_dt_META_0 = new MCReportMeta("first_gr_dt", "YMD", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_0 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_0 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta prov_typ_META_0 = new MCReportMeta("prov_typ", "", "", "", true);
	static public final MCReportMeta prov_basis_typ_META_0 = new MCReportMeta("prov_basis_typ", "", "", "", true);
	static public final MCReportMeta ret_prov_typ_META_0 = new MCReportMeta("ret_prov_typ", "", "", "", true);
	static public final MCReportMeta ret_prov_basis_typ_META_0 = new MCReportMeta("ret_prov_basis_typ", "", "", "", true);
	static public final MCReportMeta rsn_cd_META_0 = new MCReportMeta("rsn_cd", "", "", "", true);
	static public final MCReportMeta rsn_nm_META_0 = new MCReportMeta("rsn_nm", "", "", "", true);
	static public final MCReportMeta inst_rmrks_META_0 = new MCReportMeta("inst_rmrks", "", "", "", true);
	static public final MCReportMeta inst_d_rmrks_META_0 = new MCReportMeta("inst_d_rmrks", "", "", "", true);
	static public final MCReportMeta ship_cnt_rmrks_META_0 = new MCReportMeta("ship_cnt_rmrks", "", "", "", true);
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
			dpstr_cd_META_0,
			dpstr_nm_META_0,
			site_co_cd_META_0,
			site_co_nm_META_0,
			ship_inst_no_META_0,
			ship_inst_rev_META_0,
			ship_fr_lg_grp_cd_META_0,
			ship_fr_lg_grp_nm_META_0,
			ship_inst_dt_META_0,
			ship_inst_hm_META_0,
			ship_schd_dt_META_0,
			ship_schd_hm_META_0,
			dlv_schd_dt_META_0,
			dlv_schd_hm_META_0,
			ship_wk_cd_META_0,
			ship_wk_nm_META_0,
			ship_term_cd_META_0,
			ship_term_nm_META_0,
			ship_to_lg_grp_cd_META_0,
			ship_to_lg_grp_nm_META_0,
			ship_to_id_typ_META_0,
			ship_to_id_cd_META_0,
			ship_to_id_nm_META_0,
			ship_to_zip_cd_META_0,
			ship_to_addr1_META_0,
			ship_to_addr2_META_0,
			ship_to_addr3_META_0,
			ship_to_addr4_META_0,
			ship_to_cntct_dpt_META_0,
			ship_to_cntct_psn_META_0,
			ship_to_tel_META_0,
			ship_to_fax_META_0,
			ship_to_sundry_flg_META_0,
			dlv_id_typ_META_0,
			dlv_id_cd_META_0,
			dlv_id_nm_META_0,
			cst_cd_META_0,
			cst_nm_META_0,
			dest_cd1_META_0,
			dest_nm1_META_0,
			dest_cd2_META_0,
			dest_nm2_META_0,
			dest_cd3_META_0,
			dest_nm3_META_0,
			inst_dpt_cd_META_0,
			inst_dpt_nm_META_0,
			inst_usr_cd_META_0,
			inst_usr_nm_META_0,
			ship_inst_d_no_META_0,
			ship_alloc_sts_no_META_0,
			iv_no_META_0,
			iv_d_no_META_0,
			dlv_slip_no_META_0,
			dlv_slip_d_no_META_0,
			trd_cd_META_0,
			trd_nm_META_0,
			trd_ptn_typ_META_0,
			ship_loc_cd_META_0,
			ship_loc_nm_META_0,
			ship_str_ln_cd_META_0,
			ship_str_ln_nm_META_0,
			ship_loc_tel_META_0,
			ship_loc_fax_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_hm_META_0,
			pd_inst_dlv_dt_META_0,
			pd_inst_dlv_hm_META_0,
			ship_rqst_dt_META_0,
			ship_rqst_hm_META_0,
			assort_flg_META_0,
			set_itm_grp_no_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			ver_no_META_0,
			sno1_META_0,
			sno1_null_flg_META_0,
			sno2_META_0,
			sno2_null_flg_META_0,
			sno3_META_0,
			sno3_null_flg_META_0,
			sno4_META_0,
			sno4_null_flg_META_0,
			gd_cd_META_0,
			gd_nm_META_0,
			quality_typ_META_0,
			stk_insp_typ_META_0,
			stk_id_typ_META_0,
			stk_bp_cd_META_0,
			stk_bp_nm_META_0,
			ent_unit_qty_META_0,
			ent_unit_cd_META_0,
			ent_unit_nm_META_0,
			ent_unit_bnum_META_0,
			ent_unit_wt_META_0,
			ent_unit_dim_META_0,
			wt_unit_cd_META_0,
			wt_unit_nm_META_0,
			dim_unit_cd_META_0,
			dim_unit_nm_META_0,
			trd_unit_qty_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			base_unit_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			pack_unit_qty_META_0,
			pack_unit_cd_META_0,
			pack_unit_nm_META_0,
			alloc_flg_META_0,
			abort_flg_META_0,
			sls_acxfr_flg_META_0,
			sls_cststk_flg_META_0,
			vmi_flg_META_0,
			vld_dt_META_0,
			lmt_dt_META_0,
			first_gr_dt_META_0,
			cst_itm_cd_META_0,
			cst_itm_nm_META_0,
			prov_typ_META_0,
			prov_basis_typ_META_0,
			ret_prov_typ_META_0,
			ret_prov_basis_typ_META_0,
			rsn_cd_META_0,
			rsn_nm_META_0,
			inst_rmrks_META_0,
			inst_d_rmrks_META_0,
			ship_cnt_rmrks_META_0,
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
	protected MSLAR_ShipInstPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

