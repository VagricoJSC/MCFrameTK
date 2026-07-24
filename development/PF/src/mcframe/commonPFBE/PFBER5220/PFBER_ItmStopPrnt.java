package mcframe.commonPFBE.PFBER5220;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmStopPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmStopPrnt extends PFBER_ItmStopPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmStopPrnt() {
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
	public static PFBER_ItmStopPrnt create() {
		return new PFBER_ItmStopPrnt();
	}
}
