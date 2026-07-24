package mcframe.commonMSLA.MSLAR1050;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_XfrInstPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_XfrInstPrnt extends MSLAR_XfrInstPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_XfrInstPrnt() {
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
	public static MSLAR_XfrInstPrnt create() {
		return new MSLAR_XfrInstPrnt();
	}
}
