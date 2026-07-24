package mcframe.commonMSLA.MSLAR2110;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_PoPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2110";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR2110.DtlR.class, MCList.class);

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
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHMS", "", "", true);
	static public final MCReportMeta ext_po_no_META_0 = new MCReportMeta("ext_po_no", "", "", "", true);
	static public final MCReportMeta ext_po_d_no_META_0 = new MCReportMeta("ext_po_d_no", "", "", "", true);
	static public final MCReportMeta prnt_po_flg_META_0 = new MCReportMeta("prnt_po_flg", "", "", "", true);
	static public final MCReportMeta prnt_dlv_flg_META_0 = new MCReportMeta("prnt_dlv_flg", "", "", "", true);
	static public final MCReportMeta po_dt_META_0 = new MCReportMeta("po_dt", "YMD", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta sppl_cd_META_0 = new MCReportMeta("sppl_cd", "", "", "", true);
	static public final MCReportMeta sppl_nm_META_0 = new MCReportMeta("sppl_nm", "", "", "", true);
	static public final MCReportMeta purc_dpt_cd_META_0 = new MCReportMeta("purc_dpt_cd", "", "", "", true);
	static public final MCReportMeta purc_dpt_nm_META_0 = new MCReportMeta("purc_dpt_nm", "", "", "", true);
	static public final MCReportMeta purc_usr_cd_META_0 = new MCReportMeta("purc_usr_cd", "", "", "", true);
	static public final MCReportMeta purc_usr_nm_META_0 = new MCReportMeta("purc_usr_nm", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta xrate_inpt_flg_META_0 = new MCReportMeta("xrate_inpt_flg", "", "", "", true);
	static public final MCReportMeta ptax_xrate_META_0 = new MCReportMeta("ptax_xrate", "", "", "", true);
	static public final MCReportMeta ptax_xrate_inpt_flg_META_0 = new MCReportMeta("ptax_xrate_inpt_flg", "", "", "", true);
	static public final MCReportMeta po_print_cd_META_0 = new MCReportMeta("po_print_cd", "", "", "", true);
	static public final MCReportMeta po_print_nm_META_0 = new MCReportMeta("po_print_nm", "", "", "", true);
	static public final MCReportMeta upd_po_print_schd_dt_META_0 = new MCReportMeta("upd_po_print_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta crct_rsn_cd_META_0 = new MCReportMeta("crct_rsn_cd", "", "", "", true);
	static public final MCReportMeta crct_rsn_nm_META_0 = new MCReportMeta("crct_rsn_nm", "", "", "", true);
	static public final MCReportMeta tterm_cd1_META_0 = new MCReportMeta("tterm_cd1", "", "", "", true);
	static public final MCReportMeta tterm_nm1_META_0 = new MCReportMeta("tterm_nm1", "", "", "", true);
	static public final MCReportMeta tterm_rmrks1_META_0 = new MCReportMeta("tterm_rmrks1", "", "", "", true);
	static public final MCReportMeta tterm_cd2_META_0 = new MCReportMeta("tterm_cd2", "", "", "", true);
	static public final MCReportMeta tterm_nm2_META_0 = new MCReportMeta("tterm_nm2", "", "", "", true);
	static public final MCReportMeta tterm_rmrks2_META_0 = new MCReportMeta("tterm_rmrks2", "", "", "", true);
	static public final MCReportMeta tterm_cd3_META_0 = new MCReportMeta("tterm_cd3", "", "", "", true);
	static public final MCReportMeta tterm_nm3_META_0 = new MCReportMeta("tterm_nm3", "", "", "", true);
	static public final MCReportMeta tterm_rmrks3_META_0 = new MCReportMeta("tterm_rmrks3", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta intr_rmrks_META_0 = new MCReportMeta("intr_rmrks", "", "", "", true);
	static public final MCReportMeta po_print_rmrks_META_0 = new MCReportMeta("po_print_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_slip_rmrks_META_0 = new MCReportMeta("dlv_slip_rmrks", "", "", "", true);
	static public final MCReportMeta edi_sub_char1_META_0 = new MCReportMeta("edi_sub_char1", "", "", "", true);
	static public final MCReportMeta edi_sub_char2_META_0 = new MCReportMeta("edi_sub_char2", "", "", "", true);
	static public final MCReportMeta edi_sub_char3_META_0 = new MCReportMeta("edi_sub_char3", "", "", "", true);
	static public final MCReportMeta edi_sub_char4_META_0 = new MCReportMeta("edi_sub_char4", "", "", "", true);
	static public final MCReportMeta edi_sub_char5_META_0 = new MCReportMeta("edi_sub_char5", "", "", "", true);
	static public final MCReportMeta edi_sub_num1_META_0 = new MCReportMeta("edi_sub_num1", "", "", "", true);
	static public final MCReportMeta edi_sub_dt1_META_0 = new MCReportMeta("edi_sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta iv_itm_nm_META_0 = new MCReportMeta("iv_itm_nm", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta purc_id_typ_META_0 = new MCReportMeta("purc_id_typ", "", "", "", true);
	static public final MCReportMeta sppl_itm_cd_META_0 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_0 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta maker_cd_META_0 = new MCReportMeta("maker_cd", "", "", "", true);
	static public final MCReportMeta maker_nm_META_0 = new MCReportMeta("maker_nm", "", "", "", true);
	static public final MCReportMeta bp_lot_no_META_0 = new MCReportMeta("bp_lot_no", "", "", "", true);
	static public final MCReportMeta in_to_loc_cd_META_0 = new MCReportMeta("in_to_loc_cd", "", "", "", true);
	static public final MCReportMeta in_to_loc_nm_META_0 = new MCReportMeta("in_to_loc_nm", "", "", "", true);
	static public final MCReportMeta str_ln_cd_META_0 = new MCReportMeta("str_ln_cd", "", "", "", true);
	static public final MCReportMeta str_ln_nm_META_0 = new MCReportMeta("str_ln_nm", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta dlv_rqst_dt_META_0 = new MCReportMeta("dlv_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_rqst_hm_META_0 = new MCReportMeta("dlv_rqst_hm", "HM", "", "", true);
	static public final MCReportMeta rqst_avl_rqst_dt_META_0 = new MCReportMeta("rqst_avl_rqst_dt", "YMD", "", "", true);
	static public final MCReportMeta purc_schd_dt_META_0 = new MCReportMeta("purc_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta sync_flg_META_0 = new MCReportMeta("sync_flg", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta purc_upri_req_typ_META_0 = new MCReportMeta("purc_upri_req_typ", "", "", "", true);
	static public final MCReportMeta upri_not_tgt_flg_META_0 = new MCReportMeta("upri_not_tgt_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_0 = new MCReportMeta("trd_cur_upri", "", "", "", true);
	static public final MCReportMeta interim_flg_META_0 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta tax_fix_flg_META_0 = new MCReportMeta("tax_fix_flg", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_0 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_0 = new MCReportMeta("trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta dscnt_rsn_cd_META_0 = new MCReportMeta("dscnt_rsn_cd", "", "", "", true);
	static public final MCReportMeta dscnt_rsn_nm_META_0 = new MCReportMeta("dscnt_rsn_nm", "", "", "", true);
	static public final MCReportMeta trd_cur_proc_upri_META_0 = new MCReportMeta("trd_cur_proc_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_onr_prov_upri_META_0 = new MCReportMeta("trd_cur_onr_prov_upri", "", "", "", true);
	static public final MCReportMeta wtax_rate_META_0 = new MCReportMeta("wtax_rate", "", "", "", true);
	static public final MCReportMeta purc_rsn_cd_META_0 = new MCReportMeta("purc_rsn_cd", "", "", "", true);
	static public final MCReportMeta purc_rsn_nm_META_0 = new MCReportMeta("purc_rsn_nm", "", "", "", true);
	static public final MCReportMeta pri_print_flg_META_0 = new MCReportMeta("pri_print_flg", "", "", "", true);
	static public final MCReportMeta po_conf_rcpt_flg_META_0 = new MCReportMeta("po_conf_rcpt_flg", "", "", "", true);
	static public final MCReportMeta po_conf_rcpt_dt_META_0 = new MCReportMeta("po_conf_rcpt_dt", "YMD", "", "", true);
	static public final MCReportMeta pay_crryovr_times_META_0 = new MCReportMeta("pay_crryovr_times", "", "", "", true);
	static public final MCReportMeta ap_dpt_cd_META_0 = new MCReportMeta("ap_dpt_cd", "", "", "", true);
	static public final MCReportMeta ap_dpt_nm_META_0 = new MCReportMeta("ap_dpt_nm", "", "", "", true);
	static public final MCReportMeta bd_dpt_cd_META_0 = new MCReportMeta("bd_dpt_cd", "", "", "", true);
	static public final MCReportMeta bd_dpt_nm_META_0 = new MCReportMeta("bd_dpt_nm", "", "", "", true);
	static public final MCReportMeta bd_itm_cd_META_0 = new MCReportMeta("bd_itm_cd", "", "", "", true);
	static public final MCReportMeta bd_itm_sub1_META_0 = new MCReportMeta("bd_itm_sub1", "", "", "", true);
	static public final MCReportMeta bd_itm_sub2_META_0 = new MCReportMeta("bd_itm_sub2", "", "", "", true);
	static public final MCReportMeta bd_itm_sub3_META_0 = new MCReportMeta("bd_itm_sub3", "", "", "", true);
	static public final MCReportMeta bd_itm_nm_META_0 = new MCReportMeta("bd_itm_nm", "", "", "", true);
	static public final MCReportMeta bd_sno1_META_0 = new MCReportMeta("bd_sno1", "", "", "", true);
	static public final MCReportMeta bd_sno2_META_0 = new MCReportMeta("bd_sno2", "", "", "", true);
	static public final MCReportMeta bd_sno3_META_0 = new MCReportMeta("bd_sno3", "", "", "", true);
	static public final MCReportMeta bd_sno4_META_0 = new MCReportMeta("bd_sno4", "", "", "", true);
	static public final MCReportMeta bd_loc_cd_META_0 = new MCReportMeta("bd_loc_cd", "", "", "", true);
	static public final MCReportMeta bd_loc_nm_META_0 = new MCReportMeta("bd_loc_nm", "", "", "", true);
	static public final MCReportMeta bd_lot_no_META_0 = new MCReportMeta("bd_lot_no", "", "", "", true);
	static public final MCReportMeta bd_sublot_no_META_0 = new MCReportMeta("bd_sublot_no", "", "", "", true);
	static public final MCReportMeta bd_ctg_cd_META_0 = new MCReportMeta("bd_ctg_cd", "", "", "", true);
	static public final MCReportMeta bd_ctg_nm_META_0 = new MCReportMeta("bd_ctg_nm", "", "", "", true);
	static public final MCReportMeta bd_oper_cd_META_0 = new MCReportMeta("bd_oper_cd", "", "", "", true);
	static public final MCReportMeta bd_oper_nm_META_0 = new MCReportMeta("bd_oper_nm", "", "", "", true);
	static public final MCReportMeta bd_slo_no_META_0 = new MCReportMeta("bd_slo_no", "", "", "", true);
	static public final MCReportMeta bd_iv_no_META_0 = new MCReportMeta("bd_iv_no", "", "", "", true);
	static public final MCReportMeta bd_po_no_META_0 = new MCReportMeta("bd_po_no", "", "", "", true);
	static public final MCReportMeta intr_d_rmrks_META_0 = new MCReportMeta("intr_d_rmrks", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_0 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta po_print_d_rmrks_META_0 = new MCReportMeta("po_print_d_rmrks", "", "", "", true);
	static public final MCReportMeta arr_cnt_rmrks_META_0 = new MCReportMeta("arr_cnt_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_rmrks_META_0 = new MCReportMeta("dlv_slip_d_rmrks", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char1_META_0 = new MCReportMeta("edi_sub_d_char1", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char2_META_0 = new MCReportMeta("edi_sub_d_char2", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char3_META_0 = new MCReportMeta("edi_sub_d_char3", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char4_META_0 = new MCReportMeta("edi_sub_d_char4", "", "", "", true);
	static public final MCReportMeta edi_sub_d_char5_META_0 = new MCReportMeta("edi_sub_d_char5", "", "", "", true);
	static public final MCReportMeta edi_sub_d_num1_META_0 = new MCReportMeta("edi_sub_d_num1", "", "", "", true);
	static public final MCReportMeta edi_sub_d_dt1_META_0 = new MCReportMeta("edi_sub_d_dt1", "YMD", "", "", true);
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
			data_crud_typ_META_0,
			data_make_dt_META_0,
			ext_po_no_META_0,
			ext_po_d_no_META_0,
			prnt_po_flg_META_0,
			prnt_dlv_flg_META_0,
			po_dt_META_0,
			trd_cd_META_0,
			trd_nm_META_0,
			trd_ptn_typ_META_0,
			sppl_cd_META_0,
			sppl_nm_META_0,
			purc_dpt_cd_META_0,
			purc_dpt_nm_META_0,
			purc_usr_cd_META_0,
			purc_usr_nm_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			xrate_META_0,
			xrate_inpt_flg_META_0,
			ptax_xrate_META_0,
			ptax_xrate_inpt_flg_META_0,
			po_print_cd_META_0,
			po_print_nm_META_0,
			upd_po_print_schd_dt_META_0,
			crct_rsn_cd_META_0,
			crct_rsn_nm_META_0,
			tterm_cd1_META_0,
			tterm_nm1_META_0,
			tterm_rmrks1_META_0,
			tterm_cd2_META_0,
			tterm_nm2_META_0,
			tterm_rmrks2_META_0,
			tterm_cd3_META_0,
			tterm_nm3_META_0,
			tterm_rmrks3_META_0,
			trd_rmrks_META_0,
			intr_rmrks_META_0,
			po_print_rmrks_META_0,
			dlv_slip_rmrks_META_0,
			edi_sub_char1_META_0,
			edi_sub_char2_META_0,
			edi_sub_char3_META_0,
			edi_sub_char4_META_0,
			edi_sub_char5_META_0,
			edi_sub_num1_META_0,
			edi_sub_dt1_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			iv_itm_nm_META_0,
			ver_no_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			purc_id_typ_META_0,
			sppl_itm_cd_META_0,
			sppl_itm_nm_META_0,
			maker_cd_META_0,
			maker_nm_META_0,
			bp_lot_no_META_0,
			in_to_loc_cd_META_0,
			in_to_loc_nm_META_0,
			str_ln_cd_META_0,
			str_ln_nm_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			bom_ptn_META_0,
			dlv_rqst_dt_META_0,
			dlv_rqst_hm_META_0,
			rqst_avl_rqst_dt_META_0,
			purc_schd_dt_META_0,
			sync_flg_META_0,
			trd_unit_qty_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			purc_upri_req_typ_META_0,
			upri_not_tgt_flg_META_0,
			trd_cur_upri_META_0,
			interim_flg_META_0,
			tax_fix_flg_META_0,
			tax_cd_META_0,
			tax_nm_META_0,
			trd_cur_dscnt_amt_META_0,
			dscnt_rsn_cd_META_0,
			dscnt_rsn_nm_META_0,
			trd_cur_proc_upri_META_0,
			trd_cur_onr_prov_upri_META_0,
			wtax_rate_META_0,
			purc_rsn_cd_META_0,
			purc_rsn_nm_META_0,
			pri_print_flg_META_0,
			po_conf_rcpt_flg_META_0,
			po_conf_rcpt_dt_META_0,
			pay_crryovr_times_META_0,
			ap_dpt_cd_META_0,
			ap_dpt_nm_META_0,
			bd_dpt_cd_META_0,
			bd_dpt_nm_META_0,
			bd_itm_cd_META_0,
			bd_itm_sub1_META_0,
			bd_itm_sub2_META_0,
			bd_itm_sub3_META_0,
			bd_itm_nm_META_0,
			bd_sno1_META_0,
			bd_sno2_META_0,
			bd_sno3_META_0,
			bd_sno4_META_0,
			bd_loc_cd_META_0,
			bd_loc_nm_META_0,
			bd_lot_no_META_0,
			bd_sublot_no_META_0,
			bd_ctg_cd_META_0,
			bd_ctg_nm_META_0,
			bd_oper_cd_META_0,
			bd_oper_nm_META_0,
			bd_slo_no_META_0,
			bd_iv_no_META_0,
			bd_po_no_META_0,
			intr_d_rmrks_META_0,
			trd_d_rmrks_META_0,
			po_print_d_rmrks_META_0,
			arr_cnt_rmrks_META_0,
			dlv_slip_d_rmrks_META_0,
			edi_sub_d_char1_META_0,
			edi_sub_d_char2_META_0,
			edi_sub_d_char3_META_0,
			edi_sub_d_char4_META_0,
			edi_sub_d_char5_META_0,
			edi_sub_d_num1_META_0,
			edi_sub_d_dt1_META_0,
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
	protected MSLAR_PoPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

