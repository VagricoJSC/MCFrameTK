package mcframe.commonMGBG.MGBGR5070;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MGBGR_GaPlnAlcPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MG";
	static final String _defaultReportId = "MGBGR5070";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMGBG.MGBGR5070.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta type_META_0 = new MCReportMeta("type", "", "1", "", true);
	static public final MCReportMeta budgetcode_META_0 = new MCReportMeta("budgetcode", "", "20", "", true);
	static public final MCReportMeta budgetname_META_0 = new MCReportMeta("budgetname", "", "100", "", true);
	static public final MCReportMeta extension_META_0 = new MCReportMeta("extension", "", "2", "", true);
	static public final MCReportMeta searchcharacter_META_0 = new MCReportMeta("searchcharacter", "", "1", "", true);
	static public final MCReportMeta deptcode_META_0 = new MCReportMeta("deptcode", "", "20", "", true);
	static public final MCReportMeta userno_META_0 = new MCReportMeta("userno", "", "1", "", true);
	static public final MCReportMeta memo_META_0 = new MCReportMeta("memo", "", "100", "", true);
	static public final MCReportMeta detail_usermaster_META_0 = new MCReportMeta("detail_usermaster", "", "20", "", true);
	static public final MCReportMeta accode_META_0 = new MCReportMeta("accode", "", "20", "", true);
	static public final MCReportMeta subcode_META_0 = new MCReportMeta("subcode", "", "20", "", true);
	static public final MCReportMeta ym_META_0 = new MCReportMeta("ym", "", "", "", true);
	static public final MCReportMeta budgetamount_META_0 = new MCReportMeta("budgetamount", "", "16,2", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			type_META_0,
			budgetcode_META_0,
			budgetname_META_0,
			extension_META_0,
			searchcharacter_META_0,
			deptcode_META_0,
			userno_META_0,
			memo_META_0,
			detail_usermaster_META_0,
			accode_META_0,
			subcode_META_0,
			ym_META_0,
			budgetamount_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MGBGR_GaPlnAlcPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

