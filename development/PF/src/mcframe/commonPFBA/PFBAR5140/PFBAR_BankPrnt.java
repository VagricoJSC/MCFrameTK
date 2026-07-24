package mcframe.commonPFBA.PFBAR5140;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_BankPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_BankPrnt extends PFBAR_BankPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_BankPrnt() {
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
	public static PFBAR_BankPrnt create() {
		return new PFBAR_BankPrnt();
	}
}
