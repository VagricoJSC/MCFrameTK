package mcframe.serverMSBE.MSBEL0110;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public static final String $prnt_all_qty = "prnt_all_qty";
	/**
	 * Print fraction 端数印刷.<p>
	 *
	 */
	public static final String $rmndr_prnt_flg = "rmndr_prnt_flg";
	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public static final String $pckg_unit_nm = "pckg_unit_nm";
	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * Packaged item unit cd. 梱包入数単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd_per_pckg_unit = "unit_cd_per_pckg_unit";
	/**
	 * Packaged item unit name 梱包入数単位名.<p>
	 *
	 */
	public static final String $unit_nm_per_pckg_unit = "unit_nm_per_pckg_unit";
	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public static final String $qty_per_pckg_unit = "qty_per_pckg_unit";
	/**
	 * Fraction unit cd. 端数単位ＣＤ.<p>
	 *
	 */
	public static final String $rmndr_unit_cd = "rmndr_unit_cd";
	/**
	 * Rounding unit name 端数単位名.<p>
	 *
	 */
	public static final String $rmndr_unit_nm = "rmndr_unit_nm";
	/**
	 * Fraction 端数.<p>
	 *
	 */
	public static final String $rmndr_unit_qty = "rmndr_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
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
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Delivery order cd. 納入指示単位ＣＤ.<p>
	 *
	 */
	public static final String $dlv_inst_unit_cd = "dlv_inst_unit_cd";
	/**
	 * Delivery order unit name 納入指示単位名.<p>
	 *
	 */
	public static final String $dlv_inst_unit_nm = "dlv_inst_unit_nm";
	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dlv_inst_unit_dec_place = "dlv_inst_unit_dec_place";
	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
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
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification name 在庫識別名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public static final String $fix_no_typ_nm = "fix_no_typ_nm";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
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
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public static final String $cst_alt_nm1 = "cst_alt_nm1";
	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public static final String $cst_alt_nm2 = "cst_alt_nm2";
	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public static final String $cst_alt_nm3 = "cst_alt_nm3";
	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public static final String $cst_alt_nm4 = "cst_alt_nm4";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public static final String $dlv_alt_nm1 = "dlv_alt_nm1";
	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public static final String $dlv_alt_nm2 = "dlv_alt_nm2";
	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public static final String $dlv_alt_nm3 = "dlv_alt_nm3";
	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public static final String $dlv_alt_nm4 = "dlv_alt_nm4";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
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
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_d_no = "ship_act_d_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public static final String $byprod_flg = "byprod_flg";
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 * Company name 会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_no = "cst_dlv_inst_no";
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_d_no = "cst_dlv_inst_d_no";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Remarks 1 (Shipping result details) 備考１(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char1 = "ship_act_d_sub_char1";
	/**
	 * Remarks 2 (Shipping result details) 備考２(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char2 = "ship_act_d_sub_char2";
	/**
	 * Remarks 3 (Shipping result details) 備考３(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char3 = "ship_act_d_sub_char3";
	/**
	 * Remarks 1 (Shipping allocation status) 備考１(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char1 = "ship_alloc_sts_sub_char1";
	/**
	 * Remarks 2 (Shipping allocation status) 備考２(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char2 = "ship_alloc_sts_sub_char2";
	/**
	 * Remarks 3 (Shipping allocation status) 備考３(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char3 = "ship_alloc_sts_sub_char3";
	/**
	 * Remarks 1 (Receipt result) 備考１(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char1 = "arr_act_sub_char1";
	/**
	 * Remarks 2 (Receipt result) 備考２(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char2 = "arr_act_sub_char2";
	/**
	 * Remarks 3 (Receipt result) 備考３(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char3 = "arr_act_sub_char3";
	/**
	 * Remarks 1 (Output schedule) 備考１(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char1 = "yield_schd_sub_char1";
	/**
	 * Remarks 2 (Output schedule) 備考２(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char2 = "yield_schd_sub_char2";
	/**
	 * Remarks 3 (Output schedule) 備考３(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char3 = "yield_schd_sub_char3";
	/**
	 * Remarks 1 (Output result) 備考１(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 * Remarks 2 (Output result) 備考２(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 * Remarks 3 (Output result) 備考３(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";
	/**
	 * Remarks 1 (Current inventory) 備考１(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char1 = "stk_sub_char1";
	/**
	 * Remarks 2 (Current inventory) 備考２(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char2 = "stk_sub_char2";
	/**
	 * Remarks 3 (Current inventory) 備考３(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char3 = "stk_sub_char3";
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Delivery destination identification alias name 1 納品先識別別名1.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm1 = "dlv_id_alt_nm1";
	/**
	 * Delivery destination identification alias name 2 納品先識別別名2.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm2 = "dlv_id_alt_nm2";
	/**
	 * Delivery destination identification alias name 3 納品先識別別名3.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm3 = "dlv_id_alt_nm3";
	/**
	 * Delivery destination identification alias name 4 納品先識別別名4.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm4 = "dlv_id_alt_nm4";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
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
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public static final String $arr_dpt_cd = "arr_dpt_cd";
	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public static final String $arr_dpt_nm = "arr_dpt_nm";
	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public static final String $arr_usr_cd = "arr_usr_cd";
	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public static final String $arr_usr_nm = "arr_usr_nm";
	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public static final String $acpt_dpt_cd = "acpt_dpt_cd";
	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public static final String $acpt_dpt_nm = "acpt_dpt_nm";
	/**
	 * Receipt PIC cd. 受入担当者ＣＤ.<p>
	 *
	 */
	public static final String $acpt_usr_cd = "acpt_usr_cd";
	/**
	 * Receipt PIC name 受入担当者名.<p>
	 *
	 */
	public static final String $acpt_usr_nm = "acpt_usr_nm";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $slip_form_id = "slip_form_id";
	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public static final String $client_typ = "client_typ";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $row_no = "row_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta prnt_all_qty_META = createCommonMeta($prnt_all_qty, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rmndr_prnt_flg_META = createCommonMeta($rmndr_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_per_pckg_unit_META = createCommonMeta($unit_cd_per_pckg_unit, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_per_pckg_unit_META = createCommonMeta($unit_nm_per_pckg_unit, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qty_per_pckg_unit_META = createCommonMeta($qty_per_pckg_unit, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rmndr_unit_cd_META = createCommonMeta($rmndr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta rmndr_unit_nm_META = createCommonMeta($rmndr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta rmndr_unit_qty_META = createCommonMeta($rmndr_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_unit_cd_META = createCommonMeta($dlv_inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dlv_inst_unit_nm_META = createCommonMeta($dlv_inst_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dlv_inst_unit_dec_place_META = createCommonMeta($dlv_inst_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_alt_nm1_META = createCommonMeta($cst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta cst_alt_nm2_META = createCommonMeta($cst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta cst_alt_nm3_META = createCommonMeta($cst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta cst_alt_nm4_META = createCommonMeta($cst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_alt_nm1_META = createCommonMeta($dlv_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_alt_nm2_META = createCommonMeta($dlv_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_alt_nm3_META = createCommonMeta($dlv_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_alt_nm4_META = createCommonMeta($dlv_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta byprod_flg_META = createCommonMeta($byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta cst_dlv_inst_no_META = createCommonMeta($cst_dlv_inst_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_NO);
	public static final MCMeta cst_dlv_inst_d_no_META = createCommonMeta($cst_dlv_inst_d_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_D_NO);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta ship_act_d_sub_char1_META = createCommonMeta($ship_act_d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR1);
	public static final MCMeta ship_act_d_sub_char2_META = createCommonMeta($ship_act_d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR2);
	public static final MCMeta ship_act_d_sub_char3_META = createCommonMeta($ship_act_d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR3);
	public static final MCMeta ship_alloc_sts_sub_char1_META = createCommonMeta($ship_alloc_sts_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR1);
	public static final MCMeta ship_alloc_sts_sub_char2_META = createCommonMeta($ship_alloc_sts_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR2);
	public static final MCMeta ship_alloc_sts_sub_char3_META = createCommonMeta($ship_alloc_sts_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR3);
	public static final MCMeta arr_act_sub_char1_META = createCommonMeta($arr_act_sub_char1, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR1);
	public static final MCMeta arr_act_sub_char2_META = createCommonMeta($arr_act_sub_char2, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR2);
	public static final MCMeta arr_act_sub_char3_META = createCommonMeta($arr_act_sub_char3, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR3);
	public static final MCMeta yield_schd_sub_char1_META = createCommonMeta($yield_schd_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR1);
	public static final MCMeta yield_schd_sub_char2_META = createCommonMeta($yield_schd_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR2);
	public static final MCMeta yield_schd_sub_char3_META = createCommonMeta($yield_schd_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR3);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);
	public static final MCMeta stk_sub_char1_META = createCommonMeta($stk_sub_char1, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR1);
	public static final MCMeta stk_sub_char2_META = createCommonMeta($stk_sub_char2, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR2);
	public static final MCMeta stk_sub_char3_META = createCommonMeta($stk_sub_char3, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR3);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_id_alt_nm1_META = createCommonMeta($dlv_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_id_alt_nm2_META = createCommonMeta($dlv_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_id_alt_nm3_META = createCommonMeta($dlv_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_id_alt_nm4_META = createCommonMeta($dlv_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta arr_dpt_cd_META = createCommonMeta($arr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta arr_dpt_nm_META = createCommonMeta($arr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta arr_usr_cd_META = createCommonMeta($arr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_usr_nm_META = createCommonMeta($arr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta acpt_dpt_cd_META = createCommonMeta($acpt_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acpt_dpt_nm_META = createCommonMeta($acpt_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta acpt_usr_cd_META = createCommonMeta($acpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta acpt_usr_nm_META = createCommonMeta($acpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta slip_form_id_META = createCommonMeta($slip_form_id, mcframe.commonMA.meta.MA_META.SLIP_FORM_ID);
	public static final MCMeta client_typ_META = createCommonMeta($client_typ, mcframe.commonMA.meta.MA_META.CLIENT_TYP);
	public static final MCMeta row_no_META = createCommonMeta($row_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			prnt_all_qty_META,
			rmndr_prnt_flg_META,
			stk_lst_prnt_flg_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			conv_qty_META,
			unit_cd_per_pckg_unit_META,
			unit_nm_per_pckg_unit_META,
			qty_per_pckg_unit_META,
			rmndr_unit_cd_META,
			rmndr_unit_nm_META,
			rmndr_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			pack_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_rnd_typ_META,
			base_unit_dec_place_META,
			base_unit_qty_META,
			dlv_inst_unit_cd_META,
			dlv_inst_unit_nm_META,
			dlv_inst_unit_dec_place_META,
			dlv_inst_qty_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			sno1_null_flg_META,
			sno1_META,
			sno2_null_flg_META,
			sno2_META,
			sno3_null_flg_META,
			sno3_META,
			sno4_null_flg_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			bp_lot_no_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			cst_cd_META,
			cst_nm_META,
			cst_alt_nm1_META,
			cst_alt_nm2_META,
			cst_alt_nm3_META,
			cst_alt_nm4_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_alt_nm1_META,
			dlv_alt_nm2_META,
			dlv_alt_nm3_META,
			dlv_alt_nm4_META,
			cst_po_no_META,
			cst_po_d_no_META,
			arr_act_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			ship_alloc_sts_no_META,
			ship_act_no_META,
			ship_act_d_no_META,
			mfg_inst_no_META,
			yield_schd_no_META,
			mfg_act_no_META,
			yield_act_no_META,
			byprod_flg_META,
			prnt_lcl_cd_META,
			stk_lst_form_cd_META,
			co_cd_META,
			co_nm_META,
			cst_dlv_inst_no_META,
			cst_dlv_inst_d_no_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			trd_d_rmrks_META,
			ship_act_d_sub_char1_META,
			ship_act_d_sub_char2_META,
			ship_act_d_sub_char3_META,
			ship_alloc_sts_sub_char1_META,
			ship_alloc_sts_sub_char2_META,
			ship_alloc_sts_sub_char3_META,
			arr_act_sub_char1_META,
			arr_act_sub_char2_META,
			arr_act_sub_char3_META,
			yield_schd_sub_char1_META,
			yield_schd_sub_char2_META,
			yield_schd_sub_char3_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META,
			stk_sub_char1_META,
			stk_sub_char2_META,
			stk_sub_char3_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_id_alt_nm1_META,
			dlv_id_alt_nm2_META,
			dlv_id_alt_nm3_META,
			dlv_id_alt_nm4_META,
			po_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			arr_dpt_cd_META,
			arr_dpt_nm_META,
			arr_usr_cd_META,
			arr_usr_nm_META,
			acpt_dpt_cd_META,
			acpt_dpt_nm_META,
			acpt_usr_cd_META,
			acpt_usr_nm_META,
			lot_rmrks_META,
			slip_form_id_META,
			client_typ_META,
			row_no_META,
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 5, $itm_alt_nm1);
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 5, $itm_alt_nm1, value);
	}


	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 6, $itm_alt_nm2);
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 6, $itm_alt_nm2, value);
	}


	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 7, $itm_alt_nm3);
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 7, $itm_alt_nm3, value);
	}


	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 8, $itm_alt_nm4);
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 8, $itm_alt_nm4, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 9, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 9, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 10, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 10, $cst_itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 13, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 13, $ver_no, value);
	}


	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public MCNumber prnt_all_qty() {
		return getConstNumber(offset + 14, $prnt_all_qty);
	}

	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public void prnt_all_qty(MCNumber value) {
		setConstNumber(offset + 14, $prnt_all_qty, value);
	}

	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public void prnt_all_qty(int value) {
		setConstNumber(offset + 14, $prnt_all_qty, value);
	}

	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public void prnt_all_qty(long value) {
		setConstNumber(offset + 14, $prnt_all_qty, value);
	}

	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public void prnt_all_qty(float value) {
		setConstNumber(offset + 14, $prnt_all_qty, value);
	}

	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public void prnt_all_qty(double value) {
		setConstNumber(offset + 14, $prnt_all_qty, value);
	}


	/**
	 * Print fraction 端数印刷.<p>
	 *
	 */
	public boolean rmndr_prnt_flg() {
		return getConstBoolean(offset + 15, $rmndr_prnt_flg);
	}

	/**
	 * Print fraction 端数印刷.<p>
	 *
	 */
	public void rmndr_prnt_flg(boolean value) {
		setConstBoolean(offset + 15, $rmndr_prnt_flg, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 16, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 16, $stk_lst_prnt_flg, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 17, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 17, $pckg_unit_cd, value);
	}


	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 18, $pckg_unit_nm);
	}

	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 18, $pckg_unit_nm, value);
	}


	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 19, $conv_qty);
	}

	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 19, $conv_qty, value);
	}

	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 19, $conv_qty, value);
	}

	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 19, $conv_qty, value);
	}

	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 19, $conv_qty, value);
	}

	/**
	 * Converted qty. 換算数.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 19, $conv_qty, value);
	}


	/**
	 * Packaged item unit cd. 梱包入数単位ＣＤ.<p>
	 *
	 */
	public String unit_cd_per_pckg_unit() {
		return getConstString(offset + 20, $unit_cd_per_pckg_unit);
	}

	/**
	 * Packaged item unit cd. 梱包入数単位ＣＤ.<p>
	 *
	 */
	public void unit_cd_per_pckg_unit(String value) {
		setConstString(offset + 20, $unit_cd_per_pckg_unit, value);
	}


	/**
	 * Packaged item unit name 梱包入数単位名.<p>
	 *
	 */
	public String unit_nm_per_pckg_unit() {
		return getConstString(offset + 21, $unit_nm_per_pckg_unit);
	}

	/**
	 * Packaged item unit name 梱包入数単位名.<p>
	 *
	 */
	public void unit_nm_per_pckg_unit(String value) {
		setConstString(offset + 21, $unit_nm_per_pckg_unit, value);
	}


	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public MCNumber qty_per_pckg_unit() {
		return getConstNumber(offset + 22, $qty_per_pckg_unit);
	}

	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public void qty_per_pckg_unit(MCNumber value) {
		setConstNumber(offset + 22, $qty_per_pckg_unit, value);
	}

	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public void qty_per_pckg_unit(int value) {
		setConstNumber(offset + 22, $qty_per_pckg_unit, value);
	}

	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public void qty_per_pckg_unit(long value) {
		setConstNumber(offset + 22, $qty_per_pckg_unit, value);
	}

	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public void qty_per_pckg_unit(float value) {
		setConstNumber(offset + 22, $qty_per_pckg_unit, value);
	}

	/**
	 * Packaged item count 梱包入数.<p>
	 *
	 */
	public void qty_per_pckg_unit(double value) {
		setConstNumber(offset + 22, $qty_per_pckg_unit, value);
	}


	/**
	 * Fraction unit cd. 端数単位ＣＤ.<p>
	 *
	 */
	public String rmndr_unit_cd() {
		return getConstString(offset + 23, $rmndr_unit_cd);
	}

	/**
	 * Fraction unit cd. 端数単位ＣＤ.<p>
	 *
	 */
	public void rmndr_unit_cd(String value) {
		setConstString(offset + 23, $rmndr_unit_cd, value);
	}


	/**
	 * Rounding unit name 端数単位名.<p>
	 *
	 */
	public String rmndr_unit_nm() {
		return getConstString(offset + 24, $rmndr_unit_nm);
	}

	/**
	 * Rounding unit name 端数単位名.<p>
	 *
	 */
	public void rmndr_unit_nm(String value) {
		setConstString(offset + 24, $rmndr_unit_nm, value);
	}


	/**
	 * Fraction 端数.<p>
	 *
	 */
	public MCNumber rmndr_unit_qty() {
		return getConstNumber(offset + 25, $rmndr_unit_qty);
	}

	/**
	 * Fraction 端数.<p>
	 *
	 */
	public void rmndr_unit_qty(MCNumber value) {
		setConstNumber(offset + 25, $rmndr_unit_qty, value);
	}

	/**
	 * Fraction 端数.<p>
	 *
	 */
	public void rmndr_unit_qty(int value) {
		setConstNumber(offset + 25, $rmndr_unit_qty, value);
	}

	/**
	 * Fraction 端数.<p>
	 *
	 */
	public void rmndr_unit_qty(long value) {
		setConstNumber(offset + 25, $rmndr_unit_qty, value);
	}

	/**
	 * Fraction 端数.<p>
	 *
	 */
	public void rmndr_unit_qty(float value) {
		setConstNumber(offset + 25, $rmndr_unit_qty, value);
	}

	/**
	 * Fraction 端数.<p>
	 *
	 */
	public void rmndr_unit_qty(double value) {
		setConstNumber(offset + 25, $rmndr_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 26, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 26, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 27, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 27, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 28, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 28, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 28, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 28, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 28, $pack_unit_dec_place, value);
	}


	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 29, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 29, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 29, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 29, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 29, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿数.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 29, $pack_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 30, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 30, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 31, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 31, $base_unit_nm, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 32, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 32, $base_unit_rnd_typ, value);
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
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 34, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 34, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 34, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 34, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 34, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 34, $base_unit_qty, value);
	}


	/**
	 * Delivery order cd. 納入指示単位ＣＤ.<p>
	 *
	 */
	public String dlv_inst_unit_cd() {
		return getConstString(offset + 35, $dlv_inst_unit_cd);
	}

	/**
	 * Delivery order cd. 納入指示単位ＣＤ.<p>
	 *
	 */
	public void dlv_inst_unit_cd(String value) {
		setConstString(offset + 35, $dlv_inst_unit_cd, value);
	}


	/**
	 * Delivery order unit name 納入指示単位名.<p>
	 *
	 */
	public String dlv_inst_unit_nm() {
		return getConstString(offset + 36, $dlv_inst_unit_nm);
	}

	/**
	 * Delivery order unit name 納入指示単位名.<p>
	 *
	 */
	public void dlv_inst_unit_nm(String value) {
		setConstString(offset + 36, $dlv_inst_unit_nm, value);
	}


	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dlv_inst_unit_dec_place() {
		return getConstNumber(offset + 37, $dlv_inst_unit_dec_place);
	}

	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public void dlv_inst_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 37, $dlv_inst_unit_dec_place, value);
	}

	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public void dlv_inst_unit_dec_place(int value) {
		setConstNumber(offset + 37, $dlv_inst_unit_dec_place, value);
	}

	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public void dlv_inst_unit_dec_place(long value) {
		setConstNumber(offset + 37, $dlv_inst_unit_dec_place, value);
	}

	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public void dlv_inst_unit_dec_place(float value) {
		setConstNumber(offset + 37, $dlv_inst_unit_dec_place, value);
	}

	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public void dlv_inst_unit_dec_place(double value) {
		setConstNumber(offset + 37, $dlv_inst_unit_dec_place, value);
	}


	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 38, $dlv_inst_qty);
	}

	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 38, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 38, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 38, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 38, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order unit qty. 納入指示単位数.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 38, $dlv_inst_qty, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 39, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 39, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 40, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 40, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 41, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 41, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 42, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 42, $str_ln_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 43, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 43, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 44, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 44, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 45, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 45, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 46, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 46, $wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 47, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 47, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 48, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 48, $loc_grp_nm, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 49, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 49, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 50, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 50, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 51, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 51, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 52, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 52, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 53, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 53, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 54, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 54, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 55, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 55, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 56, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 56, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 57, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 57, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 58, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 58, $wrk_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 59, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 59, $bp_lot_no, value);
	}


	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 60, $unreg_lmt_flg);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 60, $unreg_lmt_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 61, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 61, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 62, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 62, $lmt_dt, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 63, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 63, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 64, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 64, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 65, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 65, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 66, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 66, $gd_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 67, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 67, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 68, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 68, $in_xfr_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 69, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 69, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 70, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 70, $stk_insp_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 71, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 71, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 72, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 72, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 73, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 73, $stk_id_typ, value);
	}


	/**
	 * Inventory identification name 在庫識別名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 74, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification name 在庫識別名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 74, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 75, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 75, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 76, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 76, $stk_bp_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 77, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 77, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 78, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 78, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 79, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 79, $fix_no, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 80, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 80, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 81, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 81, $stk_arrv_bp_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 82, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 82, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 83, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 83, $cst_nm, value);
	}


	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public String cst_alt_nm1() {
		return getConstString(offset + 84, $cst_alt_nm1);
	}

	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public void cst_alt_nm1(String value) {
		setConstString(offset + 84, $cst_alt_nm1, value);
	}


	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public String cst_alt_nm2() {
		return getConstString(offset + 85, $cst_alt_nm2);
	}

	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public void cst_alt_nm2(String value) {
		setConstString(offset + 85, $cst_alt_nm2, value);
	}


	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public String cst_alt_nm3() {
		return getConstString(offset + 86, $cst_alt_nm3);
	}

	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public void cst_alt_nm3(String value) {
		setConstString(offset + 86, $cst_alt_nm3, value);
	}


	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public String cst_alt_nm4() {
		return getConstString(offset + 87, $cst_alt_nm4);
	}

	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public void cst_alt_nm4(String value) {
		setConstString(offset + 87, $cst_alt_nm4, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 88, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 88, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 89, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 89, $dlv_nm, value);
	}


	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public String dlv_alt_nm1() {
		return getConstString(offset + 90, $dlv_alt_nm1);
	}

	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public void dlv_alt_nm1(String value) {
		setConstString(offset + 90, $dlv_alt_nm1, value);
	}


	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public String dlv_alt_nm2() {
		return getConstString(offset + 91, $dlv_alt_nm2);
	}

	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public void dlv_alt_nm2(String value) {
		setConstString(offset + 91, $dlv_alt_nm2, value);
	}


	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public String dlv_alt_nm3() {
		return getConstString(offset + 92, $dlv_alt_nm3);
	}

	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public void dlv_alt_nm3(String value) {
		setConstString(offset + 92, $dlv_alt_nm3, value);
	}


	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public String dlv_alt_nm4() {
		return getConstString(offset + 93, $dlv_alt_nm4);
	}

	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public void dlv_alt_nm4(String value) {
		setConstString(offset + 93, $dlv_alt_nm4, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 94, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 94, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 95, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 95, $cst_po_d_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 96, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 96, $arr_act_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 97, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 97, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 98, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 98, $ship_inst_d_no, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 99, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 99, $ship_alloc_sts_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 100, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 100, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 101, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 101, $ship_act_d_no, value);
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
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 103, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 103, $yield_schd_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 104, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 104, $mfg_act_no, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 105, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 105, $yield_act_no, value);
	}


	/**
	 * By-product 副産品.<p>
	 *
	 */
	public boolean byprod_flg() {
		return getConstBoolean(offset + 106, $byprod_flg);
	}

	/**
	 * By-product 副産品.<p>
	 *
	 */
	public void byprod_flg(boolean value) {
		setConstBoolean(offset + 106, $byprod_flg, value);
	}


	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 107, $prnt_lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 107, $prnt_lcl_cd, value);
	}


	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 108, $stk_lst_form_cd);
	}

	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 108, $stk_lst_form_cd, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 109, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 109, $co_cd, value);
	}


	/**
	 * Company name 会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 110, $co_nm);
	}

	/**
	 * Company name 会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 110, $co_nm, value);
	}


	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return getConstString(offset + 111, $cst_dlv_inst_no);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		setConstString(offset + 111, $cst_dlv_inst_no, value);
	}


	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return getConstString(offset + 112, $cst_dlv_inst_d_no);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		setConstString(offset + 112, $cst_dlv_inst_d_no, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 113, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 113, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 114, $dlv_rqst_tm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 114, $dlv_rqst_tm, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 115, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 115, $trd_d_rmrks, value);
	}


	/**
	 * Remarks 1 (Shipping result details) 備考１(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char1() {
		return getConstString(offset + 116, $ship_act_d_sub_char1);
	}

	/**
	 * Remarks 1 (Shipping result details) 備考１(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char1(String value) {
		setConstString(offset + 116, $ship_act_d_sub_char1, value);
	}


	/**
	 * Remarks 2 (Shipping result details) 備考２(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char2() {
		return getConstString(offset + 117, $ship_act_d_sub_char2);
	}

	/**
	 * Remarks 2 (Shipping result details) 備考２(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char2(String value) {
		setConstString(offset + 117, $ship_act_d_sub_char2, value);
	}


	/**
	 * Remarks 3 (Shipping result details) 備考３(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char3() {
		return getConstString(offset + 118, $ship_act_d_sub_char3);
	}

	/**
	 * Remarks 3 (Shipping result details) 備考３(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char3(String value) {
		setConstString(offset + 118, $ship_act_d_sub_char3, value);
	}


	/**
	 * Remarks 1 (Shipping allocation status) 備考１(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char1() {
		return getConstString(offset + 119, $ship_alloc_sts_sub_char1);
	}

	/**
	 * Remarks 1 (Shipping allocation status) 備考１(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char1(String value) {
		setConstString(offset + 119, $ship_alloc_sts_sub_char1, value);
	}


	/**
	 * Remarks 2 (Shipping allocation status) 備考２(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char2() {
		return getConstString(offset + 120, $ship_alloc_sts_sub_char2);
	}

	/**
	 * Remarks 2 (Shipping allocation status) 備考２(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char2(String value) {
		setConstString(offset + 120, $ship_alloc_sts_sub_char2, value);
	}


	/**
	 * Remarks 3 (Shipping allocation status) 備考３(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char3() {
		return getConstString(offset + 121, $ship_alloc_sts_sub_char3);
	}

	/**
	 * Remarks 3 (Shipping allocation status) 備考３(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char3(String value) {
		setConstString(offset + 121, $ship_alloc_sts_sub_char3, value);
	}


	/**
	 * Remarks 1 (Receipt result) 備考１(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char1() {
		return getConstString(offset + 122, $arr_act_sub_char1);
	}

	/**
	 * Remarks 1 (Receipt result) 備考１(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char1(String value) {
		setConstString(offset + 122, $arr_act_sub_char1, value);
	}


	/**
	 * Remarks 2 (Receipt result) 備考２(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char2() {
		return getConstString(offset + 123, $arr_act_sub_char2);
	}

	/**
	 * Remarks 2 (Receipt result) 備考２(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char2(String value) {
		setConstString(offset + 123, $arr_act_sub_char2, value);
	}


	/**
	 * Remarks 3 (Receipt result) 備考３(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char3() {
		return getConstString(offset + 124, $arr_act_sub_char3);
	}

	/**
	 * Remarks 3 (Receipt result) 備考３(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char3(String value) {
		setConstString(offset + 124, $arr_act_sub_char3, value);
	}


	/**
	 * Remarks 1 (Output schedule) 備考１(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char1() {
		return getConstString(offset + 125, $yield_schd_sub_char1);
	}

	/**
	 * Remarks 1 (Output schedule) 備考１(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char1(String value) {
		setConstString(offset + 125, $yield_schd_sub_char1, value);
	}


	/**
	 * Remarks 2 (Output schedule) 備考２(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char2() {
		return getConstString(offset + 126, $yield_schd_sub_char2);
	}

	/**
	 * Remarks 2 (Output schedule) 備考２(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char2(String value) {
		setConstString(offset + 126, $yield_schd_sub_char2, value);
	}


	/**
	 * Remarks 3 (Output schedule) 備考３(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char3() {
		return getConstString(offset + 127, $yield_schd_sub_char3);
	}

	/**
	 * Remarks 3 (Output schedule) 備考３(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char3(String value) {
		setConstString(offset + 127, $yield_schd_sub_char3, value);
	}


	/**
	 * Remarks 1 (Output result) 備考１(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 128, $yield_act_sub_char1);
	}

	/**
	 * Remarks 1 (Output result) 備考１(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 128, $yield_act_sub_char1, value);
	}


	/**
	 * Remarks 2 (Output result) 備考２(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 129, $yield_act_sub_char2);
	}

	/**
	 * Remarks 2 (Output result) 備考２(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 129, $yield_act_sub_char2, value);
	}


	/**
	 * Remarks 3 (Output result) 備考３(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 130, $yield_act_sub_char3);
	}

	/**
	 * Remarks 3 (Output result) 備考３(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 130, $yield_act_sub_char3, value);
	}


	/**
	 * Remarks 1 (Current inventory) 備考１(現状在庫).<p>
	 *
	 */
	public String stk_sub_char1() {
		return getConstString(offset + 131, $stk_sub_char1);
	}

	/**
	 * Remarks 1 (Current inventory) 備考１(現状在庫).<p>
	 *
	 */
	public void stk_sub_char1(String value) {
		setConstString(offset + 131, $stk_sub_char1, value);
	}


	/**
	 * Remarks 2 (Current inventory) 備考２(現状在庫).<p>
	 *
	 */
	public String stk_sub_char2() {
		return getConstString(offset + 132, $stk_sub_char2);
	}

	/**
	 * Remarks 2 (Current inventory) 備考２(現状在庫).<p>
	 *
	 */
	public void stk_sub_char2(String value) {
		setConstString(offset + 132, $stk_sub_char2, value);
	}


	/**
	 * Remarks 3 (Current inventory) 備考３(現状在庫).<p>
	 *
	 */
	public String stk_sub_char3() {
		return getConstString(offset + 133, $stk_sub_char3);
	}

	/**
	 * Remarks 3 (Current inventory) 備考３(現状在庫).<p>
	 *
	 */
	public void stk_sub_char3(String value) {
		setConstString(offset + 133, $stk_sub_char3, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 134, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 134, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 135, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 135, $dlv_id_nm, value);
	}


	/**
	 * Delivery destination identification alias name 1 納品先識別別名1.<p>
	 *
	 */
	public String dlv_id_alt_nm1() {
		return getConstString(offset + 136, $dlv_id_alt_nm1);
	}

	/**
	 * Delivery destination identification alias name 1 納品先識別別名1.<p>
	 *
	 */
	public void dlv_id_alt_nm1(String value) {
		setConstString(offset + 136, $dlv_id_alt_nm1, value);
	}


	/**
	 * Delivery destination identification alias name 2 納品先識別別名2.<p>
	 *
	 */
	public String dlv_id_alt_nm2() {
		return getConstString(offset + 137, $dlv_id_alt_nm2);
	}

	/**
	 * Delivery destination identification alias name 2 納品先識別別名2.<p>
	 *
	 */
	public void dlv_id_alt_nm2(String value) {
		setConstString(offset + 137, $dlv_id_alt_nm2, value);
	}


	/**
	 * Delivery destination identification alias name 3 納品先識別別名3.<p>
	 *
	 */
	public String dlv_id_alt_nm3() {
		return getConstString(offset + 138, $dlv_id_alt_nm3);
	}

	/**
	 * Delivery destination identification alias name 3 納品先識別別名3.<p>
	 *
	 */
	public void dlv_id_alt_nm3(String value) {
		setConstString(offset + 138, $dlv_id_alt_nm3, value);
	}


	/**
	 * Delivery destination identification alias name 4 納品先識別別名4.<p>
	 *
	 */
	public String dlv_id_alt_nm4() {
		return getConstString(offset + 139, $dlv_id_alt_nm4);
	}

	/**
	 * Delivery destination identification alias name 4 納品先識別別名4.<p>
	 *
	 */
	public void dlv_id_alt_nm4(String value) {
		setConstString(offset + 139, $dlv_id_alt_nm4, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 140, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 140, $po_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 141, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 141, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 142, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 142, $dlv_slip_d_no, value);
	}


	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return getConstString(offset + 143, $arr_dpt_cd);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		setConstString(offset + 143, $arr_dpt_cd, value);
	}


	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return getConstString(offset + 144, $arr_dpt_nm);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		setConstString(offset + 144, $arr_dpt_nm, value);
	}


	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return getConstString(offset + 145, $arr_usr_cd);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		setConstString(offset + 145, $arr_usr_cd, value);
	}


	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return getConstString(offset + 146, $arr_usr_nm);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		setConstString(offset + 146, $arr_usr_nm, value);
	}


	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public String acpt_dpt_cd() {
		return getConstString(offset + 147, $acpt_dpt_cd);
	}

	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public void acpt_dpt_cd(String value) {
		setConstString(offset + 147, $acpt_dpt_cd, value);
	}


	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public String acpt_dpt_nm() {
		return getConstString(offset + 148, $acpt_dpt_nm);
	}

	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public void acpt_dpt_nm(String value) {
		setConstString(offset + 148, $acpt_dpt_nm, value);
	}


	/**
	 * Receipt PIC cd. 受入担当者ＣＤ.<p>
	 *
	 */
	public String acpt_usr_cd() {
		return getConstString(offset + 149, $acpt_usr_cd);
	}

	/**
	 * Receipt PIC cd. 受入担当者ＣＤ.<p>
	 *
	 */
	public void acpt_usr_cd(String value) {
		setConstString(offset + 149, $acpt_usr_cd, value);
	}


	/**
	 * Receipt PIC name 受入担当者名.<p>
	 *
	 */
	public String acpt_usr_nm() {
		return getConstString(offset + 150, $acpt_usr_nm);
	}

	/**
	 * Receipt PIC name 受入担当者名.<p>
	 *
	 */
	public void acpt_usr_nm(String value) {
		setConstString(offset + 150, $acpt_usr_nm, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 151, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 151, $lot_rmrks, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String slip_form_id() {
		return getConstString(offset + 152, $slip_form_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void slip_form_id(String value) {
		setConstString(offset + 152, $slip_form_id, value);
	}


	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public String client_typ() {
		return getConstString(offset + 153, $client_typ);
	}

	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public void client_typ(String value) {
		setConstString(offset + 153, $client_typ, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber row_no() {
		return getConstNumber(offset + 154, $row_no);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_no(MCNumber value) {
		setConstNumber(offset + 154, $row_no, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_no(int value) {
		setConstNumber(offset + 154, $row_no, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_no(long value) {
		setConstNumber(offset + 154, $row_no, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_no(float value) {
		setConstNumber(offset + 154, $row_no, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_no(double value) {
		setConstNumber(offset + 154, $row_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 155, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 155, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 155, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 155, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 155, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 155, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 156, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 156, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 157, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 157, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($unit_cd_per_pckg_unit.equalsIgnoreCase(name)) {
			return unit_cd_per_pckg_unit();
		}
		if ($unit_nm_per_pckg_unit.equalsIgnoreCase(name)) {
			return unit_nm_per_pckg_unit();
		}
		if ($rmndr_unit_cd.equalsIgnoreCase(name)) {
			return rmndr_unit_cd();
		}
		if ($rmndr_unit_nm.equalsIgnoreCase(name)) {
			return rmndr_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			return dlv_inst_unit_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char1();
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char2();
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char3();
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			return arr_act_sub_char1();
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			return arr_act_sub_char2();
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			return arr_act_sub_char3();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			return stk_sub_char1();
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			return stk_sub_char2();
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			return stk_sub_char3();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			return acpt_dpt_cd();
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			return acpt_dpt_nm();
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			return acpt_usr_cd();
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			return acpt_usr_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			return slip_form_id();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			return prnt_all_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			return qty_per_pckg_unit();
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			return rmndr_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return dlv_inst_unit_dec_place();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($row_no.equalsIgnoreCase(name)) {
			return row_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rmndr_prnt_flg.equalsIgnoreCase(name)) {
			return rmndr_prnt_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($unit_cd_per_pckg_unit.equalsIgnoreCase(name)) {
			return unit_cd_per_pckg_unit();
		}
		if ($unit_nm_per_pckg_unit.equalsIgnoreCase(name)) {
			return unit_nm_per_pckg_unit();
		}
		if ($rmndr_unit_cd.equalsIgnoreCase(name)) {
			return rmndr_unit_cd();
		}
		if ($rmndr_unit_nm.equalsIgnoreCase(name)) {
			return rmndr_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			return dlv_inst_unit_cd();
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			return dlv_inst_unit_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char1();
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char2();
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char3();
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			return arr_act_sub_char1();
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			return arr_act_sub_char2();
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			return arr_act_sub_char3();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			return stk_sub_char1();
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			return stk_sub_char2();
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			return stk_sub_char3();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			return acpt_dpt_cd();
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			return acpt_dpt_nm();
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			return acpt_usr_cd();
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			return acpt_usr_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			return slip_form_id();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			return prnt_all_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			return qty_per_pckg_unit();
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			return rmndr_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return dlv_inst_unit_dec_place();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($row_no.equalsIgnoreCase(name)) {
			return row_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rmndr_prnt_flg.equalsIgnoreCase(name)) {
			return rmndr_prnt_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($unit_cd_per_pckg_unit.equalsIgnoreCase(name)) {
			unit_cd_per_pckg_unit(value);
			return;
		}
		if ($unit_nm_per_pckg_unit.equalsIgnoreCase(name)) {
			unit_nm_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_cd.equalsIgnoreCase(name)) {
			rmndr_unit_cd(value);
			return;
		}
		if ($rmndr_unit_nm.equalsIgnoreCase(name)) {
			rmndr_unit_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			dlv_inst_unit_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
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
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char1(value);
			return;
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char2(value);
			return;
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char3(value);
			return;
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			arr_act_sub_char1(value);
			return;
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			arr_act_sub_char2(value);
			return;
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			arr_act_sub_char3(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			stk_sub_char1(value);
			return;
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			stk_sub_char2(value);
			return;
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			stk_sub_char3(value);
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
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			acpt_dpt_cd(value);
			return;
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			acpt_dpt_nm(value);
			return;
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			acpt_usr_cd(value);
			return;
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			acpt_usr_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			slip_form_id(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rmndr_prnt_flg.equalsIgnoreCase(name)) {
			rmndr_prnt_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($unit_cd_per_pckg_unit.equalsIgnoreCase(name)) {
			unit_cd_per_pckg_unit(value);
			return;
		}
		if ($unit_nm_per_pckg_unit.equalsIgnoreCase(name)) {
			unit_nm_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_cd.equalsIgnoreCase(name)) {
			rmndr_unit_cd(value);
			return;
		}
		if ($rmndr_unit_nm.equalsIgnoreCase(name)) {
			rmndr_unit_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($dlv_inst_unit_cd.equalsIgnoreCase(name)) {
			dlv_inst_unit_cd(value);
			return;
		}
		if ($dlv_inst_unit_nm.equalsIgnoreCase(name)) {
			dlv_inst_unit_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
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
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char1(value);
			return;
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char2(value);
			return;
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char3(value);
			return;
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			arr_act_sub_char1(value);
			return;
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			arr_act_sub_char2(value);
			return;
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			arr_act_sub_char3(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			stk_sub_char1(value);
			return;
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			stk_sub_char2(value);
			return;
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			stk_sub_char3(value);
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
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			acpt_dpt_cd(value);
			return;
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			acpt_dpt_nm(value);
			return;
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			acpt_usr_cd(value);
			return;
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			acpt_usr_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			slip_form_id(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prnt_all_qty.equalsIgnoreCase(name)) {
			prnt_all_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($qty_per_pckg_unit.equalsIgnoreCase(name)) {
			qty_per_pckg_unit(value);
			return;
		}
		if ($rmndr_unit_qty.equalsIgnoreCase(name)) {
			rmndr_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_unit_dec_place.equalsIgnoreCase(name)) {
			dlv_inst_unit_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($row_no.equalsIgnoreCase(name)) {
			row_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rmndr_prnt_flg.equalsIgnoreCase(name)) {
			rmndr_prnt_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

