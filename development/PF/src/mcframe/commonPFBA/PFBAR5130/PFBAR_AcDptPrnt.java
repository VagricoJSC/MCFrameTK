package mcframe.commonPFBA.PFBAR5130;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_AcDptPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_AcDptPrnt extends PFBAR_AcDptPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_AcDptPrnt() {
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
	public static PFBAR_AcDptPrnt create() {
		return new PFBAR_AcDptPrnt();
	}
}
