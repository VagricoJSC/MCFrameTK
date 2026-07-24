package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Avl_List"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Avl_ListR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public static final String $schd_stk_typ = "schd_stk_typ";
	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public static final String $schd_stk_prio = "schd_stk_prio";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public static final String $io_schd_seq = "io_schd_seq";
	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public static final String $inpt_schd_dt = "inpt_schd_dt";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public static final String $gr_schd_dt = "gr_schd_dt";
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
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public static final String $pack_alloc_flg = "pack_alloc_flg";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public static final String $alt_flg = "alt_flg";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_sppl_cd = "inpt_sppl_cd";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gr_sppl_cd = "gr_sppl_cd";
	/**
	 * Inventory gross allocation location group cd. 在庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $stk_alloc_grp_cd = "stk_alloc_grp_cd";
	/**
	 * Inventory distribution group cd. 在庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $stk_lg_grp_cd = "stk_lg_grp_cd";
	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 * For inventory rack/line flg. 在庫棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_str_ln_tgt_flg = "stk_str_ln_tgt_flg";
	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $stk_str_ln_cd = "stk_str_ln_cd";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory supplier cd. 在庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $stk_sppl_cd = "stk_sppl_cd";
	/**
	 * Inventory line flg. 在庫ラインＦＬＧ.<p>
	 *
	 */
	public static final String $stk_ln_flg = "stk_ln_flg";
	/**
	 * Inventory allocation limited flg. 在庫引当限定ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_alloc_lmt_flg = "stk_alloc_lmt_flg";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public static final String $alloc_days = "alloc_days";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public static final String $prio2 = "prio2";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
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
	 * Request SEIBAN No. 1 依頼手配ＮＯ１.<p>
	 *
	 */
	public static final String $rqst_sno1 = "rqst_sno1";
	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * Request SEIBAN No. 2 依頼手配ＮＯ２.<p>
	 *
	 */
	public static final String $rqst_sno2 = "rqst_sno2";
	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * Request SEIBAN No. 3 依頼手配ＮＯ３.<p>
	 *
	 */
	public static final String $rqst_sno3 = "rqst_sno3";
	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * Request SEIBAN No. 4 依頼手配ＮＯ４.<p>
	 *
	 */
	public static final String $rqst_sno4 = "rqst_sno4";
	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Without expiration flg. 期限未設定ＦＬＧ.<p>
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public static final String $lot_quality_typ = "lot_quality_typ";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_src_qty = "pack_unit_src_qty";
	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public static final String $pack_unit_lot_qty = "pack_unit_lot_qty";
	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public static final String $pack_unit_not_lot_qty = "pack_unit_not_lot_qty";
	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public static final String $pack_unit_lg_lot_qty = "pack_unit_lg_lot_qty";
	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public static final String $pack_unit_lg_not_lot_qty = "pack_unit_lg_not_lot_qty";
	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public static final String $pack_unit_lot_alloc_qty = "pack_unit_lot_alloc_qty";
	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public static final String $pack_unit_not_lot_alloc_qty = "pack_unit_not_lot_alloc_qty";
	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public static final String $pack_unit_lg_lot_alloc_qty = "pack_unit_lg_lot_alloc_qty";
	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public static final String $pack_unit_lg_not_lot_alloc_qty = "pack_unit_lg_not_lot_alloc_qty";
	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public static final String $pack_unit_grs_alloc_qty = "pack_unit_grs_alloc_qty";
	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public static final String $pack_unit_alloc_qty = "pack_unit_alloc_qty";
	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public static final String $pack_unit_lot_wait_qty = "pack_unit_lot_wait_qty";
	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public static final String $pack_unit_not_lot_wait_qty = "pack_unit_not_lot_wait_qty";
	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public static final String $pack_unit_lg_lot_wait_qty = "pack_unit_lg_lot_wait_qty";
	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public static final String $pack_unit_lg_not_lot_wait_qty = "pack_unit_lg_not_lot_wait_qty";
	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public static final String $pack_unit_grs_wait_qty = "pack_unit_grs_wait_qty";
	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public static final String $pack_unit_wait_qty = "pack_unit_wait_qty";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_unit_rnd_typ = "pack_unit_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_src_qty = "base_unit_src_qty";
	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public static final String $base_unit_lot_qty = "base_unit_lot_qty";
	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public static final String $base_unit_not_lot_qty = "base_unit_not_lot_qty";
	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public static final String $base_unit_lg_lot_qty = "base_unit_lg_lot_qty";
	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public static final String $base_unit_lg_not_lot_qty = "base_unit_lg_not_lot_qty";
	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public static final String $base_unit_lot_alloc_qty = "base_unit_lot_alloc_qty";
	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public static final String $base_unit_not_lot_alloc_qty = "base_unit_not_lot_alloc_qty";
	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public static final String $base_unit_lg_lot_alloc_qty = "base_unit_lg_lot_alloc_qty";
	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public static final String $base_unit_lg_not_lot_alloc_qty = "base_unit_lg_not_lot_alloc_qty";
	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public static final String $base_unit_grs_alloc_qty = "base_unit_grs_alloc_qty";
	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public static final String $base_unit_alloc_qty = "base_unit_alloc_qty";
	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public static final String $base_unit_lot_wait_qty = "base_unit_lot_wait_qty";
	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public static final String $base_unit_not_lot_wait_qty = "base_unit_not_lot_wait_qty";
	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public static final String $base_unit_lg_lot_wait_qty = "base_unit_lg_lot_wait_qty";
	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public static final String $base_unit_lg_not_lot_wait_qty = "base_unit_lg_not_lot_wait_qty";
	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public static final String $base_unit_grs_wait_qty = "base_unit_grs_wait_qty";
	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public static final String $base_unit_wait_qty = "base_unit_wait_qty";
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
	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public static final String $chk_cont_fctr_flg = "chk_cont_fctr_flg";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_fix_flg = "not_lot_fix_flg";
	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public static final String $vld_dt_fr_grp = "vld_dt_fr_grp";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public static final String $stop_dt = "stop_dt";
	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public static final String $rel_dt = "rel_dt";
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
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
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public static final String $stk_info_loc_typ = "stk_info_loc_typ";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $lno = "lno";
	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public static final String $gi_loc_mng_typ = "gi_loc_mng_typ";
	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public static final String $gr_loc_mng_typ = "gr_loc_mng_typ";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GI schedule to be canceled flg. 取消対象出庫予定ＦＬＧ.<p>
	 *
	 */
	public static final String $can_gi_flg = "can_gi_flg";
	/**
	 * Not for gross allocation specification flg. 総量引当時対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_grp_non_tgt_flg = "alloc_grp_non_tgt_flg";
	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_grp_srch_flg = "alloc_grp_srch_flg";
	/**
	 * GR delay allocation flg. (Temporary use) 入庫遅れ引当ＦＬＧ（一時使用）.<p>
	 *
	 */
	public static final String $overdue_alloc_tmp_flg = "overdue_alloc_tmp_flg";
	/**
	 * GR delay allocation flg. 入庫遅れ引当ＦＬＧ.<p>
	 *
	 */
	public static final String $overdue_alloc_flg = "overdue_alloc_flg";
	/**
	 * Allocation of different location flg. 場所違い引当ＦＬＧ.<p>
	 *
	 */
	public static final String $another_loc_alloc_flg = "another_loc_alloc_flg";
	/**
	 * Allocation error flg. 引当異状ＦＬＧ.<p>
	 *
	 */
	public static final String $abnormal_alloc_flg = "abnormal_alloc_flg";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Location lot match flg. 場所ロット一致ＦＬＧ.<p>
	 *
	 */
	public static final String $loc_lot_flg = "loc_lot_flg";
	/**
	 * Location match flg. 場所一致ＦＬＧ.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Proposal match flg. 提案一致ＦＬＧ.<p>
	 *
	 */
	public static final String $tgt_flg = "tgt_flg";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public static final String $chk_ship_flg = "chk_ship_flg";
	/**
	 * Lot trace error flg. ロットトレースエラーＦＬＧ.<p>
	 *
	 */
	public static final String $lot_trace_err_flg = "lot_trace_err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta schd_stk_typ_META = createCommonMeta($schd_stk_typ, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP);
	public static final MCMeta schd_stk_prio_META = createCommonMeta($schd_stk_prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_seq_META = createCommonMeta($io_schd_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta inpt_schd_dt_META = createCommonMeta($inpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_schd_dt_META = createCommonMeta($gr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta pack_alloc_flg_META = createCommonMeta($pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta alt_flg_META = createCommonMeta($alt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_sppl_cd_META = createCommonMeta($inpt_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_sppl_cd_META = createCommonMeta($gr_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_alloc_grp_cd_META = createCommonMeta($stk_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta stk_lg_grp_cd_META = createCommonMeta($stk_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta stk_str_ln_tgt_flg_META = createCommonMeta($stk_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_str_ln_cd_META = createCommonMeta($stk_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_sppl_cd_META = createCommonMeta($stk_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_ln_flg_META = createCommonMeta($stk_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_alloc_lmt_flg_META = createCommonMeta($stk_alloc_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta alloc_days_META = createCommonMeta($alloc_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta prio2_META = createCommonMeta($prio2, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta rqst_sno1_META = createCommonMeta($rqst_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno2_META = createCommonMeta($rqst_sno2, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno3_META = createCommonMeta($rqst_sno3, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sno4_META = createCommonMeta($rqst_sno4, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta lot_quality_typ_META = createCommonMeta($lot_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_src_qty_META = createCommonMeta($pack_unit_src_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lot_qty_META = createCommonMeta($pack_unit_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_not_lot_qty_META = createCommonMeta($pack_unit_not_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_lot_qty_META = createCommonMeta($pack_unit_lg_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_not_lot_qty_META = createCommonMeta($pack_unit_lg_not_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lot_alloc_qty_META = createCommonMeta($pack_unit_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_not_lot_alloc_qty_META = createCommonMeta($pack_unit_not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_lot_alloc_qty_META = createCommonMeta($pack_unit_lg_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_not_lot_alloc_qty_META = createCommonMeta($pack_unit_lg_not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_grs_alloc_qty_META = createCommonMeta($pack_unit_grs_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_alloc_qty_META = createCommonMeta($pack_unit_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lot_wait_qty_META = createCommonMeta($pack_unit_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_not_lot_wait_qty_META = createCommonMeta($pack_unit_not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_lot_wait_qty_META = createCommonMeta($pack_unit_lg_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_lg_not_lot_wait_qty_META = createCommonMeta($pack_unit_lg_not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_grs_wait_qty_META = createCommonMeta($pack_unit_grs_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_wait_qty_META = createCommonMeta($pack_unit_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_rnd_typ_META = createCommonMeta($pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_src_qty_META = createCommonMeta($base_unit_src_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lot_qty_META = createCommonMeta($base_unit_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_not_lot_qty_META = createCommonMeta($base_unit_not_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_lot_qty_META = createCommonMeta($base_unit_lg_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_not_lot_qty_META = createCommonMeta($base_unit_lg_not_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lot_alloc_qty_META = createCommonMeta($base_unit_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_not_lot_alloc_qty_META = createCommonMeta($base_unit_not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_lot_alloc_qty_META = createCommonMeta($base_unit_lg_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_not_lot_alloc_qty_META = createCommonMeta($base_unit_lg_not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_grs_alloc_qty_META = createCommonMeta($base_unit_grs_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_alloc_qty_META = createCommonMeta($base_unit_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lot_wait_qty_META = createCommonMeta($base_unit_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_not_lot_wait_qty_META = createCommonMeta($base_unit_not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_lot_wait_qty_META = createCommonMeta($base_unit_lg_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_lg_not_lot_wait_qty_META = createCommonMeta($base_unit_lg_not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_grs_wait_qty_META = createCommonMeta($base_unit_grs_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_wait_qty_META = createCommonMeta($base_unit_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_cont_fctr_flg_META = createCommonMeta($chk_cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta not_lot_fix_flg_META = createCommonMeta($not_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_fr_grp_META = createCommonMeta($vld_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stop_dt_META = createCommonMeta($stop_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rel_dt_META = createCommonMeta($rel_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_info_loc_typ_META = createCommonMeta($stk_info_loc_typ, mcframe.commonMS.meta.MS_META.STK_INFO_LOC_TYP);
	public static final MCMeta lno_META = createNumberMeta($lno);
	public static final MCMeta gi_loc_mng_typ_META = createCommonMeta($gi_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta gr_loc_mng_typ_META = createCommonMeta($gr_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta can_gi_flg_META = createCommonMeta($can_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_non_tgt_flg_META = createCommonMeta($alloc_grp_non_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_srch_flg_META = createCommonMeta($alloc_grp_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta overdue_alloc_tmp_flg_META = createCommonMeta($overdue_alloc_tmp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta overdue_alloc_flg_META = createCommonMeta($overdue_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta another_loc_alloc_flg_META = createCommonMeta($another_loc_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abnormal_alloc_flg_META = createCommonMeta($abnormal_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_lot_flg_META = createCommonMeta($loc_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tgt_flg_META = createCommonMeta($tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta chk_ship_flg_META = createCommonMeta($chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_trace_err_flg_META = createCommonMeta($lot_trace_err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Avl_ListR> constMetas = new ConstMetaList<Avl_ListR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			schd_stk_typ_META,
			schd_stk_prio_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			io_schd_no_META,
			io_schd_seq_META,
			schd_dt_META,
			io_schd_pr_no_META,
			inpt_schd_dt_META,
			gi_schd_dt_META,
			gr_schd_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			pack_alloc_flg_META,
			alloc_margin_days_META,
			ship_term_cd_META,
			ver_no_META,
			alt_flg_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			oper_inst_no_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			inpt_sppl_cd_META,
			dlv_lg_grp_cd_META,
			alloc_grp_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gr_wg_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			gr_sppl_cd_META,
			stk_alloc_grp_cd_META,
			stk_lg_grp_cd_META,
			stk_loc_cd_META,
			stk_str_ln_tgt_flg_META,
			stk_str_ln_cd_META,
			stk_arrv_bp_cd_META,
			stk_sppl_cd_META,
			stk_ln_flg_META,
			stk_alloc_lmt_flg_META,
			xfr_lt_META,
			alloc_days_META,
			prio_META,
			prio2_META,
			asst_typ_META,
			in_xfr_typ_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			gd_cd_META,
			lot_no_META,
			sublot_no_META,
			rqst_sno1_META,
			sno1_null_flg_META,
			rqst_sno2_META,
			sno2_null_flg_META,
			rqst_sno3_META,
			sno3_null_flg_META,
			rqst_sno4_META,
			sno4_null_flg_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			first_gr_dt_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			bp_lot_no_META,
			lot_quality_typ_META,
			lot_seq_META,
			pack_unit_cd_META,
			pack_unit_src_qty_META,
			pack_unit_lot_qty_META,
			pack_unit_not_lot_qty_META,
			pack_unit_lg_lot_qty_META,
			pack_unit_lg_not_lot_qty_META,
			pack_unit_qty_META,
			pack_unit_lot_alloc_qty_META,
			pack_unit_not_lot_alloc_qty_META,
			pack_unit_lg_lot_alloc_qty_META,
			pack_unit_lg_not_lot_alloc_qty_META,
			pack_unit_grs_alloc_qty_META,
			pack_unit_alloc_qty_META,
			pack_unit_lot_wait_qty_META,
			pack_unit_not_lot_wait_qty_META,
			pack_unit_lg_lot_wait_qty_META,
			pack_unit_lg_not_lot_wait_qty_META,
			pack_unit_grs_wait_qty_META,
			pack_unit_wait_qty_META,
			pack_unit_dec_place_META,
			pack_unit_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			base_unit_cd_META,
			base_unit_src_qty_META,
			base_unit_lot_qty_META,
			base_unit_not_lot_qty_META,
			base_unit_lg_lot_qty_META,
			base_unit_lg_not_lot_qty_META,
			base_unit_qty_META,
			base_unit_lot_alloc_qty_META,
			base_unit_not_lot_alloc_qty_META,
			base_unit_lg_lot_alloc_qty_META,
			base_unit_lg_not_lot_alloc_qty_META,
			base_unit_grs_alloc_qty_META,
			base_unit_alloc_qty_META,
			base_unit_lot_wait_qty_META,
			base_unit_not_lot_wait_qty_META,
			base_unit_lg_lot_wait_qty_META,
			base_unit_lg_not_lot_wait_qty_META,
			base_unit_grs_wait_qty_META,
			base_unit_wait_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			chk_cont_fctr_flg_META,
			act_cont_fctr_META,
			std_cont_fctr_META,
			cont_qty_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			not_lot_fix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			vld_dt_fr_grp_META,
			vld_dt_to_META,
			stop_dt_META,
			rel_dt_META,
			plnt_aprv_sts_typ_META,
			mrkt_judg_sts_typ_META,
			asset_mng_typ_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			stk_flg_META,
			stk_info_loc_typ_META,
			lno_META,
			gi_loc_mng_typ_META,
			gr_loc_mng_typ_META,
			gi_site_cd_META,
			gr_site_cd_META,
			can_gi_flg_META,
			alloc_grp_non_tgt_flg_META,
			alloc_grp_srch_flg_META,
			overdue_alloc_tmp_flg_META,
			overdue_alloc_flg_META,
			another_loc_alloc_flg_META,
			abnormal_alloc_flg_META,
			alloc_scope_typ_META,
			not_lg_mix_flg_META,
			loc_lot_flg_META,
			loc_flg_META,
			tgt_flg_META,
			cst_cd_META,
			lot_back_stop_typ_META,
			chk_ship_flg_META,
			lot_trace_err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Avl_ListR_MC_A(ConstMetaList<? extends Avl_ListR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Avl_ListR clone() {
		return (Avl_ListR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Avl_ListR createInstance() {
		return (Avl_ListR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Avl_ListR getValues(String... names) {
		return (Avl_ListR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public String schd_stk_typ() {
		return getConstString(offset + 1, $schd_stk_typ);
	}

	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public void schd_stk_typ(String value) {
		setConstString(offset + 1, $schd_stk_typ, value);
	}


	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public MCNumber schd_stk_prio() {
		return getConstNumber(offset + 2, $schd_stk_prio);
	}

	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public void schd_stk_prio(MCNumber value) {
		setConstNumber(offset + 2, $schd_stk_prio, value);
	}

	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public void schd_stk_prio(int value) {
		setConstNumber(offset + 2, $schd_stk_prio, value);
	}

	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public void schd_stk_prio(long value) {
		setConstNumber(offset + 2, $schd_stk_prio, value);
	}

	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public void schd_stk_prio(float value) {
		setConstNumber(offset + 2, $schd_stk_prio, value);
	}

	/**
	 * Scheduled inventory priority 予定在庫優先順.<p>
	 *
	 */
	public void schd_stk_prio(double value) {
		setConstNumber(offset + 2, $schd_stk_prio, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 3, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 3, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 4, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 4, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 5, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 5, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 6, $io_schd_seq);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 6, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 6, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 6, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 6, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 6, $io_schd_seq, value);
	}


	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 7, $schd_dt);
	}

	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 7, $schd_dt, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 8, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 8, $io_schd_pr_no, value);
	}


	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCDate inpt_schd_dt() {
		return getConstDate(offset + 9, $inpt_schd_dt);
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public void inpt_schd_dt(MCDate value) {
		setConstDate(offset + 9, $inpt_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 10, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 10, $gi_schd_dt, value);
	}


	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return getConstDate(offset + 11, $gr_schd_dt);
	}

	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		setConstDate(offset + 11, $gr_schd_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 13, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 13, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 14, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 14, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 15, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 15, $itm_sub3, value);
	}


	/**
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public boolean pack_alloc_flg() {
		return getConstBoolean(offset + 16, $pack_alloc_flg);
	}

	/**
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public void pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 16, $pack_alloc_flg, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 17, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 17, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 17, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 17, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 17, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 17, $alloc_margin_days, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 18, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 18, $ship_term_cd, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 19, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 19, $ver_no, value);
	}


	/**
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public boolean alt_flg() {
		return getConstBoolean(offset + 20, $alt_flg);
	}

	/**
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public void alt_flg(boolean value) {
		setConstBoolean(offset + 20, $alt_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 21, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 21, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 22, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 22, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 22, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 22, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 22, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 22, $alt_grp_seq, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 23, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 23, $oper_inst_no, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 24, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 24, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 25, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 25, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 25, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 25, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 25, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 25, $alt_alloc_prio, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 26, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 26, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 27, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 27, $inpt_str_ln_cd, value);
	}


	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public String inpt_sppl_cd() {
		return getConstString(offset + 28, $inpt_sppl_cd);
	}

	/**
	 * Input supplier cd. 投入発注先ＣＤ.<p>
	 *
	 */
	public void inpt_sppl_cd(String value) {
		setConstString(offset + 28, $inpt_sppl_cd, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 29, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 29, $dlv_lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 30, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 30, $alloc_grp_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 31, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 31, $gi_lg_grp_cd, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 32, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 32, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 33, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 33, $gi_str_ln_cd, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 34, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 34, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 35, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 35, $gr_wg_cd, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 36, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 36, $gr_loc_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 37, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 37, $gr_str_ln_cd, value);
	}


	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public String gr_sppl_cd() {
		return getConstString(offset + 38, $gr_sppl_cd);
	}

	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public void gr_sppl_cd(String value) {
		setConstString(offset + 38, $gr_sppl_cd, value);
	}


	/**
	 * Inventory gross allocation location group cd. 在庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public String stk_alloc_grp_cd() {
		return getConstString(offset + 39, $stk_alloc_grp_cd);
	}

	/**
	 * Inventory gross allocation location group cd. 在庫総量引当場所グループＣＤ.<p>
	 *
	 */
	public void stk_alloc_grp_cd(String value) {
		setConstString(offset + 39, $stk_alloc_grp_cd, value);
	}


	/**
	 * Inventory distribution group cd. 在庫物流グループＣＤ.<p>
	 *
	 */
	public String stk_lg_grp_cd() {
		return getConstString(offset + 40, $stk_lg_grp_cd);
	}

	/**
	 * Inventory distribution group cd. 在庫物流グループＣＤ.<p>
	 *
	 */
	public void stk_lg_grp_cd(String value) {
		setConstString(offset + 40, $stk_lg_grp_cd, value);
	}


	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 41, $stk_loc_cd);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 41, $stk_loc_cd, value);
	}


	/**
	 * For inventory rack/line flg. 在庫棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public boolean stk_str_ln_tgt_flg() {
		return getConstBoolean(offset + 42, $stk_str_ln_tgt_flg);
	}

	/**
	 * For inventory rack/line flg. 在庫棚・ライン対象ＦＬＧ.<p>
	 *
	 */
	public void stk_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 42, $stk_str_ln_tgt_flg, value);
	}


	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return getConstString(offset + 43, $stk_str_ln_cd);
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		setConstString(offset + 43, $stk_str_ln_cd, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 44, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 44, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory supplier cd. 在庫発注先ＣＤ.<p>
	 *
	 */
	public String stk_sppl_cd() {
		return getConstString(offset + 45, $stk_sppl_cd);
	}

	/**
	 * Inventory supplier cd. 在庫発注先ＣＤ.<p>
	 *
	 */
	public void stk_sppl_cd(String value) {
		setConstString(offset + 45, $stk_sppl_cd, value);
	}


	/**
	 * Inventory line flg. 在庫ラインＦＬＧ.<p>
	 *
	 */
	public boolean stk_ln_flg() {
		return getConstBoolean(offset + 46, $stk_ln_flg);
	}

	/**
	 * Inventory line flg. 在庫ラインＦＬＧ.<p>
	 *
	 */
	public void stk_ln_flg(boolean value) {
		setConstBoolean(offset + 46, $stk_ln_flg, value);
	}


	/**
	 * Inventory allocation limited flg. 在庫引当限定ＦＬＧ.<p>
	 *
	 */
	public boolean stk_alloc_lmt_flg() {
		return getConstBoolean(offset + 47, $stk_alloc_lmt_flg);
	}

	/**
	 * Inventory allocation limited flg. 在庫引当限定ＦＬＧ.<p>
	 *
	 */
	public void stk_alloc_lmt_flg(boolean value) {
		setConstBoolean(offset + 47, $stk_alloc_lmt_flg, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 48, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 48, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 48, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 48, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 48, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 48, $xfr_lt, value);
	}


	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public MCNumber alloc_days() {
		return getConstNumber(offset + 49, $alloc_days);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(MCNumber value) {
		setConstNumber(offset + 49, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(int value) {
		setConstNumber(offset + 49, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(long value) {
		setConstNumber(offset + 49, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(float value) {
		setConstNumber(offset + 49, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(double value) {
		setConstNumber(offset + 49, $alloc_days, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 50, $prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 50, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 50, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 50, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 50, $prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 50, $prio, value);
	}


	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public MCNumber prio2() {
		return getConstNumber(offset + 51, $prio2);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(MCNumber value) {
		setConstNumber(offset + 51, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(int value) {
		setConstNumber(offset + 51, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(long value) {
		setConstNumber(offset + 51, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(float value) {
		setConstNumber(offset + 51, $prio2, value);
	}

	/**
	 * Allocation priority 2 引当優先順２.<p>
	 *
	 */
	public void prio2(double value) {
		setConstNumber(offset + 51, $prio2, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 52, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 52, $asst_typ, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 53, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 53, $in_xfr_typ, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 54, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 54, $quality_typ, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 55, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 55, $stk_insp_typ, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 56, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 56, $stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 57, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 57, $stk_bp_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 58, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 58, $gd_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 59, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 59, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 60, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 60, $sublot_no, value);
	}


	/**
	 * Request SEIBAN No. 1 依頼手配ＮＯ１.<p>
	 *
	 */
	public String rqst_sno1() {
		return getConstString(offset + 61, $rqst_sno1);
	}

	/**
	 * Request SEIBAN No. 1 依頼手配ＮＯ１.<p>
	 *
	 */
	public void rqst_sno1(String value) {
		setConstString(offset + 61, $rqst_sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 62, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 62, $sno1_null_flg, value);
	}


	/**
	 * Request SEIBAN No. 2 依頼手配ＮＯ２.<p>
	 *
	 */
	public String rqst_sno2() {
		return getConstString(offset + 63, $rqst_sno2);
	}

	/**
	 * Request SEIBAN No. 2 依頼手配ＮＯ２.<p>
	 *
	 */
	public void rqst_sno2(String value) {
		setConstString(offset + 63, $rqst_sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 64, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 64, $sno2_null_flg, value);
	}


	/**
	 * Request SEIBAN No. 3 依頼手配ＮＯ３.<p>
	 *
	 */
	public String rqst_sno3() {
		return getConstString(offset + 65, $rqst_sno3);
	}

	/**
	 * Request SEIBAN No. 3 依頼手配ＮＯ３.<p>
	 *
	 */
	public void rqst_sno3(String value) {
		setConstString(offset + 65, $rqst_sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 66, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 66, $sno3_null_flg, value);
	}


	/**
	 * Request SEIBAN No. 4 依頼手配ＮＯ４.<p>
	 *
	 */
	public String rqst_sno4() {
		return getConstString(offset + 67, $rqst_sno4);
	}

	/**
	 * Request SEIBAN No. 4 依頼手配ＮＯ４.<p>
	 *
	 */
	public void rqst_sno4(String value) {
		setConstString(offset + 67, $rqst_sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 68, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 68, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 69, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 69, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 70, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 70, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 71, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 71, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 72, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 72, $sno4, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 73, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 73, $first_gr_dt, value);
	}


	/**
	 * Without expiration flg. 期限未設定ＦＬＧ.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 74, $unreg_lmt_flg);
	}

	/**
	 * Without expiration flg. 期限未設定ＦＬＧ.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 74, $unreg_lmt_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 75, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 75, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 76, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 76, $lmt_dt, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 77, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 77, $bp_lot_no, value);
	}


	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public String lot_quality_typ() {
		return getConstString(offset + 78, $lot_quality_typ);
	}

	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public void lot_quality_typ(String value) {
		setConstString(offset + 78, $lot_quality_typ, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 79, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 79, $lot_seq, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 80, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 80, $pack_unit_cd, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_src_qty() {
		return getConstNumber(offset + 81, $pack_unit_src_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_src_qty(MCNumber value) {
		setConstNumber(offset + 81, $pack_unit_src_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_src_qty(int value) {
		setConstNumber(offset + 81, $pack_unit_src_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_src_qty(long value) {
		setConstNumber(offset + 81, $pack_unit_src_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_src_qty(float value) {
		setConstNumber(offset + 81, $pack_unit_src_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_src_qty(double value) {
		setConstNumber(offset + 81, $pack_unit_src_qty, value);
	}


	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public MCNumber pack_unit_lot_qty() {
		return getConstNumber(offset + 82, $pack_unit_lot_qty);
	}

	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lot_qty(MCNumber value) {
		setConstNumber(offset + 82, $pack_unit_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lot_qty(int value) {
		setConstNumber(offset + 82, $pack_unit_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lot_qty(long value) {
		setConstNumber(offset + 82, $pack_unit_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lot_qty(float value) {
		setConstNumber(offset + 82, $pack_unit_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/with lot number after subtraction) 荷姿単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lot_qty(double value) {
		setConstNumber(offset + 82, $pack_unit_lot_qty, value);
	}


	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public MCNumber pack_unit_not_lot_qty() {
		return getConstNumber(offset + 83, $pack_unit_not_lot_qty);
	}

	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_not_lot_qty(MCNumber value) {
		setConstNumber(offset + 83, $pack_unit_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_not_lot_qty(int value) {
		setConstNumber(offset + 83, $pack_unit_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_not_lot_qty(long value) {
		setConstNumber(offset + 83, $pack_unit_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_not_lot_qty(float value) {
		setConstNumber(offset + 83, $pack_unit_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated/without lot number after subtraction) 荷姿単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_not_lot_qty(double value) {
		setConstNumber(offset + 83, $pack_unit_not_lot_qty, value);
	}


	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_lot_qty() {
		return getConstNumber(offset + 84, $pack_unit_lg_lot_qty);
	}

	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_lot_qty(MCNumber value) {
		setConstNumber(offset + 84, $pack_unit_lg_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_lot_qty(int value) {
		setConstNumber(offset + 84, $pack_unit_lg_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_lot_qty(long value) {
		setConstNumber(offset + 84, $pack_unit_lg_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_lot_qty(float value) {
		setConstNumber(offset + 84, $pack_unit_lg_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated with distribution group number after subtraction) 荷姿単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_lot_qty(double value) {
		setConstNumber(offset + 84, $pack_unit_lg_lot_qty, value);
	}


	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_not_lot_qty() {
		return getConstNumber(offset + 85, $pack_unit_lg_not_lot_qty);
	}

	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_qty(MCNumber value) {
		setConstNumber(offset + 85, $pack_unit_lg_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_qty(int value) {
		setConstNumber(offset + 85, $pack_unit_lg_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_qty(long value) {
		setConstNumber(offset + 85, $pack_unit_lg_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_qty(float value) {
		setConstNumber(offset + 85, $pack_unit_lg_not_lot_qty, value);
	}

	/**
	 * SKU qty. (Not allocated without distribution group lot number after subtraction) 荷姿単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_qty(double value) {
		setConstNumber(offset + 85, $pack_unit_lg_not_lot_qty, value);
	}


	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 86, $pack_unit_qty);
	}

	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 86, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 86, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 86, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 86, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. (Not gross allocated after subtraction) 荷姿単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 86, $pack_unit_qty, value);
	}


	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_lot_alloc_qty() {
		return getConstNumber(offset + 87, $pack_unit_lot_alloc_qty);
	}

	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 87, $pack_unit_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lot_alloc_qty(int value) {
		setConstNumber(offset + 87, $pack_unit_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lot_alloc_qty(long value) {
		setConstNumber(offset + 87, $pack_unit_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lot_alloc_qty(float value) {
		setConstNumber(offset + 87, $pack_unit_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with lot number) 荷姿単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lot_alloc_qty(double value) {
		setConstNumber(offset + 87, $pack_unit_lot_alloc_qty, value);
	}


	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_not_lot_alloc_qty() {
		return getConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty);
	}

	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_not_lot_alloc_qty(int value) {
		setConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_not_lot_alloc_qty(long value) {
		setConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_not_lot_alloc_qty(float value) {
		setConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without lot number) 荷姿単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_not_lot_alloc_qty(double value) {
		setConstNumber(offset + 88, $pack_unit_not_lot_alloc_qty, value);
	}


	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_lot_alloc_qty() {
		return getConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty);
	}

	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lg_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lg_lot_alloc_qty(int value) {
		setConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lg_lot_alloc_qty(long value) {
		setConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lg_lot_alloc_qty(float value) {
		setConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated with distribution group lot number) 荷姿単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void pack_unit_lg_lot_alloc_qty(double value) {
		setConstNumber(offset + 89, $pack_unit_lg_lot_alloc_qty, value);
	}


	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_not_lot_alloc_qty() {
		return getConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty);
	}

	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_alloc_qty(int value) {
		setConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_alloc_qty(long value) {
		setConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_alloc_qty(float value) {
		setConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated without distribution group lot number) 荷姿単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_alloc_qty(double value) {
		setConstNumber(offset + 90, $pack_unit_lg_not_lot_alloc_qty, value);
	}


	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_grs_alloc_qty() {
		return getConstNumber(offset + 91, $pack_unit_grs_alloc_qty);
	}

	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public void pack_unit_grs_alloc_qty(MCNumber value) {
		setConstNumber(offset + 91, $pack_unit_grs_alloc_qty, value);
	}

	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public void pack_unit_grs_alloc_qty(int value) {
		setConstNumber(offset + 91, $pack_unit_grs_alloc_qty, value);
	}

	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public void pack_unit_grs_alloc_qty(long value) {
		setConstNumber(offset + 91, $pack_unit_grs_alloc_qty, value);
	}

	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public void pack_unit_grs_alloc_qty(float value) {
		setConstNumber(offset + 91, $pack_unit_grs_alloc_qty, value);
	}

	/**
	 * SKU qty. (Gross allocated) 荷姿単位数量（総量引当済）.<p>
	 *
	 */
	public void pack_unit_grs_alloc_qty(double value) {
		setConstNumber(offset + 91, $pack_unit_grs_alloc_qty, value);
	}


	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public MCNumber pack_unit_alloc_qty() {
		return getConstNumber(offset + 92, $pack_unit_alloc_qty);
	}

	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public void pack_unit_alloc_qty(MCNumber value) {
		setConstNumber(offset + 92, $pack_unit_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public void pack_unit_alloc_qty(int value) {
		setConstNumber(offset + 92, $pack_unit_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public void pack_unit_alloc_qty(long value) {
		setConstNumber(offset + 92, $pack_unit_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public void pack_unit_alloc_qty(float value) {
		setConstNumber(offset + 92, $pack_unit_alloc_qty, value);
	}

	/**
	 * SKU qty. (Allocated) 荷姿単位数量（引当済）.<p>
	 *
	 */
	public void pack_unit_alloc_qty(double value) {
		setConstNumber(offset + 92, $pack_unit_alloc_qty, value);
	}


	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public MCNumber pack_unit_lot_wait_qty() {
		return getConstNumber(offset + 93, $pack_unit_lot_wait_qty);
	}

	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 93, $pack_unit_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lot_wait_qty(int value) {
		setConstNumber(offset + 93, $pack_unit_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lot_wait_qty(long value) {
		setConstNumber(offset + 93, $pack_unit_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lot_wait_qty(float value) {
		setConstNumber(offset + 93, $pack_unit_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending with lot number) 荷姿単位数量（ロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lot_wait_qty(double value) {
		setConstNumber(offset + 93, $pack_unit_lot_wait_qty, value);
	}


	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public MCNumber pack_unit_not_lot_wait_qty() {
		return getConstNumber(offset + 94, $pack_unit_not_lot_wait_qty);
	}

	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 94, $pack_unit_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_not_lot_wait_qty(int value) {
		setConstNumber(offset + 94, $pack_unit_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_not_lot_wait_qty(long value) {
		setConstNumber(offset + 94, $pack_unit_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_not_lot_wait_qty(float value) {
		setConstNumber(offset + 94, $pack_unit_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without lot number) 荷姿単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_not_lot_wait_qty(double value) {
		setConstNumber(offset + 94, $pack_unit_not_lot_wait_qty, value);
	}


	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_lot_wait_qty() {
		return getConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty);
	}

	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lg_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lg_lot_wait_qty(int value) {
		setConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lg_lot_wait_qty(long value) {
		setConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lg_lot_wait_qty(float value) {
		setConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (With distribution group lot number pending) 荷姿単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void pack_unit_lg_lot_wait_qty(double value) {
		setConstNumber(offset + 95, $pack_unit_lg_lot_wait_qty, value);
	}


	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public MCNumber pack_unit_lg_not_lot_wait_qty() {
		return getConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty);
	}

	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_wait_qty(int value) {
		setConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_wait_qty(long value) {
		setConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_wait_qty(float value) {
		setConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending without distribution group lot number) 荷姿単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void pack_unit_lg_not_lot_wait_qty(double value) {
		setConstNumber(offset + 96, $pack_unit_lg_not_lot_wait_qty, value);
	}


	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public MCNumber pack_unit_grs_wait_qty() {
		return getConstNumber(offset + 97, $pack_unit_grs_wait_qty);
	}

	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public void pack_unit_grs_wait_qty(MCNumber value) {
		setConstNumber(offset + 97, $pack_unit_grs_wait_qty, value);
	}

	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public void pack_unit_grs_wait_qty(int value) {
		setConstNumber(offset + 97, $pack_unit_grs_wait_qty, value);
	}

	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public void pack_unit_grs_wait_qty(long value) {
		setConstNumber(offset + 97, $pack_unit_grs_wait_qty, value);
	}

	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public void pack_unit_grs_wait_qty(float value) {
		setConstNumber(offset + 97, $pack_unit_grs_wait_qty, value);
	}

	/**
	 * SKU qty. (Gross pending) 荷姿単位数量（総量保留）.<p>
	 *
	 */
	public void pack_unit_grs_wait_qty(double value) {
		setConstNumber(offset + 97, $pack_unit_grs_wait_qty, value);
	}


	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public MCNumber pack_unit_wait_qty() {
		return getConstNumber(offset + 98, $pack_unit_wait_qty);
	}

	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public void pack_unit_wait_qty(MCNumber value) {
		setConstNumber(offset + 98, $pack_unit_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public void pack_unit_wait_qty(int value) {
		setConstNumber(offset + 98, $pack_unit_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public void pack_unit_wait_qty(long value) {
		setConstNumber(offset + 98, $pack_unit_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public void pack_unit_wait_qty(float value) {
		setConstNumber(offset + 98, $pack_unit_wait_qty, value);
	}

	/**
	 * SKU qty. (Pending) 荷姿単位数量（保留）.<p>
	 *
	 */
	public void pack_unit_wait_qty(double value) {
		setConstNumber(offset + 98, $pack_unit_wait_qty, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 99, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 99, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 99, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 99, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 99, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 99, $pack_unit_dec_place, value);
	}


	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return getConstString(offset + 100, $pack_unit_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		setConstString(offset + 100, $pack_unit_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 101, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 101, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 101, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 101, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 101, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 101, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 102, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 102, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 102, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 102, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 102, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 102, $conv_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 103, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 103, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_src_qty() {
		return getConstNumber(offset + 104, $base_unit_src_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_src_qty(MCNumber value) {
		setConstNumber(offset + 104, $base_unit_src_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_src_qty(int value) {
		setConstNumber(offset + 104, $base_unit_src_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_src_qty(long value) {
		setConstNumber(offset + 104, $base_unit_src_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_src_qty(float value) {
		setConstNumber(offset + 104, $base_unit_src_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_src_qty(double value) {
		setConstNumber(offset + 104, $base_unit_src_qty, value);
	}


	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public MCNumber base_unit_lot_qty() {
		return getConstNumber(offset + 105, $base_unit_lot_qty);
	}

	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lot_qty(MCNumber value) {
		setConstNumber(offset + 105, $base_unit_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lot_qty(int value) {
		setConstNumber(offset + 105, $base_unit_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lot_qty(long value) {
		setConstNumber(offset + 105, $base_unit_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lot_qty(float value) {
		setConstNumber(offset + 105, $base_unit_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated/with lot number after subtraction) 基準単位数量（ロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lot_qty(double value) {
		setConstNumber(offset + 105, $base_unit_lot_qty, value);
	}


	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public MCNumber base_unit_not_lot_qty() {
		return getConstNumber(offset + 106, $base_unit_not_lot_qty);
	}

	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_not_lot_qty(MCNumber value) {
		setConstNumber(offset + 106, $base_unit_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_not_lot_qty(int value) {
		setConstNumber(offset + 106, $base_unit_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_not_lot_qty(long value) {
		setConstNumber(offset + 106, $base_unit_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_not_lot_qty(float value) {
		setConstNumber(offset + 106, $base_unit_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without lot number after subtraction) 基準単位数量（ロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_not_lot_qty(double value) {
		setConstNumber(offset + 106, $base_unit_not_lot_qty, value);
	}


	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public MCNumber base_unit_lg_lot_qty() {
		return getConstNumber(offset + 107, $base_unit_lg_lot_qty);
	}

	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_lot_qty(MCNumber value) {
		setConstNumber(offset + 107, $base_unit_lg_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_lot_qty(int value) {
		setConstNumber(offset + 107, $base_unit_lg_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_lot_qty(long value) {
		setConstNumber(offset + 107, $base_unit_lg_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_lot_qty(float value) {
		setConstNumber(offset + 107, $base_unit_lg_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated with distribution group lot number after subtraction) 基準単位数量（物流グループロット指定減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_lot_qty(double value) {
		setConstNumber(offset + 107, $base_unit_lg_lot_qty, value);
	}


	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public MCNumber base_unit_lg_not_lot_qty() {
		return getConstNumber(offset + 108, $base_unit_lg_not_lot_qty);
	}

	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_qty(MCNumber value) {
		setConstNumber(offset + 108, $base_unit_lg_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_qty(int value) {
		setConstNumber(offset + 108, $base_unit_lg_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_qty(long value) {
		setConstNumber(offset + 108, $base_unit_lg_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_qty(float value) {
		setConstNumber(offset + 108, $base_unit_lg_not_lot_qty, value);
	}

	/**
	 * Base unit qty. (Not allocated without distribution group lot number after subtraction) 基準単位数量（物流グループロット指定無減算後未引当）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_qty(double value) {
		setConstNumber(offset + 108, $base_unit_lg_not_lot_qty, value);
	}


	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 109, $base_unit_qty);
	}

	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 109, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 109, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 109, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 109, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. (Not gross allocated after subtraction) 基準単位数量（総量減算後未引当）.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 109, $base_unit_qty, value);
	}


	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public MCNumber base_unit_lot_alloc_qty() {
		return getConstNumber(offset + 110, $base_unit_lot_alloc_qty);
	}

	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 110, $base_unit_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lot_alloc_qty(int value) {
		setConstNumber(offset + 110, $base_unit_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lot_alloc_qty(long value) {
		setConstNumber(offset + 110, $base_unit_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lot_alloc_qty(float value) {
		setConstNumber(offset + 110, $base_unit_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with lot number) 基準単位数量（ロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lot_alloc_qty(double value) {
		setConstNumber(offset + 110, $base_unit_lot_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public MCNumber base_unit_not_lot_alloc_qty() {
		return getConstNumber(offset + 111, $base_unit_not_lot_alloc_qty);
	}

	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 111, $base_unit_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_not_lot_alloc_qty(int value) {
		setConstNumber(offset + 111, $base_unit_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_not_lot_alloc_qty(long value) {
		setConstNumber(offset + 111, $base_unit_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_not_lot_alloc_qty(float value) {
		setConstNumber(offset + 111, $base_unit_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without lot number) 基準単位数量（ロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_not_lot_alloc_qty(double value) {
		setConstNumber(offset + 111, $base_unit_not_lot_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public MCNumber base_unit_lg_lot_alloc_qty() {
		return getConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty);
	}

	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lg_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lg_lot_alloc_qty(int value) {
		setConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lg_lot_alloc_qty(long value) {
		setConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lg_lot_alloc_qty(float value) {
		setConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated with distribution group lot number) 基準単位数量（物流グループロット指定引当済）.<p>
	 *
	 */
	public void base_unit_lg_lot_alloc_qty(double value) {
		setConstNumber(offset + 112, $base_unit_lg_lot_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public MCNumber base_unit_lg_not_lot_alloc_qty() {
		return getConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty);
	}

	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_alloc_qty(int value) {
		setConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_alloc_qty(long value) {
		setConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_alloc_qty(float value) {
		setConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated without distribution group lot number) 基準単位数量（物流グループロット指定無引当済）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_alloc_qty(double value) {
		setConstNumber(offset + 113, $base_unit_lg_not_lot_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public MCNumber base_unit_grs_alloc_qty() {
		return getConstNumber(offset + 114, $base_unit_grs_alloc_qty);
	}

	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public void base_unit_grs_alloc_qty(MCNumber value) {
		setConstNumber(offset + 114, $base_unit_grs_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public void base_unit_grs_alloc_qty(int value) {
		setConstNumber(offset + 114, $base_unit_grs_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public void base_unit_grs_alloc_qty(long value) {
		setConstNumber(offset + 114, $base_unit_grs_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public void base_unit_grs_alloc_qty(float value) {
		setConstNumber(offset + 114, $base_unit_grs_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Gross allocated) 基準単位数量（総量引当済）.<p>
	 *
	 */
	public void base_unit_grs_alloc_qty(double value) {
		setConstNumber(offset + 114, $base_unit_grs_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public MCNumber base_unit_alloc_qty() {
		return getConstNumber(offset + 115, $base_unit_alloc_qty);
	}

	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public void base_unit_alloc_qty(MCNumber value) {
		setConstNumber(offset + 115, $base_unit_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public void base_unit_alloc_qty(int value) {
		setConstNumber(offset + 115, $base_unit_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public void base_unit_alloc_qty(long value) {
		setConstNumber(offset + 115, $base_unit_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public void base_unit_alloc_qty(float value) {
		setConstNumber(offset + 115, $base_unit_alloc_qty, value);
	}

	/**
	 * Base unit qty. (Allocated) 基準単位数量（引当済）.<p>
	 *
	 */
	public void base_unit_alloc_qty(double value) {
		setConstNumber(offset + 115, $base_unit_alloc_qty, value);
	}


	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public MCNumber base_unit_lot_wait_qty() {
		return getConstNumber(offset + 116, $base_unit_lot_wait_qty);
	}

	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public void base_unit_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 116, $base_unit_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public void base_unit_lot_wait_qty(int value) {
		setConstNumber(offset + 116, $base_unit_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public void base_unit_lot_wait_qty(long value) {
		setConstNumber(offset + 116, $base_unit_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public void base_unit_lot_wait_qty(float value) {
		setConstNumber(offset + 116, $base_unit_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with lot number) 基準単位数量（ロット指定保留）.<p>
	 *
	 */
	public void base_unit_lot_wait_qty(double value) {
		setConstNumber(offset + 116, $base_unit_lot_wait_qty, value);
	}


	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public MCNumber base_unit_not_lot_wait_qty() {
		return getConstNumber(offset + 117, $base_unit_not_lot_wait_qty);
	}

	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void base_unit_not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 117, $base_unit_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void base_unit_not_lot_wait_qty(int value) {
		setConstNumber(offset + 117, $base_unit_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void base_unit_not_lot_wait_qty(long value) {
		setConstNumber(offset + 117, $base_unit_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void base_unit_not_lot_wait_qty(float value) {
		setConstNumber(offset + 117, $base_unit_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without lot number) 基準単位数量（ロット指定無保留）.<p>
	 *
	 */
	public void base_unit_not_lot_wait_qty(double value) {
		setConstNumber(offset + 117, $base_unit_not_lot_wait_qty, value);
	}


	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public MCNumber base_unit_lg_lot_wait_qty() {
		return getConstNumber(offset + 118, $base_unit_lg_lot_wait_qty);
	}

	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void base_unit_lg_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 118, $base_unit_lg_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void base_unit_lg_lot_wait_qty(int value) {
		setConstNumber(offset + 118, $base_unit_lg_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void base_unit_lg_lot_wait_qty(long value) {
		setConstNumber(offset + 118, $base_unit_lg_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void base_unit_lg_lot_wait_qty(float value) {
		setConstNumber(offset + 118, $base_unit_lg_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending with distribution group lot number) 基準単位数量（物流グループロット指定保留）.<p>
	 *
	 */
	public void base_unit_lg_lot_wait_qty(double value) {
		setConstNumber(offset + 118, $base_unit_lg_lot_wait_qty, value);
	}


	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public MCNumber base_unit_lg_not_lot_wait_qty() {
		return getConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty);
	}

	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_wait_qty(int value) {
		setConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_wait_qty(long value) {
		setConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_wait_qty(float value) {
		setConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending without distribution group lot number) 基準単位数量（物流グループロット指定無保留）.<p>
	 *
	 */
	public void base_unit_lg_not_lot_wait_qty(double value) {
		setConstNumber(offset + 119, $base_unit_lg_not_lot_wait_qty, value);
	}


	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public MCNumber base_unit_grs_wait_qty() {
		return getConstNumber(offset + 120, $base_unit_grs_wait_qty);
	}

	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public void base_unit_grs_wait_qty(MCNumber value) {
		setConstNumber(offset + 120, $base_unit_grs_wait_qty, value);
	}

	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public void base_unit_grs_wait_qty(int value) {
		setConstNumber(offset + 120, $base_unit_grs_wait_qty, value);
	}

	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public void base_unit_grs_wait_qty(long value) {
		setConstNumber(offset + 120, $base_unit_grs_wait_qty, value);
	}

	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public void base_unit_grs_wait_qty(float value) {
		setConstNumber(offset + 120, $base_unit_grs_wait_qty, value);
	}

	/**
	 * Base unit qty. (Gross pending) 基準単位数量（総量保留）.<p>
	 *
	 */
	public void base_unit_grs_wait_qty(double value) {
		setConstNumber(offset + 120, $base_unit_grs_wait_qty, value);
	}


	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public MCNumber base_unit_wait_qty() {
		return getConstNumber(offset + 121, $base_unit_wait_qty);
	}

	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public void base_unit_wait_qty(MCNumber value) {
		setConstNumber(offset + 121, $base_unit_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public void base_unit_wait_qty(int value) {
		setConstNumber(offset + 121, $base_unit_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public void base_unit_wait_qty(long value) {
		setConstNumber(offset + 121, $base_unit_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public void base_unit_wait_qty(float value) {
		setConstNumber(offset + 121, $base_unit_wait_qty, value);
	}

	/**
	 * Base unit qty. (Pending) 基準単位数量（保留）.<p>
	 *
	 */
	public void base_unit_wait_qty(double value) {
		setConstNumber(offset + 121, $base_unit_wait_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 122, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 122, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 122, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 122, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 122, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 122, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 123, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 123, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 124, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 124, $cont_fctr_flg, value);
	}


	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public boolean chk_cont_fctr_flg() {
		return getConstBoolean(offset + 125, $chk_cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public void chk_cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 125, $chk_cont_fctr_flg, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 126, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 126, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 126, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 126, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 126, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 126, $act_cont_fctr, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 127, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 127, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 127, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 127, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 127, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 127, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 128, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 128, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 128, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 128, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 128, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 128, $cont_qty, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 129, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 129, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 130, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 130, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 130, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 130, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 130, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 130, $cont_fctr_dec_place, value);
	}


	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_fix_flg() {
		return getConstBoolean(offset + 131, $not_lot_fix_flg);
	}

	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public void not_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 131, $not_lot_fix_flg, value);
	}


	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 132, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 132, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 133, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 133, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 134, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 134, $vld_dt_fr, value);
	}


	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public MCNumber vld_dt_fr_grp() {
		return getConstNumber(offset + 135, $vld_dt_fr_grp);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 135, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(int value) {
		setConstNumber(offset + 135, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(long value) {
		setConstNumber(offset + 135, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(float value) {
		setConstNumber(offset + 135, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(double value) {
		setConstNumber(offset + 135, $vld_dt_fr_grp, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 136, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 136, $vld_dt_to, value);
	}


	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public MCDate stop_dt() {
		return getConstDate(offset + 137, $stop_dt);
	}

	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public void stop_dt(MCDate value) {
		setConstDate(offset + 137, $stop_dt, value);
	}


	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public MCDate rel_dt() {
		return getConstDate(offset + 138, $rel_dt);
	}

	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public void rel_dt(MCDate value) {
		setConstDate(offset + 138, $rel_dt, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 139, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 139, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 140, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 140, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 141, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 141, $asset_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 142, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 142, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 143, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 143, $sublot_mng_typ, value);
	}


	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 144, $stk_flg);
	}

	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 144, $stk_flg, value);
	}


	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public String stk_info_loc_typ() {
		return getConstString(offset + 145, $stk_info_loc_typ);
	}

	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public void stk_info_loc_typ(String value) {
		setConstString(offset + 145, $stk_info_loc_typ, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber lno() {
		return getConstNumber(offset + 146, $lno);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(MCNumber value) {
		setConstNumber(offset + 146, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(int value) {
		setConstNumber(offset + 146, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(long value) {
		setConstNumber(offset + 146, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(float value) {
		setConstNumber(offset + 146, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(double value) {
		setConstNumber(offset + 146, $lno, value);
	}


	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public String gi_loc_mng_typ() {
		return getConstString(offset + 147, $gi_loc_mng_typ);
	}

	/**
	 * GI controlling site type 出庫管轄区分.<p>
	 *
	 */
	public void gi_loc_mng_typ(String value) {
		setConstString(offset + 147, $gi_loc_mng_typ, value);
	}


	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public String gr_loc_mng_typ() {
		return getConstString(offset + 148, $gr_loc_mng_typ);
	}

	/**
	 * GR controlling site type 入庫管轄区分.<p>
	 *
	 */
	public void gr_loc_mng_typ(String value) {
		setConstString(offset + 148, $gr_loc_mng_typ, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 149, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 149, $gi_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 150, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 150, $gr_site_cd, value);
	}


	/**
	 * GI schedule to be canceled flg. 取消対象出庫予定ＦＬＧ.<p>
	 *
	 */
	public boolean can_gi_flg() {
		return getConstBoolean(offset + 151, $can_gi_flg);
	}

	/**
	 * GI schedule to be canceled flg. 取消対象出庫予定ＦＬＧ.<p>
	 *
	 */
	public void can_gi_flg(boolean value) {
		setConstBoolean(offset + 151, $can_gi_flg, value);
	}


	/**
	 * Not for gross allocation specification flg. 総量引当時対象外ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_grp_non_tgt_flg() {
		return getConstBoolean(offset + 152, $alloc_grp_non_tgt_flg);
	}

	/**
	 * Not for gross allocation specification flg. 総量引当時対象外ＦＬＧ.<p>
	 *
	 */
	public void alloc_grp_non_tgt_flg(boolean value) {
		setConstBoolean(offset + 152, $alloc_grp_non_tgt_flg, value);
	}


	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_grp_srch_flg() {
		return getConstBoolean(offset + 153, $alloc_grp_srch_flg);
	}

	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public void alloc_grp_srch_flg(boolean value) {
		setConstBoolean(offset + 153, $alloc_grp_srch_flg, value);
	}


	/**
	 * GR delay allocation flg. (Temporary use) 入庫遅れ引当ＦＬＧ（一時使用）.<p>
	 *
	 */
	public boolean overdue_alloc_tmp_flg() {
		return getConstBoolean(offset + 154, $overdue_alloc_tmp_flg);
	}

	/**
	 * GR delay allocation flg. (Temporary use) 入庫遅れ引当ＦＬＧ（一時使用）.<p>
	 *
	 */
	public void overdue_alloc_tmp_flg(boolean value) {
		setConstBoolean(offset + 154, $overdue_alloc_tmp_flg, value);
	}


	/**
	 * GR delay allocation flg. 入庫遅れ引当ＦＬＧ.<p>
	 *
	 */
	public boolean overdue_alloc_flg() {
		return getConstBoolean(offset + 155, $overdue_alloc_flg);
	}

	/**
	 * GR delay allocation flg. 入庫遅れ引当ＦＬＧ.<p>
	 *
	 */
	public void overdue_alloc_flg(boolean value) {
		setConstBoolean(offset + 155, $overdue_alloc_flg, value);
	}


	/**
	 * Allocation of different location flg. 場所違い引当ＦＬＧ.<p>
	 *
	 */
	public boolean another_loc_alloc_flg() {
		return getConstBoolean(offset + 156, $another_loc_alloc_flg);
	}

	/**
	 * Allocation of different location flg. 場所違い引当ＦＬＧ.<p>
	 *
	 */
	public void another_loc_alloc_flg(boolean value) {
		setConstBoolean(offset + 156, $another_loc_alloc_flg, value);
	}


	/**
	 * Allocation error flg. 引当異状ＦＬＧ.<p>
	 *
	 */
	public boolean abnormal_alloc_flg() {
		return getConstBoolean(offset + 157, $abnormal_alloc_flg);
	}

	/**
	 * Allocation error flg. 引当異状ＦＬＧ.<p>
	 *
	 */
	public void abnormal_alloc_flg(boolean value) {
		setConstBoolean(offset + 157, $abnormal_alloc_flg, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 158, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 158, $alloc_scope_typ, value);
	}


	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 159, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 159, $not_lg_mix_flg, value);
	}


	/**
	 * Location lot match flg. 場所ロット一致ＦＬＧ.<p>
	 *
	 */
	public boolean loc_lot_flg() {
		return getConstBoolean(offset + 160, $loc_lot_flg);
	}

	/**
	 * Location lot match flg. 場所ロット一致ＦＬＧ.<p>
	 *
	 */
	public void loc_lot_flg(boolean value) {
		setConstBoolean(offset + 160, $loc_lot_flg, value);
	}


	/**
	 * Location match flg. 場所一致ＦＬＧ.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 161, $loc_flg);
	}

	/**
	 * Location match flg. 場所一致ＦＬＧ.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 161, $loc_flg, value);
	}


	/**
	 * Proposal match flg. 提案一致ＦＬＧ.<p>
	 *
	 */
	public boolean tgt_flg() {
		return getConstBoolean(offset + 162, $tgt_flg);
	}

	/**
	 * Proposal match flg. 提案一致ＦＬＧ.<p>
	 *
	 */
	public void tgt_flg(boolean value) {
		setConstBoolean(offset + 162, $tgt_flg, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 163, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 163, $cst_cd, value);
	}


	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 164, $lot_back_stop_typ);
	}

	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 164, $lot_back_stop_typ, value);
	}


	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public boolean chk_ship_flg() {
		return getConstBoolean(offset + 165, $chk_ship_flg);
	}

	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public void chk_ship_flg(boolean value) {
		setConstBoolean(offset + 165, $chk_ship_flg, value);
	}


	/**
	 * Lot trace error flg. ロットトレースエラーＦＬＧ.<p>
	 *
	 */
	public boolean lot_trace_err_flg() {
		return getConstBoolean(offset + 166, $lot_trace_err_flg);
	}

	/**
	 * Lot trace error flg. ロットトレースエラーＦＬＧ.<p>
	 *
	 */
	public void lot_trace_err_flg(boolean value) {
		setConstBoolean(offset + 166, $lot_trace_err_flg, value);
	}


	public String getString(String name) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($stk_alloc_grp_cd.equalsIgnoreCase(name)) {
			return stk_alloc_grp_cd();
		}
		if ($stk_lg_grp_cd.equalsIgnoreCase(name)) {
			return stk_lg_grp_cd();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_sppl_cd.equalsIgnoreCase(name)) {
			return stk_sppl_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			return rqst_sno1();
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			return rqst_sno2();
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			return rqst_sno3();
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			return rqst_sno4();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			return gi_loc_mng_typ();
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			return gr_loc_mng_typ();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			return schd_stk_prio();
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			return pack_unit_src_qty();
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_qty();
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_qty();
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_qty();
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_alloc_qty();
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_alloc_qty();
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_alloc_qty();
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_alloc_qty();
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_grs_alloc_qty();
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_alloc_qty();
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_wait_qty();
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_wait_qty();
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_wait_qty();
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_wait_qty();
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_grs_wait_qty();
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_wait_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			return base_unit_src_qty();
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_qty();
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_qty();
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_qty();
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_alloc_qty();
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_alloc_qty();
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_alloc_qty();
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_alloc_qty();
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_grs_alloc_qty();
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_alloc_qty();
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_wait_qty();
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_wait_qty();
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_wait_qty();
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_wait_qty();
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_grs_wait_qty();
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_wait_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			return vld_dt_fr_grp();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			return inpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($stop_dt.equalsIgnoreCase(name)) {
			return stop_dt();
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			return rel_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($alt_flg.equalsIgnoreCase(name)) {
			return alt_flg();
		}
		if ($stk_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return stk_str_ln_tgt_flg();
		}
		if ($stk_ln_flg.equalsIgnoreCase(name)) {
			return stk_ln_flg();
		}
		if ($stk_alloc_lmt_flg.equalsIgnoreCase(name)) {
			return stk_alloc_lmt_flg();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chk_cont_fctr_flg();
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($can_gi_flg.equalsIgnoreCase(name)) {
			return can_gi_flg();
		}
		if ($alloc_grp_non_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_grp_non_tgt_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($overdue_alloc_tmp_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_tmp_flg();
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_flg();
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			return another_loc_alloc_flg();
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			return abnormal_alloc_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($loc_lot_flg.equalsIgnoreCase(name)) {
			return loc_lot_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			return tgt_flg();
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			return chk_ship_flg();
		}
		if ($lot_trace_err_flg.equalsIgnoreCase(name)) {
			return lot_trace_err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_sppl_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($stk_alloc_grp_cd.equalsIgnoreCase(name)) {
			return stk_alloc_grp_cd();
		}
		if ($stk_lg_grp_cd.equalsIgnoreCase(name)) {
			return stk_lg_grp_cd();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_sppl_cd.equalsIgnoreCase(name)) {
			return stk_sppl_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			return rqst_sno1();
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			return rqst_sno2();
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			return rqst_sno3();
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			return rqst_sno4();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			return gi_loc_mng_typ();
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			return gr_loc_mng_typ();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			return schd_stk_prio();
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($prio2.equalsIgnoreCase(name)) {
			return prio2();
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			return pack_unit_src_qty();
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_qty();
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_qty();
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_qty();
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_qty();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_alloc_qty();
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_alloc_qty();
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_alloc_qty();
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_alloc_qty();
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_grs_alloc_qty();
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			return pack_unit_alloc_qty();
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lot_wait_qty();
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_not_lot_wait_qty();
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_lot_wait_qty();
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_lg_not_lot_wait_qty();
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_grs_wait_qty();
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			return pack_unit_wait_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			return base_unit_src_qty();
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_qty();
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_qty();
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_qty();
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_alloc_qty();
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_alloc_qty();
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_alloc_qty();
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_alloc_qty();
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_grs_alloc_qty();
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_alloc_qty();
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lot_wait_qty();
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_not_lot_wait_qty();
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_lot_wait_qty();
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_lg_not_lot_wait_qty();
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_grs_wait_qty();
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_wait_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			return vld_dt_fr_grp();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			return inpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($stop_dt.equalsIgnoreCase(name)) {
			return stop_dt();
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			return rel_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($alt_flg.equalsIgnoreCase(name)) {
			return alt_flg();
		}
		if ($stk_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return stk_str_ln_tgt_flg();
		}
		if ($stk_ln_flg.equalsIgnoreCase(name)) {
			return stk_ln_flg();
		}
		if ($stk_alloc_lmt_flg.equalsIgnoreCase(name)) {
			return stk_alloc_lmt_flg();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chk_cont_fctr_flg();
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($can_gi_flg.equalsIgnoreCase(name)) {
			return can_gi_flg();
		}
		if ($alloc_grp_non_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_grp_non_tgt_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($overdue_alloc_tmp_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_tmp_flg();
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_flg();
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			return another_loc_alloc_flg();
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			return abnormal_alloc_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($loc_lot_flg.equalsIgnoreCase(name)) {
			return loc_lot_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			return tgt_flg();
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			return chk_ship_flg();
		}
		if ($lot_trace_err_flg.equalsIgnoreCase(name)) {
			return lot_trace_err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($stk_alloc_grp_cd.equalsIgnoreCase(name)) {
			stk_alloc_grp_cd(value);
			return;
		}
		if ($stk_lg_grp_cd.equalsIgnoreCase(name)) {
			stk_lg_grp_cd(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_sppl_cd.equalsIgnoreCase(name)) {
			stk_sppl_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			rqst_sno1(value);
			return;
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			rqst_sno2(value);
			return;
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			rqst_sno3(value);
			return;
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			rqst_sno4(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			gi_loc_mng_typ(value);
			return;
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			gr_loc_mng_typ(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			inpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
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
		if ($stop_dt.equalsIgnoreCase(name)) {
			stop_dt(value);
			return;
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			rel_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($alt_flg.equalsIgnoreCase(name)) {
			alt_flg(value);
			return;
		}
		if ($stk_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			stk_str_ln_tgt_flg(value);
			return;
		}
		if ($stk_ln_flg.equalsIgnoreCase(name)) {
			stk_ln_flg(value);
			return;
		}
		if ($stk_alloc_lmt_flg.equalsIgnoreCase(name)) {
			stk_alloc_lmt_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			chk_cont_fctr_flg(value);
			return;
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($can_gi_flg.equalsIgnoreCase(name)) {
			can_gi_flg(value);
			return;
		}
		if ($alloc_grp_non_tgt_flg.equalsIgnoreCase(name)) {
			alloc_grp_non_tgt_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($overdue_alloc_tmp_flg.equalsIgnoreCase(name)) {
			overdue_alloc_tmp_flg(value);
			return;
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			overdue_alloc_flg(value);
			return;
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			another_loc_alloc_flg(value);
			return;
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			abnormal_alloc_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($loc_lot_flg.equalsIgnoreCase(name)) {
			loc_lot_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			tgt_flg(value);
			return;
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			chk_ship_flg(value);
			return;
		}
		if ($lot_trace_err_flg.equalsIgnoreCase(name)) {
			lot_trace_err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_sppl_cd.equalsIgnoreCase(name)) {
			inpt_sppl_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($stk_alloc_grp_cd.equalsIgnoreCase(name)) {
			stk_alloc_grp_cd(value);
			return;
		}
		if ($stk_lg_grp_cd.equalsIgnoreCase(name)) {
			stk_lg_grp_cd(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_sppl_cd.equalsIgnoreCase(name)) {
			stk_sppl_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($rqst_sno1.equalsIgnoreCase(name)) {
			rqst_sno1(value);
			return;
		}
		if ($rqst_sno2.equalsIgnoreCase(name)) {
			rqst_sno2(value);
			return;
		}
		if ($rqst_sno3.equalsIgnoreCase(name)) {
			rqst_sno3(value);
			return;
		}
		if ($rqst_sno4.equalsIgnoreCase(name)) {
			rqst_sno4(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		if ($gi_loc_mng_typ.equalsIgnoreCase(name)) {
			gi_loc_mng_typ(value);
			return;
		}
		if ($gr_loc_mng_typ.equalsIgnoreCase(name)) {
			gr_loc_mng_typ(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_stk_prio.equalsIgnoreCase(name)) {
			schd_stk_prio(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($prio2.equalsIgnoreCase(name)) {
			prio2(value);
			return;
		}
		if ($pack_unit_src_qty.equalsIgnoreCase(name)) {
			pack_unit_src_qty(value);
			return;
		}
		if ($pack_unit_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_qty(value);
			return;
		}
		if ($pack_unit_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_qty(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($pack_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_alloc_qty(value);
			return;
		}
		if ($pack_unit_alloc_qty.equalsIgnoreCase(name)) {
			pack_unit_alloc_qty(value);
			return;
		}
		if ($pack_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($pack_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_grs_wait_qty(value);
			return;
		}
		if ($pack_unit_wait_qty.equalsIgnoreCase(name)) {
			pack_unit_wait_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_src_qty.equalsIgnoreCase(name)) {
			base_unit_src_qty(value);
			return;
		}
		if ($base_unit_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lot_qty(value);
			return;
		}
		if ($base_unit_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_qty(value);
			return;
		}
		if ($base_unit_lg_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_alloc_qty(value);
			return;
		}
		if ($base_unit_grs_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_grs_alloc_qty(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lot_wait_qty(value);
			return;
		}
		if ($base_unit_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_lot_wait_qty(value);
			return;
		}
		if ($base_unit_lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			base_unit_lg_not_lot_wait_qty(value);
			return;
		}
		if ($base_unit_grs_wait_qty.equalsIgnoreCase(name)) {
			base_unit_grs_wait_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			inpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
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
		if ($stop_dt.equalsIgnoreCase(name)) {
			stop_dt(value);
			return;
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			rel_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($alt_flg.equalsIgnoreCase(name)) {
			alt_flg(value);
			return;
		}
		if ($stk_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			stk_str_ln_tgt_flg(value);
			return;
		}
		if ($stk_ln_flg.equalsIgnoreCase(name)) {
			stk_ln_flg(value);
			return;
		}
		if ($stk_alloc_lmt_flg.equalsIgnoreCase(name)) {
			stk_alloc_lmt_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			chk_cont_fctr_flg(value);
			return;
		}
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($can_gi_flg.equalsIgnoreCase(name)) {
			can_gi_flg(value);
			return;
		}
		if ($alloc_grp_non_tgt_flg.equalsIgnoreCase(name)) {
			alloc_grp_non_tgt_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($overdue_alloc_tmp_flg.equalsIgnoreCase(name)) {
			overdue_alloc_tmp_flg(value);
			return;
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			overdue_alloc_flg(value);
			return;
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			another_loc_alloc_flg(value);
			return;
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			abnormal_alloc_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($loc_lot_flg.equalsIgnoreCase(name)) {
			loc_lot_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($tgt_flg.equalsIgnoreCase(name)) {
			tgt_flg(value);
			return;
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			chk_ship_flg(value);
			return;
		}
		if ($lot_trace_err_flg.equalsIgnoreCase(name)) {
			lot_trace_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

