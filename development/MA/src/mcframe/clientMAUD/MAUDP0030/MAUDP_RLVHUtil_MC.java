package mcframe.clientMAUD.MAUDP0030;

import static mcframe.clientFXUC.FXUCP0010.FXUCP_DataUtil.isColSame;
import mcframe.commonCore.container.MCRow;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;

/**
 * 縦横変換を行う画面で使用されます。
 *
 *
 */
public class MAUDP_RLVHUtil_MC extends MAUDP_RLUtil {

	/** 
	 * 行を削除します。 
	 * <p>
	 * デフォルト実装：キー変更行である場合、キーを変更前にもどします。
	 * </P>
	 * このメソッドを呼び出した後にsuperを呼び出します。
	 */
	public <E extends MCConstRow> boolean defDeleteRow(MCTable<E> table) {
		E sr = table.getSelectedMCRow();

		if (table.getRowCount() == 0) {
			return true;
		}

		if (sr == null) {
			table.selectLeftmostColumn(table.getRowCount() - 1);
			sr = table.getSelectedMCRow();
		}
		//画面表示用のテーブルで変更チェックを行う必要があるが、デフォルトでは「DtlTable」のキーを見に行ってしまう。
		//画面表示用テーブルのキーを取得するように変更
		if (sr.isStatusModify() && isKeyUpd(sr)) {
			if (confirmUndoKeyUpd()) {
				undoKeyUpd(sr);
			}
			else {
				return false;
			}
		}
		return true;
	}

	/** キーの変更がある場合trueを返します。 */
	protected boolean isKeyUpd(MCRow r) {
		String[] keyCols = ((MCConstRow) r).getKeys().toArray(new String[0]);
		String[] bKeyCols = getBeforeKeyColumns(keyCols);
		return !isColSame(r, keyCols, r, bKeyCols);
	}

	/** キー変更を元に戻します。 */
	protected void undoKeyUpd(MCRow r) {
		for (String c : ((MCConstRow) r).getKeys().toArray(new String[0])) {
			Comparable<?> b = r.getValue(getBeforeKeyColumn(c));
			r.setValue(c, b);
		}
	}

}

