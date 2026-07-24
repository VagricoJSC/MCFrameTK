package mcframe.commonMSLA.MSLAR2340;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndOrdLnkPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndOrdLnkPrnt extends MSLAR_OrdSndOrdLnkPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndOrdLnkPrnt() {
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
	public static MSLAR_OrdSndOrdLnkPrnt create() {
		return new MSLAR_OrdSndOrdLnkPrnt();
	}
}
