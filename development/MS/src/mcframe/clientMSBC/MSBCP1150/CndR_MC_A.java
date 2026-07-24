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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * ACT,Result;SCHD,Schedule ACT,実績;SCHD,予定.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $oper_ord_flg = "oper_ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $oper_stt_flg = "oper_stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $oper_cmpl_flg = "oper_cmpl_flg";
	/**
	 * No order 指図無し.<p>
	 *
	 */
	public static final String $oper_no_inst_flg = "oper_no_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $stt_flg = "stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * No scheduled 予定無し.<p>
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
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public static final String $pr_rate_fr = "pr_rate_fr";
	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public static final String $pr_rate_to = "pr_rate_to";
	public static final String $oper_st_schd_dt_p = "oper_st_schd_dt_p";
	public static final String $oper_end_schd_dt_p = "oper_end_schd_dt_p";
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	public static final String $sno_p = "sno_p";
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
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public static final String $no_mfg_inst_only_flg = "no_mfg_inst_only_flg";
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
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $oper_st_schd_dt_fr = $oper_st_schd_dt_p + ".ymd_fr";
	public static final String $oper_st_schd_hm_fr = $oper_st_schd_dt_p + ".hm_fr";
	public static final String $oper_st_schd_dt_to = $oper_st_schd_dt_p + ".ymd_to";
	public static final String $oper_st_schd_hm_to = $oper_st_schd_dt_p + ".hm_to";
	public static final String $oper_end_schd_dt_fr = $oper_end_schd_dt_p + ".ymd_fr";
	public static final String $oper_end_schd_hm_fr = $oper_end_schd_dt_p + ".hm_fr";
	public static final String $oper_end_schd_dt_to = $oper_end_schd_dt_p + ".ymd_to";
	public static final String $oper_end_schd_hm_to = $oper_end_schd_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

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
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta oper_st_schd_dt_p_META = createInnerRowMeta($oper_st_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta oper_end_schd_dt_p_META = createInnerRowMeta($oper_end_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
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
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta wk_usr_cd_META = createCommonMeta($wk_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta wk_usr_nm_META = createCommonMeta($wk_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wk_usr_dpt_cd_META = createCommonMeta($wk_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wk_usr_dpt_nm_META = createCommonMeta($wk_usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta no_mfg_inst_only_flg_META = createCommonMeta($no_mfg_inst_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
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
			pr_rate_fr_META,
			pr_rate_to_META,
			oper_st_schd_dt_p_META,
			oper_end_schd_dt_p_META,
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
			itm_typ_p_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			mfg_inst_no_META,
			sno_p_META,
			wk_usr_cd_META,
			wk_usr_nm_META,
			wk_usr_dpt_cd_META,
			wk_usr_dpt_nm_META,
			fclty_META,
			itm_mfg_inst_no_META,
			wk_act_no_META,
			mfg_act_no_META,
			no_mfg_inst_only_flg_META,
			ext_wk_act_no_META,
			schd_intr_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			act_intr_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"oper_st_schd_dt_fr",
				"oper_st_schd_hm_fr",
				"oper_st_schd_dt_to",
				"oper_st_schd_hm_to",
				"oper_end_schd_dt_fr",
				"oper_end_schd_hm_fr",
				"oper_end_schd_dt_to",
				"oper_end_schd_hm_to",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
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
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$oper_st_schd_dt_fr,
				$oper_st_schd_hm_fr,
				$oper_st_schd_dt_to,
				$oper_st_schd_hm_to,
				$oper_end_schd_dt_fr,
				$oper_end_schd_hm_fr,
				$oper_end_schd_dt_to,
				$oper_end_schd_hm_to,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
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
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
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
				{$dpt_wg_cd, "wg_nm"},	// dpt_wg_cd
				{$loc_wg_cd, "wg_nm"},	// loc_wg_cd
				{$wk_usr_cd, "usr_nm"},	// wk_usr_cd
				{$wk_usr_dpt_cd, "dpt_nm"}	// wk_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "true;true"},	// dpt_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE"},	// loc_cd
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$wk_usr_dpt_cd, "wk_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG;true;true"}	// wk_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_nm_rem_flg;mode_today_flg"},	// dpt_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$wk_usr_dpt_cd, "usr_cd;dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"}	// wk_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dpt_wg_cd, "WG"},	// dpt_wg_cd
				{$dpt_wg_nm, "WG"},	// dpt_wg_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$loc_wg_cd, "WG"},	// loc_wg_cd
				{$loc_wg_nm, "WG"},	// loc_wg_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"}	// str_ln_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * ACT,Result;SCHD,Schedule ACT,実績;SCHD,予定.<p>
	 *
	 */
	public String disp_unit() {
		return getConstString(offset + 1, $disp_unit);
	}

	/**
	 * ACT,Result;SCHD,Schedule ACT,実績;SCHD,予定.<p>
	 *
	 */
	public void disp_unit(String value) {
		setConstString(offset + 1, $disp_unit, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean oper_ord_flg() {
		return getConstBoolean(offset + 2, $oper_ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void oper_ord_flg(boolean value) {
		setConstBoolean(offset + 2, $oper_ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean oper_stt_flg() {
		return getConstBoolean(offset + 3, $oper_stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void oper_stt_flg(boolean value) {
		setConstBoolean(offset + 3, $oper_stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean oper_cmpl_flg() {
		return getConstBoolean(offset + 4, $oper_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void oper_cmpl_flg(boolean value) {
		setConstBoolean(offset + 4, $oper_cmpl_flg, value);
	}


	/**
	 * No order 指図無し.<p>
	 *
	 */
	public boolean oper_no_inst_flg() {
		return getConstBoolean(offset + 5, $oper_no_inst_flg);
	}

	/**
	 * No order 指図無し.<p>
	 *
	 */
	public void oper_no_inst_flg(boolean value) {
		setConstBoolean(offset + 5, $oper_no_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 6, $ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 6, $ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean stt_flg() {
		return getConstBoolean(offset + 7, $stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void stt_flg(boolean value) {
		setConstBoolean(offset + 7, $stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 8, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 8, $cmpl_flg, value);
	}


	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public boolean no_schd_flg() {
		return getConstBoolean(offset + 9, $no_schd_flg);
	}

	/**
	 * No scheduled 予定無し.<p>
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
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 14, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 14, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 14, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 14, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 14, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 14, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 15, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 15, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 15, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 15, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 15, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 15, $pr_rate_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR oper_st_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 16, $oper_st_schd_dt_p);
	}
	
	public void oper_st_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 16, $oper_st_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR oper_end_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 17, $oper_end_schd_dt_p);
	}
	
	public void oper_end_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 17, $oper_end_schd_dt_p, row);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 18, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 18, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 19, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 19, $oper_nm, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 20, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 20, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 21, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 21, $wk_cost_nm, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 22, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 22, $wk_rsn_cd, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 23, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 23, $wk_rsn_nm, value);
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
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 26, $dpt_wg_cd);
	}

	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 26, $dpt_wg_cd, value);
	}


	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public String dpt_wg_nm() {
		return getConstString(offset + 27, $dpt_wg_nm);
	}

	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public void dpt_wg_nm(String value) {
		setConstString(offset + 27, $dpt_wg_nm, value);
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 30, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 30, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 31, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 31, $site_nm, value);
	}


	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 32, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 32, $loc_wg_cd, value);
	}


	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public String loc_wg_nm() {
		return getConstString(offset + 33, $loc_wg_nm);
	}

	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public void loc_wg_nm(String value) {
		setConstString(offset + 33, $loc_wg_nm, value);
	}


	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 34, $loc_grp_cd);
	}

	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 34, $loc_grp_cd, value);
	}


	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 35, $loc_grp_nm);
	}

	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 35, $loc_grp_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 36, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 36, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 37, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 37, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 38, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 38, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 39, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 39, $str_ln_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 40, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 40, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 41, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 41, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 42, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 42, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 43, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 43, $sublot_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 44, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 44, $mfg_inst_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 45, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 45, $sno_p, row);
	}


	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return getConstString(offset + 46, $wk_usr_cd);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		setConstString(offset + 46, $wk_usr_cd, value);
	}


	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public String wk_usr_nm() {
		return getConstString(offset + 47, $wk_usr_nm);
	}

	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public void wk_usr_nm(String value) {
		setConstString(offset + 47, $wk_usr_nm, value);
	}


	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return getConstString(offset + 48, $wk_usr_dpt_cd);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		setConstString(offset + 48, $wk_usr_dpt_cd, value);
	}


	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public String wk_usr_dpt_nm() {
		return getConstString(offset + 49, $wk_usr_dpt_nm);
	}

	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public void wk_usr_dpt_nm(String value) {
		setConstString(offset + 49, $wk_usr_dpt_nm, value);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 50, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 50, $fclty, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 51, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 51, $itm_mfg_inst_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 52, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 52, $wk_act_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 53, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 53, $mfg_act_no, value);
	}


	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public boolean no_mfg_inst_only_flg() {
		return getConstBoolean(offset + 54, $no_mfg_inst_only_flg);
	}

	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public void no_mfg_inst_only_flg(boolean value) {
		setConstBoolean(offset + 54, $no_mfg_inst_only_flg, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 55, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 55, $ext_wk_act_no, value);
	}


	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 56, $schd_intr_rmrks);
	}

	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 56, $schd_intr_rmrks, value);
	}


	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 57, $schd_sub_char1);
	}

	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 57, $schd_sub_char1, value);
	}


	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 58, $schd_sub_char2);
	}

	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 58, $schd_sub_char2, value);
	}


	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 59, $schd_sub_char3);
	}

	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 59, $schd_sub_char3, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 60, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 60, $act_intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 61, $act_sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 61, $act_sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 62, $act_sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 62, $act_sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 63, $act_sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 63, $act_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 64, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 64, $itm_grp_p, row);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($oper_st_schd_dt_p.equalsIgnoreCase(name)) {
			return oper_st_schd_dt_p();
		}
		if ($oper_end_schd_dt_p.equalsIgnoreCase(name)) {
			return oper_end_schd_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($oper_st_schd_dt_p.equalsIgnoreCase(name)) {
			oper_st_schd_dt_p(
				((MCContainerMeta) oper_st_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($oper_end_schd_dt_p.equalsIgnoreCase(name)) {
			oper_end_schd_dt_p(
				((MCContainerMeta) oper_end_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_st_schd_dt_fr() {
		return oper_st_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void oper_st_schd_dt_fr(MCDate value) {
		oper_st_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_st_schd_hm_fr() {
		return oper_st_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void oper_st_schd_hm_fr(MCDate value) {
		oper_st_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate oper_st_schd_dt_to() {
		return oper_st_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public void oper_st_schd_dt_to(MCDate value) {
		oper_st_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate oper_st_schd_hm_to() {
		return oper_st_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public void oper_st_schd_hm_to(MCDate value) {
		oper_st_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_end_schd_dt_fr() {
		return oper_end_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void oper_end_schd_dt_fr(MCDate value) {
		oper_end_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate oper_end_schd_hm_fr() {
		return oper_end_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void oper_end_schd_hm_fr(MCDate value) {
		oper_end_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate oper_end_schd_dt_to() {
		return oper_end_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public void oper_end_schd_dt_to(MCDate value) {
		oper_end_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate oper_end_schd_hm_to() {
		return oper_end_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public void oper_end_schd_hm_to(MCDate value) {
		oper_end_schd_dt_p().hm_to(value);
	}

	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
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

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
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

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
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

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
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

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
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

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
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

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
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

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
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

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
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

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
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

