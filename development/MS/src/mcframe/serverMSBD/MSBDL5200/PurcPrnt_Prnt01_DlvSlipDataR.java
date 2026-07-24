package mcframe.serverMSBD.MSBDL5200;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PurcPrnt_Prnt01_DlvSlipData"コンテナRowクラスです。<p>
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
 *  	<td>hdr</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.commonMSBE.MSBER0500.DlvSlipHdrR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>dtl</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.commonMSBE.MSBER0500.DlvSlipDtlR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>prov_hdr</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.commonMSBE.MSBER0500.DlvSlipHdrR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>prov_dtl</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.commonMSBE.MSBER0500.DlvSlipDtlR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>outsrc_bp_prnt_lcl_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LCL_CD LCL_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>outsrc_prov_ddlv_flg</td>
 *  	<td><br></td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>outsrc_sundry_itm_flg</td>
 *  	<td><br></td>
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
public class PurcPrnt_Prnt01_DlvSlipDataR extends PurcPrnt_Prnt01_DlvSlipDataR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PurcPrnt_Prnt01_DlvSlipDataR create() {
		PurcPrnt_Prnt01_DlvSlipDataR row = new PurcPrnt_Prnt01_DlvSlipDataR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PurcPrnt_Prnt01_DlvSlipDataR createByName(T proto) {
		PurcPrnt_Prnt01_DlvSlipDataR row = PurcPrnt_Prnt01_DlvSlipDataR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PurcPrnt_Prnt01_DlvSlipDataR(ConstMetaList<? extends PurcPrnt_Prnt01_DlvSlipDataR> metas) {
		super(metas);
	}
}