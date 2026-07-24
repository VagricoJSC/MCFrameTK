package mcframe.commonMGBG.MGBGR5070;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_GaPlnAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_GaPlnAlcPrnt extends MGBGR_GaPlnAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_GaPlnAlcPrnt() {
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
	public static MGBGR_GaPlnAlcPrnt create() {
		return new MGBGR_GaPlnAlcPrnt();
	}
}
