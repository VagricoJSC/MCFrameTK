package mcframe.clientMAUD.MAUDP0010;

import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCSortPolicy;

/**
 * {@link mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper } を利用する画面に実装するインタフェースです。
 */
public interface IfVHMapperPanel_MC {

	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy);

	public boolean sort(MCTable<?> table);

	/**
	 * 横テーブルの可変カラムの値が変更された後に実行されます。
	 * 縦リストに変更が反映された状態で実行されます。
	 *
	 * @param row 値が変更されたロウ
	 * @param column 値が変更された可変カラム
	 */
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column);

}
