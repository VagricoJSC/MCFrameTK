package mcframe.commonMSBG.MSBGR0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_Bill"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_Bill extends MSBGR_Bill_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_Bill() {
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
	public static MSBGR_Bill create() {
		return new MSBGR_Bill();
	}
}
