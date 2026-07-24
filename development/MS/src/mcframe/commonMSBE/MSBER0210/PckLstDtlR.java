package mcframe.commonMSBE.MSBER0210;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"PckLstDtl"コンテナRowクラスです。<p>
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
 *  	<td>t_cont_no</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>t_itm_code</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>t_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>t_net</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>t_grss</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>t_dim</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>cntnr_no_fr</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#CNTNR_NO CNTNR_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>cntnr_no_to</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#CNTNR_NO CNTNR_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>cntnr_no_fr_to</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_CD ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub1_view</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub2_view</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub3_view</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub1_data</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub2_data</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub3_data</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>cntry_org_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CNTRY_CD CNTRY_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>cntry_org_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CNTRY_NM CNTRY_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_int_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_dec_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_NM UNIT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_dec_place</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DEC_PLACE DEC_PLACE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wt_dec_place</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DEC_PLACE DEC_PLACE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>dim_dec_place</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DEC_PLACE DEC_PLACE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>net_wt</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WT WT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_net_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_int_net_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_dec_net_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>grss_wt</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WT WT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_grss_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_int_grss_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_dec_grss_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>dim</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DIM DIM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_dim</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_int_dim</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_dec_dim</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>container</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iv_itm_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_NM ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>iv_itm_alt_nm1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_ALT_NM1 ITM_ALT_NM1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iv_itm_alt_nm2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_ALT_NM2 ITM_ALT_NM2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>iv_itm_alt_nm3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_ALT_NM3 ITM_ALT_NM3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iv_itm_alt_nm4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_ALT_NM4 ITM_ALT_NM4}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>cst_itm_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_ITM_CD BP_ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>cst_itm_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_ITM_NM BP_ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>disp_seq</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DISP_SEQ DISP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pl_d_sub_char1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PL_D_SUB_CHAR1 PL_D_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pl_d_sub_char2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PL_D_SUB_CHAR2 PL_D_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pl_d_sub_char3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PL_D_SUB_CHAR3 PL_D_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>t_total</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sum_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_sum_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>s_int_sum_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_dec_sum_trd_unit_qty</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sum_trd_unit_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_NM UNIT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sum_trd_unit_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sum_net_wt</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WT WT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_sum_net_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sum_grss_wt</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WT WT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_sum_grss_wt</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sum_dim</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DIM DIM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>s_sum_dim</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>f_cntry_org_cd</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CNTRY_CD CNTRY_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>t_made_in</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>f_cntry_org_nm</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CNTRY_NM CNTRY_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>free</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td></td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class PckLstDtlR extends PckLstDtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static PckLstDtlR create() {
		PckLstDtlR row = new PckLstDtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> PckLstDtlR createByName(T proto) {
		PckLstDtlR row = PckLstDtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public PckLstDtlR(ConstMetaList<? extends PckLstDtlR> metas) {
		super(metas);
	}
}