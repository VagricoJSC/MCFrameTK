package mcframe.clientMAUD.MAUDP0130;

import mcframe.clientCore.beans.MCCacheType;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.commonCore.container.MCRow;

public abstract class MAUDP_ListLogicBase_MC extends mcframe.clientFXBA.FXBAP0020.FXBAP_ListLogicBase {
	
	/**
	 * 検索処理を実行する。<br>
	 * <br>
	 * {@link #getControlClassName()} のクラスのメソッドを実行する。
	 *
	 * @param row 検索条件
	 * @param panel 画面
	 * @param method 実行するメソッド名
	 * @return 検索結果
	 */
	protected MCRow getRow(MCRow row, MCRootPanel panel, String method) {
		return super.getRow(getListCacheTyp(row, panel), row, method);
	}

	protected MCCacheType getListCacheTyp(MCRow row, MCRootPanel panel) {
		MCCacheType typ = panel.getCacheType(null);
		if (typ != null) {
			return typ;
		}
		return _cache;
	}

}
