package mcframe.serverMSBC.MSBCL5010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Ord_Sprt02_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>inst_exp_flg</td>
 *  	<td>Explode at order</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>get_prov_upri_flg</td>
 *  	<td>Supply unit price acquisition</td>
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
public class Ord_Sprt02_CndR extends Ord_Sprt02_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Ord_Sprt02_CndR create() {
		Ord_Sprt02_CndR row = new Ord_Sprt02_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Ord_Sprt02_CndR createByName(T proto) {
		Ord_Sprt02_CndR row = Ord_Sprt02_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Ord_Sprt02_CndR(ConstMetaList<? extends Ord_Sprt02_CndR> metas) {
		super(metas);
	}
}