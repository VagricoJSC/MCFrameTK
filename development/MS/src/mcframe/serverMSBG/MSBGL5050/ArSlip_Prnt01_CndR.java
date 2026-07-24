package mcframe.serverMSBG.MSBGL5050;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ArSlip_Prnt01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>indiv_prnt_flg</td>
 *  	<td>Individual issue</td>
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
public class ArSlip_Prnt01_CndR extends ArSlip_Prnt01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ArSlip_Prnt01_CndR create() {
		ArSlip_Prnt01_CndR row = new ArSlip_Prnt01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ArSlip_Prnt01_CndR createByName(T proto) {
		ArSlip_Prnt01_CndR row = ArSlip_Prnt01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ArSlip_Prnt01_CndR(ConstMetaList<? extends ArSlip_Prnt01_CndR> metas) {
		super(metas);
	}
}