package mcframe.commonMSLA.MSLAR2010;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_RcvPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_RcvPrnt extends MSLAR_RcvPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_RcvPrnt() {
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
	public static MSLAR_RcvPrnt create() {
		return new MSLAR_RcvPrnt();
	}
}
