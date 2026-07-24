package mcframe.clientMAUD.MAUDP1020;

import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.notice.MCAppException;
import static mcframe.commonFX.notice.FX_Msg.*;

public class MAUDP_LCLRLUtil_MC extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUtil {

	/**
	 * @param p 利用している画面のインスタンス。 {@link IfRLBase}を
	 * 実装している必要がある。
	 */
	public void setPanel(FXBAP_PanelBase p) {
		_panel = p;
		if (p instanceof IfLCLRLBase) {
			_implRLBase = (IfLCLRLBase) p;
		}
		else {
			throw new MCAppException(FXBAP0072);
		}
	}
	protected IfLCLRLBase getImplRLBase() {
		if (_implRLBase == null) {
			throw new MCAppException(FXBAP0073);
		}
		return (IfLCLRLBase) _implRLBase;
	}

	// ////////////////
	// Dtlブロック関係
	// ////////////////

	protected String[] getLclRKeyColumns() {
		return getImplRLBase().getLclRKeyColumns();
	}

	/**リストDtlLに関連付けられるTableを返します。*/
	// 戻り値のMCTableのジェネリクス
	protected MCTable getLclTable() {
		return getImplRLBase().getLclTable();
	}

	/**
	 * 検索結果を表示し、値の編集を行うリスト。
	 * <P>テーブルに紐づくリストを指定する必要がある。</P>
	 */
	protected MCList<? extends MCConstRow> getLclL() {
		return getImplRLBase().getLclL();
	}
	
	/**
	 * リストDtlLに関連付けられるTableを返します。
	 */
	// 戻り値のMCTableのジェネリクス
	public MCTable defGetLclTable() {
		return getTable(getLclL());
	}

	/** LclTableのキー項目を返します。 */
	protected String[] _lcl_ks;

	public String[] defGetLclRKeyColumns() {
		if (_lcl_ks == null) {
			MCConstRow r = getLclL().createRow();
			_lcl_ks = r.getKeys().toArray(_dummyStringArray);
		}
		return _lcl_ks;
	}

	/**
	 * アプリケーションが使用するデフォルトのセルコンフィグ
	 * @deprecated 共通親クラスのみがオーバーライド呼び出し可能
	 */
	@Deprecated
	public MAUDP_LCLRLBaseCellConfig defCreateDefaultAppCellConfig() {
		MAUDP_LCLRLBaseCellConfig cellConf = new MAUDP_LCLRLBaseCellConfig(
				(MAUDP_LCLRLBase) getPanel());
		return cellConf;
	}

	/**キー項目でソートします。*/
	public void defSetSortColumn() {
		MCTable t = getLclTable();
		for (MCColumnConfig c : getColumnConfigs(t, getLclRKeyColumns())) {
			getLclTable().addSortColumn(c, MCList.SortType.ASC);
		}
	}
}
