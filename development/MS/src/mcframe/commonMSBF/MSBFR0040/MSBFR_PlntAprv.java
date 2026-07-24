package mcframe.commonMSBF.MSBFR0040;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBFR_PlntAprv"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBFR_PlntAprv extends MSBFR_PlntAprv_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBFR_PlntAprv() {
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
	public static MSBFR_PlntAprv create() {
		return new MSBFR_PlntAprv();
	}
}
