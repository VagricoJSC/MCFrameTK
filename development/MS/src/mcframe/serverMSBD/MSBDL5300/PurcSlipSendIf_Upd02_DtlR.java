package mcframe.serverMSBD.MSBDL5300;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PurcSlipSendIf_Upd02_Dtl"コンテナRowクラスです。<p>
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
 *  	<td>data_no</td>
 *  	<td>Data No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_DATA_NO IF_DATA_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PurcSlipSendIf_Upd02_DtlR extends PurcSlipSendIf_Upd02_DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PurcSlipSendIf_Upd02_DtlR create() {
		PurcSlipSendIf_Upd02_DtlR row = new PurcSlipSendIf_Upd02_DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PurcSlipSendIf_Upd02_DtlR createByName(T proto) {
		PurcSlipSendIf_Upd02_DtlR row = PurcSlipSendIf_Upd02_DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PurcSlipSendIf_Upd02_DtlR(ConstMetaList<? extends PurcSlipSendIf_Upd02_DtlR> metas) {
		super(metas);
	}
}