package mcframe.commonMSBE.MSBER0500;

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
 * ブロック"DlvSlipDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvSlipDtlR_MC_A extends MCConstRow {

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public static final String $dlv_slip_d_seq = "dlv_slip_d_seq";
	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	/**
	 *  納品書品目ＣＤ.<p>
	 *
	 */
	public static final String $dlv_slip_itm_cd = "dlv_slip_itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  納品書品名.<p>
	 *
	 */
	public static final String $dlv_slip_itm_nm = "dlv_slip_itm_nm";
	/**
	 *  納品書品目別名１.<p>
	 *
	 */
	public static final String $dlv_slip_itm_alt_nm1 = "dlv_slip_itm_alt_nm1";
	/**
	 *  納品書品目別名２.<p>
	 *
	 */
	public static final String $dlv_slip_itm_alt_nm2 = "dlv_slip_itm_alt_nm2";
	/**
	 *  納品書品目別名３.<p>
	 *
	 */
	public static final String $dlv_slip_itm_alt_nm3 = "dlv_slip_itm_alt_nm3";
	/**
	 *  納品書品目別名４.<p>
	 *
	 */
	public static final String $dlv_slip_itm_alt_nm4 = "dlv_slip_itm_alt_nm4";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ（データ用）.<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_plural_flg = "lot_plural_flg";
	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_lot_plural_flg = "s_lot_plural_flg";
	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ（データ用）.<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public static final String $sublot_plural_flg = "sublot_plural_flg";
	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_sublot_plural_flg = "s_sublot_plural_flg";
	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public static final String $trd_unit_po_qty = "trd_unit_po_qty";
	/**
	 *  取引単位発注数量文字列.<p>
	 *
	 */
	public static final String $s_trd_unit_po_qty = "s_trd_unit_po_qty";
	/**
	 *  取引単位発注数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_po_qty = "s_int_trd_unit_po_qty";
	/**
	 *  取引単位発注数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_po_qty = "s_dec_trd_unit_po_qty";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位数量文字列.<p>
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
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  納入指示数量.<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	/**
	 *  納入指示数量文字列.<p>
	 *
	 */
	public static final String $s_dlv_inst_qty = "s_dlv_inst_qty";
	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_dlv_inst_qty = "s_int_dlv_inst_qty";
	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_dlv_inst_qty = "s_dec_dlv_inst_qty";
	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public static final String $dlv_inst_unit_nm = "dlv_inst_unit_nm";
	/**
	 *  納入指示単位ＣＤ.<p>
	 *
	 */
	public static final String $dlv_inst_unit_cd = "dlv_inst_unit_cd";
	/**
	 *  受発注数量.<p>
	 *
	 */
	public static final String $slo_po_qty = "slo_po_qty";
	/**
	 *  受発注数量文字列.<p>
	 *
	 */
	public static final String $s_slo_po_qty = "s_slo_po_qty";
	/**
	 *  受発注数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_slo_po_qty = "s_int_slo_po_qty";
	/**
	 *  受発注数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_slo_po_qty = "s_dec_slo_po_qty";
	/**
	 *  受発注単位名.<p>
	 *
	 */
	public static final String $slo_po_unit_nm = "slo_po_unit_nm";
	/**
	 *  受発注単位ＣＤ.<p>
	 *
	 */
	public static final String $slo_po_unit_cd = "slo_po_unit_cd";
	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  取引通貨単価文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_upri = "s_trd_cur_upri";
	/**
	 *  取引通貨単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_upri = "s_int_trd_cur_upri";
	/**
	 *  取引通貨単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_upri = "s_dec_trd_cur_upri";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_amt = "s_trd_cur_amt";
	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_amt = "s_int_trd_cur_amt";
	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_amt = "s_dec_trd_cur_amt";
	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  税率文字列.<p>
	 *
	 */
	public static final String $s_tax_rate = "s_tax_rate";
	/**
	 *  税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 *  税額（内税）.<p>
	 *
	 */
	public static final String $t_inc_tax = "t_inc_tax";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  内税文字列.<p>
	 *
	 */
	public static final String $s_inc_tax_flg = "s_inc_tax_flg";
	/**
	 *  仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public static final String $s_interim_flg = "s_interim_flg";
	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_tax_in_amt = "trd_cur_tax_in_amt";
	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_tax_in_amt = "s_trd_cur_tax_in_amt";
	/**
	 *  取引通貨税込金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_tax_in_amt = "s_int_trd_cur_tax_in_amt";
	/**
	 *  取引通貨税込金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_tax_in_amt = "s_dec_trd_cur_tax_in_amt";
	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_tax_amt = "s_trd_cur_tax_amt";
	/**
	 *  取引通貨税額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_tax_amt = "s_int_trd_cur_tax_amt";
	/**
	 *  取引通貨税額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_tax_amt = "s_dec_trd_cur_tax_amt";
	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_dscnt_amt = "s_trd_cur_dscnt_amt";
	/**
	 *  取引通貨値引額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_dscnt_amt = "s_int_trd_cur_dscnt_amt";
	/**
	 *  取引通貨値引額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_dscnt_amt = "s_dec_trd_cur_dscnt_amt";
	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	/**
	 *  納品書注文明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_po_d_no = "dlv_slip_po_d_no";
	/**
	 *  重量.<p>
	 *
	 */
	public static final String $ship_wt = "ship_wt";
	/**
	 *  重量文字列.<p>
	 *
	 */
	public static final String $s_ship_wt = "s_ship_wt";
	/**
	 *  容積.<p>
	 *
	 */
	public static final String $ship_dim = "ship_dim";
	/**
	 *  容積文字列.<p>
	 *
	 */
	public static final String $s_ship_dim = "s_ship_dim";
	/**
	 *  取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 *  発注者取引明細備考.<p>
	 *
	 */
	public static final String $po_trd_d_rmrks = "po_trd_d_rmrks";
	/**
	 *  包装個数.<p>
	 *
	 */
	public static final String $pack_qty = "pack_qty";
	/**
	 *  包装個数文字列.<p>
	 *
	 */
	public static final String $s_pack_qty = "s_pack_qty";
	/**
	 *  合計包装個数.<p>
	 *
	 */
	public static final String $ttl_pack_qty = "ttl_pack_qty";
	/**
	 *  合計包装個数文字列.<p>
	 *
	 */
	public static final String $s_ttl_pack_qty = "s_ttl_pack_qty";
	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public static final String $po_d_sub_char1 = "po_d_sub_char1";
	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public static final String $po_d_sub_char2 = "po_d_sub_char2";
	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public static final String $po_d_sub_char3 = "po_d_sub_char3";
	/**
	 *  入荷予定予備１.<p>
	 *
	 */
	public static final String $arr_schd_sub_char1 = "arr_schd_sub_char1";
	/**
	 *  入荷予定予備２.<p>
	 *
	 */
	public static final String $arr_schd_sub_char2 = "arr_schd_sub_char2";
	/**
	 *  入荷予定予備３.<p>
	 *
	 */
	public static final String $arr_schd_sub_char3 = "arr_schd_sub_char3";
	/**
	 *  納品書明細予備１.<p>
	 *
	 */
	public static final String $dlt_slip_d_sub_char1 = "dlt_slip_d_sub_char1";
	/**
	 *  納品書明細予備２.<p>
	 *
	 */
	public static final String $dlt_slip_d_sub_char2 = "dlt_slip_d_sub_char2";
	/**
	 *  納品書明細予備３.<p>
	 *
	 */
	public static final String $dlt_slip_d_sub_char3 = "dlt_slip_d_sub_char3";
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
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 *  支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 *  支給計上日（基）ラベル.<p>
	 *
	 */
	public static final String $base_ac_dt_lbl = "base_ac_dt_lbl";
	/**
	 *  支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";


	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_itm_cd_META = createCommonMeta($dlv_slip_itm_cd, mcframe.commonMS.meta.MS_META.DLV_SLIP_ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dlv_slip_itm_nm_META = createCommonMeta($dlv_slip_itm_nm, mcframe.commonMS.meta.MS_META.DLV_SLIP_ITM_NM);
	public static final MCMeta dlv_slip_itm_alt_nm1_META = createCommonMeta($dlv_slip_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta dlv_slip_itm_alt_nm2_META = createCommonMeta($dlv_slip_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta dlv_slip_itm_alt_nm3_META = createCommonMeta($dlv_slip_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta dlv_slip_itm_alt_nm4_META = createCommonMeta($dlv_slip_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_plural_flg_META = createCommonMeta($lot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_lot_plural_flg_META = createStringMeta($s_lot_plural_flg);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_plural_flg_META = createCommonMeta($sublot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_sublot_plural_flg_META = createStringMeta($s_sublot_plural_flg);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_po_qty_META = createCommonMeta($trd_unit_po_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_po_qty_META = createStringMeta($s_trd_unit_po_qty);
	public static final MCMeta s_int_trd_unit_po_qty_META = createStringMeta($s_int_trd_unit_po_qty);
	public static final MCMeta s_dec_trd_unit_po_qty_META = createStringMeta($s_dec_trd_unit_po_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta s_int_base_unit_qty_META = createStringMeta($s_int_base_unit_qty);
	public static final MCMeta s_dec_base_unit_qty_META = createStringMeta($s_dec_base_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_dlv_inst_qty_META = createStringMeta($s_dlv_inst_qty);
	public static final MCMeta s_int_dlv_inst_qty_META = createStringMeta($s_int_dlv_inst_qty);
	public static final MCMeta s_dec_dlv_inst_qty_META = createStringMeta($s_dec_dlv_inst_qty);
	public static final MCMeta dlv_inst_unit_nm_META = createCommonMeta($dlv_inst_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dlv_inst_unit_cd_META = createCommonMeta($dlv_inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta slo_po_qty_META = createCommonMeta($slo_po_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_slo_po_qty_META = createStringMeta($s_slo_po_qty);
	public static final MCMeta s_int_slo_po_qty_META = createStringMeta($s_int_slo_po_qty);
	public static final MCMeta s_dec_slo_po_qty_META = createStringMeta($s_dec_slo_po_qty);
	public static final MCMeta slo_po_unit_nm_META = createCommonMeta($slo_po_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta slo_po_unit_cd_META = createCommonMeta($slo_po_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_upri_META = createStringMeta($s_trd_cur_upri);
	public static final MCMeta s_int_trd_cur_upri_META = createStringMeta($s_int_trd_cur_upri);
	public static final MCMeta s_dec_trd_cur_upri_META = createStringMeta($s_dec_trd_cur_upri);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_amt_META = createStringMeta($s_trd_cur_amt);
	public static final MCMeta s_int_trd_cur_amt_META = createStringMeta($s_int_trd_cur_amt);
	public static final MCMeta s_dec_trd_cur_amt_META = createStringMeta($s_dec_trd_cur_amt);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate_META = createStringMeta($s_tax_rate);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta t_inc_tax_META = createStringMeta($t_inc_tax);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_inc_tax_flg_META = createStringMeta($s_inc_tax_flg);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_interim_flg_META = createStringMeta($s_interim_flg);
	public static final MCMeta trd_cur_tax_in_amt_META = createCommonMeta($trd_cur_tax_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_tax_in_amt_META = createStringMeta($s_trd_cur_tax_in_amt);
	public static final MCMeta s_int_trd_cur_tax_in_amt_META = createStringMeta($s_int_trd_cur_tax_in_amt);
	public static final MCMeta s_dec_trd_cur_tax_in_amt_META = createStringMeta($s_dec_trd_cur_tax_in_amt);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_tax_amt_META = createStringMeta($s_trd_cur_tax_amt);
	public static final MCMeta s_int_trd_cur_tax_amt_META = createStringMeta($s_int_trd_cur_tax_amt);
	public static final MCMeta s_dec_trd_cur_tax_amt_META = createStringMeta($s_dec_trd_cur_tax_amt);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_dscnt_amt_META = createStringMeta($s_trd_cur_dscnt_amt);
	public static final MCMeta s_int_trd_cur_dscnt_amt_META = createStringMeta($s_int_trd_cur_dscnt_amt);
	public static final MCMeta s_dec_trd_cur_dscnt_amt_META = createStringMeta($s_dec_trd_cur_dscnt_amt);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dlv_slip_po_d_no_META = createCommonMeta($dlv_slip_po_d_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_PO_D_NO);
	public static final MCMeta ship_wt_META = createCommonMeta($ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_ship_wt_META = createStringMeta($s_ship_wt);
	public static final MCMeta ship_dim_META = createCommonMeta($ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta s_ship_dim_META = createStringMeta($s_ship_dim);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_trd_d_rmrks_META = createCommonMeta($po_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta pack_qty_META = createCommonMeta($pack_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_pack_qty_META = createStringMeta($s_pack_qty);
	public static final MCMeta ttl_pack_qty_META = createCommonMeta($ttl_pack_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_ttl_pack_qty_META = createStringMeta($s_ttl_pack_qty);
	public static final MCMeta po_d_sub_char1_META = createCommonMeta($po_d_sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta po_d_sub_char2_META = createCommonMeta($po_d_sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta po_d_sub_char3_META = createCommonMeta($po_d_sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta arr_schd_sub_char1_META = createCommonMeta($arr_schd_sub_char1, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR1);
	public static final MCMeta arr_schd_sub_char2_META = createCommonMeta($arr_schd_sub_char2, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR2);
	public static final MCMeta arr_schd_sub_char3_META = createCommonMeta($arr_schd_sub_char3, mcframe.commonMS.meta.MS_META.ARR_SCHD_SUB_CHAR3);
	public static final MCMeta dlt_slip_d_sub_char1_META = createCommonMeta($dlt_slip_d_sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR1);
	public static final MCMeta dlt_slip_d_sub_char2_META = createCommonMeta($dlt_slip_d_sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR2);
	public static final MCMeta dlt_slip_d_sub_char3_META = createCommonMeta($dlt_slip_d_sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR3);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta base_ac_dt_lbl_META = createStringMeta($base_ac_dt_lbl);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DlvSlipDtlR> constMetas = new ConstMetaList<DlvSlipDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META,
			ship_dlv_slip_d_no_META,
			dlv_slip_itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			dlv_slip_itm_nm_META,
			dlv_slip_itm_alt_nm1_META,
			dlv_slip_itm_alt_nm2_META,
			dlv_slip_itm_alt_nm3_META,
			dlv_slip_itm_alt_nm4_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			lot_no_view_META,
			lot_no_data_META,
			lot_plural_flg_META,
			s_lot_plural_flg_META,
			sublot_no_view_META,
			sublot_no_data_META,
			sublot_plural_flg_META,
			s_sublot_plural_flg_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_po_qty_META,
			s_trd_unit_po_qty_META,
			s_int_trd_unit_po_qty_META,
			s_dec_trd_unit_po_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			s_int_base_unit_qty_META,
			s_dec_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			dlv_inst_qty_META,
			s_dlv_inst_qty_META,
			s_int_dlv_inst_qty_META,
			s_dec_dlv_inst_qty_META,
			dlv_inst_unit_nm_META,
			dlv_inst_unit_cd_META,
			slo_po_qty_META,
			s_slo_po_qty_META,
			s_int_slo_po_qty_META,
			s_dec_slo_po_qty_META,
			slo_po_unit_nm_META,
			slo_po_unit_cd_META,
			trd_cur_upri_META,
			s_trd_cur_upri_META,
			s_int_trd_cur_upri_META,
			s_dec_trd_cur_upri_META,
			trd_cur_amt_META,
			s_trd_cur_amt_META,
			s_int_trd_cur_amt_META,
			s_dec_trd_cur_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			s_tax_rate_META,
			tax_typ_META,
			t_inc_tax_META,
			inc_tax_flg_META,
			s_inc_tax_flg_META,
			interim_flg_META,
			s_interim_flg_META,
			trd_cur_tax_in_amt_META,
			s_trd_cur_tax_in_amt_META,
			s_int_trd_cur_tax_in_amt_META,
			s_dec_trd_cur_tax_in_amt_META,
			trd_cur_tax_amt_META,
			s_trd_cur_tax_amt_META,
			s_int_trd_cur_tax_amt_META,
			s_dec_trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			s_trd_cur_dscnt_amt_META,
			s_int_trd_cur_dscnt_amt_META,
			s_dec_trd_cur_dscnt_amt_META,
			dlv_inst_no_META,
			dlv_inst_d_no_META,
			dlv_slip_po_d_no_META,
			ship_wt_META,
			s_ship_wt_META,
			ship_dim_META,
			s_ship_dim_META,
			trd_d_rmrks_META,
			po_trd_d_rmrks_META,
			pack_qty_META,
			s_pack_qty_META,
			ttl_pack_qty_META,
			s_ttl_pack_qty_META,
			po_d_sub_char1_META,
			po_d_sub_char2_META,
			po_d_sub_char3_META,
			arr_schd_sub_char1_META,
			arr_schd_sub_char2_META,
			arr_schd_sub_char3_META,
			dlt_slip_d_sub_char1_META,
			dlt_slip_d_sub_char2_META,
			dlt_slip_d_sub_char3_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			dscnt_itm_flg_META,
			prov_basis_typ_META,
			base_ac_dt_lbl_META,
			base_ac_dt_META
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
	protected DlvSlipDtlR_MC_A(ConstMetaList<? extends DlvSlipDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipDtlR clone() {
		return (DlvSlipDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipDtlR createInstance() {
		return (DlvSlipDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvSlipDtlR getValues(String... names) {
		return (DlvSlipDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 0, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 0, $dlv_slip_d_no, value);
	}


	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 1, $dlv_slip_d_seq);
	}

	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}

	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}

	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}

	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}

	/**
	 *  納品書明細連番（データ用）.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}


	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 2, $ship_dlv_slip_d_no);
	}

	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 2, $ship_dlv_slip_d_no, value);
	}


	/**
	 *  納品書品目ＣＤ.<p>
	 *
	 */
	public String dlv_slip_itm_cd() {
		return getConstString(offset + 3, $dlv_slip_itm_cd);
	}

	/**
	 *  納品書品目ＣＤ.<p>
	 *
	 */
	public void dlv_slip_itm_cd(String value) {
		setConstString(offset + 3, $dlv_slip_itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 4, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 4, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 5, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 5, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 6, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 6, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 7, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 7, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 8, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 8, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 9, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 9, $itm_sub3_data, value);
	}


	/**
	 *  納品書品名.<p>
	 *
	 */
	public String dlv_slip_itm_nm() {
		return getConstString(offset + 10, $dlv_slip_itm_nm);
	}

	/**
	 *  納品書品名.<p>
	 *
	 */
	public void dlv_slip_itm_nm(String value) {
		setConstString(offset + 10, $dlv_slip_itm_nm, value);
	}


	/**
	 *  納品書品目別名１.<p>
	 *
	 */
	public String dlv_slip_itm_alt_nm1() {
		return getConstString(offset + 11, $dlv_slip_itm_alt_nm1);
	}

	/**
	 *  納品書品目別名１.<p>
	 *
	 */
	public void dlv_slip_itm_alt_nm1(String value) {
		setConstString(offset + 11, $dlv_slip_itm_alt_nm1, value);
	}


	/**
	 *  納品書品目別名２.<p>
	 *
	 */
	public String dlv_slip_itm_alt_nm2() {
		return getConstString(offset + 12, $dlv_slip_itm_alt_nm2);
	}

	/**
	 *  納品書品目別名２.<p>
	 *
	 */
	public void dlv_slip_itm_alt_nm2(String value) {
		setConstString(offset + 12, $dlv_slip_itm_alt_nm2, value);
	}


	/**
	 *  納品書品目別名３.<p>
	 *
	 */
	public String dlv_slip_itm_alt_nm3() {
		return getConstString(offset + 13, $dlv_slip_itm_alt_nm3);
	}

	/**
	 *  納品書品目別名３.<p>
	 *
	 */
	public void dlv_slip_itm_alt_nm3(String value) {
		setConstString(offset + 13, $dlv_slip_itm_alt_nm3, value);
	}


	/**
	 *  納品書品目別名４.<p>
	 *
	 */
	public String dlv_slip_itm_alt_nm4() {
		return getConstString(offset + 14, $dlv_slip_itm_alt_nm4);
	}

	/**
	 *  納品書品目別名４.<p>
	 *
	 */
	public void dlv_slip_itm_alt_nm4(String value) {
		setConstString(offset + 14, $dlv_slip_itm_alt_nm4, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 15, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 15, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 16, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 16, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 17, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 17, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 18, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 18, $sno4, value);
	}


	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 19, $lot_no_view);
	}

	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 19, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（データ用）.<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 20, $lot_no_data);
	}

	/**
	 *  ロットＮＯ（データ用）.<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 20, $lot_no_data, value);
	}


	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public boolean lot_plural_flg() {
		return getConstBoolean(offset + 21, $lot_plural_flg);
	}

	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public void lot_plural_flg(boolean value) {
		setConstBoolean(offset + 21, $lot_plural_flg, value);
	}


	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public String s_lot_plural_flg() {
		return getConstString(offset + 22, $s_lot_plural_flg);
	}

	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public void s_lot_plural_flg(String value) {
		setConstString(offset + 22, $s_lot_plural_flg, value);
	}


	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 23, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 23, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（データ用）.<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 24, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（データ用）.<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 24, $sublot_no_data, value);
	}


	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_plural_flg() {
		return getConstBoolean(offset + 25, $sublot_plural_flg);
	}

	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public void sublot_plural_flg(boolean value) {
		setConstBoolean(offset + 25, $sublot_plural_flg, value);
	}


	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public String s_sublot_plural_flg() {
		return getConstString(offset + 26, $s_sublot_plural_flg);
	}

	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public void s_sublot_plural_flg(String value) {
		setConstString(offset + 26, $s_sublot_plural_flg, value);
	}


	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 27, $trd_unit_qty);
	}

	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ用）.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}


	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 28, $s_trd_unit_qty);
	}

	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 28, $s_trd_unit_qty, value);
	}


	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 29, $s_int_trd_unit_qty);
	}

	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 29, $s_int_trd_unit_qty, value);
	}


	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 30, $s_dec_trd_unit_qty);
	}

	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 30, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public MCNumber trd_unit_po_qty() {
		return getConstNumber(offset + 31, $trd_unit_po_qty);
	}

	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public void trd_unit_po_qty(MCNumber value) {
		setConstNumber(offset + 31, $trd_unit_po_qty, value);
	}

	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public void trd_unit_po_qty(int value) {
		setConstNumber(offset + 31, $trd_unit_po_qty, value);
	}

	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public void trd_unit_po_qty(long value) {
		setConstNumber(offset + 31, $trd_unit_po_qty, value);
	}

	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public void trd_unit_po_qty(float value) {
		setConstNumber(offset + 31, $trd_unit_po_qty, value);
	}

	/**
	 *  取引単位発注数量（データ用）.<p>
	 *
	 */
	public void trd_unit_po_qty(double value) {
		setConstNumber(offset + 31, $trd_unit_po_qty, value);
	}


	/**
	 *  取引単位発注数量文字列.<p>
	 *
	 */
	public String s_trd_unit_po_qty() {
		return getConstString(offset + 32, $s_trd_unit_po_qty);
	}

	/**
	 *  取引単位発注数量文字列.<p>
	 *
	 */
	public void s_trd_unit_po_qty(String value) {
		setConstString(offset + 32, $s_trd_unit_po_qty, value);
	}


	/**
	 *  取引単位発注数量（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_po_qty() {
		return getConstString(offset + 33, $s_int_trd_unit_po_qty);
	}

	/**
	 *  取引単位発注数量（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_po_qty(String value) {
		setConstString(offset + 33, $s_int_trd_unit_po_qty, value);
	}


	/**
	 *  取引単位発注数量（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_po_qty() {
		return getConstString(offset + 34, $s_dec_trd_unit_po_qty);
	}

	/**
	 *  取引単位発注数量（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_po_qty(String value) {
		setConstString(offset + 34, $s_dec_trd_unit_po_qty, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 35, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 35, $trd_unit_cd, value);
	}


	/**
	 *  取引単位.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 36, $trd_unit_nm);
	}

	/**
	 *  取引単位.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 36, $trd_unit_nm, value);
	}


	/**
	 *  基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 37, $base_unit_qty);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}


	/**
	 *  基準単位数量文字列.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 38, $s_base_unit_qty);
	}

	/**
	 *  基準単位数量文字列.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 38, $s_base_unit_qty, value);
	}


	/**
	 *  基準単位数量（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_qty() {
		return getConstString(offset + 39, $s_int_base_unit_qty);
	}

	/**
	 *  基準単位数量（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_qty(String value) {
		setConstString(offset + 39, $s_int_base_unit_qty, value);
	}


	/**
	 *  基準単位数量（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_qty() {
		return getConstString(offset + 40, $s_dec_base_unit_qty);
	}

	/**
	 *  基準単位数量（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_qty(String value) {
		setConstString(offset + 40, $s_dec_base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 41, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 41, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 42, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 42, $base_unit_nm, value);
	}


	/**
	 *  納入指示数量.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 43, $dlv_inst_qty);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 43, $dlv_inst_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 43, $dlv_inst_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 43, $dlv_inst_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 43, $dlv_inst_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 43, $dlv_inst_qty, value);
	}


	/**
	 *  納入指示数量文字列.<p>
	 *
	 */
	public String s_dlv_inst_qty() {
		return getConstString(offset + 44, $s_dlv_inst_qty);
	}

	/**
	 *  納入指示数量文字列.<p>
	 *
	 */
	public void s_dlv_inst_qty(String value) {
		setConstString(offset + 44, $s_dlv_inst_qty, value);
	}


	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_dlv_inst_qty() {
		return getConstString(offset + 45, $s_int_dlv_inst_qty);
	}

	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_dlv_inst_qty(String value) {
		setConstString(offset + 45, $s_int_dlv_inst_qty, value);
	}


	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_dlv_inst_qty() {
		return getConstString(offset + 46, $s_dec_dlv_inst_qty);
	}

	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_dlv_inst_qty(String value) {
		setConstString(offset + 46, $s_dec_dlv_inst_qty, value);
	}


	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public String dlv_inst_unit_nm() {
		return getConstString(offset + 47, $dlv_inst_unit_nm);
	}

	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public void dlv_inst_unit_nm(String value) {
		setConstString(offset + 47, $dlv_inst_unit_nm, value);
	}


	/**
	 *  納入指示単位ＣＤ.<p>
	 *
	 */
	public String dlv_inst_unit_cd() {
		return getConstString(offset + 48, $dlv_inst_unit_cd);
	}

	/**
	 *  納入指示単位ＣＤ.<p>
	 *
	 */
	public void dlv_inst_unit_cd(String value) {
		setConstString(offset + 48, $dlv_inst_unit_cd, value);
	}


	/**
	 *  受発注数量.<p>
	 *
	 */
	public MCNumber slo_po_qty() {
		return getConstNumber(offset + 49, $slo_po_qty);
	}

	/**
	 *  受発注数量.<p>
	 *
	 */
	public void slo_po_qty(MCNumber value) {
		setConstNumber(offset + 49, $slo_po_qty, value);
	}

	/**
	 *  受発注数量.<p>
	 *
	 */
	public void slo_po_qty(int value) {
		setConstNumber(offset + 49, $slo_po_qty, value);
	}

	/**
	 *  受発注数量.<p>
	 *
	 */
	public void slo_po_qty(long value) {
		setConstNumber(offset + 49, $slo_po_qty, value);
	}

	/**
	 *  受発注数量.<p>
	 *
	 */
	public void slo_po_qty(float value) {
		setConstNumber(offset + 49, $slo_po_qty, value);
	}

	/**
	 *  受発注数量.<p>
	 *
	 */
	public void slo_po_qty(double value) {
		setConstNumber(offset + 49, $slo_po_qty, value);
	}


	/**
	 *  受発注数量文字列.<p>
	 *
	 */
	public String s_slo_po_qty() {
		return getConstString(offset + 50, $s_slo_po_qty);
	}

	/**
	 *  受発注数量文字列.<p>
	 *
	 */
	public void s_slo_po_qty(String value) {
		setConstString(offset + 50, $s_slo_po_qty, value);
	}


	/**
	 *  受発注数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_slo_po_qty() {
		return getConstString(offset + 51, $s_int_slo_po_qty);
	}

	/**
	 *  受発注数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_slo_po_qty(String value) {
		setConstString(offset + 51, $s_int_slo_po_qty, value);
	}


	/**
	 *  受発注数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_slo_po_qty() {
		return getConstString(offset + 52, $s_dec_slo_po_qty);
	}

	/**
	 *  受発注数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_slo_po_qty(String value) {
		setConstString(offset + 52, $s_dec_slo_po_qty, value);
	}


	/**
	 *  受発注単位名.<p>
	 *
	 */
	public String slo_po_unit_nm() {
		return getConstString(offset + 53, $slo_po_unit_nm);
	}

	/**
	 *  受発注単位名.<p>
	 *
	 */
	public void slo_po_unit_nm(String value) {
		setConstString(offset + 53, $slo_po_unit_nm, value);
	}


	/**
	 *  受発注単位ＣＤ.<p>
	 *
	 */
	public String slo_po_unit_cd() {
		return getConstString(offset + 54, $slo_po_unit_cd);
	}

	/**
	 *  受発注単位ＣＤ.<p>
	 *
	 */
	public void slo_po_unit_cd(String value) {
		setConstString(offset + 54, $slo_po_unit_cd, value);
	}


	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 55, $trd_cur_upri);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 55, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 55, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 55, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 55, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 55, $trd_cur_upri, value);
	}


	/**
	 *  取引通貨単価文字列.<p>
	 *
	 */
	public String s_trd_cur_upri() {
		return getConstString(offset + 56, $s_trd_cur_upri);
	}

	/**
	 *  取引通貨単価文字列.<p>
	 *
	 */
	public void s_trd_cur_upri(String value) {
		setConstString(offset + 56, $s_trd_cur_upri, value);
	}


	/**
	 *  取引通貨単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_upri() {
		return getConstString(offset + 57, $s_int_trd_cur_upri);
	}

	/**
	 *  取引通貨単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_upri(String value) {
		setConstString(offset + 57, $s_int_trd_cur_upri, value);
	}


	/**
	 *  取引通貨単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_upri() {
		return getConstString(offset + 58, $s_dec_trd_cur_upri);
	}

	/**
	 *  取引通貨単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_upri(String value) {
		setConstString(offset + 58, $s_dec_trd_cur_upri, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 59, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public String s_trd_cur_amt() {
		return getConstString(offset + 60, $s_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public void s_trd_cur_amt(String value) {
		setConstString(offset + 60, $s_trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_amt() {
		return getConstString(offset + 61, $s_int_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_amt(String value) {
		setConstString(offset + 61, $s_int_trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_amt() {
		return getConstString(offset + 62, $s_dec_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_amt(String value) {
		setConstString(offset + 62, $s_dec_trd_cur_amt, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 63, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 63, $tax_cd, value);
	}


	/**
	 *  税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 64, $tax_nm);
	}

	/**
	 *  税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 64, $tax_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 65, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 65, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 65, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 65, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 65, $tax_rate, value);
	}


	/**
	 *  税率文字列.<p>
	 *
	 */
	public String s_tax_rate() {
		return getConstString(offset + 66, $s_tax_rate);
	}

	/**
	 *  税率文字列.<p>
	 *
	 */
	public void s_tax_rate(String value) {
		setConstString(offset + 66, $s_tax_rate, value);
	}


	/**
	 *  税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 67, $tax_typ);
	}

	/**
	 *  税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 67, $tax_typ, value);
	}


	/**
	 *  税額（内税）.<p>
	 *
	 */
	public String t_inc_tax() {
		return getConstString(offset + 68, $t_inc_tax);
	}

	/**
	 *  税額（内税）.<p>
	 *
	 */
	public void t_inc_tax(String value) {
		setConstString(offset + 68, $t_inc_tax, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 69, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 69, $inc_tax_flg, value);
	}


	/**
	 *  内税文字列.<p>
	 *
	 */
	public String s_inc_tax_flg() {
		return getConstString(offset + 70, $s_inc_tax_flg);
	}

	/**
	 *  内税文字列.<p>
	 *
	 */
	public void s_inc_tax_flg(String value) {
		setConstString(offset + 70, $s_inc_tax_flg, value);
	}


	/**
	 *  仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 71, $interim_flg);
	}

	/**
	 *  仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 71, $interim_flg, value);
	}


	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public String s_interim_flg() {
		return getConstString(offset + 72, $s_interim_flg);
	}

	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public void s_interim_flg(String value) {
		setConstString(offset + 72, $s_interim_flg, value);
	}


	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_in_amt() {
		return getConstNumber(offset + 73, $trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_tax_in_amt(MCNumber value) {
		setConstNumber(offset + 73, $trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_tax_in_amt(int value) {
		setConstNumber(offset + 73, $trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_tax_in_amt(long value) {
		setConstNumber(offset + 73, $trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_tax_in_amt(float value) {
		setConstNumber(offset + 73, $trd_cur_tax_in_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_tax_in_amt(double value) {
		setConstNumber(offset + 73, $trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public String s_trd_cur_tax_in_amt() {
		return getConstString(offset + 74, $s_trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額文字列.<p>
	 *
	 */
	public void s_trd_cur_tax_in_amt(String value) {
		setConstString(offset + 74, $s_trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨税込金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_tax_in_amt() {
		return getConstString(offset + 75, $s_int_trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_tax_in_amt(String value) {
		setConstString(offset + 75, $s_int_trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨税込金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_in_amt() {
		return getConstString(offset + 76, $s_dec_trd_cur_tax_in_amt);
	}

	/**
	 *  取引通貨税込金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_in_amt(String value) {
		setConstString(offset + 76, $s_dec_trd_cur_tax_in_amt, value);
	}


	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 77, $trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 77, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 77, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 77, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 77, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 77, $trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public String s_trd_cur_tax_amt() {
		return getConstString(offset + 78, $s_trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public void s_trd_cur_tax_amt(String value) {
		setConstString(offset + 78, $s_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨税額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_tax_amt() {
		return getConstString(offset + 79, $s_int_trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_tax_amt(String value) {
		setConstString(offset + 79, $s_int_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨税額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_amt() {
		return getConstString(offset + 80, $s_dec_trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_amt(String value) {
		setConstString(offset + 80, $s_dec_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 81, $trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 81, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 81, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 81, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 81, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 81, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public String s_trd_cur_dscnt_amt() {
		return getConstString(offset + 82, $s_trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨税額文字列.<p>
	 *
	 */
	public void s_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 82, $s_trd_cur_dscnt_amt, value);
	}


	/**
	 *  取引通貨値引額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_dscnt_amt() {
		return getConstString(offset + 83, $s_int_trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 83, $s_int_trd_cur_dscnt_amt, value);
	}


	/**
	 *  取引通貨値引額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_dscnt_amt() {
		return getConstString(offset + 84, $s_dec_trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 84, $s_dec_trd_cur_dscnt_amt, value);
	}


	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 85, $dlv_inst_no);
	}

	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 85, $dlv_inst_no, value);
	}


	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 86, $dlv_inst_d_no);
	}

	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 86, $dlv_inst_d_no, value);
	}


	/**
	 *  納品書注文明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_po_d_no() {
		return getConstString(offset + 87, $dlv_slip_po_d_no);
	}

	/**
	 *  納品書注文明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_po_d_no(String value) {
		setConstString(offset + 87, $dlv_slip_po_d_no, value);
	}


	/**
	 *  重量.<p>
	 *
	 */
	public MCNumber ship_wt() {
		return getConstNumber(offset + 88, $ship_wt);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void ship_wt(MCNumber value) {
		setConstNumber(offset + 88, $ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void ship_wt(int value) {
		setConstNumber(offset + 88, $ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void ship_wt(long value) {
		setConstNumber(offset + 88, $ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void ship_wt(float value) {
		setConstNumber(offset + 88, $ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void ship_wt(double value) {
		setConstNumber(offset + 88, $ship_wt, value);
	}


	/**
	 *  重量文字列.<p>
	 *
	 */
	public String s_ship_wt() {
		return getConstString(offset + 89, $s_ship_wt);
	}

	/**
	 *  重量文字列.<p>
	 *
	 */
	public void s_ship_wt(String value) {
		setConstString(offset + 89, $s_ship_wt, value);
	}


	/**
	 *  容積.<p>
	 *
	 */
	public MCNumber ship_dim() {
		return getConstNumber(offset + 90, $ship_dim);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void ship_dim(MCNumber value) {
		setConstNumber(offset + 90, $ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void ship_dim(int value) {
		setConstNumber(offset + 90, $ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void ship_dim(long value) {
		setConstNumber(offset + 90, $ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void ship_dim(float value) {
		setConstNumber(offset + 90, $ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void ship_dim(double value) {
		setConstNumber(offset + 90, $ship_dim, value);
	}


	/**
	 *  容積文字列.<p>
	 *
	 */
	public String s_ship_dim() {
		return getConstString(offset + 91, $s_ship_dim);
	}

	/**
	 *  容積文字列.<p>
	 *
	 */
	public void s_ship_dim(String value) {
		setConstString(offset + 91, $s_ship_dim, value);
	}


	/**
	 *  取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 92, $trd_d_rmrks);
	}

	/**
	 *  取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 92, $trd_d_rmrks, value);
	}


	/**
	 *  発注者取引明細備考.<p>
	 *
	 */
	public String po_trd_d_rmrks() {
		return getConstString(offset + 93, $po_trd_d_rmrks);
	}

	/**
	 *  発注者取引明細備考.<p>
	 *
	 */
	public void po_trd_d_rmrks(String value) {
		setConstString(offset + 93, $po_trd_d_rmrks, value);
	}


	/**
	 *  包装個数.<p>
	 *
	 */
	public MCNumber pack_qty() {
		return getConstNumber(offset + 94, $pack_qty);
	}

	/**
	 *  包装個数.<p>
	 *
	 */
	public void pack_qty(MCNumber value) {
		setConstNumber(offset + 94, $pack_qty, value);
	}

	/**
	 *  包装個数.<p>
	 *
	 */
	public void pack_qty(int value) {
		setConstNumber(offset + 94, $pack_qty, value);
	}

	/**
	 *  包装個数.<p>
	 *
	 */
	public void pack_qty(long value) {
		setConstNumber(offset + 94, $pack_qty, value);
	}

	/**
	 *  包装個数.<p>
	 *
	 */
	public void pack_qty(float value) {
		setConstNumber(offset + 94, $pack_qty, value);
	}

	/**
	 *  包装個数.<p>
	 *
	 */
	public void pack_qty(double value) {
		setConstNumber(offset + 94, $pack_qty, value);
	}


	/**
	 *  包装個数文字列.<p>
	 *
	 */
	public String s_pack_qty() {
		return getConstString(offset + 95, $s_pack_qty);
	}

	/**
	 *  包装個数文字列.<p>
	 *
	 */
	public void s_pack_qty(String value) {
		setConstString(offset + 95, $s_pack_qty, value);
	}


	/**
	 *  合計包装個数.<p>
	 *
	 */
	public MCNumber ttl_pack_qty() {
		return getConstNumber(offset + 96, $ttl_pack_qty);
	}

	/**
	 *  合計包装個数.<p>
	 *
	 */
	public void ttl_pack_qty(MCNumber value) {
		setConstNumber(offset + 96, $ttl_pack_qty, value);
	}

	/**
	 *  合計包装個数.<p>
	 *
	 */
	public void ttl_pack_qty(int value) {
		setConstNumber(offset + 96, $ttl_pack_qty, value);
	}

	/**
	 *  合計包装個数.<p>
	 *
	 */
	public void ttl_pack_qty(long value) {
		setConstNumber(offset + 96, $ttl_pack_qty, value);
	}

	/**
	 *  合計包装個数.<p>
	 *
	 */
	public void ttl_pack_qty(float value) {
		setConstNumber(offset + 96, $ttl_pack_qty, value);
	}

	/**
	 *  合計包装個数.<p>
	 *
	 */
	public void ttl_pack_qty(double value) {
		setConstNumber(offset + 96, $ttl_pack_qty, value);
	}


	/**
	 *  合計包装個数文字列.<p>
	 *
	 */
	public String s_ttl_pack_qty() {
		return getConstString(offset + 97, $s_ttl_pack_qty);
	}

	/**
	 *  合計包装個数文字列.<p>
	 *
	 */
	public void s_ttl_pack_qty(String value) {
		setConstString(offset + 97, $s_ttl_pack_qty, value);
	}


	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public String po_d_sub_char1() {
		return getConstString(offset + 98, $po_d_sub_char1);
	}

	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public void po_d_sub_char1(String value) {
		setConstString(offset + 98, $po_d_sub_char1, value);
	}


	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public String po_d_sub_char2() {
		return getConstString(offset + 99, $po_d_sub_char2);
	}

	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public void po_d_sub_char2(String value) {
		setConstString(offset + 99, $po_d_sub_char2, value);
	}


	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public String po_d_sub_char3() {
		return getConstString(offset + 100, $po_d_sub_char3);
	}

	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public void po_d_sub_char3(String value) {
		setConstString(offset + 100, $po_d_sub_char3, value);
	}


	/**
	 *  入荷予定予備１.<p>
	 *
	 */
	public String arr_schd_sub_char1() {
		return getConstString(offset + 101, $arr_schd_sub_char1);
	}

	/**
	 *  入荷予定予備１.<p>
	 *
	 */
	public void arr_schd_sub_char1(String value) {
		setConstString(offset + 101, $arr_schd_sub_char1, value);
	}


	/**
	 *  入荷予定予備２.<p>
	 *
	 */
	public String arr_schd_sub_char2() {
		return getConstString(offset + 102, $arr_schd_sub_char2);
	}

	/**
	 *  入荷予定予備２.<p>
	 *
	 */
	public void arr_schd_sub_char2(String value) {
		setConstString(offset + 102, $arr_schd_sub_char2, value);
	}


	/**
	 *  入荷予定予備３.<p>
	 *
	 */
	public String arr_schd_sub_char3() {
		return getConstString(offset + 103, $arr_schd_sub_char3);
	}

	/**
	 *  入荷予定予備３.<p>
	 *
	 */
	public void arr_schd_sub_char3(String value) {
		setConstString(offset + 103, $arr_schd_sub_char3, value);
	}


	/**
	 *  納品書明細予備１.<p>
	 *
	 */
	public String dlt_slip_d_sub_char1() {
		return getConstString(offset + 104, $dlt_slip_d_sub_char1);
	}

	/**
	 *  納品書明細予備１.<p>
	 *
	 */
	public void dlt_slip_d_sub_char1(String value) {
		setConstString(offset + 104, $dlt_slip_d_sub_char1, value);
	}


	/**
	 *  納品書明細予備２.<p>
	 *
	 */
	public String dlt_slip_d_sub_char2() {
		return getConstString(offset + 105, $dlt_slip_d_sub_char2);
	}

	/**
	 *  納品書明細予備２.<p>
	 *
	 */
	public void dlt_slip_d_sub_char2(String value) {
		setConstString(offset + 105, $dlt_slip_d_sub_char2, value);
	}


	/**
	 *  納品書明細予備３.<p>
	 *
	 */
	public String dlt_slip_d_sub_char3() {
		return getConstString(offset + 106, $dlt_slip_d_sub_char3);
	}

	/**
	 *  納品書明細予備３.<p>
	 *
	 */
	public void dlt_slip_d_sub_char3(String value) {
		setConstString(offset + 106, $dlt_slip_d_sub_char3, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 107, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 107, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 108, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 108, $cst_itm_nm, value);
	}


	/**
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 109, $dscnt_itm_flg);
	}

	/**
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 109, $dscnt_itm_flg, value);
	}


	/**
	 *  支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 110, $prov_basis_typ);
	}

	/**
	 *  支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 110, $prov_basis_typ, value);
	}


	/**
	 *  支給計上日（基）ラベル.<p>
	 *
	 */
	public String base_ac_dt_lbl() {
		return getConstString(offset + 111, $base_ac_dt_lbl);
	}

	/**
	 *  支給計上日（基）ラベル.<p>
	 *
	 */
	public void base_ac_dt_lbl(String value) {
		setConstString(offset + 111, $base_ac_dt_lbl, value);
	}


	/**
	 *  支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 112, $base_ac_dt);
	}

	/**
	 *  支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 112, $base_ac_dt, value);
	}


	public String getString(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			return dlv_slip_itm_cd();
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
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			return dlv_slip_itm_nm();
		}
		if ($dlv_slip_itm_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm1();
		}
		if ($dlv_slip_itm_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm2();
		}
		if ($dlv_slip_itm_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm3();
		}
		if ($dlv_slip_itm_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm4();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			return s_lot_plural_flg();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			return s_sublot_plural_flg();
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
		if ($s_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_po_qty();
		}
		if ($s_int_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_po_qty();
		}
		if ($s_dec_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_po_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dlv_inst_qty();
		}
		if ($s_int_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_int_dlv_inst_qty();
		}
		if ($s_dec_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_dlv_inst_qty();
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			return dlv_inst_unit_nm();
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($s_slo_po_qty.equalsIgnoreCase(name)) {
			return s_slo_po_qty();
		}
		if ($s_int_slo_po_qty.equalsIgnoreCase(name)) {
			return s_int_slo_po_qty();
		}
		if ($s_dec_slo_po_qty.equalsIgnoreCase(name)) {
			return s_dec_slo_po_qty();
		}
		if ($slo_po_unit_nm.equalsIgnoreCase(name)) {
			return slo_po_unit_nm();
		}
		if ($slo_po_unit_cd.equalsIgnoreCase(name)) {
			return slo_po_unit_cd();
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
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_amt();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			return s_interim_flg();
		}
		if ($s_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_in_amt();
		}
		if ($s_int_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_in_amt();
		}
		if ($s_dec_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_in_amt();
		}
		if ($s_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_po_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_po_d_no();
		}
		if ($s_ship_wt.equalsIgnoreCase(name)) {
			return s_ship_wt();
		}
		if ($s_ship_dim.equalsIgnoreCase(name)) {
			return s_ship_dim();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_trd_d_rmrks.equalsIgnoreCase(name)) {
			return po_trd_d_rmrks();
		}
		if ($s_pack_qty.equalsIgnoreCase(name)) {
			return s_pack_qty();
		}
		if ($s_ttl_pack_qty.equalsIgnoreCase(name)) {
			return s_ttl_pack_qty();
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			return po_d_sub_char1();
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			return po_d_sub_char2();
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			return po_d_sub_char3();
		}
		if ($arr_schd_sub_char1.equalsIgnoreCase(name)) {
			return arr_schd_sub_char1();
		}
		if ($arr_schd_sub_char2.equalsIgnoreCase(name)) {
			return arr_schd_sub_char2();
		}
		if ($arr_schd_sub_char3.equalsIgnoreCase(name)) {
			return arr_schd_sub_char3();
		}
		if ($dlt_slip_d_sub_char1.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char1();
		}
		if ($dlt_slip_d_sub_char2.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char2();
		}
		if ($dlt_slip_d_sub_char3.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char3();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($base_ac_dt_lbl.equalsIgnoreCase(name)) {
			return base_ac_dt_lbl();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			return trd_unit_po_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			return slo_po_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_in_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			return pack_qty();
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			return ttl_pack_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			return dlv_slip_itm_cd();
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
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			return dlv_slip_itm_nm();
		}
		if ($dlv_slip_itm_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm1();
		}
		if ($dlv_slip_itm_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm2();
		}
		if ($dlv_slip_itm_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm3();
		}
		if ($dlv_slip_itm_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_slip_itm_alt_nm4();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			return s_lot_plural_flg();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			return s_sublot_plural_flg();
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
		if ($s_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_po_qty();
		}
		if ($s_int_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_po_qty();
		}
		if ($s_dec_trd_unit_po_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_po_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dlv_inst_qty();
		}
		if ($s_int_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_int_dlv_inst_qty();
		}
		if ($s_dec_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_dlv_inst_qty();
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			return dlv_inst_unit_nm();
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($s_slo_po_qty.equalsIgnoreCase(name)) {
			return s_slo_po_qty();
		}
		if ($s_int_slo_po_qty.equalsIgnoreCase(name)) {
			return s_int_slo_po_qty();
		}
		if ($s_dec_slo_po_qty.equalsIgnoreCase(name)) {
			return s_dec_slo_po_qty();
		}
		if ($slo_po_unit_nm.equalsIgnoreCase(name)) {
			return slo_po_unit_nm();
		}
		if ($slo_po_unit_cd.equalsIgnoreCase(name)) {
			return slo_po_unit_cd();
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
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_amt();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			return s_interim_flg();
		}
		if ($s_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_in_amt();
		}
		if ($s_int_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_in_amt();
		}
		if ($s_dec_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_in_amt();
		}
		if ($s_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_slip_po_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_po_d_no();
		}
		if ($s_ship_wt.equalsIgnoreCase(name)) {
			return s_ship_wt();
		}
		if ($s_ship_dim.equalsIgnoreCase(name)) {
			return s_ship_dim();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_trd_d_rmrks.equalsIgnoreCase(name)) {
			return po_trd_d_rmrks();
		}
		if ($s_pack_qty.equalsIgnoreCase(name)) {
			return s_pack_qty();
		}
		if ($s_ttl_pack_qty.equalsIgnoreCase(name)) {
			return s_ttl_pack_qty();
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			return po_d_sub_char1();
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			return po_d_sub_char2();
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			return po_d_sub_char3();
		}
		if ($arr_schd_sub_char1.equalsIgnoreCase(name)) {
			return arr_schd_sub_char1();
		}
		if ($arr_schd_sub_char2.equalsIgnoreCase(name)) {
			return arr_schd_sub_char2();
		}
		if ($arr_schd_sub_char3.equalsIgnoreCase(name)) {
			return arr_schd_sub_char3();
		}
		if ($dlt_slip_d_sub_char1.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char1();
		}
		if ($dlt_slip_d_sub_char2.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char2();
		}
		if ($dlt_slip_d_sub_char3.equalsIgnoreCase(name)) {
			return dlt_slip_d_sub_char3();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($base_ac_dt_lbl.equalsIgnoreCase(name)) {
			return base_ac_dt_lbl();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			return trd_unit_po_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			return slo_po_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_in_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			return pack_qty();
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			return ttl_pack_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			dlv_slip_itm_cd(value);
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
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			dlv_slip_itm_nm(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm1.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm1(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm2.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm2(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm3.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm3(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm4.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm4(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			s_lot_plural_flg(value);
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
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			s_sublot_plural_flg(value);
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
		if ($s_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_trd_unit_po_qty(value);
			return;
		}
		if ($s_int_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_po_qty(value);
			return;
		}
		if ($s_dec_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_po_qty(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dlv_inst_qty(value);
			return;
		}
		if ($s_int_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_int_dlv_inst_qty(value);
			return;
		}
		if ($s_dec_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dec_dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			dlv_inst_unit_nm(value);
			return;
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($s_slo_po_qty.equalsIgnoreCase(name)) {
			s_slo_po_qty(value);
			return;
		}
		if ($s_int_slo_po_qty.equalsIgnoreCase(name)) {
			s_int_slo_po_qty(value);
			return;
		}
		if ($s_dec_slo_po_qty.equalsIgnoreCase(name)) {
			s_dec_slo_po_qty(value);
			return;
		}
		if ($slo_po_unit_nm.equalsIgnoreCase(name)) {
			slo_po_unit_nm(value);
			return;
		}
		if ($slo_po_unit_cd.equalsIgnoreCase(name)) {
			slo_po_unit_cd(value);
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
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			s_trd_cur_amt(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			s_interim_flg(value);
			return;
		}
		if ($s_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_int_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_po_d_no.equalsIgnoreCase(name)) {
			dlv_slip_po_d_no(value);
			return;
		}
		if ($s_ship_wt.equalsIgnoreCase(name)) {
			s_ship_wt(value);
			return;
		}
		if ($s_ship_dim.equalsIgnoreCase(name)) {
			s_ship_dim(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_trd_d_rmrks.equalsIgnoreCase(name)) {
			po_trd_d_rmrks(value);
			return;
		}
		if ($s_pack_qty.equalsIgnoreCase(name)) {
			s_pack_qty(value);
			return;
		}
		if ($s_ttl_pack_qty.equalsIgnoreCase(name)) {
			s_ttl_pack_qty(value);
			return;
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			po_d_sub_char1(value);
			return;
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			po_d_sub_char2(value);
			return;
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			po_d_sub_char3(value);
			return;
		}
		if ($arr_schd_sub_char1.equalsIgnoreCase(name)) {
			arr_schd_sub_char1(value);
			return;
		}
		if ($arr_schd_sub_char2.equalsIgnoreCase(name)) {
			arr_schd_sub_char2(value);
			return;
		}
		if ($arr_schd_sub_char3.equalsIgnoreCase(name)) {
			arr_schd_sub_char3(value);
			return;
		}
		if ($dlt_slip_d_sub_char1.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char1(value);
			return;
		}
		if ($dlt_slip_d_sub_char2.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char2(value);
			return;
		}
		if ($dlt_slip_d_sub_char3.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char3(value);
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
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($base_ac_dt_lbl.equalsIgnoreCase(name)) {
			base_ac_dt_lbl(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			dlv_slip_itm_cd(value);
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
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			dlv_slip_itm_nm(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm1.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm1(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm2.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm2(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm3.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm3(value);
			return;
		}
		if ($dlv_slip_itm_alt_nm4.equalsIgnoreCase(name)) {
			dlv_slip_itm_alt_nm4(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			s_lot_plural_flg(value);
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
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			s_sublot_plural_flg(value);
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
		if ($s_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_trd_unit_po_qty(value);
			return;
		}
		if ($s_int_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_po_qty(value);
			return;
		}
		if ($s_dec_trd_unit_po_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_po_qty(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dlv_inst_qty(value);
			return;
		}
		if ($s_int_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_int_dlv_inst_qty(value);
			return;
		}
		if ($s_dec_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dec_dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			dlv_inst_unit_nm(value);
			return;
		}
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($s_slo_po_qty.equalsIgnoreCase(name)) {
			s_slo_po_qty(value);
			return;
		}
		if ($s_int_slo_po_qty.equalsIgnoreCase(name)) {
			s_int_slo_po_qty(value);
			return;
		}
		if ($s_dec_slo_po_qty.equalsIgnoreCase(name)) {
			s_dec_slo_po_qty(value);
			return;
		}
		if ($slo_po_unit_nm.equalsIgnoreCase(name)) {
			slo_po_unit_nm(value);
			return;
		}
		if ($slo_po_unit_cd.equalsIgnoreCase(name)) {
			slo_po_unit_cd(value);
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
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			s_trd_cur_amt(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			s_interim_flg(value);
			return;
		}
		if ($s_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_int_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_in_amt(value);
			return;
		}
		if ($s_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_slip_po_d_no.equalsIgnoreCase(name)) {
			dlv_slip_po_d_no(value);
			return;
		}
		if ($s_ship_wt.equalsIgnoreCase(name)) {
			s_ship_wt(value);
			return;
		}
		if ($s_ship_dim.equalsIgnoreCase(name)) {
			s_ship_dim(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_trd_d_rmrks.equalsIgnoreCase(name)) {
			po_trd_d_rmrks(value);
			return;
		}
		if ($s_pack_qty.equalsIgnoreCase(name)) {
			s_pack_qty(value);
			return;
		}
		if ($s_ttl_pack_qty.equalsIgnoreCase(name)) {
			s_ttl_pack_qty(value);
			return;
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			po_d_sub_char1(value);
			return;
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			po_d_sub_char2(value);
			return;
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			po_d_sub_char3(value);
			return;
		}
		if ($arr_schd_sub_char1.equalsIgnoreCase(name)) {
			arr_schd_sub_char1(value);
			return;
		}
		if ($arr_schd_sub_char2.equalsIgnoreCase(name)) {
			arr_schd_sub_char2(value);
			return;
		}
		if ($arr_schd_sub_char3.equalsIgnoreCase(name)) {
			arr_schd_sub_char3(value);
			return;
		}
		if ($dlt_slip_d_sub_char1.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char1(value);
			return;
		}
		if ($dlt_slip_d_sub_char2.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char2(value);
			return;
		}
		if ($dlt_slip_d_sub_char3.equalsIgnoreCase(name)) {
			dlt_slip_d_sub_char3(value);
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
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($base_ac_dt_lbl.equalsIgnoreCase(name)) {
			base_ac_dt_lbl(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_po_qty.equalsIgnoreCase(name)) {
			trd_unit_po_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($slo_po_qty.equalsIgnoreCase(name)) {
			slo_po_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_in_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_in_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($pack_qty.equalsIgnoreCase(name)) {
			pack_qty(value);
			return;
		}
		if ($ttl_pack_qty.equalsIgnoreCase(name)) {
			ttl_pack_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

