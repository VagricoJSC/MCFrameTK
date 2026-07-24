package mcframe.commonMSLA.MSLAR0020;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_SloPoPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_SloPoPrnt extends MSLAR_SloPoPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_SloPoPrnt() {
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
	public static MSLAR_SloPoPrnt create() {
		return new MSLAR_SloPoPrnt();
	}
}
