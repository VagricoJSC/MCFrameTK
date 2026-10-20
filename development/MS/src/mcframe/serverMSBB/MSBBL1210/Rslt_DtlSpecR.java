package mcframe.serverMSBB.MSBBL1210;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;
//FMCB IMPORT START

//FMCB IMPORT END

/**
 * ブロック"Rslt_DtlSpec"コンテナRowクラスです。<p>
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
 *  	<td>spec_desc_no</td>
 *  	<td>Sales item specification detail No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SPEC_DESC_NO SPEC_DESC_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sls_itm_spec_no</td>
 *  	<td>Sales item specification No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLS_ITM_SPEC_NO SLS_ITM_SPEC_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sls_itm_no</td>
 *  	<td>Sales item No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLS_ITM_NO SLS_ITM_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>slo_d_no</td>
 *  	<td>Sales order details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLO_D_NO SLO_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>slo_itm_spec_lno</td>
 *  	<td>Specification row No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SPEC_LNO ITM_SPEC_LNO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>slo_itm_comp_lno</td>
 *  	<td>Configuration row No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_COMP_LNO ITM_COMP_LNO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_cd</td>
 *  	<td>Item cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_CD ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_nm</td>
 *  	<td>Item name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_NM ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>spec_cd</td>
 *  	<td>Specification cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SPEC_CD SPEC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>spec_desc_cd</td>
 *  	<td>Specification detail cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SPEC_DESC_CD SPEC_DESC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>rmrks</td>
 *  	<td>Specification detail remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SPEC_DESC_RMRKS SPEC_DESC_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char1</td>
 *  	<td>Spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SPEC_DESC_SUB_CHAR1 SPEC_DESC_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char2</td>
 *  	<td>Spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SPEC_DESC_SUB_CHAR2 SPEC_DESC_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char3</td>
 *  	<td>Spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SPEC_DESC_SUB_CHAR3 SPEC_DESC_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>comp_spec_desc_no</td>
 *  	<td>Sales item configuration specification detail No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#COMP_SPEC_DESC_NO COMP_SPEC_DESC_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Rslt_DtlSpecR extends Rslt_DtlSpecR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Rslt_DtlSpecR create() {
		Rslt_DtlSpecR row = new Rslt_DtlSpecR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Rslt_DtlSpecR createByName(T proto) {
		Rslt_DtlSpecR row = Rslt_DtlSpecR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Rslt_DtlSpecR(ConstMetaList<? extends Rslt_DtlSpecR> metas) {
		super(metas);
	}
//FMCB CUSTOM START

//FMCB CUSTOM END
}