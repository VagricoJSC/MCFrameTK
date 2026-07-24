package mcframe.commonMSBH.MSBHR0010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBHR_PaySchdLst_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBHR0010";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass PAYSCHDLSTHDRR_RC = new MCReportClass("PaySchdLstHdr", mcframe.commonMSBH.MSBHR0010.PaySchdLstHdrR.class);
	static public final MCReportClass PAYSCHDLSTDTLL_RC = new MCReportClass("PaySchdLstDtl", mcframe.commonMSBH.MSBHR0010.PaySchdLstDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		PAYSCHDLSTHDRR_RC,
		PAYSCHDLSTDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta pay_dpt_cd_META_0 = new MCReportMeta("pay_dpt_cd", "", "", "", true);
	static public final MCReportMeta pay_dpt_nm_META_0 = new MCReportMeta("pay_dpt_nm", "", "", "", true);

	static public final MCReportMeta psppl_cd_META_1 = new MCReportMeta("psppl_cd", "", "", "", true);
	static public final MCReportMeta psppl_nm_META_1 = new MCReportMeta("psppl_nm", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm1_META_1 = new MCReportMeta("psppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm2_META_1 = new MCReportMeta("psppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm3_META_1 = new MCReportMeta("psppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta psppl_alt_nm4_META_1 = new MCReportMeta("psppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_META_1 = new MCReportMeta("bsppl_dpt_cd", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_nm_META_1 = new MCReportMeta("bsppl_dpt_nm", "", "", "", true);
	static public final MCReportMeta pay_chk_no_META_1 = new MCReportMeta("pay_chk_no", "", "", "", true);
	static public final MCReportMeta pay_schd_no_META_1 = new MCReportMeta("pay_schd_no", "", "", "", true);
	static public final MCReportMeta bsppl_cd_META_1 = new MCReportMeta("bsppl_cd", "", "", "", true);
	static public final MCReportMeta bsppl_nm_META_1 = new MCReportMeta("bsppl_nm", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm1_META_1 = new MCReportMeta("bsppl_alt_nm1", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm2_META_1 = new MCReportMeta("bsppl_alt_nm2", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm3_META_1 = new MCReportMeta("bsppl_alt_nm3", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm4_META_1 = new MCReportMeta("bsppl_alt_nm4", "", "", "", true);
	static public final MCReportMeta pay_schd_dt_META_1 = new MCReportMeta("pay_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta ap_sttl_cd_META_1 = new MCReportMeta("ap_sttl_cd", "", "", "", true);
	static public final MCReportMeta ap_sttl_nm_META_1 = new MCReportMeta("ap_sttl_nm", "", "", "", true);
	static public final MCReportMeta bank_cd_META_1 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_nm_META_1 = new MCReportMeta("bank_nm", "", "", "", true);
	static public final MCReportMeta branch_cd_META_1 = new MCReportMeta("branch_cd", "", "", "", true);
	static public final MCReportMeta branch_nm_META_1 = new MCReportMeta("branch_nm", "", "", "", true);
	static public final MCReportMeta pay_bank_ac_cd_META_1 = new MCReportMeta("pay_bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_no_META_1 = new MCReportMeta("bank_ac_no", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_amt_META_1 = new MCReportMeta("s_int_amt", "", "", "", true);
	static public final MCReportMeta s_dec_amt_META_1 = new MCReportMeta("s_dec_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_1 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_1 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta pay_schd_print_rmrks_META_1 = new MCReportMeta("pay_schd_print_rmrks", "", "", "", true);
	static public final MCReportMeta amt_dec_place_META_1 = new MCReportMeta("amt_dec_place", "", "", "", true);
	static public final MCReportMeta sub_char1_META_1 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_1 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_1 = new MCReportMeta("sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("PaySchdLstHdr",
			prnt_tm_META_0,
			pay_dpt_cd_META_0,
			pay_dpt_nm_META_0
		);
		reportMetaMap.add("PaySchdLstDtl",
			psppl_cd_META_1,
			psppl_nm_META_1,
			psppl_alt_nm1_META_1,
			psppl_alt_nm2_META_1,
			psppl_alt_nm3_META_1,
			psppl_alt_nm4_META_1,
			bsppl_dpt_cd_META_1,
			bsppl_dpt_nm_META_1,
			pay_chk_no_META_1,
			pay_schd_no_META_1,
			bsppl_cd_META_1,
			bsppl_nm_META_1,
			bsppl_alt_nm1_META_1,
			bsppl_alt_nm2_META_1,
			bsppl_alt_nm3_META_1,
			bsppl_alt_nm4_META_1,
			pay_schd_dt_META_1,
			ap_sttl_cd_META_1,
			ap_sttl_nm_META_1,
			bank_cd_META_1,
			bank_nm_META_1,
			branch_cd_META_1,
			branch_nm_META_1,
			pay_bank_ac_cd_META_1,
			bank_ac_no_META_1,
			trd_cur_amt_META_1,
			s_int_amt_META_1,
			s_dec_amt_META_1,
			trd_cur_cd_META_1,
			trd_cur_nm_META_1,
			pay_schd_print_rmrks_META_1,
			amt_dec_place_META_1,
			sub_char1_META_1,
			sub_char2_META_1,
			sub_char3_META_1
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBHR_PaySchdLst_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

