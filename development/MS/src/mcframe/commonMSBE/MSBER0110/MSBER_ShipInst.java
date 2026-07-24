package mcframe.commonMSBE.MSBER0110;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_ShipInst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_ShipInst extends MSBER_ShipInst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_ShipInst() {
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
	public static MSBER_ShipInst create() {
		return new MSBER_ShipInst();
	}
}
