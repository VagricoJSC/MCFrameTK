package mcframe.commonMSLA.MSLAR1060;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_XfrActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_XfrActPrnt extends MSLAR_XfrActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_XfrActPrnt() {
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
	public static MSLAR_XfrActPrnt create() {
		return new MSLAR_XfrActPrnt();
	}
}
