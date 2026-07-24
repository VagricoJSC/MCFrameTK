package mcframe.commonMSBE.MSBER0310;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_StkDiffLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_StkDiffLst extends MSBER_StkDiffLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_StkDiffLst() {
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
	public static MSBER_StkDiffLst create() {
		return new MSBER_StkDiffLst();
	}
}
