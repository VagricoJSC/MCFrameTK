package mcframe.commonMSLA.MSLAR2210;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdPrnt extends MSLAR_OrdPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdPrnt() {
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
	public static MSLAR_OrdPrnt create() {
		return new MSLAR_OrdPrnt();
	}
}
