package mcframe.serverMABS.MABSL5010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"SlsUpri_Sprt01_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>sls_upri_srv</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>not_err_flg</td>
 *  	<td>No error flg.</td>
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
public class SlsUpri_Sprt01_DtlR extends SlsUpri_Sprt01_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static SlsUpri_Sprt01_DtlR create() {
		SlsUpri_Sprt01_DtlR row = new SlsUpri_Sprt01_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> SlsUpri_Sprt01_DtlR createByName(T proto) {
		SlsUpri_Sprt01_DtlR row = SlsUpri_Sprt01_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public SlsUpri_Sprt01_DtlR(ConstMetaList<? extends SlsUpri_Sprt01_DtlR> metas) {
		super(metas);
	}
}