package mcframe.serverMSBE.MSBEL5220;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"XfrAct_HdrDtl"コンテナRowクラスです。<p>
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
 *  	<td>xauh</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>xaud</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR}</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class XfrAct_HdrDtlR extends XfrAct_HdrDtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static XfrAct_HdrDtlR create() {
		XfrAct_HdrDtlR row = new XfrAct_HdrDtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> XfrAct_HdrDtlR createByName(T proto) {
		XfrAct_HdrDtlR row = XfrAct_HdrDtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public XfrAct_HdrDtlR(ConstMetaList<? extends XfrAct_HdrDtlR> metas) {
		super(metas);
	}
}