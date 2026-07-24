package mcframe.commonMSBG.MSBGR0020;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBGR_SlsDtl_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBGR0020";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass SLSHDRL_RC = new MCReportClass("SlsHdr", mcframe.commonMSBG.MSBGR0020.SlsHdrR.class, MCList.class);
	static public final MCReportClass SLSDTLL_RC = new MCReportClass("SlsDtl", mcframe.commonMSBG.MSBGR0010.BillDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		SLSHDRL_RC,
		SLSDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta bill_ym_META_0 = new MCReportMeta("bill_ym", "", "", "", true);
	static public final MCReportMeta bill_cl_day_META_0 = new MCReportMeta("bill_cl_day", "", "", "", true);
	static public final MCReportMeta bill_dt_META_0 = new MCReportMeta("bill_dt", "YMD", "", "", true);
	static public final MCReportMeta re_issue_META_0 = new MCReportMeta("re_issue", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "", "", "", true);
	static public final MCReportMeta bill_no_META_0 = new MCReportMeta("bill_no", "", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta bp_cd_META_0 = new MCReportMeta("bp_cd", "", "", "", true);
	static public final MCReportMeta bp_zip_cd_META_0 = new MCReportMeta("bp_zip_cd", "", "", "", true);
	static public final MCReportMeta bp_addr1_META_0 = new MCReportMeta("bp_addr1", "", "", "", true);
	static public final MCReportMeta bp_addr2_META_0 = new MCReportMeta("bp_addr2", "", "", "", true);
	static public final MCReportMeta bp_addr3_META_0 = new MCReportMeta("bp_addr3", "", "", "", true);
	static public final MCReportMeta bp_addr4_META_0 = new MCReportMeta("bp_addr4", "", "", "", true);
	static public final MCReportMeta bp_addr_META_0 = new MCReportMeta("bp_addr", "", "", "", true);
	static public final MCReportMeta bp_nm_META_0 = new MCReportMeta("bp_nm", "", "", "", true);
	static public final MCReportMeta bp_alt_nm1_META_0 = new MCReportMeta("bp_alt_nm1", "", "", "", true);
	static public final MCReportMeta bp_alt_nm2_META_0 = new MCReportMeta("bp_alt_nm2", "", "", "", true);
	static public final MCReportMeta bp_alt_nm3_META_0 = new MCReportMeta("bp_alt_nm3", "", "", "", true);
	static public final MCReportMeta bp_alt_nm4_META_0 = new MCReportMeta("bp_alt_nm4", "", "", "", true);
	static public final MCReportMeta bp_tel_META_0 = new MCReportMeta("bp_tel", "", "", "", true);
	static public final MCReportMeta bp_cntry_nm_META_0 = new MCReportMeta("bp_cntry_nm", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta addr_META_0 = new MCReportMeta("addr", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta cntry_nm_META_0 = new MCReportMeta("cntry_nm", "", "", "", true);
	static public final MCReportMeta bill_dpt_cd_META_0 = new MCReportMeta("bill_dpt_cd", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_tel_META_0 = new MCReportMeta("dpt_tel", "", "", "", true);
	static public final MCReportMeta biz_co_no_META_0 = new MCReportMeta("biz_co_no", "", "", "", true);
	static public final MCReportMeta bill_amt_META_0 = new MCReportMeta("bill_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_bill_amt_META_0 = new MCReportMeta("s_bill_amt", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta cur_nm_META_0 = new MCReportMeta("cur_nm", "", "", "", true);
	static public final MCReportMeta sls_amt_META_0 = new MCReportMeta("sls_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_sls_amt_META_0 = new MCReportMeta("s_sls_amt", "", "", "", true);
	static public final MCReportMeta dscnt_amt_META_0 = new MCReportMeta("dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_dscnt_amt_META_0 = new MCReportMeta("s_dscnt_amt", "", "", "", true);
	static public final MCReportMeta ret_amt_META_0 = new MCReportMeta("ret_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ret_amt_META_0 = new MCReportMeta("s_ret_amt", "", "", "", true);
	static public final MCReportMeta tax_amt_META_0 = new MCReportMeta("tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_amt_META_0 = new MCReportMeta("s_tax_amt", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta base_sls_ac_dt_META_1 = new MCReportMeta("base_sls_ac_dt", "YMD", "", "", true);
	static public final MCReportMeta bill_d_rmrks_META_1 = new MCReportMeta("bill_d_rmrks", "", "", "", true);
	static public final MCReportMeta dlv_dt_META_1 = new MCReportMeta("dlv_dt", "YMD", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_1 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_1 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_no_META_1 = new MCReportMeta("ship_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_d_no_META_1 = new MCReportMeta("ship_dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_multi_flg_META_1 = new MCReportMeta("ship_dlv_slip_multi_flg", "", "", "", true);
	static public final MCReportMeta act_no_META_1 = new MCReportMeta("act_no", "", "", "", true);
	static public final MCReportMeta act_rev_META_1 = new MCReportMeta("act_rev", "", "", "", true);
	static public final MCReportMeta act_d_no_META_1 = new MCReportMeta("act_d_no", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_1 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_nm_META_1 = new MCReportMeta("slip_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta itm_cd_META_1 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_view_META_1 = new MCReportMeta("itm_sub1_view", "", "", "", true);
	static public final MCReportMeta itm_sub2_view_META_1 = new MCReportMeta("itm_sub2_view", "", "", "", true);
	static public final MCReportMeta itm_sub3_view_META_1 = new MCReportMeta("itm_sub3_view", "", "", "", true);
	static public final MCReportMeta itm_sub1_data_META_1 = new MCReportMeta("itm_sub1_data", "", "", "", true);
	static public final MCReportMeta itm_sub2_data_META_1 = new MCReportMeta("itm_sub2_data", "", "", "", true);
	static public final MCReportMeta itm_sub3_data_META_1 = new MCReportMeta("itm_sub3_data", "", "", "", true);
	static public final MCReportMeta cst_itm_cd_META_1 = new MCReportMeta("cst_itm_cd", "", "", "", true);
	static public final MCReportMeta part_bill_d_label1_META_1 = new MCReportMeta("part_bill_d_label1", "", "", "", true);
	static public final MCReportMeta part_bill_d_label2_META_1 = new MCReportMeta("part_bill_d_label2", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta cst_itm_nm_META_1 = new MCReportMeta("cst_itm_nm", "", "", "", true);
	static public final MCReportMeta part_bill_d_amt1_META_1 = new MCReportMeta("part_bill_d_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_part_bill_d_amt1_int_META_1 = new MCReportMeta("s_part_bill_d_amt1_int", "", "", "", true);
	static public final MCReportMeta s_part_bill_d_amt1_dec_META_1 = new MCReportMeta("s_part_bill_d_amt1_dec", "", "", "", true);
	static public final MCReportMeta part_bill_d_amt2_META_1 = new MCReportMeta("part_bill_d_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_part_bill_d_amt2_int_META_1 = new MCReportMeta("s_part_bill_d_amt2_int", "", "", "", true);
	static public final MCReportMeta s_part_bill_d_amt2_dec_META_1 = new MCReportMeta("s_part_bill_d_amt2_dec", "", "", "", true);
	static public final MCReportMeta trd_cd_META_1 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_1 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_1 = new MCReportMeta("trd_unit_qty", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_int_META_1 = new MCReportMeta("s_trd_unit_qty_int", "", "", "", true);
	static public final MCReportMeta s_trd_unit_qty_dec_META_1 = new MCReportMeta("s_trd_unit_qty_dec", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_1 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta unit_nm_META_1 = new MCReportMeta("unit_nm", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_1 = new MCReportMeta("trd_cur_upri", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_upri_int_META_1 = new MCReportMeta("s_trd_cur_upri_int", "", "", "", true);
	static public final MCReportMeta s_trd_cur_upri_dec_META_1 = new MCReportMeta("s_trd_cur_upri_dec", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_1 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta s_inc_tax_flg_META_1 = new MCReportMeta("s_inc_tax_flg", "", "", "", true);
	static public final MCReportMeta interim_flg_META_1 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta s_interim_flg_META_1 = new MCReportMeta("s_interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_amt_int_META_1 = new MCReportMeta("s_trd_cur_amt_int", "", "", "", true);
	static public final MCReportMeta s_trd_cur_amt_dec_META_1 = new MCReportMeta("s_trd_cur_amt_dec", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_1 = new MCReportMeta("trd_cur_dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_dscnt_amt_int_META_1 = new MCReportMeta("s_trd_cur_dscnt_amt_int", "", "", "", true);
	static public final MCReportMeta s_trd_cur_dscnt_amt_dec_META_1 = new MCReportMeta("s_trd_cur_dscnt_amt_dec", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_1 = new MCReportMeta("trd_cur_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_trd_cur_tax_amt_int_META_1 = new MCReportMeta("s_trd_cur_tax_amt_int", "", "", "", true);
	static public final MCReportMeta s_trd_cur_tax_amt_dec_META_1 = new MCReportMeta("s_trd_cur_tax_amt_dec", "", "", "", true);
	static public final MCReportMeta tax_rate_META_1 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta s_tax_rate_META_1 = new MCReportMeta("s_tax_rate", "", "", "", true);
	static public final MCReportMeta tax_cd_META_1 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_1 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_1 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("SlsHdr",
			bill_ym_META_0,
			bill_cl_day_META_0,
			bill_dt_META_0,
			re_issue_META_0,
			prnt_tm_META_0,
			bill_no_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			bp_cd_META_0,
			bp_zip_cd_META_0,
			bp_addr1_META_0,
			bp_addr2_META_0,
			bp_addr3_META_0,
			bp_addr4_META_0,
			bp_addr_META_0,
			bp_nm_META_0,
			bp_alt_nm1_META_0,
			bp_alt_nm2_META_0,
			bp_alt_nm3_META_0,
			bp_alt_nm4_META_0,
			bp_tel_META_0,
			bp_cntry_nm_META_0,
			co_cd_META_0,
			zip_cd_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			addr_META_0,
			co_nm_META_0,
			cntry_nm_META_0,
			bill_dpt_cd_META_0,
			dpt_nm_META_0,
			dpt_tel_META_0,
			biz_co_no_META_0,
			bill_amt_META_0,
			s_bill_amt_META_0,
			cur_cd_META_0,
			cur_nm_META_0,
			sls_amt_META_0,
			s_sls_amt_META_0,
			dscnt_amt_META_0,
			s_dscnt_amt_META_0,
			ret_amt_META_0,
			s_ret_amt_META_0,
			tax_amt_META_0,
			s_tax_amt_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("SlsDtl",
			base_sls_ac_dt_META_1,
			bill_d_rmrks_META_1,
			dlv_dt_META_1,
			dlv_slip_no_META_1,
			dlv_slip_d_no_META_1,
			ship_dlv_slip_no_META_1,
			ship_dlv_slip_d_no_META_1,
			ship_dlv_slip_multi_flg_META_1,
			act_no_META_1,
			act_rev_META_1,
			act_d_no_META_1,
			slip_sts_typ_META_1,
			slip_sts_typ_nm_META_1,
			itm_cd_META_1,
			itm_sub1_view_META_1,
			itm_sub2_view_META_1,
			itm_sub3_view_META_1,
			itm_sub1_data_META_1,
			itm_sub2_data_META_1,
			itm_sub3_data_META_1,
			cst_itm_cd_META_1,
			part_bill_d_label1_META_1,
			part_bill_d_label2_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			cst_itm_nm_META_1,
			part_bill_d_amt1_META_1,
			s_part_bill_d_amt1_int_META_1,
			s_part_bill_d_amt1_dec_META_1,
			part_bill_d_amt2_META_1,
			s_part_bill_d_amt2_int_META_1,
			s_part_bill_d_amt2_dec_META_1,
			trd_cd_META_1,
			trd_nm_META_1,
			trd_unit_qty_META_1,
			s_trd_unit_qty_int_META_1,
			s_trd_unit_qty_dec_META_1,
			trd_unit_cd_META_1,
			unit_nm_META_1,
			trd_cur_upri_META_1,
			s_trd_cur_upri_int_META_1,
			s_trd_cur_upri_dec_META_1,
			inc_tax_flg_META_1,
			s_inc_tax_flg_META_1,
			interim_flg_META_1,
			s_interim_flg_META_1,
			trd_cur_amt_META_1,
			s_trd_cur_amt_int_META_1,
			s_trd_cur_amt_dec_META_1,
			trd_cur_dscnt_amt_META_1,
			s_trd_cur_dscnt_amt_int_META_1,
			s_trd_cur_dscnt_amt_dec_META_1,
			trd_cur_tax_amt_META_1,
			s_trd_cur_tax_amt_int_META_1,
			s_trd_cur_tax_amt_dec_META_1,
			tax_rate_META_1,
			s_tax_rate_META_1,
			tax_cd_META_1,
			tax_nm_META_1,
			trd_d_rmrks_META_1,
			d_sub_char1_META_1,
			d_sub_char2_META_1,
			d_sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBGR_SlsDtl_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

