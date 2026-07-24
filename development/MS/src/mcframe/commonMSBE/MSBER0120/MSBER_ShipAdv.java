package mcframe.commonMSBE.MSBER0120;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_ShipAdv"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_ShipAdv extends MSBER_ShipAdv_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_ShipAdv() {
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
	public static MSBER_ShipAdv create() {
		return new MSBER_ShipAdv();
	}
}
