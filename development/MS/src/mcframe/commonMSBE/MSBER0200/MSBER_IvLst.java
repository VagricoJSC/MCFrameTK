package mcframe.commonMSBE.MSBER0200;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_IvLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_IvLst extends MSBER_IvLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_IvLst() {
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
	public static MSBER_IvLst create() {
		return new MSBER_IvLst();
	}
}
