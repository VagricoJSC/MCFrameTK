package mcframe.commonMSBC.MSBCR1030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBCR_OperBom"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBCR_OperBom extends MSBCR_OperBom_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBCR_OperBom() {
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
	public static MSBCR_OperBom create() {
		return new MSBCR_OperBom();
	}
}
