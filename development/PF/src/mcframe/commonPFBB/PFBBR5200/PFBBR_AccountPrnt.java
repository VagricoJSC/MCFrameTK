package mcframe.commonPFBB.PFBBR5200;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_AccountPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_AccountPrnt extends PFBBR_AccountPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_AccountPrnt() {
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
	public static PFBBR_AccountPrnt create() {
		return new PFBBR_AccountPrnt();
	}
}
