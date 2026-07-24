package mcframe.commonMSLA.MSLAR1020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_ShipActPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR1020";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR1020.DtlR.class, MCList.class);

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
	static public final MCReportMeta ship_fr_lg_grp_cd_META_0 = new MCReportMeta("ship_fr_lg_grp_cd", "", "", "", true);
	static public final MCReportMeta ship_fr_lg_grp_nm_META_0 = new MCReportMeta("ship_fr_lg_grp_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta ship_dt_META_0 = new MCReportMeta("ship_dt", "YMD", "", "", true);
	static public final MCReportMeta ship_hm_META_0 = new MCReportMeta("ship_hm", "HM", "", "", true);
	static public final MCReportMeta dlv_dt_META_0 = new MCReportMeta("dlv_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_hm_META_0 = new MCReportMeta("dlv_hm", "HM", "", "", true);
	static public final MCReportMeta cst_cd_META_0 = new MCReportMeta("cst_cd", "", "", "", true);
	static public final MCReportMeta cst_nm_META_0 = new MCReportMeta("cst_nm", "", "", "", true);
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
	static public final MCReportMeta dlv_id_typ_META_0 = new MCReportMeta("dlv_id_typ", "", "", "", true);
	static public final MCReportMeta dlv_id_cd_META_0 = new MCReportMeta("dlv_id_cd", "", "", "", true);
	static public final MCReportMeta dlv_id_nm_META_0 = new MCReportMeta("dlv_id_nm", "", "", "", true);
	static public final MCReportMeta dlv_str_ln_cd_META_0 = new MCReportMeta("dlv_str_ln_cd", "", "", "", true);
	static public final MCReportMeta dlv_str_ln_nm_META_0 = new MCReportMeta("dlv_str_ln_nm", "", "", "", true);
	static public final MCReportMeta dlv_zip_cd_META_0 = new MCReportMeta("dlv_zip_cd", "", "", "", true);
	static public final MCReportMeta dlv_addr1_META_0 = new MCReportMeta("dlv_addr1", "", "", "", true);
	static public final MCReportMeta dlv_addr2_META_0 = new MCReportMeta("dlv_addr2", "", "", "", true);
	static public final MCReportMeta dlv_addr3_META_0 = new MCReportMeta("dlv_addr3", "", "", "", true);
	static public final MCReportMeta dlv_addr4_META_0 = new MCReportMeta("dlv_addr4", "", "", "", true);
	static public final MCReportMeta dlv_cntct_dpt_META_0 = new MCReportMeta("dlv_cntct_dpt", "", "", "", true);
	static public final MCReportMeta dlv_cntct_psn_META_0 = new MCReportMeta("dlv_cntct_psn", "", "", "", true);
	static public final MCReportMeta dlv_tel_META_0 = new MCReportMeta("dlv_tel", "", "", "", true);
	static public final MCReportMeta dlv_fax_META_0 = new MCReportMeta("dlv_fax", "", "", "", true);
	static public final MCReportMeta pri_prnt_typ_META_0 = new MCReportMeta("pri_prnt_typ", "", "", "", true);
	static public final MCReportMeta rqst_dpt_cd_META_0 = new MCReportMeta("rqst_dpt_cd", "", "", "", true);
	static public final MCReportMeta rqst_dpt_nm_META_0 = new MCReportMeta("rqst_dpt_nm", "", "", "", true);
	static public final MCReportMeta rqst_usr_cd_META_0 = new MCReportMeta("rqst_usr_cd", "", "", "", true);
	static public final MCReportMeta rqst_usr_nm_META_0 = new MCReportMeta("rqst_usr_nm", "", "", "", true);
	static public final MCReportMeta ship_dpt_cd_META_0 = new MCReportMeta("ship_dpt_cd", "", "", "", true);
	static public final MCReportMeta ship_dpt_nm_META_0 = new MCReportMeta("ship_dpt_nm", "", "", "", true);
	static public final MCReportMeta ship_usr_cd_META_0 = new MCReportMeta("ship_usr_cd", "", "", "", true);
	static public final MCReportMeta ship_usr_nm_META_0 = new MCReportMeta("ship_usr_nm", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta iv_d_no_META_0 = new MCReportMeta("iv_d_no", "", "", "", true);
	static public final MCReportMeta ship_inst_d_no_META_0 = new MCReportMeta("ship_inst_d_no", "", "", "", true);
	static public final MCReportMeta ship_alloc_sts_no_META_0 = new MCReportMeta("ship_alloc_sts_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta ext_ship_act_no_META_0 = new MCReportMeta("ext_ship_act_no", "", "", "", true);
	static public final MCReportMeta ship_loc_cd_META_0 = new MCReportMeta("ship_loc_cd", "", "", "", true);
	static public final MCReportMeta ship_loc_nm_META_0 = new MCReportMeta("ship_loc_nm", "", "", "", true);
	static public final MCReportMeta ship_str_ln_cd_META_0 = new MCReportMeta("ship_str_ln_cd", "", "", "", true);
	static public final MCReportMeta ship_str_ln_nm_META_0 = new MCReportMeta("ship_str_ln_nm", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta lot_no_META_0 = new MCReportMeta("lot_no", "", "", "", true);
	static public final MCReportMeta sublot_no_META_0 = new MCReportMeta("sublot_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta ent_unit_qty_META_0 = new MCReportMeta("ent_unit_qty", "", "", "", true);
	static public final MCReportMeta ent_unit_cd_META_0 = new MCReportMeta("ent_unit_cd", "", "", "", true);
	static public final MCReportMeta ent_unit_nm_META_0 = new MCReportMeta("ent_unit_nm", "", "", "", true);
	static public final MCReportMeta abort_flg_META_0 = new MCReportMeta("abort_flg", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_0 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_0 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_cd_META_0 = new MCReportMeta("stk_arrv_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_arrv_bp_nm_META_0 = new MCReportMeta("stk_arrv_bp_nm", "", "", "", true);
	static public final MCReportMeta gd_cd_META_0 = new MCReportMeta("gd_cd", "", "", "", true);
	static public final MCReportMeta gd_nm_META_0 = new MCReportMeta("gd_nm", "", "", "", true);
	static public final MCReportMeta quality_typ_META_0 = new MCReportMeta("quality_typ", "", "", "", true);
	static public final MCReportMeta stk_id_typ_META_0 = new MCReportMeta("stk_id_typ", "", "", "", true);
	static public final MCReportMeta stk_bp_cd_META_0 = new MCReportMeta("stk_bp_cd", "", "", "", true);
	static public final MCReportMeta stk_bp_nm_META_0 = new MCReportMeta("stk_bp_nm", "", "", "", true);
	static public final MCReportMeta rsn_cd_META_0 = new MCReportMeta("rsn_cd", "", "", "", true);
	static public final MCReportMeta rsn_nm_META_0 = new MCReportMeta("rsn_nm", "", "", "", true);
	static public final MCReportMeta bd_dpt_cd_META_0 = new MCReportMeta("bd_dpt_cd", "", "", "", true);
	static public final MCReportMeta bd_dpt_nm_META_0 = new MCReportMeta("bd_dpt_nm", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_0 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_0 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta cst_dlv_inst_no_META_0 = new MCReportMeta("cst_dlv_inst_no", "", "", "", true);
	static public final MCReportMeta cst_dlv_inst_d_no_META_0 = new MCReportMeta("cst_dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta base_dlv_slip_no_META_0 = new MCReportMeta("base_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta base_prov_act_no_META_0 = new MCReportMeta("base_prov_act_no", "", "", "", true);
	static public final MCReportMeta base_ac_dt_META_0 = new MCReportMeta("base_ac_dt", "YMD", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_0 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta arr_cnt_rmrks_META_0 = new MCReportMeta("arr_cnt_rmrks", "", "", "", true);
	static public final MCReportMeta intr_d_rmrks_META_0 = new MCReportMeta("intr_d_rmrks", "", "", "", true);
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
			ship_fr_lg_grp_cd_META_0,
			ship_fr_lg_grp_nm_META_0,
			trd_cd_META_0,
			trd_nm_META_0,
			trd_ptn_typ_META_0,
			ship_dt_META_0,
			ship_hm_META_0,
			dlv_dt_META_0,
			dlv_hm_META_0,
			cst_cd_META_0,
			cst_nm_META_0,
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
			dlv_id_typ_META_0,
			dlv_id_cd_META_0,
			dlv_id_nm_META_0,
			dlv_str_ln_cd_META_0,
			dlv_str_ln_nm_META_0,
			dlv_zip_cd_META_0,
			dlv_addr1_META_0,
			dlv_addr2_META_0,
			dlv_addr3_META_0,
			dlv_addr4_META_0,
			dlv_cntct_dpt_META_0,
			dlv_cntct_psn_META_0,
			dlv_tel_META_0,
			dlv_fax_META_0,
			pri_prnt_typ_META_0,
			rqst_dpt_cd_META_0,
			rqst_dpt_nm_META_0,
			rqst_usr_cd_META_0,
			rqst_usr_nm_META_0,
			ship_dpt_cd_META_0,
			ship_dpt_nm_META_0,
			ship_usr_cd_META_0,
			ship_usr_nm_META_0,
			iv_no_META_0,
			iv_d_no_META_0,
			ship_inst_d_no_META_0,
			ship_alloc_sts_no_META_0,
			dlv_slip_no_META_0,
			dlv_slip_d_no_META_0,
			ext_ship_act_no_META_0,
			ship_loc_cd_META_0,
			ship_loc_nm_META_0,
			ship_str_ln_cd_META_0,
			ship_str_ln_nm_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			lot_no_META_0,
			sublot_no_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			ent_unit_qty_META_0,
			ent_unit_cd_META_0,
			ent_unit_nm_META_0,
			abort_flg_META_0,
			cst_itm_cd_META_0,
			cst_itm_nm_META_0,
			stk_arrv_bp_cd_META_0,
			stk_arrv_bp_nm_META_0,
			gd_cd_META_0,
			gd_nm_META_0,
			quality_typ_META_0,
			stk_id_typ_META_0,
			stk_bp_cd_META_0,
			stk_bp_nm_META_0,
			rsn_cd_META_0,
			rsn_nm_META_0,
			bd_dpt_cd_META_0,
			bd_dpt_nm_META_0,
			cst_po_no_META_0,
			cst_po_d_no_META_0,
			cst_dlv_inst_no_META_0,
			cst_dlv_inst_d_no_META_0,
			base_dlv_slip_no_META_0,
			base_prov_act_no_META_0,
			base_ac_dt_META_0,
			trd_rmrks_META_0,
			trd_d_rmrks_META_0,
			arr_cnt_rmrks_META_0,
			intr_d_rmrks_META_0,
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
	protected MSLAR_ShipActPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

