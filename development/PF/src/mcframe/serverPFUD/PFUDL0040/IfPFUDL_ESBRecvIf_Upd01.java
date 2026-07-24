package mcframe.serverPFUD.PFUDL0040;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * Upd01オペレーションのインターフェースクラス.<p>
 *
 * <br>
 */
public interface IfPFUDL_ESBRecvIf_Upd01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "PF";
	public static final String DEFAULT_LOGIC_ID = "PFUDL0040";
	public static final String DEFAULT_OPERATION_ID = "Upd01";

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
	 * 		<td>data_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>ext_data_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>ext_sys_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>if_proc_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>bp_cd</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0();

}

