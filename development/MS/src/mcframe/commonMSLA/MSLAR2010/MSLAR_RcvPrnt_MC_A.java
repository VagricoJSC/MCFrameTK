package mcframe.commonMSLA.MSLAR2010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_RcvPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2010";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR2010.DtlR.class, MCList.class);

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
	static public final MCReportMeta ext_rcv_no_META_0 = new MCReportMeta("ext_rcv_no", "", "", "", true);
	static public final MCReportMeta pay_cd_META_0 = new MCReportMeta("pay_cd", "", "", "", true);
	static public final MCReportMeta pay_nm_META_0 = new MCReportMeta("pay_nm", "", "", "", true);
	static public final MCReportMeta bcst_cd_META_0 = new MCReportMeta("bcst_cd", "", "", "", true);
	static public final MCReportMeta bcst_nm_META_0 = new MCReportMeta("bcst_nm", "", "", "", true);
	static public final MCReportMeta bill_dpt_cd_META_0 = new MCReportMeta("bill_dpt_cd", "", "", "", true);
	static public final MCReportMeta bill_dpt_nm_META_0 = new MCReportMeta("bill_dpt_nm", "", "", "", true);
	static public final MCReportMeta rcv_dpt_cd_META_0 = new MCReportMeta("rcv_dpt_cd", "", "", "", true);
	static public final MCReportMeta rcv_dpt_nm_META_0 = new MCReportMeta("rcv_dpt_nm", "", "", "", true);
	static public final MCReportMeta rcv_usr_cd_META_0 = new MCReportMeta("rcv_usr_cd", "", "", "", true);
	static public final MCReportMeta rcv_usr_nm_META_0 = new MCReportMeta("rcv_usr_nm", "", "", "", true);
	static public final MCReportMeta rcv_dt_META_0 = new MCReportMeta("rcv_dt", "YMD", "", "", true);
	static public final MCReportMeta rcv_mtd_cd_META_0 = new MCReportMeta("rcv_mtd_cd", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm_META_0 = new MCReportMeta("rcv_mtd_nm", "", "", "", true);
	static public final MCReportMeta ar_sttl_typ_META_0 = new MCReportMeta("ar_sttl_typ", "", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_nm_META_0 = new MCReportMeta("bank_nm", "", "", "", true);
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_nm_META_0 = new MCReportMeta("bank_ac_nm", "", "", "", true);
	static public final MCReportMeta xfr_psn_META_0 = new MCReportMeta("xfr_psn", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_nm_META_0 = new MCReportMeta("trd_cur_nm", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta rcv_amt_META_0 = new MCReportMeta("rcv_amt", "", "", "", true);
	static public final MCReportMeta com_paid_META_0 = new MCReportMeta("com_paid", "", "", "", true);
	static public final MCReportMeta rcv_rmrks_META_0 = new MCReportMeta("rcv_rmrks", "", "", "", true);
	static public final MCReportMeta note_no_META_0 = new MCReportMeta("note_no", "", "", "", true);
	static public final MCReportMeta note_typ_META_0 = new MCReportMeta("note_typ", "", "", "", true);
	static public final MCReportMeta draw_dt_META_0 = new MCReportMeta("draw_dt", "YMD", "", "", true);
	static public final MCReportMeta due_dt_META_0 = new MCReportMeta("due_dt", "YMD", "", "", true);
	static public final MCReportMeta drawer_nm_META_0 = new MCReportMeta("drawer_nm", "", "", "", true);
	static public final MCReportMeta endrsr_META_0 = new MCReportMeta("endrsr", "", "", "", true);
	static public final MCReportMeta accptr_META_0 = new MCReportMeta("accptr", "", "", "", true);
	static public final MCReportMeta note_rsn_cd_META_0 = new MCReportMeta("note_rsn_cd", "", "", "", true);
	static public final MCReportMeta note_rsn_nm_META_0 = new MCReportMeta("note_rsn_nm", "", "", "", true);
	static public final MCReportMeta draw_bank_cd_META_0 = new MCReportMeta("draw_bank_cd", "", "", "", true);
	static public final MCReportMeta draw_bank_nm_META_0 = new MCReportMeta("draw_bank_nm", "", "", "", true);
	static public final MCReportMeta draw_branch_cd_META_0 = new MCReportMeta("draw_branch_cd", "", "", "", true);
	static public final MCReportMeta draw_branch_nm_META_0 = new MCReportMeta("draw_branch_nm", "", "", "", true);
	static public final MCReportMeta rcpt_co_cd_META_0 = new MCReportMeta("rcpt_co_cd", "", "", "", true);
	static public final MCReportMeta rcpt_co_nm_META_0 = new MCReportMeta("rcpt_co_nm", "", "", "", true);
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
			ext_rcv_no_META_0,
			pay_cd_META_0,
			pay_nm_META_0,
			bcst_cd_META_0,
			bcst_nm_META_0,
			bill_dpt_cd_META_0,
			bill_dpt_nm_META_0,
			rcv_dpt_cd_META_0,
			rcv_dpt_nm_META_0,
			rcv_usr_cd_META_0,
			rcv_usr_nm_META_0,
			rcv_dt_META_0,
			rcv_mtd_cd_META_0,
			rcv_mtd_nm_META_0,
			ar_sttl_typ_META_0,
			bank_cd_META_0,
			bank_nm_META_0,
			bank_ac_cd_META_0,
			bank_ac_nm_META_0,
			xfr_psn_META_0,
			trd_cur_cd_META_0,
			trd_cur_nm_META_0,
			xrate_META_0,
			rcv_amt_META_0,
			com_paid_META_0,
			rcv_rmrks_META_0,
			note_no_META_0,
			note_typ_META_0,
			draw_dt_META_0,
			due_dt_META_0,
			drawer_nm_META_0,
			endrsr_META_0,
			accptr_META_0,
			note_rsn_cd_META_0,
			note_rsn_nm_META_0,
			draw_bank_cd_META_0,
			draw_bank_nm_META_0,
			draw_branch_cd_META_0,
			draw_branch_nm_META_0,
			rcpt_co_cd_META_0,
			rcpt_co_nm_META_0,
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
	protected MSLAR_RcvPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

