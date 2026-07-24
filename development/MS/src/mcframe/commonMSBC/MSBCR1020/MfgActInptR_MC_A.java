package mcframe.commonMSBC.MSBCR1020;

import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"MfgActInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActInptR_MC_A extends MCConstRow {

	/**
	 *  投入品目.<p>
	 *
	 */
	public static final String $inpt_act_itm_cd = "inpt_act_itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub1_view = "inpt_act_itm_sub1_view";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub2_view = "inpt_act_itm_sub2_view";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub3_view = "inpt_act_itm_sub3_view";
	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub1_data = "inpt_act_itm_sub1_data";
	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub2_data = "inpt_act_itm_sub2_data";
	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public static final String $inpt_act_itm_sub3_data = "inpt_act_itm_sub3_data";
	/**
	 *  投入品名.<p>
	 *
	 */
	public static final String $inpt_act_itm_nm = "inpt_act_itm_nm";
	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public static final String $inpt_itm_alt_nm1 = "inpt_itm_alt_nm1";
	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public static final String $inpt_itm_alt_nm2 = "inpt_itm_alt_nm2";
	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public static final String $inpt_itm_alt_nm3 = "inpt_itm_alt_nm3";
	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public static final String $inpt_itm_alt_nm4 = "inpt_itm_alt_nm4";
	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 *  代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $inpt_sno1_view = "inpt_sno1_view";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $inpt_sno2_view = "inpt_sno2_view";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $inpt_sno3_view = "inpt_sno3_view";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $inpt_sno4_view = "inpt_sno4_view";
	/**
	 *  手配ＮＯ１(データ用).<p>
	 *
	 */
	public static final String $inpt_sno1_data = "inpt_sno1_data";
	/**
	 *  手配ＮＯ２(データ用).<p>
	 *
	 */
	public static final String $inpt_sno2_data = "inpt_sno2_data";
	/**
	 *  手配ＮＯ３(データ用).<p>
	 *
	 */
	public static final String $inpt_sno3_data = "inpt_sno3_data";
	/**
	 *  手配ＮＯ４(データ用).<p>
	 *
	 */
	public static final String $inpt_sno4_data = "inpt_sno4_data";
	/**
	 *  ロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public static final String $inpt_act_lot_no_view = "inpt_act_lot_no_view";
	/**
	 *  ロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public static final String $inpt_act_lot_no_data = "inpt_act_lot_no_data";
	/**
	 *  サブロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public static final String $inpt_act_sublot_no_view = "inpt_act_sublot_no_view";
	/**
	 *  サブロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public static final String $inpt_act_sublot_no_data = "inpt_act_sublot_no_data";
	/**
	 *  投入予定数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_schd_qty = "base_unit_inpt_schd_qty";
	/**
	 *  投入予定数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_schd_qty = "s_int_base_unit_inpt_schd_qty";
	/**
	 *  投入予定数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_schd_qty = "s_dec_base_unit_inpt_schd_qty";
	/**
	 *  投入必要数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_rqmt_qty = "base_unit_inpt_rqmt_qty";
	/**
	 *  投入必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_rqmt_qty = "s_int_base_unit_inpt_rqmt_qty";
	/**
	 *  投入必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_rqmt_qty = "s_dec_base_unit_inpt_rqmt_qty";
	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_fxd_rqmt_qty = "base_unit_inpt_fxd_rqmt_qty";
	/**
	 *  投入固定必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_fxd_rqmt_qty = "s_int_base_unit_inpt_fxd_rqmt_qty";
	/**
	 *  投入固定必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_fxd_rqmt_qty = "s_dec_base_unit_inpt_fxd_rqmt_qty";
	/**
	 *  投入実績数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_act_qty = "base_unit_inpt_act_qty";
	/**
	 *  投入実績数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_act_qty = "s_int_base_unit_inpt_act_qty";
	/**
	 *  投入実績数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_act_qty = "s_dec_base_unit_inpt_act_qty";
	/**
	 *  ロス実績数.<p>
	 *
	 */
	public static final String $base_unit_loss_qty = "base_unit_loss_qty";
	/**
	 *  ロス実績数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_loss_qty = "s_int_base_unit_loss_qty";
	/**
	 *  ロス実績数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_loss_qty = "s_dec_base_unit_loss_qty";
	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public static final String $base_unit_fxd_loss_qty = "base_unit_fxd_loss_qty";
	/**
	 *  固定ロス実績数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_fxd_loss_qty = "s_int_base_unit_fxd_loss_qty";
	/**
	 *  固定ロス実績数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_fxd_loss_qty = "s_dec_base_unit_fxd_loss_qty";
	/**
	 *  指図有効成分(投入予定)（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_inpt_qty = "left_cont_inpt_qty";
	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 *  指図有効成分(投入予定)文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_inpt_qty = "s_int_cont_inpt_qty";
	/**
	 *  指図有効成分(投入予定)文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_inpt_qty = "s_dec_cont_inpt_qty";
	/**
	 *  指図有効成分(投入予定)（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_inpt_qty = "right_cont_inpt_qty";
	/**
	 *  指図有効成分(投入必要)（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_inpt_rqmt_qty = "left_cont_inpt_rqmt_qty";
	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public static final String $cont_inpt_rqmt_qty = "cont_inpt_rqmt_qty";
	/**
	 *  指図有効成分(投入必要)文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_inpt_rqmt_qty = "s_int_cont_inpt_rqmt_qty";
	/**
	 *  指図有効成分(投入必要)文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_inpt_rqmt_qty = "s_dec_cont_inpt_rqmt_qty";
	/**
	 *  指図有効成分(投入必要)（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_inpt_rqmt_qty = "right_cont_inpt_rqmt_qty";
	/**
	 *  指図有効成分(投入固定必要)（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_inpt_fxd_rqmt_qty = "left_cont_inpt_fxd_rqmt_qty";
	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public static final String $cont_inpt_fxd_rqmt_qty = "cont_inpt_fxd_rqmt_qty";
	/**
	 *  指図有効成分(投入固定必要)文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_inpt_fxd_rqmt_qty = "s_int_cont_inpt_fxd_rqmt_qty";
	/**
	 *  指図有効成分(投入固定必要)文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_inpt_fxd_rqmt_qty = "s_dec_cont_inpt_fxd_rqmt_qty";
	/**
	 *  指図有効成分(投入固定必要)（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_inpt_fxd_rqmt_qty = "right_cont_inpt_fxd_rqmt_qty";
	/**
	 *  投入有効成分（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_qty = "left_cont_qty";
	/**
	 *  投入有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 *  投入有効成分文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_qty = "s_int_cont_qty";
	/**
	 *  投入有効成分文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_qty = "s_dec_cont_qty";
	/**
	 *  投入有効成分（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_qty = "right_cont_qty";
	/**
	 *  ロス有効成分（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_loss_qty = "left_cont_loss_qty";
	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public static final String $cont_loss_qty = "cont_loss_qty";
	/**
	 *  ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_loss_qty = "s_int_cont_loss_qty";
	/**
	 *  ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_loss_qty = "s_dec_cont_loss_qty";
	/**
	 *  ロス有効成分（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_loss_qty = "right_cont_loss_qty";
	/**
	 *  固定ロス有効成分（左括弧）.<p>
	 *
	 */
	public static final String $left_cont_fxd_loss_qty = "left_cont_fxd_loss_qty";
	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public static final String $cont_fxd_loss_qty = "cont_fxd_loss_qty";
	/**
	 *  固定ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_fxd_loss_qty = "s_int_cont_fxd_loss_qty";
	/**
	 *  固定ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_fxd_loss_qty = "s_dec_cont_fxd_loss_qty";
	/**
	 *  固定ロス有効成分（右括弧）.<p>
	 *
	 */
	public static final String $right_cont_fxd_loss_qty = "right_cont_fxd_loss_qty";
	/**
	 *  投入単位名（投入予定・実績数）.<p>
	 *
	 */
	public static final String $inpt_unit_nm = "inpt_unit_nm";
	/**
	 *  投入単位名（左括弧）.<p>
	 *
	 */
	public static final String $left_unit = "left_unit";
	/**
	 *  投入単位名（有効成分）.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 *  投入単位名（右括弧）.<p>
	 *
	 */
	public static final String $right_unit = "right_unit";
	/**
	 *  投入実績備考.<p>
	 *
	 */
	public static final String $inpt_act_rpt_rmrks = "inpt_act_rpt_rmrks";
	/**
	 *  投入実績日.<p>
	 *
	 */
	public static final String $inpt_act_dt = "inpt_act_dt";
	/**
	 *  投入実績時刻.<p>
	 *
	 */
	public static final String $inpt_act_hm = "inpt_act_hm";
	/**
	 *  投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 *  投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  投入実績予備１.<p>
	 *
	 */
	public static final String $inpt_act_sub_char1 = "inpt_act_sub_char1";
	/**
	 *  投入実績予備２.<p>
	 *
	 */
	public static final String $inpt_act_sub_char2 = "inpt_act_sub_char2";
	/**
	 *  投入実績予備３.<p>
	 *
	 */
	public static final String $inpt_act_sub_char3 = "inpt_act_sub_char3";


	public static final MCMeta inpt_act_itm_cd_META = createCommonMeta($inpt_act_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta inpt_act_itm_sub1_view_META = createCommonMeta($inpt_act_itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta inpt_act_itm_sub2_view_META = createCommonMeta($inpt_act_itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta inpt_act_itm_sub3_view_META = createCommonMeta($inpt_act_itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta inpt_act_itm_sub1_data_META = createCommonMeta($inpt_act_itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta inpt_act_itm_sub2_data_META = createCommonMeta($inpt_act_itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta inpt_act_itm_sub3_data_META = createCommonMeta($inpt_act_itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta inpt_act_itm_nm_META = createCommonMeta($inpt_act_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta inpt_itm_alt_nm1_META = createCommonMeta($inpt_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta inpt_itm_alt_nm2_META = createCommonMeta($inpt_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta inpt_itm_alt_nm3_META = createCommonMeta($inpt_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta inpt_itm_alt_nm4_META = createCommonMeta($inpt_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta inpt_sno1_view_META = createCommonMeta($inpt_sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta inpt_sno2_view_META = createCommonMeta($inpt_sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta inpt_sno3_view_META = createCommonMeta($inpt_sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta inpt_sno4_view_META = createCommonMeta($inpt_sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inpt_sno1_data_META = createCommonMeta($inpt_sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta inpt_sno2_data_META = createCommonMeta($inpt_sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta inpt_sno3_data_META = createCommonMeta($inpt_sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta inpt_sno4_data_META = createCommonMeta($inpt_sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inpt_act_lot_no_view_META = createCommonMeta($inpt_act_lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inpt_act_lot_no_data_META = createCommonMeta($inpt_act_lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inpt_act_sublot_no_view_META = createCommonMeta($inpt_act_sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta inpt_act_sublot_no_data_META = createCommonMeta($inpt_act_sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_inpt_schd_qty_META = createCommonMeta($base_unit_inpt_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_schd_qty_META = createStringMeta($s_int_base_unit_inpt_schd_qty);
	public static final MCMeta s_dec_base_unit_inpt_schd_qty_META = createStringMeta($s_dec_base_unit_inpt_schd_qty);
	public static final MCMeta base_unit_inpt_rqmt_qty_META = createCommonMeta($base_unit_inpt_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_rqmt_qty_META = createStringMeta($s_int_base_unit_inpt_rqmt_qty);
	public static final MCMeta s_dec_base_unit_inpt_rqmt_qty_META = createStringMeta($s_dec_base_unit_inpt_rqmt_qty);
	public static final MCMeta base_unit_inpt_fxd_rqmt_qty_META = createCommonMeta($base_unit_inpt_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_fxd_rqmt_qty_META = createStringMeta($s_int_base_unit_inpt_fxd_rqmt_qty);
	public static final MCMeta s_dec_base_unit_inpt_fxd_rqmt_qty_META = createStringMeta($s_dec_base_unit_inpt_fxd_rqmt_qty);
	public static final MCMeta base_unit_inpt_act_qty_META = createCommonMeta($base_unit_inpt_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_act_qty_META = createStringMeta($s_int_base_unit_inpt_act_qty);
	public static final MCMeta s_dec_base_unit_inpt_act_qty_META = createStringMeta($s_dec_base_unit_inpt_act_qty);
	public static final MCMeta base_unit_loss_qty_META = createCommonMeta($base_unit_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_loss_qty_META = createStringMeta($s_int_base_unit_loss_qty);
	public static final MCMeta s_dec_base_unit_loss_qty_META = createStringMeta($s_dec_base_unit_loss_qty);
	public static final MCMeta base_unit_fxd_loss_qty_META = createCommonMeta($base_unit_fxd_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_fxd_loss_qty_META = createStringMeta($s_int_base_unit_fxd_loss_qty);
	public static final MCMeta s_dec_base_unit_fxd_loss_qty_META = createStringMeta($s_dec_base_unit_fxd_loss_qty);
	public static final MCMeta left_cont_inpt_qty_META = createStringMeta($left_cont_inpt_qty);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_inpt_qty_META = createStringMeta($s_int_cont_inpt_qty);
	public static final MCMeta s_dec_cont_inpt_qty_META = createStringMeta($s_dec_cont_inpt_qty);
	public static final MCMeta right_cont_inpt_qty_META = createStringMeta($right_cont_inpt_qty);
	public static final MCMeta left_cont_inpt_rqmt_qty_META = createStringMeta($left_cont_inpt_rqmt_qty);
	public static final MCMeta cont_inpt_rqmt_qty_META = createCommonMeta($cont_inpt_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_inpt_rqmt_qty_META = createStringMeta($s_int_cont_inpt_rqmt_qty);
	public static final MCMeta s_dec_cont_inpt_rqmt_qty_META = createStringMeta($s_dec_cont_inpt_rqmt_qty);
	public static final MCMeta right_cont_inpt_rqmt_qty_META = createStringMeta($right_cont_inpt_rqmt_qty);
	public static final MCMeta left_cont_inpt_fxd_rqmt_qty_META = createStringMeta($left_cont_inpt_fxd_rqmt_qty);
	public static final MCMeta cont_inpt_fxd_rqmt_qty_META = createCommonMeta($cont_inpt_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_inpt_fxd_rqmt_qty_META = createStringMeta($s_int_cont_inpt_fxd_rqmt_qty);
	public static final MCMeta s_dec_cont_inpt_fxd_rqmt_qty_META = createStringMeta($s_dec_cont_inpt_fxd_rqmt_qty);
	public static final MCMeta right_cont_inpt_fxd_rqmt_qty_META = createStringMeta($right_cont_inpt_fxd_rqmt_qty);
	public static final MCMeta left_cont_qty_META = createStringMeta($left_cont_qty);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_qty_META = createStringMeta($s_int_cont_qty);
	public static final MCMeta s_dec_cont_qty_META = createStringMeta($s_dec_cont_qty);
	public static final MCMeta right_cont_qty_META = createStringMeta($right_cont_qty);
	public static final MCMeta left_cont_loss_qty_META = createStringMeta($left_cont_loss_qty);
	public static final MCMeta cont_loss_qty_META = createCommonMeta($cont_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_loss_qty_META = createStringMeta($s_int_cont_loss_qty);
	public static final MCMeta s_dec_cont_loss_qty_META = createStringMeta($s_dec_cont_loss_qty);
	public static final MCMeta right_cont_loss_qty_META = createStringMeta($right_cont_loss_qty);
	public static final MCMeta left_cont_fxd_loss_qty_META = createStringMeta($left_cont_fxd_loss_qty);
	public static final MCMeta cont_fxd_loss_qty_META = createCommonMeta($cont_fxd_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_fxd_loss_qty_META = createStringMeta($s_int_cont_fxd_loss_qty);
	public static final MCMeta s_dec_cont_fxd_loss_qty_META = createStringMeta($s_dec_cont_fxd_loss_qty);
	public static final MCMeta right_cont_fxd_loss_qty_META = createStringMeta($right_cont_fxd_loss_qty);
	public static final MCMeta inpt_unit_nm_META = createCommonMeta($inpt_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta left_unit_META = createStringMeta($left_unit);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta right_unit_META = createStringMeta($right_unit);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta inpt_act_dt_META = createCommonMeta($inpt_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_act_hm_META = createCommonMeta($inpt_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta inpt_act_sub_char1_META = createCommonMeta($inpt_act_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta inpt_act_sub_char2_META = createCommonMeta($inpt_act_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta inpt_act_sub_char3_META = createCommonMeta($inpt_act_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);

	protected static final ConstMetaList<MfgActInptR> constMetas = new ConstMetaList<MfgActInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_act_itm_cd_META,
			inpt_act_itm_sub1_view_META,
			inpt_act_itm_sub2_view_META,
			inpt_act_itm_sub3_view_META,
			inpt_act_itm_sub1_data_META,
			inpt_act_itm_sub2_data_META,
			inpt_act_itm_sub3_data_META,
			inpt_act_itm_nm_META,
			inpt_itm_alt_nm1_META,
			inpt_itm_alt_nm2_META,
			inpt_itm_alt_nm3_META,
			inpt_itm_alt_nm4_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			inpt_sno1_view_META,
			inpt_sno2_view_META,
			inpt_sno3_view_META,
			inpt_sno4_view_META,
			inpt_sno1_data_META,
			inpt_sno2_data_META,
			inpt_sno3_data_META,
			inpt_sno4_data_META,
			inpt_act_lot_no_view_META,
			inpt_act_lot_no_data_META,
			inpt_act_sublot_no_view_META,
			inpt_act_sublot_no_data_META,
			base_unit_inpt_schd_qty_META,
			s_int_base_unit_inpt_schd_qty_META,
			s_dec_base_unit_inpt_schd_qty_META,
			base_unit_inpt_rqmt_qty_META,
			s_int_base_unit_inpt_rqmt_qty_META,
			s_dec_base_unit_inpt_rqmt_qty_META,
			base_unit_inpt_fxd_rqmt_qty_META,
			s_int_base_unit_inpt_fxd_rqmt_qty_META,
			s_dec_base_unit_inpt_fxd_rqmt_qty_META,
			base_unit_inpt_act_qty_META,
			s_int_base_unit_inpt_act_qty_META,
			s_dec_base_unit_inpt_act_qty_META,
			base_unit_loss_qty_META,
			s_int_base_unit_loss_qty_META,
			s_dec_base_unit_loss_qty_META,
			base_unit_fxd_loss_qty_META,
			s_int_base_unit_fxd_loss_qty_META,
			s_dec_base_unit_fxd_loss_qty_META,
			left_cont_inpt_qty_META,
			cont_inpt_qty_META,
			s_int_cont_inpt_qty_META,
			s_dec_cont_inpt_qty_META,
			right_cont_inpt_qty_META,
			left_cont_inpt_rqmt_qty_META,
			cont_inpt_rqmt_qty_META,
			s_int_cont_inpt_rqmt_qty_META,
			s_dec_cont_inpt_rqmt_qty_META,
			right_cont_inpt_rqmt_qty_META,
			left_cont_inpt_fxd_rqmt_qty_META,
			cont_inpt_fxd_rqmt_qty_META,
			s_int_cont_inpt_fxd_rqmt_qty_META,
			s_dec_cont_inpt_fxd_rqmt_qty_META,
			right_cont_inpt_fxd_rqmt_qty_META,
			left_cont_qty_META,
			cont_qty_META,
			s_int_cont_qty_META,
			s_dec_cont_qty_META,
			right_cont_qty_META,
			left_cont_loss_qty_META,
			cont_loss_qty_META,
			s_int_cont_loss_qty_META,
			s_dec_cont_loss_qty_META,
			right_cont_loss_qty_META,
			left_cont_fxd_loss_qty_META,
			cont_fxd_loss_qty_META,
			s_int_cont_fxd_loss_qty_META,
			s_dec_cont_fxd_loss_qty_META,
			right_cont_fxd_loss_qty_META,
			inpt_unit_nm_META,
			left_unit_META,
			cont_fctr_unit_nm_META,
			right_unit_META,
			inpt_act_rpt_rmrks_META,
			inpt_act_dt_META,
			inpt_act_hm_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			ver_no_lbl_META,
			ver_no_META,
			inpt_act_sub_char1_META,
			inpt_act_sub_char2_META,
			inpt_act_sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected MfgActInptR_MC_A(ConstMetaList<? extends MfgActInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActInptR clone() {
		return (MfgActInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActInptR createInstance() {
		return (MfgActInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActInptR getValues(String... names) {
		return (MfgActInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  投入品目.<p>
	 *
	 */
	public String inpt_act_itm_cd() {
		return getConstString(offset + 0, $inpt_act_itm_cd);
	}

	/**
	 *  投入品目.<p>
	 *
	 */
	public void inpt_act_itm_cd(String value) {
		setConstString(offset + 0, $inpt_act_itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String inpt_act_itm_sub1_view() {
		return getConstString(offset + 1, $inpt_act_itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void inpt_act_itm_sub1_view(String value) {
		setConstString(offset + 1, $inpt_act_itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String inpt_act_itm_sub2_view() {
		return getConstString(offset + 2, $inpt_act_itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void inpt_act_itm_sub2_view(String value) {
		setConstString(offset + 2, $inpt_act_itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String inpt_act_itm_sub3_view() {
		return getConstString(offset + 3, $inpt_act_itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void inpt_act_itm_sub3_view(String value) {
		setConstString(offset + 3, $inpt_act_itm_sub3_view, value);
	}


	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public String inpt_act_itm_sub1_data() {
		return getConstString(offset + 4, $inpt_act_itm_sub1_data);
	}

	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public void inpt_act_itm_sub1_data(String value) {
		setConstString(offset + 4, $inpt_act_itm_sub1_data, value);
	}


	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public String inpt_act_itm_sub2_data() {
		return getConstString(offset + 5, $inpt_act_itm_sub2_data);
	}

	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public void inpt_act_itm_sub2_data(String value) {
		setConstString(offset + 5, $inpt_act_itm_sub2_data, value);
	}


	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public String inpt_act_itm_sub3_data() {
		return getConstString(offset + 6, $inpt_act_itm_sub3_data);
	}

	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public void inpt_act_itm_sub3_data(String value) {
		setConstString(offset + 6, $inpt_act_itm_sub3_data, value);
	}


	/**
	 *  投入品名.<p>
	 *
	 */
	public String inpt_act_itm_nm() {
		return getConstString(offset + 7, $inpt_act_itm_nm);
	}

	/**
	 *  投入品名.<p>
	 *
	 */
	public void inpt_act_itm_nm(String value) {
		setConstString(offset + 7, $inpt_act_itm_nm, value);
	}


	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public String inpt_itm_alt_nm1() {
		return getConstString(offset + 8, $inpt_itm_alt_nm1);
	}

	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public void inpt_itm_alt_nm1(String value) {
		setConstString(offset + 8, $inpt_itm_alt_nm1, value);
	}


	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public String inpt_itm_alt_nm2() {
		return getConstString(offset + 9, $inpt_itm_alt_nm2);
	}

	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public void inpt_itm_alt_nm2(String value) {
		setConstString(offset + 9, $inpt_itm_alt_nm2, value);
	}


	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public String inpt_itm_alt_nm3() {
		return getConstString(offset + 10, $inpt_itm_alt_nm3);
	}

	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public void inpt_itm_alt_nm3(String value) {
		setConstString(offset + 10, $inpt_itm_alt_nm3, value);
	}


	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public String inpt_itm_alt_nm4() {
		return getConstString(offset + 11, $inpt_itm_alt_nm4);
	}

	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public void inpt_itm_alt_nm4(String value) {
		setConstString(offset + 11, $inpt_itm_alt_nm4, value);
	}


	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 12, $alt_grp_cd);
	}

	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 12, $alt_grp_cd, value);
	}


	/**
	 *  代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 13, $alt_grp_nm);
	}

	/**
	 *  代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 13, $alt_grp_nm, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String inpt_sno1_view() {
		return getConstString(offset + 14, $inpt_sno1_view);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void inpt_sno1_view(String value) {
		setConstString(offset + 14, $inpt_sno1_view, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String inpt_sno2_view() {
		return getConstString(offset + 15, $inpt_sno2_view);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void inpt_sno2_view(String value) {
		setConstString(offset + 15, $inpt_sno2_view, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String inpt_sno3_view() {
		return getConstString(offset + 16, $inpt_sno3_view);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void inpt_sno3_view(String value) {
		setConstString(offset + 16, $inpt_sno3_view, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String inpt_sno4_view() {
		return getConstString(offset + 17, $inpt_sno4_view);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void inpt_sno4_view(String value) {
		setConstString(offset + 17, $inpt_sno4_view, value);
	}


	/**
	 *  手配ＮＯ１(データ用).<p>
	 *
	 */
	public String inpt_sno1_data() {
		return getConstString(offset + 18, $inpt_sno1_data);
	}

	/**
	 *  手配ＮＯ１(データ用).<p>
	 *
	 */
	public void inpt_sno1_data(String value) {
		setConstString(offset + 18, $inpt_sno1_data, value);
	}


	/**
	 *  手配ＮＯ２(データ用).<p>
	 *
	 */
	public String inpt_sno2_data() {
		return getConstString(offset + 19, $inpt_sno2_data);
	}

	/**
	 *  手配ＮＯ２(データ用).<p>
	 *
	 */
	public void inpt_sno2_data(String value) {
		setConstString(offset + 19, $inpt_sno2_data, value);
	}


	/**
	 *  手配ＮＯ３(データ用).<p>
	 *
	 */
	public String inpt_sno3_data() {
		return getConstString(offset + 20, $inpt_sno3_data);
	}

	/**
	 *  手配ＮＯ３(データ用).<p>
	 *
	 */
	public void inpt_sno3_data(String value) {
		setConstString(offset + 20, $inpt_sno3_data, value);
	}


	/**
	 *  手配ＮＯ４(データ用).<p>
	 *
	 */
	public String inpt_sno4_data() {
		return getConstString(offset + 21, $inpt_sno4_data);
	}

	/**
	 *  手配ＮＯ４(データ用).<p>
	 *
	 */
	public void inpt_sno4_data(String value) {
		setConstString(offset + 21, $inpt_sno4_data, value);
	}


	/**
	 *  ロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public String inpt_act_lot_no_view() {
		return getConstString(offset + 22, $inpt_act_lot_no_view);
	}

	/**
	 *  ロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public void inpt_act_lot_no_view(String value) {
		setConstString(offset + 22, $inpt_act_lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public String inpt_act_lot_no_data() {
		return getConstString(offset + 23, $inpt_act_lot_no_data);
	}

	/**
	 *  ロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public void inpt_act_lot_no_data(String value) {
		setConstString(offset + 23, $inpt_act_lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public String inpt_act_sublot_no_view() {
		return getConstString(offset + 24, $inpt_act_sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（投入）(表示用).<p>
	 *
	 */
	public void inpt_act_sublot_no_view(String value) {
		setConstString(offset + 24, $inpt_act_sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public String inpt_act_sublot_no_data() {
		return getConstString(offset + 25, $inpt_act_sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（投入）(データ用).<p>
	 *
	 */
	public void inpt_act_sublot_no_data(String value) {
		setConstString(offset + 25, $inpt_act_sublot_no_data, value);
	}


	/**
	 *  投入予定数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_schd_qty() {
		return getConstNumber(offset + 26, $base_unit_inpt_schd_qty);
	}

	/**
	 *  投入予定数量.<p>
	 *
	 */
	public void base_unit_inpt_schd_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_inpt_schd_qty, value);
	}

	/**
	 *  投入予定数量.<p>
	 *
	 */
	public void base_unit_inpt_schd_qty(int value) {
		setConstNumber(offset + 26, $base_unit_inpt_schd_qty, value);
	}

	/**
	 *  投入予定数量.<p>
	 *
	 */
	public void base_unit_inpt_schd_qty(long value) {
		setConstNumber(offset + 26, $base_unit_inpt_schd_qty, value);
	}

	/**
	 *  投入予定数量.<p>
	 *
	 */
	public void base_unit_inpt_schd_qty(float value) {
		setConstNumber(offset + 26, $base_unit_inpt_schd_qty, value);
	}

	/**
	 *  投入予定数量.<p>
	 *
	 */
	public void base_unit_inpt_schd_qty(double value) {
		setConstNumber(offset + 26, $base_unit_inpt_schd_qty, value);
	}


	/**
	 *  投入予定数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_schd_qty() {
		return getConstString(offset + 27, $s_int_base_unit_inpt_schd_qty);
	}

	/**
	 *  投入予定数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_schd_qty(String value) {
		setConstString(offset + 27, $s_int_base_unit_inpt_schd_qty, value);
	}


	/**
	 *  投入予定数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_schd_qty() {
		return getConstString(offset + 28, $s_dec_base_unit_inpt_schd_qty);
	}

	/**
	 *  投入予定数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_schd_qty(String value) {
		setConstString(offset + 28, $s_dec_base_unit_inpt_schd_qty, value);
	}


	/**
	 *  投入必要数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_rqmt_qty() {
		return getConstNumber(offset + 29, $base_unit_inpt_rqmt_qty);
	}

	/**
	 *  投入必要数量.<p>
	 *
	 */
	public void base_unit_inpt_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_inpt_rqmt_qty, value);
	}

	/**
	 *  投入必要数量.<p>
	 *
	 */
	public void base_unit_inpt_rqmt_qty(int value) {
		setConstNumber(offset + 29, $base_unit_inpt_rqmt_qty, value);
	}

	/**
	 *  投入必要数量.<p>
	 *
	 */
	public void base_unit_inpt_rqmt_qty(long value) {
		setConstNumber(offset + 29, $base_unit_inpt_rqmt_qty, value);
	}

	/**
	 *  投入必要数量.<p>
	 *
	 */
	public void base_unit_inpt_rqmt_qty(float value) {
		setConstNumber(offset + 29, $base_unit_inpt_rqmt_qty, value);
	}

	/**
	 *  投入必要数量.<p>
	 *
	 */
	public void base_unit_inpt_rqmt_qty(double value) {
		setConstNumber(offset + 29, $base_unit_inpt_rqmt_qty, value);
	}


	/**
	 *  投入必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_rqmt_qty() {
		return getConstString(offset + 30, $s_int_base_unit_inpt_rqmt_qty);
	}

	/**
	 *  投入必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_rqmt_qty(String value) {
		setConstString(offset + 30, $s_int_base_unit_inpt_rqmt_qty, value);
	}


	/**
	 *  投入必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_rqmt_qty() {
		return getConstString(offset + 31, $s_dec_base_unit_inpt_rqmt_qty);
	}

	/**
	 *  投入必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_rqmt_qty(String value) {
		setConstString(offset + 31, $s_dec_base_unit_inpt_rqmt_qty, value);
	}


	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_fxd_rqmt_qty() {
		return getConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty);
	}

	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public void base_unit_inpt_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public void base_unit_inpt_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public void base_unit_inpt_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public void base_unit_inpt_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  投入固定必要数量.<p>
	 *
	 */
	public void base_unit_inpt_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 32, $base_unit_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  投入固定必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 33, $s_int_base_unit_inpt_fxd_rqmt_qty);
	}

	/**
	 *  投入固定必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 33, $s_int_base_unit_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  投入固定必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 34, $s_dec_base_unit_inpt_fxd_rqmt_qty);
	}

	/**
	 *  投入固定必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 34, $s_dec_base_unit_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  投入実績数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_act_qty() {
		return getConstNumber(offset + 35, $base_unit_inpt_act_qty);
	}

	/**
	 *  投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_inpt_act_qty, value);
	}

	/**
	 *  投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(int value) {
		setConstNumber(offset + 35, $base_unit_inpt_act_qty, value);
	}

	/**
	 *  投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(long value) {
		setConstNumber(offset + 35, $base_unit_inpt_act_qty, value);
	}

	/**
	 *  投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(float value) {
		setConstNumber(offset + 35, $base_unit_inpt_act_qty, value);
	}

	/**
	 *  投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(double value) {
		setConstNumber(offset + 35, $base_unit_inpt_act_qty, value);
	}


	/**
	 *  投入実績数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_act_qty() {
		return getConstString(offset + 36, $s_int_base_unit_inpt_act_qty);
	}

	/**
	 *  投入実績数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_act_qty(String value) {
		setConstString(offset + 36, $s_int_base_unit_inpt_act_qty, value);
	}


	/**
	 *  投入実績数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_act_qty() {
		return getConstString(offset + 37, $s_dec_base_unit_inpt_act_qty);
	}

	/**
	 *  投入実績数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_act_qty(String value) {
		setConstString(offset + 37, $s_dec_base_unit_inpt_act_qty, value);
	}


	/**
	 *  ロス実績数.<p>
	 *
	 */
	public MCNumber base_unit_loss_qty() {
		return getConstNumber(offset + 38, $base_unit_loss_qty);
	}

	/**
	 *  ロス実績数.<p>
	 *
	 */
	public void base_unit_loss_qty(MCNumber value) {
		setConstNumber(offset + 38, $base_unit_loss_qty, value);
	}

	/**
	 *  ロス実績数.<p>
	 *
	 */
	public void base_unit_loss_qty(int value) {
		setConstNumber(offset + 38, $base_unit_loss_qty, value);
	}

	/**
	 *  ロス実績数.<p>
	 *
	 */
	public void base_unit_loss_qty(long value) {
		setConstNumber(offset + 38, $base_unit_loss_qty, value);
	}

	/**
	 *  ロス実績数.<p>
	 *
	 */
	public void base_unit_loss_qty(float value) {
		setConstNumber(offset + 38, $base_unit_loss_qty, value);
	}

	/**
	 *  ロス実績数.<p>
	 *
	 */
	public void base_unit_loss_qty(double value) {
		setConstNumber(offset + 38, $base_unit_loss_qty, value);
	}


	/**
	 *  ロス実績数文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_loss_qty() {
		return getConstString(offset + 39, $s_int_base_unit_loss_qty);
	}

	/**
	 *  ロス実績数文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_loss_qty(String value) {
		setConstString(offset + 39, $s_int_base_unit_loss_qty, value);
	}


	/**
	 *  ロス実績数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_loss_qty() {
		return getConstString(offset + 40, $s_dec_base_unit_loss_qty);
	}

	/**
	 *  ロス実績数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_loss_qty(String value) {
		setConstString(offset + 40, $s_dec_base_unit_loss_qty, value);
	}


	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty() {
		return getConstNumber(offset + 41, $base_unit_fxd_loss_qty);
	}

	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 41, $base_unit_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(int value) {
		setConstNumber(offset + 41, $base_unit_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(long value) {
		setConstNumber(offset + 41, $base_unit_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(float value) {
		setConstNumber(offset + 41, $base_unit_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス実績数.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(double value) {
		setConstNumber(offset + 41, $base_unit_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス実績数文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_fxd_loss_qty() {
		return getConstString(offset + 42, $s_int_base_unit_fxd_loss_qty);
	}

	/**
	 *  固定ロス実績数文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_fxd_loss_qty(String value) {
		setConstString(offset + 42, $s_int_base_unit_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス実績数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_fxd_loss_qty() {
		return getConstString(offset + 43, $s_dec_base_unit_fxd_loss_qty);
	}

	/**
	 *  固定ロス実績数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_fxd_loss_qty(String value) {
		setConstString(offset + 43, $s_dec_base_unit_fxd_loss_qty, value);
	}


	/**
	 *  指図有効成分(投入予定)（左括弧）.<p>
	 *
	 */
	public String left_cont_inpt_qty() {
		return getConstString(offset + 44, $left_cont_inpt_qty);
	}

	/**
	 *  指図有効成分(投入予定)（左括弧）.<p>
	 *
	 */
	public void left_cont_inpt_qty(String value) {
		setConstString(offset + 44, $left_cont_inpt_qty, value);
	}


	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 45, $cont_inpt_qty);
	}

	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 45, $cont_inpt_qty, value);
	}

	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 45, $cont_inpt_qty, value);
	}

	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 45, $cont_inpt_qty, value);
	}

	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 45, $cont_inpt_qty, value);
	}

	/**
	 *  指図有効成分(投入予定).<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 45, $cont_inpt_qty, value);
	}


	/**
	 *  指図有効成分(投入予定)文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_inpt_qty() {
		return getConstString(offset + 46, $s_int_cont_inpt_qty);
	}

	/**
	 *  指図有効成分(投入予定)文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_inpt_qty(String value) {
		setConstString(offset + 46, $s_int_cont_inpt_qty, value);
	}


	/**
	 *  指図有効成分(投入予定)文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_inpt_qty() {
		return getConstString(offset + 47, $s_dec_cont_inpt_qty);
	}

	/**
	 *  指図有効成分(投入予定)文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_inpt_qty(String value) {
		setConstString(offset + 47, $s_dec_cont_inpt_qty, value);
	}


	/**
	 *  指図有効成分(投入予定)（右括弧）.<p>
	 *
	 */
	public String right_cont_inpt_qty() {
		return getConstString(offset + 48, $right_cont_inpt_qty);
	}

	/**
	 *  指図有効成分(投入予定)（右括弧）.<p>
	 *
	 */
	public void right_cont_inpt_qty(String value) {
		setConstString(offset + 48, $right_cont_inpt_qty, value);
	}


	/**
	 *  指図有効成分(投入必要)（左括弧）.<p>
	 *
	 */
	public String left_cont_inpt_rqmt_qty() {
		return getConstString(offset + 49, $left_cont_inpt_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入必要)（左括弧）.<p>
	 *
	 */
	public void left_cont_inpt_rqmt_qty(String value) {
		setConstString(offset + 49, $left_cont_inpt_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public MCNumber cont_inpt_rqmt_qty() {
		return getConstNumber(offset + 50, $cont_inpt_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public void cont_inpt_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 50, $cont_inpt_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public void cont_inpt_rqmt_qty(int value) {
		setConstNumber(offset + 50, $cont_inpt_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public void cont_inpt_rqmt_qty(long value) {
		setConstNumber(offset + 50, $cont_inpt_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public void cont_inpt_rqmt_qty(float value) {
		setConstNumber(offset + 50, $cont_inpt_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入必要).<p>
	 *
	 */
	public void cont_inpt_rqmt_qty(double value) {
		setConstNumber(offset + 50, $cont_inpt_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入必要)文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_inpt_rqmt_qty() {
		return getConstString(offset + 51, $s_int_cont_inpt_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入必要)文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_inpt_rqmt_qty(String value) {
		setConstString(offset + 51, $s_int_cont_inpt_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入必要)文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_inpt_rqmt_qty() {
		return getConstString(offset + 52, $s_dec_cont_inpt_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入必要)文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_inpt_rqmt_qty(String value) {
		setConstString(offset + 52, $s_dec_cont_inpt_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入必要)（右括弧）.<p>
	 *
	 */
	public String right_cont_inpt_rqmt_qty() {
		return getConstString(offset + 53, $right_cont_inpt_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入必要)（右括弧）.<p>
	 *
	 */
	public void right_cont_inpt_rqmt_qty(String value) {
		setConstString(offset + 53, $right_cont_inpt_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入固定必要)（左括弧）.<p>
	 *
	 */
	public String left_cont_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 54, $left_cont_inpt_fxd_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入固定必要)（左括弧）.<p>
	 *
	 */
	public void left_cont_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 54, $left_cont_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public MCNumber cont_inpt_fxd_rqmt_qty() {
		return getConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public void cont_inpt_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public void cont_inpt_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public void cont_inpt_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public void cont_inpt_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty, value);
	}

	/**
	 *  指図有効成分(投入固定必要).<p>
	 *
	 */
	public void cont_inpt_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 55, $cont_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入固定必要)文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 56, $s_int_cont_inpt_fxd_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入固定必要)文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 56, $s_int_cont_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入固定必要)文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 57, $s_dec_cont_inpt_fxd_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入固定必要)文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 57, $s_dec_cont_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  指図有効成分(投入固定必要)（右括弧）.<p>
	 *
	 */
	public String right_cont_inpt_fxd_rqmt_qty() {
		return getConstString(offset + 58, $right_cont_inpt_fxd_rqmt_qty);
	}

	/**
	 *  指図有効成分(投入固定必要)（右括弧）.<p>
	 *
	 */
	public void right_cont_inpt_fxd_rqmt_qty(String value) {
		setConstString(offset + 58, $right_cont_inpt_fxd_rqmt_qty, value);
	}


	/**
	 *  投入有効成分（左括弧）.<p>
	 *
	 */
	public String left_cont_qty() {
		return getConstString(offset + 59, $left_cont_qty);
	}

	/**
	 *  投入有効成分（左括弧）.<p>
	 *
	 */
	public void left_cont_qty(String value) {
		setConstString(offset + 59, $left_cont_qty, value);
	}


	/**
	 *  投入有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 60, $cont_qty);
	}

	/**
	 *  投入有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 60, $cont_qty, value);
	}

	/**
	 *  投入有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 60, $cont_qty, value);
	}

	/**
	 *  投入有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 60, $cont_qty, value);
	}

	/**
	 *  投入有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 60, $cont_qty, value);
	}

	/**
	 *  投入有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 60, $cont_qty, value);
	}


	/**
	 *  投入有効成分文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_qty() {
		return getConstString(offset + 61, $s_int_cont_qty);
	}

	/**
	 *  投入有効成分文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_qty(String value) {
		setConstString(offset + 61, $s_int_cont_qty, value);
	}


	/**
	 *  投入有効成分文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_qty() {
		return getConstString(offset + 62, $s_dec_cont_qty);
	}

	/**
	 *  投入有効成分文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_qty(String value) {
		setConstString(offset + 62, $s_dec_cont_qty, value);
	}


	/**
	 *  投入有効成分（右括弧）.<p>
	 *
	 */
	public String right_cont_qty() {
		return getConstString(offset + 63, $right_cont_qty);
	}

	/**
	 *  投入有効成分（右括弧）.<p>
	 *
	 */
	public void right_cont_qty(String value) {
		setConstString(offset + 63, $right_cont_qty, value);
	}


	/**
	 *  ロス有効成分（左括弧）.<p>
	 *
	 */
	public String left_cont_loss_qty() {
		return getConstString(offset + 64, $left_cont_loss_qty);
	}

	/**
	 *  ロス有効成分（左括弧）.<p>
	 *
	 */
	public void left_cont_loss_qty(String value) {
		setConstString(offset + 64, $left_cont_loss_qty, value);
	}


	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return getConstNumber(offset + 65, $cont_loss_qty);
	}

	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		setConstNumber(offset + 65, $cont_loss_qty, value);
	}

	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		setConstNumber(offset + 65, $cont_loss_qty, value);
	}

	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		setConstNumber(offset + 65, $cont_loss_qty, value);
	}

	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		setConstNumber(offset + 65, $cont_loss_qty, value);
	}

	/**
	 *  ロス有効成分.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		setConstNumber(offset + 65, $cont_loss_qty, value);
	}


	/**
	 *  ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_loss_qty() {
		return getConstString(offset + 66, $s_int_cont_loss_qty);
	}

	/**
	 *  ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_loss_qty(String value) {
		setConstString(offset + 66, $s_int_cont_loss_qty, value);
	}


	/**
	 *  ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_loss_qty() {
		return getConstString(offset + 67, $s_dec_cont_loss_qty);
	}

	/**
	 *  ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_loss_qty(String value) {
		setConstString(offset + 67, $s_dec_cont_loss_qty, value);
	}


	/**
	 *  ロス有効成分（右括弧）.<p>
	 *
	 */
	public String right_cont_loss_qty() {
		return getConstString(offset + 68, $right_cont_loss_qty);
	}

	/**
	 *  ロス有効成分（右括弧）.<p>
	 *
	 */
	public void right_cont_loss_qty(String value) {
		setConstString(offset + 68, $right_cont_loss_qty, value);
	}


	/**
	 *  固定ロス有効成分（左括弧）.<p>
	 *
	 */
	public String left_cont_fxd_loss_qty() {
		return getConstString(offset + 69, $left_cont_fxd_loss_qty);
	}

	/**
	 *  固定ロス有効成分（左括弧）.<p>
	 *
	 */
	public void left_cont_fxd_loss_qty(String value) {
		setConstString(offset + 69, $left_cont_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return getConstNumber(offset + 70, $cont_fxd_loss_qty);
	}

	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 70, $cont_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		setConstNumber(offset + 70, $cont_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		setConstNumber(offset + 70, $cont_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		setConstNumber(offset + 70, $cont_fxd_loss_qty, value);
	}

	/**
	 *  固定ロス有効成分.<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		setConstNumber(offset + 70, $cont_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_fxd_loss_qty() {
		return getConstString(offset + 71, $s_int_cont_fxd_loss_qty);
	}

	/**
	 *  固定ロス有効成分文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_fxd_loss_qty(String value) {
		setConstString(offset + 71, $s_int_cont_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_fxd_loss_qty() {
		return getConstString(offset + 72, $s_dec_cont_fxd_loss_qty);
	}

	/**
	 *  固定ロス有効成分文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_fxd_loss_qty(String value) {
		setConstString(offset + 72, $s_dec_cont_fxd_loss_qty, value);
	}


	/**
	 *  固定ロス有効成分（右括弧）.<p>
	 *
	 */
	public String right_cont_fxd_loss_qty() {
		return getConstString(offset + 73, $right_cont_fxd_loss_qty);
	}

	/**
	 *  固定ロス有効成分（右括弧）.<p>
	 *
	 */
	public void right_cont_fxd_loss_qty(String value) {
		setConstString(offset + 73, $right_cont_fxd_loss_qty, value);
	}


	/**
	 *  投入単位名（投入予定・実績数）.<p>
	 *
	 */
	public String inpt_unit_nm() {
		return getConstString(offset + 74, $inpt_unit_nm);
	}

	/**
	 *  投入単位名（投入予定・実績数）.<p>
	 *
	 */
	public void inpt_unit_nm(String value) {
		setConstString(offset + 74, $inpt_unit_nm, value);
	}


	/**
	 *  投入単位名（左括弧）.<p>
	 *
	 */
	public String left_unit() {
		return getConstString(offset + 75, $left_unit);
	}

	/**
	 *  投入単位名（左括弧）.<p>
	 *
	 */
	public void left_unit(String value) {
		setConstString(offset + 75, $left_unit, value);
	}


	/**
	 *  投入単位名（有効成分）.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 76, $cont_fctr_unit_nm);
	}

	/**
	 *  投入単位名（有効成分）.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 76, $cont_fctr_unit_nm, value);
	}


	/**
	 *  投入単位名（右括弧）.<p>
	 *
	 */
	public String right_unit() {
		return getConstString(offset + 77, $right_unit);
	}

	/**
	 *  投入単位名（右括弧）.<p>
	 *
	 */
	public void right_unit(String value) {
		setConstString(offset + 77, $right_unit, value);
	}


	/**
	 *  投入実績備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 78, $inpt_act_rpt_rmrks);
	}

	/**
	 *  投入実績備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 78, $inpt_act_rpt_rmrks, value);
	}


	/**
	 *  投入実績日.<p>
	 *
	 */
	public MCDate inpt_act_dt() {
		return getConstDate(offset + 79, $inpt_act_dt);
	}

	/**
	 *  投入実績日.<p>
	 *
	 */
	public void inpt_act_dt(MCDate value) {
		setConstDate(offset + 79, $inpt_act_dt, value);
	}


	/**
	 *  投入実績時刻.<p>
	 *
	 */
	public MCDate inpt_act_hm() {
		return getConstDate(offset + 80, $inpt_act_hm);
	}

	/**
	 *  投入実績時刻.<p>
	 *
	 */
	public void inpt_act_hm(MCDate value) {
		setConstDate(offset + 80, $inpt_act_hm, value);
	}


	/**
	 *  投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 81, $inpt_schd_no);
	}

	/**
	 *  投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 81, $inpt_schd_no, value);
	}


	/**
	 *  投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 82, $inpt_act_no);
	}

	/**
	 *  投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 82, $inpt_act_no, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 83, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 83, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 84, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 84, $ver_no, value);
	}


	/**
	 *  投入実績予備１.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return getConstString(offset + 85, $inpt_act_sub_char1);
	}

	/**
	 *  投入実績予備１.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		setConstString(offset + 85, $inpt_act_sub_char1, value);
	}


	/**
	 *  投入実績予備２.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return getConstString(offset + 86, $inpt_act_sub_char2);
	}

	/**
	 *  投入実績予備２.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		setConstString(offset + 86, $inpt_act_sub_char2, value);
	}


	/**
	 *  投入実績予備３.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return getConstString(offset + 87, $inpt_act_sub_char3);
	}

	/**
	 *  投入実績予備３.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		setConstString(offset + 87, $inpt_act_sub_char3, value);
	}


	public String getString(String name) {
		if ($inpt_act_itm_cd.equalsIgnoreCase(name)) {
			return inpt_act_itm_cd();
		}
		if ($inpt_act_itm_sub1_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub1_view();
		}
		if ($inpt_act_itm_sub2_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub2_view();
		}
		if ($inpt_act_itm_sub3_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub3_view();
		}
		if ($inpt_act_itm_sub1_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub1_data();
		}
		if ($inpt_act_itm_sub2_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub2_data();
		}
		if ($inpt_act_itm_sub3_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub3_data();
		}
		if ($inpt_act_itm_nm.equalsIgnoreCase(name)) {
			return inpt_act_itm_nm();
		}
		if ($inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm1();
		}
		if ($inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm2();
		}
		if ($inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm3();
		}
		if ($inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			return inpt_sno1_view();
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			return inpt_sno2_view();
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			return inpt_sno3_view();
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			return inpt_sno4_view();
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			return inpt_sno1_data();
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			return inpt_sno2_data();
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			return inpt_sno3_data();
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			return inpt_sno4_data();
		}
		if ($inpt_act_lot_no_view.equalsIgnoreCase(name)) {
			return inpt_act_lot_no_view();
		}
		if ($inpt_act_lot_no_data.equalsIgnoreCase(name)) {
			return inpt_act_lot_no_data();
		}
		if ($inpt_act_sublot_no_view.equalsIgnoreCase(name)) {
			return inpt_act_sublot_no_view();
		}
		if ($inpt_act_sublot_no_data.equalsIgnoreCase(name)) {
			return inpt_act_sublot_no_data();
		}
		if ($s_int_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_schd_qty();
		}
		if ($s_dec_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_schd_qty();
		}
		if ($s_int_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_rqmt_qty();
		}
		if ($s_dec_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_rqmt_qty();
		}
		if ($s_int_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_fxd_rqmt_qty();
		}
		if ($s_int_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_act_qty();
		}
		if ($s_dec_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_act_qty();
		}
		if ($s_int_base_unit_loss_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_loss_qty();
		}
		if ($s_dec_base_unit_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_loss_qty();
		}
		if ($s_int_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_loss_qty();
		}
		if ($s_dec_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_loss_qty();
		}
		if ($left_cont_inpt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_qty();
		}
		if ($s_int_cont_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_qty();
		}
		if ($s_dec_cont_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_qty();
		}
		if ($right_cont_inpt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_qty();
		}
		if ($left_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_rqmt_qty();
		}
		if ($s_int_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_rqmt_qty();
		}
		if ($s_dec_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_rqmt_qty();
		}
		if ($right_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_rqmt_qty();
		}
		if ($left_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_fxd_rqmt_qty();
		}
		if ($s_int_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_fxd_rqmt_qty();
		}
		if ($s_dec_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_fxd_rqmt_qty();
		}
		if ($right_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_fxd_rqmt_qty();
		}
		if ($left_cont_qty.equalsIgnoreCase(name)) {
			return left_cont_qty();
		}
		if ($s_int_cont_qty.equalsIgnoreCase(name)) {
			return s_int_cont_qty();
		}
		if ($s_dec_cont_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_qty();
		}
		if ($right_cont_qty.equalsIgnoreCase(name)) {
			return right_cont_qty();
		}
		if ($left_cont_loss_qty.equalsIgnoreCase(name)) {
			return left_cont_loss_qty();
		}
		if ($s_int_cont_loss_qty.equalsIgnoreCase(name)) {
			return s_int_cont_loss_qty();
		}
		if ($s_dec_cont_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_loss_qty();
		}
		if ($right_cont_loss_qty.equalsIgnoreCase(name)) {
			return right_cont_loss_qty();
		}
		if ($left_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return left_cont_fxd_loss_qty();
		}
		if ($s_int_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_int_cont_fxd_loss_qty();
		}
		if ($s_dec_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_fxd_loss_qty();
		}
		if ($right_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return right_cont_fxd_loss_qty();
		}
		if ($inpt_unit_nm.equalsIgnoreCase(name)) {
			return inpt_unit_nm();
		}
		if ($left_unit.equalsIgnoreCase(name)) {
			return left_unit();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($right_unit.equalsIgnoreCase(name)) {
			return right_unit();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_schd_qty();
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rqmt_qty();
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_act_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rqmt_qty();
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_fxd_rqmt_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_act_dt.equalsIgnoreCase(name)) {
			return inpt_act_dt();
		}
		if ($inpt_act_hm.equalsIgnoreCase(name)) {
			return inpt_act_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($inpt_act_itm_cd.equalsIgnoreCase(name)) {
			return inpt_act_itm_cd();
		}
		if ($inpt_act_itm_sub1_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub1_view();
		}
		if ($inpt_act_itm_sub2_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub2_view();
		}
		if ($inpt_act_itm_sub3_view.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub3_view();
		}
		if ($inpt_act_itm_sub1_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub1_data();
		}
		if ($inpt_act_itm_sub2_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub2_data();
		}
		if ($inpt_act_itm_sub3_data.equalsIgnoreCase(name)) {
			return inpt_act_itm_sub3_data();
		}
		if ($inpt_act_itm_nm.equalsIgnoreCase(name)) {
			return inpt_act_itm_nm();
		}
		if ($inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm1();
		}
		if ($inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm2();
		}
		if ($inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm3();
		}
		if ($inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			return inpt_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			return inpt_sno1_view();
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			return inpt_sno2_view();
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			return inpt_sno3_view();
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			return inpt_sno4_view();
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			return inpt_sno1_data();
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			return inpt_sno2_data();
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			return inpt_sno3_data();
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			return inpt_sno4_data();
		}
		if ($inpt_act_lot_no_view.equalsIgnoreCase(name)) {
			return inpt_act_lot_no_view();
		}
		if ($inpt_act_lot_no_data.equalsIgnoreCase(name)) {
			return inpt_act_lot_no_data();
		}
		if ($inpt_act_sublot_no_view.equalsIgnoreCase(name)) {
			return inpt_act_sublot_no_view();
		}
		if ($inpt_act_sublot_no_data.equalsIgnoreCase(name)) {
			return inpt_act_sublot_no_data();
		}
		if ($s_int_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_schd_qty();
		}
		if ($s_dec_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_schd_qty();
		}
		if ($s_int_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_rqmt_qty();
		}
		if ($s_dec_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_rqmt_qty();
		}
		if ($s_int_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_fxd_rqmt_qty();
		}
		if ($s_int_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_act_qty();
		}
		if ($s_dec_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_act_qty();
		}
		if ($s_int_base_unit_loss_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_loss_qty();
		}
		if ($s_dec_base_unit_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_loss_qty();
		}
		if ($s_int_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_loss_qty();
		}
		if ($s_dec_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_loss_qty();
		}
		if ($left_cont_inpt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_qty();
		}
		if ($s_int_cont_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_qty();
		}
		if ($s_dec_cont_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_qty();
		}
		if ($right_cont_inpt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_qty();
		}
		if ($left_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_rqmt_qty();
		}
		if ($s_int_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_rqmt_qty();
		}
		if ($s_dec_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_rqmt_qty();
		}
		if ($right_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_rqmt_qty();
		}
		if ($left_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return left_cont_inpt_fxd_rqmt_qty();
		}
		if ($s_int_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_cont_inpt_fxd_rqmt_qty();
		}
		if ($s_dec_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_inpt_fxd_rqmt_qty();
		}
		if ($right_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return right_cont_inpt_fxd_rqmt_qty();
		}
		if ($left_cont_qty.equalsIgnoreCase(name)) {
			return left_cont_qty();
		}
		if ($s_int_cont_qty.equalsIgnoreCase(name)) {
			return s_int_cont_qty();
		}
		if ($s_dec_cont_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_qty();
		}
		if ($right_cont_qty.equalsIgnoreCase(name)) {
			return right_cont_qty();
		}
		if ($left_cont_loss_qty.equalsIgnoreCase(name)) {
			return left_cont_loss_qty();
		}
		if ($s_int_cont_loss_qty.equalsIgnoreCase(name)) {
			return s_int_cont_loss_qty();
		}
		if ($s_dec_cont_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_loss_qty();
		}
		if ($right_cont_loss_qty.equalsIgnoreCase(name)) {
			return right_cont_loss_qty();
		}
		if ($left_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return left_cont_fxd_loss_qty();
		}
		if ($s_int_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_int_cont_fxd_loss_qty();
		}
		if ($s_dec_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return s_dec_cont_fxd_loss_qty();
		}
		if ($right_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return right_cont_fxd_loss_qty();
		}
		if ($inpt_unit_nm.equalsIgnoreCase(name)) {
			return inpt_unit_nm();
		}
		if ($left_unit.equalsIgnoreCase(name)) {
			return left_unit();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($right_unit.equalsIgnoreCase(name)) {
			return right_unit();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_schd_qty();
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rqmt_qty();
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_act_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rqmt_qty();
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_fxd_rqmt_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_act_dt.equalsIgnoreCase(name)) {
			return inpt_act_dt();
		}
		if ($inpt_act_hm.equalsIgnoreCase(name)) {
			return inpt_act_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_act_itm_cd.equalsIgnoreCase(name)) {
			inpt_act_itm_cd(value);
			return;
		}
		if ($inpt_act_itm_sub1_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub1_view(value);
			return;
		}
		if ($inpt_act_itm_sub2_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub2_view(value);
			return;
		}
		if ($inpt_act_itm_sub3_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub3_view(value);
			return;
		}
		if ($inpt_act_itm_sub1_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub1_data(value);
			return;
		}
		if ($inpt_act_itm_sub2_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub2_data(value);
			return;
		}
		if ($inpt_act_itm_sub3_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub3_data(value);
			return;
		}
		if ($inpt_act_itm_nm.equalsIgnoreCase(name)) {
			inpt_act_itm_nm(value);
			return;
		}
		if ($inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm1(value);
			return;
		}
		if ($inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm2(value);
			return;
		}
		if ($inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm3(value);
			return;
		}
		if ($inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm4(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			inpt_sno1_view(value);
			return;
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			inpt_sno2_view(value);
			return;
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			inpt_sno3_view(value);
			return;
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			inpt_sno4_view(value);
			return;
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			inpt_sno1_data(value);
			return;
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			inpt_sno2_data(value);
			return;
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			inpt_sno3_data(value);
			return;
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			inpt_sno4_data(value);
			return;
		}
		if ($inpt_act_lot_no_view.equalsIgnoreCase(name)) {
			inpt_act_lot_no_view(value);
			return;
		}
		if ($inpt_act_lot_no_data.equalsIgnoreCase(name)) {
			inpt_act_lot_no_data(value);
			return;
		}
		if ($inpt_act_sublot_no_view.equalsIgnoreCase(name)) {
			inpt_act_sublot_no_view(value);
			return;
		}
		if ($inpt_act_sublot_no_data.equalsIgnoreCase(name)) {
			inpt_act_sublot_no_data(value);
			return;
		}
		if ($s_int_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_schd_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_schd_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_act_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_act_qty(value);
			return;
		}
		if ($s_int_base_unit_loss_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_loss_qty(value);
			return;
		}
		if ($s_dec_base_unit_loss_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_loss_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_loss_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_loss_qty(value);
			return;
		}
		if ($left_cont_inpt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_qty(value);
			return;
		}
		if ($right_cont_inpt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_qty(value);
			return;
		}
		if ($left_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($right_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($left_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($right_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($left_cont_qty.equalsIgnoreCase(name)) {
			left_cont_qty(value);
			return;
		}
		if ($s_int_cont_qty.equalsIgnoreCase(name)) {
			s_int_cont_qty(value);
			return;
		}
		if ($s_dec_cont_qty.equalsIgnoreCase(name)) {
			s_dec_cont_qty(value);
			return;
		}
		if ($right_cont_qty.equalsIgnoreCase(name)) {
			right_cont_qty(value);
			return;
		}
		if ($left_cont_loss_qty.equalsIgnoreCase(name)) {
			left_cont_loss_qty(value);
			return;
		}
		if ($s_int_cont_loss_qty.equalsIgnoreCase(name)) {
			s_int_cont_loss_qty(value);
			return;
		}
		if ($s_dec_cont_loss_qty.equalsIgnoreCase(name)) {
			s_dec_cont_loss_qty(value);
			return;
		}
		if ($right_cont_loss_qty.equalsIgnoreCase(name)) {
			right_cont_loss_qty(value);
			return;
		}
		if ($left_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			left_cont_fxd_loss_qty(value);
			return;
		}
		if ($s_int_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_int_cont_fxd_loss_qty(value);
			return;
		}
		if ($s_dec_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_dec_cont_fxd_loss_qty(value);
			return;
		}
		if ($right_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			right_cont_fxd_loss_qty(value);
			return;
		}
		if ($inpt_unit_nm.equalsIgnoreCase(name)) {
			inpt_unit_nm(value);
			return;
		}
		if ($left_unit.equalsIgnoreCase(name)) {
			left_unit(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($right_unit.equalsIgnoreCase(name)) {
			right_unit(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_act_dt.equalsIgnoreCase(name)) {
			inpt_act_dt(value);
			return;
		}
		if ($inpt_act_hm.equalsIgnoreCase(name)) {
			inpt_act_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_act_itm_cd.equalsIgnoreCase(name)) {
			inpt_act_itm_cd(value);
			return;
		}
		if ($inpt_act_itm_sub1_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub1_view(value);
			return;
		}
		if ($inpt_act_itm_sub2_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub2_view(value);
			return;
		}
		if ($inpt_act_itm_sub3_view.equalsIgnoreCase(name)) {
			inpt_act_itm_sub3_view(value);
			return;
		}
		if ($inpt_act_itm_sub1_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub1_data(value);
			return;
		}
		if ($inpt_act_itm_sub2_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub2_data(value);
			return;
		}
		if ($inpt_act_itm_sub3_data.equalsIgnoreCase(name)) {
			inpt_act_itm_sub3_data(value);
			return;
		}
		if ($inpt_act_itm_nm.equalsIgnoreCase(name)) {
			inpt_act_itm_nm(value);
			return;
		}
		if ($inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm1(value);
			return;
		}
		if ($inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm2(value);
			return;
		}
		if ($inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm3(value);
			return;
		}
		if ($inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			inpt_itm_alt_nm4(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			inpt_sno1_view(value);
			return;
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			inpt_sno2_view(value);
			return;
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			inpt_sno3_view(value);
			return;
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			inpt_sno4_view(value);
			return;
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			inpt_sno1_data(value);
			return;
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			inpt_sno2_data(value);
			return;
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			inpt_sno3_data(value);
			return;
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			inpt_sno4_data(value);
			return;
		}
		if ($inpt_act_lot_no_view.equalsIgnoreCase(name)) {
			inpt_act_lot_no_view(value);
			return;
		}
		if ($inpt_act_lot_no_data.equalsIgnoreCase(name)) {
			inpt_act_lot_no_data(value);
			return;
		}
		if ($inpt_act_sublot_no_view.equalsIgnoreCase(name)) {
			inpt_act_sublot_no_view(value);
			return;
		}
		if ($inpt_act_sublot_no_data.equalsIgnoreCase(name)) {
			inpt_act_sublot_no_data(value);
			return;
		}
		if ($s_int_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_schd_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_schd_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_act_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_act_qty(value);
			return;
		}
		if ($s_int_base_unit_loss_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_loss_qty(value);
			return;
		}
		if ($s_dec_base_unit_loss_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_loss_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_loss_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_loss_qty(value);
			return;
		}
		if ($left_cont_inpt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_qty(value);
			return;
		}
		if ($right_cont_inpt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_qty(value);
			return;
		}
		if ($left_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($right_cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_rqmt_qty(value);
			return;
		}
		if ($left_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			left_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_int_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($right_cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			right_cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($left_cont_qty.equalsIgnoreCase(name)) {
			left_cont_qty(value);
			return;
		}
		if ($s_int_cont_qty.equalsIgnoreCase(name)) {
			s_int_cont_qty(value);
			return;
		}
		if ($s_dec_cont_qty.equalsIgnoreCase(name)) {
			s_dec_cont_qty(value);
			return;
		}
		if ($right_cont_qty.equalsIgnoreCase(name)) {
			right_cont_qty(value);
			return;
		}
		if ($left_cont_loss_qty.equalsIgnoreCase(name)) {
			left_cont_loss_qty(value);
			return;
		}
		if ($s_int_cont_loss_qty.equalsIgnoreCase(name)) {
			s_int_cont_loss_qty(value);
			return;
		}
		if ($s_dec_cont_loss_qty.equalsIgnoreCase(name)) {
			s_dec_cont_loss_qty(value);
			return;
		}
		if ($right_cont_loss_qty.equalsIgnoreCase(name)) {
			right_cont_loss_qty(value);
			return;
		}
		if ($left_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			left_cont_fxd_loss_qty(value);
			return;
		}
		if ($s_int_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_int_cont_fxd_loss_qty(value);
			return;
		}
		if ($s_dec_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			s_dec_cont_fxd_loss_qty(value);
			return;
		}
		if ($right_cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			right_cont_fxd_loss_qty(value);
			return;
		}
		if ($inpt_unit_nm.equalsIgnoreCase(name)) {
			inpt_unit_nm(value);
			return;
		}
		if ($left_unit.equalsIgnoreCase(name)) {
			left_unit(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($right_unit.equalsIgnoreCase(name)) {
			right_unit(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_inpt_schd_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_schd_qty(value);
			return;
		}
		if ($base_unit_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_inpt_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_inpt_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_act_dt.equalsIgnoreCase(name)) {
			inpt_act_dt(value);
			return;
		}
		if ($inpt_act_hm.equalsIgnoreCase(name)) {
			inpt_act_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

