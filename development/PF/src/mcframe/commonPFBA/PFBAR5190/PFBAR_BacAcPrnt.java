package mcframe.commonPFBA.PFBAR5190;

import mcframe.commonCore.annotation.EI;

/**
 * "PFBAR_BacAcPrnt"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PFBAR_BacAcPrnt extends PFBAR_BacAcPrnt_MC {

	/**
	 * コンストラクタです。
	 */
	public PFBAR_BacAcPrnt() {
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
	public static PFBAR_BacAcPrnt create() {
		return new PFBAR_BacAcPrnt();
	}
}
