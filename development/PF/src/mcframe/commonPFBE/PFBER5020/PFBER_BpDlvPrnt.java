package mcframe.commonPFBE.PFBER5020;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_BpDlvPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_BpDlvPrnt extends PFBER_BpDlvPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_BpDlvPrnt() {
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
	public static PFBER_BpDlvPrnt create() {
		return new PFBER_BpDlvPrnt();
	}
}
