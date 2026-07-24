package mcframe.commonPFBA.PFBAR5120;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_SubAccountPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_SubAccountPrnt extends PFBAR_SubAccountPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_SubAccountPrnt() {
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
	public static PFBAR_SubAccountPrnt create() {
		return new PFBAR_SubAccountPrnt();
	}
}
