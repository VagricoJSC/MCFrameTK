package mcframe.clientMAUD.MAUDP0010;

import java.util.List;
import mcframe.clientCore.beans.MCButtonGroup;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCRow;

public interface IfListRegPanel_MC {
	/**
	 * 登録用のテーブルを取得する
	 *
	 */
	public MCTable getListRegTable();
	
	/**
	 * チェックカラムの項目名を取得する
	 *
	 */
	public String getCheckColumn();

	/**
	 * チェックがオンになった行へ初期値を設定する。
	 * IfListRegPanelを実装している画面で、選択カラムのチェックをオンにしたときに
	 * 初期値を設定する場合は、この処理をO/Rし、実装します。
	 * 
	 * @param srcRow
	 */
	public void setDefaultValueWhenChecked(MCRow srcRow);
}
