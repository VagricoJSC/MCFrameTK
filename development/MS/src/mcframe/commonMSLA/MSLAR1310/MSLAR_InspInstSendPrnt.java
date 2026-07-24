package mcframe.commonMSLA.MSLAR1310;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_InspInstSendPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_InspInstSendPrnt extends MSLAR_InspInstSendPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_InspInstSendPrnt() {
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
	public static MSLAR_InspInstSendPrnt create() {
		return new MSLAR_InspInstSendPrnt();
	}
}
