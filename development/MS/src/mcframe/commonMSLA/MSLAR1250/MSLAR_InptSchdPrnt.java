package mcframe.commonMSLA.MSLAR1250;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_InptSchdPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_InptSchdPrnt extends MSLAR_InptSchdPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_InptSchdPrnt() {
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
	public static MSLAR_InptSchdPrnt create() {
		return new MSLAR_InptSchdPrnt();
	}
}
