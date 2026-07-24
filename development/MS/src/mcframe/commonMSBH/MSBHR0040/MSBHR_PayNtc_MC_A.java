package mcframe.commonMSBH.MSBHR0040;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBHR_PayNtc_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBHR0040";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PAYNTCHDRL_RC = new MCReportClass("PayNtcHdr", mcframe.commonMSBH.MSBHR0040.PayNtcHdrR.class, MCList.class);
	static public final MCReportClass PAYNTCDTLL_RC = new MCReportClass("PayNtcDtl", mcframe.commonMSBH.MSBHR0040.PayNtcDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PAYNTCHDRL_RC,
		PAYNTCDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta pay_ntc_ym_META_0 = new MCReportMeta("pay_ntc_ym", "", "", "", true);
	static public final MCReportMeta pay_ntc_cl_day_META_0 = new MCReportMeta("pay_ntc_cl_day", "", "", "", true);
	static public final MCReportMeta reg_dt_META_0 = new MCReportMeta("reg_dt", "YMD", "", "", true);
	static public final MCReportMeta re_issue_META_0 = new MCReportMeta("re_issue", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "", "", "", true);
	static public final MCReportMeta pay_chk_no_META_0 = new MCReportMeta("pay_chk_no", "", "", "", true);
	static public final MCReportMeta pay_ntc_rev_META_0 = new MCReportMeta("pay_ntc_rev", "", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta bsppl_cd_META_0 = new MCReportMeta("bsppl_cd", "", "", "", true);
	static public final MCReportMeta pay_ntc_zip_cd_META_0 = new MCReportMeta("pay_ntc_zip_cd", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr1_META_0 = new MCReportMeta("pay_ntc_addr1", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr2_META_0 = new MCReportMeta("pay_ntc_addr2", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr3_META_0 = new MCReportMeta("pay_ntc_addr3", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr4_META_0 = new MCReportMeta("pay_ntc_addr4", "", "", "", true);
	static public final MCReportMeta pay_ntc_addr_META_0 = new MCReportMeta("pay_ntc_addr", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_nm_META_0 = new MCReportMeta("pay_ntc_bsppl_nm", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_dpt_META_0 = new MCReportMeta("pay_ntc_bsppl_dpt", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_psn_META_0 = new MCReportMeta("pay_ntc_bsppl_psn", "", "", "", true);
	static public final MCReportMeta pay_ntc_bsppl_psn_title_META_0 = new MCReportMeta("pay_ntc_bsppl_psn_title", "", "", "", true);
	static public final MCReportMeta pay_ntc_tel_META_0 = new MCReportMeta("pay_ntc_tel", "", "", "", true);
	static public final MCReportMeta biz_co_no_META_0 = new MCReportMeta("biz_co_no", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta zip_cd_META_0 = new MCReportMeta("zip_cd", "", "", "", true);
	static public final MCReportMeta addr1_META_0 = new MCReportMeta("addr1", "", "", "", true);
	static public final MCReportMeta addr2_META_0 = new MCReportMeta("addr2", "", "", "", true);
	static public final MCReportMeta addr3_META_0 = new MCReportMeta("addr3", "", "", "", true);
	static public final MCReportMeta addr4_META_0 = new MCReportMeta("addr4", "", "", "", true);
	static public final MCReportMeta addr_META_0 = new MCReportMeta("addr", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_META_0 = new MCReportMeta("bsppl_dpt_cd", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta dpt_tel_META_0 = new MCReportMeta("dpt_tel", "", "", "", true);
	static public final MCReportMeta schd_pay_amt_META_0 = new MCReportMeta("schd_pay_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_schd_pay_amt_META_0 = new MCReportMeta("s_schd_pay_amt", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta cur_nm_META_0 = new MCReportMeta("cur_nm", "", "", "", true);
	static public final MCReportMeta base_cur_cd_META_0 = new MCReportMeta("base_cur_cd", "", "", "", true);
	static public final MCReportMeta base_cur_nm_META_0 = new MCReportMeta("base_cur_nm", "", "", "", true);
	static public final MCReportMeta last_pay_schd_amt_META_0 = new MCReportMeta("last_pay_schd_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_last_pay_schd_amt_META_0 = new MCReportMeta("s_last_pay_schd_amt", "", "", "", true);
	static public final MCReportMeta pay_amt_META_0 = new MCReportMeta("pay_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_amt_META_0 = new MCReportMeta("s_pay_amt", "", "", "", true);
	static public final MCReportMeta sw_amt_META_0 = new MCReportMeta("sw_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_sw_amt_META_0 = new MCReportMeta("s_sw_amt", "", "", "", true);
	static public final MCReportMeta bfw_amt_META_0 = new MCReportMeta("bfw_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_bfw_amt_META_0 = new MCReportMeta("s_bfw_amt", "", "", "", true);
	static public final MCReportMeta purc_amt_META_0 = new MCReportMeta("purc_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_purc_amt_META_0 = new MCReportMeta("s_purc_amt", "", "", "", true);
	static public final MCReportMeta dscnt_amt_META_0 = new MCReportMeta("dscnt_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_dscnt_amt_META_0 = new MCReportMeta("s_dscnt_amt", "", "", "", true);
	static public final MCReportMeta ret_amt_META_0 = new MCReportMeta("ret_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ret_amt_META_0 = new MCReportMeta("s_ret_amt", "", "", "", true);
	static public final MCReportMeta setoff_amt_META_0 = new MCReportMeta("setoff_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_setoff_amt_META_0 = new MCReportMeta("s_setoff_amt", "", "", "", true);
	static public final MCReportMeta tax_amt_META_0 = new MCReportMeta("tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_amt_META_0 = new MCReportMeta("s_tax_amt", "", "", "", true);
	static public final MCReportMeta sw_to_amt_META_0 = new MCReportMeta("sw_to_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_sw_to_amt_META_0 = new MCReportMeta("s_sw_to_amt", "", "", "", true);
	static public final MCReportMeta adv_pay_bal_META_0 = new MCReportMeta("adv_pay_bal", "COMMA", "", "", true);
	static public final MCReportMeta s_adv_pay_bal_META_0 = new MCReportMeta("s_adv_pay_bal", "", "", "", true);
	static public final MCReportMeta adv_pay_amt_META_0 = new MCReportMeta("adv_pay_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_adv_pay_amt_META_0 = new MCReportMeta("s_adv_pay_amt", "", "", "", true);
	static public final MCReportMeta adv_pay_setoff_amt_META_0 = new MCReportMeta("adv_pay_setoff_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_adv_pay_setoff_amt_META_0 = new MCReportMeta("s_adv_pay_setoff_amt", "", "", "", true);
	static public final MCReportMeta adv_pay_setoff_tax_amt_META_0 = new MCReportMeta("adv_pay_setoff_tax_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_adv_pay_setoff_tax_amt_META_0 = new MCReportMeta("s_adv_pay_setoff_tax_amt", "", "", "", true);
	static public final MCReportMeta pay_xrate_META_0 = new MCReportMeta("pay_xrate", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_xrate_META_0 = new MCReportMeta("s_pay_xrate", "", "", "", true);
	static public final MCReportMeta tax_rate1_META_0 = new MCReportMeta("tax_rate1", "", "", "", true);
	static public final MCReportMeta s_tax_rate1_META_0 = new MCReportMeta("s_tax_rate1", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt1_META_0 = new MCReportMeta("tax_rate_purc_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt1_META_0 = new MCReportMeta("s_tax_rate_purc_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt1_META_0 = new MCReportMeta("tax_rate_tax_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt1_META_0 = new MCReportMeta("s_tax_rate_tax_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt1_META_0 = new MCReportMeta("tax_rate_base_tax_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt1_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate2_META_0 = new MCReportMeta("tax_rate2", "", "", "", true);
	static public final MCReportMeta s_tax_rate2_META_0 = new MCReportMeta("s_tax_rate2", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt2_META_0 = new MCReportMeta("tax_rate_purc_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt2_META_0 = new MCReportMeta("s_tax_rate_purc_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt2_META_0 = new MCReportMeta("tax_rate_tax_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt2_META_0 = new MCReportMeta("s_tax_rate_tax_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt2_META_0 = new MCReportMeta("tax_rate_base_tax_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt2_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate3_META_0 = new MCReportMeta("tax_rate3", "", "", "", true);
	static public final MCReportMeta s_tax_rate3_META_0 = new MCReportMeta("s_tax_rate3", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt3_META_0 = new MCReportMeta("tax_rate_purc_amt3", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt3_META_0 = new MCReportMeta("s_tax_rate_purc_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt3_META_0 = new MCReportMeta("tax_rate_tax_amt3", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt3_META_0 = new MCReportMeta("s_tax_rate_tax_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt3_META_0 = new MCReportMeta("tax_rate_base_tax_amt3", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt3_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate4_META_0 = new MCReportMeta("tax_rate4", "", "", "", true);
	static public final MCReportMeta s_tax_rate4_META_0 = new MCReportMeta("s_tax_rate4", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt4_META_0 = new MCReportMeta("tax_rate_purc_amt4", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt4_META_0 = new MCReportMeta("s_tax_rate_purc_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt4_META_0 = new MCReportMeta("tax_rate_tax_amt4", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt4_META_0 = new MCReportMeta("s_tax_rate_tax_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt4_META_0 = new MCReportMeta("tax_rate_base_tax_amt4", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt4_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate5_META_0 = new MCReportMeta("tax_rate5", "", "", "", true);
	static public final MCReportMeta s_tax_rate5_META_0 = new MCReportMeta("s_tax_rate5", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt5_META_0 = new MCReportMeta("tax_rate_purc_amt5", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt5_META_0 = new MCReportMeta("s_tax_rate_purc_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt5_META_0 = new MCReportMeta("tax_rate_tax_amt5", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt5_META_0 = new MCReportMeta("s_tax_rate_tax_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt5_META_0 = new MCReportMeta("tax_rate_base_tax_amt5", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt5_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate6_META_0 = new MCReportMeta("tax_rate6", "", "", "", true);
	static public final MCReportMeta s_tax_rate6_META_0 = new MCReportMeta("s_tax_rate6", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt6_META_0 = new MCReportMeta("tax_rate_purc_amt6", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt6_META_0 = new MCReportMeta("s_tax_rate_purc_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt6_META_0 = new MCReportMeta("tax_rate_tax_amt6", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt6_META_0 = new MCReportMeta("s_tax_rate_tax_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt6_META_0 = new MCReportMeta("tax_rate_base_tax_amt6", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt6_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate7_META_0 = new MCReportMeta("tax_rate7", "", "", "", true);
	static public final MCReportMeta s_tax_rate7_META_0 = new MCReportMeta("s_tax_rate7", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt7_META_0 = new MCReportMeta("tax_rate_purc_amt7", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt7_META_0 = new MCReportMeta("s_tax_rate_purc_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt7_META_0 = new MCReportMeta("tax_rate_tax_amt7", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt7_META_0 = new MCReportMeta("s_tax_rate_tax_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt7_META_0 = new MCReportMeta("tax_rate_base_tax_amt7", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt7_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate8_META_0 = new MCReportMeta("tax_rate8", "", "", "", true);
	static public final MCReportMeta s_tax_rate8_META_0 = new MCReportMeta("s_tax_rate8", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt8_META_0 = new MCReportMeta("tax_rate_purc_amt8", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt8_META_0 = new MCReportMeta("s_tax_rate_purc_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt8_META_0 = new MCReportMeta("tax_rate_tax_amt8", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt8_META_0 = new MCReportMeta("s_tax_rate_tax_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt8_META_0 = new MCReportMeta("tax_rate_base_tax_amt8", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt8_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate9_META_0 = new MCReportMeta("tax_rate9", "", "", "", true);
	static public final MCReportMeta s_tax_rate9_META_0 = new MCReportMeta("s_tax_rate9", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt9_META_0 = new MCReportMeta("tax_rate_purc_amt9", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt9_META_0 = new MCReportMeta("s_tax_rate_purc_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt9_META_0 = new MCReportMeta("tax_rate_tax_amt9", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt9_META_0 = new MCReportMeta("s_tax_rate_tax_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt9_META_0 = new MCReportMeta("tax_rate_base_tax_amt9", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt9_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate10_META_0 = new MCReportMeta("tax_rate10", "", "", "", true);
	static public final MCReportMeta s_tax_rate10_META_0 = new MCReportMeta("s_tax_rate10", "", "", "", true);
	static public final MCReportMeta tax_rate_purc_amt10_META_0 = new MCReportMeta("tax_rate_purc_amt10", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_purc_amt10_META_0 = new MCReportMeta("s_tax_rate_purc_amt10", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt10_META_0 = new MCReportMeta("tax_rate_tax_amt10", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_tax_amt10_META_0 = new MCReportMeta("s_tax_rate_tax_amt10", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt10_META_0 = new MCReportMeta("tax_rate_base_tax_amt10", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_rate_base_tax_amt10_META_0 = new MCReportMeta("s_tax_rate_base_tax_amt10", "", "", "", true);
	static public final MCReportMeta pay_schd_dt1_META_0 = new MCReportMeta("pay_schd_dt1", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd1_META_0 = new MCReportMeta("sttl_cd1", "", "", "", true);
	static public final MCReportMeta sttl_nm1_META_0 = new MCReportMeta("sttl_nm1", "", "", "", true);
	static public final MCReportMeta pay_schd_amt1_META_0 = new MCReportMeta("pay_schd_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_schd_amt1_META_0 = new MCReportMeta("s_pay_schd_amt1", "", "", "", true);
	static public final MCReportMeta bank_cd1_META_0 = new MCReportMeta("bank_cd1", "", "", "", true);
	static public final MCReportMeta bank_nm1_META_0 = new MCReportMeta("bank_nm1", "", "", "", true);
	static public final MCReportMeta branch_cd1_META_0 = new MCReportMeta("branch_cd1", "", "", "", true);
	static public final MCReportMeta branch_nm1_META_0 = new MCReportMeta("branch_nm1", "", "", "", true);
	static public final MCReportMeta bank_ac_no1_META_0 = new MCReportMeta("bank_ac_no1", "", "", "", true);
	static public final MCReportMeta pay_schd_dt2_META_0 = new MCReportMeta("pay_schd_dt2", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd2_META_0 = new MCReportMeta("sttl_cd2", "", "", "", true);
	static public final MCReportMeta sttl_nm2_META_0 = new MCReportMeta("sttl_nm2", "", "", "", true);
	static public final MCReportMeta pay_schd_amt2_META_0 = new MCReportMeta("pay_schd_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_schd_amt2_META_0 = new MCReportMeta("s_pay_schd_amt2", "", "", "", true);
	static public final MCReportMeta bank_cd2_META_0 = new MCReportMeta("bank_cd2", "", "", "", true);
	static public final MCReportMeta bank_nm2_META_0 = new MCReportMeta("bank_nm2", "", "", "", true);
	static public final MCReportMeta branch_cd2_META_0 = new MCReportMeta("branch_cd2", "", "", "", true);
	static public final MCReportMeta branch_nm2_META_0 = new MCReportMeta("branch_nm2", "", "", "", true);
	static public final MCReportMeta bank_ac_no2_META_0 = new MCReportMeta("bank_ac_no2", "", "", "", true);
	static public final MCReportMeta pay_schd_dt3_META_0 = new MCReportMeta("pay_schd_dt3", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd3_META_0 = new MCReportMeta("sttl_cd3", "", "", "", true);
	static public final MCReportMeta sttl_nm3_META_0 = new MCReportMeta("sttl_nm3", "", "", "", true);
	static public final MCReportMeta pay_schd_amt3_META_0 = new MCReportMeta("pay_schd_amt3", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_schd_amt3_META_0 = new MCReportMeta("s_pay_schd_amt3", "", "", "", true);
	static public final MCReportMeta bank_cd3_META_0 = new MCReportMeta("bank_cd3", "", "", "", true);
	static public final MCReportMeta bank_nm3_META_0 = new MCReportMeta("bank_nm3", "", "", "", true);
	static public final MCReportMeta branch_cd3_META_0 = new MCReportMeta("branch_cd3", "", "", "", true);
	static public final MCReportMeta branch_nm3_META_0 = new MCReportMeta("branch_nm3", "", "", "", true);
	static public final MCReportMeta bank_ac_no3_META_0 = new MCReportMeta("bank_ac_no3", "", "", "", true);
	static public final MCReportMeta pay_schd_dt4_META_0 = new MCReportMeta("pay_schd_dt4", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd4_META_0 = new MCReportMeta("sttl_cd4", "", "", "", true);
	static public final MCReportMeta sttl_nm4_META_0 = new MCReportMeta("sttl_nm4", "", "", "", true);
	static public final MCReportMeta pay_schd_amt4_META_0 = new MCReportMeta("pay_schd_amt4", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_schd_amt4_META_0 = new MCReportMeta("s_pay_schd_amt4", "", "", "", true);
	static public final MCReportMeta bank_cd4_META_0 = new MCReportMeta("bank_cd4", "", "", "", true);
	static public final MCReportMeta bank_nm4_META_0 = new MCReportMeta("bank_nm4", "", "", "", true);
	static public final MCReportMeta branch_cd4_META_0 = new MCReportMeta("branch_cd4", "", "", "", true);
	static public final MCReportMeta branch_nm4_META_0 = new MCReportMeta("branch_nm4", "", "", "", true);
	static public final MCReportMeta bank_ac_no4_META_0 = new MCReportMeta("bank_ac_no4", "", "", "", true);
	static public final MCReportMeta pay_schd_dt5_META_0 = new MCReportMeta("pay_schd_dt5", "YMD", "", "", true);
	static public final MCReportMeta sttl_cd5_META_0 = new MCReportMeta("sttl_cd5", "", "", "", true);
	static public final MCReportMeta sttl_nm5_META_0 = new MCReportMeta("sttl_nm5", "", "", "", true);
	static public final MCReportMeta pay_schd_amt5_META_0 = new MCReportMeta("pay_schd_amt5", "COMMA", "", "", true);
	static public final MCReportMeta s_pay_schd_amt5_META_0 = new MCReportMeta("s_pay_schd_amt5", "", "", "", true);
	static public final MCReportMeta bank_cd5_META_0 = new MCReportMeta("bank_cd5", "", "", "", true);
	static public final MCReportMeta bank_nm5_META_0 = new MCReportMeta("bank_nm5", "", "", "", true);
	static public final MCReportMeta branch_cd5_META_0 = new MCReportMeta("branch_cd5", "", "", "", true);
	static public final MCReportMeta branch_nm5_META_0 = new MCReportMeta("branch_nm5", "", "", "", true);
	static public final MCReportMeta bank_ac_no5_META_0 = new MCReportMeta("bank_ac_no5", "", "", "", true);
	static public final MCReportMeta pay_ntc_dtl_outp_flg_META_0 = new MCReportMeta("pay_ntc_dtl_outp_flg", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta hdr_page_META_0 = new MCReportMeta("hdr_page", "", "", "", true);

	static public final MCReportMeta purc_ac_dt_META_1 = new MCReportMeta("purc_ac_dt", "YMD", "", "", true);
	static public final MCReportMeta base_purc_ac_dt_META_1 = new MCReportMeta("base_purc_ac_dt", "YMD", "", "", true);
	static public final MCReportMeta po_no_META_1 = new MCReportMeta("po_no", "", "", "", true);
	static public final MCReportMeta po_d_no_META_1 = new MCReportMeta("po_d_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_1 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_1 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
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
	static public final MCReportMeta sppl_itm_cd_META_1 = new MCReportMeta("sppl_itm_cd", "", "", "", true);
	static public final MCReportMeta part_pay_d_label1_META_1 = new MCReportMeta("part_pay_d_label1", "", "", "", true);
	static public final MCReportMeta part_pay_d_label2_META_1 = new MCReportMeta("part_pay_d_label2", "", "", "", true);
	static public final MCReportMeta itm_nm_META_1 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_1 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_1 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_1 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_1 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta sppl_itm_nm_META_1 = new MCReportMeta("sppl_itm_nm", "", "", "", true);
	static public final MCReportMeta pay_mtd_typ_META_1 = new MCReportMeta("pay_mtd_typ", "", "", "", true);
	static public final MCReportMeta part_pay_d_amt1_META_1 = new MCReportMeta("part_pay_d_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_part_pay_d_amt1_int_META_1 = new MCReportMeta("s_part_pay_d_amt1_int", "", "", "", true);
	static public final MCReportMeta s_part_pay_d_amt1_dec_META_1 = new MCReportMeta("s_part_pay_d_amt1_dec", "", "", "", true);
	static public final MCReportMeta part_pay_d_amt2_META_1 = new MCReportMeta("part_pay_d_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_part_pay_d_amt2_int_META_1 = new MCReportMeta("s_part_pay_d_amt2_int", "", "", "", true);
	static public final MCReportMeta s_part_pay_d_amt2_dec_META_1 = new MCReportMeta("s_part_pay_d_amt2_dec", "", "", "", true);
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
	static public final MCReportMeta pay_ntc_d_print_rmrks_META_1 = new MCReportMeta("pay_ntc_d_print_rmrks", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PayNtcHdr",
			pay_ntc_ym_META_0,
			pay_ntc_cl_day_META_0,
			reg_dt_META_0,
			re_issue_META_0,
			prnt_tm_META_0,
			pay_chk_no_META_0,
			pay_ntc_rev_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			bsppl_cd_META_0,
			pay_ntc_zip_cd_META_0,
			pay_ntc_addr1_META_0,
			pay_ntc_addr2_META_0,
			pay_ntc_addr3_META_0,
			pay_ntc_addr4_META_0,
			pay_ntc_addr_META_0,
			pay_ntc_bsppl_nm_META_0,
			pay_ntc_bsppl_dpt_META_0,
			pay_ntc_bsppl_psn_META_0,
			pay_ntc_bsppl_psn_title_META_0,
			pay_ntc_tel_META_0,
			biz_co_no_META_0,
			co_cd_META_0,
			zip_cd_META_0,
			addr1_META_0,
			addr2_META_0,
			addr3_META_0,
			addr4_META_0,
			addr_META_0,
			co_nm_META_0,
			bsppl_dpt_cd_META_0,
			dpt_nm_META_0,
			dpt_tel_META_0,
			schd_pay_amt_META_0,
			s_schd_pay_amt_META_0,
			cur_cd_META_0,
			cur_nm_META_0,
			base_cur_cd_META_0,
			base_cur_nm_META_0,
			last_pay_schd_amt_META_0,
			s_last_pay_schd_amt_META_0,
			pay_amt_META_0,
			s_pay_amt_META_0,
			sw_amt_META_0,
			s_sw_amt_META_0,
			bfw_amt_META_0,
			s_bfw_amt_META_0,
			purc_amt_META_0,
			s_purc_amt_META_0,
			dscnt_amt_META_0,
			s_dscnt_amt_META_0,
			ret_amt_META_0,
			s_ret_amt_META_0,
			setoff_amt_META_0,
			s_setoff_amt_META_0,
			tax_amt_META_0,
			s_tax_amt_META_0,
			sw_to_amt_META_0,
			s_sw_to_amt_META_0,
			adv_pay_bal_META_0,
			s_adv_pay_bal_META_0,
			adv_pay_amt_META_0,
			s_adv_pay_amt_META_0,
			adv_pay_setoff_amt_META_0,
			s_adv_pay_setoff_amt_META_0,
			adv_pay_setoff_tax_amt_META_0,
			s_adv_pay_setoff_tax_amt_META_0,
			pay_xrate_META_0,
			s_pay_xrate_META_0,
			tax_rate1_META_0,
			s_tax_rate1_META_0,
			tax_rate_purc_amt1_META_0,
			s_tax_rate_purc_amt1_META_0,
			tax_rate_tax_amt1_META_0,
			s_tax_rate_tax_amt1_META_0,
			tax_rate_base_tax_amt1_META_0,
			s_tax_rate_base_tax_amt1_META_0,
			tax_rate2_META_0,
			s_tax_rate2_META_0,
			tax_rate_purc_amt2_META_0,
			s_tax_rate_purc_amt2_META_0,
			tax_rate_tax_amt2_META_0,
			s_tax_rate_tax_amt2_META_0,
			tax_rate_base_tax_amt2_META_0,
			s_tax_rate_base_tax_amt2_META_0,
			tax_rate3_META_0,
			s_tax_rate3_META_0,
			tax_rate_purc_amt3_META_0,
			s_tax_rate_purc_amt3_META_0,
			tax_rate_tax_amt3_META_0,
			s_tax_rate_tax_amt3_META_0,
			tax_rate_base_tax_amt3_META_0,
			s_tax_rate_base_tax_amt3_META_0,
			tax_rate4_META_0,
			s_tax_rate4_META_0,
			tax_rate_purc_amt4_META_0,
			s_tax_rate_purc_amt4_META_0,
			tax_rate_tax_amt4_META_0,
			s_tax_rate_tax_amt4_META_0,
			tax_rate_base_tax_amt4_META_0,
			s_tax_rate_base_tax_amt4_META_0,
			tax_rate5_META_0,
			s_tax_rate5_META_0,
			tax_rate_purc_amt5_META_0,
			s_tax_rate_purc_amt5_META_0,
			tax_rate_tax_amt5_META_0,
			s_tax_rate_tax_amt5_META_0,
			tax_rate_base_tax_amt5_META_0,
			s_tax_rate_base_tax_amt5_META_0,
			tax_rate6_META_0,
			s_tax_rate6_META_0,
			tax_rate_purc_amt6_META_0,
			s_tax_rate_purc_amt6_META_0,
			tax_rate_tax_amt6_META_0,
			s_tax_rate_tax_amt6_META_0,
			tax_rate_base_tax_amt6_META_0,
			s_tax_rate_base_tax_amt6_META_0,
			tax_rate7_META_0,
			s_tax_rate7_META_0,
			tax_rate_purc_amt7_META_0,
			s_tax_rate_purc_amt7_META_0,
			tax_rate_tax_amt7_META_0,
			s_tax_rate_tax_amt7_META_0,
			tax_rate_base_tax_amt7_META_0,
			s_tax_rate_base_tax_amt7_META_0,
			tax_rate8_META_0,
			s_tax_rate8_META_0,
			tax_rate_purc_amt8_META_0,
			s_tax_rate_purc_amt8_META_0,
			tax_rate_tax_amt8_META_0,
			s_tax_rate_tax_amt8_META_0,
			tax_rate_base_tax_amt8_META_0,
			s_tax_rate_base_tax_amt8_META_0,
			tax_rate9_META_0,
			s_tax_rate9_META_0,
			tax_rate_purc_amt9_META_0,
			s_tax_rate_purc_amt9_META_0,
			tax_rate_tax_amt9_META_0,
			s_tax_rate_tax_amt9_META_0,
			tax_rate_base_tax_amt9_META_0,
			s_tax_rate_base_tax_amt9_META_0,
			tax_rate10_META_0,
			s_tax_rate10_META_0,
			tax_rate_purc_amt10_META_0,
			s_tax_rate_purc_amt10_META_0,
			tax_rate_tax_amt10_META_0,
			s_tax_rate_tax_amt10_META_0,
			tax_rate_base_tax_amt10_META_0,
			s_tax_rate_base_tax_amt10_META_0,
			pay_schd_dt1_META_0,
			sttl_cd1_META_0,
			sttl_nm1_META_0,
			pay_schd_amt1_META_0,
			s_pay_schd_amt1_META_0,
			bank_cd1_META_0,
			bank_nm1_META_0,
			branch_cd1_META_0,
			branch_nm1_META_0,
			bank_ac_no1_META_0,
			pay_schd_dt2_META_0,
			sttl_cd2_META_0,
			sttl_nm2_META_0,
			pay_schd_amt2_META_0,
			s_pay_schd_amt2_META_0,
			bank_cd2_META_0,
			bank_nm2_META_0,
			branch_cd2_META_0,
			branch_nm2_META_0,
			bank_ac_no2_META_0,
			pay_schd_dt3_META_0,
			sttl_cd3_META_0,
			sttl_nm3_META_0,
			pay_schd_amt3_META_0,
			s_pay_schd_amt3_META_0,
			bank_cd3_META_0,
			bank_nm3_META_0,
			branch_cd3_META_0,
			branch_nm3_META_0,
			bank_ac_no3_META_0,
			pay_schd_dt4_META_0,
			sttl_cd4_META_0,
			sttl_nm4_META_0,
			pay_schd_amt4_META_0,
			s_pay_schd_amt4_META_0,
			bank_cd4_META_0,
			bank_nm4_META_0,
			branch_cd4_META_0,
			branch_nm4_META_0,
			bank_ac_no4_META_0,
			pay_schd_dt5_META_0,
			sttl_cd5_META_0,
			sttl_nm5_META_0,
			pay_schd_amt5_META_0,
			s_pay_schd_amt5_META_0,
			bank_cd5_META_0,
			bank_nm5_META_0,
			branch_cd5_META_0,
			branch_nm5_META_0,
			bank_ac_no5_META_0,
			pay_ntc_dtl_outp_flg_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			hdr_page_META_0
		);
		reportMetaMap.add("PayNtcDtl",
			purc_ac_dt_META_1,
			base_purc_ac_dt_META_1,
			po_no_META_1,
			po_d_no_META_1,
			dlv_slip_no_META_1,
			dlv_slip_d_no_META_1,
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
			sppl_itm_cd_META_1,
			part_pay_d_label1_META_1,
			part_pay_d_label2_META_1,
			itm_nm_META_1,
			itm_alt_nm1_META_1,
			itm_alt_nm2_META_1,
			itm_alt_nm3_META_1,
			itm_alt_nm4_META_1,
			sppl_itm_nm_META_1,
			pay_mtd_typ_META_1,
			part_pay_d_amt1_META_1,
			s_part_pay_d_amt1_int_META_1,
			s_part_pay_d_amt1_dec_META_1,
			part_pay_d_amt2_META_1,
			s_part_pay_d_amt2_int_META_1,
			s_part_pay_d_amt2_dec_META_1,
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
			pay_ntc_d_print_rmrks_META_1,
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
	protected MSBHR_PayNtc_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

