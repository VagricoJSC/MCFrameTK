package mcframe.serverMSBC.MSBCL6060;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"MfgActTblReg_Upd05_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>peg_no</td>
 *  	<td>Pegging No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>data_crud_typ</td>
 *  	<td>Data update type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DATA_CRUD_TYP DATA_CRUD_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_act</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMS.dbc.MST_WK_ACT_R}</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MfgActTblReg_Upd05_DtlR extends MfgActTblReg_Upd05_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MfgActTblReg_Upd05_DtlR create() {
		MfgActTblReg_Upd05_DtlR row = new MfgActTblReg_Upd05_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MfgActTblReg_Upd05_DtlR createByName(T proto) {
		MfgActTblReg_Upd05_DtlR row = MfgActTblReg_Upd05_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public MfgActTblReg_Upd05_DtlR(ConstMetaList<? extends MfgActTblReg_Upd05_DtlR> metas) {
		super(metas);
	}
}