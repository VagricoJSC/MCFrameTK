package mcframe.commonPFBE.PFBER5120;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmWipPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmWipPrnt extends PFBER_ItmWipPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmWipPrnt() {
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
	public static PFBER_ItmWipPrnt create() {
		return new PFBER_ItmWipPrnt();
	}
}
