package mcframe.commonMSBH.MSBHR0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBHR_PaySchdLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBHR_PaySchdLst extends MSBHR_PaySchdLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBHR_PaySchdLst() {
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
	public static MSBHR_PaySchdLst create() {
		return new MSBHR_PaySchdLst();
	}
}
