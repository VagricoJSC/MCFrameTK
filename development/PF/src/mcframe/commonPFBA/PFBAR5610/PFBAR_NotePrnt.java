package mcframe.commonPFBA.PFBAR5610;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_NotePrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_NotePrnt extends PFBAR_NotePrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_NotePrnt() {
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
	public static PFBAR_NotePrnt create() {
		return new PFBAR_NotePrnt();
	}
}
