package mcframe.commonMSLA.MSLAR2290;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndStkPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndStkPrnt extends MSLAR_OrdSndStkPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndStkPrnt() {
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
	public static MSLAR_OrdSndStkPrnt create() {
		return new MSLAR_OrdSndStkPrnt();
	}
}
