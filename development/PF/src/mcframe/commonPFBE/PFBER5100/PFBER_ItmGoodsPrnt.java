package mcframe.commonPFBE.PFBER5100;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmGoodsPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmGoodsPrnt extends PFBER_ItmGoodsPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmGoodsPrnt() {
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
	public static PFBER_ItmGoodsPrnt create() {
		return new PFBER_ItmGoodsPrnt();
	}
}
