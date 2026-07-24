package mcframe.serverMSBE.MSBEL0010;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	public static final String $alloc = "alloc";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
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
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
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
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
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
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public static final String $gr_schd_qty = "gr_schd_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $alloc_qty = "alloc_qty";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $wait_qty = "wait_qty";
	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public static final String $alloc_avl_qty = "alloc_avl_qty";
	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public static final String $alloc_unit_cd = "alloc_unit_cd";
	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public static final String $alloc_unit_nm = "alloc_unit_nm";
	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public static final String $alloc_unit_dec_place = "alloc_unit_dec_place";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_unit_cost = "std_unit_cost";
	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public static final String $stk_amt = "stk_amt";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public static final String $stk_amt_dec_place = "stk_amt_dec_place";
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public static final String $stk_amt_rnd_typ = "stk_amt_rnd_typ";
	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_qty = "act_cont_qty";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
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
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public static final String $lot_quality_typ = "lot_quality_typ";
	/**
	 * Conforming type name (Lot) 良品区分名（ロット）.<p>
	 *
	 */
	public static final String $lot_quality_typ_nm = "lot_quality_typ_nm";
	/**
	 * Inventory inspection type (Lot) 在庫検査区分（ロット）.<p>
	 *
	 */
	public static final String $lot_stk_insp_typ = "lot_stk_insp_typ";
	/**
	 * Inventory inspection type name (Lot) 在庫検査区分名（ロット）.<p>
	 *
	 */
	public static final String $lot_stk_insp_typ_nm = "lot_stk_insp_typ_nm";
	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Spare 1 (Inventory) 予備１（在庫）.<p>
	 *
	 */
	public static final String $stk_sub_char1 = "stk_sub_char1";
	/**
	 * Spare 2 (Inventory) 予備２（在庫）.<p>
	 *
	 */
	public static final String $stk_sub_char2 = "stk_sub_char2";
	/**
	 * Spare 3 (Inventory) 予備３（在庫）.<p>
	 *
	 */
	public static final String $stk_sub_char3 = "stk_sub_char3";
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Spare 1 (Lot) 予備１（ロット）.<p>
	 *
	 */
	public static final String $lot_sub_char1 = "lot_sub_char1";
	/**
	 * Spare 2 (Lot) 予備２（ロット）.<p>
	 *
	 */
	public static final String $lot_sub_char2 = "lot_sub_char2";
	/**
	 * Spare 3 (Lot) 予備３（ロット）.<p>
	 *
	 */
	public static final String $lot_sub_char3 = "lot_sub_char3";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $itm_cd = $alloc + ".itm_cd";
	public static final String $itm_sub1 = $alloc + ".itm_sub1";
	public static final String $itm_sub2 = $alloc + ".itm_sub2";
	public static final String $itm_sub3 = $alloc + ".itm_sub3";
	public static final String $ver_no = $alloc + ".ver_no";
	public static final String $lot_no = $alloc + ".lot_no";
	public static final String $sublot_no = $alloc + ".sublot_no";
	public static final String $alloc_grp_cd = $alloc + ".alloc_grp_cd";
	public static final String $gd_cd = $alloc + ".gd_cd";
	public static final String $quality_typ = $alloc + ".quality_typ";
	public static final String $stk_insp_typ = $alloc + ".stk_insp_typ";
	public static final String $sno1 = $alloc + ".sno1";
	public static final String $sno2 = $alloc + ".sno2";
	public static final String $sno3 = $alloc + ".sno3";
	public static final String $sno4 = $alloc + ".sno4";
	public static final String $in_xfr_typ = $alloc + ".in_xfr_typ";
	public static final String $asst_typ = $alloc + ".asst_typ";
	public static final String $stk_id_typ = $alloc + ".stk_id_typ";
	public static final String $stk_bp_cd = $alloc + ".stk_bp_cd";
	public static final String $stk_arrv_bp_cd = $alloc + ".stk_arrv_bp_cd";
	public static final String $pack_unit_qty = $alloc + ".pack_unit_qty";
	public static final String $pack_unit_cd = $alloc + ".pack_unit_cd";
	public static final String $pack_unit_dec_place = $alloc + ".pack_unit_dec_place";
	public static final String $base_unit_cd = $alloc + ".base_unit_cd";
	public static final String $base_unit_dec_place = $alloc + ".base_unit_dec_place";
	public static final String $act_cont_fctr = $alloc + ".act_cont_fctr";
	public static final String $cont_fctr_flg = $alloc + ".cont_fctr_flg";
	public static final String $std_cont_fctr = $alloc + ".std_cont_fctr";
	public static final String $cont_fctr_rnd_typ = $alloc + ".cont_fctr_rnd_typ";
	public static final String $cont_fctr_dec_place = $alloc + ".cont_fctr_dec_place";
	public static final String $bp_lot_no = $alloc + ".bp_lot_no";
	public static final String $plnt_aprv_sts_typ = $alloc + ".plnt_aprv_sts_typ";
	public static final String $first_gr_dt = $alloc + ".first_gr_dt";
	public static final String $unreg_lmt_flg = $alloc + ".unreg_lmt_flg";
	public static final String $vld_dt = $alloc + ".vld_dt";
	public static final String $lmt_dt = $alloc + ".lmt_dt";
	public static final String $mrkt_judg_sts_typ = $alloc + ".mrkt_judg_sts_typ";
	public static final String $abnormal_alloc_flg = $alloc + ".abnormal_alloc_flg";
	public static final String $peg_no = $alloc + ".peg_no";
	public static final String $schd_stk_typ = $alloc + ".schd_stk_typ";
	public static final String $schd_stk_prio = $alloc + ".schd_stk_prio";
	public static final String $io_schd_typ = $alloc + ".io_schd_typ";
	public static final String $io_schd_sts_typ = $alloc + ".io_schd_sts_typ";
	public static final String $io_schd_no = $alloc + ".io_schd_no";
	public static final String $io_schd_seq = $alloc + ".io_schd_seq";
	public static final String $schd_dt = $alloc + ".schd_dt";
	public static final String $io_schd_pr_no = $alloc + ".io_schd_pr_no";
	public static final String $inpt_schd_dt = $alloc + ".inpt_schd_dt";
	public static final String $gi_schd_dt = $alloc + ".gi_schd_dt";
	public static final String $gr_schd_dt = $alloc + ".gr_schd_dt";
	public static final String $pack_alloc_flg = $alloc + ".pack_alloc_flg";
	public static final String $alloc_margin_days = $alloc + ".alloc_margin_days";
	public static final String $ship_term_cd = $alloc + ".ship_term_cd";
	public static final String $inpt_loc_cd = $alloc + ".inpt_loc_cd";
	public static final String $inpt_str_ln_cd = $alloc + ".inpt_str_ln_cd";
	public static final String $dlv_lg_grp_cd = $alloc + ".dlv_lg_grp_cd";
	public static final String $gi_lg_grp_cd = $alloc + ".gi_lg_grp_cd";
	public static final String $gi_loc_cd = $alloc + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $alloc + ".gi_str_ln_cd";
	public static final String $gr_wg_cd = $alloc + ".gr_wg_cd";
	public static final String $gr_loc_cd = $alloc + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $alloc + ".gr_str_ln_cd";
	public static final String $gr_sppl_cd = $alloc + ".gr_sppl_cd";
	public static final String $stk_alloc_grp_cd = $alloc + ".stk_alloc_grp_cd";
	public static final String $stk_lg_grp_cd = $alloc + ".stk_lg_grp_cd";
	public static final String $stk_loc_cd = $alloc + ".stk_loc_cd";
	public static final String $stk_str_ln_cd = $alloc + ".stk_str_ln_cd";
	public static final String $stk_sppl_cd = $alloc + ".stk_sppl_cd";
	public static final String $stk_ln_flg = $alloc + ".stk_ln_flg";
	public static final String $stk_alloc_lmt_flg = $alloc + ".stk_alloc_lmt_flg";
	public static final String $xfr_lt = $alloc + ".xfr_lt";
	public static final String $alloc_days = $alloc + ".alloc_days";
	public static final String $prio = $alloc + ".prio";
	public static final String $rqst_sno1 = $alloc + ".rqst_sno1";
	public static final String $sno1_null_flg = $alloc + ".sno1_null_flg";
	public static final String $rqst_sno2 = $alloc + ".rqst_sno2";
	public static final String $sno2_null_flg = $alloc + ".sno2_null_flg";
	public static final String $rqst_sno3 = $alloc + ".rqst_sno3";
	public static final String $sno3_null_flg = $alloc + ".sno3_null_flg";
	public static final String $rqst_sno4 = $alloc + ".rqst_sno4";
	public static final String $sno4_null_flg = $alloc + ".sno4_null_flg";
	public static final String $lot_seq = $alloc + ".lot_seq";
	public static final String $pack_unit_src_qty = $alloc + ".pack_unit_src_qty";
	public static final String $pack_unit_lot_qty = $alloc + ".pack_unit_lot_qty";
	public static final String $pack_unit_not_lot_qty = $alloc + ".pack_unit_not_lot_qty";
	public static final String $pack_unit_lg_lot_qty = $alloc + ".pack_unit_lg_lot_qty";
	public static final String $pack_unit_lg_not_lot_qty = $alloc + ".pack_unit_lg_not_lot_qty";
	public static final String $pack_unit_lot_alloc_qty = $alloc + ".pack_unit_lot_alloc_qty";
	public static final String $pack_unit_not_lot_alloc_qty = $alloc + ".pack_unit_not_lot_alloc_qty";
	public static final String $pack_unit_lg_lot_alloc_qty = $alloc + ".pack_unit_lg_lot_alloc_qty";
	public static final String $pack_unit_lg_not_lot_alloc_qty = $alloc + ".pack_unit_lg_not_lot_alloc_qty";
	public static final String $pack_unit_grs_alloc_qty = $alloc + ".pack_unit_grs_alloc_qty";
	public static final String $pack_unit_alloc_qty = $alloc + ".pack_unit_alloc_qty";
	public static final String $pack_unit_lot_wait_qty = $alloc + ".pack_unit_lot_wait_qty";
	public static final String $pack_unit_not_lot_wait_qty = $alloc + ".pack_unit_not_lot_wait_qty";
	public static final String $pack_unit_lg_lot_wait_qty = $alloc + ".pack_unit_lg_lot_wait_qty";
	public static final String $pack_unit_lg_not_lot_wait_qty = $alloc + ".pack_unit_lg_not_lot_wait_qty";
	public static final String $pack_unit_grs_wait_qty = $alloc + ".pack_unit_grs_wait_qty";
	public static final String $pack_unit_wait_qty = $alloc + ".pack_unit_wait_qty";
	public static final String $pack_unit_rnd_typ = $alloc + ".pack_unit_rnd_typ";
	public static final String $conv_base_qty = $alloc + ".conv_base_qty";
	public static final String $conv_qty = $alloc + ".conv_qty";
	public static final String $base_unit_src_qty = $alloc + ".base_unit_src_qty";
	public static final String $base_unit_lot_qty = $alloc + ".base_unit_lot_qty";
	public static final String $base_unit_not_lot_qty = $alloc + ".base_unit_not_lot_qty";
	public static final String $base_unit_lg_lot_qty = $alloc + ".base_unit_lg_lot_qty";
	public static final String $base_unit_lg_not_lot_qty = $alloc + ".base_unit_lg_not_lot_qty";
	public static final String $base_unit_qty = $alloc + ".base_unit_qty";
	public static final String $base_unit_lot_alloc_qty = $alloc + ".base_unit_lot_alloc_qty";
	public static final String $base_unit_not_lot_alloc_qty = $alloc + ".base_unit_not_lot_alloc_qty";
	public static final String $base_unit_lg_lot_alloc_qty = $alloc + ".base_unit_lg_lot_alloc_qty";
	public static final String $base_unit_lg_not_lot_alloc_qty = $alloc + ".base_unit_lg_not_lot_alloc_qty";
	public static final String $base_unit_grs_alloc_qty = $alloc + ".base_unit_grs_alloc_qty";
	public static final String $base_unit_alloc_qty = $alloc + ".base_unit_alloc_qty";
	public static final String $base_unit_lot_wait_qty = $alloc + ".base_unit_lot_wait_qty";
	public static final String $base_unit_not_lot_wait_qty = $alloc + ".base_unit_not_lot_wait_qty";
	public static final String $base_unit_lg_lot_wait_qty = $alloc + ".base_unit_lg_lot_wait_qty";
	public static final String $base_unit_lg_not_lot_wait_qty = $alloc + ".base_unit_lg_not_lot_wait_qty";
	public static final String $base_unit_grs_wait_qty = $alloc + ".base_unit_grs_wait_qty";
	public static final String $base_unit_wait_qty = $alloc + ".base_unit_wait_qty";
	public static final String $base_unit_rnd_typ = $alloc + ".base_unit_rnd_typ";
	public static final String $cont_qty = $alloc + ".cont_qty";
	public static final String $not_lot_fix_flg = $alloc + ".not_lot_fix_flg";
	public static final String $not_lot_mix_flg = $alloc + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $alloc + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $alloc + ".vld_dt_fr";
	public static final String $vld_dt_fr_grp = $alloc + ".vld_dt_fr_grp";
	public static final String $vld_dt_to = $alloc + ".vld_dt_to";
	public static final String $stop_dt = $alloc + ".stop_dt";
	public static final String $rel_dt = $alloc + ".rel_dt";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta alloc_META = createInnerRowMeta($alloc, mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta gr_schd_qty_META = createCommonMeta($gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_qty_META = createCommonMeta($alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wait_qty_META = createCommonMeta($wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_avl_qty_META = createCommonMeta($alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_unit_cd_META = createCommonMeta($alloc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta alloc_unit_nm_META = createCommonMeta($alloc_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alloc_unit_dec_place_META = createCommonMeta($alloc_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_unit_cost_META = createCommonMeta($std_unit_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_amt_META = createCommonMeta($stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta stk_amt_dec_place_META = createCommonMeta($stk_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_amt_rnd_typ_META = createCommonMeta($stk_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta act_cont_qty_META = createCommonMeta($act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta lot_quality_typ_META = createCommonMeta($lot_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta lot_quality_typ_nm_META = createCommonMeta($lot_quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta lot_stk_insp_typ_META = createCommonMeta($lot_stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta lot_stk_insp_typ_nm_META = createCommonMeta($lot_stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta stk_sub_char1_META = createCommonMeta($stk_sub_char1, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR1);
	public static final MCMeta stk_sub_char2_META = createCommonMeta($stk_sub_char2, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR2);
	public static final MCMeta stk_sub_char3_META = createCommonMeta($stk_sub_char3, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR3);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta lot_sub_char1_META = createCommonMeta($lot_sub_char1, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR1);
	public static final MCMeta lot_sub_char2_META = createCommonMeta($lot_sub_char2, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR2);
	public static final MCMeta lot_sub_char3_META = createCommonMeta($lot_sub_char3, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			alloc_META,
			itm_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			gd_nm_META,
			quality_typ_nm_META,
			stk_insp_typ_nm_META,
			wrk_no_META,
			wrk_nm_META,
			in_xfr_typ_nm_META,
			asst_typ_nm_META,
			stk_id_typ_nm_META,
			stk_bp_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_arrv_bp_nm_META,
			pack_unit_nm_META,
			stk_qty_META,
			base_unit_nm_META,
			gr_schd_qty_META,
			alloc_qty_META,
			wait_qty_META,
			alloc_avl_qty_META,
			alloc_unit_cd_META,
			alloc_unit_nm_META,
			alloc_unit_dec_place_META,
			std_unit_cost_META,
			stk_amt_META,
			base_cur_cd_META,
			base_cur_nm_META,
			stk_amt_dec_place_META,
			stk_amt_rnd_typ_META,
			act_cont_qty_META,
			std_cont_qty_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			in_prmt_insp_flg_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			lot_quality_typ_META,
			lot_quality_typ_nm_META,
			lot_stk_insp_typ_META,
			lot_stk_insp_typ_nm_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_nm_META,
			stk_sub_char1_META,
			stk_sub_char2_META,
			stk_sub_char3_META,
			lot_rmrks_META,
			lot_sub_char1_META,
			lot_sub_char2_META,
			lot_sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
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
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"lot_no",
				"sublot_no",
				"alloc_grp_cd",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"in_xfr_typ",
				"asst_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"stk_arrv_bp_cd",
				"pack_unit_qty",
				"pack_unit_cd",
				"pack_unit_dec_place",
				"base_unit_cd",
				"base_unit_dec_place",
				"act_cont_fctr",
				"cont_fctr_flg",
				"std_cont_fctr",
				"cont_fctr_rnd_typ",
				"cont_fctr_dec_place",
				"bp_lot_no",
				"plnt_aprv_sts_typ",
				"first_gr_dt",
				"unreg_lmt_flg",
				"vld_dt",
				"lmt_dt",
				"mrkt_judg_sts_typ",
				"abnormal_alloc_flg",
				"peg_no",
				"schd_stk_typ",
				"schd_stk_prio",
				"io_schd_typ",
				"io_schd_sts_typ",
				"io_schd_no",
				"io_schd_seq",
				"schd_dt",
				"io_schd_pr_no",
				"inpt_schd_dt",
				"gi_schd_dt",
				"gr_schd_dt",
				"pack_alloc_flg",
				"alloc_margin_days",
				"ship_term_cd",
				"inpt_loc_cd",
				"inpt_str_ln_cd",
				"dlv_lg_grp_cd",
				"gi_lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gr_wg_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"gr_sppl_cd",
				"stk_alloc_grp_cd",
				"stk_lg_grp_cd",
				"stk_loc_cd",
				"stk_str_ln_cd",
				"stk_sppl_cd",
				"stk_ln_flg",
				"stk_alloc_lmt_flg",
				"xfr_lt",
				"alloc_days",
				"prio",
				"rqst_sno1",
				"sno1_null_flg",
				"rqst_sno2",
				"sno2_null_flg",
				"rqst_sno3",
				"sno3_null_flg",
				"rqst_sno4",
				"sno4_null_flg",
				"lot_seq",
				"pack_unit_src_qty",
				"pack_unit_lot_qty",
				"pack_unit_not_lot_qty",
				"pack_unit_lg_lot_qty",
				"pack_unit_lg_not_lot_qty",
				"pack_unit_lot_alloc_qty",
				"pack_unit_not_lot_alloc_qty",
				"pack_unit_lg_lot_alloc_qty",
				"pack_unit_lg_not_lot_alloc_qty",
				"pack_unit_grs_alloc_qty",
				"pack_unit_alloc_qty",
				"pack_unit_lot_wait_qty",
				"pack_unit_not_lot_wait_qty",
				"pack_unit_lg_lot_wait_qty",
				"pack_unit_lg_not_lot_wait_qty",
				"pack_unit_grs_wait_qty",
				"pack_unit_wait_qty",
				"pack_unit_rnd_typ",
				"conv_base_qty",
				"conv_qty",
				"base_unit_src_qty",
				"base_unit_lot_qty",
				"base_unit_not_lot_qty",
				"base_unit_lg_lot_qty",
				"base_unit_lg_not_lot_qty",
				"base_unit_qty",
				"base_unit_lot_alloc_qty",
				"base_unit_not_lot_alloc_qty",
				"base_unit_lg_lot_alloc_qty",
				"base_unit_lg_not_lot_alloc_qty",
				"base_unit_grs_alloc_qty",
				"base_unit_alloc_qty",
				"base_unit_lot_wait_qty",
				"base_unit_not_lot_wait_qty",
				"base_unit_lg_lot_wait_qty",
				"base_unit_lg_not_lot_wait_qty",
				"base_unit_grs_wait_qty",
				"base_unit_wait_qty",
				"base_unit_rnd_typ",
				"cont_qty",
				"not_lot_fix_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_fr_grp",
				"vld_dt_to",
				"stop_dt",
				"rel_dt"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$lot_no,
				$sublot_no,
				$alloc_grp_cd,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$in_xfr_typ,
				$asst_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$stk_arrv_bp_cd,
				$pack_unit_qty,
				$pack_unit_cd,
				$pack_unit_dec_place,
				$base_unit_cd,
				$base_unit_dec_place,
				$act_cont_fctr,
				$cont_fctr_flg,
				$std_cont_fctr,
				$cont_fctr_rnd_typ,
				$cont_fctr_dec_place,
				$bp_lot_no,
				$plnt_aprv_sts_typ,
				$first_gr_dt,
				$unreg_lmt_flg,
				$vld_dt,
				$lmt_dt,
				$mrkt_judg_sts_typ,
				$abnormal_alloc_flg,
				$peg_no,
				$schd_stk_typ,
				$schd_stk_prio,
				$io_schd_typ,
				$io_schd_sts_typ,
				$io_schd_no,
				$io_schd_seq,
				$schd_dt,
				$io_schd_pr_no,
				$inpt_schd_dt,
				$gi_schd_dt,
				$gr_schd_dt,
				$pack_alloc_flg,
				$alloc_margin_days,
				$ship_term_cd,
				$inpt_loc_cd,
				$inpt_str_ln_cd,
				$dlv_lg_grp_cd,
				$gi_lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gr_wg_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$gr_sppl_cd,
				$stk_alloc_grp_cd,
				$stk_lg_grp_cd,
				$stk_loc_cd,
				$stk_str_ln_cd,
				$stk_sppl_cd,
				$stk_ln_flg,
				$stk_alloc_lmt_flg,
				$xfr_lt,
				$alloc_days,
				$prio,
				$rqst_sno1,
				$sno1_null_flg,
				$rqst_sno2,
				$sno2_null_flg,
				$rqst_sno3,
				$sno3_null_flg,
				$rqst_sno4,
				$sno4_null_flg,
				$lot_seq,
				$pack_unit_src_qty,
				$pack_unit_lot_qty,
				$pack_unit_not_lot_qty,
				$pack_unit_lg_lot_qty,
				$pack_unit_lg_not_lot_qty,
				$pack_unit_lot_alloc_qty,
				$pack_unit_not_lot_alloc_qty,
				$pack_unit_lg_lot_alloc_qty,
				$pack_unit_lg_not_lot_alloc_qty,
				$pack_unit_grs_alloc_qty,
				$pack_unit_alloc_qty,
				$pack_unit_lot_wait_qty,
				$pack_unit_not_lot_wait_qty,
				$pack_unit_lg_lot_wait_qty,
				$pack_unit_lg_not_lot_wait_qty,
				$pack_unit_grs_wait_qty,
				$pack_unit_wait_qty,
				$pack_unit_rnd_typ,
				$conv_base_qty,
				$conv_qty,
				$base_unit_src_qty,
				$base_unit_lot_qty,
				$base_unit_not_lot_qty,
				$base_unit_lg_lot_qty,
				$base_unit_lg_not_lot_qty,
				$base_unit_qty,
				$base_unit_lot_alloc_qty,
				$base_unit_not_lot_alloc_qty,
				$base_unit_lg_lot_alloc_qty,
				$base_unit_lg_not_lot_alloc_qty,
				$base_unit_grs_alloc_qty,
				$base_unit_alloc_qty,
				$base_unit_lot_wait_qty,
				$base_unit_not_lot_wait_qty,
				$base_unit_lg_lot_wait_qty,
				$base_unit_lg_not_lot_wait_qty,
				$base_unit_grs_wait_qty,
				$base_unit_wait_qty,
				$base_unit_rnd_typ,
				$cont_qty,
				$not_lot_fix_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_fr_grp,
				$vld_dt_to,
				$stop_dt,
				$rel_dt
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
				{$alloc + ".quality_typ", "MAC_QUALITY_TYP"},	// alloc.quality_typ
				{$alloc + ".stk_insp_typ", "MSC_STK_INSP_TYP"},	// alloc.stk_insp_typ
				{$alloc + ".in_xfr_typ", "MSC_IN_XFR_TYP"},	// alloc.in_xfr_typ
				{$alloc + ".asst_typ", "MAC_ASST_TYP"},	// alloc.asst_typ
				{$alloc + ".stk_id_typ", "MSC_STK_ID_TYP"},	// alloc.stk_id_typ
				{$fix_no_typ, "MSC_FIX_NO_TYP"},	// fix_no_typ
				{$mfg_aprv_sts_typ, "MSC_MFG_APRV_STS_TYP"},	// mfg_aprv_sts_typ
				{$lot_quality_typ, "MAC_QUALITY_TYP"},	// lot_quality_typ
				{$lot_stk_insp_typ, "MSC_STK_INSP_TYP"},	// lot_stk_insp_typ
				{$alloc + ".plnt_aprv_sts_typ", "MSC_PLNT_APRV_STS_TYP"},	// alloc.plnt_aprv_sts_typ
				{$alloc + ".mrkt_judg_sts_typ", "MSC_MRKT_JUDG_STS_TYP"},	// alloc.mrkt_judg_sts_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 2, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 2, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 3, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 3, $dpt_nm, value);
	}


	public mcframe.serverMSBE.MSBEL5040.Avl_ListR alloc(){
		return (mcframe.serverMSBE.MSBEL5040.Avl_ListR) getConstInnerRow(offset + 4, $alloc);
	}
	
	public void alloc(mcframe.serverMSBE.MSBEL5040.Avl_ListR row){
		setConstInnerRow(offset + 4, $alloc, row);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 6, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 6, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 7, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 7, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 8, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 8, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 9, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 9, $str_ln_nm, value);
	}


	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 10, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 10, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 12, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 12, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 13, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 13, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 14, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 14, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 15, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 15, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 16, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 16, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 17, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 17, $loc_grp_nm, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 18, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 18, $gd_nm, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 19, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 19, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 20, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 20, $stk_insp_typ_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 21, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 21, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 22, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 22, $wrk_nm, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 23, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 23, $in_xfr_typ_nm, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 24, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 24, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 25, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 25, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 26, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 26, $stk_bp_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 27, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 27, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 28, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 28, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 29, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 29, $fix_no, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 30, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 30, $stk_arrv_bp_nm, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 31, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 31, $pack_unit_nm, value);
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 32, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 32, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 32, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 32, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 32, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 32, $stk_qty, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 33, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 33, $base_unit_nm, value);
	}


	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return getConstNumber(offset + 34, $gr_schd_qty);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 34, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		setConstNumber(offset + 34, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		setConstNumber(offset + 34, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		setConstNumber(offset + 34, $gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		setConstNumber(offset + 34, $gr_schd_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return getConstNumber(offset + 35, $alloc_qty);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		setConstNumber(offset + 35, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		setConstNumber(offset + 35, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		setConstNumber(offset + 35, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		setConstNumber(offset + 35, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		setConstNumber(offset + 35, $alloc_qty, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber wait_qty() {
		return getConstNumber(offset + 36, $wait_qty);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(MCNumber value) {
		setConstNumber(offset + 36, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(int value) {
		setConstNumber(offset + 36, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(long value) {
		setConstNumber(offset + 36, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(float value) {
		setConstNumber(offset + 36, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(double value) {
		setConstNumber(offset + 36, $wait_qty, value);
	}


	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber alloc_avl_qty() {
		return getConstNumber(offset + 37, $alloc_avl_qty);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 37, $alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(int value) {
		setConstNumber(offset + 37, $alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(long value) {
		setConstNumber(offset + 37, $alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(float value) {
		setConstNumber(offset + 37, $alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void alloc_avl_qty(double value) {
		setConstNumber(offset + 37, $alloc_avl_qty, value);
	}


	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public String alloc_unit_cd() {
		return getConstString(offset + 38, $alloc_unit_cd);
	}

	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public void alloc_unit_cd(String value) {
		setConstString(offset + 38, $alloc_unit_cd, value);
	}


	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public String alloc_unit_nm() {
		return getConstString(offset + 39, $alloc_unit_nm);
	}

	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public void alloc_unit_nm(String value) {
		setConstString(offset + 39, $alloc_unit_nm, value);
	}


	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber alloc_unit_dec_place() {
		return getConstNumber(offset + 40, $alloc_unit_dec_place);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 40, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(int value) {
		setConstNumber(offset + 40, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(long value) {
		setConstNumber(offset + 40, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(float value) {
		setConstNumber(offset + 40, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(double value) {
		setConstNumber(offset + 40, $alloc_unit_dec_place, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return getConstNumber(offset + 41, $std_unit_cost);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		setConstNumber(offset + 41, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		setConstNumber(offset + 41, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		setConstNumber(offset + 41, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		setConstNumber(offset + 41, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		setConstNumber(offset + 41, $std_unit_cost, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 42, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 42, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 42, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 42, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 42, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 42, $stk_amt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 43, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 43, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 44, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 44, $base_cur_nm, value);
	}


	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return getConstNumber(offset + 45, $stk_amt_dec_place);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		setConstNumber(offset + 45, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		setConstNumber(offset + 45, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		setConstNumber(offset + 45, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		setConstNumber(offset + 45, $stk_amt_dec_place, value);
	}


	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return getConstString(offset + 46, $stk_amt_rnd_typ);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		setConstString(offset + 46, $stk_amt_rnd_typ, value);
	}


	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return getConstNumber(offset + 47, $act_cont_qty);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		setConstNumber(offset + 47, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		setConstNumber(offset + 47, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		setConstNumber(offset + 47, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		setConstNumber(offset + 47, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		setConstNumber(offset + 47, $act_cont_qty, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 48, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 48, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 48, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 48, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 48, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 48, $std_cont_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 49, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 49, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 50, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 50, $cont_fctr_unit_nm, value);
	}


	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 51, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 51, $in_prmt_insp_flg, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 52, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 52, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 53, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 53, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public String lot_quality_typ() {
		return getConstString(offset + 54, $lot_quality_typ);
	}

	/**
	 * Conforming type (Lot) 良品区分（ロット）.<p>
	 *
	 */
	public void lot_quality_typ(String value) {
		setConstString(offset + 54, $lot_quality_typ, value);
	}


	/**
	 * Conforming type name (Lot) 良品区分名（ロット）.<p>
	 *
	 */
	public String lot_quality_typ_nm() {
		return getConstString(offset + 55, $lot_quality_typ_nm);
	}

	/**
	 * Conforming type name (Lot) 良品区分名（ロット）.<p>
	 *
	 */
	public void lot_quality_typ_nm(String value) {
		setConstString(offset + 55, $lot_quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type (Lot) 在庫検査区分（ロット）.<p>
	 *
	 */
	public String lot_stk_insp_typ() {
		return getConstString(offset + 56, $lot_stk_insp_typ);
	}

	/**
	 * Inventory inspection type (Lot) 在庫検査区分（ロット）.<p>
	 *
	 */
	public void lot_stk_insp_typ(String value) {
		setConstString(offset + 56, $lot_stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name (Lot) 在庫検査区分名（ロット）.<p>
	 *
	 */
	public String lot_stk_insp_typ_nm() {
		return getConstString(offset + 57, $lot_stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name (Lot) 在庫検査区分名（ロット）.<p>
	 *
	 */
	public void lot_stk_insp_typ_nm(String value) {
		setConstString(offset + 57, $lot_stk_insp_typ_nm, value);
	}


	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 58, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 58, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 59, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 59, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Spare 1 (Inventory) 予備１（在庫）.<p>
	 *
	 */
	public String stk_sub_char1() {
		return getConstString(offset + 60, $stk_sub_char1);
	}

	/**
	 * Spare 1 (Inventory) 予備１（在庫）.<p>
	 *
	 */
	public void stk_sub_char1(String value) {
		setConstString(offset + 60, $stk_sub_char1, value);
	}


	/**
	 * Spare 2 (Inventory) 予備２（在庫）.<p>
	 *
	 */
	public String stk_sub_char2() {
		return getConstString(offset + 61, $stk_sub_char2);
	}

	/**
	 * Spare 2 (Inventory) 予備２（在庫）.<p>
	 *
	 */
	public void stk_sub_char2(String value) {
		setConstString(offset + 61, $stk_sub_char2, value);
	}


	/**
	 * Spare 3 (Inventory) 予備３（在庫）.<p>
	 *
	 */
	public String stk_sub_char3() {
		return getConstString(offset + 62, $stk_sub_char3);
	}

	/**
	 * Spare 3 (Inventory) 予備３（在庫）.<p>
	 *
	 */
	public void stk_sub_char3(String value) {
		setConstString(offset + 62, $stk_sub_char3, value);
	}


	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 63, $lot_rmrks);
	}

	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 63, $lot_rmrks, value);
	}


	/**
	 * Spare 1 (Lot) 予備１（ロット）.<p>
	 *
	 */
	public String lot_sub_char1() {
		return getConstString(offset + 64, $lot_sub_char1);
	}

	/**
	 * Spare 1 (Lot) 予備１（ロット）.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		setConstString(offset + 64, $lot_sub_char1, value);
	}


	/**
	 * Spare 2 (Lot) 予備２（ロット）.<p>
	 *
	 */
	public String lot_sub_char2() {
		return getConstString(offset + 65, $lot_sub_char2);
	}

	/**
	 * Spare 2 (Lot) 予備２（ロット）.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		setConstString(offset + 65, $lot_sub_char2, value);
	}


	/**
	 * Spare 3 (Lot) 予備３（ロット）.<p>
	 *
	 */
	public String lot_sub_char3() {
		return getConstString(offset + 66, $lot_sub_char3);
	}

	/**
	 * Spare 3 (Lot) 予備３（ロット）.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		setConstString(offset + 66, $lot_sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 67, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 67, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 68, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 68, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 69, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 69, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 70, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 70, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 71, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 71, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 72, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 72, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 73, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 73, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 74, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 74, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 75, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 75, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 76, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 76, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 77, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 77, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 78, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 78, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 79, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 79, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 80, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 80, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 81, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 81, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 82, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 82, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 83, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 83, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 84, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 84, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 85, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 85, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 86, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 86, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 87, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 87, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 88, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 88, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 89, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 89, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 90, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 90, $itm_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 91, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 91, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 92, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 92, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 93, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 93, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 94, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 94, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 95, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 95, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 96, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 96, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 97, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 97, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 98, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 98, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 99, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 99, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 100, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 100, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 101, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 101, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($lot_quality_typ_nm.equalsIgnoreCase(name)) {
			return lot_quality_typ_nm();
		}
		if ($lot_stk_insp_typ.equalsIgnoreCase(name)) {
			return lot_stk_insp_typ();
		}
		if ($lot_stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return lot_stk_insp_typ_nm();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			return alloc_avl_qty();
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		return super.getNumber(name);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($lot_quality_typ_nm.equalsIgnoreCase(name)) {
			return lot_quality_typ_nm();
		}
		if ($lot_stk_insp_typ.equalsIgnoreCase(name)) {
			return lot_stk_insp_typ();
		}
		if ($lot_stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return lot_stk_insp_typ_nm();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			return gr_schd_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			return alloc_avl_qty();
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		return super.getNumberNE(name);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($lot_quality_typ_nm.equalsIgnoreCase(name)) {
			lot_quality_typ_nm(value);
			return;
		}
		if ($lot_stk_insp_typ.equalsIgnoreCase(name)) {
			lot_stk_insp_typ(value);
			return;
		}
		if ($lot_stk_insp_typ_nm.equalsIgnoreCase(name)) {
			lot_stk_insp_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($lot_quality_typ_nm.equalsIgnoreCase(name)) {
			lot_quality_typ_nm(value);
			return;
		}
		if ($lot_stk_insp_typ.equalsIgnoreCase(name)) {
			lot_stk_insp_typ(value);
			return;
		}
		if ($lot_stk_insp_typ_nm.equalsIgnoreCase(name)) {
			lot_stk_insp_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($gr_schd_qty.equalsIgnoreCase(name)) {
			gr_schd_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($alloc_avl_qty.equalsIgnoreCase(name)) {
			alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($alloc.equalsIgnoreCase(name)) {
			return alloc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($alloc.equalsIgnoreCase(name)) {
			alloc(
				((MCContainerMeta) alloc_META).castInnerRow(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return alloc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		alloc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return alloc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		alloc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return alloc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		alloc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return alloc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		alloc().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return alloc().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		alloc().ver_no(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return alloc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		alloc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return alloc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		alloc().sublot_no(value);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return alloc().alloc_grp_cd();
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		alloc().alloc_grp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return alloc().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		alloc().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return alloc().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		alloc().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return alloc().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		alloc().stk_insp_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return alloc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		alloc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return alloc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		alloc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return alloc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		alloc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return alloc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		alloc().sno4(value);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return alloc().in_xfr_typ();
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		alloc().in_xfr_typ(value);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return alloc().asst_typ();
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		alloc().asst_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return alloc().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		alloc().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return alloc().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		alloc().stk_bp_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return alloc().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		alloc().stk_arrv_bp_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return alloc().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return alloc().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		alloc().pack_unit_cd(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return alloc().pack_unit_dec_place();
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return alloc().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		alloc().base_unit_cd(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return alloc().base_unit_dec_place();
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return alloc().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return alloc().cont_fctr_flg();
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		alloc().cont_fctr_flg(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return alloc().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return alloc().cont_fctr_rnd_typ();
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		alloc().cont_fctr_rnd_typ(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return alloc().cont_fctr_dec_place();
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return alloc().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		alloc().bp_lot_no(value);
	}

	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return alloc().plnt_aprv_sts_typ();
	}

	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		alloc().plnt_aprv_sts_typ(value);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return alloc().first_gr_dt();
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		alloc().first_gr_dt(value);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return alloc().unreg_lmt_flg();
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		alloc().unreg_lmt_flg(value);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return alloc().vld_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		alloc().vld_dt(value);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return alloc().lmt_dt();
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		alloc().lmt_dt(value);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return alloc().mrkt_judg_sts_typ();
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		alloc().mrkt_judg_sts_typ(value);
	}

	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public boolean abnormal_alloc_flg() {
		return alloc().abnormal_alloc_flg();
	}

	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public void abnormal_alloc_flg(boolean value) {
		alloc().abnormal_alloc_flg(value);
	}

	public MCNumber peg_no() {
		return alloc().peg_no();
	}

	public void peg_no(MCNumber value) {
		alloc().peg_no(value);
	}

	public void peg_no(int value) {
		alloc().peg_no(value);
	}

	public void peg_no(long value) {
		alloc().peg_no(value);
	}

	public void peg_no(float value) {
		alloc().peg_no(value);
	}

	public void peg_no(double value) {
		alloc().peg_no(value);
	}

	public String schd_stk_typ() {
		return alloc().schd_stk_typ();
	}

	public void schd_stk_typ(String value) {
		alloc().schd_stk_typ(value);
	}

	public MCNumber schd_stk_prio() {
		return alloc().schd_stk_prio();
	}

	public void schd_stk_prio(MCNumber value) {
		alloc().schd_stk_prio(value);
	}

	public void schd_stk_prio(int value) {
		alloc().schd_stk_prio(value);
	}

	public void schd_stk_prio(long value) {
		alloc().schd_stk_prio(value);
	}

	public void schd_stk_prio(float value) {
		alloc().schd_stk_prio(value);
	}

	public void schd_stk_prio(double value) {
		alloc().schd_stk_prio(value);
	}

	public String io_schd_typ() {
		return alloc().io_schd_typ();
	}

	public void io_schd_typ(String value) {
		alloc().io_schd_typ(value);
	}

	public String io_schd_sts_typ() {
		return alloc().io_schd_sts_typ();
	}

	public void io_schd_sts_typ(String value) {
		alloc().io_schd_sts_typ(value);
	}

	public String io_schd_no() {
		return alloc().io_schd_no();
	}

	public void io_schd_no(String value) {
		alloc().io_schd_no(value);
	}

	public MCNumber io_schd_seq() {
		return alloc().io_schd_seq();
	}

	public void io_schd_seq(MCNumber value) {
		alloc().io_schd_seq(value);
	}

	public void io_schd_seq(int value) {
		alloc().io_schd_seq(value);
	}

	public void io_schd_seq(long value) {
		alloc().io_schd_seq(value);
	}

	public void io_schd_seq(float value) {
		alloc().io_schd_seq(value);
	}

	public void io_schd_seq(double value) {
		alloc().io_schd_seq(value);
	}

	public MCDate schd_dt() {
		return alloc().schd_dt();
	}

	public void schd_dt(MCDate value) {
		alloc().schd_dt(value);
	}

	public String io_schd_pr_no() {
		return alloc().io_schd_pr_no();
	}

	public void io_schd_pr_no(String value) {
		alloc().io_schd_pr_no(value);
	}

	public MCDate inpt_schd_dt() {
		return alloc().inpt_schd_dt();
	}

	public void inpt_schd_dt(MCDate value) {
		alloc().inpt_schd_dt(value);
	}

	public MCDate gi_schd_dt() {
		return alloc().gi_schd_dt();
	}

	public void gi_schd_dt(MCDate value) {
		alloc().gi_schd_dt(value);
	}

	public MCDate gr_schd_dt() {
		return alloc().gr_schd_dt();
	}

	public void gr_schd_dt(MCDate value) {
		alloc().gr_schd_dt(value);
	}

	public boolean pack_alloc_flg() {
		return alloc().pack_alloc_flg();
	}

	public void pack_alloc_flg(boolean value) {
		alloc().pack_alloc_flg(value);
	}

	public MCNumber alloc_margin_days() {
		return alloc().alloc_margin_days();
	}

	public void alloc_margin_days(MCNumber value) {
		alloc().alloc_margin_days(value);
	}

	public void alloc_margin_days(int value) {
		alloc().alloc_margin_days(value);
	}

	public void alloc_margin_days(long value) {
		alloc().alloc_margin_days(value);
	}

	public void alloc_margin_days(float value) {
		alloc().alloc_margin_days(value);
	}

	public void alloc_margin_days(double value) {
		alloc().alloc_margin_days(value);
	}

	public String ship_term_cd() {
		return alloc().ship_term_cd();
	}

	public void ship_term_cd(String value) {
		alloc().ship_term_cd(value);
	}

	public String inpt_loc_cd() {
		return alloc().inpt_loc_cd();
	}

	public void inpt_loc_cd(String value) {
		alloc().inpt_loc_cd(value);
	}

	public String inpt_str_ln_cd() {
		return alloc().inpt_str_ln_cd();
	}

	public void inpt_str_ln_cd(String value) {
		alloc().inpt_str_ln_cd(value);
	}

	public String dlv_lg_grp_cd() {
		return alloc().dlv_lg_grp_cd();
	}

	public void dlv_lg_grp_cd(String value) {
		alloc().dlv_lg_grp_cd(value);
	}

	public String gi_lg_grp_cd() {
		return alloc().gi_lg_grp_cd();
	}

	public void gi_lg_grp_cd(String value) {
		alloc().gi_lg_grp_cd(value);
	}

	public String gi_loc_cd() {
		return alloc().gi_loc_cd();
	}

	public void gi_loc_cd(String value) {
		alloc().gi_loc_cd(value);
	}

	public String gi_str_ln_cd() {
		return alloc().gi_str_ln_cd();
	}

	public void gi_str_ln_cd(String value) {
		alloc().gi_str_ln_cd(value);
	}

	public String gr_wg_cd() {
		return alloc().gr_wg_cd();
	}

	public void gr_wg_cd(String value) {
		alloc().gr_wg_cd(value);
	}

	public String gr_loc_cd() {
		return alloc().gr_loc_cd();
	}

	public void gr_loc_cd(String value) {
		alloc().gr_loc_cd(value);
	}

	public String gr_str_ln_cd() {
		return alloc().gr_str_ln_cd();
	}

	public void gr_str_ln_cd(String value) {
		alloc().gr_str_ln_cd(value);
	}

	public String gr_sppl_cd() {
		return alloc().gr_sppl_cd();
	}

	public void gr_sppl_cd(String value) {
		alloc().gr_sppl_cd(value);
	}

	public String stk_alloc_grp_cd() {
		return alloc().stk_alloc_grp_cd();
	}

	public void stk_alloc_grp_cd(String value) {
		alloc().stk_alloc_grp_cd(value);
	}

	public String stk_lg_grp_cd() {
		return alloc().stk_lg_grp_cd();
	}

	public void stk_lg_grp_cd(String value) {
		alloc().stk_lg_grp_cd(value);
	}

	public String stk_loc_cd() {
		return alloc().stk_loc_cd();
	}

	public void stk_loc_cd(String value) {
		alloc().stk_loc_cd(value);
	}

	public String stk_str_ln_cd() {
		return alloc().stk_str_ln_cd();
	}

	public void stk_str_ln_cd(String value) {
		alloc().stk_str_ln_cd(value);
	}

	public String stk_sppl_cd() {
		return alloc().stk_sppl_cd();
	}

	public void stk_sppl_cd(String value) {
		alloc().stk_sppl_cd(value);
	}

	public boolean stk_ln_flg() {
		return alloc().stk_ln_flg();
	}

	public void stk_ln_flg(boolean value) {
		alloc().stk_ln_flg(value);
	}

	public boolean stk_alloc_lmt_flg() {
		return alloc().stk_alloc_lmt_flg();
	}

	public void stk_alloc_lmt_flg(boolean value) {
		alloc().stk_alloc_lmt_flg(value);
	}

	public MCNumber xfr_lt() {
		return alloc().xfr_lt();
	}

	public void xfr_lt(MCNumber value) {
		alloc().xfr_lt(value);
	}

	public void xfr_lt(int value) {
		alloc().xfr_lt(value);
	}

	public void xfr_lt(long value) {
		alloc().xfr_lt(value);
	}

	public void xfr_lt(float value) {
		alloc().xfr_lt(value);
	}

	public void xfr_lt(double value) {
		alloc().xfr_lt(value);
	}

	public MCNumber alloc_days() {
		return alloc().alloc_days();
	}

	public void alloc_days(MCNumber value) {
		alloc().alloc_days(value);
	}

	public void alloc_days(int value) {
		alloc().alloc_days(value);
	}

	public void alloc_days(long value) {
		alloc().alloc_days(value);
	}

	public void alloc_days(float value) {
		alloc().alloc_days(value);
	}

	public void alloc_days(double value) {
		alloc().alloc_days(value);
	}

	public MCNumber prio() {
		return alloc().prio();
	}

	public void prio(MCNumber value) {
		alloc().prio(value);
	}

	public void prio(int value) {
		alloc().prio(value);
	}

	public void prio(long value) {
		alloc().prio(value);
	}

	public void prio(float value) {
		alloc().prio(value);
	}

	public void prio(double value) {
		alloc().prio(value);
	}

	public String rqst_sno1() {
		return alloc().rqst_sno1();
	}

	public void rqst_sno1(String value) {
		alloc().rqst_sno1(value);
	}

	public boolean sno1_null_flg() {
		return alloc().sno1_null_flg();
	}

	public void sno1_null_flg(boolean value) {
		alloc().sno1_null_flg(value);
	}

	public String rqst_sno2() {
		return alloc().rqst_sno2();
	}

	public void rqst_sno2(String value) {
		alloc().rqst_sno2(value);
	}

	public boolean sno2_null_flg() {
		return alloc().sno2_null_flg();
	}

	public void sno2_null_flg(boolean value) {
		alloc().sno2_null_flg(value);
	}

	public String rqst_sno3() {
		return alloc().rqst_sno3();
	}

	public void rqst_sno3(String value) {
		alloc().rqst_sno3(value);
	}

	public boolean sno3_null_flg() {
		return alloc().sno3_null_flg();
	}

	public void sno3_null_flg(boolean value) {
		alloc().sno3_null_flg(value);
	}

	public String rqst_sno4() {
		return alloc().rqst_sno4();
	}

	public void rqst_sno4(String value) {
		alloc().rqst_sno4(value);
	}

	public boolean sno4_null_flg() {
		return alloc().sno4_null_flg();
	}

	public void sno4_null_flg(boolean value) {
		alloc().sno4_null_flg(value);
	}

	public String lot_seq() {
		return alloc().lot_seq();
	}

	public void lot_seq(String value) {
		alloc().lot_seq(value);
	}

	public MCNumber pack_unit_src_qty() {
		return alloc().pack_unit_src_qty();
	}

	public void pack_unit_src_qty(MCNumber value) {
		alloc().pack_unit_src_qty(value);
	}

	public void pack_unit_src_qty(int value) {
		alloc().pack_unit_src_qty(value);
	}

	public void pack_unit_src_qty(long value) {
		alloc().pack_unit_src_qty(value);
	}

	public void pack_unit_src_qty(float value) {
		alloc().pack_unit_src_qty(value);
	}

	public void pack_unit_src_qty(double value) {
		alloc().pack_unit_src_qty(value);
	}

	public MCNumber pack_unit_lot_qty() {
		return alloc().pack_unit_lot_qty();
	}

	public void pack_unit_lot_qty(MCNumber value) {
		alloc().pack_unit_lot_qty(value);
	}

	public void pack_unit_lot_qty(int value) {
		alloc().pack_unit_lot_qty(value);
	}

	public void pack_unit_lot_qty(long value) {
		alloc().pack_unit_lot_qty(value);
	}

	public void pack_unit_lot_qty(float value) {
		alloc().pack_unit_lot_qty(value);
	}

	public void pack_unit_lot_qty(double value) {
		alloc().pack_unit_lot_qty(value);
	}

	public MCNumber pack_unit_not_lot_qty() {
		return alloc().pack_unit_not_lot_qty();
	}

	public void pack_unit_not_lot_qty(MCNumber value) {
		alloc().pack_unit_not_lot_qty(value);
	}

	public void pack_unit_not_lot_qty(int value) {
		alloc().pack_unit_not_lot_qty(value);
	}

	public void pack_unit_not_lot_qty(long value) {
		alloc().pack_unit_not_lot_qty(value);
	}

	public void pack_unit_not_lot_qty(float value) {
		alloc().pack_unit_not_lot_qty(value);
	}

	public void pack_unit_not_lot_qty(double value) {
		alloc().pack_unit_not_lot_qty(value);
	}

	public MCNumber pack_unit_lg_lot_qty() {
		return alloc().pack_unit_lg_lot_qty();
	}

	public void pack_unit_lg_lot_qty(MCNumber value) {
		alloc().pack_unit_lg_lot_qty(value);
	}

	public void pack_unit_lg_lot_qty(int value) {
		alloc().pack_unit_lg_lot_qty(value);
	}

	public void pack_unit_lg_lot_qty(long value) {
		alloc().pack_unit_lg_lot_qty(value);
	}

	public void pack_unit_lg_lot_qty(float value) {
		alloc().pack_unit_lg_lot_qty(value);
	}

	public void pack_unit_lg_lot_qty(double value) {
		alloc().pack_unit_lg_lot_qty(value);
	}

	public MCNumber pack_unit_lg_not_lot_qty() {
		return alloc().pack_unit_lg_not_lot_qty();
	}

	public void pack_unit_lg_not_lot_qty(MCNumber value) {
		alloc().pack_unit_lg_not_lot_qty(value);
	}

	public void pack_unit_lg_not_lot_qty(int value) {
		alloc().pack_unit_lg_not_lot_qty(value);
	}

	public void pack_unit_lg_not_lot_qty(long value) {
		alloc().pack_unit_lg_not_lot_qty(value);
	}

	public void pack_unit_lg_not_lot_qty(float value) {
		alloc().pack_unit_lg_not_lot_qty(value);
	}

	public void pack_unit_lg_not_lot_qty(double value) {
		alloc().pack_unit_lg_not_lot_qty(value);
	}

	public MCNumber pack_unit_lot_alloc_qty() {
		return alloc().pack_unit_lot_alloc_qty();
	}

	public void pack_unit_lot_alloc_qty(MCNumber value) {
		alloc().pack_unit_lot_alloc_qty(value);
	}

	public void pack_unit_lot_alloc_qty(int value) {
		alloc().pack_unit_lot_alloc_qty(value);
	}

	public void pack_unit_lot_alloc_qty(long value) {
		alloc().pack_unit_lot_alloc_qty(value);
	}

	public void pack_unit_lot_alloc_qty(float value) {
		alloc().pack_unit_lot_alloc_qty(value);
	}

	public void pack_unit_lot_alloc_qty(double value) {
		alloc().pack_unit_lot_alloc_qty(value);
	}

	public MCNumber pack_unit_not_lot_alloc_qty() {
		return alloc().pack_unit_not_lot_alloc_qty();
	}

	public void pack_unit_not_lot_alloc_qty(MCNumber value) {
		alloc().pack_unit_not_lot_alloc_qty(value);
	}

	public void pack_unit_not_lot_alloc_qty(int value) {
		alloc().pack_unit_not_lot_alloc_qty(value);
	}

	public void pack_unit_not_lot_alloc_qty(long value) {
		alloc().pack_unit_not_lot_alloc_qty(value);
	}

	public void pack_unit_not_lot_alloc_qty(float value) {
		alloc().pack_unit_not_lot_alloc_qty(value);
	}

	public void pack_unit_not_lot_alloc_qty(double value) {
		alloc().pack_unit_not_lot_alloc_qty(value);
	}

	public MCNumber pack_unit_lg_lot_alloc_qty() {
		return alloc().pack_unit_lg_lot_alloc_qty();
	}

	public void pack_unit_lg_lot_alloc_qty(MCNumber value) {
		alloc().pack_unit_lg_lot_alloc_qty(value);
	}

	public void pack_unit_lg_lot_alloc_qty(int value) {
		alloc().pack_unit_lg_lot_alloc_qty(value);
	}

	public void pack_unit_lg_lot_alloc_qty(long value) {
		alloc().pack_unit_lg_lot_alloc_qty(value);
	}

	public void pack_unit_lg_lot_alloc_qty(float value) {
		alloc().pack_unit_lg_lot_alloc_qty(value);
	}

	public void pack_unit_lg_lot_alloc_qty(double value) {
		alloc().pack_unit_lg_lot_alloc_qty(value);
	}

	public MCNumber pack_unit_lg_not_lot_alloc_qty() {
		return alloc().pack_unit_lg_not_lot_alloc_qty();
	}

	public void pack_unit_lg_not_lot_alloc_qty(MCNumber value) {
		alloc().pack_unit_lg_not_lot_alloc_qty(value);
	}

	public void pack_unit_lg_not_lot_alloc_qty(int value) {
		alloc().pack_unit_lg_not_lot_alloc_qty(value);
	}

	public void pack_unit_lg_not_lot_alloc_qty(long value) {
		alloc().pack_unit_lg_not_lot_alloc_qty(value);
	}

	public void pack_unit_lg_not_lot_alloc_qty(float value) {
		alloc().pack_unit_lg_not_lot_alloc_qty(value);
	}

	public void pack_unit_lg_not_lot_alloc_qty(double value) {
		alloc().pack_unit_lg_not_lot_alloc_qty(value);
	}

	public MCNumber pack_unit_grs_alloc_qty() {
		return alloc().pack_unit_grs_alloc_qty();
	}

	public void pack_unit_grs_alloc_qty(MCNumber value) {
		alloc().pack_unit_grs_alloc_qty(value);
	}

	public void pack_unit_grs_alloc_qty(int value) {
		alloc().pack_unit_grs_alloc_qty(value);
	}

	public void pack_unit_grs_alloc_qty(long value) {
		alloc().pack_unit_grs_alloc_qty(value);
	}

	public void pack_unit_grs_alloc_qty(float value) {
		alloc().pack_unit_grs_alloc_qty(value);
	}

	public void pack_unit_grs_alloc_qty(double value) {
		alloc().pack_unit_grs_alloc_qty(value);
	}

	public MCNumber pack_unit_alloc_qty() {
		return alloc().pack_unit_alloc_qty();
	}

	public void pack_unit_alloc_qty(MCNumber value) {
		alloc().pack_unit_alloc_qty(value);
	}

	public void pack_unit_alloc_qty(int value) {
		alloc().pack_unit_alloc_qty(value);
	}

	public void pack_unit_alloc_qty(long value) {
		alloc().pack_unit_alloc_qty(value);
	}

	public void pack_unit_alloc_qty(float value) {
		alloc().pack_unit_alloc_qty(value);
	}

	public void pack_unit_alloc_qty(double value) {
		alloc().pack_unit_alloc_qty(value);
	}

	public MCNumber pack_unit_lot_wait_qty() {
		return alloc().pack_unit_lot_wait_qty();
	}

	public void pack_unit_lot_wait_qty(MCNumber value) {
		alloc().pack_unit_lot_wait_qty(value);
	}

	public void pack_unit_lot_wait_qty(int value) {
		alloc().pack_unit_lot_wait_qty(value);
	}

	public void pack_unit_lot_wait_qty(long value) {
		alloc().pack_unit_lot_wait_qty(value);
	}

	public void pack_unit_lot_wait_qty(float value) {
		alloc().pack_unit_lot_wait_qty(value);
	}

	public void pack_unit_lot_wait_qty(double value) {
		alloc().pack_unit_lot_wait_qty(value);
	}

	public MCNumber pack_unit_not_lot_wait_qty() {
		return alloc().pack_unit_not_lot_wait_qty();
	}

	public void pack_unit_not_lot_wait_qty(MCNumber value) {
		alloc().pack_unit_not_lot_wait_qty(value);
	}

	public void pack_unit_not_lot_wait_qty(int value) {
		alloc().pack_unit_not_lot_wait_qty(value);
	}

	public void pack_unit_not_lot_wait_qty(long value) {
		alloc().pack_unit_not_lot_wait_qty(value);
	}

	public void pack_unit_not_lot_wait_qty(float value) {
		alloc().pack_unit_not_lot_wait_qty(value);
	}

	public void pack_unit_not_lot_wait_qty(double value) {
		alloc().pack_unit_not_lot_wait_qty(value);
	}

	public MCNumber pack_unit_lg_lot_wait_qty() {
		return alloc().pack_unit_lg_lot_wait_qty();
	}

	public void pack_unit_lg_lot_wait_qty(MCNumber value) {
		alloc().pack_unit_lg_lot_wait_qty(value);
	}

	public void pack_unit_lg_lot_wait_qty(int value) {
		alloc().pack_unit_lg_lot_wait_qty(value);
	}

	public void pack_unit_lg_lot_wait_qty(long value) {
		alloc().pack_unit_lg_lot_wait_qty(value);
	}

	public void pack_unit_lg_lot_wait_qty(float value) {
		alloc().pack_unit_lg_lot_wait_qty(value);
	}

	public void pack_unit_lg_lot_wait_qty(double value) {
		alloc().pack_unit_lg_lot_wait_qty(value);
	}

	public MCNumber pack_unit_lg_not_lot_wait_qty() {
		return alloc().pack_unit_lg_not_lot_wait_qty();
	}

	public void pack_unit_lg_not_lot_wait_qty(MCNumber value) {
		alloc().pack_unit_lg_not_lot_wait_qty(value);
	}

	public void pack_unit_lg_not_lot_wait_qty(int value) {
		alloc().pack_unit_lg_not_lot_wait_qty(value);
	}

	public void pack_unit_lg_not_lot_wait_qty(long value) {
		alloc().pack_unit_lg_not_lot_wait_qty(value);
	}

	public void pack_unit_lg_not_lot_wait_qty(float value) {
		alloc().pack_unit_lg_not_lot_wait_qty(value);
	}

	public void pack_unit_lg_not_lot_wait_qty(double value) {
		alloc().pack_unit_lg_not_lot_wait_qty(value);
	}

	public MCNumber pack_unit_grs_wait_qty() {
		return alloc().pack_unit_grs_wait_qty();
	}

	public void pack_unit_grs_wait_qty(MCNumber value) {
		alloc().pack_unit_grs_wait_qty(value);
	}

	public void pack_unit_grs_wait_qty(int value) {
		alloc().pack_unit_grs_wait_qty(value);
	}

	public void pack_unit_grs_wait_qty(long value) {
		alloc().pack_unit_grs_wait_qty(value);
	}

	public void pack_unit_grs_wait_qty(float value) {
		alloc().pack_unit_grs_wait_qty(value);
	}

	public void pack_unit_grs_wait_qty(double value) {
		alloc().pack_unit_grs_wait_qty(value);
	}

	public MCNumber pack_unit_wait_qty() {
		return alloc().pack_unit_wait_qty();
	}

	public void pack_unit_wait_qty(MCNumber value) {
		alloc().pack_unit_wait_qty(value);
	}

	public void pack_unit_wait_qty(int value) {
		alloc().pack_unit_wait_qty(value);
	}

	public void pack_unit_wait_qty(long value) {
		alloc().pack_unit_wait_qty(value);
	}

	public void pack_unit_wait_qty(float value) {
		alloc().pack_unit_wait_qty(value);
	}

	public void pack_unit_wait_qty(double value) {
		alloc().pack_unit_wait_qty(value);
	}

	public String pack_unit_rnd_typ() {
		return alloc().pack_unit_rnd_typ();
	}

	public void pack_unit_rnd_typ(String value) {
		alloc().pack_unit_rnd_typ(value);
	}

	public MCNumber conv_base_qty() {
		return alloc().conv_base_qty();
	}

	public void conv_base_qty(MCNumber value) {
		alloc().conv_base_qty(value);
	}

	public void conv_base_qty(int value) {
		alloc().conv_base_qty(value);
	}

	public void conv_base_qty(long value) {
		alloc().conv_base_qty(value);
	}

	public void conv_base_qty(float value) {
		alloc().conv_base_qty(value);
	}

	public void conv_base_qty(double value) {
		alloc().conv_base_qty(value);
	}

	public MCNumber conv_qty() {
		return alloc().conv_qty();
	}

	public void conv_qty(MCNumber value) {
		alloc().conv_qty(value);
	}

	public void conv_qty(int value) {
		alloc().conv_qty(value);
	}

	public void conv_qty(long value) {
		alloc().conv_qty(value);
	}

	public void conv_qty(float value) {
		alloc().conv_qty(value);
	}

	public void conv_qty(double value) {
		alloc().conv_qty(value);
	}

	public MCNumber base_unit_src_qty() {
		return alloc().base_unit_src_qty();
	}

	public void base_unit_src_qty(MCNumber value) {
		alloc().base_unit_src_qty(value);
	}

	public void base_unit_src_qty(int value) {
		alloc().base_unit_src_qty(value);
	}

	public void base_unit_src_qty(long value) {
		alloc().base_unit_src_qty(value);
	}

	public void base_unit_src_qty(float value) {
		alloc().base_unit_src_qty(value);
	}

	public void base_unit_src_qty(double value) {
		alloc().base_unit_src_qty(value);
	}

	public MCNumber base_unit_lot_qty() {
		return alloc().base_unit_lot_qty();
	}

	public void base_unit_lot_qty(MCNumber value) {
		alloc().base_unit_lot_qty(value);
	}

	public void base_unit_lot_qty(int value) {
		alloc().base_unit_lot_qty(value);
	}

	public void base_unit_lot_qty(long value) {
		alloc().base_unit_lot_qty(value);
	}

	public void base_unit_lot_qty(float value) {
		alloc().base_unit_lot_qty(value);
	}

	public void base_unit_lot_qty(double value) {
		alloc().base_unit_lot_qty(value);
	}

	public MCNumber base_unit_not_lot_qty() {
		return alloc().base_unit_not_lot_qty();
	}

	public void base_unit_not_lot_qty(MCNumber value) {
		alloc().base_unit_not_lot_qty(value);
	}

	public void base_unit_not_lot_qty(int value) {
		alloc().base_unit_not_lot_qty(value);
	}

	public void base_unit_not_lot_qty(long value) {
		alloc().base_unit_not_lot_qty(value);
	}

	public void base_unit_not_lot_qty(float value) {
		alloc().base_unit_not_lot_qty(value);
	}

	public void base_unit_not_lot_qty(double value) {
		alloc().base_unit_not_lot_qty(value);
	}

	public MCNumber base_unit_lg_lot_qty() {
		return alloc().base_unit_lg_lot_qty();
	}

	public void base_unit_lg_lot_qty(MCNumber value) {
		alloc().base_unit_lg_lot_qty(value);
	}

	public void base_unit_lg_lot_qty(int value) {
		alloc().base_unit_lg_lot_qty(value);
	}

	public void base_unit_lg_lot_qty(long value) {
		alloc().base_unit_lg_lot_qty(value);
	}

	public void base_unit_lg_lot_qty(float value) {
		alloc().base_unit_lg_lot_qty(value);
	}

	public void base_unit_lg_lot_qty(double value) {
		alloc().base_unit_lg_lot_qty(value);
	}

	public MCNumber base_unit_lg_not_lot_qty() {
		return alloc().base_unit_lg_not_lot_qty();
	}

	public void base_unit_lg_not_lot_qty(MCNumber value) {
		alloc().base_unit_lg_not_lot_qty(value);
	}

	public void base_unit_lg_not_lot_qty(int value) {
		alloc().base_unit_lg_not_lot_qty(value);
	}

	public void base_unit_lg_not_lot_qty(long value) {
		alloc().base_unit_lg_not_lot_qty(value);
	}

	public void base_unit_lg_not_lot_qty(float value) {
		alloc().base_unit_lg_not_lot_qty(value);
	}

	public void base_unit_lg_not_lot_qty(double value) {
		alloc().base_unit_lg_not_lot_qty(value);
	}

	public MCNumber base_unit_qty() {
		return alloc().base_unit_qty();
	}

	public void base_unit_qty(MCNumber value) {
		alloc().base_unit_qty(value);
	}

	public void base_unit_qty(int value) {
		alloc().base_unit_qty(value);
	}

	public void base_unit_qty(long value) {
		alloc().base_unit_qty(value);
	}

	public void base_unit_qty(float value) {
		alloc().base_unit_qty(value);
	}

	public void base_unit_qty(double value) {
		alloc().base_unit_qty(value);
	}

	public MCNumber base_unit_lot_alloc_qty() {
		return alloc().base_unit_lot_alloc_qty();
	}

	public void base_unit_lot_alloc_qty(MCNumber value) {
		alloc().base_unit_lot_alloc_qty(value);
	}

	public void base_unit_lot_alloc_qty(int value) {
		alloc().base_unit_lot_alloc_qty(value);
	}

	public void base_unit_lot_alloc_qty(long value) {
		alloc().base_unit_lot_alloc_qty(value);
	}

	public void base_unit_lot_alloc_qty(float value) {
		alloc().base_unit_lot_alloc_qty(value);
	}

	public void base_unit_lot_alloc_qty(double value) {
		alloc().base_unit_lot_alloc_qty(value);
	}

	public MCNumber base_unit_not_lot_alloc_qty() {
		return alloc().base_unit_not_lot_alloc_qty();
	}

	public void base_unit_not_lot_alloc_qty(MCNumber value) {
		alloc().base_unit_not_lot_alloc_qty(value);
	}

	public void base_unit_not_lot_alloc_qty(int value) {
		alloc().base_unit_not_lot_alloc_qty(value);
	}

	public void base_unit_not_lot_alloc_qty(long value) {
		alloc().base_unit_not_lot_alloc_qty(value);
	}

	public void base_unit_not_lot_alloc_qty(float value) {
		alloc().base_unit_not_lot_alloc_qty(value);
	}

	public void base_unit_not_lot_alloc_qty(double value) {
		alloc().base_unit_not_lot_alloc_qty(value);
	}

	public MCNumber base_unit_lg_lot_alloc_qty() {
		return alloc().base_unit_lg_lot_alloc_qty();
	}

	public void base_unit_lg_lot_alloc_qty(MCNumber value) {
		alloc().base_unit_lg_lot_alloc_qty(value);
	}

	public void base_unit_lg_lot_alloc_qty(int value) {
		alloc().base_unit_lg_lot_alloc_qty(value);
	}

	public void base_unit_lg_lot_alloc_qty(long value) {
		alloc().base_unit_lg_lot_alloc_qty(value);
	}

	public void base_unit_lg_lot_alloc_qty(float value) {
		alloc().base_unit_lg_lot_alloc_qty(value);
	}

	public void base_unit_lg_lot_alloc_qty(double value) {
		alloc().base_unit_lg_lot_alloc_qty(value);
	}

	public MCNumber base_unit_lg_not_lot_alloc_qty() {
		return alloc().base_unit_lg_not_lot_alloc_qty();
	}

	public void base_unit_lg_not_lot_alloc_qty(MCNumber value) {
		alloc().base_unit_lg_not_lot_alloc_qty(value);
	}

	public void base_unit_lg_not_lot_alloc_qty(int value) {
		alloc().base_unit_lg_not_lot_alloc_qty(value);
	}

	public void base_unit_lg_not_lot_alloc_qty(long value) {
		alloc().base_unit_lg_not_lot_alloc_qty(value);
	}

	public void base_unit_lg_not_lot_alloc_qty(float value) {
		alloc().base_unit_lg_not_lot_alloc_qty(value);
	}

	public void base_unit_lg_not_lot_alloc_qty(double value) {
		alloc().base_unit_lg_not_lot_alloc_qty(value);
	}

	public MCNumber base_unit_grs_alloc_qty() {
		return alloc().base_unit_grs_alloc_qty();
	}

	public void base_unit_grs_alloc_qty(MCNumber value) {
		alloc().base_unit_grs_alloc_qty(value);
	}

	public void base_unit_grs_alloc_qty(int value) {
		alloc().base_unit_grs_alloc_qty(value);
	}

	public void base_unit_grs_alloc_qty(long value) {
		alloc().base_unit_grs_alloc_qty(value);
	}

	public void base_unit_grs_alloc_qty(float value) {
		alloc().base_unit_grs_alloc_qty(value);
	}

	public void base_unit_grs_alloc_qty(double value) {
		alloc().base_unit_grs_alloc_qty(value);
	}

	public MCNumber base_unit_alloc_qty() {
		return alloc().base_unit_alloc_qty();
	}

	public void base_unit_alloc_qty(MCNumber value) {
		alloc().base_unit_alloc_qty(value);
	}

	public void base_unit_alloc_qty(int value) {
		alloc().base_unit_alloc_qty(value);
	}

	public void base_unit_alloc_qty(long value) {
		alloc().base_unit_alloc_qty(value);
	}

	public void base_unit_alloc_qty(float value) {
		alloc().base_unit_alloc_qty(value);
	}

	public void base_unit_alloc_qty(double value) {
		alloc().base_unit_alloc_qty(value);
	}

	public MCNumber base_unit_lot_wait_qty() {
		return alloc().base_unit_lot_wait_qty();
	}

	public void base_unit_lot_wait_qty(MCNumber value) {
		alloc().base_unit_lot_wait_qty(value);
	}

	public void base_unit_lot_wait_qty(int value) {
		alloc().base_unit_lot_wait_qty(value);
	}

	public void base_unit_lot_wait_qty(long value) {
		alloc().base_unit_lot_wait_qty(value);
	}

	public void base_unit_lot_wait_qty(float value) {
		alloc().base_unit_lot_wait_qty(value);
	}

	public void base_unit_lot_wait_qty(double value) {
		alloc().base_unit_lot_wait_qty(value);
	}

	public MCNumber base_unit_not_lot_wait_qty() {
		return alloc().base_unit_not_lot_wait_qty();
	}

	public void base_unit_not_lot_wait_qty(MCNumber value) {
		alloc().base_unit_not_lot_wait_qty(value);
	}

	public void base_unit_not_lot_wait_qty(int value) {
		alloc().base_unit_not_lot_wait_qty(value);
	}

	public void base_unit_not_lot_wait_qty(long value) {
		alloc().base_unit_not_lot_wait_qty(value);
	}

	public void base_unit_not_lot_wait_qty(float value) {
		alloc().base_unit_not_lot_wait_qty(value);
	}

	public void base_unit_not_lot_wait_qty(double value) {
		alloc().base_unit_not_lot_wait_qty(value);
	}

	public MCNumber base_unit_lg_lot_wait_qty() {
		return alloc().base_unit_lg_lot_wait_qty();
	}

	public void base_unit_lg_lot_wait_qty(MCNumber value) {
		alloc().base_unit_lg_lot_wait_qty(value);
	}

	public void base_unit_lg_lot_wait_qty(int value) {
		alloc().base_unit_lg_lot_wait_qty(value);
	}

	public void base_unit_lg_lot_wait_qty(long value) {
		alloc().base_unit_lg_lot_wait_qty(value);
	}

	public void base_unit_lg_lot_wait_qty(float value) {
		alloc().base_unit_lg_lot_wait_qty(value);
	}

	public void base_unit_lg_lot_wait_qty(double value) {
		alloc().base_unit_lg_lot_wait_qty(value);
	}

	public MCNumber base_unit_lg_not_lot_wait_qty() {
		return alloc().base_unit_lg_not_lot_wait_qty();
	}

	public void base_unit_lg_not_lot_wait_qty(MCNumber value) {
		alloc().base_unit_lg_not_lot_wait_qty(value);
	}

	public void base_unit_lg_not_lot_wait_qty(int value) {
		alloc().base_unit_lg_not_lot_wait_qty(value);
	}

	public void base_unit_lg_not_lot_wait_qty(long value) {
		alloc().base_unit_lg_not_lot_wait_qty(value);
	}

	public void base_unit_lg_not_lot_wait_qty(float value) {
		alloc().base_unit_lg_not_lot_wait_qty(value);
	}

	public void base_unit_lg_not_lot_wait_qty(double value) {
		alloc().base_unit_lg_not_lot_wait_qty(value);
	}

	public MCNumber base_unit_grs_wait_qty() {
		return alloc().base_unit_grs_wait_qty();
	}

	public void base_unit_grs_wait_qty(MCNumber value) {
		alloc().base_unit_grs_wait_qty(value);
	}

	public void base_unit_grs_wait_qty(int value) {
		alloc().base_unit_grs_wait_qty(value);
	}

	public void base_unit_grs_wait_qty(long value) {
		alloc().base_unit_grs_wait_qty(value);
	}

	public void base_unit_grs_wait_qty(float value) {
		alloc().base_unit_grs_wait_qty(value);
	}

	public void base_unit_grs_wait_qty(double value) {
		alloc().base_unit_grs_wait_qty(value);
	}

	public MCNumber base_unit_wait_qty() {
		return alloc().base_unit_wait_qty();
	}

	public void base_unit_wait_qty(MCNumber value) {
		alloc().base_unit_wait_qty(value);
	}

	public void base_unit_wait_qty(int value) {
		alloc().base_unit_wait_qty(value);
	}

	public void base_unit_wait_qty(long value) {
		alloc().base_unit_wait_qty(value);
	}

	public void base_unit_wait_qty(float value) {
		alloc().base_unit_wait_qty(value);
	}

	public void base_unit_wait_qty(double value) {
		alloc().base_unit_wait_qty(value);
	}

	public String base_unit_rnd_typ() {
		return alloc().base_unit_rnd_typ();
	}

	public void base_unit_rnd_typ(String value) {
		alloc().base_unit_rnd_typ(value);
	}

	public MCNumber cont_qty() {
		return alloc().cont_qty();
	}

	public void cont_qty(MCNumber value) {
		alloc().cont_qty(value);
	}

	public void cont_qty(int value) {
		alloc().cont_qty(value);
	}

	public void cont_qty(long value) {
		alloc().cont_qty(value);
	}

	public void cont_qty(float value) {
		alloc().cont_qty(value);
	}

	public void cont_qty(double value) {
		alloc().cont_qty(value);
	}

	public boolean not_lot_fix_flg() {
		return alloc().not_lot_fix_flg();
	}

	public void not_lot_fix_flg(boolean value) {
		alloc().not_lot_fix_flg(value);
	}

	public boolean not_lot_mix_flg() {
		return alloc().not_lot_mix_flg();
	}

	public void not_lot_mix_flg(boolean value) {
		alloc().not_lot_mix_flg(value);
	}

	public boolean not_sublot_mix_flg() {
		return alloc().not_sublot_mix_flg();
	}

	public void not_sublot_mix_flg(boolean value) {
		alloc().not_sublot_mix_flg(value);
	}

	public MCDate vld_dt_fr() {
		return alloc().vld_dt_fr();
	}

	public void vld_dt_fr(MCDate value) {
		alloc().vld_dt_fr(value);
	}

	public MCNumber vld_dt_fr_grp() {
		return alloc().vld_dt_fr_grp();
	}

	public void vld_dt_fr_grp(MCNumber value) {
		alloc().vld_dt_fr_grp(value);
	}

	public void vld_dt_fr_grp(int value) {
		alloc().vld_dt_fr_grp(value);
	}

	public void vld_dt_fr_grp(long value) {
		alloc().vld_dt_fr_grp(value);
	}

	public void vld_dt_fr_grp(float value) {
		alloc().vld_dt_fr_grp(value);
	}

	public void vld_dt_fr_grp(double value) {
		alloc().vld_dt_fr_grp(value);
	}

	public MCDate vld_dt_to() {
		return alloc().vld_dt_to();
	}

	public void vld_dt_to(MCDate value) {
		alloc().vld_dt_to(value);
	}

	public MCDate stop_dt() {
		return alloc().stop_dt();
	}

	public void stop_dt(MCDate value) {
		alloc().stop_dt(value);
	}

	public MCDate rel_dt() {
		return alloc().rel_dt();
	}

	public void rel_dt(MCDate value) {
		alloc().rel_dt(value);
	}

}

