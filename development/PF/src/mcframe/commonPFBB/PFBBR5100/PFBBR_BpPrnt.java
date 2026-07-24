package mcframe.commonPFBB.PFBBR5100;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_BpPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_BpPrnt extends PFBBR_BpPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_BpPrnt() {
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
	public static PFBBR_BpPrnt create() {
		return new PFBBR_BpPrnt();
	}
}
