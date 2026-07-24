package mcframe.serverMBBE.MBBEL5030;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"RecvExtMst_Chk01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>ext_master_typ</td>
 *  	<td>External master linkage type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_MASTER_TYP EXT_MASTER_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ext_sys_cd</td>
 *  	<td>External system cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_SYS_CD EXT_SYS_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>master_check_dt</td>
 *  	<td>Master check base date</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>err_flg</td>
 *  	<td>Error</td>
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
public class RecvExtMst_Chk01_CndR extends RecvExtMst_Chk01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static RecvExtMst_Chk01_CndR create() {
		RecvExtMst_Chk01_CndR row = new RecvExtMst_Chk01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> RecvExtMst_Chk01_CndR createByName(T proto) {
		RecvExtMst_Chk01_CndR row = RecvExtMst_Chk01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public RecvExtMst_Chk01_CndR(ConstMetaList<? extends RecvExtMst_Chk01_CndR> metas) {
		super(metas);
	}
}