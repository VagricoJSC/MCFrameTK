package mcframe.commonPFBE.PFBER5150;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmRawmatePrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmRawmatePrnt extends PFBER_ItmRawmatePrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmRawmatePrnt() {
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
	public static PFBER_ItmRawmatePrnt create() {
		return new PFBER_ItmRawmatePrnt();
	}
}
