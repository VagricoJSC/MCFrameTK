package mcframe.commonMSLA.MSLAR2220;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndItmPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndItmPrnt extends MSLAR_OrdSndItmPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndItmPrnt() {
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
	public static MSLAR_OrdSndItmPrnt create() {
		return new MSLAR_OrdSndItmPrnt();
	}
}
