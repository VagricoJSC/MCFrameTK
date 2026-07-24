package mcframe.commonPFBB.PFBBR5030;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_PurcSlipPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_PurcSlipPrnt extends PFBBR_PurcSlipPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_PurcSlipPrnt() {
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
	public static PFBBR_PurcSlipPrnt create() {
		return new PFBBR_PurcSlipPrnt();
	}
}
