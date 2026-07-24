package mcframe.commonMSBG.MSBGR0050;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_Sw"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_Sw extends MSBGR_Sw_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_Sw() {
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
	public static MSBGR_Sw create() {
		return new MSBGR_Sw();
	}
}
