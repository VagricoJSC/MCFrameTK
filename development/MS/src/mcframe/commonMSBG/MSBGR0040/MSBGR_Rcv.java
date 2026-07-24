package mcframe.commonMSBG.MSBGR0040;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_Rcv"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_Rcv extends MSBGR_Rcv_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_Rcv() {
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
	public static MSBGR_Rcv create() {
		return new MSBGR_Rcv();
	}
}
