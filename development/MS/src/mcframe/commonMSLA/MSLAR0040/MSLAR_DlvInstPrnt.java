package mcframe.commonMSLA.MSLAR0040;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_DlvInstPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_DlvInstPrnt extends MSLAR_DlvInstPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_DlvInstPrnt() {
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
	public static MSLAR_DlvInstPrnt create() {
		return new MSLAR_DlvInstPrnt();
	}
}
