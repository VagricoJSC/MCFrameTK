package mcframe.commonMGBF.MGBFR0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBFR_GrossAveUnitPriceLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBFR_GrossAveUnitPriceLst extends MGBFR_GrossAveUnitPriceLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBFR_GrossAveUnitPriceLst() {
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
	public static MGBFR_GrossAveUnitPriceLst create() {
		return new MGBFR_GrossAveUnitPriceLst();
	}
}
