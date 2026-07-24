package mcframe.clientMSBA.MSBAP0020;

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
 * ブロック"Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt1R_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Replied split 回答分割.<p>
	 *
	 */
	public static final String $prms_div_flg = "prms_div_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
	/**
	 * Last notification 前回通知.<p>
	 *
	 */
	public static final String $last_prms_ntc_flg = "last_prms_ntc_flg";
	/**
	 * Notification 通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";
	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public static final String $re_prms_dt = "re_prms_dt";
	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_flg = "dlv_inst_rcpt_flg";
	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public static final String $prms_uncn_flg = "prms_uncn_flg";
	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public static final String $re_rqst_flg = "re_rqst_flg";
	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public static final String $re_rqst_dt = "re_rqst_dt";
	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public static final String $rqst_crrct_flg = "rqst_crrct_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_no = "wg_rqst_prms_no";
	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public static final String $rqst_dt = "rqst_dt";
	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public static final String $wg_rqst_typ = "wg_rqst_typ";
	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public static final String $wg_rqst_typ_nm = "wg_rqst_typ_nm";
	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public static final String $wg_rqst_sts_typ = "wg_rqst_sts_typ";
	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public static final String $wg_rqst_sts_typ_nm = "wg_rqst_sts_typ_nm";
	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public static final String $wg_rqst_src_typ = "wg_rqst_src_typ";
	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public static final String $wg_rqst_src_typ_nm = "wg_rqst_src_typ_nm";
	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_src_no = "wg_rqst_src_no";
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_wg_cd = "rqst_fr_wg_cd";
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_fr_wg_nm = "rqst_fr_wg_nm";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_usr_cd = "rqst_fr_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_fr_usr_nm = "rqst_fr_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_cd = "rqst_fr_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_nm = "rqst_fr_dpt_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_wg_cd = "rqst_to_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_to_wg_nm = "rqst_to_wg_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public static final String $gr_str_ln_cd_none_flg = "gr_str_ln_cd_none_flg";
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gr_lg_grp_cd = "gr_lg_grp_cd";
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public static final String $gr_lg_grp_nm = "gr_lg_grp_nm";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_wg_nm = "gr_wg_nm";
	public static final String $dlv_p = "dlv_p";
	public static final String $tdlv_p = "tdlv_p";
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
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	public static final String $ver_no_p = "ver_no_p";
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
	 * GR request date 入庫依頼日.<p>
	 *
	 */
	public static final String $gr_rqst_dt = "gr_rqst_dt";
	/**
	 * GR request time 入庫依頼時刻.<p>
	 *
	 */
	public static final String $gr_rqst_hm = "gr_rqst_hm";
	public static final String $gr_schd_dt_p = "gr_schd_dt_p";
	/**
	 * GI request date 出庫依頼日.<p>
	 *
	 */
	public static final String $gi_rqst_dt = "gi_rqst_dt";
	/**
	 * GI request time 出庫依頼時刻.<p>
	 *
	 */
	public static final String $gi_rqst_hm = "gi_rqst_hm";
	public static final String $gi_schd_dt_p = "gi_schd_dt_p";
	/**
	 * Request transaction unit cd. 依頼取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Request transaction unit name 依頼取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Request base unit cd. 依頼基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Request base unit name 依頼基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Request base unit rounding type 依頼基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $not_cmpl_qty_p = "not_cmpl_qty_p";
	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_trd_unit_cd = "prms_trd_unit_cd";
	/**
	 * Replied transaction unit name 回答取引単位名.<p>
	 *
	 */
	public static final String $prms_trd_unit_nm = "prms_trd_unit_nm";
	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_trd_unit_dec_place = "prms_trd_unit_dec_place";
	/**
	 * Replied transaction unit rounding type 回答取引単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_trd_unit_rnd_typ = "prms_trd_unit_rnd_typ";
	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_base_qty = "prms_trd_unit_conv_base_qty";
	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_qty = "prms_trd_unit_conv_qty";
	public static final String $prms_trd_unit_qty_p = "prms_trd_unit_qty_p";
	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_base_unit_cd = "prms_base_unit_cd";
	/**
	 * Replied base unit name 回答基準単位名.<p>
	 *
	 */
	public static final String $prms_base_unit_nm = "prms_base_unit_nm";
	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_base_unit_dec_place = "prms_base_unit_dec_place";
	/**
	 * Replied base unit rounding type 回答基準単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_base_unit_rnd_typ = "prms_base_unit_rnd_typ";
	public static final String $prms_base_unit_qty_p = "prms_base_unit_qty_p";
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public static final String $wg_rqst_cnt_rmrks = "wg_rqst_cnt_rmrks";
	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public static final String $wg_re_rqst_cnt_rmrks = "wg_re_rqst_cnt_rmrks";
	/**
	 * Request GI location cd. 依頼出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_gi_loc_cd = "rqst_gi_loc_cd";
	/**
	 * Request GI location name 依頼出庫場所名.<p>
	 *
	 */
	public static final String $rqst_gi_loc_nm = "rqst_gi_loc_nm";
	/**
	 * Request GI rack/line cd. 依頼出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $rqst_gi_str_ln_cd = "rqst_gi_str_ln_cd";
	/**
	 * Request GI rack/line name 依頼出庫棚・ライン名.<p>
	 *
	 */
	public static final String $rqst_gi_str_ln_nm = "rqst_gi_str_ln_nm";
	/**
	 * Without request GI rack/line 依頼出庫棚・ライン無.<p>
	 *
	 */
	public static final String $rqst_gi_str_ln_cd_none_flg = "rqst_gi_str_ln_cd_none_flg";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	public static final String $gi_str_ln_p = "gi_str_ln_p";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gi_wg_nm = "gi_wg_nm";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public static final String $gi_lg_grp_nm = "gi_lg_grp_nm";
	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_grp_cd = "gi_loc_grp_cd";
	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public static final String $gi_loc_grp_nm = "gi_loc_grp_nm";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gi_site_nm = "gi_site_nm";
	/**
	 * Request mfg. location cd. 依頼製造場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_mfg_loc_cd = "rqst_mfg_loc_cd";
	/**
	 * Request mfg. location name 依頼製造場所名.<p>
	 *
	 */
	public static final String $rqst_mfg_loc_nm = "rqst_mfg_loc_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Request BOM pattern 依頼構成パタン.<p>
	 *
	 */
	public static final String $rqst_bom_ptn = "rqst_bom_ptn";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Request supplier cd. 依頼発注先ＣＤ.<p>
	 *
	 */
	public static final String $rqst_sppl_cd = "rqst_sppl_cd";
	/**
	 * Request supplier name 依頼発注先名.<p>
	 *
	 */
	public static final String $rqst_sppl_nm = "rqst_sppl_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Request maker cd. 依頼メーカＣＤ.<p>
	 *
	 */
	public static final String $rqst_maker_cd = "rqst_maker_cd";
	/**
	 * Request maker name 依頼メーカ名.<p>
	 *
	 */
	public static final String $rqst_maker_nm = "rqst_maker_nm";
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
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public static final String $sim_alloc_pln_typ = "sim_alloc_pln_typ";
	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public static final String $sim_alloc_pln_typ_nm = "sim_alloc_pln_typ_nm";
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_rsn_cd = "purc_rsn_cd";
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public static final String $purc_rsn_nm = "purc_rsn_nm";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
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
	 * Transaction type 取引区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	public static final String $bditm_p = "bditm_p";
	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
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
	 * Date edited by request source 依頼元訂正日.<p>
	 *
	 */
	public static final String $rqst_crrct_dt = "rqst_crrct_dt";
	/**
	 * Request source cancellation date 依頼元取消日.<p>
	 *
	 */
	public static final String $rqst_can_dt = "rqst_can_dt";
	/**
	 * Reply cancelled date 回答通知取消日.<p>
	 *
	 */
	public static final String $prms_can_dt = "prms_can_dt";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 * Order cancellation date 指図取消日.<p>
	 *
	 */
	public static final String $inst_can_dt = "inst_can_dt";
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Result cancel date 実績取消日.<p>
	 *
	 */
	public static final String $act_can_dt = "act_can_dt";
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
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $sppl_grp_p = "sppl_grp_p";
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
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public static final String $wg_rqst_upd_cntr = "wg_rqst_upd_cntr";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $dlv_pri_prnt_flg = $dlv_p + ".pri_prnt_flg";
	public static final String $dlv_show_dtl = $dlv_p + ".show_dtl";
	public static final String $dlv_lg_grp_cd = $dlv_p + ".lg_grp_cd";
	public static final String $dlv_lg_grp_nm = $dlv_p + ".lg_grp_nm";
	public static final String $dlv_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $dlv_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $tdlv_cd = $tdlv_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_p + ".bp_nm";
	public static final String $tdlv_sundry_flg = $tdlv_p + ".dlv_sundry_flg";
	public static final String $tdlv_pri_prnt_flg = $tdlv_p + ".pri_prnt_flg";
	public static final String $tdlv_show_dtl = $tdlv_p + ".show_dtl";
	public static final String $tdlv_lg_grp_cd = $tdlv_p + ".lg_grp_cd";
	public static final String $tdlv_lg_grp_nm = $tdlv_p + ".lg_grp_nm";
	public static final String $tdlv_cntry_cd = $tdlv_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_p + ".cntry_nm";
	public static final String $tdlv_zip_cd = $tdlv_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_p + ".tel";
	public static final String $tdlv_fax = $tdlv_p + ".fax";
	public static final String $tdlv_cntct_dpt = $tdlv_p + ".dlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_p + ".dlv_cntct_psn";
	public static final String $sno1_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $gr_schd_dt = $gr_schd_dt_p + ".ymd";
	public static final String $gr_schd_hm = $gr_schd_dt_p + ".hm";
	public static final String $gi_schd_dt = $gi_schd_dt_p + ".ymd";
	public static final String $gi_schd_hm = $gi_schd_dt_p + ".hm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $not_cmpl_qty = $not_cmpl_qty_p + ".qty";
	public static final String $prms_trd_unit_qty = $prms_trd_unit_qty_p + ".qty";
	public static final String $prms_base_unit_qty = $prms_base_unit_qty_p + ".qty";
	public static final String $gi_str_ln_cd = $gi_str_ln_p + ".str_ln_cd";
	public static final String $gi_str_ln_nm = $gi_str_ln_p + ".str_ln_nm";
	public static final String $gi_str_ln_cd_none_flg = $gi_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $bd_dpt_cd = $bditm_p + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $bditm_p + ".bd_dpt_nm";
	public static final String $bd_itm_cd = $bditm_p + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $bditm_p + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $bditm_p + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $bditm_p + ".bd_itm_sub3";
	public static final String $bd_itm_nm = $bditm_p + ".bd_itm_nm";
	public static final String $bd_lot_no = $bditm_p + ".bd_lot_no";
	public static final String $bd_sublot_no = $bditm_p + ".bd_sublot_no";
	public static final String $bd_sno1 = $bditm_p + ".bd_sno1";
	public static final String $bd_sno2 = $bditm_p + ".bd_sno2";
	public static final String $bd_sno3 = $bditm_p + ".bd_sno3";
	public static final String $bd_sno4 = $bditm_p + ".bd_sno4";
	public static final String $bd_bp_cd = $bditm_p + ".bd_bp_cd";
	public static final String $bd_bp_nm = $bditm_p + ".bd_bp_nm";
	public static final String $bd_loc_cd = $bditm_p + ".bd_loc_cd";
	public static final String $bd_loc_nm = $bditm_p + ".bd_loc_nm";
	public static final String $bd_ctg_cd = $bditm_p + ".bd_ctg_cd";
	public static final String $bd_ctg_nm = $bditm_p + ".bd_ctg_nm";
	public static final String $bd_oper_cd = $bditm_p + ".bd_oper_cd";
	public static final String $bd_oper_nm = $bditm_p + ".bd_oper_nm";
	public static final String $bd_iv_no = $bditm_p + ".bd_iv_no";
	public static final String $bd_slo_no = $bditm_p + ".bd_slo_no";
	public static final String $bd_po_no = $bditm_p + ".bd_po_no";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
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
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_div_flg_META = createCommonMeta($prms_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_prms_ntc_flg_META = createCommonMeta($last_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_rcpt_flg_META = createCommonMeta($dlv_inst_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_uncn_flg_META = createCommonMeta($prms_uncn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_rqst_flg_META = createCommonMeta($re_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_rqst_dt_META = createCommonMeta($re_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_crrct_flg_META = createCommonMeta($rqst_crrct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta wg_rqst_prms_no_META = createCommonMeta($wg_rqst_prms_no, mcframe.commonMA.meta.MA_META.WG_RQST_PRMS_NO);
	public static final MCMeta rqst_dt_META = createCommonMeta($rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMS.meta.MS_META.WG_RQST_TYP);
	public static final MCMeta wg_rqst_typ_nm_META = createCommonMeta($wg_rqst_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_TYP_NM);
	public static final MCMeta wg_rqst_sts_typ_META = createCommonMeta($wg_rqst_sts_typ, mcframe.commonMS.meta.MS_META.WG_RQST_STS_TYP);
	public static final MCMeta wg_rqst_sts_typ_nm_META = createCommonMeta($wg_rqst_sts_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_STS_TYP_NM);
	public static final MCMeta wg_rqst_src_typ_META = createCommonMeta($wg_rqst_src_typ, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP);
	public static final MCMeta wg_rqst_src_typ_nm_META = createCommonMeta($wg_rqst_src_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP_NM);
	public static final MCMeta wg_rqst_src_no_META = createCommonMeta($wg_rqst_src_no, mcframe.commonMA.meta.MA_META.WG_RQST_SRC_NO);
	public static final MCMeta rqst_fr_wg_cd_META = createCommonMeta($rqst_fr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_fr_wg_nm_META = createCommonMeta($rqst_fr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_to_wg_cd_META = createCommonMeta($rqst_to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_to_wg_nm_META = createCommonMeta($rqst_to_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_str_ln_cd_none_flg_META = createCommonMeta($gr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_lg_grp_nm_META = createCommonMeta($gr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_wg_nm_META = createCommonMeta($gr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta tdlv_p_META = createInnerRowMeta($tdlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_rqst_dt_META = createCommonMeta($gr_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_rqst_hm_META = createCommonMeta($gr_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta gr_schd_dt_p_META = createInnerRowMeta($gr_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta gi_rqst_dt_META = createCommonMeta($gi_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_rqst_hm_META = createCommonMeta($gi_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta gi_schd_dt_p_META = createInnerRowMeta($gi_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_cmpl_qty_p_META = createInnerRowMeta($not_cmpl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prms_trd_unit_cd_META = createCommonMeta($prms_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_trd_unit_nm_META = createCommonMeta($prms_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prms_trd_unit_dec_place_META = createCommonMeta($prms_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prms_trd_unit_rnd_typ_META = createCommonMeta($prms_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_trd_unit_conv_base_qty_META = createCommonMeta($prms_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_conv_qty_META = createCommonMeta($prms_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_qty_p_META = createInnerRowMeta($prms_trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prms_base_unit_cd_META = createCommonMeta($prms_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_base_unit_nm_META = createCommonMeta($prms_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prms_base_unit_dec_place_META = createCommonMeta($prms_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prms_base_unit_rnd_typ_META = createCommonMeta($prms_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_base_unit_qty_p_META = createInnerRowMeta($prms_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta wg_re_rqst_cnt_rmrks_META = createCommonMeta($wg_re_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RE_RQST_CNT_RMRKS);
	public static final MCMeta rqst_gi_loc_cd_META = createCommonMeta($rqst_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_gi_loc_nm_META = createCommonMeta($rqst_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_gi_str_ln_cd_META = createCommonMeta($rqst_gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta rqst_gi_str_ln_nm_META = createCommonMeta($rqst_gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta rqst_gi_str_ln_cd_none_flg_META = createCommonMeta($rqst_gi_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_p_META = createInnerRowMeta($gi_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_wg_nm_META = createCommonMeta($gi_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_lg_grp_nm_META = createCommonMeta($gi_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gi_loc_grp_cd_META = createCommonMeta($gi_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta gi_loc_grp_nm_META = createCommonMeta($gi_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_nm_META = createCommonMeta($gi_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_mfg_loc_cd_META = createCommonMeta($rqst_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_mfg_loc_nm_META = createCommonMeta($rqst_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_bom_ptn_META = createCommonMeta($rqst_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta rqst_sppl_cd_META = createCommonMeta($rqst_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_sppl_nm_META = createCommonMeta($rqst_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_maker_cd_META = createCommonMeta($rqst_maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_maker_nm_META = createCommonMeta($rqst_maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sim_alloc_pln_typ_META = createCommonMeta($sim_alloc_pln_typ, mcframe.commonMS.meta.MS_META.SIM_ALLOC_PLN_TYP);
	public static final MCMeta sim_alloc_pln_typ_nm_META = createCommonMeta($sim_alloc_pln_typ_nm, mcframe.commonMS.meta.MS_META.SIM_ALLOC_PLN_TYP_NM);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta bditm_p_META = createInnerRowMeta($bditm_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR3);
	public static final MCMeta rqst_crrct_dt_META = createCommonMeta($rqst_crrct_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_can_dt_META = createCommonMeta($rqst_can_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_can_dt_META = createCommonMeta($prms_can_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_can_dt_META = createCommonMeta($inst_can_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_can_dt_META = createCommonMeta($act_can_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta wg_rqst_upd_cntr_META = createCommonMeta($wg_rqst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Rslt1R> constMetas = new ConstMetaList<Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			prms_div_flg_META,
			fix_flg_META,
			fix_dt_META,
			last_prms_ntc_flg_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			dlv_inst_rcpt_flg_META,
			prms_uncn_flg_META,
			re_rqst_flg_META,
			re_rqst_dt_META,
			rqst_crrct_flg_META,
			can_flg_META,
			wg_rqst_no_META,
			wg_rqst_prms_no_META,
			rqst_dt_META,
			wg_rqst_typ_META,
			wg_rqst_typ_nm_META,
			wg_rqst_sts_typ_META,
			wg_rqst_sts_typ_nm_META,
			wg_rqst_src_typ_META,
			wg_rqst_src_typ_nm_META,
			wg_rqst_src_no_META,
			rqst_fr_wg_cd_META,
			rqst_fr_wg_nm_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			rqst_to_wg_cd_META,
			rqst_to_wg_nm_META,
			itm_p_META,
			iv_itm_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sundry_itm_flg_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			ver_flg_META,
			dscnt_itm_flg_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_str_ln_cd_none_flg_META,
			gr_lg_grp_cd_META,
			gr_lg_grp_nm_META,
			gr_wg_cd_META,
			gr_wg_nm_META,
			dlv_p_META,
			tdlv_p_META,
			slo_no_META,
			slo_d_no_META,
			itm_ord_no_META,
			lot_no_META,
			sublot_no_META,
			sno_wrk_no_p_META,
			ver_no_p_META,
			gd_cd_META,
			gd_nm_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			gr_rqst_dt_META,
			gr_rqst_hm_META,
			gr_schd_dt_p_META,
			gi_rqst_dt_META,
			gi_rqst_hm_META,
			gi_schd_dt_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			not_cmpl_qty_p_META,
			prms_trd_unit_cd_META,
			prms_trd_unit_nm_META,
			prms_trd_unit_dec_place_META,
			prms_trd_unit_rnd_typ_META,
			prms_trd_unit_conv_base_qty_META,
			prms_trd_unit_conv_qty_META,
			prms_trd_unit_qty_p_META,
			prms_base_unit_cd_META,
			prms_base_unit_nm_META,
			prms_base_unit_dec_place_META,
			prms_base_unit_rnd_typ_META,
			prms_base_unit_qty_p_META,
			wg_rqst_cnt_rmrks_META,
			wg_re_rqst_cnt_rmrks_META,
			rqst_gi_loc_cd_META,
			rqst_gi_loc_nm_META,
			rqst_gi_str_ln_cd_META,
			rqst_gi_str_ln_nm_META,
			rqst_gi_str_ln_cd_none_flg_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_p_META,
			gi_wg_cd_META,
			gi_wg_nm_META,
			gi_lg_grp_cd_META,
			gi_lg_grp_nm_META,
			gi_loc_grp_cd_META,
			gi_loc_grp_nm_META,
			gi_site_cd_META,
			gi_site_nm_META,
			rqst_mfg_loc_cd_META,
			rqst_mfg_loc_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			rqst_bom_ptn_META,
			bom_ptn_META,
			rqst_sppl_cd_META,
			rqst_sppl_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			rqst_maker_cd_META,
			rqst_maker_nm_META,
			maker_cd_META,
			maker_nm_META,
			sim_alloc_pln_typ_META,
			sim_alloc_pln_typ_nm_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			bditm_p_META,
			prms_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rqst_crrct_dt_META,
			rqst_can_dt_META,
			prms_can_dt_META,
			inst_dt_META,
			inst_can_dt_META,
			act_dt_META,
			act_can_dt_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
			itm_grp_p_META,
			dlv_grp_p_META,
			sppl_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			wg_rqst_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"dlv_cd",
				"dlv_nm",
				"dlv_sundry_flg",
				"dlv_pri_prnt_flg",
				"dlv_lg_grp_cd",
				"dlv_lg_grp_nm",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_sundry_flg",
				"tdlv_pri_prnt_flg",
				"tdlv_lg_grp_cd",
				"tdlv_lg_grp_nm",
				"tdlv_cntry_cd",
				"tdlv_cntry_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"sno1_null_flg",
				"sno1",
				"sno2_null_flg",
				"sno2",
				"sno3_null_flg",
				"sno3",
				"sno4_null_flg",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"ver_no",
				"gr_schd_dt",
				"gr_schd_hm",
				"gi_schd_dt",
				"gi_schd_hm",
				"trd_unit_qty",
				"base_unit_qty",
				"not_cmpl_qty",
				"prms_trd_unit_qty",
				"prms_base_unit_qty",
				"gi_str_ln_cd",
				"gi_str_ln_nm",
				"gi_str_ln_cd_none_flg",
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
				"rtn_sts_typ",
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
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_cd10",
				"sppl_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$dlv_cd,
				$dlv_nm,
				$dlv_sundry_flg,
				$dlv_pri_prnt_flg,
				$dlv_lg_grp_cd,
				$dlv_lg_grp_nm,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_sundry_flg,
				$tdlv_pri_prnt_flg,
				$tdlv_lg_grp_cd,
				$tdlv_lg_grp_nm,
				$tdlv_cntry_cd,
				$tdlv_cntry_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$sno1_null_flg,
				$sno1,
				$sno2_null_flg,
				$sno2,
				$sno3_null_flg,
				$sno3,
				$sno4_null_flg,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$ver_no,
				$gr_schd_dt,
				$gr_schd_hm,
				$gi_schd_dt,
				$gi_schd_hm,
				$trd_unit_qty,
				$base_unit_qty,
				$not_cmpl_qty,
				$prms_trd_unit_qty,
				$prms_base_unit_qty,
				$gi_str_ln_cd,
				$gi_str_ln_nm,
				$gi_str_ln_cd_none_flg,
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
				$rtn_sts_typ,
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
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_cd10,
				$sppl_grp_nm10
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$prms_trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// prms_trd_unit_cd
				{$gi_loc_cd, "loc_nm;wg_cd;wg_nm;site_cd;site_nm;loc_grp_cd;loc_grp_nm;str_ln_tgt_flg;lg_grp_cd;lg_grp_nm"},	// gi_loc_cd
				{$gi_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// gi_str_ln_p.str_ln_cd
				{$mfg_loc_cd, "mfg_loc_nm;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$prms_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// prms_trd_unit_cd
				{$gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// gi_loc_cd
				{$gi_str_ln_p + ".str_ln_cd", "gi_loc_cd;true"},	// gi_str_ln_p.str_ln_cd
				{$mfg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;gr_wg_cd;true;true"},	// mfg_loc_cd
				{$bom_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;gr_wg_cd;mfg_loc_cd;true"},	// bom_ptn
				{$sppl_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;gr_wg_cd;gr_wg_nm;true;false;true;true;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;gr_wg_cd;gr_wg_nm;sppl_cd;sppl_nm;true;true;true;true;asset_mng_typ"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$prms_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// prms_trd_unit_cd
				{$gi_loc_cd, "loc_is_srch_typ"},	// gi_loc_cd
				{$gi_str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// gi_str_ln_p.str_ln_cd
				{$mfg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;outsrc_flg;mode_nullval_flg"},	// mfg_loc_cd
				{$bom_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd;dt_opt_flg"},	// bom_ptn
				{$sppl_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;wg_cd;wg_nm;inc_outsrc_flg;mode_nullval_flg;sppl_flg;manual_sppl_flg;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;wg_cd;wg_nm;sppl_cd;sppl_nm;inc_outsrc_flg;mode_nullval_flg;maker_flg;manual_sppl_flg;asset_mng_typ"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$gr_str_ln_cd, "STR_LN"},	// gr_str_ln_cd
				{$gr_str_ln_nm, "STR_LN"},	// gr_str_ln_nm
				{$gr_str_ln_cd_none_flg, "STR_LN"},	// gr_str_ln_cd_none_flg
				{$gr_lg_grp_cd, "LG_GRP"},	// gr_lg_grp_cd
				{$gr_lg_grp_nm, "LG_GRP"},	// gr_lg_grp_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$gr_rqst_hm, "TM"},	// gr_rqst_hm
				{$gi_rqst_hm, "TM"},	// gi_rqst_hm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$not_cmpl_qty_p + ".qty", "BASE_UNIT"},	// not_cmpl_qty_p.qty
				{$prms_base_unit_cd, "BASE_UNIT"},	// prms_base_unit_cd
				{$prms_base_unit_nm, "BASE_UNIT"},	// prms_base_unit_nm
				{$prms_base_unit_dec_place, "BASE_UNIT"},	// prms_base_unit_dec_place
				{$prms_base_unit_rnd_typ, "BASE_UNIT"},	// prms_base_unit_rnd_typ
				{$prms_base_unit_qty_p + ".qty", "BASE_UNIT"},	// prms_base_unit_qty_p.qty
				{$rqst_gi_str_ln_cd, "STR_LN"},	// rqst_gi_str_ln_cd
				{$rqst_gi_str_ln_nm, "STR_LN"},	// rqst_gi_str_ln_nm
				{$rqst_gi_str_ln_cd_none_flg, "STR_LN"},	// rqst_gi_str_ln_cd_none_flg
				{$gi_str_ln_tgt_flg, "STR_LN"},	// gi_str_ln_tgt_flg
				{$gi_lg_grp_cd, "LG_GRP"},	// gi_lg_grp_cd
				{$gi_lg_grp_nm, "LG_GRP"},	// gi_lg_grp_nm
				{$gi_loc_grp_cd, "LOC_GRP"},	// gi_loc_grp_cd
				{$gi_loc_grp_nm, "LOC_GRP"},	// gi_loc_grp_nm
				{$gi_site_cd, "SITE"},	// gi_site_cd
				{$gi_site_nm, "SITE"},	// gi_site_nm
				{$rqst_maker_cd, "MAKER"},	// rqst_maker_cd
				{$rqst_maker_nm, "MAKER"},	// rqst_maker_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"}	// maker_nm
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
	protected Rslt1R_MC_A(ConstMetaList<? extends Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt1R clone() {
		return (Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt1R createInstance() {
		return (Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt1R getValues(String... names) {
		return (Rslt1R) super.getValues(names);
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
	 * Replied split 回答分割.<p>
	 *
	 */
	public boolean prms_div_flg() {
		return getConstBoolean(offset + 1, $prms_div_flg);
	}

	/**
	 * Replied split 回答分割.<p>
	 *
	 */
	public void prms_div_flg(boolean value) {
		setConstBoolean(offset + 1, $prms_div_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 2, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_flg, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 3, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 3, $fix_dt, value);
	}


	/**
	 * Last notification 前回通知.<p>
	 *
	 */
	public boolean last_prms_ntc_flg() {
		return getConstBoolean(offset + 4, $last_prms_ntc_flg);
	}

	/**
	 * Last notification 前回通知.<p>
	 *
	 */
	public void last_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 4, $last_prms_ntc_flg, value);
	}


	/**
	 * Notification 通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 5, $prms_ntc_flg);
	}

	/**
	 * Notification 通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_ntc_flg, value);
	}


	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 6, $prms_dt);
	}

	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 6, $prms_dt, value);
	}


	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 7, $re_prms_ntc_flg);
	}

	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 7, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 8, $re_prms_dt);
	}

	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 8, $re_prms_dt, value);
	}


	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public boolean dlv_inst_rcpt_flg() {
		return getConstBoolean(offset + 9, $dlv_inst_rcpt_flg);
	}

	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public void dlv_inst_rcpt_flg(boolean value) {
		setConstBoolean(offset + 9, $dlv_inst_rcpt_flg, value);
	}


	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public boolean prms_uncn_flg() {
		return getConstBoolean(offset + 10, $prms_uncn_flg);
	}

	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public void prms_uncn_flg(boolean value) {
		setConstBoolean(offset + 10, $prms_uncn_flg, value);
	}


	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return getConstBoolean(offset + 11, $re_rqst_flg);
	}

	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		setConstBoolean(offset + 11, $re_rqst_flg, value);
	}


	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public MCDate re_rqst_dt() {
		return getConstDate(offset + 12, $re_rqst_dt);
	}

	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public void re_rqst_dt(MCDate value) {
		setConstDate(offset + 12, $re_rqst_dt, value);
	}


	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_crrct_flg() {
		return getConstBoolean(offset + 13, $rqst_crrct_flg);
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_crrct_flg(boolean value) {
		setConstBoolean(offset + 13, $rqst_crrct_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 14, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 14, $can_flg, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 15, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 15, $wg_rqst_no, value);
	}


	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public String wg_rqst_prms_no() {
		return getConstString(offset + 16, $wg_rqst_prms_no);
	}

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public void wg_rqst_prms_no(String value) {
		setConstString(offset + 16, $wg_rqst_prms_no, value);
	}


	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return getConstDate(offset + 17, $rqst_dt);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		setConstDate(offset + 17, $rqst_dt, value);
	}


	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 18, $wg_rqst_typ);
	}

	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 18, $wg_rqst_typ, value);
	}


	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public String wg_rqst_typ_nm() {
		return getConstString(offset + 19, $wg_rqst_typ_nm);
	}

	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public void wg_rqst_typ_nm(String value) {
		setConstString(offset + 19, $wg_rqst_typ_nm, value);
	}


	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public String wg_rqst_sts_typ() {
		return getConstString(offset + 20, $wg_rqst_sts_typ);
	}

	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public void wg_rqst_sts_typ(String value) {
		setConstString(offset + 20, $wg_rqst_sts_typ, value);
	}


	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public String wg_rqst_sts_typ_nm() {
		return getConstString(offset + 21, $wg_rqst_sts_typ_nm);
	}

	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public void wg_rqst_sts_typ_nm(String value) {
		setConstString(offset + 21, $wg_rqst_sts_typ_nm, value);
	}


	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return getConstString(offset + 22, $wg_rqst_src_typ);
	}

	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		setConstString(offset + 22, $wg_rqst_src_typ, value);
	}


	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public String wg_rqst_src_typ_nm() {
		return getConstString(offset + 23, $wg_rqst_src_typ_nm);
	}

	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public void wg_rqst_src_typ_nm(String value) {
		setConstString(offset + 23, $wg_rqst_src_typ_nm, value);
	}


	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return getConstString(offset + 24, $wg_rqst_src_no);
	}

	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		setConstString(offset + 24, $wg_rqst_src_no, value);
	}


	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return getConstString(offset + 25, $rqst_fr_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		setConstString(offset + 25, $rqst_fr_wg_cd, value);
	}


	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public String rqst_fr_wg_nm() {
		return getConstString(offset + 26, $rqst_fr_wg_nm);
	}

	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public void rqst_fr_wg_nm(String value) {
		setConstString(offset + 26, $rqst_fr_wg_nm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 27, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 27, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 28, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 28, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 29, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 29, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 30, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 30, $rqst_fr_dpt_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 31, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 31, $rqst_to_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_to_wg_nm() {
		return getConstString(offset + 32, $rqst_to_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_to_wg_nm(String value) {
		setConstString(offset + 32, $rqst_to_wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 33, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 33, $itm_p, row);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 34, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 34, $iv_itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 35, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 35, $lot_mng_typ, value);
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
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 37, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 37, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 38, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 38, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 39, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 39, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 40, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 40, $sno4_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 41, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 41, $sundry_itm_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 42, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 42, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 43, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 43, $asset_mng_typ_nm, value);
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


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 45, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 45, $dscnt_itm_flg, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 46, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 46, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 47, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 47, $gr_loc_nm, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 48, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 48, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 49, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 49, $gr_str_ln_nm, value);
	}


	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public boolean gr_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 50, $gr_str_ln_cd_none_flg);
	}

	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public void gr_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 50, $gr_str_ln_cd_none_flg, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 51, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 51, $gr_lg_grp_cd, value);
	}


	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public String gr_lg_grp_nm() {
		return getConstString(offset + 52, $gr_lg_grp_nm);
	}

	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public void gr_lg_grp_nm(String value) {
		setConstString(offset + 52, $gr_lg_grp_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 53, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 53, $gr_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_wg_nm() {
		return getConstString(offset + 54, $gr_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_wg_nm(String value) {
		setConstString(offset + 54, $gr_wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 55, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 55, $dlv_p, row);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR tdlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 56, $tdlv_p);
	}
	
	public void tdlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 56, $tdlv_p, row);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 57, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 57, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 58, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 58, $slo_d_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 59, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 59, $itm_ord_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 60, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 60, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 61, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 61, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 62, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 62, $sno_wrk_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 63, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 63, $ver_no_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 64, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 64, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 65, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 65, $gd_nm, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 66, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 66, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 67, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 67, $vld_dt_to, value);
	}


	/**
	 * GR request date 入庫依頼日.<p>
	 *
	 */
	public MCDate gr_rqst_dt() {
		return getConstDate(offset + 68, $gr_rqst_dt);
	}

	/**
	 * GR request date 入庫依頼日.<p>
	 *
	 */
	public void gr_rqst_dt(MCDate value) {
		setConstDate(offset + 68, $gr_rqst_dt, value);
	}


	/**
	 * GR request time 入庫依頼時刻.<p>
	 *
	 */
	public MCDate gr_rqst_hm() {
		return getConstDate(offset + 69, $gr_rqst_hm);
	}

	/**
	 * GR request time 入庫依頼時刻.<p>
	 *
	 */
	public void gr_rqst_hm(MCDate value) {
		setConstDate(offset + 69, $gr_rqst_hm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR gr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 70, $gr_schd_dt_p);
	}
	
	public void gr_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 70, $gr_schd_dt_p, row);
	}


	/**
	 * GI request date 出庫依頼日.<p>
	 *
	 */
	public MCDate gi_rqst_dt() {
		return getConstDate(offset + 71, $gi_rqst_dt);
	}

	/**
	 * GI request date 出庫依頼日.<p>
	 *
	 */
	public void gi_rqst_dt(MCDate value) {
		setConstDate(offset + 71, $gi_rqst_dt, value);
	}


	/**
	 * GI request time 出庫依頼時刻.<p>
	 *
	 */
	public MCDate gi_rqst_hm() {
		return getConstDate(offset + 72, $gi_rqst_hm);
	}

	/**
	 * GI request time 出庫依頼時刻.<p>
	 *
	 */
	public void gi_rqst_hm(MCDate value) {
		setConstDate(offset + 72, $gi_rqst_hm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR gi_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 73, $gi_schd_dt_p);
	}
	
	public void gi_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 73, $gi_schd_dt_p, row);
	}


	/**
	 * Request transaction unit cd. 依頼取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 74, $trd_unit_cd);
	}

	/**
	 * Request transaction unit cd. 依頼取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 74, $trd_unit_cd, value);
	}


	/**
	 * Request transaction unit name 依頼取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 75, $trd_unit_nm);
	}

	/**
	 * Request transaction unit name 依頼取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 75, $trd_unit_nm, value);
	}


	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 76, $trd_unit_dec_place);
	}

	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 76, $trd_unit_dec_place, value);
	}

	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 76, $trd_unit_dec_place, value);
	}

	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 76, $trd_unit_dec_place, value);
	}

	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 76, $trd_unit_dec_place, value);
	}

	/**
	 * Request transaction unit number of decimal places 依頼取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 76, $trd_unit_dec_place, value);
	}


	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 77, $trd_unit_conv_base_qty);
	}

	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 77, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 77, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 77, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 77, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Request transaction unit conversion base qty. 依頼取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 77, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 78, $trd_unit_conv_qty);
	}

	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 78, $trd_unit_conv_qty, value);
	}

	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 78, $trd_unit_conv_qty, value);
	}

	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 78, $trd_unit_conv_qty, value);
	}

	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 78, $trd_unit_conv_qty, value);
	}

	/**
	 * Request transaction unit conversion qty. 依頼取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 78, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $trd_unit_qty_p, row);
	}


	/**
	 * Request base unit cd. 依頼基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 80, $base_unit_cd);
	}

	/**
	 * Request base unit cd. 依頼基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 80, $base_unit_cd, value);
	}


	/**
	 * Request base unit name 依頼基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 81, $base_unit_nm);
	}

	/**
	 * Request base unit name 依頼基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 81, $base_unit_nm, value);
	}


	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 82, $base_unit_dec_place);
	}

	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 82, $base_unit_dec_place, value);
	}

	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 82, $base_unit_dec_place, value);
	}

	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 82, $base_unit_dec_place, value);
	}

	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 82, $base_unit_dec_place, value);
	}

	/**
	 * Request base unit number of decimal places 依頼基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 82, $base_unit_dec_place, value);
	}


	/**
	 * Request base unit rounding type 依頼基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 83, $base_unit_rnd_typ);
	}

	/**
	 * Request base unit rounding type 依頼基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 83, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 84, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 84, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_cmpl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 85, $not_cmpl_qty_p);
	}
	
	public void not_cmpl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 85, $not_cmpl_qty_p, row);
	}


	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public String prms_trd_unit_cd() {
		return getConstString(offset + 86, $prms_trd_unit_cd);
	}

	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public void prms_trd_unit_cd(String value) {
		setConstString(offset + 86, $prms_trd_unit_cd, value);
	}


	/**
	 * Replied transaction unit name 回答取引単位名.<p>
	 *
	 */
	public String prms_trd_unit_nm() {
		return getConstString(offset + 87, $prms_trd_unit_nm);
	}

	/**
	 * Replied transaction unit name 回答取引単位名.<p>
	 *
	 */
	public void prms_trd_unit_nm(String value) {
		setConstString(offset + 87, $prms_trd_unit_nm, value);
	}


	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_trd_unit_dec_place() {
		return getConstNumber(offset + 88, $prms_trd_unit_dec_place);
	}

	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 88, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(int value) {
		setConstNumber(offset + 88, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(long value) {
		setConstNumber(offset + 88, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(float value) {
		setConstNumber(offset + 88, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Replied transaction unit number of decimal places 回答取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(double value) {
		setConstNumber(offset + 88, $prms_trd_unit_dec_place, value);
	}


	/**
	 * Replied transaction unit rounding type 回答取引単位端数処理区分.<p>
	 *
	 */
	public String prms_trd_unit_rnd_typ() {
		return getConstString(offset + 89, $prms_trd_unit_rnd_typ);
	}

	/**
	 * Replied transaction unit rounding type 回答取引単位端数処理区分.<p>
	 *
	 */
	public void prms_trd_unit_rnd_typ(String value) {
		setConstString(offset + 89, $prms_trd_unit_rnd_typ, value);
	}


	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 90, $prms_trd_unit_conv_base_qty);
	}

	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 90, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 90, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 90, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 90, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Replied transaction unit conversion base qty. 回答取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 90, $prms_trd_unit_conv_base_qty, value);
	}


	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_qty() {
		return getConstNumber(offset + 91, $prms_trd_unit_conv_qty);
	}

	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 91, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 91, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 91, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 91, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Replied transaction unit conversion qty. 回答取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 91, $prms_trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prms_trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 92, $prms_trd_unit_qty_p);
	}
	
	public void prms_trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 92, $prms_trd_unit_qty_p, row);
	}


	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public String prms_base_unit_cd() {
		return getConstString(offset + 93, $prms_base_unit_cd);
	}

	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public void prms_base_unit_cd(String value) {
		setConstString(offset + 93, $prms_base_unit_cd, value);
	}


	/**
	 * Replied base unit name 回答基準単位名.<p>
	 *
	 */
	public String prms_base_unit_nm() {
		return getConstString(offset + 94, $prms_base_unit_nm);
	}

	/**
	 * Replied base unit name 回答基準単位名.<p>
	 *
	 */
	public void prms_base_unit_nm(String value) {
		setConstString(offset + 94, $prms_base_unit_nm, value);
	}


	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_base_unit_dec_place() {
		return getConstNumber(offset + 95, $prms_base_unit_dec_place);
	}

	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 95, $prms_base_unit_dec_place, value);
	}

	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(int value) {
		setConstNumber(offset + 95, $prms_base_unit_dec_place, value);
	}

	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(long value) {
		setConstNumber(offset + 95, $prms_base_unit_dec_place, value);
	}

	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(float value) {
		setConstNumber(offset + 95, $prms_base_unit_dec_place, value);
	}

	/**
	 * Replied base unit number of decimal places 回答基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(double value) {
		setConstNumber(offset + 95, $prms_base_unit_dec_place, value);
	}


	/**
	 * Replied base unit rounding type 回答基準単位端数処理区分.<p>
	 *
	 */
	public String prms_base_unit_rnd_typ() {
		return getConstString(offset + 96, $prms_base_unit_rnd_typ);
	}

	/**
	 * Replied base unit rounding type 回答基準単位端数処理区分.<p>
	 *
	 */
	public void prms_base_unit_rnd_typ(String value) {
		setConstString(offset + 96, $prms_base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prms_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 97, $prms_base_unit_qty_p);
	}
	
	public void prms_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 97, $prms_base_unit_qty_p, row);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 98, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 98, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return getConstString(offset + 99, $wg_re_rqst_cnt_rmrks);
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		setConstString(offset + 99, $wg_re_rqst_cnt_rmrks, value);
	}


	/**
	 * Request GI location cd. 依頼出庫場所ＣＤ.<p>
	 *
	 */
	public String rqst_gi_loc_cd() {
		return getConstString(offset + 100, $rqst_gi_loc_cd);
	}

	/**
	 * Request GI location cd. 依頼出庫場所ＣＤ.<p>
	 *
	 */
	public void rqst_gi_loc_cd(String value) {
		setConstString(offset + 100, $rqst_gi_loc_cd, value);
	}


	/**
	 * Request GI location name 依頼出庫場所名.<p>
	 *
	 */
	public String rqst_gi_loc_nm() {
		return getConstString(offset + 101, $rqst_gi_loc_nm);
	}

	/**
	 * Request GI location name 依頼出庫場所名.<p>
	 *
	 */
	public void rqst_gi_loc_nm(String value) {
		setConstString(offset + 101, $rqst_gi_loc_nm, value);
	}


	/**
	 * Request GI rack/line cd. 依頼出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_gi_str_ln_cd() {
		return getConstString(offset + 102, $rqst_gi_str_ln_cd);
	}

	/**
	 * Request GI rack/line cd. 依頼出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_gi_str_ln_cd(String value) {
		setConstString(offset + 102, $rqst_gi_str_ln_cd, value);
	}


	/**
	 * Request GI rack/line name 依頼出庫棚・ライン名.<p>
	 *
	 */
	public String rqst_gi_str_ln_nm() {
		return getConstString(offset + 103, $rqst_gi_str_ln_nm);
	}

	/**
	 * Request GI rack/line name 依頼出庫棚・ライン名.<p>
	 *
	 */
	public void rqst_gi_str_ln_nm(String value) {
		setConstString(offset + 103, $rqst_gi_str_ln_nm, value);
	}


	/**
	 * Without request GI rack/line 依頼出庫棚・ライン無.<p>
	 *
	 */
	public boolean rqst_gi_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 104, $rqst_gi_str_ln_cd_none_flg);
	}

	/**
	 * Without request GI rack/line 依頼出庫棚・ライン無.<p>
	 *
	 */
	public void rqst_gi_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 104, $rqst_gi_str_ln_cd_none_flg, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 105, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 105, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 106, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 106, $gi_loc_nm, value);
	}


	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 107, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 107, $gi_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR gi_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 108, $gi_str_ln_p);
	}
	
	public void gi_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 108, $gi_str_ln_p, row);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 109, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 109, $gi_wg_cd, value);
	}


	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public String gi_wg_nm() {
		return getConstString(offset + 110, $gi_wg_nm);
	}

	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public void gi_wg_nm(String value) {
		setConstString(offset + 110, $gi_wg_nm, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 111, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 111, $gi_lg_grp_cd, value);
	}


	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public String gi_lg_grp_nm() {
		return getConstString(offset + 112, $gi_lg_grp_nm);
	}

	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public void gi_lg_grp_nm(String value) {
		setConstString(offset + 112, $gi_lg_grp_nm, value);
	}


	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public String gi_loc_grp_cd() {
		return getConstString(offset + 113, $gi_loc_grp_cd);
	}

	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public void gi_loc_grp_cd(String value) {
		setConstString(offset + 113, $gi_loc_grp_cd, value);
	}


	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public String gi_loc_grp_nm() {
		return getConstString(offset + 114, $gi_loc_grp_nm);
	}

	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public void gi_loc_grp_nm(String value) {
		setConstString(offset + 114, $gi_loc_grp_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 115, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 115, $gi_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public String gi_site_nm() {
		return getConstString(offset + 116, $gi_site_nm);
	}

	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public void gi_site_nm(String value) {
		setConstString(offset + 116, $gi_site_nm, value);
	}


	/**
	 * Request mfg. location cd. 依頼製造場所ＣＤ.<p>
	 *
	 */
	public String rqst_mfg_loc_cd() {
		return getConstString(offset + 117, $rqst_mfg_loc_cd);
	}

	/**
	 * Request mfg. location cd. 依頼製造場所ＣＤ.<p>
	 *
	 */
	public void rqst_mfg_loc_cd(String value) {
		setConstString(offset + 117, $rqst_mfg_loc_cd, value);
	}


	/**
	 * Request mfg. location name 依頼製造場所名.<p>
	 *
	 */
	public String rqst_mfg_loc_nm() {
		return getConstString(offset + 118, $rqst_mfg_loc_nm);
	}

	/**
	 * Request mfg. location name 依頼製造場所名.<p>
	 *
	 */
	public void rqst_mfg_loc_nm(String value) {
		setConstString(offset + 118, $rqst_mfg_loc_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 119, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 119, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 120, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 120, $mfg_loc_nm, value);
	}


	/**
	 * Request BOM pattern 依頼構成パタン.<p>
	 *
	 */
	public String rqst_bom_ptn() {
		return getConstString(offset + 121, $rqst_bom_ptn);
	}

	/**
	 * Request BOM pattern 依頼構成パタン.<p>
	 *
	 */
	public void rqst_bom_ptn(String value) {
		setConstString(offset + 121, $rqst_bom_ptn, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 122, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 122, $bom_ptn, value);
	}


	/**
	 * Request supplier cd. 依頼発注先ＣＤ.<p>
	 *
	 */
	public String rqst_sppl_cd() {
		return getConstString(offset + 123, $rqst_sppl_cd);
	}

	/**
	 * Request supplier cd. 依頼発注先ＣＤ.<p>
	 *
	 */
	public void rqst_sppl_cd(String value) {
		setConstString(offset + 123, $rqst_sppl_cd, value);
	}


	/**
	 * Request supplier name 依頼発注先名.<p>
	 *
	 */
	public String rqst_sppl_nm() {
		return getConstString(offset + 124, $rqst_sppl_nm);
	}

	/**
	 * Request supplier name 依頼発注先名.<p>
	 *
	 */
	public void rqst_sppl_nm(String value) {
		setConstString(offset + 124, $rqst_sppl_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 125, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 125, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 126, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 126, $sppl_nm, value);
	}


	/**
	 * Request maker cd. 依頼メーカＣＤ.<p>
	 *
	 */
	public String rqst_maker_cd() {
		return getConstString(offset + 127, $rqst_maker_cd);
	}

	/**
	 * Request maker cd. 依頼メーカＣＤ.<p>
	 *
	 */
	public void rqst_maker_cd(String value) {
		setConstString(offset + 127, $rqst_maker_cd, value);
	}


	/**
	 * Request maker name 依頼メーカ名.<p>
	 *
	 */
	public String rqst_maker_nm() {
		return getConstString(offset + 128, $rqst_maker_nm);
	}

	/**
	 * Request maker name 依頼メーカ名.<p>
	 *
	 */
	public void rqst_maker_nm(String value) {
		setConstString(offset + 128, $rqst_maker_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 129, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 129, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 130, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 130, $maker_nm, value);
	}


	/**
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public String sim_alloc_pln_typ() {
		return getConstString(offset + 131, $sim_alloc_pln_typ);
	}

	/**
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public void sim_alloc_pln_typ(String value) {
		setConstString(offset + 131, $sim_alloc_pln_typ, value);
	}


	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public String sim_alloc_pln_typ_nm() {
		return getConstString(offset + 132, $sim_alloc_pln_typ_nm);
	}

	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public void sim_alloc_pln_typ_nm(String value) {
		setConstString(offset + 132, $sim_alloc_pln_typ_nm, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 133, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 133, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 134, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 134, $purc_rsn_nm, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 135, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 135, $xpns_purc_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 136, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 136, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 137, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 137, $trd_nm, value);
	}


	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 138, $trd_ptn_typ);
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 138, $trd_ptn_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bditm_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 139, $bditm_p);
	}
	
	public void bditm_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 139, $bditm_p, row);
	}


	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 140, $prms_rmrks);
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 140, $prms_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 141, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 141, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 142, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 142, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 143, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 143, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 144, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 144, $sub_char3, value);
	}


	/**
	 * Date edited by request source 依頼元訂正日.<p>
	 *
	 */
	public MCDate rqst_crrct_dt() {
		return getConstDate(offset + 145, $rqst_crrct_dt);
	}

	/**
	 * Date edited by request source 依頼元訂正日.<p>
	 *
	 */
	public void rqst_crrct_dt(MCDate value) {
		setConstDate(offset + 145, $rqst_crrct_dt, value);
	}


	/**
	 * Request source cancellation date 依頼元取消日.<p>
	 *
	 */
	public MCDate rqst_can_dt() {
		return getConstDate(offset + 146, $rqst_can_dt);
	}

	/**
	 * Request source cancellation date 依頼元取消日.<p>
	 *
	 */
	public void rqst_can_dt(MCDate value) {
		setConstDate(offset + 146, $rqst_can_dt, value);
	}


	/**
	 * Reply cancelled date 回答通知取消日.<p>
	 *
	 */
	public MCDate prms_can_dt() {
		return getConstDate(offset + 147, $prms_can_dt);
	}

	/**
	 * Reply cancelled date 回答通知取消日.<p>
	 *
	 */
	public void prms_can_dt(MCDate value) {
		setConstDate(offset + 147, $prms_can_dt, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 148, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 148, $inst_dt, value);
	}


	/**
	 * Order cancellation date 指図取消日.<p>
	 *
	 */
	public MCDate inst_can_dt() {
		return getConstDate(offset + 149, $inst_can_dt);
	}

	/**
	 * Order cancellation date 指図取消日.<p>
	 *
	 */
	public void inst_can_dt(MCDate value) {
		setConstDate(offset + 149, $inst_can_dt, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 150, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 150, $act_dt, value);
	}


	/**
	 * Result cancel date 実績取消日.<p>
	 *
	 */
	public MCDate act_can_dt() {
		return getConstDate(offset + 151, $act_can_dt);
	}

	/**
	 * Result cancel date 実績取消日.<p>
	 *
	 */
	public void act_can_dt(MCDate value) {
		setConstDate(offset + 151, $act_can_dt, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 152, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 152, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 153, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 153, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 154, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 154, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 155, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 155, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 156, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 156, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 157, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 157, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 158, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 158, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 159, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 159, $sppl_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 160, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 160, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 161, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 161, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 162, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 162, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 163, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 163, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 164, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 164, $ins_ts, value);
	}


	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public MCNumber wg_rqst_upd_cntr() {
		return getConstNumber(offset + 165, $wg_rqst_upd_cntr);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 165, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(int value) {
		setConstNumber(offset + 165, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(long value) {
		setConstNumber(offset + 165, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(float value) {
		setConstNumber(offset + 165, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(double value) {
		setConstNumber(offset + 165, $wg_rqst_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 166, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 166, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 167, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 167, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 168, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 168, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 169, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 169, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 170, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 170, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 171, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 171, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
		}
		if ($wg_rqst_sts_typ.equalsIgnoreCase(name)) {
			return wg_rqst_sts_typ();
		}
		if ($wg_rqst_sts_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_sts_typ_nm();
		}
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ();
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ_nm();
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			return wg_rqst_src_no();
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			return rqst_fr_wg_cd();
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			return rqst_fr_wg_nm();
		}
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			return prms_trd_unit_nm();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			return prms_base_unit_nm();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($rqst_gi_loc_cd.equalsIgnoreCase(name)) {
			return rqst_gi_loc_cd();
		}
		if ($rqst_gi_loc_nm.equalsIgnoreCase(name)) {
			return rqst_gi_loc_nm();
		}
		if ($rqst_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_cd();
		}
		if ($rqst_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return gi_loc_grp_cd();
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			return gi_loc_grp_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($rqst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return rqst_mfg_loc_cd();
		}
		if ($rqst_mfg_loc_nm.equalsIgnoreCase(name)) {
			return rqst_mfg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($rqst_bom_ptn.equalsIgnoreCase(name)) {
			return rqst_bom_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			return rqst_sppl_cd();
		}
		if ($rqst_sppl_nm.equalsIgnoreCase(name)) {
			return rqst_sppl_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_maker_cd.equalsIgnoreCase(name)) {
			return rqst_maker_cd();
		}
		if ($rqst_maker_nm.equalsIgnoreCase(name)) {
			return rqst_maker_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ();
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			return gr_rqst_dt();
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			return gr_rqst_hm();
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			return gi_rqst_dt();
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			return gi_rqst_hm();
		}
		if ($rqst_crrct_dt.equalsIgnoreCase(name)) {
			return rqst_crrct_dt();
		}
		if ($rqst_can_dt.equalsIgnoreCase(name)) {
			return rqst_can_dt();
		}
		if ($prms_can_dt.equalsIgnoreCase(name)) {
			return prms_can_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_can_dt.equalsIgnoreCase(name)) {
			return inst_can_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_can_dt.equalsIgnoreCase(name)) {
			return act_can_dt();
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
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			return prms_div_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($last_prms_ntc_flg.equalsIgnoreCase(name)) {
			return last_prms_ntc_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($rqst_crrct_flg.equalsIgnoreCase(name)) {
			return rqst_crrct_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($rqst_gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_cd_none_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
		}
		if ($wg_rqst_sts_typ.equalsIgnoreCase(name)) {
			return wg_rqst_sts_typ();
		}
		if ($wg_rqst_sts_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_sts_typ_nm();
		}
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ();
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ_nm();
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			return wg_rqst_src_no();
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			return rqst_fr_wg_cd();
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			return rqst_fr_wg_nm();
		}
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			return prms_trd_unit_nm();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			return prms_base_unit_nm();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($rqst_gi_loc_cd.equalsIgnoreCase(name)) {
			return rqst_gi_loc_cd();
		}
		if ($rqst_gi_loc_nm.equalsIgnoreCase(name)) {
			return rqst_gi_loc_nm();
		}
		if ($rqst_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_cd();
		}
		if ($rqst_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return gi_loc_grp_cd();
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			return gi_loc_grp_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($rqst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return rqst_mfg_loc_cd();
		}
		if ($rqst_mfg_loc_nm.equalsIgnoreCase(name)) {
			return rqst_mfg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($rqst_bom_ptn.equalsIgnoreCase(name)) {
			return rqst_bom_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			return rqst_sppl_cd();
		}
		if ($rqst_sppl_nm.equalsIgnoreCase(name)) {
			return rqst_sppl_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_maker_cd.equalsIgnoreCase(name)) {
			return rqst_maker_cd();
		}
		if ($rqst_maker_nm.equalsIgnoreCase(name)) {
			return rqst_maker_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ();
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			return gr_rqst_dt();
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			return gr_rqst_hm();
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			return gi_rqst_dt();
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			return gi_rqst_hm();
		}
		if ($rqst_crrct_dt.equalsIgnoreCase(name)) {
			return rqst_crrct_dt();
		}
		if ($rqst_can_dt.equalsIgnoreCase(name)) {
			return rqst_can_dt();
		}
		if ($prms_can_dt.equalsIgnoreCase(name)) {
			return prms_can_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_can_dt.equalsIgnoreCase(name)) {
			return inst_can_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_can_dt.equalsIgnoreCase(name)) {
			return act_can_dt();
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
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			return prms_div_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($last_prms_ntc_flg.equalsIgnoreCase(name)) {
			return last_prms_ntc_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($rqst_crrct_flg.equalsIgnoreCase(name)) {
			return rqst_crrct_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($rqst_gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_gi_str_ln_cd_none_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
			return;
		}
		if ($wg_rqst_sts_typ.equalsIgnoreCase(name)) {
			wg_rqst_sts_typ(value);
			return;
		}
		if ($wg_rqst_sts_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_sts_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			wg_rqst_src_typ(value);
			return;
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_src_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			wg_rqst_src_no(value);
			return;
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			rqst_fr_wg_cd(value);
			return;
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			rqst_fr_wg_nm(value);
			return;
		}
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			rqst_to_wg_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			prms_trd_unit_nm(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			prms_base_unit_nm(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_gi_loc_cd.equalsIgnoreCase(name)) {
			rqst_gi_loc_cd(value);
			return;
		}
		if ($rqst_gi_loc_nm.equalsIgnoreCase(name)) {
			rqst_gi_loc_nm(value);
			return;
		}
		if ($rqst_gi_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_cd(value);
			return;
		}
		if ($rqst_gi_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			gi_loc_grp_cd(value);
			return;
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			gi_loc_grp_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($rqst_mfg_loc_cd.equalsIgnoreCase(name)) {
			rqst_mfg_loc_cd(value);
			return;
		}
		if ($rqst_mfg_loc_nm.equalsIgnoreCase(name)) {
			rqst_mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($rqst_bom_ptn.equalsIgnoreCase(name)) {
			rqst_bom_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			rqst_sppl_cd(value);
			return;
		}
		if ($rqst_sppl_nm.equalsIgnoreCase(name)) {
			rqst_sppl_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_maker_cd.equalsIgnoreCase(name)) {
			rqst_maker_cd(value);
			return;
		}
		if ($rqst_maker_nm.equalsIgnoreCase(name)) {
			rqst_maker_nm(value);
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
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ(value);
			return;
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
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
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			gr_rqst_dt(value);
			return;
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			gr_rqst_hm(value);
			return;
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			gi_rqst_dt(value);
			return;
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			gi_rqst_hm(value);
			return;
		}
		if ($rqst_crrct_dt.equalsIgnoreCase(name)) {
			rqst_crrct_dt(value);
			return;
		}
		if ($rqst_can_dt.equalsIgnoreCase(name)) {
			rqst_can_dt(value);
			return;
		}
		if ($prms_can_dt.equalsIgnoreCase(name)) {
			prms_can_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_can_dt.equalsIgnoreCase(name)) {
			inst_can_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_can_dt.equalsIgnoreCase(name)) {
			act_can_dt(value);
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
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			prms_div_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($last_prms_ntc_flg.equalsIgnoreCase(name)) {
			last_prms_ntc_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($rqst_crrct_flg.equalsIgnoreCase(name)) {
			rqst_crrct_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
			return;
		}
		if ($rqst_gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
			return;
		}
		if ($wg_rqst_sts_typ.equalsIgnoreCase(name)) {
			wg_rqst_sts_typ(value);
			return;
		}
		if ($wg_rqst_sts_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_sts_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			wg_rqst_src_typ(value);
			return;
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_src_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			wg_rqst_src_no(value);
			return;
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			rqst_fr_wg_cd(value);
			return;
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			rqst_fr_wg_nm(value);
			return;
		}
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			rqst_to_wg_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			prms_trd_unit_nm(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			prms_base_unit_nm(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_gi_loc_cd.equalsIgnoreCase(name)) {
			rqst_gi_loc_cd(value);
			return;
		}
		if ($rqst_gi_loc_nm.equalsIgnoreCase(name)) {
			rqst_gi_loc_nm(value);
			return;
		}
		if ($rqst_gi_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_cd(value);
			return;
		}
		if ($rqst_gi_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			gi_loc_grp_cd(value);
			return;
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			gi_loc_grp_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($rqst_mfg_loc_cd.equalsIgnoreCase(name)) {
			rqst_mfg_loc_cd(value);
			return;
		}
		if ($rqst_mfg_loc_nm.equalsIgnoreCase(name)) {
			rqst_mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($rqst_bom_ptn.equalsIgnoreCase(name)) {
			rqst_bom_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($rqst_sppl_cd.equalsIgnoreCase(name)) {
			rqst_sppl_cd(value);
			return;
		}
		if ($rqst_sppl_nm.equalsIgnoreCase(name)) {
			rqst_sppl_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_maker_cd.equalsIgnoreCase(name)) {
			rqst_maker_cd(value);
			return;
		}
		if ($rqst_maker_nm.equalsIgnoreCase(name)) {
			rqst_maker_nm(value);
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
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ(value);
			return;
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
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
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
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
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			gr_rqst_dt(value);
			return;
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			gr_rqst_hm(value);
			return;
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			gi_rqst_dt(value);
			return;
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			gi_rqst_hm(value);
			return;
		}
		if ($rqst_crrct_dt.equalsIgnoreCase(name)) {
			rqst_crrct_dt(value);
			return;
		}
		if ($rqst_can_dt.equalsIgnoreCase(name)) {
			rqst_can_dt(value);
			return;
		}
		if ($prms_can_dt.equalsIgnoreCase(name)) {
			prms_can_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_can_dt.equalsIgnoreCase(name)) {
			inst_can_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_can_dt.equalsIgnoreCase(name)) {
			act_can_dt(value);
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
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			prms_div_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($last_prms_ntc_flg.equalsIgnoreCase(name)) {
			last_prms_ntc_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($rqst_crrct_flg.equalsIgnoreCase(name)) {
			rqst_crrct_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
			return;
		}
		if ($rqst_gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			return tdlv_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($gr_schd_dt_p.equalsIgnoreCase(name)) {
			return gr_schd_dt_p();
		}
		if ($gi_schd_dt_p.equalsIgnoreCase(name)) {
			return gi_schd_dt_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($not_cmpl_qty_p.equalsIgnoreCase(name)) {
			return not_cmpl_qty_p();
		}
		if ($prms_trd_unit_qty_p.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty_p();
		}
		if ($prms_base_unit_qty_p.equalsIgnoreCase(name)) {
			return prms_base_unit_qty_p();
		}
		if ($gi_str_ln_p.equalsIgnoreCase(name)) {
			return gi_str_ln_p();
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			return bditm_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
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
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			tdlv_p(
				((MCContainerMeta) tdlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($gr_schd_dt_p.equalsIgnoreCase(name)) {
			gr_schd_dt_p(
				((MCContainerMeta) gr_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($gi_schd_dt_p.equalsIgnoreCase(name)) {
			gi_schd_dt_p(
				((MCContainerMeta) gi_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
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
		if ($not_cmpl_qty_p.equalsIgnoreCase(name)) {
			not_cmpl_qty_p(
				((MCContainerMeta) not_cmpl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prms_trd_unit_qty_p.equalsIgnoreCase(name)) {
			prms_trd_unit_qty_p(
				((MCContainerMeta) prms_trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prms_base_unit_qty_p.equalsIgnoreCase(name)) {
			prms_base_unit_qty_p(
				((MCContainerMeta) prms_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_str_ln_p.equalsIgnoreCase(name)) {
			gi_str_ln_p(
				((MCContainerMeta) gi_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			bditm_p(
				((MCContainerMeta) bditm_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return dlv_p().bp_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		dlv_p().bp_cd(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return dlv_p().bp_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		dlv_p().bp_nm(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return dlv_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		dlv_p().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public boolean dlv_pri_prnt_flg() {
		return dlv_p().pri_prnt_flg();
	}

	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public void dlv_pri_prnt_flg(boolean value) {
		dlv_p().pri_prnt_flg(value);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return dlv_p().lg_grp_cd();
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		dlv_p().lg_grp_cd(value);
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public String dlv_lg_grp_nm() {
		return dlv_p().lg_grp_nm();
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public void dlv_lg_grp_nm(String value) {
		dlv_p().lg_grp_nm(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return dlv_p().cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		dlv_p().cntry_cd(value);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return dlv_p().cntry_nm();
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		dlv_p().cntry_nm(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return dlv_p().zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		dlv_p().zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return dlv_p().addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		dlv_p().addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return dlv_p().addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		dlv_p().addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return dlv_p().addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		dlv_p().addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return dlv_p().addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		dlv_p().addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return dlv_p().tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		dlv_p().tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return dlv_p().fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		dlv_p().fax(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return dlv_p().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		dlv_p().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return dlv_p().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		dlv_p().dlv_cntct_psn(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return tdlv_p().bp_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		tdlv_p().bp_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return tdlv_p().bp_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		tdlv_p().bp_nm(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return tdlv_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		tdlv_p().dlv_sundry_flg(value);
	}

	/**
	 * Print receiving point price 配送先価格印字.<p>
	 *
	 */
	public boolean tdlv_pri_prnt_flg() {
		return tdlv_p().pri_prnt_flg();
	}

	/**
	 * Print receiving point price 配送先価格印字.<p>
	 *
	 */
	public void tdlv_pri_prnt_flg(boolean value) {
		tdlv_p().pri_prnt_flg(value);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return tdlv_p().lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		tdlv_p().lg_grp_cd(value);
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public String tdlv_lg_grp_nm() {
		return tdlv_p().lg_grp_nm();
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public void tdlv_lg_grp_nm(String value) {
		tdlv_p().lg_grp_nm(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return tdlv_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		tdlv_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return tdlv_p().cntry_nm();
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		tdlv_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return tdlv_p().zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		tdlv_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return tdlv_p().addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		tdlv_p().addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return tdlv_p().addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		tdlv_p().addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return tdlv_p().addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		tdlv_p().addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return tdlv_p().addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		tdlv_p().addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return tdlv_p().tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		tdlv_p().tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return tdlv_p().fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		tdlv_p().fax(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return tdlv_p().dlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		tdlv_p().dlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return tdlv_p().dlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		tdlv_p().dlv_cntct_psn(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return sno_wrk_no_p().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		sno_wrk_no_p().sno1_null_flg(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return sno_wrk_no_p().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		sno_wrk_no_p().sno2_null_flg(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return sno_wrk_no_p().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		sno_wrk_no_p().sno3_null_flg(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return sno_wrk_no_p().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		sno_wrk_no_p().sno4_null_flg(value);
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return gr_schd_dt_p().ymd();
	}

	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		gr_schd_dt_p().ymd(value);
	}

	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public MCDate gr_schd_hm() {
		return gr_schd_dt_p().hm();
	}

	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public void gr_schd_hm(MCDate value) {
		gr_schd_dt_p().hm(value);
	}

	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return gi_schd_dt_p().ymd();
	}

	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		gi_schd_dt_p().ymd(value);
	}

	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public MCDate gi_schd_hm() {
		return gi_schd_dt_p().hm();
	}

	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public void gi_schd_hm(MCDate value) {
		gi_schd_dt_p().hm(value);
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Request transaction unit qty. 依頼取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Request base unit qty. 依頼基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public MCNumber not_cmpl_qty() {
		return not_cmpl_qty_p().qty();
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(MCNumber value) {
		not_cmpl_qty_p().qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(int value) {
		not_cmpl_qty_p().qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(long value) {
		not_cmpl_qty_p().qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(float value) {
		not_cmpl_qty_p().qty(value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(double value) {
		not_cmpl_qty_p().qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_qty() {
		return prms_trd_unit_qty_p().qty();
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(MCNumber value) {
		prms_trd_unit_qty_p().qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(int value) {
		prms_trd_unit_qty_p().qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(long value) {
		prms_trd_unit_qty_p().qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(float value) {
		prms_trd_unit_qty_p().qty(value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(double value) {
		prms_trd_unit_qty_p().qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public MCNumber prms_base_unit_qty() {
		return prms_base_unit_qty_p().qty();
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(MCNumber value) {
		prms_base_unit_qty_p().qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(int value) {
		prms_base_unit_qty_p().qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(long value) {
		prms_base_unit_qty_p().qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(float value) {
		prms_base_unit_qty_p().qty(value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(double value) {
		prms_base_unit_qty_p().qty(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return gi_str_ln_p().str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		gi_str_ln_p().str_ln_cd(value);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return gi_str_ln_p().str_ln_nm();
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		gi_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public boolean gi_str_ln_cd_none_flg() {
		return gi_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public void gi_str_ln_cd_none_flg(boolean value) {
		gi_str_ln_p().str_ln_cd_none_flg(value);
	}

	public String bd_dpt_cd() {
		return bditm_p().bd_dpt_cd();
	}

	public void bd_dpt_cd(String value) {
		bditm_p().bd_dpt_cd(value);
	}

	public String bd_dpt_nm() {
		return bditm_p().bd_dpt_nm();
	}

	public void bd_dpt_nm(String value) {
		bditm_p().bd_dpt_nm(value);
	}

	public String bd_itm_cd() {
		return bditm_p().bd_itm_cd();
	}

	public void bd_itm_cd(String value) {
		bditm_p().bd_itm_cd(value);
	}

	public String bd_itm_sub1() {
		return bditm_p().bd_itm_sub1();
	}

	public void bd_itm_sub1(String value) {
		bditm_p().bd_itm_sub1(value);
	}

	public String bd_itm_sub2() {
		return bditm_p().bd_itm_sub2();
	}

	public void bd_itm_sub2(String value) {
		bditm_p().bd_itm_sub2(value);
	}

	public String bd_itm_sub3() {
		return bditm_p().bd_itm_sub3();
	}

	public void bd_itm_sub3(String value) {
		bditm_p().bd_itm_sub3(value);
	}

	public String bd_itm_nm() {
		return bditm_p().bd_itm_nm();
	}

	public void bd_itm_nm(String value) {
		bditm_p().bd_itm_nm(value);
	}

	public String bd_lot_no() {
		return bditm_p().bd_lot_no();
	}

	public void bd_lot_no(String value) {
		bditm_p().bd_lot_no(value);
	}

	public String bd_sublot_no() {
		return bditm_p().bd_sublot_no();
	}

	public void bd_sublot_no(String value) {
		bditm_p().bd_sublot_no(value);
	}

	public String bd_sno1() {
		return bditm_p().bd_sno1();
	}

	public void bd_sno1(String value) {
		bditm_p().bd_sno1(value);
	}

	public String bd_sno2() {
		return bditm_p().bd_sno2();
	}

	public void bd_sno2(String value) {
		bditm_p().bd_sno2(value);
	}

	public String bd_sno3() {
		return bditm_p().bd_sno3();
	}

	public void bd_sno3(String value) {
		bditm_p().bd_sno3(value);
	}

	public String bd_sno4() {
		return bditm_p().bd_sno4();
	}

	public void bd_sno4(String value) {
		bditm_p().bd_sno4(value);
	}

	public String bd_bp_cd() {
		return bditm_p().bd_bp_cd();
	}

	public void bd_bp_cd(String value) {
		bditm_p().bd_bp_cd(value);
	}

	public String bd_bp_nm() {
		return bditm_p().bd_bp_nm();
	}

	public void bd_bp_nm(String value) {
		bditm_p().bd_bp_nm(value);
	}

	public String bd_loc_cd() {
		return bditm_p().bd_loc_cd();
	}

	public void bd_loc_cd(String value) {
		bditm_p().bd_loc_cd(value);
	}

	public String bd_loc_nm() {
		return bditm_p().bd_loc_nm();
	}

	public void bd_loc_nm(String value) {
		bditm_p().bd_loc_nm(value);
	}

	public String bd_ctg_cd() {
		return bditm_p().bd_ctg_cd();
	}

	public void bd_ctg_cd(String value) {
		bditm_p().bd_ctg_cd(value);
	}

	public String bd_ctg_nm() {
		return bditm_p().bd_ctg_nm();
	}

	public void bd_ctg_nm(String value) {
		bditm_p().bd_ctg_nm(value);
	}

	public String bd_oper_cd() {
		return bditm_p().bd_oper_cd();
	}

	public void bd_oper_cd(String value) {
		bditm_p().bd_oper_cd(value);
	}

	public String bd_oper_nm() {
		return bditm_p().bd_oper_nm();
	}

	public void bd_oper_nm(String value) {
		bditm_p().bd_oper_nm(value);
	}

	public String bd_iv_no() {
		return bditm_p().bd_iv_no();
	}

	public void bd_iv_no(String value) {
		bditm_p().bd_iv_no(value);
	}

	public String bd_slo_no() {
		return bditm_p().bd_slo_no();
	}

	public void bd_slo_no(String value) {
		bditm_p().bd_slo_no(value);
	}

	public String bd_po_no() {
		return bditm_p().bd_po_no();
	}

	public void bd_po_no(String value) {
		bditm_p().bd_po_no(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
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
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
	}

}

