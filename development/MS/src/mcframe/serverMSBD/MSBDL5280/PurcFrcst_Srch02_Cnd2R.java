package mcframe.serverMSBD.MSBDL5280;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PurcFrcst_Srch02_Cnd2"コンテナRowクラスです。<p>
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
 *  	<td>ym_fr</td>
 *  	<td>Month FROM</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#YM YM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ym_to</td>
 *  	<td>Month TO</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#YM YM}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PurcFrcst_Srch02_Cnd2R extends PurcFrcst_Srch02_Cnd2R_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PurcFrcst_Srch02_Cnd2R create() {
		PurcFrcst_Srch02_Cnd2R row = new PurcFrcst_Srch02_Cnd2R(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PurcFrcst_Srch02_Cnd2R createByName(T proto) {
		PurcFrcst_Srch02_Cnd2R row = PurcFrcst_Srch02_Cnd2R.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PurcFrcst_Srch02_Cnd2R(ConstMetaList<? extends PurcFrcst_Srch02_Cnd2R> metas) {
		super(metas);
	}
}