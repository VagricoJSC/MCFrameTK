package mcframe.serverMSBC.MSBCL6120;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OutSrcInst_Chk01_SchdPoD"コンテナRowクラスです。<p>
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
 *  	<td>hdr_peg_no</td>
 *  	<td>Header pegging No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>outsrc_itm_ord_no</td>
 *  	<td>Subcontracting item order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_ORD_NO ITM_ORD_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class OutSrcInst_Chk01_SchdPoDR extends OutSrcInst_Chk01_SchdPoDR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OutSrcInst_Chk01_SchdPoDR create() {
		OutSrcInst_Chk01_SchdPoDR row = new OutSrcInst_Chk01_SchdPoDR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OutSrcInst_Chk01_SchdPoDR createByName(T proto) {
		OutSrcInst_Chk01_SchdPoDR row = OutSrcInst_Chk01_SchdPoDR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OutSrcInst_Chk01_SchdPoDR(ConstMetaList<? extends OutSrcInst_Chk01_SchdPoDR> metas) {
		super(metas);
	}
}