package mcframe.commonMSBG.MSBGR0060;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_Setoff"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_Setoff extends MSBGR_Setoff_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_Setoff() {
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
	public static MSBGR_Setoff create() {
		return new MSBGR_Setoff();
	}
}
