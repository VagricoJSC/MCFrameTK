package mcframe.commonMSBH.MSBHR0030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBHR_Sw"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBHR_Sw extends MSBHR_Sw_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBHR_Sw() {
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
	public static MSBHR_Sw create() {
		return new MSBHR_Sw();
	}
}
