package mcframe.commonPFBA.PFBAR5720;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBAR_BpSpplPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBAR5720";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBA.PFBAR5720.DtlR.class, MCList.class);

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
	static public final MCReportMeta bp_cd_META_0 = new MCReportMeta("bp_cd", "", "", "", true);
	static public final MCReportMeta bp_nm_META_0 = new MCReportMeta("bp_nm", "", "", "", true);
	static public final MCReportMeta bp_alt_nm1_META_0 = new MCReportMeta("bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta bp_alt_nm2_META_0 = new MCReportMeta("bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta bp_alt_nm3_META_0 = new MCReportMeta("bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta bp_alt_nm4_META_0 = new MCReportMeta("bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta tel_META_0 = new MCReportMeta("tel", "", "", "", true);
	static public final MCReportMeta fax_META_0 = new MCReportMeta("fax", "", "", "", true);
	static public final MCReportMeta ein_META_0 = new MCReportMeta("ein", "", "", "", true);
	static public final MCReportMeta std_co_cd_META_0 = new MCReportMeta("std_co_cd", "", "", "", true);
	static public final MCReportMeta cntry_cd_META_0 = new MCReportMeta("cntry_cd", "", "", "", true);
	static public final MCReportMeta area_cd_META_0 = new MCReportMeta("area_cd", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta prnt_lcl_cd_META_0 = new MCReportMeta("prnt_lcl_cd", "", "", "", true);
	static public final MCReportMeta bp_grp_cd1_META_0 = new MCReportMeta("bp_grp_cd1", "", "", "", true);
	static public final MCReportMeta bp_grp_cd2_META_0 = new MCReportMeta("bp_grp_cd2", "", "", "", true);
	static public final MCReportMeta bp_grp_cd3_META_0 = new MCReportMeta("bp_grp_cd3", "", "", "", true);
	static public final MCReportMeta bp_grp_cd4_META_0 = new MCReportMeta("bp_grp_cd4", "", "", "", true);
	static public final MCReportMeta bp_grp_cd5_META_0 = new MCReportMeta("bp_grp_cd5", "", "", "", true);
	static public final MCReportMeta bp_grp_cd6_META_0 = new MCReportMeta("bp_grp_cd6", "", "", "", true);
	static public final MCReportMeta bp_grp_cd7_META_0 = new MCReportMeta("bp_grp_cd7", "", "", "", true);
	static public final MCReportMeta bp_grp_cd8_META_0 = new MCReportMeta("bp_grp_cd8", "", "", "", true);
	static public final MCReportMeta bp_grp_cd9_META_0 = new MCReportMeta("bp_grp_cd9", "", "", "", true);
	static public final MCReportMeta bp_grp_cd10_META_0 = new MCReportMeta("bp_grp_cd10", "", "", "", true);
	static public final MCReportMeta bp_alc_grp_META_0 = new MCReportMeta("bp_alc_grp", "", "", "", true);
	static public final MCReportMeta cst_flg_META_0 = new MCReportMeta("cst_flg", "", "", "", true);
	static public final MCReportMeta acst_flg_META_0 = new MCReportMeta("acst_flg", "", "", "", true);
	static public final MCReportMeta bcst_flg_META_0 = new MCReportMeta("bcst_flg", "", "", "", true);
	static public final MCReportMeta rcst_flg_META_0 = new MCReportMeta("rcst_flg", "", "", "", true);
	static public final MCReportMeta sppl_flg_META_0 = new MCReportMeta("sppl_flg", "", "", "", true);
	static public final MCReportMeta asppl_flg_META_0 = new MCReportMeta("asppl_flg", "", "", "", true);
	static public final MCReportMeta bsppl_flg_META_0 = new MCReportMeta("bsppl_flg", "", "", "", true);
	static public final MCReportMeta psppl_flg_META_0 = new MCReportMeta("psppl_flg", "", "", "", true);
	static public final MCReportMeta cred_flg_META_0 = new MCReportMeta("cred_flg", "", "", "", true);
	static public final MCReportMeta dlv_flg_META_0 = new MCReportMeta("dlv_flg", "", "", "", true);
	static public final MCReportMeta maker_flg_META_0 = new MCReportMeta("maker_flg", "", "", "", true);
	static public final MCReportMeta dest_flg_META_0 = new MCReportMeta("dest_flg", "", "", "", true);
	static public final MCReportMeta asppl_cd_META_0 = new MCReportMeta("asppl_cd", "", "", "", true);
	static public final MCReportMeta subcon_flg_META_0 = new MCReportMeta("subcon_flg", "", "", "", true);
	static public final MCReportMeta po_print_cd_META_0 = new MCReportMeta("po_print_cd", "", "", "", true);
	static public final MCReportMeta sppl_ship_form_cd_META_0 = new MCReportMeta("sppl_ship_form_cd", "", "", "", true);
	static public final MCReportMeta pay_crryovr_times_META_0 = new MCReportMeta("pay_crryovr_times", "", "", "", true);
	static public final MCReportMeta sppl_cntct_dpt_META_0 = new MCReportMeta("sppl_cntct_dpt", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_META_0 = new MCReportMeta("sppl_cntct_psn", "", "", "", true);
	static public final MCReportMeta sppl_cntct_psn_title_META_0 = new MCReportMeta("sppl_cntct_psn_title", "", "", "", true);
	static public final MCReportMeta purc_upri_req_typ_META_0 = new MCReportMeta("purc_upri_req_typ", "", "", "", true);
	static public final MCReportMeta purc_upri_cng_flg_META_0 = new MCReportMeta("purc_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta purc_amt_rnd_typ_META_0 = new MCReportMeta("purc_amt_rnd_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_rnd_typ_META_0 = new MCReportMeta("purc_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_calc_typ_META_0 = new MCReportMeta("purc_tax_calc_typ", "", "", "", true);
	static public final MCReportMeta purc_tax_cd_META_0 = new MCReportMeta("purc_tax_cd", "", "", "", true);
	static public final MCReportMeta purc_tax_cd_prio_flg_META_0 = new MCReportMeta("purc_tax_cd_prio_flg", "", "", "", true);
	static public final MCReportMeta wrk_po_flg_META_0 = new MCReportMeta("wrk_po_flg", "", "", "", true);
	static public final MCReportMeta wrk_ap_flg_META_0 = new MCReportMeta("wrk_ap_flg", "", "", "", true);
	static public final MCReportMeta purc_slip_each_lot_typ_META_0 = new MCReportMeta("purc_slip_each_lot_typ", "", "", "", true);
	static public final MCReportMeta prov_rcv_typ_META_0 = new MCReportMeta("prov_rcv_typ", "", "", "", true);
	static public final MCReportMeta onr_prsppl_flg_META_0 = new MCReportMeta("onr_prsppl_flg", "", "", "", true);
	static public final MCReportMeta repurc_obli_flg_META_0 = new MCReportMeta("repurc_obli_flg", "", "", "", true);
	static public final MCReportMeta prov_basis_typ_META_0 = new MCReportMeta("prov_basis_typ", "", "", "", true);
	static public final MCReportMeta prov_upri_cng_flg_META_0 = new MCReportMeta("prov_upri_cng_flg", "", "", "", true);
	static public final MCReportMeta prov_amt_rnd_typ_META_0 = new MCReportMeta("prov_amt_rnd_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_rnd_typ_META_0 = new MCReportMeta("prov_tax_rnd_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_calc_typ_META_0 = new MCReportMeta("prov_tax_calc_typ", "", "", "", true);
	static public final MCReportMeta prov_tax_cd_META_0 = new MCReportMeta("prov_tax_cd", "", "", "", true);
	static public final MCReportMeta prov_tax_cd_prio_flg_META_0 = new MCReportMeta("prov_tax_cd_prio_flg", "", "", "", true);
	static public final MCReportMeta sppl_cal_cd_META_0 = new MCReportMeta("sppl_cal_cd", "", "", "", true);
	static public final MCReportMeta sppl_iv_flg_META_0 = new MCReportMeta("sppl_iv_flg", "", "", "", true);
	static public final MCReportMeta prms_recv_flg_META_0 = new MCReportMeta("prms_recv_flg", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd1_META_0 = new MCReportMeta("sppl_tterm_cd1", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd2_META_0 = new MCReportMeta("sppl_tterm_cd2", "", "", "", true);
	static public final MCReportMeta sppl_tterm_cd3_META_0 = new MCReportMeta("sppl_tterm_cd3", "", "", "", true);
	static public final MCReportMeta bsppl_cd_META_0 = new MCReportMeta("bsppl_cd", "", "", "", true);
	static public final MCReportMeta memo1_META_0 = new MCReportMeta("memo1", "", "", "", true);
	static public final MCReportMeta memo2_META_0 = new MCReportMeta("memo2", "", "", "", true);
	static public final MCReportMeta memo3_META_0 = new MCReportMeta("memo3", "", "", "", true);
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
	static public final MCReportMeta memo4_META_0 = new MCReportMeta("memo4", "", "", "", true);
	static public final MCReportMeta memo5_META_0 = new MCReportMeta("memo5", "", "", "", true);
	static public final MCReportMeta memo6_META_0 = new MCReportMeta("memo6", "", "", "", true);
	static public final MCReportMeta memo7_META_0 = new MCReportMeta("memo7", "", "", "", true);
	static public final MCReportMeta memo8_META_0 = new MCReportMeta("memo8", "", "", "", true);
	static public final MCReportMeta memo9_META_0 = new MCReportMeta("memo9", "", "", "", true);
	static public final MCReportMeta memo10_META_0 = new MCReportMeta("memo10", "", "", "", true);
	static public final MCReportMeta memo11_META_0 = new MCReportMeta("memo11", "", "", "", true);
	static public final MCReportMeta memo12_META_0 = new MCReportMeta("memo12", "", "", "", true);
	static public final MCReportMeta memo13_META_0 = new MCReportMeta("memo13", "", "", "", true);
	static public final MCReportMeta memo14_META_0 = new MCReportMeta("memo14", "", "", "", true);
	static public final MCReportMeta memo15_META_0 = new MCReportMeta("memo15", "", "", "", true);
	static public final MCReportMeta memo16_META_0 = new MCReportMeta("memo16", "", "", "", true);
	static public final MCReportMeta memo17_META_0 = new MCReportMeta("memo17", "", "", "", true);
	static public final MCReportMeta memo18_META_0 = new MCReportMeta("memo18", "", "", "", true);
	static public final MCReportMeta memo19_META_0 = new MCReportMeta("memo19", "", "", "", true);
	static public final MCReportMeta memo20_META_0 = new MCReportMeta("memo20", "", "", "", true);
	static public final MCReportMeta biz_co_no_META_0 = new MCReportMeta("biz_co_no", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_crud_typ_META_0,
			co_cd_META_0,
			bp_cd_META_0,
			bp_nm_META_0,
			bp_alt_nm1_META_0,
			bp_alt_nm2_META_0,
			bp_alt_nm3_META_0,
			bp_alt_nm4_META_0,
			zip_cd_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			tel_META_0,
			fax_META_0,
			ein_META_0,
			std_co_cd_META_0,
			cntry_cd_META_0,
			area_cd_META_0,
			cur_cd_META_0,
			prnt_lcl_cd_META_0,
			bp_grp_cd1_META_0,
			bp_grp_cd2_META_0,
			bp_grp_cd3_META_0,
			bp_grp_cd4_META_0,
			bp_grp_cd5_META_0,
			bp_grp_cd6_META_0,
			bp_grp_cd7_META_0,
			bp_grp_cd8_META_0,
			bp_grp_cd9_META_0,
			bp_grp_cd10_META_0,
			bp_alc_grp_META_0,
			cst_flg_META_0,
			acst_flg_META_0,
			bcst_flg_META_0,
			rcst_flg_META_0,
			sppl_flg_META_0,
			asppl_flg_META_0,
			bsppl_flg_META_0,
			psppl_flg_META_0,
			cred_flg_META_0,
			dlv_flg_META_0,
			maker_flg_META_0,
			dest_flg_META_0,
			asppl_cd_META_0,
			subcon_flg_META_0,
			po_print_cd_META_0,
			sppl_ship_form_cd_META_0,
			pay_crryovr_times_META_0,
			sppl_cntct_dpt_META_0,
			sppl_cntct_psn_META_0,
			sppl_cntct_psn_title_META_0,
			purc_upri_req_typ_META_0,
			purc_upri_cng_flg_META_0,
			purc_amt_rnd_typ_META_0,
			purc_tax_rnd_typ_META_0,
			purc_tax_calc_typ_META_0,
			purc_tax_cd_META_0,
			purc_tax_cd_prio_flg_META_0,
			wrk_po_flg_META_0,
			wrk_ap_flg_META_0,
			purc_slip_each_lot_typ_META_0,
			prov_rcv_typ_META_0,
			onr_prsppl_flg_META_0,
			repurc_obli_flg_META_0,
			prov_basis_typ_META_0,
			prov_upri_cng_flg_META_0,
			prov_amt_rnd_typ_META_0,
			prov_tax_rnd_typ_META_0,
			prov_tax_calc_typ_META_0,
			prov_tax_cd_META_0,
			prov_tax_cd_prio_flg_META_0,
			sppl_cal_cd_META_0,
			sppl_iv_flg_META_0,
			prms_recv_flg_META_0,
			sppl_tterm_cd1_META_0,
			sppl_tterm_cd2_META_0,
			sppl_tterm_cd3_META_0,
			bsppl_cd_META_0,
			memo1_META_0,
			memo2_META_0,
			memo3_META_0,
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
			if_sub_dt5_META_0,
			memo4_META_0,
			memo5_META_0,
			memo6_META_0,
			memo7_META_0,
			memo8_META_0,
			memo9_META_0,
			memo10_META_0,
			memo11_META_0,
			memo12_META_0,
			memo13_META_0,
			memo14_META_0,
			memo15_META_0,
			memo16_META_0,
			memo17_META_0,
			memo18_META_0,
			memo19_META_0,
			memo20_META_0,
			biz_co_no_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBAR_BpSpplPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

