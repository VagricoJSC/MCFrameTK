package mcframe.commonPFBA.PFBAR5730;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_SchdPayPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_SchdPayPrnt extends PFBAR_SchdPayPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_SchdPayPrnt() {
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
	public static PFBAR_SchdPayPrnt create() {
		return new PFBAR_SchdPayPrnt();
	}
}
