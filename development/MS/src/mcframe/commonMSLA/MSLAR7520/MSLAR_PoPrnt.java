package mcframe.commonMSLA.MSLAR7520;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_PoPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_PoPrnt extends MSLAR_PoPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_PoPrnt() {
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
	public static MSLAR_PoPrnt create() {
		return new MSLAR_PoPrnt();
	}
}
