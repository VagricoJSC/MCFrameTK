package mcframe.commonMSBH.MSBHR0040;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBHR_PayNtc"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBHR_PayNtc extends MSBHR_PayNtc_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBHR_PayNtc() {
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
	public static MSBHR_PayNtc create() {
		return new MSBHR_PayNtc();
	}
}
