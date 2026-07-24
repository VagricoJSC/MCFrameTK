package mcframe.commonPFBA.PFBAR5180;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_AcTaxPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_AcTaxPrnt extends PFBAR_AcTaxPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_AcTaxPrnt() {
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
	public static PFBAR_AcTaxPrnt create() {
		return new PFBAR_AcTaxPrnt();
	}
}
