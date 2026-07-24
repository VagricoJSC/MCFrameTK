package mcframe.commonMSBC.MSBCR1020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBCR_MfgAct"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBCR_MfgAct extends MSBCR_MfgAct_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBCR_MfgAct() {
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
	public static MSBCR_MfgAct create() {
		return new MSBCR_MfgAct();
	}
}
