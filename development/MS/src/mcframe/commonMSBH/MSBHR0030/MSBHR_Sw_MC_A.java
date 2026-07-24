package mcframe.commonMSBH.MSBHR0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBHR_Sw_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBHR0030";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass SWHDRR_RC = new MCReportClass("SwHdr", mcframe.commonMSBH.MSBHR0030.SwHdrR.class);
	static public final MCReportClass SWDTLL_RC = new MCReportClass("SwDtl", mcframe.commonMSBH.MSBHR0030.SwDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		SWHDRR_RC,
		SWDTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta pay_act_no_META_0 = new MCReportMeta("pay_act_no", "", "", "", true);
	static public final MCReportMeta pay_act_seq_META_0 = new MCReportMeta("pay_act_seq", "", "", "", true);
	static public final MCReportMeta pay_act_rev_META_0 = new MCReportMeta("pay_act_rev", "", "", "", true);
	static public final MCReportMeta pay_dpt_cd_META_0 = new MCReportMeta("pay_dpt_cd", "", "", "", true);
	static public final MCReportMeta pay_dpt_nm_META_0 = new MCReportMeta("pay_dpt_nm", "", "", "", true);
	static public final MCReportMeta pay_usr_cd_META_0 = new MCReportMeta("pay_usr_cd", "", "", "", true);
	static public final MCReportMeta pay_usr_nm_META_0 = new MCReportMeta("pay_usr_nm", "", "", "", true);
	static public final MCReportMeta pay_act_dt_META_0 = new MCReportMeta("pay_act_dt", "YMD", "", "", true);
	static public final MCReportMeta bsppl_cd_to_META_0 = new MCReportMeta("bsppl_cd_to", "", "", "", true);
	static public final MCReportMeta bsppl_nm_to_META_0 = new MCReportMeta("bsppl_nm_to", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm1_to_META_0 = new MCReportMeta("bsppl_alt_nm1_to", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm2_to_META_0 = new MCReportMeta("bsppl_alt_nm2_to", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm3_to_META_0 = new MCReportMeta("bsppl_alt_nm3_to", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm4_to_META_0 = new MCReportMeta("bsppl_alt_nm4_to", "", "", "", true);
	static public final MCReportMeta asppl_cd_to_META_0 = new MCReportMeta("asppl_cd_to", "", "", "", true);
	static public final MCReportMeta asppl_nm_to_META_0 = new MCReportMeta("asppl_nm_to", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm1_to_META_0 = new MCReportMeta("asppl_alt_nm1_to", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm2_to_META_0 = new MCReportMeta("asppl_alt_nm2_to", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm3_to_META_0 = new MCReportMeta("asppl_alt_nm3_to", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm4_to_META_0 = new MCReportMeta("asppl_alt_nm4_to", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_to_META_0 = new MCReportMeta("bsppl_dpt_cd_to", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_nm_to_META_0 = new MCReportMeta("bsppl_dpt_nm_to", "", "", "", true);
	static public final MCReportMeta ap_dpt_cd_to_META_0 = new MCReportMeta("ap_dpt_cd_to", "", "", "", true);
	static public final MCReportMeta ap_dpt_nm_to_META_0 = new MCReportMeta("ap_dpt_nm_to", "", "", "", true);
	static public final MCReportMeta wrk_no_to_view_META_0 = new MCReportMeta("wrk_no_to_view", "", "", "", true);
	static public final MCReportMeta wrk_no_to_data_META_0 = new MCReportMeta("wrk_no_to_data", "", "", "", true);
	static public final MCReportMeta wrk_nm_to_META_0 = new MCReportMeta("wrk_nm_to", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta ttl_trd_cur_amt_META_0 = new MCReportMeta("ttl_trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_ttl_trd_cur_amt_META_0 = new MCReportMeta("s_ttl_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta bsppl_cd_fr_META_0 = new MCReportMeta("bsppl_cd_fr", "", "", "", true);
	static public final MCReportMeta bsppl_nm_fr_META_0 = new MCReportMeta("bsppl_nm_fr", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm1_fr_META_0 = new MCReportMeta("bsppl_alt_nm1_fr", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm2_fr_META_0 = new MCReportMeta("bsppl_alt_nm2_fr", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm3_fr_META_0 = new MCReportMeta("bsppl_alt_nm3_fr", "", "", "", true);
	static public final MCReportMeta bsppl_alt_nm4_fr_META_0 = new MCReportMeta("bsppl_alt_nm4_fr", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "COMMA", "", "", true);
	static public final MCReportMeta s_xrate_META_0 = new MCReportMeta("s_xrate", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta ap_sttl_cd_META_0 = new MCReportMeta("ap_sttl_cd", "", "", "", true);
	static public final MCReportMeta report_title_META_0 = new MCReportMeta("report_title", "", "", "", true);
	static public final MCReportMeta ap_sttl_typ_META_0 = new MCReportMeta("ap_sttl_typ", "", "", "", true);
	static public final MCReportMeta ap_sttl_typ_nm_META_0 = new MCReportMeta("ap_sttl_typ_nm", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta asppl_cd_fr_META_1 = new MCReportMeta("asppl_cd_fr", "", "", "", true);
	static public final MCReportMeta asppl_nm_fr_META_1 = new MCReportMeta("asppl_nm_fr", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm1_fr_META_1 = new MCReportMeta("asppl_alt_nm1_fr", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm2_fr_META_1 = new MCReportMeta("asppl_alt_nm2_fr", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm3_fr_META_1 = new MCReportMeta("asppl_alt_nm3_fr", "", "", "", true);
	static public final MCReportMeta asppl_alt_nm4_fr_META_1 = new MCReportMeta("asppl_alt_nm4_fr", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_cd_fr_META_1 = new MCReportMeta("bsppl_dpt_cd_fr", "", "", "", true);
	static public final MCReportMeta bsppl_dpt_nm_fr_META_1 = new MCReportMeta("bsppl_dpt_nm_fr", "", "", "", true);
	static public final MCReportMeta ap_dpt_cd_fr_META_1 = new MCReportMeta("ap_dpt_cd_fr", "", "", "", true);
	static public final MCReportMeta ap_dpt_nm_fr_META_1 = new MCReportMeta("ap_dpt_nm_fr", "", "", "", true);
	static public final MCReportMeta ap_typ_META_1 = new MCReportMeta("ap_typ", "", "", "", true);
	static public final MCReportMeta ap_typ_nm_META_1 = new MCReportMeta("ap_typ_nm", "", "", "", true);
	static public final MCReportMeta wrk_no_fr_view_META_1 = new MCReportMeta("wrk_no_fr_view", "", "", "", true);
	static public final MCReportMeta wrk_no_fr_data_META_1 = new MCReportMeta("wrk_no_fr_data", "", "", "", true);
	static public final MCReportMeta wrk_nm_fr_META_1 = new MCReportMeta("wrk_nm_fr", "", "", "", true);
	static public final MCReportMeta rcpt_iv_no_view_META_1 = new MCReportMeta("rcpt_iv_no_view", "", "", "", true);
	static public final MCReportMeta rcpt_iv_no_data_META_1 = new MCReportMeta("rcpt_iv_no_data", "", "", "", true);
	static public final MCReportMeta rcpt_iv_mng_no_view_META_1 = new MCReportMeta("rcpt_iv_mng_no_view", "", "", "", true);
	static public final MCReportMeta rcpt_iv_mng_no_data_META_1 = new MCReportMeta("rcpt_iv_mng_no_data", "", "", "", true);
	static public final MCReportMeta ap_d_no_fr_view_META_1 = new MCReportMeta("ap_d_no_fr_view", "", "", "", true);
	static public final MCReportMeta ap_d_no_fr_data_META_1 = new MCReportMeta("ap_d_no_fr_data", "", "", "", true);
	static public final MCReportMeta pay_schd_no_fr_view_META_1 = new MCReportMeta("pay_schd_no_fr_view", "", "", "", true);
	static public final MCReportMeta pay_schd_no_fr_data_META_1 = new MCReportMeta("pay_schd_no_fr_data", "", "", "", true);
	static public final MCReportMeta ap_appl_schd_no_fr_view_META_1 = new MCReportMeta("ap_appl_schd_no_fr_view", "", "", "", true);
	static public final MCReportMeta ap_appl_schd_no_fr_data_META_1 = new MCReportMeta("ap_appl_schd_no_fr_data", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_1 = new MCReportMeta("trd_cur_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt_META_1 = new MCReportMeta("s_int_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt_META_1 = new MCReportMeta("s_dec_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta ap_d_no_to_view_META_1 = new MCReportMeta("ap_d_no_to_view", "", "", "", true);
	static public final MCReportMeta ap_d_no_to_data_META_1 = new MCReportMeta("ap_d_no_to_data", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("SwHdr",
			pay_act_no_META_0,
			pay_act_seq_META_0,
			pay_act_rev_META_0,
			pay_dpt_cd_META_0,
			pay_dpt_nm_META_0,
			pay_usr_cd_META_0,
			pay_usr_nm_META_0,
			pay_act_dt_META_0,
			bsppl_cd_to_META_0,
			bsppl_nm_to_META_0,
			bsppl_alt_nm1_to_META_0,
			bsppl_alt_nm2_to_META_0,
			bsppl_alt_nm3_to_META_0,
			bsppl_alt_nm4_to_META_0,
			asppl_cd_to_META_0,
			asppl_nm_to_META_0,
			asppl_alt_nm1_to_META_0,
			asppl_alt_nm2_to_META_0,
			asppl_alt_nm3_to_META_0,
			asppl_alt_nm4_to_META_0,
			bsppl_dpt_cd_to_META_0,
			bsppl_dpt_nm_to_META_0,
			ap_dpt_cd_to_META_0,
			ap_dpt_nm_to_META_0,
			wrk_no_to_view_META_0,
			wrk_no_to_data_META_0,
			wrk_nm_to_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			ttl_trd_cur_amt_META_0,
			s_ttl_trd_cur_amt_META_0,
			trd_rmrks_META_0,
			bsppl_cd_fr_META_0,
			bsppl_nm_fr_META_0,
			bsppl_alt_nm1_fr_META_0,
			bsppl_alt_nm2_fr_META_0,
			bsppl_alt_nm3_fr_META_0,
			bsppl_alt_nm4_fr_META_0,
			xrate_META_0,
			s_xrate_META_0,
			prnt_tm_META_0,
			ac_dt_META_0,
			ap_sttl_cd_META_0,
			report_title_META_0,
			ap_sttl_typ_META_0,
			ap_sttl_typ_nm_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("SwDtl",
			disp_seq_META_1,
			asppl_cd_fr_META_1,
			asppl_nm_fr_META_1,
			asppl_alt_nm1_fr_META_1,
			asppl_alt_nm2_fr_META_1,
			asppl_alt_nm3_fr_META_1,
			asppl_alt_nm4_fr_META_1,
			bsppl_dpt_cd_fr_META_1,
			bsppl_dpt_nm_fr_META_1,
			ap_dpt_cd_fr_META_1,
			ap_dpt_nm_fr_META_1,
			ap_typ_META_1,
			ap_typ_nm_META_1,
			wrk_no_fr_view_META_1,
			wrk_no_fr_data_META_1,
			wrk_nm_fr_META_1,
			rcpt_iv_no_view_META_1,
			rcpt_iv_no_data_META_1,
			rcpt_iv_mng_no_view_META_1,
			rcpt_iv_mng_no_data_META_1,
			ap_d_no_fr_view_META_1,
			ap_d_no_fr_data_META_1,
			pay_schd_no_fr_view_META_1,
			pay_schd_no_fr_data_META_1,
			ap_appl_schd_no_fr_view_META_1,
			ap_appl_schd_no_fr_data_META_1,
			trd_cur_amt_META_1,
			s_int_trd_cur_amt_META_1,
			s_dec_trd_cur_amt_META_1,
			ap_d_no_to_view_META_1,
			ap_d_no_to_data_META_1,
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
	protected MSBHR_Sw_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

