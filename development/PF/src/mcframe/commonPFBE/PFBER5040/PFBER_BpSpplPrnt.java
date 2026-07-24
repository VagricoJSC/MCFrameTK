package mcframe.commonPFBE.PFBER5040;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_BpSpplPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_BpSpplPrnt extends PFBER_BpSpplPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_BpSpplPrnt() {
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
	public static PFBER_BpSpplPrnt create() {
		return new PFBER_BpSpplPrnt();
	}
}
