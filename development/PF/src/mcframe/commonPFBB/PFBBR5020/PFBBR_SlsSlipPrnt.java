package mcframe.commonPFBB.PFBBR5020;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_SlsSlipPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_SlsSlipPrnt extends PFBBR_SlsSlipPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_SlsSlipPrnt() {
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
	public static PFBBR_SlsSlipPrnt create() {
		return new PFBBR_SlsSlipPrnt();
	}
}
