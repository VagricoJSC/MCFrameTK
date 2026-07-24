package mcframe.commonMSBE.MSBER0130;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_XfrInst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_XfrInst extends MSBER_XfrInst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_XfrInst() {
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
	public static MSBER_XfrInst create() {
		return new MSBER_XfrInst();
	}
}
