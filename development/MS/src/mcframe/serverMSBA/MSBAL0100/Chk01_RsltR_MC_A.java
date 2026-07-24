package mcframe.serverMSBA.MSBAL0100;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $last_wg_rqst_no = "last_wg_rqst_no";
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
	 * Request date 依頼日.<p>
	 *
	 */
	public static final String $rqst_dt = "rqst_dt";
	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public static final String $re_rqst_dt = "re_rqst_dt";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
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
	public static final String $gr_loc_sppl_cd = "gr_loc_sppl_cd";
	public static final String $gr_loc_cal_cd = "gr_loc_cal_cd";
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gr_str_ln_tgt_flg = "gr_str_ln_tgt_flg";
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
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_grp_cd = "gr_loc_grp_cd";
	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public static final String $gr_loc_grp_nm = "gr_loc_grp_nm";
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
	public static final String $gr_loc_wg_cd = "gr_loc_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_loc_wg_nm = "gr_loc_wg_nm";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gr_site_nm = "gr_site_nm";
	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public static final String $gr_rqst_tm = "gr_rqst_tm";
	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public static final String $gi_rqst_tm = "gi_rqst_tm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_cd = "rqst_to_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_to_loc_nm = "rqst_to_loc_nm";
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_tgt_flg = "rqst_to_str_ln_tgt_flg";
	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_cd = "rqst_to_str_ln_cd";
	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_nm = "rqst_to_str_ln_nm";
	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_cd_none_flg = "rqst_to_str_ln_cd_none_flg";
	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_grp_cd = "rqst_to_loc_grp_cd";
	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public static final String $rqst_to_loc_grp_nm = "rqst_to_loc_grp_nm";
	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_cd = "rqst_to_lg_grp_cd";
	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_nm = "rqst_to_lg_grp_nm";
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_site_cd = "rqst_to_site_cd";
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $rqst_to_site_nm = "rqst_to_site_nm";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public static final String $not_cmpl_qty = "not_cmpl_qty";
	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public static final String $cmpl_qty = "cmpl_qty";
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public static final String $bd_itm_cd = "bd_itm_cd";
	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public static final String $bd_itm_sub1 = "bd_itm_sub1";
	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public static final String $bd_itm_sub2 = "bd_itm_sub2";
	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public static final String $bd_itm_sub3 = "bd_itm_sub3";
	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public static final String $bd_itm_nm = "bd_itm_nm";
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
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public static final String $bd_lot_no = "bd_lot_no";
	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public static final String $bd_sublot_no = "bd_sublot_no";
	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public static final String $bd_sno1 = "bd_sno1";
	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public static final String $bd_sno2 = "bd_sno2";
	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public static final String $bd_sno3 = "bd_sno3";
	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public static final String $bd_sno4 = "bd_sno4";
	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public static final String $bd_bp_cd = "bd_bp_cd";
	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public static final String $bd_bp_nm = "bd_bp_nm";
	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public static final String $bd_loc_cd = "bd_loc_cd";
	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public static final String $bd_loc_nm = "bd_loc_nm";
	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public static final String $bd_ctg_cd = "bd_ctg_cd";
	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public static final String $bd_ctg_nm = "bd_ctg_nm";
	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public static final String $bd_oper_cd = "bd_oper_cd";
	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public static final String $bd_oper_nm = "bd_oper_nm";
	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public static final String $bd_iv_no = "bd_iv_no";
	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public static final String $bd_slo_no = "bd_slo_no";
	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public static final String $bd_po_no = "bd_po_no";
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
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
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
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public static final String $wg_rqst_intr_rmrks = "wg_rqst_intr_rmrks";
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
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
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
	public static final String $po_schd_dt = "po_schd_dt";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta prms_uncn_flg_META = createCommonMeta($prms_uncn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_rqst_flg_META = createCommonMeta($re_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta last_wg_rqst_no_META = createCommonMeta($last_wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMS.meta.MS_META.WG_RQST_TYP);
	public static final MCMeta wg_rqst_typ_nm_META = createCommonMeta($wg_rqst_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_TYP_NM);
	public static final MCMeta wg_rqst_sts_typ_META = createCommonMeta($wg_rqst_sts_typ, mcframe.commonMS.meta.MS_META.WG_RQST_STS_TYP);
	public static final MCMeta wg_rqst_sts_typ_nm_META = createCommonMeta($wg_rqst_sts_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_STS_TYP_NM);
	public static final MCMeta wg_rqst_src_typ_META = createCommonMeta($wg_rqst_src_typ, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP);
	public static final MCMeta wg_rqst_src_typ_nm_META = createCommonMeta($wg_rqst_src_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP_NM);
	public static final MCMeta wg_rqst_src_no_META = createCommonMeta($wg_rqst_src_no, mcframe.commonMA.meta.MA_META.WG_RQST_SRC_NO);
	public static final MCMeta rqst_fr_wg_cd_META = createCommonMeta($rqst_fr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_fr_wg_nm_META = createCommonMeta($rqst_fr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_dt_META = createCommonMeta($rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_rqst_dt_META = createCommonMeta($re_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_loc_sppl_cd_META = createCommonMeta($gr_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_loc_cal_cd_META = createCommonMeta($gr_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta gr_str_ln_tgt_flg_META = createCommonMeta($gr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_str_ln_cd_none_flg_META = createCommonMeta($gr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_loc_grp_cd_META = createCommonMeta($gr_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta gr_loc_grp_nm_META = createCommonMeta($gr_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_lg_grp_nm_META = createCommonMeta($gr_lg_grp_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_loc_wg_cd_META = createCommonMeta($gr_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_loc_wg_nm_META = createCommonMeta($gr_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_nm_META = createCommonMeta($gr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gr_rqst_tm_META = createCommonMeta($gr_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gi_rqst_tm_META = createCommonMeta($gi_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_to_loc_nm_META = createCommonMeta($rqst_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_to_str_ln_tgt_flg_META = createCommonMeta($rqst_to_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_to_str_ln_cd_META = createCommonMeta($rqst_to_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta rqst_to_str_ln_nm_META = createCommonMeta($rqst_to_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta rqst_to_str_ln_cd_none_flg_META = createCommonMeta($rqst_to_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_to_loc_grp_cd_META = createCommonMeta($rqst_to_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_to_loc_grp_nm_META = createCommonMeta($rqst_to_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta rqst_to_lg_grp_cd_META = createCommonMeta($rqst_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta rqst_to_lg_grp_nm_META = createCommonMeta($rqst_to_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta rqst_to_site_cd_META = createCommonMeta($rqst_to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_to_site_nm_META = createCommonMeta($rqst_to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta rqst_to_wg_cd_META = createCommonMeta($rqst_to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_to_wg_nm_META = createCommonMeta($rqst_to_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_cmpl_qty_META = createCommonMeta($not_cmpl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cmpl_qty_META = createCommonMeta($cmpl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_itm_cd_META = createCommonMeta($bd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta bd_itm_sub1_META = createCommonMeta($bd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta bd_itm_sub2_META = createCommonMeta($bd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta bd_itm_sub3_META = createCommonMeta($bd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bd_itm_nm_META = createCommonMeta($bd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_lot_no_META = createCommonMeta($bd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta bd_sublot_no_META = createCommonMeta($bd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bd_sno1_META = createCommonMeta($bd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta bd_sno2_META = createCommonMeta($bd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta bd_sno3_META = createCommonMeta($bd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta bd_sno4_META = createCommonMeta($bd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bd_bp_nm_META = createCommonMeta($bd_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bd_loc_cd_META = createCommonMeta($bd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bd_loc_nm_META = createCommonMeta($bd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bd_ctg_cd_META = createCommonMeta($bd_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta bd_ctg_nm_META = createCommonMeta($bd_ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta bd_oper_cd_META = createCommonMeta($bd_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bd_oper_nm_META = createCommonMeta($bd_oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bd_iv_no_META = createCommonMeta($bd_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_slo_no_META = createCommonMeta($bd_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta bd_po_no_META = createCommonMeta($bd_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta wg_re_rqst_cnt_rmrks_META = createCommonMeta($wg_re_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RE_RQST_CNT_RMRKS);
	public static final MCMeta wg_rqst_intr_rmrks_META = createCommonMeta($wg_rqst_intr_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
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
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			prms_uncn_flg_META,
			re_rqst_flg_META,
			wg_rqst_no_META,
			last_wg_rqst_no_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			wg_rqst_typ_META,
			wg_rqst_typ_nm_META,
			wg_rqst_sts_typ_META,
			wg_rqst_sts_typ_nm_META,
			wg_rqst_src_typ_META,
			wg_rqst_src_typ_nm_META,
			wg_rqst_src_no_META,
			rqst_fr_wg_cd_META,
			rqst_fr_wg_nm_META,
			rqst_dt_META,
			re_rqst_dt_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
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
			dscnt_itm_flg_META,
			ver_flg_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_loc_sppl_cd_META,
			gr_loc_cal_cd_META,
			gr_str_ln_tgt_flg_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_str_ln_cd_none_flg_META,
			gr_loc_grp_cd_META,
			gr_loc_grp_nm_META,
			gr_lg_grp_cd_META,
			gr_lg_grp_nm_META,
			gr_loc_wg_cd_META,
			gr_loc_wg_nm_META,
			gr_site_cd_META,
			gr_site_nm_META,
			gr_rqst_tm_META,
			gi_rqst_tm_META,
			rqst_to_loc_cd_META,
			rqst_to_loc_nm_META,
			rqst_to_str_ln_tgt_flg_META,
			rqst_to_str_ln_cd_META,
			rqst_to_str_ln_nm_META,
			rqst_to_str_ln_cd_none_flg_META,
			rqst_to_loc_grp_cd_META,
			rqst_to_loc_grp_nm_META,
			rqst_to_lg_grp_cd_META,
			rqst_to_lg_grp_nm_META,
			rqst_to_site_cd_META,
			rqst_to_site_nm_META,
			itm_ord_no_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_cal_cd_META,
			sppl_iv_flg_META,
			prnt_lcl_cd_META,
			maker_cd_META,
			maker_nm_META,
			bom_ptn_META,
			rqst_to_wg_cd_META,
			rqst_to_wg_nm_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			not_cmpl_qty_META,
			cmpl_qty_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			wrk_no_META,
			wrk_nm_META,
			ver_no_META,
			gd_cd_META,
			gd_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			bd_itm_cd_META,
			bd_itm_sub1_META,
			bd_itm_sub2_META,
			bd_itm_sub3_META,
			bd_itm_nm_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			bd_lot_no_META,
			bd_sublot_no_META,
			bd_sno1_META,
			bd_sno2_META,
			bd_sno3_META,
			bd_sno4_META,
			bd_bp_cd_META,
			bd_bp_nm_META,
			bd_loc_cd_META,
			bd_loc_nm_META,
			bd_ctg_cd_META,
			bd_ctg_nm_META,
			bd_oper_cd_META,
			bd_oper_nm_META,
			bd_iv_no_META,
			bd_slo_no_META,
			bd_po_no_META,
			slo_no_META,
			slo_d_no_META,
			io_schd_pr_no_META,
			wg_rqst_cnt_rmrks_META,
			wg_re_rqst_cnt_rmrks_META,
			wg_rqst_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rtn_sts_typ_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
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
			upd_srv_req_no_META,
			po_schd_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$wg_rqst_no, "E"}	// wg_rqst_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$wg_rqst_typ, "E"},	// wg_rqst_typ
				{$rqst_fr_wg_cd, "E"},	// rqst_fr_wg_cd
				{$rqst_dt, "E"},	// rqst_dt
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$gr_loc_cd, "E"},	// gr_loc_cd
				{$gr_rqst_tm, "E"},	// gr_rqst_tm
				{$trd_unit_qty, "E"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$rqst_dt, "bfToday"},	// rqst_dt
				{$re_rqst_dt, "bfToday"}	// re_rqst_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$rqst_dt, "rqst_dt:BF"},	// rqst_dt
				{$re_rqst_dt, "rqst_dt:AF"},	// re_rqst_dt
				{$gr_rqst_tm, "rqst_tm:AF"},	// gr_rqst_tm
				{$gi_rqst_tm, "rqst_tm:BF"}	// gi_rqst_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$wg_rqst_no, "wg_rqst_no"}	// wg_rqst_no
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$rqst_fr_wg_cd, "MA.MAUAL0010.Wg"},	// rqst_fr_wg_cd
				{$rqst_fr_usr_cd, "MA.MAUAL0010.Usr"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "MA.MAUAL0010.Dpt"},	// rqst_fr_dpt_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$gr_loc_cd, "MA.MAUAL0010.Loc"},	// gr_loc_cd
				{$gr_str_ln_cd, "MA.MAUAL0010.StrLn"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "MA.MAUAL0010.Loc"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "MA.MAUAL0010.StrLn"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "MA.MAUAL0010.Loc"},	// mfg_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$rqst_to_wg_cd, "MA.MAUAL0010.Wg"},	// rqst_to_wg_cd
				{$purc_rsn_cd, "MA.MAUAL0010.PurcBizRsn"},	// purc_rsn_cd
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$ver_no, "MA.MAUAL0010.ItmVer"},	// ver_no
				{$gd_cd, "MA.MAUAL0010.StkGd"},	// gd_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// bd_dpt_cd
				{$bd_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// bd_itm_sub3
				{$bd_bp_cd, "MA.MAUAL0010.Bp"},	// bd_bp_cd
				{$bd_loc_cd, "MA.MAUAL0010.Loc"},	// bd_loc_cd
				{$bd_ctg_cd, "MA.MAUAL0010.CostCtg"},	// bd_ctg_cd
				{$bd_oper_cd, "MA.MAUAL0010.Oper"}	// bd_oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$rqst_fr_wg_cd, "rqst_fr_wg_nm"},	// rqst_fr_wg_cd
				{$rqst_fr_usr_cd, "rqst_fr_usr_nm"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "rqst_fr_dpt_nm"},	// rqst_fr_dpt_cd
				{$itm_sub3, "sundry_itm_flg;itm_nm;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;base_unit_cd;base_unit_nm;base_unit_dec_place;base_unit_rnd_typ;asset_mng_typ;ver_flg;dscnt_itm_flg"},	// itm_sub3
				{$gr_loc_cd, "gr_loc_nm;gr_loc_wg_cd;gr_loc_wg_nm;gr_site_cd;gr_site_nm;gr_lg_grp_cd;gr_lg_grp_nm;gr_loc_grp_cd;gr_loc_grp_nm;gr_str_ln_tgt_flg;gr_loc_sppl_cd;gr_loc_cal_cd"},	// gr_loc_cd
				{$gr_str_ln_cd, "gr_str_ln_nm"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "rqst_to_loc_nm;rqst_to_loc_wg_cd;rqst_to_loc_wg_nm;rqst_to_wg_cd;rqst_to_wg_nm;rqst_to_site_cd;rqst_to_site_nm;rqst_to_lg_grp_cd;rqst_to_lg_grp_nm;rqst_to_loc_grp_cd;rqst_to_loc_grp_nm;rqst_to_str_ln_tgt_flg"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "rqst_to_str_ln_nm"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "mfg_loc_nm;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$sppl_cd, "sppl_nm;sppl_iv_flg;prnt_lcl_cd;sppl_cal_cd"},	// sppl_cd
				{$maker_cd, "maker_nm"},	// maker_cd
				{$rqst_to_wg_cd, "rqst_to_wg_nm"},	// rqst_to_wg_cd
				{$purc_rsn_cd, "purc_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$trd_cd, "trd_nm;trd_ptn_typ"},	// trd_cd
				{$trd_unit_cd, "trd_unit_nm;trd_unit_dec_place;trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_rnd_typ"},	// trd_unit_cd
				{$ver_no, "ver_no"},	// ver_no
				{$gd_cd, "gd_nm"},	// gd_cd
				{$bd_dpt_cd, "bd_dpt_nm"},	// bd_dpt_cd
				{$bd_itm_sub3, "bd_itm_nm;bd_lot_mng_typ;bd_lot_no_typ;bd_sublot_mng_typ;bd_sublot_no_typ;bd_sno1_mng_typ;bd_sno2_mng_typ;bd_sno3_mng_typ;bd_sno4_mng_typ"},	// bd_itm_sub3
				{$bd_bp_cd, "bd_bp_nm"},	// bd_bp_cd
				{$bd_loc_cd, "bd_loc_nm"},	// bd_loc_cd
				{$bd_ctg_cd, "bd_ctg_nm"},	// bd_ctg_cd
				{$bd_oper_cd, "bd_oper_nm"}	// bd_oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$rqst_fr_wg_cd, "wg_nm"},	// rqst_fr_wg_cd
				{$rqst_fr_usr_cd, "usr_nm"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "dpt_nm"},	// rqst_fr_dpt_cd
				{$itm_sub3, "sundry_itm_flg;itm_nm;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;asset_mng_typ;ver_flg;dscnt_itm_flg"},	// itm_sub3
				{$gr_loc_cd, "loc_nm;wg_cd;wg_nm;site_cd;site_nm;lg_grp_cd;lg_grp_nm;loc_grp_cd;loc_grp_nm;str_ln_tgt_flg;sppl_cd;cal_cd"},	// gr_loc_cd
				{$gr_str_ln_cd, "str_ln_nm"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "loc_nm;wg_cd;wg_nm;wg_cd;wg_nm;site_cd;site_nm;lg_grp_cd;lg_grp_nm;loc_grp_cd;loc_grp_nm;str_ln_tgt_flg"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "str_ln_nm"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "loc_nm;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$sppl_cd, "bp_nm;sppl_iv_flg;prnt_lcl_cd;sppl_cal_cd"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$rqst_to_wg_cd, "wg_nm"},	// rqst_to_wg_cd
				{$purc_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// trd_unit_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$bd_itm_sub3, "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bd_itm_sub3
				{$bd_bp_cd, "bp_nm"},	// bd_bp_cd
				{$bd_loc_cd, "loc_nm"},	// bd_loc_cd
				{$bd_ctg_cd, "ctg_nm"},	// bd_ctg_cd
				{$bd_oper_cd, "oper_nm"}	// bd_oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rqst_fr_usr_cd, "rqst_dt"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SCE;rqst_dt;rqst_fr_usr_cd"},	// rqst_fr_dpt_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_sub3
				{$gr_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// gr_loc_cd
				{$gr_str_ln_cd, "gr_loc_cd;true"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;true"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "rqst_to_loc_cd;true"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.OUTSIDE_EQ_WG;gr_loc_wg_cd;true"},	// mfg_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;gr_site_cd"},	// ver_no
				{$bd_dpt_cd, "gr_rqst_tm;MAC_DPT_IS_SRCH_TYP.BD"},	// bd_dpt_cd
				{$bd_itm_sub3, "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"},	// bd_itm_sub3
				{$bd_bp_cd, "MAC_BP_IS_SRCH_TYP.CST_DLV_SPPL"},	// bd_bp_cd
				{$bd_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"}	// bd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rqst_fr_usr_cd, "dt"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "dpt_is_srch_typ;dt;usr_cd"},	// rqst_fr_dpt_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// itm_sub3
				{$gr_loc_cd, "loc_is_srch_typ"},	// gr_loc_cd
				{$gr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "loc_is_srch_typ;mode_nullval_flg"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "loc_cd;mode_nullval_flg"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "loc_is_srch_typ;wg_cd;mode_nullval_flg"},	// mfg_loc_cd
				{$sppl_cd, "bp_is_srch_typ;mode_nullval_flg"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no
				{$bd_dpt_cd, "dt;dpt_is_srch_typ"},	// bd_dpt_cd
				{$bd_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// bd_itm_sub3
				{$bd_bp_cd, "bp_is_srch_typ"},	// bd_bp_cd
				{$bd_loc_cd, "loc_is_srch_typ"}	// bd_loc_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$wg_rqst_typ, "MSC_WG_RQST_TYP"},	// wg_rqst_typ
				{$wg_rqst_sts_typ, "MSC_WG_RQST_STS_TYP"},	// wg_rqst_sts_typ
				{$wg_rqst_src_typ, "MSC_WG_RQST_SRC_TYP"},	// wg_rqst_src_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"}	// asset_mng_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$gr_str_ln_cd, "E"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "E"},	// rqst_to_loc_cd
				{$rqst_to_str_ln_cd, "E"},	// rqst_to_str_ln_cd
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$sppl_iv_flg, "E"},	// sppl_iv_flg
				{$maker_cd, "E"},	// maker_cd
				{$bom_ptn, "E"},	// bom_ptn
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"}	// sno4
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public boolean prms_uncn_flg() {
		return getConstBoolean(offset + 3, $prms_uncn_flg);
	}

	/**
	 * Reply unchecked 回答未確認.<p>
	 *
	 */
	public void prms_uncn_flg(boolean value) {
		setConstBoolean(offset + 3, $prms_uncn_flg, value);
	}


	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return getConstBoolean(offset + 4, $re_rqst_flg);
	}

	/**
	 * Readjustment request 再調整依頼.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		setConstBoolean(offset + 4, $re_rqst_flg, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 5, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 5, $wg_rqst_no, value);
	}


	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String last_wg_rqst_no() {
		return getConstString(offset + 6, $last_wg_rqst_no);
	}

	/**
	 * Last inventory request No. from other WG 前回ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void last_wg_rqst_no(String value) {
		setConstString(offset + 6, $last_wg_rqst_no, value);
	}


	/**
	 * Notification 通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 7, $prms_ntc_flg);
	}

	/**
	 * Notification 通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 7, $prms_ntc_flg, value);
	}


	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 8, $prms_dt);
	}

	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 8, $prms_dt, value);
	}


	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 9, $re_prms_ntc_flg);
	}

	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 9, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 10, $re_prms_dt);
	}

	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 10, $re_prms_dt, value);
	}


	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 11, $wg_rqst_typ);
	}

	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 11, $wg_rqst_typ, value);
	}


	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public String wg_rqst_typ_nm() {
		return getConstString(offset + 12, $wg_rqst_typ_nm);
	}

	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public void wg_rqst_typ_nm(String value) {
		setConstString(offset + 12, $wg_rqst_typ_nm, value);
	}


	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public String wg_rqst_sts_typ() {
		return getConstString(offset + 13, $wg_rqst_sts_typ);
	}

	/**
	 * Request status type 依頼状況区分.<p>
	 *
	 */
	public void wg_rqst_sts_typ(String value) {
		setConstString(offset + 13, $wg_rqst_sts_typ, value);
	}


	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public String wg_rqst_sts_typ_nm() {
		return getConstString(offset + 14, $wg_rqst_sts_typ_nm);
	}

	/**
	 * Request status type name 依頼状況区分名.<p>
	 *
	 */
	public void wg_rqst_sts_typ_nm(String value) {
		setConstString(offset + 14, $wg_rqst_sts_typ_nm, value);
	}


	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return getConstString(offset + 15, $wg_rqst_src_typ);
	}

	/**
	 * Request source type 依頼元区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		setConstString(offset + 15, $wg_rqst_src_typ, value);
	}


	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public String wg_rqst_src_typ_nm() {
		return getConstString(offset + 16, $wg_rqst_src_typ_nm);
	}

	/**
	 * Request source type name 依頼元区分名.<p>
	 *
	 */
	public void wg_rqst_src_typ_nm(String value) {
		setConstString(offset + 16, $wg_rqst_src_typ_nm, value);
	}


	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return getConstString(offset + 17, $wg_rqst_src_no);
	}

	/**
	 * Request source identification No. 依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		setConstString(offset + 17, $wg_rqst_src_no, value);
	}


	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return getConstString(offset + 18, $rqst_fr_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		setConstString(offset + 18, $rqst_fr_wg_cd, value);
	}


	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public String rqst_fr_wg_nm() {
		return getConstString(offset + 19, $rqst_fr_wg_nm);
	}

	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public void rqst_fr_wg_nm(String value) {
		setConstString(offset + 19, $rqst_fr_wg_nm, value);
	}


	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return getConstDate(offset + 20, $rqst_dt);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		setConstDate(offset + 20, $rqst_dt, value);
	}


	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public MCDate re_rqst_dt() {
		return getConstDate(offset + 21, $re_rqst_dt);
	}

	/**
	 * Readjustment request date 再調整依頼日.<p>
	 *
	 */
	public void re_rqst_dt(MCDate value) {
		setConstDate(offset + 21, $re_rqst_dt, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 22, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 22, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 23, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 23, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 24, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 24, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 25, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 25, $rqst_fr_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 26, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 26, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 27, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 27, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 28, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 28, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 29, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 29, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 30, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 30, $itm_nm, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 31, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 31, $iv_itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 32, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 32, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 33, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 33, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 34, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 34, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 35, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 35, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 36, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 36, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 37, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 37, $sno4_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 38, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 38, $sundry_itm_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 39, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 39, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 40, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 40, $asset_mng_typ_nm, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 41, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 41, $dscnt_itm_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 42, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 42, $ver_flg, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 43, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 43, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 44, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 44, $gr_loc_nm, value);
	}


	public String gr_loc_sppl_cd() {
		return getConstString(offset + 45, $gr_loc_sppl_cd);
	}

	public void gr_loc_sppl_cd(String value) {
		setConstString(offset + 45, $gr_loc_sppl_cd, value);
	}


	public String gr_loc_cal_cd() {
		return getConstString(offset + 46, $gr_loc_cal_cd);
	}

	public void gr_loc_cal_cd(String value) {
		setConstString(offset + 46, $gr_loc_cal_cd, value);
	}


	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public boolean gr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 47, $gr_str_ln_tgt_flg);
	}

	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public void gr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 47, $gr_str_ln_tgt_flg, value);
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
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public String gr_loc_grp_cd() {
		return getConstString(offset + 51, $gr_loc_grp_cd);
	}

	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public void gr_loc_grp_cd(String value) {
		setConstString(offset + 51, $gr_loc_grp_cd, value);
	}


	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public String gr_loc_grp_nm() {
		return getConstString(offset + 52, $gr_loc_grp_nm);
	}

	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public void gr_loc_grp_nm(String value) {
		setConstString(offset + 52, $gr_loc_grp_nm, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 53, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 53, $gr_lg_grp_cd, value);
	}


	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public String gr_lg_grp_nm() {
		return getConstString(offset + 54, $gr_lg_grp_nm);
	}

	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public void gr_lg_grp_nm(String value) {
		setConstString(offset + 54, $gr_lg_grp_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_loc_wg_cd() {
		return getConstString(offset + 55, $gr_loc_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_loc_wg_cd(String value) {
		setConstString(offset + 55, $gr_loc_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_loc_wg_nm() {
		return getConstString(offset + 56, $gr_loc_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_loc_wg_nm(String value) {
		setConstString(offset + 56, $gr_loc_wg_nm, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 57, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 57, $gr_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public String gr_site_nm() {
		return getConstString(offset + 58, $gr_site_nm);
	}

	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public void gr_site_nm(String value) {
		setConstString(offset + 58, $gr_site_nm, value);
	}


	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return getConstDate(offset + 59, $gr_rqst_tm);
	}

	/**
	 * GR request date and time 入庫依頼日時.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		setConstDate(offset + 59, $gr_rqst_tm, value);
	}


	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return getConstDate(offset + 60, $gi_rqst_tm);
	}

	/**
	 * GI request date and time 出庫依頼日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		setConstDate(offset + 60, $gi_rqst_tm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 61, $rqst_to_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 61, $rqst_to_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_to_loc_nm() {
		return getConstString(offset + 62, $rqst_to_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_to_loc_nm(String value) {
		setConstString(offset + 62, $rqst_to_loc_nm, value);
	}


	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public boolean rqst_to_str_ln_tgt_flg() {
		return getConstBoolean(offset + 63, $rqst_to_str_ln_tgt_flg);
	}

	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public void rqst_to_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 63, $rqst_to_str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_to_str_ln_cd() {
		return getConstString(offset + 64, $rqst_to_str_ln_cd);
	}

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_to_str_ln_cd(String value) {
		setConstString(offset + 64, $rqst_to_str_ln_cd, value);
	}


	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public String rqst_to_str_ln_nm() {
		return getConstString(offset + 65, $rqst_to_str_ln_nm);
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public void rqst_to_str_ln_nm(String value) {
		setConstString(offset + 65, $rqst_to_str_ln_nm, value);
	}


	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public boolean rqst_to_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 66, $rqst_to_str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public void rqst_to_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 66, $rqst_to_str_ln_cd_none_flg, value);
	}


	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_grp_cd() {
		return getConstString(offset + 67, $rqst_to_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_grp_cd(String value) {
		setConstString(offset + 67, $rqst_to_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public String rqst_to_loc_grp_nm() {
		return getConstString(offset + 68, $rqst_to_loc_grp_nm);
	}

	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public void rqst_to_loc_grp_nm(String value) {
		setConstString(offset + 68, $rqst_to_loc_grp_nm, value);
	}


	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public String rqst_to_lg_grp_cd() {
		return getConstString(offset + 69, $rqst_to_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public void rqst_to_lg_grp_cd(String value) {
		setConstString(offset + 69, $rqst_to_lg_grp_cd, value);
	}


	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public String rqst_to_lg_grp_nm() {
		return getConstString(offset + 70, $rqst_to_lg_grp_nm);
	}

	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public void rqst_to_lg_grp_nm(String value) {
		setConstString(offset + 70, $rqst_to_lg_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String rqst_to_site_cd() {
		return getConstString(offset + 71, $rqst_to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void rqst_to_site_cd(String value) {
		setConstString(offset + 71, $rqst_to_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public String rqst_to_site_nm() {
		return getConstString(offset + 72, $rqst_to_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public void rqst_to_site_nm(String value) {
		setConstString(offset + 72, $rqst_to_site_nm, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 73, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 73, $itm_ord_no, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 74, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 74, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 75, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 75, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 76, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 76, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 77, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 77, $sppl_nm, value);
	}


	public String sppl_cal_cd() {
		return getConstString(offset + 78, $sppl_cal_cd);
	}

	public void sppl_cal_cd(String value) {
		setConstString(offset + 78, $sppl_cal_cd, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 79, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 79, $sppl_iv_flg, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 80, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 80, $prnt_lcl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 81, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 81, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 82, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 82, $maker_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 83, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 83, $bom_ptn, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 84, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 84, $rqst_to_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_to_wg_nm() {
		return getConstString(offset + 85, $rqst_to_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_to_wg_nm(String value) {
		setConstString(offset + 85, $rqst_to_wg_nm, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 86, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 86, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 87, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 87, $purc_rsn_nm, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 88, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 88, $xpns_purc_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 89, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 89, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 90, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 90, $trd_nm, value);
	}


	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 91, $trd_ptn_typ);
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 91, $trd_ptn_typ, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 92, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 92, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 93, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 93, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 94, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 95, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 95, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 96, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 96, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 96, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 96, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 96, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 96, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 97, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 97, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 97, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 97, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 97, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 97, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 98, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 98, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 98, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 98, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 98, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 98, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 99, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 99, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 100, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 100, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 101, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 101, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 101, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 101, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 101, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 101, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 102, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 102, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 103, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 103, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 103, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 103, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 103, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 103, $base_unit_qty, value);
	}


	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public MCNumber not_cmpl_qty() {
		return getConstNumber(offset + 104, $not_cmpl_qty);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(MCNumber value) {
		setConstNumber(offset + 104, $not_cmpl_qty, value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(int value) {
		setConstNumber(offset + 104, $not_cmpl_qty, value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(long value) {
		setConstNumber(offset + 104, $not_cmpl_qty, value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(float value) {
		setConstNumber(offset + 104, $not_cmpl_qty, value);
	}

	/**
	 * Base unit remaining request qty. 基準単位依頼残数量.<p>
	 *
	 */
	public void not_cmpl_qty(double value) {
		setConstNumber(offset + 104, $not_cmpl_qty, value);
	}


	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public MCNumber cmpl_qty() {
		return getConstNumber(offset + 105, $cmpl_qty);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void cmpl_qty(MCNumber value) {
		setConstNumber(offset + 105, $cmpl_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void cmpl_qty(int value) {
		setConstNumber(offset + 105, $cmpl_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void cmpl_qty(long value) {
		setConstNumber(offset + 105, $cmpl_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void cmpl_qty(float value) {
		setConstNumber(offset + 105, $cmpl_qty, value);
	}

	/**
	 * Base unit request qty. 基準単位依頼数量.<p>
	 *
	 */
	public void cmpl_qty(double value) {
		setConstNumber(offset + 105, $cmpl_qty, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 106, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 106, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 107, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 107, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 108, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 108, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 109, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 109, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 110, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 110, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 111, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 111, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 112, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 112, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 113, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 113, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 114, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 114, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 115, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 115, $sno4_null_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 116, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 116, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 117, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 117, $wrk_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 118, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 118, $ver_no, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 119, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 119, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 120, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 120, $gd_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 121, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 121, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 122, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 122, $bd_dpt_nm, value);
	}


	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return getConstString(offset + 123, $bd_itm_cd);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		setConstString(offset + 123, $bd_itm_cd, value);
	}


	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return getConstString(offset + 124, $bd_itm_sub1);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		setConstString(offset + 124, $bd_itm_sub1, value);
	}


	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return getConstString(offset + 125, $bd_itm_sub2);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		setConstString(offset + 125, $bd_itm_sub2, value);
	}


	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return getConstString(offset + 126, $bd_itm_sub3);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		setConstString(offset + 126, $bd_itm_sub3, value);
	}


	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public String bd_itm_nm() {
		return getConstString(offset + 127, $bd_itm_nm);
	}

	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public void bd_itm_nm(String value) {
		setConstString(offset + 127, $bd_itm_nm, value);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 128, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 128, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 129, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 129, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 130, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 130, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 131, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 131, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 132, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 132, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 133, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 133, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 134, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 134, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 135, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 135, $bd_sno4_mng_typ, value);
	}


	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return getConstString(offset + 136, $bd_lot_no);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		setConstString(offset + 136, $bd_lot_no, value);
	}


	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return getConstString(offset + 137, $bd_sublot_no);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		setConstString(offset + 137, $bd_sublot_no, value);
	}


	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return getConstString(offset + 138, $bd_sno1);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		setConstString(offset + 138, $bd_sno1, value);
	}


	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return getConstString(offset + 139, $bd_sno2);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		setConstString(offset + 139, $bd_sno2, value);
	}


	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return getConstString(offset + 140, $bd_sno3);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		setConstString(offset + 140, $bd_sno3, value);
	}


	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return getConstString(offset + 141, $bd_sno4);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		setConstString(offset + 141, $bd_sno4, value);
	}


	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 142, $bd_bp_cd);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 142, $bd_bp_cd, value);
	}


	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public String bd_bp_nm() {
		return getConstString(offset + 143, $bd_bp_nm);
	}

	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public void bd_bp_nm(String value) {
		setConstString(offset + 143, $bd_bp_nm, value);
	}


	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 144, $bd_loc_cd);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 144, $bd_loc_cd, value);
	}


	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public String bd_loc_nm() {
		return getConstString(offset + 145, $bd_loc_nm);
	}

	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public void bd_loc_nm(String value) {
		setConstString(offset + 145, $bd_loc_nm, value);
	}


	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 146, $bd_ctg_cd);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 146, $bd_ctg_cd, value);
	}


	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public String bd_ctg_nm() {
		return getConstString(offset + 147, $bd_ctg_nm);
	}

	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public void bd_ctg_nm(String value) {
		setConstString(offset + 147, $bd_ctg_nm, value);
	}


	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 148, $bd_oper_cd);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 148, $bd_oper_cd, value);
	}


	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public String bd_oper_nm() {
		return getConstString(offset + 149, $bd_oper_nm);
	}

	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public void bd_oper_nm(String value) {
		setConstString(offset + 149, $bd_oper_nm, value);
	}


	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 150, $bd_iv_no);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 150, $bd_iv_no, value);
	}


	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 151, $bd_slo_no);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 151, $bd_slo_no, value);
	}


	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 152, $bd_po_no);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 152, $bd_po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 153, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 153, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 154, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 154, $slo_d_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 155, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 155, $io_schd_pr_no, value);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 156, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 156, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return getConstString(offset + 157, $wg_re_rqst_cnt_rmrks);
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		setConstString(offset + 157, $wg_re_rqst_cnt_rmrks, value);
	}


	/**
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public String wg_rqst_intr_rmrks() {
		return getConstString(offset + 158, $wg_rqst_intr_rmrks);
	}

	/**
	 * Request source internal remarks 依頼元内部備考.<p>
	 *
	 */
	public void wg_rqst_intr_rmrks(String value) {
		setConstString(offset + 158, $wg_rqst_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 159, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 159, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 160, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 160, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 161, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 161, $sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 162, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 162, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 163, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 163, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 164, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 164, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 165, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 165, $itm_typ_d_nm, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 166, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 166, $rtn_sts_typ, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 167, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 167, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 168, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 168, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 169, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 169, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 170, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 170, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 171, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 171, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 172, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 172, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 173, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 173, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 174, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 174, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 175, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 175, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 176, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 176, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 177, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 177, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 178, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 178, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 179, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 179, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 180, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 180, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 181, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 181, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 182, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 182, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 183, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 183, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 184, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 184, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 185, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 185, $itm_grp_cd10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 186, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 186, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 187, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 187, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 188, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 188, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 189, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 189, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 190, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 190, $ins_ts, value);
	}


	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public MCNumber wg_rqst_upd_cntr() {
		return getConstNumber(offset + 191, $wg_rqst_upd_cntr);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 191, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(int value) {
		setConstNumber(offset + 191, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(long value) {
		setConstNumber(offset + 191, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(float value) {
		setConstNumber(offset + 191, $wg_rqst_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG update counter ＷＧ間依頼更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_upd_cntr(double value) {
		setConstNumber(offset + 191, $wg_rqst_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 192, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 192, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 193, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 193, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 194, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 194, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 195, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 195, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 196, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 196, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 197, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 197, $upd_srv_req_no, value);
	}


	public MCDate po_schd_dt() {
		return getConstDate(offset + 198, $po_schd_dt);
	}

	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 198, $po_schd_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($last_wg_rqst_no.equalsIgnoreCase(name)) {
			return last_wg_rqst_no();
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
		if ($gr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return gr_loc_sppl_cd();
		}
		if ($gr_loc_cal_cd.equalsIgnoreCase(name)) {
			return gr_loc_cal_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_grp_cd();
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			return gr_loc_grp_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			return gr_loc_wg_cd();
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			return gr_loc_wg_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd();
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_nm();
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_cd();
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_nm();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_nm();
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			return rqst_to_site_cd();
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			return rqst_to_site_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($wg_rqst_intr_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_intr_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			return not_cmpl_qty();
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			return cmpl_qty();
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_tgt_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($rqst_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_tgt_flg();
		}
		if ($rqst_to_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd_none_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($last_wg_rqst_no.equalsIgnoreCase(name)) {
			return last_wg_rqst_no();
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
		if ($gr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return gr_loc_sppl_cd();
		}
		if ($gr_loc_cal_cd.equalsIgnoreCase(name)) {
			return gr_loc_cal_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_grp_cd();
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			return gr_loc_grp_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			return gr_loc_wg_cd();
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			return gr_loc_wg_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd();
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_nm();
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_cd();
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_nm();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_nm();
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			return rqst_to_site_cd();
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			return rqst_to_site_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($wg_rqst_intr_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_intr_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			return not_cmpl_qty();
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			return cmpl_qty();
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			return re_rqst_dt();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_tgt_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($rqst_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_tgt_flg();
		}
		if ($rqst_to_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd_none_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($last_wg_rqst_no.equalsIgnoreCase(name)) {
			last_wg_rqst_no(value);
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
		if ($gr_loc_sppl_cd.equalsIgnoreCase(name)) {
			gr_loc_sppl_cd(value);
			return;
		}
		if ($gr_loc_cal_cd.equalsIgnoreCase(name)) {
			gr_loc_cal_cd(value);
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
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_grp_cd(value);
			return;
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			gr_loc_grp_nm(value);
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
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			gr_loc_wg_cd(value);
			return;
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			gr_loc_wg_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd(value);
			return;
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_to_str_ln_nm(value);
			return;
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_cd(value);
			return;
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_nm(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_nm(value);
			return;
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			rqst_to_site_cd(value);
			return;
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			rqst_to_site_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($wg_rqst_intr_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_intr_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gr_str_ln_tgt_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
			return;
		}
		if ($rqst_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_to_str_ln_tgt_flg(value);
			return;
		}
		if ($rqst_to_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd_none_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($last_wg_rqst_no.equalsIgnoreCase(name)) {
			last_wg_rqst_no(value);
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
		if ($gr_loc_sppl_cd.equalsIgnoreCase(name)) {
			gr_loc_sppl_cd(value);
			return;
		}
		if ($gr_loc_cal_cd.equalsIgnoreCase(name)) {
			gr_loc_cal_cd(value);
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
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_grp_cd(value);
			return;
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			gr_loc_grp_nm(value);
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
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			gr_loc_wg_cd(value);
			return;
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			gr_loc_wg_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd(value);
			return;
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_to_str_ln_nm(value);
			return;
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_cd(value);
			return;
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_nm(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_nm(value);
			return;
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			rqst_to_site_cd(value);
			return;
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			rqst_to_site_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($wg_rqst_intr_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_intr_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($not_cmpl_qty.equalsIgnoreCase(name)) {
			not_cmpl_qty(value);
			return;
		}
		if ($cmpl_qty.equalsIgnoreCase(name)) {
			cmpl_qty(value);
			return;
		}
		if ($wg_rqst_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($re_rqst_dt.equalsIgnoreCase(name)) {
			re_rqst_dt(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gr_str_ln_tgt_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
			return;
		}
		if ($rqst_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_to_str_ln_tgt_flg(value);
			return;
		}
		if ($rqst_to_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd_none_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

