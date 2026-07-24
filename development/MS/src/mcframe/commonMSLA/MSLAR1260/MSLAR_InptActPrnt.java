package mcframe.commonMSLA.MSLAR1260;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_InptActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_InptActPrnt extends MSLAR_InptActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_InptActPrnt() {
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
	public static MSLAR_InptActPrnt create() {
		return new MSLAR_InptActPrnt();
	}
}
