package mcframe.commonPFBA.PFBAR5820;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBAR_SapJournalUploadPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBAR5820";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBA.PFBAR5820.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta seq_META_0 = new MCReportMeta("seq", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta ac_doc_typ_META_0 = new MCReportMeta("ac_doc_typ", "", "", "", true);
	static public final MCReportMeta doc_dt_META_0 = new MCReportMeta("doc_dt", "YMD", "", "", true);
	static public final MCReportMeta posting_dt_META_0 = new MCReportMeta("posting_dt", "YMD", "", "", true);
	static public final MCReportMeta fiscal_period_META_0 = new MCReportMeta("fiscal_period", "", "", "", true);
	static public final MCReportMeta doc_header_text_META_0 = new MCReportMeta("doc_header_text", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta ledger_group_META_0 = new MCReportMeta("ledger_group", "", "", "", true);
	static public final MCReportMeta xrate_META_0 = new MCReportMeta("xrate", "", "", "", true);
	static public final MCReportMeta xrate_dt_META_0 = new MCReportMeta("xrate_dt", "YMD", "", "", true);
	static public final MCReportMeta doc_ref_id_META_0 = new MCReportMeta("doc_ref_id", "", "", "", true);
	static public final MCReportMeta partner_bussinnss_area_META_0 = new MCReportMeta("partner_bussinnss_area", "", "", "", true);
	static public final MCReportMeta tax_fulfillment_dt_META_0 = new MCReportMeta("tax_fulfillment_dt", "YMD", "", "", true);
	static public final MCReportMeta tax_auto_calc_META_0 = new MCReportMeta("tax_auto_calc", "", "", "", true);
	static public final MCReportMeta dtl_co_cd_META_0 = new MCReportMeta("dtl_co_cd", "", "", "", true);
	static public final MCReportMeta ac_cd_META_0 = new MCReportMeta("ac_cd", "", "", "", true);
	static public final MCReportMeta doc_itm_text_META_0 = new MCReportMeta("doc_itm_text", "", "", "", true);
	static public final MCReportMeta debtor_amt_META_0 = new MCReportMeta("debtor_amt", "", "", "", true);
	static public final MCReportMeta creditor_amt_META_0 = new MCReportMeta("creditor_amt", "", "", "", true);
	static public final MCReportMeta base_cur_amt_META_0 = new MCReportMeta("base_cur_amt", "", "", "", true);
	static public final MCReportMeta local_cur2_amt_META_0 = new MCReportMeta("local_cur2_amt", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_jurisdiction_META_0 = new MCReportMeta("tax_jurisdiction", "", "", "", true);
	static public final MCReportMeta cost_center_META_0 = new MCReportMeta("cost_center", "", "", "", true);
	static public final MCReportMeta profit_center_META_0 = new MCReportMeta("profit_center", "", "", "", true);
	static public final MCReportMeta order_id_META_0 = new MCReportMeta("order_id", "", "", "", true);
	static public final MCReportMeta wbs_element_META_0 = new MCReportMeta("wbs_element", "", "", "", true);
	static public final MCReportMeta cur_translation_dt_META_0 = new MCReportMeta("cur_translation_dt", "YMD", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta assignment_reference_META_0 = new MCReportMeta("assignment_reference", "", "", "", true);
	static public final MCReportMeta trading_partner_META_0 = new MCReportMeta("trading_partner", "", "", "", true);
	static public final MCReportMeta segment_META_0 = new MCReportMeta("segment", "", "", "", true);
	static public final MCReportMeta cst_cd_META_0 = new MCReportMeta("cst_cd", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta bcst_cd_META_0 = new MCReportMeta("bcst_cd", "", "", "", true);
	static public final MCReportMeta tax_base_trd_cur_amt_META_0 = new MCReportMeta("tax_base_trd_cur_amt", "", "", "", true);
	static public final MCReportMeta itm_grp_cd_META_0 = new MCReportMeta("itm_grp_cd", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			seq_META_0,
			co_cd_META_0,
			ac_doc_typ_META_0,
			doc_dt_META_0,
			posting_dt_META_0,
			fiscal_period_META_0,
			doc_header_text_META_0,
			trd_cur_cd_META_0,
			ledger_group_META_0,
			xrate_META_0,
			xrate_dt_META_0,
			doc_ref_id_META_0,
			partner_bussinnss_area_META_0,
			tax_fulfillment_dt_META_0,
			tax_auto_calc_META_0,
			dtl_co_cd_META_0,
			ac_cd_META_0,
			doc_itm_text_META_0,
			debtor_amt_META_0,
			creditor_amt_META_0,
			base_cur_amt_META_0,
			local_cur2_amt_META_0,
			tax_cd_META_0,
			tax_jurisdiction_META_0,
			cost_center_META_0,
			profit_center_META_0,
			order_id_META_0,
			wbs_element_META_0,
			cur_translation_dt_META_0,
			bank_cd_META_0,
			bank_ac_cd_META_0,
			assignment_reference_META_0,
			trading_partner_META_0,
			segment_META_0,
			cst_cd_META_0,
			itm_cd_META_0,
			bcst_cd_META_0,
			tax_base_trd_cur_amt_META_0,
			itm_grp_cd_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBAR_SapJournalUploadPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

