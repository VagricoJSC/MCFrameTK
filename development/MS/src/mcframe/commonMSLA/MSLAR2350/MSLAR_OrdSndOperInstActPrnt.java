package mcframe.commonMSLA.MSLAR2350;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndOperInstActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndOperInstActPrnt extends MSLAR_OrdSndOperInstActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndOperInstActPrnt() {
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
	public static MSLAR_OrdSndOperInstActPrnt create() {
		return new MSLAR_OrdSndOperInstActPrnt();
	}
}
