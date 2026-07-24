package mcframe.commonPFBE.PFBER5030;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_BpDestPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_BpDestPrnt extends PFBER_BpDestPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_BpDestPrnt() {
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
	public static PFBER_BpDestPrnt create() {
		return new PFBER_BpDestPrnt();
	}
}
