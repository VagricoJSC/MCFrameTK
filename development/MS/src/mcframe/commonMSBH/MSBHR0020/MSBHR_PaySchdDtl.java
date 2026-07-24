package mcframe.commonMSBH.MSBHR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBHR_PaySchdDtl"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBHR_PaySchdDtl extends MSBHR_PaySchdDtl_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBHR_PaySchdDtl() {
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
	public static MSBHR_PaySchdDtl create() {
		return new MSBHR_PaySchdDtl();
	}
}
