package mcframe.commonMGBB.MGBBR6030;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBBR_ActWkPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBBR_ActWkPrnt extends MGBBR_ActWkPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBBR_ActWkPrnt() {
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
	public static MGBBR_ActWkPrnt create() {
		return new MGBBR_ActWkPrnt();
	}
}
