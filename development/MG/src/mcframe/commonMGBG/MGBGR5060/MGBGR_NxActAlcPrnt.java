package mcframe.commonMGBG.MGBGR5060;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBGR_NxActAlcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBGR_NxActAlcPrnt extends MGBGR_NxActAlcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBGR_NxActAlcPrnt() {
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
	public static MGBGR_NxActAlcPrnt create() {
		return new MGBGR_NxActAlcPrnt();
	}
}
