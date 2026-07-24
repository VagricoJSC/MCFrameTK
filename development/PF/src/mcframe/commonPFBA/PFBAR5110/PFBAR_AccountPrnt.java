package mcframe.commonPFBA.PFBAR5110;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_AccountPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_AccountPrnt extends PFBAR_AccountPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_AccountPrnt() {
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
	public static PFBAR_AccountPrnt create() {
		return new PFBAR_AccountPrnt();
	}
}
