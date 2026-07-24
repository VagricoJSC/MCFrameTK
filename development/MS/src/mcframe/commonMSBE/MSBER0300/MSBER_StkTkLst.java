package mcframe.commonMSBE.MSBER0300;

import mcframe.commonCore.annotation.EI;

/**
 * "MSBER_StkTkLst"帳票クラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBER_StkTkLst extends MSBER_StkTkLst_MC {

	/**
	 * コンストラクタです。
	 */
	public MSBER_StkTkLst() {
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
	public static MSBER_StkTkLst create() {
		return new MSBER_StkTkLst();
	}
}
