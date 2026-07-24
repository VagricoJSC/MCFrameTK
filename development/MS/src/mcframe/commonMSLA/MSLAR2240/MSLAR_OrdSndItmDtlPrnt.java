package mcframe.commonMSLA.MSLAR2240;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndItmDtlPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndItmDtlPrnt extends MSLAR_OrdSndItmDtlPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndItmDtlPrnt() {
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
	public static MSLAR_OrdSndItmDtlPrnt create() {
		return new MSLAR_OrdSndItmDtlPrnt();
	}
}
