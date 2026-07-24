package mcframe.commonMSLA.MSLAR2230;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndItmOperPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndItmOperPrnt extends MSLAR_OrdSndItmOperPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndItmOperPrnt() {
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
	public static MSLAR_OrdSndItmOperPrnt create() {
		return new MSLAR_OrdSndItmOperPrnt();
	}
}
