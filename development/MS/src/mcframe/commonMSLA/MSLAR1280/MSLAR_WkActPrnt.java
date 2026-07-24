package mcframe.commonMSLA.MSLAR1280;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_WkActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_WkActPrnt extends MSLAR_WkActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_WkActPrnt() {
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
	public static MSLAR_WkActPrnt create() {
		return new MSLAR_WkActPrnt();
	}
}
