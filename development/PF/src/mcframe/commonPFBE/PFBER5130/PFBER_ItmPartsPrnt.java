package mcframe.commonPFBE.PFBER5130;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_ItmPartsPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_ItmPartsPrnt extends PFBER_ItmPartsPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_ItmPartsPrnt() {
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
	public static PFBER_ItmPartsPrnt create() {
		return new PFBER_ItmPartsPrnt();
	}
}
