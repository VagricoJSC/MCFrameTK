package mcframe.commonMSLA.MSLAR2360;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndSchdActQtyPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndSchdActQtyPrnt extends MSLAR_OrdSndSchdActQtyPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndSchdActQtyPrnt() {
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
	public static MSLAR_OrdSndSchdActQtyPrnt create() {
		return new MSLAR_OrdSndSchdActQtyPrnt();
	}
}
