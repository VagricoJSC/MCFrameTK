package mcframe.serverMSBC.MSBCL5080;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"RqmtCrt_Calc01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>ac_cl_day</td>
 *  	<td>Accounting closing day</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CL_DAY CL_DAY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ac_cl_mon_base</td>
 *  	<td>Accounting month basis</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CL_MON_BASE CL_MON_BASE}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class RqmtCrt_Calc01_CndR extends RqmtCrt_Calc01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static RqmtCrt_Calc01_CndR create() {
		RqmtCrt_Calc01_CndR row = new RqmtCrt_Calc01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> RqmtCrt_Calc01_CndR createByName(T proto) {
		RqmtCrt_Calc01_CndR row = RqmtCrt_Calc01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public RqmtCrt_Calc01_CndR(ConstMetaList<? extends RqmtCrt_Calc01_CndR> metas) {
		super(metas);
	}
}