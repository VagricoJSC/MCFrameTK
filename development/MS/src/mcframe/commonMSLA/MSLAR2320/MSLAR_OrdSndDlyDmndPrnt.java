package mcframe.commonMSLA.MSLAR2320;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndDlyDmndPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndDlyDmndPrnt extends MSLAR_OrdSndDlyDmndPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndDlyDmndPrnt() {
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
	public static MSLAR_OrdSndDlyDmndPrnt create() {
		return new MSLAR_OrdSndDlyDmndPrnt();
	}
}
