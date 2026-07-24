package mcframe.commonMSLA.MSLAR2250;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndBomPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndBomPrnt extends MSLAR_OrdSndBomPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndBomPrnt() {
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
	public static MSLAR_OrdSndBomPrnt create() {
		return new MSLAR_OrdSndBomPrnt();
	}
}
