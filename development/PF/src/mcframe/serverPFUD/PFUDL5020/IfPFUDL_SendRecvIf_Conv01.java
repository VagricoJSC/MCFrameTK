package mcframe.serverPFUD.PFUDL5020;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * Conv01オペレーションのインターフェースクラス.<p>
 *
 * <br>
 */
public interface IfPFUDL_SendRecvIf_Conv01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "PF";
	public static final String DEFAULT_LOGIC_ID = "PFUDL5020";
	public static final String DEFAULT_OPERATION_ID = "Conv01";

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
	 * 		<td>if_proc_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>data_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>ext_sys_cd</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> up0();

	/**
	 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[下り第0ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>if_proc_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>data_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>ext_sys_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>sdrv_sts_typ</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverPFUD.PFUDL5020.ConvDtlR> down0();
}

