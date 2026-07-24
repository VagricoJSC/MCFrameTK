package mcframe.commonMGBG.MGBGR5080;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MGBGR_GaActAlcPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MG";
	static final String _defaultReportId = "MGBGR5080";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMGBG.MGBGR5080.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta ym_META_0 = new MCReportMeta("ym", "", "", "", true);
	static public final MCReportMeta datalevel_META_0 = new MCReportMeta("datalevel", "", "1", "", true);
	static public final MCReportMeta deptcode_META_0 = new MCReportMeta("deptcode", "", "20", "", true);
	static public final MCReportMeta accode_META_0 = new MCReportMeta("accode", "", "20", "", true);
	static public final MCReportMeta subcode_META_0 = new MCReportMeta("subcode", "", "20", "", true);
	static public final MCReportMeta currcode_META_0 = new MCReportMeta("currcode", "", "20", "", true);
	static public final MCReportMeta amountdrsc_META_0 = new MCReportMeta("amountdrsc", "", "17,2", "", true);
	static public final MCReportMeta taxdrsc_META_0 = new MCReportMeta("taxdrsc", "", "17,2", "", true);
	static public final MCReportMeta amountcrsc_META_0 = new MCReportMeta("amountcrsc", "", "17,2", "", true);
	static public final MCReportMeta taxcrsc_META_0 = new MCReportMeta("taxcrsc", "", "17,2", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			ym_META_0,
			datalevel_META_0,
			deptcode_META_0,
			accode_META_0,
			subcode_META_0,
			currcode_META_0,
			amountdrsc_META_0,
			taxdrsc_META_0,
			amountcrsc_META_0,
			taxcrsc_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MGBGR_GaActAlcPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

