package mcframe.serverMSLA.MSLAL9310;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"OrdSendIf_Itm_Dtl_Bom_Srch01_Rslt"コンテナRowクラスです。<p>
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
 *  	<td>itm_dtl_bom</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R}</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR extends OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR create() {
		OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR row = new OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR createByName(T proto) {
		OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR row = OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR(ConstMetaList<? extends OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> metas) {
		super(metas);
	}
}