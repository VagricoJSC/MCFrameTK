package mcframe.commonMGBG.MGBGR5030;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_PlnAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_PlnAlcPrnt extends MGBGR_PlnAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_PlnAlcPrnt() {
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
	public static MGBGR_PlnAlcPrnt create() {
		return new MGBGR_PlnAlcPrnt();
	}
}
