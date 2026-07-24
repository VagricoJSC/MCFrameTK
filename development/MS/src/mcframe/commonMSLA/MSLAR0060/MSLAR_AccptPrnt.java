package mcframe.commonMSLA.MSLAR0060;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_AccptPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_AccptPrnt extends MSLAR_AccptPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_AccptPrnt() {
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
	public static MSLAR_AccptPrnt create() {
		return new MSLAR_AccptPrnt();
	}
}
