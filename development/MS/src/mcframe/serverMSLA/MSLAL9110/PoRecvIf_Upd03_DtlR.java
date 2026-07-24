package mcframe.serverMSLA.MSLAL9110;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PoRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>poif</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMS.dbc.MST_PO_RECV_IF_R}</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PoRecvIf_Upd03_DtlR extends PoRecvIf_Upd03_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PoRecvIf_Upd03_DtlR create() {
		PoRecvIf_Upd03_DtlR row = new PoRecvIf_Upd03_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PoRecvIf_Upd03_DtlR createByName(T proto) {
		PoRecvIf_Upd03_DtlR row = PoRecvIf_Upd03_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PoRecvIf_Upd03_DtlR(ConstMetaList<? extends PoRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}
}