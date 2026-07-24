package mcframe.commonMSBH.MSBHR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBHR_PaySchdDtl_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBHR0020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PAYSCHDHDRR_RC = new MCReportClass("PaySchdHdr", mcframe.commonMSBH.MSBHR0020.PaySchdHdrR.class);
	static public final MCReportClass PAYSCHDDTLL_RC = new MCReportClass("PaySchdDtl", mcframe.commonMSBH.MSBHR0020.PaySchdDtlR.class, MCList.class);
	static public final MCReportClass PAYSCHDFTRR_RC = new MCReportClass("PaySchdFtr", mcframe.commonMSBH.MSBHR0020.PaySchdFtrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PAYSCHDHDRR_RC,
		PAYSCHDDTLL_RC,
		PAYSCHDFTRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta pay_chk_no_META_0 = new MCReportMeta("pay_chk_no", "", "", "", true);
	static public final MCReportMeta psppl_cd_META_0 = new MCReportMeta("psppl_cd", "", "", "", true);
	static public final MCReportMeta psppl_nm_META_0 = new MCReportMeta("psppl_nm", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm1_META_0 = new MCReportMeta("psppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm2_META_0 = new MCReportMeta("psppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm3_META_0 = new MCReportMeta("psppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm4_META_0 = new MCReportMeta("psppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta bsppl_cd_META_0 = new MCReportMeta("bsppl_cd", "", "", "", true);
	static public final MCReportMeta bsppl_nm_META_0 = new MCReportMeta("bsppl_nm", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm1_META_0 = new MCReportMeta("bsppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm2_META_0 = new MCReportMeta("bsppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm3_META_0 = new MCReportMeta("bsppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm4_META_0 = new MCReportMeta("bsppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta psppl_rmrks_META_0 = new MCReportMeta("psppl_rmrks", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_META_0 = new MCReportMeta("bsppl_dpt_cd", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_nm_META_0 = new MCReportMeta("bsppl_dpt_nm", "", "", "", true);
	static public final MCReportMeta bsppl_usr_cd_META_0 = new MCReportMeta("bsppl_usr_cd", "", "", "", true);
	static public final MCReportMeta bsppl_usr_nm_META_0 = new MCReportMeta("bsppl_usr_nm", "", "", "", true);
	static public final MCReportMeta pay_schd_d_print_hdr_rmrks_META_0 = new MCReportMeta("pay_schd_d_print_hdr_rmrks", "", "", "", true);

	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_int_unit_qty_META_1 = new MCReportMeta("s_int_unit_qty", "", "", "", true);
	static public final MCReportMeta s_dec_unit_qty_META_1 = new MCReportMeta("s_dec_unit_qty", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_1 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta sppl_cd_META_1 = new MCReportMeta("sppl_cd", "", "", "", true);
	static public final MCReportMeta sppl_nm_META_1 = new MCReportMeta("sppl_nm", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm1_META_1 = new MCReportMeta("sppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm2_META_1 = new MCReportMeta("sppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm3_META_1 = new MCReportMeta("sppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta sppl_alt_nm4_META_1 = new MCReportMeta("sppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_upri_META_1 = new MCReportMeta("s_int_upri", "", "", "", true);
	static public final MCReportMeta s_dec_upri_META_1 = new MCReportMeta("s_dec_upri", "", "", "", true);
	static public final MCReportMeta po_no_META_1 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_1 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_amt_META_1 = new MCReportMeta("s_int_amt", "", "", "", true);
	static public final MCReportMeta s_dec_amt_META_1 = new MCReportMeta("s_dec_amt", "", "", "", true);
	static public final MCReportMeta bp_dlv_slip_no_META_1 = new MCReportMeta("bp_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_tax_amt_META_1 = new MCReportMeta("s_int_tax_amt", "", "", "", true);
	static public final MCReportMeta s_dec_tax_amt_META_1 = new MCReportMeta("s_dec_tax_amt", "", "", "", true);
	static public final MCReportMeta tax_cd_META_1 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_1 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_1 = new MCReportMeta("tax_rate", "COMMA", "", "", true);
	static public final MCReportMeta s_int_tax_rate_META_1 = new MCReportMeta("s_int_tax_rate", "", "", "", true);
	static public final MCReportMeta s_dec_tax_rate_META_1 = new MCReportMeta("s_dec_tax_rate", "", "", "", true);
	static public final MCReportMeta act_dt_META_1 = new MCReportMeta("act_dt", "YMD", "", "", true);
	static public final MCReportMeta trd_cd_META_1 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_1 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta pay_schd_d_print_rmrks_META_1 = new MCReportMeta("pay_schd_d_print_rmrks", "", "", "", true);
	static public final MCReportMeta pay_mtd_typ_META_1 = new MCReportMeta("pay_mtd_typ", "", "", "", true);
	static public final MCReportMeta pay_mtd_typ_nm_META_1 = new MCReportMeta("pay_mtd_typ_nm", "", "", "", true);
	static public final MCReportMeta crryovr_flg_META_1 = new MCReportMeta("crryovr_flg", "", "", "", true);
	static public final MCReportMeta part_pay_mark_META_1 = new MCReportMeta("part_pay_mark", "", "", "", true);
	static public final MCReportMeta trd_unit_dec_place_META_1 = new MCReportMeta("trd_unit_dec_place", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_dec_place_META_1 = new MCReportMeta("trd_cur_upri_dec_place", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_dec_place_META_1 = new MCReportMeta("trd_cur_amt_dec_place", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta s_inc_tax_flg_META_1 = new MCReportMeta("s_inc_tax_flg", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_1 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta dscnt_itm_flg_META_1 = new MCReportMeta("dscnt_itm_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_proc_upri_META_1 = new MCReportMeta("trd_cur_proc_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_proc_upri_META_1 = new MCReportMeta("s_int_proc_upri", "", "", "", true);
	static public final MCReportMeta s_dec_proc_upri_META_1 = new MCReportMeta("s_dec_proc_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_proc_amt_META_1 = new MCReportMeta("trd_cur_proc_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_proc_amt_META_1 = new MCReportMeta("s_int_proc_amt", "", "", "", true);
	static public final MCReportMeta s_dec_proc_amt_META_1 = new MCReportMeta("s_dec_proc_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_onr_prov_upri_META_1 = new MCReportMeta("trd_cur_onr_prov_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_int_onr_prov_upri_META_1 = new MCReportMeta("s_int_onr_prov_upri", "", "", "", true);
	static public final MCReportMeta s_dec_onr_prov_upri_META_1 = new MCReportMeta("s_dec_onr_prov_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_onr_prov_amt_META_1 = new MCReportMeta("trd_cur_onr_prov_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_onr_prov_amt_META_1 = new MCReportMeta("s_int_onr_prov_amt", "", "", "", true);
	static public final MCReportMeta s_dec_onr_prov_amt_META_1 = new MCReportMeta("s_dec_onr_prov_amt", "", "", "", true);
	static public final MCReportMeta repurc_obli_flg_META_1 = new MCReportMeta("repurc_obli_flg", "", "", "", true);

	static public final MCReportMeta total_amt_META_2 = new MCReportMeta("total_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_total_amt_META_2 = new MCReportMeta("s_total_amt", "", "", "", true);
	static public final MCReportMeta total_com_paid_META_2 = new MCReportMeta("total_com_paid", "COMMA", "", "", true);
	static public final MCReportMeta s_total_com_paid_META_2 = new MCReportMeta("s_total_com_paid", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_2 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_2 = new MCReportMeta("trd_cur_nm", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PaySchdHdr",
			prnt_tm_META_0,
			pay_chk_no_META_0,
			psppl_cd_META_0,
			psppl_nm_META_0,
			psppl_alt_nm1_META_0,
			psppl_alt_nm2_META_0,
			psppl_alt_nm3_META_0,
			psppl_alt_nm4_META_0,
			bsppl_cd_META_0,
			bsppl_nm_META_0,
			bsppl_alt_nm1_META_0,
			bsppl_alt_nm2_META_0,
			bsppl_alt_nm3_META_0,
			bsppl_alt_nm4_META_0,
			psppl_rmrks_META_0,
			bsppl_dpt_cd_META_0,
			bsppl_dpt_nm_META_0,
			bsppl_usr_cd_META_0,
			bsppl_usr_nm_META_0,
			pay_schd_d_print_hdr_rmrks_META_0
		);
		reportMetaMap.add("PaySchdDtl",
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub2_view_META_1,
			itm_sub3_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_data_META_1,
			itm_sub3_data_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			trd_unit_qty_META_1,
			s_int_unit_qty_META_1,
			s_dec_unit_qty_META_1,
			trd_unit_nm_META_1,
			sppl_cd_META_1,
			sppl_nm_META_1,
			sppl_alt_nm1_META_1,
			sppl_alt_nm2_META_1,
			sppl_alt_nm3_META_1,
			sppl_alt_nm4_META_1,
			trd_cur_upri_META_1,
			s_int_upri_META_1,
			s_dec_upri_META_1,
			po_no_META_1,
			po_d_no_META_1,
			trd_cur_amt_META_1,
			s_int_amt_META_1,
			s_dec_amt_META_1,
			bp_dlv_slip_no_META_1,
			trd_cur_tax_amt_META_1,
			s_int_tax_amt_META_1,
			s_dec_tax_amt_META_1,
			tax_cd_META_1,
			tax_nm_META_1,
			tax_rate_META_1,
			s_int_tax_rate_META_1,
			s_dec_tax_rate_META_1,
			act_dt_META_1,
			trd_cd_META_1,
			trd_nm_META_1,
			pay_schd_d_print_rmrks_META_1,
			pay_mtd_typ_META_1,
			pay_mtd_typ_nm_META_1,
			crryovr_flg_META_1,
			part_pay_mark_META_1,
			trd_unit_dec_place_META_1,
			trd_cur_upri_dec_place_META_1,
			trd_cur_amt_dec_place_META_1,
			inc_tax_flg_META_1,
			s_inc_tax_flg_META_1,
			trd_ptn_typ_META_1,
			dscnt_itm_flg_META_1,
			trd_cur_proc_upri_META_1,
			s_int_proc_upri_META_1,
			s_dec_proc_upri_META_1,
			trd_cur_proc_amt_META_1,
			s_int_proc_amt_META_1,
			s_dec_proc_amt_META_1,
			trd_cur_onr_prov_upri_META_1,
			s_int_onr_prov_upri_META_1,
			s_dec_onr_prov_upri_META_1,
			trd_cur_onr_prov_amt_META_1,
			s_int_onr_prov_amt_META_1,
			s_dec_onr_prov_amt_META_1,
			repurc_obli_flg_META_1
		);
		reportMetaMap.add("PaySchdFtr",
			total_amt_META_2,
			s_total_amt_META_2,
			total_com_paid_META_2,
			s_total_com_paid_META_2,
			trd_cur_cd_META_2,
			trd_cur_nm_META_2
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBHR_PaySchdDtl_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

