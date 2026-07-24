package mcframe.serverMSBE.MSBEL2000;

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
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public static final String $trd_ptn_typ_nm = "trd_ptn_typ_nm";
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
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $rcpt_iv_itm_nm = "rcpt_iv_itm_nm";
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
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requesting dept. WG name 依頼元ＷＧ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
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
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ret_dlv_slip_d_no = "ret_dlv_slip_d_no";
	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public static final String $sret_fr_cd = "sret_fr_cd";
	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public static final String $sret_fr_nm = "sret_fr_nm";
	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $ret_stk_arrv_bp_cd = "ret_stk_arrv_bp_cd";
	/**
	 * Return-from inventory arriving point name 返品元在庫着荷先名.<p>
	 *
	 */
	public static final String $ret_stk_arrv_bp_nm = "ret_stk_arrv_bp_nm";
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public static final String $ret_loc_cd = "ret_loc_cd";
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public static final String $ret_loc_nm = "ret_loc_nm";
	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public static final String $ret_str_ln_tgt_flg = "ret_str_ln_tgt_flg";
	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ret_str_ln_cd = "ret_str_ln_cd";
	/**
	 * Return-from source rack/line name 返品元棚・ライン名.<p>
	 *
	 */
	public static final String $ret_str_ln_nm = "ret_str_ln_nm";
	/**
	 * Without return-from rack/line 返品元棚・ライン無.<p>
	 *
	 */
	public static final String $ret_str_ln_cd_none_flg = "ret_str_ln_cd_none_flg";
	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public static final String $ret_gd_cd = "ret_gd_cd";
	/**
	 * Return-from source grading name 返品元格付名.<p>
	 *
	 */
	public static final String $ret_gd_nm = "ret_gd_nm";
	/**
	 * Receipt schedule distribution group cd. 入荷予定物流グループＣＤ.<p>
	 *
	 */
	public static final String $arr_schd_lg_grp_cd = "arr_schd_lg_grp_cd";
	/**
	 * Receipt schedule location cd. 入荷予定場所ＣＤ.<p>
	 *
	 */
	public static final String $arr_schd_loc_cd = "arr_schd_loc_cd";
	/**
	 * Receipt schedule location name 入荷予定場所名.<p>
	 *
	 */
	public static final String $arr_schd_loc_nm = "arr_schd_loc_nm";
	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public static final String $arr_loc_cd = "arr_loc_cd";
	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public static final String $arr_loc_nm = "arr_loc_nm";
	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public static final String $arr_wg_cd = "arr_wg_cd";
	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public static final String $arr_wg_nm = "arr_wg_nm";
	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $arr_lg_grp_cd = "arr_lg_grp_cd";
	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public static final String $arr_lg_grp_nm = "arr_lg_grp_nm";
	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $arr_site_cd = "arr_site_cd";
	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public static final String $arr_site_nm = "arr_site_nm";
	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $arr_alloc_grp_cd = "arr_alloc_grp_cd";
	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public static final String $arr_alloc_grp_nm = "arr_alloc_grp_nm";
	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public static final String $arr_str_ln_tgt_flg = "arr_str_ln_tgt_flg";
	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $arr_str_ln_cd = "arr_str_ln_cd";
	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public static final String $arr_str_ln_nm = "arr_str_ln_nm";
	/**
	 * Without receipt rack/line 入荷棚・ライン無.<p>
	 *
	 */
	public static final String $arr_str_ln_cd_none_flg = "arr_str_ln_cd_none_flg";
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public static final String $arr_schd_tm = "arr_schd_tm";
	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public static final String $arr_tm = "arr_tm";
	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public static final String $arr_dt = "arr_dt";
	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public static final String $arr_hm = "arr_hm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";
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
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
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
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * PO invoice 発注インボイス.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
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
	 * Customer inventory 預り.<p>
	 *
	 */
	public static final String $cststk_flg = "cststk_flg";
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
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
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
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_unit_cd = "schd_unit_cd";
	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public static final String $schd_unit_nm = "schd_unit_nm";
	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_base_qty = "schd_unit_conv_base_qty";
	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public static final String $schd_unit_conv_qty = "schd_unit_conv_qty";
	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_unit_dec_place = "schd_unit_dec_place";
	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_unit_rnd_typ = "schd_unit_rnd_typ";
	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public static final String $arr_schd_qty = "arr_schd_qty";
	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public static final String $arr_schd_unit_qty = "arr_schd_unit_qty";
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public static final String $pr_rate = "pr_rate";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public static final String $purc_cont_qty = "purc_cont_qty";
	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public static final String $purc_cont_fctr = "purc_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public static final String $split_flg = "split_flg";
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Receipt pattern type name 入荷パタン区分名.<p>
	 *
	 */
	public static final String $arr_ptn_typ_nm = "arr_ptn_typ_nm";
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
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public static final String $sls_rtn_flg = "sls_rtn_flg";
	/**
	 * Transport 移送.<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
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
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public static final String $bd_wg_nm = "bd_wg_nm";
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
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
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
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $purc_rqst_wg_cd = "purc_rqst_wg_cd";
	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public static final String $purc_rqst_wg_nm = "purc_rqst_wg_nm";
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public static final String $po_schd_src_typ_nm = "po_schd_src_typ_nm";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Temporary purchase I/V No. 仮受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $temp_rcpt_iv_no = "temp_rcpt_iv_no";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_lg_grp_nm = "ship_lg_grp_nm";
	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public static final String $ship_wg_cd = "ship_wg_cd";
	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public static final String $ship_wg_nm = "ship_wg_nm";
	/**
	 * Without shipping plan 出荷計画外.<p>
	 *
	 */
	public static final String $ship_uplnd_flg = "ship_uplnd_flg";
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_no = "sls_ret_schd_no";
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_d_no = "sls_ret_schd_d_no";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
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
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public static final String $sls_ret_qty = "sls_ret_qty";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $edi_bp_dlv_slip_no = "edi_bp_dlv_slip_no";
	/**
	 * EDI vendor delivery note row No. ＥＤＩ業者納品書行ＮＯ.<p>
	 *
	 */
	public static final String $edi_bp_dlv_slip_d_no = "edi_bp_dlv_slip_d_no";
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
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public static final String $prov_src_schd_typ = "prov_src_schd_typ";
	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public static final String $prov_src_schd_typ_nm = "prov_src_schd_typ_nm";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $po_grp_cd1 = "po_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $po_grp_nm1 = "po_grp_nm1";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $po_grp_cd2 = "po_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $po_grp_nm2 = "po_grp_nm2";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $po_grp_cd3 = "po_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $po_grp_nm3 = "po_grp_nm3";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $po_grp_cd4 = "po_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $po_grp_nm4 = "po_grp_nm4";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $po_grp_cd5 = "po_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $po_grp_nm5 = "po_grp_nm5";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $po_grp_cd6 = "po_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $po_grp_nm6 = "po_grp_nm6";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $po_grp_cd7 = "po_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $po_grp_nm7 = "po_grp_nm7";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $po_grp_cd8 = "po_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $po_grp_nm8 = "po_grp_nm8";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $po_grp_cd9 = "po_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $po_grp_nm9 = "po_grp_nm9";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $po_grp_cd10 = "po_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $po_grp_nm10 = "po_grp_nm10";
	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd1 = "sret_fr_grp_cd1";
	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm1 = "sret_fr_grp_nm1";
	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd2 = "sret_fr_grp_cd2";
	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm2 = "sret_fr_grp_nm2";
	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd3 = "sret_fr_grp_cd3";
	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm3 = "sret_fr_grp_nm3";
	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd4 = "sret_fr_grp_cd4";
	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm4 = "sret_fr_grp_nm4";
	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd5 = "sret_fr_grp_cd5";
	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm5 = "sret_fr_grp_nm5";
	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd6 = "sret_fr_grp_cd6";
	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm6 = "sret_fr_grp_nm6";
	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd7 = "sret_fr_grp_cd7";
	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm7 = "sret_fr_grp_nm7";
	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd8 = "sret_fr_grp_cd8";
	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm8 = "sret_fr_grp_nm8";
	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd9 = "sret_fr_grp_cd9";
	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm9 = "sret_fr_grp_nm9";
	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd10 = "sret_fr_grp_cd10";
	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm10 = "sret_fr_grp_nm10";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";
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
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Entry user cd. 登録ユーザＣＤ.<p>
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
	 * Update user cd. 更新ユーザＣＤ.<p>
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
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public static final String $arr_act_upd_cntr = "arr_act_upd_cntr";
	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public static final String $rcpt_iv_upd_cntr = "rcpt_iv_upd_cntr";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_io_no = "purc_act_io_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta rcpt_iv_itm_nm_META = createCommonMeta($rcpt_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ret_dlv_slip_d_no_META = createCommonMeta($ret_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta sret_fr_cd_META = createCommonMeta($sret_fr_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sret_fr_nm_META = createCommonMeta($sret_fr_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_stk_arrv_bp_cd_META = createCommonMeta($ret_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ret_stk_arrv_bp_nm_META = createCommonMeta($ret_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_loc_cd_META = createCommonMeta($ret_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ret_loc_nm_META = createCommonMeta($ret_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ret_str_ln_tgt_flg_META = createCommonMeta($ret_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_str_ln_cd_META = createCommonMeta($ret_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ret_str_ln_nm_META = createCommonMeta($ret_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ret_str_ln_cd_none_flg_META = createCommonMeta($ret_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_gd_cd_META = createCommonMeta($ret_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta ret_gd_nm_META = createCommonMeta($ret_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta arr_schd_lg_grp_cd_META = createCommonMeta($arr_schd_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_schd_loc_cd_META = createCommonMeta($arr_schd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_schd_loc_nm_META = createCommonMeta($arr_schd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_wg_cd_META = createCommonMeta($arr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_wg_nm_META = createCommonMeta($arr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta arr_lg_grp_cd_META = createCommonMeta($arr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_lg_grp_nm_META = createCommonMeta($arr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta arr_site_cd_META = createCommonMeta($arr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta arr_site_nm_META = createCommonMeta($arr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta arr_alloc_grp_cd_META = createCommonMeta($arr_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta arr_alloc_grp_nm_META = createCommonMeta($arr_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta arr_str_ln_tgt_flg_META = createCommonMeta($arr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_str_ln_cd_META = createCommonMeta($arr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta arr_str_ln_nm_META = createCommonMeta($arr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta arr_str_ln_cd_none_flg_META = createCommonMeta($arr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta arr_schd_tm_META = createCommonMeta($arr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta arr_tm_META = createCommonMeta($arr_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta arr_dt_META = createCommonMeta($arr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_hm_META = createCommonMeta($arr_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta cststk_flg_META = createCommonMeta($cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_conv_base_qty_META = createCommonMeta($schd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_conv_qty_META = createCommonMeta($schd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_unit_rnd_typ_META = createCommonMeta($schd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta arr_schd_qty_META = createCommonMeta($arr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_schd_unit_qty_META = createCommonMeta($arr_schd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pr_rate_META = createCommonMeta($pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_META = createCommonMeta($purc_cont_qty, mcframe.commonMA.meta.MA_META.PURC_CONT_QTY);
	public static final MCMeta purc_cont_fctr_META = createCommonMeta($purc_cont_fctr, mcframe.commonMA.meta.MA_META.PURC_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta split_flg_META = createCommonMeta($split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta arr_ptn_typ_nm_META = createCommonMeta($arr_ptn_typ_nm, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
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
	public static final MCMeta arr_dpt_cd_META = createCommonMeta($arr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta arr_dpt_nm_META = createCommonMeta($arr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta arr_usr_cd_META = createCommonMeta($arr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_usr_nm_META = createCommonMeta($arr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_rtn_flg_META = createCommonMeta($sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bd_wg_nm_META = createCommonMeta($bd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bd_itm_cd_META = createCommonMeta($bd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta bd_itm_sub1_META = createCommonMeta($bd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta bd_itm_sub2_META = createCommonMeta($bd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta bd_itm_sub3_META = createCommonMeta($bd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bd_itm_nm_META = createCommonMeta($bd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ARR_SCHD_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR3);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta purc_rqst_wg_cd_META = createCommonMeta($purc_rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_rqst_wg_nm_META = createCommonMeta($purc_rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta temp_rcpt_iv_no_META = createCommonMeta($temp_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_wg_cd_META = createCommonMeta($ship_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_wg_nm_META = createCommonMeta($ship_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ship_uplnd_flg_META = createCommonMeta($ship_uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta sls_ret_schd_d_no_META = createCommonMeta($sls_ret_schd_d_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_D_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_qty_META = createCommonMeta($sls_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_bp_dlv_slip_no_META = createCommonMeta($edi_bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta edi_bp_dlv_slip_d_no_META = createCommonMeta($edi_bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_typ_nm_META = createCommonMeta($prov_src_schd_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP_NM);
	public static final MCMeta po_grp_cd1_META = createCommonMeta($po_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm1_META = createCommonMeta($po_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd2_META = createCommonMeta($po_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm2_META = createCommonMeta($po_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd3_META = createCommonMeta($po_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm3_META = createCommonMeta($po_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd4_META = createCommonMeta($po_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm4_META = createCommonMeta($po_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd5_META = createCommonMeta($po_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm5_META = createCommonMeta($po_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd6_META = createCommonMeta($po_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm6_META = createCommonMeta($po_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd7_META = createCommonMeta($po_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm7_META = createCommonMeta($po_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd8_META = createCommonMeta($po_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm8_META = createCommonMeta($po_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd9_META = createCommonMeta($po_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm9_META = createCommonMeta($po_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_cd10_META = createCommonMeta($po_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm10_META = createCommonMeta($po_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd1_META = createCommonMeta($sret_fr_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm1_META = createCommonMeta($sret_fr_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd2_META = createCommonMeta($sret_fr_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm2_META = createCommonMeta($sret_fr_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd3_META = createCommonMeta($sret_fr_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm3_META = createCommonMeta($sret_fr_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd4_META = createCommonMeta($sret_fr_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm4_META = createCommonMeta($sret_fr_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd5_META = createCommonMeta($sret_fr_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm5_META = createCommonMeta($sret_fr_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd6_META = createCommonMeta($sret_fr_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm6_META = createCommonMeta($sret_fr_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd7_META = createCommonMeta($sret_fr_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm7_META = createCommonMeta($sret_fr_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd8_META = createCommonMeta($sret_fr_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm8_META = createCommonMeta($sret_fr_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd9_META = createCommonMeta($sret_fr_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm9_META = createCommonMeta($sret_fr_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_cd10_META = createCommonMeta($sret_fr_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm10_META = createCommonMeta($sret_fr_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta arr_act_upd_cntr_META = createCommonMeta($arr_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rcpt_iv_upd_cntr_META = createCommonMeta($rcpt_iv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_io_no_META = createCommonMeta($purc_act_io_no, mcframe.commonMA.meta.MA_META.PURC_ACT_IO_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			rcpt_iv_itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			ret_dlv_slip_d_no_META,
			sret_fr_cd_META,
			sret_fr_nm_META,
			ret_stk_arrv_bp_cd_META,
			ret_stk_arrv_bp_nm_META,
			ret_loc_cd_META,
			ret_loc_nm_META,
			ret_str_ln_tgt_flg_META,
			ret_str_ln_cd_META,
			ret_str_ln_nm_META,
			ret_str_ln_cd_none_flg_META,
			ret_gd_cd_META,
			ret_gd_nm_META,
			arr_schd_lg_grp_cd_META,
			arr_schd_loc_cd_META,
			arr_schd_loc_nm_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			arr_wg_cd_META,
			arr_wg_nm_META,
			arr_lg_grp_cd_META,
			arr_lg_grp_nm_META,
			arr_site_cd_META,
			arr_site_nm_META,
			arr_alloc_grp_cd_META,
			arr_alloc_grp_nm_META,
			loc_sppl_cd_META,
			arr_str_ln_tgt_flg_META,
			arr_str_ln_cd_META,
			arr_str_ln_nm_META,
			arr_str_ln_cd_none_flg_META,
			prsppl_cd_META,
			prsppl_nm_META,
			dlv_rqst_tm_META,
			arr_schd_tm_META,
			arr_tm_META,
			arr_dt_META,
			arr_hm_META,
			ac_dt_META,
			can_ac_dt_META,
			ver_flg_META,
			ver_no_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_flg_META,
			bp_lot_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			ship_fr_valid_dt_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			cst_cd_META,
			cst_nm_META,
			cst_iv_flg_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			sppl_iv_flg_META,
			maker_cd_META,
			maker_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			cststk_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_META,
			abort_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_conv_base_qty_META,
			schd_unit_conv_qty_META,
			schd_unit_dec_place_META,
			schd_unit_rnd_typ_META,
			arr_schd_qty_META,
			arr_qty_META,
			arr_schd_unit_qty_META,
			pr_rate_META,
			cont_fctr_flg_META,
			purc_cont_qty_META,
			purc_cont_fctr_META,
			std_cont_qty_META,
			std_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			sync_flg_META,
			split_flg_META,
			temp_ap_flg_META,
			arr_ptn_typ_META,
			arr_ptn_typ_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
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
			arr_dpt_cd_META,
			arr_dpt_nm_META,
			arr_usr_cd_META,
			arr_usr_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			acxfr_gi_flg_META,
			xpns_purc_flg_META,
			sls_acxfr_flg_META,
			purc_flg_META,
			sls_rtn_flg_META,
			xfr_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			bd_wg_cd_META,
			bd_wg_nm_META,
			bd_itm_cd_META,
			bd_itm_sub1_META,
			bd_itm_sub2_META,
			bd_itm_sub3_META,
			bd_itm_nm_META,
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
			insp_cnt_rmrks_META,
			intr_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			arr_cnt_rmrks_META,
			arr_act_no_META,
			arr_schd_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			purc_rqst_wg_cd_META,
			purc_rqst_wg_nm_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			po_no_META,
			po_d_no_META,
			po_schd_no_META,
			purc_schd_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_d_no_META,
			temp_rcpt_iv_no_META,
			iv_no_META,
			iv_d_no_META,
			dlv_inst_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			ship_act_no_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			ship_wg_cd_META,
			ship_wg_nm_META,
			ship_uplnd_flg_META,
			sls_ret_schd_no_META,
			sls_ret_schd_d_no_META,
			sls_act_no_META,
			sls_act_d_no_META,
			cst_po_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			slo_no_META,
			slo_d_no_META,
			purc_qty_META,
			sls_ret_qty_META,
			outsrc_flg_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			mfg_act_no_META,
			stk_lst_prnt_flg_META,
			edi_flg_META,
			edi_bp_dlv_slip_no_META,
			edi_bp_dlv_slip_d_no_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_src_schd_typ_META,
			prov_src_schd_typ_nm_META,
			po_grp_cd1_META,
			po_grp_nm1_META,
			po_grp_cd2_META,
			po_grp_nm2_META,
			po_grp_cd3_META,
			po_grp_nm3_META,
			po_grp_cd4_META,
			po_grp_nm4_META,
			po_grp_cd5_META,
			po_grp_nm5_META,
			po_grp_cd6_META,
			po_grp_nm6_META,
			po_grp_cd7_META,
			po_grp_nm7_META,
			po_grp_cd8_META,
			po_grp_nm8_META,
			po_grp_cd9_META,
			po_grp_nm9_META,
			po_grp_cd10_META,
			po_grp_nm10_META,
			sret_fr_grp_cd1_META,
			sret_fr_grp_nm1_META,
			sret_fr_grp_cd2_META,
			sret_fr_grp_nm2_META,
			sret_fr_grp_cd3_META,
			sret_fr_grp_nm3_META,
			sret_fr_grp_cd4_META,
			sret_fr_grp_nm4_META,
			sret_fr_grp_cd5_META,
			sret_fr_grp_nm5_META,
			sret_fr_grp_cd6_META,
			sret_fr_grp_nm6_META,
			sret_fr_grp_cd7_META,
			sret_fr_grp_nm7_META,
			sret_fr_grp_cd8_META,
			sret_fr_grp_nm8_META,
			sret_fr_grp_cd9_META,
			sret_fr_grp_nm9_META,
			sret_fr_grp_cd10_META,
			sret_fr_grp_nm10_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META,
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
			itm_grp_nm10_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			arr_pr_upd_cntr_META,
			arr_act_upd_cntr_META,
			rcpt_iv_upd_cntr_META,
			crt_lot_flg_META,
			same_lot_flg_META,
			purc_act_io_no_META,
			arr_pr_no_META,
			io_schd_pr_no_META,
			rtn_sts_typ_META,
			err_flg_META
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$data_crud_typ, "E"},	// data_crud_typ
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$arr_loc_cd, "E"}	// arr_loc_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"},	// trd_unit_qty
				{$purc_cont_qty, "positive"}	// purc_cont_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$arr_tm, "tmBfToday"},	// arr_tm
				{$ac_dt, "bfToday"},	// ac_dt
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
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
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$rqst_dpt_cd, "MA.MAUAL0010.Dpt"},	// rqst_dpt_cd
				{$rqst_usr_cd, "MA.MAUAL0010.Usr"},	// rqst_usr_cd
				{$sret_fr_cd, "MA.MAUAL0010.Bp"},	// sret_fr_cd
				{$ret_loc_cd, "MA.MAUAL0010.Loc"},	// ret_loc_cd
				{$ret_str_ln_cd, "MA.MAUAL0010.StrLn"},	// ret_str_ln_cd
				{$ret_gd_cd, "MA.MAUAL0010.StkGd"},	// ret_gd_cd
				{$arr_loc_cd, "MA.MAUAL0010.Loc"},	// arr_loc_cd
				{$arr_str_ln_cd, "MA.MAUAL0010.StrLn"},	// arr_str_ln_cd
				{$ver_no, "MA.MAUAL0010.ItmVer"},	// ver_no
				{$cst_cd, "MA.MAUAL0010.Bp"},	// cst_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$gd_cd, "MA.MAUAL0010.StkGd"},	// gd_cd
				{$arr_dpt_cd, "MA.MAUAL0010.Dpt"},	// arr_dpt_cd
				{$arr_usr_cd, "MA.MAUAL0010.Usr"},	// arr_usr_cd
				{$rsn_cd, "MA.MAUAL0010.ArrBizRsn"},	// rsn_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_nm;trd_ptn_typ;trd_ptn_typ_nm"},	// trd_cd
				{$itm_sub3, "sundry_itm_flg;stk_mng_typ;asset_mng_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;base_unit_cd;base_unit_nm;base_unit_dec_place;base_unit_rnd_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;itm_nm"},	// itm_sub3
				{$rqst_dpt_cd, "rqst_dpt_nm;rqst_wg_cd;rqst_wg_nm"},	// rqst_dpt_cd
				{$rqst_usr_cd, "rqst_usr_nm"},	// rqst_usr_cd
				{$sret_fr_cd, "sret_fr_nm"},	// sret_fr_cd
				{$ret_loc_cd, "ret_loc_nm;ret_str_ln_tgt_flg"},	// ret_loc_cd
				{$ret_str_ln_cd, "ret_str_ln_nm"},	// ret_str_ln_cd
				{$ret_gd_cd, "ret_gd_nm"},	// ret_gd_cd
				{$arr_loc_cd, "arr_loc_nm;arr_wg_cd;arr_wg_nm;arr_lg_grp_cd;arr_lg_grp_nm;arr_site_cd;arr_site_nm;arr_alloc_grp_cd;arr_alloc_grp_nm;loc_sppl_cd;arr_str_ln_tgt_flg;prsppl_cd;prsppl_nm"},	// arr_loc_cd
				{$arr_str_ln_cd, "arr_str_ln_nm"},	// arr_str_ln_cd
				{$cst_cd, "cst_nm;cst_iv_flg"},	// cst_cd
				{$sppl_cd, "sppl_nm;subcon_flg;sppl_iv_flg"},	// sppl_cd
				{$maker_cd, "maker_nm"},	// maker_cd
				{$trd_unit_cd, "trd_unit_nm;trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place;trd_unit_rnd_typ"},	// trd_unit_cd
				{$gd_cd, "gd_nm"},	// gd_cd
				{$arr_dpt_cd, "arr_dpt_nm"},	// arr_dpt_cd
				{$arr_usr_cd, "arr_usr_nm"},	// arr_usr_cd
				{$rsn_cd, "rsn_nm;acxfr_gi_flg;xpns_purc_flg;purc_flg;sls_rtn_flg;xfr_flg;sls_acxfr_flg"},	// rsn_cd
				{$bd_dpt_cd, "bd_dpt_nm;bd_wg_cd;bd_wg_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "sundry_itm_flg;stk_mng_typ;asset_mng_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;itm_nm"},	// itm_sub3
				{$rqst_dpt_cd, "dpt_nm;wg_cd;wg_nm"},	// rqst_dpt_cd
				{$rqst_usr_cd, "usr_nm"},	// rqst_usr_cd
				{$sret_fr_cd, "bp_nm"},	// sret_fr_cd
				{$ret_loc_cd, "loc_nm;str_ln_tgt_flg"},	// ret_loc_cd
				{$ret_str_ln_cd, "str_ln_nm"},	// ret_str_ln_cd
				{$ret_gd_cd, "gd_nm"},	// ret_gd_cd
				{$arr_loc_cd, "loc_nm;wg_cd;wg_nm;lg_grp_cd;lg_grp_nm;site_cd;site_nm;alloc_grp_cd;alloc_grp_nm;sppl_cd;str_ln_tgt_flg;sppl_cd;sppl_nm"},	// arr_loc_cd
				{$arr_str_ln_cd, "str_ln_nm"},	// arr_str_ln_cd
				{$cst_cd, "bp_nm;cst_iv_flg"},	// cst_cd
				{$sppl_cd, "bp_nm;subcon_flg;sppl_iv_flg"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place;rnd_typ"},	// trd_unit_cd
				{$arr_dpt_cd, "dpt_nm"},	// arr_dpt_cd
				{$arr_usr_cd, "usr_nm"},	// arr_usr_cd
				{$rsn_cd, "biz_rsn_nm;acxfr_gi_flg;xpns_purc_flg;out_purc_flg;out_sls_rtn_flg;out_xfr_flg;sls_acxfr_flg"},	// rsn_cd
				{$bd_dpt_cd, "dpt_nm;wg_cd;wg_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_sub3
				{$rqst_dpt_cd, "rqst_usr_cd;arr_tm;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_dpt_cd
				{$sret_fr_cd, "MAC_BP_IS_SRCH_TYP.DLV;arr_tm"},	// sret_fr_cd
				{$ret_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// ret_loc_cd
				{$ret_str_ln_cd, "ret_loc_cd;true"},	// ret_str_ln_cd
				{$arr_str_ln_cd, "arr_loc_cd;true"},	// arr_str_ln_cd
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ver_no
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;arr_tm"},	// cst_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;arr_tm"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$arr_dpt_cd, "arr_usr_cd;arr_tm;MAC_DPT_IS_SRCH_TYP.ARR"},	// arr_dpt_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// itm_sub3
				{$rqst_dpt_cd, "usr_cd;dt;dpt_is_srch_typ"},	// rqst_dpt_cd
				{$sret_fr_cd, "bp_is_srch_typ;dt"},	// sret_fr_cd
				{$ret_loc_cd, "loc_is_srch_typ"},	// ret_loc_cd
				{$ret_str_ln_cd, "loc_cd;mode_nullval_flg"},	// ret_str_ln_cd
				{$arr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// arr_str_ln_cd
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ver_no
				{$cst_cd, "bp_is_srch_typ;dt"},	// cst_cd
				{$sppl_cd, "bp_is_srch_typ;dt"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$arr_dpt_cd, "usr_cd;dt;dpt_is_srch_typ"},	// arr_dpt_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$purc_id_typ, "MAC_PURC_ID_TYP"},	// purc_id_typ
				{$arr_ptn_typ, "MSC_ARR_PTN_TYP"},	// arr_ptn_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$prov_src_schd_typ, "MSC_PROV_SRC_SCHD_TYP"}	// prov_src_schd_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$arr_str_ln_cd, "E"}	// arr_str_ln_cd
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
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 2, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 2, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 3, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 3, $pr_sts_typ_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 5, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 5, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 7, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 7, $trd_ptn_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}


	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return getConstString(offset + 13, $rcpt_iv_itm_nm);
	}

	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		setConstString(offset + 13, $rcpt_iv_itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 14, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 14, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 15, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 15, $itm_typ_nm, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 16, $itm_typ_d_cd);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 16, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 17, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 17, $itm_typ_d_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 18, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 18, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 19, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 19, $asset_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 20, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 20, $sundry_itm_flg, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 21, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 21, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 22, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 22, $rqst_dpt_nm, value);
	}


	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 23, $rqst_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 23, $rqst_wg_cd, value);
	}


	/**
	 * Requesting dept. WG name 依頼元ＷＧ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 24, $rqst_wg_nm);
	}

	/**
	 * Requesting dept. WG name 依頼元ＷＧ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 24, $rqst_wg_nm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 25, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 25, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 26, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 26, $rqst_usr_nm, value);
	}


	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return getConstString(offset + 27, $ret_dlv_slip_d_no);
	}

	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		setConstString(offset + 27, $ret_dlv_slip_d_no, value);
	}


	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 28, $sret_fr_cd);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 28, $sret_fr_cd, value);
	}


	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public String sret_fr_nm() {
		return getConstString(offset + 29, $sret_fr_nm);
	}

	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public void sret_fr_nm(String value) {
		setConstString(offset + 29, $sret_fr_nm, value);
	}


	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public String ret_stk_arrv_bp_cd() {
		return getConstString(offset + 30, $ret_stk_arrv_bp_cd);
	}

	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public void ret_stk_arrv_bp_cd(String value) {
		setConstString(offset + 30, $ret_stk_arrv_bp_cd, value);
	}


	/**
	 * Return-from inventory arriving point name 返品元在庫着荷先名.<p>
	 *
	 */
	public String ret_stk_arrv_bp_nm() {
		return getConstString(offset + 31, $ret_stk_arrv_bp_nm);
	}

	/**
	 * Return-from inventory arriving point name 返品元在庫着荷先名.<p>
	 *
	 */
	public void ret_stk_arrv_bp_nm(String value) {
		setConstString(offset + 31, $ret_stk_arrv_bp_nm, value);
	}


	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String ret_loc_cd() {
		return getConstString(offset + 32, $ret_loc_cd);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		setConstString(offset + 32, $ret_loc_cd, value);
	}


	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public String ret_loc_nm() {
		return getConstString(offset + 33, $ret_loc_nm);
	}

	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public void ret_loc_nm(String value) {
		setConstString(offset + 33, $ret_loc_nm, value);
	}


	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public boolean ret_str_ln_tgt_flg() {
		return getConstBoolean(offset + 34, $ret_str_ln_tgt_flg);
	}

	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public void ret_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 34, $ret_str_ln_tgt_flg, value);
	}


	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return getConstString(offset + 35, $ret_str_ln_cd);
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		setConstString(offset + 35, $ret_str_ln_cd, value);
	}


	/**
	 * Return-from source rack/line name 返品元棚・ライン名.<p>
	 *
	 */
	public String ret_str_ln_nm() {
		return getConstString(offset + 36, $ret_str_ln_nm);
	}

	/**
	 * Return-from source rack/line name 返品元棚・ライン名.<p>
	 *
	 */
	public void ret_str_ln_nm(String value) {
		setConstString(offset + 36, $ret_str_ln_nm, value);
	}


	/**
	 * Without return-from rack/line 返品元棚・ライン無.<p>
	 *
	 */
	public boolean ret_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 37, $ret_str_ln_cd_none_flg);
	}

	/**
	 * Without return-from rack/line 返品元棚・ライン無.<p>
	 *
	 */
	public void ret_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 37, $ret_str_ln_cd_none_flg, value);
	}


	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public String ret_gd_cd() {
		return getConstString(offset + 38, $ret_gd_cd);
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		setConstString(offset + 38, $ret_gd_cd, value);
	}


	/**
	 * Return-from source grading name 返品元格付名.<p>
	 *
	 */
	public String ret_gd_nm() {
		return getConstString(offset + 39, $ret_gd_nm);
	}

	/**
	 * Return-from source grading name 返品元格付名.<p>
	 *
	 */
	public void ret_gd_nm(String value) {
		setConstString(offset + 39, $ret_gd_nm, value);
	}


	/**
	 * Receipt schedule distribution group cd. 入荷予定物流グループＣＤ.<p>
	 *
	 */
	public String arr_schd_lg_grp_cd() {
		return getConstString(offset + 40, $arr_schd_lg_grp_cd);
	}

	/**
	 * Receipt schedule distribution group cd. 入荷予定物流グループＣＤ.<p>
	 *
	 */
	public void arr_schd_lg_grp_cd(String value) {
		setConstString(offset + 40, $arr_schd_lg_grp_cd, value);
	}


	/**
	 * Receipt schedule location cd. 入荷予定場所ＣＤ.<p>
	 *
	 */
	public String arr_schd_loc_cd() {
		return getConstString(offset + 41, $arr_schd_loc_cd);
	}

	/**
	 * Receipt schedule location cd. 入荷予定場所ＣＤ.<p>
	 *
	 */
	public void arr_schd_loc_cd(String value) {
		setConstString(offset + 41, $arr_schd_loc_cd, value);
	}


	/**
	 * Receipt schedule location name 入荷予定場所名.<p>
	 *
	 */
	public String arr_schd_loc_nm() {
		return getConstString(offset + 42, $arr_schd_loc_nm);
	}

	/**
	 * Receipt schedule location name 入荷予定場所名.<p>
	 *
	 */
	public void arr_schd_loc_nm(String value) {
		setConstString(offset + 42, $arr_schd_loc_nm, value);
	}


	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 43, $arr_loc_cd);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 43, $arr_loc_cd, value);
	}


	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 44, $arr_loc_nm);
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 44, $arr_loc_nm, value);
	}


	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public String arr_wg_cd() {
		return getConstString(offset + 45, $arr_wg_cd);
	}

	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public void arr_wg_cd(String value) {
		setConstString(offset + 45, $arr_wg_cd, value);
	}


	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public String arr_wg_nm() {
		return getConstString(offset + 46, $arr_wg_nm);
	}

	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public void arr_wg_nm(String value) {
		setConstString(offset + 46, $arr_wg_nm, value);
	}


	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return getConstString(offset + 47, $arr_lg_grp_cd);
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		setConstString(offset + 47, $arr_lg_grp_cd, value);
	}


	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public String arr_lg_grp_nm() {
		return getConstString(offset + 48, $arr_lg_grp_nm);
	}

	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public void arr_lg_grp_nm(String value) {
		setConstString(offset + 48, $arr_lg_grp_nm, value);
	}


	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String arr_site_cd() {
		return getConstString(offset + 49, $arr_site_cd);
	}

	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void arr_site_cd(String value) {
		setConstString(offset + 49, $arr_site_cd, value);
	}


	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public String arr_site_nm() {
		return getConstString(offset + 50, $arr_site_nm);
	}

	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public void arr_site_nm(String value) {
		setConstString(offset + 50, $arr_site_nm, value);
	}


	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public String arr_alloc_grp_cd() {
		return getConstString(offset + 51, $arr_alloc_grp_cd);
	}

	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public void arr_alloc_grp_cd(String value) {
		setConstString(offset + 51, $arr_alloc_grp_cd, value);
	}


	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public String arr_alloc_grp_nm() {
		return getConstString(offset + 52, $arr_alloc_grp_nm);
	}

	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public void arr_alloc_grp_nm(String value) {
		setConstString(offset + 52, $arr_alloc_grp_nm, value);
	}


	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 53, $loc_sppl_cd);
	}

	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 53, $loc_sppl_cd, value);
	}


	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public boolean arr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 54, $arr_str_ln_tgt_flg);
	}

	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public void arr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 54, $arr_str_ln_tgt_flg, value);
	}


	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return getConstString(offset + 55, $arr_str_ln_cd);
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		setConstString(offset + 55, $arr_str_ln_cd, value);
	}


	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public String arr_str_ln_nm() {
		return getConstString(offset + 56, $arr_str_ln_nm);
	}

	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public void arr_str_ln_nm(String value) {
		setConstString(offset + 56, $arr_str_ln_nm, value);
	}


	/**
	 * Without receipt rack/line 入荷棚・ライン無.<p>
	 *
	 */
	public boolean arr_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 57, $arr_str_ln_cd_none_flg);
	}

	/**
	 * Without receipt rack/line 入荷棚・ライン無.<p>
	 *
	 */
	public void arr_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 57, $arr_str_ln_cd_none_flg, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 58, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 58, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 59, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 59, $prsppl_nm, value);
	}


	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 60, $dlv_rqst_tm);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 60, $dlv_rqst_tm, value);
	}


	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return getConstDate(offset + 61, $arr_schd_tm);
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		setConstDate(offset + 61, $arr_schd_tm, value);
	}


	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return getConstDate(offset + 62, $arr_tm);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		setConstDate(offset + 62, $arr_tm, value);
	}


	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return getConstDate(offset + 63, $arr_dt);
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		setConstDate(offset + 63, $arr_dt, value);
	}


	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public MCDate arr_hm() {
		return getConstDate(offset + 64, $arr_hm);
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public void arr_hm(MCDate value) {
		setConstDate(offset + 64, $arr_hm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 65, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 65, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 66, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 66, $can_ac_dt, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 67, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 67, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 68, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 68, $ver_no, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 69, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 69, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 70, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 70, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 71, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 71, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 72, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 72, $sublot_no_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 73, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 73, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 74, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 74, $sublot_no, value);
	}


	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 75, $bp_lot_flg);
	}

	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 75, $bp_lot_flg, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 76, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 76, $bp_lot_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 77, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 77, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 78, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 78, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 79, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 79, $ship_fr_valid_dt, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 80, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 80, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 81, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 81, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 82, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 82, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 83, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 83, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 84, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 84, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 85, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 85, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 86, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 86, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 87, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 87, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 88, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 88, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 89, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 89, $wrk_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 90, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 90, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 91, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 91, $cst_nm, value);
	}


	/**
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 92, $cst_iv_flg);
	}

	/**
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 92, $cst_iv_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 93, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 93, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 94, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 94, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 95, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 95, $subcon_flg, value);
	}


	/**
	 * PO invoice 発注インボイス.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 96, $sppl_iv_flg);
	}

	/**
	 * PO invoice 発注インボイス.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 96, $sppl_iv_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 97, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 97, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 98, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 98, $maker_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 99, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 99, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 100, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 100, $sppl_itm_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 101, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 101, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 102, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 102, $purc_id_typ_nm, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean cststk_flg() {
		return getConstBoolean(offset + 103, $cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void cststk_flg(boolean value) {
		setConstBoolean(offset + 103, $cststk_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 104, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 104, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 105, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 105, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 106, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 107, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 108, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 108, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 108, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 108, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 108, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 108, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 109, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 109, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 110, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 110, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 110, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 110, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 110, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 110, $trd_unit_qty, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 111, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 111, $abort_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 112, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 112, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 113, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 113, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 114, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 114, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 114, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 114, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 114, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 114, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 115, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 115, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 116, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 116, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 116, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 116, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 116, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 116, $base_unit_qty, value);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 117, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 117, $schd_unit_cd, value);
	}


	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 118, $schd_unit_nm);
	}

	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 118, $schd_unit_nm, value);
	}


	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_base_qty() {
		return getConstNumber(offset + 119, $schd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 119, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 119, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 119, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 119, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 119, $schd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_qty() {
		return getConstNumber(offset + 120, $schd_unit_conv_qty);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 120, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(int value) {
		setConstNumber(offset + 120, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(long value) {
		setConstNumber(offset + 120, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(float value) {
		setConstNumber(offset + 120, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(double value) {
		setConstNumber(offset + 120, $schd_unit_conv_qty, value);
	}


	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 121, $schd_unit_dec_place);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 121, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 121, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 121, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 121, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 121, $schd_unit_dec_place, value);
	}


	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public String schd_unit_rnd_typ() {
		return getConstString(offset + 122, $schd_unit_rnd_typ);
	}

	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public void schd_unit_rnd_typ(String value) {
		setConstString(offset + 122, $schd_unit_rnd_typ, value);
	}


	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCNumber arr_schd_qty() {
		return getConstNumber(offset + 123, $arr_schd_qty);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(MCNumber value) {
		setConstNumber(offset + 123, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(int value) {
		setConstNumber(offset + 123, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(long value) {
		setConstNumber(offset + 123, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(float value) {
		setConstNumber(offset + 123, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(double value) {
		setConstNumber(offset + 123, $arr_schd_qty, value);
	}


	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 124, $arr_qty);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 124, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 124, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 124, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 124, $arr_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 124, $arr_qty, value);
	}


	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public MCNumber arr_schd_unit_qty() {
		return getConstNumber(offset + 125, $arr_schd_unit_qty);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(MCNumber value) {
		setConstNumber(offset + 125, $arr_schd_unit_qty, value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(int value) {
		setConstNumber(offset + 125, $arr_schd_unit_qty, value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(long value) {
		setConstNumber(offset + 125, $arr_schd_unit_qty, value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(float value) {
		setConstNumber(offset + 125, $arr_schd_unit_qty, value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(double value) {
		setConstNumber(offset + 125, $arr_schd_unit_qty, value);
	}


	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCNumber pr_rate() {
		return getConstNumber(offset + 126, $pr_rate);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(MCNumber value) {
		setConstNumber(offset + 126, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(int value) {
		setConstNumber(offset + 126, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(long value) {
		setConstNumber(offset + 126, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(float value) {
		setConstNumber(offset + 126, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(double value) {
		setConstNumber(offset + 126, $pr_rate, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 127, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 127, $cont_fctr_flg, value);
	}


	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return getConstNumber(offset + 128, $purc_cont_qty);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		setConstNumber(offset + 128, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		setConstNumber(offset + 128, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		setConstNumber(offset + 128, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		setConstNumber(offset + 128, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		setConstNumber(offset + 128, $purc_cont_qty, value);
	}


	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public MCNumber purc_cont_fctr() {
		return getConstNumber(offset + 129, $purc_cont_fctr);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(MCNumber value) {
		setConstNumber(offset + 129, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(int value) {
		setConstNumber(offset + 129, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(long value) {
		setConstNumber(offset + 129, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(float value) {
		setConstNumber(offset + 129, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(double value) {
		setConstNumber(offset + 129, $purc_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 130, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 130, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 130, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 130, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 130, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 130, $std_cont_qty, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 131, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 132, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 132, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 133, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 133, $cont_fctr_unit_nm, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 134, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 134, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 134, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 134, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 134, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 134, $cont_fctr_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 135, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 135, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 136, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 136, $sync_flg, value);
	}


	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public boolean split_flg() {
		return getConstBoolean(offset + 137, $split_flg);
	}

	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public void split_flg(boolean value) {
		setConstBoolean(offset + 137, $split_flg, value);
	}


	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 138, $temp_ap_flg);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 138, $temp_ap_flg, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 139, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 139, $arr_ptn_typ, value);
	}


	/**
	 * Receipt pattern type name 入荷パタン区分名.<p>
	 *
	 */
	public String arr_ptn_typ_nm() {
		return getConstString(offset + 140, $arr_ptn_typ_nm);
	}

	/**
	 * Receipt pattern type name 入荷パタン区分名.<p>
	 *
	 */
	public void arr_ptn_typ_nm(String value) {
		setConstString(offset + 140, $arr_ptn_typ_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 141, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 141, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 142, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 142, $stk_arrv_bp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 143, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 143, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 144, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 144, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 145, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 145, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 146, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 146, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 147, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 147, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 148, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 148, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 149, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 149, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 150, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 150, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 151, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 151, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 152, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 152, $stk_bp_nm, value);
	}


	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return getConstString(offset + 153, $arr_dpt_cd);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		setConstString(offset + 153, $arr_dpt_cd, value);
	}


	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return getConstString(offset + 154, $arr_dpt_nm);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		setConstString(offset + 154, $arr_dpt_nm, value);
	}


	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return getConstString(offset + 155, $arr_usr_cd);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		setConstString(offset + 155, $arr_usr_cd, value);
	}


	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return getConstString(offset + 156, $arr_usr_nm);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		setConstString(offset + 156, $arr_usr_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 157, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 157, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 158, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 158, $rsn_nm, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 159, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 159, $acxfr_gi_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 160, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 160, $xpns_purc_flg, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 161, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 161, $sls_acxfr_flg, value);
	}


	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 162, $purc_flg);
	}

	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 162, $purc_flg, value);
	}


	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public boolean sls_rtn_flg() {
		return getConstBoolean(offset + 163, $sls_rtn_flg);
	}

	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public void sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 163, $sls_rtn_flg, value);
	}


	/**
	 * Transport 移送.<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 164, $xfr_flg);
	}

	/**
	 * Transport 移送.<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 164, $xfr_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 165, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 165, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 166, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 166, $bd_dpt_nm, value);
	}


	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 167, $bd_wg_cd);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 167, $bd_wg_cd, value);
	}


	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public String bd_wg_nm() {
		return getConstString(offset + 168, $bd_wg_nm);
	}

	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public void bd_wg_nm(String value) {
		setConstString(offset + 168, $bd_wg_nm, value);
	}


	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return getConstString(offset + 169, $bd_itm_cd);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		setConstString(offset + 169, $bd_itm_cd, value);
	}


	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return getConstString(offset + 170, $bd_itm_sub1);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		setConstString(offset + 170, $bd_itm_sub1, value);
	}


	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return getConstString(offset + 171, $bd_itm_sub2);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		setConstString(offset + 171, $bd_itm_sub2, value);
	}


	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return getConstString(offset + 172, $bd_itm_sub3);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		setConstString(offset + 172, $bd_itm_sub3, value);
	}


	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public String bd_itm_nm() {
		return getConstString(offset + 173, $bd_itm_nm);
	}

	/**
	 * Charged item name 負担品目名.<p>
	 *
	 */
	public void bd_itm_nm(String value) {
		setConstString(offset + 173, $bd_itm_nm, value);
	}


	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return getConstString(offset + 174, $bd_lot_no);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		setConstString(offset + 174, $bd_lot_no, value);
	}


	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return getConstString(offset + 175, $bd_sublot_no);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		setConstString(offset + 175, $bd_sublot_no, value);
	}


	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return getConstString(offset + 176, $bd_sno1);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		setConstString(offset + 176, $bd_sno1, value);
	}


	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return getConstString(offset + 177, $bd_sno2);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		setConstString(offset + 177, $bd_sno2, value);
	}


	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return getConstString(offset + 178, $bd_sno3);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		setConstString(offset + 178, $bd_sno3, value);
	}


	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return getConstString(offset + 179, $bd_sno4);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		setConstString(offset + 179, $bd_sno4, value);
	}


	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 180, $bd_bp_cd);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 180, $bd_bp_cd, value);
	}


	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public String bd_bp_nm() {
		return getConstString(offset + 181, $bd_bp_nm);
	}

	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public void bd_bp_nm(String value) {
		setConstString(offset + 181, $bd_bp_nm, value);
	}


	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 182, $bd_loc_cd);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 182, $bd_loc_cd, value);
	}


	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public String bd_loc_nm() {
		return getConstString(offset + 183, $bd_loc_nm);
	}

	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public void bd_loc_nm(String value) {
		setConstString(offset + 183, $bd_loc_nm, value);
	}


	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 184, $bd_ctg_cd);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 184, $bd_ctg_cd, value);
	}


	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public String bd_ctg_nm() {
		return getConstString(offset + 185, $bd_ctg_nm);
	}

	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public void bd_ctg_nm(String value) {
		setConstString(offset + 185, $bd_ctg_nm, value);
	}


	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 186, $bd_oper_cd);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 186, $bd_oper_cd, value);
	}


	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public String bd_oper_nm() {
		return getConstString(offset + 187, $bd_oper_nm);
	}

	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public void bd_oper_nm(String value) {
		setConstString(offset + 187, $bd_oper_nm, value);
	}


	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 188, $bd_iv_no);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 188, $bd_iv_no, value);
	}


	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 189, $bd_slo_no);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 189, $bd_slo_no, value);
	}


	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 190, $bd_po_no);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 190, $bd_po_no, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 191, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 191, $insp_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 192, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 192, $intr_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 193, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 193, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 194, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 194, $trd_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 195, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 195, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 196, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 196, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 197, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 197, $sub_char3, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 198, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 198, $arr_cnt_rmrks, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 199, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 199, $arr_act_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 200, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 200, $arr_schd_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 201, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 201, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 202, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 202, $dlv_slip_d_no, value);
	}


	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_rqst_wg_cd() {
		return getConstString(offset + 203, $purc_rqst_wg_cd);
	}

	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_rqst_wg_cd(String value) {
		setConstString(offset + 203, $purc_rqst_wg_cd, value);
	}


	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public String purc_rqst_wg_nm() {
		return getConstString(offset + 204, $purc_rqst_wg_nm);
	}

	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public void purc_rqst_wg_nm(String value) {
		setConstString(offset + 204, $purc_rqst_wg_nm, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 205, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 205, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 206, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 206, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 207, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 207, $po_schd_src_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 208, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 208, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 209, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 209, $po_d_no, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 210, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 210, $po_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 211, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 211, $purc_schd_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 212, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 212, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 213, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 213, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 214, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 214, $rcpt_iv_d_no, value);
	}


	/**
	 * Temporary purchase I/V No. 仮受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String temp_rcpt_iv_no() {
		return getConstString(offset + 215, $temp_rcpt_iv_no);
	}

	/**
	 * Temporary purchase I/V No. 仮受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void temp_rcpt_iv_no(String value) {
		setConstString(offset + 215, $temp_rcpt_iv_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 216, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 216, $iv_no, value);
	}


	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 217, $iv_d_no);
	}

	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 217, $iv_d_no, value);
	}


	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 218, $dlv_inst_no);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 218, $dlv_inst_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 219, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 219, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 220, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 220, $purc_act_d_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 221, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 221, $ship_act_no, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 222, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 222, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 223, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 223, $ship_lg_grp_nm, value);
	}


	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public String ship_wg_cd() {
		return getConstString(offset + 224, $ship_wg_cd);
	}

	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public void ship_wg_cd(String value) {
		setConstString(offset + 224, $ship_wg_cd, value);
	}


	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public String ship_wg_nm() {
		return getConstString(offset + 225, $ship_wg_nm);
	}

	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public void ship_wg_nm(String value) {
		setConstString(offset + 225, $ship_wg_nm, value);
	}


	/**
	 * Without shipping plan 出荷計画外.<p>
	 *
	 */
	public boolean ship_uplnd_flg() {
		return getConstBoolean(offset + 226, $ship_uplnd_flg);
	}

	/**
	 * Without shipping plan 出荷計画外.<p>
	 *
	 */
	public void ship_uplnd_flg(boolean value) {
		setConstBoolean(offset + 226, $ship_uplnd_flg, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 227, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 227, $sls_ret_schd_no, value);
	}


	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 228, $sls_ret_schd_d_no);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 228, $sls_ret_schd_d_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 229, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 229, $sls_act_no, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 230, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 230, $sls_act_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 231, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 231, $cst_po_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 232, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 232, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 233, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 233, $cst_itm_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 234, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 234, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 235, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 235, $slo_d_no, value);
	}


	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 236, $purc_qty);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 236, $purc_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 236, $purc_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 236, $purc_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 236, $purc_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 236, $purc_qty, value);
	}


	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return getConstNumber(offset + 237, $sls_ret_qty);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		setConstNumber(offset + 237, $sls_ret_qty, value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		setConstNumber(offset + 237, $sls_ret_qty, value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		setConstNumber(offset + 237, $sls_ret_qty, value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		setConstNumber(offset + 237, $sls_ret_qty, value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		setConstNumber(offset + 237, $sls_ret_qty, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 238, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 238, $outsrc_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 239, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 239, $mfg_inst_no, value);
	}


	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 240, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 240, $pre_outsrc_act_flg, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 241, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 241, $mfg_act_no, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 242, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 242, $stk_lst_prnt_flg, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 243, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 243, $edi_flg, value);
	}


	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_no() {
		return getConstString(offset + 244, $edi_bp_dlv_slip_no);
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_no(String value) {
		setConstString(offset + 244, $edi_bp_dlv_slip_no, value);
	}


	/**
	 * EDI vendor delivery note row No. ＥＤＩ業者納品書行ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_d_no() {
		return getConstString(offset + 245, $edi_bp_dlv_slip_d_no);
	}

	/**
	 * EDI vendor delivery note row No. ＥＤＩ業者納品書行ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_d_no(String value) {
		setConstString(offset + 245, $edi_bp_dlv_slip_d_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 246, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 246, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 247, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 247, $prov_typ_nm, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 248, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 248, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public String prov_src_schd_typ_nm() {
		return getConstString(offset + 249, $prov_src_schd_typ_nm);
	}

	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public void prov_src_schd_typ_nm(String value) {
		setConstString(offset + 249, $prov_src_schd_typ_nm, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String po_grp_cd1() {
		return getConstString(offset + 250, $po_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void po_grp_cd1(String value) {
		setConstString(offset + 250, $po_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String po_grp_nm1() {
		return getConstString(offset + 251, $po_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void po_grp_nm1(String value) {
		setConstString(offset + 251, $po_grp_nm1, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String po_grp_cd2() {
		return getConstString(offset + 252, $po_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void po_grp_cd2(String value) {
		setConstString(offset + 252, $po_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String po_grp_nm2() {
		return getConstString(offset + 253, $po_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void po_grp_nm2(String value) {
		setConstString(offset + 253, $po_grp_nm2, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String po_grp_cd3() {
		return getConstString(offset + 254, $po_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void po_grp_cd3(String value) {
		setConstString(offset + 254, $po_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String po_grp_nm3() {
		return getConstString(offset + 255, $po_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void po_grp_nm3(String value) {
		setConstString(offset + 255, $po_grp_nm3, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String po_grp_cd4() {
		return getConstString(offset + 256, $po_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void po_grp_cd4(String value) {
		setConstString(offset + 256, $po_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String po_grp_nm4() {
		return getConstString(offset + 257, $po_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void po_grp_nm4(String value) {
		setConstString(offset + 257, $po_grp_nm4, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String po_grp_cd5() {
		return getConstString(offset + 258, $po_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void po_grp_cd5(String value) {
		setConstString(offset + 258, $po_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String po_grp_nm5() {
		return getConstString(offset + 259, $po_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void po_grp_nm5(String value) {
		setConstString(offset + 259, $po_grp_nm5, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String po_grp_cd6() {
		return getConstString(offset + 260, $po_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void po_grp_cd6(String value) {
		setConstString(offset + 260, $po_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String po_grp_nm6() {
		return getConstString(offset + 261, $po_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void po_grp_nm6(String value) {
		setConstString(offset + 261, $po_grp_nm6, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String po_grp_cd7() {
		return getConstString(offset + 262, $po_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void po_grp_cd7(String value) {
		setConstString(offset + 262, $po_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String po_grp_nm7() {
		return getConstString(offset + 263, $po_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void po_grp_nm7(String value) {
		setConstString(offset + 263, $po_grp_nm7, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String po_grp_cd8() {
		return getConstString(offset + 264, $po_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void po_grp_cd8(String value) {
		setConstString(offset + 264, $po_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String po_grp_nm8() {
		return getConstString(offset + 265, $po_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void po_grp_nm8(String value) {
		setConstString(offset + 265, $po_grp_nm8, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String po_grp_cd9() {
		return getConstString(offset + 266, $po_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void po_grp_cd9(String value) {
		setConstString(offset + 266, $po_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String po_grp_nm9() {
		return getConstString(offset + 267, $po_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void po_grp_nm9(String value) {
		setConstString(offset + 267, $po_grp_nm9, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String po_grp_cd10() {
		return getConstString(offset + 268, $po_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void po_grp_cd10(String value) {
		setConstString(offset + 268, $po_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String po_grp_nm10() {
		return getConstString(offset + 269, $po_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void po_grp_nm10(String value) {
		setConstString(offset + 269, $po_grp_nm10, value);
	}


	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public String sret_fr_grp_cd1() {
		return getConstString(offset + 270, $sret_fr_grp_cd1);
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public void sret_fr_grp_cd1(String value) {
		setConstString(offset + 270, $sret_fr_grp_cd1, value);
	}


	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public String sret_fr_grp_nm1() {
		return getConstString(offset + 271, $sret_fr_grp_nm1);
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public void sret_fr_grp_nm1(String value) {
		setConstString(offset + 271, $sret_fr_grp_nm1, value);
	}


	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public String sret_fr_grp_cd2() {
		return getConstString(offset + 272, $sret_fr_grp_cd2);
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public void sret_fr_grp_cd2(String value) {
		setConstString(offset + 272, $sret_fr_grp_cd2, value);
	}


	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public String sret_fr_grp_nm2() {
		return getConstString(offset + 273, $sret_fr_grp_nm2);
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public void sret_fr_grp_nm2(String value) {
		setConstString(offset + 273, $sret_fr_grp_nm2, value);
	}


	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public String sret_fr_grp_cd3() {
		return getConstString(offset + 274, $sret_fr_grp_cd3);
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public void sret_fr_grp_cd3(String value) {
		setConstString(offset + 274, $sret_fr_grp_cd3, value);
	}


	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public String sret_fr_grp_nm3() {
		return getConstString(offset + 275, $sret_fr_grp_nm3);
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public void sret_fr_grp_nm3(String value) {
		setConstString(offset + 275, $sret_fr_grp_nm3, value);
	}


	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public String sret_fr_grp_cd4() {
		return getConstString(offset + 276, $sret_fr_grp_cd4);
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public void sret_fr_grp_cd4(String value) {
		setConstString(offset + 276, $sret_fr_grp_cd4, value);
	}


	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public String sret_fr_grp_nm4() {
		return getConstString(offset + 277, $sret_fr_grp_nm4);
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public void sret_fr_grp_nm4(String value) {
		setConstString(offset + 277, $sret_fr_grp_nm4, value);
	}


	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public String sret_fr_grp_cd5() {
		return getConstString(offset + 278, $sret_fr_grp_cd5);
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public void sret_fr_grp_cd5(String value) {
		setConstString(offset + 278, $sret_fr_grp_cd5, value);
	}


	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public String sret_fr_grp_nm5() {
		return getConstString(offset + 279, $sret_fr_grp_nm5);
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public void sret_fr_grp_nm5(String value) {
		setConstString(offset + 279, $sret_fr_grp_nm5, value);
	}


	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public String sret_fr_grp_cd6() {
		return getConstString(offset + 280, $sret_fr_grp_cd6);
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public void sret_fr_grp_cd6(String value) {
		setConstString(offset + 280, $sret_fr_grp_cd6, value);
	}


	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public String sret_fr_grp_nm6() {
		return getConstString(offset + 281, $sret_fr_grp_nm6);
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public void sret_fr_grp_nm6(String value) {
		setConstString(offset + 281, $sret_fr_grp_nm6, value);
	}


	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public String sret_fr_grp_cd7() {
		return getConstString(offset + 282, $sret_fr_grp_cd7);
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public void sret_fr_grp_cd7(String value) {
		setConstString(offset + 282, $sret_fr_grp_cd7, value);
	}


	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public String sret_fr_grp_nm7() {
		return getConstString(offset + 283, $sret_fr_grp_nm7);
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public void sret_fr_grp_nm7(String value) {
		setConstString(offset + 283, $sret_fr_grp_nm7, value);
	}


	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public String sret_fr_grp_cd8() {
		return getConstString(offset + 284, $sret_fr_grp_cd8);
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public void sret_fr_grp_cd8(String value) {
		setConstString(offset + 284, $sret_fr_grp_cd8, value);
	}


	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public String sret_fr_grp_nm8() {
		return getConstString(offset + 285, $sret_fr_grp_nm8);
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public void sret_fr_grp_nm8(String value) {
		setConstString(offset + 285, $sret_fr_grp_nm8, value);
	}


	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public String sret_fr_grp_cd9() {
		return getConstString(offset + 286, $sret_fr_grp_cd9);
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public void sret_fr_grp_cd9(String value) {
		setConstString(offset + 286, $sret_fr_grp_cd9, value);
	}


	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public String sret_fr_grp_nm9() {
		return getConstString(offset + 287, $sret_fr_grp_nm9);
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public void sret_fr_grp_nm9(String value) {
		setConstString(offset + 287, $sret_fr_grp_nm9, value);
	}


	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public String sret_fr_grp_cd10() {
		return getConstString(offset + 288, $sret_fr_grp_cd10);
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public void sret_fr_grp_cd10(String value) {
		setConstString(offset + 288, $sret_fr_grp_cd10, value);
	}


	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public String sret_fr_grp_nm10() {
		return getConstString(offset + 289, $sret_fr_grp_nm10);
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public void sret_fr_grp_nm10(String value) {
		setConstString(offset + 289, $sret_fr_grp_nm10, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 290, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 290, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 291, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 291, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 292, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 292, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 293, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 293, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 294, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 294, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 295, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 295, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 296, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 296, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 297, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 297, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 298, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 298, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 299, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 299, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 300, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 300, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 301, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 301, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 302, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 302, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 303, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 303, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 304, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 304, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 305, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 305, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 306, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 306, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 307, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 307, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 308, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 308, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 309, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 309, $cst_grp_nm10, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 310, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 310, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 311, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 311, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 312, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 312, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 313, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 313, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 314, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 314, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 315, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 315, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 316, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 316, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 317, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 317, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 318, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 318, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 319, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 319, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 320, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 320, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 321, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 321, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 322, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 322, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 323, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 323, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 324, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 324, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 325, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 325, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 326, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 326, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 327, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 327, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 328, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 328, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 329, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 329, $itm_grp_nm10, value);
	}


	/**
	 * Entry user cd. 登録ユーザＣＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 330, $ins_usr_id);
	}

	/**
	 * Entry user cd. 登録ユーザＣＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 330, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 331, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 331, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 332, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 332, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 333, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 333, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 334, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 334, $ins_ts, value);
	}


	/**
	 * Update user cd. 更新ユーザＣＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 335, $upd_usr_id);
	}

	/**
	 * Update user cd. 更新ユーザＣＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 335, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 336, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 336, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 337, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 337, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 338, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 338, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 339, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 339, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 340, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 340, $upd_srv_req_no, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 341, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 341, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 341, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 341, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 341, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 341, $arr_pr_upd_cntr, value);
	}


	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_act_upd_cntr() {
		return getConstNumber(offset + 342, $arr_act_upd_cntr);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 342, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(int value) {
		setConstNumber(offset + 342, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(long value) {
		setConstNumber(offset + 342, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(float value) {
		setConstNumber(offset + 342, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(double value) {
		setConstNumber(offset + 342, $arr_act_upd_cntr, value);
	}


	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 343, $rcpt_iv_upd_cntr);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 343, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 343, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 343, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 343, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 343, $rcpt_iv_upd_cntr, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 344, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 344, $crt_lot_flg, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 345, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 345, $same_lot_flg, value);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return getConstString(offset + 346, $purc_act_io_no);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		setConstString(offset + 346, $purc_act_io_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 347, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 347, $arr_pr_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 348, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 348, $io_schd_pr_no, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 349, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 349, $rtn_sts_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 350, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 350, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
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
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_cd();
		}
		if ($ret_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_nm();
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			return ret_loc_nm();
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			return ret_str_ln_cd();
		}
		if ($ret_str_ln_nm.equalsIgnoreCase(name)) {
			return ret_str_ln_nm();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			return ret_gd_nm();
		}
		if ($arr_schd_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_schd_lg_grp_cd();
		}
		if ($arr_schd_loc_cd.equalsIgnoreCase(name)) {
			return arr_schd_loc_cd();
		}
		if ($arr_schd_loc_nm.equalsIgnoreCase(name)) {
			return arr_schd_loc_nm();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			return arr_site_cd();
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			return arr_site_nm();
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			return arr_alloc_grp_cd();
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			return arr_alloc_grp_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			return arr_str_ln_cd();
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			return arr_str_ln_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
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
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			return purc_rqst_wg_cd();
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			return purc_rqst_wg_nm();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			return temp_rcpt_iv_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_no();
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			return po_grp_cd1();
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			return po_grp_nm1();
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			return po_grp_cd2();
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			return po_grp_nm2();
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			return po_grp_cd3();
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			return po_grp_nm3();
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			return po_grp_cd4();
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			return po_grp_nm4();
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			return po_grp_cd5();
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			return po_grp_nm5();
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			return po_grp_cd6();
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			return po_grp_nm6();
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			return po_grp_cd7();
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			return po_grp_nm7();
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			return po_grp_cd8();
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			return po_grp_nm8();
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			return po_grp_cd9();
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			return po_grp_nm9();
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			return po_grp_cd10();
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			return po_grp_nm10();
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd1();
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm1();
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd2();
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm2();
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd3();
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm3();
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd4();
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm4();
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd5();
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm5();
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd6();
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm6();
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd7();
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm7();
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd8();
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm8();
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd9();
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm9();
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd10();
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm10();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
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
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			return arr_schd_unit_qty();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			return arr_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($ret_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_cd_none_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			return ship_uplnd_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
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
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_cd();
		}
		if ($ret_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_nm();
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			return ret_loc_nm();
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			return ret_str_ln_cd();
		}
		if ($ret_str_ln_nm.equalsIgnoreCase(name)) {
			return ret_str_ln_nm();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			return ret_gd_nm();
		}
		if ($arr_schd_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_schd_lg_grp_cd();
		}
		if ($arr_schd_loc_cd.equalsIgnoreCase(name)) {
			return arr_schd_loc_cd();
		}
		if ($arr_schd_loc_nm.equalsIgnoreCase(name)) {
			return arr_schd_loc_nm();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			return arr_site_cd();
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			return arr_site_nm();
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			return arr_alloc_grp_cd();
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			return arr_alloc_grp_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			return arr_str_ln_cd();
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			return arr_str_ln_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($schd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_unit_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
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
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			return purc_rqst_wg_cd();
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			return purc_rqst_wg_nm();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			return temp_rcpt_iv_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_no();
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			return po_grp_cd1();
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			return po_grp_nm1();
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			return po_grp_cd2();
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			return po_grp_nm2();
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			return po_grp_cd3();
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			return po_grp_nm3();
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			return po_grp_cd4();
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			return po_grp_nm4();
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			return po_grp_cd5();
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			return po_grp_nm5();
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			return po_grp_cd6();
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			return po_grp_nm6();
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			return po_grp_cd7();
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			return po_grp_nm7();
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			return po_grp_cd8();
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			return po_grp_nm8();
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			return po_grp_cd9();
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			return po_grp_nm9();
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			return po_grp_cd10();
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			return po_grp_nm10();
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd1();
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm1();
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd2();
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm2();
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd3();
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm3();
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd4();
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm4();
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd5();
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm5();
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd6();
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm6();
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd7();
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm7();
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd8();
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm8();
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd9();
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm9();
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd10();
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm10();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
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
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_base_qty();
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_unit_conv_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			return arr_schd_unit_qty();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			return arr_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			return arr_tm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($ret_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_cd_none_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			return ship_uplnd_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
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
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			sret_fr_nm(value);
			return;
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_cd(value);
			return;
		}
		if ($ret_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_nm(value);
			return;
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			ret_loc_cd(value);
			return;
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			ret_loc_nm(value);
			return;
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			ret_str_ln_cd(value);
			return;
		}
		if ($ret_str_ln_nm.equalsIgnoreCase(name)) {
			ret_str_ln_nm(value);
			return;
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
			return;
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			ret_gd_nm(value);
			return;
		}
		if ($arr_schd_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_schd_lg_grp_cd(value);
			return;
		}
		if ($arr_schd_loc_cd.equalsIgnoreCase(name)) {
			arr_schd_loc_cd(value);
			return;
		}
		if ($arr_schd_loc_nm.equalsIgnoreCase(name)) {
			arr_schd_loc_nm(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			arr_wg_nm(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			arr_site_cd(value);
			return;
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			arr_site_nm(value);
			return;
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			arr_alloc_grp_cd(value);
			return;
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			arr_alloc_grp_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			arr_str_ln_cd(value);
			return;
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			arr_str_ln_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			arr_ptn_typ_nm(value);
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
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			bd_wg_nm(value);
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
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
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
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			purc_rqst_wg_cd(value);
			return;
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			purc_rqst_wg_nm(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			temp_rcpt_iv_no(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_d_no(value);
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			po_grp_cd1(value);
			return;
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			po_grp_nm1(value);
			return;
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			po_grp_cd2(value);
			return;
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			po_grp_nm2(value);
			return;
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			po_grp_cd3(value);
			return;
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			po_grp_nm3(value);
			return;
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			po_grp_cd4(value);
			return;
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			po_grp_nm4(value);
			return;
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			po_grp_cd5(value);
			return;
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			po_grp_nm5(value);
			return;
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			po_grp_cd6(value);
			return;
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			po_grp_nm6(value);
			return;
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			po_grp_cd7(value);
			return;
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			po_grp_nm7(value);
			return;
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			po_grp_cd8(value);
			return;
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			po_grp_nm8(value);
			return;
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			po_grp_cd9(value);
			return;
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			po_grp_nm9(value);
			return;
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			po_grp_cd10(value);
			return;
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			po_grp_nm10(value);
			return;
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			sret_fr_grp_cd1(value);
			return;
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			sret_fr_grp_nm1(value);
			return;
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			sret_fr_grp_cd2(value);
			return;
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			sret_fr_grp_nm2(value);
			return;
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			sret_fr_grp_cd3(value);
			return;
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			sret_fr_grp_nm3(value);
			return;
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			sret_fr_grp_cd4(value);
			return;
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			sret_fr_grp_nm4(value);
			return;
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			sret_fr_grp_cd5(value);
			return;
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			sret_fr_grp_nm5(value);
			return;
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			sret_fr_grp_cd6(value);
			return;
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			sret_fr_grp_nm6(value);
			return;
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			sret_fr_grp_cd7(value);
			return;
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			sret_fr_grp_nm7(value);
			return;
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			sret_fr_grp_cd8(value);
			return;
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			sret_fr_grp_nm8(value);
			return;
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			sret_fr_grp_cd9(value);
			return;
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			sret_fr_grp_nm9(value);
			return;
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			sret_fr_grp_cd10(value);
			return;
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			sret_fr_grp_nm10(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
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
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($ret_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			ret_str_ln_cd_none_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			arr_str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
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
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			ship_uplnd_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
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
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			sret_fr_nm(value);
			return;
		}
		if ($ret_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_cd(value);
			return;
		}
		if ($ret_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_nm(value);
			return;
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			ret_loc_cd(value);
			return;
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			ret_loc_nm(value);
			return;
		}
		if ($ret_str_ln_cd.equalsIgnoreCase(name)) {
			ret_str_ln_cd(value);
			return;
		}
		if ($ret_str_ln_nm.equalsIgnoreCase(name)) {
			ret_str_ln_nm(value);
			return;
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
			return;
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			ret_gd_nm(value);
			return;
		}
		if ($arr_schd_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_schd_lg_grp_cd(value);
			return;
		}
		if ($arr_schd_loc_cd.equalsIgnoreCase(name)) {
			arr_schd_loc_cd(value);
			return;
		}
		if ($arr_schd_loc_nm.equalsIgnoreCase(name)) {
			arr_schd_loc_nm(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			arr_wg_nm(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			arr_site_cd(value);
			return;
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			arr_site_nm(value);
			return;
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			arr_alloc_grp_cd(value);
			return;
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			arr_alloc_grp_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			arr_str_ln_cd(value);
			return;
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			arr_str_ln_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			arr_ptn_typ_nm(value);
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
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			bd_wg_nm(value);
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
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
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
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			purc_rqst_wg_cd(value);
			return;
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			purc_rqst_wg_nm(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			temp_rcpt_iv_no(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_d_no(value);
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			po_grp_cd1(value);
			return;
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			po_grp_nm1(value);
			return;
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			po_grp_cd2(value);
			return;
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			po_grp_nm2(value);
			return;
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			po_grp_cd3(value);
			return;
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			po_grp_nm3(value);
			return;
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			po_grp_cd4(value);
			return;
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			po_grp_nm4(value);
			return;
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			po_grp_cd5(value);
			return;
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			po_grp_nm5(value);
			return;
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			po_grp_cd6(value);
			return;
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			po_grp_nm6(value);
			return;
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			po_grp_cd7(value);
			return;
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			po_grp_nm7(value);
			return;
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			po_grp_cd8(value);
			return;
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			po_grp_nm8(value);
			return;
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			po_grp_cd9(value);
			return;
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			po_grp_nm9(value);
			return;
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			po_grp_cd10(value);
			return;
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			po_grp_nm10(value);
			return;
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			sret_fr_grp_cd1(value);
			return;
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			sret_fr_grp_nm1(value);
			return;
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			sret_fr_grp_cd2(value);
			return;
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			sret_fr_grp_nm2(value);
			return;
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			sret_fr_grp_cd3(value);
			return;
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			sret_fr_grp_nm3(value);
			return;
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			sret_fr_grp_cd4(value);
			return;
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			sret_fr_grp_nm4(value);
			return;
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			sret_fr_grp_cd5(value);
			return;
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			sret_fr_grp_nm5(value);
			return;
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			sret_fr_grp_cd6(value);
			return;
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			sret_fr_grp_nm6(value);
			return;
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			sret_fr_grp_cd7(value);
			return;
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			sret_fr_grp_nm7(value);
			return;
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			sret_fr_grp_cd8(value);
			return;
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			sret_fr_grp_nm8(value);
			return;
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			sret_fr_grp_cd9(value);
			return;
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			sret_fr_grp_nm9(value);
			return;
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			sret_fr_grp_cd10(value);
			return;
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			sret_fr_grp_nm10(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
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
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($schd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_unit_conv_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($arr_schd_unit_qty.equalsIgnoreCase(name)) {
			arr_schd_unit_qty(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		if ($arr_tm.equalsIgnoreCase(name)) {
			arr_tm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($ret_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			ret_str_ln_cd_none_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			arr_str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
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
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			ship_uplnd_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

