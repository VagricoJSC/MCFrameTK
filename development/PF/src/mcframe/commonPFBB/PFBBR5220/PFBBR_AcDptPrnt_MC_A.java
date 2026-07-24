package mcframe.commonPFBB.PFBBR5220;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_AcDptPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5220";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5220.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta departmenttype_META_0 = new MCReportMeta("departmenttype", "", "1", "", true);
	static public final MCReportMeta code_META_0 = new MCReportMeta("code", "", "20", "", true);
	static public final MCReportMeta name_META_0 = new MCReportMeta("name", "", "100", "", true);
	static public final MCReportMeta activeflag_META_0 = new MCReportMeta("activeflag", "", "1", "", true);
	static public final MCReportMeta extension_META_0 = new MCReportMeta("extension", "", "2", "", true);
	static public final MCReportMeta searchcharacter_META_0 = new MCReportMeta("searchcharacter", "", "1", "", true);
	static public final MCReportMeta zip_META_0 = new MCReportMeta("zip", "", "50", "", true);
	static public final MCReportMeta address1_META_0 = new MCReportMeta("address1", "", "250", "", true);
	static public final MCReportMeta address2_META_0 = new MCReportMeta("address2", "", "250", "", true);
	static public final MCReportMeta tel1_META_0 = new MCReportMeta("tel1", "", "50", "", true);
	static public final MCReportMeta tel2_META_0 = new MCReportMeta("tel2", "", "50", "", true);
	static public final MCReportMeta fax_META_0 = new MCReportMeta("fax", "", "50", "", true);
	static public final MCReportMeta paymentwarehouse_META_0 = new MCReportMeta("paymentwarehouse", "", "20", "", true);
	static public final MCReportMeta location_META_0 = new MCReportMeta("location", "", "20", "", true);
	static public final MCReportMeta bookno_numbering_flag_META_0 = new MCReportMeta("bookno_numbering_flag", "", "20", "", true);
	static public final MCReportMeta mfgflg_META_0 = new MCReportMeta("mfgflg", "", "1", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			departmenttype_META_0,
			code_META_0,
			name_META_0,
			activeflag_META_0,
			extension_META_0,
			searchcharacter_META_0,
			zip_META_0,
			address1_META_0,
			address2_META_0,
			tel1_META_0,
			tel2_META_0,
			fax_META_0,
			paymentwarehouse_META_0,
			location_META_0,
			bookno_numbering_flag_META_0,
			mfgflg_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_AcDptPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

