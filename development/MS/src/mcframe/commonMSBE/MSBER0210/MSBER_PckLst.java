package mcframe.commonMSBE.MSBER0210;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_PckLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_PckLst extends MSBER_PckLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_PckLst() {
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
	public static MSBER_PckLst create() {
		return new MSBER_PckLst();
	}
}
