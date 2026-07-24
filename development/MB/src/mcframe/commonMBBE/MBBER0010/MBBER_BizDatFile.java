package mcframe.commonMBBE.MBBER0010;

import mcframe.commonCore.annotation.EI;

/**
 * "MBBER_BizDatFile"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MBBER_BizDatFile extends MBBER_BizDatFile_MC {

	/**
	 * コンストラクタです。
	 */
	public MBBER_BizDatFile() {
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
	public static MBBER_BizDatFile create() {
		return new MBBER_BizDatFile();
	}
}
