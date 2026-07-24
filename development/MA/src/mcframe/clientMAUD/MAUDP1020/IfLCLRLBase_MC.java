package mcframe.clientMAUD.MAUDP1020;

import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientMAUD.MAUDP1010.IfRLBase;
import mcframe.commonCore.container.MCList;

public interface IfLCLRLBase_MC extends IfRLBase {

	/**
	 * 全ての検索結果を格納するリスト。非表示。
	 */
	public MCList<? extends MCConstRow> getLclAllL();

	/**
	 * 検索結果を表示し、値の編集を行うリスト。
	 * <P>テーブルに紐づくリストを指定する必要がある。</P>
	 */
	public MCList<? extends MCConstRow> getLclL();

	/**
	 * リストDtlLに関連付けられるTableを返します。
	 */
	@SuppressWarnings("unchecked")
	// 戻り値のMCTableのジェネリクス
	public MCTable getLclTable();

	public String[] getLclRKeyColumns();

}
