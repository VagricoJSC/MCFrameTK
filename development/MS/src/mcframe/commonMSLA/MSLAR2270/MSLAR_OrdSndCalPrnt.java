package mcframe.commonMSLA.MSLAR2270;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndCalPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndCalPrnt extends MSLAR_OrdSndCalPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndCalPrnt() {
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
	public static MSLAR_OrdSndCalPrnt create() {
		return new MSLAR_OrdSndCalPrnt();
	}
}
