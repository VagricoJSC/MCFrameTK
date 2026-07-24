package mcframe.commonMSLA.MSLAR1320;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_InspActRecvPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_InspActRecvPrnt extends MSLAR_InspActRecvPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_InspActRecvPrnt() {
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
	public static MSLAR_InspActRecvPrnt create() {
		return new MSLAR_InspActRecvPrnt();
	}
}
