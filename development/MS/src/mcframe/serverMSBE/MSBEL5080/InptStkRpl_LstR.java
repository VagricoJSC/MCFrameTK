package mcframe.serverMSBE.MSBEL5080;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"InptStkRpl_Lst"コンテナRowクラスです。<p>
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
 *  	<td>rl</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMS.dbc.MST_INPT_STK_RPL_LST_R}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>rtn_sts_typ</td>
 *  	<td>Process result status type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#RTN_STS_TYP RTN_STS_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class InptStkRpl_LstR extends InptStkRpl_LstR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static InptStkRpl_LstR create() {
		InptStkRpl_LstR row = new InptStkRpl_LstR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> InptStkRpl_LstR createByName(T proto) {
		InptStkRpl_LstR row = InptStkRpl_LstR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public InptStkRpl_LstR(ConstMetaList<? extends InptStkRpl_LstR> metas) {
		super(metas);
	}
}