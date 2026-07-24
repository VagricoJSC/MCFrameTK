package mcframe.commonPFBE.PFBER5140;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmMatePrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmMatePrnt extends PFBER_ItmMatePrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmMatePrnt() {
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
	public static PFBER_ItmMatePrnt create() {
		return new PFBER_ItmMatePrnt();
	}
}
