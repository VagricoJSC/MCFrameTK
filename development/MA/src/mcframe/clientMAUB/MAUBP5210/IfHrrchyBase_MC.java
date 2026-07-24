package mcframe.clientMAUB.MAUBP5210;

import mcframe.commonCore.container.*;
import mcframe.clientCore.container.MCConstRow;

/**
 * 階層部品の動作を利用する画面に実装する。<p>
 * 
 */
public interface IfHrrchyBase_MC {
	
	/**
	 * 削除対象を操作する。<p>
	 * 
	 * テーブルにリストが再設定される前に呼び出される。<br>
	 * 戻り値はテーブルに追加される。
	 * @param rmL 削除対象
	 * @return 追加対象
	 */
	MCList<MCConstRow> hndlCollapseList(MCList<MCConstRow> rmL);

	/**
	 * 追加対象を操作する。<p>
	 * 
	 * テーブルにリストが再設定される前に呼び出される。<br>
	 * @param rmL 追加対象
	 */
	void hndlExpandList(MCList<MCConstRow> addL);
	
	/**
	 * テーブルにリストが設定された後に呼び出される。
	 */
	void afterSetViewList();

	/**
	 * 階層ラベルを編集する。<p>
	 * 
	 * falseを返した場合は、部品に実装している編集処理が実行される。
	 * 
	 * @return 編集した場合true
	 */
	boolean setHrrchyStr();

	/**
	 * node, leafラベルを編集する。<p>
	 * 
	 * falseを返した場合は、部品に実装している編集処理が実行される。
	 * 
	 * @return 編集した場合true
	 */
	boolean setLeafStr();
}
