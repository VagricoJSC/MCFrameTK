package mcframe.serverMSBC.MSBCL6120;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OutSrcInst_Upd04_ArrAbort"コンテナRowクラスです。<p>
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
 *  	<td>mfg_inst_no</td>
 *  	<td>Mfg. order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MFG_INST_NO MFG_INST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class OutSrcInst_Upd04_ArrAbortR extends OutSrcInst_Upd04_ArrAbortR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OutSrcInst_Upd04_ArrAbortR create() {
		OutSrcInst_Upd04_ArrAbortR row = new OutSrcInst_Upd04_ArrAbortR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OutSrcInst_Upd04_ArrAbortR createByName(T proto) {
		OutSrcInst_Upd04_ArrAbortR row = OutSrcInst_Upd04_ArrAbortR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OutSrcInst_Upd04_ArrAbortR(ConstMetaList<? extends OutSrcInst_Upd04_ArrAbortR> metas) {
		super(metas);
	}
}