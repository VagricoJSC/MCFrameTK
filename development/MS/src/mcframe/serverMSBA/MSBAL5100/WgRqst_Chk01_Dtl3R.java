package mcframe.serverMSBA.MSBAL5100;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"WgRqst_Chk01_Dtl3"コンテナRowクラスです。<p>
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
 *  	<td>xfrSchdChk04</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR}</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class WgRqst_Chk01_Dtl3R extends WgRqst_Chk01_Dtl3R_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static WgRqst_Chk01_Dtl3R create() {
		WgRqst_Chk01_Dtl3R row = new WgRqst_Chk01_Dtl3R(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> WgRqst_Chk01_Dtl3R createByName(T proto) {
		WgRqst_Chk01_Dtl3R row = WgRqst_Chk01_Dtl3R.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public WgRqst_Chk01_Dtl3R(ConstMetaList<? extends WgRqst_Chk01_Dtl3R> metas) {
		super(metas);
	}
}