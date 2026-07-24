package mcframe.serverMAUC.MAUCL1100;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * Check01オペレーションのインターフェースクラス.<p>
 *
 * <br>
 */
public interface IfMAUCL_CheckUtil_Check01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "MA";
	public static final String DEFAULT_LOGIC_ID = "MAUCL1100";
	public static final String DEFAULT_OPERATION_ID = "Check01";

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
	 * 		<td>term</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>alc_ptn_cd</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverMAUC.MAUCL1100.Check01_DtlR> up0();

}

