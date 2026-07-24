package mcframe.serverMSBC.MSBCL6050;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"MfgActReg_Upd01_Ctrl"コンテナRowクラスです。<p>
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
 *  	<td>not_io_act_srv_exec_flg</td>
 *  	<td>GR/GI result service call not required</td>
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
public class MfgActReg_Upd01_CtrlR extends MfgActReg_Upd01_CtrlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MfgActReg_Upd01_CtrlR create() {
		MfgActReg_Upd01_CtrlR row = new MfgActReg_Upd01_CtrlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MfgActReg_Upd01_CtrlR createByName(T proto) {
		MfgActReg_Upd01_CtrlR row = MfgActReg_Upd01_CtrlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public MfgActReg_Upd01_CtrlR(ConstMetaList<? extends MfgActReg_Upd01_CtrlR> metas) {
		super(metas);
	}
}