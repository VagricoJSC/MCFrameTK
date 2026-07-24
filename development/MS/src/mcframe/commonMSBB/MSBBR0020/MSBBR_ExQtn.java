package mcframe.commonMSBB.MSBBR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBBR_ExQtn"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBR_ExQtn extends MSBBR_ExQtn_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBBR_ExQtn() {
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
	public static MSBBR_ExQtn create() {
		return new MSBBR_ExQtn();
	}
}
