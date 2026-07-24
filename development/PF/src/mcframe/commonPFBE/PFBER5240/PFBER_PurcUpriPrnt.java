package mcframe.commonPFBE.PFBER5240;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_PurcUpriPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_PurcUpriPrnt extends PFBER_PurcUpriPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_PurcUpriPrnt() {
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
	public static PFBER_PurcUpriPrnt create() {
		return new PFBER_PurcUpriPrnt();
	}
}
