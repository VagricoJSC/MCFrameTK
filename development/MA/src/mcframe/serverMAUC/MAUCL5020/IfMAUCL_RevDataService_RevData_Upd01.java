package mcframe.serverMAUC.MAUCL5020;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * RevData_Upd01オペレーションのインターフェースクラス.<p>
 *
 * 改訂履歴データを更新する処理が実装するインターフェースを定義する<br>
 */
public interface IfMAUCL_RevDataService_RevData_Upd01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "MA";
	public static final String DEFAULT_LOGIC_ID = "MAUCL5020";
	public static final String DEFAULT_OPERATION_ID = "RevData_Upd01";

	public MCContainer up(int i);

	public MCContainer down(int i);

	//-------------------------外部 I/F--------------------------
	/**
	 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[上り第0ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>rev_data_src_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>rev_no</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0();

}

