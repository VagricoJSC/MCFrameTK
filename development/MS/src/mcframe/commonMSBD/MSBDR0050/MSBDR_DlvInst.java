package mcframe.commonMSBD.MSBDR0050;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBDR_DlvInst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBDR_DlvInst extends MSBDR_DlvInst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBDR_DlvInst() {
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
	public static MSBDR_DlvInst create() {
		return new MSBDR_DlvInst();
	}
}
