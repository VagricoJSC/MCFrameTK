package mcframe.commonMSLA.MSLAR1210;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_YieldSchdPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_YieldSchdPrnt extends MSLAR_YieldSchdPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_YieldSchdPrnt() {
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
	public static MSLAR_YieldSchdPrnt create() {
		return new MSLAR_YieldSchdPrnt();
	}
}
