package mcframe.serverMSBE.MSBEL5020;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"IoSchd_Del02_Cnd2"コンテナRowクラスです。<p>
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
 *  	<td>io_schd_sts_typ</td>
 *  	<td>GR/GI schedule status type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#IO_SCHD_STS_TYP IO_SCHD_STS_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class IoSchd_Del02_Cnd2R extends IoSchd_Del02_Cnd2R_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static IoSchd_Del02_Cnd2R create() {
		IoSchd_Del02_Cnd2R row = new IoSchd_Del02_Cnd2R(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> IoSchd_Del02_Cnd2R createByName(T proto) {
		IoSchd_Del02_Cnd2R row = IoSchd_Del02_Cnd2R.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public IoSchd_Del02_Cnd2R(ConstMetaList<? extends IoSchd_Del02_Cnd2R> metas) {
		super(metas);
	}
}