package mcframe.serverMSLA.MSLAL9310;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OrdSendIf_Cal_Srch01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>master_dt</td>
 *  	<td>Master application date</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class OrdSendIf_Cal_Srch01_CndR extends OrdSendIf_Cal_Srch01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OrdSendIf_Cal_Srch01_CndR create() {
		OrdSendIf_Cal_Srch01_CndR row = new OrdSendIf_Cal_Srch01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OrdSendIf_Cal_Srch01_CndR createByName(T proto) {
		OrdSendIf_Cal_Srch01_CndR row = OrdSendIf_Cal_Srch01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OrdSendIf_Cal_Srch01_CndR(ConstMetaList<? extends OrdSendIf_Cal_Srch01_CndR> metas) {
		super(metas);
	}
}