package mcframe.serverMSBE.MSBEL2610;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Upd02_Ctrl"コンテナRowクラスです。<p>
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
 *  	<td>prnt_flg</td>
 *  	<td>Immediate issue</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>add_io_ctrl_flg</td>
 *  	<td>GR/GI control</td>
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
public class Upd02_CtrlR extends Upd02_CtrlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Upd02_CtrlR create() {
		Upd02_CtrlR row = new Upd02_CtrlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Upd02_CtrlR createByName(T proto) {
		Upd02_CtrlR row = Upd02_CtrlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Upd02_CtrlR(ConstMetaList<? extends Upd02_CtrlR> metas) {
		super(metas);
	}
}