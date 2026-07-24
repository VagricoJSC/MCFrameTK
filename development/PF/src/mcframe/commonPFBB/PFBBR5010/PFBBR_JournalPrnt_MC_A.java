package mcframe.commonPFBB.PFBBR5010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_JournalPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5010";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5010.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta inpdate_META_0 = new MCReportMeta("inpdate", "", "10", "", true);
	static public final MCReportMeta postpadcolor_META_0 = new MCReportMeta("postpadcolor", "", "8", "", true);
	static public final MCReportMeta postpadtext_META_0 = new MCReportMeta("postpadtext", "", "100", "", true);
	static public final MCReportMeta voucherno_META_0 = new MCReportMeta("voucherno", "", "20", "", true);
	static public final MCReportMeta datalevel_META_0 = new MCReportMeta("datalevel", "", "1", "", true);
	static public final MCReportMeta header_descriptcode_META_0 = new MCReportMeta("header_descriptcode", "", "20", "", true);
	static public final MCReportMeta header_descriptname_META_0 = new MCReportMeta("header_descriptname", "", "100", "", true);
	static public final MCReportMeta filename_META_0 = new MCReportMeta("filename", "", "100", "", true);
	static public final MCReportMeta inchargecode_META_0 = new MCReportMeta("inchargecode", "", "20", "", true);
	static public final MCReportMeta header_usermaster_META_0 = new MCReportMeta("header_usermaster", "", "20", "", true);
	static public final MCReportMeta header_usertext_META_0 = new MCReportMeta("header_usertext", "", "100", "", true);
	static public final MCReportMeta drcrtype_META_0 = new MCReportMeta("drcrtype", "", "1", "", true);
	static public final MCReportMeta accode_META_0 = new MCReportMeta("accode", "", "20", "", true);
	static public final MCReportMeta subcode_META_0 = new MCReportMeta("subcode", "", "20", "", true);
	static public final MCReportMeta otheraccode_META_0 = new MCReportMeta("otheraccode", "", "20", "", true);
	static public final MCReportMeta othersubaccode_META_0 = new MCReportMeta("othersubaccode", "", "20", "", true);
	static public final MCReportMeta taxablecode_META_0 = new MCReportMeta("taxablecode", "", "20", "", true);
	static public final MCReportMeta taxtype_META_0 = new MCReportMeta("taxtype", "", "1", "", true);
	static public final MCReportMeta deptcode_META_0 = new MCReportMeta("deptcode", "", "20", "", true);
	static public final MCReportMeta correspcode_META_0 = new MCReportMeta("correspcode", "", "20", "", true);
	static public final MCReportMeta currencycode_META_0 = new MCReportMeta("currencycode", "", "20", "", true);
	static public final MCReportMeta ratetype_META_0 = new MCReportMeta("ratetype", "", "20", "", true);
	static public final MCReportMeta rate_META_0 = new MCReportMeta("rate", "", "14,9", "", true);
	static public final MCReportMeta inpamount_fc_META_0 = new MCReportMeta("inpamount_fc", "", "16,2", "", true);
	static public final MCReportMeta taxamount_fc_META_0 = new MCReportMeta("taxamount_fc", "", "16,2", "", true);
	static public final MCReportMeta taxableamount_fc_META_0 = new MCReportMeta("taxableamount_fc", "", "16,2", "", true);
	static public final MCReportMeta inpamount_sc_META_0 = new MCReportMeta("inpamount_sc", "", "16,2", "", true);
	static public final MCReportMeta taxamount_sc_META_0 = new MCReportMeta("taxamount_sc", "", "16,2", "", true);
	static public final MCReportMeta taxableamount_sc_META_0 = new MCReportMeta("taxableamount_sc", "", "16,2", "", true);
	static public final MCReportMeta detail_descriptcode_META_0 = new MCReportMeta("detail_descriptcode", "", "20", "", true);
	static public final MCReportMeta detail_descriptname_META_0 = new MCReportMeta("detail_descriptname", "", "100", "", true);
	static public final MCReportMeta detail_usermaster1_META_0 = new MCReportMeta("detail_usermaster1", "", "20", "", true);
	static public final MCReportMeta detail_usermaster2_META_0 = new MCReportMeta("detail_usermaster2", "", "20", "", true);
	static public final MCReportMeta detail_usermaster3_META_0 = new MCReportMeta("detail_usermaster3", "", "20", "", true);
	static public final MCReportMeta detail_usermaster4_META_0 = new MCReportMeta("detail_usermaster4", "", "20", "", true);
	static public final MCReportMeta detail_usermaster5_META_0 = new MCReportMeta("detail_usermaster5", "", "20", "", true);
	static public final MCReportMeta detail_usercode_META_0 = new MCReportMeta("detail_usercode", "", "20", "", true);
	static public final MCReportMeta detail_usertext_META_0 = new MCReportMeta("detail_usertext", "", "100", "", true);
	static public final MCReportMeta detail_userdate_META_0 = new MCReportMeta("detail_userdate", "", "10", "", true);
	static public final MCReportMeta detail_userqty_META_0 = new MCReportMeta("detail_userqty", "", "14,4", "", true);
	static public final MCReportMeta succeedvoucherno_META_0 = new MCReportMeta("succeedvoucherno", "", "20", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			inpdate_META_0,
			postpadcolor_META_0,
			postpadtext_META_0,
			voucherno_META_0,
			datalevel_META_0,
			header_descriptcode_META_0,
			header_descriptname_META_0,
			filename_META_0,
			inchargecode_META_0,
			header_usermaster_META_0,
			header_usertext_META_0,
			drcrtype_META_0,
			accode_META_0,
			subcode_META_0,
			otheraccode_META_0,
			othersubaccode_META_0,
			taxablecode_META_0,
			taxtype_META_0,
			deptcode_META_0,
			correspcode_META_0,
			currencycode_META_0,
			ratetype_META_0,
			rate_META_0,
			inpamount_fc_META_0,
			taxamount_fc_META_0,
			taxableamount_fc_META_0,
			inpamount_sc_META_0,
			taxamount_sc_META_0,
			taxableamount_sc_META_0,
			detail_descriptcode_META_0,
			detail_descriptname_META_0,
			detail_usermaster1_META_0,
			detail_usermaster2_META_0,
			detail_usermaster3_META_0,
			detail_usermaster4_META_0,
			detail_usermaster5_META_0,
			detail_usercode_META_0,
			detail_usertext_META_0,
			detail_userdate_META_0,
			detail_userqty_META_0,
			succeedvoucherno_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_JournalPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

