package mcframe.commonMGBF.MGBFR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MGBFR_EndStkAmtLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MGBFR_EndStkAmtLst extends MGBFR_EndStkAmtLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MGBFR_EndStkAmtLst() {
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
	public static MGBFR_EndStkAmtLst create() {
		return new MGBFR_EndStkAmtLst();
	}
}
