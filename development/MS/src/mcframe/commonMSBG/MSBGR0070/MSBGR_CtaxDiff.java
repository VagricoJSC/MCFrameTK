package mcframe.commonMSBG.MSBGR0070;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_CtaxDiff"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_CtaxDiff extends MSBGR_CtaxDiff_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_CtaxDiff() {
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
	public static MSBGR_CtaxDiff create() {
		return new MSBGR_CtaxDiff();
	}
}
