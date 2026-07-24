package mcframe.commonPFBB.PFBBR5210;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_SubAccountPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_SubAccountPrnt extends PFBBR_SubAccountPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_SubAccountPrnt() {
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
	public static PFBBR_SubAccountPrnt create() {
		return new PFBBR_SubAccountPrnt();
	}
}
