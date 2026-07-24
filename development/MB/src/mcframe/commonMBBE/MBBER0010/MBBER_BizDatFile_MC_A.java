package mcframe.commonMBBE.MBBER0010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MBBER_BizDatFile_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MB";
	static final String _defaultReportId = "MBBER0010";
	static final String _version = "701_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass BIZDATFILEL_RC = new MCReportClass("BizDatFile", mcframe.commonMBBE.MBBER0010.BizDatFileR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		BIZDATFILEL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("BizDatFile"
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MBBER_BizDatFile_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

