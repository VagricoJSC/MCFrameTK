package mcframe.serverMSLA.MSLAL5150;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ShipActSendIf_Upd01_Dlv"コンテナRowクラスです。<p>
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
 *  	<td>dlv_slip_no</td>
 *  	<td>Delivery note No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DLV_SLIP_NO DLV_SLIP_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>upded_flg</td>
 *  	<td>Entered</td>
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
public class ShipActSendIf_Upd01_DlvR extends ShipActSendIf_Upd01_DlvR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ShipActSendIf_Upd01_DlvR create() {
		ShipActSendIf_Upd01_DlvR row = new ShipActSendIf_Upd01_DlvR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ShipActSendIf_Upd01_DlvR createByName(T proto) {
		ShipActSendIf_Upd01_DlvR row = ShipActSendIf_Upd01_DlvR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ShipActSendIf_Upd01_DlvR(ConstMetaList<? extends ShipActSendIf_Upd01_DlvR> metas) {
		super(metas);
	}
}