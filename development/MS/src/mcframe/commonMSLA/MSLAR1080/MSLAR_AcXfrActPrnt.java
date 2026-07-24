package mcframe.commonMSLA.MSLAR1080;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_AcXfrActPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_AcXfrActPrnt extends MSLAR_AcXfrActPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_AcXfrActPrnt() {
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
	public static MSLAR_AcXfrActPrnt create() {
		return new MSLAR_AcXfrActPrnt();
	}
}
