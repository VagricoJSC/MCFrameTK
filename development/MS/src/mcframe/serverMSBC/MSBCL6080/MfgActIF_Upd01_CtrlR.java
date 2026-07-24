package mcframe.serverMSBC.MSBCL6080;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"MfgActIF_Upd01_Ctrl"コンテナRowクラスです。<p>
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
 *  	<td>if_upd_typ</td>
 *  	<td>IF update type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_UPD_TYP IF_UPD_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>upd_cntr_chk_flg</td>
 *  	<td>Check for update counter</td>
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
public class MfgActIF_Upd01_CtrlR extends MfgActIF_Upd01_CtrlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MfgActIF_Upd01_CtrlR create() {
		MfgActIF_Upd01_CtrlR row = new MfgActIF_Upd01_CtrlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MfgActIF_Upd01_CtrlR createByName(T proto) {
		MfgActIF_Upd01_CtrlR row = MfgActIF_Upd01_CtrlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public MfgActIF_Upd01_CtrlR(ConstMetaList<? extends MfgActIF_Upd01_CtrlR> metas) {
		super(metas);
	}
}