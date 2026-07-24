package mcframe.serverMABC.MABCL1070;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"AutoJnl_DelChk01_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>ac_slip_typ</td>
 *  	<td>Accounting slip type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#AC_SLIP_TYP AC_SLIP_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>auto_jnl_key_cd</td>
 *  	<td>Auto-journal key cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#AUTO_JNL_KEY_CD AUTO_JNL_KEY_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>auto_jnl_grp</td>
 *  	<td>Auto-journal group</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#AUTO_JNL_GRP AUTO_JNL_GRP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>jnl_ptn_cd</td>
 *  	<td>Journal pattern cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#JNL_PTN_CD JNL_PTN_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>upd_cntr</td>
 *  	<td>Update counter</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UPD_CNT UPD_CNT}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class AutoJnl_DelChk01_DtlR extends AutoJnl_DelChk01_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static AutoJnl_DelChk01_DtlR create() {
		AutoJnl_DelChk01_DtlR row = new AutoJnl_DelChk01_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> AutoJnl_DelChk01_DtlR createByName(T proto) {
		AutoJnl_DelChk01_DtlR row = AutoJnl_DelChk01_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public AutoJnl_DelChk01_DtlR(ConstMetaList<? extends AutoJnl_DelChk01_DtlR> metas) {
		super(metas);
	}
}