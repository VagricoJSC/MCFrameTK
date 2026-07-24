package mcframe.commonMSBC.MSBCR1010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBCR_MfgInst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBCR_MfgInst extends MSBCR_MfgInst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBCR_MfgInst() {
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
	public static MSBCR_MfgInst create() {
		return new MSBCR_MfgInst();
	}
}
