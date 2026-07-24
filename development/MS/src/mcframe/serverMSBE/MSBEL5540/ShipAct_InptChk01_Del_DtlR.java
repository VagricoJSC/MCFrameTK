package mcframe.serverMSBE.MSBEL5540;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ShipAct_InptChk01_Del_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>ship_act_d_no</td>
 *  	<td>Shipping result details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SHIP_ACT_D_NO SHIP_ACT_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class ShipAct_InptChk01_Del_DtlR extends ShipAct_InptChk01_Del_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ShipAct_InptChk01_Del_DtlR create() {
		ShipAct_InptChk01_Del_DtlR row = new ShipAct_InptChk01_Del_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ShipAct_InptChk01_Del_DtlR createByName(T proto) {
		ShipAct_InptChk01_Del_DtlR row = ShipAct_InptChk01_Del_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ShipAct_InptChk01_Del_DtlR(ConstMetaList<? extends ShipAct_InptChk01_Del_DtlR> metas) {
		super(metas);
	}
}