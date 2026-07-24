package mcframe.serverMSBH.MSBHL0100;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Prnt01_Rslt"コンテナRowクラスです。<p>
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
 *  	<td>pay_act_no</td>
 *  	<td>Payment result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PAY_ACT_NO PAY_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pay_act_seq</td>
 *  	<td>Payment result sequence No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_SEQ SLIP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Prnt01_RsltR extends Prnt01_RsltR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Prnt01_RsltR create() {
		Prnt01_RsltR row = new Prnt01_RsltR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Prnt01_RsltR createByName(T proto) {
		Prnt01_RsltR row = Prnt01_RsltR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Prnt01_RsltR(ConstMetaList<? extends Prnt01_RsltR> metas) {
		super(metas);
	}
}