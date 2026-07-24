package mcframe.clientMSBE.MSBEP2000;

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
	public static final String $itm_p = "itm_p";
	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $rcpt_iv_itm_nm = "rcpt_iv_itm_nm";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
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
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public static final String $init_abort_flg = "init_abort_flg";
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
	public static final String $schd_qty_p = "schd_qty_p";
	public static final String $act_qty_p = "act_qty_p";
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
	public static final String $schd_unit_qty_p = "schd_unit_qty_p";
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public static final String $pr_rate = "pr_rate";
	public static final String $purc_qty_p = "purc_qty_p";
	public static final String $sls_ret_qty_p = "sls_ret_qty_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $purc_cont_qty_p = "purc_cont_qty_p";
	public static final String $purc_cont_fctr_p = "purc_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
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
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public static final String $arr_str_ln_tgt_flg = "arr_str_ln_tgt_flg";
	public static final String $arr_str_ln_p = "arr_str_ln_p";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $org_ver_no = "org_ver_no";
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
	public static final String $dlv_rqst_tm_p = "dlv_rqst_tm_p";
	public static final String $arr_schd_tm_p = "arr_schd_tm_p";
	public static final String $arr_tm_p = "arr_tm_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	public static final String $stk_bp_p = "stk_bp_p";
	public static final String $stk_arrv_bp_p = "stk_arrv_bp_p";
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
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ret_dlv_slip_d_no = "ret_dlv_slip_d_no";
	public static final String $ret_stk_arrv_bp_p = "ret_stk_arrv_bp_p";
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
	public static final String $ret_str_ln_p = "ret_str_ln_p";
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
	public static final String $rqst_dpt_p = "rqst_dpt_p";
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
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Schedule simultaneously recording 予定同時計上.<p>
	 *
	 */
	public static final String $schd_sync_flg = "schd_sync_flg";
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public static final String $split_flg = "split_flg";
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
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $arr_wg_cd = "arr_wg_cd";
	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public static final String $arr_wg_nm = "arr_wg_nm";
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
	 * Receipt gross allocation location cd. 入荷総量引当場所ＣＤ.<p>
	 *
	 */
	public static final String $arr_alloc_grp_cd = "arr_alloc_grp_cd";
	/**
	 * Receipt gross allocation location name 入荷総量引当場所名.<p>
	 *
	 */
	public static final String $arr_alloc_grp_nm = "arr_alloc_grp_nm";
	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	public static final String $usr_dpt_p = "usr_dpt_p";
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
	public static final String $bditm_p = "bditm_p";
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
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public static final String $dlv_inst_print_d_rmrks = "dlv_inst_print_d_rmrks";
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
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
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
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
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public static final String $prov_src_schd_no1 = "prov_src_schd_no1";
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public static final String $prov_src_schd_no2 = "prov_src_schd_no2";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public static final String $prov_src_act_typ = "prov_src_act_typ";
	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public static final String $prov_src_act_typ_nm = "prov_src_act_typ_nm";
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_src_act_no = "prov_src_act_no";
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
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
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
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
	 * Purchase I/V temporary entry 受領Ｉ／Ｖ仮登録.<p>
	 *
	 */
	public static final String $rcpt_iv_temp_ent_flg = "rcpt_iv_temp_ent_flg";
	/**
	 * Multiple purchase I/V 受領Ｉ／Ｖ複数.<p>
	 *
	 */
	public static final String $rcpt_iv_multi_flg = "rcpt_iv_multi_flg";
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_no = "prms_rcpt_no";
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
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_io_no = "purc_act_io_no";
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
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public static final String $dlv_slip_d_seq = "dlv_slip_d_seq";
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
	 * Export 輸出.<p>
	 *
	 */
	public static final String $ship_ex_flg = "ship_ex_flg";
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
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_io_no = "sls_act_io_no";
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
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_arr_act_no = "ext_arr_act_no";
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
	public static final String $po_grp_p = "po_grp_p";
	public static final String $sret_fr_grp_p = "sret_fr_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $prsppl_grp_p = "prsppl_grp_p";
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
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty_bef = "base_unit_qty_bef";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $arr_schd_qty = $schd_qty_p + ".qty";
	public static final String $arr_qty = $act_qty_p + ".qty";
	public static final String $arr_schd_unit_qty = $schd_unit_qty_p + ".qty";
	public static final String $purc_qty = $purc_qty_p + ".qty";
	public static final String $sls_ret_qty = $sls_ret_qty_p + ".qty";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $arr_str_ln_cd = $arr_str_ln_p + ".str_ln_cd";
	public static final String $arr_str_ln_nm = $arr_str_ln_p + ".str_ln_nm";
	public static final String $arr_str_ln_cd_none_flg = $arr_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $dlv_rqst_dt = $dlv_rqst_tm_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_tm_p + ".hm";
	public static final String $arr_schd_dt = $arr_schd_tm_p + ".ymd";
	public static final String $arr_schd_hm = $arr_schd_tm_p + ".hm";
	public static final String $arr_dt = $arr_tm_p + ".ymd";
	public static final String $arr_hm = $arr_tm_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $stk_bp_cd = $stk_bp_p + ".stk_bp_cd";
	public static final String $stk_bp_nm = $stk_bp_p + ".stk_bp_nm";
	public static final String $stk_arrv_bp_cd = $stk_arrv_bp_p + ".stk_arrv_bp_cd";
	public static final String $stk_arrv_bp_nm = $stk_arrv_bp_p + ".stk_arrv_bp_nm";
	public static final String $ret_stk_arrv_bp_cd = $ret_stk_arrv_bp_p + ".stk_arrv_bp_cd";
	public static final String $ret_stk_arrv_bp_nm = $ret_stk_arrv_bp_p + ".stk_arrv_bp_nm";
	public static final String $ret_str_ln_cd = $ret_str_ln_p + ".str_ln_cd";
	public static final String $ret_str_ln_nm = $ret_str_ln_p + ".str_ln_nm";
	public static final String $ret_str_ln_cd_none_flg = $ret_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $rqst_usr_cd = $rqst_dpt_p + ".usr_cd";
	public static final String $rqst_usr_nm = $rqst_dpt_p + ".usr_nm";
	public static final String $rqst_dpt_cd = $rqst_dpt_p + ".dpt_cd";
	public static final String $rqst_dpt_nm = $rqst_dpt_p + ".dpt_nm";
	public static final String $arr_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $arr_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $arr_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $arr_dpt_nm = $usr_dpt_p + ".dpt_nm";
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
	public static final String $po_grp_cd1 = $po_grp_p + ".bp_grp_cd1";
	public static final String $po_grp_nm1 = $po_grp_p + ".bp_grp_nm1";
	public static final String $po_grp_cd2 = $po_grp_p + ".bp_grp_cd2";
	public static final String $po_grp_nm2 = $po_grp_p + ".bp_grp_nm2";
	public static final String $po_grp_cd3 = $po_grp_p + ".bp_grp_cd3";
	public static final String $po_grp_nm3 = $po_grp_p + ".bp_grp_nm3";
	public static final String $po_grp_cd4 = $po_grp_p + ".bp_grp_cd4";
	public static final String $po_grp_nm4 = $po_grp_p + ".bp_grp_nm4";
	public static final String $po_grp_cd5 = $po_grp_p + ".bp_grp_cd5";
	public static final String $po_grp_nm5 = $po_grp_p + ".bp_grp_nm5";
	public static final String $po_grp_cd6 = $po_grp_p + ".bp_grp_cd6";
	public static final String $po_grp_nm6 = $po_grp_p + ".bp_grp_nm6";
	public static final String $po_grp_cd7 = $po_grp_p + ".bp_grp_cd7";
	public static final String $po_grp_nm7 = $po_grp_p + ".bp_grp_nm7";
	public static final String $po_grp_cd8 = $po_grp_p + ".bp_grp_cd8";
	public static final String $po_grp_nm8 = $po_grp_p + ".bp_grp_nm8";
	public static final String $po_grp_cd9 = $po_grp_p + ".bp_grp_cd9";
	public static final String $po_grp_nm9 = $po_grp_p + ".bp_grp_nm9";
	public static final String $po_grp_cd10 = $po_grp_p + ".bp_grp_cd10";
	public static final String $po_grp_nm10 = $po_grp_p + ".bp_grp_nm10";
	public static final String $sret_fr_grp_cd1 = $sret_fr_grp_p + ".bp_grp_cd1";
	public static final String $sret_fr_grp_nm1 = $sret_fr_grp_p + ".bp_grp_nm1";
	public static final String $sret_fr_grp_cd2 = $sret_fr_grp_p + ".bp_grp_cd2";
	public static final String $sret_fr_grp_nm2 = $sret_fr_grp_p + ".bp_grp_nm2";
	public static final String $sret_fr_grp_cd3 = $sret_fr_grp_p + ".bp_grp_cd3";
	public static final String $sret_fr_grp_nm3 = $sret_fr_grp_p + ".bp_grp_nm3";
	public static final String $sret_fr_grp_cd4 = $sret_fr_grp_p + ".bp_grp_cd4";
	public static final String $sret_fr_grp_nm4 = $sret_fr_grp_p + ".bp_grp_nm4";
	public static final String $sret_fr_grp_cd5 = $sret_fr_grp_p + ".bp_grp_cd5";
	public static final String $sret_fr_grp_nm5 = $sret_fr_grp_p + ".bp_grp_nm5";
	public static final String $sret_fr_grp_cd6 = $sret_fr_grp_p + ".bp_grp_cd6";
	public static final String $sret_fr_grp_nm6 = $sret_fr_grp_p + ".bp_grp_nm6";
	public static final String $sret_fr_grp_cd7 = $sret_fr_grp_p + ".bp_grp_cd7";
	public static final String $sret_fr_grp_nm7 = $sret_fr_grp_p + ".bp_grp_nm7";
	public static final String $sret_fr_grp_cd8 = $sret_fr_grp_p + ".bp_grp_cd8";
	public static final String $sret_fr_grp_nm8 = $sret_fr_grp_p + ".bp_grp_nm8";
	public static final String $sret_fr_grp_cd9 = $sret_fr_grp_p + ".bp_grp_cd9";
	public static final String $sret_fr_grp_nm9 = $sret_fr_grp_p + ".bp_grp_nm9";
	public static final String $sret_fr_grp_cd10 = $sret_fr_grp_p + ".bp_grp_cd10";
	public static final String $sret_fr_grp_nm10 = $sret_fr_grp_p + ".bp_grp_nm10";
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
	public static final String $prsppl_grp_cd1 = $prsppl_grp_p + ".bp_grp_cd1";
	public static final String $prsppl_grp_nm1 = $prsppl_grp_p + ".bp_grp_nm1";
	public static final String $prsppl_grp_cd2 = $prsppl_grp_p + ".bp_grp_cd2";
	public static final String $prsppl_grp_nm2 = $prsppl_grp_p + ".bp_grp_nm2";
	public static final String $prsppl_grp_cd3 = $prsppl_grp_p + ".bp_grp_cd3";
	public static final String $prsppl_grp_nm3 = $prsppl_grp_p + ".bp_grp_nm3";
	public static final String $prsppl_grp_cd4 = $prsppl_grp_p + ".bp_grp_cd4";
	public static final String $prsppl_grp_nm4 = $prsppl_grp_p + ".bp_grp_nm4";
	public static final String $prsppl_grp_cd5 = $prsppl_grp_p + ".bp_grp_cd5";
	public static final String $prsppl_grp_nm5 = $prsppl_grp_p + ".bp_grp_nm5";
	public static final String $prsppl_grp_cd6 = $prsppl_grp_p + ".bp_grp_cd6";
	public static final String $prsppl_grp_nm6 = $prsppl_grp_p + ".bp_grp_nm6";
	public static final String $prsppl_grp_cd7 = $prsppl_grp_p + ".bp_grp_cd7";
	public static final String $prsppl_grp_nm7 = $prsppl_grp_p + ".bp_grp_nm7";
	public static final String $prsppl_grp_cd8 = $prsppl_grp_p + ".bp_grp_cd8";
	public static final String $prsppl_grp_nm8 = $prsppl_grp_p + ".bp_grp_nm8";
	public static final String $prsppl_grp_cd9 = $prsppl_grp_p + ".bp_grp_cd9";
	public static final String $prsppl_grp_nm9 = $prsppl_grp_p + ".bp_grp_nm9";
	public static final String $prsppl_grp_cd10 = $prsppl_grp_p + ".bp_grp_cd10";
	public static final String $prsppl_grp_nm10 = $prsppl_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta rcpt_iv_itm_nm_META = createCommonMeta($rcpt_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta cststk_flg_META = createCommonMeta($cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_abort_flg_META = createCommonMeta($init_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_qty_p_META = createInnerRowMeta($schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_qty_p_META = createInnerRowMeta($act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_conv_base_qty_META = createCommonMeta($schd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_conv_qty_META = createCommonMeta($schd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_unit_rnd_typ_META = createCommonMeta($schd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta schd_unit_qty_p_META = createInnerRowMeta($schd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pr_rate_META = createCommonMeta($pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta purc_qty_p_META = createInnerRowMeta($purc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_ret_qty_p_META = createInnerRowMeta($sls_ret_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_p_META = createInnerRowMeta($purc_cont_qty_p, mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class);
	public static final MCMeta purc_cont_fctr_p_META = createInnerRowMeta($purc_cont_fctr_p, mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta arr_schd_lg_grp_cd_META = createCommonMeta($arr_schd_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_schd_loc_cd_META = createCommonMeta($arr_schd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_schd_loc_nm_META = createCommonMeta($arr_schd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_str_ln_tgt_flg_META = createCommonMeta($arr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_str_ln_p_META = createInnerRowMeta($arr_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta org_ver_no_META = createCommonMeta($org_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_rqst_tm_p_META = createInnerRowMeta($dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta arr_schd_tm_p_META = createInnerRowMeta($arr_schd_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta arr_tm_p_META = createInnerRowMeta($arr_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP5240.CanAcDtR.class);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_cd_META = createCommonMeta($sret_fr_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sret_fr_nm_META = createCommonMeta($sret_fr_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta stk_bp_p_META = createInnerRowMeta($stk_bp_p, mcframe.clientMSUB.MSUBP5050.StkBpR.class);
	public static final MCMeta stk_arrv_bp_p_META = createInnerRowMeta($stk_arrv_bp_p, mcframe.clientMSUB.MSUBP5060.StkArrvBpR.class);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta ret_dlv_slip_d_no_META = createCommonMeta($ret_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ret_stk_arrv_bp_p_META = createInnerRowMeta($ret_stk_arrv_bp_p, mcframe.clientMSUB.MSUBP5060.StkArrvBpR.class);
	public static final MCMeta ret_loc_cd_META = createCommonMeta($ret_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ret_loc_nm_META = createCommonMeta($ret_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ret_str_ln_tgt_flg_META = createCommonMeta($ret_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_str_ln_p_META = createInnerRowMeta($ret_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta ret_gd_cd_META = createCommonMeta($ret_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta ret_gd_nm_META = createCommonMeta($ret_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta rqst_dpt_p_META = createInnerRowMeta($rqst_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_sync_flg_META = createCommonMeta($schd_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta split_flg_META = createCommonMeta($split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta arr_ptn_typ_nm_META = createCommonMeta($arr_ptn_typ_nm, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP_NM);
	public static final MCMeta arr_lg_grp_cd_META = createCommonMeta($arr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_lg_grp_nm_META = createCommonMeta($arr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta arr_wg_cd_META = createCommonMeta($arr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_wg_nm_META = createCommonMeta($arr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta arr_site_cd_META = createCommonMeta($arr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta arr_site_nm_META = createCommonMeta($arr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta arr_alloc_grp_cd_META = createCommonMeta($arr_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta arr_alloc_grp_nm_META = createCommonMeta($arr_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bditm_p_META = createInnerRowMeta($bditm_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bd_wg_nm_META = createCommonMeta($bd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.ARR_ACT_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta dlv_inst_print_d_rmrks_META = createCommonMeta($dlv_inst_print_d_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_D_RMRKS);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RMRKS);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_typ_nm_META = createCommonMeta($prov_src_schd_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP_NM);
	public static final MCMeta prov_src_schd_no1_META = createCommonMeta($prov_src_schd_no1, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_src_schd_no2_META = createCommonMeta($prov_src_schd_no2, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_src_act_typ_nm_META = createCommonMeta($prov_src_act_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP_NM);
	public static final MCMeta prov_src_act_no_META = createCommonMeta($prov_src_act_no, mcframe.commonMA.meta.MA_META.PROV_SRC_ACT_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta purc_rqst_wg_cd_META = createCommonMeta($purc_rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_rqst_wg_nm_META = createCommonMeta($purc_rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta rcpt_iv_temp_ent_flg_META = createCommonMeta($rcpt_iv_temp_ent_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_multi_flg_META = createCommonMeta($rcpt_iv_multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta prms_rcpt_no_META = createCommonMeta($prms_rcpt_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_io_no_META = createCommonMeta($purc_act_io_no, mcframe.commonMA.meta.MA_META.PURC_ACT_IO_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_wg_cd_META = createCommonMeta($ship_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_wg_nm_META = createCommonMeta($ship_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ship_uplnd_flg_META = createCommonMeta($ship_uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_ex_flg_META = createCommonMeta($ship_ex_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta sls_ret_schd_d_no_META = createCommonMeta($sls_ret_schd_d_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_D_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta sls_act_io_no_META = createCommonMeta($sls_act_io_no, mcframe.commonMA.meta.MA_META.SLS_ACT_IO_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_bp_dlv_slip_no_META = createCommonMeta($edi_bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta edi_bp_dlv_slip_d_no_META = createCommonMeta($edi_bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_arr_act_no_META = createCommonMeta($ext_arr_act_no, mcframe.commonMA.meta.MA_META.EXT_ARR_ACT_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta po_grp_p_META = createInnerRowMeta($po_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta sret_fr_grp_p_META = createInnerRowMeta($sret_fr_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta prsppl_grp_p_META = createInnerRowMeta($prsppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
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
	public static final MCMeta base_unit_qty_bef_META = createCommonMeta($base_unit_qty_bef, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			itm_p_META,
			rcpt_iv_itm_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			cststk_flg_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			lot_no_p_META,
			same_lot_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_p_META,
			abort_flg_META,
			init_abort_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			schd_qty_p_META,
			act_qty_p_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_conv_base_qty_META,
			schd_unit_conv_qty_META,
			schd_unit_dec_place_META,
			schd_unit_rnd_typ_META,
			schd_unit_qty_p_META,
			pr_rate_META,
			purc_qty_p_META,
			sls_ret_qty_p_META,
			cont_fctr_flg_META,
			purc_cont_qty_p_META,
			purc_cont_fctr_p_META,
			std_cont_qty_p_META,
			std_cont_fctr_p_META,
			cont_fctr_unit_p_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			arr_schd_lg_grp_cd_META,
			arr_schd_loc_cd_META,
			arr_schd_loc_nm_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			arr_str_ln_tgt_flg_META,
			arr_str_ln_p_META,
			ver_flg_META,
			ver_no_p_META,
			org_ver_no_META,
			prsppl_cd_META,
			prsppl_nm_META,
			dlv_rqst_tm_p_META,
			arr_schd_tm_p_META,
			arr_tm_p_META,
			ac_dt_p_META,
			can_ac_dt_p_META,
			cst_cd_META,
			cst_nm_META,
			cst_iv_flg_META,
			sret_fr_cd_META,
			sret_fr_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			sppl_iv_flg_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno_wrk_no_p_META,
			stk_bp_p_META,
			stk_arrv_bp_p_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			ret_dlv_slip_d_no_META,
			ret_stk_arrv_bp_p_META,
			ret_loc_cd_META,
			ret_loc_nm_META,
			ret_str_ln_tgt_flg_META,
			ret_str_ln_p_META,
			ret_gd_cd_META,
			ret_gd_nm_META,
			rqst_dpt_p_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			bp_lot_flg_META,
			bp_lot_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			ship_fr_valid_dt_META,
			maker_cd_META,
			maker_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			sync_flg_META,
			schd_sync_flg_META,
			temp_ap_flg_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			split_flg_META,
			arr_ptn_typ_META,
			arr_ptn_typ_nm_META,
			arr_lg_grp_cd_META,
			arr_lg_grp_nm_META,
			arr_wg_cd_META,
			arr_wg_nm_META,
			arr_site_cd_META,
			arr_site_nm_META,
			arr_alloc_grp_cd_META,
			arr_alloc_grp_nm_META,
			loc_sppl_cd_META,
			usr_dpt_p_META,
			rsn_cd_META,
			rsn_nm_META,
			acxfr_gi_flg_META,
			xpns_purc_flg_META,
			bditm_p_META,
			bd_wg_cd_META,
			bd_wg_nm_META,
			insp_cnt_rmrks_META,
			intr_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			arr_cnt_rmrks_META,
			dlv_inst_print_d_rmrks_META,
			prms_rmrks_META,
			arr_act_no_META,
			arr_schd_no_META,
			arr_pr_no_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			prov_src_schd_typ_META,
			prov_src_schd_typ_nm_META,
			prov_src_schd_no1_META,
			prov_src_schd_no2_META,
			prov_schd_no_META,
			prov_src_act_typ_META,
			prov_src_act_typ_nm_META,
			prov_src_act_no_META,
			prov_act_no_META,
			purc_rqst_wg_cd_META,
			purc_rqst_wg_nm_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			po_no_META,
			po_d_no_META,
			po_schd_no_META,
			purc_schd_no_META,
			purc_schd_dt_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_d_no_META,
			rcpt_iv_temp_ent_flg_META,
			rcpt_iv_multi_flg_META,
			dlv_inst_no_META,
			prms_rcpt_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			purc_act_io_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META,
			ship_act_no_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			ship_wg_cd_META,
			ship_wg_nm_META,
			ship_uplnd_flg_META,
			ship_ex_flg_META,
			iv_no_META,
			iv_d_no_META,
			sls_ret_schd_no_META,
			sls_ret_schd_d_no_META,
			sls_act_no_META,
			sls_act_d_no_META,
			sls_act_io_no_META,
			cst_po_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			slo_no_META,
			slo_d_no_META,
			outsrc_flg_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			mfg_act_no_META,
			stk_lst_prnt_flg_META,
			edi_flg_META,
			edi_bp_dlv_slip_no_META,
			edi_bp_dlv_slip_d_no_META,
			wms_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_arr_act_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			po_grp_p_META,
			sret_fr_grp_p_META,
			cst_grp_p_META,
			prsppl_grp_p_META,
			itm_grp_p_META,
			rts_msg_p_META,
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
			base_unit_qty_bef_META
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
				"trd_unit_qty",
				"base_unit_qty",
				"arr_schd_qty",
				"arr_qty",
				"arr_schd_unit_qty",
				"purc_qty",
				"sls_ret_qty",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"std_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"arr_str_ln_cd",
				"arr_str_ln_nm",
				"arr_str_ln_cd_none_flg",
				"ver_no",
				"dlv_rqst_dt",
				"dlv_rqst_hm",
				"arr_schd_dt",
				"arr_schd_hm",
				"arr_dt",
				"arr_hm",
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"stk_bp_cd",
				"stk_bp_nm",
				"stk_arrv_bp_cd",
				"stk_arrv_bp_nm",
				"ret_stk_arrv_bp_cd",
				"ret_stk_arrv_bp_nm",
				"ret_str_ln_cd",
				"ret_str_ln_nm",
				"ret_str_ln_cd_none_flg",
				"rqst_usr_cd",
				"rqst_usr_nm",
				"rqst_dpt_cd",
				"rqst_dpt_nm",
				"arr_usr_cd",
				"arr_usr_nm",
				"arr_dpt_cd",
				"arr_dpt_nm",
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
				"po_grp_cd1",
				"po_grp_nm1",
				"po_grp_cd2",
				"po_grp_nm2",
				"po_grp_cd3",
				"po_grp_nm3",
				"po_grp_cd4",
				"po_grp_nm4",
				"po_grp_cd5",
				"po_grp_nm5",
				"po_grp_cd6",
				"po_grp_nm6",
				"po_grp_cd7",
				"po_grp_nm7",
				"po_grp_cd8",
				"po_grp_nm8",
				"po_grp_cd9",
				"po_grp_nm9",
				"po_grp_cd10",
				"po_grp_nm10",
				"sret_fr_grp_cd1",
				"sret_fr_grp_nm1",
				"sret_fr_grp_cd2",
				"sret_fr_grp_nm2",
				"sret_fr_grp_cd3",
				"sret_fr_grp_nm3",
				"sret_fr_grp_cd4",
				"sret_fr_grp_nm4",
				"sret_fr_grp_cd5",
				"sret_fr_grp_nm5",
				"sret_fr_grp_cd6",
				"sret_fr_grp_nm6",
				"sret_fr_grp_cd7",
				"sret_fr_grp_nm7",
				"sret_fr_grp_cd8",
				"sret_fr_grp_nm8",
				"sret_fr_grp_cd9",
				"sret_fr_grp_nm9",
				"sret_fr_grp_cd10",
				"sret_fr_grp_nm10",
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
				"prsppl_grp_cd1",
				"prsppl_grp_nm1",
				"prsppl_grp_cd2",
				"prsppl_grp_nm2",
				"prsppl_grp_cd3",
				"prsppl_grp_nm3",
				"prsppl_grp_cd4",
				"prsppl_grp_nm4",
				"prsppl_grp_cd5",
				"prsppl_grp_nm5",
				"prsppl_grp_cd6",
				"prsppl_grp_nm6",
				"prsppl_grp_cd7",
				"prsppl_grp_nm7",
				"prsppl_grp_cd8",
				"prsppl_grp_nm8",
				"prsppl_grp_cd9",
				"prsppl_grp_nm9",
				"prsppl_grp_cd10",
				"prsppl_grp_nm10",
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
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$trd_unit_qty,
				$base_unit_qty,
				$arr_schd_qty,
				$arr_qty,
				$arr_schd_unit_qty,
				$purc_qty,
				$sls_ret_qty,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$std_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$arr_str_ln_cd,
				$arr_str_ln_nm,
				$arr_str_ln_cd_none_flg,
				$ver_no,
				$dlv_rqst_dt,
				$dlv_rqst_hm,
				$arr_schd_dt,
				$arr_schd_hm,
				$arr_dt,
				$arr_hm,
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$stk_bp_cd,
				$stk_bp_nm,
				$stk_arrv_bp_cd,
				$stk_arrv_bp_nm,
				$ret_stk_arrv_bp_cd,
				$ret_stk_arrv_bp_nm,
				$ret_str_ln_cd,
				$ret_str_ln_nm,
				$ret_str_ln_cd_none_flg,
				$rqst_usr_cd,
				$rqst_usr_nm,
				$rqst_dpt_cd,
				$rqst_dpt_nm,
				$arr_usr_cd,
				$arr_usr_nm,
				$arr_dpt_cd,
				$arr_dpt_nm,
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
				$po_grp_cd1,
				$po_grp_nm1,
				$po_grp_cd2,
				$po_grp_nm2,
				$po_grp_cd3,
				$po_grp_nm3,
				$po_grp_cd4,
				$po_grp_nm4,
				$po_grp_cd5,
				$po_grp_nm5,
				$po_grp_cd6,
				$po_grp_nm6,
				$po_grp_cd7,
				$po_grp_nm7,
				$po_grp_cd8,
				$po_grp_nm8,
				$po_grp_cd9,
				$po_grp_nm9,
				$po_grp_cd10,
				$po_grp_nm10,
				$sret_fr_grp_cd1,
				$sret_fr_grp_nm1,
				$sret_fr_grp_cd2,
				$sret_fr_grp_nm2,
				$sret_fr_grp_cd3,
				$sret_fr_grp_nm3,
				$sret_fr_grp_cd4,
				$sret_fr_grp_nm4,
				$sret_fr_grp_cd5,
				$sret_fr_grp_nm5,
				$sret_fr_grp_cd6,
				$sret_fr_grp_nm6,
				$sret_fr_grp_cd7,
				$sret_fr_grp_nm7,
				$sret_fr_grp_cd8,
				$sret_fr_grp_nm8,
				$sret_fr_grp_cd9,
				$sret_fr_grp_nm9,
				$sret_fr_grp_cd10,
				$sret_fr_grp_nm10,
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
				$prsppl_grp_cd1,
				$prsppl_grp_nm1,
				$prsppl_grp_cd2,
				$prsppl_grp_nm2,
				$prsppl_grp_cd3,
				$prsppl_grp_nm3,
				$prsppl_grp_cd4,
				$prsppl_grp_nm4,
				$prsppl_grp_cd5,
				$prsppl_grp_nm5,
				$prsppl_grp_cd6,
				$prsppl_grp_nm6,
				$prsppl_grp_cd7,
				$prsppl_grp_nm7,
				$prsppl_grp_cd8,
				$prsppl_grp_nm8,
				$prsppl_grp_cd9,
				$prsppl_grp_nm9,
				$prsppl_grp_cd10,
				$prsppl_grp_nm10,
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
	/** 項目属性情報のグループ[PROV_ONLY_ITEM]のキー定数 */
	public static final String $$PROV_ONLY_ITEM = "PROV_ONLY_ITEM";
	/** 項目属性情報のグループ[ARR_ONLY_ITEM]のキー定数 */
	public static final String $$ARR_ONLY_ITEM = "ARR_ONLY_ITEM";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;sundry_itm_flg;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;sundry_itm_flg;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;sundry_itm_flg;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;stk_mng_typ;asset_mng_typ;sundry_itm_flg;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;bp_lot_flg;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "sublot_no;ver_no"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "ver_no"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place;rnd_typ"},	// trd_unit_cd
				{$arr_loc_cd, "loc_nm;lg_grp_cd;lg_grp_nm;wg_cd;wg_nm;site_cd;site_nm;alloc_grp_cd;alloc_grp_nm;sppl_cd;str_ln_tgt_flg;sppl_cd;sppl_nm;str_ln_cd;str_ln_cd_none_flg"},	// arr_loc_cd
				{$arr_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// arr_str_ln_p.str_ln_cd
				{$cst_cd, "bp_nm;cst_iv_flg"},	// cst_cd
				{$sret_fr_cd, "bp_nm"},	// sret_fr_cd
				{$sppl_cd, "bp_nm;subcon_flg;sppl_iv_flg"},	// sppl_cd
				{$ret_loc_cd, "loc_nm;str_ln_tgt_flg"},	// ret_loc_cd
				{$ret_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// ret_str_ln_p.str_ln_cd
				{$ret_gd_cd, "gd_nm"},	// ret_gd_cd
				{$rqst_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm"},	// rqst_dpt_p.dpt_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"},	// usr_dpt_p.dpt_cd
				{$rsn_cd, "biz_rsn_nm;acxfr_gi_flg;xpns_purc_flg"},	// rsn_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_nm;wg_cd;wg_nm"},	// bditm_p.bd_dpt_cd
				{$prov_typ, "prov_typ_nm"}	// prov_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$arr_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE;true;true;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// arr_loc_cd
				{$arr_str_ln_p + ".str_ln_cd", "arr_loc_cd"},	// arr_str_ln_p.str_ln_cd
				{$cst_cd, "arr_dt;MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// cst_cd
				{$sret_fr_cd, "arr_dt;MAC_BP_IS_SRCH_TYP.DLV"},	// sret_fr_cd
				{$sppl_cd, "arr_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;arr_wg_cd;true;true;asset_mng_typ"},	// sppl_cd
				{$ret_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// ret_loc_cd
				{$ret_str_ln_p + ".str_ln_cd", "ret_loc_cd"},	// ret_str_ln_p.str_ln_cd
				{$rqst_dpt_p + ".dpt_cd", "rqst_usr_cd;arr_dt;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_dpt_p.dpt_cd
				{$maker_cd, "arr_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;asset_mng_typ;sppl_cd;arr_wg_cd;true;true;true"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "arr_dt;arr_usr_cd;MAC_DPT_IS_SRCH_TYP.ARR"},	// usr_dpt_p.dpt_cd
				{$bditm_p + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"}	// bditm_p.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;itm_is_srch_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;itm_is_srch_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$arr_loc_cd, "loc_is_srch_typ;rd_flg;wr_flg;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// arr_loc_cd
				{$arr_str_ln_p + ".str_ln_cd", "loc_cd"},	// arr_str_ln_p.str_ln_cd
				{$cst_cd, "dt;bp_is_srch_typ"},	// cst_cd
				{$sret_fr_cd, "dt;bp_is_srch_typ"},	// sret_fr_cd
				{$sppl_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;sppl_flg;manual_sppl_flg;asset_mng_typ"},	// sppl_cd
				{$ret_loc_cd, "loc_is_srch_typ"},	// ret_loc_cd
				{$ret_str_ln_p + ".str_ln_cd", "loc_cd"},	// ret_str_ln_p.str_ln_cd
				{$rqst_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"},	// rqst_dpt_p.dpt_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;asset_mng_typ;sppl_cd;wg_cd;mode_nullval_flg;maker_flg;manual_sppl_flg"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// usr_dpt_p.dpt_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_is_srch_typ;dt"}	// bditm_p.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$PROV_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$org_ver_no, "E"},	// org_ver_no
				{$prsppl_cd, "E"},	// prsppl_cd
				{$prsppl_nm, "E"},	// prsppl_nm
				{$prov_typ, "E"},	// prov_typ
				{$prov_typ_nm, "E"},	// prov_typ_nm
				{$prov_basis_typ, "E"},	// prov_basis_typ
				{$prov_basis_typ_nm, "E"},	// prov_basis_typ_nm
				{$prov_src_schd_typ, "E"},	// prov_src_schd_typ
				{$prov_src_schd_typ_nm, "E"},	// prov_src_schd_typ_nm
				{$prov_src_schd_no1, "E"},	// prov_src_schd_no1
				{$prov_src_schd_no2, "E"},	// prov_src_schd_no2
				{$prov_schd_no, "E"},	// prov_schd_no
				{$prov_src_act_typ, "E"},	// prov_src_act_typ
				{$prov_src_act_typ_nm, "E"},	// prov_src_act_typ_nm
				{$prov_src_act_no, "E"},	// prov_src_act_no
				{$prov_act_no, "E"},	// prov_act_no
				{$prsppl_grp_p, "E"},	// prsppl_grp_p
				{$prsppl_grp_p + ".bp_grp_cd1", "E"},	// prsppl_grp_p.bp_grp_cd1
				{$prsppl_grp_p + ".bp_grp_nm1", "E"},	// prsppl_grp_p.bp_grp_nm1
				{$prsppl_grp_p + ".bp_grp_cd2", "E"},	// prsppl_grp_p.bp_grp_cd2
				{$prsppl_grp_p + ".bp_grp_nm2", "E"},	// prsppl_grp_p.bp_grp_nm2
				{$prsppl_grp_p + ".bp_grp_cd3", "E"},	// prsppl_grp_p.bp_grp_cd3
				{$prsppl_grp_p + ".bp_grp_nm3", "E"},	// prsppl_grp_p.bp_grp_nm3
				{$prsppl_grp_p + ".bp_grp_cd4", "E"},	// prsppl_grp_p.bp_grp_cd4
				{$prsppl_grp_p + ".bp_grp_nm4", "E"},	// prsppl_grp_p.bp_grp_nm4
				{$prsppl_grp_p + ".bp_grp_cd5", "E"},	// prsppl_grp_p.bp_grp_cd5
				{$prsppl_grp_p + ".bp_grp_nm5", "E"},	// prsppl_grp_p.bp_grp_nm5
				{$prsppl_grp_p + ".bp_grp_cd6", "E"},	// prsppl_grp_p.bp_grp_cd6
				{$prsppl_grp_p + ".bp_grp_nm6", "E"},	// prsppl_grp_p.bp_grp_nm6
				{$prsppl_grp_p + ".bp_grp_cd7", "E"},	// prsppl_grp_p.bp_grp_cd7
				{$prsppl_grp_p + ".bp_grp_nm7", "E"},	// prsppl_grp_p.bp_grp_nm7
				{$prsppl_grp_p + ".bp_grp_cd8", "E"},	// prsppl_grp_p.bp_grp_cd8
				{$prsppl_grp_p + ".bp_grp_nm8", "E"},	// prsppl_grp_p.bp_grp_nm8
				{$prsppl_grp_p + ".bp_grp_cd9", "E"},	// prsppl_grp_p.bp_grp_cd9
				{$prsppl_grp_p + ".bp_grp_nm9", "E"},	// prsppl_grp_p.bp_grp_nm9
				{$prsppl_grp_p + ".bp_grp_cd10", "E"},	// prsppl_grp_p.bp_grp_cd10
				{$prsppl_grp_p + ".bp_grp_nm10", "E"}	// prsppl_grp_p.bp_grp_nm10
			}
		)),
		new MCExtMap.Entry($$ARR_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$cststk_flg, "E"},	// cststk_flg
				{$sls_ret_qty_p, "E"},	// sls_ret_qty_p
				{$sls_ret_qty_p + ".qty", "E"},	// sls_ret_qty_p.qty
				{$cst_cd, "E"},	// cst_cd
				{$cst_nm, "E"},	// cst_nm
				{$cst_iv_flg, "E"},	// cst_iv_flg
				{$sret_fr_cd, "E"},	// sret_fr_cd
				{$sret_fr_nm, "E"},	// sret_fr_nm
				{$sppl_iv_flg, "E"},	// sppl_iv_flg
				{$ret_dlv_slip_d_no, "E"},	// ret_dlv_slip_d_no
				{$ret_stk_arrv_bp_p, "E"},	// ret_stk_arrv_bp_p
				{$ret_stk_arrv_bp_p + ".stk_arrv_bp_cd", "E"},	// ret_stk_arrv_bp_p.stk_arrv_bp_cd
				{$ret_stk_arrv_bp_p + ".stk_arrv_bp_nm", "E"},	// ret_stk_arrv_bp_p.stk_arrv_bp_nm
				{$ret_loc_cd, "E"},	// ret_loc_cd
				{$ret_loc_nm, "E"},	// ret_loc_nm
				{$ret_str_ln_tgt_flg, "E"},	// ret_str_ln_tgt_flg
				{$ret_str_ln_p, "E"},	// ret_str_ln_p
				{$ret_str_ln_p + ".str_ln_cd", "E"},	// ret_str_ln_p.str_ln_cd
				{$ret_str_ln_p + ".str_ln_nm", "E"},	// ret_str_ln_p.str_ln_nm
				{$ret_str_ln_p + ".str_ln_cd_none_flg", "E"},	// ret_str_ln_p.str_ln_cd_none_flg
				{$ret_gd_cd, "E"},	// ret_gd_cd
				{$ret_gd_nm, "E"},	// ret_gd_nm
				{$rsn_cd, "E"},	// rsn_cd
				{$rsn_nm, "E"},	// rsn_nm
				{$acxfr_gi_flg, "E"},	// acxfr_gi_flg
				{$xpns_purc_flg, "E"},	// xpns_purc_flg
				{$bditm_p, "E"},	// bditm_p
				{$bditm_p + ".bd_dpt_cd", "E"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_dpt_nm", "E"},	// bditm_p.bd_dpt_nm
				{$bd_wg_cd, "E"},	// bd_wg_cd
				{$bd_wg_nm, "E"},	// bd_wg_nm
				{$bditm_p + ".bd_itm_cd", "E"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "E"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "E"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "E"},	// bditm_p.bd_itm_sub3
				{$bditm_p + ".bd_itm_nm", "E"},	// bditm_p.bd_itm_nm
				{$bditm_p + ".bd_lot_no", "E"},	// bditm_p.bd_lot_no
				{$bditm_p + ".bd_sublot_no", "E"},	// bditm_p.bd_sublot_no
				{$bditm_p + ".bd_sno1", "E"},	// bditm_p.bd_sno1
				{$bditm_p + ".bd_sno2", "E"},	// bditm_p.bd_sno2
				{$bditm_p + ".bd_sno3", "E"},	// bditm_p.bd_sno3
				{$bditm_p + ".bd_sno4", "E"},	// bditm_p.bd_sno4
				{$bditm_p + ".bd_bp_cd", "E"},	// bditm_p.bd_bp_cd
				{$bditm_p + ".bd_bp_nm", "E"},	// bditm_p.bd_bp_nm
				{$bditm_p + ".bd_loc_cd", "E"},	// bditm_p.bd_loc_cd
				{$bditm_p + ".bd_loc_nm", "E"},	// bditm_p.bd_loc_nm
				{$bditm_p + ".bd_ctg_cd", "E"},	// bditm_p.bd_ctg_cd
				{$bditm_p + ".bd_ctg_nm", "E"},	// bditm_p.bd_ctg_nm
				{$bditm_p + ".bd_oper_cd", "E"},	// bditm_p.bd_oper_cd
				{$bditm_p + ".bd_oper_nm", "E"},	// bditm_p.bd_oper_nm
				{$bditm_p + ".bd_iv_no", "E"},	// bditm_p.bd_iv_no
				{$bditm_p + ".bd_slo_no", "E"},	// bditm_p.bd_slo_no
				{$bditm_p + ".bd_po_no", "E"},	// bditm_p.bd_po_no
				{$prov_src_schd_no1, "E"},	// prov_src_schd_no1
				{$ship_uplnd_flg, "E"},	// ship_uplnd_flg
				{$sls_ret_schd_no, "E"},	// sls_ret_schd_no
				{$sls_ret_schd_d_no, "E"},	// sls_ret_schd_d_no
				{$sls_act_no, "E"},	// sls_act_no
				{$sls_act_d_no, "E"},	// sls_act_d_no
				{$sls_act_io_no, "E"},	// sls_act_io_no
				{$cst_po_no, "E"},	// cst_po_no
				{$cst_itm_cd, "E"},	// cst_itm_cd
				{$cst_itm_nm, "E"},	// cst_itm_nm
				{$stk_lst_prnt_flg, "E"},	// stk_lst_prnt_flg
				{$sret_fr_grp_p, "E"},	// sret_fr_grp_p
				{$sret_fr_grp_p + ".bp_grp_cd1", "E"},	// sret_fr_grp_p.bp_grp_cd1
				{$sret_fr_grp_p + ".bp_grp_nm1", "E"},	// sret_fr_grp_p.bp_grp_nm1
				{$sret_fr_grp_p + ".bp_grp_cd2", "E"},	// sret_fr_grp_p.bp_grp_cd2
				{$sret_fr_grp_p + ".bp_grp_nm2", "E"},	// sret_fr_grp_p.bp_grp_nm2
				{$sret_fr_grp_p + ".bp_grp_cd3", "E"},	// sret_fr_grp_p.bp_grp_cd3
				{$sret_fr_grp_p + ".bp_grp_nm3", "E"},	// sret_fr_grp_p.bp_grp_nm3
				{$sret_fr_grp_p + ".bp_grp_cd4", "E"},	// sret_fr_grp_p.bp_grp_cd4
				{$sret_fr_grp_p + ".bp_grp_nm4", "E"},	// sret_fr_grp_p.bp_grp_nm4
				{$sret_fr_grp_p + ".bp_grp_cd5", "E"},	// sret_fr_grp_p.bp_grp_cd5
				{$sret_fr_grp_p + ".bp_grp_nm5", "E"},	// sret_fr_grp_p.bp_grp_nm5
				{$sret_fr_grp_p + ".bp_grp_cd6", "E"},	// sret_fr_grp_p.bp_grp_cd6
				{$sret_fr_grp_p + ".bp_grp_nm6", "E"},	// sret_fr_grp_p.bp_grp_nm6
				{$sret_fr_grp_p + ".bp_grp_cd7", "E"},	// sret_fr_grp_p.bp_grp_cd7
				{$sret_fr_grp_p + ".bp_grp_nm7", "E"},	// sret_fr_grp_p.bp_grp_nm7
				{$sret_fr_grp_p + ".bp_grp_cd8", "E"},	// sret_fr_grp_p.bp_grp_cd8
				{$sret_fr_grp_p + ".bp_grp_nm8", "E"},	// sret_fr_grp_p.bp_grp_nm8
				{$sret_fr_grp_p + ".bp_grp_cd9", "E"},	// sret_fr_grp_p.bp_grp_cd9
				{$sret_fr_grp_p + ".bp_grp_nm9", "E"},	// sret_fr_grp_p.bp_grp_nm9
				{$sret_fr_grp_p + ".bp_grp_cd10", "E"},	// sret_fr_grp_p.bp_grp_cd10
				{$sret_fr_grp_p + ".bp_grp_nm10", "E"},	// sret_fr_grp_p.bp_grp_nm10
				{$cst_grp_p, "E"},	// cst_grp_p
				{$cst_grp_p + ".bp_grp_cd1", "E"},	// cst_grp_p.bp_grp_cd1
				{$cst_grp_p + ".bp_grp_nm1", "E"},	// cst_grp_p.bp_grp_nm1
				{$cst_grp_p + ".bp_grp_cd2", "E"},	// cst_grp_p.bp_grp_cd2
				{$cst_grp_p + ".bp_grp_nm2", "E"},	// cst_grp_p.bp_grp_nm2
				{$cst_grp_p + ".bp_grp_cd3", "E"},	// cst_grp_p.bp_grp_cd3
				{$cst_grp_p + ".bp_grp_nm3", "E"},	// cst_grp_p.bp_grp_nm3
				{$cst_grp_p + ".bp_grp_cd4", "E"},	// cst_grp_p.bp_grp_cd4
				{$cst_grp_p + ".bp_grp_nm4", "E"},	// cst_grp_p.bp_grp_nm4
				{$cst_grp_p + ".bp_grp_cd5", "E"},	// cst_grp_p.bp_grp_cd5
				{$cst_grp_p + ".bp_grp_nm5", "E"},	// cst_grp_p.bp_grp_nm5
				{$cst_grp_p + ".bp_grp_cd6", "E"},	// cst_grp_p.bp_grp_cd6
				{$cst_grp_p + ".bp_grp_nm6", "E"},	// cst_grp_p.bp_grp_nm6
				{$cst_grp_p + ".bp_grp_cd7", "E"},	// cst_grp_p.bp_grp_cd7
				{$cst_grp_p + ".bp_grp_nm7", "E"},	// cst_grp_p.bp_grp_nm7
				{$cst_grp_p + ".bp_grp_cd8", "E"},	// cst_grp_p.bp_grp_cd8
				{$cst_grp_p + ".bp_grp_nm8", "E"},	// cst_grp_p.bp_grp_nm8
				{$cst_grp_p + ".bp_grp_cd9", "E"},	// cst_grp_p.bp_grp_cd9
				{$cst_grp_p + ".bp_grp_nm9", "E"},	// cst_grp_p.bp_grp_nm9
				{$cst_grp_p + ".bp_grp_cd10", "E"},	// cst_grp_p.bp_grp_cd10
				{$cst_grp_p + ".bp_grp_nm10", "E"}	// cst_grp_p.bp_grp_nm10
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$arr_schd_lg_grp_cd, "LG_GRP"},	// arr_schd_lg_grp_cd
				{$arr_str_ln_tgt_flg, "STR_LN"},	// arr_str_ln_tgt_flg
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$ret_str_ln_tgt_flg, "STR_LN"},	// ret_str_ln_tgt_flg
				{$ret_gd_cd, "STK_GD"},	// ret_gd_cd
				{$ret_gd_nm, "STK_GD"},	// ret_gd_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"},	// rqst_wg_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$arr_lg_grp_cd, "LG_GRP"},	// arr_lg_grp_cd
				{$arr_lg_grp_nm, "LG_GRP"},	// arr_lg_grp_nm
				{$arr_wg_cd, "WG"},	// arr_wg_cd
				{$arr_wg_nm, "WG"},	// arr_wg_nm
				{$arr_site_cd, "SITE"},	// arr_site_cd
				{$arr_site_nm, "SITE"},	// arr_site_nm
				{$arr_alloc_grp_cd, "ALLOC_GRP"},	// arr_alloc_grp_cd
				{$arr_alloc_grp_nm, "ALLOC_GRP"},	// arr_alloc_grp_nm
				{$bd_wg_cd, "WG"},	// bd_wg_cd
				{$bd_wg_nm, "WG"},	// bd_wg_nm
				{$purc_rqst_wg_cd, "WG"},	// purc_rqst_wg_cd
				{$purc_rqst_wg_nm, "WG"},	// purc_rqst_wg_nm
				{$ship_lg_grp_cd, "LG_GRP"},	// ship_lg_grp_cd
				{$ship_lg_grp_nm, "LG_GRP"},	// ship_lg_grp_nm
				{$ship_wg_cd, "WG"},	// ship_wg_cd
				{$ship_wg_nm, "WG"}	// ship_wg_nm
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
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 4, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 4, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 5, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 5, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 6, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 6, $trd_ptn_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 7, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 7, $itm_p, row);
	}


	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return getConstString(offset + 8, $rcpt_iv_itm_nm);
	}

	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		setConstString(offset + 8, $rcpt_iv_itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 9, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 9, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 10, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 10, $asset_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 11, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 11, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 12, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 12, $dscnt_itm_flg, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 13, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 13, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 14, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 14, $purc_id_typ_nm, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean cststk_flg() {
		return getConstBoolean(offset + 15, $cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void cststk_flg(boolean value) {
		setConstBoolean(offset + 15, $cststk_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 16, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 16, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 17, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 17, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 18, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 18, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 19, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 19, $sublot_no_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 20, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 20, $lot_no_p, row);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 21, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 21, $same_lot_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 22, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 22, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 23, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 23, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 24, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 24, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 25, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 25, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 25, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 25, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 25, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 25, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 26, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 26, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 26, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 26, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 26, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 27, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 27, $trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $trd_unit_qty_p, row);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 29, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 29, $abort_flg, value);
	}


	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public boolean init_abort_flg() {
		return getConstBoolean(offset + 30, $init_abort_flg);
	}

	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public void init_abort_flg(boolean value) {
		setConstBoolean(offset + 30, $init_abort_flg, value);
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
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 34, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 34, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $schd_qty_p);
	}
	
	public void schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $act_qty_p);
	}
	
	public void act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $act_qty_p, row);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 38, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 38, $schd_unit_cd, value);
	}


	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 39, $schd_unit_nm);
	}

	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 39, $schd_unit_nm, value);
	}


	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_base_qty() {
		return getConstNumber(offset + 40, $schd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 40, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 40, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 40, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 40, $schd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for schedule unit 予定単位換算基準数量.<p>
	 *
	 */
	public void schd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 40, $schd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public MCNumber schd_unit_conv_qty() {
		return getConstNumber(offset + 41, $schd_unit_conv_qty);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 41, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(int value) {
		setConstNumber(offset + 41, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(long value) {
		setConstNumber(offset + 41, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(float value) {
		setConstNumber(offset + 41, $schd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. for schedule unit 予定単位換算数量.<p>
	 *
	 */
	public void schd_unit_conv_qty(double value) {
		setConstNumber(offset + 41, $schd_unit_conv_qty, value);
	}


	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 42, $schd_unit_dec_place);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 42, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 42, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 42, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 42, $schd_unit_dec_place, value);
	}


	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public String schd_unit_rnd_typ() {
		return getConstString(offset + 43, $schd_unit_rnd_typ);
	}

	/**
	 * Schedule unit rounding type 予定単位端数処理区分.<p>
	 *
	 */
	public void schd_unit_rnd_typ(String value) {
		setConstString(offset + 43, $schd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $schd_unit_qty_p);
	}
	
	public void schd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $schd_unit_qty_p, row);
	}


	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCNumber pr_rate() {
		return getConstNumber(offset + 45, $pr_rate);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(MCNumber value) {
		setConstNumber(offset + 45, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(int value) {
		setConstNumber(offset + 45, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(long value) {
		setConstNumber(offset + 45, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(float value) {
		setConstNumber(offset + 45, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(double value) {
		setConstNumber(offset + 45, $pr_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $purc_qty_p);
	}
	
	public void purc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $purc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_ret_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $sls_ret_qty_p);
	}
	
	public void sls_ret_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $sls_ret_qty_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 48, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 48, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5300.PurcContQtyR purc_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5300.PurcContQtyR) getConstInnerRow(offset + 49, $purc_cont_qty_p);
	}
	
	public void purc_cont_qty_p(mcframe.clientMAUB.MAUBP5300.PurcContQtyR row){
		setConstInnerRow(offset + 49, $purc_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5330.PurcContFctrR purc_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5330.PurcContFctrR) getConstInnerRow(offset + 50, $purc_cont_fctr_p);
	}
	
	public void purc_cont_fctr_p(mcframe.clientMAUB.MAUBP5330.PurcContFctrR row){
		setConstInnerRow(offset + 50, $purc_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 51, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 51, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 52, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 52, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 53, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 53, $cont_fctr_unit_p, row);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 54, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 55, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 55, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Receipt schedule distribution group cd. 入荷予定物流グループＣＤ.<p>
	 *
	 */
	public String arr_schd_lg_grp_cd() {
		return getConstString(offset + 56, $arr_schd_lg_grp_cd);
	}

	/**
	 * Receipt schedule distribution group cd. 入荷予定物流グループＣＤ.<p>
	 *
	 */
	public void arr_schd_lg_grp_cd(String value) {
		setConstString(offset + 56, $arr_schd_lg_grp_cd, value);
	}


	/**
	 * Receipt schedule location cd. 入荷予定場所ＣＤ.<p>
	 *
	 */
	public String arr_schd_loc_cd() {
		return getConstString(offset + 57, $arr_schd_loc_cd);
	}

	/**
	 * Receipt schedule location cd. 入荷予定場所ＣＤ.<p>
	 *
	 */
	public void arr_schd_loc_cd(String value) {
		setConstString(offset + 57, $arr_schd_loc_cd, value);
	}


	/**
	 * Receipt schedule location name 入荷予定場所名.<p>
	 *
	 */
	public String arr_schd_loc_nm() {
		return getConstString(offset + 58, $arr_schd_loc_nm);
	}

	/**
	 * Receipt schedule location name 入荷予定場所名.<p>
	 *
	 */
	public void arr_schd_loc_nm(String value) {
		setConstString(offset + 58, $arr_schd_loc_nm, value);
	}


	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 59, $arr_loc_cd);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 59, $arr_loc_cd, value);
	}


	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 60, $arr_loc_nm);
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 60, $arr_loc_nm, value);
	}


	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public boolean arr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 61, $arr_str_ln_tgt_flg);
	}

	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public void arr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 61, $arr_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR arr_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 62, $arr_str_ln_p);
	}
	
	public void arr_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 62, $arr_str_ln_p, row);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 63, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 63, $ver_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 64, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 64, $ver_no_p, row);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String org_ver_no() {
		return getConstString(offset + 65, $org_ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void org_ver_no(String value) {
		setConstString(offset + 65, $org_ver_no, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 66, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 66, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 67, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 67, $prsppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 68, $dlv_rqst_tm_p);
	}
	
	public void dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 68, $dlv_rqst_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR arr_schd_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 69, $arr_schd_tm_p);
	}
	
	public void arr_schd_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 69, $arr_schd_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR arr_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 70, $arr_tm_p);
	}
	
	public void arr_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 70, $arr_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 71, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 71, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5240.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5240.CanAcDtR) getConstInnerRow(offset + 72, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP5240.CanAcDtR row){
		setConstInnerRow(offset + 72, $can_ac_dt_p, row);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 73, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 73, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 74, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 74, $cst_nm, value);
	}


	/**
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 75, $cst_iv_flg);
	}

	/**
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 75, $cst_iv_flg, value);
	}


	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 76, $sret_fr_cd);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 76, $sret_fr_cd, value);
	}


	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public String sret_fr_nm() {
		return getConstString(offset + 77, $sret_fr_nm);
	}

	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public void sret_fr_nm(String value) {
		setConstString(offset + 77, $sret_fr_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 78, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 78, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 79, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 79, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 80, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 80, $subcon_flg, value);
	}


	/**
	 * PO invoice 発注インボイス.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 81, $sppl_iv_flg);
	}

	/**
	 * PO invoice 発注インボイス.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 81, $sppl_iv_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 82, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 82, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 83, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 83, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 84, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 84, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 85, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 85, $quality_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 86, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 86, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 87, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 87, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 88, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 88, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 89, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 89, $sno4_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 90, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 90, $sno_wrk_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5050.StkBpR stk_bp_p(){
		return (mcframe.clientMSUB.MSUBP5050.StkBpR) getConstInnerRow(offset + 91, $stk_bp_p);
	}
	
	public void stk_bp_p(mcframe.clientMSUB.MSUBP5050.StkBpR row){
		setConstInnerRow(offset + 91, $stk_bp_p, row);
	}


	public mcframe.clientMSUB.MSUBP5060.StkArrvBpR stk_arrv_bp_p(){
		return (mcframe.clientMSUB.MSUBP5060.StkArrvBpR) getConstInnerRow(offset + 92, $stk_arrv_bp_p);
	}
	
	public void stk_arrv_bp_p(mcframe.clientMSUB.MSUBP5060.StkArrvBpR row){
		setConstInnerRow(offset + 92, $stk_arrv_bp_p, row);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 93, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 93, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 94, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 94, $stk_id_typ_nm, value);
	}


	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return getConstString(offset + 95, $ret_dlv_slip_d_no);
	}

	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		setConstString(offset + 95, $ret_dlv_slip_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5060.StkArrvBpR ret_stk_arrv_bp_p(){
		return (mcframe.clientMSUB.MSUBP5060.StkArrvBpR) getConstInnerRow(offset + 96, $ret_stk_arrv_bp_p);
	}
	
	public void ret_stk_arrv_bp_p(mcframe.clientMSUB.MSUBP5060.StkArrvBpR row){
		setConstInnerRow(offset + 96, $ret_stk_arrv_bp_p, row);
	}


	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String ret_loc_cd() {
		return getConstString(offset + 97, $ret_loc_cd);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		setConstString(offset + 97, $ret_loc_cd, value);
	}


	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public String ret_loc_nm() {
		return getConstString(offset + 98, $ret_loc_nm);
	}

	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public void ret_loc_nm(String value) {
		setConstString(offset + 98, $ret_loc_nm, value);
	}


	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public boolean ret_str_ln_tgt_flg() {
		return getConstBoolean(offset + 99, $ret_str_ln_tgt_flg);
	}

	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public void ret_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 99, $ret_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR ret_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 100, $ret_str_ln_p);
	}
	
	public void ret_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 100, $ret_str_ln_p, row);
	}


	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public String ret_gd_cd() {
		return getConstString(offset + 101, $ret_gd_cd);
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		setConstString(offset + 101, $ret_gd_cd, value);
	}


	/**
	 * Return-from source grading name 返品元格付名.<p>
	 *
	 */
	public String ret_gd_nm() {
		return getConstString(offset + 102, $ret_gd_nm);
	}

	/**
	 * Return-from source grading name 返品元格付名.<p>
	 *
	 */
	public void ret_gd_nm(String value) {
		setConstString(offset + 102, $ret_gd_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR rqst_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 103, $rqst_dpt_p);
	}
	
	public void rqst_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 103, $rqst_dpt_p, row);
	}


	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 104, $rqst_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 104, $rqst_wg_cd, value);
	}


	/**
	 * Requesting dept. WG name 依頼元ＷＧ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 105, $rqst_wg_nm);
	}

	/**
	 * Requesting dept. WG name 依頼元ＷＧ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 105, $rqst_wg_nm, value);
	}


	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 106, $bp_lot_flg);
	}

	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 106, $bp_lot_flg, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 107, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 107, $bp_lot_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 108, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 108, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 109, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 109, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 110, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 110, $ship_fr_valid_dt, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 111, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 111, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 112, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 112, $maker_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 113, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 113, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 114, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 114, $sppl_itm_nm, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 115, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 115, $sync_flg, value);
	}


	/**
	 * Schedule simultaneously recording 予定同時計上.<p>
	 *
	 */
	public boolean schd_sync_flg() {
		return getConstBoolean(offset + 116, $schd_sync_flg);
	}

	/**
	 * Schedule simultaneously recording 予定同時計上.<p>
	 *
	 */
	public void schd_sync_flg(boolean value) {
		setConstBoolean(offset + 116, $schd_sync_flg, value);
	}


	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 117, $temp_ap_flg);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 117, $temp_ap_flg, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 118, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 118, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 119, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 119, $purc_basis_typ_nm, value);
	}


	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public boolean split_flg() {
		return getConstBoolean(offset + 120, $split_flg);
	}

	/**
	 * Split recording 分割計上.<p>
	 *
	 */
	public void split_flg(boolean value) {
		setConstBoolean(offset + 120, $split_flg, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 121, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 121, $arr_ptn_typ, value);
	}


	/**
	 * Receipt pattern type name 入荷パタン区分名.<p>
	 *
	 */
	public String arr_ptn_typ_nm() {
		return getConstString(offset + 122, $arr_ptn_typ_nm);
	}

	/**
	 * Receipt pattern type name 入荷パタン区分名.<p>
	 *
	 */
	public void arr_ptn_typ_nm(String value) {
		setConstString(offset + 122, $arr_ptn_typ_nm, value);
	}


	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return getConstString(offset + 123, $arr_lg_grp_cd);
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		setConstString(offset + 123, $arr_lg_grp_cd, value);
	}


	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public String arr_lg_grp_nm() {
		return getConstString(offset + 124, $arr_lg_grp_nm);
	}

	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public void arr_lg_grp_nm(String value) {
		setConstString(offset + 124, $arr_lg_grp_nm, value);
	}


	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public String arr_wg_cd() {
		return getConstString(offset + 125, $arr_wg_cd);
	}

	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public void arr_wg_cd(String value) {
		setConstString(offset + 125, $arr_wg_cd, value);
	}


	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public String arr_wg_nm() {
		return getConstString(offset + 126, $arr_wg_nm);
	}

	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public void arr_wg_nm(String value) {
		setConstString(offset + 126, $arr_wg_nm, value);
	}


	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String arr_site_cd() {
		return getConstString(offset + 127, $arr_site_cd);
	}

	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void arr_site_cd(String value) {
		setConstString(offset + 127, $arr_site_cd, value);
	}


	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public String arr_site_nm() {
		return getConstString(offset + 128, $arr_site_nm);
	}

	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public void arr_site_nm(String value) {
		setConstString(offset + 128, $arr_site_nm, value);
	}


	/**
	 * Receipt gross allocation location cd. 入荷総量引当場所ＣＤ.<p>
	 *
	 */
	public String arr_alloc_grp_cd() {
		return getConstString(offset + 129, $arr_alloc_grp_cd);
	}

	/**
	 * Receipt gross allocation location cd. 入荷総量引当場所ＣＤ.<p>
	 *
	 */
	public void arr_alloc_grp_cd(String value) {
		setConstString(offset + 129, $arr_alloc_grp_cd, value);
	}


	/**
	 * Receipt gross allocation location name 入荷総量引当場所名.<p>
	 *
	 */
	public String arr_alloc_grp_nm() {
		return getConstString(offset + 130, $arr_alloc_grp_nm);
	}

	/**
	 * Receipt gross allocation location name 入荷総量引当場所名.<p>
	 *
	 */
	public void arr_alloc_grp_nm(String value) {
		setConstString(offset + 130, $arr_alloc_grp_nm, value);
	}


	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 131, $loc_sppl_cd);
	}

	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 131, $loc_sppl_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 132, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 132, $usr_dpt_p, row);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 133, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 133, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 134, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 134, $rsn_nm, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 135, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 135, $acxfr_gi_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 136, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 136, $xpns_purc_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bditm_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 137, $bditm_p);
	}
	
	public void bditm_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 137, $bditm_p, row);
	}


	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 138, $bd_wg_cd);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 138, $bd_wg_cd, value);
	}


	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public String bd_wg_nm() {
		return getConstString(offset + 139, $bd_wg_nm);
	}

	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public void bd_wg_nm(String value) {
		setConstString(offset + 139, $bd_wg_nm, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 140, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 140, $insp_cnt_rmrks, value);
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
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 142, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 142, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 143, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 143, $trd_d_rmrks, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 144, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 144, $arr_cnt_rmrks, value);
	}


	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public String dlv_inst_print_d_rmrks() {
		return getConstString(offset + 145, $dlv_inst_print_d_rmrks);
	}

	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public void dlv_inst_print_d_rmrks(String value) {
		setConstString(offset + 145, $dlv_inst_print_d_rmrks, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 146, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 146, $prms_rmrks, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 147, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 147, $arr_act_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 148, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 148, $arr_schd_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 149, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 149, $arr_pr_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 150, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 150, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 151, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 151, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 152, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 152, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 153, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 153, $prov_basis_typ_nm, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 154, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 154, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public String prov_src_schd_typ_nm() {
		return getConstString(offset + 155, $prov_src_schd_typ_nm);
	}

	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public void prov_src_schd_typ_nm(String value) {
		setConstString(offset + 155, $prov_src_schd_typ_nm, value);
	}


	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public String prov_src_schd_no1() {
		return getConstString(offset + 156, $prov_src_schd_no1);
	}

	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public void prov_src_schd_no1(String value) {
		setConstString(offset + 156, $prov_src_schd_no1, value);
	}


	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public String prov_src_schd_no2() {
		return getConstString(offset + 157, $prov_src_schd_no2);
	}

	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public void prov_src_schd_no2(String value) {
		setConstString(offset + 157, $prov_src_schd_no2, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 158, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 158, $prov_schd_no, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 159, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 159, $prov_src_act_typ, value);
	}


	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public String prov_src_act_typ_nm() {
		return getConstString(offset + 160, $prov_src_act_typ_nm);
	}

	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public void prov_src_act_typ_nm(String value) {
		setConstString(offset + 160, $prov_src_act_typ_nm, value);
	}


	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public String prov_src_act_no() {
		return getConstString(offset + 161, $prov_src_act_no);
	}

	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public void prov_src_act_no(String value) {
		setConstString(offset + 161, $prov_src_act_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 162, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 162, $prov_act_no, value);
	}


	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_rqst_wg_cd() {
		return getConstString(offset + 163, $purc_rqst_wg_cd);
	}

	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_rqst_wg_cd(String value) {
		setConstString(offset + 163, $purc_rqst_wg_cd, value);
	}


	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public String purc_rqst_wg_nm() {
		return getConstString(offset + 164, $purc_rqst_wg_nm);
	}

	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public void purc_rqst_wg_nm(String value) {
		setConstString(offset + 164, $purc_rqst_wg_nm, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 165, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 165, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 166, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 166, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 167, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 167, $po_schd_src_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 168, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 168, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 169, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 169, $po_d_no, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 170, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 170, $po_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 171, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 171, $purc_schd_no, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 172, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 172, $purc_schd_dt, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 173, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 173, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 174, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 174, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 175, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 175, $rcpt_iv_d_no, value);
	}


	/**
	 * Purchase I/V temporary entry 受領Ｉ／Ｖ仮登録.<p>
	 *
	 */
	public boolean rcpt_iv_temp_ent_flg() {
		return getConstBoolean(offset + 176, $rcpt_iv_temp_ent_flg);
	}

	/**
	 * Purchase I/V temporary entry 受領Ｉ／Ｖ仮登録.<p>
	 *
	 */
	public void rcpt_iv_temp_ent_flg(boolean value) {
		setConstBoolean(offset + 176, $rcpt_iv_temp_ent_flg, value);
	}


	/**
	 * Multiple purchase I/V 受領Ｉ／Ｖ複数.<p>
	 *
	 */
	public boolean rcpt_iv_multi_flg() {
		return getConstBoolean(offset + 177, $rcpt_iv_multi_flg);
	}

	/**
	 * Multiple purchase I/V 受領Ｉ／Ｖ複数.<p>
	 *
	 */
	public void rcpt_iv_multi_flg(boolean value) {
		setConstBoolean(offset + 177, $rcpt_iv_multi_flg, value);
	}


	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 178, $dlv_inst_no);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 178, $dlv_inst_no, value);
	}


	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 179, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 179, $prms_rcpt_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 180, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 180, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 181, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 181, $purc_act_d_no, value);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return getConstString(offset + 182, $purc_act_io_no);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		setConstString(offset + 182, $purc_act_io_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 183, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 183, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 184, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 184, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 184, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 184, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 184, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 184, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 185, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 185, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 185, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 185, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 185, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 185, $dlv_slip_rev, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 186, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 186, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 187, $dlv_slip_d_seq);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 187, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 187, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 187, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 187, $dlv_slip_d_seq, value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 187, $dlv_slip_d_seq, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 188, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 188, $ship_act_no, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 189, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 189, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 190, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 190, $ship_lg_grp_nm, value);
	}


	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public String ship_wg_cd() {
		return getConstString(offset + 191, $ship_wg_cd);
	}

	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public void ship_wg_cd(String value) {
		setConstString(offset + 191, $ship_wg_cd, value);
	}


	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public String ship_wg_nm() {
		return getConstString(offset + 192, $ship_wg_nm);
	}

	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public void ship_wg_nm(String value) {
		setConstString(offset + 192, $ship_wg_nm, value);
	}


	/**
	 * Without shipping plan 出荷計画外.<p>
	 *
	 */
	public boolean ship_uplnd_flg() {
		return getConstBoolean(offset + 193, $ship_uplnd_flg);
	}

	/**
	 * Without shipping plan 出荷計画外.<p>
	 *
	 */
	public void ship_uplnd_flg(boolean value) {
		setConstBoolean(offset + 193, $ship_uplnd_flg, value);
	}


	/**
	 * Export 輸出.<p>
	 *
	 */
	public boolean ship_ex_flg() {
		return getConstBoolean(offset + 194, $ship_ex_flg);
	}

	/**
	 * Export 輸出.<p>
	 *
	 */
	public void ship_ex_flg(boolean value) {
		setConstBoolean(offset + 194, $ship_ex_flg, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 195, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 195, $iv_no, value);
	}


	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 196, $iv_d_no);
	}

	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 196, $iv_d_no, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 197, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 197, $sls_ret_schd_no, value);
	}


	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 198, $sls_ret_schd_d_no);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 198, $sls_ret_schd_d_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 199, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 199, $sls_act_no, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 200, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 200, $sls_act_d_no, value);
	}


	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public String sls_act_io_no() {
		return getConstString(offset + 201, $sls_act_io_no);
	}

	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public void sls_act_io_no(String value) {
		setConstString(offset + 201, $sls_act_io_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 202, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 202, $cst_po_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 203, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 203, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 204, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 204, $cst_itm_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 205, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 205, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 206, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 206, $slo_d_no, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 207, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 207, $outsrc_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 208, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 208, $mfg_inst_no, value);
	}


	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 209, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 209, $pre_outsrc_act_flg, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 210, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 210, $mfg_act_no, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 211, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 211, $stk_lst_prnt_flg, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 212, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 212, $edi_flg, value);
	}


	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_no() {
		return getConstString(offset + 213, $edi_bp_dlv_slip_no);
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_no(String value) {
		setConstString(offset + 213, $edi_bp_dlv_slip_no, value);
	}


	/**
	 * EDI vendor delivery note row No. ＥＤＩ業者納品書行ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_d_no() {
		return getConstString(offset + 214, $edi_bp_dlv_slip_d_no);
	}

	/**
	 * EDI vendor delivery note row No. ＥＤＩ業者納品書行ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_d_no(String value) {
		setConstString(offset + 214, $edi_bp_dlv_slip_d_no, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 215, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 215, $wms_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 216, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 216, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 217, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 217, $ext_sys_nm, value);
	}


	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return getConstString(offset + 218, $ext_arr_act_no);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		setConstString(offset + 218, $ext_arr_act_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 219, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 219, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 220, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 220, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 221, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 221, $sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 222, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 222, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 223, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 223, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 224, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 224, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 225, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 225, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR po_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 226, $po_grp_p);
	}
	
	public void po_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 226, $po_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sret_fr_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 227, $sret_fr_grp_p);
	}
	
	public void sret_fr_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 227, $sret_fr_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 228, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 228, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR prsppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 229, $prsppl_grp_p);
	}
	
	public void prsppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 229, $prsppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 230, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 230, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 231, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 231, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 232, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 232, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 233, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 233, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 234, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 234, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 235, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 235, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 236, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 236, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 237, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 237, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 238, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 238, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 239, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 239, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 240, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 240, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 241, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 241, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 242, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 242, $upd_srv_req_no, value);
	}


	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 243, $arr_pr_upd_cntr);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 243, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 243, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 243, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 243, $arr_pr_upd_cntr, value);
	}

	/**
	 * Receipt progress update counter 入荷進捗更新カウンタ.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 243, $arr_pr_upd_cntr, value);
	}


	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public MCNumber arr_act_upd_cntr() {
		return getConstNumber(offset + 244, $arr_act_upd_cntr);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 244, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(int value) {
		setConstNumber(offset + 244, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(long value) {
		setConstNumber(offset + 244, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(float value) {
		setConstNumber(offset + 244, $arr_act_upd_cntr, value);
	}

	/**
	 * Receipt result update counter 入荷実績更新カウンタ.<p>
	 *
	 */
	public void arr_act_upd_cntr(double value) {
		setConstNumber(offset + 244, $arr_act_upd_cntr, value);
	}


	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 245, $rcpt_iv_upd_cntr);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 245, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 245, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 245, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 245, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Receiving I/V update counter 受領Ｉ／Ｖ更新カウンタ.<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 245, $rcpt_iv_upd_cntr, value);
	}


	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty_bef() {
		return getConstNumber(offset + 246, $base_unit_qty_bef);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(MCNumber value) {
		setConstNumber(offset + 246, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(int value) {
		setConstNumber(offset + 246, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(long value) {
		setConstNumber(offset + 246, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(float value) {
		setConstNumber(offset + 246, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(double value) {
		setConstNumber(offset + 246, $base_unit_qty_bef, value);
	}


	public String getString(String name) {
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			return org_ver_no();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			return ret_loc_nm();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			return ret_gd_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			return ext_arr_act_no();
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			return init_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
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
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($rcpt_iv_temp_ent_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_temp_ent_flg();
		}
		if ($rcpt_iv_multi_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_multi_flg();
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			return ship_uplnd_flg();
		}
		if ($ship_ex_flg.equalsIgnoreCase(name)) {
			return ship_ex_flg();
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			return org_ver_no();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($ret_loc_cd.equalsIgnoreCase(name)) {
			return ret_loc_cd();
		}
		if ($ret_loc_nm.equalsIgnoreCase(name)) {
			return ret_loc_nm();
		}
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			return ret_gd_cd();
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			return ret_gd_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			return ext_arr_act_no();
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			return init_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
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
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($rcpt_iv_temp_ent_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_temp_ent_flg();
		}
		if ($rcpt_iv_multi_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_multi_flg();
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			return ship_uplnd_flg();
		}
		if ($ship_ex_flg.equalsIgnoreCase(name)) {
			return ship_ex_flg();
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			org_ver_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
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
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
			return;
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			ret_gd_nm(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			ext_arr_act_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			init_abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
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
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
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
		if ($rcpt_iv_temp_ent_flg.equalsIgnoreCase(name)) {
			rcpt_iv_temp_ent_flg(value);
			return;
		}
		if ($rcpt_iv_multi_flg.equalsIgnoreCase(name)) {
			rcpt_iv_multi_flg(value);
			return;
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			ship_uplnd_flg(value);
			return;
		}
		if ($ship_ex_flg.equalsIgnoreCase(name)) {
			ship_ex_flg(value);
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
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
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			org_ver_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
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
		if ($ret_gd_cd.equalsIgnoreCase(name)) {
			ret_gd_cd(value);
			return;
		}
		if ($ret_gd_nm.equalsIgnoreCase(name)) {
			ret_gd_nm(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
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
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
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
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
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
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			ext_arr_act_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
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
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			init_abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
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
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
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
		if ($rcpt_iv_temp_ent_flg.equalsIgnoreCase(name)) {
			rcpt_iv_temp_ent_flg(value);
			return;
		}
		if ($rcpt_iv_multi_flg.equalsIgnoreCase(name)) {
			rcpt_iv_multi_flg(value);
			return;
		}
		if ($ship_uplnd_flg.equalsIgnoreCase(name)) {
			ship_uplnd_flg(value);
			return;
		}
		if ($ship_ex_flg.equalsIgnoreCase(name)) {
			ship_ex_flg(value);
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
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
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			return schd_qty_p();
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			return act_qty_p();
		}
		if ($schd_unit_qty_p.equalsIgnoreCase(name)) {
			return schd_unit_qty_p();
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			return purc_qty_p();
		}
		if ($sls_ret_qty_p.equalsIgnoreCase(name)) {
			return sls_ret_qty_p();
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
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($arr_str_ln_p.equalsIgnoreCase(name)) {
			return arr_str_ln_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return dlv_rqst_tm_p();
		}
		if ($arr_schd_tm_p.equalsIgnoreCase(name)) {
			return arr_schd_tm_p();
		}
		if ($arr_tm_p.equalsIgnoreCase(name)) {
			return arr_tm_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			return stk_bp_p();
		}
		if ($stk_arrv_bp_p.equalsIgnoreCase(name)) {
			return stk_arrv_bp_p();
		}
		if ($ret_stk_arrv_bp_p.equalsIgnoreCase(name)) {
			return ret_stk_arrv_bp_p();
		}
		if ($ret_str_ln_p.equalsIgnoreCase(name)) {
			return ret_str_ln_p();
		}
		if ($rqst_dpt_p.equalsIgnoreCase(name)) {
			return rqst_dpt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			return bditm_p();
		}
		if ($po_grp_p.equalsIgnoreCase(name)) {
			return po_grp_p();
		}
		if ($sret_fr_grp_p.equalsIgnoreCase(name)) {
			return sret_fr_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			return prsppl_grp_p();
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
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			schd_qty_p(
				((MCContainerMeta) schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			act_qty_p(
				((MCContainerMeta) act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_unit_qty_p.equalsIgnoreCase(name)) {
			schd_unit_qty_p(
				((MCContainerMeta) schd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			purc_qty_p(
				((MCContainerMeta) purc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_ret_qty_p.equalsIgnoreCase(name)) {
			sls_ret_qty_p(
				((MCContainerMeta) sls_ret_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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
		if ($arr_str_ln_p.equalsIgnoreCase(name)) {
			arr_str_ln_p(
				((MCContainerMeta) arr_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			dlv_rqst_tm_p(
				((MCContainerMeta) dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($arr_schd_tm_p.equalsIgnoreCase(name)) {
			arr_schd_tm_p(
				((MCContainerMeta) arr_schd_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($arr_tm_p.equalsIgnoreCase(name)) {
			arr_tm_p(
				((MCContainerMeta) arr_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5240.CanAcDtR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			stk_bp_p(
				((MCContainerMeta) stk_bp_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5050.StkBpR.class, value)
			);
			return;
		}
		if ($stk_arrv_bp_p.equalsIgnoreCase(name)) {
			stk_arrv_bp_p(
				((MCContainerMeta) stk_arrv_bp_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5060.StkArrvBpR.class, value)
			);
			return;
		}
		if ($ret_stk_arrv_bp_p.equalsIgnoreCase(name)) {
			ret_stk_arrv_bp_p(
				((MCContainerMeta) ret_stk_arrv_bp_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5060.StkArrvBpR.class, value)
			);
			return;
		}
		if ($ret_str_ln_p.equalsIgnoreCase(name)) {
			ret_str_ln_p(
				((MCContainerMeta) ret_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($rqst_dpt_p.equalsIgnoreCase(name)) {
			rqst_dpt_p(
				((MCContainerMeta) rqst_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			bditm_p(
				((MCContainerMeta) bditm_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		if ($po_grp_p.equalsIgnoreCase(name)) {
			po_grp_p(
				((MCContainerMeta) po_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($sret_fr_grp_p.equalsIgnoreCase(name)) {
			sret_fr_grp_p(
				((MCContainerMeta) sret_fr_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			prsppl_grp_p(
				((MCContainerMeta) prsppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCNumber arr_schd_qty() {
		return schd_qty_p().qty();
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(MCNumber value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(int value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(long value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(float value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(double value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return act_qty_p().qty();
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		act_qty_p().qty(value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		act_qty_p().qty(value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public MCNumber arr_schd_unit_qty() {
		return schd_unit_qty_p().qty();
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(MCNumber value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(int value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(long value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(float value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Schedule unit converted receipt qty. 予定単位換算入荷数量.<p>
	 *
	 */
	public void arr_schd_unit_qty(double value) {
		schd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return purc_qty_p().qty();
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return sls_ret_qty_p().qty();
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		sls_ret_qty_p().qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		sls_ret_qty_p().qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		sls_ret_qty_p().qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		sls_ret_qty_p().qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		sls_ret_qty_p().qty(value);
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

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return arr_str_ln_p().str_ln_cd();
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		arr_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public String arr_str_ln_nm() {
		return arr_str_ln_p().str_ln_nm();
	}

	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public void arr_str_ln_nm(String value) {
		arr_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without receipt rack/line 入荷棚・ライン無.<p>
	 *
	 */
	public boolean arr_str_ln_cd_none_flg() {
		return arr_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without receipt rack/line 入荷棚・ライン無.<p>
	 *
	 */
	public void arr_str_ln_cd_none_flg(boolean value) {
		arr_str_ln_p().str_ln_cd_none_flg(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_tm_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_tm_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_tm_p().hm(value);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return arr_schd_tm_p().ymd();
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		arr_schd_tm_p().ymd(value);
	}

	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public MCDate arr_schd_hm() {
		return arr_schd_tm_p().hm();
	}

	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public void arr_schd_hm(MCDate value) {
		arr_schd_tm_p().hm(value);
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return arr_tm_p().ymd();
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		arr_tm_p().ymd(value);
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public MCDate arr_hm() {
		return arr_tm_p().hm();
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public void arr_hm(MCDate value) {
		arr_tm_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
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

	public String stk_arrv_bp_cd() {
		return stk_arrv_bp_p().stk_arrv_bp_cd();
	}

	public void stk_arrv_bp_cd(String value) {
		stk_arrv_bp_p().stk_arrv_bp_cd(value);
	}

	public String stk_arrv_bp_nm() {
		return stk_arrv_bp_p().stk_arrv_bp_nm();
	}

	public void stk_arrv_bp_nm(String value) {
		stk_arrv_bp_p().stk_arrv_bp_nm(value);
	}

	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public String ret_stk_arrv_bp_cd() {
		return ret_stk_arrv_bp_p().stk_arrv_bp_cd();
	}

	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public void ret_stk_arrv_bp_cd(String value) {
		ret_stk_arrv_bp_p().stk_arrv_bp_cd(value);
	}

	/**
	 * Return-from inventory arriving point name 返品元在庫着荷先名.<p>
	 *
	 */
	public String ret_stk_arrv_bp_nm() {
		return ret_stk_arrv_bp_p().stk_arrv_bp_nm();
	}

	/**
	 * Return-from inventory arriving point name 返品元在庫着荷先名.<p>
	 *
	 */
	public void ret_stk_arrv_bp_nm(String value) {
		ret_stk_arrv_bp_p().stk_arrv_bp_nm(value);
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return ret_str_ln_p().str_ln_cd();
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		ret_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Return-from source rack/line name 返品元棚・ライン名.<p>
	 *
	 */
	public String ret_str_ln_nm() {
		return ret_str_ln_p().str_ln_nm();
	}

	/**
	 * Return-from source rack/line name 返品元棚・ライン名.<p>
	 *
	 */
	public void ret_str_ln_nm(String value) {
		ret_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without return-from rack/line 返品元棚・ライン無.<p>
	 *
	 */
	public boolean ret_str_ln_cd_none_flg() {
		return ret_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without return-from rack/line 返品元棚・ライン無.<p>
	 *
	 */
	public void ret_str_ln_cd_none_flg(boolean value) {
		ret_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return rqst_dpt_p().usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		rqst_dpt_p().usr_cd(value);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return rqst_dpt_p().usr_nm();
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		rqst_dpt_p().usr_nm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return rqst_dpt_p().dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		rqst_dpt_p().dpt_cd(value);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return rqst_dpt_p().dpt_nm();
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		rqst_dpt_p().dpt_nm(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
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

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String po_grp_cd1() {
		return po_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void po_grp_cd1(String value) {
		po_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String po_grp_nm1() {
		return po_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void po_grp_nm1(String value) {
		po_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String po_grp_cd2() {
		return po_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void po_grp_cd2(String value) {
		po_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String po_grp_nm2() {
		return po_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void po_grp_nm2(String value) {
		po_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String po_grp_cd3() {
		return po_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void po_grp_cd3(String value) {
		po_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String po_grp_nm3() {
		return po_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void po_grp_nm3(String value) {
		po_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String po_grp_cd4() {
		return po_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void po_grp_cd4(String value) {
		po_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String po_grp_nm4() {
		return po_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void po_grp_nm4(String value) {
		po_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String po_grp_cd5() {
		return po_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void po_grp_cd5(String value) {
		po_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String po_grp_nm5() {
		return po_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void po_grp_nm5(String value) {
		po_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String po_grp_cd6() {
		return po_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void po_grp_cd6(String value) {
		po_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String po_grp_nm6() {
		return po_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void po_grp_nm6(String value) {
		po_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String po_grp_cd7() {
		return po_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void po_grp_cd7(String value) {
		po_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String po_grp_nm7() {
		return po_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void po_grp_nm7(String value) {
		po_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String po_grp_cd8() {
		return po_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void po_grp_cd8(String value) {
		po_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String po_grp_nm8() {
		return po_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void po_grp_nm8(String value) {
		po_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String po_grp_cd9() {
		return po_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void po_grp_cd9(String value) {
		po_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String po_grp_nm9() {
		return po_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void po_grp_nm9(String value) {
		po_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String po_grp_cd10() {
		return po_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void po_grp_cd10(String value) {
		po_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String po_grp_nm10() {
		return po_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void po_grp_nm10(String value) {
		po_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public String sret_fr_grp_cd1() {
		return sret_fr_grp_p().bp_grp_cd1();
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public void sret_fr_grp_cd1(String value) {
		sret_fr_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public String sret_fr_grp_nm1() {
		return sret_fr_grp_p().bp_grp_nm1();
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public void sret_fr_grp_nm1(String value) {
		sret_fr_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public String sret_fr_grp_cd2() {
		return sret_fr_grp_p().bp_grp_cd2();
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public void sret_fr_grp_cd2(String value) {
		sret_fr_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public String sret_fr_grp_nm2() {
		return sret_fr_grp_p().bp_grp_nm2();
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public void sret_fr_grp_nm2(String value) {
		sret_fr_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public String sret_fr_grp_cd3() {
		return sret_fr_grp_p().bp_grp_cd3();
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public void sret_fr_grp_cd3(String value) {
		sret_fr_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public String sret_fr_grp_nm3() {
		return sret_fr_grp_p().bp_grp_nm3();
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public void sret_fr_grp_nm3(String value) {
		sret_fr_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public String sret_fr_grp_cd4() {
		return sret_fr_grp_p().bp_grp_cd4();
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public void sret_fr_grp_cd4(String value) {
		sret_fr_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public String sret_fr_grp_nm4() {
		return sret_fr_grp_p().bp_grp_nm4();
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public void sret_fr_grp_nm4(String value) {
		sret_fr_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public String sret_fr_grp_cd5() {
		return sret_fr_grp_p().bp_grp_cd5();
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public void sret_fr_grp_cd5(String value) {
		sret_fr_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public String sret_fr_grp_nm5() {
		return sret_fr_grp_p().bp_grp_nm5();
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public void sret_fr_grp_nm5(String value) {
		sret_fr_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public String sret_fr_grp_cd6() {
		return sret_fr_grp_p().bp_grp_cd6();
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public void sret_fr_grp_cd6(String value) {
		sret_fr_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public String sret_fr_grp_nm6() {
		return sret_fr_grp_p().bp_grp_nm6();
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public void sret_fr_grp_nm6(String value) {
		sret_fr_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public String sret_fr_grp_cd7() {
		return sret_fr_grp_p().bp_grp_cd7();
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public void sret_fr_grp_cd7(String value) {
		sret_fr_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public String sret_fr_grp_nm7() {
		return sret_fr_grp_p().bp_grp_nm7();
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public void sret_fr_grp_nm7(String value) {
		sret_fr_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public String sret_fr_grp_cd8() {
		return sret_fr_grp_p().bp_grp_cd8();
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public void sret_fr_grp_cd8(String value) {
		sret_fr_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public String sret_fr_grp_nm8() {
		return sret_fr_grp_p().bp_grp_nm8();
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public void sret_fr_grp_nm8(String value) {
		sret_fr_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public String sret_fr_grp_cd9() {
		return sret_fr_grp_p().bp_grp_cd9();
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public void sret_fr_grp_cd9(String value) {
		sret_fr_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public String sret_fr_grp_nm9() {
		return sret_fr_grp_p().bp_grp_nm9();
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public void sret_fr_grp_nm9(String value) {
		sret_fr_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public String sret_fr_grp_cd10() {
		return sret_fr_grp_p().bp_grp_cd10();
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public void sret_fr_grp_cd10(String value) {
		sret_fr_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public String sret_fr_grp_nm10() {
		return sret_fr_grp_p().bp_grp_nm10();
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public void sret_fr_grp_nm10(String value) {
		sret_fr_grp_p().bp_grp_nm10(value);
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

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return prsppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		prsppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return prsppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		prsppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return prsppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		prsppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return prsppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		prsppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return prsppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		prsppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return prsppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		prsppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return prsppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		prsppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return prsppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		prsppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return prsppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		prsppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return prsppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		prsppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return prsppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		prsppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return prsppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		prsppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return prsppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		prsppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return prsppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		prsppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return prsppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		prsppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return prsppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		prsppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return prsppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		prsppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return prsppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		prsppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return prsppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		prsppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return prsppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		prsppl_grp_p().bp_grp_nm10(value);
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

	public String msg() {
		return rts_msg_p().msg();
	}

	public void msg(String value) {
		rts_msg_p().msg(value);
	}

}

