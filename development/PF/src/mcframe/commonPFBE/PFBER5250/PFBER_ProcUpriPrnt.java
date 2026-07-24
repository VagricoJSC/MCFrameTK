package mcframe.commonPFBE.PFBER5250;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ProcUpriPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ProcUpriPrnt extends PFBER_ProcUpriPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ProcUpriPrnt() {
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
	public static PFBER_ProcUpriPrnt create() {
		return new PFBER_ProcUpriPrnt();
	}
}
