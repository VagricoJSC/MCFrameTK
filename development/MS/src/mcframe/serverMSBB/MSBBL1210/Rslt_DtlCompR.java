package mcframe.serverMSBB.MSBBL1210;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;
//FMCB IMPORT START

//FMCB IMPORT END

/**
 * ブロック"Rslt_DtlComp"コンテナRowクラスです。<p>
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
 *  	<td>slo_itm_comp_no</td>
 *  	<td>Sales order item configuration No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLO_ITM_COMP_NO SLO_ITM_COMP_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sls_itm_no</td>
 *  	<td>Sales item No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLS_ITM_NO SLS_ITM_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sls_itm_comp_no</td>
 *  	<td>Sales item configuration No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLS_ITM_COMP_NO SLS_ITM_COMP_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>slo_itm_comp_lno</td>
 *  	<td>Item configuration row No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_COMP_LNO ITM_COMP_LNO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>slo_d_no</td>
 *  	<td>Sales order details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLO_D_NO SLO_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>qtn_d_no</td>
 *  	<td>Quotation details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTN_D_NO QTN_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>qtn_itm_comp_no</td>
 *  	<td>Quotation item configuration No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTN_ITM_COMP_NO QTN_ITM_COMP_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>core_itm_flg</td>
 *  	<td>Main item</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
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
 *  	<td>itm_sub1</td>
 *  	<td>Branch No. 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub2</td>
 *  	<td>Branch No. 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub3</td>
 *  	<td>Branch No. 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_nm</td>
 *  	<td>Item name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_NM ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_cd</td>
 *  	<td>Transaction unit cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_qty</td>
 *  	<td>Transaction unit qty.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_cur_upri</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>std_cost</td>
 *  	<td>Standard cost unit price</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mst_flg</td>
 *  	<td>Master reference</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>std_comp_flg</td>
 *  	<td>Standard structure</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>slo_comp_rmrks</td>
 *  	<td>Sales order configuration remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#ITM_COMP_RMRKS ITM_COMP_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>slo_comp_sub_char1</td>
 *  	<td>Sales order configuration spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR1 SLS_ITM_COMP_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>slo_comp_sub_char2</td>
 *  	<td>Sales order configuration spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR2 SLS_ITM_COMP_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>slo_comp_sub_char3</td>
 *  	<td>Sales order configuration spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR3 SLS_ITM_COMP_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>qtn_comp_rmrks</td>
 *  	<td>Quotation terms remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#ITM_COMP_RMRKS ITM_COMP_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>qtn_comp_sub_char1</td>
 *  	<td>Quotation configuration spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR1 SLS_ITM_COMP_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>qtn_comp_sub_char2</td>
 *  	<td>Quotation configuration spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR2 SLS_ITM_COMP_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>qtn_comp_sub_char3</td>
 *  	<td>Quotation configuration spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR3 SLS_ITM_COMP_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>rmrks</td>
 *  	<td>Configuration remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#ITM_COMP_RMRKS ITM_COMP_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char1</td>
 *  	<td>Configuration spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR1 SLS_ITM_COMP_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char2</td>
 *  	<td>Configuration spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR2 SLS_ITM_COMP_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char3</td>
 *  	<td>Configuration spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#SLS_ITM_COMP_SUB_CHAR3 SLS_ITM_COMP_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Rslt_DtlCompR extends Rslt_DtlCompR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Rslt_DtlCompR create() {
		Rslt_DtlCompR row = new Rslt_DtlCompR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Rslt_DtlCompR createByName(T proto) {
		Rslt_DtlCompR row = Rslt_DtlCompR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Rslt_DtlCompR(ConstMetaList<? extends Rslt_DtlCompR> metas) {
		super(metas);
	}
//FMCB CUSTOM START

//FMCB CUSTOM END
}