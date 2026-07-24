package mcframe.serverMSBF.MSBFL0080;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Del01_BulkSet"コンテナRowクラスです。<p>
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
 *  	<td>aprv_rsn</td>
 *  	<td>Approval reason</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PLNT_APRV_RSN PLNT_APRV_RSN}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Del01_BulkSetR extends Del01_BulkSetR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Del01_BulkSetR create() {
		Del01_BulkSetR row = new Del01_BulkSetR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Del01_BulkSetR createByName(T proto) {
		Del01_BulkSetR row = Del01_BulkSetR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Del01_BulkSetR(ConstMetaList<? extends Del01_BulkSetR> metas) {
		super(metas);
	}
}