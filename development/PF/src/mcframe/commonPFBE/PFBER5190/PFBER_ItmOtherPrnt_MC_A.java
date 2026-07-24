package mcframe.commonPFBE.PFBER5190;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBER_ItmOtherPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBER5190";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBE.PFBER5190.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_nm_en_META_0 = new MCReportMeta("itm_nm_en", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_en_META_0 = new MCReportMeta("itm_alt_nm1_en", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_en_META_0 = new MCReportMeta("itm_alt_nm2_en", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_en_META_0 = new MCReportMeta("itm_alt_nm3_en", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_en_META_0 = new MCReportMeta("itm_alt_nm4_en", "", "", "", true);
	static public final MCReportMeta itm_grp_cd1_META_0 = new MCReportMeta("itm_grp_cd1", "", "", "", true);
	static public final MCReportMeta itm_grp_cd2_META_0 = new MCReportMeta("itm_grp_cd2", "", "", "", true);
	static public final MCReportMeta itm_grp_cd3_META_0 = new MCReportMeta("itm_grp_cd3", "", "", "", true);
	static public final MCReportMeta itm_grp_cd4_META_0 = new MCReportMeta("itm_grp_cd4", "", "", "", true);
	static public final MCReportMeta itm_grp_cd5_META_0 = new MCReportMeta("itm_grp_cd5", "", "", "", true);
	static public final MCReportMeta itm_grp_cd6_META_0 = new MCReportMeta("itm_grp_cd6", "", "", "", true);
	static public final MCReportMeta itm_grp_cd7_META_0 = new MCReportMeta("itm_grp_cd7", "", "", "", true);
	static public final MCReportMeta itm_grp_cd8_META_0 = new MCReportMeta("itm_grp_cd8", "", "", "", true);
	static public final MCReportMeta itm_grp_cd9_META_0 = new MCReportMeta("itm_grp_cd9", "", "", "", true);
	static public final MCReportMeta itm_grp_cd10_META_0 = new MCReportMeta("itm_grp_cd10", "", "", "", true);
	static public final MCReportMeta stk_mng_typ_META_0 = new MCReportMeta("stk_mng_typ", "", "", "", true);
	static public final MCReportMeta asset_mng_typ_META_0 = new MCReportMeta("asset_mng_typ", "", "", "", true);
	static public final MCReportMeta sundry_itm_flg_META_0 = new MCReportMeta("sundry_itm_flg", "", "", "", true);
	static public final MCReportMeta dscnt_itm_flg_META_0 = new MCReportMeta("dscnt_itm_flg", "", "", "", true);
	static public final MCReportMeta unit_cd_META_0 = new MCReportMeta("unit_cd", "", "", "", true);
	static public final MCReportMeta dec_place_META_0 = new MCReportMeta("dec_place", "", "", "", true);
	static public final MCReportMeta rnd_typ_META_0 = new MCReportMeta("rnd_typ", "", "", "", true);
	static public final MCReportMeta dim_unit_cd_META_0 = new MCReportMeta("dim_unit_cd", "", "", "", true);
	static public final MCReportMeta dim_META_0 = new MCReportMeta("dim", "", "", "", true);
	static public final MCReportMeta wt_unit_cd_META_0 = new MCReportMeta("wt_unit_cd", "", "", "", true);
	static public final MCReportMeta wt_META_0 = new MCReportMeta("wt", "", "", "", true);
	static public final MCReportMeta conts_unit_cd_META_0 = new MCReportMeta("conts_unit_cd", "", "", "", true);
	static public final MCReportMeta conts_qty_META_0 = new MCReportMeta("conts_qty", "", "", "", true);
	static public final MCReportMeta unit_dim_META_0 = new MCReportMeta("unit_dim", "", "", "", true);
	static public final MCReportMeta unit_wt_META_0 = new MCReportMeta("unit_wt", "", "", "", true);
	static public final MCReportMeta hs_cd_META_0 = new MCReportMeta("hs_cd", "", "", "", true);
	static public final MCReportMeta jan_typ_META_0 = new MCReportMeta("jan_typ", "", "", "", true);
	static public final MCReportMeta jan_cd_META_0 = new MCReportMeta("jan_cd", "", "", "", true);
	static public final MCReportMeta itf_cd_META_0 = new MCReportMeta("itf_cd", "", "", "", true);
	static public final MCReportMeta gtin_cd_META_0 = new MCReportMeta("gtin_cd", "", "", "", true);
	static public final MCReportMeta sls_itm_grp_cd_META_0 = new MCReportMeta("sls_itm_grp_cd", "", "", "", true);
	static public final MCReportMeta memo1_c_META_0 = new MCReportMeta("memo1_c", "", "", "", true);
	static public final MCReportMeta memo2_c_META_0 = new MCReportMeta("memo2_c", "", "", "", true);
	static public final MCReportMeta memo3_c_META_0 = new MCReportMeta("memo3_c", "", "", "", true);
	static public final MCReportMeta itm_typ_META_0 = new MCReportMeta("itm_typ", "", "", "", true);
	static public final MCReportMeta itm_typ_d_cd_META_0 = new MCReportMeta("itm_typ_d_cd", "", "", "", true);
	static public final MCReportMeta itm_jnl_cd_META_0 = new MCReportMeta("itm_jnl_cd", "", "", "", true);
	static public final MCReportMeta ac_itm_grp_cd_META_0 = new MCReportMeta("ac_itm_grp_cd", "", "", "", true);
	static public final MCReportMeta minus_stk_flg_META_0 = new MCReportMeta("minus_stk_flg", "", "", "", true);
	static public final MCReportMeta not_new_lot_flg_META_0 = new MCReportMeta("not_new_lot_flg", "", "", "", true);
	static public final MCReportMeta gi_alloc_flg_META_0 = new MCReportMeta("gi_alloc_flg", "", "", "", true);
	static public final MCReportMeta sls_tax_cd_META_0 = new MCReportMeta("sls_tax_cd", "", "", "", true);
	static public final MCReportMeta new_sls_tax_cd_META_0 = new MCReportMeta("new_sls_tax_cd", "", "", "", true);
	static public final MCReportMeta new_sls_tax_dt_META_0 = new MCReportMeta("new_sls_tax_dt", "YMD", "", "", true);
	static public final MCReportMeta purc_tax_cd_META_0 = new MCReportMeta("purc_tax_cd", "", "", "", true);
	static public final MCReportMeta new_purc_tax_cd_META_0 = new MCReportMeta("new_purc_tax_cd", "", "", "", true);
	static public final MCReportMeta new_purc_tax_dt_META_0 = new MCReportMeta("new_purc_tax_dt", "YMD", "", "", true);
	static public final MCReportMeta prov_tax_cd_META_0 = new MCReportMeta("prov_tax_cd", "", "", "", true);
	static public final MCReportMeta new_prov_tax_cd_META_0 = new MCReportMeta("new_prov_tax_cd", "", "", "", true);
	static public final MCReportMeta new_prov_tax_dt_META_0 = new MCReportMeta("new_prov_tax_dt", "YMD", "", "", true);
	static public final MCReportMeta wtax_rate_META_0 = new MCReportMeta("wtax_rate", "", "", "", true);
	static public final MCReportMeta ship_unit_cd_META_0 = new MCReportMeta("ship_unit_cd", "", "", "", true);
	static public final MCReportMeta mfg_unit_cd_META_0 = new MCReportMeta("mfg_unit_cd", "", "", "", true);
	static public final MCReportMeta purc_unit_cd_META_0 = new MCReportMeta("purc_unit_cd", "", "", "", true);
	static public final MCReportMeta po_schd_unit_cd_META_0 = new MCReportMeta("po_schd_unit_cd", "", "", "", true);
	static public final MCReportMeta pack_alloc_flg_META_0 = new MCReportMeta("pack_alloc_flg", "", "", "", true);
	static public final MCReportMeta pckg_unit_cd_META_0 = new MCReportMeta("pckg_unit_cd", "", "", "", true);
	static public final MCReportMeta lot_mng_typ_META_0 = new MCReportMeta("lot_mng_typ", "", "", "", true);
	static public final MCReportMeta lot_no_typ_META_0 = new MCReportMeta("lot_no_typ", "", "", "", true);
	static public final MCReportMeta lot_no_ptn_cd_META_0 = new MCReportMeta("lot_no_ptn_cd", "", "", "", true);
	static public final MCReportMeta sublot_mng_typ_META_0 = new MCReportMeta("sublot_mng_typ", "", "", "", true);
	static public final MCReportMeta sublot_no_typ_META_0 = new MCReportMeta("sublot_no_typ", "", "", "", true);
	static public final MCReportMeta sublot_no_ptn_cd_META_0 = new MCReportMeta("sublot_no_ptn_cd", "", "", "", true);
	static public final MCReportMeta bp_lot_flg_META_0 = new MCReportMeta("bp_lot_flg", "", "", "", true);
	static public final MCReportMeta insp_bind_typ_META_0 = new MCReportMeta("insp_bind_typ", "", "", "", true);
	static public final MCReportMeta skip_chk_ship_flg_META_0 = new MCReportMeta("skip_chk_ship_flg", "", "", "", true);
	static public final MCReportMeta mrkt_judg_flg_META_0 = new MCReportMeta("mrkt_judg_flg", "", "", "", true);
	static public final MCReportMeta mrkt_judg_role_cd_META_0 = new MCReportMeta("mrkt_judg_role_cd", "", "", "", true);
	static public final MCReportMeta mrkt_judg_upd_role_cd_META_0 = new MCReportMeta("mrkt_judg_upd_role_cd", "", "", "", true);
	static public final MCReportMeta lmt_ctl_flg_META_0 = new MCReportMeta("lmt_ctl_flg", "", "", "", true);
	static public final MCReportMeta lmt_ctl_categ_META_0 = new MCReportMeta("lmt_ctl_categ", "", "", "", true);
	static public final MCReportMeta cont_fctr_flg_META_0 = new MCReportMeta("cont_fctr_flg", "", "", "", true);
	static public final MCReportMeta std_cont_fctr_META_0 = new MCReportMeta("std_cont_fctr", "", "", "", true);
	static public final MCReportMeta cont_fctr_unit_cd_META_0 = new MCReportMeta("cont_fctr_unit_cd", "", "", "", true);
	static public final MCReportMeta cont_fctr_rnd_typ_META_0 = new MCReportMeta("cont_fctr_rnd_typ", "", "", "", true);
	static public final MCReportMeta cont_fctr_dec_place_META_0 = new MCReportMeta("cont_fctr_dec_place", "", "", "", true);
	static public final MCReportMeta sno1_mng_typ_META_0 = new MCReportMeta("sno1_mng_typ", "", "", "", true);
	static public final MCReportMeta slo_sno1_flg_META_0 = new MCReportMeta("slo_sno1_flg", "", "", "", true);
	static public final MCReportMeta rqmt_sno1_flg_META_0 = new MCReportMeta("rqmt_sno1_flg", "", "", "", true);
	static public final MCReportMeta sno1_num_typ_META_0 = new MCReportMeta("sno1_num_typ", "", "", "", true);
	static public final MCReportMeta sno1_ptn_cd_META_0 = new MCReportMeta("sno1_ptn_cd", "", "", "", true);
	static public final MCReportMeta sno2_mng_typ_META_0 = new MCReportMeta("sno2_mng_typ", "", "", "", true);
	static public final MCReportMeta slo_sno2_flg_META_0 = new MCReportMeta("slo_sno2_flg", "", "", "", true);
	static public final MCReportMeta rqmt_sno2_flg_META_0 = new MCReportMeta("rqmt_sno2_flg", "", "", "", true);
	static public final MCReportMeta sno2_num_typ_META_0 = new MCReportMeta("sno2_num_typ", "", "", "", true);
	static public final MCReportMeta sno2_ptn_cd_META_0 = new MCReportMeta("sno2_ptn_cd", "", "", "", true);
	static public final MCReportMeta sno3_mng_typ_META_0 = new MCReportMeta("sno3_mng_typ", "", "", "", true);
	static public final MCReportMeta slo_sno3_flg_META_0 = new MCReportMeta("slo_sno3_flg", "", "", "", true);
	static public final MCReportMeta rqmt_sno3_flg_META_0 = new MCReportMeta("rqmt_sno3_flg", "", "", "", true);
	static public final MCReportMeta sno3_num_typ_META_0 = new MCReportMeta("sno3_num_typ", "", "", "", true);
	static public final MCReportMeta sno3_ptn_cd_META_0 = new MCReportMeta("sno3_ptn_cd", "", "", "", true);
	static public final MCReportMeta sno4_mng_typ_META_0 = new MCReportMeta("sno4_mng_typ", "", "", "", true);
	static public final MCReportMeta slo_sno4_flg_META_0 = new MCReportMeta("slo_sno4_flg", "", "", "", true);
	static public final MCReportMeta rqmt_sno4_flg_META_0 = new MCReportMeta("rqmt_sno4_flg", "", "", "", true);
	static public final MCReportMeta sno4_num_typ_META_0 = new MCReportMeta("sno4_num_typ", "", "", "", true);
	static public final MCReportMeta sno4_ptn_cd_META_0 = new MCReportMeta("sno4_ptn_cd", "", "", "", true);
	static public final MCReportMeta def_bom_ptn_META_0 = new MCReportMeta("def_bom_ptn", "", "", "", true);
	static public final MCReportMeta mfg_inst_unit_typ_META_0 = new MCReportMeta("mfg_inst_unit_typ", "", "", "", true);
	static public final MCReportMeta mrp_proc_typ_META_0 = new MCReportMeta("mrp_proc_typ", "", "", "", true);
	static public final MCReportMeta rqmt_typ_META_0 = new MCReportMeta("rqmt_typ", "", "", "", true);
	static public final MCReportMeta prod_pln_typ_META_0 = new MCReportMeta("prod_pln_typ", "", "", "", true);
	static public final MCReportMeta dmnd_date_div_mons_META_0 = new MCReportMeta("dmnd_date_div_mons", "", "", "", true);
	static public final MCReportMeta alloc_margin_days_META_0 = new MCReportMeta("alloc_margin_days", "", "", "", true);
	static public final MCReportMeta mrp_alloc_margin_days_META_0 = new MCReportMeta("mrp_alloc_margin_days", "", "", "", true);
	static public final MCReportMeta mrp_opn_xfr_days_META_0 = new MCReportMeta("mrp_opn_xfr_days", "", "", "", true);
	static public final MCReportMeta rqmt_rstr_qty_META_0 = new MCReportMeta("rqmt_rstr_qty", "", "", "", true);
	static public final MCReportMeta inpt_itm_add_flg_META_0 = new MCReportMeta("inpt_itm_add_flg", "", "", "", true);
	static public final MCReportMeta inpt_itm_del_flg_META_0 = new MCReportMeta("inpt_itm_del_flg", "", "", "", true);
	static public final MCReportMeta sch_flg_META_0 = new MCReportMeta("sch_flg", "", "", "", true);
	static public final MCReportMeta cntry_org_cd_META_0 = new MCReportMeta("cntry_org_cd", "", "", "", true);
	static public final MCReportMeta comp_spec_typ_META_0 = new MCReportMeta("comp_spec_typ", "", "", "", true);
	static public final MCReportMeta comp_rev_at_slo_flg_META_0 = new MCReportMeta("comp_rev_at_slo_flg", "", "", "", true);
	static public final MCReportMeta comp_core_itm_flg_META_0 = new MCReportMeta("comp_core_itm_flg", "", "", "", true);
	static public final MCReportMeta itm_spec_grp_cd_META_0 = new MCReportMeta("itm_spec_grp_cd", "", "", "", true);
	static public final MCReportMeta sls_upri_grp_cd_META_0 = new MCReportMeta("sls_upri_grp_cd", "", "", "", true);
	static public final MCReportMeta bill_crryovr_times_META_0 = new MCReportMeta("bill_crryovr_times", "", "", "", true);
	static public final MCReportMeta pay_crryovr_times_META_0 = new MCReportMeta("pay_crryovr_times", "", "", "", true);
	static public final MCReportMeta slo_proc_flg_META_0 = new MCReportMeta("slo_proc_flg", "", "", "", true);
	static public final MCReportMeta slo_proc_typ_META_0 = new MCReportMeta("slo_proc_typ", "", "", "", true);
	static public final MCReportMeta ship_inst_typ_META_0 = new MCReportMeta("ship_inst_typ", "", "", "", true);
	static public final MCReportMeta ship_lot_back_stop_flg_META_0 = new MCReportMeta("ship_lot_back_stop_flg", "", "", "", true);
	static public final MCReportMeta itm_ship_grp_cd_META_0 = new MCReportMeta("itm_ship_grp_cd", "", "", "", true);
	static public final MCReportMeta ship_valid_grp_cd_META_0 = new MCReportMeta("ship_valid_grp_cd", "", "", "", true);
	static public final MCReportMeta arr_skip_flg_META_0 = new MCReportMeta("arr_skip_flg", "", "", "", true);
	static public final MCReportMeta ship_term_cd_META_0 = new MCReportMeta("ship_term_cd", "", "", "", true);
	static public final MCReportMeta exim_xpns_typ_META_0 = new MCReportMeta("exim_xpns_typ", "", "", "", true);
	static public final MCReportMeta stk_lst_flg_META_0 = new MCReportMeta("stk_lst_flg", "", "", "", true);
	static public final MCReportMeta ver_flg_META_0 = new MCReportMeta("ver_flg", "", "", "", true);
	static public final MCReportMeta sls_upri_cng_flg_META_0 = new MCReportMeta("sls_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta purc_upri_cng_flg_META_0 = new MCReportMeta("purc_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta prov_upri_cng_flg_META_0 = new MCReportMeta("prov_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta ext_sys_no_itm_META_0 = new MCReportMeta("ext_sys_no_itm", "", "", "", true);
	static public final MCReportMeta chng_no_META_0 = new MCReportMeta("chng_no", "", "", "", true);
	static public final MCReportMeta calc_ptn_cd_META_0 = new MCReportMeta("calc_ptn_cd", "", "", "", true);
	static public final MCReportMeta cost_std_qty_META_0 = new MCReportMeta("cost_std_qty", "", "", "", true);
	static public final MCReportMeta itm_alc_grp_META_0 = new MCReportMeta("itm_alc_grp", "", "", "", true);
	static public final MCReportMeta memo1_META_0 = new MCReportMeta("memo1", "", "", "", true);
	static public final MCReportMeta memo2_META_0 = new MCReportMeta("memo2", "", "", "", true);
	static public final MCReportMeta memo3_META_0 = new MCReportMeta("memo3", "", "", "", true);
	static public final MCReportMeta del_flg_META_0 = new MCReportMeta("del_flg", "", "", "", true);
	static public final MCReportMeta if_sub_char1_META_0 = new MCReportMeta("if_sub_char1", "", "", "", true);
	static public final MCReportMeta if_sub_char2_META_0 = new MCReportMeta("if_sub_char2", "", "", "", true);
	static public final MCReportMeta if_sub_char3_META_0 = new MCReportMeta("if_sub_char3", "", "", "", true);
	static public final MCReportMeta if_sub_char4_META_0 = new MCReportMeta("if_sub_char4", "", "", "", true);
	static public final MCReportMeta if_sub_char5_META_0 = new MCReportMeta("if_sub_char5", "", "", "", true);
	static public final MCReportMeta if_sub_char6_META_0 = new MCReportMeta("if_sub_char6", "", "", "", true);
	static public final MCReportMeta if_sub_char7_META_0 = new MCReportMeta("if_sub_char7", "", "", "", true);
	static public final MCReportMeta if_sub_char8_META_0 = new MCReportMeta("if_sub_char8", "", "", "", true);
	static public final MCReportMeta if_sub_char9_META_0 = new MCReportMeta("if_sub_char9", "", "", "", true);
	static public final MCReportMeta if_sub_char10_META_0 = new MCReportMeta("if_sub_char10", "", "", "", true);
	static public final MCReportMeta if_sub_char11_META_0 = new MCReportMeta("if_sub_char11", "", "", "", true);
	static public final MCReportMeta if_sub_char12_META_0 = new MCReportMeta("if_sub_char12", "", "", "", true);
	static public final MCReportMeta if_sub_char13_META_0 = new MCReportMeta("if_sub_char13", "", "", "", true);
	static public final MCReportMeta if_sub_char14_META_0 = new MCReportMeta("if_sub_char14", "", "", "", true);
	static public final MCReportMeta if_sub_char15_META_0 = new MCReportMeta("if_sub_char15", "", "", "", true);
	static public final MCReportMeta if_sub_char16_META_0 = new MCReportMeta("if_sub_char16", "", "", "", true);
	static public final MCReportMeta if_sub_char17_META_0 = new MCReportMeta("if_sub_char17", "", "", "", true);
	static public final MCReportMeta if_sub_char18_META_0 = new MCReportMeta("if_sub_char18", "", "", "", true);
	static public final MCReportMeta if_sub_char19_META_0 = new MCReportMeta("if_sub_char19", "", "", "", true);
	static public final MCReportMeta if_sub_char20_META_0 = new MCReportMeta("if_sub_char20", "", "", "", true);
	static public final MCReportMeta if_sub_char21_META_0 = new MCReportMeta("if_sub_char21", "", "", "", true);
	static public final MCReportMeta if_sub_char22_META_0 = new MCReportMeta("if_sub_char22", "", "", "", true);
	static public final MCReportMeta if_sub_char23_META_0 = new MCReportMeta("if_sub_char23", "", "", "", true);
	static public final MCReportMeta if_sub_char24_META_0 = new MCReportMeta("if_sub_char24", "", "", "", true);
	static public final MCReportMeta if_sub_char25_META_0 = new MCReportMeta("if_sub_char25", "", "", "", true);
	static public final MCReportMeta if_sub_char26_META_0 = new MCReportMeta("if_sub_char26", "", "", "", true);
	static public final MCReportMeta if_sub_char27_META_0 = new MCReportMeta("if_sub_char27", "", "", "", true);
	static public final MCReportMeta if_sub_char28_META_0 = new MCReportMeta("if_sub_char28", "", "", "", true);
	static public final MCReportMeta if_sub_char29_META_0 = new MCReportMeta("if_sub_char29", "", "", "", true);
	static public final MCReportMeta if_sub_char30_META_0 = new MCReportMeta("if_sub_char30", "", "", "", true);
	static public final MCReportMeta if_sub_num1_META_0 = new MCReportMeta("if_sub_num1", "", "", "", true);
	static public final MCReportMeta if_sub_num2_META_0 = new MCReportMeta("if_sub_num2", "", "", "", true);
	static public final MCReportMeta if_sub_num3_META_0 = new MCReportMeta("if_sub_num3", "", "", "", true);
	static public final MCReportMeta if_sub_num4_META_0 = new MCReportMeta("if_sub_num4", "", "", "", true);
	static public final MCReportMeta if_sub_num5_META_0 = new MCReportMeta("if_sub_num5", "", "", "", true);
	static public final MCReportMeta if_sub_dt1_META_0 = new MCReportMeta("if_sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt2_META_0 = new MCReportMeta("if_sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt3_META_0 = new MCReportMeta("if_sub_dt3", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt4_META_0 = new MCReportMeta("if_sub_dt4", "YMD", "", "", true);
	static public final MCReportMeta if_sub_dt5_META_0 = new MCReportMeta("if_sub_dt5", "YMD", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_crud_typ_META_0,
			co_cd_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			itm_nm_en_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm1_en_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm2_en_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm3_en_META_0,
			itm_alt_nm4_META_0,
			itm_alt_nm4_en_META_0,
			itm_grp_cd1_META_0,
			itm_grp_cd2_META_0,
			itm_grp_cd3_META_0,
			itm_grp_cd4_META_0,
			itm_grp_cd5_META_0,
			itm_grp_cd6_META_0,
			itm_grp_cd7_META_0,
			itm_grp_cd8_META_0,
			itm_grp_cd9_META_0,
			itm_grp_cd10_META_0,
			stk_mng_typ_META_0,
			asset_mng_typ_META_0,
			sundry_itm_flg_META_0,
			dscnt_itm_flg_META_0,
			unit_cd_META_0,
			dec_place_META_0,
			rnd_typ_META_0,
			dim_unit_cd_META_0,
			dim_META_0,
			wt_unit_cd_META_0,
			wt_META_0,
			conts_unit_cd_META_0,
			conts_qty_META_0,
			unit_dim_META_0,
			unit_wt_META_0,
			hs_cd_META_0,
			jan_typ_META_0,
			jan_cd_META_0,
			itf_cd_META_0,
			gtin_cd_META_0,
			sls_itm_grp_cd_META_0,
			memo1_c_META_0,
			memo2_c_META_0,
			memo3_c_META_0,
			itm_typ_META_0,
			itm_typ_d_cd_META_0,
			itm_jnl_cd_META_0,
			ac_itm_grp_cd_META_0,
			minus_stk_flg_META_0,
			not_new_lot_flg_META_0,
			gi_alloc_flg_META_0,
			sls_tax_cd_META_0,
			new_sls_tax_cd_META_0,
			new_sls_tax_dt_META_0,
			purc_tax_cd_META_0,
			new_purc_tax_cd_META_0,
			new_purc_tax_dt_META_0,
			prov_tax_cd_META_0,
			new_prov_tax_cd_META_0,
			new_prov_tax_dt_META_0,
			wtax_rate_META_0,
			ship_unit_cd_META_0,
			mfg_unit_cd_META_0,
			purc_unit_cd_META_0,
			po_schd_unit_cd_META_0,
			pack_alloc_flg_META_0,
			pckg_unit_cd_META_0,
			lot_mng_typ_META_0,
			lot_no_typ_META_0,
			lot_no_ptn_cd_META_0,
			sublot_mng_typ_META_0,
			sublot_no_typ_META_0,
			sublot_no_ptn_cd_META_0,
			bp_lot_flg_META_0,
			insp_bind_typ_META_0,
			skip_chk_ship_flg_META_0,
			mrkt_judg_flg_META_0,
			mrkt_judg_role_cd_META_0,
			mrkt_judg_upd_role_cd_META_0,
			lmt_ctl_flg_META_0,
			lmt_ctl_categ_META_0,
			cont_fctr_flg_META_0,
			std_cont_fctr_META_0,
			cont_fctr_unit_cd_META_0,
			cont_fctr_rnd_typ_META_0,
			cont_fctr_dec_place_META_0,
			sno1_mng_typ_META_0,
			slo_sno1_flg_META_0,
			rqmt_sno1_flg_META_0,
			sno1_num_typ_META_0,
			sno1_ptn_cd_META_0,
			sno2_mng_typ_META_0,
			slo_sno2_flg_META_0,
			rqmt_sno2_flg_META_0,
			sno2_num_typ_META_0,
			sno2_ptn_cd_META_0,
			sno3_mng_typ_META_0,
			slo_sno3_flg_META_0,
			rqmt_sno3_flg_META_0,
			sno3_num_typ_META_0,
			sno3_ptn_cd_META_0,
			sno4_mng_typ_META_0,
			slo_sno4_flg_META_0,
			rqmt_sno4_flg_META_0,
			sno4_num_typ_META_0,
			sno4_ptn_cd_META_0,
			def_bom_ptn_META_0,
			mfg_inst_unit_typ_META_0,
			mrp_proc_typ_META_0,
			rqmt_typ_META_0,
			prod_pln_typ_META_0,
			dmnd_date_div_mons_META_0,
			alloc_margin_days_META_0,
			mrp_alloc_margin_days_META_0,
			mrp_opn_xfr_days_META_0,
			rqmt_rstr_qty_META_0,
			inpt_itm_add_flg_META_0,
			inpt_itm_del_flg_META_0,
			sch_flg_META_0,
			cntry_org_cd_META_0,
			comp_spec_typ_META_0,
			comp_rev_at_slo_flg_META_0,
			comp_core_itm_flg_META_0,
			itm_spec_grp_cd_META_0,
			sls_upri_grp_cd_META_0,
			bill_crryovr_times_META_0,
			pay_crryovr_times_META_0,
			slo_proc_flg_META_0,
			slo_proc_typ_META_0,
			ship_inst_typ_META_0,
			ship_lot_back_stop_flg_META_0,
			itm_ship_grp_cd_META_0,
			ship_valid_grp_cd_META_0,
			arr_skip_flg_META_0,
			ship_term_cd_META_0,
			exim_xpns_typ_META_0,
			stk_lst_flg_META_0,
			ver_flg_META_0,
			sls_upri_cng_flg_META_0,
			purc_upri_cng_flg_META_0,
			prov_upri_cng_flg_META_0,
			ext_sys_no_itm_META_0,
			chng_no_META_0,
			calc_ptn_cd_META_0,
			cost_std_qty_META_0,
			itm_alc_grp_META_0,
			memo1_META_0,
			memo2_META_0,
			memo3_META_0,
			del_flg_META_0,
			if_sub_char1_META_0,
			if_sub_char2_META_0,
			if_sub_char3_META_0,
			if_sub_char4_META_0,
			if_sub_char5_META_0,
			if_sub_char6_META_0,
			if_sub_char7_META_0,
			if_sub_char8_META_0,
			if_sub_char9_META_0,
			if_sub_char10_META_0,
			if_sub_char11_META_0,
			if_sub_char12_META_0,
			if_sub_char13_META_0,
			if_sub_char14_META_0,
			if_sub_char15_META_0,
			if_sub_char16_META_0,
			if_sub_char17_META_0,
			if_sub_char18_META_0,
			if_sub_char19_META_0,
			if_sub_char20_META_0,
			if_sub_char21_META_0,
			if_sub_char22_META_0,
			if_sub_char23_META_0,
			if_sub_char24_META_0,
			if_sub_char25_META_0,
			if_sub_char26_META_0,
			if_sub_char27_META_0,
			if_sub_char28_META_0,
			if_sub_char29_META_0,
			if_sub_char30_META_0,
			if_sub_num1_META_0,
			if_sub_num2_META_0,
			if_sub_num3_META_0,
			if_sub_num4_META_0,
			if_sub_num5_META_0,
			if_sub_dt1_META_0,
			if_sub_dt2_META_0,
			if_sub_dt3_META_0,
			if_sub_dt4_META_0,
			if_sub_dt5_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBER_ItmOtherPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

