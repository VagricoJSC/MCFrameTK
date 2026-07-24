package mcframe.commonMSBD.MSBDR0030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBDR_Po"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBDR_Po extends MSBDR_Po_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBDR_Po() {
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
	public static MSBDR_Po create() {
		return new MSBDR_Po();
	}
}
