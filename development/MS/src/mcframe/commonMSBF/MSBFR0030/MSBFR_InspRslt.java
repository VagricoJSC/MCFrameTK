package mcframe.commonMSBF.MSBFR0030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBFR_InspRslt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBFR_InspRslt extends MSBFR_InspRslt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBFR_InspRslt() {
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
	public static MSBFR_InspRslt create() {
		return new MSBFR_InspRslt();
	}
}
