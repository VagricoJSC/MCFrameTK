package mcframe.commonMSLA.MSLAR1010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_ShipInstPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_ShipInstPrnt extends MSLAR_ShipInstPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_ShipInstPrnt() {
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
	public static MSLAR_ShipInstPrnt create() {
		return new MSLAR_ShipInstPrnt();
	}
}
