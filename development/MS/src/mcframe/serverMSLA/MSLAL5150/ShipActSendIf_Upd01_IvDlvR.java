package mcframe.serverMSLA.MSLAL5150;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ShipActSendIf_Upd01_IvDlv"コンテナRowクラスです。<p>
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
 *  	<td>dlv_slip_d_no</td>
 *  	<td>Delivery note details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DLV_SLIP_D_NO DLV_SLIP_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>iv_d_no</td>
 *  	<td>Invoice details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IV_D_NO IV_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iv_no</td>
 *  	<td>Invoice No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IV_NO IV_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class ShipActSendIf_Upd01_IvDlvR extends ShipActSendIf_Upd01_IvDlvR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ShipActSendIf_Upd01_IvDlvR create() {
		ShipActSendIf_Upd01_IvDlvR row = new ShipActSendIf_Upd01_IvDlvR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ShipActSendIf_Upd01_IvDlvR createByName(T proto) {
		ShipActSendIf_Upd01_IvDlvR row = ShipActSendIf_Upd01_IvDlvR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ShipActSendIf_Upd01_IvDlvR(ConstMetaList<? extends ShipActSendIf_Upd01_IvDlvR> metas) {
		super(metas);
	}
}