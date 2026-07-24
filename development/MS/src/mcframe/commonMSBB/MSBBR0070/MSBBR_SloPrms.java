package mcframe.commonMSBB.MSBBR0070;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBBR_SloPrms"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBR_SloPrms extends MSBBR_SloPrms_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBBR_SloPrms() {
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
	public static MSBBR_SloPrms create() {
		return new MSBBR_SloPrms();
	}
}
