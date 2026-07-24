package mcframe.commonMSBE.MSBER0010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBCR_StkList_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBER0010";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass STKLISTDTLL_RC = new MCReportClass("StkListDtl", mcframe.commonMSBE.MSBER0010.StkListDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		STKLISTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta bp_nm_META_0 = new MCReportMeta("bp_nm", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_cd_META_0 = new MCReportMeta("dlv_slip_itm_cd", "", "", "", true);
	static public final MCReportMeta lot_no_view_META_0 = new MCReportMeta("lot_no_view", "", "", "", true);
	static public final MCReportMeta lot_no_data_META_0 = new MCReportMeta("lot_no_data", "", "", "", true);
	static public final MCReportMeta sublot_no_view_META_0 = new MCReportMeta("sublot_no_view", "", "", "", true);
	static public final MCReportMeta sublot_no_data_META_0 = new MCReportMeta("sublot_no_data", "", "", "", true);
	static public final MCReportMeta base_unit_qty_META_0 = new MCReportMeta("base_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_base_unit_qty_META_0 = new MCReportMeta("s_base_unit_qty", "", "", "", true);
	static public final MCReportMeta cntnr_flg_META_0 = new MCReportMeta("cntnr_flg", "", "", "", true);
	static public final MCReportMeta dlv_slip_itm_nm_META_0 = new MCReportMeta("dlv_slip_itm_nm", "", "", "", true);
	static public final MCReportMeta dlv_cd_META_0 = new MCReportMeta("dlv_cd", "", "", "", true);
	static public final MCReportMeta dlv_nm_META_0 = new MCReportMeta("dlv_nm", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm1_META_0 = new MCReportMeta("dlv_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm2_META_0 = new MCReportMeta("dlv_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm3_META_0 = new MCReportMeta("dlv_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_alt_nm4_META_0 = new MCReportMeta("dlv_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_inst_qty_META_0 = new MCReportMeta("dlv_inst_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_dlv_inst_qty_META_0 = new MCReportMeta("s_dlv_inst_qty", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta qr_cd_META_0 = new MCReportMeta("qr_cd", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_0 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_0 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta cst_dlv_inst_no_META_0 = new MCReportMeta("cst_dlv_inst_no", "", "", "", true);
	static public final MCReportMeta cst_dlv_inst_d_no_META_0 = new MCReportMeta("cst_dlv_inst_d_no", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "MD", "", "", true);
	static public final MCReportMeta dlv_rqst_tm_META_0 = new MCReportMeta("dlv_rqst_tm", "HM", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_0 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_0 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_0 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_0 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_0 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_0 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_0 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta prnt_dt_META_0 = new MCReportMeta("prnt_dt", "YMDHM", "", "", true);
	static public final MCReportMeta cst_nm_META_0 = new MCReportMeta("cst_nm", "", "", "", true);
	static public final MCReportMeta cst_alt_nm1_META_0 = new MCReportMeta("cst_alt_nm1", "", "", "", true);
	static public final MCReportMeta cst_alt_nm2_META_0 = new MCReportMeta("cst_alt_nm2", "", "", "", true);
	static public final MCReportMeta cst_alt_nm3_META_0 = new MCReportMeta("cst_alt_nm3", "", "", "", true);
	static public final MCReportMeta cst_alt_nm4_META_0 = new MCReportMeta("cst_alt_nm4", "", "", "", true);
	static public final MCReportMeta dlv_id_cd_META_0 = new MCReportMeta("dlv_id_cd", "", "", "", true);
	static public final MCReportMeta dlv_id_nm_META_0 = new MCReportMeta("dlv_id_nm", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm1_META_0 = new MCReportMeta("dlv_id_alt_nm1", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm2_META_0 = new MCReportMeta("dlv_id_alt_nm2", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm3_META_0 = new MCReportMeta("dlv_id_alt_nm3", "", "", "", true);
	static public final MCReportMeta dlv_id_alt_nm4_META_0 = new MCReportMeta("dlv_id_alt_nm4", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta ver_no_lbl_META_0 = new MCReportMeta("ver_no_lbl", "", "", "", true);
	static public final MCReportMeta sno1_view_META_0 = new MCReportMeta("sno1_view", "", "", "", true);
	static public final MCReportMeta sno1_data_META_0 = new MCReportMeta("sno1_data", "", "", "", true);
	static public final MCReportMeta sno2_view_META_0 = new MCReportMeta("sno2_view", "", "", "", true);
	static public final MCReportMeta sno2_data_META_0 = new MCReportMeta("sno2_data", "", "", "", true);
	static public final MCReportMeta sno3_view_META_0 = new MCReportMeta("sno3_view", "", "", "", true);
	static public final MCReportMeta sno3_data_META_0 = new MCReportMeta("sno3_data", "", "", "", true);
	static public final MCReportMeta sno4_view_META_0 = new MCReportMeta("sno4_view", "", "", "", true);
	static public final MCReportMeta sno4_data_META_0 = new MCReportMeta("sno4_data", "", "", "", true);
	static public final MCReportMeta sno1_lbl_META_0 = new MCReportMeta("sno1_lbl", "", "", "", true);
	static public final MCReportMeta sno2_lbl_META_0 = new MCReportMeta("sno2_lbl", "", "", "", true);
	static public final MCReportMeta sno3_lbl_META_0 = new MCReportMeta("sno3_lbl", "", "", "", true);
	static public final MCReportMeta sno4_lbl_META_0 = new MCReportMeta("sno4_lbl", "", "", "", true);
	static public final MCReportMeta cntnr_qty_META_0 = new MCReportMeta("cntnr_qty", "", "", "", true);
	static public final MCReportMeta s_cntnr_qty_META_0 = new MCReportMeta("s_cntnr_qty", "", "", "", true);
	static public final MCReportMeta base_unit_cd_META_0 = new MCReportMeta("base_unit_cd", "", "", "", true);
	static public final MCReportMeta base_unit_nm_META_0 = new MCReportMeta("base_unit_nm", "", "", "", true);
	static public final MCReportMeta cntnr_unit_cd_META_0 = new MCReportMeta("cntnr_unit_cd", "", "", "", true);
	static public final MCReportMeta cntnr_unit_nm_META_0 = new MCReportMeta("cntnr_unit_nm", "", "", "", true);
	static public final MCReportMeta vld_dt_META_0 = new MCReportMeta("vld_dt", "YMD", "", "", true);
	static public final MCReportMeta lmt_dt_META_0 = new MCReportMeta("lmt_dt", "YMD", "", "", true);
	static public final MCReportMeta bp_lot_no_META_0 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta mfg_inst_no_META_0 = new MCReportMeta("mfg_inst_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_0 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta arr_dpt_cd_META_0 = new MCReportMeta("arr_dpt_cd", "", "", "", true);
	static public final MCReportMeta arr_dpt_nm_META_0 = new MCReportMeta("arr_dpt_nm", "", "", "", true);
	static public final MCReportMeta arr_usr_cd_META_0 = new MCReportMeta("arr_usr_cd", "", "", "", true);
	static public final MCReportMeta arr_usr_nm_META_0 = new MCReportMeta("arr_usr_nm", "", "", "", true);
	static public final MCReportMeta acpt_dpt_cd_META_0 = new MCReportMeta("acpt_dpt_cd", "", "", "", true);
	static public final MCReportMeta acpt_dpt_nm_META_0 = new MCReportMeta("acpt_dpt_nm", "", "", "", true);
	static public final MCReportMeta acpt_usr_cd_META_0 = new MCReportMeta("acpt_usr_cd", "", "", "", true);
	static public final MCReportMeta acpt_usr_nm_META_0 = new MCReportMeta("acpt_usr_nm", "", "", "", true);
	static public final MCReportMeta lot_rmrks_META_0 = new MCReportMeta("lot_rmrks", "", "", "", true);
	static public final MCReportMeta ship_act_d_sub_char1_META_0 = new MCReportMeta("ship_act_d_sub_char1", "", "", "", true);
	static public final MCReportMeta ship_act_d_sub_char2_META_0 = new MCReportMeta("ship_act_d_sub_char2", "", "", "", true);
	static public final MCReportMeta ship_act_d_sub_char3_META_0 = new MCReportMeta("ship_act_d_sub_char3", "", "", "", true);
	static public final MCReportMeta ship_alloc_sts_sub_char1_META_0 = new MCReportMeta("ship_alloc_sts_sub_char1", "", "", "", true);
	static public final MCReportMeta ship_alloc_sts_sub_char2_META_0 = new MCReportMeta("ship_alloc_sts_sub_char2", "", "", "", true);
	static public final MCReportMeta ship_alloc_sts_sub_char3_META_0 = new MCReportMeta("ship_alloc_sts_sub_char3", "", "", "", true);
	static public final MCReportMeta arr_act_sub_char1_META_0 = new MCReportMeta("arr_act_sub_char1", "", "", "", true);
	static public final MCReportMeta arr_act_sub_char2_META_0 = new MCReportMeta("arr_act_sub_char2", "", "", "", true);
	static public final MCReportMeta arr_act_sub_char3_META_0 = new MCReportMeta("arr_act_sub_char3", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char1_META_0 = new MCReportMeta("yield_schd_sub_char1", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char2_META_0 = new MCReportMeta("yield_schd_sub_char2", "", "", "", true);
	static public final MCReportMeta yield_schd_sub_char3_META_0 = new MCReportMeta("yield_schd_sub_char3", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char1_META_0 = new MCReportMeta("yield_act_sub_char1", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char2_META_0 = new MCReportMeta("yield_act_sub_char2", "", "", "", true);
	static public final MCReportMeta yield_act_sub_char3_META_0 = new MCReportMeta("yield_act_sub_char3", "", "", "", true);
	static public final MCReportMeta stk_sub_char1_META_0 = new MCReportMeta("stk_sub_char1", "", "", "", true);
	static public final MCReportMeta stk_sub_char2_META_0 = new MCReportMeta("stk_sub_char2", "", "", "", true);
	static public final MCReportMeta stk_sub_char3_META_0 = new MCReportMeta("stk_sub_char3", "", "", "", true);
	static public final MCReportMeta prnt_user_id_META_0 = new MCReportMeta("prnt_user_id", "", "", "", true);
	static public final MCReportMeta loc_cd_META_0 = new MCReportMeta("loc_cd", "", "", "", true);
	static public final MCReportMeta site_cd_META_0 = new MCReportMeta("site_cd", "", "", "", true);
	static public final MCReportMeta client_typ_META_0 = new MCReportMeta("client_typ", "", "", "", true);
	static public final MCReportMeta page_cnt_META_0 = new MCReportMeta("page_cnt", "", "", "", true);
	static public final MCReportMeta page_sum_META_0 = new MCReportMeta("page_sum", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("StkListDtl",
			bp_nm_META_0,
			dlv_slip_itm_cd_META_0,
			lot_no_view_META_0,
			lot_no_data_META_0,
			sublot_no_view_META_0,
			sublot_no_data_META_0,
			base_unit_qty_META_0,
			s_base_unit_qty_META_0,
			cntnr_flg_META_0,
			dlv_slip_itm_nm_META_0,
			dlv_cd_META_0,
			dlv_nm_META_0,
			dlv_alt_nm1_META_0,
			dlv_alt_nm2_META_0,
			dlv_alt_nm3_META_0,
			dlv_alt_nm4_META_0,
			dlv_inst_qty_META_0,
			s_dlv_inst_qty_META_0,
			co_nm_META_0,
			co_cd_META_0,
			qr_cd_META_0,
			cst_po_no_META_0,
			cst_po_d_no_META_0,
			cst_dlv_inst_no_META_0,
			cst_dlv_inst_d_no_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_tm_META_0,
			trd_d_rmrks_META_0,
			itm_cd_META_0,
			itm_sub1_view_META_0,
			itm_sub1_data_META_0,
			itm_sub2_view_META_0,
			itm_sub2_data_META_0,
			itm_sub3_view_META_0,
			itm_sub3_data_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			prnt_dt_META_0,
			cst_nm_META_0,
			cst_alt_nm1_META_0,
			cst_alt_nm2_META_0,
			cst_alt_nm3_META_0,
			cst_alt_nm4_META_0,
			dlv_id_cd_META_0,
			dlv_id_nm_META_0,
			dlv_id_alt_nm1_META_0,
			dlv_id_alt_nm2_META_0,
			dlv_id_alt_nm3_META_0,
			dlv_id_alt_nm4_META_0,
			ver_no_META_0,
			ver_no_lbl_META_0,
			sno1_view_META_0,
			sno1_data_META_0,
			sno2_view_META_0,
			sno2_data_META_0,
			sno3_view_META_0,
			sno3_data_META_0,
			sno4_view_META_0,
			sno4_data_META_0,
			sno1_lbl_META_0,
			sno2_lbl_META_0,
			sno3_lbl_META_0,
			sno4_lbl_META_0,
			cntnr_qty_META_0,
			s_cntnr_qty_META_0,
			base_unit_cd_META_0,
			base_unit_nm_META_0,
			cntnr_unit_cd_META_0,
			cntnr_unit_nm_META_0,
			vld_dt_META_0,
			lmt_dt_META_0,
			bp_lot_no_META_0,
			mfg_inst_no_META_0,
			po_d_no_META_0,
			dlv_slip_no_META_0,
			dlv_slip_d_no_META_0,
			arr_dpt_cd_META_0,
			arr_dpt_nm_META_0,
			arr_usr_cd_META_0,
			arr_usr_nm_META_0,
			acpt_dpt_cd_META_0,
			acpt_dpt_nm_META_0,
			acpt_usr_cd_META_0,
			acpt_usr_nm_META_0,
			lot_rmrks_META_0,
			ship_act_d_sub_char1_META_0,
			ship_act_d_sub_char2_META_0,
			ship_act_d_sub_char3_META_0,
			ship_alloc_sts_sub_char1_META_0,
			ship_alloc_sts_sub_char2_META_0,
			ship_alloc_sts_sub_char3_META_0,
			arr_act_sub_char1_META_0,
			arr_act_sub_char2_META_0,
			arr_act_sub_char3_META_0,
			yield_schd_sub_char1_META_0,
			yield_schd_sub_char2_META_0,
			yield_schd_sub_char3_META_0,
			yield_act_sub_char1_META_0,
			yield_act_sub_char2_META_0,
			yield_act_sub_char3_META_0,
			stk_sub_char1_META_0,
			stk_sub_char2_META_0,
			stk_sub_char3_META_0,
			prnt_user_id_META_0,
			loc_cd_META_0,
			site_cd_META_0,
			client_typ_META_0,
			page_cnt_META_0,
			page_sum_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBCR_StkList_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

