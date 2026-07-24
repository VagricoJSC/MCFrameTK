package mcframe.commonMSLA.MSLAR2410;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_BillPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_BillPrnt extends MSLAR_BillPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_BillPrnt() {
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
	public static MSLAR_BillPrnt create() {
		return new MSLAR_BillPrnt();
	}
}
