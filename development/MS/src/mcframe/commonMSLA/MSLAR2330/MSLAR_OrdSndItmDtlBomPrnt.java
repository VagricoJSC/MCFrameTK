package mcframe.commonMSLA.MSLAR2330;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndItmDtlBomPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndItmDtlBomPrnt extends MSLAR_OrdSndItmDtlBomPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndItmDtlBomPrnt() {
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
	public static MSLAR_OrdSndItmDtlBomPrnt create() {
		return new MSLAR_OrdSndItmDtlBomPrnt();
	}
}
