package mcframe.commonMSLA.MSLAR0050;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_EshipPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_EshipPrnt extends MSLAR_EshipPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_EshipPrnt() {
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
	public static MSLAR_EshipPrnt create() {
		return new MSLAR_EshipPrnt();
	}
}
