package mcframe.commonMSBE.MSBER0100;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_PickLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_PickLst extends MSBER_PickLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_PickLst() {
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
	public static MSBER_PickLst create() {
		return new MSBER_PickLst();
	}
}
