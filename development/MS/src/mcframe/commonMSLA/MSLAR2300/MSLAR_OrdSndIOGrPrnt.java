package mcframe.commonMSLA.MSLAR2300;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndIOGrPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndIOGrPrnt extends MSLAR_OrdSndIOGrPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndIOGrPrnt() {
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
	public static MSLAR_OrdSndIOGrPrnt create() {
		return new MSLAR_OrdSndIOGrPrnt();
	}
}
