package mcframe.commonMSLA.MSLAR1020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_ShipActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_ShipActPrnt extends MSLAR_ShipActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_ShipActPrnt() {
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
	public static MSLAR_ShipActPrnt create() {
		return new MSLAR_ShipActPrnt();
	}
}
