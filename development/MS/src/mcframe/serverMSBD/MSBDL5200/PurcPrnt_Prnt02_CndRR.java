package mcframe.serverMSBD.MSBDL5200;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PurcPrnt_Prnt02_CndR"コンテナRowクラスです。<p>
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
public class PurcPrnt_Prnt02_CndRR extends PurcPrnt_Prnt02_CndRR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PurcPrnt_Prnt02_CndRR create() {
		PurcPrnt_Prnt02_CndRR row = new PurcPrnt_Prnt02_CndRR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PurcPrnt_Prnt02_CndRR createByName(T proto) {
		PurcPrnt_Prnt02_CndRR row = PurcPrnt_Prnt02_CndRR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PurcPrnt_Prnt02_CndRR(ConstMetaList<? extends PurcPrnt_Prnt02_CndRR> metas) {
		super(metas);
	}
}