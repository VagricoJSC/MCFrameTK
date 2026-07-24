package mcframe.commonPFBE.PFBER5010;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBER_BpCstPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBER_BpCstPrnt extends PFBER_BpCstPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBER_BpCstPrnt() {
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
	public static PFBER_BpCstPrnt create() {
		return new PFBER_BpCstPrnt();
	}
}
