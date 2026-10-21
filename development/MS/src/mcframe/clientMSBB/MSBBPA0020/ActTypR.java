package mcframe.clientMSBB.MSBBPA0020;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;
//FMCB IMPORT START

//FMCB IMPORT END

/**
 * ブロック"ActTyp"コンテナRowクラスです。<p>
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
 *  	<td>io_act_typ</td>
 *  	<td>GR/GI type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#IO_ACT_TYP IO_ACT_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class ActTypR extends ActTypR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ActTypR create() {
		ActTypR row = new ActTypR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ActTypR createByName(T proto) {
		ActTypR row = ActTypR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public ActTypR(ConstMetaList<? extends ActTypR> metas) {
		super(metas);
	}
//FMCB CUSTOM START

//FMCB CUSTOM END
}