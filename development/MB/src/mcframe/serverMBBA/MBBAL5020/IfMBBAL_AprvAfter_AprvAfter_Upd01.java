package mcframe.serverMBBA.MBBAL5020;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * AprvAfter_Upd01オペレーションのインターフェースクラス.<p>
 *
 * 承認後処理のインターフェースとして機能する。<br>
 */
public interface IfMBBAL_AprvAfter_AprvAfter_Upd01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "MB";
	public static final String DEFAULT_LOGIC_ID = "MBBAL5020";
	public static final String DEFAULT_OPERATION_ID = "AprvAfter_Upd01";

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
	 * 		<td>aprv_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>aprv_sts_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>old_aprv_sts_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>last_aprv_usr_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>last_aprv_tm</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_itm_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_itm_sub1</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_itm_sub2</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_itm_sub3</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_dpt_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_bp_cd</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_cur_cd1</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_amt1</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_cur_cd2</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_amt2</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_cur_cd3</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_amt3</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_ext_key1</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_ext_key2</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_ext_key3</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>aprv_src_no1</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>aprv_src_no2</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0();

}

