package mcframe.commonMSBE.MSBER0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBCR_StkList"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBCR_StkList extends MSBCR_StkList_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBCR_StkList() {
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
	public static MSBCR_StkList create() {
		return new MSBCR_StkList();
	}
}
