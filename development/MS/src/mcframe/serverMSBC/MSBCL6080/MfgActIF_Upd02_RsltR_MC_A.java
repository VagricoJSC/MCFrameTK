package mcframe.serverMSBC.MSBCL6080;

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
 * ブロック"MfgActIF_Upd02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActIF_Upd02_RsltR_MC_A extends MCConstRow {

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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Order direct man-hour result 指図工数実績.<p>
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
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
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
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
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
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public static final String $old_ac_dt = "old_ac_dt";
	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public static final String $brk_pd = "brk_pd";
	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public static final String $schd_sum_wk_cost = "schd_sum_wk_cost";
	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public static final String $schd_wk_cost = "schd_wk_cost";
	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public static final String $schd_fxd_wk_cost = "schd_fxd_wk_cost";
	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public static final String $act_wk_cost = "act_wk_cost";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public static final String $rem_wk_cost = "rem_wk_cost";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
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
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_cd = "wk_usr_cd";
	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public static final String $wk_usr_nm = "wk_usr_nm";
	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_dpt_cd = "wk_usr_dpt_cd";
	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public static final String $wk_usr_dpt_nm = "wk_usr_dpt_nm";
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public static final String $fclty = "fclty";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_ctl_flg = "wk_cost_calc_ctl_flg";
	/**
	 * Internal remarks (Schedule) 内部備考（予定）.<p>
	 *
	 */
	public static final String $schd_intr_rmrks = "schd_intr_rmrks";
	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char1 = "schd_sub_char1";
	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char2 = "schd_sub_char2";
	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char3 = "schd_sub_char3";
	/**
	 * Internal remarks (Result) 内部備考（実績）.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";
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
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta inst_wk_act_flg_META = createCommonMeta($inst_wk_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_ac_dt_META = createCommonMeta($old_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta brk_pd_META = createCommonMeta($brk_pd, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta schd_sum_wk_cost_META = createCommonMeta($schd_sum_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta schd_wk_cost_META = createCommonMeta($schd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta schd_fxd_wk_cost_META = createCommonMeta($schd_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta act_wk_cost_META = createCommonMeta($act_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_wk_cost_META = createCommonMeta($rem_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
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
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_usr_cd_META = createCommonMeta($wk_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta wk_usr_nm_META = createCommonMeta($wk_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wk_usr_dpt_cd_META = createCommonMeta($wk_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wk_usr_dpt_nm_META = createCommonMeta($wk_usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_ctl_flg_META = createCommonMeta($wk_cost_calc_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta oper_st_schd_dt_META = createCommonMeta($oper_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_st_schd_hm_META = createCommonMeta($oper_st_schd_hm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_end_schd_dt_META = createCommonMeta($oper_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_end_schd_hm_META = createCommonMeta($oper_end_schd_hm, mcframe.commonMA.meta.MA_META.TM);
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
	public static final MCMeta dpt_wg_cd_META = createCommonMeta($dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dpt_wg_nm_META = createCommonMeta($dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_wg_nm_META = createCommonMeta($loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
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
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
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
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);

	protected static final ConstMetaList<MfgActIF_Upd02_RsltR> constMetas = new ConstMetaList<MfgActIF_Upd02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			inst_wk_act_flg_META,
			mfg_inst_no_META,
			div_seq_META,
			disp_seq_META,
			oper_ptn_META,
			oper_disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			ac_dt_META,
			old_ac_dt_META,
			st_tm_META,
			end_tm_META,
			brk_pd_META,
			schd_sum_wk_cost_META,
			schd_wk_cost_META,
			schd_fxd_wk_cost_META,
			act_wk_cost_META,
			abort_flg_META,
			rem_wk_cost_META,
			wk_cost_unit_nm_META,
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
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			wk_usr_cd_META,
			wk_usr_nm_META,
			wk_usr_dpt_cd_META,
			wk_usr_dpt_nm_META,
			fclty_META,
			wk_cost_calc_flg_META,
			wk_cost_calc_ctl_flg_META,
			schd_intr_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			act_intr_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			oper_st_schd_dt_META,
			oper_st_schd_hm_META,
			oper_end_schd_dt_META,
			oper_end_schd_hm_META,
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
			dpt_wg_cd_META,
			dpt_wg_nm_META,
			loc_wg_cd_META,
			loc_wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			site_cd_META,
			site_nm_META,
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
			itm_grp_nm10_META,
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
			upd_srv_req_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_wk_act_no_META
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
	protected MfgActIF_Upd02_RsltR_MC_A(ConstMetaList<? extends MfgActIF_Upd02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Upd02_RsltR clone() {
		return (MfgActIF_Upd02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Upd02_RsltR createInstance() {
		return (MfgActIF_Upd02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActIF_Upd02_RsltR getValues(String... names) {
		return (MfgActIF_Upd02_RsltR) super.getValues(names);
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
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
	 * Order direct man-hour result 指図工数実績.<p>
	 *
	 */
	public boolean inst_wk_act_flg() {
		return getConstBoolean(offset + 3, $inst_wk_act_flg);
	}

	/**
	 * Order direct man-hour result 指図工数実績.<p>
	 *
	 */
	public void inst_wk_act_flg(boolean value) {
		setConstBoolean(offset + 3, $inst_wk_act_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 5, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 5, $div_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 6, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 7, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 7, $oper_ptn, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 8, $oper_disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 8, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 8, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 8, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 8, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 8, $oper_disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 9, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 9, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 10, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 10, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 11, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 12, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 12, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 13, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 13, $wk_cost_nm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 14, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 14, $ac_dt, value);
	}


	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public MCDate old_ac_dt() {
		return getConstDate(offset + 15, $old_ac_dt);
	}

	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public void old_ac_dt(MCDate value) {
		setConstDate(offset + 15, $old_ac_dt, value);
	}


	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 16, $st_tm);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 16, $st_tm, value);
	}


	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 17, $end_tm);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 17, $end_tm, value);
	}


	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return getConstNumber(offset + 18, $brk_pd);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		setConstNumber(offset + 18, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		setConstNumber(offset + 18, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		setConstNumber(offset + 18, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		setConstNumber(offset + 18, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		setConstNumber(offset + 18, $brk_pd, value);
	}


	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public MCNumber schd_sum_wk_cost() {
		return getConstNumber(offset + 19, $schd_sum_wk_cost);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(MCNumber value) {
		setConstNumber(offset + 19, $schd_sum_wk_cost, value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(int value) {
		setConstNumber(offset + 19, $schd_sum_wk_cost, value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(long value) {
		setConstNumber(offset + 19, $schd_sum_wk_cost, value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(float value) {
		setConstNumber(offset + 19, $schd_sum_wk_cost, value);
	}

	/**
	 * Schedule man-hour 予定工数.<p>
	 *
	 */
	public void schd_sum_wk_cost(double value) {
		setConstNumber(offset + 19, $schd_sum_wk_cost, value);
	}


	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public MCNumber schd_wk_cost() {
		return getConstNumber(offset + 20, $schd_wk_cost);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(MCNumber value) {
		setConstNumber(offset + 20, $schd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(int value) {
		setConstNumber(offset + 20, $schd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(long value) {
		setConstNumber(offset + 20, $schd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(float value) {
		setConstNumber(offset + 20, $schd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void schd_wk_cost(double value) {
		setConstNumber(offset + 20, $schd_wk_cost, value);
	}


	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public MCNumber schd_fxd_wk_cost() {
		return getConstNumber(offset + 21, $schd_fxd_wk_cost);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 21, $schd_fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(int value) {
		setConstNumber(offset + 21, $schd_fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(long value) {
		setConstNumber(offset + 21, $schd_fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(float value) {
		setConstNumber(offset + 21, $schd_fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void schd_fxd_wk_cost(double value) {
		setConstNumber(offset + 21, $schd_fxd_wk_cost, value);
	}


	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public MCNumber act_wk_cost() {
		return getConstNumber(offset + 22, $act_wk_cost);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(MCNumber value) {
		setConstNumber(offset + 22, $act_wk_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(int value) {
		setConstNumber(offset + 22, $act_wk_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(long value) {
		setConstNumber(offset + 22, $act_wk_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(float value) {
		setConstNumber(offset + 22, $act_wk_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_wk_cost(double value) {
		setConstNumber(offset + 22, $act_wk_cost, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 23, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 23, $abort_flg, value);
	}


	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public MCNumber rem_wk_cost() {
		return getConstNumber(offset + 24, $rem_wk_cost);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(MCNumber value) {
		setConstNumber(offset + 24, $rem_wk_cost, value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(int value) {
		setConstNumber(offset + 24, $rem_wk_cost, value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(long value) {
		setConstNumber(offset + 24, $rem_wk_cost, value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(float value) {
		setConstNumber(offset + 24, $rem_wk_cost, value);
	}

	/**
	 * Remaining man-hour 残工数.<p>
	 *
	 */
	public void rem_wk_cost(double value) {
		setConstNumber(offset + 24, $rem_wk_cost, value);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 25, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 25, $wk_cost_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 26, $wk_cost_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 26, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 26, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 26, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 26, $wk_cost_dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String wk_cost_rnd_typ() {
		return getConstString(offset + 27, $wk_cost_rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void wk_cost_rnd_typ(String value) {
		setConstString(offset + 27, $wk_cost_rnd_typ, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 28, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 28, $wk_day_cd, value);
	}


	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 29, $wk_day_nm);
	}

	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 29, $wk_day_nm, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 30, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 30, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 31, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 31, $wk_rsn_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 32, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 32, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 33, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 33, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 34, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 34, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 35, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 35, $loc_nm, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 36, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 36, $str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 37, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 37, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 38, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 38, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 39, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 39, $str_ln_cd_none_flg, value);
	}


	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return getConstString(offset + 40, $wk_usr_cd);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		setConstString(offset + 40, $wk_usr_cd, value);
	}


	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public String wk_usr_nm() {
		return getConstString(offset + 41, $wk_usr_nm);
	}

	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public void wk_usr_nm(String value) {
		setConstString(offset + 41, $wk_usr_nm, value);
	}


	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return getConstString(offset + 42, $wk_usr_dpt_cd);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		setConstString(offset + 42, $wk_usr_dpt_cd, value);
	}


	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public String wk_usr_dpt_nm() {
		return getConstString(offset + 43, $wk_usr_dpt_nm);
	}

	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public void wk_usr_dpt_nm(String value) {
		setConstString(offset + 43, $wk_usr_dpt_nm, value);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 44, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 44, $fclty, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 45, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 45, $wk_cost_calc_flg, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_ctl_flg() {
		return getConstBoolean(offset + 46, $wk_cost_calc_ctl_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_ctl_flg(boolean value) {
		setConstBoolean(offset + 46, $wk_cost_calc_ctl_flg, value);
	}


	/**
	 * Internal remarks (Schedule) 内部備考（予定）.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 47, $schd_intr_rmrks);
	}

	/**
	 * Internal remarks (Schedule) 内部備考（予定）.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 47, $schd_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 48, $schd_sub_char1);
	}

	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 48, $schd_sub_char1, value);
	}


	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 49, $schd_sub_char2);
	}

	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 49, $schd_sub_char2, value);
	}


	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 50, $schd_sub_char3);
	}

	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 50, $schd_sub_char3, value);
	}


	/**
	 * Internal remarks (Result) 内部備考（実績）.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 51, $act_intr_rmrks);
	}

	/**
	 * Internal remarks (Result) 内部備考（実績）.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 51, $act_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 52, $act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 52, $act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 53, $act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 53, $act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 54, $act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 54, $act_sub_char3, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 55, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 55, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 56, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 56, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 57, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 57, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 58, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 58, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 59, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 59, $itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 60, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 60, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 61, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 61, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 62, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 62, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 63, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 63, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 64, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 64, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 65, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 65, $sno4_mng_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 66, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 66, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 67, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 67, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 68, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 68, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 69, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 69, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 70, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 70, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 71, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 71, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 72, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 72, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 73, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 73, $wrk_nm, value);
	}


	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public MCDate oper_st_schd_dt() {
		return getConstDate(offset + 74, $oper_st_schd_dt);
	}

	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public void oper_st_schd_dt(MCDate value) {
		setConstDate(offset + 74, $oper_st_schd_dt, value);
	}


	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public MCDate oper_st_schd_hm() {
		return getConstDate(offset + 75, $oper_st_schd_hm);
	}

	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public void oper_st_schd_hm(MCDate value) {
		setConstDate(offset + 75, $oper_st_schd_hm, value);
	}


	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public MCDate oper_end_schd_dt() {
		return getConstDate(offset + 76, $oper_end_schd_dt);
	}

	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public void oper_end_schd_dt(MCDate value) {
		setConstDate(offset + 76, $oper_end_schd_dt, value);
	}


	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public MCDate oper_end_schd_hm() {
		return getConstDate(offset + 77, $oper_end_schd_hm);
	}

	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public void oper_end_schd_hm(MCDate value) {
		setConstDate(offset + 77, $oper_end_schd_hm, value);
	}


	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public String wk_mfg_sts_typ() {
		return getConstString(offset + 78, $wk_mfg_sts_typ);
	}

	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public void wk_mfg_sts_typ(String value) {
		setConstString(offset + 78, $wk_mfg_sts_typ, value);
	}


	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public String wk_mfg_sts_typ_nm() {
		return getConstString(offset + 79, $wk_mfg_sts_typ_nm);
	}

	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public void wk_mfg_sts_typ_nm(String value) {
		setConstString(offset + 79, $wk_mfg_sts_typ_nm, value);
	}


	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ() {
		return getConstString(offset + 80, $oper_mfg_sts_typ);
	}

	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ(String value) {
		setConstString(offset + 80, $oper_mfg_sts_typ, value);
	}


	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ_nm() {
		return getConstString(offset + 81, $oper_mfg_sts_typ_nm);
	}

	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ_nm(String value) {
		setConstString(offset + 81, $oper_mfg_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 82, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 82, $aprv_flg, value);
	}


	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 83, $mfg_aprv_sts_typ);
	}

	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 83, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 84, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 84, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 85, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 85, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 86, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 86, $oper_inst_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 87, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 87, $wk_schd_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 88, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 88, $mfg_act_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 89, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 89, $oper_act_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 90, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 90, $wk_act_no, value);
	}


	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 91, $dpt_wg_cd);
	}

	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 91, $dpt_wg_cd, value);
	}


	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public String dpt_wg_nm() {
		return getConstString(offset + 92, $dpt_wg_nm);
	}

	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public void dpt_wg_nm(String value) {
		setConstString(offset + 92, $dpt_wg_nm, value);
	}


	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 93, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 93, $loc_wg_cd, value);
	}


	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public String loc_wg_nm() {
		return getConstString(offset + 94, $loc_wg_nm);
	}

	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public void loc_wg_nm(String value) {
		setConstString(offset + 94, $loc_wg_nm, value);
	}


	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 95, $loc_grp_cd);
	}

	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 95, $loc_grp_cd, value);
	}


	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 96, $loc_grp_nm);
	}

	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 96, $loc_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 97, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 97, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 98, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 98, $site_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 99, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 99, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 100, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 100, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 101, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 101, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 102, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 102, $itm_typ_d_nm, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 103, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 103, $rtn_sts_typ, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 104, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 104, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 105, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 105, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 106, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 106, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 107, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 107, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 108, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 108, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 109, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 109, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 110, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 110, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 111, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 111, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 112, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 112, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 113, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 113, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 114, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 114, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 115, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 115, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 116, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 116, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 117, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 117, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 118, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 118, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 119, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 119, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 120, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 120, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 121, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 121, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 122, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 122, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 123, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 123, $itm_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 124, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 124, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 125, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 125, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 126, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 126, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 127, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 127, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 128, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 128, $ins_ts, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 129, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 129, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 129, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 129, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 129, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 129, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public MCNumber wk_act_upd_cntr() {
		return getConstNumber(offset + 130, $wk_act_upd_cntr);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 130, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(int value) {
		setConstNumber(offset + 130, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(long value) {
		setConstNumber(offset + 130, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(float value) {
		setConstNumber(offset + 130, $wk_act_upd_cntr, value);
	}

	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public void wk_act_upd_cntr(double value) {
		setConstNumber(offset + 130, $wk_act_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 131, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 131, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 132, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 132, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 133, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 133, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 134, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 134, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 135, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 135, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 136, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 136, $upd_srv_req_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 137, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 137, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 138, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 138, $ext_sys_cd, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 139, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 139, $ext_wk_act_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_usr_nm.equalsIgnoreCase(name)) {
			return wk_usr_nm();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($wk_usr_dpt_nm.equalsIgnoreCase(name)) {
			return wk_usr_dpt_nm();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			return schd_sum_wk_cost();
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			return schd_wk_cost();
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			return schd_fxd_wk_cost();
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			return act_wk_cost();
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			return rem_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			return old_ac_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			return inst_wk_act_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_usr_nm.equalsIgnoreCase(name)) {
			return wk_usr_nm();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($wk_usr_dpt_nm.equalsIgnoreCase(name)) {
			return wk_usr_dpt_nm();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			return schd_sum_wk_cost();
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			return schd_wk_cost();
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			return schd_fxd_wk_cost();
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			return act_wk_cost();
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			return rem_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			return old_ac_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			return inst_wk_act_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_usr_nm.equalsIgnoreCase(name)) {
			wk_usr_nm(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($wk_usr_dpt_nm.equalsIgnoreCase(name)) {
			wk_usr_dpt_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			old_ac_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			inst_wk_act_flg(value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_usr_nm.equalsIgnoreCase(name)) {
			wk_usr_nm(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($wk_usr_dpt_nm.equalsIgnoreCase(name)) {
			wk_usr_dpt_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($schd_sum_wk_cost.equalsIgnoreCase(name)) {
			schd_sum_wk_cost(value);
			return;
		}
		if ($schd_wk_cost.equalsIgnoreCase(name)) {
			schd_wk_cost(value);
			return;
		}
		if ($schd_fxd_wk_cost.equalsIgnoreCase(name)) {
			schd_fxd_wk_cost(value);
			return;
		}
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			old_ac_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_wk_act_flg.equalsIgnoreCase(name)) {
			inst_wk_act_flg(value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
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



}

