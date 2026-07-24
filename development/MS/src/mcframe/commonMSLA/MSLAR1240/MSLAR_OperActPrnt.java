package mcframe.commonMSLA.MSLAR1240;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OperActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OperActPrnt extends MSLAR_OperActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OperActPrnt() {
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
	public static MSLAR_OperActPrnt create() {
		return new MSLAR_OperActPrnt();
	}
}
