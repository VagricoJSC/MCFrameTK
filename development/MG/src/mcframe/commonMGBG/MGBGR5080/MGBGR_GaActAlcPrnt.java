package mcframe.commonMGBG.MGBGR5080;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_GaActAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_GaActAlcPrnt extends MGBGR_GaActAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_GaActAlcPrnt() {
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
	public static MGBGR_GaActAlcPrnt create() {
		return new MGBGR_GaActAlcPrnt();
	}
}
