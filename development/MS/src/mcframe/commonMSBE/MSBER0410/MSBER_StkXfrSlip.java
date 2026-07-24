package mcframe.commonMSBE.MSBER0410;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_StkXfrSlip"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_StkXfrSlip extends MSBER_StkXfrSlip_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_StkXfrSlip() {
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
	public static MSBER_StkXfrSlip create() {
		return new MSBER_StkXfrSlip();
	}
}
