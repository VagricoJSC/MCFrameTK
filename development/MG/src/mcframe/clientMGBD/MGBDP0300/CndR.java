package mcframe.clientMGBD.MGBDP0300;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
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
 *  	<td>ope</td>
 *  	<td>CALC_CTG,Copy to other calculation category,tgt_ctg;TERM,Copy to other term,tgt_term;PLN,Copy plan,trg_pln;ACT,Copy result,tgt_act</td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>tab_ctg_typ</td>
 *  	<td>Table category type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#TAB_CTG_TYP TAB_CTG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>tab_ctg_typ_nm</td>
 *  	<td>Table category type name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#TAB_CTG_TYP_NM TAB_CTG_TYP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>cost_copy_typ</td>
 *  	<td>Table name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#COST_COPY_TYP COST_COPY_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>cost_copy_typ_nm</td>
 *  	<td>Table name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#COST_COPY_TYP_NM COST_COPY_TYP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class CndR extends CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static CndR create() {
		CndR row = new CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> CndR createByName(T proto) {
		CndR row = CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public CndR(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}
}