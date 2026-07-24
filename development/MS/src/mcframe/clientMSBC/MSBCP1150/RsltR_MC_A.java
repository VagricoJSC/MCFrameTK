package mcframe.clientMSBC.MSBCP1150;

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
	 * With mfg. order 製造指図あり.<p>
	 *
	 */
	public static final String $inst_wk_act_flg = "inst_wk_act_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $oper_disp_seq = "oper_disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $st_tm_p = "st_tm_p";
	public static final String $end_tm_p = "end_tm_p";
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public static final String $brk_pd = "brk_pd";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_ctl_flg = "wk_cost_calc_ctl_flg";
	/**
	 * Start time unspecified at file entry ファイル入力時着手時刻未指定.<p>
	 *
	 */
	public static final String $is_file_st_tm_null_flg = "is_file_st_tm_null_flg";
	/**
	 * End time unspecified at file entry ファイル入力時終了時刻未指定.<p>
	 *
	 */
	public static final String $is_file_end_tm_null_flg = "is_file_end_tm_null_flg";
	public static final String $schd_sum_wk_cost_p = "schd_sum_wk_cost_p";
	public static final String $act_wk_cost_p = "act_wk_cost_p";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	public static final String $rem_wk_cost_p = "rem_wk_cost_p";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public static final String $pr_rate = "pr_rate";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_dec_place = "wk_cost_dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $wk_cost_rnd_typ = "wk_cost_rnd_typ";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public static final String $wk_day_nm = "wk_day_nm";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public static final String $wk_rsn_nm = "wk_rsn_nm";
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
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	public static final String $str_ln_p = "str_ln_p";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public static final String $fclty = "fclty";
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public static final String $schd_intr_rmrks = "schd_intr_rmrks";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	public static final String $schd_wk_cost_p = "schd_wk_cost_p";
	public static final String $schd_fxd_wk_cost_p = "schd_fxd_wk_cost_p";
	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public static final String $schd_sub_char1 = "schd_sub_char1";
	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public static final String $schd_sub_char2 = "schd_sub_char2";
	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public static final String $schd_sub_char3 = "schd_sub_char3";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";
	public static final String $itm_p = "itm_p";
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
	public static final String $lot_no_p = "lot_no_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public static final String $oper_st_schd_dt = "oper_st_schd_dt";
	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public static final String $oper_st_schd_hm = "oper_st_schd_hm";
	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public static final String $oper_end_schd_dt = "oper_end_schd_dt";
	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public static final String $oper_end_schd_hm = "oper_end_schd_hm";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public static final String $wk_mfg_sts_typ = "wk_mfg_sts_typ";
	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public static final String $wk_mfg_sts_typ_nm = "wk_mfg_sts_typ_nm";
	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public static final String $oper_mfg_sts_typ = "oper_mfg_sts_typ";
	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public static final String $oper_mfg_sts_typ_nm = "oper_mfg_sts_typ_nm";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
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
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";
	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $dpt_wg_cd = "dpt_wg_cd";
	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public static final String $dpt_wg_nm = "dpt_wg_nm";
	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $loc_wg_nm = "loc_wg_nm";
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
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
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
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
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public static final String $wk_act_upd_cntr = "wk_act_upd_cntr";
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

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $dummy_st_dt = $st_tm_p + ".ymd";
	public static final String $st_tm = $st_tm_p + ".hm";
	public static final String $dummy_end_dt = $end_tm_p + ".ymd";
	public static final String $end_tm = $end_tm_p + ".hm";
	public static final String $schd_sum_wk_cost = $schd_sum_wk_cost_p + ".wk_cost_qty";
	public static final String $act_wk_cost = $act_wk_cost_p + ".wk_cost_qty";
	public static final String $rem_wk_cost = $rem_wk_cost_p + ".wk_cost_qty";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $wk_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $wk_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $wk_usr_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $wk_usr_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $schd_wk_cost = $schd_wk_cost_p + ".wk_cost_qty";
	public static final String $schd_fxd_wk_cost = $schd_fxd_wk_cost_p + ".wk_cost_qty";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_wk_act_flg_META = createCommonMeta($inst_wk_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta st_tm_p_META = createInnerRowMeta($st_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_tm_p_META = createInnerRowMeta($end_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta brk_pd_META = createCommonMeta($brk_pd, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta wk_cost_calc_ctl_flg_META = createCommonMeta($wk_cost_calc_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_file_st_tm_null_flg_META = createCommonMeta($is_file_st_tm_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_file_end_tm_null_flg_META = createCommonMeta($is_file_end_tm_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_sum_wk_cost_p_META = createInnerRowMeta($schd_sum_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta act_wk_cost_p_META = createInnerRowMeta($act_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_wk_cost_p_META = createInnerRowMeta($rem_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta pr_rate_META = createCommonMeta($pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta wk_cost_dec_place_META = createCommonMeta($wk_cost_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wk_cost_rnd_typ_META = createCommonMeta($wk_cost_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_day_nm_META = createCommonMeta($wk_day_nm, mcframe.commonMA.meta.MA_META.WK_DAY_NM);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_wk_cost_p_META = createInnerRowMeta($schd_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta schd_fxd_wk_cost_p_META = createInnerRowMeta($schd_fxd_wk_cost_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta oper_st_schd_dt_META = createCommonMeta($oper_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_st_schd_hm_META = createCommonMeta($oper_st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_end_schd_dt_META = createCommonMeta($oper_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_end_schd_hm_META = createCommonMeta($oper_end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta wk_mfg_sts_typ_META = createCommonMeta($wk_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta wk_mfg_sts_typ_nm_META = createCommonMeta($wk_mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta oper_mfg_sts_typ_META = createCommonMeta($oper_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta oper_mfg_sts_typ_nm_META = createCommonMeta($oper_mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);
	public static final MCMeta dpt_wg_cd_META = createCommonMeta($dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dpt_wg_nm_META = createCommonMeta($dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_wg_nm_META = createCommonMeta($loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta wk_act_upd_cntr_META = createCommonMeta($wk_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			inst_wk_act_flg_META,
			mfg_inst_no_META,
			div_seq_META,
			oper_disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			ac_dt_p_META,
			st_tm_p_META,
			end_tm_p_META,
			brk_pd_META,
			wk_cost_calc_ctl_flg_META,
			is_file_st_tm_null_flg_META,
			is_file_end_tm_null_flg_META,
			schd_sum_wk_cost_p_META,
			act_wk_cost_p_META,
			abort_flg_META,
			rem_wk_cost_p_META,
			wk_cost_unit_nm_META,
			pr_rate_META,
			wk_cost_dec_place_META,
			wk_cost_rnd_typ_META,
			wk_day_cd_META,
			wk_day_nm_META,
			wk_rsn_cd_META,
			wk_rsn_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_tgt_flg_META,
			str_ln_p_META,
			usr_dpt_p_META,
			fclty_META,
			schd_intr_rmrks_META,
			wk_cost_calc_flg_META,
			schd_wk_cost_p_META,
			schd_fxd_wk_cost_p_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			act_intr_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			itm_p_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_no_p_META,
			sno_wrk_no_p_META,
			oper_st_schd_dt_META,
			oper_st_schd_hm_META,
			oper_end_schd_dt_META,
			oper_end_schd_hm_META,
			oper_ptn_META,
			oper_seq_META,
			wk_mfg_sts_typ_META,
			wk_mfg_sts_typ_nm_META,
			oper_mfg_sts_typ_META,
			oper_mfg_sts_typ_nm_META,
			aprv_flg_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			wk_schd_no_META,
			mfg_act_no_META,
			oper_act_no_META,
			wk_act_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_wk_act_no_META,
			dpt_wg_cd_META,
			dpt_wg_nm_META,
			loc_wg_cd_META,
			loc_wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			site_cd_META,
			site_nm_META,
			disp_seq_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
			itm_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			mfg_inst_upd_cntr_META,
			wk_act_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"ac_dt",
				"dummy_st_dt",
				"st_tm",
				"dummy_end_dt",
				"end_tm",
				"schd_sum_wk_cost",
				"act_wk_cost",
				"rem_wk_cost",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"wk_usr_cd",
				"wk_usr_nm",
				"wk_usr_dpt_cd",
				"wk_usr_dpt_nm",
				"schd_wk_cost",
				"schd_fxd_wk_cost",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
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
				"itm_grp_nm10"
			},
			{
				$ac_dt,
				$dummy_st_dt,
				$st_tm,
				$dummy_end_dt,
				$end_tm,
				$schd_sum_wk_cost,
				$act_wk_cost,
				$rem_wk_cost,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$wk_usr_cd,
				$wk_usr_nm,
				$wk_usr_dpt_cd,
				$wk_usr_dpt_nm,
				$schd_wk_cost,
				$schd_fxd_wk_cost,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
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
				{$mfg_inst_no, "div_seq"},	// mfg_inst_no
				{$wk_cost_cd, "wk_cost_nm;wk_cost_unit_nm;dec_place;rnd_typ;"},	// wk_cost_cd
				{$dpt_cd, "dpt_nm;wg_cd;wg_nm"},	// dpt_cd
				{$loc_cd, "loc_nm;wg_cd;wg_nm;site_cd;site_nm;loc_grp_cd;loc_grp_nm;str_ln_tgt_flg"},	// loc_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_inst_no, "MSC_MFG_MTD_TYP.INTNL;false;false;true;true"},	// mfg_inst_no
				{$div_seq, "mfg_inst_no"},	// div_seq
				{$oper_cd, "true"},	// oper_cd
				{$dpt_cd, "true;ac_dt"},	// dpt_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE"},	// loc_cd
				{$str_ln_p + ".str_ln_cd", "loc_cd;true"},	// str_ln_p.str_ln_cd
				{$usr_dpt_p + ".dpt_cd", "ac_dt;wk_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG"},	// usr_dpt_p.dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_inst_no, "imi_mfg_mtd_typ;sav_flg;ord_flg;stt_flg;cmpl_flg"},	// mfg_inst_no
				{$div_seq, "mfg_inst_no"},	// div_seq
				{$oper_cd, "mode_nullval_flg"},	// oper_cd
				{$dpt_cd, "wr_flg;dt"},	// dpt_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// str_ln_p.str_ln_cd
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// usr_dpt_p.dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$st_tm_p + ".hm", "_DISP"},	// st_tm_p.hm
				{$end_tm_p + ".hm", "_DISP"},	// end_tm_p.hm
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
				{$oper_st_schd_hm, "TM"},	// oper_st_schd_hm
				{$oper_end_schd_hm, "TM"},	// oper_end_schd_hm
				{$aprv_flg, "MFG_APRV"},	// aprv_flg
				{$mfg_aprv_sts_typ, "MFG_APRV"},	// mfg_aprv_sts_typ
				{$mfg_aprv_sts_typ_nm, "MFG_APRV"},	// mfg_aprv_sts_typ_nm
				{$dpt_wg_cd, "WG"},	// dpt_wg_cd
				{$dpt_wg_nm, "WG"},	// dpt_wg_nm
				{$loc_wg_cd, "WG"},	// loc_wg_cd
				{$loc_wg_nm, "WG"},	// loc_wg_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"}	// site_nm
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
	 * With mfg. order 製造指図あり.<p>
	 *
	 */
	public boolean inst_wk_act_flg() {
		return getConstBoolean(offset + 1, $inst_wk_act_flg);
	}

	/**
	 * With mfg. order 製造指図あり.<p>
	 *
	 */
	public void inst_wk_act_flg(boolean value) {
		setConstBoolean(offset + 1, $inst_wk_act_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 2, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 2, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 3, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 3, $div_seq, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 4, $oper_disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 4, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 4, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 4, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 4, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 4, $oper_disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 5, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 5, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 6, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 6, $oper_nm, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 7, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 7, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 8, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 8, $wk_cost_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 9, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 9, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 10, $st_tm_p);
	}
	
	public void st_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 10, $st_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 11, $end_tm_p);
	}
	
	public void end_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 11, $end_tm_p, row);
	}


	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return getConstNumber(offset + 12, $brk_pd);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		setConstNumber(offset + 12, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		setConstNumber(offset + 12, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		setConstNumber(offset + 12, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		setConstNumber(offset + 12, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		setConstNumber(offset + 12, $brk_pd, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_ctl_flg() {
		return getConstBoolean(offset + 13, $wk_cost_calc_ctl_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_ctl_flg(boolean value) {
		setConstBoolean(offset + 13, $wk_cost_calc_ctl_flg, value);
	}


	/**
	 * Start time unspecified at file entry ファイル入力時着手時刻未指定.<p>
	 *
	 */
	public boolean is_file_st_tm_null_flg() {
		return getConstBoolean(offset + 14, $is_file_st_tm_null_flg);
	}

	/**
	 * Start time unspecified at file entry ファイル入力時着手時刻未指定.<p>
	 *
	 */
	public void is_file_st_tm_null_flg(boolean value) {
		setConstBoolean(offset + 14, $is_file_st_tm_null_flg, value);
	}


	/**
	 * End time unspecified at file entry ファイル入力時終了時刻未指定.<p>
	 *
	 */
	public boolean is_file_end_tm_null_flg() {
		return getConstBoolean(offset + 15, $is_file_end_tm_null_flg);
	}

	/**
	 * End time unspecified at file entry ファイル入力時終了時刻未指定.<p>
	 *
	 */
	public void is_file_end_tm_null_flg(boolean value) {
		setConstBoolean(offset + 15, $is_file_end_tm_null_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR schd_sum_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 16, $schd_sum_wk_cost_p);
	}
	
	public void schd_sum_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 16, $schd_sum_wk_cost_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR act_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 17, $act_wk_cost_p);
	}
	
	public void act_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 17, $act_wk_cost_p, row);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 18, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 18, $abort_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR rem_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 19, $rem_wk_cost_p);
	}
	
	public void rem_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 19, $rem_wk_cost_p, row);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 20, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 20, $wk_cost_unit_nm, value);
	}


	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCNumber pr_rate() {
		return getConstNumber(offset + 21, $pr_rate);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(MCNumber value) {
		setConstNumber(offset + 21, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(int value) {
		setConstNumber(offset + 21, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(long value) {
		setConstNumber(offset + 21, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(float value) {
		setConstNumber(offset + 21, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(double value) {
		setConstNumber(offset + 21, $pr_rate, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 22, $wk_cost_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 22, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 22, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 22, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 22, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 22, $wk_cost_dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String wk_cost_rnd_typ() {
		return getConstString(offset + 23, $wk_cost_rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void wk_cost_rnd_typ(String value) {
		setConstString(offset + 23, $wk_cost_rnd_typ, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 24, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 24, $wk_day_cd, value);
	}


	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 25, $wk_day_nm);
	}

	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 25, $wk_day_nm, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 26, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 26, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 27, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 27, $wk_rsn_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 28, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 28, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 29, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 29, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 30, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 30, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 31, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 31, $loc_nm, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 32, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 32, $str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 33, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 33, $str_ln_p, row);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 34, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 34, $usr_dpt_p, row);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 35, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 35, $fclty, value);
	}


	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 36, $schd_intr_rmrks);
	}

	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 36, $schd_intr_rmrks, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 37, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 37, $wk_cost_calc_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR schd_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 38, $schd_wk_cost_p);
	}
	
	public void schd_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 38, $schd_wk_cost_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR schd_fxd_wk_cost_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 39, $schd_fxd_wk_cost_p);
	}
	
	public void schd_fxd_wk_cost_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 39, $schd_fxd_wk_cost_p, row);
	}


	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 40, $schd_sub_char1);
	}

	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 40, $schd_sub_char1, value);
	}


	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 41, $schd_sub_char2);
	}

	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 41, $schd_sub_char2, value);
	}


	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 42, $schd_sub_char3);
	}

	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 42, $schd_sub_char3, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 43, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 43, $act_intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 44, $act_sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 44, $act_sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 45, $act_sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 45, $act_sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 46, $act_sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 46, $act_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 47, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 47, $itm_p, row);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 48, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 48, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 49, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 49, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 50, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 50, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 51, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 51, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 52, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 52, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 53, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 53, $sno4_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 54, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 54, $lot_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 55, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 55, $sno_wrk_no_p, row);
	}


	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public MCDate oper_st_schd_dt() {
		return getConstDate(offset + 56, $oper_st_schd_dt);
	}

	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public void oper_st_schd_dt(MCDate value) {
		setConstDate(offset + 56, $oper_st_schd_dt, value);
	}


	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public MCDate oper_st_schd_hm() {
		return getConstDate(offset + 57, $oper_st_schd_hm);
	}

	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public void oper_st_schd_hm(MCDate value) {
		setConstDate(offset + 57, $oper_st_schd_hm, value);
	}


	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public MCDate oper_end_schd_dt() {
		return getConstDate(offset + 58, $oper_end_schd_dt);
	}

	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public void oper_end_schd_dt(MCDate value) {
		setConstDate(offset + 58, $oper_end_schd_dt, value);
	}


	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public MCDate oper_end_schd_hm() {
		return getConstDate(offset + 59, $oper_end_schd_hm);
	}

	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public void oper_end_schd_hm(MCDate value) {
		setConstDate(offset + 59, $oper_end_schd_hm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 60, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 60, $oper_ptn, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 61, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 61, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 61, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 61, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 61, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 61, $oper_seq, value);
	}


	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public String wk_mfg_sts_typ() {
		return getConstString(offset + 62, $wk_mfg_sts_typ);
	}

	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public void wk_mfg_sts_typ(String value) {
		setConstString(offset + 62, $wk_mfg_sts_typ, value);
	}


	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public String wk_mfg_sts_typ_nm() {
		return getConstString(offset + 63, $wk_mfg_sts_typ_nm);
	}

	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public void wk_mfg_sts_typ_nm(String value) {
		setConstString(offset + 63, $wk_mfg_sts_typ_nm, value);
	}


	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ() {
		return getConstString(offset + 64, $oper_mfg_sts_typ);
	}

	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ(String value) {
		setConstString(offset + 64, $oper_mfg_sts_typ, value);
	}


	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ_nm() {
		return getConstString(offset + 65, $oper_mfg_sts_typ_nm);
	}

	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ_nm(String value) {
		setConstString(offset + 65, $oper_mfg_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 66, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 66, $aprv_flg, value);
	}


	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 67, $mfg_aprv_sts_typ);
	}

	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 67, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 68, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 68, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 69, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 69, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 70, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 70, $oper_inst_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 71, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 71, $wk_schd_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 72, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 72, $mfg_act_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 73, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 73, $oper_act_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 74, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 74, $wk_act_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 75, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 75, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 76, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 76, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 77, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 77, $ext_sys_nm, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 78, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 78, $ext_wk_act_no, value);
	}


	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 79, $dpt_wg_cd);
	}

	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 79, $dpt_wg_cd, value);
	}


	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public String dpt_wg_nm() {
		return getConstString(offset + 80, $dpt_wg_nm);
	}

	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public void dpt_wg_nm(String value) {
		setConstString(offset + 80, $dpt_wg_nm, value);
	}


	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 81, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 81, $loc_wg_cd, value);
	}


	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public String loc_wg_nm() {
		return getConstString(offset + 82, $loc_wg_nm);
	}

	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public void loc_wg_nm(String value) {
		setConstString(offset + 82, $loc_wg_nm, value);
	}


	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 83, $loc_grp_cd);
	}

	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 83, $loc_grp_cd, value);
	}


	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 84, $loc_grp_nm);
	}

	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 84, $loc_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 85, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 85, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 86, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 86, $site_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 87, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 87, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 87, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 87, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 87, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 87, $disp_seq, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 88, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 88, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 89, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 89, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 90, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 90, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 91, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 91, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 92, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 92, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 93, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 93, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 94, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 94, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 95, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 95, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 96, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 96, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 97, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 97, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 98, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 98, $ins_ts, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 99, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 99, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 99, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 99, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 99, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 99, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public MCNumber wk_act_upd_cntr() {
		return getConstNumber(offset + 100, $wk_act_upd_cntr);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 100, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(int value) {
		setConstNumber(offset + 100, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(long value) {
		setConstNumber(offset + 100, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(float value) {
		setConstNumber(offset + 100, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(double value) {
		setConstNumber(offset + 100, $wk_act_upd_cntr, value);
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


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($wk_cost_rnd_typ.equalsIgnoreCase(name)) {
			return wk_cost_rnd_typ();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($wk_mfg_sts_typ.equalsIgnoreCase(name)) {
			return wk_mfg_sts_typ();
		}
		if ($wk_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return wk_mfg_sts_typ_nm();
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ();
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			return dpt_wg_nm();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			return loc_wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			return wk_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($oper_st_schd_dt.equalsIgnoreCase(name)) {
			return oper_st_schd_dt();
		}
		if ($oper_st_schd_hm.equalsIgnoreCase(name)) {
			return oper_st_schd_hm();
		}
		if ($oper_end_schd_dt.equalsIgnoreCase(name)) {
			return oper_end_schd_dt();
		}
		if ($oper_end_schd_hm.equalsIgnoreCase(name)) {
			return oper_end_schd_hm();
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
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			return inst_wk_act_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
		}
		if ($is_file_st_tm_null_flg.equalsIgnoreCase(name)) {
			return is_file_st_tm_null_flg();
		}
		if ($is_file_end_tm_null_flg.equalsIgnoreCase(name)) {
			return is_file_end_tm_null_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($wk_cost_rnd_typ.equalsIgnoreCase(name)) {
			return wk_cost_rnd_typ();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($wk_mfg_sts_typ.equalsIgnoreCase(name)) {
			return wk_mfg_sts_typ();
		}
		if ($wk_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return wk_mfg_sts_typ_nm();
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ();
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			return dpt_wg_nm();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			return loc_wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			return wk_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($oper_st_schd_dt.equalsIgnoreCase(name)) {
			return oper_st_schd_dt();
		}
		if ($oper_st_schd_hm.equalsIgnoreCase(name)) {
			return oper_st_schd_hm();
		}
		if ($oper_end_schd_dt.equalsIgnoreCase(name)) {
			return oper_end_schd_dt();
		}
		if ($oper_end_schd_hm.equalsIgnoreCase(name)) {
			return oper_end_schd_hm();
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
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			return inst_wk_act_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
		}
		if ($is_file_st_tm_null_flg.equalsIgnoreCase(name)) {
			return is_file_st_tm_null_flg();
		}
		if ($is_file_end_tm_null_flg.equalsIgnoreCase(name)) {
			return is_file_end_tm_null_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($wk_cost_rnd_typ.equalsIgnoreCase(name)) {
			wk_cost_rnd_typ(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($wk_mfg_sts_typ.equalsIgnoreCase(name)) {
			wk_mfg_sts_typ(value);
			return;
		}
		if ($wk_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			wk_mfg_sts_typ_nm(value);
			return;
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ(value);
			return;
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
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
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			dpt_wg_nm(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			loc_wg_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($oper_st_schd_dt.equalsIgnoreCase(name)) {
			oper_st_schd_dt(value);
			return;
		}
		if ($oper_st_schd_hm.equalsIgnoreCase(name)) {
			oper_st_schd_hm(value);
			return;
		}
		if ($oper_end_schd_dt.equalsIgnoreCase(name)) {
			oper_end_schd_dt(value);
			return;
		}
		if ($oper_end_schd_hm.equalsIgnoreCase(name)) {
			oper_end_schd_hm(value);
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
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			inst_wk_act_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
			return;
		}
		if ($is_file_st_tm_null_flg.equalsIgnoreCase(name)) {
			is_file_st_tm_null_flg(value);
			return;
		}
		if ($is_file_end_tm_null_flg.equalsIgnoreCase(name)) {
			is_file_end_tm_null_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($wk_cost_rnd_typ.equalsIgnoreCase(name)) {
			wk_cost_rnd_typ(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($wk_mfg_sts_typ.equalsIgnoreCase(name)) {
			wk_mfg_sts_typ(value);
			return;
		}
		if ($wk_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			wk_mfg_sts_typ_nm(value);
			return;
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ(value);
			return;
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
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
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			dpt_wg_nm(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			loc_wg_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($wk_act_upd_cntr.equalsIgnoreCase(name)) {
			wk_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($oper_st_schd_dt.equalsIgnoreCase(name)) {
			oper_st_schd_dt(value);
			return;
		}
		if ($oper_st_schd_hm.equalsIgnoreCase(name)) {
			oper_st_schd_hm(value);
			return;
		}
		if ($oper_end_schd_dt.equalsIgnoreCase(name)) {
			oper_end_schd_dt(value);
			return;
		}
		if ($oper_end_schd_hm.equalsIgnoreCase(name)) {
			oper_end_schd_hm(value);
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
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			inst_wk_act_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
			return;
		}
		if ($is_file_st_tm_null_flg.equalsIgnoreCase(name)) {
			is_file_st_tm_null_flg(value);
			return;
		}
		if ($is_file_end_tm_null_flg.equalsIgnoreCase(name)) {
			is_file_end_tm_null_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			return st_tm_p();
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			return end_tm_p();
		}
		if ($schd_sum_wk_cost_p.equalsIgnoreCase(name)) {
			return schd_sum_wk_cost_p();
		}
		if ($act_wk_cost_p.equalsIgnoreCase(name)) {
			return act_wk_cost_p();
		}
		if ($rem_wk_cost_p.equalsIgnoreCase(name)) {
			return rem_wk_cost_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($schd_wk_cost_p.equalsIgnoreCase(name)) {
			return schd_wk_cost_p();
		}
		if ($schd_fxd_wk_cost_p.equalsIgnoreCase(name)) {
			return schd_fxd_wk_cost_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			st_tm_p(
				((MCContainerMeta) st_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			end_tm_p(
				((MCContainerMeta) end_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($schd_sum_wk_cost_p.equalsIgnoreCase(name)) {
			schd_sum_wk_cost_p(
				((MCContainerMeta) schd_sum_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($act_wk_cost_p.equalsIgnoreCase(name)) {
			act_wk_cost_p(
				((MCContainerMeta) act_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($rem_wk_cost_p.equalsIgnoreCase(name)) {
			rem_wk_cost_p(
				((MCContainerMeta) rem_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($schd_wk_cost_p.equalsIgnoreCase(name)) {
			schd_wk_cost_p(
				((MCContainerMeta) schd_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($schd_fxd_wk_cost_p.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost_p(
				((MCContainerMeta) schd_fxd_wk_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
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
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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

	/**
	 * Dummy ダミー.<p>
	 *
	 */
	public MCDate dummy_st_dt() {
		return st_tm_p().ymd();
	}

	/**
	 * Dummy ダミー.<p>
	 *
	 */
	public void dummy_st_dt(MCDate value) {
		st_tm_p().ymd(value);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return st_tm_p().hm();
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		st_tm_p().hm(value);
	}

	/**
	 * Dummy ダミー.<p>
	 *
	 */
	public MCDate dummy_end_dt() {
		return end_tm_p().ymd();
	}

	/**
	 * Dummy ダミー.<p>
	 *
	 */
	public void dummy_end_dt(MCDate value) {
		end_tm_p().ymd(value);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return end_tm_p().hm();
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		end_tm_p().hm(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public MCNumber schd_sum_wk_cost() {
		return schd_sum_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(MCNumber value) {
		schd_sum_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(int value) {
		schd_sum_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(long value) {
		schd_sum_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(float value) {
		schd_sum_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(double value) {
		schd_sum_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public MCNumber act_wk_cost() {
		return act_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(MCNumber value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(int value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(long value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(float value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(double value) {
		act_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public MCNumber rem_wk_cost() {
		return rem_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(MCNumber value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(int value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(long value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(float value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(double value) {
		rem_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public String wk_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public void wk_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public String wk_usr_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public void wk_usr_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public MCNumber schd_wk_cost() {
		return schd_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(MCNumber value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(int value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(long value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(float value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(double value) {
		schd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public MCNumber schd_fxd_wk_cost() {
		return schd_fxd_wk_cost_p().wk_cost_qty();
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(MCNumber value) {
		schd_fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(int value) {
		schd_fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(long value) {
		schd_fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(float value) {
		schd_fxd_wk_cost_p().wk_cost_qty(value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(double value) {
		schd_fxd_wk_cost_p().wk_cost_qty(value);
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

