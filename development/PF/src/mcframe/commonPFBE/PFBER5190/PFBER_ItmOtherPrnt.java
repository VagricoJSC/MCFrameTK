package mcframe.commonPFBE.PFBER5190;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmOtherPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmOtherPrnt extends PFBER_ItmOtherPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmOtherPrnt() {
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
	public static PFBER_ItmOtherPrnt create() {
		return new PFBER_ItmOtherPrnt();
	}
}
