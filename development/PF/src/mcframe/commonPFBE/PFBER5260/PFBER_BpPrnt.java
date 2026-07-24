package mcframe.commonPFBE.PFBER5260;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_BpPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_BpPrnt extends PFBER_BpPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_BpPrnt() {
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
	public static PFBER_BpPrnt create() {
		return new PFBER_BpPrnt();
	}
}
