package mcframe.serverMAUD.MAUDL5010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;

public interface IfBizDatDLer {

	/**
	 * 出力内容を追加します。
	 */
	abstract public void append(MCList<? extends MCRow> list);

	/**
	 * ファイルを作成します。
	 */
	abstract public void out();

}
