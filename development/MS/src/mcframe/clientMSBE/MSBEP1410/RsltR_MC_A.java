package mcframe.clientMSBE.MSBEP1410;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public static final String $ship_abl_flg = "ship_abl_flg";
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public static final String $alloc_tgt_flg = "alloc_tgt_flg";
	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public static final String $lot_prop_flg = "lot_prop_flg";
	/**
	 * Packing 梱包.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	public static final String $ship_schd_tm_p = "ship_schd_tm_p";
	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public static final String $ship_schd_time = "ship_schd_time";
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	public static final String $dlv_schd_tm_p = "dlv_schd_tm_p";
	public static final String $ship_inst_tm_p = "ship_inst_tm_p";
	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	public static final String $ship_to_addr_p = "ship_to_addr_p";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
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
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_grp_cd = "ship_wk_grp_cd";
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public static final String $ship_wk_grp_nm = "ship_wk_grp_nm";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $pick_prnt_flg = "pick_prnt_flg";
	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $adv_prnt_flg = "adv_prnt_flg";
	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public static final String $num_of_details = "num_of_details";
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
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public static final String $pd_inst_dlv_dt = "pd_inst_dlv_dt";
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public static final String $pd_inst_dlv_hm = "pd_inst_dlv_hm";
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public static final String $ship_rqst_dt = "ship_rqst_dt";
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public static final String $ship_rqst_hm = "ship_rqst_hm";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public static final String $assort_typ_nm = "assort_typ_nm";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
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
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public static final String $alloc_typ_nm = "alloc_typ_nm";
	/**
	 * Location allocated 場所引当済.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Gross allocated 総量引当済.<p>
	 *
	 */
	public static final String $grp_alloc_flg = "grp_alloc_flg";
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public static final String $ship_str_ln_nm = "ship_str_ln_nm";
	/**
	 * Without Shipping rack/line 出荷棚・ラインなし.<p>
	 *
	 */
	public static final String $ship_str_ln_cd_none_flg = "ship_str_ln_cd_none_flg";
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
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	public static final String $ship_act_qty_p = "ship_act_qty_p";
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
	public static final String $usr_dpt_p = "usr_dpt_p";
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
	 * Order remarks 指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
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
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public static final String $iv_ship_flg = "iv_ship_flg";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * Result split 実績分割.<p>
	 *
	 */
	public static final String $act_split_flg = "act_split_flg";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public static final String $pick_prnted_flg = "pick_prnted_flg";
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public static final String $inst_prnted_flg = "inst_prnted_flg";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnted_flg = "dlv_prnted_flg";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $adv_prnted_flg = "adv_prnted_flg";
	/**
	 * Not for packing 梱包不可.<p>
	 *
	 */
	public static final String $pack_disable_flg = "pack_disable_flg";
	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public static final String $non_dlv_prnt_flg = "non_dlv_prnt_flg";
	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public static final String $non_adv_prnt_flg = "non_adv_prnt_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	public static final String $ship_to_grp_p = "ship_to_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $rts_msg_p = "rts_msg_p";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public static final String $ship_inst_upd_cntr = "ship_inst_upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public static final String $list_no = "list_no";

	public static final String $ship_schd_dt = $ship_schd_tm_p + ".ymd";
	public static final String $ship_schd_hm = $ship_schd_tm_p + ".hm";
	public static final String $dlv_schd_dt = $dlv_schd_tm_p + ".ymd";
	public static final String $dlv_schd_hm = $dlv_schd_tm_p + ".hm";
	public static final String $ship_inst_dt = $ship_inst_tm_p + ".ymd";
	public static final String $ship_inst_hm = $ship_inst_tm_p + ".hm";
	public static final String $cntry_cd = $ship_to_addr_p + ".cntry_cd";
	public static final String $cntry_nm = $ship_to_addr_p + ".cntry_nm";
	public static final String $ship_to_zip_cd = $ship_to_addr_p + ".zip_cd";
	public static final String $ship_to_addr1 = $ship_to_addr_p + ".addr1";
	public static final String $ship_to_addr2 = $ship_to_addr_p + ".addr2";
	public static final String $ship_to_addr3 = $ship_to_addr_p + ".addr3";
	public static final String $ship_to_addr4 = $ship_to_addr_p + ".addr4";
	public static final String $ship_to_cntct_dpt = $ship_to_addr_p + ".cntct_dpt";
	public static final String $ship_to_cntct_psn = $ship_to_addr_p + ".cntct_psn";
	public static final String $ship_to_tel = $ship_to_addr_p + ".tel";
	public static final String $ship_to_fax = $ship_to_addr_p + ".fax";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $ship_act_qty = $ship_act_qty_p + ".qty";
	public static final String $inst_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $ship_to_grp_cd1 = $ship_to_grp_p + ".bp_grp_cd1";
	public static final String $ship_to_grp_nm1 = $ship_to_grp_p + ".bp_grp_nm1";
	public static final String $ship_to_grp_cd2 = $ship_to_grp_p + ".bp_grp_cd2";
	public static final String $ship_to_grp_nm2 = $ship_to_grp_p + ".bp_grp_nm2";
	public static final String $ship_to_grp_cd3 = $ship_to_grp_p + ".bp_grp_cd3";
	public static final String $ship_to_grp_nm3 = $ship_to_grp_p + ".bp_grp_nm3";
	public static final String $ship_to_grp_cd4 = $ship_to_grp_p + ".bp_grp_cd4";
	public static final String $ship_to_grp_nm4 = $ship_to_grp_p + ".bp_grp_nm4";
	public static final String $ship_to_grp_cd5 = $ship_to_grp_p + ".bp_grp_cd5";
	public static final String $ship_to_grp_nm5 = $ship_to_grp_p + ".bp_grp_nm5";
	public static final String $ship_to_grp_cd6 = $ship_to_grp_p + ".bp_grp_cd6";
	public static final String $ship_to_grp_nm6 = $ship_to_grp_p + ".bp_grp_nm6";
	public static final String $ship_to_grp_cd7 = $ship_to_grp_p + ".bp_grp_cd7";
	public static final String $ship_to_grp_nm7 = $ship_to_grp_p + ".bp_grp_nm7";
	public static final String $ship_to_grp_cd8 = $ship_to_grp_p + ".bp_grp_cd8";
	public static final String $ship_to_grp_nm8 = $ship_to_grp_p + ".bp_grp_nm8";
	public static final String $ship_to_grp_cd9 = $ship_to_grp_p + ".bp_grp_cd9";
	public static final String $ship_to_grp_nm9 = $ship_to_grp_p + ".bp_grp_nm9";
	public static final String $ship_to_grp_cd10 = $ship_to_grp_p + ".bp_grp_cd10";
	public static final String $ship_to_grp_nm10 = $ship_to_grp_p + ".bp_grp_nm10";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rtn_sts_typ_nm = $rts_msg_p + ".rtn_sts_typ_nm";
	public static final String $msg_id = $rts_msg_p + ".msg_id";
	public static final String $msg = $rts_msg_p + ".msg";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta ship_abl_flg_META = createCommonMeta($ship_abl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_tgt_flg_META = createCommonMeta($alloc_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_prop_flg_META = createCommonMeta($lot_prop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_tm_p_META = createInnerRowMeta($ship_schd_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ship_schd_time_META = createCommonMeta($ship_schd_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_schd_tm_p_META = createInnerRowMeta($dlv_schd_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ship_inst_tm_p_META = createInnerRowMeta($ship_inst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_addr_p_META = createInnerRowMeta($ship_to_addr_p, mcframe.clientMAUB.MAUBP5360.AddrR.class);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta ship_wk_grp_nm_META = createCommonMeta($ship_wk_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_NM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta pick_prnt_flg_META = createCommonMeta($pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnt_flg_META = createCommonMeta($adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_of_details_META = createCommonMeta($num_of_details, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pd_inst_dlv_dt_META = createCommonMeta($pd_inst_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pd_inst_dlv_hm_META = createCommonMeta($pd_inst_dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta dlv_day_week_typ_nm_META = createCommonMeta($dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta ship_rqst_dt_META = createCommonMeta($ship_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_hm_META = createCommonMeta($ship_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta assort_typ_nm_META = createCommonMeta($assort_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP_NM);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_typ_nm_META = createCommonMeta($alloc_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_TYP_NM);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta grp_alloc_flg_META = createCommonMeta($grp_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_str_ln_nm_META = createCommonMeta($ship_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ship_str_ln_cd_none_flg_META = createCommonMeta($ship_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_act_qty_p_META = createInnerRowMeta($ship_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ship_wt_META = createCommonMeta($ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ship_dim_META = createCommonMeta($ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR3);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR3);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_ship_flg_META = createCommonMeta($iv_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_split_flg_META = createCommonMeta($act_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta pick_prnted_flg_META = createCommonMeta($pick_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnted_flg_META = createCommonMeta($inst_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnted_flg_META = createCommonMeta($dlv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnted_flg_META = createCommonMeta($adv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_disable_flg_META = createCommonMeta($pack_disable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_dlv_prnt_flg_META = createCommonMeta($non_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_adv_prnt_flg_META = createCommonMeta($non_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_to_grp_p_META = createInnerRowMeta($ship_to_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ship_inst_upd_cntr_META = createCommonMeta($ship_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta list_no_META = createCommonMeta($list_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			ship_abl_flg_META,
			alloc_tgt_flg_META,
			lot_prop_flg_META,
			pack_flg_META,
			ship_schd_tm_p_META,
			ship_schd_time_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			dlv_schd_tm_p_META,
			ship_inst_tm_p_META,
			dlv_rqst_tm_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			wg_cd_META,
			ship_to_lg_grp_cd_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_addr_p_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_wk_grp_cd_META,
			ship_wk_grp_nm_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			pick_prnt_flg_META,
			inst_prnt_flg_META,
			dlv_prnt_flg_META,
			adv_prnt_flg_META,
			num_of_details_META,
			trd_cd_META,
			trd_nm_META,
			cst_cd_META,
			cst_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			ship_block_flg_META,
			pd_inst_dlv_dt_META,
			pd_inst_dlv_hm_META,
			dlv_day_week_typ_META,
			dlv_day_week_typ_nm_META,
			ship_rqst_dt_META,
			ship_rqst_hm_META,
			assort_typ_META,
			assort_typ_nm_META,
			set_itm_grp_no_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			iv_itm_nm_META,
			sno_wrk_no_p_META,
			abort_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			act_cont_qty_p_META,
			act_cont_fctr_p_META,
			std_cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			alloc_scope_typ_META,
			alloc_typ_META,
			alloc_typ_nm_META,
			alloc_flg_META,
			grp_alloc_flg_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_cd_META,
			ship_str_ln_nm_META,
			ship_str_ln_cd_none_flg_META,
			lot_no_META,
			sublot_no_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			ship_act_qty_p_META,
			ship_wt_META,
			ship_dim_META,
			usr_dpt_p_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			ship_cnt_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			inst_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			inst_d_rmrks_META,
			intr_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			ship_schd_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			wms_flg_META,
			disp_seq_META,
			xfr_schd_no_META,
			slo_d_no_META,
			slo_no_META,
			iv_no_META,
			iv_ship_flg_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			act_split_flg_META,
			ship_alloc_sts_no_META,
			pick_prnted_flg_META,
			inst_prnted_flg_META,
			dlv_prnted_flg_META,
			adv_prnted_flg_META,
			pack_disable_flg_META,
			non_dlv_prnt_flg_META,
			non_adv_prnt_flg_META,
			can_flg_META,
			ship_to_grp_p_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_p_META,
			rts_msg_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			ship_inst_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			list_no_META
		},
		new String[][]{
			{
				"ship_schd_dt",
				"ship_schd_hm",
				"dlv_schd_dt",
				"dlv_schd_hm",
				"ship_inst_dt",
				"ship_inst_hm",
				"cntry_cd",
				"cntry_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"act_cont_qty",
				"act_cont_fctr",
				"std_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"ship_act_qty",
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm",
				"ship_to_grp_cd1",
				"ship_to_grp_nm1",
				"ship_to_grp_cd2",
				"ship_to_grp_nm2",
				"ship_to_grp_cd3",
				"ship_to_grp_nm3",
				"ship_to_grp_cd4",
				"ship_to_grp_nm4",
				"ship_to_grp_cd5",
				"ship_to_grp_nm5",
				"ship_to_grp_cd6",
				"ship_to_grp_nm6",
				"ship_to_grp_cd7",
				"ship_to_grp_nm7",
				"ship_to_grp_cd8",
				"ship_to_grp_nm8",
				"ship_to_grp_cd9",
				"ship_to_grp_nm9",
				"ship_to_grp_cd10",
				"ship_to_grp_nm10",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_cd10",
				"cst_grp_nm10",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_cd10",
				"itm_grp_nm10",
				"rtn_sts_typ",
				"rtn_sts_typ_nm",
				"msg_id",
				"msg"
			},
			{
				$ship_schd_dt,
				$ship_schd_hm,
				$dlv_schd_dt,
				$dlv_schd_hm,
				$ship_inst_dt,
				$ship_inst_hm,
				$cntry_cd,
				$cntry_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$act_cont_qty,
				$act_cont_fctr,
				$std_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$ship_act_qty,
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_dpt_cd,
				$inst_dpt_nm,
				$ship_to_grp_cd1,
				$ship_to_grp_nm1,
				$ship_to_grp_cd2,
				$ship_to_grp_nm2,
				$ship_to_grp_cd3,
				$ship_to_grp_nm3,
				$ship_to_grp_cd4,
				$ship_to_grp_nm4,
				$ship_to_grp_cd5,
				$ship_to_grp_nm5,
				$ship_to_grp_cd6,
				$ship_to_grp_nm6,
				$ship_to_grp_cd7,
				$ship_to_grp_nm7,
				$ship_to_grp_cd8,
				$ship_to_grp_nm8,
				$ship_to_grp_cd9,
				$ship_to_grp_nm9,
				$ship_to_grp_cd10,
				$ship_to_grp_nm10,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_cd10,
				$cst_grp_nm10,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_cd10,
				$itm_grp_nm10,
				$rtn_sts_typ,
				$rtn_sts_typ_nm,
				$msg_id,
				$msg
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
				{$ship_wk_cd, "ship_wk_nm"},	// ship_wk_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ship_wk_cd, "ship_wk_grp_cd;ship_schd_time"},	// ship_wk_cd
				{$usr_dpt_p + ".dpt_cd", "ship_inst_dt;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.SHIP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ship_wk_cd, "ship_wk_grp_cd;ship_schd_time"},	// ship_wk_cd
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dlv_rqst_hm, "TM"},	// dlv_rqst_hm
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"},	// ship_fr_lg_grp_nm
				{$wg_cd, "WG"},	// wg_cd
				{$ship_to_lg_grp_cd, "LG_GRP"},	// ship_to_lg_grp_cd
				{$pd_inst_dlv_hm, "TM"},	// pd_inst_dlv_hm
				{$ship_rqst_hm, "TM"},	// ship_rqst_hm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$ship_str_ln_cd, "STR_LN"},	// ship_str_ln_cd
				{$ship_str_ln_nm, "STR_LN"},	// ship_str_ln_nm
				{$ship_str_ln_cd_none_flg, "STR_LN"},	// ship_str_ln_cd_none_flg
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 1, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 1, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 2, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 2, $pr_sts_typ_nm, value);
	}


	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public boolean ship_abl_flg() {
		return getConstBoolean(offset + 3, $ship_abl_flg);
	}

	/**
	 * Shipping decision 出荷判定.<p>
	 *
	 */
	public void ship_abl_flg(boolean value) {
		setConstBoolean(offset + 3, $ship_abl_flg, value);
	}


	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public boolean alloc_tgt_flg() {
		return getConstBoolean(offset + 4, $alloc_tgt_flg);
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public void alloc_tgt_flg(boolean value) {
		setConstBoolean(offset + 4, $alloc_tgt_flg, value);
	}


	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public boolean lot_prop_flg() {
		return getConstBoolean(offset + 5, $lot_prop_flg);
	}

	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public void lot_prop_flg(boolean value) {
		setConstBoolean(offset + 5, $lot_prop_flg, value);
	}


	/**
	 * Packing 梱包.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 6, $pack_flg);
	}

	/**
	 * Packing 梱包.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 6, $pack_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_schd_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 7, $ship_schd_tm_p);
	}
	
	public void ship_schd_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 7, $ship_schd_tm_p, row);
	}


	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public String ship_schd_time() {
		return getConstString(offset + 8, $ship_schd_time);
	}

	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public void ship_schd_time(String value) {
		setConstString(offset + 8, $ship_schd_time, value);
	}


	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 9, $dlv_rqst_dt);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 9, $dlv_rqst_dt, value);
	}


	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 10, $dlv_rqst_hm);
	}

	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 10, $dlv_rqst_hm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_schd_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 11, $dlv_schd_tm_p);
	}
	
	public void dlv_schd_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 11, $dlv_schd_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_inst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 12, $ship_inst_tm_p);
	}
	
	public void ship_inst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 12, $ship_inst_tm_p, row);
	}


	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 13, $dlv_rqst_tm);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 13, $dlv_rqst_tm, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 14, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 14, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 15, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 15, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 16, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 16, $wg_cd, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 17, $ship_to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 17, $ship_to_lg_grp_cd, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 18, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 18, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 19, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 19, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 20, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 20, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 21, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 21, $ship_to_id_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5360.AddrR ship_to_addr_p(){
		return (mcframe.clientMAUB.MAUBP5360.AddrR) getConstInnerRow(offset + 22, $ship_to_addr_p);
	}
	
	public void ship_to_addr_p(mcframe.clientMAUB.MAUBP5360.AddrR row){
		setConstInnerRow(offset + 22, $ship_to_addr_p, row);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 23, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 23, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 24, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 24, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 25, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 25, $via_dlv_typ_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 26, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 26, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 27, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 27, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 28, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 28, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 29, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 29, $dlv_id_nm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 30, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 30, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 31, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 31, $ship_term_nm, value);
	}


	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 32, $ship_wk_grp_cd);
	}

	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 32, $ship_wk_grp_cd, value);
	}


	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public String ship_wk_grp_nm() {
		return getConstString(offset + 33, $ship_wk_grp_nm);
	}

	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public void ship_wk_grp_nm(String value) {
		setConstString(offset + 33, $ship_wk_grp_nm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 34, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 34, $ship_wk_cd, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 35, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 35, $ship_wk_nm, value);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return getConstBoolean(offset + 36, $pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 36, $pick_prnt_flg, value);
	}


	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 37, $inst_prnt_flg);
	}

	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 37, $inst_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 38, $dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 38, $dlv_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean adv_prnt_flg() {
		return getConstBoolean(offset + 39, $adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 39, $adv_prnt_flg, value);
	}


	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public MCNumber num_of_details() {
		return getConstNumber(offset + 40, $num_of_details);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void num_of_details(MCNumber value) {
		setConstNumber(offset + 40, $num_of_details, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void num_of_details(int value) {
		setConstNumber(offset + 40, $num_of_details, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void num_of_details(long value) {
		setConstNumber(offset + 40, $num_of_details, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void num_of_details(float value) {
		setConstNumber(offset + 40, $num_of_details, value);
	}

	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public void num_of_details(double value) {
		setConstNumber(offset + 40, $num_of_details, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 41, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 41, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 42, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 42, $trd_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 43, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 43, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 44, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 44, $cst_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 45, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 45, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 46, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 46, $rqst_dpt_nm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 47, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 47, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 48, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 48, $rqst_usr_nm, value);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 49, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 49, $ship_block_flg, value);
	}


	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt() {
		return getConstDate(offset + 50, $pd_inst_dlv_dt);
	}

	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public void pd_inst_dlv_dt(MCDate value) {
		setConstDate(offset + 50, $pd_inst_dlv_dt, value);
	}


	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm() {
		return getConstDate(offset + 51, $pd_inst_dlv_hm);
	}

	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public void pd_inst_dlv_hm(MCDate value) {
		setConstDate(offset + 51, $pd_inst_dlv_hm, value);
	}


	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 52, $dlv_day_week_typ);
	}

	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 52, $dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ_nm() {
		return getConstString(offset + 53, $dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ_nm(String value) {
		setConstString(offset + 53, $dlv_day_week_typ_nm, value);
	}


	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return getConstDate(offset + 54, $ship_rqst_dt);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		setConstDate(offset + 54, $ship_rqst_dt, value);
	}


	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return getConstDate(offset + 55, $ship_rqst_hm);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		setConstDate(offset + 55, $ship_rqst_hm, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 56, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 56, $assort_typ, value);
	}


	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public String assort_typ_nm() {
		return getConstString(offset + 57, $assort_typ_nm);
	}

	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public void assort_typ_nm(String value) {
		setConstString(offset + 57, $assort_typ_nm, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 58, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 58, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 58, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 58, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 58, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 58, $set_itm_grp_no, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 59, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 59, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 60, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 60, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 61, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 61, $cst_itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 62, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 62, $iv_itm_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 63, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 63, $sno_wrk_no_p, row);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 64, $abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 64, $abort_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 65, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 65, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 66, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 66, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 67, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 68, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 68, $trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 69, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 69, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 70, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 70, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 71, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 71, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 72, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 72, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 72, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 72, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 72, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 72, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 73, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 73, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 74, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 74, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 75, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 75, $act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 76, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 76, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 77, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 77, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 78, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 78, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 79, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 79, $std_cont_fctr_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 80, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 80, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 81, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 82, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 82, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 83, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 83, $alloc_scope_typ, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 84, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 84, $alloc_typ, value);
	}


	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public String alloc_typ_nm() {
		return getConstString(offset + 85, $alloc_typ_nm);
	}

	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public void alloc_typ_nm(String value) {
		setConstString(offset + 85, $alloc_typ_nm, value);
	}


	/**
	 * Location allocated 場所引当済.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 86, $alloc_flg);
	}

	/**
	 * Location allocated 場所引当済.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 86, $alloc_flg, value);
	}


	/**
	 * Gross allocated 総量引当済.<p>
	 *
	 */
	public boolean grp_alloc_flg() {
		return getConstBoolean(offset + 87, $grp_alloc_flg);
	}

	/**
	 * Gross allocated 総量引当済.<p>
	 *
	 */
	public void grp_alloc_flg(boolean value) {
		setConstBoolean(offset + 87, $grp_alloc_flg, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 88, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 88, $ship_loc_cd, value);
	}


	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 89, $ship_loc_nm);
	}

	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 89, $ship_loc_nm, value);
	}


	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 90, $ship_str_ln_cd);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 90, $ship_str_ln_cd, value);
	}


	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return getConstString(offset + 91, $ship_str_ln_nm);
	}

	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		setConstString(offset + 91, $ship_str_ln_nm, value);
	}


	/**
	 * Without Shipping rack/line 出荷棚・ラインなし.<p>
	 *
	 */
	public boolean ship_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 92, $ship_str_ln_cd_none_flg);
	}

	/**
	 * Without Shipping rack/line 出荷棚・ラインなし.<p>
	 *
	 */
	public void ship_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 92, $ship_str_ln_cd_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 93, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 93, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 94, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 94, $sublot_no, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 95, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 95, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 96, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 96, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 97, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 97, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 98, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 98, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 99, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 99, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 100, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 100, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 101, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 101, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 102, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 102, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 103, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 103, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 104, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 104, $stk_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 105, $ship_act_qty_p);
	}
	
	public void ship_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 105, $ship_act_qty_p, row);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber ship_wt() {
		return getConstNumber(offset + 106, $ship_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(MCNumber value) {
		setConstNumber(offset + 106, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(int value) {
		setConstNumber(offset + 106, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(long value) {
		setConstNumber(offset + 106, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(float value) {
		setConstNumber(offset + 106, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(double value) {
		setConstNumber(offset + 106, $ship_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber ship_dim() {
		return getConstNumber(offset + 107, $ship_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(MCNumber value) {
		setConstNumber(offset + 107, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(int value) {
		setConstNumber(offset + 107, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(long value) {
		setConstNumber(offset + 107, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(float value) {
		setConstNumber(offset + 107, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(double value) {
		setConstNumber(offset + 107, $ship_dim, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 108, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 108, $usr_dpt_p, row);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 109, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 109, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 110, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 110, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 111, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 111, $base_ac_dt, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 112, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 112, $ship_cnt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 113, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 113, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 114, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 114, $trd_d_rmrks, value);
	}


	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 115, $inst_rmrks);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 115, $inst_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 116, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 116, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 117, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 117, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 118, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 118, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 119, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 119, $sub_char3, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 120, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 120, $inst_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 121, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 121, $intr_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 122, $d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 122, $d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 123, $d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 123, $d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 124, $d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 124, $d_sub_char3, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 125, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 125, $ship_schd_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 126, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 126, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 127, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 127, $ship_inst_d_no, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 128, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 128, $wms_flg, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 129, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 129, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 129, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 129, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 129, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 129, $disp_seq, value);
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
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 131, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 131, $slo_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 132, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 132, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 133, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 133, $iv_no, value);
	}


	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public boolean iv_ship_flg() {
		return getConstBoolean(offset + 134, $iv_ship_flg);
	}

	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public void iv_ship_flg(boolean value) {
		setConstBoolean(offset + 134, $iv_ship_flg, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 135, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 135, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 136, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 137, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}


	/**
	 * Result split 実績分割.<p>
	 *
	 */
	public boolean act_split_flg() {
		return getConstBoolean(offset + 138, $act_split_flg);
	}

	/**
	 * Result split 実績分割.<p>
	 *
	 */
	public void act_split_flg(boolean value) {
		setConstBoolean(offset + 138, $act_split_flg, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 139, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 139, $ship_alloc_sts_no, value);
	}


	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnted_flg() {
		return getConstBoolean(offset + 140, $pick_prnted_flg);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnted_flg(boolean value) {
		setConstBoolean(offset + 140, $pick_prnted_flg, value);
	}


	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public boolean inst_prnted_flg() {
		return getConstBoolean(offset + 141, $inst_prnted_flg);
	}

	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public void inst_prnted_flg(boolean value) {
		setConstBoolean(offset + 141, $inst_prnted_flg, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnted_flg() {
		return getConstBoolean(offset + 142, $dlv_prnted_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnted_flg(boolean value) {
		setConstBoolean(offset + 142, $dlv_prnted_flg, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean adv_prnted_flg() {
		return getConstBoolean(offset + 143, $adv_prnted_flg);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void adv_prnted_flg(boolean value) {
		setConstBoolean(offset + 143, $adv_prnted_flg, value);
	}


	/**
	 * Not for packing 梱包不可.<p>
	 *
	 */
	public boolean pack_disable_flg() {
		return getConstBoolean(offset + 144, $pack_disable_flg);
	}

	/**
	 * Not for packing 梱包不可.<p>
	 *
	 */
	public void pack_disable_flg(boolean value) {
		setConstBoolean(offset + 144, $pack_disable_flg, value);
	}


	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public boolean non_dlv_prnt_flg() {
		return getConstBoolean(offset + 145, $non_dlv_prnt_flg);
	}

	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public void non_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 145, $non_dlv_prnt_flg, value);
	}


	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public boolean non_adv_prnt_flg() {
		return getConstBoolean(offset + 146, $non_adv_prnt_flg);
	}

	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public void non_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 146, $non_adv_prnt_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 147, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 147, $can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR ship_to_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 148, $ship_to_grp_p);
	}
	
	public void ship_to_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 148, $ship_to_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 149, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 149, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 150, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 150, $cst_grp_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 151, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 151, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 152, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 152, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 153, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 153, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 154, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 154, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 155, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 155, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 156, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 156, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 157, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 157, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 158, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 158, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 159, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 159, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 160, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 160, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 161, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 161, $ins_ts, value);
	}


	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_inst_upd_cntr() {
		return getConstNumber(offset + 162, $ship_inst_upd_cntr);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 162, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(int value) {
		setConstNumber(offset + 162, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(long value) {
		setConstNumber(offset + 162, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(float value) {
		setConstNumber(offset + 162, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(double value) {
		setConstNumber(offset + 162, $ship_inst_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 163, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 163, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 164, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 164, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 165, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 165, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 166, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 166, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 167, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 167, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 168, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 168, $upd_srv_req_no, value);
	}


	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public MCNumber list_no() {
		return getConstNumber(offset + 169, $list_no);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(MCNumber value) {
		setConstNumber(offset + 169, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(int value) {
		setConstNumber(offset + 169, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(long value) {
		setConstNumber(offset + 169, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(float value) {
		setConstNumber(offset + 169, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(double value) {
		setConstNumber(offset + 169, $list_no, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			return num_of_details();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			return ship_abl_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			return lot_prop_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			return grp_alloc_flg();
		}
		if ($ship_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return ship_str_ln_cd_none_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($act_split_flg.equalsIgnoreCase(name)) {
			return act_split_flg();
		}
		if ($pick_prnted_flg.equalsIgnoreCase(name)) {
			return pick_prnted_flg();
		}
		if ($inst_prnted_flg.equalsIgnoreCase(name)) {
			return inst_prnted_flg();
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_prnted_flg();
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			return adv_prnted_flg();
		}
		if ($pack_disable_flg.equalsIgnoreCase(name)) {
			return pack_disable_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			return num_of_details();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			return ship_abl_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			return lot_prop_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			return grp_alloc_flg();
		}
		if ($ship_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return ship_str_ln_cd_none_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($act_split_flg.equalsIgnoreCase(name)) {
			return act_split_flg();
		}
		if ($pick_prnted_flg.equalsIgnoreCase(name)) {
			return pick_prnted_flg();
		}
		if ($inst_prnted_flg.equalsIgnoreCase(name)) {
			return inst_prnted_flg();
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_prnted_flg();
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			return adv_prnted_flg();
		}
		if ($pack_disable_flg.equalsIgnoreCase(name)) {
			return pack_disable_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
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
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
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
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			ship_abl_flg(value);
			return;
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			lot_prop_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			grp_alloc_flg(value);
			return;
		}
		if ($ship_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			ship_str_ln_cd_none_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($act_split_flg.equalsIgnoreCase(name)) {
			act_split_flg(value);
			return;
		}
		if ($pick_prnted_flg.equalsIgnoreCase(name)) {
			pick_prnted_flg(value);
			return;
		}
		if ($inst_prnted_flg.equalsIgnoreCase(name)) {
			inst_prnted_flg(value);
			return;
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			dlv_prnted_flg(value);
			return;
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			adv_prnted_flg(value);
			return;
		}
		if ($pack_disable_flg.equalsIgnoreCase(name)) {
			pack_disable_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
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
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
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
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
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
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num_of_details.equalsIgnoreCase(name)) {
			num_of_details(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			ship_abl_flg(value);
			return;
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			lot_prop_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($grp_alloc_flg.equalsIgnoreCase(name)) {
			grp_alloc_flg(value);
			return;
		}
		if ($ship_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			ship_str_ln_cd_none_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($act_split_flg.equalsIgnoreCase(name)) {
			act_split_flg(value);
			return;
		}
		if ($pick_prnted_flg.equalsIgnoreCase(name)) {
			pick_prnted_flg(value);
			return;
		}
		if ($inst_prnted_flg.equalsIgnoreCase(name)) {
			inst_prnted_flg(value);
			return;
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			dlv_prnted_flg(value);
			return;
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			adv_prnted_flg(value);
			return;
		}
		if ($pack_disable_flg.equalsIgnoreCase(name)) {
			pack_disable_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_schd_tm_p.equalsIgnoreCase(name)) {
			return ship_schd_tm_p();
		}
		if ($dlv_schd_tm_p.equalsIgnoreCase(name)) {
			return dlv_schd_tm_p();
		}
		if ($ship_inst_tm_p.equalsIgnoreCase(name)) {
			return ship_inst_tm_p();
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			return ship_to_addr_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
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
		if ($ship_act_qty_p.equalsIgnoreCase(name)) {
			return ship_act_qty_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($ship_to_grp_p.equalsIgnoreCase(name)) {
			return ship_to_grp_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_schd_tm_p.equalsIgnoreCase(name)) {
			ship_schd_tm_p(
				((MCContainerMeta) ship_schd_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_schd_tm_p.equalsIgnoreCase(name)) {
			dlv_schd_tm_p(
				((MCContainerMeta) dlv_schd_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_inst_tm_p.equalsIgnoreCase(name)) {
			ship_inst_tm_p(
				((MCContainerMeta) ship_inst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			ship_to_addr_p(
				((MCContainerMeta) ship_to_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5360.AddrR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
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
		if ($ship_act_qty_p.equalsIgnoreCase(name)) {
			ship_act_qty_p(
				((MCContainerMeta) ship_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($ship_to_grp_p.equalsIgnoreCase(name)) {
			ship_to_grp_p(
				((MCContainerMeta) ship_to_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return ship_schd_tm_p().ymd();
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		ship_schd_tm_p().ymd(value);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return ship_schd_tm_p().hm();
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		ship_schd_tm_p().hm(value);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return dlv_schd_tm_p().ymd();
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		dlv_schd_tm_p().ymd(value);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return dlv_schd_tm_p().hm();
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		dlv_schd_tm_p().hm(value);
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return ship_inst_tm_p().ymd();
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		ship_inst_tm_p().ymd(value);
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public MCDate ship_inst_hm() {
		return ship_inst_tm_p().hm();
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public void ship_inst_hm(MCDate value) {
		ship_inst_tm_p().hm(value);
	}

	public String cntry_cd() {
		return ship_to_addr_p().cntry_cd();
	}

	public void cntry_cd(String value) {
		ship_to_addr_p().cntry_cd(value);
	}

	public String cntry_nm() {
		return ship_to_addr_p().cntry_nm();
	}

	public void cntry_nm(String value) {
		ship_to_addr_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return ship_to_addr_p().zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		ship_to_addr_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return ship_to_addr_p().addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		ship_to_addr_p().addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return ship_to_addr_p().addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		ship_to_addr_p().addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return ship_to_addr_p().addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		ship_to_addr_p().addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return ship_to_addr_p().addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		ship_to_addr_p().addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return ship_to_addr_p().cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		ship_to_addr_p().cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return ship_to_addr_p().cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		ship_to_addr_p().cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return ship_to_addr_p().tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		ship_to_addr_p().tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return ship_to_addr_p().fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		ship_to_addr_p().fax(value);
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

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
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
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
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
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Receiving point classification cd. 1 送付先分類ＣＤ１.<p>
	 *
	 */
	public String ship_to_grp_cd1() {
		return ship_to_grp_p().bp_grp_cd1();
	}

	/**
	 * Receiving point classification cd. 1 送付先分類ＣＤ１.<p>
	 *
	 */
	public void ship_to_grp_cd1(String value) {
		ship_to_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Receiving point classification name 1 送付先分類名１.<p>
	 *
	 */
	public String ship_to_grp_nm1() {
		return ship_to_grp_p().bp_grp_nm1();
	}

	/**
	 * Receiving point classification name 1 送付先分類名１.<p>
	 *
	 */
	public void ship_to_grp_nm1(String value) {
		ship_to_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Receiving point classification cd. 2 送付先分類ＣＤ２.<p>
	 *
	 */
	public String ship_to_grp_cd2() {
		return ship_to_grp_p().bp_grp_cd2();
	}

	/**
	 * Receiving point classification cd. 2 送付先分類ＣＤ２.<p>
	 *
	 */
	public void ship_to_grp_cd2(String value) {
		ship_to_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Receiving point classification name 2 送付先分類名２.<p>
	 *
	 */
	public String ship_to_grp_nm2() {
		return ship_to_grp_p().bp_grp_nm2();
	}

	/**
	 * Receiving point classification name 2 送付先分類名２.<p>
	 *
	 */
	public void ship_to_grp_nm2(String value) {
		ship_to_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Receiving point classification cd. 3 送付先分類ＣＤ３.<p>
	 *
	 */
	public String ship_to_grp_cd3() {
		return ship_to_grp_p().bp_grp_cd3();
	}

	/**
	 * Receiving point classification cd. 3 送付先分類ＣＤ３.<p>
	 *
	 */
	public void ship_to_grp_cd3(String value) {
		ship_to_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Receiving point classification name 3 送付先分類名３.<p>
	 *
	 */
	public String ship_to_grp_nm3() {
		return ship_to_grp_p().bp_grp_nm3();
	}

	/**
	 * Receiving point classification name 3 送付先分類名３.<p>
	 *
	 */
	public void ship_to_grp_nm3(String value) {
		ship_to_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Receiving point classification cd. 4 送付先分類ＣＤ４.<p>
	 *
	 */
	public String ship_to_grp_cd4() {
		return ship_to_grp_p().bp_grp_cd4();
	}

	/**
	 * Receiving point classification cd. 4 送付先分類ＣＤ４.<p>
	 *
	 */
	public void ship_to_grp_cd4(String value) {
		ship_to_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Receiving point classification name 4 送付先分類名４.<p>
	 *
	 */
	public String ship_to_grp_nm4() {
		return ship_to_grp_p().bp_grp_nm4();
	}

	/**
	 * Receiving point classification name 4 送付先分類名４.<p>
	 *
	 */
	public void ship_to_grp_nm4(String value) {
		ship_to_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Receiving point classification cd. 5 送付先分類ＣＤ５.<p>
	 *
	 */
	public String ship_to_grp_cd5() {
		return ship_to_grp_p().bp_grp_cd5();
	}

	/**
	 * Receiving point classification cd. 5 送付先分類ＣＤ５.<p>
	 *
	 */
	public void ship_to_grp_cd5(String value) {
		ship_to_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Receiving point classification name 5 送付先分類名５.<p>
	 *
	 */
	public String ship_to_grp_nm5() {
		return ship_to_grp_p().bp_grp_nm5();
	}

	/**
	 * Receiving point classification name 5 送付先分類名５.<p>
	 *
	 */
	public void ship_to_grp_nm5(String value) {
		ship_to_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Receiving point classification cd. 6 送付先分類ＣＤ６.<p>
	 *
	 */
	public String ship_to_grp_cd6() {
		return ship_to_grp_p().bp_grp_cd6();
	}

	/**
	 * Receiving point classification cd. 6 送付先分類ＣＤ６.<p>
	 *
	 */
	public void ship_to_grp_cd6(String value) {
		ship_to_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Receiving point classification name 6 送付先分類名６.<p>
	 *
	 */
	public String ship_to_grp_nm6() {
		return ship_to_grp_p().bp_grp_nm6();
	}

	/**
	 * Receiving point classification name 6 送付先分類名６.<p>
	 *
	 */
	public void ship_to_grp_nm6(String value) {
		ship_to_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Receiving point classification cd. 7 送付先分類ＣＤ７.<p>
	 *
	 */
	public String ship_to_grp_cd7() {
		return ship_to_grp_p().bp_grp_cd7();
	}

	/**
	 * Receiving point classification cd. 7 送付先分類ＣＤ７.<p>
	 *
	 */
	public void ship_to_grp_cd7(String value) {
		ship_to_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Receiving point classification name 7 送付先分類名７.<p>
	 *
	 */
	public String ship_to_grp_nm7() {
		return ship_to_grp_p().bp_grp_nm7();
	}

	/**
	 * Receiving point classification name 7 送付先分類名７.<p>
	 *
	 */
	public void ship_to_grp_nm7(String value) {
		ship_to_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Receiving point classification cd. 8 送付先分類ＣＤ８.<p>
	 *
	 */
	public String ship_to_grp_cd8() {
		return ship_to_grp_p().bp_grp_cd8();
	}

	/**
	 * Receiving point classification cd. 8 送付先分類ＣＤ８.<p>
	 *
	 */
	public void ship_to_grp_cd8(String value) {
		ship_to_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Receiving point classification name 8 送付先分類名８.<p>
	 *
	 */
	public String ship_to_grp_nm8() {
		return ship_to_grp_p().bp_grp_nm8();
	}

	/**
	 * Receiving point classification name 8 送付先分類名８.<p>
	 *
	 */
	public void ship_to_grp_nm8(String value) {
		ship_to_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Receiving point classification cd. 9 送付先分類ＣＤ９.<p>
	 *
	 */
	public String ship_to_grp_cd9() {
		return ship_to_grp_p().bp_grp_cd9();
	}

	/**
	 * Receiving point classification cd. 9 送付先分類ＣＤ９.<p>
	 *
	 */
	public void ship_to_grp_cd9(String value) {
		ship_to_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Receiving point classification name 9 送付先分類名９.<p>
	 *
	 */
	public String ship_to_grp_nm9() {
		return ship_to_grp_p().bp_grp_nm9();
	}

	/**
	 * Receiving point classification name 9 送付先分類名９.<p>
	 *
	 */
	public void ship_to_grp_nm9(String value) {
		ship_to_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Receiving point classification cd. 10 送付先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_to_grp_cd10() {
		return ship_to_grp_p().bp_grp_cd10();
	}

	/**
	 * Receiving point classification cd. 10 送付先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_to_grp_cd10(String value) {
		ship_to_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Receiving point classification name 10 送付先分類名１０.<p>
	 *
	 */
	public String ship_to_grp_nm10() {
		return ship_to_grp_p().bp_grp_nm10();
	}

	/**
	 * Receiving point classification name 10 送付先分類名１０.<p>
	 *
	 */
	public void ship_to_grp_nm10(String value) {
		ship_to_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return cst_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		cst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return cst_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		cst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return cst_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		cst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return cst_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		cst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return cst_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		cst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return cst_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		cst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return cst_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		cst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return cst_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		cst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return cst_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		cst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return cst_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		cst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return cst_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		cst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return cst_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		cst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return cst_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		cst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return cst_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		cst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return cst_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		cst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return cst_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		cst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return cst_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		cst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return cst_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		cst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return cst_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		cst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return cst_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		cst_grp_p().bp_grp_nm10(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	public String rtn_sts_typ_nm() {
		return rts_msg_p().rtn_sts_typ_nm();
	}

	public void rtn_sts_typ_nm(String value) {
		rts_msg_p().rtn_sts_typ_nm(value);
	}

	public String msg_id() {
		return rts_msg_p().msg_id();
	}

	public void msg_id(String value) {
		rts_msg_p().msg_id(value);
	}

	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public String msg() {
		return rts_msg_p().msg();
	}

	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public void msg(String value) {
		rts_msg_p().msg(value);
	}

}

