package mcframe.serverMSLA.MSLAL9010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"RcvRecvIf_Upd03_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>alias</th>
 *  	<th>項目名</th>
 *  	<th>フルネーム</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>INNERROW/COLUMNPATH</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>total_num</td>
 *  	<td>Number of processed target</td>
 *  	<td>Number</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ok_num</td>
 *  	<td>Number of entries</td>
 *  	<td>Number</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>err_num</td>
 *  	<td>Error count</td>
 *  	<td>Number</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>skip_num</td>
 *  	<td>Skip count</td>
 *  	<td>Number</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class RcvRecvIf_Upd03_RsltR extends RcvRecvIf_Upd03_RsltR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static RcvRecvIf_Upd03_RsltR create() {
		RcvRecvIf_Upd03_RsltR row = new RcvRecvIf_Upd03_RsltR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> RcvRecvIf_Upd03_RsltR createByName(T proto) {
		RcvRecvIf_Upd03_RsltR row = RcvRecvIf_Upd03_RsltR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public RcvRecvIf_Upd03_RsltR(ConstMetaList<? extends RcvRecvIf_Upd03_RsltR> metas) {
		super(metas);
	}
}