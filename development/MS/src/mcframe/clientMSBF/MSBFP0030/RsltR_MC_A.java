package mcframe.clientMSBF.MSBFP0030;

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
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public static final String $insp_sts_typ_nm = "insp_sts_typ_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $not_yield_qty_p = "not_yield_qty_p";
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
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	public static final String $st_dt_p = "st_dt_p";
	public static final String $end_dt_p = "end_dt_p";
	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public static final String $vld_dt_now = "vld_dt_now";
	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	public static final String $aprv_usr_dpt_p = "aprv_usr_dpt_p";
	public static final String $aprv_rsn_p = "aprv_rsn_p";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Order internal remarks 指図内部備考.<p>
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
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public static final String $insp_typ_nm = "insp_typ_nm";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public static final String $insp_mtd_typ_nm = "insp_mtd_typ_nm";
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	/**
	 * Check required 確認必須.<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 * For factory release approval (master) 工場出荷承認対象(マスタ).<p>
	 *
	 */
	public static final String $master_plnt_aprv_flg = "master_plnt_aprv_flg";
	/**
	 * Schedule aggregation 予定まとめ.<p>
	 *
	 */
	public static final String $col_schd_flg = "col_schd_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $to_site_nm = "to_site_nm";
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
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	 * Mfg. rack/line 製造棚・ライン.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd_none_flg = "mfg_str_ln_cd_none_flg";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public static final String $insp_bind_typ_nm = "insp_bind_typ_nm";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	/**
	 * Inspection order list issue date and time 検査指図リスト発行日時.<p>
	 *
	 */
	public static final String $insp_lst_prnt_tm = "insp_lst_prnt_tm";
	/**
	 * Inspection order list issued 検査指図リスト発行済.<p>
	 *
	 */
	public static final String $insp_lst_prnt_flg = "insp_lst_prnt_flg";
	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm = "insp_rslt_prnt_tm";
	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	public static final String $insp_inst_issue_typ = "insp_inst_issue_typ";
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	/**
	 * For LIMS ＬＩＭＳ対象.<p>
	 *
	 */
	public static final String $for_lims_flg = "for_lims_flg";
	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public static final String $last_lims_flg = "last_lims_flg";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public static final String $own_insp_no = "own_insp_no";
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public static final String $src_no3 = "src_no3";
	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public static final String $src_no4 = "src_no4";
	/**
	 * Inspection order list No. 検査指図リストＮＯ.<p>
	 *
	 */
	public static final String $insp_lst_no = "insp_lst_no";
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
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
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
	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public static final String $schd_upd_cntr = "schd_upd_cntr";
	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public static final String $inst_upd_cntr = "inst_upd_cntr";
	/**
	 * Inspection pattern invalid flg. 検査パタン無効ＦＬＧ.<p>
	 *
	 */
	public static final String $is_invalid_insp_ptn_flg = "is_invalid_insp_ptn_flg";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	public static final String $prnt_flg = "prnt_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $not_yield_qty = $not_yield_qty_p + ".qty";
	public static final String $st_dt = $st_dt_p + ".ymd";
	public static final String $st_hm = $st_dt_p + ".hm";
	public static final String $end_dt = $end_dt_p + ".ymd";
	public static final String $end_hm = $end_dt_p + ".hm";
	public static final String $aprv_usr_cd = $aprv_usr_dpt_p + ".usr_cd";
	public static final String $aprv_usr_nm = $aprv_usr_dpt_p + ".usr_nm";
	public static final String $aprv_dpt_cd = $aprv_usr_dpt_p + ".dpt_cd";
	public static final String $aprv_dpt_nm = $aprv_usr_dpt_p + ".dpt_nm";
	public static final String $aprv_rsn = $aprv_rsn_p + ".txt";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
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

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_sts_typ_nm_META = createCommonMeta($insp_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_STS_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_yield_qty_p_META = createInnerRowMeta($not_yield_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta st_dt_p_META = createInnerRowMeta($st_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_dt_p_META = createInnerRowMeta($end_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta vld_dt_now_META = createCommonMeta($vld_dt_now, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_usr_dpt_p_META = createInnerRowMeta($aprv_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta aprv_rsn_p_META = createInnerRowMeta($aprv_rsn_p, mcframe.clientMAUB.MAUBP5370.TxtR.class);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR3);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_typ_nm_META = createCommonMeta($insp_typ_nm, mcframe.commonMS.meta.MS_META.INSP_TYP_NM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_mtd_typ_nm_META = createCommonMeta($insp_mtd_typ_nm, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP_NM);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta master_plnt_aprv_flg_META = createCommonMeta($master_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta col_schd_flg_META = createCommonMeta($col_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_nm_META = createCommonMeta($to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_str_ln_cd_none_flg_META = createCommonMeta($mfg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta insp_bind_typ_nm_META = createCommonMeta($insp_bind_typ_nm, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP_NM);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_lst_prnt_tm_META = createCommonMeta($insp_lst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_lst_prnt_flg_META = createCommonMeta($insp_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_tm_META = createCommonMeta($insp_rslt_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_inst_issue_typ_META = createCommonMeta($insp_inst_issue_typ, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta for_lims_flg_META = createCommonMeta($for_lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_lims_flg_META = createCommonMeta($last_lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta own_insp_no_META = createCommonMeta($own_insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no3_META = createCommonMeta($src_no3, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no4_META = createCommonMeta($src_no4, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta insp_lst_no_META = createCommonMeta($insp_lst_no, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
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
	public static final MCMeta schd_upd_cntr_META = createCommonMeta($schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta inst_upd_cntr_META = createCommonMeta($inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta is_invalid_insp_ptn_flg_META = createCommonMeta($is_invalid_insp_ptn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			insp_sts_typ_META,
			insp_sts_typ_nm_META,
			itm_p_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			base_unit_qty_p_META,
			not_yield_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			insp_lt_META,
			st_dt_p_META,
			end_dt_p_META,
			vld_dt_now_META,
			lmt_up_flg_META,
			insp_aprv_flg_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			aprv_dt_META,
			aprv_usr_dpt_p_META,
			aprv_rsn_p_META,
			insp_cnt_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			lot_rmrks_META,
			sno_wrk_no_p_META,
			insp_typ_META,
			insp_typ_nm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			insp_mtd_typ_META,
			insp_mtd_typ_nm_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			plnt_aprv_flg_META,
			master_plnt_aprv_flg_META,
			col_schd_flg_META,
			to_site_cd_META,
			to_site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			mfg_str_ln_cd_none_flg_META,
			bp_lot_no_META,
			insp_bind_typ_META,
			insp_bind_typ_nm_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			insp_freq_META,
			insp_lst_prnt_tm_META,
			insp_lst_prnt_flg_META,
			insp_rslt_prnt_tm_META,
			insp_rslt_prnt_flg_META,
			in_prmt_insp_flg_META,
			insp_inst_issue_typ_META,
			insp_std_no_META,
			lims_flg_META,
			for_lims_flg_META,
			last_lims_flg_META,
			insp_schd_no_META,
			insp_no_META,
			own_insp_no_META,
			src_no1_META,
			src_no2_META,
			src_no3_META,
			src_no4_META,
			insp_lst_no_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
			sppl_grp_p_META,
			itm_grp_p_META,
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
			schd_upd_cntr_META,
			inst_upd_cntr_META,
			is_invalid_insp_ptn_flg_META,
			from_site_cd_META,
			master_dt_META,
			prnt_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"base_unit_qty",
				"not_yield_qty",
				"st_dt",
				"st_hm",
				"end_dt",
				"end_hm",
				"aprv_usr_cd",
				"aprv_usr_nm",
				"aprv_dpt_cd",
				"aprv_dpt_nm",
				"aprv_rsn",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"rtn_sts_typ",
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
				"sppl_grp_nm10",
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
				"itm_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$base_unit_qty,
				$not_yield_qty,
				$st_dt,
				$st_hm,
				$end_dt,
				$end_hm,
				$aprv_usr_cd,
				$aprv_usr_nm,
				$aprv_dpt_cd,
				$aprv_dpt_nm,
				$aprv_rsn,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$rtn_sts_typ,
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
				$sppl_grp_nm10,
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
				$itm_grp_nm10
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
				{$aprv_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$aprv_usr_dpt_p + ".dpt_cd", "aprv_usr_cd;aprv_dt;MAC_DPT_IS_SRCH_TYP.INSP"},	// aprv_usr_dpt_p.dpt_cd
				{$insp_ptn_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;master_dt"}	// insp_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$aprv_usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"},	// aprv_usr_dpt_p.dpt_cd
				{$insp_ptn_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;dt"}	// insp_ptn_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ver_no, "VER_NO"},	// ver_no
				{$insp_aprv_flg, "MFG_APRV"},	// insp_aprv_flg
				{$insp_aprv_sts_typ, "MFG_APRV"},	// insp_aprv_sts_typ
				{$insp_aprv_sts_typ_nm, "MFG_APRV"},	// insp_aprv_sts_typ_nm
				{$aprv_dt, "MFG_APRV"},	// aprv_dt
				{$aprv_usr_dpt_p + ".usr_cd", "MFG_APRV"},	// aprv_usr_dpt_p.usr_cd
				{$aprv_usr_dpt_p + ".usr_nm", "MFG_APRV"},	// aprv_usr_dpt_p.usr_nm
				{$aprv_usr_dpt_p + ".dpt_cd", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_nm", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_nm
				{$aprv_rsn_p + ".txt", "MFG_APRV"},	// aprv_rsn_p.txt
				{$to_site_cd, "SITE"},	// to_site_cd
				{$to_site_nm, "SITE"},	// to_site_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$mfg_str_ln_cd, "STR_LN"},	// mfg_str_ln_cd
				{$mfg_str_ln_nm, "STR_LN"},	// mfg_str_ln_nm
				{$mfg_str_ln_cd_none_flg, "STR_LN"},	// mfg_str_ln_cd_none_flg
				{$in_prmt_insp_flg, "IN_PRMT_INSP"}	// in_prmt_insp_flg
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
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 1, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 1, $insp_sts_typ, value);
	}


	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public String insp_sts_typ_nm() {
		return getConstString(offset + 2, $insp_sts_typ_nm);
	}

	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public void insp_sts_typ_nm(String value) {
		setConstString(offset + 2, $insp_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 4, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 4, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 6, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 6, $sublot_no, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 7, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 7, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 8, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 8, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 9, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 9, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 10, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 10, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 11, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 11, $sno4_mng_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $not_yield_qty_p);
	}
	
	public void not_yield_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $not_yield_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 14, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 14, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 15, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 15, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 16, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}


	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 17, $insp_lt);
	}

	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 17, $insp_lt, value);
	}

	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 17, $insp_lt, value);
	}

	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 17, $insp_lt, value);
	}

	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 17, $insp_lt, value);
	}

	/**
	 * Inspection lead time 検査リードタイム.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 17, $insp_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 18, $st_dt_p);
	}
	
	public void st_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 18, $st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 19, $end_dt_p);
	}
	
	public void end_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 19, $end_dt_p, row);
	}


	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public MCDate vld_dt_now() {
		return getConstDate(offset + 20, $vld_dt_now);
	}

	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public void vld_dt_now(MCDate value) {
		setConstDate(offset + 20, $vld_dt_now, value);
	}


	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 21, $lmt_up_flg);
	}

	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 21, $lmt_up_flg, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 22, $insp_aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 22, $insp_aprv_flg, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 23, $insp_aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 23, $insp_aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 24, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 24, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 25, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 25, $aprv_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR aprv_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 26, $aprv_usr_dpt_p);
	}
	
	public void aprv_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 26, $aprv_usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5370.TxtR aprv_rsn_p(){
		return (mcframe.clientMAUB.MAUBP5370.TxtR) getConstInnerRow(offset + 27, $aprv_rsn_p);
	}
	
	public void aprv_rsn_p(mcframe.clientMAUB.MAUBP5370.TxtR row){
		setConstInnerRow(offset + 27, $aprv_rsn_p, row);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 28, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 28, $insp_cnt_rmrks, value);
	}


	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 29, $intr_rmrks);
	}

	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 29, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 30, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 30, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 31, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 31, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 32, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 32, $sub_char3, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 33, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 33, $lot_rmrks, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 34, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 34, $sno_wrk_no_p, row);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 35, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 35, $insp_typ, value);
	}


	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public String insp_typ_nm() {
		return getConstString(offset + 36, $insp_typ_nm);
	}

	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public void insp_typ_nm(String value) {
		setConstString(offset + 36, $insp_typ_nm, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 37, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 37, $insp_ptn_cd, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 38, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 38, $insp_ptn_nm, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 39, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 39, $insp_mtd_typ, value);
	}


	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public String insp_mtd_typ_nm() {
		return getConstString(offset + 40, $insp_mtd_typ_nm);
	}

	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public void insp_mtd_typ_nm(String value) {
		setConstString(offset + 40, $insp_mtd_typ_nm, value);
	}


	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 41, $std_req_flg);
	}

	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 41, $std_req_flg, value);
	}


	/**
	 * Check required 確認必須.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 42, $std_cnf_req_flg);
	}

	/**
	 * Check required 確認必須.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 42, $std_cnf_req_flg, value);
	}


	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 43, $plnt_aprv_flg);
	}

	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 43, $plnt_aprv_flg, value);
	}


	/**
	 * For factory release approval (master) 工場出荷承認対象(マスタ).<p>
	 *
	 */
	public boolean master_plnt_aprv_flg() {
		return getConstBoolean(offset + 44, $master_plnt_aprv_flg);
	}

	/**
	 * For factory release approval (master) 工場出荷承認対象(マスタ).<p>
	 *
	 */
	public void master_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 44, $master_plnt_aprv_flg, value);
	}


	/**
	 * Schedule aggregation 予定まとめ.<p>
	 *
	 */
	public boolean col_schd_flg() {
		return getConstBoolean(offset + 45, $col_schd_flg);
	}

	/**
	 * Schedule aggregation 予定まとめ.<p>
	 *
	 */
	public void col_schd_flg(boolean value) {
		setConstBoolean(offset + 45, $col_schd_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 46, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 46, $to_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String to_site_nm() {
		return getConstString(offset + 47, $to_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void to_site_nm(String value) {
		setConstString(offset + 47, $to_site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 48, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 48, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 49, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 49, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 50, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 50, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 51, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 51, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 52, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 52, $str_ln_cd_none_flg, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 53, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 53, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 54, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 54, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 55, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 55, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 56, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 56, $maker_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 57, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 57, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 58, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 58, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line 製造棚・ライン.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 59, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line 製造棚・ライン.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 59, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 60, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 60, $mfg_str_ln_nm, value);
	}


	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public boolean mfg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 61, $mfg_str_ln_cd_none_flg);
	}

	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public void mfg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 61, $mfg_str_ln_cd_none_flg, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 62, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 62, $bp_lot_no, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 63, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 63, $insp_bind_typ, value);
	}


	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public String insp_bind_typ_nm() {
		return getConstString(offset + 64, $insp_bind_typ_nm);
	}

	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public void insp_bind_typ_nm(String value) {
		setConstString(offset + 64, $insp_bind_typ_nm, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 65, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 65, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 66, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 66, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 67, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 67, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 68, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 68, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 69, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 69, $inst_dpt_nm, value);
	}


	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 70, $insp_freq);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 70, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 70, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 70, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 70, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 70, $insp_freq, value);
	}


	/**
	 * Inspection order list issue date and time 検査指図リスト発行日時.<p>
	 *
	 */
	public MCDate insp_lst_prnt_tm() {
		return getConstDate(offset + 71, $insp_lst_prnt_tm);
	}

	/**
	 * Inspection order list issue date and time 検査指図リスト発行日時.<p>
	 *
	 */
	public void insp_lst_prnt_tm(MCDate value) {
		setConstDate(offset + 71, $insp_lst_prnt_tm, value);
	}


	/**
	 * Inspection order list issued 検査指図リスト発行済.<p>
	 *
	 */
	public boolean insp_lst_prnt_flg() {
		return getConstBoolean(offset + 72, $insp_lst_prnt_flg);
	}

	/**
	 * Inspection order list issued 検査指図リスト発行済.<p>
	 *
	 */
	public void insp_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 72, $insp_lst_prnt_flg, value);
	}


	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm() {
		return getConstDate(offset + 73, $insp_rslt_prnt_tm);
	}

	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public void insp_rslt_prnt_tm(MCDate value) {
		setConstDate(offset + 73, $insp_rslt_prnt_tm, value);
	}


	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 74, $insp_rslt_prnt_flg);
	}

	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 74, $insp_rslt_prnt_flg, value);
	}


	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 75, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 75, $in_prmt_insp_flg, value);
	}


	public String insp_inst_issue_typ() {
		return getConstString(offset + 76, $insp_inst_issue_typ);
	}

	public void insp_inst_issue_typ(String value) {
		setConstString(offset + 76, $insp_inst_issue_typ, value);
	}


	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 77, $insp_std_no);
	}

	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 77, $insp_std_no, value);
	}


	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 78, $lims_flg);
	}

	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 78, $lims_flg, value);
	}


	/**
	 * For LIMS ＬＩＭＳ対象.<p>
	 *
	 */
	public boolean for_lims_flg() {
		return getConstBoolean(offset + 79, $for_lims_flg);
	}

	/**
	 * For LIMS ＬＩＭＳ対象.<p>
	 *
	 */
	public void for_lims_flg(boolean value) {
		setConstBoolean(offset + 79, $for_lims_flg, value);
	}


	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public boolean last_lims_flg() {
		return getConstBoolean(offset + 80, $last_lims_flg);
	}

	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public void last_lims_flg(boolean value) {
		setConstBoolean(offset + 80, $last_lims_flg, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 81, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 81, $insp_schd_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 82, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 82, $insp_no, value);
	}


	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public String own_insp_no() {
		return getConstString(offset + 83, $own_insp_no);
	}

	/**
	 * Reference inspection No. 参照検査ＮＯ.<p>
	 *
	 */
	public void own_insp_no(String value) {
		setConstString(offset + 83, $own_insp_no, value);
	}


	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 84, $src_no1);
	}

	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 84, $src_no1, value);
	}


	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 85, $src_no2);
	}

	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 85, $src_no2, value);
	}


	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public String src_no3() {
		return getConstString(offset + 86, $src_no3);
	}

	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public void src_no3(String value) {
		setConstString(offset + 86, $src_no3, value);
	}


	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public String src_no4() {
		return getConstString(offset + 87, $src_no4);
	}

	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public void src_no4(String value) {
		setConstString(offset + 87, $src_no4, value);
	}


	/**
	 * Inspection order list No. 検査指図リストＮＯ.<p>
	 *
	 */
	public String insp_lst_no() {
		return getConstString(offset + 88, $insp_lst_no);
	}

	/**
	 * Inspection order list No. 検査指図リストＮＯ.<p>
	 *
	 */
	public void insp_lst_no(String value) {
		setConstString(offset + 88, $insp_lst_no, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 89, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 89, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 90, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 90, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 91, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 91, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 92, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 92, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 93, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 93, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 94, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 94, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 95, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 95, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 96, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 96, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 97, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 97, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 98, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 98, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 99, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 99, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 100, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 100, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 101, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 101, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 102, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 102, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 103, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 103, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 104, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 104, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 105, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 105, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 106, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 106, $upd_srv_req_no, value);
	}


	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public MCNumber schd_upd_cntr() {
		return getConstNumber(offset + 107, $schd_upd_cntr);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 107, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(int value) {
		setConstNumber(offset + 107, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(long value) {
		setConstNumber(offset + 107, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(float value) {
		setConstNumber(offset + 107, $schd_upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void schd_upd_cntr(double value) {
		setConstNumber(offset + 107, $schd_upd_cntr, value);
	}


	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public MCNumber inst_upd_cntr() {
		return getConstNumber(offset + 108, $inst_upd_cntr);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 108, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(int value) {
		setConstNumber(offset + 108, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(long value) {
		setConstNumber(offset + 108, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(float value) {
		setConstNumber(offset + 108, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(double value) {
		setConstNumber(offset + 108, $inst_upd_cntr, value);
	}


	/**
	 * Inspection pattern invalid flg. 検査パタン無効ＦＬＧ.<p>
	 *
	 */
	public boolean is_invalid_insp_ptn_flg() {
		return getConstBoolean(offset + 109, $is_invalid_insp_ptn_flg);
	}

	/**
	 * Inspection pattern invalid flg. 検査パタン無効ＦＬＧ.<p>
	 *
	 */
	public void is_invalid_insp_ptn_flg(boolean value) {
		setConstBoolean(offset + 109, $is_invalid_insp_ptn_flg, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 110, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 110, $from_site_cd, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 111, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 111, $master_dt, value);
	}


	public boolean prnt_flg() {
		return getConstBoolean(offset + 112, $prnt_flg);
	}

	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 112, $prnt_flg, value);
	}


	public String getString(String name) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			return schd_upd_cntr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($master_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return master_plnt_aprv_flg();
		}
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($for_lims_flg.equalsIgnoreCase(name)) {
			return for_lims_flg();
		}
		if ($last_lims_flg.equalsIgnoreCase(name)) {
			return last_lims_flg();
		}
		if ($is_invalid_insp_ptn_flg.equalsIgnoreCase(name)) {
			return is_invalid_insp_ptn_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			return schd_upd_cntr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_tm();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($master_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return master_plnt_aprv_flg();
		}
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($for_lims_flg.equalsIgnoreCase(name)) {
			return for_lims_flg();
		}
		if ($last_lims_flg.equalsIgnoreCase(name)) {
			return last_lims_flg();
		}
		if ($is_invalid_insp_ptn_flg.equalsIgnoreCase(name)) {
			return is_invalid_insp_ptn_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($master_plnt_aprv_flg.equalsIgnoreCase(name)) {
			master_plnt_aprv_flg(value);
			return;
		}
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($for_lims_flg.equalsIgnoreCase(name)) {
			for_lims_flg(value);
			return;
		}
		if ($last_lims_flg.equalsIgnoreCase(name)) {
			last_lims_flg(value);
			return;
		}
		if ($is_invalid_insp_ptn_flg.equalsIgnoreCase(name)) {
			is_invalid_insp_ptn_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
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
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($schd_upd_cntr.equalsIgnoreCase(name)) {
			schd_upd_cntr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($insp_lst_prnt_tm.equalsIgnoreCase(name)) {
			insp_lst_prnt_tm(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($master_plnt_aprv_flg.equalsIgnoreCase(name)) {
			master_plnt_aprv_flg(value);
			return;
		}
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($for_lims_flg.equalsIgnoreCase(name)) {
			for_lims_flg(value);
			return;
		}
		if ($last_lims_flg.equalsIgnoreCase(name)) {
			last_lims_flg(value);
			return;
		}
		if ($is_invalid_insp_ptn_flg.equalsIgnoreCase(name)) {
			is_invalid_insp_ptn_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($not_yield_qty_p.equalsIgnoreCase(name)) {
			return not_yield_qty_p();
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			return st_dt_p();
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			return end_dt_p();
		}
		if ($aprv_usr_dpt_p.equalsIgnoreCase(name)) {
			return aprv_usr_dpt_p();
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			return aprv_rsn_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
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
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_yield_qty_p.equalsIgnoreCase(name)) {
			not_yield_qty_p(
				((MCContainerMeta) not_yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			st_dt_p(
				((MCContainerMeta) st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			end_dt_p(
				((MCContainerMeta) end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($aprv_usr_dpt_p.equalsIgnoreCase(name)) {
			aprv_usr_dpt_p(
				((MCContainerMeta) aprv_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			aprv_rsn_p(
				((MCContainerMeta) aprv_rsn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5370.TxtR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
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
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inspection qty. 基準単位検査数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public MCNumber not_yield_qty() {
		return not_yield_qty_p().qty();
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public void not_yield_qty(MCNumber value) {
		not_yield_qty_p().qty(value);
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public void not_yield_qty(int value) {
		not_yield_qty_p().qty(value);
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public void not_yield_qty(long value) {
		not_yield_qty_p().qty(value);
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public void not_yield_qty(float value) {
		not_yield_qty_p().qty(value);
	}

	/**
	 * Remaining output 出来高残数.<p>
	 *
	 */
	public void not_yield_qty(double value) {
		not_yield_qty_p().qty(value);
	}

	/**
	 * Scheduled inspection start date 検査開始予定日.<p>
	 *
	 */
	public MCDate st_dt() {
		return st_dt_p().ymd();
	}

	/**
	 * Scheduled inspection start date 検査開始予定日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		st_dt_p().ymd(value);
	}

	/**
	 * Inspection schedule start time 検査開始予定時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return st_dt_p().hm();
	}

	/**
	 * Inspection schedule start time 検査開始予定時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		st_dt_p().hm(value);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate end_dt() {
		return end_dt_p().ymd();
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		end_dt_p().ymd(value);
	}

	/**
	 * Scheduled end time of inspection 検査終了予定時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return end_dt_p().hm();
	}

	/**
	 * Scheduled end time of inspection 検査終了予定時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		end_dt_p().hm(value);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return aprv_usr_dpt_p().usr_cd();
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		aprv_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return aprv_usr_dpt_p().usr_nm();
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		aprv_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return aprv_usr_dpt_p().dpt_cd();
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		aprv_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return aprv_usr_dpt_p().dpt_nm();
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		aprv_usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return aprv_rsn_p().txt();
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		aprv_rsn_p().txt(value);
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

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
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

}

