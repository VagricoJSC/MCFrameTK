package mcframe.clientMSBD.MSBDP0160;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_trd_unit_cd = "schd_trd_unit_cd";
	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_dmn_qty = "schd_trd_unit_dmn_qty";
	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_trd_unit_dec_place = "schd_trd_unit_dec_place";
	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_trd_unit_rnd_typ = "schd_trd_unit_rnd_typ";
	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_qty = "schd_trd_unit_qty";
	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public static final String $schd_base_unit_qty = "schd_base_unit_qty";
	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_upri = "schd_trd_cur_upri";
	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_proc_upri = "schd_trd_cur_proc_upri";
	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_onr_prov_upri = "schd_trd_cur_onr_prov_upri";
	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public static final String $schd_trd_cur_dscnt_amt = "schd_trd_cur_dscnt_amt";
	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_amt = "schd_trd_cur_amt";
	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_proc_amt = "schd_trd_cur_proc_amt";
	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_onr_prov_amt = "schd_trd_cur_onr_prov_amt";
	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public static final String $schd_trd_cur_tax_amt = "schd_trd_cur_tax_amt";
	/**
	 * Return-from location WG cd. 返品元場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_loc_wg_cd = "purc_ret_loc_wg_cd";
	/**
	 * Return-from location WG name 返品元場所ＷＧ名.<p>
	 *
	 */
	public static final String $purc_ret_loc_wg_nm = "purc_ret_loc_wg_nm";
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_loc_cd = "purc_ret_loc_cd";
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public static final String $purc_ret_loc_nm = "purc_ret_loc_nm";
	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_sppl_cd = "purc_ret_sppl_cd";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	public static final String $str_ln_p = "str_ln_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public static final String $itm_purc_upri_cng_flg = "itm_purc_upri_cng_flg";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public static final String $itm_pay_crryovr_times = "itm_pay_crryovr_times";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public static final String $purc_typ = "purc_typ";
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public static final String $purc_typ_nm = "purc_typ_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_dmn_qty = "trd_unit_dmn_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $purc_ret_schd_qty_p = "purc_ret_schd_qty_p";
	public static final String $purc_ret_qty_p = "purc_ret_qty_p";
	public static final String $abort_qty_p = "abort_qty_p";
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public static final String $purc_dtl_upd_flg = "purc_dtl_upd_flg";
	public static final String $trd_upri_amt_p = "trd_upri_amt_p";
	public static final String $schd_tax_rate = "schd_tax_rate";
	public static final String $schd_inc_tax_flg = "schd_inc_tax_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	public static final String $trd_cur_proc_upri_p = "trd_cur_proc_upri_p";
	public static final String $trd_cur_onr_prov_upri_p = "trd_cur_onr_prov_upri_p";
	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public static final String $old_trd_cur_upri = "old_trd_cur_upri";
	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public static final String $old_trd_cur_proc_upri = "old_trd_cur_proc_upri";
	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public static final String $old_trd_cur_onr_prov_upri = "old_trd_cur_onr_prov_upri";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	public static final String $trd_cur_proc_amt_p = "trd_cur_proc_amt_p";
	public static final String $trd_cur_onr_prov_amt_p = "trd_cur_onr_prov_amt_p";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_proc_upri_p = "base_cur_proc_upri_p";
	public static final String $base_cur_onr_prov_upri_p = "base_cur_onr_prov_upri_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_proc_amt_p = "base_cur_proc_amt_p";
	public static final String $base_cur_onr_prov_amt_p = "base_cur_onr_prov_amt_p";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_proc_upri_p = "ptax_cur_proc_upri_p";
	public static final String $ptax_cur_onr_prov_upri_p = "ptax_cur_onr_prov_upri_p";
	public static final String $ptax_cur_dscnt_amt_p = "ptax_cur_dscnt_amt_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
	public static final String $ptax_cur_proc_amt_p = "ptax_cur_proc_amt_p";
	public static final String $ptax_cur_onr_prov_amt_p = "ptax_cur_onr_prov_amt_p";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	public static final String $wtax_amt_p = "wtax_amt_p";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_rsn_cd = "purc_ret_rsn_cd";
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public static final String $purc_ret_rsn_nm = "purc_ret_rsn_nm";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	public static final String $bd_p = "bd_p";
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public static final String $bd_lot_mng_typ = "bd_lot_mng_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_mng_typ = "bd_sublot_mng_typ";
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_sublot_no_typ = "bd_sublot_no_typ";
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $bd_sno1_mng_typ = "bd_sno1_mng_typ";
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $bd_sno2_mng_typ = "bd_sno2_mng_typ";
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $bd_sno3_mng_typ = "bd_sno3_mng_typ";
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $bd_sno4_mng_typ = "bd_sno4_mng_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $purc_cont_qty_p = "purc_cont_qty_p";
	public static final String $purc_cont_fctr_p = "purc_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public static final String $purc_ret_print_d_rmrks = "purc_ret_print_d_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_schd_d_no = "purc_ret_schd_d_no";
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_d_no = "purc_ret_act_d_no";
	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_arr_act_no = "ref_arr_act_no";
	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public static final String $ref_arr_act_rev = "ref_arr_act_rev";
	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_purc_act_no = "ref_purc_act_no";
	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public static final String $ref_purc_act_seq = "ref_purc_act_seq";
	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public static final String $ref_purc_act_rev = "ref_purc_act_rev";
	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_purc_act_d_no = "ref_purc_act_d_no";
	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public static final String $ref_purc_act_d_seq = "ref_purc_act_d_seq";
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public static final String $db_trd_unit_cd = "db_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public static final String $db_trd_unit_conv_qty = "db_trd_unit_conv_qty";
	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public static final String $db_trd_unit_conv_base_qty = "db_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $db_trd_unit_dec_place = "db_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public static final String $db_trd_unit_rnd_typ = "db_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public static final String $db_trd_unit_qty = "db_trd_unit_qty";
	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public static final String $db_trd_cur_amt = "db_trd_cur_amt";
	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public static final String $db_trd_cur_dscnt_amt = "db_trd_cur_dscnt_amt";
	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $db_trd_cur_onr_prov_amt = "db_trd_cur_onr_prov_amt";
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $db_trd_cur_onr_prov_upri = "db_trd_cur_onr_prov_upri";
	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public static final String $db_trd_cur_proc_amt = "db_trd_cur_proc_amt";
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public static final String $db_trd_cur_proc_upri = "db_trd_cur_proc_upri";
	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public static final String $db_trd_cur_tax_amt = "db_trd_cur_tax_amt";
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public static final String $db_trd_cur_upri = "db_trd_cur_upri";
	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public static final String $db_wtax_rate = "db_wtax_rate";
	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public static final String $db_tax_rate = "db_tax_rate";
	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public static final String $db_inc_tax_flg = "db_inc_tax_flg";

	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $schd_qty = $purc_ret_schd_qty_p + ".qty";
	public static final String $ret_qty = $purc_ret_qty_p + ".qty";
	public static final String $abort_qty = $abort_qty_p + ".qty";
	public static final String $upri_not_tgt_flg = $trd_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_upri_amt_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_upri_amt_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_upri_amt_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_upri_amt_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_upri_amt_p + ".tax_cd";
	public static final String $tax_nm = $trd_upri_amt_p + ".tax_nm";
	public static final String $tax_rate = $trd_upri_amt_p + ".tax_rate";
	public static final String $tax_typ = $trd_upri_amt_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_upri_amt_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_upri_amt_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_upri_amt_p + ".dscnt_rsn_nm";
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_proc_tax_amt = $trd_cur_proc_amt_p + ".tax_amt";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_tax_amt = $trd_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_proc_tax_amt = $base_cur_proc_amt_p + ".tax_amt";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $base_cur_onr_prov_tax_amt = $base_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_proc_upri = $ptax_cur_proc_upri_p + ".upri";
	public static final String $ptax_cur_onr_prov_upri = $ptax_cur_onr_prov_upri_p + ".upri";
	public static final String $ptax_cur_dscnt_amt = $ptax_cur_dscnt_amt_p + ".amt";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_proc_amt = $ptax_cur_proc_amt_p + ".amt";
	public static final String $ptax_cur_proc_tax_amt = $ptax_cur_proc_amt_p + ".tax_amt";
	public static final String $ptax_cur_onr_prov_amt = $ptax_cur_onr_prov_amt_p + ".amt";
	public static final String $ptax_cur_onr_prov_tax_amt = $ptax_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $bd_dpt_cd = $bd_p + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $bd_p + ".bd_dpt_nm";
	public static final String $bd_itm_cd = $bd_p + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $bd_p + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $bd_p + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $bd_p + ".bd_itm_sub3";
	public static final String $bd_itm_nm = $bd_p + ".bd_itm_nm";
	public static final String $bd_lot_no = $bd_p + ".bd_lot_no";
	public static final String $bd_sublot_no = $bd_p + ".bd_sublot_no";
	public static final String $bd_sno1 = $bd_p + ".bd_sno1";
	public static final String $bd_sno2 = $bd_p + ".bd_sno2";
	public static final String $bd_sno3 = $bd_p + ".bd_sno3";
	public static final String $bd_sno4 = $bd_p + ".bd_sno4";
	public static final String $bd_bp_cd = $bd_p + ".bd_bp_cd";
	public static final String $bd_bp_nm = $bd_p + ".bd_bp_nm";
	public static final String $bd_loc_cd = $bd_p + ".bd_loc_cd";
	public static final String $bd_loc_nm = $bd_p + ".bd_loc_nm";
	public static final String $bd_ctg_cd = $bd_p + ".bd_ctg_cd";
	public static final String $bd_ctg_nm = $bd_p + ".bd_ctg_nm";
	public static final String $bd_oper_cd = $bd_p + ".bd_oper_cd";
	public static final String $bd_oper_nm = $bd_p + ".bd_oper_nm";
	public static final String $bd_iv_no = $bd_p + ".bd_iv_no";
	public static final String $bd_slo_no = $bd_p + ".bd_slo_no";
	public static final String $bd_po_no = $bd_p + ".bd_po_no";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_trd_unit_cd_META = createCommonMeta($schd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dmn_qty_META = createCommonMeta($schd_trd_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dec_place_META = createCommonMeta($schd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_trd_unit_rnd_typ_META = createCommonMeta($schd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta schd_trd_unit_qty_META = createCommonMeta($schd_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_base_unit_qty_META = createCommonMeta($schd_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_cur_upri_META = createCommonMeta($schd_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_proc_upri_META = createCommonMeta($schd_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_onr_prov_upri_META = createCommonMeta($schd_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_dscnt_amt_META = createCommonMeta($schd_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_amt_META = createCommonMeta($schd_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_proc_amt_META = createCommonMeta($schd_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_onr_prov_amt_META = createCommonMeta($schd_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_tax_amt_META = createCommonMeta($schd_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_loc_wg_cd_META = createCommonMeta($purc_ret_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_ret_loc_wg_nm_META = createCommonMeta($purc_ret_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_ret_loc_cd_META = createCommonMeta($purc_ret_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta purc_ret_loc_nm_META = createCommonMeta($purc_ret_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta purc_ret_sppl_cd_META = createCommonMeta($purc_ret_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_pay_crryovr_times_META = createCommonMeta($itm_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta purc_typ_META = createCommonMeta($purc_typ, mcframe.commonMA.meta.MA_META.PURC_TYP);
	public static final MCMeta purc_typ_nm_META = createCommonMeta($purc_typ_nm, mcframe.commonMA.meta.MA_META.PURC_TYP_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_dmn_qty_META = createCommonMeta($trd_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_ret_schd_qty_p_META = createInnerRowMeta($purc_ret_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_ret_qty_p_META = createInnerRowMeta($purc_ret_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta abort_qty_p_META = createInnerRowMeta($abort_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_upri_amt_p_META = createInnerRowMeta($trd_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta schd_tax_rate_META = createCommonMeta($schd_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta schd_inc_tax_flg_META = createCommonMeta($schd_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta trd_cur_proc_upri_p_META = createInnerRowMeta($trd_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_onr_prov_upri_p_META = createInnerRowMeta($trd_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta old_trd_cur_upri_META = createCommonMeta($old_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_proc_upri_META = createCommonMeta($old_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_onr_prov_upri_META = createCommonMeta($old_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta trd_cur_proc_amt_p_META = createInnerRowMeta($trd_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_onr_prov_amt_p_META = createInnerRowMeta($trd_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_proc_upri_p_META = createInnerRowMeta($base_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_onr_prov_upri_p_META = createInnerRowMeta($base_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_proc_amt_p_META = createInnerRowMeta($base_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_onr_prov_amt_p_META = createInnerRowMeta($base_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_proc_upri_p_META = createInnerRowMeta($ptax_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_onr_prov_upri_p_META = createInnerRowMeta($ptax_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_dscnt_amt_p_META = createInnerRowMeta($ptax_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_proc_amt_p_META = createInnerRowMeta($ptax_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_onr_prov_amt_p_META = createInnerRowMeta($ptax_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_ret_rsn_cd_META = createCommonMeta($purc_ret_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_ret_rsn_nm_META = createCommonMeta($purc_ret_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta bd_p_META = createInnerRowMeta($bd_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_p_META = createInnerRowMeta($purc_cont_qty_p, mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class);
	public static final MCMeta purc_cont_fctr_p_META = createInnerRowMeta($purc_cont_fctr_p, mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_INTR_RMRKS);
	public static final MCMeta purc_ret_print_d_rmrks_META = createCommonMeta($purc_ret_print_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR3);
	public static final MCMeta purc_ret_schd_d_no_META = createCommonMeta($purc_ret_schd_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_SCHD_D_NO);
	public static final MCMeta purc_ret_act_d_no_META = createCommonMeta($purc_ret_act_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_D_NO);
	public static final MCMeta ref_arr_act_no_META = createCommonMeta($ref_arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta ref_arr_act_rev_META = createCommonMeta($ref_arr_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ref_purc_act_no_META = createCommonMeta($ref_purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta ref_purc_act_seq_META = createCommonMeta($ref_purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ref_purc_act_rev_META = createCommonMeta($ref_purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ref_purc_act_d_no_META = createCommonMeta($ref_purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta ref_purc_act_d_seq_META = createCommonMeta($ref_purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta db_trd_unit_cd_META = createCommonMeta($db_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta db_trd_unit_conv_qty_META = createCommonMeta($db_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_conv_base_qty_META = createCommonMeta($db_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_dec_place_META = createCommonMeta($db_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta db_trd_unit_rnd_typ_META = createCommonMeta($db_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta db_trd_unit_qty_META = createCommonMeta($db_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_cur_amt_META = createCommonMeta($db_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_dscnt_amt_META = createCommonMeta($db_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_onr_prov_amt_META = createCommonMeta($db_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_onr_prov_upri_META = createCommonMeta($db_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_proc_amt_META = createCommonMeta($db_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_proc_upri_META = createCommonMeta($db_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_tax_amt_META = createCommonMeta($db_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_upri_META = createCommonMeta($db_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_wtax_rate_META = createCommonMeta($db_wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_tax_rate_META = createCommonMeta($db_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_inc_tax_flg_META = createCommonMeta($db_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Dtl1R> constMetas = new ConstMetaList<Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			abort_flg_META,
			schd_trd_unit_cd_META,
			schd_trd_unit_conv_qty_META,
			schd_trd_unit_dmn_qty_META,
			schd_trd_unit_dec_place_META,
			schd_trd_unit_rnd_typ_META,
			schd_trd_unit_qty_META,
			schd_base_unit_qty_META,
			schd_trd_cur_upri_META,
			schd_trd_cur_proc_upri_META,
			schd_trd_cur_onr_prov_upri_META,
			schd_trd_cur_dscnt_amt_META,
			schd_trd_cur_amt_META,
			schd_trd_cur_proc_amt_META,
			schd_trd_cur_onr_prov_amt_META,
			schd_trd_cur_tax_amt_META,
			purc_ret_loc_wg_cd_META,
			purc_ret_loc_wg_nm_META,
			purc_ret_loc_cd_META,
			purc_ret_loc_nm_META,
			purc_ret_sppl_cd_META,
			str_ln_tgt_flg_META,
			str_ln_p_META,
			itm_p_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			itm_purc_upri_cng_flg_META,
			dscnt_itm_flg_META,
			arr_skip_flg_META,
			itm_pay_crryovr_times_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			stk_mng_typ_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_no_p_META,
			bp_lot_no_META,
			ver_flg_META,
			ver_no_p_META,
			sno_wrk_no_p_META,
			maker_cd_META,
			maker_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			purc_typ_META,
			purc_typ_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_dmn_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			purc_ret_schd_qty_p_META,
			purc_ret_qty_p_META,
			abort_qty_p_META,
			purc_dtl_upd_flg_META,
			trd_upri_amt_p_META,
			schd_tax_rate_META,
			schd_inc_tax_flg_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			trd_cur_proc_upri_p_META,
			trd_cur_onr_prov_upri_p_META,
			old_trd_cur_upri_META,
			old_trd_cur_proc_upri_META,
			old_trd_cur_onr_prov_upri_META,
			loc_mng_typ_META,
			trd_cur_proc_amt_p_META,
			trd_cur_onr_prov_amt_p_META,
			base_cur_upri_p_META,
			base_cur_proc_upri_p_META,
			base_cur_onr_prov_upri_p_META,
			base_cur_dscnt_amt_p_META,
			base_cur_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_proc_amt_p_META,
			base_cur_onr_prov_amt_p_META,
			ptax_cur_upri_p_META,
			ptax_cur_proc_upri_p_META,
			ptax_cur_onr_prov_upri_p_META,
			ptax_cur_dscnt_amt_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			ptax_cur_proc_amt_p_META,
			ptax_cur_onr_prov_amt_p_META,
			wtax_rate_META,
			wtax_amt_p_META,
			mfg_inst_no_META,
			po_no_META,
			quality_typ_META,
			quality_typ_nm_META,
			insp_flg_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			purc_ret_rsn_cd_META,
			purc_ret_rsn_nm_META,
			xpns_purc_flg_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			pay_crryovr_times_META,
			bd_p_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			cont_fctr_flg_META,
			purc_cont_qty_p_META,
			purc_cont_fctr_p_META,
			std_cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			purc_ret_print_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			purc_ret_schd_d_no_META,
			purc_ret_act_d_no_META,
			ref_arr_act_no_META,
			ref_arr_act_rev_META,
			ref_purc_act_no_META,
			ref_purc_act_seq_META,
			ref_purc_act_rev_META,
			ref_purc_act_d_no_META,
			ref_purc_act_d_seq_META,
			base_purc_ac_dt_META,
			base_ac_dt_META,
			base_dt_META,
			disp_seq_META,
			db_trd_unit_cd_META,
			db_trd_unit_conv_qty_META,
			db_trd_unit_conv_base_qty_META,
			db_trd_unit_dec_place_META,
			db_trd_unit_rnd_typ_META,
			db_trd_unit_qty_META,
			db_trd_cur_amt_META,
			db_trd_cur_dscnt_amt_META,
			db_trd_cur_onr_prov_amt_META,
			db_trd_cur_onr_prov_upri_META,
			db_trd_cur_proc_amt_META,
			db_trd_cur_proc_upri_META,
			db_trd_cur_tax_amt_META,
			db_trd_cur_upri_META,
			db_wtax_rate_META,
			db_tax_rate_META,
			db_inc_tax_flg_META
		},
		new String[][]{
			{
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"schd_qty",
				"ret_qty",
				"abort_qty",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"interim_flg",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"tax_fix_flg",
				"tax_cd",
				"tax_nm",
				"tax_rate",
				"tax_typ",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"trd_cur_proc_amt",
				"trd_cur_proc_tax_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_onr_prov_tax_amt",
				"base_cur_upri",
				"base_cur_proc_upri",
				"base_cur_onr_prov_upri",
				"base_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"base_cur_proc_amt",
				"base_cur_proc_tax_amt",
				"base_cur_onr_prov_amt",
				"base_cur_onr_prov_tax_amt",
				"ptax_cur_upri",
				"ptax_cur_proc_upri",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_dscnt_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_proc_amt",
				"ptax_cur_proc_tax_amt",
				"ptax_cur_onr_prov_amt",
				"ptax_cur_onr_prov_tax_amt",
				"wtax_amt",
				"bd_dpt_cd",
				"bd_dpt_nm",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_itm_nm",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_bp_cd",
				"bd_bp_nm",
				"bd_loc_cd",
				"bd_loc_nm",
				"bd_ctg_cd",
				"bd_ctg_nm",
				"bd_oper_cd",
				"bd_oper_nm",
				"bd_iv_no",
				"bd_slo_no",
				"bd_po_no",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr"
			},
			{
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$schd_qty,
				$ret_qty,
				$abort_qty,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$interim_flg,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$tax_fix_flg,
				$tax_cd,
				$tax_nm,
				$tax_rate,
				$tax_typ,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$trd_cur_proc_amt,
				$trd_cur_proc_tax_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_onr_prov_tax_amt,
				$base_cur_upri,
				$base_cur_proc_upri,
				$base_cur_onr_prov_upri,
				$base_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$base_cur_proc_amt,
				$base_cur_proc_tax_amt,
				$base_cur_onr_prov_amt,
				$base_cur_onr_prov_tax_amt,
				$ptax_cur_upri,
				$ptax_cur_proc_upri,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_dscnt_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_proc_amt,
				$ptax_cur_proc_tax_amt,
				$ptax_cur_onr_prov_amt,
				$ptax_cur_onr_prov_tax_amt,
				$wtax_amt,
				$bd_dpt_cd,
				$bd_dpt_nm,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_itm_nm,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_bp_cd,
				$bd_bp_nm,
				$bd_loc_cd,
				$bd_loc_nm,
				$bd_ctg_cd,
				$bd_ctg_nm,
				$bd_oper_cd,
				$bd_oper_nm,
				$bd_iv_no,
				$bd_slo_no,
				$bd_po_no,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$purc_ret_loc_cd, "wg_cd;wg_nm;loc_nm;str_ln_tgt_flg;sppl_cd;loc_mng_typ"},	// purc_ret_loc_cd
				{$itm_p + ".itm_cd", "sundry_itm_flg;itm_nm;itm_sub1;itm_sub2;itm_sub3;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;stk_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ;wtax_rate;pay_crryovr_times;maker_cd;maker_nm;purc_unit_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "sundry_itm_flg;itm_nm;itm_sub2;itm_sub3;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;stk_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ;wtax_rate;pay_crryovr_times;maker_cd;maker_nm;purc_unit_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "sundry_itm_flg;itm_nm;itm_sub3;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;stk_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ;wtax_rate;pay_crryovr_times;maker_cd;maker_nm;purc_unit_cd"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "sundry_itm_flg;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;stk_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ;wtax_rate;pay_crryovr_times;maker_cd;maker_nm;purc_unit_cd"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "sublot_no;ver_no"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "ver_no"},	// lot_no_p.sublot_no
				{$maker_cd, "bp_nm"},	// maker_cd
				{$trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty"},	// trd_unit_cd
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$stk_arrv_bp_cd, "sppl_nm"},	// stk_arrv_bp_cd
				{$purc_ret_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_ret_rsn_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$bd_p + ".bd_dpt_cd", "dpt_nm"},	// bd_p.bd_dpt_cd
				{$bd_p + ".bd_itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bd_p.bd_itm_cd
				{$bd_p + ".bd_itm_sub1", "itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bd_p.bd_itm_sub1
				{$bd_p + ".bd_itm_sub2", "itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bd_p.bd_itm_sub2
				{$bd_p + ".bd_itm_sub3", "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"}	// bd_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$str_ln_p + ".str_ln_cd", "purc_ret_loc_cd;true"},	// str_ln_p.str_ln_cd
				{$itm_p + ".itm_cd", "true;true;purc_ret_loc_wg_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "true;true;purc_ret_loc_wg_cd;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "true;true;purc_ret_loc_wg_cd;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "true;true;purc_ret_loc_wg_cd;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$maker_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;purc_ret_loc_wg_cd;true;true;asset_mng_typ;true;true"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "loc_mng_typ"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$stk_arrv_bp_cd, "purc_ret_loc_cd;true"},	// stk_arrv_bp_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$bd_p + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD"},	// bd_p.bd_dpt_cd
				{$bd_p + ".bd_itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// bd_p.bd_itm_cd
				{$bd_p + ".bd_itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd"},	// bd_p.bd_itm_sub1
				{$bd_p + ".bd_itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1"},	// bd_p.bd_itm_sub2
				{$bd_p + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"}	// bd_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// str_ln_p.str_ln_cd
				{$itm_p + ".itm_cd", "purc_flg;outsrc_flg;wg_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "purc_flg;outsrc_flg;wg_cd;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "purc_flg;outsrc_flg;wg_cd;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "purc_flg;outsrc_flg;wg_cd;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$maker_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;inc_outsrc_flg;manual_sppl_flg;asset_mng_typ;maker_flg;mode_nullval_flg"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "purc_dscnt_loc_mng_typ"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$stk_arrv_bp_cd, "loc_cd;mode_nullval_flg"},	// stk_arrv_bp_cd
				{$ap_dpt_cd, "dpt_is_srch_typ"},	// ap_dpt_cd
				{$bd_p + ".bd_dpt_cd", "dpt_is_srch_typ"},	// bd_p.bd_dpt_cd
				{$bd_p + ".bd_itm_cd", "itm_is_srch_typ"},	// bd_p.bd_itm_cd
				{$bd_p + ".bd_itm_sub1", "itm_is_srch_typ;itm_cd"},	// bd_p.bd_itm_sub1
				{$bd_p + ".bd_itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// bd_p.bd_itm_sub2
				{$bd_p + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// bd_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$purc_ret_loc_wg_cd, "WG"},	// purc_ret_loc_wg_cd
				{$purc_ret_loc_wg_nm, "WG"},	// purc_ret_loc_wg_nm
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_proc_upri_p + ".upri", "BASE_CUR"},	// base_cur_proc_upri_p.upri
				{$base_cur_onr_prov_upri_p + ".upri", "BASE_CUR"},	// base_cur_onr_prov_upri_p.upri
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_proc_amt_p + ".amt", "BASE_CUR"},	// base_cur_proc_amt_p.amt
				{$base_cur_proc_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_proc_amt_p.tax_amt
				{$base_cur_onr_prov_amt_p + ".amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.amt
				{$base_cur_onr_prov_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.tax_amt
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_proc_upri_p + ".upri", "PTAX"},	// ptax_cur_proc_upri_p.upri
				{$ptax_cur_onr_prov_upri_p + ".upri", "PTAX"},	// ptax_cur_onr_prov_upri_p.upri
				{$ptax_cur_dscnt_amt_p + ".amt", "PTAX"},	// ptax_cur_dscnt_amt_p.amt
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$ptax_cur_proc_amt_p + ".amt", "PTAX"},	// ptax_cur_proc_amt_p.amt
				{$ptax_cur_proc_amt_p + ".tax_amt", "PTAX"},	// ptax_cur_proc_amt_p.tax_amt
				{$ptax_cur_onr_prov_amt_p + ".amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.amt
				{$ptax_cur_onr_prov_amt_p + ".tax_amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.tax_amt
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Dtl1R_MC_A(ConstMetaList<? extends Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R clone() {
		return (Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R createInstance() {
		return (Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R getValues(String... names) {
		return (Dtl1R) super.getValues(names);
	}



	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 1, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 1, $abort_flg, value);
	}


	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public String schd_trd_unit_cd() {
		return getConstString(offset + 2, $schd_trd_unit_cd);
	}

	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public void schd_trd_unit_cd(String value) {
		setConstString(offset + 2, $schd_trd_unit_cd, value);
	}


	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 3, $schd_trd_unit_conv_qty);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}


	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_dmn_qty() {
		return getConstNumber(offset + 4, $schd_trd_unit_dmn_qty);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 4, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(int value) {
		setConstNumber(offset + 4, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(long value) {
		setConstNumber(offset + 4, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(float value) {
		setConstNumber(offset + 4, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(double value) {
		setConstNumber(offset + 4, $schd_trd_unit_dmn_qty, value);
	}


	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_trd_unit_dec_place() {
		return getConstNumber(offset + 5, $schd_trd_unit_dec_place);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}


	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public String schd_trd_unit_rnd_typ() {
		return getConstString(offset + 6, $schd_trd_unit_rnd_typ);
	}

	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public void schd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 6, $schd_trd_unit_rnd_typ, value);
	}


	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_qty() {
		return getConstNumber(offset + 7, $schd_trd_unit_qty);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 7, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(int value) {
		setConstNumber(offset + 7, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(long value) {
		setConstNumber(offset + 7, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(float value) {
		setConstNumber(offset + 7, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(double value) {
		setConstNumber(offset + 7, $schd_trd_unit_qty, value);
	}


	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public MCNumber schd_base_unit_qty() {
		return getConstNumber(offset + 8, $schd_base_unit_qty);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 8, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(int value) {
		setConstNumber(offset + 8, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(long value) {
		setConstNumber(offset + 8, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(float value) {
		setConstNumber(offset + 8, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(double value) {
		setConstNumber(offset + 8, $schd_base_unit_qty, value);
	}


	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_upri() {
		return getConstNumber(offset + 9, $schd_trd_cur_upri);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 9, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(int value) {
		setConstNumber(offset + 9, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(long value) {
		setConstNumber(offset + 9, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(float value) {
		setConstNumber(offset + 9, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(double value) {
		setConstNumber(offset + 9, $schd_trd_cur_upri, value);
	}


	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_proc_upri() {
		return getConstNumber(offset + 10, $schd_trd_cur_proc_upri);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 10, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 10, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 10, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 10, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 10, $schd_trd_cur_proc_upri, value);
	}


	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 11, $schd_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 12, $schd_trd_cur_dscnt_amt);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 12, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 12, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 12, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 12, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 12, $schd_trd_cur_dscnt_amt, value);
	}


	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_amt() {
		return getConstNumber(offset + 13, $schd_trd_cur_amt);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 13, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(int value) {
		setConstNumber(offset + 13, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(long value) {
		setConstNumber(offset + 13, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(float value) {
		setConstNumber(offset + 13, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(double value) {
		setConstNumber(offset + 13, $schd_trd_cur_amt, value);
	}


	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_proc_amt() {
		return getConstNumber(offset + 14, $schd_trd_cur_proc_amt);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 14, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 14, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 14, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 14, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 14, $schd_trd_cur_proc_amt, value);
	}


	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 15, $schd_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_tax_amt() {
		return getConstNumber(offset + 16, $schd_trd_cur_tax_amt);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 16, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 16, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 16, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 16, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 16, $schd_trd_cur_tax_amt, value);
	}


	/**
	 * Return-from location WG cd. 返品元場所ＷＧＣＤ.<p>
	 *
	 */
	public String purc_ret_loc_wg_cd() {
		return getConstString(offset + 17, $purc_ret_loc_wg_cd);
	}

	/**
	 * Return-from location WG cd. 返品元場所ＷＧＣＤ.<p>
	 *
	 */
	public void purc_ret_loc_wg_cd(String value) {
		setConstString(offset + 17, $purc_ret_loc_wg_cd, value);
	}


	/**
	 * Return-from location WG name 返品元場所ＷＧ名.<p>
	 *
	 */
	public String purc_ret_loc_wg_nm() {
		return getConstString(offset + 18, $purc_ret_loc_wg_nm);
	}

	/**
	 * Return-from location WG name 返品元場所ＷＧ名.<p>
	 *
	 */
	public void purc_ret_loc_wg_nm(String value) {
		setConstString(offset + 18, $purc_ret_loc_wg_nm, value);
	}


	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String purc_ret_loc_cd() {
		return getConstString(offset + 19, $purc_ret_loc_cd);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void purc_ret_loc_cd(String value) {
		setConstString(offset + 19, $purc_ret_loc_cd, value);
	}


	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public String purc_ret_loc_nm() {
		return getConstString(offset + 20, $purc_ret_loc_nm);
	}

	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public void purc_ret_loc_nm(String value) {
		setConstString(offset + 20, $purc_ret_loc_nm, value);
	}


	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public String purc_ret_sppl_cd() {
		return getConstString(offset + 21, $purc_ret_sppl_cd);
	}

	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public void purc_ret_sppl_cd(String value) {
		setConstString(offset + 21, $purc_ret_sppl_cd, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 22, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 22, $str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 23, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 23, $str_ln_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 24, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 24, $itm_p, row);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 25, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 25, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 26, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 26, $sundry_itm_flg, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 27, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 27, $itm_purc_upri_cng_flg, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 28, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 28, $dscnt_itm_flg, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 29, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 29, $arr_skip_flg, value);
	}


	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCNumber itm_pay_crryovr_times() {
		return getConstNumber(offset + 30, $itm_pay_crryovr_times);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 30, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(int value) {
		setConstNumber(offset + 30, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(long value) {
		setConstNumber(offset + 30, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(float value) {
		setConstNumber(offset + 30, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(double value) {
		setConstNumber(offset + 30, $itm_pay_crryovr_times, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 31, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 31, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 32, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 32, $asset_mng_typ_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 33, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 33, $stk_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 34, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 34, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 35, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 35, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 36, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 36, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 37, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 37, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 38, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 38, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 39, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 39, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 40, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 40, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 41, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 41, $sno4_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 42, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 42, $lot_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 43, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 43, $bp_lot_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 44, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 44, $ver_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 45, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 45, $ver_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 46, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 46, $sno_wrk_no_p, row);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 47, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 47, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 48, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 48, $maker_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 49, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 49, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 50, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 50, $sppl_itm_nm, value);
	}


	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return getConstString(offset + 51, $purc_typ);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		setConstString(offset + 51, $purc_typ, value);
	}


	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public String purc_typ_nm() {
		return getConstString(offset + 52, $purc_typ_nm);
	}

	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public void purc_typ_nm(String value) {
		setConstString(offset + 52, $purc_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 53, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 53, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 54, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 54, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 55, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 55, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 55, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 55, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 55, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 55, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 56, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 56, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_dmn_qty() {
		return getConstNumber(offset + 57, $trd_unit_dmn_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 57, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(int value) {
		setConstNumber(offset + 57, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(long value) {
		setConstNumber(offset + 57, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(float value) {
		setConstNumber(offset + 57, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(double value) {
		setConstNumber(offset + 57, $trd_unit_dmn_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 58, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 58, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 58, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 58, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 58, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 58, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 60, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 60, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 61, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 61, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 62, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 62, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 63, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 63, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_ret_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 65, $purc_ret_schd_qty_p);
	}
	
	public void purc_ret_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 65, $purc_ret_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_ret_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $purc_ret_qty_p);
	}
	
	public void purc_ret_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $purc_ret_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR abort_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $abort_qty_p);
	}
	
	public void abort_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $abort_qty_p, row);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 68, $purc_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 68, $purc_dtl_upd_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 69, $trd_upri_amt_p);
	}
	
	public void trd_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 69, $trd_upri_amt_p, row);
	}


	public MCNumber schd_tax_rate() {
		return getConstNumber(offset + 70, $schd_tax_rate);
	}

	public void schd_tax_rate(MCNumber value) {
		setConstNumber(offset + 70, $schd_tax_rate, value);
	}

	public void schd_tax_rate(int value) {
		setConstNumber(offset + 70, $schd_tax_rate, value);
	}

	public void schd_tax_rate(long value) {
		setConstNumber(offset + 70, $schd_tax_rate, value);
	}

	public void schd_tax_rate(float value) {
		setConstNumber(offset + 70, $schd_tax_rate, value);
	}

	public void schd_tax_rate(double value) {
		setConstNumber(offset + 70, $schd_tax_rate, value);
	}


	public boolean schd_inc_tax_flg() {
		return getConstBoolean(offset + 71, $schd_inc_tax_flg);
	}

	public void schd_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 71, $schd_inc_tax_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 72, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 72, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 73, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 73, $outsrc_upri_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 74, $trd_cur_proc_upri_p);
	}
	
	public void trd_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 74, $trd_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 75, $trd_cur_onr_prov_upri_p);
	}
	
	public void trd_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 75, $trd_cur_onr_prov_upri_p, row);
	}


	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public MCNumber old_trd_cur_upri() {
		return getConstNumber(offset + 76, $old_trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 76, $old_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_upri(int value) {
		setConstNumber(offset + 76, $old_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_upri(long value) {
		setConstNumber(offset + 76, $old_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_upri(float value) {
		setConstNumber(offset + 76, $old_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency)_before change 取引通貨単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_upri(double value) {
		setConstNumber(offset + 76, $old_trd_cur_upri, value);
	}


	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public MCNumber old_trd_cur_proc_upri() {
		return getConstNumber(offset + 77, $old_trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 77, $old_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 77, $old_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 77, $old_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 77, $old_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency)_before change 取引通貨加工単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 77, $old_trd_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public MCNumber old_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 78, $old_trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 78, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 78, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 78, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 78, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency)_before change 取引通貨有償支給単価_変更前.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 78, $old_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 79, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 79, $loc_mng_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 80, $trd_cur_proc_amt_p);
	}
	
	public void trd_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 80, $trd_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 81, $trd_cur_onr_prov_amt_p);
	}
	
	public void trd_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 81, $trd_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 82, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 82, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 83, $base_cur_proc_upri_p);
	}
	
	public void base_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 83, $base_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 84, $base_cur_onr_prov_upri_p);
	}
	
	public void base_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 84, $base_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 85, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 85, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 86, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 86, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 87, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 87, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 88, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 88, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 89, $base_cur_proc_amt_p);
	}
	
	public void base_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 89, $base_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 90, $base_cur_onr_prov_amt_p);
	}
	
	public void base_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 90, $base_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 91, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 91, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 92, $ptax_cur_proc_upri_p);
	}
	
	public void ptax_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 92, $ptax_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 93, $ptax_cur_onr_prov_upri_p);
	}
	
	public void ptax_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 93, $ptax_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 94, $ptax_cur_dscnt_amt_p);
	}
	
	public void ptax_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 94, $ptax_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 95, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 95, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 96, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 96, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 97, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 97, $ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 98, $ptax_cur_proc_amt_p);
	}
	
	public void ptax_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 98, $ptax_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 99, $ptax_cur_onr_prov_amt_p);
	}
	
	public void ptax_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 99, $ptax_cur_onr_prov_amt_p, row);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 100, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 100, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 100, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 100, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 100, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 100, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 101, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 101, $wtax_amt_p, row);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 102, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 102, $mfg_inst_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 103, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 103, $po_no, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 104, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 104, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 105, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 105, $quality_typ_nm, value);
	}


	/**
	 * Inspection 検査.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 106, $insp_flg);
	}

	/**
	 * Inspection 検査.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 106, $insp_flg, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 107, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 107, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 108, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 108, $stk_id_typ_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 109, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 109, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 110, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 110, $purc_id_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 111, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 111, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 112, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 112, $gd_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 113, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 113, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 114, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 114, $stk_arrv_bp_nm, value);
	}


	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public String purc_ret_rsn_cd() {
		return getConstString(offset + 115, $purc_ret_rsn_cd);
	}

	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public void purc_ret_rsn_cd(String value) {
		setConstString(offset + 115, $purc_ret_rsn_cd, value);
	}


	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public String purc_ret_rsn_nm() {
		return getConstString(offset + 116, $purc_ret_rsn_nm);
	}

	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public void purc_ret_rsn_nm(String value) {
		setConstString(offset + 116, $purc_ret_rsn_nm, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 117, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 117, $xpns_purc_flg, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 118, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 118, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 119, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 119, $ap_dpt_nm, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 120, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 120, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 120, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 120, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 120, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 120, $pay_crryovr_times, value);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bd_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 121, $bd_p);
	}
	
	public void bd_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 121, $bd_p, row);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 122, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 122, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 123, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 123, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 124, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 124, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 125, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 125, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 126, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 126, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 127, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 127, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 128, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 128, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 129, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 129, $bd_sno4_mng_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 130, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 130, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5300.PurcContQtyR purc_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5300.PurcContQtyR) getConstInnerRow(offset + 131, $purc_cont_qty_p);
	}
	
	public void purc_cont_qty_p(mcframe.clientMAUB.MAUBP5300.PurcContQtyR row){
		setConstInnerRow(offset + 131, $purc_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5330.PurcContFctrR purc_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5330.PurcContFctrR) getConstInnerRow(offset + 132, $purc_cont_fctr_p);
	}
	
	public void purc_cont_fctr_p(mcframe.clientMAUB.MAUBP5330.PurcContFctrR row){
		setConstInnerRow(offset + 132, $purc_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 133, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 133, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 134, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 134, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 135, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 135, $std_cont_fctr_p, row);
	}


	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 136, $cont_fctr_rnd_typ);
	}

	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 136, $cont_fctr_rnd_typ, value);
	}


	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 137, $cont_fctr_dec_place);
	}

	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 137, $cont_fctr_dec_place, value);
	}

	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 137, $cont_fctr_dec_place, value);
	}

	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 137, $cont_fctr_dec_place, value);
	}

	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 137, $cont_fctr_dec_place, value);
	}

	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 137, $cont_fctr_dec_place, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 138, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 138, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 139, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 139, $intr_rmrks, value);
	}


	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public String purc_ret_print_d_rmrks() {
		return getConstString(offset + 140, $purc_ret_print_d_rmrks);
	}

	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public void purc_ret_print_d_rmrks(String value) {
		setConstString(offset + 140, $purc_ret_print_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 141, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 141, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 142, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 142, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 143, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 143, $sub_char3, value);
	}


	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_schd_d_no() {
		return getConstString(offset + 144, $purc_ret_schd_d_no);
	}

	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_schd_d_no(String value) {
		setConstString(offset + 144, $purc_ret_schd_d_no, value);
	}


	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return getConstString(offset + 145, $purc_ret_act_d_no);
	}

	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		setConstString(offset + 145, $purc_ret_act_d_no, value);
	}


	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public String ref_arr_act_no() {
		return getConstString(offset + 146, $ref_arr_act_no);
	}

	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public void ref_arr_act_no(String value) {
		setConstString(offset + 146, $ref_arr_act_no, value);
	}


	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public MCNumber ref_arr_act_rev() {
		return getConstNumber(offset + 147, $ref_arr_act_rev);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(MCNumber value) {
		setConstNumber(offset + 147, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(int value) {
		setConstNumber(offset + 147, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(long value) {
		setConstNumber(offset + 147, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(float value) {
		setConstNumber(offset + 147, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(double value) {
		setConstNumber(offset + 147, $ref_arr_act_rev, value);
	}


	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_no() {
		return getConstString(offset + 148, $ref_purc_act_no);
	}

	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_no(String value) {
		setConstString(offset + 148, $ref_purc_act_no, value);
	}


	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_seq() {
		return getConstNumber(offset + 149, $ref_purc_act_seq);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(MCNumber value) {
		setConstNumber(offset + 149, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(int value) {
		setConstNumber(offset + 149, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(long value) {
		setConstNumber(offset + 149, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(float value) {
		setConstNumber(offset + 149, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(double value) {
		setConstNumber(offset + 149, $ref_purc_act_seq, value);
	}


	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber ref_purc_act_rev() {
		return getConstNumber(offset + 150, $ref_purc_act_rev);
	}

	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public void ref_purc_act_rev(MCNumber value) {
		setConstNumber(offset + 150, $ref_purc_act_rev, value);
	}

	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public void ref_purc_act_rev(int value) {
		setConstNumber(offset + 150, $ref_purc_act_rev, value);
	}

	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public void ref_purc_act_rev(long value) {
		setConstNumber(offset + 150, $ref_purc_act_rev, value);
	}

	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public void ref_purc_act_rev(float value) {
		setConstNumber(offset + 150, $ref_purc_act_rev, value);
	}

	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public void ref_purc_act_rev(double value) {
		setConstNumber(offset + 150, $ref_purc_act_rev, value);
	}


	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_d_no() {
		return getConstString(offset + 151, $ref_purc_act_d_no);
	}

	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_d_no(String value) {
		setConstString(offset + 151, $ref_purc_act_d_no, value);
	}


	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_d_seq() {
		return getConstNumber(offset + 152, $ref_purc_act_d_seq);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 152, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(int value) {
		setConstNumber(offset + 152, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(long value) {
		setConstNumber(offset + 152, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(float value) {
		setConstNumber(offset + 152, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(double value) {
		setConstNumber(offset + 152, $ref_purc_act_d_seq, value);
	}


	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 153, $base_purc_ac_dt);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 153, $base_purc_ac_dt, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 154, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 154, $base_ac_dt, value);
	}


	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 155, $base_dt);
	}

	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 155, $base_dt, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 156, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 156, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 156, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 156, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 156, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 156, $disp_seq, value);
	}


	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public String db_trd_unit_cd() {
		return getConstString(offset + 157, $db_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public void db_trd_unit_cd(String value) {
		setConstString(offset + 157, $db_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_qty() {
		return getConstNumber(offset + 158, $db_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 158, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 158, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 158, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 158, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 158, $db_trd_unit_conv_qty, value);
	}


	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 159, $db_trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 159, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 159, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 159, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 159, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 159, $db_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber db_trd_unit_dec_place() {
		return getConstNumber(offset + 160, $db_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 160, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(int value) {
		setConstNumber(offset + 160, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(long value) {
		setConstNumber(offset + 160, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(float value) {
		setConstNumber(offset + 160, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(double value) {
		setConstNumber(offset + 160, $db_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public String db_trd_unit_rnd_typ() {
		return getConstString(offset + 161, $db_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public void db_trd_unit_rnd_typ(String value) {
		setConstString(offset + 161, $db_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_qty() {
		return getConstNumber(offset + 162, $db_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 162, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(int value) {
		setConstNumber(offset + 162, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(long value) {
		setConstNumber(offset + 162, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(float value) {
		setConstNumber(offset + 162, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(double value) {
		setConstNumber(offset + 162, $db_trd_unit_qty, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_amt() {
		return getConstNumber(offset + 163, $db_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 163, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(int value) {
		setConstNumber(offset + 163, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(long value) {
		setConstNumber(offset + 163, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(float value) {
		setConstNumber(offset + 163, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(double value) {
		setConstNumber(offset + 163, $db_trd_cur_amt, value);
	}


	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCNumber db_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 164, $db_trd_cur_dscnt_amt);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 164, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 164, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 164, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 164, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 164, $db_trd_cur_dscnt_amt, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 165, $db_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 165, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 165, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 165, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 165, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 165, $db_trd_cur_onr_prov_amt, value);
	}


	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 166, $db_trd_cur_onr_prov_upri);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 166, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 166, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 166, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 166, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 166, $db_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_proc_amt() {
		return getConstNumber(offset + 167, $db_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 167, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 167, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 167, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 167, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 167, $db_trd_cur_proc_amt, value);
	}


	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_proc_upri() {
		return getConstNumber(offset + 168, $db_trd_cur_proc_upri);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 168, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 168, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 168, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 168, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 168, $db_trd_cur_proc_upri, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_tax_amt() {
		return getConstNumber(offset + 169, $db_trd_cur_tax_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 169, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 169, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 169, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 169, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 169, $db_trd_cur_tax_amt, value);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_upri() {
		return getConstNumber(offset + 170, $db_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 170, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(int value) {
		setConstNumber(offset + 170, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(long value) {
		setConstNumber(offset + 170, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(float value) {
		setConstNumber(offset + 170, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(double value) {
		setConstNumber(offset + 170, $db_trd_cur_upri, value);
	}


	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public MCNumber db_wtax_rate() {
		return getConstNumber(offset + 171, $db_wtax_rate);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(MCNumber value) {
		setConstNumber(offset + 171, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(int value) {
		setConstNumber(offset + 171, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(long value) {
		setConstNumber(offset + 171, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(float value) {
		setConstNumber(offset + 171, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(double value) {
		setConstNumber(offset + 171, $db_wtax_rate, value);
	}


	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public MCNumber db_tax_rate() {
		return getConstNumber(offset + 172, $db_tax_rate);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(MCNumber value) {
		setConstNumber(offset + 172, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(int value) {
		setConstNumber(offset + 172, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(long value) {
		setConstNumber(offset + 172, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(float value) {
		setConstNumber(offset + 172, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(double value) {
		setConstNumber(offset + 172, $db_tax_rate, value);
	}


	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public boolean db_inc_tax_flg() {
		return getConstBoolean(offset + 173, $db_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public void db_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 173, $db_inc_tax_flg, value);
	}


	public String getString(String name) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($purc_ret_loc_wg_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_cd();
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_nm();
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_cd();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($purc_ret_sppl_cd.equalsIgnoreCase(name)) {
			return purc_ret_sppl_cd();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			return purc_ret_rsn_cd();
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			return purc_ret_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_d_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			return ref_arr_act_no();
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			return ref_purc_act_no();
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			return ref_purc_act_d_no();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_dmn_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_upri();
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_upri();
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_upri();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_amt();
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_amt();
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_amt();
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_tax_amt();
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			return itm_pay_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return trd_unit_dmn_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			return ref_arr_act_rev();
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_seq();
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			return ref_purc_act_rev();
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_qty();
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_base_qty();
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return db_trd_unit_dec_place();
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_qty();
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_amt();
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_dscnt_amt();
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_amt();
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_upri();
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_amt();
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_upri();
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_tax_amt();
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_upri();
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			return db_wtax_rate();
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			return db_tax_rate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($purc_ret_loc_wg_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_cd();
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_nm();
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_cd();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($purc_ret_sppl_cd.equalsIgnoreCase(name)) {
			return purc_ret_sppl_cd();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			return purc_ret_rsn_cd();
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			return purc_ret_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_d_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			return ref_arr_act_no();
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			return ref_purc_act_no();
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			return ref_purc_act_d_no();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_dmn_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_upri();
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_upri();
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_upri();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_amt();
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_amt();
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_amt();
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_tax_amt();
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			return itm_pay_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return trd_unit_dmn_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			return ref_arr_act_rev();
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_seq();
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			return ref_purc_act_rev();
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_qty();
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_base_qty();
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return db_trd_unit_dec_place();
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_qty();
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_amt();
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_dscnt_amt();
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_amt();
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_upri();
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_amt();
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_upri();
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_tax_amt();
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_upri();
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			return db_wtax_rate();
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			return db_tax_rate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_ret_loc_wg_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_cd(value);
			return;
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_cd(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($purc_ret_sppl_cd.equalsIgnoreCase(name)) {
			purc_ret_sppl_cd(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			purc_ret_rsn_cd(value);
			return;
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			purc_ret_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			purc_ret_schd_d_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			ref_arr_act_no(value);
			return;
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			ref_purc_act_no(value);
			return;
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			ref_purc_act_d_no(value);
			return;
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			db_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			db_trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_ret_loc_wg_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_cd(value);
			return;
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_cd(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($purc_ret_sppl_cd.equalsIgnoreCase(name)) {
			purc_ret_sppl_cd(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			purc_ret_rsn_cd(value);
			return;
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			purc_ret_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			purc_ret_schd_d_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			ref_arr_act_no(value);
			return;
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			ref_purc_act_no(value);
			return;
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			ref_purc_act_d_no(value);
			return;
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			db_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			db_trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_rev.equalsIgnoreCase(name)) {
			ref_purc_act_rev(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($purc_ret_schd_qty_p.equalsIgnoreCase(name)) {
			return purc_ret_schd_qty_p();
		}
		if ($purc_ret_qty_p.equalsIgnoreCase(name)) {
			return purc_ret_qty_p();
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			return abort_qty_p();
		}
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_upri_amt_p();
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri_p();
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri_p();
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt_p();
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt_p();
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return base_cur_proc_upri_p();
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri_p();
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return base_cur_proc_amt_p();
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt_p();
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_upri_p();
		}
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri_p();
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri_p();
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt_p();
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_amt_p();
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt_p();
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt_p();
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt_p();
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt_p();
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			return wtax_amt_p();
		}
		if ($bd_p.equalsIgnoreCase(name)) {
			return bd_p();
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			return purc_cont_qty_p();
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			return purc_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_ret_schd_qty_p.equalsIgnoreCase(name)) {
			purc_ret_schd_qty_p(
				((MCContainerMeta) purc_ret_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_ret_qty_p.equalsIgnoreCase(name)) {
			purc_ret_qty_p(
				((MCContainerMeta) purc_ret_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			abort_qty_p(
				((MCContainerMeta) abort_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			trd_upri_amt_p(
				((MCContainerMeta) trd_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			trd_cur_proc_upri_p(
				((MCContainerMeta) trd_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri_p(
				((MCContainerMeta) trd_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			trd_cur_proc_amt_p(
				((MCContainerMeta) trd_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt_p(
				((MCContainerMeta) trd_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			base_cur_upri_p(
				((MCContainerMeta) base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			base_cur_proc_upri_p(
				((MCContainerMeta) base_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri_p(
				((MCContainerMeta) base_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt_p(
				((MCContainerMeta) base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			base_cur_proc_amt_p(
				((MCContainerMeta) base_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt_p(
				((MCContainerMeta) base_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_upri_p(
				((MCContainerMeta) ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri_p(
				((MCContainerMeta) ptax_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri_p(
				((MCContainerMeta) ptax_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt_p(
				((MCContainerMeta) ptax_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_amt_p(
				((MCContainerMeta) ptax_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt_p(
				((MCContainerMeta) ptax_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt_p(
				((MCContainerMeta) ptax_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt_p(
				((MCContainerMeta) ptax_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt_p(
				((MCContainerMeta) ptax_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			wtax_amt_p(
				((MCContainerMeta) wtax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($bd_p.equalsIgnoreCase(name)) {
			bd_p(
				((MCContainerMeta) bd_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			purc_cont_qty_p(
				((MCContainerMeta) purc_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class, value)
			);
			return;
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			purc_cont_fctr_p(
				((MCContainerMeta) purc_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return purc_ret_schd_qty_p().qty();
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		purc_ret_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(int value) {
		purc_ret_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(long value) {
		purc_ret_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(float value) {
		purc_ret_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(double value) {
		purc_ret_schd_qty_p().qty(value);
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public MCNumber ret_qty() {
		return purc_ret_qty_p().qty();
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public void ret_qty(MCNumber value) {
		purc_ret_qty_p().qty(value);
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public void ret_qty(int value) {
		purc_ret_qty_p().qty(value);
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public void ret_qty(long value) {
		purc_ret_qty_p().qty(value);
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public void ret_qty(float value) {
		purc_ret_qty_p().qty(value);
	}

	/**
	 * Returned qty. 返品済数量.<p>
	 *
	 */
	public void ret_qty(double value) {
		purc_ret_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return abort_qty_p().qty();
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		abort_qty_p().qty(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_upri_amt_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_upri_amt_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_upri_amt_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_upri_amt_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_upri_amt_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_upri_amt_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_upri_amt_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_upri_amt_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_upri_amt_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_upri_amt_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_upri_amt_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_upri_amt_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_upri_amt_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_upri_amt_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_upri_amt_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_upri_amt_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_upri_amt_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_upri_amt_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_upri_amt_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_upri_amt_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_upri_amt_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_upri_amt_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_upri_amt_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_upri_amt_p().dscnt_rsn_nm(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return trd_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return trd_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return trd_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		trd_cur_proc_amt_p().amt(value);
	}

	public MCNumber trd_cur_proc_tax_amt() {
		return trd_cur_proc_amt_p().tax_amt();
	}

	public void trd_cur_proc_tax_amt(MCNumber value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	public void trd_cur_proc_tax_amt(int value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	public void trd_cur_proc_tax_amt(long value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	public void trd_cur_proc_tax_amt(float value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	public void trd_cur_proc_tax_amt(double value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return trd_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	public MCNumber trd_cur_onr_prov_tax_amt() {
		return trd_cur_onr_prov_amt_p().tax_amt();
	}

	public void trd_cur_onr_prov_tax_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void trd_cur_onr_prov_tax_amt(int value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void trd_cur_onr_prov_tax_amt(long value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void trd_cur_onr_prov_tax_amt(float value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void trd_cur_onr_prov_tax_amt(double value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return base_cur_upri_p().upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return base_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return base_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return base_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return base_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		base_cur_proc_amt_p().amt(value);
	}

	public MCNumber base_cur_proc_tax_amt() {
		return base_cur_proc_amt_p().tax_amt();
	}

	public void base_cur_proc_tax_amt(MCNumber value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	public void base_cur_proc_tax_amt(int value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	public void base_cur_proc_tax_amt(long value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	public void base_cur_proc_tax_amt(float value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	public void base_cur_proc_tax_amt(double value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return base_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	public MCNumber base_cur_onr_prov_tax_amt() {
		return base_cur_onr_prov_amt_p().tax_amt();
	}

	public void base_cur_onr_prov_tax_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void base_cur_onr_prov_tax_amt(int value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void base_cur_onr_prov_tax_amt(long value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void base_cur_onr_prov_tax_amt(float value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void base_cur_onr_prov_tax_amt(double value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return ptax_cur_upri_p().upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return ptax_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return ptax_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return ptax_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return ptax_cur_amt_p().amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return ptax_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return ptax_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return ptax_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	public MCNumber ptax_cur_proc_tax_amt() {
		return ptax_cur_proc_amt_p().tax_amt();
	}

	public void ptax_cur_proc_tax_amt(MCNumber value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	public void ptax_cur_proc_tax_amt(int value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	public void ptax_cur_proc_tax_amt(long value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	public void ptax_cur_proc_tax_amt(float value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	public void ptax_cur_proc_tax_amt(double value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return ptax_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	public MCNumber ptax_cur_onr_prov_tax_amt() {
		return ptax_cur_onr_prov_amt_p().tax_amt();
	}

	public void ptax_cur_onr_prov_tax_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void ptax_cur_onr_prov_tax_amt(int value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void ptax_cur_onr_prov_tax_amt(long value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void ptax_cur_onr_prov_tax_amt(float value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	public void ptax_cur_onr_prov_tax_amt(double value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return wtax_amt_p().amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		wtax_amt_p().amt(value);
	}

	public String bd_dpt_cd() {
		return bd_p().bd_dpt_cd();
	}

	public void bd_dpt_cd(String value) {
		bd_p().bd_dpt_cd(value);
	}

	public String bd_dpt_nm() {
		return bd_p().bd_dpt_nm();
	}

	public void bd_dpt_nm(String value) {
		bd_p().bd_dpt_nm(value);
	}

	public String bd_itm_cd() {
		return bd_p().bd_itm_cd();
	}

	public void bd_itm_cd(String value) {
		bd_p().bd_itm_cd(value);
	}

	public String bd_itm_sub1() {
		return bd_p().bd_itm_sub1();
	}

	public void bd_itm_sub1(String value) {
		bd_p().bd_itm_sub1(value);
	}

	public String bd_itm_sub2() {
		return bd_p().bd_itm_sub2();
	}

	public void bd_itm_sub2(String value) {
		bd_p().bd_itm_sub2(value);
	}

	public String bd_itm_sub3() {
		return bd_p().bd_itm_sub3();
	}

	public void bd_itm_sub3(String value) {
		bd_p().bd_itm_sub3(value);
	}

	public String bd_itm_nm() {
		return bd_p().bd_itm_nm();
	}

	public void bd_itm_nm(String value) {
		bd_p().bd_itm_nm(value);
	}

	public String bd_lot_no() {
		return bd_p().bd_lot_no();
	}

	public void bd_lot_no(String value) {
		bd_p().bd_lot_no(value);
	}

	public String bd_sublot_no() {
		return bd_p().bd_sublot_no();
	}

	public void bd_sublot_no(String value) {
		bd_p().bd_sublot_no(value);
	}

	public String bd_sno1() {
		return bd_p().bd_sno1();
	}

	public void bd_sno1(String value) {
		bd_p().bd_sno1(value);
	}

	public String bd_sno2() {
		return bd_p().bd_sno2();
	}

	public void bd_sno2(String value) {
		bd_p().bd_sno2(value);
	}

	public String bd_sno3() {
		return bd_p().bd_sno3();
	}

	public void bd_sno3(String value) {
		bd_p().bd_sno3(value);
	}

	public String bd_sno4() {
		return bd_p().bd_sno4();
	}

	public void bd_sno4(String value) {
		bd_p().bd_sno4(value);
	}

	public String bd_bp_cd() {
		return bd_p().bd_bp_cd();
	}

	public void bd_bp_cd(String value) {
		bd_p().bd_bp_cd(value);
	}

	public String bd_bp_nm() {
		return bd_p().bd_bp_nm();
	}

	public void bd_bp_nm(String value) {
		bd_p().bd_bp_nm(value);
	}

	public String bd_loc_cd() {
		return bd_p().bd_loc_cd();
	}

	public void bd_loc_cd(String value) {
		bd_p().bd_loc_cd(value);
	}

	public String bd_loc_nm() {
		return bd_p().bd_loc_nm();
	}

	public void bd_loc_nm(String value) {
		bd_p().bd_loc_nm(value);
	}

	public String bd_ctg_cd() {
		return bd_p().bd_ctg_cd();
	}

	public void bd_ctg_cd(String value) {
		bd_p().bd_ctg_cd(value);
	}

	public String bd_ctg_nm() {
		return bd_p().bd_ctg_nm();
	}

	public void bd_ctg_nm(String value) {
		bd_p().bd_ctg_nm(value);
	}

	public String bd_oper_cd() {
		return bd_p().bd_oper_cd();
	}

	public void bd_oper_cd(String value) {
		bd_p().bd_oper_cd(value);
	}

	public String bd_oper_nm() {
		return bd_p().bd_oper_nm();
	}

	public void bd_oper_nm(String value) {
		bd_p().bd_oper_nm(value);
	}

	public String bd_iv_no() {
		return bd_p().bd_iv_no();
	}

	public void bd_iv_no(String value) {
		bd_p().bd_iv_no(value);
	}

	public String bd_slo_no() {
		return bd_p().bd_slo_no();
	}

	public void bd_slo_no(String value) {
		bd_p().bd_slo_no(value);
	}

	public String bd_po_no() {
		return bd_p().bd_po_no();
	}

	public void bd_po_no(String value) {
		bd_p().bd_po_no(value);
	}

	public MCNumber purc_cont_qty() {
		return purc_cont_qty_p().purc_cont_qty();
	}

	public void purc_cont_qty(MCNumber value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(int value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(long value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(float value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(double value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public MCNumber purc_cont_fctr() {
		return purc_cont_fctr_p().purc_cont_fctr();
	}

	public void purc_cont_fctr(MCNumber value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(int value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(long value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(float value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(double value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

}

