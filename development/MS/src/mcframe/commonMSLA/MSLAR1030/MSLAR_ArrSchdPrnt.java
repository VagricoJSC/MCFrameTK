package mcframe.commonMSLA.MSLAR1030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_ArrSchdPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_ArrSchdPrnt extends MSLAR_ArrSchdPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_ArrSchdPrnt() {
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
	public static MSLAR_ArrSchdPrnt create() {
		return new MSLAR_ArrSchdPrnt();
	}
}
