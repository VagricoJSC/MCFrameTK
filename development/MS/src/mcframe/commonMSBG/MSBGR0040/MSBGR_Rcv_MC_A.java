package mcframe.commonMSBG.MSBGR0040;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSBGR_Rcv_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSBGR0040";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass RCVHDRR_RC = new MCReportClass("RcvHdr", mcframe.commonMSBG.MSBGR0040.RcvHdrR.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		RCVHDRR_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rcv_no_META_0 = new MCReportMeta("rcv_no", "", "", "", true);
	static public final MCReportMeta rcv_prnt_typ_nm_META_0 = new MCReportMeta("rcv_prnt_typ_nm", "", "", "", true);
	static public final MCReportMeta rcv_dpt_cd_META_0 = new MCReportMeta("rcv_dpt_cd", "", "", "", true);
	static public final MCReportMeta rcv_dpt_nm_META_0 = new MCReportMeta("rcv_dpt_nm", "", "", "", true);
	static public final MCReportMeta rcv_usr_cd_META_0 = new MCReportMeta("rcv_usr_cd", "", "", "", true);
	static public final MCReportMeta rcv_usr_nm_META_0 = new MCReportMeta("rcv_usr_nm", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd_META_0 = new MCReportMeta("rcv_mtd_cd", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm_META_0 = new MCReportMeta("rcv_mtd_nm", "", "", "", true);
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
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_nm_META_0 = new MCReportMeta("bank_ac_nm", "", "", "", true);
	static public final MCReportMeta xfr_psn_META_0 = new MCReportMeta("xfr_psn", "", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_nm_META_0 = new MCReportMeta("bank_nm", "", "", "", true);
	static public final MCReportMeta branch_cd_META_0 = new MCReportMeta("branch_cd", "", "", "", true);
	static public final MCReportMeta branch_nm_META_0 = new MCReportMeta("branch_nm", "", "", "", true);
	static public final MCReportMeta bank_ac_no_META_0 = new MCReportMeta("bank_ac_no", "", "", "", true);
	static public final MCReportMeta prnt_tm_META_0 = new MCReportMeta("prnt_tm", "YMDHM", "", "", true);
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
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "COMMA", "", "", true);
	static public final MCReportMeta s_xrate_META_0 = new MCReportMeta("s_xrate", "", "", "", true);
	static public final MCReportMeta rcv_amt_META_0 = new MCReportMeta("rcv_amt", "COMMA", "", "", true);
	static public final MCReportMeta s_rcv_amt_META_0 = new MCReportMeta("s_rcv_amt", "", "", "", true);
	static public final MCReportMeta rcv_rmrks_META_0 = new MCReportMeta("rcv_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("RcvHdr",
			rcv_no_META_0,
			rcv_prnt_typ_nm_META_0,
			rcv_dpt_cd_META_0,
			rcv_dpt_nm_META_0,
			rcv_usr_cd_META_0,
			rcv_usr_nm_META_0,
			rcv_mtd_cd_META_0,
			rcv_mtd_nm_META_0,
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
			bank_ac_cd_META_0,
			bank_ac_nm_META_0,
			xfr_psn_META_0,
			bank_cd_META_0,
			bank_nm_META_0,
			branch_cd_META_0,
			branch_nm_META_0,
			bank_ac_no_META_0,
			prnt_tm_META_0,
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
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			xrate_META_0,
			s_xrate_META_0,
			rcv_amt_META_0,
			s_rcv_amt_META_0,
			rcv_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSBGR_Rcv_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

