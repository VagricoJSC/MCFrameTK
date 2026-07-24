package mcframe.commonPFBA.PFBAR5160;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_BankAcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_BankAcPrnt extends PFBAR_BankAcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_BankAcPrnt() {
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
	public static PFBAR_BankAcPrnt create() {
		return new PFBAR_BankAcPrnt();
	}
}
