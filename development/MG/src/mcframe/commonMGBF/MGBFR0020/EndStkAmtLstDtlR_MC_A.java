package mcframe.commonMGBF.MGBFR0020;

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
 * ブロック"EndStkAmtLstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class EndStkAmtLstDtlR_MC_A extends MCConstRow {

	/**
	 *  計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 *  計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 *  原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 *  ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 *  年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 *  管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 *  管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 *  品目仕訳.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 *  品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 *  資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 *  資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 *  取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 *  取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 *  取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 *  取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 *  金額合計.<p>
	 *
	 */
	public static final String $sum_amt = "sum_amt";
	/**
	 *  金額合計文字列.<p>
	 *
	 */
	public static final String $s_sum_amt = "s_sum_amt";
	/**
	 *  出力日.<p>
	 *
	 */
	public static final String $prnt_dt = "prnt_dt";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  通貨名称.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public static final String $sno1_lbl = "sno1_lbl";
	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public static final String $sno2_lbl = "sno2_lbl";
	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public static final String $sno3_lbl = "sno3_lbl";
	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public static final String $sno4_lbl = "sno4_lbl";
	/**
	 *  手配ＮＯ１（表示用）.<p>
	 *
	 */
	public static final String $sno1_view = "sno1_view";
	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public static final String $sno1_data = "sno1_data";
	/**
	 *  手配ＮＯ２（表示用）.<p>
	 *
	 */
	public static final String $sno2_view = "sno2_view";
	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public static final String $sno2_data = "sno2_data";
	/**
	 *  手配ＮＯ３（表示用）.<p>
	 *
	 */
	public static final String $sno3_view = "sno3_view";
	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public static final String $sno3_data = "sno3_data";
	/**
	 *  手配ＮＯ４（表示用）.<p>
	 *
	 */
	public static final String $sno4_view = "sno4_view";
	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public static final String $sno4_data = "sno4_data";
	/**
	 *  数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qty = "s_int_qty";
	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qty = "s_dec_qty";
	/**
	 *  基準単位.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unit_dec_place = "unit_dec_place";
	/**
	 *  金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_amt = "s_int_amt";
	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_amt = "s_dec_amt";
	/**
	 *  総平均単価.<p>
	 *
	 */
	public static final String $ave_amt = "ave_amt";
	/**
	 *  総平均単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_ave_amt = "s_int_ave_amt";
	/**
	 *  総平均単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_ave_amt = "s_dec_ave_amt";
	/**
	 *  標準原価.<p>
	 *
	 */
	public static final String $std_amt = "std_amt";
	/**
	 *  標準原価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_std_amt = "s_int_std_amt";
	/**
	 *  標準原価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_std_amt = "s_dec_std_amt";
	/**
	 *  容積.<p>
	 *
	 */
	public static final String $dim_qty = "dim_qty";
	/**
	 *  容積文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_dim_qty = "s_int_dim_qty";
	/**
	 *  容積文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_dim_qty = "s_dec_dim_qty";
	/**
	 *  重量.<p>
	 *
	 */
	public static final String $wt_qty = "wt_qty";
	/**
	 *  重量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_wt_qty = "s_int_wt_qty";
	/**
	 *  重量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_wt_qty = "s_dec_wt_qty";
	/**
	 *  入り目数量.<p>
	 *
	 */
	public static final String $conts_qty = "conts_qty";
	/**
	 *  入り目数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_conts_qty = "s_int_conts_qty";
	/**
	 *  入り目数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_conts_qty = "s_dec_conts_qty";
	/**
	 *  容積単位ＣＤ.<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	/**
	 *  容積単位名.<p>
	 *
	 */
	public static final String $dim_unit_nm = "dim_unit_nm";
	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dim_unit_dec_place = "dim_unit_dec_place";
	/**
	 *  重量単位ＣＤ.<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	/**
	 *  重量単位名.<p>
	 *
	 */
	public static final String $wt_unit_nm = "wt_unit_nm";
	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public static final String $wt_unit_dec_place = "wt_unit_dec_place";
	/**
	 *  入り目単位ＣＤ.<p>
	 *
	 */
	public static final String $conts_unit_cd = "conts_unit_cd";
	/**
	 *  入り目単位名.<p>
	 *
	 */
	public static final String $conts_unit_nm = "conts_unit_nm";
	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public static final String $conts_unit_dec_place = "conts_unit_dec_place";
	/**
	 *  容積単価.<p>
	 *
	 */
	public static final String $dim_amt = "dim_amt";
	/**
	 *  容積単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_dim_amt = "s_int_dim_amt";
	/**
	 *  容積単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_dim_amt = "s_dec_dim_amt";
	/**
	 *  重量単価.<p>
	 *
	 */
	public static final String $wt_amt = "wt_amt";
	/**
	 *  重量単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_wt_amt = "s_int_wt_amt";
	/**
	 *  重量単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_wt_amt = "s_dec_wt_amt";
	/**
	 *  入り目単価.<p>
	 *
	 */
	public static final String $conts_amt = "conts_amt";
	/**
	 *  入り目単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_conts_amt = "s_int_conts_amt";
	/**
	 *  入り目単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_conts_amt = "s_dec_conts_amt";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createStringMeta($asst_typ_nm);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta sum_amt_META = createCommonMeta($sum_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sum_amt_META = createStringMeta($s_sum_amt);
	public static final MCMeta prnt_dt_META = createCommonMeta($prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_lbl_META = createStringMeta($sno1_lbl);
	public static final MCMeta sno2_lbl_META = createStringMeta($sno2_lbl);
	public static final MCMeta sno3_lbl_META = createStringMeta($sno3_lbl);
	public static final MCMeta sno4_lbl_META = createStringMeta($sno4_lbl);
	public static final MCMeta sno1_view_META = createCommonMeta($sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_data_META = createCommonMeta($sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_view_META = createCommonMeta($sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_data_META = createCommonMeta($sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_view_META = createCommonMeta($sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_data_META = createCommonMeta($sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_view_META = createCommonMeta($sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_data_META = createCommonMeta($sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_qty_META = createStringMeta($s_int_qty);
	public static final MCMeta s_dec_qty_META = createStringMeta($s_dec_qty);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_dec_place_META = createCommonMeta($unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_amt_META = createStringMeta($s_int_amt);
	public static final MCMeta s_dec_amt_META = createStringMeta($s_dec_amt);
	public static final MCMeta ave_amt_META = createCommonMeta($ave_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_ave_amt_META = createStringMeta($s_int_ave_amt);
	public static final MCMeta s_dec_ave_amt_META = createStringMeta($s_dec_ave_amt);
	public static final MCMeta std_amt_META = createCommonMeta($std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_std_amt_META = createStringMeta($s_int_std_amt);
	public static final MCMeta s_dec_std_amt_META = createStringMeta($s_dec_std_amt);
	public static final MCMeta dim_qty_META = createCommonMeta($dim_qty, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta s_int_dim_qty_META = createStringMeta($s_int_dim_qty);
	public static final MCMeta s_dec_dim_qty_META = createStringMeta($s_dec_dim_qty);
	public static final MCMeta wt_qty_META = createCommonMeta($wt_qty, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_int_wt_qty_META = createStringMeta($s_int_wt_qty);
	public static final MCMeta s_dec_wt_qty_META = createStringMeta($s_dec_wt_qty);
	public static final MCMeta conts_qty_META = createCommonMeta($conts_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_conts_qty_META = createStringMeta($s_int_conts_qty);
	public static final MCMeta s_dec_conts_qty_META = createStringMeta($s_dec_conts_qty);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dim_unit_nm_META = createCommonMeta($dim_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dim_unit_dec_place_META = createCommonMeta($dim_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wt_unit_nm_META = createCommonMeta($wt_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta wt_unit_dec_place_META = createCommonMeta($wt_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta conts_unit_cd_META = createCommonMeta($conts_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conts_unit_nm_META = createCommonMeta($conts_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta conts_unit_dec_place_META = createCommonMeta($conts_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dim_amt_META = createCommonMeta($dim_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_dim_amt_META = createStringMeta($s_int_dim_amt);
	public static final MCMeta s_dec_dim_amt_META = createStringMeta($s_dec_dim_amt);
	public static final MCMeta wt_amt_META = createCommonMeta($wt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_wt_amt_META = createStringMeta($s_int_wt_amt);
	public static final MCMeta s_dec_wt_amt_META = createStringMeta($s_dec_wt_amt);
	public static final MCMeta conts_amt_META = createCommonMeta($conts_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_conts_amt_META = createStringMeta($s_int_conts_amt);
	public static final MCMeta s_dec_conts_amt_META = createStringMeta($s_dec_conts_amt);

	protected static final ConstMetaList<EndStkAmtLstDtlR> constMetas = new ConstMetaList<EndStkAmtLstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			bp_cd_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			sum_amt_META,
			s_sum_amt_META,
			prnt_dt_META,
			cur_cd_META,
			cur_nm_META,
			upri_dec_place_META,
			amt_dec_place_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_view_META,
			sublot_no_data_META,
			sno1_lbl_META,
			sno2_lbl_META,
			sno3_lbl_META,
			sno4_lbl_META,
			sno1_view_META,
			sno1_data_META,
			sno2_view_META,
			sno2_data_META,
			sno3_view_META,
			sno3_data_META,
			sno4_view_META,
			sno4_data_META,
			qty_META,
			s_int_qty_META,
			s_dec_qty_META,
			unit_cd_META,
			unit_nm_META,
			unit_dec_place_META,
			amt_META,
			s_int_amt_META,
			s_dec_amt_META,
			ave_amt_META,
			s_int_ave_amt_META,
			s_dec_ave_amt_META,
			std_amt_META,
			s_int_std_amt_META,
			s_dec_std_amt_META,
			dim_qty_META,
			s_int_dim_qty_META,
			s_dec_dim_qty_META,
			wt_qty_META,
			s_int_wt_qty_META,
			s_dec_wt_qty_META,
			conts_qty_META,
			s_int_conts_qty_META,
			s_dec_conts_qty_META,
			dim_unit_cd_META,
			dim_unit_nm_META,
			dim_unit_dec_place_META,
			wt_unit_cd_META,
			wt_unit_nm_META,
			wt_unit_dec_place_META,
			conts_unit_cd_META,
			conts_unit_nm_META,
			conts_unit_dec_place_META,
			dim_amt_META,
			s_int_dim_amt_META,
			s_dec_dim_amt_META,
			wt_amt_META,
			s_int_wt_amt_META,
			s_dec_wt_amt_META,
			conts_amt_META,
			s_int_conts_amt_META,
			s_dec_conts_amt_META
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
	protected EndStkAmtLstDtlR_MC_A(ConstMetaList<? extends EndStkAmtLstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public EndStkAmtLstDtlR clone() {
		return (EndStkAmtLstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public EndStkAmtLstDtlR createInstance() {
		return (EndStkAmtLstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public EndStkAmtLstDtlR getValues(String... names) {
		return (EndStkAmtLstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 *  計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 *  計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 *  計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	/**
	 *  原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 2, $calc_no);
	}

	/**
	 *  原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 2, $calc_no, value);
	}


	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 *  ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 *  ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 *  ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 *  年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 5, $ym);
	}

	/**
	 *  年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 5, $ym, value);
	}


	/**
	 *  管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 6, $mng_dpt_cd);
	}

	/**
	 *  管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 6, $mng_dpt_cd, value);
	}


	/**
	 *  管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 7, $mng_dpt_nm);
	}

	/**
	 *  管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 7, $mng_dpt_nm, value);
	}


	/**
	 *  品目仕訳.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 8, $itm_jnl_cd);
	}

	/**
	 *  品目仕訳.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 8, $itm_jnl_cd, value);
	}


	/**
	 *  品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 9, $itm_jnl_nm);
	}

	/**
	 *  品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 9, $itm_jnl_nm, value);
	}


	/**
	 *  資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 10, $asst_typ);
	}

	/**
	 *  資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 10, $asst_typ, value);
	}


	/**
	 *  資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 11, $asst_typ_nm);
	}

	/**
	 *  資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 11, $asst_typ_nm, value);
	}


	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 12, $bp_cd);
	}

	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 12, $bp_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 13, $bp_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 13, $bp_nm, value);
	}


	/**
	 *  取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 14, $bp_alt_nm1);
	}

	/**
	 *  取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 14, $bp_alt_nm1, value);
	}


	/**
	 *  取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 15, $bp_alt_nm2);
	}

	/**
	 *  取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 15, $bp_alt_nm2, value);
	}


	/**
	 *  取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 16, $bp_alt_nm3);
	}

	/**
	 *  取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 16, $bp_alt_nm3, value);
	}


	/**
	 *  取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 17, $bp_alt_nm4);
	}

	/**
	 *  取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 17, $bp_alt_nm4, value);
	}


	/**
	 *  金額合計.<p>
	 *
	 */
	public MCNumber sum_amt() {
		return getConstNumber(offset + 18, $sum_amt);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void sum_amt(MCNumber value) {
		setConstNumber(offset + 18, $sum_amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void sum_amt(int value) {
		setConstNumber(offset + 18, $sum_amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void sum_amt(long value) {
		setConstNumber(offset + 18, $sum_amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void sum_amt(float value) {
		setConstNumber(offset + 18, $sum_amt, value);
	}

	/**
	 *  金額合計.<p>
	 *
	 */
	public void sum_amt(double value) {
		setConstNumber(offset + 18, $sum_amt, value);
	}


	/**
	 *  金額合計文字列.<p>
	 *
	 */
	public String s_sum_amt() {
		return getConstString(offset + 19, $s_sum_amt);
	}

	/**
	 *  金額合計文字列.<p>
	 *
	 */
	public void s_sum_amt(String value) {
		setConstString(offset + 19, $s_sum_amt, value);
	}


	/**
	 *  出力日.<p>
	 *
	 */
	public MCDate prnt_dt() {
		return getConstDate(offset + 20, $prnt_dt);
	}

	/**
	 *  出力日.<p>
	 *
	 */
	public void prnt_dt(MCDate value) {
		setConstDate(offset + 20, $prnt_dt, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 21, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 21, $cur_cd, value);
	}


	/**
	 *  通貨名称.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 22, $cur_nm);
	}

	/**
	 *  通貨名称.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 22, $cur_nm, value);
	}


	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 23, $upri_dec_place);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 23, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 23, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 23, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 23, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 23, $upri_dec_place, value);
	}


	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 24, $amt_dec_place);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 24, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 24, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 24, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 24, $amt_dec_place, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 25, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 25, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 26, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 26, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 27, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 27, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 28, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 28, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 29, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 29, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 30, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 30, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 31, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 31, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 32, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 32, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 33, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 33, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 34, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 34, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 35, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 35, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 36, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 36, $itm_alt_nm4, value);
	}


	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 37, $lot_no_view);
	}

	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 37, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 38, $lot_no_data);
	}

	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 38, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 39, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 39, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 40, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 40, $sublot_no_data, value);
	}


	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public String sno1_lbl() {
		return getConstString(offset + 41, $sno1_lbl);
	}

	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public void sno1_lbl(String value) {
		setConstString(offset + 41, $sno1_lbl, value);
	}


	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public String sno2_lbl() {
		return getConstString(offset + 42, $sno2_lbl);
	}

	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public void sno2_lbl(String value) {
		setConstString(offset + 42, $sno2_lbl, value);
	}


	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public String sno3_lbl() {
		return getConstString(offset + 43, $sno3_lbl);
	}

	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public void sno3_lbl(String value) {
		setConstString(offset + 43, $sno3_lbl, value);
	}


	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public String sno4_lbl() {
		return getConstString(offset + 44, $sno4_lbl);
	}

	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public void sno4_lbl(String value) {
		setConstString(offset + 44, $sno4_lbl, value);
	}


	/**
	 *  手配ＮＯ１（表示用）.<p>
	 *
	 */
	public String sno1_view() {
		return getConstString(offset + 45, $sno1_view);
	}

	/**
	 *  手配ＮＯ１（表示用）.<p>
	 *
	 */
	public void sno1_view(String value) {
		setConstString(offset + 45, $sno1_view, value);
	}


	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public String sno1_data() {
		return getConstString(offset + 46, $sno1_data);
	}

	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public void sno1_data(String value) {
		setConstString(offset + 46, $sno1_data, value);
	}


	/**
	 *  手配ＮＯ２（表示用）.<p>
	 *
	 */
	public String sno2_view() {
		return getConstString(offset + 47, $sno2_view);
	}

	/**
	 *  手配ＮＯ２（表示用）.<p>
	 *
	 */
	public void sno2_view(String value) {
		setConstString(offset + 47, $sno2_view, value);
	}


	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public String sno2_data() {
		return getConstString(offset + 48, $sno2_data);
	}

	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public void sno2_data(String value) {
		setConstString(offset + 48, $sno2_data, value);
	}


	/**
	 *  手配ＮＯ３（表示用）.<p>
	 *
	 */
	public String sno3_view() {
		return getConstString(offset + 49, $sno3_view);
	}

	/**
	 *  手配ＮＯ３（表示用）.<p>
	 *
	 */
	public void sno3_view(String value) {
		setConstString(offset + 49, $sno3_view, value);
	}


	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public String sno3_data() {
		return getConstString(offset + 50, $sno3_data);
	}

	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public void sno3_data(String value) {
		setConstString(offset + 50, $sno3_data, value);
	}


	/**
	 *  手配ＮＯ４（表示用）.<p>
	 *
	 */
	public String sno4_view() {
		return getConstString(offset + 51, $sno4_view);
	}

	/**
	 *  手配ＮＯ４（表示用）.<p>
	 *
	 */
	public void sno4_view(String value) {
		setConstString(offset + 51, $sno4_view, value);
	}


	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public String sno4_data() {
		return getConstString(offset + 52, $sno4_data);
	}

	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public void sno4_data(String value) {
		setConstString(offset + 52, $sno4_data, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 53, $qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 53, $qty, value);
	}


	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_qty() {
		return getConstString(offset + 54, $s_int_qty);
	}

	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_qty(String value) {
		setConstString(offset + 54, $s_int_qty, value);
	}


	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qty() {
		return getConstString(offset + 55, $s_dec_qty);
	}

	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qty(String value) {
		setConstString(offset + 55, $s_dec_qty, value);
	}


	/**
	 *  基準単位.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 56, $unit_cd);
	}

	/**
	 *  基準単位.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 56, $unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 57, $unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 57, $unit_nm, value);
	}


	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unit_dec_place() {
		return getConstNumber(offset + 58, $unit_dec_place);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(MCNumber value) {
		setConstNumber(offset + 58, $unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(int value) {
		setConstNumber(offset + 58, $unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(long value) {
		setConstNumber(offset + 58, $unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(float value) {
		setConstNumber(offset + 58, $unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(double value) {
		setConstNumber(offset + 58, $unit_dec_place, value);
	}


	/**
	 *  金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 59, $amt);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 59, $amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 59, $amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 59, $amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 59, $amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 59, $amt, value);
	}


	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_amt() {
		return getConstString(offset + 60, $s_int_amt);
	}

	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_amt(String value) {
		setConstString(offset + 60, $s_int_amt, value);
	}


	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_amt() {
		return getConstString(offset + 61, $s_dec_amt);
	}

	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_amt(String value) {
		setConstString(offset + 61, $s_dec_amt, value);
	}


	/**
	 *  総平均単価.<p>
	 *
	 */
	public MCNumber ave_amt() {
		return getConstNumber(offset + 62, $ave_amt);
	}

	/**
	 *  総平均単価.<p>
	 *
	 */
	public void ave_amt(MCNumber value) {
		setConstNumber(offset + 62, $ave_amt, value);
	}

	/**
	 *  総平均単価.<p>
	 *
	 */
	public void ave_amt(int value) {
		setConstNumber(offset + 62, $ave_amt, value);
	}

	/**
	 *  総平均単価.<p>
	 *
	 */
	public void ave_amt(long value) {
		setConstNumber(offset + 62, $ave_amt, value);
	}

	/**
	 *  総平均単価.<p>
	 *
	 */
	public void ave_amt(float value) {
		setConstNumber(offset + 62, $ave_amt, value);
	}

	/**
	 *  総平均単価.<p>
	 *
	 */
	public void ave_amt(double value) {
		setConstNumber(offset + 62, $ave_amt, value);
	}


	/**
	 *  総平均単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_ave_amt() {
		return getConstString(offset + 63, $s_int_ave_amt);
	}

	/**
	 *  総平均単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_ave_amt(String value) {
		setConstString(offset + 63, $s_int_ave_amt, value);
	}


	/**
	 *  総平均単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_ave_amt() {
		return getConstString(offset + 64, $s_dec_ave_amt);
	}

	/**
	 *  総平均単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_ave_amt(String value) {
		setConstString(offset + 64, $s_dec_ave_amt, value);
	}


	/**
	 *  標準原価.<p>
	 *
	 */
	public MCNumber std_amt() {
		return getConstNumber(offset + 65, $std_amt);
	}

	/**
	 *  標準原価.<p>
	 *
	 */
	public void std_amt(MCNumber value) {
		setConstNumber(offset + 65, $std_amt, value);
	}

	/**
	 *  標準原価.<p>
	 *
	 */
	public void std_amt(int value) {
		setConstNumber(offset + 65, $std_amt, value);
	}

	/**
	 *  標準原価.<p>
	 *
	 */
	public void std_amt(long value) {
		setConstNumber(offset + 65, $std_amt, value);
	}

	/**
	 *  標準原価.<p>
	 *
	 */
	public void std_amt(float value) {
		setConstNumber(offset + 65, $std_amt, value);
	}

	/**
	 *  標準原価.<p>
	 *
	 */
	public void std_amt(double value) {
		setConstNumber(offset + 65, $std_amt, value);
	}


	/**
	 *  標準原価文字列（整数部）.<p>
	 *
	 */
	public String s_int_std_amt() {
		return getConstString(offset + 66, $s_int_std_amt);
	}

	/**
	 *  標準原価文字列（整数部）.<p>
	 *
	 */
	public void s_int_std_amt(String value) {
		setConstString(offset + 66, $s_int_std_amt, value);
	}


	/**
	 *  標準原価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_std_amt() {
		return getConstString(offset + 67, $s_dec_std_amt);
	}

	/**
	 *  標準原価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_std_amt(String value) {
		setConstString(offset + 67, $s_dec_std_amt, value);
	}


	/**
	 *  容積.<p>
	 *
	 */
	public MCNumber dim_qty() {
		return getConstNumber(offset + 68, $dim_qty);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void dim_qty(MCNumber value) {
		setConstNumber(offset + 68, $dim_qty, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void dim_qty(int value) {
		setConstNumber(offset + 68, $dim_qty, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void dim_qty(long value) {
		setConstNumber(offset + 68, $dim_qty, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void dim_qty(float value) {
		setConstNumber(offset + 68, $dim_qty, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void dim_qty(double value) {
		setConstNumber(offset + 68, $dim_qty, value);
	}


	/**
	 *  容積文字列（整数部）.<p>
	 *
	 */
	public String s_int_dim_qty() {
		return getConstString(offset + 69, $s_int_dim_qty);
	}

	/**
	 *  容積文字列（整数部）.<p>
	 *
	 */
	public void s_int_dim_qty(String value) {
		setConstString(offset + 69, $s_int_dim_qty, value);
	}


	/**
	 *  容積文字列（小数部）.<p>
	 *
	 */
	public String s_dec_dim_qty() {
		return getConstString(offset + 70, $s_dec_dim_qty);
	}

	/**
	 *  容積文字列（小数部）.<p>
	 *
	 */
	public void s_dec_dim_qty(String value) {
		setConstString(offset + 70, $s_dec_dim_qty, value);
	}


	/**
	 *  重量.<p>
	 *
	 */
	public MCNumber wt_qty() {
		return getConstNumber(offset + 71, $wt_qty);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void wt_qty(MCNumber value) {
		setConstNumber(offset + 71, $wt_qty, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void wt_qty(int value) {
		setConstNumber(offset + 71, $wt_qty, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void wt_qty(long value) {
		setConstNumber(offset + 71, $wt_qty, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void wt_qty(float value) {
		setConstNumber(offset + 71, $wt_qty, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void wt_qty(double value) {
		setConstNumber(offset + 71, $wt_qty, value);
	}


	/**
	 *  重量文字列（整数部）.<p>
	 *
	 */
	public String s_int_wt_qty() {
		return getConstString(offset + 72, $s_int_wt_qty);
	}

	/**
	 *  重量文字列（整数部）.<p>
	 *
	 */
	public void s_int_wt_qty(String value) {
		setConstString(offset + 72, $s_int_wt_qty, value);
	}


	/**
	 *  重量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_wt_qty() {
		return getConstString(offset + 73, $s_dec_wt_qty);
	}

	/**
	 *  重量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_wt_qty(String value) {
		setConstString(offset + 73, $s_dec_wt_qty, value);
	}


	/**
	 *  入り目数量.<p>
	 *
	 */
	public MCNumber conts_qty() {
		return getConstNumber(offset + 74, $conts_qty);
	}

	/**
	 *  入り目数量.<p>
	 *
	 */
	public void conts_qty(MCNumber value) {
		setConstNumber(offset + 74, $conts_qty, value);
	}

	/**
	 *  入り目数量.<p>
	 *
	 */
	public void conts_qty(int value) {
		setConstNumber(offset + 74, $conts_qty, value);
	}

	/**
	 *  入り目数量.<p>
	 *
	 */
	public void conts_qty(long value) {
		setConstNumber(offset + 74, $conts_qty, value);
	}

	/**
	 *  入り目数量.<p>
	 *
	 */
	public void conts_qty(float value) {
		setConstNumber(offset + 74, $conts_qty, value);
	}

	/**
	 *  入り目数量.<p>
	 *
	 */
	public void conts_qty(double value) {
		setConstNumber(offset + 74, $conts_qty, value);
	}


	/**
	 *  入り目数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_conts_qty() {
		return getConstString(offset + 75, $s_int_conts_qty);
	}

	/**
	 *  入り目数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_conts_qty(String value) {
		setConstString(offset + 75, $s_int_conts_qty, value);
	}


	/**
	 *  入り目数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_conts_qty() {
		return getConstString(offset + 76, $s_dec_conts_qty);
	}

	/**
	 *  入り目数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_conts_qty(String value) {
		setConstString(offset + 76, $s_dec_conts_qty, value);
	}


	/**
	 *  容積単位ＣＤ.<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 77, $dim_unit_cd);
	}

	/**
	 *  容積単位ＣＤ.<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 77, $dim_unit_cd, value);
	}


	/**
	 *  容積単位名.<p>
	 *
	 */
	public String dim_unit_nm() {
		return getConstString(offset + 78, $dim_unit_nm);
	}

	/**
	 *  容積単位名.<p>
	 *
	 */
	public void dim_unit_nm(String value) {
		setConstString(offset + 78, $dim_unit_nm, value);
	}


	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dim_unit_dec_place() {
		return getConstNumber(offset + 79, $dim_unit_dec_place);
	}

	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public void dim_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 79, $dim_unit_dec_place, value);
	}

	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public void dim_unit_dec_place(int value) {
		setConstNumber(offset + 79, $dim_unit_dec_place, value);
	}

	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public void dim_unit_dec_place(long value) {
		setConstNumber(offset + 79, $dim_unit_dec_place, value);
	}

	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public void dim_unit_dec_place(float value) {
		setConstNumber(offset + 79, $dim_unit_dec_place, value);
	}

	/**
	 *  容積単位小数部有効桁数.<p>
	 *
	 */
	public void dim_unit_dec_place(double value) {
		setConstNumber(offset + 79, $dim_unit_dec_place, value);
	}


	/**
	 *  重量単位ＣＤ.<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 80, $wt_unit_cd);
	}

	/**
	 *  重量単位ＣＤ.<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 80, $wt_unit_cd, value);
	}


	/**
	 *  重量単位名.<p>
	 *
	 */
	public String wt_unit_nm() {
		return getConstString(offset + 81, $wt_unit_nm);
	}

	/**
	 *  重量単位名.<p>
	 *
	 */
	public void wt_unit_nm(String value) {
		setConstString(offset + 81, $wt_unit_nm, value);
	}


	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber wt_unit_dec_place() {
		return getConstNumber(offset + 82, $wt_unit_dec_place);
	}

	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public void wt_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 82, $wt_unit_dec_place, value);
	}

	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public void wt_unit_dec_place(int value) {
		setConstNumber(offset + 82, $wt_unit_dec_place, value);
	}

	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public void wt_unit_dec_place(long value) {
		setConstNumber(offset + 82, $wt_unit_dec_place, value);
	}

	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public void wt_unit_dec_place(float value) {
		setConstNumber(offset + 82, $wt_unit_dec_place, value);
	}

	/**
	 *  重量単位小数部有効桁数.<p>
	 *
	 */
	public void wt_unit_dec_place(double value) {
		setConstNumber(offset + 82, $wt_unit_dec_place, value);
	}


	/**
	 *  入り目単位ＣＤ.<p>
	 *
	 */
	public String conts_unit_cd() {
		return getConstString(offset + 83, $conts_unit_cd);
	}

	/**
	 *  入り目単位ＣＤ.<p>
	 *
	 */
	public void conts_unit_cd(String value) {
		setConstString(offset + 83, $conts_unit_cd, value);
	}


	/**
	 *  入り目単位名.<p>
	 *
	 */
	public String conts_unit_nm() {
		return getConstString(offset + 84, $conts_unit_nm);
	}

	/**
	 *  入り目単位名.<p>
	 *
	 */
	public void conts_unit_nm(String value) {
		setConstString(offset + 84, $conts_unit_nm, value);
	}


	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber conts_unit_dec_place() {
		return getConstNumber(offset + 85, $conts_unit_dec_place);
	}

	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public void conts_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 85, $conts_unit_dec_place, value);
	}

	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public void conts_unit_dec_place(int value) {
		setConstNumber(offset + 85, $conts_unit_dec_place, value);
	}

	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public void conts_unit_dec_place(long value) {
		setConstNumber(offset + 85, $conts_unit_dec_place, value);
	}

	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public void conts_unit_dec_place(float value) {
		setConstNumber(offset + 85, $conts_unit_dec_place, value);
	}

	/**
	 *  入り目単位小数部有効桁数.<p>
	 *
	 */
	public void conts_unit_dec_place(double value) {
		setConstNumber(offset + 85, $conts_unit_dec_place, value);
	}


	/**
	 *  容積単価.<p>
	 *
	 */
	public MCNumber dim_amt() {
		return getConstNumber(offset + 86, $dim_amt);
	}

	/**
	 *  容積単価.<p>
	 *
	 */
	public void dim_amt(MCNumber value) {
		setConstNumber(offset + 86, $dim_amt, value);
	}

	/**
	 *  容積単価.<p>
	 *
	 */
	public void dim_amt(int value) {
		setConstNumber(offset + 86, $dim_amt, value);
	}

	/**
	 *  容積単価.<p>
	 *
	 */
	public void dim_amt(long value) {
		setConstNumber(offset + 86, $dim_amt, value);
	}

	/**
	 *  容積単価.<p>
	 *
	 */
	public void dim_amt(float value) {
		setConstNumber(offset + 86, $dim_amt, value);
	}

	/**
	 *  容積単価.<p>
	 *
	 */
	public void dim_amt(double value) {
		setConstNumber(offset + 86, $dim_amt, value);
	}


	/**
	 *  容積単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_dim_amt() {
		return getConstString(offset + 87, $s_int_dim_amt);
	}

	/**
	 *  容積単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_dim_amt(String value) {
		setConstString(offset + 87, $s_int_dim_amt, value);
	}


	/**
	 *  容積単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_dim_amt() {
		return getConstString(offset + 88, $s_dec_dim_amt);
	}

	/**
	 *  容積単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_dim_amt(String value) {
		setConstString(offset + 88, $s_dec_dim_amt, value);
	}


	/**
	 *  重量単価.<p>
	 *
	 */
	public MCNumber wt_amt() {
		return getConstNumber(offset + 89, $wt_amt);
	}

	/**
	 *  重量単価.<p>
	 *
	 */
	public void wt_amt(MCNumber value) {
		setConstNumber(offset + 89, $wt_amt, value);
	}

	/**
	 *  重量単価.<p>
	 *
	 */
	public void wt_amt(int value) {
		setConstNumber(offset + 89, $wt_amt, value);
	}

	/**
	 *  重量単価.<p>
	 *
	 */
	public void wt_amt(long value) {
		setConstNumber(offset + 89, $wt_amt, value);
	}

	/**
	 *  重量単価.<p>
	 *
	 */
	public void wt_amt(float value) {
		setConstNumber(offset + 89, $wt_amt, value);
	}

	/**
	 *  重量単価.<p>
	 *
	 */
	public void wt_amt(double value) {
		setConstNumber(offset + 89, $wt_amt, value);
	}


	/**
	 *  重量単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_wt_amt() {
		return getConstString(offset + 90, $s_int_wt_amt);
	}

	/**
	 *  重量単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_wt_amt(String value) {
		setConstString(offset + 90, $s_int_wt_amt, value);
	}


	/**
	 *  重量単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_wt_amt() {
		return getConstString(offset + 91, $s_dec_wt_amt);
	}

	/**
	 *  重量単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_wt_amt(String value) {
		setConstString(offset + 91, $s_dec_wt_amt, value);
	}


	/**
	 *  入り目単価.<p>
	 *
	 */
	public MCNumber conts_amt() {
		return getConstNumber(offset + 92, $conts_amt);
	}

	/**
	 *  入り目単価.<p>
	 *
	 */
	public void conts_amt(MCNumber value) {
		setConstNumber(offset + 92, $conts_amt, value);
	}

	/**
	 *  入り目単価.<p>
	 *
	 */
	public void conts_amt(int value) {
		setConstNumber(offset + 92, $conts_amt, value);
	}

	/**
	 *  入り目単価.<p>
	 *
	 */
	public void conts_amt(long value) {
		setConstNumber(offset + 92, $conts_amt, value);
	}

	/**
	 *  入り目単価.<p>
	 *
	 */
	public void conts_amt(float value) {
		setConstNumber(offset + 92, $conts_amt, value);
	}

	/**
	 *  入り目単価.<p>
	 *
	 */
	public void conts_amt(double value) {
		setConstNumber(offset + 92, $conts_amt, value);
	}


	/**
	 *  入り目単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_conts_amt() {
		return getConstString(offset + 93, $s_int_conts_amt);
	}

	/**
	 *  入り目単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_conts_amt(String value) {
		setConstString(offset + 93, $s_int_conts_amt, value);
	}


	/**
	 *  入り目単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_conts_amt() {
		return getConstString(offset + 94, $s_dec_conts_amt);
	}

	/**
	 *  入り目単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_conts_amt(String value) {
		setConstString(offset + 94, $s_dec_conts_amt, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($s_sum_amt.equalsIgnoreCase(name)) {
			return s_sum_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			return s_int_qty();
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			return s_dec_qty();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($s_int_ave_amt.equalsIgnoreCase(name)) {
			return s_int_ave_amt();
		}
		if ($s_dec_ave_amt.equalsIgnoreCase(name)) {
			return s_dec_ave_amt();
		}
		if ($s_int_std_amt.equalsIgnoreCase(name)) {
			return s_int_std_amt();
		}
		if ($s_dec_std_amt.equalsIgnoreCase(name)) {
			return s_dec_std_amt();
		}
		if ($s_int_dim_qty.equalsIgnoreCase(name)) {
			return s_int_dim_qty();
		}
		if ($s_dec_dim_qty.equalsIgnoreCase(name)) {
			return s_dec_dim_qty();
		}
		if ($s_int_wt_qty.equalsIgnoreCase(name)) {
			return s_int_wt_qty();
		}
		if ($s_dec_wt_qty.equalsIgnoreCase(name)) {
			return s_dec_wt_qty();
		}
		if ($s_int_conts_qty.equalsIgnoreCase(name)) {
			return s_int_conts_qty();
		}
		if ($s_dec_conts_qty.equalsIgnoreCase(name)) {
			return s_dec_conts_qty();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		if ($s_int_dim_amt.equalsIgnoreCase(name)) {
			return s_int_dim_amt();
		}
		if ($s_dec_dim_amt.equalsIgnoreCase(name)) {
			return s_dec_dim_amt();
		}
		if ($s_int_wt_amt.equalsIgnoreCase(name)) {
			return s_int_wt_amt();
		}
		if ($s_dec_wt_amt.equalsIgnoreCase(name)) {
			return s_dec_wt_amt();
		}
		if ($s_int_conts_amt.equalsIgnoreCase(name)) {
			return s_int_conts_amt();
		}
		if ($s_dec_conts_amt.equalsIgnoreCase(name)) {
			return s_dec_conts_amt();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			return sum_amt();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			return ave_amt();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			return dim_qty();
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			return wt_qty();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			return dim_unit_dec_place();
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			return wt_unit_dec_place();
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			return conts_unit_dec_place();
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			return dim_amt();
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			return wt_amt();
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			return conts_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($s_sum_amt.equalsIgnoreCase(name)) {
			return s_sum_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			return s_int_qty();
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			return s_dec_qty();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($s_int_ave_amt.equalsIgnoreCase(name)) {
			return s_int_ave_amt();
		}
		if ($s_dec_ave_amt.equalsIgnoreCase(name)) {
			return s_dec_ave_amt();
		}
		if ($s_int_std_amt.equalsIgnoreCase(name)) {
			return s_int_std_amt();
		}
		if ($s_dec_std_amt.equalsIgnoreCase(name)) {
			return s_dec_std_amt();
		}
		if ($s_int_dim_qty.equalsIgnoreCase(name)) {
			return s_int_dim_qty();
		}
		if ($s_dec_dim_qty.equalsIgnoreCase(name)) {
			return s_dec_dim_qty();
		}
		if ($s_int_wt_qty.equalsIgnoreCase(name)) {
			return s_int_wt_qty();
		}
		if ($s_dec_wt_qty.equalsIgnoreCase(name)) {
			return s_dec_wt_qty();
		}
		if ($s_int_conts_qty.equalsIgnoreCase(name)) {
			return s_int_conts_qty();
		}
		if ($s_dec_conts_qty.equalsIgnoreCase(name)) {
			return s_dec_conts_qty();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		if ($s_int_dim_amt.equalsIgnoreCase(name)) {
			return s_int_dim_amt();
		}
		if ($s_dec_dim_amt.equalsIgnoreCase(name)) {
			return s_dec_dim_amt();
		}
		if ($s_int_wt_amt.equalsIgnoreCase(name)) {
			return s_int_wt_amt();
		}
		if ($s_dec_wt_amt.equalsIgnoreCase(name)) {
			return s_dec_wt_amt();
		}
		if ($s_int_conts_amt.equalsIgnoreCase(name)) {
			return s_int_conts_amt();
		}
		if ($s_dec_conts_amt.equalsIgnoreCase(name)) {
			return s_dec_conts_amt();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			return sum_amt();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			return ave_amt();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			return dim_qty();
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			return wt_qty();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			return dim_unit_dec_place();
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			return wt_unit_dec_place();
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			return conts_unit_dec_place();
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			return dim_amt();
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			return wt_amt();
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			return conts_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($s_sum_amt.equalsIgnoreCase(name)) {
			s_sum_amt(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			s_int_qty(value);
			return;
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			s_dec_qty(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($s_int_ave_amt.equalsIgnoreCase(name)) {
			s_int_ave_amt(value);
			return;
		}
		if ($s_dec_ave_amt.equalsIgnoreCase(name)) {
			s_dec_ave_amt(value);
			return;
		}
		if ($s_int_std_amt.equalsIgnoreCase(name)) {
			s_int_std_amt(value);
			return;
		}
		if ($s_dec_std_amt.equalsIgnoreCase(name)) {
			s_dec_std_amt(value);
			return;
		}
		if ($s_int_dim_qty.equalsIgnoreCase(name)) {
			s_int_dim_qty(value);
			return;
		}
		if ($s_dec_dim_qty.equalsIgnoreCase(name)) {
			s_dec_dim_qty(value);
			return;
		}
		if ($s_int_wt_qty.equalsIgnoreCase(name)) {
			s_int_wt_qty(value);
			return;
		}
		if ($s_dec_wt_qty.equalsIgnoreCase(name)) {
			s_dec_wt_qty(value);
			return;
		}
		if ($s_int_conts_qty.equalsIgnoreCase(name)) {
			s_int_conts_qty(value);
			return;
		}
		if ($s_dec_conts_qty.equalsIgnoreCase(name)) {
			s_dec_conts_qty(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		if ($s_int_dim_amt.equalsIgnoreCase(name)) {
			s_int_dim_amt(value);
			return;
		}
		if ($s_dec_dim_amt.equalsIgnoreCase(name)) {
			s_dec_dim_amt(value);
			return;
		}
		if ($s_int_wt_amt.equalsIgnoreCase(name)) {
			s_int_wt_amt(value);
			return;
		}
		if ($s_dec_wt_amt.equalsIgnoreCase(name)) {
			s_dec_wt_amt(value);
			return;
		}
		if ($s_int_conts_amt.equalsIgnoreCase(name)) {
			s_int_conts_amt(value);
			return;
		}
		if ($s_dec_conts_amt.equalsIgnoreCase(name)) {
			s_dec_conts_amt(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($s_sum_amt.equalsIgnoreCase(name)) {
			s_sum_amt(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			s_int_qty(value);
			return;
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			s_dec_qty(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($s_int_ave_amt.equalsIgnoreCase(name)) {
			s_int_ave_amt(value);
			return;
		}
		if ($s_dec_ave_amt.equalsIgnoreCase(name)) {
			s_dec_ave_amt(value);
			return;
		}
		if ($s_int_std_amt.equalsIgnoreCase(name)) {
			s_int_std_amt(value);
			return;
		}
		if ($s_dec_std_amt.equalsIgnoreCase(name)) {
			s_dec_std_amt(value);
			return;
		}
		if ($s_int_dim_qty.equalsIgnoreCase(name)) {
			s_int_dim_qty(value);
			return;
		}
		if ($s_dec_dim_qty.equalsIgnoreCase(name)) {
			s_dec_dim_qty(value);
			return;
		}
		if ($s_int_wt_qty.equalsIgnoreCase(name)) {
			s_int_wt_qty(value);
			return;
		}
		if ($s_dec_wt_qty.equalsIgnoreCase(name)) {
			s_dec_wt_qty(value);
			return;
		}
		if ($s_int_conts_qty.equalsIgnoreCase(name)) {
			s_int_conts_qty(value);
			return;
		}
		if ($s_dec_conts_qty.equalsIgnoreCase(name)) {
			s_dec_conts_qty(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		if ($s_int_dim_amt.equalsIgnoreCase(name)) {
			s_int_dim_amt(value);
			return;
		}
		if ($s_dec_dim_amt.equalsIgnoreCase(name)) {
			s_dec_dim_amt(value);
			return;
		}
		if ($s_int_wt_amt.equalsIgnoreCase(name)) {
			s_int_wt_amt(value);
			return;
		}
		if ($s_dec_wt_amt.equalsIgnoreCase(name)) {
			s_dec_wt_amt(value);
			return;
		}
		if ($s_int_conts_amt.equalsIgnoreCase(name)) {
			s_int_conts_amt(value);
			return;
		}
		if ($s_dec_conts_amt.equalsIgnoreCase(name)) {
			s_dec_conts_amt(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($ave_amt.equalsIgnoreCase(name)) {
			ave_amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($dim_qty.equalsIgnoreCase(name)) {
			dim_qty(value);
			return;
		}
		if ($wt_qty.equalsIgnoreCase(name)) {
			wt_qty(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($dim_unit_dec_place.equalsIgnoreCase(name)) {
			dim_unit_dec_place(value);
			return;
		}
		if ($wt_unit_dec_place.equalsIgnoreCase(name)) {
			wt_unit_dec_place(value);
			return;
		}
		if ($conts_unit_dec_place.equalsIgnoreCase(name)) {
			conts_unit_dec_place(value);
			return;
		}
		if ($dim_amt.equalsIgnoreCase(name)) {
			dim_amt(value);
			return;
		}
		if ($wt_amt.equalsIgnoreCase(name)) {
			wt_amt(value);
			return;
		}
		if ($conts_amt.equalsIgnoreCase(name)) {
			conts_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

