package mcframe.serverMSBE.MSBEL5500;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ShipSchd_Upd03_ActDtl"コンテナRowクラスです。<p>
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
 *  	<td>ship_alloc_sts_no</td>
 *  	<td>Shipping allocation status No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SHIP_ALLOC_STS_NO SHIP_ALLOC_STS_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
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
public class ShipSchd_Upd03_ActDtlR extends ShipSchd_Upd03_ActDtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ShipSchd_Upd03_ActDtlR create() {
		ShipSchd_Upd03_ActDtlR row = new ShipSchd_Upd03_ActDtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ShipSchd_Upd03_ActDtlR createByName(T proto) {
		ShipSchd_Upd03_ActDtlR row = ShipSchd_Upd03_ActDtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ShipSchd_Upd03_ActDtlR(ConstMetaList<? extends ShipSchd_Upd03_ActDtlR> metas) {
		super(metas);
	}
}