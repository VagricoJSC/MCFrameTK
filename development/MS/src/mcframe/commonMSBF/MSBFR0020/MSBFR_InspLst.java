package mcframe.commonMSBF.MSBFR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBFR_InspLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBFR_InspLst extends MSBFR_InspLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBFR_InspLst() {
		super();
		setModuleID(_defaultModuleId);
		setReportID(_defaultReportId);
		setReportVersion(_version);
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}

	/**
	 * 新しいReportSetを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSBFR_InspLst create() {
		return new MSBFR_InspLst();
	}
}
