package mcframe.commonMSBG.MSBGR0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBGR_ArSlip_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBGR0030";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass ARSLIPHDRR_RC = new MCReportClass("ArSlipHdr", mcframe.commonMSBG.MSBGR0030.ArSlipHdrR.class);
	static public final MCReportClass ARSLIPDTLL_RC = new MCReportClass("ArSlipDtl", mcframe.commonMSBG.MSBGR0030.ArSlipDtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		ARSLIPHDRR_RC,
		ARSLIPDTLL_RC
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
	static public final MCReportMeta rcv_mtd_cd_META_0 = new MCReportMeta("rcv_mtd_cd", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm_META_0 = new MCReportMeta("rcv_mtd_nm", "", "", "", true);
	static public final MCReportMeta rcv_dt_META_0 = new MCReportMeta("rcv_dt", "YMD", "", "", true);
	static public final MCReportMeta ar_setoff_cd_META_0 = new MCReportMeta("ar_setoff_cd", "", "", "", true);
	static public final MCReportMeta ar_setoff_nm_META_0 = new MCReportMeta("ar_setoff_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_0 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta rcst_cd_META_0 = new MCReportMeta("rcst_cd", "", "", "", true);
	static public final MCReportMeta rcst_nm_META_0 = new MCReportMeta("rcst_nm", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm1_META_0 = new MCReportMeta("rcst_alt_nm1", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm2_META_0 = new MCReportMeta("rcst_alt_nm2", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm3_META_0 = new MCReportMeta("rcst_alt_nm3", "", "", "", true);
	static public final MCReportMeta rcst_alt_nm4_META_0 = new MCReportMeta("rcst_alt_nm4", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "COMMA", "", "", true);
	static public final MCReportMeta s_xrate_META_0 = new MCReportMeta("s_xrate", "", "", "", true);
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_nm_META_0 = new MCReportMeta("bank_ac_nm", "", "", "", true);
	static public final MCReportMeta xfr_psn_META_0 = new MCReportMeta("xfr_psn", "", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_nm_META_0 = new MCReportMeta("bank_nm", "", "", "", true);
	static public final MCReportMeta branch_cd_META_0 = new MCReportMeta("branch_cd", "", "", "", true);
	static public final MCReportMeta branch_nm_META_0 = new MCReportMeta("branch_nm", "", "", "", true);
	static public final MCReportMeta bank_ac_no_META_0 = new MCReportMeta("bank_ac_no", "", "", "", true);
	static public final MCReportMeta rcv_no_META_0 = new MCReportMeta("rcv_no", "", "", "", true);
	static public final MCReportMeta adv_gen_rcv_no_META_0 = new MCReportMeta("adv_gen_rcv_no", "", "", "", true);
	static public final MCReportMeta not_proc_bal_META_0 = new MCReportMeta("not_proc_bal", "COMMA", "", "", true);
	static public final MCReportMeta s_not_proc_bal_META_0 = new MCReportMeta("s_not_proc_bal", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta report_title_META_0 = new MCReportMeta("report_title", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "YMD", "", "", true);
	static public final MCReportMeta subttl1_META_0 = new MCReportMeta("subttl1", "COMMA", "", "", true);
	static public final MCReportMeta s_subttl1_META_0 = new MCReportMeta("s_subttl1", "", "", "", true);
	static public final MCReportMeta subttl2_META_0 = new MCReportMeta("subttl2", "COMMA", "", "", true);
	static public final MCReportMeta s_subttl2_META_0 = new MCReportMeta("s_subttl2", "", "", "", true);
	static public final MCReportMeta note_no_META_0 = new MCReportMeta("note_no", "", "", "", true);
	static public final MCReportMeta note_typ_META_0 = new MCReportMeta("note_typ", "", "", "", true);
	static public final MCReportMeta note_typ_nm_META_0 = new MCReportMeta("note_typ_nm", "", "", "", true);
	static public final MCReportMeta due_dt_META_0 = new MCReportMeta("due_dt", "YMD", "", "", true);
	static public final MCReportMeta drawer_nm_META_0 = new MCReportMeta("drawer_nm", "", "", "", true);
	static public final MCReportMeta endrsr_META_0 = new MCReportMeta("endrsr", "", "", "", true);
	static public final MCReportMeta accptr_META_0 = new MCReportMeta("accptr", "", "", "", true);
	static public final MCReportMeta draw_bank_cd_META_0 = new MCReportMeta("draw_bank_cd", "", "", "", true);
	static public final MCReportMeta draw_bank_nm_META_0 = new MCReportMeta("draw_bank_nm", "", "", "", true);
	static public final MCReportMeta draw_branch_cd_META_0 = new MCReportMeta("draw_branch_cd", "", "", "", true);
	static public final MCReportMeta draw_branch_nm_META_0 = new MCReportMeta("draw_branch_nm", "", "", "", true);
	static public final MCReportMeta trd_rmrks_META_0 = new MCReportMeta("trd_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static public final MCReportMeta disp_seq_META_1 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta bcst_cd_META_1 = new MCReportMeta("bcst_cd", "", "", "", true);
	static public final MCReportMeta bcst_nm_META_1 = new MCReportMeta("bcst_nm", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm1_META_1 = new MCReportMeta("bcst_alt_nm1", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm2_META_1 = new MCReportMeta("bcst_alt_nm2", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm3_META_1 = new MCReportMeta("bcst_alt_nm3", "", "", "", true);
	static public final MCReportMeta bcst_alt_nm4_META_1 = new MCReportMeta("bcst_alt_nm4", "", "", "", true);
	static public final MCReportMeta bill_dpt_cd_META_1 = new MCReportMeta("bill_dpt_cd", "", "", "", true);
	static public final MCReportMeta bill_dpt_nm_META_1 = new MCReportMeta("bill_dpt_nm", "", "", "", true);
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
	static public final MCReportMeta wrk_no_META_1 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_1 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta trd_cur_amt1_META_1 = new MCReportMeta("trd_cur_amt1", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt1_META_1 = new MCReportMeta("s_int_trd_cur_amt1", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt1_META_1 = new MCReportMeta("s_dec_trd_cur_amt1", "", "", "", true);
	static public final MCReportMeta trd_cur_amt2_META_1 = new MCReportMeta("trd_cur_amt2", "COMMA", "", "", true);
	static public final MCReportMeta s_int_trd_cur_amt2_META_1 = new MCReportMeta("s_int_trd_cur_amt2", "", "", "", true);
	static public final MCReportMeta s_dec_trd_cur_amt2_META_1 = new MCReportMeta("s_dec_trd_cur_amt2", "", "", "", true);
	static public final MCReportMeta d_sub_char1_META_1 = new MCReportMeta("d_sub_char1", "", "", "", true);
	static public final MCReportMeta d_sub_char2_META_1 = new MCReportMeta("d_sub_char2", "", "", "", true);
	static public final MCReportMeta d_sub_char3_META_1 = new MCReportMeta("d_sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("ArSlipHdr",
			rcv_act_no_META_0,
			rcv_act_seq_META_0,
			rcv_act_rev_META_0,
			slip_sts_typ_META_0,
			slip_sts_typ_nm_META_0,
			dpt_cd_META_0,
			dpt_nm_META_0,
			usr_cd_META_0,
			usr_nm_META_0,
			rcv_mtd_cd_META_0,
			rcv_mtd_nm_META_0,
			rcv_dt_META_0,
			ar_setoff_cd_META_0,
			ar_setoff_nm_META_0,
			tax_rate_META_0,
			rcst_cd_META_0,
			rcst_nm_META_0,
			rcst_alt_nm1_META_0,
			rcst_alt_nm2_META_0,
			rcst_alt_nm3_META_0,
			rcst_alt_nm4_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			xrate_META_0,
			s_xrate_META_0,
			bank_ac_cd_META_0,
			bank_ac_nm_META_0,
			xfr_psn_META_0,
			bank_cd_META_0,
			bank_nm_META_0,
			branch_cd_META_0,
			branch_nm_META_0,
			bank_ac_no_META_0,
			rcv_no_META_0,
			adv_gen_rcv_no_META_0,
			not_proc_bal_META_0,
			s_not_proc_bal_META_0,
			trd_cd_META_0,
			report_title_META_0,
			prnt_tm_META_0,
			ac_dt_META_0,
			subttl1_META_0,
			s_subttl1_META_0,
			subttl2_META_0,
			s_subttl2_META_0,
			note_no_META_0,
			note_typ_META_0,
			note_typ_nm_META_0,
			due_dt_META_0,
			drawer_nm_META_0,
			endrsr_META_0,
			accptr_META_0,
			draw_bank_cd_META_0,
			draw_bank_nm_META_0,
			draw_branch_cd_META_0,
			draw_branch_nm_META_0,
			trd_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		reportMetaMap.add("ArSlipDtl",
			disp_seq_META_1,
			bcst_cd_META_1,
			bcst_nm_META_1,
			bcst_alt_nm1_META_1,
			bcst_alt_nm2_META_1,
			bcst_alt_nm3_META_1,
			bcst_alt_nm4_META_1,
			bill_dpt_cd_META_1,
			bill_dpt_nm_META_1,
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
			wrk_no_META_1,
			wrk_nm_META_1,
			trd_cur_amt1_META_1,
			s_int_trd_cur_amt1_META_1,
			s_dec_trd_cur_amt1_META_1,
			trd_cur_amt2_META_1,
			s_int_trd_cur_amt2_META_1,
			s_dec_trd_cur_amt2_META_1,
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
	protected MSBGR_ArSlip_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

