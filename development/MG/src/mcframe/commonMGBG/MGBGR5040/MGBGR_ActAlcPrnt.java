package mcframe.commonMGBG.MGBGR5040;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_ActAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_ActAlcPrnt extends MGBGR_ActAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_ActAlcPrnt() {
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
	public static MGBGR_ActAlcPrnt create() {
		return new MGBGR_ActAlcPrnt();
	}
}
