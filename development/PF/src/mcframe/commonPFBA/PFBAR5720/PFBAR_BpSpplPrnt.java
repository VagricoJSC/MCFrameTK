package mcframe.commonPFBA.PFBAR5720;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_BpSpplPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_BpSpplPrnt extends PFBAR_BpSpplPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_BpSpplPrnt() {
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
	public static PFBAR_BpSpplPrnt create() {
		return new PFBAR_BpSpplPrnt();
	}
}
