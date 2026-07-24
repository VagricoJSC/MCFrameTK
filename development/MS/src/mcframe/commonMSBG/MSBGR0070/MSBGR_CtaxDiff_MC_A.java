package mcframe.commonMSBG.MSBGR0070;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBGR_CtaxDiff_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBGR0070";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass CTAXDIFFHDRR_RC = new MCReportClass("CtaxDiffHdr", mcframe.commonMSBG.MSBGR0070.CtaxDiffHdrR.class);
	static public final MCReportClass CTAXDIFFDTLL_RC = new MCReportClass("CtaxDiffDtl", mcframe.commonMSBG.MSBGR0070.CtaxDiffDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		CTAXDIFFHDRR_RC,
		CTAXDIFFDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rcv_act_no_META_0 = new MCReportMeta("rcv_act_no", "", "", "", true);
	static public final MCReportMeta rcv_act_seq_META_0 = new MCReportMeta("rcv_act_seq", "", "", "", true);
	static public final MCReportMeta rcv_act_rev_META_0 = new MCReportMeta("rcv_act_rev", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_0 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_nm_META_0 = new MCReportMeta("slip_sts_typ_nm", "", "", "", true);
	static public final MCReportMeta dpt_cd_META_0 = new MCReportMeta("dpt_cd", "", "", "", true);
	static public final MCReportMeta dpt_nm_META_0 = new MCReportMeta("dpt_nm", "", "", "", true);
	static public final MCReportMeta usr_cd_META_0 = new MCReportMeta("usr_cd", "", "", "", true);
	static public final MCReportMeta usr_nm_META_0 = new MCReportMeta("usr_nm", "", "", "", true);
	static public final MCReportMeta rcv_dt_META_0 = new MCReportMeta("rcv_dt", "YMD", "", "", true);
	static public final MCReportMeta rcst_cd_META_0 = new MCReportMeta("rcst_cd", "", "", "", true);
	static public final MCReportMeta rcst_nm_META_0 = new MCReportMeta("rcst_nm", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm1_META_0 = new MCReportMeta("rcst_alt_nm1", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm2_META_0 = new MCReportMeta("rcst_alt_nm2", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm3_META_0 = new MCReportMeta("rcst_alt_nm3", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm4_META_0 = new MCReportMeta("rcst_alt_nm4", "", "", "", true);
	static public final MCReportMeta bcst_cd_META_0 = new MCReportMeta("bcst_cd", "", "", "", true);
	static public final MCReportMeta bcst_nm_META_0 = new MCReportMeta("bcst_nm", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm1_META_0 = new MCReportMeta("bcst_alt_nm1", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm2_META_0 = new MCReportMeta("bcst_alt_nm2", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm3_META_0 = new MCReportMeta("bcst_alt_nm3", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm4_META_0 = new MCReportMeta("bcst_alt_nm4", "", "", "", true);
	static public final MCReportMeta bill_dpt_cd_META_0 = new MCReportMeta("bill_dpt_cd", "", "", "", true);
	static public final MCReportMeta bill_dpt_nm_META_0 = new MCReportMeta("bill_dpt_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta report_title_META_0 = new MCReportMeta("report_title", "", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta cur_cd_META_0 = new MCReportMeta("cur_cd", "", "", "", true);
	static public final MCReportMeta cur_nm_META_0 = new MCReportMeta("cur_nm", "", "", "", true);
	static public final MCReportMeta base_cur_cd_META_0 = new MCReportMeta("base_cur_cd", "", "", "", true);
	static public final MCReportMeta base_cur_nm_META_0 = new MCReportMeta("base_cur_nm", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_0 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_0 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta tax_subttl1_META_0 = new MCReportMeta("tax_subttl1", "COMMA", "", "", true);
	static public final MCReportMeta s_tax_subttl1_META_0 = new MCReportMeta("s_tax_subttl1", "", "", "", true);
	static public final MCReportMeta base_cur_tax_subttl1_META_0 = new MCReportMeta("base_cur_tax_subttl1", "COMMA", "", "", true);
	static public final MCReportMeta s_base_cur_tax_subttl1_META_0 = new MCReportMeta("s_base_cur_tax_subttl1", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta acst_cd_META_1 = new MCReportMeta("acst_cd", "", "", "", true);
	static public final MCReportMeta acst_nm_META_1 = new MCReportMeta("acst_nm", "", "", "", true);
	static public final MCReportMeta acst_alt_nm1_META_1 = new MCReportMeta("acst_alt_nm1", "", "", "", true);
	static public final MCReportMeta acst_alt_nm2_META_1 = new MCReportMeta("acst_alt_nm2", "", "", "", true);
	static public final MCReportMeta acst_alt_nm3_META_1 = new MCReportMeta("acst_alt_nm3", "", "", "", true);
	static public final MCReportMeta acst_alt_nm4_META_1 = new MCReportMeta("acst_alt_nm4", "", "", "", true);
	static public final MCReportMeta ar_dpt_cd_META_1 = new MCReportMeta("ar_dpt_cd", "", "", "", true);
	static public final MCReportMeta ar_dpt_nm_META_1 = new MCReportMeta("ar_dpt_nm", "", "", "", true);
	static public final MCReportMeta ar_typ_META_1 = new MCReportMeta("ar_typ", "", "", "", true);
	static public final MCReportMeta ar_typ_nm_META_1 = new MCReportMeta("ar_typ_nm", "", "", "", true);
	static public final MCReportMeta iv_no_view_META_1 = new MCReportMeta("iv_no_view", "", "", "", true);
	static public final MCReportMeta iv_no_data_META_1 = new MCReportMeta("iv_no_data", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt1_META_1 = new MCReportMeta("trd_cur_tax_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_tax_amt1_META_1 = new MCReportMeta("s_int_trd_cur_tax_amt1", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_tax_amt1_META_1 = new MCReportMeta("s_dec_trd_cur_tax_amt1", "", "", "", true);
	static public final MCReportMeta base_cur_tax_amt1_META_1 = new MCReportMeta("base_cur_tax_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_int_base_cur_tax_amt1_META_1 = new MCReportMeta("s_int_base_cur_tax_amt1", "", "", "", true);
	static public final MCReportMeta s_dec_base_cur_tax_amt1_META_1 = new MCReportMeta("s_dec_base_cur_tax_amt1", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("CtaxDiffHdr",
			rcv_act_no_META_0,
			rcv_act_seq_META_0,
			rcv_act_rev_META_0,
			slip_sts_typ_META_0,
			slip_sts_typ_nm_META_0,
			dpt_cd_META_0,
			dpt_nm_META_0,
			usr_cd_META_0,
			usr_nm_META_0,
			rcv_dt_META_0,
			rcst_cd_META_0,
			rcst_nm_META_0,
			rcst_alt_nm1_META_0,
			rcst_alt_nm2_META_0,
			rcst_alt_nm3_META_0,
			rcst_alt_nm4_META_0,
			bcst_cd_META_0,
			bcst_nm_META_0,
			bcst_alt_nm1_META_0,
			bcst_alt_nm2_META_0,
			bcst_alt_nm3_META_0,
			bcst_alt_nm4_META_0,
			bill_dpt_cd_META_0,
			bill_dpt_nm_META_0,
			trd_cd_META_0,
			report_title_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			cur_cd_META_0,
			cur_nm_META_0,
			base_cur_cd_META_0,
			base_cur_nm_META_0,
			tax_cd_META_0,
			tax_nm_META_0,
			tax_rate_META_0,
			prnt_tm_META_0,
			ac_dt_META_0,
			tax_subttl1_META_0,
			s_tax_subttl1_META_0,
			base_cur_tax_subttl1_META_0,
			s_base_cur_tax_subttl1_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("CtaxDiffDtl",
			disp_seq_META_1,
			acst_cd_META_1,
			acst_nm_META_1,
			acst_alt_nm1_META_1,
			acst_alt_nm2_META_1,
			acst_alt_nm3_META_1,
			acst_alt_nm4_META_1,
			ar_dpt_cd_META_1,
			ar_dpt_nm_META_1,
			ar_typ_META_1,
			ar_typ_nm_META_1,
			iv_no_view_META_1,
			iv_no_data_META_1,
			trd_cur_tax_amt1_META_1,
			s_int_trd_cur_tax_amt1_META_1,
			s_dec_trd_cur_tax_amt1_META_1,
			base_cur_tax_amt1_META_1,
			s_int_base_cur_tax_amt1_META_1,
			s_dec_base_cur_tax_amt1_META_1,
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
	protected MSBGR_CtaxDiff_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

