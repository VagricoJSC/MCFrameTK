package mcframe.serverMSLA.MSLAL9210;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OrdRecvIf_Upd03_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>ordif</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMS.dbc.MST_ORDER_RECV_IF_R}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>if_scheduler_typ</td>
 *  	<td>Linkage scheduler type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#IF_SCHEDULER_TYP IF_SCHEDULER_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>allow_outsrc_schd_flg</td>
 *  	<td>Allow subcontracting scheduling flg.</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class OrdRecvIf_Upd03_DtlR extends OrdRecvIf_Upd03_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OrdRecvIf_Upd03_DtlR create() {
		OrdRecvIf_Upd03_DtlR row = new OrdRecvIf_Upd03_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OrdRecvIf_Upd03_DtlR createByName(T proto) {
		OrdRecvIf_Upd03_DtlR row = OrdRecvIf_Upd03_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OrdRecvIf_Upd03_DtlR(ConstMetaList<? extends OrdRecvIf_Upd03_DtlR> metas) {
		super(metas);
	}
}