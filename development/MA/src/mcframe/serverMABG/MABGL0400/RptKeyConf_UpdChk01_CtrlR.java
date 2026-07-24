package mcframe.serverMABG.MABGL0400;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"RptKeyConf_UpdChk01_Ctrl"コンテナRowクラスです。<p>
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
 *  	<td>itm_grp_typ</td>
 *  	<td>Item classification type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_GRP_TYP ITM_GRP_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class RptKeyConf_UpdChk01_CtrlR extends RptKeyConf_UpdChk01_CtrlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static RptKeyConf_UpdChk01_CtrlR create() {
		RptKeyConf_UpdChk01_CtrlR row = new RptKeyConf_UpdChk01_CtrlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> RptKeyConf_UpdChk01_CtrlR createByName(T proto) {
		RptKeyConf_UpdChk01_CtrlR row = RptKeyConf_UpdChk01_CtrlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public RptKeyConf_UpdChk01_CtrlR(ConstMetaList<? extends RptKeyConf_UpdChk01_CtrlR> metas) {
		super(metas);
	}
}