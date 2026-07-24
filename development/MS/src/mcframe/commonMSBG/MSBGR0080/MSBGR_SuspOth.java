package mcframe.commonMSBG.MSBGR0080;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_SuspOth"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_SuspOth extends MSBGR_SuspOth_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_SuspOth() {
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
	public static MSBGR_SuspOth create() {
		return new MSBGR_SuspOth();
	}
}
