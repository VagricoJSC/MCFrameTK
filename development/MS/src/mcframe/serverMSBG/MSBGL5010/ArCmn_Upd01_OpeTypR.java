package mcframe.serverMSBG.MSBGL5010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"ArCmn_Upd01_OpeTyp"コンテナRowクラスです。<p>
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
 *  	<td>ar_ope_typ</td>
 *  	<td>AR update processing type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#AR_OPE_TYP AR_OPE_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class ArCmn_Upd01_OpeTypR extends ArCmn_Upd01_OpeTypR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ArCmn_Upd01_OpeTypR create() {
		ArCmn_Upd01_OpeTypR row = new ArCmn_Upd01_OpeTypR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ArCmn_Upd01_OpeTypR createByName(T proto) {
		ArCmn_Upd01_OpeTypR row = ArCmn_Upd01_OpeTypR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ArCmn_Upd01_OpeTypR(ConstMetaList<? extends ArCmn_Upd01_OpeTypR> metas) {
		super(metas);
	}
}