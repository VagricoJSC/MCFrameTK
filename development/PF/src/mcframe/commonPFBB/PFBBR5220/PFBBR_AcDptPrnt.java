package mcframe.commonPFBB.PFBBR5220;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_AcDptPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_AcDptPrnt extends PFBBR_AcDptPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_AcDptPrnt() {
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
	public static PFBBR_AcDptPrnt create() {
		return new PFBBR_AcDptPrnt();
	}
}
