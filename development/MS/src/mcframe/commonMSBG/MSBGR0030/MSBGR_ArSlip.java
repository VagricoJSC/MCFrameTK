package mcframe.commonMSBG.MSBGR0030;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBGR_ArSlip"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBGR_ArSlip extends MSBGR_ArSlip_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBGR_ArSlip() {
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
	public static MSBGR_ArSlip create() {
		return new MSBGR_ArSlip();
	}
}
