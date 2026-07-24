package mcframe.commonPFBB.PFBBR5010;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBBR_JournalPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBBR_JournalPrnt extends PFBBR_JournalPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBBR_JournalPrnt() {
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
	public static PFBBR_JournalPrnt create() {
		return new PFBBR_JournalPrnt();
	}
}
