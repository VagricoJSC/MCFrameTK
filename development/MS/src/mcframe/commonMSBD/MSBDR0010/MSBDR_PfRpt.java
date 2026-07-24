package mcframe.commonMSBD.MSBDR0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBDR_PfRpt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBDR_PfRpt extends MSBDR_PfRpt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBDR_PfRpt() {
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
	public static MSBDR_PfRpt create() {
		return new MSBDR_PfRpt();
	}
}
