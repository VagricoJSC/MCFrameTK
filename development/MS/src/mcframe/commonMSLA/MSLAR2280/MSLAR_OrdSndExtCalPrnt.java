package mcframe.commonMSLA.MSLAR2280;

import mcframe.commonCore.annotation.EI;

/**
 * "MSLAR_OrdSndExtCalPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSLAR_OrdSndExtCalPrnt extends MSLAR_OrdSndExtCalPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public MSLAR_OrdSndExtCalPrnt() {
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
	public static MSLAR_OrdSndExtCalPrnt create() {
		return new MSLAR_OrdSndExtCalPrnt();
	}
}
