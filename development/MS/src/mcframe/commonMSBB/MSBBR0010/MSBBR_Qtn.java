package mcframe.commonMSBB.MSBBR0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBBR_Qtn"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBR_Qtn extends MSBBR_Qtn_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBBR_Qtn() {
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
	public static MSBBR_Qtn create() {
		return new MSBBR_Qtn();
	}
}
