package mcframe.commonMSBG.MSBGR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_SlsDtl"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_SlsDtl extends MSBGR_SlsDtl_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_SlsDtl() {
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
	public static MSBGR_SlsDtl create() {
		return new MSBGR_SlsDtl();
	}
}
