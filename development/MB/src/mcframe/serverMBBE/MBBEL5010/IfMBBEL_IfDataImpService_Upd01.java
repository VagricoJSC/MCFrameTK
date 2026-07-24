package mcframe.serverMBBE.MBBEL5010;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * Upd01オペレーションのインターフェースクラス.<p>
 *
 * <br>
 */
public interface IfMBBEL_IfDataImpService_Upd01 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "MB";
	public static final String DEFAULT_LOGIC_ID = "MBBEL5010";
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
	 * 		<td>data_lno</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>data_no</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>if_proc_typ</td>
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
	 * 		<td>bp_cd</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see MCList
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0();
	/**
	 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[上り第1ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>exe_unit_lump_flg</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>if_upd_typ</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>src_actlumprecv_flg</td>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><br></td>
	 * 		<td>not_bkf_upd_flg</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1();

	/**
	 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 *  <caption>[下り第0ブロック項目]</caption>
	 * 	<tr bgcolor="#cccccc">
	 *  	<th>必須</th>
	 *  	<th>項目名</th>
	 *  </tr>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	 * 		<td>total_num</td>
	 * 	</tr>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	 * 		<td>ok_num</td>
	 * 	</tr>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	 * 		<td>err_num</td>
	 * 	</tr>
	 * 	<tr bgcolor="#ffccff">
	 * 		<td>*</td>
	 * 		<td>skip_num</td>
	 * 	</tr>
	 * </table>
	 *
	 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0();
}

