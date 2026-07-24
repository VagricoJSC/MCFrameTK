package mcframe.commonMSBE.MSBER0200;

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
 * ブロック"IvDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IvDtlR_MC_A extends MCConstRow {

	/**
	 *  固定文字列.<p>
	 *
	 */
	public static final String $t_cust = "t_cust";
	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  得意先注文ＮＯ２.<p>
	 *
	 */
	public static final String $cst_po_no2 = "cst_po_no2";
	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 *  得意先注文明細ＮＯ２.<p>
	 *
	 */
	public static final String $cst_po_d_no2 = "cst_po_d_no2";
	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public static final String $t_itm_code = "t_itm_code";
	/**
	 *  （ラベル）Customer P/O NO.<p>
	 *
	 */
	public static final String $t_po_no = "t_po_no";
	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public static final String $t_qty = "t_qty";
	/**
	 *  （ラベル）Unit Price.<p>
	 *
	 */
	public static final String $t_upri = "t_upri";
	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public static final String $t_amt = "t_amt";
	/**
	 *  （ラベル）Tax Rate.<p>
	 *
	 */
	public static final String $t_tax_rate = "t_tax_rate";
	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public static final String $t_tax_amt = "t_tax_amt";
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
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 *  原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  入力単位数量（文字列）.<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
	/**
	 *  入力単位数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  入力単位数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unit_dec_place = "unit_dec_place";
	/**
	 *  入力単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  入力単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位数量（文字列）.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  基準単位数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_qty = "s_int_base_unit_qty";
	/**
	 *  基準単位数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_qty = "s_dec_base_unit_qty";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  単価（データ）.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  単価（文字列）.<p>
	 *
	 */
	public static final String $s_trd_cur_upri = "s_trd_cur_upri";
	/**
	 *  単価（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_upri = "s_int_trd_cur_upri";
	/**
	 *  単価（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_upri = "s_dec_trd_cur_upri";
	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 *  金額（データ）.<p>
	 *
	 */
	public static final String $d_amt = "d_amt";
	/**
	 *  金額（文字列）.<p>
	 *
	 */
	public static final String $s_d_amt = "s_d_amt";
	/**
	 *  金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_d_amt = "s_int_d_amt";
	/**
	 *  金額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_d_amt = "s_dec_d_amt";
	/**
	 *  税率（データ）.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  税率（文字列）.<p>
	 *
	 */
	public static final String $s_tax_rate = "s_tax_rate";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  （ラベル）Tax inclusive.<p>
	 *
	 */
	public static final String $t_tax_inclusive = "t_tax_inclusive";
	/**
	 *  税額（データ）.<p>
	 *
	 */
	public static final String $d_tax_amt = "d_tax_amt";
	/**
	 *  税額（文字列）.<p>
	 *
	 */
	public static final String $s_d_tax_amt = "s_d_tax_amt";
	/**
	 *  税額（整数部）.<p>
	 *
	 */
	public static final String $s_int_d_tax_amt = "s_int_d_tax_amt";
	/**
	 *  税額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_d_tax_amt = "s_dec_d_tax_amt";
	/**
	 *  基準単位名（単価用）.<p>
	 *
	 */
	public static final String $upri_base_unit_nm = "upri_base_unit_nm";
	/**
	 *  基準単位ＣＤ（単価用）.<p>
	 *
	 */
	public static final String $upri_base_unit_cd = "upri_base_unit_cd";
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
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 *  納税通貨金額（文字列）.<p>
	 *
	 */
	public static final String $s_ptax_cur_amt = "s_ptax_cur_amt";
	/**
	 *  納税通貨金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_ptax_cur_amt = "s_int_ptax_cur_amt";
	/**
	 *  納税通貨金額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_ptax_cur_amt = "s_dec_ptax_cur_amt";
	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 *  源泉税額（文字列）.<p>
	 *
	 */
	public static final String $s_wtax_amt = "s_wtax_amt";
	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm1 = "iv_itm_alt_nm1";
	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm2 = "iv_itm_alt_nm2";
	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm3 = "iv_itm_alt_nm3";
	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm4 = "iv_itm_alt_nm4";
	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 *  得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 *  品目ＣＤ２.<p>
	 *
	 */
	public static final String $itm_cd2 = "itm_cd2";
	/**
	 *  枝番１（表示用）２.<p>
	 *
	 */
	public static final String $itm_sub1_view2 = "itm_sub1_view2";
	/**
	 *  枝番２（表示用）２.<p>
	 *
	 */
	public static final String $itm_sub2_view2 = "itm_sub2_view2";
	/**
	 *  枝番３（表示用）２.<p>
	 *
	 */
	public static final String $itm_sub3_view2 = "itm_sub3_view2";
	/**
	 *  枝番１（データ）２.<p>
	 *
	 */
	public static final String $itm_sub1_data2 = "itm_sub1_data2";
	/**
	 *  枝番２（データ）２.<p>
	 *
	 */
	public static final String $itm_sub2_data2 = "itm_sub2_data2";
	/**
	 *  枝番３（データ）２.<p>
	 *
	 */
	public static final String $itm_sub3_data2 = "itm_sub3_data2";
	/**
	 *  原産地名２.<p>
	 *
	 */
	public static final String $cntry_org_nm2 = "cntry_org_nm2";
	/**
	 *  原産地ＣＤ２.<p>
	 *
	 */
	public static final String $cntry_org_cd2 = "cntry_org_cd2";
	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public static final String $trd_unit_qty2 = "trd_unit_qty2";
	/**
	 *  入力単位数量２（文字列）.<p>
	 *
	 */
	public static final String $s_trd_unit_qty2 = "s_trd_unit_qty2";
	/**
	 *  入力単位数量２（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty2 = "s_int_trd_unit_qty2";
	/**
	 *  入力単位数量２（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty2 = "s_dec_trd_unit_qty2";
	/**
	 *  入力単位名２.<p>
	 *
	 */
	public static final String $trd_unit_nm2 = "trd_unit_nm2";
	/**
	 *  入力単位ＣＤ２.<p>
	 *
	 */
	public static final String $trd_unit_cd2 = "trd_unit_cd2";
	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public static final String $base_unit_qty2 = "base_unit_qty2";
	/**
	 *  基準単位数量２（文字列）.<p>
	 *
	 */
	public static final String $s_base_unit_qty2 = "s_base_unit_qty2";
	/**
	 *  基準単位数量２（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_qty2 = "s_int_base_unit_qty2";
	/**
	 *  基準単位数量２（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_qty2 = "s_dec_base_unit_qty2";
	/**
	 *  基準単位名２.<p>
	 *
	 */
	public static final String $base_unit_nm2 = "base_unit_nm2";
	/**
	 *  基準単位ＣＤ２.<p>
	 *
	 */
	public static final String $base_unit_cd2 = "base_unit_cd2";
	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	/**
	 *  インボイス表記単価（文字列）.<p>
	 *
	 */
	public static final String $s_iv_upri = "s_iv_upri";
	/**
	 *  インボイス表記単価（整数部）.<p>
	 *
	 */
	public static final String $s_int_iv_upri = "s_int_iv_upri";
	/**
	 *  インボイス表記単価（小数部）.<p>
	 *
	 */
	public static final String $s_dec_iv_upri = "s_dec_iv_upri";
	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public static final String $iv_amt = "iv_amt";
	/**
	 *  インボイス金額（文字列）.<p>
	 *
	 */
	public static final String $s_iv_amt = "s_iv_amt";
	/**
	 *  インボイス金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_d_iv_amt = "s_int_d_iv_amt";
	/**
	 *  インボイス金額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_d_iv_amt = "s_dec_d_iv_amt";
	/**
	 *  基準単位名（インボイス表記単価用）.<p>
	 *
	 */
	public static final String $iv_upri_base_unit_nm = "iv_upri_base_unit_nm";
	/**
	 *  基準単位ＣＤ（インボイス表記単価用）.<p>
	 *
	 */
	public static final String $iv_upri_base_unit_cd = "iv_upri_base_unit_cd";
	/**
	 *  インボイス表記用品名２.<p>
	 *
	 */
	public static final String $iv_itm_nm2 = "iv_itm_nm2";
	/**
	 *  インボイス表記用品目２別名１.<p>
	 *
	 */
	public static final String $iv_itm2_alt_nm1 = "iv_itm2_alt_nm1";
	/**
	 *  インボイス表記用品目２別名２.<p>
	 *
	 */
	public static final String $iv_itm2_alt_nm2 = "iv_itm2_alt_nm2";
	/**
	 *  インボイス表記用品目２別名３.<p>
	 *
	 */
	public static final String $iv_itm2_alt_nm3 = "iv_itm2_alt_nm3";
	/**
	 *  インボイス表記用品目２別名４.<p>
	 *
	 */
	public static final String $iv_itm2_alt_nm4 = "iv_itm2_alt_nm4";
	/**
	 *  得意先品目ＣＤ２.<p>
	 *
	 */
	public static final String $cst_itm_cd2 = "cst_itm_cd2";
	/**
	 *  得意先品名２.<p>
	 *
	 */
	public static final String $cst_itm_nm2 = "cst_itm_nm2";
	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public static final String $t_total = "t_total";
	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public static final String $t_total2 = "t_total2";
	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public static final String $sum_trd_unit_qty = "sum_trd_unit_qty";
	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public static final String $s_sum_trd_unit_qty = "s_sum_trd_unit_qty";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $sum_trd_unit_nm = "sum_trd_unit_nm";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $sum_trd_unit_cd = "sum_trd_unit_cd";
	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public static final String $sum_trd_unit_qty2 = "sum_trd_unit_qty2";
	/**
	 *  取引単位数量合計２（文字列）.<p>
	 *
	 */
	public static final String $s_sum_trd_unit_qty2 = "s_sum_trd_unit_qty2";
	/**
	 *  取引単位名２.<p>
	 *
	 */
	public static final String $sum_trd_unit_nm2 = "sum_trd_unit_nm2";
	/**
	 *  取引単位ＣＤ２.<p>
	 *
	 */
	public static final String $sum_trd_unit_cd2 = "sum_trd_unit_cd2";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $iv_d_sub_char1 = "iv_d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $iv_d_sub_char2 = "iv_d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $iv_d_sub_char3 = "iv_d_sub_char3";
	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public static final String $t_sum_amt = "t_sum_amt";
	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public static final String $t_sum_tax_amt = "t_sum_tax_amt";
	/**
	 *  （ラベル）F.O.B.<p>
	 *
	 */
	public static final String $f_fob = "f_fob";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $fob_cur_nm = "fob_cur_nm";
	/**
	 *  金額１.<p>
	 *
	 */
	public static final String $d_fob_amt = "d_fob_amt";
	/**
	 *  金額１（文字列）.<p>
	 *
	 */
	public static final String $s_d_fob_amt = "s_d_fob_amt";
	/**
	 *  税額１.<p>
	 *
	 */
	public static final String $d_fob_tax_amt = "d_fob_tax_amt";
	/**
	 *  税額１（文字列）.<p>
	 *
	 */
	public static final String $s_d_fob_tax_amt = "s_d_fob_tax_amt";
	/**
	 *  受渡条件名.<p>
	 *
	 */
	public static final String $d_tterm_nm1 = "d_tterm_nm1";
	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public static final String $d_tterm_cd1 = "d_tterm_cd1";
	/**
	 *  受渡場所名.<p>
	 *
	 */
	public static final String $d_tterm_nm2 = "d_tterm_nm2";
	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public static final String $d_tterm_cd2 = "d_tterm_cd2";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $f_cur_nm = "f_cur_nm";
	/**
	 *  通貨ＣＤ（データ）.<p>
	 *
	 */
	public static final String $f_cur_cd = "f_cur_cd";
	/**
	 *  合計金額.<p>
	 *
	 */
	public static final String $f_amt = "f_amt";
	/**
	 *  合計金額（文字列）.<p>
	 *
	 */
	public static final String $s_f_amt = "s_f_amt";
	/**
	 *  合計税額.<p>
	 *
	 */
	public static final String $f_tax_amt = "f_tax_amt";
	/**
	 *  合計税額（文字列）.<p>
	 *
	 */
	public static final String $s_f_tax_amt = "s_f_tax_amt";
	/**
	 *  （ラベル）No Commercial Value.<p>
	 *
	 */
	public static final String $t_no_com = "t_no_com";
	/**
	 *  通貨名２.<p>
	 *
	 */
	public static final String $f_cur_nm2 = "f_cur_nm2";
	/**
	 *  無償金額合計.<p>
	 *
	 */
	public static final String $d_ncv_amt = "d_ncv_amt";
	/**
	 *  無償金額合計（文字列）.<p>
	 *
	 */
	public static final String $s_d_ncv_amt = "s_d_ncv_amt";
	/**
	 *  通貨ＣＤ２（データ）.<p>
	 *
	 */
	public static final String $f_cur_cd2 = "f_cur_cd2";
	/**
	 *  原産地.<p>
	 *
	 */
	public static final String $f_cntry_org_cd = "f_cntry_org_cd";
	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public static final String $t_made_in = "t_made_in";
	/**
	 *  原産地名.<p>
	 *
	 */
	public static final String $f_cntry_org_nm = "f_cntry_org_nm";
	/**
	 *  自由入力（罫線部分）.<p>
	 *
	 */
	public static final String $free = "free";


	public static final MCMeta t_cust_META = createStringMeta($t_cust);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_no2_META = createCommonMeta($cst_po_no2, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_po_d_no2_META = createCommonMeta($cst_po_d_no2, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta t_itm_code_META = createStringMeta($t_itm_code);
	public static final MCMeta t_po_no_META = createStringMeta($t_po_no);
	public static final MCMeta t_qty_META = createStringMeta($t_qty);
	public static final MCMeta t_upri_META = createStringMeta($t_upri);
	public static final MCMeta t_amt_META = createStringMeta($t_amt);
	public static final MCMeta t_tax_rate_META = createStringMeta($t_tax_rate);
	public static final MCMeta t_tax_amt_META = createStringMeta($t_tax_amt);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta unit_dec_place_META = createCommonMeta($unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta s_int_base_unit_qty_META = createStringMeta($s_int_base_unit_qty);
	public static final MCMeta s_dec_base_unit_qty_META = createStringMeta($s_dec_base_unit_qty);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_upri_META = createStringMeta($s_trd_cur_upri);
	public static final MCMeta s_int_trd_cur_upri_META = createStringMeta($s_int_trd_cur_upri);
	public static final MCMeta s_dec_trd_cur_upri_META = createStringMeta($s_dec_trd_cur_upri);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta d_amt_META = createCommonMeta($d_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_d_amt_META = createStringMeta($s_d_amt);
	public static final MCMeta s_int_d_amt_META = createStringMeta($s_int_d_amt);
	public static final MCMeta s_dec_d_amt_META = createStringMeta($s_dec_d_amt);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate_META = createStringMeta($s_tax_rate);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta t_tax_inclusive_META = createStringMeta($t_tax_inclusive);
	public static final MCMeta d_tax_amt_META = createCommonMeta($d_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_d_tax_amt_META = createStringMeta($s_d_tax_amt);
	public static final MCMeta s_int_d_tax_amt_META = createStringMeta($s_int_d_tax_amt);
	public static final MCMeta s_dec_d_tax_amt_META = createStringMeta($s_dec_d_tax_amt);
	public static final MCMeta upri_base_unit_nm_META = createCommonMeta($upri_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta upri_base_unit_cd_META = createCommonMeta($upri_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ptax_cur_amt_META = createStringMeta($s_ptax_cur_amt);
	public static final MCMeta s_int_ptax_cur_amt_META = createStringMeta($s_int_ptax_cur_amt);
	public static final MCMeta s_dec_ptax_cur_amt_META = createStringMeta($s_dec_ptax_cur_amt);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_wtax_amt_META = createStringMeta($s_wtax_amt);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_alt_nm1_META = createCommonMeta($iv_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta iv_itm_alt_nm2_META = createCommonMeta($iv_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta iv_itm_alt_nm3_META = createCommonMeta($iv_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta iv_itm_alt_nm4_META = createCommonMeta($iv_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_cd2_META = createCommonMeta($itm_cd2, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view2_META = createCommonMeta($itm_sub1_view2, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view2_META = createCommonMeta($itm_sub2_view2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view2_META = createCommonMeta($itm_sub3_view2, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data2_META = createCommonMeta($itm_sub1_data2, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data2_META = createCommonMeta($itm_sub2_data2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data2_META = createCommonMeta($itm_sub3_data2, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cntry_org_nm2_META = createCommonMeta($cntry_org_nm2, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cntry_org_cd2_META = createCommonMeta($cntry_org_cd2, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta trd_unit_qty2_META = createCommonMeta($trd_unit_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty2_META = createStringMeta($s_trd_unit_qty2);
	public static final MCMeta s_int_trd_unit_qty2_META = createStringMeta($s_int_trd_unit_qty2);
	public static final MCMeta s_dec_trd_unit_qty2_META = createStringMeta($s_dec_trd_unit_qty2);
	public static final MCMeta trd_unit_nm2_META = createCommonMeta($trd_unit_nm2, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_cd2_META = createCommonMeta($trd_unit_cd2, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty2_META = createCommonMeta($base_unit_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty2_META = createStringMeta($s_base_unit_qty2);
	public static final MCMeta s_int_base_unit_qty2_META = createStringMeta($s_int_base_unit_qty2);
	public static final MCMeta s_dec_base_unit_qty2_META = createStringMeta($s_dec_base_unit_qty2);
	public static final MCMeta base_unit_nm2_META = createCommonMeta($base_unit_nm2, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_cd2_META = createCommonMeta($base_unit_cd2, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_iv_upri_META = createStringMeta($s_iv_upri);
	public static final MCMeta s_int_iv_upri_META = createStringMeta($s_int_iv_upri);
	public static final MCMeta s_dec_iv_upri_META = createStringMeta($s_dec_iv_upri);
	public static final MCMeta iv_amt_META = createCommonMeta($iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_iv_amt_META = createStringMeta($s_iv_amt);
	public static final MCMeta s_int_d_iv_amt_META = createStringMeta($s_int_d_iv_amt);
	public static final MCMeta s_dec_d_iv_amt_META = createStringMeta($s_dec_d_iv_amt);
	public static final MCMeta iv_upri_base_unit_nm_META = createCommonMeta($iv_upri_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta iv_upri_base_unit_cd_META = createCommonMeta($iv_upri_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta iv_itm_nm2_META = createCommonMeta($iv_itm_nm2, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm2_alt_nm1_META = createCommonMeta($iv_itm2_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta iv_itm2_alt_nm2_META = createCommonMeta($iv_itm2_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta iv_itm2_alt_nm3_META = createCommonMeta($iv_itm2_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta iv_itm2_alt_nm4_META = createCommonMeta($iv_itm2_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta cst_itm_cd2_META = createCommonMeta($cst_itm_cd2, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta cst_itm_nm2_META = createCommonMeta($cst_itm_nm2, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta t_total_META = createStringMeta($t_total);
	public static final MCMeta t_total2_META = createStringMeta($t_total2);
	public static final MCMeta sum_trd_unit_qty_META = createCommonMeta($sum_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_sum_trd_unit_qty_META = createStringMeta($s_sum_trd_unit_qty);
	public static final MCMeta sum_trd_unit_nm_META = createCommonMeta($sum_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta sum_trd_unit_cd_META = createCommonMeta($sum_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta sum_trd_unit_qty2_META = createCommonMeta($sum_trd_unit_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_sum_trd_unit_qty2_META = createStringMeta($s_sum_trd_unit_qty2);
	public static final MCMeta sum_trd_unit_nm2_META = createCommonMeta($sum_trd_unit_nm2, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta sum_trd_unit_cd2_META = createCommonMeta($sum_trd_unit_cd2, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta iv_d_sub_char1_META = createCommonMeta($iv_d_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_d_sub_char2_META = createCommonMeta($iv_d_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_d_sub_char3_META = createCommonMeta($iv_d_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta t_sum_amt_META = createStringMeta($t_sum_amt);
	public static final MCMeta t_sum_tax_amt_META = createStringMeta($t_sum_tax_amt);
	public static final MCMeta f_fob_META = createStringMeta($f_fob);
	public static final MCMeta fob_cur_nm_META = createCommonMeta($fob_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta d_fob_amt_META = createCommonMeta($d_fob_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_d_fob_amt_META = createStringMeta($s_d_fob_amt);
	public static final MCMeta d_fob_tax_amt_META = createCommonMeta($d_fob_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_d_fob_tax_amt_META = createStringMeta($s_d_fob_tax_amt);
	public static final MCMeta d_tterm_nm1_META = createCommonMeta($d_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta d_tterm_cd1_META = createCommonMeta($d_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta d_tterm_nm2_META = createCommonMeta($d_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta d_tterm_cd2_META = createCommonMeta($d_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta f_cur_nm_META = createCommonMeta($f_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta f_cur_cd_META = createCommonMeta($f_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta f_amt_META = createCommonMeta($f_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_f_amt_META = createStringMeta($s_f_amt);
	public static final MCMeta f_tax_amt_META = createCommonMeta($f_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_f_tax_amt_META = createStringMeta($s_f_tax_amt);
	public static final MCMeta t_no_com_META = createStringMeta($t_no_com);
	public static final MCMeta f_cur_nm2_META = createCommonMeta($f_cur_nm2, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta d_ncv_amt_META = createCommonMeta($d_ncv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_d_ncv_amt_META = createStringMeta($s_d_ncv_amt);
	public static final MCMeta f_cur_cd2_META = createCommonMeta($f_cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta f_cntry_org_cd_META = createCommonMeta($f_cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta t_made_in_META = createStringMeta($t_made_in);
	public static final MCMeta f_cntry_org_nm_META = createCommonMeta($f_cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta free_META = createStringMeta($free);

	protected static final ConstMetaList<IvDtlR> constMetas = new ConstMetaList<IvDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			t_cust_META,
			cst_po_no_META,
			cst_po_no2_META,
			cst_po_d_no_META,
			cst_po_d_no2_META,
			t_itm_code_META,
			t_po_no_META,
			t_qty_META,
			t_upri_META,
			t_amt_META,
			t_tax_rate_META,
			t_tax_amt_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			unit_dec_place_META,
			trd_unit_nm_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			s_int_base_unit_qty_META,
			s_dec_base_unit_qty_META,
			base_unit_nm_META,
			base_unit_cd_META,
			trd_cur_upri_META,
			s_trd_cur_upri_META,
			s_int_trd_cur_upri_META,
			s_dec_trd_cur_upri_META,
			base_unit_dec_place_META,
			d_amt_META,
			s_d_amt_META,
			s_int_d_amt_META,
			s_dec_d_amt_META,
			tax_rate_META,
			s_tax_rate_META,
			inc_tax_flg_META,
			t_tax_inclusive_META,
			d_tax_amt_META,
			s_d_tax_amt_META,
			s_int_d_tax_amt_META,
			s_dec_d_tax_amt_META,
			upri_base_unit_nm_META,
			upri_base_unit_cd_META,
			upri_dec_place_META,
			amt_dec_place_META,
			ptax_cur_cd_META,
			ptax_cur_amt_META,
			s_ptax_cur_amt_META,
			s_int_ptax_cur_amt_META,
			s_dec_ptax_cur_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			s_wtax_amt_META,
			iv_itm_nm_META,
			iv_itm_alt_nm1_META,
			iv_itm_alt_nm2_META,
			iv_itm_alt_nm3_META,
			iv_itm_alt_nm4_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_cd2_META,
			itm_sub1_view2_META,
			itm_sub2_view2_META,
			itm_sub3_view2_META,
			itm_sub1_data2_META,
			itm_sub2_data2_META,
			itm_sub3_data2_META,
			cntry_org_nm2_META,
			cntry_org_cd2_META,
			trd_unit_qty2_META,
			s_trd_unit_qty2_META,
			s_int_trd_unit_qty2_META,
			s_dec_trd_unit_qty2_META,
			trd_unit_nm2_META,
			trd_unit_cd2_META,
			base_unit_qty2_META,
			s_base_unit_qty2_META,
			s_int_base_unit_qty2_META,
			s_dec_base_unit_qty2_META,
			base_unit_nm2_META,
			base_unit_cd2_META,
			iv_upri_META,
			s_iv_upri_META,
			s_int_iv_upri_META,
			s_dec_iv_upri_META,
			iv_amt_META,
			s_iv_amt_META,
			s_int_d_iv_amt_META,
			s_dec_d_iv_amt_META,
			iv_upri_base_unit_nm_META,
			iv_upri_base_unit_cd_META,
			iv_itm_nm2_META,
			iv_itm2_alt_nm1_META,
			iv_itm2_alt_nm2_META,
			iv_itm2_alt_nm3_META,
			iv_itm2_alt_nm4_META,
			cst_itm_cd2_META,
			cst_itm_nm2_META,
			t_total_META,
			t_total2_META,
			sum_trd_unit_qty_META,
			s_sum_trd_unit_qty_META,
			sum_trd_unit_nm_META,
			sum_trd_unit_cd_META,
			sum_trd_unit_qty2_META,
			s_sum_trd_unit_qty2_META,
			sum_trd_unit_nm2_META,
			sum_trd_unit_cd2_META,
			disp_seq_META,
			iv_d_sub_char1_META,
			iv_d_sub_char2_META,
			iv_d_sub_char3_META,
			t_sum_amt_META,
			t_sum_tax_amt_META,
			f_fob_META,
			fob_cur_nm_META,
			d_fob_amt_META,
			s_d_fob_amt_META,
			d_fob_tax_amt_META,
			s_d_fob_tax_amt_META,
			d_tterm_nm1_META,
			d_tterm_cd1_META,
			d_tterm_nm2_META,
			d_tterm_cd2_META,
			f_cur_nm_META,
			f_cur_cd_META,
			f_amt_META,
			s_f_amt_META,
			f_tax_amt_META,
			s_f_tax_amt_META,
			t_no_com_META,
			f_cur_nm2_META,
			d_ncv_amt_META,
			s_d_ncv_amt_META,
			f_cur_cd2_META,
			f_cntry_org_cd_META,
			t_made_in_META,
			f_cntry_org_nm_META,
			free_META
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
	protected IvDtlR_MC_A(ConstMetaList<? extends IvDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvDtlR clone() {
		return (IvDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvDtlR createInstance() {
		return (IvDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IvDtlR getValues(String... names) {
		return (IvDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  固定文字列.<p>
	 *
	 */
	public String t_cust() {
		return getConstString(offset + 0, $t_cust);
	}

	/**
	 *  固定文字列.<p>
	 *
	 */
	public void t_cust(String value) {
		setConstString(offset + 0, $t_cust, value);
	}


	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 1, $cst_po_no);
	}

	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 1, $cst_po_no, value);
	}


	/**
	 *  得意先注文ＮＯ２.<p>
	 *
	 */
	public String cst_po_no2() {
		return getConstString(offset + 2, $cst_po_no2);
	}

	/**
	 *  得意先注文ＮＯ２.<p>
	 *
	 */
	public void cst_po_no2(String value) {
		setConstString(offset + 2, $cst_po_no2, value);
	}


	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 3, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 3, $cst_po_d_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ２.<p>
	 *
	 */
	public String cst_po_d_no2() {
		return getConstString(offset + 4, $cst_po_d_no2);
	}

	/**
	 *  得意先注文明細ＮＯ２.<p>
	 *
	 */
	public void cst_po_d_no2(String value) {
		setConstString(offset + 4, $cst_po_d_no2, value);
	}


	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public String t_itm_code() {
		return getConstString(offset + 5, $t_itm_code);
	}

	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public void t_itm_code(String value) {
		setConstString(offset + 5, $t_itm_code, value);
	}


	/**
	 *  （ラベル）Customer P/O NO.<p>
	 *
	 */
	public String t_po_no() {
		return getConstString(offset + 6, $t_po_no);
	}

	/**
	 *  （ラベル）Customer P/O NO.<p>
	 *
	 */
	public void t_po_no(String value) {
		setConstString(offset + 6, $t_po_no, value);
	}


	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public String t_qty() {
		return getConstString(offset + 7, $t_qty);
	}

	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public void t_qty(String value) {
		setConstString(offset + 7, $t_qty, value);
	}


	/**
	 *  （ラベル）Unit Price.<p>
	 *
	 */
	public String t_upri() {
		return getConstString(offset + 8, $t_upri);
	}

	/**
	 *  （ラベル）Unit Price.<p>
	 *
	 */
	public void t_upri(String value) {
		setConstString(offset + 8, $t_upri, value);
	}


	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public String t_amt() {
		return getConstString(offset + 9, $t_amt);
	}

	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public void t_amt(String value) {
		setConstString(offset + 9, $t_amt, value);
	}


	/**
	 *  （ラベル）Tax Rate.<p>
	 *
	 */
	public String t_tax_rate() {
		return getConstString(offset + 10, $t_tax_rate);
	}

	/**
	 *  （ラベル）Tax Rate.<p>
	 *
	 */
	public void t_tax_rate(String value) {
		setConstString(offset + 10, $t_tax_rate, value);
	}


	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public String t_tax_amt() {
		return getConstString(offset + 11, $t_tax_amt);
	}

	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public void t_tax_amt(String value) {
		setConstString(offset + 11, $t_tax_amt, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 13, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 13, $itm_sub1_view, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 14, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 14, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 15, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 15, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 16, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 16, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 17, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 17, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 18, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 18, $itm_sub3_data, value);
	}


	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 19, $cntry_org_cd);
	}

	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 19, $cntry_org_cd, value);
	}


	/**
	 *  原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 20, $cntry_org_nm);
	}

	/**
	 *  原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 20, $cntry_org_nm, value);
	}


	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 21, $trd_unit_qty);
	}

	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 21, $trd_unit_qty, value);
	}

	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 21, $trd_unit_qty, value);
	}

	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 21, $trd_unit_qty, value);
	}

	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 21, $trd_unit_qty, value);
	}

	/**
	 *  入力単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 21, $trd_unit_qty, value);
	}


	/**
	 *  入力単位数量（文字列）.<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 22, $s_trd_unit_qty);
	}

	/**
	 *  入力単位数量（文字列）.<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 22, $s_trd_unit_qty, value);
	}


	/**
	 *  入力単位数量（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 23, $s_int_trd_unit_qty);
	}

	/**
	 *  入力単位数量（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 23, $s_int_trd_unit_qty, value);
	}


	/**
	 *  入力単位数量（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 24, $s_dec_trd_unit_qty);
	}

	/**
	 *  入力単位数量（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 24, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unit_dec_place() {
		return getConstNumber(offset + 25, $unit_dec_place);
	}

	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $unit_dec_place, value);
	}

	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(int value) {
		setConstNumber(offset + 25, $unit_dec_place, value);
	}

	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(long value) {
		setConstNumber(offset + 25, $unit_dec_place, value);
	}

	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(float value) {
		setConstNumber(offset + 25, $unit_dec_place, value);
	}

	/**
	 *  入力単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(double value) {
		setConstNumber(offset + 25, $unit_dec_place, value);
	}


	/**
	 *  入力単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 26, $trd_unit_nm);
	}

	/**
	 *  入力単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 26, $trd_unit_nm, value);
	}


	/**
	 *  入力単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 27, $trd_unit_cd);
	}

	/**
	 *  入力単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 27, $trd_unit_cd, value);
	}


	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 28, $base_unit_qty);
	}

	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量（データ）.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}


	/**
	 *  基準単位数量（文字列）.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 29, $s_base_unit_qty);
	}

	/**
	 *  基準単位数量（文字列）.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 29, $s_base_unit_qty, value);
	}


	/**
	 *  基準単位数量（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_qty() {
		return getConstString(offset + 30, $s_int_base_unit_qty);
	}

	/**
	 *  基準単位数量（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_qty(String value) {
		setConstString(offset + 30, $s_int_base_unit_qty, value);
	}


	/**
	 *  基準単位数量（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_qty() {
		return getConstString(offset + 31, $s_dec_base_unit_qty);
	}

	/**
	 *  基準単位数量（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_qty(String value) {
		setConstString(offset + 31, $s_dec_base_unit_qty, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 32, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 32, $base_unit_nm, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 33, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 33, $base_unit_cd, value);
	}


	/**
	 *  単価（データ）.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 34, $trd_cur_upri);
	}

	/**
	 *  単価（データ）.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}

	/**
	 *  単価（データ）.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}

	/**
	 *  単価（データ）.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}

	/**
	 *  単価（データ）.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}

	/**
	 *  単価（データ）.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 34, $trd_cur_upri, value);
	}


	/**
	 *  単価（文字列）.<p>
	 *
	 */
	public String s_trd_cur_upri() {
		return getConstString(offset + 35, $s_trd_cur_upri);
	}

	/**
	 *  単価（文字列）.<p>
	 *
	 */
	public void s_trd_cur_upri(String value) {
		setConstString(offset + 35, $s_trd_cur_upri, value);
	}


	/**
	 *  単価（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_upri() {
		return getConstString(offset + 36, $s_int_trd_cur_upri);
	}

	/**
	 *  単価（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_upri(String value) {
		setConstString(offset + 36, $s_int_trd_cur_upri, value);
	}


	/**
	 *  単価（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_upri() {
		return getConstString(offset + 37, $s_dec_trd_cur_upri);
	}

	/**
	 *  単価（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_upri(String value) {
		setConstString(offset + 37, $s_dec_trd_cur_upri, value);
	}


	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 38, $base_unit_dec_place);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 38, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 38, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 38, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 38, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 38, $base_unit_dec_place, value);
	}


	/**
	 *  金額（データ）.<p>
	 *
	 */
	public MCNumber d_amt() {
		return getConstNumber(offset + 39, $d_amt);
	}

	/**
	 *  金額（データ）.<p>
	 *
	 */
	public void d_amt(MCNumber value) {
		setConstNumber(offset + 39, $d_amt, value);
	}

	/**
	 *  金額（データ）.<p>
	 *
	 */
	public void d_amt(int value) {
		setConstNumber(offset + 39, $d_amt, value);
	}

	/**
	 *  金額（データ）.<p>
	 *
	 */
	public void d_amt(long value) {
		setConstNumber(offset + 39, $d_amt, value);
	}

	/**
	 *  金額（データ）.<p>
	 *
	 */
	public void d_amt(float value) {
		setConstNumber(offset + 39, $d_amt, value);
	}

	/**
	 *  金額（データ）.<p>
	 *
	 */
	public void d_amt(double value) {
		setConstNumber(offset + 39, $d_amt, value);
	}


	/**
	 *  金額（文字列）.<p>
	 *
	 */
	public String s_d_amt() {
		return getConstString(offset + 40, $s_d_amt);
	}

	/**
	 *  金額（文字列）.<p>
	 *
	 */
	public void s_d_amt(String value) {
		setConstString(offset + 40, $s_d_amt, value);
	}


	/**
	 *  金額（整数部）.<p>
	 *
	 */
	public String s_int_d_amt() {
		return getConstString(offset + 41, $s_int_d_amt);
	}

	/**
	 *  金額（整数部）.<p>
	 *
	 */
	public void s_int_d_amt(String value) {
		setConstString(offset + 41, $s_int_d_amt, value);
	}


	/**
	 *  金額（小数部）.<p>
	 *
	 */
	public String s_dec_d_amt() {
		return getConstString(offset + 42, $s_dec_d_amt);
	}

	/**
	 *  金額（小数部）.<p>
	 *
	 */
	public void s_dec_d_amt(String value) {
		setConstString(offset + 42, $s_dec_d_amt, value);
	}


	/**
	 *  税率（データ）.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 43, $tax_rate);
	}

	/**
	 *  税率（データ）.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率（データ）.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率（データ）.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率（データ）.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率（データ）.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}


	/**
	 *  税率（文字列）.<p>
	 *
	 */
	public String s_tax_rate() {
		return getConstString(offset + 44, $s_tax_rate);
	}

	/**
	 *  税率（文字列）.<p>
	 *
	 */
	public void s_tax_rate(String value) {
		setConstString(offset + 44, $s_tax_rate, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 45, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 45, $inc_tax_flg, value);
	}


	/**
	 *  （ラベル）Tax inclusive.<p>
	 *
	 */
	public String t_tax_inclusive() {
		return getConstString(offset + 46, $t_tax_inclusive);
	}

	/**
	 *  （ラベル）Tax inclusive.<p>
	 *
	 */
	public void t_tax_inclusive(String value) {
		setConstString(offset + 46, $t_tax_inclusive, value);
	}


	/**
	 *  税額（データ）.<p>
	 *
	 */
	public MCNumber d_tax_amt() {
		return getConstNumber(offset + 47, $d_tax_amt);
	}

	/**
	 *  税額（データ）.<p>
	 *
	 */
	public void d_tax_amt(MCNumber value) {
		setConstNumber(offset + 47, $d_tax_amt, value);
	}

	/**
	 *  税額（データ）.<p>
	 *
	 */
	public void d_tax_amt(int value) {
		setConstNumber(offset + 47, $d_tax_amt, value);
	}

	/**
	 *  税額（データ）.<p>
	 *
	 */
	public void d_tax_amt(long value) {
		setConstNumber(offset + 47, $d_tax_amt, value);
	}

	/**
	 *  税額（データ）.<p>
	 *
	 */
	public void d_tax_amt(float value) {
		setConstNumber(offset + 47, $d_tax_amt, value);
	}

	/**
	 *  税額（データ）.<p>
	 *
	 */
	public void d_tax_amt(double value) {
		setConstNumber(offset + 47, $d_tax_amt, value);
	}


	/**
	 *  税額（文字列）.<p>
	 *
	 */
	public String s_d_tax_amt() {
		return getConstString(offset + 48, $s_d_tax_amt);
	}

	/**
	 *  税額（文字列）.<p>
	 *
	 */
	public void s_d_tax_amt(String value) {
		setConstString(offset + 48, $s_d_tax_amt, value);
	}


	/**
	 *  税額（整数部）.<p>
	 *
	 */
	public String s_int_d_tax_amt() {
		return getConstString(offset + 49, $s_int_d_tax_amt);
	}

	/**
	 *  税額（整数部）.<p>
	 *
	 */
	public void s_int_d_tax_amt(String value) {
		setConstString(offset + 49, $s_int_d_tax_amt, value);
	}


	/**
	 *  税額（小数部）.<p>
	 *
	 */
	public String s_dec_d_tax_amt() {
		return getConstString(offset + 50, $s_dec_d_tax_amt);
	}

	/**
	 *  税額（小数部）.<p>
	 *
	 */
	public void s_dec_d_tax_amt(String value) {
		setConstString(offset + 50, $s_dec_d_tax_amt, value);
	}


	/**
	 *  基準単位名（単価用）.<p>
	 *
	 */
	public String upri_base_unit_nm() {
		return getConstString(offset + 51, $upri_base_unit_nm);
	}

	/**
	 *  基準単位名（単価用）.<p>
	 *
	 */
	public void upri_base_unit_nm(String value) {
		setConstString(offset + 51, $upri_base_unit_nm, value);
	}


	/**
	 *  基準単位ＣＤ（単価用）.<p>
	 *
	 */
	public String upri_base_unit_cd() {
		return getConstString(offset + 52, $upri_base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ（単価用）.<p>
	 *
	 */
	public void upri_base_unit_cd(String value) {
		setConstString(offset + 52, $upri_base_unit_cd, value);
	}


	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 53, $upri_dec_place);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 53, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 53, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 53, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 53, $upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 53, $upri_dec_place, value);
	}


	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 54, $amt_dec_place);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 54, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 54, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 54, $amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 54, $amt_dec_place, value);
	}


	/**
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 55, $ptax_cur_cd);
	}

	/**
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 55, $ptax_cur_cd, value);
	}


	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 56, $ptax_cur_amt);
	}

	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 56, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 56, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 56, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 56, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額（データ）.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 56, $ptax_cur_amt, value);
	}


	/**
	 *  納税通貨金額（文字列）.<p>
	 *
	 */
	public String s_ptax_cur_amt() {
		return getConstString(offset + 57, $s_ptax_cur_amt);
	}

	/**
	 *  納税通貨金額（文字列）.<p>
	 *
	 */
	public void s_ptax_cur_amt(String value) {
		setConstString(offset + 57, $s_ptax_cur_amt, value);
	}


	/**
	 *  納税通貨金額（整数部）.<p>
	 *
	 */
	public String s_int_ptax_cur_amt() {
		return getConstString(offset + 58, $s_int_ptax_cur_amt);
	}

	/**
	 *  納税通貨金額（整数部）.<p>
	 *
	 */
	public void s_int_ptax_cur_amt(String value) {
		setConstString(offset + 58, $s_int_ptax_cur_amt, value);
	}


	/**
	 *  納税通貨金額（小数部）.<p>
	 *
	 */
	public String s_dec_ptax_cur_amt() {
		return getConstString(offset + 59, $s_dec_ptax_cur_amt);
	}

	/**
	 *  納税通貨金額（小数部）.<p>
	 *
	 */
	public void s_dec_ptax_cur_amt(String value) {
		setConstString(offset + 59, $s_dec_ptax_cur_amt, value);
	}


	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 60, $wtax_rate);
	}

	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 60, $wtax_rate, value);
	}

	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 60, $wtax_rate, value);
	}

	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 60, $wtax_rate, value);
	}

	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 60, $wtax_rate, value);
	}

	/**
	 *  源泉税率（データ）.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 60, $wtax_rate, value);
	}


	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 61, $wtax_amt);
	}

	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 61, $wtax_amt, value);
	}

	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 61, $wtax_amt, value);
	}

	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 61, $wtax_amt, value);
	}

	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 61, $wtax_amt, value);
	}

	/**
	 *  源泉税額（データ）.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 61, $wtax_amt, value);
	}


	/**
	 *  源泉税額（文字列）.<p>
	 *
	 */
	public String s_wtax_amt() {
		return getConstString(offset + 62, $s_wtax_amt);
	}

	/**
	 *  源泉税額（文字列）.<p>
	 *
	 */
	public void s_wtax_amt(String value) {
		setConstString(offset + 62, $s_wtax_amt, value);
	}


	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 63, $iv_itm_nm);
	}

	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 63, $iv_itm_nm, value);
	}


	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public String iv_itm_alt_nm1() {
		return getConstString(offset + 64, $iv_itm_alt_nm1);
	}

	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public void iv_itm_alt_nm1(String value) {
		setConstString(offset + 64, $iv_itm_alt_nm1, value);
	}


	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public String iv_itm_alt_nm2() {
		return getConstString(offset + 65, $iv_itm_alt_nm2);
	}

	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public void iv_itm_alt_nm2(String value) {
		setConstString(offset + 65, $iv_itm_alt_nm2, value);
	}


	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public String iv_itm_alt_nm3() {
		return getConstString(offset + 66, $iv_itm_alt_nm3);
	}

	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public void iv_itm_alt_nm3(String value) {
		setConstString(offset + 66, $iv_itm_alt_nm3, value);
	}


	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public String iv_itm_alt_nm4() {
		return getConstString(offset + 67, $iv_itm_alt_nm4);
	}

	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public void iv_itm_alt_nm4(String value) {
		setConstString(offset + 67, $iv_itm_alt_nm4, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 68, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 68, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 69, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 69, $cst_itm_nm, value);
	}


	/**
	 *  品目ＣＤ２.<p>
	 *
	 */
	public String itm_cd2() {
		return getConstString(offset + 70, $itm_cd2);
	}

	/**
	 *  品目ＣＤ２.<p>
	 *
	 */
	public void itm_cd2(String value) {
		setConstString(offset + 70, $itm_cd2, value);
	}


	/**
	 *  枝番１（表示用）２.<p>
	 *
	 */
	public String itm_sub1_view2() {
		return getConstString(offset + 71, $itm_sub1_view2);
	}

	/**
	 *  枝番１（表示用）２.<p>
	 *
	 */
	public void itm_sub1_view2(String value) {
		setConstString(offset + 71, $itm_sub1_view2, value);
	}


	/**
	 *  枝番２（表示用）２.<p>
	 *
	 */
	public String itm_sub2_view2() {
		return getConstString(offset + 72, $itm_sub2_view2);
	}

	/**
	 *  枝番２（表示用）２.<p>
	 *
	 */
	public void itm_sub2_view2(String value) {
		setConstString(offset + 72, $itm_sub2_view2, value);
	}


	/**
	 *  枝番３（表示用）２.<p>
	 *
	 */
	public String itm_sub3_view2() {
		return getConstString(offset + 73, $itm_sub3_view2);
	}

	/**
	 *  枝番３（表示用）２.<p>
	 *
	 */
	public void itm_sub3_view2(String value) {
		setConstString(offset + 73, $itm_sub3_view2, value);
	}


	/**
	 *  枝番１（データ）２.<p>
	 *
	 */
	public String itm_sub1_data2() {
		return getConstString(offset + 74, $itm_sub1_data2);
	}

	/**
	 *  枝番１（データ）２.<p>
	 *
	 */
	public void itm_sub1_data2(String value) {
		setConstString(offset + 74, $itm_sub1_data2, value);
	}


	/**
	 *  枝番２（データ）２.<p>
	 *
	 */
	public String itm_sub2_data2() {
		return getConstString(offset + 75, $itm_sub2_data2);
	}

	/**
	 *  枝番２（データ）２.<p>
	 *
	 */
	public void itm_sub2_data2(String value) {
		setConstString(offset + 75, $itm_sub2_data2, value);
	}


	/**
	 *  枝番３（データ）２.<p>
	 *
	 */
	public String itm_sub3_data2() {
		return getConstString(offset + 76, $itm_sub3_data2);
	}

	/**
	 *  枝番３（データ）２.<p>
	 *
	 */
	public void itm_sub3_data2(String value) {
		setConstString(offset + 76, $itm_sub3_data2, value);
	}


	/**
	 *  原産地名２.<p>
	 *
	 */
	public String cntry_org_nm2() {
		return getConstString(offset + 77, $cntry_org_nm2);
	}

	/**
	 *  原産地名２.<p>
	 *
	 */
	public void cntry_org_nm2(String value) {
		setConstString(offset + 77, $cntry_org_nm2, value);
	}


	/**
	 *  原産地ＣＤ２.<p>
	 *
	 */
	public String cntry_org_cd2() {
		return getConstString(offset + 78, $cntry_org_cd2);
	}

	/**
	 *  原産地ＣＤ２.<p>
	 *
	 */
	public void cntry_org_cd2(String value) {
		setConstString(offset + 78, $cntry_org_cd2, value);
	}


	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public MCNumber trd_unit_qty2() {
		return getConstNumber(offset + 79, $trd_unit_qty2);
	}

	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public void trd_unit_qty2(MCNumber value) {
		setConstNumber(offset + 79, $trd_unit_qty2, value);
	}

	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public void trd_unit_qty2(int value) {
		setConstNumber(offset + 79, $trd_unit_qty2, value);
	}

	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public void trd_unit_qty2(long value) {
		setConstNumber(offset + 79, $trd_unit_qty2, value);
	}

	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public void trd_unit_qty2(float value) {
		setConstNumber(offset + 79, $trd_unit_qty2, value);
	}

	/**
	 *  入力単位数量２（データ）.<p>
	 *
	 */
	public void trd_unit_qty2(double value) {
		setConstNumber(offset + 79, $trd_unit_qty2, value);
	}


	/**
	 *  入力単位数量２（文字列）.<p>
	 *
	 */
	public String s_trd_unit_qty2() {
		return getConstString(offset + 80, $s_trd_unit_qty2);
	}

	/**
	 *  入力単位数量２（文字列）.<p>
	 *
	 */
	public void s_trd_unit_qty2(String value) {
		setConstString(offset + 80, $s_trd_unit_qty2, value);
	}


	/**
	 *  入力単位数量２（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty2() {
		return getConstString(offset + 81, $s_int_trd_unit_qty2);
	}

	/**
	 *  入力単位数量２（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty2(String value) {
		setConstString(offset + 81, $s_int_trd_unit_qty2, value);
	}


	/**
	 *  入力単位数量２（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty2() {
		return getConstString(offset + 82, $s_dec_trd_unit_qty2);
	}

	/**
	 *  入力単位数量２（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty2(String value) {
		setConstString(offset + 82, $s_dec_trd_unit_qty2, value);
	}


	/**
	 *  入力単位名２.<p>
	 *
	 */
	public String trd_unit_nm2() {
		return getConstString(offset + 83, $trd_unit_nm2);
	}

	/**
	 *  入力単位名２.<p>
	 *
	 */
	public void trd_unit_nm2(String value) {
		setConstString(offset + 83, $trd_unit_nm2, value);
	}


	/**
	 *  入力単位ＣＤ２.<p>
	 *
	 */
	public String trd_unit_cd2() {
		return getConstString(offset + 84, $trd_unit_cd2);
	}

	/**
	 *  入力単位ＣＤ２.<p>
	 *
	 */
	public void trd_unit_cd2(String value) {
		setConstString(offset + 84, $trd_unit_cd2, value);
	}


	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public MCNumber base_unit_qty2() {
		return getConstNumber(offset + 85, $base_unit_qty2);
	}

	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public void base_unit_qty2(MCNumber value) {
		setConstNumber(offset + 85, $base_unit_qty2, value);
	}

	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public void base_unit_qty2(int value) {
		setConstNumber(offset + 85, $base_unit_qty2, value);
	}

	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public void base_unit_qty2(long value) {
		setConstNumber(offset + 85, $base_unit_qty2, value);
	}

	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public void base_unit_qty2(float value) {
		setConstNumber(offset + 85, $base_unit_qty2, value);
	}

	/**
	 *  基準単位数量２（データ）.<p>
	 *
	 */
	public void base_unit_qty2(double value) {
		setConstNumber(offset + 85, $base_unit_qty2, value);
	}


	/**
	 *  基準単位数量２（文字列）.<p>
	 *
	 */
	public String s_base_unit_qty2() {
		return getConstString(offset + 86, $s_base_unit_qty2);
	}

	/**
	 *  基準単位数量２（文字列）.<p>
	 *
	 */
	public void s_base_unit_qty2(String value) {
		setConstString(offset + 86, $s_base_unit_qty2, value);
	}


	/**
	 *  基準単位数量２（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_qty2() {
		return getConstString(offset + 87, $s_int_base_unit_qty2);
	}

	/**
	 *  基準単位数量２（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_qty2(String value) {
		setConstString(offset + 87, $s_int_base_unit_qty2, value);
	}


	/**
	 *  基準単位数量２（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_qty2() {
		return getConstString(offset + 88, $s_dec_base_unit_qty2);
	}

	/**
	 *  基準単位数量２（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_qty2(String value) {
		setConstString(offset + 88, $s_dec_base_unit_qty2, value);
	}


	/**
	 *  基準単位名２.<p>
	 *
	 */
	public String base_unit_nm2() {
		return getConstString(offset + 89, $base_unit_nm2);
	}

	/**
	 *  基準単位名２.<p>
	 *
	 */
	public void base_unit_nm2(String value) {
		setConstString(offset + 89, $base_unit_nm2, value);
	}


	/**
	 *  基準単位ＣＤ２.<p>
	 *
	 */
	public String base_unit_cd2() {
		return getConstString(offset + 90, $base_unit_cd2);
	}

	/**
	 *  基準単位ＣＤ２.<p>
	 *
	 */
	public void base_unit_cd2(String value) {
		setConstString(offset + 90, $base_unit_cd2, value);
	}


	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 91, $iv_upri);
	}

	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 91, $iv_upri, value);
	}

	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 91, $iv_upri, value);
	}

	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 91, $iv_upri, value);
	}

	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 91, $iv_upri, value);
	}

	/**
	 *  インボイス表記単価（データ）.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 91, $iv_upri, value);
	}


	/**
	 *  インボイス表記単価（文字列）.<p>
	 *
	 */
	public String s_iv_upri() {
		return getConstString(offset + 92, $s_iv_upri);
	}

	/**
	 *  インボイス表記単価（文字列）.<p>
	 *
	 */
	public void s_iv_upri(String value) {
		setConstString(offset + 92, $s_iv_upri, value);
	}


	/**
	 *  インボイス表記単価（整数部）.<p>
	 *
	 */
	public String s_int_iv_upri() {
		return getConstString(offset + 93, $s_int_iv_upri);
	}

	/**
	 *  インボイス表記単価（整数部）.<p>
	 *
	 */
	public void s_int_iv_upri(String value) {
		setConstString(offset + 93, $s_int_iv_upri, value);
	}


	/**
	 *  インボイス表記単価（小数部）.<p>
	 *
	 */
	public String s_dec_iv_upri() {
		return getConstString(offset + 94, $s_dec_iv_upri);
	}

	/**
	 *  インボイス表記単価（小数部）.<p>
	 *
	 */
	public void s_dec_iv_upri(String value) {
		setConstString(offset + 94, $s_dec_iv_upri, value);
	}


	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return getConstNumber(offset + 95, $iv_amt);
	}

	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		setConstNumber(offset + 95, $iv_amt, value);
	}

	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public void iv_amt(int value) {
		setConstNumber(offset + 95, $iv_amt, value);
	}

	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public void iv_amt(long value) {
		setConstNumber(offset + 95, $iv_amt, value);
	}

	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public void iv_amt(float value) {
		setConstNumber(offset + 95, $iv_amt, value);
	}

	/**
	 *  インボイス金額（データ）.<p>
	 *
	 */
	public void iv_amt(double value) {
		setConstNumber(offset + 95, $iv_amt, value);
	}


	/**
	 *  インボイス金額（文字列）.<p>
	 *
	 */
	public String s_iv_amt() {
		return getConstString(offset + 96, $s_iv_amt);
	}

	/**
	 *  インボイス金額（文字列）.<p>
	 *
	 */
	public void s_iv_amt(String value) {
		setConstString(offset + 96, $s_iv_amt, value);
	}


	/**
	 *  インボイス金額（整数部）.<p>
	 *
	 */
	public String s_int_d_iv_amt() {
		return getConstString(offset + 97, $s_int_d_iv_amt);
	}

	/**
	 *  インボイス金額（整数部）.<p>
	 *
	 */
	public void s_int_d_iv_amt(String value) {
		setConstString(offset + 97, $s_int_d_iv_amt, value);
	}


	/**
	 *  インボイス金額（小数部）.<p>
	 *
	 */
	public String s_dec_d_iv_amt() {
		return getConstString(offset + 98, $s_dec_d_iv_amt);
	}

	/**
	 *  インボイス金額（小数部）.<p>
	 *
	 */
	public void s_dec_d_iv_amt(String value) {
		setConstString(offset + 98, $s_dec_d_iv_amt, value);
	}


	/**
	 *  基準単位名（インボイス表記単価用）.<p>
	 *
	 */
	public String iv_upri_base_unit_nm() {
		return getConstString(offset + 99, $iv_upri_base_unit_nm);
	}

	/**
	 *  基準単位名（インボイス表記単価用）.<p>
	 *
	 */
	public void iv_upri_base_unit_nm(String value) {
		setConstString(offset + 99, $iv_upri_base_unit_nm, value);
	}


	/**
	 *  基準単位ＣＤ（インボイス表記単価用）.<p>
	 *
	 */
	public String iv_upri_base_unit_cd() {
		return getConstString(offset + 100, $iv_upri_base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ（インボイス表記単価用）.<p>
	 *
	 */
	public void iv_upri_base_unit_cd(String value) {
		setConstString(offset + 100, $iv_upri_base_unit_cd, value);
	}


	/**
	 *  インボイス表記用品名２.<p>
	 *
	 */
	public String iv_itm_nm2() {
		return getConstString(offset + 101, $iv_itm_nm2);
	}

	/**
	 *  インボイス表記用品名２.<p>
	 *
	 */
	public void iv_itm_nm2(String value) {
		setConstString(offset + 101, $iv_itm_nm2, value);
	}


	/**
	 *  インボイス表記用品目２別名１.<p>
	 *
	 */
	public String iv_itm2_alt_nm1() {
		return getConstString(offset + 102, $iv_itm2_alt_nm1);
	}

	/**
	 *  インボイス表記用品目２別名１.<p>
	 *
	 */
	public void iv_itm2_alt_nm1(String value) {
		setConstString(offset + 102, $iv_itm2_alt_nm1, value);
	}


	/**
	 *  インボイス表記用品目２別名２.<p>
	 *
	 */
	public String iv_itm2_alt_nm2() {
		return getConstString(offset + 103, $iv_itm2_alt_nm2);
	}

	/**
	 *  インボイス表記用品目２別名２.<p>
	 *
	 */
	public void iv_itm2_alt_nm2(String value) {
		setConstString(offset + 103, $iv_itm2_alt_nm2, value);
	}


	/**
	 *  インボイス表記用品目２別名３.<p>
	 *
	 */
	public String iv_itm2_alt_nm3() {
		return getConstString(offset + 104, $iv_itm2_alt_nm3);
	}

	/**
	 *  インボイス表記用品目２別名３.<p>
	 *
	 */
	public void iv_itm2_alt_nm3(String value) {
		setConstString(offset + 104, $iv_itm2_alt_nm3, value);
	}


	/**
	 *  インボイス表記用品目２別名４.<p>
	 *
	 */
	public String iv_itm2_alt_nm4() {
		return getConstString(offset + 105, $iv_itm2_alt_nm4);
	}

	/**
	 *  インボイス表記用品目２別名４.<p>
	 *
	 */
	public void iv_itm2_alt_nm4(String value) {
		setConstString(offset + 105, $iv_itm2_alt_nm4, value);
	}


	/**
	 *  得意先品目ＣＤ２.<p>
	 *
	 */
	public String cst_itm_cd2() {
		return getConstString(offset + 106, $cst_itm_cd2);
	}

	/**
	 *  得意先品目ＣＤ２.<p>
	 *
	 */
	public void cst_itm_cd2(String value) {
		setConstString(offset + 106, $cst_itm_cd2, value);
	}


	/**
	 *  得意先品名２.<p>
	 *
	 */
	public String cst_itm_nm2() {
		return getConstString(offset + 107, $cst_itm_nm2);
	}

	/**
	 *  得意先品名２.<p>
	 *
	 */
	public void cst_itm_nm2(String value) {
		setConstString(offset + 107, $cst_itm_nm2, value);
	}


	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public String t_total() {
		return getConstString(offset + 108, $t_total);
	}

	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public void t_total(String value) {
		setConstString(offset + 108, $t_total, value);
	}


	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public String t_total2() {
		return getConstString(offset + 109, $t_total2);
	}

	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public void t_total2(String value) {
		setConstString(offset + 109, $t_total2, value);
	}


	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public MCNumber sum_trd_unit_qty() {
		return getConstNumber(offset + 110, $sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 110, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(int value) {
		setConstNumber(offset + 110, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(long value) {
		setConstNumber(offset + 110, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(float value) {
		setConstNumber(offset + 110, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(double value) {
		setConstNumber(offset + 110, $sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public String s_sum_trd_unit_qty() {
		return getConstString(offset + 111, $s_sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public void s_sum_trd_unit_qty(String value) {
		setConstString(offset + 111, $s_sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String sum_trd_unit_nm() {
		return getConstString(offset + 112, $sum_trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void sum_trd_unit_nm(String value) {
		setConstString(offset + 112, $sum_trd_unit_nm, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String sum_trd_unit_cd() {
		return getConstString(offset + 113, $sum_trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void sum_trd_unit_cd(String value) {
		setConstString(offset + 113, $sum_trd_unit_cd, value);
	}


	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public MCNumber sum_trd_unit_qty2() {
		return getConstNumber(offset + 114, $sum_trd_unit_qty2);
	}

	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public void sum_trd_unit_qty2(MCNumber value) {
		setConstNumber(offset + 114, $sum_trd_unit_qty2, value);
	}

	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public void sum_trd_unit_qty2(int value) {
		setConstNumber(offset + 114, $sum_trd_unit_qty2, value);
	}

	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public void sum_trd_unit_qty2(long value) {
		setConstNumber(offset + 114, $sum_trd_unit_qty2, value);
	}

	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public void sum_trd_unit_qty2(float value) {
		setConstNumber(offset + 114, $sum_trd_unit_qty2, value);
	}

	/**
	 *  取引単位数量合計２.<p>
	 *
	 */
	public void sum_trd_unit_qty2(double value) {
		setConstNumber(offset + 114, $sum_trd_unit_qty2, value);
	}


	/**
	 *  取引単位数量合計２（文字列）.<p>
	 *
	 */
	public String s_sum_trd_unit_qty2() {
		return getConstString(offset + 115, $s_sum_trd_unit_qty2);
	}

	/**
	 *  取引単位数量合計２（文字列）.<p>
	 *
	 */
	public void s_sum_trd_unit_qty2(String value) {
		setConstString(offset + 115, $s_sum_trd_unit_qty2, value);
	}


	/**
	 *  取引単位名２.<p>
	 *
	 */
	public String sum_trd_unit_nm2() {
		return getConstString(offset + 116, $sum_trd_unit_nm2);
	}

	/**
	 *  取引単位名２.<p>
	 *
	 */
	public void sum_trd_unit_nm2(String value) {
		setConstString(offset + 116, $sum_trd_unit_nm2, value);
	}


	/**
	 *  取引単位ＣＤ２.<p>
	 *
	 */
	public String sum_trd_unit_cd2() {
		return getConstString(offset + 117, $sum_trd_unit_cd2);
	}

	/**
	 *  取引単位ＣＤ２.<p>
	 *
	 */
	public void sum_trd_unit_cd2(String value) {
		setConstString(offset + 117, $sum_trd_unit_cd2, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 118, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String iv_d_sub_char1() {
		return getConstString(offset + 119, $iv_d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void iv_d_sub_char1(String value) {
		setConstString(offset + 119, $iv_d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String iv_d_sub_char2() {
		return getConstString(offset + 120, $iv_d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void iv_d_sub_char2(String value) {
		setConstString(offset + 120, $iv_d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String iv_d_sub_char3() {
		return getConstString(offset + 121, $iv_d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void iv_d_sub_char3(String value) {
		setConstString(offset + 121, $iv_d_sub_char3, value);
	}


	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public String t_sum_amt() {
		return getConstString(offset + 122, $t_sum_amt);
	}

	/**
	 *  （ラベル）Amt.<p>
	 *
	 */
	public void t_sum_amt(String value) {
		setConstString(offset + 122, $t_sum_amt, value);
	}


	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public String t_sum_tax_amt() {
		return getConstString(offset + 123, $t_sum_tax_amt);
	}

	/**
	 *  （ラベル）Tax Amt.<p>
	 *
	 */
	public void t_sum_tax_amt(String value) {
		setConstString(offset + 123, $t_sum_tax_amt, value);
	}


	/**
	 *  （ラベル）F.O.B.<p>
	 *
	 */
	public String f_fob() {
		return getConstString(offset + 124, $f_fob);
	}

	/**
	 *  （ラベル）F.O.B.<p>
	 *
	 */
	public void f_fob(String value) {
		setConstString(offset + 124, $f_fob, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String fob_cur_nm() {
		return getConstString(offset + 125, $fob_cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void fob_cur_nm(String value) {
		setConstString(offset + 125, $fob_cur_nm, value);
	}


	/**
	 *  金額１.<p>
	 *
	 */
	public MCNumber d_fob_amt() {
		return getConstNumber(offset + 126, $d_fob_amt);
	}

	/**
	 *  金額１.<p>
	 *
	 */
	public void d_fob_amt(MCNumber value) {
		setConstNumber(offset + 126, $d_fob_amt, value);
	}

	/**
	 *  金額１.<p>
	 *
	 */
	public void d_fob_amt(int value) {
		setConstNumber(offset + 126, $d_fob_amt, value);
	}

	/**
	 *  金額１.<p>
	 *
	 */
	public void d_fob_amt(long value) {
		setConstNumber(offset + 126, $d_fob_amt, value);
	}

	/**
	 *  金額１.<p>
	 *
	 */
	public void d_fob_amt(float value) {
		setConstNumber(offset + 126, $d_fob_amt, value);
	}

	/**
	 *  金額１.<p>
	 *
	 */
	public void d_fob_amt(double value) {
		setConstNumber(offset + 126, $d_fob_amt, value);
	}


	/**
	 *  金額１（文字列）.<p>
	 *
	 */
	public String s_d_fob_amt() {
		return getConstString(offset + 127, $s_d_fob_amt);
	}

	/**
	 *  金額１（文字列）.<p>
	 *
	 */
	public void s_d_fob_amt(String value) {
		setConstString(offset + 127, $s_d_fob_amt, value);
	}


	/**
	 *  税額１.<p>
	 *
	 */
	public MCNumber d_fob_tax_amt() {
		return getConstNumber(offset + 128, $d_fob_tax_amt);
	}

	/**
	 *  税額１.<p>
	 *
	 */
	public void d_fob_tax_amt(MCNumber value) {
		setConstNumber(offset + 128, $d_fob_tax_amt, value);
	}

	/**
	 *  税額１.<p>
	 *
	 */
	public void d_fob_tax_amt(int value) {
		setConstNumber(offset + 128, $d_fob_tax_amt, value);
	}

	/**
	 *  税額１.<p>
	 *
	 */
	public void d_fob_tax_amt(long value) {
		setConstNumber(offset + 128, $d_fob_tax_amt, value);
	}

	/**
	 *  税額１.<p>
	 *
	 */
	public void d_fob_tax_amt(float value) {
		setConstNumber(offset + 128, $d_fob_tax_amt, value);
	}

	/**
	 *  税額１.<p>
	 *
	 */
	public void d_fob_tax_amt(double value) {
		setConstNumber(offset + 128, $d_fob_tax_amt, value);
	}


	/**
	 *  税額１（文字列）.<p>
	 *
	 */
	public String s_d_fob_tax_amt() {
		return getConstString(offset + 129, $s_d_fob_tax_amt);
	}

	/**
	 *  税額１（文字列）.<p>
	 *
	 */
	public void s_d_fob_tax_amt(String value) {
		setConstString(offset + 129, $s_d_fob_tax_amt, value);
	}


	/**
	 *  受渡条件名.<p>
	 *
	 */
	public String d_tterm_nm1() {
		return getConstString(offset + 130, $d_tterm_nm1);
	}

	/**
	 *  受渡条件名.<p>
	 *
	 */
	public void d_tterm_nm1(String value) {
		setConstString(offset + 130, $d_tterm_nm1, value);
	}


	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public String d_tterm_cd1() {
		return getConstString(offset + 131, $d_tterm_cd1);
	}

	/**
	 *  受渡条件ＣＤ.<p>
	 *
	 */
	public void d_tterm_cd1(String value) {
		setConstString(offset + 131, $d_tterm_cd1, value);
	}


	/**
	 *  受渡場所名.<p>
	 *
	 */
	public String d_tterm_nm2() {
		return getConstString(offset + 132, $d_tterm_nm2);
	}

	/**
	 *  受渡場所名.<p>
	 *
	 */
	public void d_tterm_nm2(String value) {
		setConstString(offset + 132, $d_tterm_nm2, value);
	}


	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public String d_tterm_cd2() {
		return getConstString(offset + 133, $d_tterm_cd2);
	}

	/**
	 *  受渡場所ＣＤ.<p>
	 *
	 */
	public void d_tterm_cd2(String value) {
		setConstString(offset + 133, $d_tterm_cd2, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String f_cur_nm() {
		return getConstString(offset + 134, $f_cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void f_cur_nm(String value) {
		setConstString(offset + 134, $f_cur_nm, value);
	}


	/**
	 *  通貨ＣＤ（データ）.<p>
	 *
	 */
	public String f_cur_cd() {
		return getConstString(offset + 135, $f_cur_cd);
	}

	/**
	 *  通貨ＣＤ（データ）.<p>
	 *
	 */
	public void f_cur_cd(String value) {
		setConstString(offset + 135, $f_cur_cd, value);
	}


	/**
	 *  合計金額.<p>
	 *
	 */
	public MCNumber f_amt() {
		return getConstNumber(offset + 136, $f_amt);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void f_amt(MCNumber value) {
		setConstNumber(offset + 136, $f_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void f_amt(int value) {
		setConstNumber(offset + 136, $f_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void f_amt(long value) {
		setConstNumber(offset + 136, $f_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void f_amt(float value) {
		setConstNumber(offset + 136, $f_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void f_amt(double value) {
		setConstNumber(offset + 136, $f_amt, value);
	}


	/**
	 *  合計金額（文字列）.<p>
	 *
	 */
	public String s_f_amt() {
		return getConstString(offset + 137, $s_f_amt);
	}

	/**
	 *  合計金額（文字列）.<p>
	 *
	 */
	public void s_f_amt(String value) {
		setConstString(offset + 137, $s_f_amt, value);
	}


	/**
	 *  合計税額.<p>
	 *
	 */
	public MCNumber f_tax_amt() {
		return getConstNumber(offset + 138, $f_tax_amt);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void f_tax_amt(MCNumber value) {
		setConstNumber(offset + 138, $f_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void f_tax_amt(int value) {
		setConstNumber(offset + 138, $f_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void f_tax_amt(long value) {
		setConstNumber(offset + 138, $f_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void f_tax_amt(float value) {
		setConstNumber(offset + 138, $f_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void f_tax_amt(double value) {
		setConstNumber(offset + 138, $f_tax_amt, value);
	}


	/**
	 *  合計税額（文字列）.<p>
	 *
	 */
	public String s_f_tax_amt() {
		return getConstString(offset + 139, $s_f_tax_amt);
	}

	/**
	 *  合計税額（文字列）.<p>
	 *
	 */
	public void s_f_tax_amt(String value) {
		setConstString(offset + 139, $s_f_tax_amt, value);
	}


	/**
	 *  （ラベル）No Commercial Value.<p>
	 *
	 */
	public String t_no_com() {
		return getConstString(offset + 140, $t_no_com);
	}

	/**
	 *  （ラベル）No Commercial Value.<p>
	 *
	 */
	public void t_no_com(String value) {
		setConstString(offset + 140, $t_no_com, value);
	}


	/**
	 *  通貨名２.<p>
	 *
	 */
	public String f_cur_nm2() {
		return getConstString(offset + 141, $f_cur_nm2);
	}

	/**
	 *  通貨名２.<p>
	 *
	 */
	public void f_cur_nm2(String value) {
		setConstString(offset + 141, $f_cur_nm2, value);
	}


	/**
	 *  無償金額合計.<p>
	 *
	 */
	public MCNumber d_ncv_amt() {
		return getConstNumber(offset + 142, $d_ncv_amt);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void d_ncv_amt(MCNumber value) {
		setConstNumber(offset + 142, $d_ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void d_ncv_amt(int value) {
		setConstNumber(offset + 142, $d_ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void d_ncv_amt(long value) {
		setConstNumber(offset + 142, $d_ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void d_ncv_amt(float value) {
		setConstNumber(offset + 142, $d_ncv_amt, value);
	}

	/**
	 *  無償金額合計.<p>
	 *
	 */
	public void d_ncv_amt(double value) {
		setConstNumber(offset + 142, $d_ncv_amt, value);
	}


	/**
	 *  無償金額合計（文字列）.<p>
	 *
	 */
	public String s_d_ncv_amt() {
		return getConstString(offset + 143, $s_d_ncv_amt);
	}

	/**
	 *  無償金額合計（文字列）.<p>
	 *
	 */
	public void s_d_ncv_amt(String value) {
		setConstString(offset + 143, $s_d_ncv_amt, value);
	}


	/**
	 *  通貨ＣＤ２（データ）.<p>
	 *
	 */
	public String f_cur_cd2() {
		return getConstString(offset + 144, $f_cur_cd2);
	}

	/**
	 *  通貨ＣＤ２（データ）.<p>
	 *
	 */
	public void f_cur_cd2(String value) {
		setConstString(offset + 144, $f_cur_cd2, value);
	}


	/**
	 *  原産地.<p>
	 *
	 */
	public String f_cntry_org_cd() {
		return getConstString(offset + 145, $f_cntry_org_cd);
	}

	/**
	 *  原産地.<p>
	 *
	 */
	public void f_cntry_org_cd(String value) {
		setConstString(offset + 145, $f_cntry_org_cd, value);
	}


	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public String t_made_in() {
		return getConstString(offset + 146, $t_made_in);
	}

	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public void t_made_in(String value) {
		setConstString(offset + 146, $t_made_in, value);
	}


	/**
	 *  原産地名.<p>
	 *
	 */
	public String f_cntry_org_nm() {
		return getConstString(offset + 147, $f_cntry_org_nm);
	}

	/**
	 *  原産地名.<p>
	 *
	 */
	public void f_cntry_org_nm(String value) {
		setConstString(offset + 147, $f_cntry_org_nm, value);
	}


	/**
	 *  自由入力（罫線部分）.<p>
	 *
	 */
	public String free() {
		return getConstString(offset + 148, $free);
	}

	/**
	 *  自由入力（罫線部分）.<p>
	 *
	 */
	public void free(String value) {
		setConstString(offset + 148, $free, value);
	}


	public String getString(String name) {
		if ($t_cust.equalsIgnoreCase(name)) {
			return t_cust();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_no2.equalsIgnoreCase(name)) {
			return cst_po_no2();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_po_d_no2.equalsIgnoreCase(name)) {
			return cst_po_d_no2();
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			return t_itm_code();
		}
		if ($t_po_no.equalsIgnoreCase(name)) {
			return t_po_no();
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			return t_qty();
		}
		if ($t_upri.equalsIgnoreCase(name)) {
			return t_upri();
		}
		if ($t_amt.equalsIgnoreCase(name)) {
			return t_amt();
		}
		if ($t_tax_rate.equalsIgnoreCase(name)) {
			return t_tax_rate();
		}
		if ($t_tax_amt.equalsIgnoreCase(name)) {
			return t_tax_amt();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($s_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_trd_cur_upri();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_d_amt.equalsIgnoreCase(name)) {
			return s_d_amt();
		}
		if ($s_int_d_amt.equalsIgnoreCase(name)) {
			return s_int_d_amt();
		}
		if ($s_dec_d_amt.equalsIgnoreCase(name)) {
			return s_dec_d_amt();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($t_tax_inclusive.equalsIgnoreCase(name)) {
			return t_tax_inclusive();
		}
		if ($s_d_tax_amt.equalsIgnoreCase(name)) {
			return s_d_tax_amt();
		}
		if ($s_int_d_tax_amt.equalsIgnoreCase(name)) {
			return s_int_d_tax_amt();
		}
		if ($s_dec_d_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_d_tax_amt();
		}
		if ($upri_base_unit_nm.equalsIgnoreCase(name)) {
			return upri_base_unit_nm();
		}
		if ($upri_base_unit_cd.equalsIgnoreCase(name)) {
			return upri_base_unit_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($s_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_ptax_cur_amt();
		}
		if ($s_int_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_int_ptax_cur_amt();
		}
		if ($s_dec_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_ptax_cur_amt();
		}
		if ($s_wtax_amt.equalsIgnoreCase(name)) {
			return s_wtax_amt();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm1();
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm2();
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm3();
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($itm_cd2.equalsIgnoreCase(name)) {
			return itm_cd2();
		}
		if ($itm_sub1_view2.equalsIgnoreCase(name)) {
			return itm_sub1_view2();
		}
		if ($itm_sub2_view2.equalsIgnoreCase(name)) {
			return itm_sub2_view2();
		}
		if ($itm_sub3_view2.equalsIgnoreCase(name)) {
			return itm_sub3_view2();
		}
		if ($itm_sub1_data2.equalsIgnoreCase(name)) {
			return itm_sub1_data2();
		}
		if ($itm_sub2_data2.equalsIgnoreCase(name)) {
			return itm_sub2_data2();
		}
		if ($itm_sub3_data2.equalsIgnoreCase(name)) {
			return itm_sub3_data2();
		}
		if ($cntry_org_nm2.equalsIgnoreCase(name)) {
			return cntry_org_nm2();
		}
		if ($cntry_org_cd2.equalsIgnoreCase(name)) {
			return cntry_org_cd2();
		}
		if ($s_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_trd_unit_qty2();
		}
		if ($s_int_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty2();
		}
		if ($s_dec_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty2();
		}
		if ($trd_unit_nm2.equalsIgnoreCase(name)) {
			return trd_unit_nm2();
		}
		if ($trd_unit_cd2.equalsIgnoreCase(name)) {
			return trd_unit_cd2();
		}
		if ($s_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_base_unit_qty2();
		}
		if ($s_int_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty2();
		}
		if ($s_dec_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty2();
		}
		if ($base_unit_nm2.equalsIgnoreCase(name)) {
			return base_unit_nm2();
		}
		if ($base_unit_cd2.equalsIgnoreCase(name)) {
			return base_unit_cd2();
		}
		if ($s_iv_upri.equalsIgnoreCase(name)) {
			return s_iv_upri();
		}
		if ($s_int_iv_upri.equalsIgnoreCase(name)) {
			return s_int_iv_upri();
		}
		if ($s_dec_iv_upri.equalsIgnoreCase(name)) {
			return s_dec_iv_upri();
		}
		if ($s_iv_amt.equalsIgnoreCase(name)) {
			return s_iv_amt();
		}
		if ($s_int_d_iv_amt.equalsIgnoreCase(name)) {
			return s_int_d_iv_amt();
		}
		if ($s_dec_d_iv_amt.equalsIgnoreCase(name)) {
			return s_dec_d_iv_amt();
		}
		if ($iv_upri_base_unit_nm.equalsIgnoreCase(name)) {
			return iv_upri_base_unit_nm();
		}
		if ($iv_upri_base_unit_cd.equalsIgnoreCase(name)) {
			return iv_upri_base_unit_cd();
		}
		if ($iv_itm_nm2.equalsIgnoreCase(name)) {
			return iv_itm_nm2();
		}
		if ($iv_itm2_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm1();
		}
		if ($iv_itm2_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm2();
		}
		if ($iv_itm2_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm3();
		}
		if ($iv_itm2_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm4();
		}
		if ($cst_itm_cd2.equalsIgnoreCase(name)) {
			return cst_itm_cd2();
		}
		if ($cst_itm_nm2.equalsIgnoreCase(name)) {
			return cst_itm_nm2();
		}
		if ($t_total.equalsIgnoreCase(name)) {
			return t_total();
		}
		if ($t_total2.equalsIgnoreCase(name)) {
			return t_total2();
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty();
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm();
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd();
		}
		if ($s_sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty2();
		}
		if ($sum_trd_unit_nm2.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm2();
		}
		if ($sum_trd_unit_cd2.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd2();
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_d_sub_char1();
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_d_sub_char2();
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_d_sub_char3();
		}
		if ($t_sum_amt.equalsIgnoreCase(name)) {
			return t_sum_amt();
		}
		if ($t_sum_tax_amt.equalsIgnoreCase(name)) {
			return t_sum_tax_amt();
		}
		if ($f_fob.equalsIgnoreCase(name)) {
			return f_fob();
		}
		if ($fob_cur_nm.equalsIgnoreCase(name)) {
			return fob_cur_nm();
		}
		if ($s_d_fob_amt.equalsIgnoreCase(name)) {
			return s_d_fob_amt();
		}
		if ($s_d_fob_tax_amt.equalsIgnoreCase(name)) {
			return s_d_fob_tax_amt();
		}
		if ($d_tterm_nm1.equalsIgnoreCase(name)) {
			return d_tterm_nm1();
		}
		if ($d_tterm_cd1.equalsIgnoreCase(name)) {
			return d_tterm_cd1();
		}
		if ($d_tterm_nm2.equalsIgnoreCase(name)) {
			return d_tterm_nm2();
		}
		if ($d_tterm_cd2.equalsIgnoreCase(name)) {
			return d_tterm_cd2();
		}
		if ($f_cur_nm.equalsIgnoreCase(name)) {
			return f_cur_nm();
		}
		if ($f_cur_cd.equalsIgnoreCase(name)) {
			return f_cur_cd();
		}
		if ($s_f_amt.equalsIgnoreCase(name)) {
			return s_f_amt();
		}
		if ($s_f_tax_amt.equalsIgnoreCase(name)) {
			return s_f_tax_amt();
		}
		if ($t_no_com.equalsIgnoreCase(name)) {
			return t_no_com();
		}
		if ($f_cur_nm2.equalsIgnoreCase(name)) {
			return f_cur_nm2();
		}
		if ($s_d_ncv_amt.equalsIgnoreCase(name)) {
			return s_d_ncv_amt();
		}
		if ($f_cur_cd2.equalsIgnoreCase(name)) {
			return f_cur_cd2();
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			return f_cntry_org_cd();
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			return t_made_in();
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			return f_cntry_org_nm();
		}
		if ($free.equalsIgnoreCase(name)) {
			return free();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			return d_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			return d_tax_amt();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			return trd_unit_qty2();
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			return base_unit_qty2();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty();
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty2();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			return d_fob_amt();
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			return d_fob_tax_amt();
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			return f_amt();
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			return f_tax_amt();
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			return d_ncv_amt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($t_cust.equalsIgnoreCase(name)) {
			return t_cust();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_no2.equalsIgnoreCase(name)) {
			return cst_po_no2();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_po_d_no2.equalsIgnoreCase(name)) {
			return cst_po_d_no2();
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			return t_itm_code();
		}
		if ($t_po_no.equalsIgnoreCase(name)) {
			return t_po_no();
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			return t_qty();
		}
		if ($t_upri.equalsIgnoreCase(name)) {
			return t_upri();
		}
		if ($t_amt.equalsIgnoreCase(name)) {
			return t_amt();
		}
		if ($t_tax_rate.equalsIgnoreCase(name)) {
			return t_tax_rate();
		}
		if ($t_tax_amt.equalsIgnoreCase(name)) {
			return t_tax_amt();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($s_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_trd_cur_upri();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_d_amt.equalsIgnoreCase(name)) {
			return s_d_amt();
		}
		if ($s_int_d_amt.equalsIgnoreCase(name)) {
			return s_int_d_amt();
		}
		if ($s_dec_d_amt.equalsIgnoreCase(name)) {
			return s_dec_d_amt();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($t_tax_inclusive.equalsIgnoreCase(name)) {
			return t_tax_inclusive();
		}
		if ($s_d_tax_amt.equalsIgnoreCase(name)) {
			return s_d_tax_amt();
		}
		if ($s_int_d_tax_amt.equalsIgnoreCase(name)) {
			return s_int_d_tax_amt();
		}
		if ($s_dec_d_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_d_tax_amt();
		}
		if ($upri_base_unit_nm.equalsIgnoreCase(name)) {
			return upri_base_unit_nm();
		}
		if ($upri_base_unit_cd.equalsIgnoreCase(name)) {
			return upri_base_unit_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($s_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_ptax_cur_amt();
		}
		if ($s_int_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_int_ptax_cur_amt();
		}
		if ($s_dec_ptax_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_ptax_cur_amt();
		}
		if ($s_wtax_amt.equalsIgnoreCase(name)) {
			return s_wtax_amt();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm1();
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm2();
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm3();
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($itm_cd2.equalsIgnoreCase(name)) {
			return itm_cd2();
		}
		if ($itm_sub1_view2.equalsIgnoreCase(name)) {
			return itm_sub1_view2();
		}
		if ($itm_sub2_view2.equalsIgnoreCase(name)) {
			return itm_sub2_view2();
		}
		if ($itm_sub3_view2.equalsIgnoreCase(name)) {
			return itm_sub3_view2();
		}
		if ($itm_sub1_data2.equalsIgnoreCase(name)) {
			return itm_sub1_data2();
		}
		if ($itm_sub2_data2.equalsIgnoreCase(name)) {
			return itm_sub2_data2();
		}
		if ($itm_sub3_data2.equalsIgnoreCase(name)) {
			return itm_sub3_data2();
		}
		if ($cntry_org_nm2.equalsIgnoreCase(name)) {
			return cntry_org_nm2();
		}
		if ($cntry_org_cd2.equalsIgnoreCase(name)) {
			return cntry_org_cd2();
		}
		if ($s_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_trd_unit_qty2();
		}
		if ($s_int_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty2();
		}
		if ($s_dec_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty2();
		}
		if ($trd_unit_nm2.equalsIgnoreCase(name)) {
			return trd_unit_nm2();
		}
		if ($trd_unit_cd2.equalsIgnoreCase(name)) {
			return trd_unit_cd2();
		}
		if ($s_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_base_unit_qty2();
		}
		if ($s_int_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty2();
		}
		if ($s_dec_base_unit_qty2.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty2();
		}
		if ($base_unit_nm2.equalsIgnoreCase(name)) {
			return base_unit_nm2();
		}
		if ($base_unit_cd2.equalsIgnoreCase(name)) {
			return base_unit_cd2();
		}
		if ($s_iv_upri.equalsIgnoreCase(name)) {
			return s_iv_upri();
		}
		if ($s_int_iv_upri.equalsIgnoreCase(name)) {
			return s_int_iv_upri();
		}
		if ($s_dec_iv_upri.equalsIgnoreCase(name)) {
			return s_dec_iv_upri();
		}
		if ($s_iv_amt.equalsIgnoreCase(name)) {
			return s_iv_amt();
		}
		if ($s_int_d_iv_amt.equalsIgnoreCase(name)) {
			return s_int_d_iv_amt();
		}
		if ($s_dec_d_iv_amt.equalsIgnoreCase(name)) {
			return s_dec_d_iv_amt();
		}
		if ($iv_upri_base_unit_nm.equalsIgnoreCase(name)) {
			return iv_upri_base_unit_nm();
		}
		if ($iv_upri_base_unit_cd.equalsIgnoreCase(name)) {
			return iv_upri_base_unit_cd();
		}
		if ($iv_itm_nm2.equalsIgnoreCase(name)) {
			return iv_itm_nm2();
		}
		if ($iv_itm2_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm1();
		}
		if ($iv_itm2_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm2();
		}
		if ($iv_itm2_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm3();
		}
		if ($iv_itm2_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm2_alt_nm4();
		}
		if ($cst_itm_cd2.equalsIgnoreCase(name)) {
			return cst_itm_cd2();
		}
		if ($cst_itm_nm2.equalsIgnoreCase(name)) {
			return cst_itm_nm2();
		}
		if ($t_total.equalsIgnoreCase(name)) {
			return t_total();
		}
		if ($t_total2.equalsIgnoreCase(name)) {
			return t_total2();
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty();
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm();
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd();
		}
		if ($s_sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty2();
		}
		if ($sum_trd_unit_nm2.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm2();
		}
		if ($sum_trd_unit_cd2.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd2();
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_d_sub_char1();
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_d_sub_char2();
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_d_sub_char3();
		}
		if ($t_sum_amt.equalsIgnoreCase(name)) {
			return t_sum_amt();
		}
		if ($t_sum_tax_amt.equalsIgnoreCase(name)) {
			return t_sum_tax_amt();
		}
		if ($f_fob.equalsIgnoreCase(name)) {
			return f_fob();
		}
		if ($fob_cur_nm.equalsIgnoreCase(name)) {
			return fob_cur_nm();
		}
		if ($s_d_fob_amt.equalsIgnoreCase(name)) {
			return s_d_fob_amt();
		}
		if ($s_d_fob_tax_amt.equalsIgnoreCase(name)) {
			return s_d_fob_tax_amt();
		}
		if ($d_tterm_nm1.equalsIgnoreCase(name)) {
			return d_tterm_nm1();
		}
		if ($d_tterm_cd1.equalsIgnoreCase(name)) {
			return d_tterm_cd1();
		}
		if ($d_tterm_nm2.equalsIgnoreCase(name)) {
			return d_tterm_nm2();
		}
		if ($d_tterm_cd2.equalsIgnoreCase(name)) {
			return d_tterm_cd2();
		}
		if ($f_cur_nm.equalsIgnoreCase(name)) {
			return f_cur_nm();
		}
		if ($f_cur_cd.equalsIgnoreCase(name)) {
			return f_cur_cd();
		}
		if ($s_f_amt.equalsIgnoreCase(name)) {
			return s_f_amt();
		}
		if ($s_f_tax_amt.equalsIgnoreCase(name)) {
			return s_f_tax_amt();
		}
		if ($t_no_com.equalsIgnoreCase(name)) {
			return t_no_com();
		}
		if ($f_cur_nm2.equalsIgnoreCase(name)) {
			return f_cur_nm2();
		}
		if ($s_d_ncv_amt.equalsIgnoreCase(name)) {
			return s_d_ncv_amt();
		}
		if ($f_cur_cd2.equalsIgnoreCase(name)) {
			return f_cur_cd2();
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			return f_cntry_org_cd();
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			return t_made_in();
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			return f_cntry_org_nm();
		}
		if ($free.equalsIgnoreCase(name)) {
			return free();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			return d_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			return d_tax_amt();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			return trd_unit_qty2();
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			return base_unit_qty2();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty();
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty2();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			return d_fob_amt();
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			return d_fob_tax_amt();
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			return f_amt();
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			return f_tax_amt();
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			return d_ncv_amt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($t_cust.equalsIgnoreCase(name)) {
			t_cust(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_no2.equalsIgnoreCase(name)) {
			cst_po_no2(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_po_d_no2.equalsIgnoreCase(name)) {
			cst_po_d_no2(value);
			return;
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			t_itm_code(value);
			return;
		}
		if ($t_po_no.equalsIgnoreCase(name)) {
			t_po_no(value);
			return;
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			t_qty(value);
			return;
		}
		if ($t_upri.equalsIgnoreCase(name)) {
			t_upri(value);
			return;
		}
		if ($t_amt.equalsIgnoreCase(name)) {
			t_amt(value);
			return;
		}
		if ($t_tax_rate.equalsIgnoreCase(name)) {
			t_tax_rate(value);
			return;
		}
		if ($t_tax_amt.equalsIgnoreCase(name)) {
			t_tax_amt(value);
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
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($s_trd_cur_upri.equalsIgnoreCase(name)) {
			s_trd_cur_upri(value);
			return;
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_upri(value);
			return;
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_upri(value);
			return;
		}
		if ($s_d_amt.equalsIgnoreCase(name)) {
			s_d_amt(value);
			return;
		}
		if ($s_int_d_amt.equalsIgnoreCase(name)) {
			s_int_d_amt(value);
			return;
		}
		if ($s_dec_d_amt.equalsIgnoreCase(name)) {
			s_dec_d_amt(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($t_tax_inclusive.equalsIgnoreCase(name)) {
			t_tax_inclusive(value);
			return;
		}
		if ($s_d_tax_amt.equalsIgnoreCase(name)) {
			s_d_tax_amt(value);
			return;
		}
		if ($s_int_d_tax_amt.equalsIgnoreCase(name)) {
			s_int_d_tax_amt(value);
			return;
		}
		if ($s_dec_d_tax_amt.equalsIgnoreCase(name)) {
			s_dec_d_tax_amt(value);
			return;
		}
		if ($upri_base_unit_nm.equalsIgnoreCase(name)) {
			upri_base_unit_nm(value);
			return;
		}
		if ($upri_base_unit_cd.equalsIgnoreCase(name)) {
			upri_base_unit_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($s_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_ptax_cur_amt(value);
			return;
		}
		if ($s_int_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_int_ptax_cur_amt(value);
			return;
		}
		if ($s_dec_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_dec_ptax_cur_amt(value);
			return;
		}
		if ($s_wtax_amt.equalsIgnoreCase(name)) {
			s_wtax_amt(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm_alt_nm1(value);
			return;
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm_alt_nm2(value);
			return;
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm_alt_nm3(value);
			return;
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($itm_cd2.equalsIgnoreCase(name)) {
			itm_cd2(value);
			return;
		}
		if ($itm_sub1_view2.equalsIgnoreCase(name)) {
			itm_sub1_view2(value);
			return;
		}
		if ($itm_sub2_view2.equalsIgnoreCase(name)) {
			itm_sub2_view2(value);
			return;
		}
		if ($itm_sub3_view2.equalsIgnoreCase(name)) {
			itm_sub3_view2(value);
			return;
		}
		if ($itm_sub1_data2.equalsIgnoreCase(name)) {
			itm_sub1_data2(value);
			return;
		}
		if ($itm_sub2_data2.equalsIgnoreCase(name)) {
			itm_sub2_data2(value);
			return;
		}
		if ($itm_sub3_data2.equalsIgnoreCase(name)) {
			itm_sub3_data2(value);
			return;
		}
		if ($cntry_org_nm2.equalsIgnoreCase(name)) {
			cntry_org_nm2(value);
			return;
		}
		if ($cntry_org_cd2.equalsIgnoreCase(name)) {
			cntry_org_cd2(value);
			return;
		}
		if ($s_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_trd_unit_qty2(value);
			return;
		}
		if ($s_int_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty2(value);
			return;
		}
		if ($s_dec_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty2(value);
			return;
		}
		if ($trd_unit_nm2.equalsIgnoreCase(name)) {
			trd_unit_nm2(value);
			return;
		}
		if ($trd_unit_cd2.equalsIgnoreCase(name)) {
			trd_unit_cd2(value);
			return;
		}
		if ($s_base_unit_qty2.equalsIgnoreCase(name)) {
			s_base_unit_qty2(value);
			return;
		}
		if ($s_int_base_unit_qty2.equalsIgnoreCase(name)) {
			s_int_base_unit_qty2(value);
			return;
		}
		if ($s_dec_base_unit_qty2.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty2(value);
			return;
		}
		if ($base_unit_nm2.equalsIgnoreCase(name)) {
			base_unit_nm2(value);
			return;
		}
		if ($base_unit_cd2.equalsIgnoreCase(name)) {
			base_unit_cd2(value);
			return;
		}
		if ($s_iv_upri.equalsIgnoreCase(name)) {
			s_iv_upri(value);
			return;
		}
		if ($s_int_iv_upri.equalsIgnoreCase(name)) {
			s_int_iv_upri(value);
			return;
		}
		if ($s_dec_iv_upri.equalsIgnoreCase(name)) {
			s_dec_iv_upri(value);
			return;
		}
		if ($s_iv_amt.equalsIgnoreCase(name)) {
			s_iv_amt(value);
			return;
		}
		if ($s_int_d_iv_amt.equalsIgnoreCase(name)) {
			s_int_d_iv_amt(value);
			return;
		}
		if ($s_dec_d_iv_amt.equalsIgnoreCase(name)) {
			s_dec_d_iv_amt(value);
			return;
		}
		if ($iv_upri_base_unit_nm.equalsIgnoreCase(name)) {
			iv_upri_base_unit_nm(value);
			return;
		}
		if ($iv_upri_base_unit_cd.equalsIgnoreCase(name)) {
			iv_upri_base_unit_cd(value);
			return;
		}
		if ($iv_itm_nm2.equalsIgnoreCase(name)) {
			iv_itm_nm2(value);
			return;
		}
		if ($iv_itm2_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm1(value);
			return;
		}
		if ($iv_itm2_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm2(value);
			return;
		}
		if ($iv_itm2_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm3(value);
			return;
		}
		if ($iv_itm2_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd2.equalsIgnoreCase(name)) {
			cst_itm_cd2(value);
			return;
		}
		if ($cst_itm_nm2.equalsIgnoreCase(name)) {
			cst_itm_nm2(value);
			return;
		}
		if ($t_total.equalsIgnoreCase(name)) {
			t_total(value);
			return;
		}
		if ($t_total2.equalsIgnoreCase(name)) {
			t_total2(value);
			return;
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			sum_trd_unit_nm(value);
			return;
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			sum_trd_unit_cd(value);
			return;
		}
		if ($s_sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty2(value);
			return;
		}
		if ($sum_trd_unit_nm2.equalsIgnoreCase(name)) {
			sum_trd_unit_nm2(value);
			return;
		}
		if ($sum_trd_unit_cd2.equalsIgnoreCase(name)) {
			sum_trd_unit_cd2(value);
			return;
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			iv_d_sub_char1(value);
			return;
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			iv_d_sub_char2(value);
			return;
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			iv_d_sub_char3(value);
			return;
		}
		if ($t_sum_amt.equalsIgnoreCase(name)) {
			t_sum_amt(value);
			return;
		}
		if ($t_sum_tax_amt.equalsIgnoreCase(name)) {
			t_sum_tax_amt(value);
			return;
		}
		if ($f_fob.equalsIgnoreCase(name)) {
			f_fob(value);
			return;
		}
		if ($fob_cur_nm.equalsIgnoreCase(name)) {
			fob_cur_nm(value);
			return;
		}
		if ($s_d_fob_amt.equalsIgnoreCase(name)) {
			s_d_fob_amt(value);
			return;
		}
		if ($s_d_fob_tax_amt.equalsIgnoreCase(name)) {
			s_d_fob_tax_amt(value);
			return;
		}
		if ($d_tterm_nm1.equalsIgnoreCase(name)) {
			d_tterm_nm1(value);
			return;
		}
		if ($d_tterm_cd1.equalsIgnoreCase(name)) {
			d_tterm_cd1(value);
			return;
		}
		if ($d_tterm_nm2.equalsIgnoreCase(name)) {
			d_tterm_nm2(value);
			return;
		}
		if ($d_tterm_cd2.equalsIgnoreCase(name)) {
			d_tterm_cd2(value);
			return;
		}
		if ($f_cur_nm.equalsIgnoreCase(name)) {
			f_cur_nm(value);
			return;
		}
		if ($f_cur_cd.equalsIgnoreCase(name)) {
			f_cur_cd(value);
			return;
		}
		if ($s_f_amt.equalsIgnoreCase(name)) {
			s_f_amt(value);
			return;
		}
		if ($s_f_tax_amt.equalsIgnoreCase(name)) {
			s_f_tax_amt(value);
			return;
		}
		if ($t_no_com.equalsIgnoreCase(name)) {
			t_no_com(value);
			return;
		}
		if ($f_cur_nm2.equalsIgnoreCase(name)) {
			f_cur_nm2(value);
			return;
		}
		if ($s_d_ncv_amt.equalsIgnoreCase(name)) {
			s_d_ncv_amt(value);
			return;
		}
		if ($f_cur_cd2.equalsIgnoreCase(name)) {
			f_cur_cd2(value);
			return;
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			f_cntry_org_cd(value);
			return;
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			t_made_in(value);
			return;
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			f_cntry_org_nm(value);
			return;
		}
		if ($free.equalsIgnoreCase(name)) {
			free(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($t_cust.equalsIgnoreCase(name)) {
			t_cust(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_no2.equalsIgnoreCase(name)) {
			cst_po_no2(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_po_d_no2.equalsIgnoreCase(name)) {
			cst_po_d_no2(value);
			return;
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			t_itm_code(value);
			return;
		}
		if ($t_po_no.equalsIgnoreCase(name)) {
			t_po_no(value);
			return;
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			t_qty(value);
			return;
		}
		if ($t_upri.equalsIgnoreCase(name)) {
			t_upri(value);
			return;
		}
		if ($t_amt.equalsIgnoreCase(name)) {
			t_amt(value);
			return;
		}
		if ($t_tax_rate.equalsIgnoreCase(name)) {
			t_tax_rate(value);
			return;
		}
		if ($t_tax_amt.equalsIgnoreCase(name)) {
			t_tax_amt(value);
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
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($s_trd_cur_upri.equalsIgnoreCase(name)) {
			s_trd_cur_upri(value);
			return;
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_upri(value);
			return;
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_upri(value);
			return;
		}
		if ($s_d_amt.equalsIgnoreCase(name)) {
			s_d_amt(value);
			return;
		}
		if ($s_int_d_amt.equalsIgnoreCase(name)) {
			s_int_d_amt(value);
			return;
		}
		if ($s_dec_d_amt.equalsIgnoreCase(name)) {
			s_dec_d_amt(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($t_tax_inclusive.equalsIgnoreCase(name)) {
			t_tax_inclusive(value);
			return;
		}
		if ($s_d_tax_amt.equalsIgnoreCase(name)) {
			s_d_tax_amt(value);
			return;
		}
		if ($s_int_d_tax_amt.equalsIgnoreCase(name)) {
			s_int_d_tax_amt(value);
			return;
		}
		if ($s_dec_d_tax_amt.equalsIgnoreCase(name)) {
			s_dec_d_tax_amt(value);
			return;
		}
		if ($upri_base_unit_nm.equalsIgnoreCase(name)) {
			upri_base_unit_nm(value);
			return;
		}
		if ($upri_base_unit_cd.equalsIgnoreCase(name)) {
			upri_base_unit_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($s_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_ptax_cur_amt(value);
			return;
		}
		if ($s_int_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_int_ptax_cur_amt(value);
			return;
		}
		if ($s_dec_ptax_cur_amt.equalsIgnoreCase(name)) {
			s_dec_ptax_cur_amt(value);
			return;
		}
		if ($s_wtax_amt.equalsIgnoreCase(name)) {
			s_wtax_amt(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm_alt_nm1(value);
			return;
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm_alt_nm2(value);
			return;
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm_alt_nm3(value);
			return;
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($itm_cd2.equalsIgnoreCase(name)) {
			itm_cd2(value);
			return;
		}
		if ($itm_sub1_view2.equalsIgnoreCase(name)) {
			itm_sub1_view2(value);
			return;
		}
		if ($itm_sub2_view2.equalsIgnoreCase(name)) {
			itm_sub2_view2(value);
			return;
		}
		if ($itm_sub3_view2.equalsIgnoreCase(name)) {
			itm_sub3_view2(value);
			return;
		}
		if ($itm_sub1_data2.equalsIgnoreCase(name)) {
			itm_sub1_data2(value);
			return;
		}
		if ($itm_sub2_data2.equalsIgnoreCase(name)) {
			itm_sub2_data2(value);
			return;
		}
		if ($itm_sub3_data2.equalsIgnoreCase(name)) {
			itm_sub3_data2(value);
			return;
		}
		if ($cntry_org_nm2.equalsIgnoreCase(name)) {
			cntry_org_nm2(value);
			return;
		}
		if ($cntry_org_cd2.equalsIgnoreCase(name)) {
			cntry_org_cd2(value);
			return;
		}
		if ($s_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_trd_unit_qty2(value);
			return;
		}
		if ($s_int_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty2(value);
			return;
		}
		if ($s_dec_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty2(value);
			return;
		}
		if ($trd_unit_nm2.equalsIgnoreCase(name)) {
			trd_unit_nm2(value);
			return;
		}
		if ($trd_unit_cd2.equalsIgnoreCase(name)) {
			trd_unit_cd2(value);
			return;
		}
		if ($s_base_unit_qty2.equalsIgnoreCase(name)) {
			s_base_unit_qty2(value);
			return;
		}
		if ($s_int_base_unit_qty2.equalsIgnoreCase(name)) {
			s_int_base_unit_qty2(value);
			return;
		}
		if ($s_dec_base_unit_qty2.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty2(value);
			return;
		}
		if ($base_unit_nm2.equalsIgnoreCase(name)) {
			base_unit_nm2(value);
			return;
		}
		if ($base_unit_cd2.equalsIgnoreCase(name)) {
			base_unit_cd2(value);
			return;
		}
		if ($s_iv_upri.equalsIgnoreCase(name)) {
			s_iv_upri(value);
			return;
		}
		if ($s_int_iv_upri.equalsIgnoreCase(name)) {
			s_int_iv_upri(value);
			return;
		}
		if ($s_dec_iv_upri.equalsIgnoreCase(name)) {
			s_dec_iv_upri(value);
			return;
		}
		if ($s_iv_amt.equalsIgnoreCase(name)) {
			s_iv_amt(value);
			return;
		}
		if ($s_int_d_iv_amt.equalsIgnoreCase(name)) {
			s_int_d_iv_amt(value);
			return;
		}
		if ($s_dec_d_iv_amt.equalsIgnoreCase(name)) {
			s_dec_d_iv_amt(value);
			return;
		}
		if ($iv_upri_base_unit_nm.equalsIgnoreCase(name)) {
			iv_upri_base_unit_nm(value);
			return;
		}
		if ($iv_upri_base_unit_cd.equalsIgnoreCase(name)) {
			iv_upri_base_unit_cd(value);
			return;
		}
		if ($iv_itm_nm2.equalsIgnoreCase(name)) {
			iv_itm_nm2(value);
			return;
		}
		if ($iv_itm2_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm1(value);
			return;
		}
		if ($iv_itm2_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm2(value);
			return;
		}
		if ($iv_itm2_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm3(value);
			return;
		}
		if ($iv_itm2_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm2_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd2.equalsIgnoreCase(name)) {
			cst_itm_cd2(value);
			return;
		}
		if ($cst_itm_nm2.equalsIgnoreCase(name)) {
			cst_itm_nm2(value);
			return;
		}
		if ($t_total.equalsIgnoreCase(name)) {
			t_total(value);
			return;
		}
		if ($t_total2.equalsIgnoreCase(name)) {
			t_total2(value);
			return;
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			sum_trd_unit_nm(value);
			return;
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			sum_trd_unit_cd(value);
			return;
		}
		if ($s_sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty2(value);
			return;
		}
		if ($sum_trd_unit_nm2.equalsIgnoreCase(name)) {
			sum_trd_unit_nm2(value);
			return;
		}
		if ($sum_trd_unit_cd2.equalsIgnoreCase(name)) {
			sum_trd_unit_cd2(value);
			return;
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			iv_d_sub_char1(value);
			return;
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			iv_d_sub_char2(value);
			return;
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			iv_d_sub_char3(value);
			return;
		}
		if ($t_sum_amt.equalsIgnoreCase(name)) {
			t_sum_amt(value);
			return;
		}
		if ($t_sum_tax_amt.equalsIgnoreCase(name)) {
			t_sum_tax_amt(value);
			return;
		}
		if ($f_fob.equalsIgnoreCase(name)) {
			f_fob(value);
			return;
		}
		if ($fob_cur_nm.equalsIgnoreCase(name)) {
			fob_cur_nm(value);
			return;
		}
		if ($s_d_fob_amt.equalsIgnoreCase(name)) {
			s_d_fob_amt(value);
			return;
		}
		if ($s_d_fob_tax_amt.equalsIgnoreCase(name)) {
			s_d_fob_tax_amt(value);
			return;
		}
		if ($d_tterm_nm1.equalsIgnoreCase(name)) {
			d_tterm_nm1(value);
			return;
		}
		if ($d_tterm_cd1.equalsIgnoreCase(name)) {
			d_tterm_cd1(value);
			return;
		}
		if ($d_tterm_nm2.equalsIgnoreCase(name)) {
			d_tterm_nm2(value);
			return;
		}
		if ($d_tterm_cd2.equalsIgnoreCase(name)) {
			d_tterm_cd2(value);
			return;
		}
		if ($f_cur_nm.equalsIgnoreCase(name)) {
			f_cur_nm(value);
			return;
		}
		if ($f_cur_cd.equalsIgnoreCase(name)) {
			f_cur_cd(value);
			return;
		}
		if ($s_f_amt.equalsIgnoreCase(name)) {
			s_f_amt(value);
			return;
		}
		if ($s_f_tax_amt.equalsIgnoreCase(name)) {
			s_f_tax_amt(value);
			return;
		}
		if ($t_no_com.equalsIgnoreCase(name)) {
			t_no_com(value);
			return;
		}
		if ($f_cur_nm2.equalsIgnoreCase(name)) {
			f_cur_nm2(value);
			return;
		}
		if ($s_d_ncv_amt.equalsIgnoreCase(name)) {
			s_d_ncv_amt(value);
			return;
		}
		if ($f_cur_cd2.equalsIgnoreCase(name)) {
			f_cur_cd2(value);
			return;
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			f_cntry_org_cd(value);
			return;
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			t_made_in(value);
			return;
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			f_cntry_org_nm(value);
			return;
		}
		if ($free.equalsIgnoreCase(name)) {
			free(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
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
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_qty2.equalsIgnoreCase(name)) {
			trd_unit_qty2(value);
			return;
		}
		if ($base_unit_qty2.equalsIgnoreCase(name)) {
			base_unit_qty2(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_qty2.equalsIgnoreCase(name)) {
			sum_trd_unit_qty2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($d_fob_amt.equalsIgnoreCase(name)) {
			d_fob_amt(value);
			return;
		}
		if ($d_fob_tax_amt.equalsIgnoreCase(name)) {
			d_fob_tax_amt(value);
			return;
		}
		if ($f_amt.equalsIgnoreCase(name)) {
			f_amt(value);
			return;
		}
		if ($f_tax_amt.equalsIgnoreCase(name)) {
			f_tax_amt(value);
			return;
		}
		if ($d_ncv_amt.equalsIgnoreCase(name)) {
			d_ncv_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

