package mcframe.commonMSLA.MSLAR1040;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_ArrActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_ArrActPrnt extends MSLAR_ArrActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_ArrActPrnt() {
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
	public static MSLAR_ArrActPrnt create() {
		return new MSLAR_ArrActPrnt();
	}
}
