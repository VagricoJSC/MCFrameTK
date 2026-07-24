package mcframe.serverMGBD.MGBDL0310;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>calc_grp_cd</td>
 *  	<td>Calculation group cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CALC_GRP_CD CALC_GRP_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>calc_grp_nm</td>
 *  	<td>Calculation group name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CALC_GRP_NM CALC_GRP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>batch_typ</td>
 *  	<td>Cost batch type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_TYP BATCH_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>batch_typ_nm</td>
 *  	<td>Cost batch type name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_TYP_NM BATCH_TYP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>rmrks</td>
 *  	<td>Remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_OUT_RMRKS BATCH_OUT_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char1</td>
 *  	<td>Spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_OUT_SUB_CHAR1 BATCH_OUT_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char2</td>
 *  	<td>Spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_OUT_SUB_CHAR2 BATCH_OUT_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char3</td>
 *  	<td>Spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#BATCH_OUT_SUB_CHAR3 BATCH_OUT_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Srch01_CndR extends Srch01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Srch01_CndR create() {
		Srch01_CndR row = new Srch01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Srch01_CndR createByName(T proto) {
		Srch01_CndR row = Srch01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Srch01_CndR(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}
}