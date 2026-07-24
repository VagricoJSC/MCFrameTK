package mcframe.commonMSLA.MSLAR2310;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndIOGiPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndIOGiPrnt extends MSLAR_OrdSndIOGiPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndIOGiPrnt() {
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
	public static MSLAR_OrdSndIOGiPrnt create() {
		return new MSLAR_OrdSndIOGiPrnt();
	}
}
