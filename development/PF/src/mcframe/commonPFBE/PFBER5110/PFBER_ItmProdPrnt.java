package mcframe.commonPFBE.PFBER5110;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmProdPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmProdPrnt extends PFBER_ItmProdPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmProdPrnt() {
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
	public static PFBER_ItmProdPrnt create() {
		return new PFBER_ItmProdPrnt();
	}
}
