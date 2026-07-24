package mcframe.serverMSBC.MSBCL1150;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Ordered (Operation) 指図済（工程）.<p>
	 *
	 */
	public static final String $oper_ord_flg = "oper_ord_flg";
	/**
	 * In process (Operation) 着手中（工程）.<p>
	 *
	 */
	public static final String $oper_stt_flg = "oper_stt_flg";
	/**
	 * Completed (Operation) 完了（工程）.<p>
	 *
	 */
	public static final String $oper_cmpl_flg = "oper_cmpl_flg";
	/**
	 * No order (Operation) 指図無し（工程）.<p>
	 *
	 */
	public static final String $oper_no_inst_flg = "oper_no_inst_flg";
	/**
	 * Ordered (Man-hour) 指図済（工数）.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * In process (Man-hour) 着手中（工数）.<p>
	 *
	 */
	public static final String $stt_flg = "stt_flg";
	/**
	 * Completed (Man-hour) 完了（工数）.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * No schedule (Man-hour) 予定無し（工数）.<p>
	 *
	 */
	public static final String $no_schd_flg = "no_schd_flg";
	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public static final String $mes_tgt_flg = "mes_tgt_flg";
	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public static final String $not_mes_tgt_flg = "not_mes_tgt_flg";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public static final String $no_mfg_inst_only_flg = "no_mfg_inst_only_flg";
	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $oper_st_schd_dt_fr = "oper_st_schd_dt_fr";
	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $oper_st_schd_hm_fr = "oper_st_schd_hm_fr";
	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $oper_st_schd_dt_to = "oper_st_schd_dt_to";
	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $oper_st_schd_hm_to = "oper_st_schd_hm_to";
	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $oper_end_schd_dt_fr = "oper_end_schd_dt_fr";
	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $oper_end_schd_hm_fr = "oper_end_schd_hm_fr";
	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public static final String $oper_end_schd_dt_to = "oper_end_schd_dt_to";
	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $oper_end_schd_hm_to = "oper_end_schd_hm_to";
	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public static final String $pr_rate_fr = "pr_rate_fr";
	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public static final String $pr_rate_to = "pr_rate_to";
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
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public static final String $schd_intr_rmrks = "schd_intr_rmrks";
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
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
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
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
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
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
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
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
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
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
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
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
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
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
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
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
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
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
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
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta disp_unit_META = createStringMeta($disp_unit);
	public static final MCMeta oper_ord_flg_META = createCommonMeta($oper_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_stt_flg_META = createCommonMeta($oper_stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_cmpl_flg_META = createCommonMeta($oper_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_no_inst_flg_META = createCommonMeta($oper_no_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_flg_META = createCommonMeta($ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stt_flg_META = createCommonMeta($stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_schd_flg_META = createCommonMeta($no_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_tgt_flg_META = createCommonMeta($mes_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_mes_tgt_flg_META = createCommonMeta($not_mes_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta no_mfg_inst_only_flg_META = createCommonMeta($no_mfg_inst_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_st_schd_dt_fr_META = createCommonMeta($oper_st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_st_schd_hm_fr_META = createCommonMeta($oper_st_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_st_schd_dt_to_META = createCommonMeta($oper_st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_st_schd_hm_to_META = createCommonMeta($oper_st_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_end_schd_dt_fr_META = createCommonMeta($oper_end_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_end_schd_hm_fr_META = createCommonMeta($oper_end_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_end_schd_dt_to_META = createCommonMeta($oper_end_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_end_schd_hm_to_META = createCommonMeta($oper_end_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_day_nm_META = createCommonMeta($wk_day_nm, mcframe.commonMA.meta.MA_META.WK_DAY_NM);
	public static final MCMeta dpt_wg_cd_META = createCommonMeta($dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dpt_wg_nm_META = createCommonMeta($dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_wg_nm_META = createCommonMeta($loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta wk_usr_cd_META = createCommonMeta($wk_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta wk_usr_nm_META = createCommonMeta($wk_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wk_usr_dpt_cd_META = createCommonMeta($wk_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wk_usr_dpt_nm_META = createCommonMeta($wk_usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			disp_unit_META,
			oper_ord_flg_META,
			oper_stt_flg_META,
			oper_cmpl_flg_META,
			oper_no_inst_flg_META,
			ord_flg_META,
			stt_flg_META,
			cmpl_flg_META,
			no_schd_flg_META,
			mes_tgt_flg_META,
			not_mes_tgt_flg_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			no_mfg_inst_only_flg_META,
			oper_st_schd_dt_fr_META,
			oper_st_schd_hm_fr_META,
			oper_st_schd_dt_to_META,
			oper_st_schd_hm_to_META,
			oper_end_schd_dt_fr_META,
			oper_end_schd_hm_fr_META,
			oper_end_schd_dt_to_META,
			oper_end_schd_hm_to_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			oper_cd_META,
			oper_nm_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			wk_rsn_cd_META,
			wk_rsn_nm_META,
			wk_day_cd_META,
			wk_day_nm_META,
			dpt_wg_cd_META,
			dpt_wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			site_cd_META,
			site_nm_META,
			loc_wg_cd_META,
			loc_wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			wk_usr_cd_META,
			wk_usr_nm_META,
			wk_usr_dpt_cd_META,
			wk_usr_dpt_nm_META,
			fclty_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			wk_act_no_META,
			mfg_act_no_META,
			ext_wk_act_no_META,
			schd_intr_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			act_intr_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META
		},
		new String[][]{
			{
			},
			{
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public String disp_unit() {
		return getConstString(offset + 1, $disp_unit);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void disp_unit(String value) {
		setConstString(offset + 1, $disp_unit, value);
	}


	/**
	 * Ordered (Operation) 指図済（工程）.<p>
	 *
	 */
	public boolean oper_ord_flg() {
		return getConstBoolean(offset + 2, $oper_ord_flg);
	}

	/**
	 * Ordered (Operation) 指図済（工程）.<p>
	 *
	 */
	public void oper_ord_flg(boolean value) {
		setConstBoolean(offset + 2, $oper_ord_flg, value);
	}


	/**
	 * In process (Operation) 着手中（工程）.<p>
	 *
	 */
	public boolean oper_stt_flg() {
		return getConstBoolean(offset + 3, $oper_stt_flg);
	}

	/**
	 * In process (Operation) 着手中（工程）.<p>
	 *
	 */
	public void oper_stt_flg(boolean value) {
		setConstBoolean(offset + 3, $oper_stt_flg, value);
	}


	/**
	 * Completed (Operation) 完了（工程）.<p>
	 *
	 */
	public boolean oper_cmpl_flg() {
		return getConstBoolean(offset + 4, $oper_cmpl_flg);
	}

	/**
	 * Completed (Operation) 完了（工程）.<p>
	 *
	 */
	public void oper_cmpl_flg(boolean value) {
		setConstBoolean(offset + 4, $oper_cmpl_flg, value);
	}


	/**
	 * No order (Operation) 指図無し（工程）.<p>
	 *
	 */
	public boolean oper_no_inst_flg() {
		return getConstBoolean(offset + 5, $oper_no_inst_flg);
	}

	/**
	 * No order (Operation) 指図無し（工程）.<p>
	 *
	 */
	public void oper_no_inst_flg(boolean value) {
		setConstBoolean(offset + 5, $oper_no_inst_flg, value);
	}


	/**
	 * Ordered (Man-hour) 指図済（工数）.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 6, $ord_flg);
	}

	/**
	 * Ordered (Man-hour) 指図済（工数）.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 6, $ord_flg, value);
	}


	/**
	 * In process (Man-hour) 着手中（工数）.<p>
	 *
	 */
	public boolean stt_flg() {
		return getConstBoolean(offset + 7, $stt_flg);
	}

	/**
	 * In process (Man-hour) 着手中（工数）.<p>
	 *
	 */
	public void stt_flg(boolean value) {
		setConstBoolean(offset + 7, $stt_flg, value);
	}


	/**
	 * Completed (Man-hour) 完了（工数）.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 8, $cmpl_flg);
	}

	/**
	 * Completed (Man-hour) 完了（工数）.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 8, $cmpl_flg, value);
	}


	/**
	 * No schedule (Man-hour) 予定無し（工数）.<p>
	 *
	 */
	public boolean no_schd_flg() {
		return getConstBoolean(offset + 9, $no_schd_flg);
	}

	/**
	 * No schedule (Man-hour) 予定無し（工数）.<p>
	 *
	 */
	public void no_schd_flg(boolean value) {
		setConstBoolean(offset + 9, $no_schd_flg, value);
	}


	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public boolean mes_tgt_flg() {
		return getConstBoolean(offset + 10, $mes_tgt_flg);
	}

	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public void mes_tgt_flg(boolean value) {
		setConstBoolean(offset + 10, $mes_tgt_flg, value);
	}


	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public boolean not_mes_tgt_flg() {
		return getConstBoolean(offset + 11, $not_mes_tgt_flg);
	}

	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public void not_mes_tgt_flg(boolean value) {
		setConstBoolean(offset + 11, $not_mes_tgt_flg, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 12, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 12, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 13, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 13, $ac_dt_to, value);
	}


	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public boolean no_mfg_inst_only_flg() {
		return getConstBoolean(offset + 14, $no_mfg_inst_only_flg);
	}

	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public void no_mfg_inst_only_flg(boolean value) {
		setConstBoolean(offset + 14, $no_mfg_inst_only_flg, value);
	}


	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_st_schd_dt_fr() {
		return getConstDate(offset + 15, $oper_st_schd_dt_fr);
	}

	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void oper_st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 15, $oper_st_schd_dt_fr, value);
	}


	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_st_schd_hm_fr() {
		return getConstDate(offset + 16, $oper_st_schd_hm_fr);
	}

	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void oper_st_schd_hm_fr(MCDate value) {
		setConstDate(offset + 16, $oper_st_schd_hm_fr, value);
	}


	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate oper_st_schd_dt_to() {
		return getConstDate(offset + 17, $oper_st_schd_dt_to);
	}

	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public void oper_st_schd_dt_to(MCDate value) {
		setConstDate(offset + 17, $oper_st_schd_dt_to, value);
	}


	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate oper_st_schd_hm_to() {
		return getConstDate(offset + 18, $oper_st_schd_hm_to);
	}

	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public void oper_st_schd_hm_to(MCDate value) {
		setConstDate(offset + 18, $oper_st_schd_hm_to, value);
	}


	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_end_schd_dt_fr() {
		return getConstDate(offset + 19, $oper_end_schd_dt_fr);
	}

	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void oper_end_schd_dt_fr(MCDate value) {
		setConstDate(offset + 19, $oper_end_schd_dt_fr, value);
	}


	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_end_schd_hm_fr() {
		return getConstDate(offset + 20, $oper_end_schd_hm_fr);
	}

	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void oper_end_schd_hm_fr(MCDate value) {
		setConstDate(offset + 20, $oper_end_schd_hm_fr, value);
	}


	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate oper_end_schd_dt_to() {
		return getConstDate(offset + 21, $oper_end_schd_dt_to);
	}

	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public void oper_end_schd_dt_to(MCDate value) {
		setConstDate(offset + 21, $oper_end_schd_dt_to, value);
	}


	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate oper_end_schd_hm_to() {
		return getConstDate(offset + 22, $oper_end_schd_hm_to);
	}

	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public void oper_end_schd_hm_to(MCDate value) {
		setConstDate(offset + 22, $oper_end_schd_hm_to, value);
	}


	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 23, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 23, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 23, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 23, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 23, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 23, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 24, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 24, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 24, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 24, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 24, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 24, $pr_rate_to, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 25, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 25, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 26, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 26, $oper_nm, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 27, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 27, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 28, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 28, $wk_cost_nm, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 29, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 29, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 30, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 30, $wk_rsn_nm, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 31, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 31, $wk_day_cd, value);
	}


	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 32, $wk_day_nm);
	}

	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 32, $wk_day_nm, value);
	}


	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 33, $dpt_wg_cd);
	}

	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 33, $dpt_wg_cd, value);
	}


	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public String dpt_wg_nm() {
		return getConstString(offset + 34, $dpt_wg_nm);
	}

	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public void dpt_wg_nm(String value) {
		setConstString(offset + 34, $dpt_wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 35, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 35, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 36, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 36, $dpt_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 37, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 37, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 38, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 38, $site_nm, value);
	}


	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 39, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 39, $loc_wg_cd, value);
	}


	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public String loc_wg_nm() {
		return getConstString(offset + 40, $loc_wg_nm);
	}

	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public void loc_wg_nm(String value) {
		setConstString(offset + 40, $loc_wg_nm, value);
	}


	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 41, $loc_grp_cd);
	}

	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 41, $loc_grp_cd, value);
	}


	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 42, $loc_grp_nm);
	}

	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 42, $loc_grp_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 43, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 43, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 44, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 44, $loc_nm, value);
	}


	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 45, $str_ln_cd);
	}

	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 45, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 46, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 46, $str_ln_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 47, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 47, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 48, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 48, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 49, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 49, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 50, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 50, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 51, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 51, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 52, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 52, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 53, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 53, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 54, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 54, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 55, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 55, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 56, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 56, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 57, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 57, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 58, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 58, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 59, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 59, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 60, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 60, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 61, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 61, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 62, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 62, $wrk_nm, value);
	}


	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return getConstString(offset + 63, $wk_usr_cd);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		setConstString(offset + 63, $wk_usr_cd, value);
	}


	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public String wk_usr_nm() {
		return getConstString(offset + 64, $wk_usr_nm);
	}

	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public void wk_usr_nm(String value) {
		setConstString(offset + 64, $wk_usr_nm, value);
	}


	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return getConstString(offset + 65, $wk_usr_dpt_cd);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		setConstString(offset + 65, $wk_usr_dpt_cd, value);
	}


	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public String wk_usr_dpt_nm() {
		return getConstString(offset + 66, $wk_usr_dpt_nm);
	}

	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public void wk_usr_dpt_nm(String value) {
		setConstString(offset + 66, $wk_usr_dpt_nm, value);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 67, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 67, $fclty, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 68, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 68, $mfg_inst_no, value);
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
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 70, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 70, $wk_act_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 71, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 71, $mfg_act_no, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 72, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 72, $ext_wk_act_no, value);
	}


	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 73, $schd_intr_rmrks);
	}

	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 73, $schd_intr_rmrks, value);
	}


	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 74, $schd_sub_char1);
	}

	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 74, $schd_sub_char1, value);
	}


	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 75, $schd_sub_char2);
	}

	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 75, $schd_sub_char2, value);
	}


	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 76, $schd_sub_char3);
	}

	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 76, $schd_sub_char3, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 77, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 77, $act_intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 78, $act_sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 78, $act_sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 79, $act_sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 79, $act_sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 80, $act_sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 80, $act_sub_char3, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 81, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 81, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 82, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 82, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 83, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 83, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 84, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 84, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 85, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 85, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 86, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 86, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 87, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 87, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 88, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 88, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 89, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 89, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 90, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 90, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 91, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 91, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 92, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 92, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 93, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 93, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 94, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 94, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 95, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 95, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 96, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 96, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 97, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 97, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 98, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 98, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 99, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 99, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 100, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 100, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 101, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 101, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 102, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 102, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 103, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 103, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 104, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 104, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 105, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 105, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 106, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 106, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 107, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 107, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 108, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 108, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 109, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 109, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 110, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 110, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
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
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			return dpt_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			return pr_rate_fr();
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			return pr_rate_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($oper_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return oper_st_schd_dt_fr();
		}
		if ($oper_st_schd_hm_fr.equalsIgnoreCase(name)) {
			return oper_st_schd_hm_fr();
		}
		if ($oper_st_schd_dt_to.equalsIgnoreCase(name)) {
			return oper_st_schd_dt_to();
		}
		if ($oper_st_schd_hm_to.equalsIgnoreCase(name)) {
			return oper_st_schd_hm_to();
		}
		if ($oper_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return oper_end_schd_dt_fr();
		}
		if ($oper_end_schd_hm_fr.equalsIgnoreCase(name)) {
			return oper_end_schd_hm_fr();
		}
		if ($oper_end_schd_dt_to.equalsIgnoreCase(name)) {
			return oper_end_schd_dt_to();
		}
		if ($oper_end_schd_hm_to.equalsIgnoreCase(name)) {
			return oper_end_schd_hm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			return oper_ord_flg();
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			return oper_stt_flg();
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			return oper_cmpl_flg();
		}
		if ($oper_no_inst_flg.equalsIgnoreCase(name)) {
			return oper_no_inst_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($no_schd_flg.equalsIgnoreCase(name)) {
			return no_schd_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			return not_mes_tgt_flg();
		}
		if ($no_mfg_inst_only_flg.equalsIgnoreCase(name)) {
			return no_mfg_inst_only_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
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
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			return dpt_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			return pr_rate_fr();
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			return pr_rate_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($oper_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return oper_st_schd_dt_fr();
		}
		if ($oper_st_schd_hm_fr.equalsIgnoreCase(name)) {
			return oper_st_schd_hm_fr();
		}
		if ($oper_st_schd_dt_to.equalsIgnoreCase(name)) {
			return oper_st_schd_dt_to();
		}
		if ($oper_st_schd_hm_to.equalsIgnoreCase(name)) {
			return oper_st_schd_hm_to();
		}
		if ($oper_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return oper_end_schd_dt_fr();
		}
		if ($oper_end_schd_hm_fr.equalsIgnoreCase(name)) {
			return oper_end_schd_hm_fr();
		}
		if ($oper_end_schd_dt_to.equalsIgnoreCase(name)) {
			return oper_end_schd_dt_to();
		}
		if ($oper_end_schd_hm_to.equalsIgnoreCase(name)) {
			return oper_end_schd_hm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			return oper_ord_flg();
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			return oper_stt_flg();
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			return oper_cmpl_flg();
		}
		if ($oper_no_inst_flg.equalsIgnoreCase(name)) {
			return oper_no_inst_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($no_schd_flg.equalsIgnoreCase(name)) {
			return no_schd_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			return not_mes_tgt_flg();
		}
		if ($no_mfg_inst_only_flg.equalsIgnoreCase(name)) {
			return no_mfg_inst_only_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
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
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
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
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			dpt_wg_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($oper_st_schd_dt_fr.equalsIgnoreCase(name)) {
			oper_st_schd_dt_fr(value);
			return;
		}
		if ($oper_st_schd_hm_fr.equalsIgnoreCase(name)) {
			oper_st_schd_hm_fr(value);
			return;
		}
		if ($oper_st_schd_dt_to.equalsIgnoreCase(name)) {
			oper_st_schd_dt_to(value);
			return;
		}
		if ($oper_st_schd_hm_to.equalsIgnoreCase(name)) {
			oper_st_schd_hm_to(value);
			return;
		}
		if ($oper_end_schd_dt_fr.equalsIgnoreCase(name)) {
			oper_end_schd_dt_fr(value);
			return;
		}
		if ($oper_end_schd_hm_fr.equalsIgnoreCase(name)) {
			oper_end_schd_hm_fr(value);
			return;
		}
		if ($oper_end_schd_dt_to.equalsIgnoreCase(name)) {
			oper_end_schd_dt_to(value);
			return;
		}
		if ($oper_end_schd_hm_to.equalsIgnoreCase(name)) {
			oper_end_schd_hm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			oper_ord_flg(value);
			return;
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			oper_stt_flg(value);
			return;
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			oper_cmpl_flg(value);
			return;
		}
		if ($oper_no_inst_flg.equalsIgnoreCase(name)) {
			oper_no_inst_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($no_schd_flg.equalsIgnoreCase(name)) {
			no_schd_flg(value);
			return;
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			mes_tgt_flg(value);
			return;
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			not_mes_tgt_flg(value);
			return;
		}
		if ($no_mfg_inst_only_flg.equalsIgnoreCase(name)) {
			no_mfg_inst_only_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
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
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
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
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dpt_wg_nm.equalsIgnoreCase(name)) {
			dpt_wg_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($oper_st_schd_dt_fr.equalsIgnoreCase(name)) {
			oper_st_schd_dt_fr(value);
			return;
		}
		if ($oper_st_schd_hm_fr.equalsIgnoreCase(name)) {
			oper_st_schd_hm_fr(value);
			return;
		}
		if ($oper_st_schd_dt_to.equalsIgnoreCase(name)) {
			oper_st_schd_dt_to(value);
			return;
		}
		if ($oper_st_schd_hm_to.equalsIgnoreCase(name)) {
			oper_st_schd_hm_to(value);
			return;
		}
		if ($oper_end_schd_dt_fr.equalsIgnoreCase(name)) {
			oper_end_schd_dt_fr(value);
			return;
		}
		if ($oper_end_schd_hm_fr.equalsIgnoreCase(name)) {
			oper_end_schd_hm_fr(value);
			return;
		}
		if ($oper_end_schd_dt_to.equalsIgnoreCase(name)) {
			oper_end_schd_dt_to(value);
			return;
		}
		if ($oper_end_schd_hm_to.equalsIgnoreCase(name)) {
			oper_end_schd_hm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			oper_ord_flg(value);
			return;
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			oper_stt_flg(value);
			return;
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			oper_cmpl_flg(value);
			return;
		}
		if ($oper_no_inst_flg.equalsIgnoreCase(name)) {
			oper_no_inst_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($no_schd_flg.equalsIgnoreCase(name)) {
			no_schd_flg(value);
			return;
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			mes_tgt_flg(value);
			return;
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			not_mes_tgt_flg(value);
			return;
		}
		if ($no_mfg_inst_only_flg.equalsIgnoreCase(name)) {
			no_mfg_inst_only_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

