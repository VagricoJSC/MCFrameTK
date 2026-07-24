package mcframe.commonMSLA.MSLAR2260;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndLocPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndLocPrnt extends MSLAR_OrdSndLocPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndLocPrnt() {
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
	public static MSLAR_OrdSndLocPrnt create() {
		return new MSLAR_OrdSndLocPrnt();
	}
}
