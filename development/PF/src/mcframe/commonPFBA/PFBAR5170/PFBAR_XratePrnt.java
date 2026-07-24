package mcframe.commonPFBA.PFBAR5170;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_XratePrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_XratePrnt extends PFBAR_XratePrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_XratePrnt() {
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
	public static PFBAR_XratePrnt create() {
		return new PFBAR_XratePrnt();
	}
}
