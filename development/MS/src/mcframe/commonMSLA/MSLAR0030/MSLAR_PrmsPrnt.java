package mcframe.commonMSLA.MSLAR0030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_PrmsPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_PrmsPrnt extends MSLAR_PrmsPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_PrmsPrnt() {
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
	public static MSLAR_PrmsPrnt create() {
		return new MSLAR_PrmsPrnt();
	}
}
