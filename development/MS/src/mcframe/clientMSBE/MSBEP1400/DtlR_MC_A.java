package mcframe.clientMSBE.MSBEP1400;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $itm_p = "itm_p";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
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
	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public static final String $lot_none_flg = "lot_none_flg";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $alloc_ver_no_p = "alloc_ver_no_p";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public static final String $ent_unit_cd = "ent_unit_cd";
	/**
	 * Input unit name 入力単位名.<p>
	 *
	 */
	public static final String $ent_unit_nm = "ent_unit_nm";
	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public static final String $ent_unit_dec_place = "ent_unit_dec_place";
	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public static final String $ent_unit_conv_base_qty = "ent_unit_conv_base_qty";
	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public static final String $ent_unit_conv_qty = "ent_unit_conv_qty";
	/**
	 * Input unit rounding type 入力単位端数処理区分.<p>
	 *
	 */
	public static final String $ent_unit_rnd_typ = "ent_unit_rnd_typ";
	public static final String $ent_unit_qty_p = "ent_unit_qty_p";
	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public static final String $schd_abort_flg = "schd_abort_flg";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	public static final String $bef_abort_flg = "bef_abort_flg";
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
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public static final String $base_unit_conv_base_qty = "base_unit_conv_base_qty";
	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public static final String $base_unit_conv_qty = "base_unit_conv_qty";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $ttl_flg = "ttl_flg";
	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public static final String $inst_bndl_flg = "inst_bndl_flg";
	/**
	 * Unit cd. at packing 梱包時単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Unit name at packing 梱包時単位名.<p>
	 *
	 */
	public static final String $pckg_unit_nm = "pckg_unit_nm";
	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pckg_unit_dec_place = "pckg_unit_dec_place";
	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public static final String $pckg_unit_conv_base_qty = "pckg_unit_conv_base_qty";
	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public static final String $pckg_unit_conv_qty = "pckg_unit_conv_qty";
	/**
	 * Unit rounding type at packing 梱包時単位端数処理区分.<p>
	 *
	 */
	public static final String $pckg_unit_rnd_typ = "pckg_unit_rnd_typ";
	public static final String $pckg_unit_qty_p = "pckg_unit_qty_p";
	/**
	 * Unit cd. at schedule 予定時単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_unit_cd = "schd_unit_cd";
	/**
	 * Unit name at schedule 予定時単位名.<p>
	 *
	 */
	public static final String $schd_unit_nm = "schd_unit_nm";
	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_unit_dec_place = "schd_unit_dec_place";
	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_base_qty = "schd_unit_conv_base_qty";
	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_qty = "schd_unit_conv_qty";
	/**
	 * Unit rounding type at schedule 予定時単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_unit_rnd_typ = "schd_unit_rnd_typ";
	public static final String $schd_unit_qty_p = "schd_unit_qty_p";
	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public static final String $iv_schd_qty = "iv_schd_qty";
	public static final String $ship_act_qty_p = "ship_act_qty_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_unit_dec_place = "cont_unit_dec_place";
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public static final String $cont_unit_rnd_typ = "cont_unit_rnd_typ";
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	public static final String $bef_alloc_flg = "bef_alloc_flg";
	/**
	 * Gross allocation 総量引当.<p>
	 *
	 */
	public static final String $grp_alloc_flg = "grp_alloc_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $ship_site_cd = "ship_site_cd";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $ship_str_ln_tgt_flg = "ship_str_ln_tgt_flg";
	public static final String $ship_str_ln_p = "ship_str_ln_p";
	/**
	 * For delivery rack/line 納品棚・ライン対象.<p>
	 *
	 */
	public static final String $dlv_str_ln_tgt_flg = "dlv_str_ln_tgt_flg";
	public static final String $dlv_str_ln_p = "dlv_str_ln_p";
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
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	public static final String $alloc_sno_wrk_no_p = "alloc_sno_wrk_no_p";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
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
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	public static final String $stk_bp_p = "stk_bp_p";
	/**
	 * Delivery destination type 納品先区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination type name 納品先区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $def_loc_cd = "def_loc_cd";
	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public static final String $def_loc_nm = "def_loc_nm";
	/**
	 * Normal shipping location priority 通常出荷場所優先.<p>
	 *
	 */
	public static final String $ship_loc_prio_flg = "ship_loc_prio_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Unrequired configuration check 構成チェック不要.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_nm = "prov_basis_typ_nm";
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ_nm = "ret_prov_typ_nm";
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ = "ret_prov_basis_typ";
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ_nm = "ret_prov_basis_typ_nm";
	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public static final String $last_wms_flg = "last_wms_flg";
	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public static final String $wms_tgt_flg = "wms_tgt_flg";
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public static final String $base_dlv_slip_no = "base_dlv_slip_no";
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public static final String $base_prov_act_no = "base_prov_act_no";
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public static final String $tmp_inst_d_no = "tmp_inst_d_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public static final String $lot_peg_no = "lot_peg_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public static final String $pick_peg_no = "pick_peg_no";
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 * Shipping invoice biz flg. インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public static final String $cststk_flg = "cststk_flg";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $loan_flg = "loan_flg";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $ship_wt = "ship_wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $ship_dim = "ship_dim";
	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public static final String $unit_wt = "unit_wt";
	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public static final String $unit_dim = "unit_dim";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping schedule location cd. 出荷予定場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_schd_loc_cd = "ship_schd_loc_cd";
	/**
	 * Shipping schedule location supplier cd. 出荷予定場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $ship_schd_loc_sppl_cd = "ship_schd_loc_sppl_cd";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public static final String $no_alloc_flg = "no_alloc_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $alloc_ver_no = $alloc_ver_no_p + ".ver_no";
	public static final String $ent_unit_qty = $ent_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $pckg_unit_qty = $pckg_unit_qty_p + ".qty";
	public static final String $schd_unit_qty = $schd_unit_qty_p + ".qty";
	public static final String $ship_act_qty = $ship_act_qty_p + ".qty";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $ship_str_ln_cd = $ship_str_ln_p + ".str_ln_cd";
	public static final String $ship_str_ln_nm = $ship_str_ln_p + ".str_ln_nm";
	public static final String $ship_str_ln_cd_none_flg = $ship_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $dlv_str_ln_cd = $dlv_str_ln_p + ".str_ln_cd";
	public static final String $dlv_str_ln_nm = $dlv_str_ln_p + ".str_ln_nm";
	public static final String $dlv_str_ln_cd_none_flg = $dlv_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno1_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno2_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno3_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $sno4_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $alloc_sno1 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $alloc_sno1_null_flg = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "";
	public static final String $alloc_sno2 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $alloc_sno2_null_flg = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "";
	public static final String $alloc_sno3 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $alloc_sno3_null_flg = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "";
	public static final String $alloc_sno4 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $alloc_sno4_null_flg = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "";
	public static final String $alloc_wrk_no = $alloc_sno_wrk_no_p + ".wrk_no";
	public static final String $alloc_wrk_nm = $alloc_sno_wrk_no_p + ".wrk_nm";
	public static final String $stk_bp_cd = $stk_bp_p + ".stk_bp_cd";
	public static final String $stk_bp_nm = $stk_bp_p + ".stk_bp_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_none_flg_META = createCommonMeta($lot_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta alloc_ver_no_p_META = createInnerRowMeta($alloc_ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ent_unit_cd_META = createCommonMeta($ent_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ent_unit_nm_META = createCommonMeta($ent_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ent_unit_dec_place_META = createCommonMeta($ent_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ent_unit_conv_base_qty_META = createCommonMeta($ent_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ent_unit_conv_qty_META = createCommonMeta($ent_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ent_unit_rnd_typ_META = createCommonMeta($ent_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ent_unit_qty_p_META = createInnerRowMeta($ent_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_abort_flg_META = createCommonMeta($schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_base_qty_META = createCommonMeta($base_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_conv_qty_META = createCommonMeta($base_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ttl_flg_META = createCommonMeta($ttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_flg_META = createCommonMeta($inst_bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pckg_unit_dec_place_META = createCommonMeta($pckg_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pckg_unit_conv_base_qty_META = createCommonMeta($pckg_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_conv_qty_META = createCommonMeta($pckg_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_rnd_typ_META = createCommonMeta($pckg_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pckg_unit_qty_p_META = createInnerRowMeta($pckg_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_unit_conv_base_qty_META = createCommonMeta($schd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_conv_qty_META = createCommonMeta($schd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_rnd_typ_META = createCommonMeta($schd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta schd_unit_qty_p_META = createInnerRowMeta($schd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta iv_schd_qty_META = createCommonMeta($iv_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_p_META = createInnerRowMeta($ship_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta cont_unit_dec_place_META = createCommonMeta($cont_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_unit_rnd_typ_META = createCommonMeta($cont_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_alloc_flg_META = createCommonMeta($bef_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta grp_alloc_flg_META = createCommonMeta($grp_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_site_cd_META = createCommonMeta($ship_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ship_str_ln_tgt_flg_META = createCommonMeta($ship_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_str_ln_p_META = createInnerRowMeta($ship_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta dlv_str_ln_tgt_flg_META = createCommonMeta($dlv_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_str_ln_p_META = createInnerRowMeta($dlv_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta alloc_sno_wrk_no_p_META = createInnerRowMeta($alloc_sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_bp_p_META = createInnerRowMeta($stk_bp_p, mcframe.clientMSUB.MSUBP5050.StkBpR.class);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta def_loc_cd_META = createCommonMeta($def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta def_loc_nm_META = createCommonMeta($def_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_loc_prio_flg_META = createCommonMeta($ship_loc_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_typ_nm_META = createCommonMeta($ret_prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_prov_basis_typ_nm_META = createCommonMeta($ret_prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_wms_flg_META = createCommonMeta($last_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_tgt_flg_META = createCommonMeta($wms_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR3);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta tmp_inst_d_no_META = createCommonMeta($tmp_inst_d_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta lot_peg_no_META = createCommonMeta($lot_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta pick_peg_no_META = createCommonMeta($pick_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cststk_flg_META = createCommonMeta($cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loan_flg_META = createCommonMeta($loan_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_wt_META = createCommonMeta($ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ship_dim_META = createCommonMeta($ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta unit_wt_META = createCommonMeta($unit_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta unit_dim_META = createCommonMeta($unit_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_schd_loc_cd_META = createCommonMeta($ship_schd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_schd_loc_sppl_cd_META = createCommonMeta($ship_schd_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta no_alloc_flg_META = createCommonMeta($no_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			stk_mng_typ_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_none_flg_META,
			lot_no_p_META,
			ver_flg_META,
			ver_no_p_META,
			alloc_ver_no_p_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			ent_unit_cd_META,
			ent_unit_nm_META,
			ent_unit_dec_place_META,
			ent_unit_conv_base_qty_META,
			ent_unit_conv_qty_META,
			ent_unit_rnd_typ_META,
			ent_unit_qty_p_META,
			schd_abort_flg_META,
			inst_abort_flg_META,
			bef_abort_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_conv_base_qty_META,
			base_unit_conv_qty_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			ttl_flg_META,
			inst_bndl_flg_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			pckg_unit_dec_place_META,
			pckg_unit_conv_base_qty_META,
			pckg_unit_conv_qty_META,
			pckg_unit_rnd_typ_META,
			pckg_unit_qty_p_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_dec_place_META,
			schd_unit_conv_base_qty_META,
			schd_unit_conv_qty_META,
			schd_unit_rnd_typ_META,
			schd_unit_qty_p_META,
			iv_schd_qty_META,
			ship_act_qty_p_META,
			cont_fctr_flg_META,
			act_cont_qty_p_META,
			act_cont_fctr_p_META,
			std_cont_qty_p_META,
			std_cont_fctr_p_META,
			cont_fctr_unit_p_META,
			cont_unit_dec_place_META,
			cont_unit_rnd_typ_META,
			alloc_flg_META,
			bef_alloc_flg_META,
			grp_alloc_flg_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_site_cd_META,
			ship_str_ln_tgt_flg_META,
			ship_str_ln_p_META,
			dlv_str_ln_tgt_flg_META,
			dlv_str_ln_p_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			sno_wrk_no_p_META,
			alloc_sno_wrk_no_p_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			stk_bp_p_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			def_loc_cd_META,
			def_loc_nm_META,
			ship_loc_prio_flg_META,
			trd_cd_META,
			trd_nm_META,
			cst_cd_META,
			cst_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			pri_prnt_flg_META,
			skip_chk_ship_flg_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			ret_prov_typ_META,
			ret_prov_typ_nm_META,
			ret_prov_basis_typ_META,
			ret_prov_basis_typ_nm_META,
			wms_flg_META,
			last_wms_flg_META,
			wms_tgt_flg_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			ship_cnt_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			inst_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			slo_no_META,
			slo_d_no_META,
			xfr_schd_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			ship_schd_no_META,
			ship_alloc_sts_no_META,
			iv_no_META,
			iv_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			disp_seq_META,
			ship_fr_lg_grp_cd_META,
			tmp_inst_d_no_META,
			ship_pr_no_META,
			lot_peg_no_META,
			trd_ptn_typ_META,
			pick_peg_no_META,
			xfr_src_typ_META,
			iv_trd_flg_META,
			cst_iv_flg_META,
			cststk_flg_META,
			loan_flg_META,
			ship_wt_META,
			ship_dim_META,
			unit_wt_META,
			unit_dim_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			alloc_scope_typ_META,
			ship_inst_typ_META,
			ship_schd_loc_cd_META,
			ship_schd_loc_sppl_cd_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_term_cd_META,
			no_alloc_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"alloc_ver_no",
				"ent_unit_qty",
				"base_unit_qty",
				"pckg_unit_qty",
				"schd_unit_qty",
				"ship_act_qty",
				"act_cont_qty",
				"act_cont_fctr",
				"std_cont_qty",
				"std_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"ship_str_ln_cd",
				"ship_str_ln_nm",
				"ship_str_ln_cd_none_flg",
				"dlv_str_ln_cd",
				"dlv_str_ln_nm",
				"dlv_str_ln_cd_none_flg",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"wrk_no",
				"wrk_nm",
				"alloc_sno1",
				"alloc_sno1_null_flg",
				"alloc_sno2",
				"alloc_sno2_null_flg",
				"alloc_sno3",
				"alloc_sno3_null_flg",
				"alloc_sno4",
				"alloc_sno4_null_flg",
				"alloc_wrk_no",
				"alloc_wrk_nm",
				"stk_bp_cd",
				"stk_bp_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$alloc_ver_no,
				$ent_unit_qty,
				$base_unit_qty,
				$pckg_unit_qty,
				$schd_unit_qty,
				$ship_act_qty,
				$act_cont_qty,
				$act_cont_fctr,
				$std_cont_qty,
				$std_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$ship_str_ln_cd,
				$ship_str_ln_nm,
				$ship_str_ln_cd_none_flg,
				$dlv_str_ln_cd,
				$dlv_str_ln_nm,
				$dlv_str_ln_cd_none_flg,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$wrk_no,
				$wrk_nm,
				$alloc_sno1,
				$alloc_sno1_null_flg,
				$alloc_sno2,
				$alloc_sno2_null_flg,
				$alloc_sno3,
				$alloc_sno3_null_flg,
				$alloc_sno4,
				$alloc_sno4_null_flg,
				$alloc_wrk_no,
				$alloc_wrk_nm,
				$stk_bp_cd,
				$stk_bp_nm
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
				{$lot_no_p + ".lot_no", "sublot_no;ver_no;act_cont_fctr"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "ver_no;act_cont_fctr"},	// lot_no_p.sublot_no
				{$ent_unit_cd, "unit_nm;dec_place;rnd_typ;conv_qty;conv_base_qty;unit_dim;unit_wt"},	// ent_unit_cd
				{$ship_loc_cd, "loc_nm;str_ln_tgt_flg;site_cd"}	// ship_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$ent_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ent_unit_cd
				{$ship_loc_cd, "ship_fr_lg_grp_cd"}	// ship_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$ent_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ent_unit_cd
				{$ship_loc_cd, "lg_grp_cd"}	// ship_loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_conv_base_qty, "BASE_UNIT"},	// base_unit_conv_base_qty
				{$base_unit_conv_qty, "BASE_UNIT"},	// base_unit_conv_qty
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$ship_site_cd, "SITE"},	// ship_site_cd
				{$ship_str_ln_tgt_flg, "STR_LN"},	// ship_str_ln_tgt_flg
				{$dlv_str_ln_tgt_flg, "STR_LN"},	// dlv_str_ln_tgt_flg
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$ship_fr_lg_grp_cd, "LG_GRP"}	// ship_fr_lg_grp_cd
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 2, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 2, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 3, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 3, $cst_itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 4, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 4, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 5, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 5, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 6, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 6, $dscnt_itm_flg, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 7, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 7, $stk_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 8, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 8, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 9, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 9, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 10, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 10, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 11, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 11, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 12, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 12, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 13, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 13, $sno4_mng_typ, value);
	}


	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public boolean lot_none_flg() {
		return getConstBoolean(offset + 14, $lot_none_flg);
	}

	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public void lot_none_flg(boolean value) {
		setConstBoolean(offset + 14, $lot_none_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 15, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 15, $lot_no_p, row);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 16, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 16, $ver_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 17, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 17, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR alloc_ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 18, $alloc_ver_no_p);
	}
	
	public void alloc_ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 18, $alloc_ver_no_p, row);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 19, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 19, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 20, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 20, $not_sublot_mix_flg, value);
	}


	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public String ent_unit_cd() {
		return getConstString(offset + 21, $ent_unit_cd);
	}

	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public void ent_unit_cd(String value) {
		setConstString(offset + 21, $ent_unit_cd, value);
	}


	/**
	 * Input unit name 入力単位名.<p>
	 *
	 */
	public String ent_unit_nm() {
		return getConstString(offset + 22, $ent_unit_nm);
	}

	/**
	 * Input unit name 入力単位名.<p>
	 *
	 */
	public void ent_unit_nm(String value) {
		setConstString(offset + 22, $ent_unit_nm, value);
	}


	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber ent_unit_dec_place() {
		return getConstNumber(offset + 23, $ent_unit_dec_place);
	}

	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public void ent_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 23, $ent_unit_dec_place, value);
	}

	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public void ent_unit_dec_place(int value) {
		setConstNumber(offset + 23, $ent_unit_dec_place, value);
	}

	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public void ent_unit_dec_place(long value) {
		setConstNumber(offset + 23, $ent_unit_dec_place, value);
	}

	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public void ent_unit_dec_place(float value) {
		setConstNumber(offset + 23, $ent_unit_dec_place, value);
	}

	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public void ent_unit_dec_place(double value) {
		setConstNumber(offset + 23, $ent_unit_dec_place, value);
	}


	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public MCNumber ent_unit_conv_base_qty() {
		return getConstNumber(offset + 24, $ent_unit_conv_base_qty);
	}

	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public void ent_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 24, $ent_unit_conv_base_qty, value);
	}

	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public void ent_unit_conv_base_qty(int value) {
		setConstNumber(offset + 24, $ent_unit_conv_base_qty, value);
	}

	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public void ent_unit_conv_base_qty(long value) {
		setConstNumber(offset + 24, $ent_unit_conv_base_qty, value);
	}

	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public void ent_unit_conv_base_qty(float value) {
		setConstNumber(offset + 24, $ent_unit_conv_base_qty, value);
	}

	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public void ent_unit_conv_base_qty(double value) {
		setConstNumber(offset + 24, $ent_unit_conv_base_qty, value);
	}


	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public MCNumber ent_unit_conv_qty() {
		return getConstNumber(offset + 25, $ent_unit_conv_qty);
	}

	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public void ent_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 25, $ent_unit_conv_qty, value);
	}

	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public void ent_unit_conv_qty(int value) {
		setConstNumber(offset + 25, $ent_unit_conv_qty, value);
	}

	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public void ent_unit_conv_qty(long value) {
		setConstNumber(offset + 25, $ent_unit_conv_qty, value);
	}

	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public void ent_unit_conv_qty(float value) {
		setConstNumber(offset + 25, $ent_unit_conv_qty, value);
	}

	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public void ent_unit_conv_qty(double value) {
		setConstNumber(offset + 25, $ent_unit_conv_qty, value);
	}


	/**
	 * Input unit rounding type 入力単位端数処理区分.<p>
	 *
	 */
	public String ent_unit_rnd_typ() {
		return getConstString(offset + 26, $ent_unit_rnd_typ);
	}

	/**
	 * Input unit rounding type 入力単位端数処理区分.<p>
	 *
	 */
	public void ent_unit_rnd_typ(String value) {
		setConstString(offset + 26, $ent_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ent_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $ent_unit_qty_p);
	}
	
	public void ent_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $ent_unit_qty_p, row);
	}


	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public boolean schd_abort_flg() {
		return getConstBoolean(offset + 28, $schd_abort_flg);
	}

	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public void schd_abort_flg(boolean value) {
		setConstBoolean(offset + 28, $schd_abort_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 29, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 29, $inst_abort_flg, value);
	}


	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 30, $bef_abort_flg);
	}

	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 30, $bef_abort_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 31, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 31, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 32, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 32, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 33, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}


	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public MCNumber base_unit_conv_base_qty() {
		return getConstNumber(offset + 34, $base_unit_conv_base_qty);
	}

	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public void base_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 34, $base_unit_conv_base_qty, value);
	}

	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public void base_unit_conv_base_qty(int value) {
		setConstNumber(offset + 34, $base_unit_conv_base_qty, value);
	}

	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public void base_unit_conv_base_qty(long value) {
		setConstNumber(offset + 34, $base_unit_conv_base_qty, value);
	}

	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public void base_unit_conv_base_qty(float value) {
		setConstNumber(offset + 34, $base_unit_conv_base_qty, value);
	}

	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public void base_unit_conv_base_qty(double value) {
		setConstNumber(offset + 34, $base_unit_conv_base_qty, value);
	}


	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public MCNumber base_unit_conv_qty() {
		return getConstNumber(offset + 35, $base_unit_conv_qty);
	}

	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public void base_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_conv_qty, value);
	}

	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public void base_unit_conv_qty(int value) {
		setConstNumber(offset + 35, $base_unit_conv_qty, value);
	}

	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public void base_unit_conv_qty(long value) {
		setConstNumber(offset + 35, $base_unit_conv_qty, value);
	}

	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public void base_unit_conv_qty(float value) {
		setConstNumber(offset + 35, $base_unit_conv_qty, value);
	}

	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public void base_unit_conv_qty(double value) {
		setConstNumber(offset + 35, $base_unit_conv_qty, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 36, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 36, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $base_unit_qty_p, row);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean ttl_flg() {
		return getConstBoolean(offset + 38, $ttl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void ttl_flg(boolean value) {
		setConstBoolean(offset + 38, $ttl_flg, value);
	}


	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return getConstBoolean(offset + 39, $inst_bndl_flg);
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		setConstBoolean(offset + 39, $inst_bndl_flg, value);
	}


	/**
	 * Unit cd. at packing 梱包時単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 40, $pckg_unit_cd);
	}

	/**
	 * Unit cd. at packing 梱包時単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 40, $pckg_unit_cd, value);
	}


	/**
	 * Unit name at packing 梱包時単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 41, $pckg_unit_nm);
	}

	/**
	 * Unit name at packing 梱包時単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 41, $pckg_unit_nm, value);
	}


	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pckg_unit_dec_place() {
		return getConstNumber(offset + 42, $pckg_unit_dec_place);
	}

	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $pckg_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(int value) {
		setConstNumber(offset + 42, $pckg_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(long value) {
		setConstNumber(offset + 42, $pckg_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(float value) {
		setConstNumber(offset + 42, $pckg_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(double value) {
		setConstNumber(offset + 42, $pckg_unit_dec_place, value);
	}


	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_base_qty() {
		return getConstNumber(offset + 43, $pckg_unit_conv_base_qty);
	}

	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 43, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(int value) {
		setConstNumber(offset + 43, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(long value) {
		setConstNumber(offset + 43, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(float value) {
		setConstNumber(offset + 43, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(double value) {
		setConstNumber(offset + 43, $pckg_unit_conv_base_qty, value);
	}


	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_qty() {
		return getConstNumber(offset + 44, $pckg_unit_conv_qty);
	}

	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 44, $pckg_unit_conv_qty, value);
	}

	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(int value) {
		setConstNumber(offset + 44, $pckg_unit_conv_qty, value);
	}

	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(long value) {
		setConstNumber(offset + 44, $pckg_unit_conv_qty, value);
	}

	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(float value) {
		setConstNumber(offset + 44, $pckg_unit_conv_qty, value);
	}

	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(double value) {
		setConstNumber(offset + 44, $pckg_unit_conv_qty, value);
	}


	/**
	 * Unit rounding type at packing 梱包時単位端数処理区分.<p>
	 *
	 */
	public String pckg_unit_rnd_typ() {
		return getConstString(offset + 45, $pckg_unit_rnd_typ);
	}

	/**
	 * Unit rounding type at packing 梱包時単位端数処理区分.<p>
	 *
	 */
	public void pckg_unit_rnd_typ(String value) {
		setConstString(offset + 45, $pckg_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pckg_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $pckg_unit_qty_p);
	}
	
	public void pckg_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $pckg_unit_qty_p, row);
	}


	/**
	 * Unit cd. at schedule 予定時単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 47, $schd_unit_cd);
	}

	/**
	 * Unit cd. at schedule 予定時単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 47, $schd_unit_cd, value);
	}


	/**
	 * Unit name at schedule 予定時単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 48, $schd_unit_nm);
	}

	/**
	 * Unit name at schedule 予定時単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 48, $schd_unit_nm, value);
	}


	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 49, $schd_unit_dec_place);
	}

	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $schd_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 49, $schd_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 49, $schd_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 49, $schd_unit_dec_place, value);
	}

	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 49, $schd_unit_dec_place, value);
	}


	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_base_qty() {
		return getConstNumber(offset + 50, $schd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 50, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 50, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 50, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 50, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 50, $schd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_qty() {
		return getConstNumber(offset + 51, $schd_unit_conv_qty);
	}

	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 51, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(int value) {
		setConstNumber(offset + 51, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(long value) {
		setConstNumber(offset + 51, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(float value) {
		setConstNumber(offset + 51, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(double value) {
		setConstNumber(offset + 51, $schd_unit_conv_qty, value);
	}


	/**
	 * Unit rounding type at schedule 予定時単位端数処理区分.<p>
	 *
	 */
	public String schd_unit_rnd_typ() {
		return getConstString(offset + 52, $schd_unit_rnd_typ);
	}

	/**
	 * Unit rounding type at schedule 予定時単位端数処理区分.<p>
	 *
	 */
	public void schd_unit_rnd_typ(String value) {
		setConstString(offset + 52, $schd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $schd_unit_qty_p);
	}
	
	public void schd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $schd_unit_qty_p, row);
	}


	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public MCNumber iv_schd_qty() {
		return getConstNumber(offset + 54, $iv_schd_qty);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(MCNumber value) {
		setConstNumber(offset + 54, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(int value) {
		setConstNumber(offset + 54, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(long value) {
		setConstNumber(offset + 54, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(float value) {
		setConstNumber(offset + 54, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(double value) {
		setConstNumber(offset + 54, $iv_schd_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $ship_act_qty_p);
	}
	
	public void ship_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $ship_act_qty_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 56, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 56, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 57, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 57, $act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 58, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 58, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 59, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 59, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 60, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 60, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 61, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 61, $cont_fctr_unit_p, row);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_unit_dec_place() {
		return getConstNumber(offset + 62, $cont_unit_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 62, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(int value) {
		setConstNumber(offset + 62, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(long value) {
		setConstNumber(offset + 62, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(float value) {
		setConstNumber(offset + 62, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(double value) {
		setConstNumber(offset + 62, $cont_unit_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_unit_rnd_typ() {
		return getConstString(offset + 63, $cont_unit_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_unit_rnd_typ(String value) {
		setConstString(offset + 63, $cont_unit_rnd_typ, value);
	}


	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 64, $alloc_flg);
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 64, $alloc_flg, value);
	}


	public boolean bef_alloc_flg() {
		return getConstBoolean(offset + 65, $bef_alloc_flg);
	}

	public void bef_alloc_flg(boolean value) {
		setConstBoolean(offset + 65, $bef_alloc_flg, value);
	}


	/**
	 * Gross allocation 総量引当.<p>
	 *
	 */
	public boolean grp_alloc_flg() {
		return getConstBoolean(offset + 66, $grp_alloc_flg);
	}

	/**
	 * Gross allocation 総量引当.<p>
	 *
	 */
	public void grp_alloc_flg(boolean value) {
		setConstBoolean(offset + 66, $grp_alloc_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 67, $ship_loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 67, $ship_loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 68, $ship_loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 68, $ship_loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String ship_site_cd() {
		return getConstString(offset + 69, $ship_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void ship_site_cd(String value) {
		setConstString(offset + 69, $ship_site_cd, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean ship_str_ln_tgt_flg() {
		return getConstBoolean(offset + 70, $ship_str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void ship_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 70, $ship_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR ship_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 71, $ship_str_ln_p);
	}
	
	public void ship_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 71, $ship_str_ln_p, row);
	}


	/**
	 * For delivery rack/line 納品棚・ライン対象.<p>
	 *
	 */
	public boolean dlv_str_ln_tgt_flg() {
		return getConstBoolean(offset + 72, $dlv_str_ln_tgt_flg);
	}

	/**
	 * For delivery rack/line 納品棚・ライン対象.<p>
	 *
	 */
	public void dlv_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 72, $dlv_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR dlv_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 73, $dlv_str_ln_p);
	}
	
	public void dlv_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 73, $dlv_str_ln_p, row);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 74, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 74, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 75, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 75, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 76, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 76, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 77, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 77, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 78, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 78, $sno_wrk_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR alloc_sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 79, $alloc_sno_wrk_no_p);
	}
	
	public void alloc_sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 79, $alloc_sno_wrk_no_p, row);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 80, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 80, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 81, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 81, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 82, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 82, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 83, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 83, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 84, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 84, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 85, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 85, $stk_arrv_bp_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5050.StkBpR stk_bp_p(){
		return (mcframe.clientMSUB.MSUBP5050.StkBpR) getConstInnerRow(offset + 86, $stk_bp_p);
	}
	
	public void stk_bp_p(mcframe.clientMSUB.MSUBP5050.StkBpR row){
		setConstInnerRow(offset + 86, $stk_bp_p, row);
	}


	/**
	 * Delivery destination type 納品先区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 87, $dlv_id_typ);
	}

	/**
	 * Delivery destination type 納品先区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 87, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination type name 納品先区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 88, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination type name 納品先区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 88, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 89, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 89, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 90, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 90, $dlv_id_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 91, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 91, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 92, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 92, $alloc_grp_nm, value);
	}


	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public String def_loc_cd() {
		return getConstString(offset + 93, $def_loc_cd);
	}

	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public void def_loc_cd(String value) {
		setConstString(offset + 93, $def_loc_cd, value);
	}


	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public String def_loc_nm() {
		return getConstString(offset + 94, $def_loc_nm);
	}

	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public void def_loc_nm(String value) {
		setConstString(offset + 94, $def_loc_nm, value);
	}


	/**
	 * Normal shipping location priority 通常出荷場所優先.<p>
	 *
	 */
	public boolean ship_loc_prio_flg() {
		return getConstBoolean(offset + 95, $ship_loc_prio_flg);
	}

	/**
	 * Normal shipping location priority 通常出荷場所優先.<p>
	 *
	 */
	public void ship_loc_prio_flg(boolean value) {
		setConstBoolean(offset + 95, $ship_loc_prio_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 96, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 96, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 97, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 97, $trd_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 98, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 98, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 99, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 99, $cst_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 100, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 100, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 101, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 101, $rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 102, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 102, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 103, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 103, $bd_dpt_nm, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 104, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 104, $pri_prnt_flg, value);
	}


	/**
	 * Unrequired configuration check 構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 105, $skip_chk_ship_flg);
	}

	/**
	 * Unrequired configuration check 構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 105, $skip_chk_ship_flg, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 106, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 106, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 107, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 107, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 108, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 108, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 109, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 109, $prov_basis_typ_nm, value);
	}


	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 110, $ret_prov_typ);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 110, $ret_prov_typ, value);
	}


	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public String ret_prov_typ_nm() {
		return getConstString(offset + 111, $ret_prov_typ_nm);
	}

	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public void ret_prov_typ_nm(String value) {
		setConstString(offset + 111, $ret_prov_typ_nm, value);
	}


	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 112, $ret_prov_basis_typ);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 112, $ret_prov_basis_typ, value);
	}


	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ_nm() {
		return getConstString(offset + 113, $ret_prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ_nm(String value) {
		setConstString(offset + 113, $ret_prov_basis_typ_nm, value);
	}


	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 114, $wms_flg);
	}

	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 114, $wms_flg, value);
	}


	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public boolean last_wms_flg() {
		return getConstBoolean(offset + 115, $last_wms_flg);
	}

	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public void last_wms_flg(boolean value) {
		setConstBoolean(offset + 115, $last_wms_flg, value);
	}


	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public boolean wms_tgt_flg() {
		return getConstBoolean(offset + 116, $wms_tgt_flg);
	}

	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public void wms_tgt_flg(boolean value) {
		setConstBoolean(offset + 116, $wms_tgt_flg, value);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 117, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 117, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 118, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 118, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 119, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 119, $base_ac_dt, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 120, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 120, $ship_cnt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 121, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 121, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 122, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 122, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 123, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 123, $intr_d_rmrks, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 124, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 124, $inst_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 125, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 125, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 126, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 126, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 127, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 127, $sub_char3, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 128, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 128, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 129, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 129, $slo_d_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 130, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 130, $xfr_schd_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 131, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 131, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 132, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 132, $ship_inst_d_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 133, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 133, $ship_schd_no, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 134, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 134, $ship_alloc_sts_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 135, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 135, $iv_no, value);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 136, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 136, $iv_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 137, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 137, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 138, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 138, $dlv_slip_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 139, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 139, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 139, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 139, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 139, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 139, $disp_seq, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 140, $ship_fr_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 140, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public MCNumber tmp_inst_d_no() {
		return getConstNumber(offset + 141, $tmp_inst_d_no);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(MCNumber value) {
		setConstNumber(offset + 141, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(int value) {
		setConstNumber(offset + 141, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(long value) {
		setConstNumber(offset + 141, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(float value) {
		setConstNumber(offset + 141, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(double value) {
		setConstNumber(offset + 141, $tmp_inst_d_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 142, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 142, $ship_pr_no, value);
	}


	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber lot_peg_no() {
		return getConstNumber(offset + 143, $lot_peg_no);
	}

	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public void lot_peg_no(MCNumber value) {
		setConstNumber(offset + 143, $lot_peg_no, value);
	}

	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public void lot_peg_no(int value) {
		setConstNumber(offset + 143, $lot_peg_no, value);
	}

	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public void lot_peg_no(long value) {
		setConstNumber(offset + 143, $lot_peg_no, value);
	}

	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public void lot_peg_no(float value) {
		setConstNumber(offset + 143, $lot_peg_no, value);
	}

	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public void lot_peg_no(double value) {
		setConstNumber(offset + 143, $lot_peg_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 144, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 144, $trd_ptn_typ, value);
	}


	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber pick_peg_no() {
		return getConstNumber(offset + 145, $pick_peg_no);
	}

	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public void pick_peg_no(MCNumber value) {
		setConstNumber(offset + 145, $pick_peg_no, value);
	}

	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public void pick_peg_no(int value) {
		setConstNumber(offset + 145, $pick_peg_no, value);
	}

	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public void pick_peg_no(long value) {
		setConstNumber(offset + 145, $pick_peg_no, value);
	}

	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public void pick_peg_no(float value) {
		setConstNumber(offset + 145, $pick_peg_no, value);
	}

	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public void pick_peg_no(double value) {
		setConstNumber(offset + 145, $pick_peg_no, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 146, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 146, $xfr_src_typ, value);
	}


	/**
	 * Shipping invoice biz flg. インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 147, $iv_trd_flg);
	}

	/**
	 * Shipping invoice biz flg. インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 147, $iv_trd_flg, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 148, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 148, $cst_iv_flg, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean cststk_flg() {
		return getConstBoolean(offset + 149, $cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void cststk_flg(boolean value) {
		setConstBoolean(offset + 149, $cststk_flg, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean loan_flg() {
		return getConstBoolean(offset + 150, $loan_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void loan_flg(boolean value) {
		setConstBoolean(offset + 150, $loan_flg, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber ship_wt() {
		return getConstNumber(offset + 151, $ship_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(MCNumber value) {
		setConstNumber(offset + 151, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(int value) {
		setConstNumber(offset + 151, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(long value) {
		setConstNumber(offset + 151, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(float value) {
		setConstNumber(offset + 151, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(double value) {
		setConstNumber(offset + 151, $ship_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber ship_dim() {
		return getConstNumber(offset + 152, $ship_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(MCNumber value) {
		setConstNumber(offset + 152, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(int value) {
		setConstNumber(offset + 152, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(long value) {
		setConstNumber(offset + 152, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(float value) {
		setConstNumber(offset + 152, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(double value) {
		setConstNumber(offset + 152, $ship_dim, value);
	}


	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public MCNumber unit_wt() {
		return getConstNumber(offset + 153, $unit_wt);
	}

	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public void unit_wt(MCNumber value) {
		setConstNumber(offset + 153, $unit_wt, value);
	}

	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public void unit_wt(int value) {
		setConstNumber(offset + 153, $unit_wt, value);
	}

	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public void unit_wt(long value) {
		setConstNumber(offset + 153, $unit_wt, value);
	}

	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public void unit_wt(float value) {
		setConstNumber(offset + 153, $unit_wt, value);
	}

	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public void unit_wt(double value) {
		setConstNumber(offset + 153, $unit_wt, value);
	}


	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public MCNumber unit_dim() {
		return getConstNumber(offset + 154, $unit_dim);
	}

	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public void unit_dim(MCNumber value) {
		setConstNumber(offset + 154, $unit_dim, value);
	}

	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public void unit_dim(int value) {
		setConstNumber(offset + 154, $unit_dim, value);
	}

	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public void unit_dim(long value) {
		setConstNumber(offset + 154, $unit_dim, value);
	}

	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public void unit_dim(float value) {
		setConstNumber(offset + 154, $unit_dim, value);
	}

	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public void unit_dim(double value) {
		setConstNumber(offset + 154, $unit_dim, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 155, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 155, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 156, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 156, $vld_dt_to, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 157, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 157, $alloc_scope_typ, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 158, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 158, $ship_inst_typ, value);
	}


	/**
	 * Shipping schedule location cd. 出荷予定場所ＣＤ.<p>
	 *
	 */
	public String ship_schd_loc_cd() {
		return getConstString(offset + 159, $ship_schd_loc_cd);
	}

	/**
	 * Shipping schedule location cd. 出荷予定場所ＣＤ.<p>
	 *
	 */
	public void ship_schd_loc_cd(String value) {
		setConstString(offset + 159, $ship_schd_loc_cd, value);
	}


	/**
	 * Shipping schedule location supplier cd. 出荷予定場所発注先ＣＤ.<p>
	 *
	 */
	public String ship_schd_loc_sppl_cd() {
		return getConstString(offset + 160, $ship_schd_loc_sppl_cd);
	}

	/**
	 * Shipping schedule location supplier cd. 出荷予定場所発注先ＣＤ.<p>
	 *
	 */
	public void ship_schd_loc_sppl_cd(String value) {
		setConstString(offset + 160, $ship_schd_loc_sppl_cd, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 161, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 161, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 162, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 162, $dlv_schd_tm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 163, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 163, $ship_term_cd, value);
	}


	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public boolean no_alloc_flg() {
		return getConstBoolean(offset + 164, $no_alloc_flg);
	}

	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public void no_alloc_flg(boolean value) {
		setConstBoolean(offset + 164, $no_alloc_flg, value);
	}


	public String getString(String name) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			return ent_unit_nm();
		}
		if ($ent_unit_rnd_typ.equalsIgnoreCase(name)) {
			return ent_unit_rnd_typ();
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($pckg_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pckg_unit_rnd_typ();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
		}
		if ($cont_unit_rnd_typ.equalsIgnoreCase(name)) {
			return cont_unit_rnd_typ();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			return def_loc_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_loc_cd.equalsIgnoreCase(name)) {
			return ship_schd_loc_cd();
		}
		if ($ship_schd_loc_sppl_cd.equalsIgnoreCase(name)) {
			return ship_schd_loc_sppl_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			return ent_unit_dec_place();
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return ent_unit_conv_base_qty();
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			return ent_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return base_unit_conv_base_qty();
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			return base_unit_conv_qty();
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			return pckg_unit_dec_place();
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_base_qty();
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			return cont_unit_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			return lot_peg_no();
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			return pick_peg_no();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			return ttl_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($bef_alloc_flg.equalsIgnoreCase(name)) {
			return bef_alloc_flg();
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			return grp_alloc_flg();
		}
		if ($ship_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ship_str_ln_tgt_flg();
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return dlv_str_ln_tgt_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			return last_wms_flg();
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			return wms_tgt_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($loan_flg.equalsIgnoreCase(name)) {
			return loan_flg();
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			return no_alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			return ent_unit_nm();
		}
		if ($ent_unit_rnd_typ.equalsIgnoreCase(name)) {
			return ent_unit_rnd_typ();
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($pckg_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pckg_unit_rnd_typ();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
		}
		if ($cont_unit_rnd_typ.equalsIgnoreCase(name)) {
			return cont_unit_rnd_typ();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			return def_loc_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_loc_cd.equalsIgnoreCase(name)) {
			return ship_schd_loc_cd();
		}
		if ($ship_schd_loc_sppl_cd.equalsIgnoreCase(name)) {
			return ship_schd_loc_sppl_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			return ent_unit_dec_place();
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return ent_unit_conv_base_qty();
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			return ent_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return base_unit_conv_base_qty();
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			return base_unit_conv_qty();
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			return pckg_unit_dec_place();
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_base_qty();
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			return cont_unit_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			return lot_peg_no();
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			return pick_peg_no();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			return ttl_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($bef_alloc_flg.equalsIgnoreCase(name)) {
			return bef_alloc_flg();
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			return grp_alloc_flg();
		}
		if ($ship_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ship_str_ln_tgt_flg();
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return dlv_str_ln_tgt_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			return last_wms_flg();
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			return wms_tgt_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($loan_flg.equalsIgnoreCase(name)) {
			return loan_flg();
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			return no_alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			ent_unit_nm(value);
			return;
		}
		if ($ent_unit_rnd_typ.equalsIgnoreCase(name)) {
			ent_unit_rnd_typ(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($pckg_unit_rnd_typ.equalsIgnoreCase(name)) {
			pckg_unit_rnd_typ(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_unit_rnd_typ(value);
			return;
		}
		if ($cont_unit_rnd_typ.equalsIgnoreCase(name)) {
			cont_unit_rnd_typ(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			def_loc_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_loc_cd.equalsIgnoreCase(name)) {
			ship_schd_loc_cd(value);
			return;
		}
		if ($ship_schd_loc_sppl_cd.equalsIgnoreCase(name)) {
			ship_schd_loc_sppl_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			ttl_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($bef_alloc_flg.equalsIgnoreCase(name)) {
			bef_alloc_flg(value);
			return;
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			grp_alloc_flg(value);
			return;
		}
		if ($ship_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ship_str_ln_tgt_flg(value);
			return;
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			dlv_str_ln_tgt_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			last_wms_flg(value);
			return;
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			wms_tgt_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($loan_flg.equalsIgnoreCase(name)) {
			loan_flg(value);
			return;
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			no_alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		if ($ent_unit_nm.equalsIgnoreCase(name)) {
			ent_unit_nm(value);
			return;
		}
		if ($ent_unit_rnd_typ.equalsIgnoreCase(name)) {
			ent_unit_rnd_typ(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($pckg_unit_rnd_typ.equalsIgnoreCase(name)) {
			pckg_unit_rnd_typ(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_unit_rnd_typ(value);
			return;
		}
		if ($cont_unit_rnd_typ.equalsIgnoreCase(name)) {
			cont_unit_rnd_typ(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			def_loc_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_loc_cd.equalsIgnoreCase(name)) {
			ship_schd_loc_cd(value);
			return;
		}
		if ($ship_schd_loc_sppl_cd.equalsIgnoreCase(name)) {
			ship_schd_loc_sppl_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ent_unit_dec_place.equalsIgnoreCase(name)) {
			ent_unit_dec_place(value);
			return;
		}
		if ($ent_unit_conv_base_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_base_qty(value);
			return;
		}
		if ($ent_unit_conv_qty.equalsIgnoreCase(name)) {
			ent_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_conv_base_qty.equalsIgnoreCase(name)) {
			base_unit_conv_base_qty(value);
			return;
		}
		if ($base_unit_conv_qty.equalsIgnoreCase(name)) {
			base_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($lot_peg_no.equalsIgnoreCase(name)) {
			lot_peg_no(value);
			return;
		}
		if ($pick_peg_no.equalsIgnoreCase(name)) {
			pick_peg_no(value);
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
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			ttl_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($bef_alloc_flg.equalsIgnoreCase(name)) {
			bef_alloc_flg(value);
			return;
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			grp_alloc_flg(value);
			return;
		}
		if ($ship_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ship_str_ln_tgt_flg(value);
			return;
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			dlv_str_ln_tgt_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			last_wms_flg(value);
			return;
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			wms_tgt_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($loan_flg.equalsIgnoreCase(name)) {
			loan_flg(value);
			return;
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			no_alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($alloc_ver_no_p.equalsIgnoreCase(name)) {
			return alloc_ver_no_p();
		}
		if ($ent_unit_qty_p.equalsIgnoreCase(name)) {
			return ent_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($pckg_unit_qty_p.equalsIgnoreCase(name)) {
			return pckg_unit_qty_p();
		}
		if ($schd_unit_qty_p.equalsIgnoreCase(name)) {
			return schd_unit_qty_p();
		}
		if ($ship_act_qty_p.equalsIgnoreCase(name)) {
			return ship_act_qty_p();
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($ship_str_ln_p.equalsIgnoreCase(name)) {
			return ship_str_ln_p();
		}
		if ($dlv_str_ln_p.equalsIgnoreCase(name)) {
			return dlv_str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($alloc_sno_wrk_no_p.equalsIgnoreCase(name)) {
			return alloc_sno_wrk_no_p();
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			return stk_bp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
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
		if ($alloc_ver_no_p.equalsIgnoreCase(name)) {
			alloc_ver_no_p(
				((MCContainerMeta) alloc_ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($ent_unit_qty_p.equalsIgnoreCase(name)) {
			ent_unit_qty_p(
				((MCContainerMeta) ent_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pckg_unit_qty_p.equalsIgnoreCase(name)) {
			pckg_unit_qty_p(
				((MCContainerMeta) pckg_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_unit_qty_p.equalsIgnoreCase(name)) {
			schd_unit_qty_p(
				((MCContainerMeta) schd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ship_act_qty_p.equalsIgnoreCase(name)) {
			ship_act_qty_p(
				((MCContainerMeta) ship_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			act_cont_qty_p(
				((MCContainerMeta) act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($ship_str_ln_p.equalsIgnoreCase(name)) {
			ship_str_ln_p(
				((MCContainerMeta) ship_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($dlv_str_ln_p.equalsIgnoreCase(name)) {
			dlv_str_ln_p(
				((MCContainerMeta) dlv_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($alloc_sno_wrk_no_p.equalsIgnoreCase(name)) {
			alloc_sno_wrk_no_p(
				((MCContainerMeta) alloc_sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			stk_bp_p(
				((MCContainerMeta) stk_bp_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5050.StkBpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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

	public String alloc_ver_no() {
		return alloc_ver_no_p().ver_no();
	}

	public void alloc_ver_no(String value) {
		alloc_ver_no_p().ver_no(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public MCNumber ent_unit_qty() {
		return ent_unit_qty_p().qty();
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(MCNumber value) {
		ent_unit_qty_p().qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(int value) {
		ent_unit_qty_p().qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(long value) {
		ent_unit_qty_p().qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(float value) {
		ent_unit_qty_p().qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(double value) {
		ent_unit_qty_p().qty(value);
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
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public MCNumber pckg_unit_qty() {
		return pckg_unit_qty_p().qty();
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(MCNumber value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(int value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(long value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(float value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(double value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public MCNumber schd_unit_qty() {
		return schd_unit_qty_p().qty();
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public void schd_unit_qty(MCNumber value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public void schd_unit_qty(int value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public void schd_unit_qty(long value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public void schd_unit_qty(float value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit qty. 予定単位数量.<p>
	 *
	 */
	public void schd_unit_qty(double value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return ship_act_qty_p().qty();
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		ship_act_qty_p().qty(value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(int value) {
		ship_act_qty_p().qty(value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(long value) {
		ship_act_qty_p().qty(value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(float value) {
		ship_act_qty_p().qty(value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(double value) {
		ship_act_qty_p().qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		act_cont_qty_p().cont_qty(value);
	}

	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
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

	public String ship_str_ln_cd() {
		return ship_str_ln_p().str_ln_cd();
	}

	public void ship_str_ln_cd(String value) {
		ship_str_ln_p().str_ln_cd(value);
	}

	public String ship_str_ln_nm() {
		return ship_str_ln_p().str_ln_nm();
	}

	public void ship_str_ln_nm(String value) {
		ship_str_ln_p().str_ln_nm(value);
	}

	public boolean ship_str_ln_cd_none_flg() {
		return ship_str_ln_p().str_ln_cd_none_flg();
	}

	public void ship_str_ln_cd_none_flg(boolean value) {
		ship_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return dlv_str_ln_p().str_ln_cd();
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		dlv_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public String dlv_str_ln_nm() {
		return dlv_str_ln_p().str_ln_nm();
	}

	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public void dlv_str_ln_nm(String value) {
		dlv_str_ln_p().str_ln_nm(value);
	}

	public boolean dlv_str_ln_cd_none_flg() {
		return dlv_str_ln_p().str_ln_cd_none_flg();
	}

	public void dlv_str_ln_cd_none_flg(boolean value) {
		dlv_str_ln_p().str_ln_cd_none_flg(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public boolean sno1_null_flg() {
		return sno_wrk_no_p().sno1_null_flg();
	}

	public void sno1_null_flg(boolean value) {
		sno_wrk_no_p().sno1_null_flg(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public boolean sno2_null_flg() {
		return sno_wrk_no_p().sno2_null_flg();
	}

	public void sno2_null_flg(boolean value) {
		sno_wrk_no_p().sno2_null_flg(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public boolean sno3_null_flg() {
		return sno_wrk_no_p().sno3_null_flg();
	}

	public void sno3_null_flg(boolean value) {
		sno_wrk_no_p().sno3_null_flg(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public boolean sno4_null_flg() {
		return sno_wrk_no_p().sno4_null_flg();
	}

	public void sno4_null_flg(boolean value) {
		sno_wrk_no_p().sno4_null_flg(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return alloc_sno_wrk_no_p().sno1();
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		alloc_sno_wrk_no_p().sno1(value);
	}

	public boolean alloc_sno1_null_flg() {
		return alloc_sno_wrk_no_p().sno1_null_flg();
	}

	public void alloc_sno1_null_flg(boolean value) {
		alloc_sno_wrk_no_p().sno1_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return alloc_sno_wrk_no_p().sno2();
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		alloc_sno_wrk_no_p().sno2(value);
	}

	public boolean alloc_sno2_null_flg() {
		return alloc_sno_wrk_no_p().sno2_null_flg();
	}

	public void alloc_sno2_null_flg(boolean value) {
		alloc_sno_wrk_no_p().sno2_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return alloc_sno_wrk_no_p().sno3();
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		alloc_sno_wrk_no_p().sno3(value);
	}

	public boolean alloc_sno3_null_flg() {
		return alloc_sno_wrk_no_p().sno3_null_flg();
	}

	public void alloc_sno3_null_flg(boolean value) {
		alloc_sno_wrk_no_p().sno3_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return alloc_sno_wrk_no_p().sno4();
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		alloc_sno_wrk_no_p().sno4(value);
	}

	public boolean alloc_sno4_null_flg() {
		return alloc_sno_wrk_no_p().sno4_null_flg();
	}

	public void alloc_sno4_null_flg(boolean value) {
		alloc_sno_wrk_no_p().sno4_null_flg(value);
	}

	public String alloc_wrk_no() {
		return alloc_sno_wrk_no_p().wrk_no();
	}

	public void alloc_wrk_no(String value) {
		alloc_sno_wrk_no_p().wrk_no(value);
	}

	public String alloc_wrk_nm() {
		return alloc_sno_wrk_no_p().wrk_nm();
	}

	public void alloc_wrk_nm(String value) {
		alloc_sno_wrk_no_p().wrk_nm(value);
	}

	public String stk_bp_cd() {
		return stk_bp_p().stk_bp_cd();
	}

	public void stk_bp_cd(String value) {
		stk_bp_p().stk_bp_cd(value);
	}

	public String stk_bp_nm() {
		return stk_bp_p().stk_bp_nm();
	}

	public void stk_bp_nm(String value) {
		stk_bp_p().stk_bp_nm(value);
	}

}

