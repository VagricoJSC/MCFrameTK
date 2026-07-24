package mcframe.commonMSLA.MSLAR1230;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OperInstPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OperInstPrnt extends MSLAR_OperInstPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OperInstPrnt() {
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
	public static MSLAR_OperInstPrnt create() {
		return new MSLAR_OperInstPrnt();
	}
}
