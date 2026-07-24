package mcframe.commonMGBG.MGBGR5050;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_NxPlnAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_NxPlnAlcPrnt extends MGBGR_NxPlnAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_NxPlnAlcPrnt() {
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
	public static MGBGR_NxPlnAlcPrnt create() {
		return new MGBGR_NxPlnAlcPrnt();
	}
}
