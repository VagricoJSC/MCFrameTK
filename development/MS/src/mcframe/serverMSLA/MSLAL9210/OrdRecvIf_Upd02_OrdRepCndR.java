package mcframe.serverMSLA.MSLAL9210;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OrdRecvIf_Upd02_OrdRepCnd"コンテナRowクラスです。<p>
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
 *  	<td>ord_rep_flg</td>
 *  	<td>Planned order refresh flg.</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>loc_cd</td>
 *  	<td>Location cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOC_CD LOC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>if_scheduler_typ</td>
 *  	<td>Linkage scheduler type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#IF_SCHEDULER_TYP IF_SCHEDULER_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>allow_outsrc_schd_flg</td>
 *  	<td>Allow subcontracting scheduling flg.</td>
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
public class OrdRecvIf_Upd02_OrdRepCndR extends OrdRecvIf_Upd02_OrdRepCndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OrdRecvIf_Upd02_OrdRepCndR create() {
		OrdRecvIf_Upd02_OrdRepCndR row = new OrdRecvIf_Upd02_OrdRepCndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OrdRecvIf_Upd02_OrdRepCndR createByName(T proto) {
		OrdRecvIf_Upd02_OrdRepCndR row = OrdRecvIf_Upd02_OrdRepCndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OrdRecvIf_Upd02_OrdRepCndR(ConstMetaList<? extends OrdRecvIf_Upd02_OrdRepCndR> metas) {
		super(metas);
	}
}