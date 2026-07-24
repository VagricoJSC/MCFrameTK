package mcframe.commonMSLA.MSLAR1220;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_YieldActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_YieldActPrnt extends MSLAR_YieldActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_YieldActPrnt() {
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
	public static MSLAR_YieldActPrnt create() {
		return new MSLAR_YieldActPrnt();
	}
}
