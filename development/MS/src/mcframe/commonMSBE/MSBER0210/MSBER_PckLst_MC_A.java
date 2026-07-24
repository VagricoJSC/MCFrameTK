package mcframe.commonMSBE.MSBER0210;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBER_PckLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0210";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PCKLSTHDRR_RC = new MCReportClass("PckLstHdr", mcframe.commonMSBE.MSBER0210.PckLstHdrR.class);
	static public final MCReportClass PCKLSTDTLL_RC = new MCReportClass("PckLstDtl", mcframe.commonMSBE.MSBER0210.PckLstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PCKLSTHDRR_RC,
		PCKLSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta co_addr1_META_0 = new MCReportMeta("co_addr1", "", "", "", true);
	static public final MCReportMeta co_addr2_META_0 = new MCReportMeta("co_addr2", "", "", "", true);
	static public final MCReportMeta co_addr3_META_0 = new MCReportMeta("co_addr3", "", "", "", true);
	static public final MCReportMeta co_addr4_META_0 = new MCReportMeta("co_addr4", "", "", "", true);
	static public final MCReportMeta co_addr_META_0 = new MCReportMeta("co_addr", "", "", "", true);
	static public final MCReportMeta co_tel_META_0 = new MCReportMeta("co_tel", "", "", "", true);
	static public final MCReportMeta co_fax_META_0 = new MCReportMeta("co_fax", "", "", "", true);
	static public final MCReportMeta co_cntry_nm_META_0 = new MCReportMeta("co_cntry_nm", "", "", "", true);
	static public final MCReportMeta prnt_dt_META_0 = new MCReportMeta("prnt_dt", "YMD", "", "", true);
	static public final MCReportMeta iv_dt_META_0 = new MCReportMeta("iv_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_rqst_id_typ_META_0 = new MCReportMeta("ship_rqst_id_typ", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_cd_META_0 = new MCReportMeta("ship_rqst_id_cd", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_nm_META_0 = new MCReportMeta("ship_rqst_id_nm", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm1_META_0 = new MCReportMeta("ship_rqst_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm2_META_0 = new MCReportMeta("ship_rqst_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm3_META_0 = new MCReportMeta("ship_rqst_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta ship_rqst_id_alt_nm4_META_0 = new MCReportMeta("ship_rqst_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr1_META_0 = new MCReportMeta("ship_rqst_addr1", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr2_META_0 = new MCReportMeta("ship_rqst_addr2", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr3_META_0 = new MCReportMeta("ship_rqst_addr3", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr4_META_0 = new MCReportMeta("ship_rqst_addr4", "", "", "", true);
	static public final MCReportMeta ship_rqst_addr_META_0 = new MCReportMeta("ship_rqst_addr", "", "", "", true);
	static public final MCReportMeta ship_rqst_cntry_nm_META_0 = new MCReportMeta("ship_rqst_cntry_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_typ_META_0 = new MCReportMeta("dlv_id_typ", "", "", "", true);
	static public final MCReportMeta dlv_cd_META_0 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dlv_nm_META_0 = new MCReportMeta("dlv_nm", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm1_META_0 = new MCReportMeta("dlv_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm2_META_0 = new MCReportMeta("dlv_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm3_META_0 = new MCReportMeta("dlv_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm4_META_0 = new MCReportMeta("dlv_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_addr_META_0 = new MCReportMeta("dlv_addr", "", "", "", true);
	static public final MCReportMeta dlv_cntry_nm_META_0 = new MCReportMeta("dlv_cntry_nm", "", "", "", true);
	static public final MCReportMeta trnspt_cd_META_0 = new MCReportMeta("trnspt_cd", "", "", "", true);
	static public final MCReportMeta trnspt_nm_META_0 = new MCReportMeta("trnspt_nm", "", "", "", true);
	static public final MCReportMeta vssl_flght_META_0 = new MCReportMeta("vssl_flght", "", "", "", true);
	static public final MCReportMeta etd_dt_META_0 = new MCReportMeta("etd_dt", "YMD", "", "", true);
	static public final MCReportMeta load_port_cd_META_0 = new MCReportMeta("load_port_cd", "", "", "", true);
	static public final MCReportMeta load_port_nm_META_0 = new MCReportMeta("load_port_nm", "", "", "", true);
	static public final MCReportMeta dschrg_port_cd_META_0 = new MCReportMeta("dschrg_port_cd", "", "", "", true);
	static public final MCReportMeta dschrg_port_nm_META_0 = new MCReportMeta("dschrg_port_nm", "", "", "", true);
	static public final MCReportMeta via_port_cd_META_0 = new MCReportMeta("via_port_cd", "", "", "", true);
	static public final MCReportMeta via_port_nm_META_0 = new MCReportMeta("via_port_nm", "", "", "", true);
	static public final MCReportMeta tterm_cd3_META_0 = new MCReportMeta("tterm_cd3", "", "", "", true);
	static public final MCReportMeta tterm_nm3_META_0 = new MCReportMeta("tterm_nm3", "", "", "", true);
	static public final MCReportMeta tterm_rmrks3_META_0 = new MCReportMeta("tterm_rmrks3", "", "", "", true);
	static public final MCReportMeta lc_no_META_0 = new MCReportMeta("lc_no", "", "", "", true);
	static public final MCReportMeta lc_dt_META_0 = new MCReportMeta("lc_dt", "YMD", "", "", true);
	static public final MCReportMeta lc_rmrks_META_0 = new MCReportMeta("lc_rmrks", "", "", "", true);
	static public final MCReportMeta bl_no_META_0 = new MCReportMeta("bl_no", "", "", "", true);
	static public final MCReportMeta bl_dt_META_0 = new MCReportMeta("bl_dt", "YMD", "", "", true);
	static public final MCReportMeta bl_rmrks_META_0 = new MCReportMeta("bl_rmrks", "", "", "", true);
	static public final MCReportMeta case_mrk1_META_0 = new MCReportMeta("case_mrk1", "", "", "", true);
	static public final MCReportMeta case_mrk2_META_0 = new MCReportMeta("case_mrk2", "", "", "", true);
	static public final MCReportMeta case_mrk3_META_0 = new MCReportMeta("case_mrk3", "", "", "", true);
	static public final MCReportMeta case_mrk4_META_0 = new MCReportMeta("case_mrk4", "", "", "", true);
	static public final MCReportMeta case_mrk5_META_0 = new MCReportMeta("case_mrk5", "", "", "", true);
	static public final MCReportMeta case_mrk6_META_0 = new MCReportMeta("case_mrk6", "", "", "", true);
	static public final MCReportMeta pl_rmrks_META_0 = new MCReportMeta("pl_rmrks", "", "", "", true);
	static public final MCReportMeta iv_sub_char1_META_0 = new MCReportMeta("iv_sub_char1", "", "", "", true);
	static public final MCReportMeta iv_sub_char2_META_0 = new MCReportMeta("iv_sub_char2", "", "", "", true);
	static public final MCReportMeta iv_sub_char3_META_0 = new MCReportMeta("iv_sub_char3", "", "", "", true);
	static public final MCReportMeta prnt_lcl_cd_META_0 = new MCReportMeta("prnt_lcl_cd", "", "", "", true);

	static public final MCReportMeta t_cont_no_META_1 = new MCReportMeta("t_cont_no", "", "", "", true);
	static public final MCReportMeta t_itm_code_META_1 = new MCReportMeta("t_itm_code", "", "", "", true);
	static public final MCReportMeta t_qty_META_1 = new MCReportMeta("t_qty", "", "", "", true);
	static public final MCReportMeta t_net_META_1 = new MCReportMeta("t_net", "", "", "", true);
	static public final MCReportMeta t_grss_META_1 = new MCReportMeta("t_grss", "", "", "", true);
	static public final MCReportMeta t_dim_META_1 = new MCReportMeta("t_dim", "", "", "", true);
	static public final MCReportMeta cntnr_no_fr_META_1 = new MCReportMeta("cntnr_no_fr", "", "", "", true);
	static public final MCReportMeta cntnr_no_to_META_1 = new MCReportMeta("cntnr_no_to", "", "", "", true);
	static public final MCReportMeta cntnr_no_fr_to_META_1 = new MCReportMeta("cntnr_no_fr_to", "", "", "", true);
	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta cntry_org_cd_META_1 = new MCReportMeta("cntry_org_cd", "", "", "", true);
	static public final MCReportMeta cntry_org_nm_META_1 = new MCReportMeta("cntry_org_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_META_1 = new MCReportMeta("s_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_trd_unit_qty_META_1 = new MCReportMeta("s_int_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_trd_unit_qty_META_1 = new MCReportMeta("s_dec_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_dec_place_META_1 = new MCReportMeta("trd_unit_dec_place", "", "", "", true);
	static public final MCReportMeta wt_dec_place_META_1 = new MCReportMeta("wt_dec_place", "", "", "", true);
	static public final MCReportMeta dim_dec_place_META_1 = new MCReportMeta("dim_dec_place", "", "", "", true);
	static public final MCReportMeta net_wt_META_1 = new MCReportMeta("net_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_net_wt_META_1 = new MCReportMeta("s_net_wt", "", "", "", true);
	static public final MCReportMeta s_int_net_wt_META_1 = new MCReportMeta("s_int_net_wt", "", "", "", true);
	static public final MCReportMeta s_dec_net_wt_META_1 = new MCReportMeta("s_dec_net_wt", "", "", "", true);
	static public final MCReportMeta grss_wt_META_1 = new MCReportMeta("grss_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_grss_wt_META_1 = new MCReportMeta("s_grss_wt", "", "", "", true);
	static public final MCReportMeta s_int_grss_wt_META_1 = new MCReportMeta("s_int_grss_wt", "", "", "", true);
	static public final MCReportMeta s_dec_grss_wt_META_1 = new MCReportMeta("s_dec_grss_wt", "", "", "", true);
	static public final MCReportMeta dim_META_1 = new MCReportMeta("dim", "COMMA", "", "", true);
	static public final MCReportMeta s_dim_META_1 = new MCReportMeta("s_dim", "", "", "", true);
	static public final MCReportMeta s_int_dim_META_1 = new MCReportMeta("s_int_dim", "", "", "", true);
	static public final MCReportMeta s_dec_dim_META_1 = new MCReportMeta("s_dec_dim", "", "", "", true);
	static public final MCReportMeta container_META_1 = new MCReportMeta("container", "", "", "", true);
	static public final MCReportMeta iv_itm_nm_META_1 = new MCReportMeta("iv_itm_nm", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm1_META_1 = new MCReportMeta("iv_itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm2_META_1 = new MCReportMeta("iv_itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm3_META_1 = new MCReportMeta("iv_itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta iv_itm_alt_nm4_META_1 = new MCReportMeta("iv_itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta pl_d_sub_char1_META_1 = new MCReportMeta("pl_d_sub_char1", "", "", "", true);
	static public final MCReportMeta pl_d_sub_char2_META_1 = new MCReportMeta("pl_d_sub_char2", "", "", "", true);
	static public final MCReportMeta pl_d_sub_char3_META_1 = new MCReportMeta("pl_d_sub_char3", "", "", "", true);
	static public final MCReportMeta t_total_META_1 = new MCReportMeta("t_total", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_qty_META_1 = new MCReportMeta("sum_trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_trd_unit_qty_META_1 = new MCReportMeta("s_sum_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_int_sum_trd_unit_qty_META_1 = new MCReportMeta("s_int_sum_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_sum_trd_unit_qty_META_1 = new MCReportMeta("s_dec_sum_trd_unit_qty", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_nm_META_1 = new MCReportMeta("sum_trd_unit_nm", "", "", "", true);
	static public final MCReportMeta sum_trd_unit_cd_META_1 = new MCReportMeta("sum_trd_unit_cd", "", "", "", true);
	static public final MCReportMeta sum_net_wt_META_1 = new MCReportMeta("sum_net_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_net_wt_META_1 = new MCReportMeta("s_sum_net_wt", "", "", "", true);
	static public final MCReportMeta sum_grss_wt_META_1 = new MCReportMeta("sum_grss_wt", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_grss_wt_META_1 = new MCReportMeta("s_sum_grss_wt", "", "", "", true);
	static public final MCReportMeta sum_dim_META_1 = new MCReportMeta("sum_dim", "COMMA", "", "", true);
	static public final MCReportMeta s_sum_dim_META_1 = new MCReportMeta("s_sum_dim", "", "", "", true);
	static public final MCReportMeta f_cntry_org_cd_META_1 = new MCReportMeta("f_cntry_org_cd", "", "", "", true);
	static public final MCReportMeta t_made_in_META_1 = new MCReportMeta("t_made_in", "", "", "", true);
	static public final MCReportMeta f_cntry_org_nm_META_1 = new MCReportMeta("f_cntry_org_nm", "", "", "", true);
	static public final MCReportMeta free_META_1 = new MCReportMeta("free", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PckLstHdr",
			iv_no_META_0,
			co_nm_META_0,
			co_addr1_META_0,
			co_addr2_META_0,
			co_addr3_META_0,
			co_addr4_META_0,
			co_addr_META_0,
			co_tel_META_0,
			co_fax_META_0,
			co_cntry_nm_META_0,
			prnt_dt_META_0,
			iv_dt_META_0,
			ship_rqst_id_typ_META_0,
			ship_rqst_id_cd_META_0,
			ship_rqst_id_nm_META_0,
			ship_rqst_id_alt_nm1_META_0,
			ship_rqst_id_alt_nm2_META_0,
			ship_rqst_id_alt_nm3_META_0,
			ship_rqst_id_alt_nm4_META_0,
			ship_rqst_addr1_META_0,
			ship_rqst_addr2_META_0,
			ship_rqst_addr3_META_0,
			ship_rqst_addr4_META_0,
			ship_rqst_addr_META_0,
			ship_rqst_cntry_nm_META_0,
			dlv_id_typ_META_0,
			dlv_cd_META_0,
			dlv_nm_META_0,
			dlv_alt_nm1_META_0,
			dlv_alt_nm2_META_0,
			dlv_alt_nm3_META_0,
			dlv_alt_nm4_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_addr_META_0,
			dlv_cntry_nm_META_0,
			trnspt_cd_META_0,
			trnspt_nm_META_0,
			vssl_flght_META_0,
			etd_dt_META_0,
			load_port_cd_META_0,
			load_port_nm_META_0,
			dschrg_port_cd_META_0,
			dschrg_port_nm_META_0,
			via_port_cd_META_0,
			via_port_nm_META_0,
			tterm_cd3_META_0,
			tterm_nm3_META_0,
			tterm_rmrks3_META_0,
			lc_no_META_0,
			lc_dt_META_0,
			lc_rmrks_META_0,
			bl_no_META_0,
			bl_dt_META_0,
			bl_rmrks_META_0,
			case_mrk1_META_0,
			case_mrk2_META_0,
			case_mrk3_META_0,
			case_mrk4_META_0,
			case_mrk5_META_0,
			case_mrk6_META_0,
			pl_rmrks_META_0,
			iv_sub_char1_META_0,
			iv_sub_char2_META_0,
			iv_sub_char3_META_0,
			prnt_lcl_cd_META_0
		);
		reportMetaMap.add("PckLstDtl",
			t_cont_no_META_1,
			t_itm_code_META_1,
			t_qty_META_1,
			t_net_META_1,
			t_grss_META_1,
			t_dim_META_1,
			cntnr_no_fr_META_1,
			cntnr_no_to_META_1,
			cntnr_no_fr_to_META_1,
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub2_view_META_1,
			itm_sub3_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_data_META_1,
			itm_sub3_data_META_1,
			cntry_org_cd_META_1,
			cntry_org_nm_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_META_1,
			s_int_trd_unit_qty_META_1,
			s_dec_trd_unit_qty_META_1,
			trd_unit_nm_META_1,
			trd_unit_cd_META_1,
			trd_unit_dec_place_META_1,
			wt_dec_place_META_1,
			dim_dec_place_META_1,
			net_wt_META_1,
			s_net_wt_META_1,
			s_int_net_wt_META_1,
			s_dec_net_wt_META_1,
			grss_wt_META_1,
			s_grss_wt_META_1,
			s_int_grss_wt_META_1,
			s_dec_grss_wt_META_1,
			dim_META_1,
			s_dim_META_1,
			s_int_dim_META_1,
			s_dec_dim_META_1,
			container_META_1,
			iv_itm_nm_META_1,
			iv_itm_alt_nm1_META_1,
			iv_itm_alt_nm2_META_1,
			iv_itm_alt_nm3_META_1,
			iv_itm_alt_nm4_META_1,
			cst_itm_cd_META_1,
			cst_itm_nm_META_1,
			disp_seq_META_1,
			pl_d_sub_char1_META_1,
			pl_d_sub_char2_META_1,
			pl_d_sub_char3_META_1,
			t_total_META_1,
			sum_trd_unit_qty_META_1,
			s_sum_trd_unit_qty_META_1,
			s_int_sum_trd_unit_qty_META_1,
			s_dec_sum_trd_unit_qty_META_1,
			sum_trd_unit_nm_META_1,
			sum_trd_unit_cd_META_1,
			sum_net_wt_META_1,
			s_sum_net_wt_META_1,
			sum_grss_wt_META_1,
			s_sum_grss_wt_META_1,
			sum_dim_META_1,
			s_sum_dim_META_1,
			f_cntry_org_cd_META_1,
			t_made_in_META_1,
			f_cntry_org_nm_META_1,
			free_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBER_PckLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

