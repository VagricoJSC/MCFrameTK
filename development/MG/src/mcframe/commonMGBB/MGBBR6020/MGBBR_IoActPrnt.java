package mcframe.commonMGBB.MGBBR6020;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBBR_IoActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBBR_IoActPrnt extends MGBBR_IoActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBBR_IoActPrnt() {
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
	public static MGBBR_IoActPrnt create() {
		return new MGBBR_IoActPrnt();
	}
}
