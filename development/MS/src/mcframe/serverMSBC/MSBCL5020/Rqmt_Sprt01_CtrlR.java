package mcframe.serverMSBC.MSBCL5020;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Rqmt_Sprt01_Ctrl"コンテナRowクラスです。<p>
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
 *  	<td>screen_flg</td>
 *  	<td>Screen</td>
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
public class Rqmt_Sprt01_CtrlR extends Rqmt_Sprt01_CtrlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Rqmt_Sprt01_CtrlR create() {
		Rqmt_Sprt01_CtrlR row = new Rqmt_Sprt01_CtrlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Rqmt_Sprt01_CtrlR createByName(T proto) {
		Rqmt_Sprt01_CtrlR row = Rqmt_Sprt01_CtrlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Rqmt_Sprt01_CtrlR(ConstMetaList<? extends Rqmt_Sprt01_CtrlR> metas) {
		super(metas);
	}
}